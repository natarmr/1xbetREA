package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class q3g {
    public static final p3g Companion = new p3g();
    public static final a8z[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28051a;
    public final c4g b;
    public final c4g c;
    public final List d;
    public final List e;

    static {
        b4g b4gVar = c4g.Companion;
        wez wezVar = wez.f39042a;
        f = new a8z[]{null, null, null, maz.a(wezVar, new dpf((byte) 20)), maz.a(wezVar, new dpf((byte) 21))};
    }

    public /* synthetic */ q3g(int i, String str, c4g c4gVar, c4g c4gVar2, List list, List list2) {
        if ((i & 1) == 0) {
            this.f28051a = null;
        } else {
            this.f28051a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = c4gVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = c4gVar2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3g)) {
            return false;
        }
        q3g q3gVar = (q3g) obj;
        return Intrinsics.d(this.f28051a, q3gVar.f28051a) && Intrinsics.d(this.b, q3gVar.b) && Intrinsics.d(this.c, q3gVar.c) && Intrinsics.d(this.d, q3gVar.d) && Intrinsics.d(this.e, q3gVar.e);
    }

    public final int hashCode() {
        String str = this.f28051a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        c4g c4gVar = this.b;
        int iHashCode2 = (iHashCode + (c4gVar == null ? 0 : c4gVar.hashCode())) * 31;
        c4g c4gVar2 = this.c;
        int iHashCode3 = (iHashCode2 + (c4gVar2 == null ? 0 : c4gVar2.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.e;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberCSMatchesStatisticMatchResponse(map=");
        sb.append(this.f28051a);
        sb.append(", team1=");
        sb.append(this.b);
        sb.append(", team2=");
        sb.append(this.c);
        sb.append(", rounds=");
        sb.append(this.d);
        sb.append(", overtime=");
        return dw9.r(sb, this.e, Separators.RPAREN);
    }
}
