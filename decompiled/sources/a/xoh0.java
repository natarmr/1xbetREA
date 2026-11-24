package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xoh0 implements zoh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41220a;

    public xoh0(String str) {
        str.getClass();
        this.f41220a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xoh0) && Intrinsics.d(this.f41220a, ((xoh0) obj).f41220a);
    }

    public final int hashCode() {
        return this.f41220a.hashCode();
    }

    public final String toString() {
        return kng0.l("PromotionSuccessDialog(message=", this.f41220a, Separators.RPAREN);
    }
}
