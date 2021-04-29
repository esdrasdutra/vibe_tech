import { Layout, Menu} from 'antd';

const { Header, Content, Footer } = Layout;

const CustomLayout = (props) => {

    return (
        <Layout className="layout">
            <Header >
                <div className="logo" />
                <Menu theme="dark" mode="horizontal" style={{ textAlign: "left", padding: '0 10px'  }}>
                    <h1 style={{ color:"#0016a6" }}>Vibe Tecnologia</h1>   
                </Menu>
            </Header>
            <Content type="flex" justify="center" align="middle" style={{ padding: '0 10px', minHeight:'85vh', fontSize: '40px',}}>
                <div className="site-layout-content" style={{ background: '#fff'}}>
                    {props.children}
                </div>
            </Content>
            <Footer style={{ textAlign: 'center' }}>©2021 Created by Esdras Dutra</Footer>
        </Layout>
    );
}

export default CustomLayout;