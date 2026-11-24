package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class rno implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30797a;
    public final /* synthetic */ p7m0 b;
    public final /* synthetic */ long c;

    public /* synthetic */ rno(p7m0 p7m0Var, long j, byte b) {
        this.f30797a = b;
        this.b = p7m0Var;
        this.c = j;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        pno pnoVar;
        sno snoVar;
        byte b = this.f30797a;
        long j = this.c;
        p7m0 p7m0Var = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof pno) {
                    pnoVar = (pno) yjeVar;
                    int i = pnoVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        pnoVar.j = i - Integer.MIN_VALUE;
                    } else {
                        pnoVar = new pno(this, yjeVar);
                    }
                } else {
                    pnoVar = new pno(this, yjeVar);
                }
                Object obj = pnoVar.i;
                wne wneVar = wne.f39444a;
                int i2 = pnoVar.j;
                if (i2 != 0) {
                    if (i2 == 1) {
                        z1x.P(obj);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                s7h s7hVar = new s7h(kmqVar, j, (byte) 3);
                pnoVar.j = 1;
                p7m0Var.c(s7hVar, pnoVar);
                return wneVar;
            default:
                if (yjeVar instanceof sno) {
                    snoVar = (sno) yjeVar;
                    int i3 = snoVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        snoVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        snoVar = new sno(this, yjeVar);
                    }
                } else {
                    snoVar = new sno(this, yjeVar);
                }
                Object obj2 = snoVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = snoVar.j;
                if (i4 != 0) {
                    if (i4 == 1) {
                        z1x.P(obj2);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj2);
                s7h s7hVar2 = new s7h(kmqVar, j, (byte) 4);
                snoVar.j = 1;
                p7m0Var.c(s7hVar2, snoVar);
                return wneVar2;
        }
    }
}
