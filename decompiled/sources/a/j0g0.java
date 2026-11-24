package a;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class j0g0 implements Serializable {
    public static final e0g0 b = new e0g0(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15681a;

    public /* synthetic */ j0g0(Object obj) {
        this.f15681a = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof g0g0) {
            return ((g0g0) obj).f10458a;
        }
        return null;
    }

    public static int b(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static String d(Object obj) {
        if (obj instanceof g0g0) {
            return ((g0g0) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j0g0) {
            return Intrinsics.d(this.f15681a, ((j0g0) obj).f15681a);
        }
        return false;
    }

    public final int hashCode() {
        return b(this.f15681a);
    }

    public final String toString() {
        return d(this.f15681a);
    }
}
