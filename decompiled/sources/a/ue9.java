package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ue9 implements xe9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35513a;

    public ue9(String str) {
        str.getClass();
        this.f35513a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ue9) && Intrinsics.d(this.f35513a, ((ue9) obj).f35513a);
    }

    public final int hashCode() {
        return this.f35513a.hashCode();
    }

    public final String toString() {
        return kng0.l("Label(labelText=", this.f35513a, Separators.RPAREN);
    }
}
