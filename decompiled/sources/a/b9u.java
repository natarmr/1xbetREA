package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class b9u extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ kmq k;
    public /* synthetic */ Object l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9u(yje yjeVar, boolean z, wdu wduVar, boolean z2) {
        super(3, yjeVar);
        this.i = (byte) 4;
        this.m = z;
        this.o = wduVar;
        this.n = z2;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        Object obj4 = this.o;
        kmq kmqVar = (kmq) obj;
        switch (b) {
            case 0:
                byte b2 = 0;
                b9u b9uVar = new b9u(b2, (yje) obj3, (ali) obj4, this.m, this.n);
                b9uVar.k = kmqVar;
                b9uVar.l = obj2;
                return b9uVar.invokeSuspend(Unit.f46060a);
            case 1:
                byte b3 = 1;
                b9u b9uVar2 = new b9u(b3, (yje) obj3, (f7u) obj4, this.m, this.n);
                b9uVar2.k = kmqVar;
                b9uVar2.l = obj2;
                return b9uVar2.invokeSuspend(Unit.f46060a);
            case 2:
                byte b4 = 2;
                b9u b9uVar3 = new b9u(b4, (yje) obj3, (a6u) obj4, this.m, this.n);
                b9uVar3.k = kmqVar;
                b9uVar3.l = obj2;
                return b9uVar3.invokeSuspend(Unit.f46060a);
            case 3:
                byte b5 = 3;
                b9u b9uVar4 = new b9u(b5, (yje) obj3, (nr) obj4, this.m, this.n);
                b9uVar4.k = kmqVar;
                b9uVar4.l = obj2;
                return b9uVar4.invokeSuspend(Unit.f46060a);
            case 4:
                boolean z = this.n;
                b9u b9uVar5 = new b9u((yje) obj3, this.m, (wdu) obj4, z);
                b9uVar5.k = kmqVar;
                b9uVar5.l = obj2;
                return b9uVar5.invokeSuspend(Unit.f46060a);
            case 5:
                byte b6 = 5;
                b9u b9uVar6 = new b9u(b6, (yje) obj3, (ywq0) obj4, this.m, this.n);
                b9uVar6.k = kmqVar;
                b9uVar6.l = obj2;
                return b9uVar6.invokeSuspend(Unit.f46060a);
            case 6:
                byte b7 = 6;
                b9u b9uVar7 = new b9u(b7, (yje) obj3, (qgd) obj4, this.m, this.n);
                b9uVar7.k = kmqVar;
                b9uVar7.l = obj2;
                return b9uVar7.invokeSuspend(Unit.f46060a);
            case 7:
                byte b8 = 7;
                b9u b9uVar8 = new b9u(b8, (yje) obj3, (a6u) obj4, this.m, this.n);
                b9uVar8.k = kmqVar;
                b9uVar8.l = obj2;
                return b9uVar8.invokeSuspend(Unit.f46060a);
            default:
                byte b9 = 8;
                b9u b9uVar9 = new b9u(b9, (yje) obj3, (pzu) obj4, this.m, this.n);
                b9uVar9.k = kmqVar;
                b9uVar9.l = obj2;
                return b9uVar9.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        boolean z = this.n;
        boolean z2 = this.m;
        Object obj2 = this.o;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    kmq kmqVar = this.k;
                    acu acuVarK = ((v7i) ((ali) obj2).d).k((List) this.l, z2, z);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar, acuVarK, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    kmq kmqVar2 = this.k;
                    acu acuVarK2 = ((v7i) ((f7u) obj2).e).k((List) this.l, z2, z);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar2, acuVarK2, this) == wneVar2) {
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
                    kmq kmqVar3 = this.k;
                    pvp pvpVar = (pvp) this.l;
                    ewt ewtVar = new ewt(((v7i) ((a6u) obj2).e).k(pvpVar.f27673a, z2, z), pvpVar, (byte) 5);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar3, ewtVar, this) == wneVar3) {
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
                wne wneVar4 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    kmq kmqVar4 = this.k;
                    List list = (List) this.l;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        w3d.u(arrayList, ((idb) it.next()).b);
                    }
                    yot yotVar = new yot(((v7i) ((nr) obj2).c).k(arrayList, z2, z), list, (byte) 1);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar4, yotVar, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                kmq kmqVar5 = this.k;
                Object obj3 = this.l;
                wne wneVar5 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    List list2 = (List) obj3;
                    utb utbVarC = aoq.c(z2 ? new vsg0(new fhq(list2, yjeVar, (byte) 11)) : new eu4(list2, (byte) 12), new xpp(yjeVar, obj2, z, (byte) 7));
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar5, utbVarC, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    kmq kmqVar6 = this.k;
                    acu acuVarK3 = ((v7i) ((ywq0) obj2).e).k((List) this.l, z2, z);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar6, acuVarK3, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    kmq kmqVar7 = this.k;
                    acu acuVarK4 = ((v7i) ((qgd) obj2).f).k((List) this.l, z2, z);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar7, acuVarK4, this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    kmq kmqVar8 = this.k;
                    acu acuVarK5 = ((v7i) ((a6u) obj2).f).k((List) this.l, z2, z);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar8, acuVarK5, this) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar9 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    kmq kmqVar9 = this.k;
                    acu acuVarK6 = ((v7i) ((pzu) obj2).e).k((List) this.l, z2, z);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar9, acuVarK6, this) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b9u(byte b, yje yjeVar, Object obj, boolean z, boolean z2) {
        super(3, yjeVar);
        this.i = b;
        this.o = obj;
        this.m = z;
        this.n = z2;
    }
}
