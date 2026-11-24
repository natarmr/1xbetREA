package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class fbg extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ hbg k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fbg(hbg hbgVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = hbgVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        hbg hbgVar = this.k;
        switch (b) {
            case 0:
                fbg fbgVar = new fbg(hbgVar, yjeVar, (byte) 0);
                fbgVar.j = ((Boolean) obj).booleanValue();
                return fbgVar;
            case 1:
                return new fbg(hbgVar, yjeVar, (byte) 1);
            default:
                return new fbg(hbgVar, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((fbg) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((fbg) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((fbg) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        ol60 ol60Var;
        Object objA;
        byte b = this.i;
        hbg hbgVar = this.k;
        byte b2 = 1;
        yje yjeVar = null;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (z) {
                    bby bbyVar = hbgVar.x;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    hbgVar.x = sac.V(jiu0.a(hbgVar), new aag(hbgVar, b2), null, hbgVar.e.f22085a, new ya(hbgVar, yjeVar, (byte) 19), 10);
                } else if (!z && !(hbgVar.u.getValue() instanceof u9g)) {
                    hbgVar.A();
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (z2) {
                    if (z2) {
                        z1x.P(obj);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                ul9 ul9Var = (ul9) hbgVar.g.f23782a;
                switch (ul9Var.f35861a) {
                    case 0:
                        ol60Var = ((hl9) ul9Var.d).f;
                        break;
                    default:
                        ol60Var = ((s3t0) ul9Var.d).f;
                        break;
                }
                b1f b1fVar = new b1f((Object) hbgVar, yjeVar, (byte) 10);
                this.j = true;
                ol60Var.c(new vnq(h660.f12515a, b1fVar, (byte) 2), this);
                return wneVar2;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    uoc uocVar = hbgVar.m;
                    this.j = true;
                    ul9 ul9Var2 = uocVar.f36006a;
                    switch (ul9Var2.f35861a) {
                        case 0:
                            objA = ((hl9) ul9Var2.d).a(this);
                            if (objA != wne.f39444a) {
                                objA = Unit.f46060a;
                            }
                            break;
                        default:
                            objA = ((s3t0) ul9Var2.d).a(this);
                            if (objA != wne.f39444a) {
                                objA = Unit.f46060a;
                            }
                            break;
                    }
                    if (objA != wneVar3) {
                        objA = Unit.f46060a;
                    }
                    if (objA == wneVar3) {
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
        }
    }
}
