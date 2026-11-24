package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class zmw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44645a;
    public final jnw b;

    public zmw(String str, jnw jnwVar) {
        this.f44645a = str;
        this.b = jnwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zmw)) {
            return false;
        }
        zmw zmwVar = (zmw) obj;
        return this.f44645a.equals(zmwVar.f44645a) && this.b.equals(zmwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f44645a.hashCode() * 31);
    }

    public final String toString() {
        return "HorseMenuItemUiModel(title=" + this.f44645a + ", horseMenuType=" + this.b + Separators.RPAREN;
    }
}
