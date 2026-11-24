package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dkc0 implements kmq, fer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6224a;
    public final /* synthetic */ gkc0 b;

    public /* synthetic */ dkc0(gkc0 gkc0Var, byte b) {
        this.f6224a = b;
        this.b = gkc0Var;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        byte b = this.f6224a;
        yje yjeVar2 = null;
        gkc0 gkc0Var = this.b;
        switch (b) {
            case 0:
                i16 i16Var = (i16) obj;
                trm0 trm0Var = gkc0Var.g;
                p7m0 p7m0Var = gkc0Var.n;
                p7m0 p7m0Var2 = gkc0Var.p;
                if (i16Var != null) {
                    if (i16Var instanceof a16) {
                        le8 le8Var = ((a16) i16Var).f55a;
                        p7m0Var.getClass();
                        p7m0Var.o(null, vjc0.f37520a);
                        trm0Var.k(le8Var.c);
                    } else if ((i16Var instanceof b16) || (i16Var instanceof f16)) {
                        gkc0Var.j.d(true);
                        p7m0Var.getClass();
                        p7m0Var.o(null, wjc0.f39256a);
                    } else if (i16Var instanceof x06) {
                        boolean z = ((x06) i16Var).f40056a;
                        if (gkc0Var.e.c()) {
                            qjc0 qjc0Var = new qjc0(z);
                            p7m0Var2.getClass();
                            p7m0Var2.o(null, qjc0Var);
                        } else {
                            gkc0Var.z();
                        }
                    } else if (i16Var instanceof y06) {
                        rjc0 rjc0Var = new rjc0(((y06) i16Var).f41791a);
                        p7m0Var2.getClass();
                        p7m0Var2.o(null, rjc0Var);
                    } else if (i16Var instanceof d16) {
                        gkc0Var.z();
                    } else if (i16Var instanceof h16) {
                        ikt0 ikt0Var = gkc0Var.d;
                        vpv0 vpv0Var = vpv0.b;
                        long jA = gkc0Var.k.a();
                        ikt0Var.getClass();
                        ((tnc0) ikt0Var.f14945a).a(kotlin.collections.a.c(new no60(jA, vpv0Var)));
                        p7m0Var2.getClass();
                        p7m0Var2.o(null, sjc0.f32298a);
                    } else if (i16Var instanceof e16) {
                        k390 k390Var = ((e16) i16Var).f7023a;
                        trm0Var.k(k390Var.d);
                        gkc0Var.h.a(k390Var.c, k390Var.b);
                    }
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                w06 w06Var = new w06(zBooleanValue);
                sac.V(jiu0.a(gkc0Var), ckc0.f4500a, null, gkc0Var.i.f22085a, new o690((Object) gkc0Var, (Object) w06Var, yjeVar2, (byte) 20), 10);
                if (!gkc0Var.r) {
                    gkc0Var.r = true;
                    if (!zBooleanValue) {
                        gkc0Var.z();
                    }
                }
                if (zBooleanValue && (gkc0Var.o.getValue() instanceof njc0)) {
                    gkc0Var.x();
                }
                break;
        }
        return Unit.f46060a;
    }

    @Override // a.fer
    public final wdr b() {
        switch (this.f6224a) {
            case 0:
                return new xo(2, this.b, gkc0.class, "handleCommand", "handleCommand(Lorg/xplatform/bonus_games/impl/core/domain/models/BasePromoGameCommand;)V", 4);
            default:
                return new xo(2, this.b, gkc0.class, "handleConnected", "handleConnected(Z)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f6224a) {
            case 0:
                if ((obj instanceof kmq) && (obj instanceof fer)) {
                    return b().equals(((fer) obj).b());
                }
                return false;
            default:
                if ((obj instanceof kmq) && (obj instanceof fer)) {
                    return b().equals(((fer) obj).b());
                }
                return false;
        }
    }

    public final int hashCode() {
        switch (this.f6224a) {
            case 0:
                break;
        }
        return b().hashCode();
    }
}
