package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class av2 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1506a;
    public final /* synthetic */ mie0 b;
    public final /* synthetic */ vne c;
    public final /* synthetic */ Function2 d;

    public /* synthetic */ av2(mie0 mie0Var, vne vneVar, Function2 function2, byte b) {
        this.f1506a = b;
        this.b = mie0Var;
        this.c = vneVar;
        this.d = function2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        yu2 yu2Var;
        zu2 zu2Var;
        byte b = this.f1506a;
        mie0 mie0Var = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof yu2) {
                    yu2Var = (yu2) yjeVar;
                    int i = yu2Var.l;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        yu2Var.l = i - Integer.MIN_VALUE;
                    } else {
                        yu2Var = new yu2(this, yjeVar);
                    }
                } else {
                    yu2Var = new yu2(this, yjeVar);
                }
                Object obj2 = yu2Var.j;
                wne wneVar = wne.f39444a;
                int i2 = yu2Var.l;
                if (i2 == 0) {
                    z1x.P(obj2);
                    bby bbyVar = (bby) mie0Var.f21842a;
                    if (bbyVar != null) {
                        bbyVar.cancel(new lu2());
                        yu2Var.i = obj;
                        yu2Var.l = 1;
                        if (bbyVar.join(yu2Var) == wneVar) {
                            return wneVar;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = yu2Var.i;
                    z1x.P(obj2);
                }
                Object obj3 = obj;
                yne yneVar = yne.d;
                vne vneVar = this.c;
                mie0Var.f21842a = qjj.W(vneVar, null, yneVar, new xu2(this.d, obj3, vneVar, null, (byte) 0), 1);
                return Unit.f46060a;
            default:
                if (yjeVar instanceof zu2) {
                    zu2Var = (zu2) yjeVar;
                    int i3 = zu2Var.l;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        zu2Var.l = i3 - Integer.MIN_VALUE;
                    } else {
                        zu2Var = new zu2(this, yjeVar);
                    }
                } else {
                    zu2Var = new zu2(this, yjeVar);
                }
                Object obj4 = zu2Var.j;
                wne wneVar2 = wne.f39444a;
                int i4 = zu2Var.l;
                if (i4 == 0) {
                    z1x.P(obj4);
                    bby bbyVar2 = (bby) mie0Var.f21842a;
                    if (bbyVar2 != null) {
                        bbyVar2.cancel(new mu2());
                        zu2Var.i = obj;
                        zu2Var.l = 1;
                        if (bbyVar2.join(zu2Var) == wneVar2) {
                            return wneVar2;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = zu2Var.i;
                    z1x.P(obj4);
                }
                Object obj5 = obj;
                yne yneVar2 = yne.d;
                vne vneVar2 = this.c;
                mie0Var.f21842a = qjj.W(vneVar2, null, yneVar2, new xu2(this.d, obj5, vneVar2, null, (byte) 1), 1);
                return Unit.f46060a;
        }
    }
}
