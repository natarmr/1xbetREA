package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class mcr0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ scr0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mcr0(scr0 scr0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = scr0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        scr0 scr0Var = this.k;
        switch (b) {
            case 0:
                return new mcr0(scr0Var, yjeVar, (byte) 0);
            case 1:
                return new mcr0(scr0Var, yjeVar, (byte) 1);
            case 2:
                return new mcr0(scr0Var, yjeVar, (byte) 2);
            case 3:
                mcr0 mcr0Var = new mcr0(scr0Var, yjeVar, (byte) 3);
                mcr0Var.j = ((Boolean) obj).booleanValue();
                return mcr0Var;
            default:
                return new mcr0(scr0Var, yjeVar, (byte) 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((mcr0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((mcr0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((mcr0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((mcr0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((mcr0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        boolean z = true;
        scr0 scr0Var = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    hnu hnuVar = scr0Var.q;
                    String str = scr0Var.o;
                    this.j = true;
                    ouu ouuVar = (ouu) hnuVar.f13365a;
                    obj = qjj.d0(((mne) ouuVar.b).b, new oed(ouuVar, str, yjeVar, (byte) 22), this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                rar0 rar0Var = (rar0) obj;
                int i = scr0.E;
                p7m0 p7m0Var = scr0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, gcr0.a((gcr0) value, null, null, null, false, false, rar0Var.d.isEmpty(), false, rar0Var, 71)));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    jwu jwuVar = scr0Var.v;
                    String str2 = scr0Var.o;
                    this.j = true;
                    if (jwuVar.b(str2, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    jwu jwuVar2 = scr0Var.v;
                    String str3 = scr0Var.o;
                    this.j = true;
                    if (jwuVar2.b(str3, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                boolean z5 = this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                boolean z6 = !z5 && ((gcr0) scr0Var.D()).d;
                if (!z5 || (!((gcr0) scr0Var.D()).e && !((gcr0) scr0Var.D()).f)) {
                    z = false;
                }
                if (z6 || z) {
                    int i2 = scr0.E;
                    scr0Var.N();
                }
                return Unit.f46060a;
            default:
                wne wneVar5 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    bby bbyVar = scr0Var.B;
                    if (bbyVar != null) {
                        this.j = true;
                        if (zvw.H(bbyVar, this) == wneVar5) {
                            return wneVar5;
                        }
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                scr0Var.B = null;
                return Unit.f46060a;
        }
    }
}
