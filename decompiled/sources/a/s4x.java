package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s4x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31629a;
    public final hzj b;
    public final b0a c;

    public s4x(int i, hzj hzjVar, b0a b0aVar) {
        hzjVar.getClass();
        this.f31629a = i;
        this.b = hzjVar;
        this.c = b0aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s4x) {
            s4x s4xVar = (s4x) obj;
            return this.f31629a == s4xVar.f31629a && Intrinsics.d(this.b, s4xVar.b) && this.c == s4xVar.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.f31629a) * 31)) * 31);
    }

    public final String toString() {
        return "ConfiguredOutput(streamId=" + ((Object) mrm0.a(this.f31629a)) + ", deferrableSurface=" + this.b + ", graph=" + this.c + ')';
    }
}
