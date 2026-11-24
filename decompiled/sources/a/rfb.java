package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class rfb {
    public static final qfb Companion = new qfb();
    public static final a8z[] e = {null, null, null, maz.a(wez.f39042a, new e0b(16))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30378a;
    public final String b;
    public final String c;
    public final List d;

    public /* synthetic */ rfb(int i, String str, String str2, String str3, List list) {
        if ((i & 1) == 0) {
            this.f30378a = null;
        } else {
            this.f30378a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfb)) {
            return false;
        }
        rfb rfbVar = (rfb) obj;
        return Intrinsics.d(this.f30378a, rfbVar.f30378a) && Intrinsics.d(this.b, rfbVar.b) && Intrinsics.d(this.c, rfbVar.c) && Intrinsics.d(this.d, rfbVar.d);
    }

    public final int hashCode() {
        String str = this.f30378a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return rw2.m(this.c, ", menus=", Separators.RPAREN, b1j.n("ChampStatisticInfoResponse(id=", this.f30378a, ", title=", this.b, ", logo="), this.d);
    }
}
