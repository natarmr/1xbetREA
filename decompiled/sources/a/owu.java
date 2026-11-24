package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class owu extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ kmq k;
    public /* synthetic */ Throwable l;
    public final /* synthetic */ yhi m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ owu(yhi yhiVar, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.m = yhiVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        yhi yhiVar = this.m;
        kmq kmqVar = (kmq) obj;
        Throwable th = (Throwable) obj2;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                owu owuVar = new owu(yhiVar, yjeVar, (byte) 0);
                owuVar.k = kmqVar;
                owuVar.l = th;
                return owuVar.invokeSuspend(Unit.f46060a);
            default:
                owu owuVar2 = new owu(yhiVar, yjeVar, (byte) 1);
                owuVar2.k = kmqVar;
                owuVar2.l = th;
                return owuVar2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        byte b = this.i;
        yhi yhiVar = this.m;
        switch (b) {
            case 0:
                kmq kmqVar = this.k;
                Throwable th = this.l;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    if (agc.L(th)) {
                        throw th;
                    }
                    Object obj2 = (List) ((g8n0) ((svt) yhiVar.h).f32886a.b).c.b();
                    if (obj2 == null) {
                        obj2 = iun.f15405a;
                    }
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (kmqVar.a(obj2, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                kmq kmqVar2 = this.k;
                Throwable th2 = this.l;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    if (agc.L(th2)) {
                        throw th2;
                    }
                    Object obj3 = (List) ((g8n0) ((nvu) ((lsn) yhiVar.g).f20589a).b).b.b();
                    if (obj3 == null) {
                        obj3 = iun.f15405a;
                    }
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (kmqVar2.a(obj3, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
