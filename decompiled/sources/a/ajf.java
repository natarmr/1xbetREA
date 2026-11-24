package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class ajf {
    public static final zif Companion = new zif();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f972a;
    public final String b;
    public final Long c;
    public final String d;
    public final sif e;
    public final String f;

    public /* synthetic */ ajf(int i, String str, String str2, Long l, String str3, sif sifVar, String str4) {
        if ((i & 1) == 0) {
            this.f972a = null;
        } else {
            this.f972a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = sifVar;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajf)) {
            return false;
        }
        ajf ajfVar = (ajf) obj;
        return Intrinsics.d(this.f972a, ajfVar.f972a) && Intrinsics.d(this.b, ajfVar.b) && Intrinsics.d(this.c, ajfVar.c) && Intrinsics.d(this.d, ajfVar.d) && Intrinsics.d(this.e, ajfVar.e) && Intrinsics.d(this.f, ajfVar.f);
    }

    public final int hashCode() {
        String str = this.f972a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        sif sifVar = this.e;
        int iHashCode5 = (iHashCode4 + (sifVar == null ? 0 : sifVar.hashCode())) * 31;
        String str4 = this.f;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Cs2CompositionPlayerResponse(id=", this.f972a, ", name=", this.b, ", playerClId=");
        rz4.v(this.c, ", shortName=", this.d, ", country=", sbN);
        sbN.append(this.e);
        sbN.append(", image=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
