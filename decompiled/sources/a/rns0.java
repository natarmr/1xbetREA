package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class rns0 {
    public static final qns0 Companion = new qns0();
    public static final a8z[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30805a;
    public final ivf b;
    public final Map c;
    public final Map d;
    public final Map e;

    static {
        gvf gvfVar = ivf.Companion;
        wez wezVar = wez.f39042a;
        f = new a8z[]{null, null, maz.a(wezVar, new yqr0((byte) 24)), maz.a(wezVar, new yqr0((byte) 25)), maz.a(wezVar, new yqr0((byte) 26))};
    }

    public rns0(int i, String str, ivf ivfVar, Map map, Map map2, Map map3) {
        this.f30805a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = ivfVar;
        }
        if ((i & 4) == 0) {
            lun lunVar = lun.f20680a;
            lunVar.getClass();
            this.c = lunVar;
        } else {
            this.c = map;
        }
        if ((i & 8) == 0) {
            lun lunVar2 = lun.f20680a;
            lunVar2.getClass();
            this.d = lunVar2;
        } else {
            this.d = map2;
        }
        if ((i & 16) != 0) {
            this.e = map3;
            return;
        }
        lun lunVar3 = lun.f20680a;
        lunVar3.getClass();
        this.e = lunVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rns0)) {
            return false;
        }
        rns0 rns0Var = (rns0) obj;
        return Intrinsics.d(this.f30805a, rns0Var.f30805a) && Intrinsics.d(this.b, rns0Var.b) && Intrinsics.d(this.c, rns0Var.c) && Intrinsics.d(this.d, rns0Var.d) && Intrinsics.d(this.e, rns0Var.e);
    }

    public final int hashCode() {
        String str = this.f30805a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ivf ivfVar = this.b;
        int iHashCode2 = (iHashCode + (ivfVar == null ? 0 : ivfVar.hashCode())) * 31;
        Map map = this.c;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.d;
        int iHashCode4 = (iHashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map map3 = this.e;
        return iHashCode4 + (map3 != null ? map3.hashCode() : 0);
    }

    public final String toString() {
        return "TranslationMainResponse(info=" + this.f30805a + ", currencyResponse=" + this.b + ", vars=" + this.c + ", geo=" + this.d + ", byRefId=" + this.e + Separators.RPAREN;
    }
}
