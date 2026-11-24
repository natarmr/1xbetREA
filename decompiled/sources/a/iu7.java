package a;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class iu7 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 1;
    public boolean j;
    public final /* synthetic */ float k;
    public Object l;
    public l7m0 m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu7(t33 t33Var, pz40 pz40Var, float f, agk0 agk0Var, agk0 agk0Var2, yje yjeVar) {
        super(2, yjeVar);
        this.l = t33Var;
        this.m = pz40Var;
        this.k = f;
        this.n = agk0Var;
        this.o = agk0Var2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.o;
        Object obj3 = this.n;
        switch (b) {
            case 0:
                return new iu7((t33) this.l, (pz40) this.m, this.k, (agk0) obj3, (agk0) obj2, yjeVar);
            default:
                return new iu7(this.k, (iuj) obj3, (qah0) obj2, yjeVar);
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
        return ((iu7) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        uts0 uts0VarM0;
        l73 l73Var;
        jie0 jie0Var;
        byte b = this.i;
        Object obj2 = this.o;
        Object obj3 = this.n;
        float f = 0.0f;
        float f2 = this.k;
        switch (b) {
            case 0:
                pz40 pz40Var = (pz40) this.m;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    t33 t33Var = (t33) this.l;
                    dah0 dah0Var = (dah0) pz40Var.getValue();
                    if (dah0Var != null && !(dah0Var instanceof x9h0)) {
                        if (!(dah0Var instanceof aah0)) {
                            t9f.b();
                            return null;
                        }
                        f = 1.0f;
                    }
                    Float f3 = new Float(f);
                    dah0 dah0Var2 = (dah0) pz40Var.getValue();
                    if (dah0Var2 == null || (dah0Var2 instanceof x9h0)) {
                        uts0VarM0 = ro4.m0((int) (300.0f * f2), 0, null, 6);
                    } else {
                        if (!(dah0Var2 instanceof aah0)) {
                            t9f.b();
                            return null;
                        }
                        uts0VarM0 = ro4.m0((int) ((1.0f - f2) * 300.0f), 0, null, 6);
                    }
                    hu7 hu7Var = new hu7((agk0) obj3, pz40Var, (agk0) obj2);
                    this.j = true;
                    if (t33.a(t33Var, f3, uts0VarM0, null, hu7Var, this, 4) == wneVar) {
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
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (z2) {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    l73Var = (l73) this.m;
                    jie0Var = (jie0) this.l;
                    try {
                        z1x.P(obj);
                    } catch (CancellationException unused) {
                        jie0Var.f16571a = ((Number) l73Var.b()).floatValue();
                    }
                    f2 = jie0Var.f16571a;
                    break;
                } else {
                    z1x.P(obj);
                    if (Math.abs(f2) > 1.0f) {
                        jie0 jie0Var2 = new jie0();
                        jie0Var2.f16571a = f2;
                        jie0 jie0Var3 = new jie0();
                        l73 l73VarD = x4d0.d(0.0f, f2, 28);
                        try {
                            iuj iujVar = (iuj) obj3;
                            sjj sjjVar = iujVar.f15399a;
                            sw8 sw8Var = new sw8(jie0Var3, (qah0) obj2, jie0Var2, iujVar);
                            this.l = jie0Var2;
                            this.m = l73VarD;
                            this.j = true;
                            if (hhm0.o(l73VarD, sjjVar, false, sw8Var, this) == wneVar2) {
                                return wneVar2;
                            }
                            jie0Var = jie0Var2;
                            f2 = jie0Var.f16571a;
                        } catch (CancellationException unused2) {
                            l73Var = l73VarD;
                            jie0Var = jie0Var2;
                            jie0Var.f16571a = ((Number) l73Var.b()).floatValue();
                        }
                    }
                }
                return new Float(f2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu7(float f, iuj iujVar, qah0 qah0Var, yje yjeVar) {
        super(2, yjeVar);
        this.k = f;
        this.n = iujVar;
        this.o = qah0Var;
    }
}
