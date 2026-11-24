package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class itm0 implements chi0 {
    public static final gtm0 Companion = new gtm0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15361a;

    public /* synthetic */ itm0(int i, String str) {
        if (1 == (i & 1)) {
            this.f15361a = str;
        } else {
            m2x.I(i, 1, ftm0.f10120a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof itm0) && Intrinsics.d(this.f15361a, ((itm0) obj).f15361a);
    }

    public final int hashCode() {
        return this.f15361a.hashCode();
    }

    public final String toString() {
        return axq.m(new StringBuilder("StringValue(value="), this.f15361a, ')');
    }

    public itm0(String str) {
        this.f15361a = str;
    }
}
