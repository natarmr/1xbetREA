package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gjh extends jjh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nsm0 f11395a;
    public final pwr0 b;

    public gjh(nsm0 nsm0Var, pwr0 pwr0Var) {
        nsm0Var.getClass();
        this.f11395a = nsm0Var;
        this.b = pwr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gjh)) {
            return false;
        }
        gjh gjhVar = (gjh) obj;
        return Intrinsics.d(this.f11395a, gjhVar.f11395a) && this.b.equals(gjhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11395a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(stageUiModel=" + this.f11395a + ", tournamentCaption=" + this.b + Separators.RPAREN;
    }
}
