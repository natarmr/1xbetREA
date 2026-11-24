package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mch0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21552a;
    public final a4x b;
    public final lch0 c;
    public final lch0 d;

    public mch0(String str, i4 i4Var, lch0 lch0Var, lch0 lch0Var2) {
        i4Var.getClass();
        this.f21552a = str;
        this.b = i4Var;
        this.c = lch0Var;
        this.d = lch0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mch0)) {
            return false;
        }
        mch0 mch0Var = (mch0) obj;
        return this.f21552a.equals(mch0Var.f21552a) && Intrinsics.d(this.b, mch0Var.b) && this.c.equals(mch0Var.c) && this.d.equals(mch0Var.d);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f21552a;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + cs0.b(this.b, this.f21552a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbU = kng0.u("ScrollingGraphUiModel(key=", this.f21552a, ", values=", this.b, ", topTeam=");
        sbU.append(this.c);
        sbU.append(", bottomTeam=");
        sbU.append(this.d);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
