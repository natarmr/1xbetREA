package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pqs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27429a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final int h;
    public final jts i;
    public final String j;

    public pqs(String str, String str2, List list, String str3, String str4, int i, int i2, int i3, jts jtsVar, String str5) {
        list.getClass();
        str3.getClass();
        str4.getClass();
        this.f27429a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = jtsVar;
        this.j = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqs)) {
            return false;
        }
        pqs pqsVar = (pqs) obj;
        return this.f27429a.equals(pqsVar.f27429a) && this.b.equals(pqsVar.b) && Intrinsics.d(this.c, pqsVar.c) && Intrinsics.d(this.d, pqsVar.d) && Intrinsics.d(this.e, pqsVar.e) && this.f == pqsVar.f && this.g == pqsVar.g && this.h == pqsVar.h && Intrinsics.d(this.i, pqsVar.i) && this.j.equals(pqsVar.j);
    }

    public final int hashCode() {
        int iA = twn.a(this.h, twn.a(this.g, twn.a(this.f, ua80.b(ua80.b(dw9.a(ua80.b(this.f27429a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31);
        jts jtsVar = this.i;
        return this.j.hashCode() + ((iA + (jtsVar == null ? 0 : jtsVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("GameScoreModel(periodName=", this.f27429a, ", fullScoreStr=", this.b, ", periodScoreList=");
        h97.y(", teamOneScoreWithWickets=", this.d, ", teamTwoScoreWithWickets=", sbN, this.c);
        twn.w(this.f, this.e, ", scoreFirst=", ", scoreSecond=", sbN);
        axq.r(this.g, this.h, ", serve=", ", subScore=", sbN);
        sbN.append(this.i);
        sbN.append(", periodFullScore=");
        sbN.append(this.j);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
