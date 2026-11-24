package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mym implements oym {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22608a;
    public final String b;
    public final c280 c;
    public final c280 d;
    public final a4x e;
    public final y1m f;
    public final boolean g;

    public mym(String str, String str2, c280 c280Var, c280 c280Var2, a4x a4xVar, y1m y1mVar, boolean z) {
        w6x.x(a4xVar, str, str2);
        this.f22608a = str;
        this.b = str2;
        this.c = c280Var;
        this.d = c280Var2;
        this.e = a4xVar;
        this.f = y1mVar;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mym)) {
            return false;
        }
        mym mymVar = (mym) obj;
        return Intrinsics.d(this.f22608a, mymVar.f22608a) && Intrinsics.d(this.b, mymVar.b) && this.c.equals(mymVar.c) && this.d.equals(mymVar.d) && Intrinsics.d(this.e, mymVar.e) && this.f.equals(mymVar.f) && this.g == mymVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + cs0.b(this.e, hne.g(this.d, hne.g(this.c, ua80.b(this.f22608a.hashCode() * 31, 31, this.b), 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("V3(firstOpponentLabel=", this.f22608a, ", secondOpponentLabel=", this.b, ", firstOpponentIcon=");
        f140.u(sbN, this.c, ", secondOpponentIcon=", this.d, ", rouletteList=");
        sbN.append(this.e);
        sbN.append(", scoreModel=");
        sbN.append(this.f);
        sbN.append(", supportRtl=");
        return rw2.p(sbN, this.g, Separators.RPAREN);
    }
}
