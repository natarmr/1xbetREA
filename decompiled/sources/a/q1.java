package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class q1 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ s1 k;
    public final /* synthetic */ jub0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1(s1 s1Var, jub0 jub0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = s1Var;
        this.l = jub0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        jub0 jub0Var = this.l;
        s1 s1Var = this.k;
        switch (b) {
            case 0:
                return new q1(s1Var, jub0Var, yjeVar, (byte) 0);
            case 1:
                return new q1(s1Var, jub0Var, yjeVar, (byte) 1);
            case 2:
                return new q1(s1Var, jub0Var, yjeVar, (byte) 2);
            default:
                return new q1(s1Var, jub0Var, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((q1) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        jub0 jub0Var = this.l;
        s1 s1Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    gy40 gy40Var = s1Var.q;
                    if (gy40Var != null) {
                        iub0 iub0Var = new iub0(jub0Var);
                        this.j = true;
                        if (gy40Var.a(iub0Var, this) == wneVar) {
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
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    gy40 gy40Var2 = s1Var.q;
                    if (gy40Var2 != null) {
                        iub0 iub0Var2 = new iub0(jub0Var);
                        this.j = true;
                        if (gy40Var2.a(iub0Var2, this) == wneVar2) {
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
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    gy40 gy40Var3 = s1Var.q;
                    if (gy40Var3 != null) {
                        this.j = true;
                        if (gy40Var3.a(jub0Var, this) == wneVar3) {
                            return wneVar3;
                        }
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    gy40 gy40Var4 = s1Var.q;
                    if (gy40Var4 != null) {
                        kub0 kub0Var = new kub0(jub0Var);
                        this.j = true;
                        if (gy40Var4.a(kub0Var, this) == wneVar4) {
                            return wneVar4;
                        }
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
