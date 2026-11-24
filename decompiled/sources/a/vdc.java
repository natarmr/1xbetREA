package a;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class vdc extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public double j;
    public boolean k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vdc(double d, diu0 diu0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = d;
        this.l = diu0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                return new vdc(obj2, this.j, yjeVar, (byte) 0);
            case 1:
                return new vdc((btj) obj2, yjeVar);
            case 2:
                return new vdc(this.j, (diu0) obj2, yjeVar, (byte) 2);
            case 3:
                return new vdc(this.j, (diu0) obj2, yjeVar, (byte) 3);
            default:
                return new vdc(obj2, this.j, yjeVar, (byte) 4);
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
        }
        return ((vdc) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object objG;
        Object value;
        double d;
        double d2;
        Object objD;
        byte b = this.i;
        Object obj2 = this.l;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wdc wdcVar = (wdc) obj2;
                wne wneVar = wne.f39444a;
                boolean z2 = this.k;
                if (!z2) {
                    z1x.P(obj);
                    m8c m8cVar = wdcVar.t;
                    wrz wrzVar = wdcVar.o;
                    double d3 = this.j;
                    this.k = true;
                    m8cVar.getClass();
                    if (wrzVar == ge7.BET_LIMIT_1_DAY) {
                        objG = m8cVar.a(d3, this);
                    } else if (wrzVar == ge7.BET_LIMIT_7_DAY) {
                        objG = m8cVar.c(d3, this);
                    } else if (wrzVar == ge7.BET_LIMIT_30_DAY) {
                        objG = m8cVar.b(d3, this);
                    } else if (wrzVar == o7k.DEPOSIT_LIMIT_1_DAY) {
                        objG = m8cVar.d(d3, this);
                    } else if (wrzVar == o7k.DEPOSIT_LIMIT_7_DAY) {
                        objG = m8cVar.f(d3, this);
                    } else if (wrzVar == o7k.DEPOSIT_LIMIT_30_DAY) {
                        objG = m8cVar.e(d3, this);
                    } else {
                        if (wrzVar == oki0.SESSION_TIME_LIMIT_1_DAY) {
                            z = true;
                        } else if (wrzVar == oki0.SESSION_TIME_LIMIT_7_DAY) {
                            objG = m8cVar.h(d3, this);
                        } else if (wrzVar == oki0.SESSION_TIME_LIMIT_30_DAY) {
                            objG = m8cVar.g(d3, this);
                        } else {
                            if (wrzVar != g8i0.f10866a && wrzVar != asz.b) {
                                t9f.b();
                                return null;
                            }
                            z = false;
                        }
                        objG = Boolean.valueOf(z);
                    }
                    if (objG == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objG = obj;
                }
                boolean zBooleanValue = ((Boolean) objG).booleanValue();
                int i = wdc.w;
                p7m0 p7m0Var = wdcVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, rdc.a((rdc) value, null, 0.0d, null, null, !zBooleanValue, 0.0d, null, false, null, 495)));
                return Unit.f46060a;
            case 1:
                btj btjVar = (btj) obj2;
                Object obj3 = wne.f39444a;
                boolean z3 = this.k;
                if (!z3) {
                    z1x.P(obj);
                    Object value2 = btjVar.k.getValue();
                    nrn nrnVar = value2 instanceof nrn ? (nrn) value2 : null;
                    double d4 = nrnVar != null ? nrnVar.b : btjVar.m;
                    zx10 zx10Var = btjVar.f;
                    c3j0 c3j0Var = new c3j0(d4, btjVar.n);
                    this.j = d4;
                    this.k = true;
                    etj etjVar = (etj) zx10Var.f45137a;
                    Object objD0 = qjj.d0(etjVar.c.b, new b1f((Object) etjVar, (Object) c3j0Var, yjeVar, (byte) 23), this);
                    if (objD0 != obj3) {
                        objD0 = Unit.f46060a;
                    }
                    if (objD0 != obj3) {
                        objD0 = Unit.f46060a;
                    }
                    if (objD0 == obj3) {
                        return obj3;
                    }
                    d = d4;
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d = this.j;
                    z1x.P(obj);
                }
                btjVar.l.f(new irn(d));
                return Unit.f46060a;
            case 2:
                wne wneVar2 = wne.f39444a;
                boolean z4 = this.k;
                if (!z4) {
                    z1x.P(obj);
                    double d5 = this.j;
                    d2 = d5 != -1.0d ? d5 : 0.0d;
                    hst hstVar = ((qg20) obj2).Q;
                    this.k = true;
                    if (hstVar.b(d2, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                wne wneVar3 = wne.f39444a;
                boolean z5 = this.k;
                if (!z5) {
                    z1x.P(obj);
                    double d6 = this.j;
                    d2 = d6 != -1.0d ? d6 : 0.0d;
                    hst hstVar2 = ((on20) obj2).y0;
                    this.k = true;
                    if (hstVar2.b(d2, this) == wneVar3) {
                        return wneVar3;
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
                pzu pzuVar = (pzu) obj2;
                wne wneVar4 = wne.f39444a;
                boolean z6 = this.k;
                if (!z6) {
                    z1x.P(obj);
                    gsj gsjVar = (gsj) pzuVar.b;
                    String strA = ((btt0) pzuVar.e).a();
                    String strC = ((knf0) pzuVar.d).c();
                    double d7 = this.j;
                    this.k = true;
                    objD = gsjVar.a().d(strA, strC, d7, "application/vnd.xenvelop+json", this);
                    if (objD == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objD = obj;
                }
                Iterable iterable = (Iterable) ((dx5) objD).a();
                ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(q0x.Q((m640) it.next()));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : arrayList) {
                    if (!((z540) obj4).h) {
                        arrayList2.add(obj4);
                    }
                }
                return CollectionsKt.A0(arrayList2, new lk30((byte) 1));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vdc(btj btjVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        this.l = btjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vdc(Object obj, double d, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.j = d;
    }
}
