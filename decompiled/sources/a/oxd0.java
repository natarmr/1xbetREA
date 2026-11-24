package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class oxd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26007a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;
    public final List f;

    public oxd0(String str, String str2, List list, String str3, String str4, List list2) {
        list.getClass();
        list2.getClass();
        this.f26007a = str;
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
        if (!(obj instanceof oxd0)) {
            return false;
        }
        oxd0 oxd0Var = (oxd0) obj;
        return this.f26007a.equals(oxd0Var.f26007a) && this.b.equals(oxd0Var.b) && Intrinsics.d(this.c, oxd0Var.c) && this.d.equals(oxd0Var.d) && this.e.equals(oxd0Var.e) && Intrinsics.d(this.f, oxd0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(dw9.a(ua80.b(this.f26007a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("RainbowSixPlayerCompositionModel(firstTeamName=", this.f26007a, ", firstTeamImage=", this.b, ", firstPlayersInfo=");
        h97.y(", secondTeamName=", this.d, ", secondTeamImage=", sbN, this.c);
        return rw2.m(this.e, ", secondPlayersInfo=", Separators.RPAREN, sbN, this.f);
    }
}
