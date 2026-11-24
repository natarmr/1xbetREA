package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nym implements oym {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24335a;
    public final String b;
    public final c280 c;
    public final c280 d;
    public final a4x e;
    public final y1m f;
    public final String g;
    public final String h;
    public final boolean i;

    public nym(String str, String str2, c280 c280Var, c280 c280Var2, a4x a4xVar, y1m y1mVar, String str3, String str4, boolean z) {
        str.getClass();
        str2.getClass();
        a4xVar.getClass();
        str3.getClass();
        str4.getClass();
        this.f24335a = str;
        this.b = str2;
        this.c = c280Var;
        this.d = c280Var2;
        this.e = a4xVar;
        this.f = y1mVar;
        this.g = str3;
        this.h = str4;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nym)) {
            return false;
        }
        nym nymVar = (nym) obj;
        return Intrinsics.d(this.f24335a, nymVar.f24335a) && Intrinsics.d(this.b, nymVar.b) && this.c.equals(nymVar.c) && this.d.equals(nymVar.d) && Intrinsics.d(this.e, nymVar.e) && this.f.equals(nymVar.f) && Intrinsics.d(this.g, nymVar.g) && Intrinsics.d(this.h, nymVar.h) && this.i == nymVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ua80.b(ua80.b((this.f.hashCode() + cs0.b(this.e, hne.g(this.d, hne.g(this.c, ua80.b(this.f24335a.hashCode() * 31, 31, this.b), 31), 31), 31)) * 31, 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("V4(firstOpponentLabel=", this.f24335a, ", secondOpponentLabel=", this.b, ", firstOpponentIcon=");
        f140.u(sbN, this.c, ", secondOpponentIcon=", this.d, ", rouletteList=");
        sbN.append(this.e);
        sbN.append(", scoreModel=");
        sbN.append(this.f);
        sbN.append(", infoLabel=");
        f140.v(sbN, this.g, ", tagLiveText=", this.h, ", supportRtl=");
        return rw2.p(sbN, this.i, Separators.RPAREN);
    }
}
