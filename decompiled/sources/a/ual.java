package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ual implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35334a;
    public final z4l b;

    public ual(String str, z4l z4lVar) {
        z4lVar.getClass();
        this.f35334a = str;
        this.b = z4lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ual)) {
            return false;
        }
        ual ualVar = (ual) obj;
        return this.f35334a.equals(ualVar.f35334a) && Intrinsics.d(this.b, ualVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f35334a.hashCode() * 31);
    }

    public final String toString() {
        return "DotaTotalValueTeamUiModel(teamImage=" + this.f35334a + ", hero=" + this.b + Separators.RPAREN;
    }
}
