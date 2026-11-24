package a;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class fvb implements chi0 {
    public static final evb Companion = new evb();
    public static final a8z[] b = {maz.a(wez.f39042a, new e0b(27))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f10206a;

    public /* synthetic */ fvb(int i, String[] strArr) {
        if (1 == (i & 1)) {
            this.f10206a = strArr;
        } else {
            m2x.I(i, 1, dvb.f6734a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fvb) && Intrinsics.d(this.f10206a, ((fvb) obj).f10206a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10206a);
    }

    public final String toString() {
        return axq.m(new StringBuilder("CharSequenceArrayValue(value="), Arrays.toString(this.f10206a), ')');
    }
}
