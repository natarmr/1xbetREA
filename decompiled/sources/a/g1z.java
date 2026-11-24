package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g1z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f10537a;
    public final imo b;

    public g1z(a4x a4xVar, imo imoVar) {
        a4xVar.getClass();
        this.f10537a = a4xVar;
        this.b = imoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1z)) {
            return false;
        }
        g1z g1zVar = (g1z) obj;
        return Intrinsics.d(this.f10537a, g1zVar.f10537a) && this.b.equals(g1zVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10537a.hashCode() * 31);
    }

    public final String toString() {
        return "LastGamesUiModel(lastGames=" + this.f10537a + ", btnUiModel=" + this.b + Separators.RPAREN;
    }
}
