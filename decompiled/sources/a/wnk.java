package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wnk implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39453a;
    public final long b;
    public final String c;
    public final String d;
    public final tnk e;
    public final rnk f;

    public wnk(int i, long j, String str, String str2, tnk tnkVar, rnk rnkVar) {
        str.getClass();
        str2.getClass();
        this.f39453a = i;
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = tnkVar;
        this.f = rnkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wnk)) {
            return false;
        }
        wnk wnkVar = (wnk) obj;
        return this.f39453a == wnkVar.f39453a && this.b == wnkVar.b && Intrinsics.d(this.c, wnkVar.c) && Intrinsics.d(this.d, wnkVar.d) && this.e.equals(wnkVar.e) && this.f == wnkVar.f;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof wnk) && (p6t0Var2 instanceof wnk)) {
            wnk wnkVar = (wnk) p6t0Var;
            wnk wnkVar2 = (wnk) p6t0Var2;
            if (wnkVar.f39453a == wnkVar2.f39453a && wnkVar.b == wnkVar2.b) {
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
        return this.f.hashCode() + ((this.e.hashCode() + ua80.b(ua80.b(rw2.b(Integer.hashCode(this.f39453a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof wnk) || !(p6t0Var2 instanceof wnk)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        wnk wnkVar = (wnk) p6t0Var;
        wnk wnkVar2 = (wnk) p6t0Var2;
        k9x.G(arrayList, new vnk(wnkVar.c), new vnk(wnkVar2.c));
        k9x.G(arrayList, new unk(wnkVar.d), new unk(wnkVar2.d));
        k9x.G(arrayList, wnkVar.e, wnkVar2.e);
        k9x.G(arrayList, new snk(wnkVar.f), new snk(wnkVar2.f));
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public final String toString() {
        String strL = kng0.l("Title(value=", this.c, Separators.RPAREN);
        String strL2 = kng0.l("Subtitle(value=", this.d, Separators.RPAREN);
        String str = "BannerType(value=" + this.f + Separators.RPAREN;
        StringBuilder sbQ = vqd.q(this.f39453a, this.b, "DisciplineBannerUiModel(sportId=", ", generalChampId=");
        f140.v(sbQ, ", title=", strL, ", subtitle=", strL2);
        sbQ.append(", image=");
        sbQ.append(this.e);
        sbQ.append(", bannerType=");
        sbQ.append(str);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
