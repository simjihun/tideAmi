import{_ as b,c as o,d as r,e,F as g,n as _,l as u,t as i,p as h,q as w}from"./index-4ac9911c.js";const f={data(){return{requestBody:{},list:{},no:"",paging:{block:0,end_page:0,next_block:0,page:0,page_size:0,prev_block:0,start_index:0,start_page:0,total_block_cnt:0,total_list_cnt:0,total_page_cnt:0},page:this.$route.query.page?this.$route.query.page:1,size:this.$route.query.size?this.$route.query.size:10,keyword:this.$route.query.keyword,paginavigation:function(){let t=[],a=this.paging.start_page,d=this.paging.end_page;for(let l=a;l<=d;l++)t.push(l);return t}}},mounted(){this.fnGetList()},methods:{fnGetList(){this.requestBody={keyword:this.keyword,page:this.page,size:this.size},this.$axios.get(this.$serverUrl+"/board/list",{params:this.requestBody,headers:{}}).then(t=>{this.list=t.data,console.log("res.data :",t.data)}).catch(t=>{t.message.indexOf("Network Error")>-1&&alert(`네트워크가 원활하지 않습니다.
잠시 후 다시 시도해주세요.`)})}}},k=t=>(h("data-v-99b70338"),t=t(),w(),t),y={class:"board-list"},v={class:"common-buttons"},m={class:"w3-table-all"},$=k(()=>e("thead",null,[e("tr",null,[e("th",null,"No"),e("th",null,"제목"),e("th",null,"작성자"),e("th",null,"등록일시")])],-1)),C=["onClick"],q={key:0,class:"pagination w3-bar w3-padding-16 w3-small"},B={class:"pg"},z=["onClick"];function j(t,a,d,l,n,L){return o(),r("div",y,[e("div",v,[e("button",{type:"button",class:"w3-button w3-round w3-blue-gray",onClick:a[0]||(a[0]=(...s)=>t.fnWrite&&t.fnWrite(...s))},"등록")]),e("table",m,[$,e("tbody",null,[(o(!0),r(g,null,_(n.list,(s,p)=>(o(),r("tr",{key:p},[e("td",null,i(s.idx),1),e("td",null,[e("a",{onClick:c=>t.fnView(`${s.idx}`)},i(s.title),9,C)]),e("td",null,i(s.author),1),e("td",null,i(s.created_at),1)]))),128))])]),n.paging.total_list_cnt>0?(o(),r("div",q,[e("span",B,[e("a",{href:"javascript:;",onClick:a[1]||(a[1]=s=>t.fnPage(1)),class:"first w3-button w3-bar-item w3-border"},"<<"),n.paging.start_page>10?(o(),r("a",{key:0,href:"javascript:;",onClick:a[2]||(a[2]=s=>t.fnPage(`${n.paging.start_page-1}`)),class:"prev w3-button w3-bar-item w3-border"},"<")):u("",!0),(o(!0),r(g,null,_(n.paginavigation(),(s,p)=>(o(),r(g,null,[n.paging.page==s?(o(),r("strong",{class:"w3-button w3-bar-item w3-border w3-green",key:p},i(s),1)):(o(),r("a",{class:"w3-button w3-bar-item w3-border",href:"javascript:;",onClick:c=>t.fnPage(`${s}`),key:p},i(s),9,z))],64))),256)),n.paging.total_page_cnt>n.paging.end_page?(o(),r("a",{key:1,href:"javascript:;",onClick:a[3]||(a[3]=s=>t.fnPage(`${n.paging.end_page+1}`)),class:"next w3-button w3-bar-item w3-border"},">")):u("",!0),e("a",{href:"javascript:;",onClick:a[4]||(a[4]=s=>t.fnPage(`${n.paging.total_page_cnt}`)),class:"last w3-button w3-bar-item w3-border"},">>")])])):u("",!0)])}const P=b(f,[["render",j],["__scopeId","data-v-99b70338"]]);export{P as default};