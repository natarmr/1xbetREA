package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class xdz extends androidx.compose.foundation.lazy.layout.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zz2 f40719a;
    public final yox b;

    public xdz(Function1 function1) {
        zz2 zz2Var = new zz2((byte) 14);
        this.f40719a = zz2Var;
        this.b = new yox(zz2Var);
        function1.invoke(this);
    }

    public static void d(xdz xdzVar, ugd ugdVar) {
        xdzVar.e(1, null, new djx((byte) 28), new ebz(qek0.b, (byte) 7), new ugd(1062451479, true, new f4b(ugdVar, (byte) 2)));
    }

    @Override // androidx.compose.foundation.lazy.layout.b
    public final zz2 b() {
        return this.f40719a;
    }

    public final void e(int i, Function1 function1, Function1 function2, ebz ebzVar, ugd ugdVar) {
        this.f40719a.a(i, new wdz(function1, function2, ebzVar, ugdVar));
    }
}
