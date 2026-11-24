package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class fnw {
    public static final enw Companion = new enw();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f9858a;
    public final List b;
    public final gmw c;

    static {
        fmw fmwVar = gmw.Companion;
        d = new a8z[]{null, maz.a(wez.f39042a, new kdw((byte) 7)), null};
    }

    public /* synthetic */ fnw(int i, Integer num, List list, gmw gmwVar) {
        if ((i & 1) == 0) {
            this.f9858a = null;
        } else {
            this.f9858a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = gmwVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnw)) {
            return false;
        }
        fnw fnwVar = (fnw) obj;
        return Intrinsics.d(this.f9858a, fnwVar.f9858a) && Intrinsics.d(this.b, fnwVar.b) && Intrinsics.d(this.c, fnwVar.c);
    }

    public final int hashCode() {
        Integer num = this.f9858a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        gmw gmwVar = this.c;
        return iHashCode2 + (gmwVar != null ? gmwVar.hashCode() : 0);
    }

    public final String toString() {
        return "HorseMenuResponse(sportId=" + this.f9858a + ", horses=" + this.b + ", response=" + this.c + Separators.RPAREN;
    }
}
