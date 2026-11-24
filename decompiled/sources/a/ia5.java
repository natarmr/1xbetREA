package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ia5 implements c5a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ha5[] f14420a;

    public ia5(ha5[] ha5VarArr) {
        this.f14420a = ha5VarArr;
    }

    public final void a() {
        for (ha5 ha5Var : this.f14420a) {
            nwk nwkVar = ha5Var.f;
            if (nwkVar == null) {
                Intrinsics.h("handle");
                throw null;
            }
            nwkVar.a();
        }
    }

    @Override // a.c5a
    public final void b(Throwable th) {
        a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f14420a + ']';
    }
}
