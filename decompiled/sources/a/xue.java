package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class xue implements zue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41506a;

    public xue(String str) {
        str.getClass();
        this.f41506a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xue) && Intrinsics.d(this.f41506a, ((xue) obj).f41506a);
    }

    public final int hashCode() {
        return this.f41506a.hashCode();
    }

    public final String toString() {
        return kng0.l("ExpressBoostBonusConfiguredModel(coef=", this.f41506a, Separators.RPAREN);
    }
}
