package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.game.core.betting.domain.model.RelatedParams;

/* JADX INFO: loaded from: classes4.dex */
public final class ubh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelatedParams f35380a;
    public final boolean b;
    public final tbh c;
    public final List d;
    public final boolean e;
    public final boolean f;
    public final v5l0 g;
    public final List h;
    public final wcb i;

    public ubh(RelatedParams relatedParams, boolean z, tbh tbhVar, List list, boolean z2, boolean z3, v5l0 v5l0Var, List list2, wcb wcbVar) {
        list.getClass();
        v5l0Var.getClass();
        list2.getClass();
        this.f35380a = relatedParams;
        this.b = z;
        this.c = tbhVar;
        this.d = list;
        this.e = z2;
        this.f = z3;
        this.g = v5l0Var;
        this.h = list2;
        this.i = wcbVar;
    }

    public static ubh a(ubh ubhVar, RelatedParams relatedParams, boolean z, tbh tbhVar, List list, boolean z2, boolean z3, v5l0 v5l0Var, List list2, wcb wcbVar, int i) {
        if ((i & 1) != 0) {
            relatedParams = ubhVar.f35380a;
        }
        RelatedParams relatedParams2 = relatedParams;
        if ((i & 2) != 0) {
            z = ubhVar.b;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            tbhVar = ubhVar.c;
        }
        tbh tbhVar2 = tbhVar;
        if ((i & 8) != 0) {
            list = ubhVar.d;
        }
        List list3 = list;
        if ((i & 16) != 0) {
            z2 = ubhVar.e;
        }
        boolean z5 = z2;
        boolean z6 = (i & 32) != 0 ? ubhVar.f : z3;
        v5l0 v5l0Var2 = (i & 64) != 0 ? ubhVar.g : v5l0Var;
        List list4 = (i & 128) != 0 ? ubhVar.h : list2;
        wcb wcbVar2 = (i & 256) != 0 ? ubhVar.i : wcbVar;
        ubhVar.getClass();
        tbhVar2.getClass();
        list3.getClass();
        v5l0Var2.getClass();
        list4.getClass();
        return new ubh(relatedParams2, z4, tbhVar2, list3, z5, z6, v5l0Var2, list4, wcbVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ubh)) {
            return false;
        }
        ubh ubhVar = (ubh) obj;
        return Intrinsics.d(this.f35380a, ubhVar.f35380a) && this.b == ubhVar.b && this.c == ubhVar.c && Intrinsics.d(this.d, ubhVar.d) && this.e == ubhVar.e && this.f == ubhVar.f && this.g == ubhVar.g && Intrinsics.d(this.h, ubhVar.h) && Intrinsics.d(this.i, ubhVar.i);
    }

    public final int hashCode() {
        RelatedParams relatedParams = this.f35380a;
        int iA = dw9.a(axq.c(this.g, brm0.e(brm0.e(dw9.a((this.c.hashCode() + brm0.e((relatedParams == null ? 0 : relatedParams.hashCode()) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h);
        wcb wcbVar = this.i;
        return iA + (wcbVar != null ? wcbVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberRelatedGamesState(params=");
        sb.append(this.f35380a);
        sb.append(", pollingActive=");
        sb.append(this.b);
        sb.append(", loadingState=");
        sb.append(this.c);
        sb.append(", games=");
        sb.append(this.d);
        sb.append(", bettingDisabled=");
        ua80.u(", hasStream=", ", sportEventCardStyle=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", specialEventInfo=");
        sb.append(this.h);
        sb.append(", champImagesHolder=");
        sb.append(this.i);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
