package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rac0 implements sac0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30128a;

    public rac0(String str) {
        this.f30128a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rac0) && Intrinsics.d(this.f30128a, ((rac0) obj).f30128a);
    }

    public final int hashCode() {
        String str = this.f30128a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("Error(message=", this.f30128a, Separators.RPAREN);
    }
}
