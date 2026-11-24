package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xmw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41148a;
    public final String b;
    public final String c;
    public final String d;

    public xmw(String str, String str2, String str3, String str4) {
        str.getClass();
        this.f41148a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmw)) {
            return false;
        }
        xmw xmwVar = (xmw) obj;
        return Intrinsics.d(this.f41148a, xmwVar.f41148a) && this.b.equals(xmwVar.b) && this.c.equals(xmwVar.c) && this.d.equals(xmwVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f41148a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("HorseMenuHeaderUiModel(title=", this.f41148a, ", gender=", this.b, ", trainerName="), this.c, ", damAndSire=", this.d, Separators.RPAREN);
    }
}
