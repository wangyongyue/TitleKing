var Server = require('../server/server').Server

function Test (){
  this.reloadData = function(response){
    this.datas = [
      {title:"test"},
      {title:"test"},
      {title:"test"}]
      console.log(this.datas)
  }
}
Test.prototype = new Server();
exports.Test = Test;
module.exports.Test = Test;