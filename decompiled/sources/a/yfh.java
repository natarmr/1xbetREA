package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class yfh implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f42543a;
    public final String b;
    public final vfh c;

    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    public yfh(long j, String str, vfh vfhVar) {
        this.f42543a = (int) j;
        this.b = str;
        this.c = vfhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfh)) {
            return false;
        }
        yfh yfhVar = (yfh) obj;
        return ((long) this.f42543a) == ((long) yfhVar.f42543a) && this.b.equals(yfhVar.b) && this.c.equals(yfhVar.c);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof yfh) && (p6t0Var2 instanceof yfh) && ((long) ((yfh) p6t0Var).f42543a) == ((long) ((yfh) p6t0Var2).f42543a);
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Integer.hashCode(R.color.static_black_40) + ((this.c.hashCode() + ua80.b(Long.hashCode(this.f42543a) * 31, 31, this.b)) * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof yfh) || !(p6t0Var2 instanceof yfh)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        yfh yfhVar = (yfh) p6t0Var;
        yfh yfhVar2 = (yfh) p6t0Var2;
        k9x.G(arrayList, new wfh(yfhVar.b), new wfh(yfhVar2.b));
        k9x.G(arrayList, yfhVar.c, yfhVar2.c);
        k9x.G(arrayList, new ufh(), new ufh());
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public final String toString() {
        long j = this.f42543a;
        String strL = kng0.l("Title(value=", this.b, Separators.RPAREN);
        String strE = ua80.e(R.color.static_black_40, "BackgroundColor(value=", Separators.RPAREN);
        StringBuilder sbO = axq.o(j, "CyberStatisticButtonUiModel(id=", ", title=", strL);
        sbO.append(", icon=");
        sbO.append(this.c);
        sbO.append(", backgroundColor=");
        sbO.append(strE);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
