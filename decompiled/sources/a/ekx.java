package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class ekx implements chi0 {
    public static final dkx Companion = new dkx();
    public static final a8z[] b = {maz.a(wez.f39042a, new qgx(4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7973a;

    public /* synthetic */ ekx(int i, List list) {
        if (1 == (i & 1)) {
            this.f7973a = list;
        } else {
            m2x.I(i, 1, ckx.f4530a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ekx) && Intrinsics.d(this.f7973a, ((ekx) obj).f7973a);
    }

    public final int hashCode() {
        return this.f7973a.hashCode();
    }

    public final String toString() {
        return "IntListValue(value=" + this.f7973a + ')';
    }

    public ekx(List list) {
        this.f7973a = list;
    }
}
