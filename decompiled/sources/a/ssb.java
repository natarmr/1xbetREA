package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ssb implements vsb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mcy f32717a;

    public ssb(mcy mcyVar) {
        mcyVar.getClass();
        this.f32717a = mcyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ssb) && Intrinsics.d(this.f32717a, ((ssb) obj).f32717a);
    }

    public final int hashCode() {
        return this.f32717a.hashCode();
    }

    public final String toString() {
        return "OnPossibleValueChanged(value=" + this.f32717a + Separators.RPAREN;
    }
}
