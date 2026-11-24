package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class p1v implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26223a;
    public final /* synthetic */ i89 b;
    public final /* synthetic */ hie0 c;

    public /* synthetic */ p1v(i89 i89Var, hie0 hie0Var, byte b) {
        this.f26223a = b;
        this.b = i89Var;
        this.c = hie0Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        n1v n1vVar;
        b2v b2vVar;
        byte b = this.f26223a;
        hie0 hie0Var = this.c;
        i89 i89Var = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof n1v) {
                    n1vVar = (n1v) yjeVar;
                    int i = n1vVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        n1vVar.j = i - Integer.MIN_VALUE;
                    } else {
                        n1vVar = new n1v(this, yjeVar);
                    }
                } else {
                    n1vVar = new n1v(this, yjeVar);
                }
                Object obj = n1vVar.i;
                wne wneVar = wne.f39444a;
                int i2 = n1vVar.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    pqu pquVar = new pqu(kmqVar, hie0Var, (byte) 13);
                    n1vVar.j = 1;
                    if (i89Var.c(pquVar, n1vVar) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof b2v) {
                    b2vVar = (b2v) yjeVar;
                    int i3 = b2vVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        b2vVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        b2vVar = new b2v(this, yjeVar);
                    }
                } else {
                    b2vVar = new b2v(this, yjeVar);
                }
                Object obj2 = b2vVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = b2vVar.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    pqu pquVar2 = new pqu(kmqVar, hie0Var, (byte) 15);
                    b2vVar.j = 1;
                    if (i89Var.c(pquVar2, b2vVar) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj2);
                }
                return Unit.f46060a;
        }
    }
}
