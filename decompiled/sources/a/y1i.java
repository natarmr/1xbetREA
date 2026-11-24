package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class y1i implements b2i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u1i f41855a;
    public final u1i b;
    public final c4i c;
    public final b4i d;

    public y1i(u1i u1iVar, u1i u1iVar2) {
        c4i c4iVar = new c4i((String) null, false, (n0x) null, (m0x) null, (y3d) null, 63);
        b4i b4iVar = new b4i((String) null, 3);
        this.f41855a = u1iVar;
        this.b = u1iVar2;
        this.c = c4iVar;
        this.d = b4iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1i)) {
            return false;
        }
        y1i y1iVar = (y1i) obj;
        return this.f41855a.equals(y1iVar.f41855a) && this.b.equals(y1iVar.b) && this.c.equals(y1iVar.c) && this.d.equals(y1iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f41855a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Default(leftButtonModel=" + this.f41855a + ", rightButtonModel=" + this.b + ", labelModel=" + this.c + ", infoLabelModel=" + this.d + Separators.RPAREN;
    }
}
