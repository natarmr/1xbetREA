package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class g850 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ p850 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g850(p850 p850Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = p850Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        p850 p850Var = this.k;
        switch (b) {
            case 0:
                return new g850(p850Var, yjeVar, (byte) 0);
            case 1:
                g850 g850Var = new g850(p850Var, yjeVar, (byte) 1);
                g850Var.j = ((Boolean) obj).booleanValue();
                return g850Var;
            default:
                g850 g850Var2 = new g850(p850Var, yjeVar, (byte) 2);
                g850Var2.j = ((Boolean) obj).booleanValue();
                return g850Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((g850) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((g850) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((g850) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x022f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0114  */
    /* JADX WARN: Code duplicated, block: B:39:0x011e  */
    /* JADX WARN: Code duplicated, block: B:42:0x012c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0140  */
    /* JADX WARN: Code duplicated, block: B:45:0x0144  */
    /* JADX WARN: Code duplicated, block: B:46:0x0158  */
    /* JADX WARN: Code duplicated, block: B:48:0x015c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0170  */
    /* JADX WARN: Code duplicated, block: B:51:0x0174  */
    /* JADX WARN: Code duplicated, block: B:52:0x0188  */
    /* JADX WARN: Code duplicated, block: B:54:0x018c  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:60:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:61:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:63:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:67:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:69:0x0201  */
    /* JADX WARN: Code duplicated, block: B:70:0x0214  */
    /* JADX WARN: Code duplicated, block: B:72:0x0218  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objR;
        Object value;
        bby bbyVarR;
        Object value2;
        byte b = this.i;
        p850 p850Var = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    this.j = true;
                    objR = p850Var.w.r(new z7b[0], this);
                    if (objR == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objR = obj;
                }
                a3b a3bVar = (a3b) objR;
                a3bVar.getClass();
                ArrayList arrayList = a3bVar.f163a;
                ArrayList<vh0> arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    long j = ((vh0) obj2).f;
                    if (j == 2 || j == 0) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                for (vh0 vh0Var : arrayList2) {
                    arrayList3.add(new age(new ca8(new xi0(String.valueOf(vh0Var.f37408a), new si0(vh0Var.b), null, 8, "", false, pc0.HORIZONTAL, Integer.valueOf((int) vh0Var.f37408a)))));
                }
                mo1 mo1Var = new mo1(arrayList3, (byte) 2);
                int i = p850.p0;
                p850Var.H(mo1Var);
                p850Var.X();
                return Unit.f46060a;
            case 1:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (z2) {
                    int i2 = p850.p0;
                    List<jge> list = ((p650) p850Var.D()).h;
                    ArrayList arrayList4 = new ArrayList(r3d.q(list, 10));
                    for (jge igeVar : list) {
                        ha8 ha8VarA = igeVar.a();
                        ha8VarA.getClass();
                        if ((ha8VarA instanceof ba8) || (ha8VarA instanceof y98)) {
                            bbyVarR = p850Var.R(igeVar.getKey());
                            if (bbyVarR != null) {
                                bbyVarR.cancel(null);
                            }
                            p850Var.b0(igeVar.getKey());
                            if (igeVar instanceof yfe) {
                                igeVar = new yfe(new ea8(((yfe) igeVar).f42537a.a()));
                            } else if (igeVar instanceof zfe) {
                                igeVar = new zfe(new ea8(((zfe) igeVar).f44298a.a()));
                            } else if (igeVar instanceof age) {
                                igeVar = new age(new ea8(((age) igeVar).f819a.a()));
                            } else if (igeVar instanceof bge) {
                                igeVar = new bge(new ea8(((bge) igeVar).f2550a.a()));
                            } else if (igeVar instanceof cge) {
                                igeVar = new cge(new ea8(((cge) igeVar).f4307a.a()));
                            } else if (igeVar instanceof dge) {
                                igeVar = new dge(new ea8(((dge) igeVar).f6037a.a()));
                            } else if (igeVar instanceof ege) {
                                igeVar = new ege(new ea8(((ege) igeVar).f7760a.a()));
                            } else if (igeVar instanceof fge) {
                                igeVar = new fge(new ea8(((fge) igeVar).f9487a.a()));
                            } else if (igeVar instanceof gge) {
                                igeVar = new gge(new ea8(((gge) igeVar).f11249a.a()));
                            } else if (igeVar instanceof hge) {
                                igeVar = new hge(new ea8(((hge) igeVar).f13014a.a()));
                            } else {
                                if (igeVar instanceof ige) {
                                    t9f.b();
                                    return null;
                                }
                                igeVar = new ige(new ea8(((ige) igeVar).f14731a.a()));
                            }
                        } else {
                            ha8 ha8VarA2 = igeVar.a();
                            ha8VarA2.getClass();
                            if ((ha8VarA2 instanceof ba8) || (ha8VarA2 instanceof y98) || ((ha8VarA2 instanceof da8) && ((da8) ha8VarA2).c)) {
                                bbyVarR = p850Var.R(igeVar.getKey());
                                if (bbyVarR != null) {
                                    bbyVarR.cancel(null);
                                }
                                p850Var.b0(igeVar.getKey());
                                if (igeVar instanceof yfe) {
                                    igeVar = new yfe(new ea8(((yfe) igeVar).f42537a.a()));
                                } else if (igeVar instanceof zfe) {
                                    igeVar = new zfe(new ea8(((zfe) igeVar).f44298a.a()));
                                } else if (igeVar instanceof age) {
                                    igeVar = new age(new ea8(((age) igeVar).f819a.a()));
                                } else if (igeVar instanceof bge) {
                                    igeVar = new bge(new ea8(((bge) igeVar).f2550a.a()));
                                } else if (igeVar instanceof cge) {
                                    igeVar = new cge(new ea8(((cge) igeVar).f4307a.a()));
                                } else if (igeVar instanceof dge) {
                                    igeVar = new dge(new ea8(((dge) igeVar).f6037a.a()));
                                } else if (igeVar instanceof ege) {
                                    igeVar = new ege(new ea8(((ege) igeVar).f7760a.a()));
                                } else if (igeVar instanceof fge) {
                                    igeVar = new fge(new ea8(((fge) igeVar).f9487a.a()));
                                } else if (igeVar instanceof gge) {
                                    igeVar = new gge(new ea8(((gge) igeVar).f11249a.a()));
                                } else if (igeVar instanceof hge) {
                                    igeVar = new hge(new ea8(((hge) igeVar).f13014a.a()));
                                } else {
                                    if (igeVar instanceof ige) {
                                        t9f.b();
                                        return null;
                                    }
                                    igeVar = new ige(new ea8(((ige) igeVar).f14731a.a()));
                                }
                            }
                        }
                        arrayList4.add(igeVar);
                    }
                    p7m0 p7m0Var = p850Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        p850Var.f.getClass();
                    } while (!p7m0Var.m(value, p650.a((p650) value, null, arrayList4, null, false, 262015)));
                    p850Var.X();
                }
                return Unit.f46060a;
            default:
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                f650 f650Var = f650.b;
                int i3 = p850.p0;
                p850 p850Var2 = this.k;
                bby bbyVarQ = p850Var2.Q(f650Var);
                if (bbyVarQ != null) {
                    bbyVarQ.cancel(null);
                }
                LinkedHashMap linkedHashMap = p850Var2.n0;
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    e3c.n((bby) ((Map.Entry) it.next()).getValue());
                }
                linkedHashMap.clear();
                q250 q250Var = ((p650) p850Var2.D()).q;
                if (q250Var != null) {
                    f650 f650Var2 = f650.f8994a;
                    p850Var2.Q(f650Var2);
                    p850Var2.N(f650Var2, sac.V(jiu0.a(p850Var2), new f340(1, p850Var2, p850.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 27), new y650(p850Var2, (byte) 1), p850Var2.p.b, new j940(p850Var2, q250Var, yjeVar, (byte) 7), 8));
                }
                List listP = p850Var2.s.p(((p650) p850Var2.D()).f26438a);
                p7m0 p7m0Var2 = p850Var2.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, p650.a((p650) value2, null, thb.v(listP), null, z3, 253823)));
                p850Var2.W();
                return Unit.f46060a;
        }
    }
}
