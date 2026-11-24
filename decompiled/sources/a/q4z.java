package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class q4z extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ l4z o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ q4z(Object obj, l4z l4zVar, boolean z, boolean z2, int i, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.n = obj;
        this.o = l4zVar;
        this.k = z;
        this.l = z2;
        this.m = i;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        l4z l4zVar = this.o;
        Object obj = this.n;
        switch (b) {
            case 0:
                return new q4z((abu) obj, (i4z) l4zVar, this.k, this.l, this.m, yjeVar, (byte) 0);
            default:
                return new q4z((gxu) obj, (j4z) l4zVar, this.k, this.l, this.m, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((q4z) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object g0g0Var;
        Object objA;
        Object g0g0Var2;
        Object objA2;
        byte b = this.i;
        l4z l4zVar = this.o;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                abu abuVar = (abu) obj2;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    try {
                        e0g0 e0g0Var = j0g0.b;
                        g0g0Var = Boolean.valueOf(((gst0) abuVar.c).f11847a.a().b);
                    } catch (Throwable th) {
                        e0g0 e0g0Var2 = j0g0.b;
                        g0g0Var = new g0g0(th);
                    }
                    Object obj3 = Boolean.FALSE;
                    if (g0g0Var instanceof g0g0) {
                        g0g0Var = obj3;
                    }
                    boolean zBooleanValue = ((Boolean) g0g0Var).booleanValue();
                    tdl0 tdl0Var = (tdl0) abuVar.b;
                    i4z i4zVar = (i4z) l4zVar;
                    h4z h4zVar = i4zVar.f14167a;
                    qdl0 qdl0Var = new qdl0(h4zVar.f12456a, h4zVar.b, zBooleanValue, false, h4zVar.e);
                    are areVar = i4zVar.b;
                    this.j = true;
                    objA = tdl0Var.a(qdl0Var, areVar, this.k, this.l, this.m, this);
                    if (objA == wneVar) {
                        return wneVar;
                    }
                    break;
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = ((j0g0) obj).f15681a;
                }
                return new j0g0(objA);
            default:
                gxu gxuVar = (gxu) obj2;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    try {
                        e0g0 e0g0Var3 = j0g0.b;
                        g0g0Var2 = Boolean.valueOf(((gst0) gxuVar.b).f11847a.a().c);
                    } catch (Throwable th2) {
                        e0g0 e0g0Var4 = j0g0.b;
                        g0g0Var2 = new g0g0(th2);
                    }
                    Object obj4 = Boolean.FALSE;
                    if (g0g0Var2 instanceof g0g0) {
                        g0g0Var2 = obj4;
                    }
                    boolean zBooleanValue2 = ((Boolean) g0g0Var2).booleanValue();
                    tdl0 tdl0Var2 = (tdl0) gxuVar.f12096a;
                    j4z j4zVar = (j4z) l4zVar;
                    h4z h4zVar2 = j4zVar.f15908a;
                    qdl0 qdl0Var2 = new qdl0(h4zVar2.f12456a, h4zVar2.b, zBooleanValue2, true, h4zVar2.e);
                    are areVar2 = j4zVar.b;
                    this.j = true;
                    objA2 = tdl0Var2.a(qdl0Var2, areVar2, this.k, this.l, this.m, this);
                    if (objA2 == wneVar2) {
                        return wneVar2;
                    }
                    break;
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA2 = ((j0g0) obj).f15681a;
                }
                return new j0g0(objA2);
        }
    }
}
