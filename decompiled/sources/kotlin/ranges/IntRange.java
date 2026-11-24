package kotlin.ranges;

import a.lkx;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/a;", "", "", "e", "a/lkx", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class IntRange extends a {
    public static final lkx e = new lkx(null);
    public static final IntRange f = new IntRange(1, 0, 1);

    public final boolean b(int i) {
        return this.f46068a <= i && i <= this.b;
    }

    @Override // kotlin.ranges.a
    public final boolean equals(Object obj) {
        if (!(obj instanceof IntRange)) {
            return false;
        }
        if (isEmpty() && ((IntRange) obj).isEmpty()) {
            return true;
        }
        IntRange intRange = (IntRange) obj;
        return this.f46068a == intRange.f46068a && this.b == intRange.b;
    }

    @Override // kotlin.ranges.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f46068a * 31) + this.b;
    }

    @Override // kotlin.ranges.a
    public final boolean isEmpty() {
        return this.f46068a > this.b;
    }

    @Override // kotlin.ranges.a
    public final String toString() {
        return this.f46068a + ".." + this.b;
    }
}
