package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r7k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f29980a;

    public r7k0(a4x a4xVar) {
        a4xVar.getClass();
        this.f29980a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r7k0) && Intrinsics.d(this.f29980a, ((r7k0) obj).f29980a);
    }

    public final int hashCode() {
        return this.f29980a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f29980a, "SizePresetsUiModel(buttons=", Separators.RPAREN);
    }
}
