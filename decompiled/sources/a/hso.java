package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class hso {
    public static final fso Companion = new fso();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final odx f13594a;
    public final sdf b;

    public /* synthetic */ hso(int i, odx odxVar, sdf sdfVar) {
        if ((i & 1) == 0) {
            this.f13594a = null;
        } else {
            this.f13594a = odxVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = sdfVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hso)) {
            return false;
        }
        hso hsoVar = (hso) obj;
        return Intrinsics.d(this.f13594a, hsoVar.f13594a) && Intrinsics.d(this.b, hsoVar.b);
    }

    public final int hashCode() {
        odx odxVar = this.f13594a;
        int iHashCode = (odxVar == null ? 0 : odxVar.hashCode()) * 31;
        sdf sdfVar = this.b;
        return iHashCode + (sdfVar != null ? sdfVar.hashCode() : 0);
    }

    public final String toString() {
        return "ExtendedScoreResponse(innsStatsResponse=" + this.f13594a + ", cricketScoreResponse=" + this.b + Separators.RPAREN;
    }
}
