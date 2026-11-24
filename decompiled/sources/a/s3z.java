package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class s3z extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Throwable k;
    public final /* synthetic */ tzi l;
    public final /* synthetic */ u3z m;
    public final /* synthetic */ Long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s3z(tzi tziVar, u3z u3zVar, Long l, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.l = tziVar;
        this.m = u3zVar;
        this.n = l;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        Throwable th = (Throwable) obj2;
        yje yjeVar = (yje) obj3;
        switch (this.i) {
            case 0:
                s3z s3zVar = new s3z(this.l, this.m, this.n, yjeVar, (byte) 0);
                s3zVar.k = th;
                return s3zVar.invokeSuspend(Unit.f46060a);
            default:
                s3z s3zVar2 = new s3z(this.l, this.m, this.n, yjeVar, (byte) 1);
                s3zVar2.k = th;
                return s3zVar2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        Long l = this.n;
        u3z u3zVar = this.m;
        tzi tziVar = this.l;
        switch (b) {
            case 0:
                Throwable th = this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    tziVar.getClass();
                    if ((th instanceof zhi0) && ((zhi0) th).c == i2o.IncorrectDataError) {
                        ((ort) tziVar.e).f25751a.i();
                        this.k = null;
                        this.j = true;
                        if (tziVar.k(u3zVar, l, this) == wneVar) {
                            return wneVar;
                        }
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
                Throwable th2 = this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    tziVar.getClass();
                    if ((th2 instanceof zhi0) && ((zhi0) th2).c == i2o.IncorrectDataError) {
                        ((ort) tziVar.e).f25751a.j();
                        this.k = null;
                        this.j = true;
                        if (tziVar.k(u3zVar, l, this) == wneVar2) {
                            return wneVar2;
                        }
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
