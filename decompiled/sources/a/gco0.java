package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class gco0 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ zco0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gco0(zco0 zco0Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = zco0Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        zco0 zco0Var = this.k;
        switch (b) {
            case 0:
                return new gco0(zco0Var, yjeVar, (byte) 0);
            case 1:
                return new gco0(zco0Var, yjeVar, (byte) 1);
            case 2:
                return new gco0(zco0Var, yjeVar, (byte) 2);
            case 3:
                return new gco0(zco0Var, yjeVar, (byte) 3);
            case 4:
                return new gco0(zco0Var, yjeVar, (byte) 4);
            case 5:
                return new gco0(zco0Var, yjeVar, (byte) 5);
            case 6:
                return new gco0(zco0Var, yjeVar, (byte) 6);
            case 7:
                return new gco0(zco0Var, yjeVar, (byte) 7);
            case 8:
                return new gco0(zco0Var, yjeVar, (byte) 8);
            default:
                return new gco0(zco0Var, yjeVar, (byte) 9);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
        }
        return ((gco0) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        zco0 zco0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    spc spcVar = zco0Var.R;
                    this.j = true;
                    if (spcVar.a(this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i = zco0.r0;
                zco0Var.E();
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    hjd hjdVar = (hjd) zco0Var.I.get();
                    y1p y1pVar = y1p.MAIN;
                    cid cidVar = new cid("popular_new_sport", new kr2());
                    this.j = true;
                    hjdVar.getClass();
                    if (hjdVar.a(cidVar, this) == wneVar2) {
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
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (z3) {
                    if (z3) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                this.j = true;
                int i2 = zco0.r0;
                Object objN = zco0Var.N(this);
                return objN == wneVar3 ? wneVar3 : objN;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (z4) {
                    if (z4) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                this.j = true;
                int i3 = zco0.r0;
                Object objN2 = zco0Var.N(this);
                return objN2 == wneVar4 ? wneVar4 : objN2;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (z5) {
                    if (z5) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                this.j = true;
                int i4 = zco0.r0;
                Object objN3 = zco0Var.N(this);
                return objN3 == wneVar5 ? wneVar5 : objN3;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (z6) {
                    if (z6) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                this.j = true;
                int i5 = zco0.r0;
                Object objN4 = zco0Var.N(this);
                return objN4 == wneVar6 ? wneVar6 : objN4;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (z7) {
                    if (z7) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                this.j = true;
                int i6 = zco0.r0;
                Object objN5 = zco0Var.N(this);
                return objN5 == wneVar7 ? wneVar7 : objN5;
            case 7:
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (z8) {
                    if (z8) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                this.j = true;
                int i7 = zco0.r0;
                Object objN6 = zco0Var.N(this);
                return objN6 == wneVar8 ? wneVar8 : objN6;
            case 8:
                wne wneVar9 = wne.f39444a;
                boolean z9 = this.j;
                if (z9) {
                    if (z9) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                this.j = true;
                int i8 = zco0.r0;
                Object objN7 = zco0Var.N(this);
                return objN7 == wneVar9 ? wneVar9 : objN7;
            default:
                wne wneVar10 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    spc spcVar2 = zco0Var.R;
                    this.j = true;
                    if (spcVar2.a(this) == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
