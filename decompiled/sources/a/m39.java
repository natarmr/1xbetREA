package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m39 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21103a;
    public final String b;
    public final int c;
    public final String d;
    public final boolean e;

    public m39(int i, String str, String str2, String str3, boolean z) {
        str3.getClass();
        this.f21103a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m39)) {
            return false;
        }
        m39 m39Var = (m39) obj;
        return this.f21103a.equals(m39Var.f21103a) && this.b.equals(m39Var.b) && this.c == m39Var.c && Intrinsics.d(this.d, m39Var.d) && this.e == m39Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(twn.a(this.c, ua80.b(this.f21103a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("BroadcastEventUiModel(text=", this.f21103a, ", time=", this.b, ", type=");
        kng0.w(this.c, ", image=", this.d, ", isImportant=", sbN);
        return rw2.p(sbN, this.e, Separators.RPAREN);
    }
}
