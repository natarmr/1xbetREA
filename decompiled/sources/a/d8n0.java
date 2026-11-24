package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d8n0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5659a;
    public final /* synthetic */ kmq b;

    public d8n0(kmq kmqVar, j6m0 j6m0Var) {
        this.f5659a = (byte) 20;
        this.b = kmqVar;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0198  */
    /* JADX WARN: Code duplicated, block: B:122:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:125:0x01df  */
    /* JADX WARN: Code duplicated, block: B:133:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:151:0x0231  */
    /* JADX WARN: Code duplicated, block: B:169:0x0270  */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:185:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:201:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:219:0x0324  */
    /* JADX WARN: Code duplicated, block: B:237:0x0360  */
    /* JADX WARN: Code duplicated, block: B:253:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:271:0x03df  */
    /* JADX WARN: Code duplicated, block: B:287:0x0422  */
    /* JADX WARN: Code duplicated, block: B:312:0x0474  */
    /* JADX WARN: Code duplicated, block: B:328:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:346:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:35:0x0080  */
    /* JADX WARN: Code duplicated, block: B:364:0x0535  */
    /* JADX WARN: Code duplicated, block: B:384:0x058e  */
    /* JADX WARN: Code duplicated, block: B:404:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:424:0x0640  */
    /* JADX WARN: Code duplicated, block: B:440:0x0686  */
    /* JADX WARN: Code duplicated, block: B:456:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:472:0x0704  */
    /* JADX WARN: Code duplicated, block: B:488:0x0744  */
    /* JADX WARN: Code duplicated, block: B:504:0x0788  */
    /* JADX WARN: Code duplicated, block: B:524:0x07ca  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:74:0x0117  */
    /* JADX WARN: Code duplicated, block: B:90:0x0157  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) throws hr30 {
        c8n0 c8n0Var;
        f8n0 f8n0Var;
        w9n0 w9n0Var;
        mbn0 mbn0Var;
        pdn0 pdn0Var;
        ten0 ten0Var;
        ikn0 ikn0Var;
        b0o0 b0o0Var;
        h0o0 h0o0Var;
        l0o0 l0o0Var;
        n1t0 n1t0Var;
        pco0 pco0Var;
        uco0 uco0Var;
        wco0 wco0Var;
        lgo0 lgo0Var;
        aho0 aho0Var;
        eio0 eio0Var;
        nio0 nio0Var;
        trp0 trp0Var;
        qwp0 qwp0Var;
        d2q0 d2q0Var;
        mbq0 mbq0Var;
        utq0 utq0Var;
        fkr0 fkr0Var;
        Object lmr0Var;
        rnt0 rnt0Var;
        qrt0 qrt0Var;
        rzt0 rzt0Var;
        f7u0 f7u0Var;
        leu0 leu0Var;
        Object objA;
        byte b = this.f5659a;
        Object[] objArr = 0;
        byte b2 = 1;
        kmq kmqVar = this.b;
        Object obj2 = null;
        switch (b) {
            case 0:
                if (yjeVar instanceof c8n0) {
                    c8n0Var = (c8n0) yjeVar;
                    int i = c8n0Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c8n0Var.j = i - Integer.MIN_VALUE;
                    } else {
                        c8n0Var = new c8n0(this, yjeVar);
                    }
                } else {
                    c8n0Var = new c8n0(this, yjeVar);
                }
                Object obj3 = c8n0Var.i;
                Object obj4 = wne.f39444a;
                int i2 = c8n0Var.j;
                if (i2 == 0) {
                    z1x.P(obj3);
                    Object obj5 = (List) obj;
                    if (obj5 == null) {
                        throw new hr30();
                    }
                    c8n0Var.j = 1;
                    if (kmqVar.a(obj5, c8n0Var) == obj4) {
                        return obj4;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj3);
                }
                return Unit.f46060a;
            case 1:
                if (yjeVar instanceof f8n0) {
                    f8n0Var = (f8n0) yjeVar;
                    int i3 = f8n0Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        f8n0Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        f8n0Var = new f8n0(this, yjeVar);
                    }
                } else {
                    f8n0Var = new f8n0(this, yjeVar);
                }
                Object obj6 = f8n0Var.i;
                Object obj7 = wne.f39444a;
                int i4 = f8n0Var.j;
                if (i4 == 0) {
                    z1x.P(obj6);
                    Object obj8 = (List) obj;
                    if (obj8 == null) {
                        throw new hr30();
                    }
                    f8n0Var.j = 1;
                    if (kmqVar.a(obj8, f8n0Var) == obj7) {
                        return obj7;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj6);
                }
                return Unit.f46060a;
            case 2:
                if (yjeVar instanceof w9n0) {
                    w9n0Var = (w9n0) yjeVar;
                    int i5 = w9n0Var.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        w9n0Var.j = i5 - Integer.MIN_VALUE;
                    } else {
                        w9n0Var = new w9n0(this, yjeVar);
                    }
                } else {
                    w9n0Var = new w9n0(this, yjeVar);
                }
                Object obj9 = w9n0Var.i;
                Object obj10 = wne.f39444a;
                int i6 = w9n0Var.j;
                if (i6 == 0) {
                    z1x.P(obj9);
                    Object objL0 = CollectionsKt.L0(((Map) obj).values());
                    w9n0Var.j = 1;
                    if (kmqVar.a(objL0, w9n0Var) == obj10) {
                        return obj10;
                    }
                } else {
                    if (i6 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj9);
                }
                return Unit.f46060a;
            case 3:
                if (yjeVar instanceof mbn0) {
                    mbn0Var = (mbn0) yjeVar;
                    int i7 = mbn0Var.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        mbn0Var.j = i7 - Integer.MIN_VALUE;
                    } else {
                        mbn0Var = new mbn0(this, yjeVar);
                    }
                } else {
                    mbn0Var = new mbn0(this, yjeVar);
                }
                Object obj11 = mbn0Var.i;
                Object obj12 = wne.f39444a;
                int i8 = mbn0Var.j;
                if (i8 == 0) {
                    z1x.P(obj11);
                    Object objL1 = CollectionsKt.L0((Set) obj);
                    mbn0Var.j = 1;
                    if (kmqVar.a(objL1, mbn0Var) == obj12) {
                        return obj12;
                    }
                } else {
                    if (i8 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj11);
                }
                return Unit.f46060a;
            case 4:
                if (yjeVar instanceof pdn0) {
                    pdn0Var = (pdn0) yjeVar;
                    int i9 = pdn0Var.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        pdn0Var.j = i9 - Integer.MIN_VALUE;
                    } else {
                        pdn0Var = new pdn0(this, yjeVar);
                    }
                } else {
                    pdn0Var = new pdn0(this, yjeVar);
                }
                Object obj13 = pdn0Var.i;
                Object obj14 = wne.f39444a;
                int i10 = pdn0Var.j;
                if (i10 == 0) {
                    z1x.P(obj13);
                    Object w8n0Var = new w8n0((List) obj);
                    pdn0Var.j = 1;
                    if (kmqVar.a(w8n0Var, pdn0Var) == obj14) {
                        return obj14;
                    }
                } else {
                    if (i10 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj13);
                }
                return Unit.f46060a;
            case 5:
                if (yjeVar instanceof ten0) {
                    ten0Var = (ten0) yjeVar;
                    int i11 = ten0Var.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        ten0Var.j = i11 - Integer.MIN_VALUE;
                    } else {
                        ten0Var = new ten0(this, yjeVar);
                    }
                } else {
                    ten0Var = new ten0(this, yjeVar);
                }
                Object obj15 = ten0Var.i;
                Object obj16 = wne.f39444a;
                int i12 = ten0Var.j;
                if (i12 == 0) {
                    z1x.P(obj15);
                    Object w8n0Var2 = new w8n0((List) obj);
                    ten0Var.j = 1;
                    if (kmqVar.a(w8n0Var2, ten0Var) == obj16) {
                        return obj16;
                    }
                } else {
                    if (i12 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj15);
                }
                return Unit.f46060a;
            case 6:
                if (yjeVar instanceof ikn0) {
                    ikn0Var = (ikn0) yjeVar;
                    int i13 = ikn0Var.j;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        ikn0Var.j = i13 - Integer.MIN_VALUE;
                    } else {
                        ikn0Var = new ikn0(this, yjeVar);
                    }
                } else {
                    ikn0Var = new ikn0(this, yjeVar);
                }
                Object obj17 = ikn0Var.i;
                Object obj18 = wne.f39444a;
                int i14 = ikn0Var.j;
                if (i14 == 0) {
                    z1x.P(obj17);
                    qjn0 qjn0Var = (qjn0) obj;
                    qjn0Var.getClass();
                    Object sjn0Var = new sjn0(qjn0Var.f28848a, qjn0Var.b);
                    ikn0Var.j = 1;
                    if (kmqVar.a(sjn0Var, ikn0Var) == obj18) {
                        return obj18;
                    }
                } else {
                    if (i14 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj17);
                }
                return Unit.f46060a;
            case 7:
                if (yjeVar instanceof b0o0) {
                    b0o0Var = (b0o0) yjeVar;
                    int i15 = b0o0Var.j;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        b0o0Var.j = i15 - Integer.MIN_VALUE;
                    } else {
                        b0o0Var = new b0o0(this, yjeVar);
                    }
                } else {
                    b0o0Var = new b0o0(this, yjeVar);
                }
                Object obj19 = b0o0Var.i;
                Object obj20 = wne.f39444a;
                int i16 = b0o0Var.j;
                if (i16 == 0) {
                    z1x.P(obj19);
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        axq.t(((i5p) it.next()).f14203a, arrayList);
                    }
                    b0o0Var.j = 1;
                    if (kmqVar.a(arrayList, b0o0Var) == obj20) {
                        return obj20;
                    }
                } else {
                    if (i16 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj19);
                }
                return Unit.f46060a;
            case 8:
                if (yjeVar instanceof h0o0) {
                    h0o0Var = (h0o0) yjeVar;
                    int i17 = h0o0Var.j;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        h0o0Var.j = i17 - Integer.MIN_VALUE;
                    } else {
                        h0o0Var = new h0o0(this, yjeVar);
                    }
                } else {
                    h0o0Var = new h0o0(this, yjeVar);
                }
                Object obj21 = h0o0Var.i;
                Object obj22 = wne.f39444a;
                int i18 = h0o0Var.j;
                if (i18 == 0) {
                    z1x.P(obj21);
                    List list2 = (List) obj;
                    ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        axq.t(((k8p) it2.next()).f17883a, arrayList2);
                    }
                    h0o0Var.j = 1;
                    if (kmqVar.a(arrayList2, h0o0Var) == obj22) {
                        return obj22;
                    }
                } else {
                    if (i18 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj21);
                }
                return Unit.f46060a;
            case 9:
                if (yjeVar instanceof l0o0) {
                    l0o0Var = (l0o0) yjeVar;
                    int i19 = l0o0Var.j;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        l0o0Var.j = i19 - Integer.MIN_VALUE;
                    } else {
                        l0o0Var = new l0o0(this, yjeVar);
                    }
                } else {
                    l0o0Var = new l0o0(this, yjeVar);
                }
                Object obj23 = l0o0Var.i;
                Object obj24 = wne.f39444a;
                int i20 = l0o0Var.j;
                if (i20 == 0) {
                    z1x.P(obj23);
                    List list3 = (List) obj;
                    ArrayList arrayList3 = new ArrayList(r3d.q(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        axq.t(((xcp) it3.next()).f40657a, arrayList3);
                    }
                    l0o0Var.j = 1;
                    if (kmqVar.a(arrayList3, l0o0Var) == obj24) {
                        return obj24;
                    }
                } else {
                    if (i20 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj23);
                }
                return Unit.f46060a;
            case 10:
                if (yjeVar instanceof n1t0) {
                    n1t0Var = (n1t0) yjeVar;
                    int i21 = n1t0Var.j;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        n1t0Var.j = i21 - Integer.MIN_VALUE;
                    } else {
                        n1t0Var = new n1t0(this, yjeVar);
                    }
                } else {
                    n1t0Var = new n1t0(this, yjeVar);
                }
                Object obj25 = n1t0Var.i;
                Object obj26 = wne.f39444a;
                int i22 = n1t0Var.j;
                if (i22 == 0) {
                    z1x.P(obj25);
                    if (((String) obj).length() > 0) {
                        n1t0Var.j = 1;
                        if (kmqVar.a(obj, n1t0Var) == obj26) {
                            return obj26;
                        }
                    }
                } else {
                    if (i22 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj25);
                }
                return Unit.f46060a;
            case 11:
                if (yjeVar instanceof pco0) {
                    pco0Var = (pco0) yjeVar;
                    int i23 = pco0Var.j;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        pco0Var.j = i23 - Integer.MIN_VALUE;
                    } else {
                        pco0Var = new pco0(this, yjeVar);
                    }
                } else {
                    pco0Var = new pco0(this, yjeVar);
                }
                Object obj27 = pco0Var.i;
                Object obj28 = wne.f39444a;
                int i24 = pco0Var.j;
                if (i24 == 0) {
                    z1x.P(obj27);
                    if (!((Boolean) obj).booleanValue()) {
                        pco0Var.j = 1;
                        if (kmqVar.a(obj, pco0Var) == obj28) {
                            return obj28;
                        }
                    }
                } else {
                    if (i24 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj27);
                }
                return Unit.f46060a;
            case 12:
                if (yjeVar instanceof uco0) {
                    uco0Var = (uco0) yjeVar;
                    int i25 = uco0Var.j;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        uco0Var.j = i25 - Integer.MIN_VALUE;
                    } else {
                        uco0Var = new uco0(this, yjeVar);
                    }
                } else {
                    uco0Var = new uco0(this, yjeVar);
                }
                Object obj29 = uco0Var.i;
                Object obj30 = wne.f39444a;
                int i26 = uco0Var.j;
                if (i26 == 0) {
                    z1x.P(obj29);
                    ((Boolean) obj).getClass();
                    Object obj31 = Unit.f46060a;
                    uco0Var.j = 1;
                    if (kmqVar.a(obj31, uco0Var) == obj30) {
                        return obj30;
                    }
                } else {
                    if (i26 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj29);
                }
                return Unit.f46060a;
            case 13:
                if (yjeVar instanceof wco0) {
                    wco0Var = (wco0) yjeVar;
                    int i27 = wco0Var.j;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        wco0Var.j = i27 - Integer.MIN_VALUE;
                    } else {
                        wco0Var = new wco0(this, yjeVar);
                    }
                } else {
                    wco0Var = new wco0(this, yjeVar);
                }
                Object obj32 = wco0Var.i;
                Object obj33 = wne.f39444a;
                int i28 = wco0Var.j;
                if (i28 == 0) {
                    z1x.P(obj32);
                    tk60 tk60Var = (tk60) obj;
                    if (!Intrinsics.d(tk60Var, qk60.f28870a)) {
                        if (!(tk60Var instanceof rk60)) {
                            t9f.b();
                            return null;
                        }
                        Object obj34 = ((rk60) tk60Var).b;
                        if (obj34 != null) {
                            obj2 = obj34;
                        }
                    }
                    wco0Var.j = 1;
                    if (kmqVar.a(obj2, wco0Var) == obj33) {
                        return obj33;
                    }
                } else {
                    if (i28 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj32);
                }
                return Unit.f46060a;
            case 14:
                if (yjeVar instanceof lgo0) {
                    lgo0Var = (lgo0) yjeVar;
                    int i29 = lgo0Var.j;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        lgo0Var.j = i29 - Integer.MIN_VALUE;
                    } else {
                        lgo0Var = new lgo0(this, yjeVar);
                    }
                } else {
                    lgo0Var = new lgo0(this, yjeVar);
                }
                Object obj35 = lgo0Var.i;
                Object obj36 = wne.f39444a;
                int i30 = lgo0Var.j;
                if (i30 == 0) {
                    z1x.P(obj35);
                    Object objA0 = CollectionsKt.A0((List) obj, new tgo0(objArr == true ? 1 : 0));
                    lgo0Var.j = 1;
                    if (kmqVar.a(objA0, lgo0Var) == obj36) {
                        return obj36;
                    }
                } else {
                    if (i30 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj35);
                }
                return Unit.f46060a;
            case 15:
                if (yjeVar instanceof aho0) {
                    aho0Var = (aho0) yjeVar;
                    int i31 = aho0Var.j;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        aho0Var.j = i31 - Integer.MIN_VALUE;
                    } else {
                        aho0Var = new aho0(this, yjeVar);
                    }
                } else {
                    aho0Var = new aho0(this, yjeVar);
                }
                Object obj37 = aho0Var.i;
                Object obj38 = wne.f39444a;
                int i32 = aho0Var.j;
                if (i32 == 0) {
                    z1x.P(obj37);
                    if (obj instanceof ab50) {
                        aho0Var.j = 1;
                        if (kmqVar.a(obj, aho0Var) == obj38) {
                            return obj38;
                        }
                    }
                } else {
                    if (i32 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj37);
                }
                return Unit.f46060a;
            case 16:
                if (yjeVar instanceof eio0) {
                    eio0Var = (eio0) yjeVar;
                    int i33 = eio0Var.j;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        eio0Var.j = i33 - Integer.MIN_VALUE;
                    } else {
                        eio0Var = new eio0(this, yjeVar);
                    }
                } else {
                    eio0Var = new eio0(this, yjeVar);
                }
                Object obj39 = eio0Var.i;
                Object obj40 = wne.f39444a;
                int i34 = eio0Var.j;
                if (i34 == 0) {
                    z1x.P(obj39);
                    Object objA1 = CollectionsKt.A0((List) obj, new tgo0(b2));
                    eio0Var.j = 1;
                    if (kmqVar.a(objA1, eio0Var) == obj40) {
                        return obj40;
                    }
                } else {
                    if (i34 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj39);
                }
                return Unit.f46060a;
            case 17:
                if (yjeVar instanceof nio0) {
                    nio0Var = (nio0) yjeVar;
                    int i35 = nio0Var.j;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        nio0Var.j = i35 - Integer.MIN_VALUE;
                    } else {
                        nio0Var = new nio0(this, yjeVar);
                    }
                } else {
                    nio0Var = new nio0(this, yjeVar);
                }
                Object obj41 = nio0Var.i;
                Object obj42 = wne.f39444a;
                int i36 = nio0Var.j;
                if (i36 == 0) {
                    z1x.P(obj41);
                    if (obj instanceof ab50) {
                        nio0Var.j = 1;
                        if (kmqVar.a(obj, nio0Var) == obj42) {
                            return obj42;
                        }
                    }
                } else {
                    if (i36 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj41);
                }
                return Unit.f46060a;
            case 18:
                if (yjeVar instanceof trp0) {
                    trp0Var = (trp0) yjeVar;
                    int i37 = trp0Var.j;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        trp0Var.j = i37 - Integer.MIN_VALUE;
                    } else {
                        trp0Var = new trp0(this, yjeVar);
                    }
                } else {
                    trp0Var = new trp0(this, yjeVar);
                }
                Object obj43 = trp0Var.i;
                Object obj44 = wne.f39444a;
                int i38 = trp0Var.j;
                if (i38 == 0) {
                    z1x.P(obj43);
                    if (obj instanceof crp0) {
                        trp0Var.j = 1;
                        if (kmqVar.a(obj, trp0Var) == obj44) {
                            return obj44;
                        }
                    }
                } else {
                    if (i38 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj43);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                if (yjeVar instanceof qwp0) {
                    qwp0Var = (qwp0) yjeVar;
                    int i39 = qwp0Var.j;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        qwp0Var.j = i39 - Integer.MIN_VALUE;
                    } else {
                        qwp0Var = new qwp0(this, yjeVar);
                    }
                } else {
                    qwp0Var = new qwp0(this, yjeVar);
                }
                Object obj45 = qwp0Var.i;
                Object obj46 = wne.f39444a;
                int i40 = qwp0Var.j;
                if (i40 == 0) {
                    z1x.P(obj45);
                    Object obj47 = ((Pair) obj).b;
                    qwp0Var.j = 1;
                    if (kmqVar.a(obj47, qwp0Var) == obj46) {
                        return obj46;
                    }
                } else {
                    if (i40 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj45);
                }
                return Unit.f46060a;
            case 20:
                if (yjeVar instanceof d2q0) {
                    d2q0Var = (d2q0) yjeVar;
                    int i41 = d2q0Var.j;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        d2q0Var.j = i41 - Integer.MIN_VALUE;
                    } else {
                        d2q0Var = new d2q0(this, yjeVar);
                    }
                } else {
                    d2q0Var = new d2q0(this, yjeVar);
                }
                Object obj48 = d2q0Var.i;
                Object obj49 = wne.f39444a;
                int i42 = d2q0Var.j;
                if (i42 == 0) {
                    z1x.P(obj48);
                    d2q0Var.j = 1;
                    if (kmqVar.a(a2q0.f136a, d2q0Var) == obj49) {
                        return obj49;
                    }
                } else {
                    if (i42 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj48);
                }
                return Unit.f46060a;
            case 21:
                if (yjeVar instanceof mbq0) {
                    mbq0Var = (mbq0) yjeVar;
                    int i43 = mbq0Var.j;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        mbq0Var.j = i43 - Integer.MIN_VALUE;
                    } else {
                        mbq0Var = new mbq0(this, yjeVar);
                    }
                } else {
                    mbq0Var = new mbq0(this, yjeVar);
                }
                Object obj50 = mbq0Var.i;
                Object obj51 = wne.f39444a;
                int i44 = mbq0Var.j;
                if (i44 == 0) {
                    z1x.P(obj50);
                    if (!(((jbq0) obj) instanceof hbq0)) {
                        mbq0Var.j = 1;
                        if (kmqVar.a(obj, mbq0Var) == obj51) {
                            return obj51;
                        }
                    }
                } else {
                    if (i44 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj50);
                }
                return Unit.f46060a;
            case 22:
                if (yjeVar instanceof utq0) {
                    utq0Var = (utq0) yjeVar;
                    int i45 = utq0Var.j;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        utq0Var.j = i45 - Integer.MIN_VALUE;
                    } else {
                        utq0Var = new utq0(this, yjeVar);
                    }
                } else {
                    utq0Var = new utq0(this, yjeVar);
                }
                Object obj52 = utq0Var.i;
                Object obj53 = wne.f39444a;
                int i46 = utq0Var.j;
                if (i46 == 0) {
                    z1x.P(obj52);
                    if (obj instanceof ab50) {
                        utq0Var.j = 1;
                        if (kmqVar.a(obj, utq0Var) == obj53) {
                            return obj53;
                        }
                    }
                } else {
                    if (i46 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj52);
                }
                return Unit.f46060a;
            case 23:
                if (yjeVar instanceof fkr0) {
                    fkr0Var = (fkr0) yjeVar;
                    int i47 = fkr0Var.j;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        fkr0Var.j = i47 - Integer.MIN_VALUE;
                    } else {
                        fkr0Var = new fkr0(this, yjeVar);
                    }
                } else {
                    fkr0Var = new fkr0(this, yjeVar);
                }
                Object obj54 = fkr0Var.i;
                Object obj55 = wne.f39444a;
                int i48 = fkr0Var.j;
                if (i48 == 0) {
                    z1x.P(obj54);
                    for (Object obj56 : (List) obj) {
                        if (((lmr0) obj56).d) {
                            obj2 = obj56;
                            lmr0Var = (lmr0) obj2;
                            if (lmr0Var == null) {
                                lmr0Var = new lmr0(0, "", ulr0.NONE, false);
                            }
                            fkr0Var.j = 1;
                            if (kmqVar.a(lmr0Var, fkr0Var) == obj55) {
                                return obj55;
                            }
                        }
                    }
                    lmr0Var = (lmr0) obj2;
                    if (lmr0Var == null) {
                        lmr0Var = new lmr0(0, "", ulr0.NONE, false);
                    }
                    fkr0Var.j = 1;
                    if (kmqVar.a(lmr0Var, fkr0Var) == obj55) {
                        return obj55;
                    }
                } else {
                    if (i48 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj54);
                }
                return Unit.f46060a;
            case 24:
                if (yjeVar instanceof rnt0) {
                    rnt0Var = (rnt0) yjeVar;
                    int i49 = rnt0Var.j;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        rnt0Var.j = i49 - Integer.MIN_VALUE;
                    } else {
                        rnt0Var = new rnt0(this, yjeVar);
                    }
                } else {
                    rnt0Var = new rnt0(this, yjeVar);
                }
                Object obj57 = rnt0Var.i;
                Object obj58 = wne.f39444a;
                int i50 = rnt0Var.j;
                if (i50 == 0) {
                    z1x.P(obj57);
                    if (((Boolean) obj).booleanValue()) {
                        rnt0Var.j = 1;
                        if (kmqVar.a(obj, rnt0Var) == obj58) {
                            return obj58;
                        }
                    }
                } else {
                    if (i50 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj57);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                if (yjeVar instanceof qrt0) {
                    qrt0Var = (qrt0) yjeVar;
                    int i51 = qrt0Var.j;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        qrt0Var.j = i51 - Integer.MIN_VALUE;
                    } else {
                        qrt0Var = new qrt0(this, yjeVar);
                    }
                } else {
                    qrt0Var = new qrt0(this, yjeVar);
                }
                Object obj59 = qrt0Var.i;
                Object obj60 = wne.f39444a;
                int i52 = qrt0Var.j;
                if (i52 == 0) {
                    z1x.P(obj59);
                    Object objValueOf = Boolean.valueOf(((sw00) obj).f32897a);
                    qrt0Var.j = 1;
                    if (kmqVar.a(objValueOf, qrt0Var) == obj60) {
                        return obj60;
                    }
                } else {
                    if (i52 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj59);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                if (yjeVar instanceof rzt0) {
                    rzt0Var = (rzt0) yjeVar;
                    int i53 = rzt0Var.j;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        rzt0Var.j = i53 - Integer.MIN_VALUE;
                    } else {
                        rzt0Var = new rzt0(this, yjeVar);
                    }
                } else {
                    rzt0Var = new rzt0(this, yjeVar);
                }
                Object obj61 = rzt0Var.i;
                Object obj62 = wne.f39444a;
                int i54 = rzt0Var.j;
                if (i54 == 0) {
                    z1x.P(obj61);
                    Object objO0 = kpb.o0((bqr) obj, false);
                    rzt0Var.j = 1;
                    if (kmqVar.a(objO0, rzt0Var) == obj62) {
                        return obj62;
                    }
                } else {
                    if (i54 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj61);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                if (yjeVar instanceof f7u0) {
                    f7u0Var = (f7u0) yjeVar;
                    int i55 = f7u0Var.j;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        f7u0Var.j = i55 - Integer.MIN_VALUE;
                    } else {
                        f7u0Var = new f7u0(this, yjeVar);
                    }
                } else {
                    f7u0Var = new f7u0(this, yjeVar);
                }
                Object obj63 = f7u0Var.i;
                Object obj64 = wne.f39444a;
                int i56 = f7u0Var.j;
                if (i56 == 0) {
                    z1x.P(obj63);
                    u6u0 u6u0Var = (u6u0) obj;
                    u6u0Var.getClass();
                    boolean z = u6u0Var.d;
                    List list4 = u6u0Var.f35155a;
                    Object a7u0Var = z ? c7u0.f3881a : !list4.isEmpty() ? new a7u0(list4) : new b7u0(u6u0Var.b);
                    f7u0Var.j = 1;
                    if (kmqVar.a(a7u0Var, f7u0Var) == obj64) {
                        return obj64;
                    }
                } else {
                    if (i56 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj63);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                if (yjeVar instanceof leu0) {
                    leu0Var = (leu0) yjeVar;
                    int i57 = leu0Var.j;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        leu0Var.j = i57 - Integer.MIN_VALUE;
                    } else {
                        leu0Var = new leu0(this, yjeVar);
                    }
                } else {
                    leu0Var = new leu0(this, yjeVar);
                }
                Object obj65 = leu0Var.i;
                Object obj66 = wne.f39444a;
                int i58 = leu0Var.j;
                if (i58 == 0) {
                    z1x.P(obj65);
                    Object objValueOf2 = Boolean.valueOf(((Number) obj).longValue() >= 180);
                    leu0Var.j = 1;
                    if (kmqVar.a(objValueOf2, leu0Var) == obj66) {
                        return obj66;
                    }
                } else {
                    if (i58 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj65);
                }
                return Unit.f46060a;
            default:
                e7a e7aVar = (e7a) obj;
                return ((e7aVar instanceof c7a) && (objA = kmqVar.a(((c7a) e7aVar).f3852a, yjeVar)) == wne.f39444a) ? objA : Unit.f46060a;
        }
    }

    public /* synthetic */ d8n0(kmq kmqVar, byte b) {
        this.f5659a = b;
        this.b = kmqVar;
    }
}
