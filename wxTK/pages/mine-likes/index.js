
//获取应用实例
Component({
  options: {
    multipleSlots: true 
  },
  properties: {
    
  },
  //组件的内部数据，和 properties 一同用于组件的模版渲染
  data:{
    title: "sdsdfsd",
    list: []
  },
  attached: function () { 
    this.setData({
      list: [{name:"喜欢",title:"首次正确率：20%",content:"已答题：3000"},
      {name:"喜欢",title:"首次正确率：20%",content:"已答题：3000"},
      {name:"喜欢",title:"首次正确率：20%",content:"已答题：3000"},
      {name:"喜欢",title:"首次正确率：20%",content:"已答题：3000"},
      {name:"喜欢",title:"首次正确率：20%",content:"已答题：3000"},
      ]
    })
  },
  //组件的方法，包括事件响应函数和任意的自定义方法 
  methods: {
    // 跳转活动详情  
    clickTap: function(e) {
      this.triggerEvent('clickTap', {
        'index': this.data.index
      })
    }
  }
  
})