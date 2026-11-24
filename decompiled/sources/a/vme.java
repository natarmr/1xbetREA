package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class vme extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ hpa0 k;
    public final /* synthetic */ p5q0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vme(hpa0 hpa0Var, p5q0 p5q0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = hpa0Var;
        this.l = p5q0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new vme(this.k, this.l, yjeVar, (byte) 0);
            case 1:
                return new vme(this.k, this.l, yjeVar, (byte) 1);
            default:
                return new vme(this.k, this.l, yjeVar, (byte) 2);
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
        }
        return ((vme) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        hpa0 hpa0Var = this.k;
        final p5q0 p5q0Var = this.l;
        final byte b2 = 1;
        yje yjeVar = null;
        switch (b) {
            case 0:
                Object obj2 = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    this.j = true;
                    Object objJ = d5c.J(this, new khx((Object) hpa0Var, (Object) p5q0Var, yjeVar, (byte) 7));
                    if (objJ != obj2) {
                        objJ = Unit.f46060a;
                    }
                    if (objJ == obj2) {
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
                    this.j = true;
                    Object objY = ebc.Y(hpa0Var, new wij(p5q0Var, yjeVar, (byte) 2), this);
                    if (objY != obj3) {
                        objY = Unit.f46060a;
                    }
                    if (objY == obj3) {
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
            default:
                Object obj4 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    this.j = true;
                    final byte b3 = 0;
                    Object objE = bel.e(this.k, new l710(p5q0Var, (byte) 0), new Function0() { // from class: a.m710
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b4 = b3;
                            p5q0 p5q0Var2 = p5q0Var;
                            switch (b4) {
                                case 0:
                                    p5q0Var2.c();
                                    break;
                                default:
                                    p5q0Var2.onCancel();
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, new Function0() { // from class: a.m710
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b4 = b2;
                            p5q0 p5q0Var2 = p5q0Var;
                            switch (b4) {
                                case 0:
                                    p5q0Var2.c();
                                    break;
                                default:
                                    p5q0Var2.onCancel();
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, new g2z(p5q0Var, (byte) 20), this);
                    if (objE != obj4) {
                        objE = Unit.f46060a;
                    }
                    if (objE == obj4) {
                        return obj4;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
