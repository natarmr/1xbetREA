package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qyy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nyy f29556a;
    public final a4x b;

    public qyy(nyy nyyVar, a4x a4xVar) {
        a4xVar.getClass();
        this.f29556a = nyyVar;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyy)) {
            return false;
        }
        qyy qyyVar = (qyy) obj;
        return Intrinsics.d(this.f29556a, qyyVar.f29556a) && Intrinsics.d(this.b, qyyVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f29556a.hashCode() * 31);
    }

    public final String toString() {
        return "LastFightsUiState(screenState=" + this.f29556a + ", uiItems=" + this.b + Separators.RPAREN;
    }

    public qyy(myy myyVar) {
        this(myyVar, lak0.c);
    }
}
