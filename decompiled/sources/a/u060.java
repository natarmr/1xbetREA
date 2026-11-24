package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class u060 implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34841a;
    public final /* synthetic */ ewt b;

    public /* synthetic */ u060(ewt ewtVar, byte b) {
        this.f34841a = b;
        this.b = ewtVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        s060 s060Var;
        kzv0 kzv0Var;
        byte b = this.f34841a;
        ewt ewtVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof s060) {
                    s060Var = (s060) yjeVar;
                    int i = s060Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        s060Var.j = i - Integer.MIN_VALUE;
                    } else {
                        s060Var = new s060(this, yjeVar);
                    }
                } else {
                    s060Var = new s060(this, yjeVar);
                }
                Object obj = s060Var.i;
                wne wneVar = wne.f39444a;
                int i2 = s060Var.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    nr30 nr30Var = new nr30(kmqVar, (byte) 13);
                    s060Var.j = 1;
                    if (ewtVar.c(nr30Var, s060Var) == wneVar) {
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
                if (yjeVar instanceof kzv0) {
                    kzv0Var = (kzv0) yjeVar;
                    int i3 = kzv0Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        kzv0Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        kzv0Var = new kzv0(this, yjeVar);
                    }
                } else {
                    kzv0Var = new kzv0(this, yjeVar);
                }
                Object obj2 = kzv0Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = kzv0Var.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    ofv0 ofv0Var = new ofv0(kmqVar, (byte) 5);
                    kzv0Var.j = 1;
                    if (ewtVar.c(ofv0Var, kzv0Var) == wneVar2) {
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
