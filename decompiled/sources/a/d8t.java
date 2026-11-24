package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d8t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5667a;
    public final s9t b;

    public d8t(String str, s9t s9tVar) {
        str.getClass();
        s9tVar.getClass();
        this.f5667a = str;
        this.b = s9tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8t)) {
            return false;
        }
        d8t d8tVar = (d8t) obj;
        return Intrinsics.d(this.f5667a, d8tVar.f5667a) && Intrinsics.d(this.b, d8tVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5667a.hashCode() * 31);
    }

    public final String toString() {
        return "GamesManiaGameModel(bonusGameName=" + this.f5667a + ", gamesManiaPlayModel=" + this.b + Separators.RPAREN;
    }
}
