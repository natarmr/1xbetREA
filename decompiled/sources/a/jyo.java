package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class jyo {
    public static final iyo Companion = new iyo();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17369a;
    public final String b;
    public final String c;

    public /* synthetic */ jyo(String str, int i, String str2, String str3) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, hyo.f13867a.getDescriptor());
            throw null;
        }
        this.f17369a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyo)) {
            return false;
        }
        jyo jyoVar = (jyo) obj;
        return Intrinsics.d(this.f17369a, jyoVar.f17369a) && Intrinsics.d(this.b, jyoVar.b) && Intrinsics.d(this.c, jyoVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f17369a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("Data(date=", this.f17369a, ", newPassword=", this.b, ", oldPassword="), this.c, Separators.RPAREN);
    }

    public jyo(String str, String str2, String str3) {
        str.getClass();
        this.f17369a = str;
        this.b = str2;
        this.c = str3;
    }
}
