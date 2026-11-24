package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class bhg implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2604a;
    public final /* synthetic */ p7m0 b;
    public final /* synthetic */ sip c;

    public /* synthetic */ bhg(p7m0 p7m0Var, sip sipVar, byte b) {
        this.f2604a = b;
        this.b = p7m0Var;
        this.c = sipVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        ygg yggVar;
        pch pchVar;
        byte b = this.f2604a;
        sip sipVar = this.c;
        p7m0 p7m0Var = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof ygg) {
                    yggVar = (ygg) yjeVar;
                    int i = yggVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        yggVar.j = i - Integer.MIN_VALUE;
                    } else {
                        yggVar = new ygg(this, yjeVar);
                    }
                } else {
                    yggVar = new ygg(this, yjeVar);
                }
                Object obj = yggVar.i;
                wne wneVar = wne.f39444a;
                int i2 = yggVar.j;
                if (i2 != 0) {
                    if (i2 == 1) {
                        z1x.P(obj);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                ahg ahgVar = new ahg(kmqVar, sipVar, (byte) 0);
                yggVar.j = 1;
                p7m0Var.c(ahgVar, yggVar);
                return wneVar;
            default:
                if (yjeVar instanceof pch) {
                    pchVar = (pch) yjeVar;
                    int i3 = pchVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        pchVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        pchVar = new pch(this, yjeVar);
                    }
                } else {
                    pchVar = new pch(this, yjeVar);
                }
                Object obj2 = pchVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = pchVar.j;
                if (i4 != 0) {
                    if (i4 == 1) {
                        z1x.P(obj2);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj2);
                ahg ahgVar2 = new ahg(kmqVar, sipVar, (byte) 1);
                pchVar.j = 1;
                p7m0Var.c(ahgVar2, pchVar);
                return wneVar2;
        }
    }
}
