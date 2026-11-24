package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class hae extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ aa40 k;
    public final /* synthetic */ g4v0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hae(aa40 aa40Var, g4v0 g4v0Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = aa40Var;
        this.l = g4v0Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        g4v0 g4v0Var = this.l;
        aa40 aa40Var = this.k;
        switch (b) {
            case 0:
                return new hae(aa40Var, g4v0Var, yjeVar, (byte) 0);
            case 1:
                return new hae(aa40Var, g4v0Var, yjeVar, (byte) 1);
            case 2:
                return new hae(aa40Var, g4v0Var, yjeVar, (byte) 2);
            case 3:
                return new hae(aa40Var, g4v0Var, yjeVar, (byte) 3);
            case 4:
                return new hae(aa40Var, g4v0Var, yjeVar, (byte) 4);
            case 5:
                return new hae(aa40Var, g4v0Var, yjeVar, (byte) 5);
            case 6:
                return new hae(aa40Var, g4v0Var, yjeVar, (byte) 6);
            case 7:
                return new hae(aa40Var, g4v0Var, yjeVar, (byte) 7);
            default:
                return new hae(aa40Var, g4v0Var, yjeVar, (byte) 8);
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
        }
        return ((hae) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        g4v0 g4v0Var = this.l;
        aa40 aa40Var = this.k;
        byte b2 = 1;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    rwj rwjVar = tvk.f34603a;
                    dvj dvjVar = dvj.c;
                    gae gaeVar = new gae(aa40Var, g4v0Var, yjeVar, (byte) 0);
                    this.j = true;
                    if (qjj.d0(dvjVar, gaeVar, this) == wneVar) {
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
                    rwj rwjVar2 = tvk.f34603a;
                    dvj dvjVar2 = dvj.c;
                    gae gaeVar2 = new gae(aa40Var, g4v0Var, yjeVar, b2);
                    this.j = true;
                    if (qjj.d0(dvjVar2, gaeVar2, this) == wneVar2) {
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
                    rwj rwjVar3 = tvk.f34603a;
                    dvj dvjVar3 = dvj.c;
                    gae gaeVar3 = new gae(aa40Var, g4v0Var, yjeVar, (byte) 2);
                    this.j = true;
                    if (qjj.d0(dvjVar3, gaeVar3, this) == wneVar3) {
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
                    rwj rwjVar4 = tvk.f34603a;
                    dvj dvjVar4 = dvj.c;
                    gae gaeVar4 = new gae(aa40Var, g4v0Var, yjeVar, (byte) 3);
                    this.j = true;
                    if (qjj.d0(dvjVar4, gaeVar4, this) == wneVar4) {
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
                    rwj rwjVar5 = tvk.f34603a;
                    dvj dvjVar5 = dvj.c;
                    gae gaeVar5 = new gae(aa40Var, g4v0Var, yjeVar, (byte) 4);
                    this.j = true;
                    if (qjj.d0(dvjVar5, gaeVar5, this) == wneVar5) {
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
                    rwj rwjVar6 = tvk.f34603a;
                    dvj dvjVar6 = dvj.c;
                    gae gaeVar6 = new gae(aa40Var, g4v0Var, yjeVar, (byte) 5);
                    this.j = true;
                    if (qjj.d0(dvjVar6, gaeVar6, this) == wneVar6) {
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
                    rwj rwjVar7 = tvk.f34603a;
                    dvj dvjVar7 = dvj.c;
                    gae gaeVar7 = new gae(aa40Var, g4v0Var, yjeVar, (byte) 6);
                    this.j = true;
                    if (qjj.d0(dvjVar7, gaeVar7, this) == wneVar7) {
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
                    rwj rwjVar8 = tvk.f34603a;
                    dvj dvjVar8 = dvj.c;
                    gae gaeVar8 = new gae(aa40Var, g4v0Var, yjeVar, (byte) 7);
                    this.j = true;
                    if (qjj.d0(dvjVar8, gaeVar8, this) == wneVar8) {
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
                    rwj rwjVar9 = tvk.f34603a;
                    dvj dvjVar9 = dvj.c;
                    gae gaeVar9 = new gae(aa40Var, g4v0Var, yjeVar, (byte) 8);
                    this.j = true;
                    if (qjj.d0(dvjVar9, gaeVar9, this) == wneVar9) {
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
