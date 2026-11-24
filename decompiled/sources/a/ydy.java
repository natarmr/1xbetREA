package a;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ydy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zlf0 f42462a;
    public final zlf0 b;
    public final Map c;
    public final boolean d;

    public ydy(zlf0 zlf0Var, zlf0 zlf0Var2) {
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        this.f42462a = zlf0Var;
        this.b = zlf0Var2;
        this.c = lunVar;
        maz.b(new aaw(this, (byte) 14));
        zlf0 zlf0Var3 = zlf0.IGNORE;
        this.d = zlf0Var == zlf0Var3 && zlf0Var2 == zlf0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydy)) {
            return false;
        }
        ydy ydyVar = (ydy) obj;
        return this.f42462a == ydyVar.f42462a && this.b == ydyVar.b && this.c.equals(ydyVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.f42462a.hashCode() * 31;
        zlf0 zlf0Var = this.b;
        return this.c.hashCode() + ((iHashCode + (zlf0Var == null ? 0 : zlf0Var.hashCode())) * 31);
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.f42462a + ", migrationLevel=" + this.b + ", userDefinedLevelForSpecificAnnotation=" + this.c + ')';
    }
}
