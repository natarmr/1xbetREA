package a;

import android.javax.sip.message.Response;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class se5 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public Object l;
    public long m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se5(ze5 ze5Var, long j, String str, String str2, rwn rwnVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        this.k = ze5Var;
        this.m = j;
        this.l = str;
        this.n = str2;
        this.o = rwnVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.n;
        Object obj3 = this.o;
        switch (b) {
            case 0:
                return new se5((ze5) this.k, this.m, (String) this.l, (String) obj2, (rwn) obj3, yjeVar);
            case 1:
                return new se5((ze5) this.k, (String) this.l, this.m, (String) obj2, (xwn) obj3, yjeVar);
            case 2:
                se5 se5Var = new se5(this.l, obj2, obj3, this.m, yjeVar, (byte) 2);
                se5Var.k = obj;
                return se5Var;
            case 3:
                se5 se5Var2 = new se5(this.l, obj2, obj3, this.m, yjeVar, (byte) 3);
                se5Var2.k = obj;
                return se5Var2;
            case 4:
                return new se5((pz40) this.k, (a4x) this.l, (pz40) obj2, (Function0) obj3, this.m, yjeVar);
            default:
                return new se5((mo60) this.k, (g9b0) obj3, (String) obj2, yjeVar);
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
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((se5) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        long jD;
        Object objK;
        String str;
        pbv pbvVar;
        lz60 lz60VarA;
        hds hdsVar;
        byte b = this.i;
        Object obj2 = this.n;
        Object obj3 = this.o;
        Object obj4 = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    this.j = true;
                    if (((ze5) this.k).x(this.m, (String) this.l, (String) obj2, (rwn) obj3, this) == wneVar) {
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
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    this.j = true;
                    if (((ze5) this.k).y((String) this.l, this.m, (String) obj2, (xwn) obj3, this) == wneVar2) {
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
            case 2:
                nee neeVar = (nee) this.l;
                h03 h03Var = neeVar.t;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                try {
                    try {
                        if (!z3) {
                            z1x.P(obj);
                            bby bbyVarR = zvw.R(((vne) this.k).getCoroutineContext());
                            neeVar.w = true;
                            sch0 sch0Var = neeVar.p;
                            c050 c050Var = c050.f3507a;
                            mee meeVar = new mee(obj2, (Object) neeVar, obj3, this.m, (Object) bbyVarR, (yje) null, (byte) 0);
                            this.j = true;
                            if (sch0Var.g(c050Var, meeVar, this) == wneVar3) {
                                return wneVar3;
                            }
                        } else {
                            if (!z3) {
                                jf4.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            z1x.P(obj);
                        }
                        h03Var.F();
                        neeVar.w = false;
                        h03Var.x(null);
                        neeVar.u = false;
                        return Unit.f46060a;
                    } catch (CancellationException e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    neeVar.w = false;
                    h03Var.x(null);
                    neeVar.u = false;
                    throw th;
                }
            case 3:
                zsf zsfVar = (zsf) obj2;
                vne vneVar = (vne) this.k;
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    qjj.W(vneVar, null, null, new oxn((t33) obj3, this.m, zsfVar, null, (byte) 1), 3);
                    t33 t33Var = (t33) this.l;
                    Float f = new Float(0.0f);
                    uts0 uts0VarM0 = ro4.m0(Response.BAD_REQUEST, 0, zsfVar, 2);
                    this.k = null;
                    this.j = true;
                    if (t33.a(t33Var, f, uts0VarM0, null, null, this, 12) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    vsg0 vsg0VarV = ydx.V(null, new rip((pz40) this.k, (byte) 9));
                    i5u i5uVar = new i5u((a4x) this.l, (pz40) obj2, (Function0) obj3, this.m, (byte) 1);
                    this.j = true;
                    if (vsg0VarV.c(i5uVar, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                mo60 mo60Var = (mo60) this.k;
                g9b0 g9b0Var = (g9b0) obj3;
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    jD = x1x.D(mo60Var.b);
                    String string = mo60Var.b instanceof z470 ? UUID.randomUUID().toString() : "";
                    string.getClass();
                    lbu lbuVar = g9b0Var.v;
                    this.l = string;
                    this.m = jD;
                    this.j = true;
                    objK = lbu.k(lbuVar, 0, this, 3);
                    if (objK == wneVar6) {
                        return wneVar6;
                    }
                    str = string;
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j = this.m;
                    String str2 = (String) this.l;
                    z1x.P(obj);
                    jD = j;
                    str = str2;
                    objK = obj;
                }
                for (Object obj5 : (Iterable) objK) {
                    if (x1x.D(((pbv) obj5).e) == jD) {
                        obj4 = obj5;
                        pbvVar = (pbv) obj4;
                        if (pbvVar != null || (hdsVar = pbvVar.n) == null || (lz60VarA = hdsVar.a((String) obj2)) == null) {
                            lz60VarA = jz60.f17395a;
                        }
                        lz60 lz60Var = lz60VarA;
                        long j2 = jD;
                        String str3 = str;
                        g9b0Var.B.d(j2, zn60.Main, str3, lz60Var);
                        g9b0Var.C.d((int) j2, y1p.POPULAR, str3, lz60Var);
                        sac.V(jiu0.a(g9b0Var), new e9b0(1, g9b0Var, g9b0.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 0), null, g9b0Var.h.b, new ze1(g9b0Var, j2, (mo60) this.k, str3, (yje) null), 10);
                        return Unit.f46060a;
                    }
                }
                pbvVar = (pbv) obj4;
                if (pbvVar != null) {
                    lz60VarA = jz60.f17395a;
                } else {
                    lz60VarA = jz60.f17395a;
                }
                lz60 lz60Var2 = lz60VarA;
                long j3 = jD;
                String str4 = str;
                g9b0Var.B.d(j3, zn60.Main, str4, lz60Var2);
                g9b0Var.C.d((int) j3, y1p.POPULAR, str4, lz60Var2);
                sac.V(jiu0.a(g9b0Var), new e9b0(1, g9b0Var, g9b0.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 0), null, g9b0Var.h.b, new ze1(g9b0Var, j3, (mo60) this.k, str4, (yje) null), 10);
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se5(ze5 ze5Var, String str, long j, String str2, xwn xwnVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        this.k = ze5Var;
        this.l = str;
        this.m = j;
        this.n = str2;
        this.o = xwnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se5(pz40 pz40Var, a4x a4xVar, pz40 pz40Var2, Function0 function0, long j, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 4;
        this.k = pz40Var;
        this.l = a4xVar;
        this.n = pz40Var2;
        this.o = function0;
        this.m = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se5(mo60 mo60Var, g9b0 g9b0Var, String str, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 5;
        this.k = mo60Var;
        this.o = g9b0Var;
        this.n = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ se5(Object obj, Object obj2, Object obj3, long j, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.n = obj2;
        this.o = obj3;
        this.m = j;
    }
}
