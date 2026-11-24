package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kep0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18165a;
    public final kjm b;
    public final hjm c;

    public kep0(String str, kjm kjmVar, hjm hjmVar) {
        this.f18165a = str;
        this.b = kjmVar;
        this.c = hjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kep0)) {
            return false;
        }
        kep0 kep0Var = (kep0) obj;
        return this.f18165a.equals(kep0Var.f18165a) && this.b == kep0Var.b && this.c.equals(kep0Var.c);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f18165a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f18165a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TeamHeaderUiItem(key=" + this.f18165a + ", type=" + this.b + ", model=" + this.c + Separators.RPAREN;
    }
}
