package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class e7a0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ g7a0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e7a0(g7a0 g7a0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = g7a0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        g7a0 g7a0Var = this.l;
        switch (b) {
            case 0:
                e7a0 e7a0Var = new e7a0(g7a0Var, yjeVar, (byte) 0);
                e7a0Var.k = obj;
                return e7a0Var;
            default:
                e7a0 e7a0Var2 = new e7a0(g7a0Var, yjeVar, (byte) 1);
                e7a0Var2.k = obj;
                return e7a0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((e7a0) create((l9s) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((e7a0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        g7a0 g7a0Var = this.l;
        switch (b) {
            case 0:
                l9s l9sVar = (l9s) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    int i = g7a0.w;
                    p7m0 p7m0Var = g7a0Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, y6a0.a((y6a0) value, null, null, null, null, l9sVar, 47)));
                    o030 o030Var = g7a0Var.o;
                    t030 t030Var = new t030(l9sVar);
                    this.k = null;
                    this.j = true;
                    if (o030Var.a(t030Var, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                List list = (List) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    int i2 = g7a0.w;
                    p7m0 p7m0Var2 = g7a0Var.i.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                        g7a0Var.f.getClass();
                    } while (!p7m0Var2.m(value2, y6a0.a((y6a0) value2, null, list, null, null, null, 61)));
                    o030 o030Var2 = g7a0Var.o;
                    ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(r3d.r(((i6a0) it.next()).f14230a));
                    }
                    s030 s030Var = new s030(r3d.r(arrayList));
                    this.k = null;
                    this.j = true;
                    if (o030Var2.a(s030Var, this) == wneVar2) {
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
}
