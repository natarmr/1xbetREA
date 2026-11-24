package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ah7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f859a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public ah7(String str, String str2, String str3, String str4, long j) {
        str3.getClass();
        this.f859a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah7)) {
            return false;
        }
        ah7 ah7Var = (ah7) obj;
        return this.f859a == ah7Var.f859a && this.b.equals(ah7Var.b) && this.c.equals(ah7Var.c) && Intrinsics.d(this.d, ah7Var.d) && this.e.equals(ah7Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(Long.hashCode(this.f859a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f859a, "BetOnFavoriteEventUiModel(gameId=", ", title=", this.b);
        f140.v(sbO, ", matchDescription=", this.c, ", marketName=", this.d);
        return rw2.o(sbO, ", coef=", this.e, Separators.RPAREN);
    }
}
