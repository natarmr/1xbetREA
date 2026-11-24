package a;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class qm8 implements chi0 {
    public static final pm8 Companion = new pm8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean[] f28970a;

    public /* synthetic */ qm8(int i, boolean[] zArr) {
        if (1 == (i & 1)) {
            this.f28970a = zArr;
        } else {
            m2x.I(i, 1, om8.f25490a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qm8) && Intrinsics.d(this.f28970a, ((qm8) obj).f28970a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f28970a);
    }

    public final String toString() {
        return "BooleanArrayValue(value=" + Arrays.toString(this.f28970a) + ')';
    }

    public qm8(boolean[] zArr) {
        this.f28970a = zArr;
    }
}
