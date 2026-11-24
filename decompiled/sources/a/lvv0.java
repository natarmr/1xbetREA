package a;

import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class lvv0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public boolean j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvv0(mvv0 mvv0Var, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.k = mvv0Var;
        this.j = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                return new lvv0((mvv0) obj2, this.j, yjeVar);
            default:
                return new lvv0((n2w0) obj2, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((lvv0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        gvv0 gvv0VarA;
        kvv0 kvv0Var;
        Object next;
        fvv0 fvv0Var;
        byte b = this.i;
        Object obj2 = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                mvv0 mvv0Var = (mvv0) obj2;
                jvv0 jvv0Var = mvv0Var.b;
                if (((gvv0) jvv0Var.f17222a.getValue()).f11994a.isEmpty()) {
                    return Unit.f46060a;
                }
                if (mvv0Var.f22475a.f44297a.i != lkz.e) {
                    return Unit.f46060a;
                }
                boolean z = this.j;
                p7m0 p7m0Var = jvv0Var.f17222a;
                do {
                    value = p7m0Var.getValue();
                    gvv0VarA = (gvv0) value;
                    Map map = gvv0VarA.f11994a;
                    Map map2 = gvv0VarA.b;
                    if (!map.isEmpty() && ((kvv0Var = gvv0VarA.c) == null || (fvv0Var = (fvv0) map2.get(kvv0Var)) == null || !fvv0Var.a())) {
                        Iterator it = CollectionsKt.N(gvv0VarA.f11994a.values()).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                fvv0 fvv0Var2 = (fvv0) map2.get((kvv0) next);
                                if (fvv0Var2 == null || !fvv0Var2.a()) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        kvv0 kvv0Var2 = (kvv0) next;
                        gvv0VarA = (kvv0Var2 != null && z) ? gvv0.a(gvv0VarA, null, null, kvv0Var2, 3) : gvv0.a(gvv0VarA, null, null, null, 3);
                    }
                } while (!p7m0Var.m(value, gvv0VarA));
                return Unit.f46060a;
            default:
                n2w0 n2w0Var = (n2w0) obj2;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    mne mneVar = n2w0Var.g2;
                    if (mneVar == null) {
                        Intrinsics.h("coroutineDispatchers");
                        throw null;
                    }
                    vs10 vs10Var = mneVar.c;
                    wup0 wup0Var = new wup0(n2w0Var, yjeVar, (byte) 22);
                    this.j = true;
                    if (qjj.d0(vs10Var, wup0Var, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvv0(n2w0 n2w0Var, yje yjeVar) {
        super(2, yjeVar);
        this.k = n2w0Var;
    }
}
