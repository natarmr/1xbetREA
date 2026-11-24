package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class e0h0 implements chi0 {
    public static final d0h0 Companion = new d0h0();
    public static final a8z[] b = {maz.a(wez.f39042a, new yxg0(4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6989a;

    public /* synthetic */ e0h0(int i, List list) {
        if (1 == (i & 1)) {
            this.f6989a = list;
        } else {
            m2x.I(i, 1, c0h0.f3524a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0h0) && Intrinsics.d(this.f6989a, ((e0h0) obj).f6989a);
    }

    public final int hashCode() {
        return this.f6989a.hashCode();
    }

    public final String toString() {
        return "SavedStateListValue(value=" + this.f6989a + ')';
    }

    public e0h0(List list) {
        this.f6989a = list;
    }
}
