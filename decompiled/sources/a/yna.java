package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class yna implements aoa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f42930a;

    public yna(a4x a4xVar) {
        a4xVar.getClass();
        this.f42930a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yna) && Intrinsics.d(this.f42930a, ((yna) obj).f42930a);
    }

    public final int hashCode() {
        return this.f42930a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f42930a, "Content(uiModels=", Separators.RPAREN);
    }
}
