package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.sportgame.classic.impl.presentation.legacy.models.CardIdentity;

/* JADX INFO: loaded from: classes5.dex */
public final class tnd extends knd {
    public final String b;
    public final CardIdentity c;

    public tnd(String str, CardIdentity cardIdentity) {
        str.getClass();
        this.b = str;
        this.c = cardIdentity;
    }

    @Override // a.knd
    public final CardIdentity a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tnd)) {
            return false;
        }
        tnd tndVar = (tnd) obj;
        return Intrinsics.d(this.b, tndVar.b) && this.c.equals(tndVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "CompressedCardErrorUiModel(errorMessage=" + this.b + ", cardIdentity=" + this.c + Separators.RPAREN;
    }
}
