package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class upo implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36076a;
    public final int b;
    public final String c;
    public final String d;
    public final ArrayList e;
    public final ArrayList f;
    public final List g;
    public final boolean h;
    public final npo i;

    public upo(long j, int i, String str, String str2, ArrayList arrayList, ArrayList arrayList2, List list, boolean z, npo npoVar) {
        list.getClass();
        this.f36076a = j;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = arrayList;
        this.f = arrayList2;
        this.g = list;
        this.h = z;
        this.i = npoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof upo)) {
            return false;
        }
        upo upoVar = (upo) obj;
        return this.f36076a == upoVar.f36076a && this.b == upoVar.b && this.c.equals(upoVar.c) && this.d.equals(upoVar.d) && this.e.equals(upoVar.e) && this.f.equals(upoVar.f) && Intrinsics.d(this.g, upoVar.g) && this.h == upoVar.h && this.i == upoVar.i;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof upo) && (p6t0Var2 instanceof upo)) {
            upo upoVar = (upo) p6t0Var;
            upo upoVar2 = (upo) p6t0Var2;
            if (upoVar.b == upoVar2.b && upoVar.h == upoVar2.h) {
                return true;
            }
        }
        return false;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.i.hashCode() + brm0.e(dw9.a(twn.g(this.f, twn.g(this.e, ua80.b(ua80.b(twn.a(this.b, Long.hashCode(this.f36076a) * 31, 31), 31, this.c), 31, this.d), 31), 31), 31, this.g), 31, this.h);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof upo) || !(p6t0Var2 instanceof upo)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        upo upoVar = (upo) p6t0Var;
        upo upoVar2 = (upo) p6t0Var2;
        k9x.G(linkedHashSet, new spo(upoVar.e), new spo(upoVar2.e));
        k9x.G(linkedHashSet, new rpo(upoVar.c), new rpo(upoVar2.c));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strL = kng0.l("Coeff(value=", this.c, Separators.RPAREN);
        String strO = hne.o("Events(value=", Separators.RPAREN, this.e);
        StringBuilder sbQ = brm0.q(this.b, this.f36076a, "ExpressEventUiModel(id=", ", position=");
        f140.v(sbQ, ", totalCoeff=", strL, ", eventTitle=", this.d);
        sbQ.append(", coefficients=");
        sbQ.append(strO);
        sbQ.append(", sportUiModelList=");
        sbQ.append(this.f);
        esw0.k(sbQ, ", dayExpressModelList=", this.g, ", isLive=", this.h);
        sbQ.append(", style=");
        sbQ.append(this.i);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
