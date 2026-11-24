package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class uyo implements xyo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36500a;
    public final sek0 b;

    public uyo(sek0 sek0Var, String str) {
        this.f36500a = str;
        this.b = sek0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uyo)) {
            return false;
        }
        uyo uyoVar = (uyo) obj;
        return this.f36500a.equals(uyoVar.f36500a) && this.b.equals(uyoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f36500a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowMessage(message=" + this.f36500a + ", snackbarType=" + this.b + Separators.RPAREN;
    }
}
