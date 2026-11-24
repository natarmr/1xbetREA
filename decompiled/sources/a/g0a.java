package a;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class g0a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10449a;

    public /* synthetic */ g0a(String str) {
        this.f10449a = str;
    }

    public static void a(String str) {
        str.getClass();
        if (StringsKt.W(str)) {
            jf4.o("CameraId cannot be null or blank!");
        }
    }

    public static String b(String str) {
        return kng0.k("CameraId-", str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g0a) {
            return Intrinsics.d(this.f10449a, ((g0a) obj).f10449a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10449a.hashCode();
    }

    public final String toString() {
        return b(this.f10449a);
    }
}
