package a;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class nub implements chi0 {
    public static final mub Companion = new mub();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char[] f24141a;

    public /* synthetic */ nub(int i, char[] cArr) {
        if (1 == (i & 1)) {
            this.f24141a = cArr;
        } else {
            m2x.I(i, 1, lub.f20666a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nub) && Intrinsics.d(this.f24141a, ((nub) obj).f24141a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f24141a);
    }

    public final String toString() {
        return "CharArrayValue(value=" + Arrays.toString(this.f24141a) + ')';
    }

    public nub(char[] cArr) {
        this.f24141a = cArr;
    }
}
