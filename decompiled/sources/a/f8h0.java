package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f8h0 implements h9h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9104a;

    public f8h0(List list) {
        list.getClass();
        this.f9104a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f8h0) && Intrinsics.d(this.f9104a, ((f8h0) obj).f9104a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f9104a.hashCode() * 31);
    }

    public final String toString() {
        return twn.r(this.f9104a, "Default(categories=", ", allClickAlwaysEnable=true)");
    }
}
