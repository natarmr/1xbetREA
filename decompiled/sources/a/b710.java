package a;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class b710 implements chi0 {
    public static final a710 Companion = new a710();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f2082a;

    public /* synthetic */ b710(int i, long[] jArr) {
        if (1 == (i & 1)) {
            this.f2082a = jArr;
        } else {
            m2x.I(i, 1, z610.f43843a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b710) && Intrinsics.d(this.f2082a, ((b710) obj).f2082a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2082a);
    }

    public final String toString() {
        return "LongArrayValue(value=" + Arrays.toString(this.f2082a) + ')';
    }

    public b710(long[] jArr) {
        this.f2082a = jArr;
    }
}
