package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class dh2 implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6073a;
    public final /* synthetic */ gmq b;
    public final /* synthetic */ Throwable c;

    public /* synthetic */ dh2(gmq gmqVar, Throwable th, byte b) {
        this.f6073a = b;
        this.b = gmqVar;
        this.c = th;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        ah2 ah2Var;
        sl2 sl2Var;
        byte b = this.f6073a;
        Throwable th = this.c;
        gmq gmqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof ah2) {
                    ah2Var = (ah2) yjeVar;
                    int i = ah2Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ah2Var.j = i - Integer.MIN_VALUE;
                    } else {
                        ah2Var = new ah2(this, yjeVar);
                    }
                } else {
                    ah2Var = new ah2(this, yjeVar);
                }
                Object obj = ah2Var.i;
                wne wneVar = wne.f39444a;
                int i2 = ah2Var.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    ch2 ch2Var = new ch2(kmqVar, th, (byte) 0);
                    ah2Var.j = 1;
                    if (gmqVar.c(ch2Var, ah2Var) == wneVar) {
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
                if (yjeVar instanceof sl2) {
                    sl2Var = (sl2) yjeVar;
                    int i3 = sl2Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        sl2Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        sl2Var = new sl2(this, yjeVar);
                    }
                } else {
                    sl2Var = new sl2(this, yjeVar);
                }
                Object obj2 = sl2Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = sl2Var.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    ch2 ch2Var2 = new ch2(kmqVar, th, (byte) 2);
                    sl2Var.j = 1;
                    if (gmqVar.c(ch2Var2, sl2Var) == wneVar2) {
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
