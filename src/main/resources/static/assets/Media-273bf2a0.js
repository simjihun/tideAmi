import{P as x}from"./ProductService-c3f21ab6.js";import{_ as y,r as n,o as f,b as c,c as I,d as k,e as t,f as o,g as r,t as d,s as V,p as w,q as C}from"./index-4ac9911c.js";class O{getImages(){return fetch("demo/data/photos.json").then(s=>s.json()).then(s=>s.data)}}const p=a=>(w("data-v-ebc9b337"),a=a(),C(),a),B={class:"grid p-fluid"},j={class:"col-12"},M={class:"card"},G=p(()=>t("h5",null,"Carousel",-1)),N={class:"product-item"},P={class:"product-item-content"},R={class:"mb-3"},q=["src","alt"],z={class:"mb-1"},D={class:"mt-0 mb-3"},E={class:"car-buttons mt-5"},L={class:"col-12"},$={class:"card"},A=p(()=>t("h5",null,"Galleria",-1)),F=["src","alt"],H=["src","alt"],J={class:"col-12"},K={class:"card"},Q=p(()=>t("h5",null,"Image",-1)),T={class:"flex justify-content-center"},U={__name:"Media",setup(a){const s=n([]),u=n([]),_=n([{breakpoint:"1024px",numVisible:5},{breakpoint:"960px",numVisible:4},{breakpoint:"768px",numVisible:3},{breakpoint:"560px",numVisible:1}]),m=n([{breakpoint:"1024px",numVisible:3,numScroll:3},{breakpoint:"768px",numVisible:2,numScroll:2},{breakpoint:"560px",numVisible:1,numScroll:1}]),h=new x,b=new O;return f(()=>{h.getProductsSmall().then(i=>s.value=i),b.getImages().then(i=>u.value=i)}),(i,W)=>{const l=c("Button"),v=c("Carousel"),g=c("Galleria"),S=c("Image");return I(),k("div",B,[t("div",j,[t("div",M,[G,o(v,{value:s.value,numVisible:3,numScroll:3,circular:!1,responsiveOptions:m.value},{item:r(e=>[t("div",N,[t("div",P,[t("div",R,[t("img",{src:"demo/images/product/"+e.data.image,alt:e.data.name,class:"product-image"},null,8,q)]),t("div",null,[t("h4",z,d(e.data.name),1),t("h6",D,"$"+d(e.data.price),1),t("span",{class:V("product-badge status-"+e.data.inventoryStatus.toLowerCase())},d(e.data.inventoryStatus),3),t("div",E,[o(l,{type:"button",class:"p-button p-button-rounded mr-2",icon:"pi pi-search"}),o(l,{type:"button",class:"p-button-success p-button-rounded mr-2",icon:"pi pi-star-fill"}),o(l,{type:"button",class:"p-button-help p-button-rounded",icon:"pi pi-cog"})])])])])]),_:1},8,["value","responsiveOptions"])])]),t("div",L,[t("div",$,[A,o(g,{value:u.value,responsiveOptions:_.value,numVisible:7,circular:!0,containerStyle:"max-width: 800px; margin: auto"},{item:r(e=>[t("img",{src:e.item.itemImageSrc,alt:e.item.alt,style:{width:"100%",display:"block"}},null,8,F)]),thumbnail:r(e=>[t("img",{src:e.item.thumbnailImageSrc,alt:e.item.alt,tyle:"width: 100%; display: block;"},null,8,H)]),_:1},8,["value","responsiveOptions"])])]),t("div",J,[t("div",K,[Q,t("div",T,[o(S,{src:"demo/images/galleria/galleria11.jpg",alt:"Image",width:"250",preview:""},null,8,["src"])])])])])}}},Z=y(U,[["__scopeId","data-v-ebc9b337"]]);export{Z as default};
