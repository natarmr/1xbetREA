package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i0h implements hvk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f13948a;

    public i0h(a4x a4xVar) {
        a4xVar.getClass();
        this.f13948a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0h) && Intrinsics.d(this.f13948a, ((i0h) obj).f13948a);
    }

    @Override // a.hvk0
    public final Object getKey() {
        return i0h.class;
    }

    public final int hashCode() {
        return this.f13948a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f13948a, "CyberGroupTabElementsUiModel(cyberGroupTabElements=", Separators.RPAREN);
    }
}
