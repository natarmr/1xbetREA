package a;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a2 extends pby implements yje, vne {
    public final CoroutineContext d;

    public a2(CoroutineContext coroutineContext, boolean z) {
        super(z);
        K((bby) coroutineContext.get(gqw0.o1));
        this.d = coroutineContext.plus(this);
    }

    @Override // a.pby
    public final void J(ss3 ss3Var) {
        u1c.H(ss3Var, this.d);
    }

    @Override // a.pby
    public String P() {
        return super.P();
    }

    @Override // a.pby
    public final void S(Object obj) {
        if (!(obj instanceof udd)) {
            c0(obj);
        } else {
            udd uddVar = (udd) obj;
            b0(uddVar.f35472a, defpackage.a.f0a.getIntVolatile(uddVar, udd.b) == 1);
        }
    }

    public final void d0(yne yneVar, a2 a2Var, Function2 function2) {
        Object objInvoke;
        int iOrdinal = yneVar.ordinal();
        if (iOrdinal == 0) {
            uc9.e0(function2, a2Var, this);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                function2.getClass();
                yje yjeVarB = pnx.b(pnx.a(a2Var, this, function2));
                Unit unit = Unit.f46060a;
                e0g0 e0g0Var = j0g0.b;
                yjeVarB.resumeWith(unit);
                return;
            }
            if (iOrdinal != 3) {
                t9f.b();
                return;
            }
            try {
                CoroutineContext coroutineContext = this.d;
                Object objC = ecq0.c(coroutineContext, null);
                try {
                    if (function2 instanceof zw5) {
                        zys0.e(2, function2);
                        objInvoke = function2.invoke(a2Var, this);
                    } else {
                        objInvoke = pnx.c(function2, a2Var, this);
                    }
                    ecq0.a(coroutineContext, objC);
                    if (objInvoke != wne.f39444a) {
                        e0g0 e0g0Var2 = j0g0.b;
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th) {
                    ecq0.a(coroutineContext, objC);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (th instanceof mvk) {
                    th = ((mvk) th).f22460a;
                }
                e0g0 e0g0Var3 = j0g0.b;
                resumeWith(new g0g0(th));
            }
        }
    }

    @Override // a.yje
    public final CoroutineContext getContext() {
        return this.d;
    }

    @Override // a.vne
    public final CoroutineContext getCoroutineContext() {
        return this.d;
    }

    @Override // a.yje
    public final void resumeWith(Object obj) {
        Throwable thA = j0g0.a(obj);
        if (thA != null) {
            obj = new udd(thA, false);
        }
        Object objO = O(obj);
        if (objO == qby.b) {
            return;
        }
        p(objO);
    }

    @Override // a.pby
    public final String u() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void c0(Object obj) {
    }

    public void b0(Throwable th, boolean z) {
    }
}
