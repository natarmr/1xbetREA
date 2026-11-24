package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class lj implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20130a;
    public final /* synthetic */ gmq b;
    public final /* synthetic */ wj c;

    public /* synthetic */ lj(gmq gmqVar, wj wjVar, byte b) {
        this.f20130a = b;
        this.b = gmqVar;
        this.c = wjVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        ij ijVar;
        sj sjVar;
        byte b = this.f20130a;
        wj wjVar = this.c;
        gmq gmqVar = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                if (yjeVar instanceof ij) {
                    ijVar = (ij) yjeVar;
                    int i = ijVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ijVar.j = i - Integer.MIN_VALUE;
                    } else {
                        ijVar = new ij(this, yjeVar);
                    }
                } else {
                    ijVar = new ij(this, yjeVar);
                }
                Object obj = ijVar.i;
                wne wneVar = wne.f39444a;
                int i2 = ijVar.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    kj kjVar = new kj(kmqVar, wjVar, (byte) 0);
                    ijVar.j = 1;
                    if (gmqVar.c(kjVar, ijVar) == wneVar) {
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
                if (yjeVar instanceof sj) {
                    sjVar = (sj) yjeVar;
                    int i3 = sjVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        sjVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        sjVar = new sj(this, yjeVar);
                    }
                } else {
                    sjVar = new sj(this, yjeVar);
                }
                Object obj2 = sjVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = sjVar.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    kj kjVar2 = new kj(kmqVar, wjVar, b2);
                    sjVar.j = 1;
                    if (gmqVar.c(kjVar2, sjVar) == wneVar2) {
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
