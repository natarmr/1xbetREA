package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class t740 implements v740 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i740 f33449a;

    public t740(i740 i740Var) {
        i740Var.getClass();
        this.f33449a = i740Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t740) && Intrinsics.d(this.f33449a, ((t740) obj).f33449a);
    }

    public final int hashCode() {
        return this.f33449a.hashCode();
    }

    public final String toString() {
        return "OnMessageClick(message=" + this.f33449a + Separators.RPAREN;
    }
}
