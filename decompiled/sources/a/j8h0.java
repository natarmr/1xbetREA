package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j8h0 implements h9h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f16084a;

    public j8h0(List list) {
        list.getClass();
        this.f16084a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j8h0) && Intrinsics.d(this.f16084a, ((j8h0) obj).f16084a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f16084a.hashCode() * 31);
    }

    public final String toString() {
        return twn.r(this.f16084a, "EmptySearch(categories=", ", allClickAlwaysEnable=true)");
    }
}
