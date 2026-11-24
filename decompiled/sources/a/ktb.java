package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ktb implements afr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f18855a;
    public final int b;
    public final i99 c;

    public ktb(CoroutineContext coroutineContext, int i, i99 i99Var) {
        this.f18855a = coroutineContext;
        this.b = i;
        this.c = i99Var;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    @Override // a.afr
    public final gmq b(CoroutineContext coroutineContext, int i, i99 i99Var) {
        CoroutineContext coroutineContext2 = this.f18855a;
        CoroutineContext coroutineContextPlus = coroutineContext.plus(coroutineContext2);
        i99 i99Var2 = i99.f14377a;
        i99 i99Var3 = this.c;
        int i2 = this.b;
        if (i99Var == i99Var2) {
            if (i2 != -3) {
                if (i == -3) {
                    i = i2;
                } else if (i2 != -2) {
                    if (i == -2) {
                        i = i2;
                    } else {
                        i += i2;
                        if (i < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            i99Var = i99Var3;
        }
        return (Intrinsics.d(coroutineContextPlus, coroutineContext2) && i == i2 && i99Var == i99Var3) ? this : j(coroutineContextPlus, i, i99Var);
    }

    @Override // a.gmq
    public Object c(kmq kmqVar, yje yjeVar) {
        Object objJ = d5c.J(yjeVar, new yxa((Object) kmqVar, (Object) this, (yje) null, (byte) 27));
        return objJ == wne.f39444a ? objJ : Unit.f46060a;
    }

    public String f() {
        return null;
    }

    public abstract Object h(hzb0 hzb0Var, yje yjeVar);

    public abstract ktb j(CoroutineContext coroutineContext, int i, i99 i99Var);

    public gmq k() {
        return null;
    }

    public htb l(vne vneVar) {
        int i = this.b;
        if (i == -3) {
            i = -2;
        }
        yne yneVar = yne.c;
        Function2 jtbVar = new jtb(this, null, (byte) 0);
        hzb0 hzb0Var = new hzb0(jne.b(vneVar, this.f18855a), vtb.d(i, this.c, null, 4));
        hzb0Var.d0(yneVar, hzb0Var, jtbVar);
        return hzb0Var;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strF = f();
        if (strF != null) {
            arrayList.add(strF);
        }
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f46065a;
        CoroutineContext coroutineContext = this.f18855a;
        if (coroutineContext != gVar) {
            arrayList.add("context=" + coroutineContext);
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        i99 i99Var = i99.f14377a;
        i99 i99Var2 = this.c;
        if (i99Var2 != i99Var) {
            arrayList.add("onBufferOverflow=" + i99Var2);
        }
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append('[');
        return axq.m(sb, CollectionsKt.b0(arrayList, ", ", null, null, null, 62), ']');
    }
}
