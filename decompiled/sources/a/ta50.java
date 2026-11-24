package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ta50 implements wa50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wkm f33599a;

    public ta50(wkm wkmVar) {
        wkmVar.getClass();
        this.f33599a = wkmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ta50) && Intrinsics.d(this.f33599a, ((ta50) obj).f33599a);
    }

    public final int hashCode() {
        return this.f33599a.hashCode();
    }

    public final String toString() {
        return "SingleIcon(iconModel=" + this.f33599a + Separators.RPAREN;
    }
}
