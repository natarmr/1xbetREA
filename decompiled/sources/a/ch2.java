package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class ch2 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4342a;
    public final /* synthetic */ kmq b;
    public final /* synthetic */ Throwable c;

    public /* synthetic */ ch2(kmq kmqVar, Throwable th, byte b) {
        this.f4342a = b;
        this.b = kmqVar;
        this.c = th;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:41:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        bh2 bh2Var;
        li2 li2Var;
        tl2 tl2Var;
        v260 v260Var;
        byte b = this.f4342a;
        Throwable th = this.c;
        kmq kmqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof bh2) {
                    bh2Var = (bh2) yjeVar;
                    int i = bh2Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        bh2Var.j = i - Integer.MIN_VALUE;
                    } else {
                        bh2Var = new bh2(this, yjeVar);
                    }
                } else {
                    bh2Var = new bh2(this, yjeVar);
                }
                Object obj2 = bh2Var.i;
                wne wneVar = wne.f39444a;
                int i2 = bh2Var.j;
                if (i2 == 0) {
                    z1x.P(obj2);
                    gat gatVar = new gat(th, (List) obj);
                    bh2Var.j = 1;
                    if (kmqVar.a(gatVar, bh2Var) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj2);
                }
                return Unit.f46060a;
            case 1:
                if (yjeVar instanceof li2) {
                    li2Var = (li2) yjeVar;
                    int i3 = li2Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        li2Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        li2Var = new li2(this, yjeVar);
                    }
                } else {
                    li2Var = new li2(this, yjeVar);
                }
                Object obj3 = li2Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = li2Var.j;
                if (i4 == 0) {
                    z1x.P(obj3);
                    eqp0 eqp0Var = new eqp0(th, (List) obj);
                    li2Var.j = 1;
                    if (kmqVar.a(eqp0Var, li2Var) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj3);
                }
                return Unit.f46060a;
            case 2:
                if (yjeVar instanceof tl2) {
                    tl2Var = (tl2) yjeVar;
                    int i5 = tl2Var.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        tl2Var.j = i5 - Integer.MIN_VALUE;
                    } else {
                        tl2Var = new tl2(this, yjeVar);
                    }
                } else {
                    tl2Var = new tl2(this, yjeVar);
                }
                Object obj4 = tl2Var.i;
                wne wneVar3 = wne.f39444a;
                int i6 = tl2Var.j;
                if (i6 == 0) {
                    z1x.P(obj4);
                    eds0 eds0Var = new eds0(th, (List) obj);
                    tl2Var.j = 1;
                    if (kmqVar.a(eds0Var, tl2Var) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (i6 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj4);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof v260) {
                    v260Var = (v260) yjeVar;
                    int i7 = v260Var.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        v260Var.j = i7 - Integer.MIN_VALUE;
                    } else {
                        v260Var = new v260(this, yjeVar);
                    }
                } else {
                    v260Var = new v260(this, yjeVar);
                }
                Object obj5 = v260Var.i;
                wne wneVar4 = wne.f39444a;
                int i8 = v260Var.j;
                if (i8 == 0) {
                    z1x.P(obj5);
                    qz50 qz50Var = new qz50(th, (List) obj);
                    v260Var.j = 1;
                    if (kmqVar.a(qz50Var, v260Var) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (i8 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj5);
                }
                return Unit.f46060a;
        }
    }
}
