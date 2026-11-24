package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class yot implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43002a;
    public final /* synthetic */ acu b;
    public final /* synthetic */ List c;

    public /* synthetic */ yot(acu acuVar, List list, byte b) {
        this.f43002a = b;
        this.b = acuVar;
        this.c = list;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        vot votVar;
        oiu oiuVar;
        byte b = this.f43002a;
        List list = this.c;
        acu acuVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof vot) {
                    votVar = (vot) yjeVar;
                    int i = votVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        votVar.j = i - Integer.MIN_VALUE;
                    } else {
                        votVar = new vot(this, yjeVar);
                    }
                } else {
                    votVar = new vot(this, yjeVar);
                }
                Object obj = votVar.i;
                wne wneVar = wne.f39444a;
                int i2 = votVar.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    xot xotVar = new xot(kmqVar, list, (byte) 0);
                    votVar.j = 1;
                    if (acuVar.c(xotVar, votVar) == wneVar) {
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
                if (yjeVar instanceof oiu) {
                    oiuVar = (oiu) yjeVar;
                    int i3 = oiuVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        oiuVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        oiuVar = new oiu(this, yjeVar);
                    }
                } else {
                    oiuVar = new oiu(this, yjeVar);
                }
                Object obj2 = oiuVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = oiuVar.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    xot xotVar2 = new xot(kmqVar, list, (byte) 3);
                    oiuVar.j = 1;
                    if (acuVar.c(xotVar2, oiuVar) == wneVar2) {
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
