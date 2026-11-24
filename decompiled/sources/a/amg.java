package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class amg implements p6t0, s0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1106a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;

    public amg(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2, String str4, String str5, int i, int i2, float f, float f2, boolean z) {
        ohs0.z(str, str2, str3, str4, str5);
        this.f1106a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = str4;
        this.g = str5;
        this.h = i;
        this.i = i2;
        this.j = f;
        this.k = f2;
        this.l = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amg)) {
            return false;
        }
        amg amgVar = (amg) obj;
        return Intrinsics.d(this.f1106a, amgVar.f1106a) && Intrinsics.d(this.b, amgVar.b) && Intrinsics.d(this.c, amgVar.c) && this.d.equals(amgVar.d) && this.e.equals(amgVar.e) && Intrinsics.d(this.f, amgVar.f) && Intrinsics.d(this.g, amgVar.g) && this.h == amgVar.h && this.i == amgVar.i && Float.compare(this.j, amgVar.j) == 0 && Float.compare(this.k, amgVar.k) == 0 && this.l == amgVar.l;
    }

    @Override // a.p6t0
    public final String getKey() {
        return "DICE_KEY";
    }

    public final int hashCode() {
        return Boolean.hashCode(this.l) + defpackage.c.a(defpackage.c.a(twn.a(this.i, twn.a(this.h, ua80.b(ua80.b(twn.g(this.e, twn.g(this.d, ua80.b(ua80.b(ua80.b(1421937465, 31, this.f1106a), 31, this.b), 31, this.c), 31), 31), 31, this.f), 31, this.g), 31), 31), this.j, 31), this.k, 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CyberDiceUiModel(key=DICE_KEY, matchDescription=", this.f1106a, ", firstPlayerName=", this.b, ", secondPlayerName=");
        sbN.append(this.c);
        sbN.append(", firstPlayerRoundInfo=");
        sbN.append(this.d);
        sbN.append(", secondPlayerRoundInfo=");
        sbN.append(this.e);
        sbN.append(", firstPlayerTotalScore=");
        sbN.append(this.f);
        sbN.append(", secondPlayerTotalScore=");
        twn.w(this.h, this.g, ", firstDicedRes=", ", secondDicedRes=", sbN);
        sbN.append(this.i);
        sbN.append(", firstPlayerOpacity=");
        sbN.append(this.j);
        sbN.append(", secondPlayerOpacity=");
        sbN.append(this.k);
        sbN.append(", supportRtl=");
        sbN.append(this.l);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
