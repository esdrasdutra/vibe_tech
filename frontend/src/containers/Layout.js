import React from 'react';
import { Layout, Menu } from 'antd';

const { Header, Content, Footer } = Layout;

const CustomLayout = (props) => {
    return (
        <Layout>
            <Header className="header">
                <Menu theme="dark" mode="horizontal" style={{ textAlign: "left" }}>
                    <h1 style={{ color:"#0016a6" }}>Vibe Tecnologia</h1>
                </Menu>
            </Header>

            <Content style={{ color:"#0016a6" }}>
                <div className="site-layout-content" type="flex" justify="center" align="top">
                    {props.children}
                </div>
            </Content>

            <Footer style={{ textAlign: "center" }}>
                ©2021 Created by Esdras Dutra
            </Footer>

        </Layout>
    );
}

export default CustomLayout;