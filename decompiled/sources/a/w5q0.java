package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w5q0 implements x5q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38596a;

    public w5q0(String str) {
        str.getClass();
        this.f38596a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w5q0) && Intrinsics.d(this.f38596a, ((w5q0) obj).f38596a);
    }

    public final int hashCode() {
        return this.f38596a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnValueChange(value=", this.f38596a, Separators.RPAREN);
    }
}
