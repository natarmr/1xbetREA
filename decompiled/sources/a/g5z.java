package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class g5z extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Throwable k;
    public final /* synthetic */ a6u l;
    public final /* synthetic */ long m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ long o;
    public final /* synthetic */ long p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g5z(a6u a6uVar, long j, boolean z, long j2, long j3, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.l = a6uVar;
        this.m = j;
        this.n = z;
        this.o = j2;
        this.p = j3;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        Throwable th = (Throwable) obj2;
        yje yjeVar = (yje) obj3;
        switch (this.i) {
            case 0:
                g5z g5zVar = new g5z(this.l, this.m, this.n, this.o, this.p, yjeVar, (byte) 0);
                g5zVar.k = th;
                return g5zVar.invokeSuspend(Unit.f46060a);
            default:
                g5z g5zVar2 = new g5z(this.l, this.m, this.n, this.o, this.p, yjeVar, (byte) 1);
                g5zVar2.k = th;
                return g5zVar2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        a6u a6uVar = this.l;
        switch (b) {
            case 0:
                Throwable th = this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    a6uVar.getClass();
                    if ((th instanceof zhi0) && ((zhi0) th).c == i2o.IncorrectDataError) {
                        ((ort) a6uVar.d).f25751a.i();
                        this.k = null;
                        this.j = true;
                        if (this.l.s(this.m, this.o, this, this.n) == wneVar) {
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
                    a6uVar.getClass();
                    if ((th2 instanceof zhi0) && ((zhi0) th2).c == i2o.IncorrectDataError) {
                        ((ort) a6uVar.d).f25751a.j();
                        this.k = null;
                        this.j = true;
                        if (this.l.s(this.m, this.o, this, this.n) == wneVar2) {
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
