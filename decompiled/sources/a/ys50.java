package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ys50 implements at50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f43154a;

    public ys50(mdm mdmVar) {
        mdmVar.getClass();
        this.f43154a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ys50) && Intrinsics.d(this.f43154a, ((ys50) obj).f43154a);
    }

    public final int hashCode() {
        return this.f43154a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f43154a, Separators.RPAREN);
    }
}
