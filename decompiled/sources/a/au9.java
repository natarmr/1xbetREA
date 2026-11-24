package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class au9 implements du9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1467a;

    public au9(String str) {
        str.getClass();
        this.f1467a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof au9) && Intrinsics.d(this.f1467a, ((au9) obj).f1467a);
    }

    public final int hashCode() {
        return this.f1467a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowError(message=", this.f1467a, Separators.RPAREN);
    }
}
