package a;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class o7a extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ kmq k;
    public /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o7a(int i, yje yjeVar, byte b) {
        super(i, yjeVar);
        this.i = b;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj3;
        switch (this.i) {
            case 0:
                o7a o7aVar = new o7a(3, yjeVar, (byte) 0);
                o7aVar.k = kmqVar;
                o7aVar.l = obj2;
                return o7aVar.invokeSuspend(Unit.f46060a);
            default:
                o7a o7aVar2 = new o7a(3, yjeVar, (byte) 1);
                o7aVar2.k = kmqVar;
                o7aVar2.l = obj2;
                return o7aVar2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        gmq gmqVarH0;
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    kmq kmqVar = this.k;
                    itb itbVar = ((x7a) this.l).c;
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar, itbVar, this) == wneVar) {
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
                Object obj2 = this.l;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    dj50 dj50Var = (dj50) obj2;
                    if (dj50Var.c) {
                        boolean z3 = dj50Var.d;
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        gmqVarH0 = z3 ? bkb.h0(1000L, timeUnit, new azu(dj50Var, null, (byte) 0)) : bkb.h0(1000L, timeUnit, new azu(dj50Var, null, (byte) 1));
                    } else {
                        gmqVarH0 = new eu4(dj50.a(dj50Var, dj50Var.f6166a), (byte) 12);
                    }
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar2, gmqVarH0, this) == wneVar2) {
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
