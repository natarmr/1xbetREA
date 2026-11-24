package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gl40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l7m0 f11473a;
    public final l7m0 b;
    public final l7m0 c;
    public final l7m0 d;
    public final l7m0 e;
    public final l7m0 f;
    public final l7m0 g;

    public gl40(l7m0 l7m0Var, l7m0 l7m0Var2, l7m0 l7m0Var3, l7m0 l7m0Var4, l7m0 l7m0Var5, l7m0 l7m0Var6, l7m0 l7m0Var7) {
        l7m0Var.getClass();
        l7m0Var2.getClass();
        l7m0Var3.getClass();
        l7m0Var4.getClass();
        l7m0Var5.getClass();
        l7m0Var6.getClass();
        l7m0Var7.getClass();
        this.f11473a = l7m0Var;
        this.b = l7m0Var2;
        this.c = l7m0Var3;
        this.d = l7m0Var4;
        this.e = l7m0Var5;
        this.f = l7m0Var6;
        this.g = l7m0Var7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl40)) {
            return false;
        }
        gl40 gl40Var = (gl40) obj;
        return Intrinsics.d(this.f11473a, gl40Var.f11473a) && Intrinsics.d(this.b, gl40Var.b) && Intrinsics.d(this.c, gl40Var.c) && Intrinsics.d(this.d, gl40Var.d) && Intrinsics.d(this.e, gl40Var.e) && Intrinsics.d(this.f, gl40Var.f) && Intrinsics.d(this.g, gl40Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + h97.c(this.f, h97.c(this.e, h97.c(this.d, h97.c(this.c, h97.c(this.b, this.f11473a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MlbbUiState(gameBackgroundUiState=");
        sb.append(this.f11473a);
        sb.append(", gameToolbarUiState=");
        sb.append(this.b);
        sb.append(", matchInfoUiState=");
        h97.z(sb, this.c, ", gameStreamUiState=", this.d, ", gameStatisticUiState=");
        h97.z(sb, this.e, ", simulationUiState=", this.f, ", resetScrollUiState=");
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
