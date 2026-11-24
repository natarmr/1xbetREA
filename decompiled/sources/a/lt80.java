package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class lt80 implements mt80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ijl f20620a;
    public final jjl b;

    public lt80(ijl ijlVar, jjl jjlVar) {
        ijlVar.getClass();
        this.f20620a = ijlVar;
        this.b = jjlVar;
    }

    @Override // a.mt80
    public final ijl a() {
        return this.f20620a;
    }

    @Override // a.mt80
    public final jjl b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt80)) {
            return false;
        }
        lt80 lt80Var = (lt80) obj;
        return this.f20620a == lt80Var.f20620a && this.b.equals(lt80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f20620a.hashCode() * 31);
    }

    public final String toString() {
        return "Empty(style=" + this.f20620a + ", model=" + this.b + Separators.RPAREN;
    }
}
