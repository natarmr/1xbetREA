package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class coo implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4711a;
    public final /* synthetic */ gmq b;
    public final /* synthetic */ hoo c;

    public /* synthetic */ coo(gmq gmqVar, hoo hooVar, byte b) {
        this.f4711a = b;
        this.b = gmqVar;
        this.c = hooVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        zno znoVar;
        doo dooVar;
        byte b = this.f4711a;
        hoo hooVar = this.c;
        gmq gmqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof zno) {
                    znoVar = (zno) yjeVar;
                    int i = znoVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        znoVar.j = i - Integer.MIN_VALUE;
                    } else {
                        znoVar = new zno(this, yjeVar);
                    }
                } else {
                    znoVar = new zno(this, yjeVar);
                }
                Object obj = znoVar.i;
                wne wneVar = wne.f39444a;
                int i2 = znoVar.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    boo booVar = new boo(kmqVar, hooVar, (byte) 0);
                    znoVar.j = 1;
                    if (gmqVar.c(booVar, znoVar) == wneVar) {
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
                if (yjeVar instanceof doo) {
                    dooVar = (doo) yjeVar;
                    int i3 = dooVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        dooVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        dooVar = new doo(this, yjeVar);
                    }
                } else {
                    dooVar = new doo(this, yjeVar);
                }
                Object obj2 = dooVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = dooVar.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    boo booVar2 = new boo(kmqVar, hooVar, (byte) 1);
                    dooVar.j = 1;
                    if (gmqVar.c(booVar2, dooVar) == wneVar2) {
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
