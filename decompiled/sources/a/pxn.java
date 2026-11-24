package a;

import android.javax.sip.message.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class pxn extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ t33 k;
    public final /* synthetic */ zsf l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pxn(t33 t33Var, zsf zsfVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = t33Var;
        this.l = zsfVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        zsf zsfVar = this.l;
        t33 t33Var = this.k;
        switch (b) {
            case 0:
                return new pxn(t33Var, zsfVar, yjeVar, (byte) 0);
            case 1:
                return new pxn(t33Var, zsfVar, yjeVar, (byte) 1);
            case 2:
                return new pxn(t33Var, zsfVar, yjeVar, (byte) 2);
            case 3:
                return new pxn(t33Var, zsfVar, yjeVar, (byte) 3);
            case 4:
                return new pxn(t33Var, zsfVar, yjeVar, (byte) 4);
            case 5:
                return new pxn(t33Var, zsfVar, yjeVar, (byte) 5);
            case 6:
                return new pxn(t33Var, zsfVar, yjeVar, (byte) 6);
            case 7:
                return new pxn(t33Var, zsfVar, yjeVar, (byte) 7);
            default:
                return new pxn(t33Var, zsfVar, yjeVar, (byte) 8);
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
        }
        return ((pxn) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        zsf zsfVar = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    Float f = new Float(1.0f);
                    uts0 uts0VarM0 = ro4.m0(Response.BAD_REQUEST, 0, zsfVar, 2);
                    this.j = true;
                    if (t33.a(this.k, f, uts0VarM0, null, null, this, 12) == wneVar) {
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
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    Float f2 = new Float(0.0f);
                    uts0 uts0VarM1 = ro4.m0(Response.BAD_REQUEST, 0, zsfVar, 2);
                    this.j = true;
                    if (t33.a(this.k, f2, uts0VarM1, null, null, this, 12) == wneVar2) {
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
                if (!z3) {
                    z1x.P(obj);
                    Float f3 = new Float(1.0f);
                    uts0 uts0VarM2 = ro4.m0(Response.BAD_REQUEST, 0, zsfVar, 2);
                    this.j = true;
                    if (t33.a(this.k, f3, uts0VarM2, null, null, this, 12) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    Float f4 = new Float(1.0f);
                    uts0 uts0VarM3 = ro4.m0(Response.BUSY_EVERYWHERE, 0, zsfVar, 2);
                    this.j = true;
                    if (t33.a(this.k, f4, uts0VarM3, null, null, this, 12) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    Float f5 = new Float(1.0f);
                    uts0 uts0VarM4 = ro4.m0(Response.BUSY_EVERYWHERE, 0, zsfVar, 2);
                    this.j = true;
                    if (t33.a(this.k, f5, uts0VarM4, null, null, this, 12) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    Float f6 = new Float(0.0f);
                    uts0 uts0VarM5 = ro4.m0(Response.BAD_REQUEST, 0, zsfVar, 2);
                    this.j = true;
                    if (t33.a(this.k, f6, uts0VarM5, null, null, this, 12) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    Float f7 = new Float(0.0f);
                    uts0 uts0VarM6 = ro4.m0(Response.BAD_REQUEST, 0, zsfVar, 2);
                    this.j = true;
                    if (t33.a(this.k, f7, uts0VarM6, null, null, this, 12) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    Float f8 = new Float(0.0f);
                    uts0 uts0VarM7 = ro4.m0(Response.BAD_REQUEST, 0, zsfVar, 2);
                    this.j = true;
                    if (t33.a(this.k, f8, uts0VarM7, null, null, this, 12) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar9 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    Float f9 = new Float(0.0f);
                    uts0 uts0VarM8 = ro4.m0(Response.BAD_REQUEST, 0, zsfVar, 2);
                    this.j = true;
                    if (t33.a(this.k, f9, uts0VarM8, null, null, this, 12) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
