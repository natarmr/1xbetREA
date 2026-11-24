package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class obp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24993a;
    public final Object b;

    public obp0(Object obj, Object obj2) {
        this.f24993a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof obp0)) {
            return false;
        }
        obp0 obp0Var = (obp0) obj;
        Object obj2 = obp0Var.f24993a;
        e0g0 e0g0Var = j0g0.b;
        return Intrinsics.d(this.f24993a, obj2) && Intrinsics.d(this.b, obp0Var.b);
    }

    public final int hashCode() {
        return j0g0.b(this.b) + (j0g0.b(this.f24993a) * 31);
    }

    public final String toString() {
        return b1j.k("TeamDetailsTeamScenarioModel(playerModels=", j0g0.d(this.f24993a), ", popularHeroes=", j0g0.d(this.b), Separators.RPAREN);
    }
}
