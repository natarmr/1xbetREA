package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qbd0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28442a;

    public final boolean equals(Object obj) {
        if (obj instanceof qbd0) {
            return this.f28442a == ((qbd0) obj).f28442a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f28442a);
    }

    public final String toString() {
        return axq.h(this.f28442a, "OneXGamesGame(gameId=", Separators.RPAREN);
    }
}
