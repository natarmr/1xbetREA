package a;

import android.gov.nist.core.Separators;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public final class ijs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f14891a;
    public final pjs0 b;
    public final qks0 c;
    public final qks0 d;

    public ijs0(Date date, pjs0 pjs0Var, qks0 qks0Var, qks0 qks0Var2) {
        this.f14891a = date;
        this.b = pjs0Var;
        this.c = qks0Var;
        this.d = qks0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijs0)) {
            return false;
        }
        ijs0 ijs0Var = (ijs0) obj;
        return this.f14891a.equals(ijs0Var.f14891a) && this.b.equals(ijs0Var.b) && this.c.equals(ijs0Var.c) && this.d.equals(ijs0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f14891a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransfersModel(date=" + this.f14891a + ", player=" + this.b + ", oldTeam=" + this.c + ", newTeam=" + this.d + Separators.RPAREN;
    }
}
