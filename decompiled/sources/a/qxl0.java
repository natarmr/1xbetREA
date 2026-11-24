package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qxl0 implements rxl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f29490a;

    public qxl0(i4 i4Var) {
        i4Var.getClass();
        this.f29490a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qxl0) && Intrinsics.d(this.f29490a, ((qxl0) obj).f29490a);
    }

    @Override // a.hvk0
    public final Object getKey() {
        return qxl0.class;
    }

    public final int hashCode() {
        return this.f29490a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f29490a, "StadiumsDefaultUiModel(stadiums=", Separators.RPAREN);
    }
}
