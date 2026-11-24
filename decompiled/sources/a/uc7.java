package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class uc7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l7m0 f35415a;
    public final l7m0 b;
    public final l7m0 c;
    public final l7m0 d;
    public final l7m0 e;
    public final l7m0 f;
    public final l7m0 g;
    public final l7m0 h;
    public final l7m0 i;
    public final l7m0 j;

    public uc7(l7m0 l7m0Var, l7m0 l7m0Var2, l7m0 l7m0Var3, l7m0 l7m0Var4, l7m0 l7m0Var5, l7m0 l7m0Var6, l7m0 l7m0Var7, l7m0 l7m0Var8, l7m0 l7m0Var9, l7m0 l7m0Var10) {
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
        this.f35415a = l7m0Var;
        this.b = l7m0Var2;
        this.c = l7m0Var3;
        this.d = l7m0Var4;
        this.e = l7m0Var5;
        this.f = l7m0Var6;
        this.g = l7m0Var7;
        this.h = l7m0Var8;
        this.i = l7m0Var9;
        this.j = l7m0Var10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc7)) {
            return false;
        }
        uc7 uc7Var = (uc7) obj;
        return Intrinsics.d(this.f35415a, uc7Var.f35415a) && Intrinsics.d(this.b, uc7Var.b) && Intrinsics.d(this.c, uc7Var.c) && Intrinsics.d(this.d, uc7Var.d) && Intrinsics.d(this.e, uc7Var.e) && Intrinsics.d(this.f, uc7Var.f) && Intrinsics.d(this.g, uc7Var.g) && Intrinsics.d(this.h, uc7Var.h) && Intrinsics.d(this.i, uc7Var.i) && Intrinsics.d(this.j, uc7Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + h97.c(this.i, h97.c(this.h, h97.c(this.g, h97.c(this.f, h97.c(this.e, h97.c(this.d, h97.c(this.c, h97.c(this.b, this.f35415a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BetInfoUiState(contentUiState=");
        sb.append(this.f35415a);
        sb.append(", headerModelUiState=");
        sb.append(this.b);
        sb.append(", eventItemUiModelState=");
        h97.z(sb, this.c, ", navigationBarRightStyleUiState=", this.d, ", buttonUiState=");
        h97.z(sb, this.e, ", fullScreenLoader=", this.f, ", refreshEnable=");
        h97.z(sb, this.g, ", isRefreshing=", this.h, ", rtlSupport=");
        sb.append(this.i);
        sb.append(", titleUiState=");
        sb.append(this.j);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
