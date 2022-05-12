const ctx = document.getElementById("myChart").getContext("2d");
const myChart = new Chart(ctx, {
  type: "pie",
  data: {
    labels: ["Pizza", "Esfiha", "Lanche", "Churrasco", "Macarrão"],
    datasets: [
      {
        label: "My First Dataset",
        data: [40, 10, 30, 5, 10],
        backgroundColor: [
          "#4dd3c6",
          "#c12138",
          "#14ce40",
          "#ebd429",
          "#48a3cc",
        ],
        hoverOffset: 4,
      },
    ],
  },
  options: {
    layout: {
      padding: {
        left: 50,
        right: 50,
        bottom: 50,
      },
    },
  },
});

myChart.canvas.parentNode.style.width = "500px";
