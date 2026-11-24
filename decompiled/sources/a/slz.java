package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class slz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32422a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;

    public slz(int i, int i2, String str, String str2, boolean z) {
        str2.getClass();
        this.f32422a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof slz)) {
            return false;
        }
        slz slzVar = (slz) obj;
        return this.f32422a == slzVar.f32422a && this.b.equals(slzVar.b) && Intrinsics.d(this.c, slzVar.c) && this.d == slzVar.d && this.e == slzVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + twn.a(this.d, ua80.b(ua80.b(Integer.hashCode(this.f32422a) * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f32422a, "LigaModel(id=", ", image=", this.b, ", name=");
        twn.w(this.d, this.c, ", cyberType=", ", isDuelChamp=", sbR);
        return rw2.p(sbR, this.e, Separators.RPAREN);
    }
}
