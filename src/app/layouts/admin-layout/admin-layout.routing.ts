import { Routes } from "@angular/router";

import { DashboardComponent } from "../../pages/dashboard/dashboard.component";
import { UserComponent } from "../../pages/user/user.component";
import { TableComponent } from "../../pages/table/table.component";
import { ProductsComponent } from "src/app/pages/products/products.component";
import { CreateProductComponent } from "src/app/pages/create-product/create-product.component";
import { CategoryComponent } from "src/app/pages/category/category.component";
import { CreateCategoryComponent } from "src/app/pages/create-category/create-category.component";
import { ReportComponent } from 'src/app/pages/report/report.component';

export const AdminLayoutRoutes: Routes = [
  { path: "dashboard", component: DashboardComponent },
  { path: "user", component: UserComponent },
  { path: "table", component: TableComponent },
  { path: "product", component: ProductsComponent },
  { path: "product/create", component: CreateProductComponent },
  { path: "category", component: CategoryComponent },
  { path: "category/create", component: CreateCategoryComponent },
  { path: "report", component: ReportComponent }
];