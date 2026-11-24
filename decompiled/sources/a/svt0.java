package a;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class svt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32887a;
    public final String b;
    public final String c;
    public final LinkedHashMap d;
    public final byte e;

    public svt0(fd40 fd40Var) {
        if (StringsKt.W(fd40Var.b)) {
            jf4.o("method is null or empty");
            throw null;
        }
        if (StringsKt.W(fd40Var.c)) {
            jf4.o("version is null or empty");
            throw null;
        }
        this.f32887a = fd40Var.f9341a;
        this.b = fd40Var.b;
        this.c = fd40Var.c;
        this.d = (LinkedHashMap) fd40Var.e;
        this.e = fd40Var.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!svt0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        svt0 svt0Var = (svt0) obj;
        return Intrinsics.d(this.b, svt0Var.b) && Intrinsics.d(this.d, svt0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "VKMethodCall(method='" + this.b + "', args=" + this.d + ')';
    }
}
