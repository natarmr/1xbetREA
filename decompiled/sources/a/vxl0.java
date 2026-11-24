package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vxl0 implements xxl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38205a;

    public vxl0(String str) {
        str.getClass();
        this.f38205a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vxl0) && Intrinsics.d(this.f38205a, ((vxl0) obj).f38205a);
    }

    @Override // a.xxl0
    public final String getTitle() {
        return this.f38205a;
    }

    public final int hashCode() {
        return this.f38205a.hashCode();
    }

    public final String toString() {
        return kng0.l("Loading(title=", this.f38205a, Separators.RPAREN);
    }
}
