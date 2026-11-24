package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class eci0 implements ici0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pk f7568a;

    public eci0(pk pkVar) {
        pkVar.getClass();
        this.f7568a = pkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eci0) && Intrinsics.d(this.f7568a, ((eci0) obj).f7568a);
    }

    public final int hashCode() {
        return this.f7568a.hashCode();
    }

    public final String toString() {
        return "ActivationData(activatePhoneModel=" + this.f7568a + Separators.RPAREN;
    }
}
