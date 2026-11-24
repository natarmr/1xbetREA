package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class x3q0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ d4q0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x3q0(d4q0 d4q0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = d4q0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        d4q0 d4q0Var = this.k;
        switch (b) {
            case 0:
                return new x3q0(d4q0Var, yjeVar, (byte) 0);
            case 1:
                return new x3q0(d4q0Var, yjeVar, (byte) 1);
            case 2:
                x3q0 x3q0Var = new x3q0(d4q0Var, yjeVar, (byte) 2);
                x3q0Var.j = ((Boolean) obj).booleanValue();
                return x3q0Var;
            case 3:
                return new x3q0(d4q0Var, yjeVar, (byte) 3);
            default:
                return new x3q0(d4q0Var, yjeVar, (byte) 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((x3q0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((x3q0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((x3q0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((x3q0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((x3q0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        byte b2 = 16;
        d4q0 d4q0Var = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                Object obj2 = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    abu abuVar = d4q0Var.t;
                    String str = d4q0Var.o;
                    this.j = true;
                    Object objD0 = qjj.d0(((mne) abuVar.c).b, new juy(abuVar, str, yjeVar, b2), this);
                    if (objD0 != obj2) {
                        objD0 = Unit.f46060a;
                    }
                    if (objD0 == obj2) {
                        return obj2;
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
                Object obj3 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    abu abuVar2 = d4q0Var.t;
                    String str2 = d4q0Var.o;
                    this.j = true;
                    Object objD1 = qjj.d0(((mne) abuVar2.c).b, new juy(abuVar2, str2, yjeVar, b2), this);
                    if (objD1 != obj3) {
                        objD1 = Unit.f46060a;
                    }
                    if (objD1 == obj3) {
                        return obj3;
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
                boolean z3 = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (z3 && (((s3q0) d4q0Var.D()).b || ((s3q0) d4q0Var.D()).c)) {
                    bby bbyVar = d4q0Var.z;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    d4q0Var.z = sac.a0(jiu0.a(d4q0Var), ibc.w0(30L, bfn.SECONDS), null, null, new x3q0(d4q0Var, yjeVar, (byte) 4), 6);
                    d4q0Var.M(false);
                }
                return Unit.f46060a;
            case 3:
                wne wneVar2 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    bby bbyVar2 = d4q0Var.z;
                    if (bbyVar2 != null) {
                        this.j = true;
                        if (zvw.H(bbyVar2, this) == wneVar2) {
                            return wneVar2;
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
            default:
                wne wneVar3 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    jwu jwuVar = d4q0Var.w;
                    String str3 = d4q0Var.o;
                    this.j = true;
                    if (jwuVar.b(str3, this) == wneVar3) {
                        return wneVar3;
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
}
