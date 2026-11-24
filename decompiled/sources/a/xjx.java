package a;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class xjx implements chi0 {
    public static final wjx Companion = new wjx();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f41007a;

    public /* synthetic */ xjx(int[] iArr, int i) {
        if (1 == (i & 1)) {
            this.f41007a = iArr;
        } else {
            m2x.I(i, 1, vjx.f37552a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xjx) && Intrinsics.d(this.f41007a, ((xjx) obj).f41007a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f41007a);
    }

    public final String toString() {
        return "IntArrayValue(value=" + Arrays.toString(this.f41007a) + ')';
    }

    public xjx(int[] iArr) {
        this.f41007a = iArr;
    }
}
