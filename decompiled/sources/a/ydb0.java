package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ydb0 implements zdb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42426a;
    public final int b;
    public final String c;

    public ydb0(String str, int i, long j) {
        this.f42426a = j;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydb0)) {
            return false;
        }
        ydb0 ydb0Var = (ydb0) obj;
        return this.f42426a == ydb0Var.f42426a && this.b == ydb0Var.b && Intrinsics.d(this.c, ydb0Var.c);
    }

    public final int hashCode() {
        int iA = twn.a(this.b, Long.hashCode(this.f42426a) * 31, 31);
        String str = this.c;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return rw2.o(brm0.q(this.b, this.f42426a, "OnWebGamesTopGamesCollectionItemClick(gameId=", ", categoryId="), ", loadedPictureUrl=", this.c, Separators.RPAREN);
    }
}
