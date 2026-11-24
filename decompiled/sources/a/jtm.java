package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jtm implements ltm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17106a;
    public final String b;
    public final a4x c;
    public final a4x d;
    public final String e;
    public final y1m f;
    public final boolean g;

    public jtm(String str, String str2, a4x a4xVar, a4x a4xVar2, String str3, y1m y1mVar, boolean z) {
        str.getClass();
        str2.getClass();
        a4xVar.getClass();
        a4xVar2.getClass();
        str3.getClass();
        this.f17106a = str;
        this.b = str2;
        this.c = a4xVar;
        this.d = a4xVar2;
        this.e = str3;
        this.f = y1mVar;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jtm)) {
            return false;
        }
        jtm jtmVar = (jtm) obj;
        return Intrinsics.d(this.f17106a, jtmVar.f17106a) && Intrinsics.d(this.b, jtmVar.b) && Intrinsics.d(this.c, jtmVar.c) && Intrinsics.d(this.d, jtmVar.d) && Intrinsics.d(this.e, jtmVar.e) && this.f.equals(jtmVar.f) && this.g == jtmVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + ua80.b(cs0.b(this.d, cs0.b(this.c, ua80.b(this.f17106a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("V3(firstOpponentLabel=", this.f17106a, ", secondOpponentLabel=", this.b, ", firstOpponentCardList=");
        hne.y(sbN, this.c, ", secondOpponentCardList=", this.d, ", gameLabel=");
        sbN.append(this.e);
        sbN.append(", customScoreModel=");
        sbN.append(this.f);
        sbN.append(", supportRtl=");
        return rw2.p(sbN, this.g, Separators.RPAREN);
    }
}
