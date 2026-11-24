package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q38 implements u38 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28038a;

    public q38(String str) {
        str.getClass();
        this.f28038a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q38) && Intrinsics.d(this.f28038a, ((q38) obj).f28038a);
    }

    public final int hashCode() {
        return this.f28038a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowError(message=", this.f28038a, Separators.RPAREN);
    }
}
