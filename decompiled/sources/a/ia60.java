package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class ia60 implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14422a;
    public final /* synthetic */ i89 b;
    public final /* synthetic */ long c;

    public /* synthetic */ ia60(i89 i89Var, long j, byte b) {
        this.f14422a = b;
        this.b = i89Var;
        this.c = j;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        ga60 ga60Var;
        la60 la60Var;
        byte b = this.f14422a;
        long j = this.c;
        i89 i89Var = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof ga60) {
                    ga60Var = (ga60) yjeVar;
                    int i = ga60Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ga60Var.j = i - Integer.MIN_VALUE;
                    } else {
                        ga60Var = new ga60(this, yjeVar);
                    }
                } else {
                    ga60Var = new ga60(this, yjeVar);
                }
                Object obj = ga60Var.i;
                wne wneVar = wne.f39444a;
                int i2 = ga60Var.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    s7h s7hVar = new s7h(kmqVar, j, (byte) 9);
                    ga60Var.j = 1;
                    if (i89Var.c(s7hVar, ga60Var) == wneVar) {
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
                if (yjeVar instanceof la60) {
                    la60Var = (la60) yjeVar;
                    int i3 = la60Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        la60Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        la60Var = new la60(this, yjeVar);
                    }
                } else {
                    la60Var = new la60(this, yjeVar);
                }
                Object obj2 = la60Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = la60Var.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    s7h s7hVar2 = new s7h(kmqVar, j, (byte) 10);
                    la60Var.j = 1;
                    if (i89Var.c(s7hVar2, la60Var) == wneVar2) {
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
