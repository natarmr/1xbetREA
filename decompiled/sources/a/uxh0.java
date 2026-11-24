package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class uxh0 implements vxh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36442a;

    public uxh0(String str) {
        str.getClass();
        this.f36442a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uxh0) && Intrinsics.d(this.f36442a, ((uxh0) obj).f36442a);
    }

    public final int hashCode() {
        return this.f36442a.hashCode();
    }

    public final String toString() {
        return kng0.l("TimerText(text=", this.f36442a, Separators.RPAREN);
    }
}
