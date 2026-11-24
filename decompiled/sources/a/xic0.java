package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xic0 implements kmq, fer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40937a;
    public final /* synthetic */ hjc0 b;

    public /* synthetic */ xic0(hjc0 hjc0Var, byte b) {
        this.f40937a = b;
        this.b = hjc0Var;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        Object value;
        zic0 zic0Var;
        byte b = this.f40937a;
        hjc0 hjc0Var = this.b;
        switch (b) {
            case 0:
                i16 i16Var = (i16) obj;
                if (i16Var != null) {
                    if (i16Var instanceof w06) {
                        twn.A(((w06) i16Var).f38335a, hjc0Var.l, null);
                    } else if (i16Var instanceof a16) {
                        hjc0Var.y(((a16) i16Var).f55a.f19888a);
                    } else if (i16Var instanceof c16) {
                        hjc0Var.x();
                    } else if (i16Var instanceof g16) {
                        p7m0 p7m0Var = hjc0Var.k;
                        p7m0Var.getClass();
                        p7m0Var.o(null, ajc0.f968a);
                        if (hjc0Var.f.c()) {
                            hjc0Var.z();
                        }
                    }
                }
                return Unit.f46060a;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                p7m0 p7m0Var2 = hjc0Var.j;
                do {
                    value = p7m0Var2.getValue();
                    zic0Var = (zic0) value;
                } while (!p7m0Var2.m(value, zic0.a(zic0Var, zBooleanValue && zic0Var.b > 0, 0, zBooleanValue, !zBooleanValue, 2)));
                if (zBooleanValue) {
                    hjc0Var.z();
                }
                return Unit.f46060a;
            default:
                Object objA = hjc0Var.A((pl5) obj, yjeVar);
                return objA == wne.f39444a ? objA : Unit.f46060a;
        }
    }

    @Override // a.fer
    public final wdr b() {
        switch (this.f40937a) {
            case 0:
                return new xo(2, this.b, hjc0.class, "handleCommand", "handleCommand(Lorg/xplatform/bonus_games/impl/core/domain/models/BasePromoGameCommand;)V", 4);
            case 1:
                return new xo(2, this.b, hjc0.class, "observeConnectionState", "observeConnectionState(Z)V", 4);
            default:
                return new rer(2, this.b, hjc0.class, "updateRotationData", "updateRotationData(Lorg/xplatform/bonus_games/impl/core/domain/models/BalanceModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f40937a) {
            case 0:
                if ((obj instanceof kmq) && (obj instanceof fer)) {
                    return b().equals(((fer) obj).b());
                }
                return false;
            case 1:
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
        switch (this.f40937a) {
            case 0:
                break;
            case 1:
                break;
        }
        return b().hashCode();
    }
}
