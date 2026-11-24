package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class dku implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6250a;
    public final /* synthetic */ i89 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ List d;
    public final /* synthetic */ List e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;

    public /* synthetic */ dku(i89 i89Var, Object obj, long j, List list, List list2, boolean z, boolean z2, byte b) {
        this.f6250a = b;
        this.b = i89Var;
        this.h = obj;
        this.c = j;
        this.d = list;
        this.e = list2;
        this.f = z;
        this.g = z2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        aku akuVar;
        fku fkuVar;
        iku ikuVar;
        byte b = this.f6250a;
        Object obj = this.h;
        i89 i89Var = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof aku) {
                    akuVar = (aku) yjeVar;
                    int i = akuVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        akuVar.j = i - Integer.MIN_VALUE;
                    } else {
                        akuVar = new aku(this, yjeVar);
                    }
                } else {
                    akuVar = new aku(this, yjeVar);
                }
                Object obj2 = akuVar.i;
                wne wneVar = wne.f39444a;
                int i2 = akuVar.j;
                if (i2 == 0) {
                    z1x.P(obj2);
                    cku ckuVar = new cku(kmqVar, (f7u) obj, this.c, this.d, this.e, this.f, this.g, (byte) 0);
                    akuVar.j = 1;
                    if (i89Var.c(ckuVar, akuVar) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj2);
                }
                return Unit.f46060a;
            case 1:
                if (yjeVar instanceof fku) {
                    fkuVar = (fku) yjeVar;
                    int i3 = fkuVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        fkuVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        fkuVar = new fku(this, yjeVar);
                    }
                } else {
                    fkuVar = new fku(this, yjeVar);
                }
                Object obj3 = fkuVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = fkuVar.j;
                if (i4 == 0) {
                    z1x.P(obj3);
                    cku ckuVar2 = new cku(kmqVar, (dgu) obj, this.c, this.d, this.e, this.f, this.g, (byte) 1);
                    fkuVar.j = 1;
                    if (i89Var.c(ckuVar2, fkuVar) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj3);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof iku) {
                    ikuVar = (iku) yjeVar;
                    int i5 = ikuVar.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        ikuVar.j = i5 - Integer.MIN_VALUE;
                    } else {
                        ikuVar = new iku(this, yjeVar);
                    }
                } else {
                    ikuVar = new iku(this, yjeVar);
                }
                Object obj4 = ikuVar.i;
                wne wneVar3 = wne.f39444a;
                int i6 = ikuVar.j;
                if (i6 == 0) {
                    z1x.P(obj4);
                    cku ckuVar3 = new cku(kmqVar, (f7u) obj, this.c, this.d, this.e, this.f, this.g, (byte) 2);
                    ikuVar.j = 1;
                    if (i89Var.c(ckuVar3, ikuVar) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (i6 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj4);
                }
                return Unit.f46060a;
        }
    }
}
