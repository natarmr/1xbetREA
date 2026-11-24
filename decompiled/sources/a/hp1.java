package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hp1 implements ip1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13420a;

    public hp1(String str) {
        str.getClass();
        this.f13420a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hp1) && Intrinsics.d(this.f13420a, ((hp1) obj).f13420a);
    }

    public final int hashCode() {
        return this.f13420a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorMessage(text=", this.f13420a, Separators.RPAREN);
    }
}
