package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class rzq0 implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31376a;
    public final /* synthetic */ vsg0 b;
    public final /* synthetic */ cyu c;
    public final /* synthetic */ hie0 d;
    public final /* synthetic */ List e;

    public /* synthetic */ rzq0(vsg0 vsg0Var, cyu cyuVar, hie0 hie0Var, List list, byte b) {
        this.f31376a = b;
        this.b = vsg0Var;
        this.c = cyuVar;
        this.d = hie0Var;
        this.e = list;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        ozq0 ozq0Var;
        tzq0 tzq0Var;
        byte b = this.f31376a;
        vsg0 vsg0Var = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof ozq0) {
                    ozq0Var = (ozq0) yjeVar;
                    int i = ozq0Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ozq0Var.j = i - Integer.MIN_VALUE;
                    } else {
                        ozq0Var = new ozq0(this, yjeVar);
                    }
                } else {
                    ozq0Var = new ozq0(this, yjeVar);
                }
                Object obj = ozq0Var.i;
                wne wneVar = wne.f39444a;
                int i2 = ozq0Var.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    qzq0 qzq0Var = new qzq0(kmqVar, this.c, this.d, this.e, (byte) 0);
                    ozq0Var.j = 1;
                    if (vsg0Var.c(qzq0Var, ozq0Var) == wneVar) {
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
                if (yjeVar instanceof tzq0) {
                    tzq0Var = (tzq0) yjeVar;
                    int i3 = tzq0Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        tzq0Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        tzq0Var = new tzq0(this, yjeVar);
                    }
                } else {
                    tzq0Var = new tzq0(this, yjeVar);
                }
                Object obj2 = tzq0Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = tzq0Var.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    qzq0 qzq0Var2 = new qzq0(kmqVar, this.c, this.d, this.e, (byte) 1);
                    tzq0Var.j = 1;
                    if (vsg0Var.c(qzq0Var2, tzq0Var) == wneVar2) {
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
