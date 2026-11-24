package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class by30 implements fy30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3400a;

    public by30(String str) {
        str.getClass();
        this.f3400a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof by30) && Intrinsics.d(this.f3400a, ((by30) obj).f3400a);
    }

    public final int hashCode() {
        return this.f3400a.hashCode();
    }

    public final String toString() {
        return kng0.l("ButtonLabel(buttonTitle=", this.f3400a, Separators.RPAREN);
    }
}
