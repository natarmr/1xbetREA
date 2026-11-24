package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class e3z extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public boolean j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;
    public /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3z(f1b0 f1b0Var, mlr mlrVar, boolean z, Integer num, long j, long j2, fza0 fza0Var, yje yjeVar) {
        super(2, yjeVar);
        this.n = f1b0Var;
        this.o = mlrVar;
        this.k = z;
        this.p = num;
        this.l = j;
        this.m = j2;
        this.q = fza0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.q;
        Object obj3 = this.p;
        Object obj4 = this.o;
        switch (b) {
            case 0:
                long j = this.l;
                e3z e3zVar = new e3z(j, this.m, yjeVar, (are) obj2, (ieu) obj4, (List) obj3, this.k);
                e3zVar.n = obj;
                return e3zVar;
            default:
                return new e3z((f1b0) this.n, (mlr) obj4, this.k, (Integer) obj3, this.l, this.m, (fza0) obj2, yjeVar);
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
        return ((e3z) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object g0g0Var;
        Object objB;
        byte b = this.i;
        Object obj2 = this.o;
        boolean z = this.k;
        Object obj3 = this.p;
        Object obj4 = this.q;
        String str = null;
        switch (b) {
            case 0:
                ieu ieuVar = (ieu) obj2;
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    try {
                        e0g0 e0g0Var = j0g0.b;
                        krt0 krt0VarA = ((gst0) ieuVar.c).f11847a.a();
                        g0g0Var = Boolean.valueOf(z ? krt0VarA.c : krt0VarA.b);
                    } catch (Throwable th) {
                        e0g0 e0g0Var2 = j0g0.b;
                        g0g0Var = new g0g0(th);
                    }
                    Object obj5 = Boolean.FALSE;
                    if (g0g0Var instanceof g0g0) {
                        g0g0Var = obj5;
                    }
                    boolean zBooleanValue = ((Boolean) g0g0Var).booleanValue();
                    bl6 bl6Var = (bl6) ieuVar.b;
                    yf6 yf6Var = new yf6(this.l, (List) obj3, this.k, zBooleanValue, this.m, (are) obj4);
                    this.n = null;
                    this.j = true;
                    objB = bl6Var.b(yf6Var, this);
                    if (objB == wneVar) {
                        return wneVar;
                    }
                    break;
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = ((j0g0) obj).f15681a;
                }
                return new j0g0(objB);
            default:
                fza0 fza0Var = (fza0) obj4;
                Integer num = (Integer) obj3;
                f1b0 f1b0Var = (f1b0) this.n;
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    xr xrVar = f1b0Var.P;
                    mlr mlrVar = (mlr) obj2;
                    boolean z4 = !z;
                    int iIntValue = num != null ? num.intValue() : 0;
                    String strN = f1b0Var.N(this.l, this.m, fza0Var);
                    this.j = true;
                    if (xrVar.m(mlrVar, z4, iIntValue, strN, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                boolean z5 = !z;
                int i = f1b0.w0;
                int iIntValue2 = num != null ? num.intValue() : 0;
                int i2 = p0b0.f26141a[fza0Var.ordinal()];
                if (i2 == 1) {
                    str = "slots_popular";
                } else if (i2 == 2) {
                    str = "live_aggregator_popular";
                }
                String str2 = str;
                u58 u58Var = f1b0Var.y;
                Integer numValueOf = Integer.valueOf(iIntValue2);
                long j = this.l;
                u58Var.j(j, z5, numValueOf, "popular_new_aggregator", str2);
                ix0 ix0Var = f1b0Var.D;
                int i3 = (int) j;
                Integer numValueOf2 = Integer.valueOf(iIntValue2);
                y1p y1pVar = y1p.MAIN;
                ix0Var.h(i3, numValueOf2, "popular_new_aggregator", str2, z5);
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3z(long j, long j2, yje yjeVar, are areVar, ieu ieuVar, List list, boolean z) {
        super(2, yjeVar);
        this.o = ieuVar;
        this.l = j;
        this.p = list;
        this.k = z;
        this.m = j2;
        this.q = areVar;
    }
}
