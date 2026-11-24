package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class su50 implements uu50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f32806a;

    public su50(mdm mdmVar) {
        mdmVar.getClass();
        this.f32806a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof su50) && Intrinsics.d(this.f32806a, ((su50) obj).f32806a);
    }

    public final int hashCode() {
        return this.f32806a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorConfig=", this.f32806a, Separators.RPAREN);
    }
}
