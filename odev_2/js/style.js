let input = document.querySelector('#task')
let insertAlert = document.querySelector('.success')
let errorAlert = document.querySelector('.error')
let list = document.querySelector('#list')
let itemsArray = localStorage.getItem('items') ? JSON.parse(localStorage.getItem('items')) : [];
console.log("okay")

var option = 
{
    animation : true,
    delay : 3000
};
// newElement()
function newElement()
{
    if(input.value)
    {
        var toastElement = new bootstrap.Toast(insertAlert, option);
        toastElement.show();    
        insertAlert.style.top = "20px";
        itemsArray.push(input.value);
        localStorage.setItem('items',JSON.stringify(itemsArray));
        const liDOM = document.createElement('li');
        liDOM.innerHTML = input.value;
        list.append(liDOM);
    }
    else{
        var toastElement = new bootstrap.Toast(errorAlert, option);
        toastElement.show();    
        errorAlert.style.top = "20px";
    }
}

function deletElement(node)
{
    node.parentNode.removeChild(node);
}