package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class j5z implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15958a;
    public final /* synthetic */ vsg0 b;
    public final /* synthetic */ long c;

    public /* synthetic */ j5z(vsg0 vsg0Var, long j, byte b) {
        this.f15958a = b;
        this.b = vsg0Var;
        this.c = j;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        h5z h5zVar;
        k5z k5zVar;
        byte b = this.f15958a;
        long j = this.c;
        vsg0 vsg0Var = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof h5z) {
                    h5zVar = (h5z) yjeVar;
                    int i = h5zVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        h5zVar.j = i - Integer.MIN_VALUE;
                    } else {
                        h5zVar = new h5z(this, yjeVar);
                    }
                } else {
                    h5zVar = new h5z(this, yjeVar);
                }
                Object obj = h5zVar.i;
                wne wneVar = wne.f39444a;
                int i2 = h5zVar.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    s7h s7hVar = new s7h(kmqVar, j, (byte) 7);
                    h5zVar.j = 1;
                    if (vsg0Var.c(s7hVar, h5zVar) == wneVar) {
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
                if (yjeVar instanceof k5z) {
                    k5zVar = (k5z) yjeVar;
                    int i3 = k5zVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        k5zVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        k5zVar = new k5z(this, yjeVar);
                    }
                } else {
                    k5zVar = new k5z(this, yjeVar);
                }
                Object obj2 = k5zVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = k5zVar.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    s7h s7hVar2 = new s7h(kmqVar, j, (byte) 8);
                    k5zVar.j = 1;
                    if (vsg0Var.c(s7hVar2, k5zVar) == wneVar2) {
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
