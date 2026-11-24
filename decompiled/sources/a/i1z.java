package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i1z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f14024a;
    public final mmo b;

    public i1z(a4x a4xVar, mmo mmoVar) {
        a4xVar.getClass();
        this.f14024a = a4xVar;
        this.b = mmoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1z)) {
            return false;
        }
        i1z i1zVar = (i1z) obj;
        return Intrinsics.d(this.f14024a, i1zVar.f14024a) && this.b.equals(i1zVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f14024a.hashCode() * 31);
    }

    public final String toString() {
        return "LastGamesUiModel(lastGames=" + this.f14024a + ", btnUiModel=" + this.b + Separators.RPAREN;
    }
}
