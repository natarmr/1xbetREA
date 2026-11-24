package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cso {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ldx f4900a;
    public final ndf b;

    public cso(ldx ldxVar, ndf ndfVar) {
        ldxVar.getClass();
        this.f4900a = ldxVar;
        this.b = ndfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cso)) {
            return false;
        }
        cso csoVar = (cso) obj;
        return Intrinsics.d(this.f4900a, csoVar.f4900a) && this.b.equals(csoVar.b);
    }

    public final int hashCode() {
        return this.b.f23336a.hashCode() + (this.f4900a.hashCode() * 31);
    }

    public final String toString() {
        return "ExtendedScoreModel(innsStats=" + this.f4900a + ", cricketScore=" + this.b + Separators.RPAREN;
    }
}
