package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class ovb implements chi0 {
    public static final nvb Companion = new nvb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25916a;

    public /* synthetic */ ovb(int i, String str) {
        if (1 == (i & 1)) {
            this.f25916a = str;
        } else {
            m2x.I(i, 1, mvb.f22449a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ovb) && Intrinsics.d(this.f25916a, ((ovb) obj).f25916a);
    }

    public final int hashCode() {
        return this.f25916a.hashCode();
    }

    public final String toString() {
        return axq.m(new StringBuilder("CharSequenceValue(value="), this.f25916a, ')');
    }

    public ovb(String str) {
        str.getClass();
        this.f25916a = str;
    }
}
