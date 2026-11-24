package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class npm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kh3 f23921a;
    public final List b;

    public npm0(kh3 kh3Var, List list) {
        this.f23921a = kh3Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof npm0)) {
            return false;
        }
        npm0 npm0Var = (npm0) obj;
        return this.f23921a == npm0Var.f23921a && this.b.equals(npm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f23921a.hashCode() * 31);
    }

    public final String toString() {
        return "StepStateModel(appStartStepKey=" + this.f23921a + ", requests=" + this.b + Separators.RPAREN;
    }
}
