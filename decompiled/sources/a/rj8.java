package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class rj8 implements sj8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f30580a;
    public final mdm b;

    public rj8(mdm mdmVar, imm immVar) {
        this.f30580a = immVar;
        this.b = mdmVar;
    }

    @Override // a.sj8
    public final imm a() {
        return this.f30580a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rj8)) {
            return false;
        }
        rj8 rj8Var = (rj8) obj;
        return this.f30580a.equals(rj8Var.f30580a) && this.b.equals(rj8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f30580a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(navBarUiModel=" + this.f30580a + ", errorConfig=" + this.b + Separators.RPAREN;
    }
}
