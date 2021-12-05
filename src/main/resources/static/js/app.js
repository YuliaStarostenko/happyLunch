const topRestaurant = document.getElementById('rest-container')

$('#loadTop').click(() => {
    loadTopRestaurant()
});


function loadTopRestaurant() {

    fetch("http://localhost:8080/restaurants/top").
    then(response => response.json()).
    then(json => json.forEach(restaurant => {

        let line = '<h5 class="mt-2 mb-0">' + "TOP RESTAURANT WITH MOST LIKES:"  + '</h5>'
        let line2 = '<span class="fw-bolder">' + restaurant.name + '</span>'

       topRestaurant.innerHTML = line + line
    }))
}