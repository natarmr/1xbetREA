package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class rbj implements tbj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f30189a;

    public rbj(Object obj) {
        this.f30189a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rbj) && Intrinsics.d(this.f30189a, ((rbj) obj).f30189a);
    }

    public final int hashCode() {
        Object obj = this.f30189a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return f140.k(this.f30189a, "WithContentBackground(content=", Separators.RPAREN);
    }
}
