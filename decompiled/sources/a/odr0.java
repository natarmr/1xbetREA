package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class odr0 extends pdr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f25090a;

    public odr0(Object obj) {
        obj.getClass();
        this.f25090a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof odr0) && Intrinsics.d(this.f25090a, ((odr0) obj).f25090a);
    }

    public final int hashCode() {
        return this.f25090a.hashCode();
    }

    public final String toString() {
        return f140.k(this.f25090a, "Success(data=", Separators.RPAREN);
    }
}
