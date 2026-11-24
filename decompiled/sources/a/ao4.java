package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ao4 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1183a;
    public final int b;
    public final boolean c;
    public final String d;
    public final wui0 e;
    public final String f;

    public ao4(String str, int i, boolean z, String str2, wui0 wui0Var, String str3) {
        str.getClass();
        str3.getClass();
        this.f1183a = str;
        this.b = i;
        this.c = z;
        this.d = str2;
        this.e = wui0Var;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao4)) {
            return false;
        }
        ao4 ao4Var = (ao4) obj;
        return Intrinsics.d(this.f1183a, ao4Var.f1183a) && this.b == ao4Var.b && this.c == ao4Var.c && this.d.equals(ao4Var.d) && this.e == ao4Var.e && Intrinsics.d(this.f, ao4Var.f);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f1183a;
    }

    public final int hashCode() {
        return this.f.hashCode() + rw2.c(this.e, ua80.b(brm0.e(twn.a(this.b, this.f1183a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "AuthSessionHistoryUiItemModel(appGuid=", this.f1183a, ", icon=", ", currentAppGuid=");
        f140.s(", titleText=", this.d, ", position=", sbP, this.c);
        sbP.append(this.e);
        sbP.append(", subTitleText=");
        sbP.append(this.f);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
