package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class rwa implements twa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31209a;
    public final String b;
    public final n0x c;

    public rwa(n0x n0xVar, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f31209a = str;
        this.b = str2;
        this.c = n0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rwa)) {
            return false;
        }
        rwa rwaVar = (rwa) obj;
        return Intrinsics.d(this.f31209a, rwaVar.f31209a) && Intrinsics.d(this.b, rwaVar.b) && this.c.equals(rwaVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f31209a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Content(progressDescription=", this.f31209a, ", statusName=", this.b, ", image=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
