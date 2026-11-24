package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class yvg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l7m0 f43318a;
    public final l7m0 b;
    public final l7m0 c;
    public final l7m0 d;
    public final l7m0 e;
    public final l7m0 f;
    public final l7m0 g;
    public final l7m0 h;
    public final l7m0 i;
    public final l7m0 j;
    public final l7m0 k;
    public final l7m0 l;
    public final l7m0 m;
    public final l7m0 n;

    public yvg0(l7m0 l7m0Var, l7m0 l7m0Var2, l7m0 l7m0Var3, l7m0 l7m0Var4, l7m0 l7m0Var5, l7m0 l7m0Var6, l7m0 l7m0Var7, l7m0 l7m0Var8, l7m0 l7m0Var9, l7m0 l7m0Var10, l7m0 l7m0Var11, l7m0 l7m0Var12, l7m0 l7m0Var13, l7m0 l7m0Var14) {
        l7m0Var.getClass();
        l7m0Var2.getClass();
        l7m0Var3.getClass();
        l7m0Var4.getClass();
        l7m0Var5.getClass();
        l7m0Var6.getClass();
        l7m0Var7.getClass();
        l7m0Var8.getClass();
        l7m0Var9.getClass();
        l7m0Var10.getClass();
        l7m0Var11.getClass();
        l7m0Var12.getClass();
        l7m0Var13.getClass();
        l7m0Var14.getClass();
        this.f43318a = l7m0Var;
        this.b = l7m0Var2;
        this.c = l7m0Var3;
        this.d = l7m0Var4;
        this.e = l7m0Var5;
        this.f = l7m0Var6;
        this.g = l7m0Var7;
        this.h = l7m0Var8;
        this.i = l7m0Var9;
        this.j = l7m0Var10;
        this.k = l7m0Var11;
        this.l = l7m0Var12;
        this.m = l7m0Var13;
        this.n = l7m0Var14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yvg0)) {
            return false;
        }
        yvg0 yvg0Var = (yvg0) obj;
        return Intrinsics.d(this.f43318a, yvg0Var.f43318a) && Intrinsics.d(this.b, yvg0Var.b) && Intrinsics.d(this.c, yvg0Var.c) && Intrinsics.d(this.d, yvg0Var.d) && Intrinsics.d(this.e, yvg0Var.e) && Intrinsics.d(this.f, yvg0Var.f) && Intrinsics.d(this.g, yvg0Var.g) && Intrinsics.d(this.h, yvg0Var.h) && Intrinsics.d(this.i, yvg0Var.i) && Intrinsics.d(this.j, yvg0Var.j) && Intrinsics.d(this.k, yvg0Var.k) && Intrinsics.d(this.l, yvg0Var.l) && Intrinsics.d(this.m, yvg0Var.m) && Intrinsics.d(this.n, yvg0Var.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + h97.c(this.m, h97.c(this.l, h97.c(this.k, h97.c(this.j, h97.c(this.i, h97.c(this.h, h97.c(this.g, h97.c(this.f, h97.c(this.e, h97.c(this.d, h97.c(this.c, h97.c(this.b, this.f43318a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SaleUiState(fullScreenUiState=");
        sb.append(this.f43318a);
        sb.append(", saleUiScreenState=");
        sb.append(this.b);
        sb.append(", buttonUiState=");
        h97.z(sb, this.c, ", saleItemUiState=", this.d, ", historyHeaderUiState=");
        h97.z(sb, this.e, ", newStakePercentProgressUiState=", this.f, ", autoBetPercentProgressUiState=");
        h97.z(sb, this.g, ", paymentProgressUiState=", this.h, ", paymentPercentProgressUiState=");
        h97.z(sb, this.i, ", newStakeProgressUiState=", this.j, ", isTransactionUiState=");
        h97.z(sb, this.k, ", autoBetProgressUiState=", this.l, ", titleUiState=");
        sb.append(this.m);
        sb.append(", titleSettingState=");
        sb.append(this.n);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
