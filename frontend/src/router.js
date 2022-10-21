
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import CouponManager from "./components/listers/CouponCards"
import CouponDetail from "./components/listers/CouponDetail"

import PointManager from "./components/listers/PointCards"
import PointDetail from "./components/listers/PointDetail"

import LabManager from "./components/listers/LabCards"
import LabDetail from "./components/listers/LabDetail"

import FcpursManager from "./components/listers/FcpursCards"
import FcpursDetail from "./components/listers/FcpursDetail"


import LoggingView from "./components/LoggingView"
import LoggingViewDetail from "./components/LoggingViewDetail"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/coupons',
                name: 'CouponManager',
                component: CouponManager
            },
            {
                path: '/coupons/:id',
                name: 'CouponDetail',
                component: CouponDetail
            },

            {
                path: '/points',
                name: 'PointManager',
                component: PointManager
            },
            {
                path: '/points/:id',
                name: 'PointDetail',
                component: PointDetail
            },

            {
                path: '/labs',
                name: 'LabManager',
                component: LabManager
            },
            {
                path: '/labs/:id',
                name: 'LabDetail',
                component: LabDetail
            },

            {
                path: '/fcpurs',
                name: 'FcpursManager',
                component: FcpursManager
            },
            {
                path: '/fcpurs/:id',
                name: 'FcpursDetail',
                component: FcpursDetail
            },


            {
                path: '/loggings',
                name: 'LoggingView',
                component: LoggingView
            },
            {
                path: '/loggings/:id',
                name: 'LoggingViewDetail',
                component: LoggingViewDetail
            },


    ]
})
