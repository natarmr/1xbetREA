package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;
import org.xplatform.responsible_game.impl.domain.models.LimitTypeEnum;

/* JADX INFO: loaded from: classes5.dex */
public final class goz implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LimitTypeEnum f11657a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final long f;

    public goz(LimitTypeEnum limitTypeEnum, String str, String str2, int i, String str3, long j) {
        this.f11657a = limitTypeEnum;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof goz)) {
            return false;
        }
        goz gozVar = (goz) obj;
        return this.f11657a == gozVar.f11657a && this.b.equals(gozVar.b) && this.c.equals(gozVar.c) && this.d == gozVar.d && this.e.equals(gozVar.e) && this.f == gozVar.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + ua80.b(twn.a(this.d, ua80.b(ua80.b(this.f11657a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof goz) || !(p6t0Var2 instanceof goz)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        goz gozVar = (goz) p6t0Var;
        goz gozVar2 = (goz) p6t0Var2;
        k9x.G(linkedHashSet, new eoz(gozVar.b), new eoz(gozVar2.b));
        k9x.G(linkedHashSet, new aoz(gozVar.c), new aoz(gozVar2.c));
        k9x.G(linkedHashSet, new boz(gozVar.d), new boz(gozVar2.d));
        k9x.G(linkedHashSet, new coz(gozVar.e), new coz(gozVar2.e));
        k9x.G(linkedHashSet, new doz(gozVar.f), new doz(gozVar2.f));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strL = kng0.l("Title(value=", this.b, Separators.RPAREN);
        String strL2 = kng0.l("Actual(value=", this.c, Separators.RPAREN);
        String strE = ua80.e(this.d, "EndsAt(value=", Separators.RPAREN);
        String strL3 = kng0.l("Previous(value=", this.e, Separators.RPAREN);
        String strH = axq.h(this.f, "StartAt(value=", Separators.RPAREN);
        StringBuilder sb = new StringBuilder("LimitRowUiModel(limitType=");
        sb.append(this.f11657a);
        sb.append(", title=");
        sb.append(strL);
        sb.append(", actual=");
        f140.v(sb, strL2, ", endsAt=", strE, ", previous=");
        return ua80.m(sb, strL3, ", startAt=", strH, Separators.RPAREN);
    }
}
