package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class kc20 implements xc20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18039a;

    public kc20(String str) {
        str.getClass();
        this.f18039a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kc20) && Intrinsics.d(this.f18039a, ((kc20) obj).f18039a);
    }

    public final int hashCode() {
        return this.f18039a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowMultiBetErrorDialog(errorMessage=", this.f18039a, Separators.RPAREN);
    }
}
