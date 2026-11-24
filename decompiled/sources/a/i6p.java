package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class i6p extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ z5p j;
    public final /* synthetic */ k6p k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6p(z5p z5pVar, k6p k6pVar, yje yjeVar) {
        super(2, yjeVar);
        this.j = z5pVar;
        this.k = k6pVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new i6p(this.j, this.k, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i6p) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        z5p z5pVar = this.j;
        long j = z5pVar.b;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        k6p k6pVar = this.k;
        if (!z) {
            z1x.P(obj);
            i = z5pVar.j;
            if (i == -1) {
                if (j == 40) {
                    i = CyberGamesPage.Real.INSTANCE.f46556a;
                } else {
                    msu msuVar = k6pVar.k;
                    this.i = true;
                    obj = msuVar.b(j, this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                }
            }
            i2 = i;
            if (i2 == CyberGamesPage.Real.INSTANCE.f46556a) {
                j = z5pVar.c;
            }
            hzg hzgVar = k6pVar.c;
            long jB = z5pVar.d.b();
            String str = z5pVar.e;
            k1g k1gVar = k1g.OPEN_REGULAR;
            ((uzg) hzgVar).f(str, j, jB, i2);
            return Unit.f46060a;
        }
        if (!z) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        i = ((ril0) obj).e ? CyberGamesPage.Virtual.INSTANCE.f46556a : CyberGamesPage.OneXCyber.INSTANCE.f46556a;
        i2 = i;
        if (i2 == CyberGamesPage.Real.INSTANCE.f46556a) {
            j = z5pVar.c;
        }
        hzg hzgVar2 = k6pVar.c;
        long jB2 = z5pVar.d.b();
        String str2 = z5pVar.e;
        k1g k1gVar2 = k1g.OPEN_REGULAR;
        ((uzg) hzgVar2).f(str2, j, jB2, i2);
        return Unit.f46060a;
    }
}
