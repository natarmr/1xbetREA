package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zxm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45166a;
    public final String b;
    public final String c;
    public final String d;

    public zxm(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.f45166a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zxm)) {
            return false;
        }
        zxm zxmVar = (zxm) obj;
        return Intrinsics.d(this.f45166a, zxmVar.f45166a) && Intrinsics.d(this.b, zxmVar.b) && this.c.equals(zxmVar.c) && this.d.equals(zxmVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f45166a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("V1(teamName=", this.f45166a, ", infoLabel=", this.b, ", seedingLeft="), this.c, ", seedingRight=", this.d, Separators.RPAREN);
    }
}
