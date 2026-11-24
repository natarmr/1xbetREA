package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class lf1 implements nf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19930a;

    public lf1(String str) {
        str.getClass();
        this.f19930a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lf1) && Intrinsics.d(this.f19930a, ((lf1) obj).f19930a);
    }

    public final int hashCode() {
        return this.f19930a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowDailyTaskError(error=", this.f19930a, Separators.RPAREN);
    }
}
