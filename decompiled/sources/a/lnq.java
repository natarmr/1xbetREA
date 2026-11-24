package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class lnq implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20359a;
    public final /* synthetic */ gmq b;
    public final /* synthetic */ int c;

    public /* synthetic */ lnq(gmq gmqVar, int i, byte b) {
        this.f20359a = b;
        this.b = gmqVar;
        this.c = i;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        xpp0 xpp0Var;
        byte b = this.f20359a;
        int i = this.c;
        gmq gmqVar = this.b;
        switch (b) {
            case 0:
                Object objC = gmqVar.c(new exn(new kie0(), i, kmqVar), yjeVar);
                return objC == wne.f39444a ? objC : Unit.f46060a;
            default:
                if (yjeVar instanceof xpp0) {
                    xpp0Var = (xpp0) yjeVar;
                    int i2 = xpp0Var.j;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        xpp0Var.j = i2 - Integer.MIN_VALUE;
                    } else {
                        xpp0Var = new xpp0(this, yjeVar);
                    }
                } else {
                    xpp0Var = new xpp0(this, yjeVar);
                }
                Object obj = xpp0Var.i;
                wne wneVar = wne.f39444a;
                int i3 = xpp0Var.j;
                if (i3 == 0) {
                    z1x.P(obj);
                    uuu uuuVar = new uuu(kmqVar, i, (byte) 2);
                    xpp0Var.j = 1;
                    if (gmqVar.c(uuuVar, xpp0Var) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i3 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
