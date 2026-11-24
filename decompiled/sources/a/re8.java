package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class re8 implements bf8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30322a;
    public final String b;
    public final String c;

    public re8(long j, String str, String str2) {
        str.getClass();
        this.f30322a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re8)) {
            return false;
        }
        re8 re8Var = (re8) obj;
        return this.f30322a == re8Var.f30322a && Intrinsics.d(this.b, re8Var.b) && this.c.equals(re8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f30322a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.o(axq.o(this.f30322a, "OnGameClickedFromBundle(gameId=", ", gameName=", this.b), ", screenName=", this.c, Separators.RPAREN);
    }
}
