const ctx = document.getElementById('myChart').getContext('2d');
const myChart = new Chart(ctx, {
    type: 'doughnut',
    data: {
        labels: [
          'Red',
          'Blue',
          'Yellow'
        ],
        datasets: [{
          label: 'My First Dataset',
          data: [50, 50, 100],
          backgroundColor: [
            'rgb(255, 99, 132)',
            'rgb(54, 162, 235)',
            'rgb(255, 205, 86)'
          ],
          hoverOffset: 4
        }]
      },
    options: {
        scales: {
            y: {
                beginAtZero: true
            }
        },
        layout: {
            padding: {
                left: 50,
                right: 50,
                bottom: 50,
            }
        }
    }
});


myChart.canvas.parentNode.style.width = '500px';