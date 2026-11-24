package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ver0 implements wer0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f37298a;

    public ver0(mdm mdmVar) {
        mdmVar.getClass();
        this.f37298a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ver0) && Intrinsics.d(this.f37298a, ((ver0) obj).f37298a);
    }

    public final int hashCode() {
        return this.f37298a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f37298a, Separators.RPAREN);
    }
}
