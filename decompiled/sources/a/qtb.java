package a;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qtb extends ktb {
    public final gmq d;

    public qtb(gmq gmqVar, CoroutineContext coroutineContext, int i, i99 i99Var) {
        super(coroutineContext, i, i99Var);
        this.d = gmqVar;
    }

    @Override // a.ktb, a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) throws Throwable {
        if (this.b == -3) {
            CoroutineContext context = yjeVar.getContext();
            Boolean bool = Boolean.FALSE;
            bqd bqdVar = new bqd((byte) 7);
            CoroutineContext coroutineContext = this.f18855a;
            CoroutineContext coroutineContextPlus = !((Boolean) coroutineContext.fold(bool, bqdVar)).booleanValue() ? context.plus(coroutineContext) : jne.a(context, coroutineContext, false);
            if (Intrinsics.d(coroutineContextPlus, context)) {
                Object objM = m(kmqVar, yjeVar);
                return objM == wne.f39444a ? objM : Unit.f46060a;
            }
            ake akeVar = kotlin.coroutines.d.d1;
            if (Intrinsics.d(coroutineContextPlus.get(akeVar), context.get(akeVar))) {
                CoroutineContext context2 = yjeVar.getContext();
                if (!(kmqVar instanceof mfi0) && !(kmqVar instanceof h660)) {
                    kmqVar = new cdm0(kmqVar, context2);
                }
                Object objD0 = ntb.d0(coroutineContextPlus, kmqVar, ecq0.b(coroutineContextPlus), new jtb(this, null, (byte) 1), yjeVar);
                return objD0 == wne.f39444a ? objD0 : Unit.f46060a;
            }
        }
        Object objC = super.c(kmqVar, yjeVar);
        return objC == wne.f39444a ? objC : Unit.f46060a;
    }

    @Override // a.ktb
    public final Object h(hzb0 hzb0Var, yje yjeVar) {
        Object objM = m(new mfi0(hzb0Var), yjeVar);
        return objM == wne.f39444a ? objM : Unit.f46060a;
    }

    public Object m(kmq kmqVar, yje yjeVar) {
        Object objC = this.d.c(kmqVar, yjeVar);
        return objC == wne.f39444a ? objC : Unit.f46060a;
    }

    @Override // a.ktb
    public final String toString() {
        return this.d + " -> " + super.toString();
    }
}
