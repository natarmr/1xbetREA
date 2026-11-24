package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qqv implements tqv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29182a;

    public qqv(String str) {
        str.getClass();
        this.f29182a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qqv) && Intrinsics.d(this.f29182a, ((qqv) obj).f29182a);
    }

    public final int hashCode() {
        return this.f29182a.hashCode();
    }

    public final String toString() {
        return kng0.l("Content(title=", this.f29182a, Separators.RPAREN);
    }
}
