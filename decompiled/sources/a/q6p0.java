package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q6p0 implements s6p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28211a;

    public q6p0(String str) {
        str.getClass();
        this.f28211a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q6p0) && Intrinsics.d(this.f28211a, ((q6p0) obj).f28211a);
    }

    @Override // a.s6p0
    public final Object getKey() {
        return q6p0.class;
    }

    public final int hashCode() {
        return this.f28211a.hashCode();
    }

    public final String toString() {
        return kng0.l("FilterCardDefaultUiModel(text=", this.f28211a, Separators.RPAREN);
    }
}
