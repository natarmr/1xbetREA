package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class f390 implements qq40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qq40 f8850a;
    public final o24 b = new o24((byte) 10);

    public f390(qq40 qq40Var) {
        this.f8850a = qq40Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a.qq40
    public final Object e(Function1 function1, yje yjeVar) {
        e390 e390Var;
        boolean z;
        Object objP;
        if (yjeVar instanceof e390) {
            e390Var = (e390) yjeVar;
            int i = e390Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                e390Var.l = i - Integer.MIN_VALUE;
            } else {
                e390Var = new e390(this, yjeVar);
            }
        } else {
            e390Var = new e390(this, yjeVar);
        }
        Object obj = e390Var.j;
        wne wneVar = wne.f39444a;
        int i2 = e390Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            o24 o24Var = this.b;
            e390Var.i = function1;
            e390Var.l = 1;
            synchronized (o24Var.b) {
                z = o24Var.f24513a;
            }
            if (z) {
                objP = Unit.f46060a;
            } else {
                n5a n5aVar = new n5a(1, pnx.b(e390Var));
                n5aVar.r();
                synchronized (o24Var.b) {
                    ((ArrayList) o24Var.c).add(n5aVar);
                }
                n5aVar.t(new ygy(o24Var, n5aVar, (byte) 7));
                objP = n5aVar.p();
                if (objP != wneVar) {
                    objP = Unit.f46060a;
                }
            }
            if (objP != wneVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        function1 = e390Var.i;
        z1x.P(obj);
        qq40 qq40Var = this.f8850a;
        e390Var.i = null;
        e390Var.l = 2;
        Object objE = qq40Var.e(function1, e390Var);
        return objE == wneVar ? wneVar : objE;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.b(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.c(this, coroutineContext);
    }
}
