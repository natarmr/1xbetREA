package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class sis0 extends uis0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f32277a;

    public sis0(a4x a4xVar) {
        a4xVar.getClass();
        this.f32277a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sis0) && Intrinsics.d(this.f32277a, ((sis0) obj).f32277a);
    }

    public final int hashCode() {
        return this.f32277a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f32277a, "Content(items=", Separators.RPAREN);
    }
}
