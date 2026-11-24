package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class m5x0 extends fpw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21238a;
    public final lpw0 b;

    public m5x0(String str, lpw0 lpw0Var) {
        this.f21238a = str;
        this.b = lpw0Var;
    }

    @Override // a.fpw0
    public final boolean a() {
        return this.b != lpw0.e;
    }

    public final String toString() {
        return b1j.k("(typeUrl=", this.f21238a, ", outputPrefixType=", this.b.f20460a, Separators.RPAREN);
    }
}
