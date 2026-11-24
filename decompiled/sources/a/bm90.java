package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bm90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2826a;

    public /* synthetic */ bm90(String str) {
        this.f2826a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bm90) {
            return Intrinsics.d(this.f2826a, ((bm90) obj).f2826a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2826a.hashCode();
    }

    public final String toString() {
        return kng0.l("Decimal(value=", this.f2826a, Separators.RPAREN);
    }
}
