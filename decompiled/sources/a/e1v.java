package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class e1v implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7055a;
    public final /* synthetic */ acu b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ lie0 d;
    public final /* synthetic */ hie0 e;

    public /* synthetic */ e1v(acu acuVar, Object obj, lie0 lie0Var, hie0 hie0Var, byte b) {
        this.f7055a = b;
        this.b = acuVar;
        this.c = obj;
        this.d = lie0Var;
        this.e = hie0Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        b1v b1vVar;
        t1v t1vVar;
        byte b = this.f7055a;
        acu acuVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof b1v) {
                    b1vVar = (b1v) yjeVar;
                    int i = b1vVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        b1vVar.j = i - Integer.MIN_VALUE;
                    } else {
                        b1vVar = new b1v(this, yjeVar);
                    }
                } else {
                    b1vVar = new b1v(this, yjeVar);
                }
                Object obj = b1vVar.i;
                wne wneVar = wne.f39444a;
                int i2 = b1vVar.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    d1v d1vVar = new d1v((byte) 0, kmqVar, this.e, this.d, this.c);
                    b1vVar.j = 1;
                    if (acuVar.c(d1vVar, b1vVar) == wneVar) {
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
                if (yjeVar instanceof t1v) {
                    t1vVar = (t1v) yjeVar;
                    int i3 = t1vVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        t1vVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        t1vVar = new t1v(this, yjeVar);
                    }
                } else {
                    t1vVar = new t1v(this, yjeVar);
                }
                Object obj2 = t1vVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = t1vVar.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    d1v d1vVar2 = new d1v((byte) 1, kmqVar, this.e, this.d, this.c);
                    t1vVar.j = 1;
                    if (acuVar.c(d1vVar2, t1vVar) == wneVar2) {
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
