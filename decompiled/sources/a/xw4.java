package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class xw4 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ long k;
    public final /* synthetic */ long l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw4(gr00 gr00Var, long j, long j2, String str, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        this.m = gr00Var;
        this.k = j;
        this.l = j2;
        this.n = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.n;
        Object obj3 = this.m;
        switch (b) {
            case 0:
                return new xw4((gr00) obj3, this.k, this.l, (String) obj2, yjeVar);
            case 1:
                long j = this.l;
                return new xw4((byte) 1, this.k, j, yjeVar, (l7m0) obj3, (t33) obj2);
            default:
                long j2 = this.l;
                return new xw4((byte) 2, this.k, j2, yjeVar, (w5z) obj3, (List) obj2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((xw4) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objB;
        ix4 ix4Var;
        vv4 vv4Var;
        int iOrdinal;
        byte b = this.i;
        Object obj2 = this.n;
        Object obj3 = this.m;
        switch (b) {
            case 0:
                gr00 gr00Var = (gr00) obj3;
                knf0 knf0Var = (knf0) gr00Var.d;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    peg0 peg0Var = (peg0) gr00Var.b;
                    String strA = ((btt0) gr00Var.e).a();
                    nv4 nv4Var = new nv4(this.k, this.l, knf0Var.a(), knf0Var.c(), (String) obj2);
                    this.j = true;
                    objB = ((sw4) ((zm) peg0Var.b).invoke()).b(strA, nv4Var, this);
                    if (objB == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                }
                tv4 tv4Var = (tv4) ((q16) objB).a();
                String str = tv4Var.f34581a;
                if (str == null) {
                    str = "";
                }
                Long l = tv4Var.b;
                long jLongValue = l != null ? l.longValue() : 0L;
                if (jLongValue == 0) {
                    ix4Var = ix4.f15523a;
                } else {
                    ix4Var = jLongValue == -1 ? ix4.c : ix4.b;
                }
                yv4 yv4Var = tv4Var.c;
                if (yv4Var == null || (iOrdinal = yv4Var.ordinal()) == 0) {
                    vv4Var = vv4.f38080a;
                } else if (iOrdinal == 1) {
                    vv4Var = vv4.b;
                } else {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return null;
                    }
                    vv4Var = vv4.c;
                }
                Integer num = tv4Var.d;
                return new iv4(str, ix4Var, vv4Var, num != null ? num.intValue() : 0);
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    vsg0 vsg0VarV = ydx.V(null, new eka((l7m0) obj3, (byte) 11));
                    z3d z3dVar = new z3d((t33) obj2, this.k, this.l);
                    this.j = true;
                    if (vsg0VarV.c(z3dVar, this) == wneVar2) {
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
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (z3) {
                    if (z3) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                w5z w5zVar = (w5z) obj3;
                abu abuVar = (abu) w5zVar.b;
                String strA2 = ((btt0) w5zVar.c).a();
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(ro4.i0((ru6) it.next()));
                }
                d40 d40Var = new d40(arrayList, new Long(this.k), new Long(this.l));
                this.j = true;
                Object objB2 = abuVar.m().b(strA2, d40Var, this);
                return objB2 == wneVar3 ? wneVar3 : objB2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xw4(byte b, long j, long j2, yje yjeVar, Object obj, Object obj2) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj;
        this.n = obj2;
        this.k = j;
        this.l = j2;
    }
}
