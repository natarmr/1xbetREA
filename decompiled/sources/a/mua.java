package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class mua {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f22406a;
    public final a4x b;
    public final boolean c;
    public final mtl d;
    public final boolean e;

    public mua(imm immVar, a4x a4xVar, boolean z, mtl mtlVar, boolean z2) {
        a4xVar.getClass();
        this.f22406a = immVar;
        this.b = a4xVar;
        this.c = z;
        this.d = mtlVar;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mua)) {
            return false;
        }
        mua muaVar = (mua) obj;
        return this.f22406a.equals(muaVar.f22406a) && Intrinsics.d(this.b, muaVar.b) && this.c == muaVar.c && this.d.equals(muaVar.d) && this.e == muaVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + cs0.b(this.d.f22376a, brm0.e(cs0.b(this.b, this.f22406a.hashCode() * 31, 31), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardsInfoSettingsUiState(navigationBarUiModel=");
        sb.append(this.f22406a);
        sb.append(", items=");
        sb.append(this.b);
        sb.append(", canReset=");
        sb.append(this.c);
        sb.append(", bottomBarModel=");
        sb.append(this.d);
        sb.append(", isLoading=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
