package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class mdq implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21609a;
    public final /* synthetic */ dnq b;

    public /* synthetic */ mdq(dnq dnqVar, byte b) {
        this.f21609a = b;
        this.b = dnqVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        kdq kdqVar;
        rwu rwuVar;
        byte b = this.f21609a;
        dnq dnqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof kdq) {
                    kdqVar = (kdq) yjeVar;
                    int i = kdqVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        kdqVar.j = i - Integer.MIN_VALUE;
                    } else {
                        kdqVar = new kdq(this, yjeVar);
                    }
                } else {
                    kdqVar = new kdq(this, yjeVar);
                }
                Object obj = kdqVar.i;
                wne wneVar = wne.f39444a;
                int i2 = kdqVar.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    uap uapVar = new uap(kmqVar, (byte) 8);
                    kdqVar.j = 1;
                    if (dnqVar.c(uapVar, kdqVar) == wneVar) {
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
                if (yjeVar instanceof rwu) {
                    rwuVar = (rwu) yjeVar;
                    int i3 = rwuVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        rwuVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        rwuVar = new rwu(this, yjeVar);
                    }
                } else {
                    rwuVar = new rwu(this, yjeVar);
                }
                Object obj2 = rwuVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = rwuVar.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    y6u y6uVar = new y6u(kmqVar, (byte) 24);
                    rwuVar.j = 1;
                    if (dnqVar.c(y6uVar, rwuVar) == wneVar2) {
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
