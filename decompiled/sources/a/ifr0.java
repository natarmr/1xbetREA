package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class ifr0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ofr0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ifr0(ofr0 ofr0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = ofr0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ofr0 ofr0Var = this.l;
        switch (b) {
            case 0:
                ifr0 ifr0Var = new ifr0(ofr0Var, yjeVar, (byte) 0);
                ifr0Var.k = obj;
                return ifr0Var;
            case 1:
                ifr0 ifr0Var2 = new ifr0(ofr0Var, yjeVar, (byte) 1);
                ifr0Var2.k = obj;
                return ifr0Var2;
            case 2:
                ifr0 ifr0Var3 = new ifr0(ofr0Var, yjeVar, (byte) 2);
                ifr0Var3.k = obj;
                return ifr0Var3;
            case 3:
                ifr0 ifr0Var4 = new ifr0(ofr0Var, yjeVar, (byte) 3);
                ifr0Var4.k = obj;
                return ifr0Var4;
            case 4:
                ifr0 ifr0Var5 = new ifr0(ofr0Var, yjeVar, (byte) 4);
                ifr0Var5.k = obj;
                return ifr0Var5;
            default:
                ifr0 ifr0Var6 = new ifr0(ofr0Var, yjeVar, (byte) 5);
                ifr0Var6.k = obj;
                return ifr0Var6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ifr0) create((cic0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((ifr0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((ifr0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((ifr0) create((jkg) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((ifr0) create((jkg) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ifr0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        j0r0 j0r0Var;
        c4m0 c4m0Var;
        q0r0 q0r0Var;
        c4m0 c4m0Var2;
        z0r0 z0r0Var;
        byte b = this.i;
        c1r0 c1r0Var = c1r0.f3588a;
        b1r0 b1r0Var = b1r0.f1823a;
        g1r0 g1r0Var = g1r0.f10530a;
        f1r0 f1r0Var = f1r0.f8780a;
        ofr0 ofr0Var = this.l;
        switch (b) {
            case 0:
                cic0 cic0Var = (cic0) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    uhc0 uhc0Var = cic0Var != null ? cic0Var.f4406a : null;
                    this.k = cic0Var;
                    this.j = true;
                    int i = ofr0.U0;
                    kb0 kb0Var = ofr0Var.u;
                    pj0 pj0Var = new pj0(uhc0Var);
                    kb0Var.getClass();
                    Object objP = kb0Var.p(pj0Var, this);
                    if (objP != wneVar) {
                        objP = Unit.f46060a;
                    }
                    if (objP == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                i0r0 i0r0Var = cic0Var != null ? new i0r0(f1r0Var, cic0Var) : new i0r0(g1r0Var);
                int i2 = ofr0.U0;
                ofr0Var.V(i0r0Var);
                return Unit.f46060a;
            case 1:
                List list = (List) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    this.k = list;
                    this.j = true;
                    int i3 = ofr0.U0;
                    kb0 kb0Var2 = ofr0Var.u;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        w3d.u(arrayList, ((gza0) it.next()).c);
                    }
                    qj0 qj0Var = new qj0(arrayList);
                    kb0Var2.getClass();
                    Object objP2 = kb0Var2.p(qj0Var, this);
                    if (objP2 != wne.f39444a) {
                        objP2 = Unit.f46060a;
                    }
                    if (objP2 == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                if (list.isEmpty()) {
                    j0r0Var = new j0r0(g1r0Var, iun.f15405a);
                } else {
                    ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(zsm0.v((gza0) it2.next()));
                    }
                    j0r0Var = new j0r0(f1r0Var, arrayList2);
                }
                int i4 = ofr0.U0;
                ofr0Var.V(j0r0Var);
                return Unit.f46060a;
            case 2:
                List list2 = (List) this.k;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    this.k = list2;
                    this.j = true;
                    int i5 = ofr0.U0;
                    kb0 kb0Var3 = ofr0Var.u;
                    rj0 rj0Var = new rj0(list2);
                    kb0Var3.getClass();
                    Object objP3 = kb0Var3.p(rj0Var, this);
                    if (objP3 != wneVar3) {
                        objP3 = Unit.f46060a;
                    }
                    if (objP3 == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                k0r0 k0r0Var = !list2.isEmpty() ? new k0r0(f1r0Var, list2) : new k0r0(g1r0Var, iun.f15405a);
                int i6 = ofr0.U0;
                ofr0Var.V(k0r0Var);
                return Unit.f46060a;
            case 3:
                jkg jkgVar = (jkg) this.k;
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    if (jkgVar != null) {
                        if (jkgVar instanceof gkg) {
                            c4m0 c4m0Var3 = ofr0Var.q0;
                            if (c4m0Var3 != null && c4m0Var3.isActive()) {
                                return Unit.f46060a;
                            }
                            c4m0 c4m0Var4 = ofr0Var.q0;
                            if ((c4m0Var4 == null || !c4m0Var4.isActive()) && ((c4m0Var = ofr0Var.s0) == null || !c4m0Var.isActive())) {
                                ofr0Var.s0 = ofr0Var.P(new cfr0(ofr0Var, (byte) 3));
                            }
                            n0r0 n0r0Var = ((ser0) ofr0Var.D()).t.c.isEmpty() ? new n0r0(b1r0Var, iun.f15405a) : new n0r0(c1r0Var, ((ser0) ofr0Var.D()).t.c);
                            m0r0 m0r0Var = ((ser0) ofr0Var.D()).u.c.isEmpty() ? new m0r0(b1r0Var, iun.f15405a) : new m0r0(c1r0Var, ((ser0) ofr0Var.D()).u.c);
                            ofr0Var.V(n0r0Var);
                            ofr0Var.V(m0r0Var);
                        } else if (jkgVar instanceof ikg) {
                            iun iunVar = iun.f15405a;
                            n0r0 n0r0Var2 = new n0r0(g1r0Var, iunVar);
                            int i7 = ofr0.U0;
                            ofr0Var.V(n0r0Var2);
                            ofr0Var.V(new m0r0(g1r0Var, iunVar));
                        } else if (jkgVar instanceof hkg) {
                            e3c.n(ofr0Var.s0);
                            alg algVar = ofr0Var.t;
                            clg clgVar = new clg(((hkg) jkgVar).f13207a);
                            this.k = jkgVar;
                            this.j = true;
                            ulg ulgVar = (ulg) algVar;
                            ulgVar.getClass();
                            if (ulgVar.a(clgVar, this) == wneVar4) {
                                return wneVar4;
                            }
                        }
                        return Unit.f46060a;
                    }
                    t9f.b();
                    return null;
                }
                if (!z4) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                List list3 = ((hkg) jkgVar).f13207a;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : list3) {
                    if (((xah) obj2).n) {
                        arrayList3.add(obj2);
                    } else {
                        arrayList4.add(obj2);
                    }
                }
                n0r0 n0r0Var3 = arrayList3.isEmpty() ? new n0r0(g1r0Var, iun.f15405a) : new n0r0(f1r0Var, arrayList3);
                m0r0 m0r0Var2 = arrayList4.isEmpty() ? new m0r0(g1r0Var, iun.f15405a) : new m0r0(f1r0Var, arrayList4);
                int i8 = ofr0.U0;
                ofr0Var.V(n0r0Var3);
                ofr0Var.V(m0r0Var2);
                return Unit.f46060a;
            case 4:
                jkg jkgVar2 = (jkg) this.k;
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    if (jkgVar2 != null) {
                        if (jkgVar2 instanceof gkg) {
                            int i9 = ofr0.U0;
                            c4m0 c4m0Var5 = ofr0Var.q0;
                            if ((c4m0Var5 == null || !c4m0Var5.isActive()) && ((c4m0Var2 = ofr0Var.r0) == null || !c4m0Var2.isActive())) {
                                ofr0Var.r0 = ofr0Var.P(new cfr0(ofr0Var, (byte) 2));
                            }
                            q0r0Var = ((ser0) ofr0Var.D()).q.c.isEmpty() ? new q0r0(b1r0Var, iun.f15405a) : new q0r0(c1r0Var, ((ser0) ofr0Var.D()).q.c);
                        } else if (jkgVar2 instanceof ikg) {
                            q0r0Var = new q0r0(g1r0Var, iun.f15405a);
                        } else if (jkgVar2 instanceof hkg) {
                            e3c.n(ofr0Var.r0);
                            alg algVar2 = ofr0Var.t;
                            dlg dlgVar = new dlg(((hkg) jkgVar2).f13207a);
                            this.k = jkgVar2;
                            this.j = true;
                            ulg ulgVar2 = (ulg) algVar2;
                            ulgVar2.getClass();
                            if (ulgVar2.a(dlgVar, this) == wneVar5) {
                                return wneVar5;
                            }
                        }
                        int i10 = ofr0.U0;
                        ofr0Var.V(q0r0Var);
                        return Unit.f46060a;
                    }
                    t9f.b();
                    return null;
                }
                if (!z5) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                q0r0Var = new q0r0(f1r0Var, ((hkg) jkgVar2).f13207a);
                int i11 = ofr0.U0;
                ofr0Var.V(q0r0Var);
                return Unit.f46060a;
            default:
                List list4 = (List) this.k;
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    this.k = list4;
                    this.j = true;
                    int i12 = ofr0.U0;
                    kb0 kb0Var4 = ofr0Var.u;
                    ArrayList arrayList5 = new ArrayList(r3d.q(list4, 10));
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        arrayList5.add(((gza0) it3.next()).c);
                    }
                    sj0 sj0Var = new sj0(r3d.r(arrayList5));
                    kb0Var4.getClass();
                    Object objP4 = kb0Var4.p(sj0Var, this);
                    if (objP4 != wne.f39444a) {
                        objP4 = Unit.f46060a;
                    }
                    if (objP4 == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                if (list4.isEmpty()) {
                    z0r0Var = new z0r0(g1r0Var, iun.f15405a);
                } else {
                    ArrayList arrayList6 = new ArrayList(r3d.q(list4, 10));
                    Iterator it4 = list4.iterator();
                    while (it4.hasNext()) {
                        arrayList6.add(zsm0.v((gza0) it4.next()));
                    }
                    z0r0Var = new z0r0(f1r0Var, arrayList6);
                }
                int i13 = ofr0.U0;
                ofr0Var.V(z0r0Var);
                return Unit.f46060a;
        }
    }
}
