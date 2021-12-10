const topRestaurant = document.getElementById('rest-container')

$('#loadTop').click(() => {
    loadTopRestaurant()
});


function loadTopRestaurant() {

    fetch("http://localhost:8080/restaurants/top").
    then(response => response.json())
        .then(info => {

            let line = '<h6 class="mt-2 mb-0">' + "TOP RESTAURANT WITH MOST LIKES:"  + '</h6>'
            let line2 = '<span class="fw-bolder">' + info.name + '</span>'

            topRestaurant.innerHTML = line + line2

        })}

