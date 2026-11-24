package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cyr implements eyr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5191a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;

    public cyr(int i, long j, String str, String str2, boolean z) {
        str.getClass();
        this.f5191a = j;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyr)) {
            return false;
        }
        cyr cyrVar = (cyr) obj;
        return this.f5191a == cyrVar.f5191a && Intrinsics.d(this.b, cyrVar.b) && this.c.equals(cyrVar.c) && this.d == cyrVar.d && this.e == cyrVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + twn.a(this.d, ua80.b(ua80.b(Long.hashCode(this.f5191a) * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f5191a, "TeamSecond(id=", ", title=", this.b);
        axq.s(this.d, ", icon=", this.c, ", placeholderRes=", sbO);
        return f140.n(sbO, ", iconVisible=", this.e, Separators.RPAREN);
    }
}
