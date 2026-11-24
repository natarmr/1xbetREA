package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class z1d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43611a;
    public final String b;
    public final String c;
    public final ohk d;
    public final int e;

    public z1d(String str, String str2, String str3, ohk ohkVar, int i) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        ohkVar.getClass();
        this.f43611a = str;
        this.b = str2;
        this.c = str3;
        this.d = ohkVar;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1d)) {
            return false;
        }
        z1d z1dVar = (z1d) obj;
        return Intrinsics.d(this.f43611a, z1dVar.f43611a) && Intrinsics.d(this.b, z1dVar.b) && Intrinsics.d(this.c, z1dVar.c) && this.d == z1dVar.d && this.e == z1dVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ((this.d.hashCode() + ua80.b(ua80.b(this.f43611a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CollapsingHeaderBackgroundUiModel(url=", this.f43611a, ", leftPlayerUrl=", this.b, ", rightPlayerUrl=");
        sbN.append(this.c);
        sbN.append(", deviceSize=");
        sbN.append(this.d);
        sbN.append(", placeholder=");
        return rz4.j(this.e, Separators.RPAREN, sbN);
    }
}
