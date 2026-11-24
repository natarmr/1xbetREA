package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class z1i implements b2i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u1i f43621a;
    public final u1i b;
    public final c4i c;
    public final b4i d;

    public z1i(u1i u1iVar, u1i u1iVar2) {
        c4i c4iVar = new c4i((String) null, false, (n0x) null, (m0x) null, (y3d) null, 63);
        b4i b4iVar = new b4i((String) null, 3);
        this.f43621a = u1iVar;
        this.b = u1iVar2;
        this.c = c4iVar;
        this.d = b4iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1i)) {
            return false;
        }
        z1i z1iVar = (z1i) obj;
        return this.f43621a.equals(z1iVar.f43621a) && this.b.equals(z1iVar.b) && this.c.equals(z1iVar.c) && this.d.equals(z1iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f43621a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "V1(leftButtonModel=" + this.f43621a + ", rightButtonModel=" + this.b + ", labelModel=" + this.c + ", infoLabelModel=" + this.d + Separators.RPAREN;
    }
}
