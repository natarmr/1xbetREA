package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class fos {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9897a;
    public final znp0 b;
    public final znp0 c;
    public final of90 d;
    public final ArrayList e;

    public fos(String str, znp0 znp0Var, znp0 znp0Var2, of90 of90Var, ArrayList arrayList) {
        this.f9897a = str;
        this.b = znp0Var;
        this.c = znp0Var2;
        this.d = of90Var;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fos)) {
            return false;
        }
        fos fosVar = (fos) obj;
        return this.f9897a.equals(fosVar.f9897a) && this.b.equals(fosVar.b) && this.c.equals(fosVar.c) && this.d.equals(fosVar.d) && this.e.equals(fosVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f9897a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GamePeriodsUiModel(periodTitle=");
        sb.append(this.f9897a);
        sb.append(", teamOne=");
        sb.append(this.b);
        sb.append(", teamTwo=");
        sb.append(this.c);
        sb.append(", total=");
        sb.append(this.d);
        sb.append(", periods=");
        return rz4.n(sb, this.e, Separators.RPAREN);
    }
}
