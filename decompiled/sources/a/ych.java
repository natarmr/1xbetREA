package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ych implements cdh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42384a;

    public final boolean equals(Object obj) {
        if (obj instanceof ych) {
            return Intrinsics.d(this.f42384a, ((ych) obj).f42384a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42384a.hashCode();
    }

    public final String toString() {
        return kng0.l("MapName(value=", this.f42384a, Separators.RPAREN);
    }
}
