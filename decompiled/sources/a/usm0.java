package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class usm0 implements chi0 {
    public static final tsm0 Companion = new tsm0();
    public static final a8z[] b = {maz.a(wez.f39042a, new x9m0(14))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f36219a;

    public /* synthetic */ usm0(int i, List list) {
        if (1 == (i & 1)) {
            this.f36219a = list;
        } else {
            m2x.I(i, 1, ssm0.f32732a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof usm0) && Intrinsics.d(this.f36219a, ((usm0) obj).f36219a);
    }

    public final int hashCode() {
        return this.f36219a.hashCode();
    }

    public final String toString() {
        return "StringListValue(value=" + this.f36219a + ')';
    }

    public usm0(List list) {
        list.getClass();
        this.f36219a = list;
    }
}
