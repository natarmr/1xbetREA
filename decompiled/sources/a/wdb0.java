package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wdb0 implements zdb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38966a;
    public final int b;
    public final String c;

    public wdb0(String str, int i, long j) {
        this.f38966a = j;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wdb0)) {
            return false;
        }
        wdb0 wdb0Var = (wdb0) obj;
        return this.f38966a == wdb0Var.f38966a && this.b == wdb0Var.b && Intrinsics.d(this.c, wdb0Var.c);
    }

    public final int hashCode() {
        int iA = twn.a(this.b, Long.hashCode(this.f38966a) * 31, 31);
        String str = this.c;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return rw2.o(brm0.q(this.b, this.f38966a, "OnWebGamesCollectionItemClick(itemId=", ", categoryId="), ", loadedPictureUrl=", this.c, Separators.RPAREN);
    }
}
