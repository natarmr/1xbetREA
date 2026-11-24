package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class m360 implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21098a;
    public final /* synthetic */ fnq b;
    public final /* synthetic */ rz50 c;

    public /* synthetic */ m360(fnq fnqVar, rz50 rz50Var, byte b) {
        this.f21098a = b;
        this.b = fnqVar;
        this.c = rz50Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        j360 j360Var;
        o360 o360Var;
        byte b = this.f21098a;
        rz50 rz50Var = this.c;
        fnq fnqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof j360) {
                    j360Var = (j360) yjeVar;
                    int i = j360Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        j360Var.j = i - Integer.MIN_VALUE;
                    } else {
                        j360Var = new j360(this, yjeVar);
                    }
                } else {
                    j360Var = new j360(this, yjeVar);
                }
                Object obj = j360Var.i;
                wne wneVar = wne.f39444a;
                int i2 = j360Var.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    l360 l360Var = new l360(kmqVar, rz50Var, (byte) 0);
                    j360Var.j = 1;
                    if (fnqVar.c(l360Var, j360Var) == wneVar) {
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
                if (yjeVar instanceof o360) {
                    o360Var = (o360) yjeVar;
                    int i3 = o360Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        o360Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        o360Var = new o360(this, yjeVar);
                    }
                } else {
                    o360Var = new o360(this, yjeVar);
                }
                Object obj2 = o360Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = o360Var.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    l360 l360Var2 = new l360(kmqVar, rz50Var, (byte) 1);
                    o360Var.j = 1;
                    if (fnqVar.c(l360Var2, o360Var) == wneVar2) {
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
