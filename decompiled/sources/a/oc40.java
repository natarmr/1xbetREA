package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class oc40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fb40 f25011a;
    public final a4x b;

    public oc40(fb40 fb40Var, a4x a4xVar) {
        a4xVar.getClass();
        this.f25011a = fb40Var;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc40)) {
            return false;
        }
        oc40 oc40Var = (oc40) obj;
        return this.f25011a.equals(oc40Var.f25011a) && Intrinsics.d(this.b, oc40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25011a.hashCode() * 31);
    }

    public final String toString() {
        return "MetaHeroesScreenStateUiModel(contentState=" + this.f25011a + ", itemsList=" + this.b + Separators.RPAREN;
    }
}
