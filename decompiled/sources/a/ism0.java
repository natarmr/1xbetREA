package a;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class ism0 implements chi0 {
    public static final hsm0 Companion = new hsm0();
    public static final a8z[] b = {maz.a(wez.f39042a, new x9m0(13))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f15312a;

    public /* synthetic */ ism0(int i, String[] strArr) {
        if (1 == (i & 1)) {
            this.f15312a = strArr;
        } else {
            m2x.I(i, 1, gsm0.f11838a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ism0) && Intrinsics.d(this.f15312a, ((ism0) obj).f15312a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f15312a);
    }

    public final String toString() {
        return axq.m(new StringBuilder("StringArrayValue(value="), Arrays.toString(this.f15312a), ')');
    }

    public ism0(String[] strArr) {
        this.f15312a = strArr;
    }
}
