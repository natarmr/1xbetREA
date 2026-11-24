package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mk5 implements pk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21927a;
    public final boolean b;
    public final fl80 c;
    public final jkm d;
    public final mdm e;
    public final gmq f;

    public mk5(boolean z, boolean z2, fl80 fl80Var, jkm jkmVar, mdm mdmVar, p7m0 p7m0Var) {
        fl80Var.getClass();
        p7m0Var.getClass();
        this.f21927a = z;
        this.b = z2;
        this.c = fl80Var;
        this.d = jkmVar;
        this.e = mdmVar;
        this.f = p7m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mk5)) {
            return false;
        }
        mk5 mk5Var = (mk5) obj;
        return this.f21927a == mk5Var.f21927a && this.b == mk5Var.b && Intrinsics.d(this.c, mk5Var.c) && this.d.equals(mk5Var.d) && this.e.equals(mk5Var.e) && Intrinsics.d(this.f, mk5Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + f140.d(this.e, (this.d.hashCode() + ((this.c.hashCode() + brm0.e(Boolean.hashCode(this.f21927a) * 31, 31, this.b)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("Content(is24HourFormat=", ", swipeRefreshEnable=", ", scrollContent=", this.f21927a, this.b);
        sbQ.append(this.c);
        sbQ.append(", lottieConfig=");
        sbQ.append(this.d);
        sbQ.append(", config=");
        sbQ.append(this.e);
        sbQ.append(", pagingScrollContent=");
        sbQ.append(this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
