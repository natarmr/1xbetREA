package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class a2i implements b2i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u1i f125a;
    public final u1i b;
    public final c4i c;
    public final b4i d;

    public a2i(u1i u1iVar, u1i u1iVar2, c4i c4iVar, b4i b4iVar) {
        this.f125a = u1iVar;
        this.b = u1iVar2;
        this.c = c4iVar;
        this.d = b4iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2i)) {
            return false;
        }
        a2i a2iVar = (a2i) obj;
        return this.f125a.equals(a2iVar.f125a) && this.b.equals(a2iVar.b) && this.c.equals(a2iVar.c) && this.d.equals(a2iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f125a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "V3(leftButtonModel=" + this.f125a + ", rightButtonModel=" + this.b + ", labelModel=" + this.c + ", infoLabelModel=" + this.d + Separators.RPAREN;
    }
}
