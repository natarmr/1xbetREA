package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qs70 implements ts70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29246a;

    public qs70(String str) {
        str.getClass();
        this.f29246a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qs70) && Intrinsics.d(this.f29246a, ((qs70) obj).f29246a);
    }

    public final int hashCode() {
        return this.f29246a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowError(message=", this.f29246a, Separators.RPAREN);
    }
}
