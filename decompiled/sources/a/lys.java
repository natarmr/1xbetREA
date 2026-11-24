package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class lys implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20877a;
    public final /* synthetic */ gmq b;
    public final /* synthetic */ yys c;

    public /* synthetic */ lys(gmq gmqVar, yys yysVar, byte b) {
        this.f20877a = b;
        this.b = gmqVar;
        this.c = yysVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        iys iysVar;
        qys qysVar;
        byte b = this.f20877a;
        yys yysVar = this.c;
        gmq gmqVar = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                if (yjeVar instanceof iys) {
                    iysVar = (iys) yjeVar;
                    int i = iysVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        iysVar.j = i - Integer.MIN_VALUE;
                    } else {
                        iysVar = new iys(this, yjeVar);
                    }
                } else {
                    iysVar = new iys(this, yjeVar);
                }
                Object obj = iysVar.i;
                wne wneVar = wne.f39444a;
                int i2 = iysVar.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    kys kysVar = new kys(kmqVar, yysVar, (byte) 0);
                    iysVar.j = 1;
                    if (gmqVar.c(kysVar, iysVar) == wneVar) {
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
                if (yjeVar instanceof qys) {
                    qysVar = (qys) yjeVar;
                    int i3 = qysVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        qysVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        qysVar = new qys(this, yjeVar);
                    }
                } else {
                    qysVar = new qys(this, yjeVar);
                }
                Object obj2 = qysVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = qysVar.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    kys kysVar2 = new kys(kmqVar, yysVar, b2);
                    qysVar.j = 1;
                    if (gmqVar.c(kysVar2, qysVar) == wneVar2) {
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
