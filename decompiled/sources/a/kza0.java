package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class kza0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 1;
    public boolean j;
    public final /* synthetic */ mlr k;
    public final /* synthetic */ int l;
    public final /* synthetic */ String m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kza0(sd60 sd60Var, mlr mlrVar, int i, boolean z, String str, yje yjeVar) {
        super(2, yjeVar);
        this.o = sd60Var;
        this.k = mlrVar;
        this.l = i;
        this.n = z;
        this.m = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.o;
        switch (b) {
            case 0:
                return new kza0((sd60) obj2, this.k, this.l, this.n, this.m, yjeVar);
            default:
                return new kza0((f1b0) obj2, this.k, this.l, this.m, this.n, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((kza0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        Object obj2 = this.o;
        switch (b) {
            case 0:
                sd60 sd60Var = (sd60) obj2;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    ytt yttVar = (ytt) sd60Var.g;
                    aue0 aue0Var = aue0.d;
                    this.j = true;
                    if (yttVar.a(aue0Var, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                ((oeg0) sd60Var.b).c().d(new gc0(sd60Var, this.k, this.l, this.n, this.m));
                return Unit.f46060a;
            default:
                f1b0 f1b0Var = (f1b0) obj2;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    ytt yttVar2 = f1b0Var.d0;
                    aue0 aue0Var2 = aue0.d;
                    this.j = true;
                    if (yttVar2.a(aue0Var2, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                sd60 sd60Var2 = f1b0Var.B;
                bvc bvcVarA = jiu0.a(f1b0Var);
                wma0 wma0Var = new wma0(1, f1b0Var, f1b0.class, "handleBasicThrowable", "handleBasicThrowable(Ljava/lang/Throwable;)V", 0, (byte) 15);
                sd60Var2.getClass();
                mlr mlrVar = this.k;
                mlrVar.getClass();
                bby bbyVar = (bby) sd60Var2.i;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                sd60Var2.i = sac.V(bvcVarA, wma0Var, null, null, new fs(sd60Var2, mlrVar, this.l, this.n, this.m, (yje) null), 14);
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kza0(f1b0 f1b0Var, mlr mlrVar, int i, String str, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.o = f1b0Var;
        this.k = mlrVar;
        this.l = i;
        this.m = str;
        this.n = z;
    }
}
