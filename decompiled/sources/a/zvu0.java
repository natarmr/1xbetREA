package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class zvu0 implements ewu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45074a;

    public zvu0(String str) {
        str.getClass();
        this.f45074a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zvu0) && Intrinsics.d(this.f45074a, ((zvu0) obj).f45074a);
    }

    public final int hashCode() {
        return this.f45074a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnAmountChanged(value=", this.f45074a, Separators.RPAREN);
    }
}
