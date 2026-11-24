package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class v9w extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ naw k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v9w(naw nawVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = nawVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        naw nawVar = this.k;
        switch (b) {
            case 0:
                return new v9w(nawVar, yjeVar, (byte) 0);
            case 1:
                v9w v9wVar = new v9w(nawVar, yjeVar, (byte) 1);
                v9wVar.j = ((Boolean) obj).booleanValue();
                return v9wVar;
            case 2:
                return new v9w(nawVar, yjeVar, (byte) 2);
            case 3:
                return new v9w(nawVar, yjeVar, (byte) 3);
            default:
                return new v9w(nawVar, yjeVar, (byte) 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((v9w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((v9w) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((v9w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((v9w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((v9w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objD0;
        Object value;
        byte b = this.i;
        naw nawVar = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    this.j = true;
                    List list = naw.d1;
                    if (nawVar.N(this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                ((m0w) nawVar.j0.f13434a.g).h = 0L;
                return Unit.f46060a;
            case 1:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (!nawVar.J0 && z2 && nawVar.V0) {
                    nawVar.M(false);
                }
                p7m0 p7m0Var = nawVar.W0;
                while (true) {
                    Object value2 = p7m0Var.getValue();
                    boolean z3 = z2;
                    if (p7m0Var.m(value2, l9h0.a((l9h0) value2, false, false, false, null, false, false, false, false, false, null, null, z3, false, 28671))) {
                        nawVar.J0 = z3;
                        return Unit.f46060a;
                    }
                    z2 = z3;
                }
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    edu eduVar = nawVar.B;
                    this.j = true;
                    objD0 = qjj.d0(((mne) eduVar.b).b, new gkr(eduVar, yjeVar, (byte) 21), this);
                    if (objD0 == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objD0 = obj;
                }
                boolean zBooleanValue = ((Boolean) objD0).booleanValue();
                ol60 ol60Var = nawVar.Z0;
                if (zBooleanValue) {
                    ol60Var.f(new n9w(0L));
                } else {
                    ol60Var.f(z8w.f43988a);
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    this.j = true;
                    if (qcc.O(1000L, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                p7m0 p7m0Var2 = nawVar.W0;
                do {
                    value = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value, l9h0.a((l9h0) value, false, false, false, null, false, false, false, false, false, null, null, false, false, 32765)));
                return Unit.f46060a;
            default:
                wne wneVar5 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    p7m0 p7m0Var3 = nawVar.c1;
                    this.j = true;
                    p7m0Var3.getClass();
                    p7m0Var3.o(null, q9w.f28368a);
                    if (Unit.f46060a == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
