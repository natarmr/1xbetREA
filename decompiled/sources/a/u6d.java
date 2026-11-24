package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class u6d implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35132a;
    public final /* synthetic */ hzb0 b;

    public /* synthetic */ u6d(hzb0 hzb0Var, byte b) {
        this.f35132a = b;
        this.b = hzb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        t6d t6dVar;
        xmq xmqVar;
        byte b = this.f35132a;
        pfw pfwVar = k860.f17859a;
        hzb0 hzb0Var = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof t6d) {
                    t6dVar = (t6d) yjeVar;
                    int i = t6dVar.k;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        t6dVar.k = i - Integer.MIN_VALUE;
                    } else {
                        t6dVar = new t6d(this, yjeVar);
                    }
                } else {
                    t6dVar = new t6d(this, yjeVar);
                }
                Object obj2 = t6dVar.i;
                wne wneVar = wne.f39444a;
                int i2 = t6dVar.k;
                if (i2 == 0) {
                    z1x.P(obj2);
                    hzb0Var.getClass();
                    if (obj == null) {
                        obj = pfwVar;
                    }
                    t6dVar.k = 1;
                    if (hzb0Var.e.m(t6dVar, obj) == wneVar) {
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
                Object objM = hzb0Var.e.m(yjeVar, obj);
                return objM == wne.f39444a ? objM : Unit.f46060a;
            default:
                if (yjeVar instanceof xmq) {
                    xmqVar = (xmq) yjeVar;
                    int i3 = xmqVar.k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        xmqVar.k = i3 - Integer.MIN_VALUE;
                    } else {
                        xmqVar = new xmq(this, yjeVar);
                    }
                } else {
                    xmqVar = new xmq(this, yjeVar);
                }
                Object obj3 = xmqVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = xmqVar.k;
                if (i4 == 0) {
                    z1x.P(obj3);
                    if (obj == null) {
                        obj = pfwVar;
                    }
                    xmqVar.k = 1;
                    if (hzb0Var.e.m(xmqVar, obj) == wneVar2) {
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
        }
    }
}
