package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class afe implements gfe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f774a;

    public afe(Object obj) {
        obj.getClass();
        this.f774a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof afe) && Intrinsics.d(this.f774a, ((afe) obj).f774a);
    }

    public final int hashCode() {
        return this.f774a.hashCode();
    }

    public final String toString() {
        return f140.k(this.f774a, "Loaded(content=", Separators.RPAREN);
    }
}
