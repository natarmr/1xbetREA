package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class boa implements doa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f2924a;

    public boa(a4x a4xVar) {
        a4xVar.getClass();
        this.f2924a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof boa) && Intrinsics.d(this.f2924a, ((boa) obj).f2924a);
    }

    public final int hashCode() {
        return this.f2924a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f2924a, "Content(uiModels=", Separators.RPAREN);
    }
}
