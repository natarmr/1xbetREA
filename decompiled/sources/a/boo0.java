package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class boo0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2944a;
    public final fyl b;
    public final pno0 c;

    public boo0(String str, fyl fylVar, pno0 pno0Var) {
        this.f2944a = str;
        this.b = fylVar;
        this.c = pno0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof boo0)) {
            return false;
        }
        boo0 boo0Var = (boo0) obj;
        return this.f2944a.equals(boo0Var.f2944a) && this.b.equals(boo0Var.b) && this.c == boo0Var.c;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f2944a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f2944a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TabsUiModel(key=" + this.f2944a + ", chips=" + this.b + ", marginType=" + this.c + Separators.RPAREN;
    }
}
