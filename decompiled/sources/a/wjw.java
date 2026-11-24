package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wjw implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f39283a;

    public wjw(a4x a4xVar) {
        a4xVar.getClass();
        this.f39283a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wjw) && Intrinsics.d(this.f39283a, ((wjw) obj).f39283a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "HomeSpecialEventRecyclerUiModel";
    }

    public final int hashCode() {
        return this.f39283a.hashCode() + 893453098;
    }

    public final String toString() {
        return h97.i(this.f39283a, "HomeSpecialEventCollectionUiModel(key=HomeSpecialEventRecyclerUiModel, specialEvents=", Separators.RPAREN);
    }
}
