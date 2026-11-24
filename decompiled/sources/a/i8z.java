package a;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class i8z extends androidx.compose.foundation.lazy.layout.b {
    public static final hvy d = new hvy(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y8z f14364a = new y8z(this);
    public final zz2 b = new zz2((byte) 14);
    public boolean c;

    public i8z(Function1 function1) {
        function1.invoke(this);
    }

    public static void d(i8z i8zVar, Function1 function1, ugd ugdVar) {
        i8zVar.b.a(1, new h8z(null, new x6s(function1, (byte) 6), new djx((byte) 28), new ugd(-291643851, true, new f4b(ugdVar, (byte) 1))));
        i8zVar.c = true;
    }

    public static /* synthetic */ void f(i8z i8zVar, int i, oea oeaVar, oea oeaVar2, ugd ugdVar, int i2) {
        if ((i2 & 2) != 0) {
            oeaVar = null;
        }
        oea oeaVar3 = oeaVar;
        Function1 function1 = oeaVar2;
        if ((i2 & 8) != 0) {
            function1 = j9x.t;
        }
        i8zVar.e(i, oeaVar3, null, function1, ugdVar);
    }

    @Override // androidx.compose.foundation.lazy.layout.b
    public final zz2 b() {
        return this.b;
    }

    public final void e(int i, Function1 function1, Function2 function2, Function1 function3, ugd ugdVar) {
        this.b.a(i, new h8z(function1, function2 == null ? d : function2, function3, ugdVar));
        if (function2 != null) {
            this.c = true;
        }
    }
}
