package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class kvb implements chi0 {
    public static final jvb Companion = new jvb();
    public static final a8z[] b = {maz.a(wez.f39042a, new e0b(28))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18950a;

    public /* synthetic */ kvb(int i, List list) {
        if (1 == (i & 1)) {
            this.f18950a = list;
        } else {
            m2x.I(i, 1, ivb.f15437a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kvb) && Intrinsics.d(this.f18950a, ((kvb) obj).f18950a);
    }

    public final int hashCode() {
        return this.f18950a.hashCode();
    }

    public final String toString() {
        return "CharSequenceListValue(value=" + this.f18950a + ')';
    }

    public kvb(ArrayList arrayList) {
        this.f18950a = arrayList;
    }
}
