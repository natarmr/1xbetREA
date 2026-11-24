package a;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class nez extends c4m0 {
    public final yje e;

    public nez(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, false);
        this.e = pnx.a(this, this, function2);
    }

    @Override // a.pby
    public final void T() throws Throwable {
        try {
            yje yjeVarB = pnx.b(this.e);
            e0g0 e0g0Var = j0g0.b;
            ovk.a(yjeVarB, Unit.f46060a);
        } catch (Throwable th) {
            th = th;
            if (th instanceof mvk) {
                th = ((mvk) th).f22460a;
            }
            e0g0 e0g0Var2 = j0g0.b;
            resumeWith(new g0g0(th));
            throw th;
        }
    }
}
