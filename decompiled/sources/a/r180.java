package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class r180 implements u180 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29666a;

    public r180(String str) {
        this.f29666a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r180) && this.f29666a.equals(((r180) obj).f29666a);
    }

    public final int hashCode() {
        return this.f29666a.hashCode();
    }

    public final String toString() {
        return kng0.l("OneOpponent(opponentTitle=", this.f29666a, Separators.RPAREN);
    }
}
