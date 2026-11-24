package a;

import android.os.Bundle;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class nzg0 implements chi0 {
    public static final mzg0 Companion = new mzg0();
    public static final a8z[] b = {maz.a(wez.f39042a, new yxg0(3))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle[] f24371a;

    public /* synthetic */ nzg0(int i, Bundle[] bundleArr) {
        if (1 == (i & 1)) {
            this.f24371a = bundleArr;
        } else {
            m2x.I(i, 1, lzg0.f20904a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nzg0) && Intrinsics.d(this.f24371a, ((nzg0) obj).f24371a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f24371a);
    }

    public final String toString() {
        return axq.m(new StringBuilder("SavedStateArrayValue(value="), Arrays.toString(this.f24371a), ')');
    }
}
