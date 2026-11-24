package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class eu3 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ zu3 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eu3(zu3 zu3Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = zu3Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        zu3 zu3Var = this.l;
        switch (b) {
            case 0:
                eu3 eu3Var = new eu3(zu3Var, yjeVar, (byte) 0);
                eu3Var.k = obj;
                return eu3Var;
            default:
                eu3 eu3Var2 = new eu3(zu3Var, yjeVar, (byte) 1);
                eu3Var2.k = obj;
                return eu3Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((eu3) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((eu3) create((vu00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objX;
        byte b = this.i;
        zu3 zu3Var = this.l;
        switch (b) {
            case 0:
                kmq kmqVar = (kmq) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    if (((Boolean) ((umx) ((upx) zu3Var.W.get()).f36090a.f13549a).f35937a.getValue()).booleanValue()) {
                        ((sqx) zu3Var.j.get()).a();
                    }
                    Boolean bool = Boolean.FALSE;
                    this.k = null;
                    this.j = true;
                    if (kmqVar.a(bool, this) == wneVar) {
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
            default:
                vu00 vu00Var = (vu00) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    this.k = null;
                    this.j = true;
                    int i = zu3.s0;
                    ol60 ol60Var = zu3Var.h0;
                    if (vu00Var != null) {
                        if (vu00Var instanceof mu00) {
                            mu00 mu00Var = (mu00) vu00Var;
                            objX = zu3Var.x(mu00Var.f22391a, mu00Var.b, this);
                            if (objX != wneVar2) {
                                objX = Unit.f46060a;
                            }
                        } else {
                            if (vu00Var instanceof tu00) {
                                ol60Var.f(new pt3(((tu00) vu00Var).f34529a));
                            } else if (vu00Var instanceof su00) {
                                if (((sff0) zu3Var.j0.getValue()).f0) {
                                    ol60Var.f(rt3.f31059a);
                                }
                            } else if (vu00Var instanceof nu00) {
                                if (((v8d) zu3Var.i0.getValue()).p == lxw.b) {
                                    ol60Var.f(new mt3(((nu00) vu00Var).f24125a));
                                } else {
                                    ol60Var.f(qt3.f29280a);
                                }
                            } else if (vu00Var instanceof ou00) {
                                ol60Var.f(gt3.f11861a);
                            } else if (vu00Var instanceof pu00) {
                                ol60Var.f(ht3.f13612a);
                            } else if (vu00Var instanceof uu00) {
                                ol60Var.f(new jt3(((uu00) vu00Var).f36280a));
                            } else if (vu00Var instanceof ru00) {
                                ol60Var.f(ut3.f36238a);
                            } else if (vu00Var instanceof qu00) {
                                ol60Var.f(tt3.f34492a);
                            }
                            objX = Unit.f46060a;
                        }
                        if (objX == wneVar2) {
                            return wneVar2;
                        }
                    }
                    t9f.b();
                    return null;
                }
                if (!z2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                return Unit.f46060a;
        }
    }
}
