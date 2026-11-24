package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class pe7 implements ve7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26837a;

    public pe7(String str) {
        str.getClass();
        this.f26837a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pe7) && Intrinsics.d(this.f26837a, ((pe7) obj).f26837a);
    }

    public final int hashCode() {
        return this.f26837a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnBetPeriodValueChangeIe(newValue=", this.f26837a, Separators.RPAREN);
    }
}
