package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class mt3 implements vt3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22351a;

    public mt3(String str) {
        str.getClass();
        this.f22351a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mt3) && Intrinsics.d(this.f22351a, ((mt3) obj).f22351a);
    }

    public final int hashCode() {
        return this.f22351a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowNeedIdentification(errorMessage=", this.f22351a, Separators.RPAREN);
    }
}
