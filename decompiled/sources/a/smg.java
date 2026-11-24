package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class smg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32444a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;
    public final List f;

    public smg(String str, String str2, List list, String str3, String str4, List list2) {
        list.getClass();
        list2.getClass();
        this.f32444a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = str4;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof smg)) {
            return false;
        }
        smg smgVar = (smg) obj;
        return this.f32444a.equals(smgVar.f32444a) && this.b.equals(smgVar.b) && Intrinsics.d(this.c, smgVar.c) && this.d.equals(smgVar.d) && this.e.equals(smgVar.e) && Intrinsics.d(this.f, smgVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(dw9.a(ua80.b(this.f32444a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CyberDotaPlayerCompositionModel(firstTeamName=", this.f32444a, ", firstTeamImage=", this.b, ", firstPlayersInfo=");
        h97.y(", secondTeamName=", this.d, ", secondTeamImage=", sbN, this.c);
        return rw2.m(this.e, ", secondPlayersInfo=", Separators.RPAREN, sbN, this.f);
    }
}
