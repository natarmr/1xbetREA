package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class jxt implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17326a;
    public final /* synthetic */ acu b;
    public final /* synthetic */ String c;

    public /* synthetic */ jxt(acu acuVar, String str, byte b) {
        this.f17326a = b;
        this.b = acuVar;
        this.c = str;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:41:0x009c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        hxt hxtVar;
        k3v k3vVar;
        cl00 cl00Var;
        byte b = this.f17326a;
        String str = this.c;
        acu acuVar = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                if (yjeVar instanceof hxt) {
                    hxtVar = (hxt) yjeVar;
                    int i = hxtVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        hxtVar.j = i - Integer.MIN_VALUE;
                    } else {
                        hxtVar = new hxt(this, yjeVar);
                    }
                } else {
                    hxtVar = new hxt(this, yjeVar);
                }
                Object obj = hxtVar.i;
                wne wneVar = wne.f39444a;
                int i2 = hxtVar.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    loo looVar = new loo(kmqVar, str, b2);
                    hxtVar.j = 1;
                    if (acuVar.c(looVar, hxtVar) == wneVar) {
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
            case 1:
                if (yjeVar instanceof k3v) {
                    k3vVar = (k3v) yjeVar;
                    int i3 = k3vVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        k3vVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        k3vVar = new k3v(this, yjeVar);
                    }
                } else {
                    k3vVar = new k3v(this, yjeVar);
                }
                Object obj2 = k3vVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = k3vVar.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    loo looVar2 = new loo(kmqVar, str, (byte) 2);
                    k3vVar.j = 1;
                    if (acuVar.c(looVar2, k3vVar) == wneVar2) {
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
            default:
                if (yjeVar instanceof cl00) {
                    cl00Var = (cl00) yjeVar;
                    int i5 = cl00Var.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        cl00Var.j = i5 - Integer.MIN_VALUE;
                    } else {
                        cl00Var = new cl00(this, yjeVar);
                    }
                } else {
                    cl00Var = new cl00(this, yjeVar);
                }
                Object obj3 = cl00Var.i;
                wne wneVar3 = wne.f39444a;
                int i6 = cl00Var.j;
                if (i6 == 0) {
                    z1x.P(obj3);
                    loo looVar3 = new loo(kmqVar, str, (byte) 3);
                    cl00Var.j = 1;
                    if (acuVar.c(looVar3, cl00Var) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (i6 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj3);
                }
                return Unit.f46060a;
        }
    }
}
