package a;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class zzu extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public boolean j;
    public final /* synthetic */ pwi k;
    public final /* synthetic */ int l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ boolean n;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzu(kmq kmqVar, pwi pwiVar, int i, boolean z, boolean z2, yje yjeVar) {
        super(2, yjeVar);
        this.o = kmqVar;
        this.k = pwiVar;
        this.l = i;
        this.m = z;
        this.n = z2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new zzu((kmq) this.o, this.k, this.l, this.m, this.n, yjeVar);
            default:
                zzu zzuVar = new zzu(this.k, this.l, this.m, this.n, yjeVar);
                zzuVar.o = obj;
                return zzuVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((zzu) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((zzu) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object g0g0Var;
        switch (this.i) {
            case 0:
                pwi pwiVar = this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (z) {
                    if (z) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                try {
                    e0g0 e0g0Var = j0g0.b;
                    g0g0Var = ((x4v) pwiVar.f27712a).a();
                    break;
                } catch (Throwable th) {
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                Object krt0Var = new krt0(0L, false, false, 0.0d);
                if (g0g0Var instanceof g0g0) {
                    g0g0Var = krt0Var;
                }
                krt0 krt0Var2 = (krt0) g0g0Var;
                zri zriVar = (zri) pwiVar.b;
                boolean z2 = this.m;
                boolean z3 = z2 ? krt0Var2.c : krt0Var2.b;
                long j = krt0Var2.f18785a;
                boolean z4 = ((yiu) pwiVar.f).a() || ((pru) pwiVar.j).a().O1;
                this.j = true;
                Serializable serializableL = ((uii) zriVar.b).l(this.l, z3, j, z2, ((j1q0) zriVar.c).f15748a.j(), this.n, z4, this);
                return serializableL == wneVar ? wneVar : serializableL;
            default:
                kmq kmqVar = (kmq) this.o;
                wne wneVar2 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    boolean z6 = this.n;
                    pwi pwiVar2 = this.k;
                    a1g a1gVarK0 = kpb.k0(bkb.h0(60L, TimeUnit.SECONDS, new zzu(kmqVar, pwiVar2, this.l, this.m, z6, null)), Long.MAX_VALUE, new u5u(pwiVar2, this.m, (yje) null));
                    this.o = null;
                    this.j = true;
                    if (slb.Q(kmqVar, a1gVarK0, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzu(pwi pwiVar, int i, boolean z, boolean z2, yje yjeVar) {
        super(2, yjeVar);
        this.k = pwiVar;
        this.l = i;
        this.m = z;
        this.n = z2;
    }
}
