package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d150 implements r150 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5294a;

    public d150(String str) {
        str.getClass();
        this.f5294a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d150) && Intrinsics.d(this.f5294a, ((d150) obj).f5294a);
    }

    public final int hashCode() {
        return this.f5294a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnClickDailyTaskWidget(key=", this.f5294a, Separators.RPAREN);
    }
}
