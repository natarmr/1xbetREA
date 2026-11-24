package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w720 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38651a;
    public final /* synthetic */ ry6 b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ w720(ry6 ry6Var, Function0 function0, byte b) {
        this.f38651a = b;
        this.b = ry6Var;
        this.c = function0;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f38651a;
        Function0 function0 = this.c;
        final ry6 ry6Var = this.b;
        final byte b2 = 0;
        final byte b3 = 1;
        y5d y5dVar = (y5d) obj;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                y5dVar.getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    wgm0.m(null, ry6Var.f31298a, function0, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                y5dVar.getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    uf40 uf40Var = ry6Var.b;
                    m8x.n(null, uf40Var.c, uf40Var.d, u1c.M(1297439409, new w720(ry6Var, function0, (byte) 2), fetVar2), u1c.M(973431026, new xdr() { // from class: a.y720
                        @Override // a.xdr
                        public final Object F(Object obj4, Object obj5, Object obj6) {
                            byte b4 = b2;
                            ry6 ry6Var2 = ry6Var;
                            y5d y5dVar2 = (y5d) obj4;
                            fet fetVar3 = (fet) obj5;
                            int iIntValue3 = ((Integer) obj6).intValue();
                            switch (b4) {
                                case 0:
                                    y5dVar2.getClass();
                                    if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                        jm40 jm40Var = jm40.b;
                                        r7x.c(6, fetVar3, o7k0.d(jm40Var, 1.0f), ((kgs) ry6Var2.b.f35562a).f18255a);
                                        String str = ry6Var2.c;
                                        if (str == null) {
                                            fetVar3.e0(-135217635);
                                            fetVar3.r(false);
                                        } else {
                                            fetVar3.e0(-135217634);
                                            zcl zclVar = qmk.f28987a;
                                            o5n0.c(0, fetVar3, s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), str);
                                            fetVar3.r(false);
                                        }
                                    } else {
                                        fetVar3.X();
                                    }
                                    break;
                                default:
                                    y5dVar2.getClass();
                                    if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                        zcl zclVar2 = qmk.f28987a;
                                        idx.h(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 2.0f, 7), (b480) ry6Var2.b.b, fetVar3, 0);
                                    } else {
                                        fetVar3.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar2), u1c.M(649422643, new xdr() { // from class: a.y720
                        @Override // a.xdr
                        public final Object F(Object obj4, Object obj5, Object obj6) {
                            byte b4 = b3;
                            ry6 ry6Var2 = ry6Var;
                            y5d y5dVar2 = (y5d) obj4;
                            fet fetVar3 = (fet) obj5;
                            int iIntValue3 = ((Integer) obj6).intValue();
                            switch (b4) {
                                case 0:
                                    y5dVar2.getClass();
                                    if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                        jm40 jm40Var = jm40.b;
                                        r7x.c(6, fetVar3, o7k0.d(jm40Var, 1.0f), ((kgs) ry6Var2.b.f35562a).f18255a);
                                        String str = ry6Var2.c;
                                        if (str == null) {
                                            fetVar3.e0(-135217635);
                                            fetVar3.r(false);
                                        } else {
                                            fetVar3.e0(-135217634);
                                            zcl zclVar = qmk.f28987a;
                                            o5n0.c(0, fetVar3, s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), str);
                                            fetVar3.r(false);
                                        }
                                    } else {
                                        fetVar3.X();
                                    }
                                    break;
                                default:
                                    y5dVar2.getClass();
                                    if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                        zcl zclVar2 = qmk.f28987a;
                                        idx.h(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 2.0f, 7), (b480) ry6Var2.b.b, fetVar3, 0);
                                    } else {
                                        fetVar3.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar2), fetVar2, 224256);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                y5dVar.getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    String str = ry6Var.e;
                    if (str == null) {
                        fetVar3.e0(1606806566);
                        fetVar3.r(false);
                    } else {
                        fetVar3.e0(1606806567);
                        zcl zclVar = qmk.f28987a;
                        ydx.k(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 2.0f, 7), str, function0, fetVar3, 0);
                        fetVar3.r(false);
                    }
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
