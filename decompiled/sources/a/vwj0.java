package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class vwj0 implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38154a;
    public final /* synthetic */ gmq b;
    public final /* synthetic */ xxj0 c;

    public /* synthetic */ vwj0(p7m0 p7m0Var, xxj0 xxj0Var, byte b) {
        this.f38154a = b;
        this.b = p7m0Var;
        this.c = xxj0Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        swj0 swj0Var;
        zwj0 zwj0Var;
        byte b = this.f38154a;
        xxj0 xxj0Var = this.c;
        gmq gmqVar = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                if (yjeVar instanceof swj0) {
                    swj0Var = (swj0) yjeVar;
                    int i = swj0Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        swj0Var.j = i - Integer.MIN_VALUE;
                    } else {
                        swj0Var = new swj0(this, yjeVar);
                    }
                } else {
                    swj0Var = new swj0(this, yjeVar);
                }
                Object obj = swj0Var.i;
                wne wneVar = wne.f39444a;
                int i2 = swj0Var.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    uwj0 uwj0Var = new uwj0(kmqVar, xxj0Var, (byte) 0);
                    swj0Var.j = 1;
                    if (gmqVar.c(uwj0Var, swj0Var) == wneVar) {
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
                if (yjeVar instanceof zwj0) {
                    zwj0Var = (zwj0) yjeVar;
                    int i3 = zwj0Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        zwj0Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        zwj0Var = new zwj0(this, yjeVar);
                    }
                } else {
                    zwj0Var = new zwj0(this, yjeVar);
                }
                Object obj2 = zwj0Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = zwj0Var.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    uwj0 uwj0Var2 = new uwj0(kmqVar, xxj0Var, b2);
                    zwj0Var.j = 1;
                    if (gmqVar.c(uwj0Var2, zwj0Var) == wneVar2) {
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
