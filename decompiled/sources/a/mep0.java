package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mep0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21659a;
    public final String b;
    public final int c;
    public final String d;
    public final List e;
    public final ArrayList f;

    public mep0(String str, String str2, int i, String str3, List list, ArrayList arrayList) {
        list.getClass();
        this.f21659a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = list;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mep0)) {
            return false;
        }
        mep0 mep0Var = (mep0) obj;
        return this.f21659a.equals(mep0Var.f21659a) && this.b.equals(mep0Var.b) && this.c == mep0Var.c && this.d.equals(mep0Var.d) && Intrinsics.d(this.e, mep0Var.e) && this.f.equals(mep0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + dw9.a(ua80.b(twn.a(this.c, ua80.b(this.f21659a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TeamHeatMapModel(id=", this.f21659a, ", title=", this.b, ", clId=");
        kng0.w(this.c, ", image=", this.d, ", subTeams=", sbN);
        sbN.append(this.e);
        sbN.append(", players=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
