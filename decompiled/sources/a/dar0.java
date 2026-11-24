package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class dar0 {
    public static final car0 Companion = new car0();
    public static final a8z[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5765a;
    public final List b;
    public final List c;
    public final List d;

    static {
        wez wezVar = wez.f39042a;
        e = new a8z[]{null, maz.a(wezVar, new joq0((byte) 19)), maz.a(wezVar, new joq0((byte) 20)), maz.a(wezVar, new joq0((byte) 21))};
    }

    public /* synthetic */ dar0(int i, String str, List list, List list2, List list3) {
        if ((i & 1) == 0) {
            this.f5765a = null;
        } else {
            this.f5765a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dar0)) {
            return false;
        }
        dar0 dar0Var = (dar0) obj;
        return Intrinsics.d(this.f5765a, dar0Var.f5765a) && Intrinsics.d(this.b, dar0Var.b) && Intrinsics.d(this.c, dar0Var.c) && Intrinsics.d(this.d, dar0Var.d);
    }

    public final int hashCode() {
        String str = this.f5765a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.c;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.d;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        return kng0.n(", assists=", Separators.RPAREN, defpackage.c.f("TopPlayersInfoResponse(team=", this.f5765a, ", ratings=", this.b, ", goals="), this.c, this.d);
    }
}
