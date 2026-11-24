package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class vuu implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38067a;
    public final /* synthetic */ int b;
    public final /* synthetic */ gmq c;

    public /* synthetic */ vuu(gmq gmqVar, int i, byte b) {
        this.f38067a = b;
        this.c = gmqVar;
        this.b = i;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        suu suuVar;
        byte b = this.f38067a;
        int i = this.b;
        gmq gmqVar = this.c;
        switch (b) {
            case 0:
                if (yjeVar instanceof suu) {
                    suuVar = (suu) yjeVar;
                    int i2 = suuVar.j;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        suuVar.j = i2 - Integer.MIN_VALUE;
                    } else {
                        suuVar = new suu(this, yjeVar);
                    }
                } else {
                    suuVar = new suu(this, yjeVar);
                }
                Object obj = suuVar.i;
                wne wneVar = wne.f39444a;
                int i3 = suuVar.j;
                if (i3 == 0) {
                    z1x.P(obj);
                    uuu uuuVar = new uuu(kmqVar, i, (byte) 0);
                    suuVar.j = 1;
                    if (((p6d) gmqVar).c(uuuVar, suuVar) == wneVar) {
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
            default:
                Object objC = ((lnq) gmqVar).c(new uuu(kmqVar, i, (byte) 1), yjeVar);
                return objC == wne.f39444a ? objC : Unit.f46060a;
        }
    }
}
