package a;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class kls0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f18507a;
    public final List b;
    public final int c;
    public final List d;

    public kls0(int[] iArr, List list, int i, List list2) {
        iArr.getClass();
        list.getClass();
        this.f18507a = iArr;
        this.b = list;
        this.c = i;
        this.d = list2;
        if (iArr.length == 0) {
            jf4.o("originalPageOffsets cannot be empty when constructing TransformablePage");
            throw null;
        }
        if (list2 == null || list2.size() == list.size()) {
            return;
        }
        list2.getClass();
        throw new IllegalArgumentException(("If originalIndices (size = " + list2.size() + ") is provided, it must be same length as data (size = " + list.size() + ')').toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kls0.class != obj.getClass()) {
            return false;
        }
        kls0 kls0Var = (kls0) obj;
        return Arrays.equals(this.f18507a, kls0Var.f18507a) && Intrinsics.d(this.b, kls0Var.b) && this.c == kls0Var.c && Intrinsics.d(this.d, kls0Var.d);
    }

    public final int hashCode() {
        int iA = (dw9.a(Arrays.hashCode(this.f18507a) * 31, 31, this.b) + this.c) * 31;
        List list = this.d;
        return iA + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "TransformablePage(originalPageOffsets=" + Arrays.toString(this.f18507a) + ", data=" + this.b + ", hintOriginalPageOffset=" + this.c + ", hintOriginalIndices=" + this.d + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kls0(int i, List list) {
        this(new int[]{i}, list, i, null);
        list.getClass();
    }
}
