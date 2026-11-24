package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class uw extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ long k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uw(Object obj, long j, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.l = obj;
        this.k = j;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        Object obj = this.l;
        switch (b) {
            case 0:
                return new uw((ww) obj, this.k, yjeVar, (byte) 0);
            case 1:
                return new uw((mh1) obj, this.k, yjeVar, (byte) 1);
            case 2:
                return new uw((xig) obj, this.k, yjeVar, (byte) 2);
            case 3:
                return new uw((mpn) obj, this.k, yjeVar, (byte) 3);
            case 4:
                return new uw((g2g0) obj, this.k, yjeVar, (byte) 4);
            default:
                return new uw((u0v0) obj, this.k, yjeVar, (byte) 5);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
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
        return ((uw) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x013e  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objC;
        Object value;
        ArrayList arrayListR0;
        ion ionVar;
        oeo oeoVar;
        String str;
        eu90 eu90Var;
        vt20 vt20Var;
        byte b = this.i;
        long j = this.k;
        Object obj2 = this.l;
        Object obj3 = null;
        switch (b) {
            case 0:
                ww wwVar = (ww) obj2;
                ctf0 ctf0Var = wwVar.t;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    m0u m0uVar = wwVar.s;
                    this.j = true;
                    objC = m0uVar.f20973a.c(j, this);
                    if (objC == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objC = obj;
                }
                xuf xufVar = (xuf) objC;
                String strA = ((lw) wwVar.D()).f;
                boolean z2 = strA.length() == 0 || ((lw) wwVar.D()).c;
                if (z2) {
                    strA = ctf0Var.b.a(R.string.account_default_title_name_v2, Arrays.copyOf(new Object[]{xufVar.b}, 1));
                }
                String str2 = strA;
                boolean z3 = str2.length() > 30;
                String strA2 = z3 ? ctf0Var.b.a(R.string.wallet_name_too_long, Arrays.copyOf(new Object[0], 0)) : "";
                p7m0 p7m0Var = wwVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, lw.a((lw) value, false, xufVar, z2, z3, strA2, str2, (StringsKt.u0(str2).toString().length() <= 0 || xufVar.o || z3) ? false : true, 1)));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    pw70 pw70Var = ((mh1) obj2).H;
                    mlr mlrVarA = mlr.a(new mlr(0L, 0L, 0L, 0L, "", "", "", (String) null, false, false, false, false, false, false, false, (List) iun.f15405a, false, 131200), this.k, 0L, 0L, null, false, false, false, 262142);
                    this.j = true;
                    if (pw70.b(pw70Var, mlrVarA, "", 8120, false, false, this, 98) == wneVar2) {
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
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    xig xigVar = (xig) obj2;
                    vsu vsuVar = xigVar.y;
                    sip sipVar = xigVar.o;
                    this.j = true;
                    op1 op1Var = vsuVar.f37970a.f30238a;
                    sipVar.getClass();
                    List list = (List) ((Map) op1Var.f25617a.getValue()).getOrDefault(sipVar, iun.f15405a);
                    if (axq.y(j, list)) {
                        arrayListR0 = new ArrayList();
                        for (Object obj4 : list) {
                            if (((Number) obj4).longValue() != j) {
                                arrayListR0.add(obj4);
                            }
                        }
                    } else {
                        arrayListR0 = CollectionsKt.r0(list, new Long(j));
                    }
                    op1Var.a(arrayListR0, sipVar);
                    Unit unit = Unit.f46060a;
                    wne wneVar4 = wne.f39444a;
                    if (unit == wneVar3) {
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
            case 3:
                mpn mpnVar = (mpn) obj2;
                wne wneVar5 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    oon oonVar = ((ipn) mpnVar.D()).d;
                    jon jonVar = oonVar instanceof jon ? (jon) oonVar : null;
                    if (jonVar != null && (ionVar = jonVar.b) != null) {
                        for (Object obj5 : ionVar.b) {
                            if (((oeo) obj5).b == j) {
                                obj3 = obj5;
                                oeoVar = (oeo) obj3;
                                if (oeoVar != null && (str = oeoVar.c) != null) {
                                    eu90Var = mpnVar.D;
                                    vt20Var = new vt20(0, this.k, str, false);
                                    this.j = true;
                                    if (eu90Var.a(vt20Var, this) == wneVar5) {
                                        return wneVar5;
                                    }
                                }
                            }
                        }
                        oeoVar = (oeo) obj3;
                        if (oeoVar != null) {
                            eu90Var = mpnVar.D;
                            vt20Var = new vt20(0, this.k, str, false);
                            this.j = true;
                            if (eu90Var.a(vt20Var, this) == wneVar5) {
                                return wneVar5;
                            }
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z6) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                return Unit.f46060a;
            case 4:
                g2g0 g2g0Var = (g2g0) obj2;
                wne wneVar6 = wne.f39444a;
                boolean z7 = this.j;
                try {
                    if (!z7) {
                        z1x.P(obj);
                        boolean z8 = ((pru) g2g0Var.k).a().C0;
                        lhf0 lhf0Var = (lhf0) g2g0Var.l;
                        long j2 = this.k;
                        xvs xvsVar = xvs.COMPLETE;
                        h9n0 f9n0Var = z8 ? new f9n0(false) : g9n0.f10923a;
                        this.j = true;
                        if (lhf0Var.w(j2, xvsVar, f9n0Var, this) == wneVar6) {
                            return wneVar6;
                        }
                    } else {
                        if (!z7) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                    }
                } catch (Throwable th) {
                    ((ivn) g2g0Var.j).f(th, new eme0(g2g0Var, (byte) 17));
                }
                return Unit.f46060a;
            default:
                u0v0 u0v0Var = (u0v0) obj2;
                wne wneVar7 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    ql5 ql5Var = (ql5) ((j0v0) u0v0Var.D()).f.get(new Long(j));
                    if (ql5Var != null) {
                        if (u0v0Var.H.f26869a.b()) {
                            u0v0Var.G(new e0v0(ql5Var));
                            p7m0 p7m0Var2 = u0v0Var.i.f25029a;
                            while (true) {
                                Object value2 = p7m0Var2.getValue();
                                value2.getClass();
                                ql5 ql5Var2 = ql5Var;
                                if (!p7m0Var2.m(value2, j0v0.a((j0v0) value2, false, false, false, false, null, null, null, ql5Var2, null, 0L, false, 1918))) {
                                    ql5Var = ql5Var2;
                                }
                            }
                        } else {
                            long j3 = ql5Var.e;
                            this.j = true;
                            if (u0v0Var.O(ql5Var, j3, this) == wneVar7) {
                                return wneVar7;
                            }
                        }
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
