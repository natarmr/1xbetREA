package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xym implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41711a;
    public final /* synthetic */ bzm b;

    public /* synthetic */ xym(bzm bzmVar, byte b) {
        this.f41711a = b;
        this.b = bzmVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f41711a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        final bzm bzmVar = this.b;
        final byte b2 = 2;
        final byte b3 = 0;
        final byte b4 = 1;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    yx7 yx7Var = gqw0.k;
                    zcl zclVar = qmk.f28987a;
                    thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), yx7Var, fetVar, 48);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    fetVar.e0(-822005058);
                    boolean zG = fetVar.g(bzmVar);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new Function0() { // from class: a.zym
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b5 = b3;
                                bzm bzmVar2 = bzmVar;
                                switch (b5) {
                                    case 0:
                                        return new u6n(d4d.SECONDARY60, w6n.j, bzmVar2.b);
                                    case 1:
                                        return new u6n(d4d.SECONDARY60, w6n.j, bzmVar2.c);
                                    case 2:
                                        return new u6n(d4d.SECONDARY60, w6n.j, bzmVar2.b);
                                    default:
                                        return new u6n(d4d.SECONDARY60, w6n.j, bzmVar2.c);
                                }
                            }
                        };
                        fetVar.o0(objP);
                    }
                    kkb.p(1, fetVar, null, (Function0) objP);
                    fetVar.r(false);
                    if (bzmVar.c != null) {
                        fetVar.e0(-821591394);
                        boolean zG2 = fetVar.g(bzmVar);
                        Object objP2 = fetVar.P();
                        if (zG2 || objP2 == cl5Var) {
                            objP2 = new Function0() { // from class: a.zym
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    byte b5 = b4;
                                    bzm bzmVar2 = bzmVar;
                                    switch (b5) {
                                        case 0:
                                            return new u6n(d4d.SECONDARY60, w6n.j, bzmVar2.b);
                                        case 1:
                                            return new u6n(d4d.SECONDARY60, w6n.j, bzmVar2.c);
                                        case 2:
                                            return new u6n(d4d.SECONDARY60, w6n.j, bzmVar2.b);
                                        default:
                                            return new u6n(d4d.SECONDARY60, w6n.j, bzmVar2.c);
                                    }
                                }
                            };
                            fetVar.o0(objP2);
                        }
                        kkb.p(1, fetVar, null, (Function0) objP2);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-821231980);
                        fetVar.r(false);
                    }
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            default:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    yx7 yx7Var2 = gqw0.k;
                    zcl zclVar2 = qmk.f28987a;
                    thg0 thg0VarA2 = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), yx7Var2, fetVar, 48);
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA2, gqw0.x);
                    jpm0.o(fetVar, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC1, gqw0.v);
                    fetVar.e0(785492610);
                    boolean zG3 = fetVar.g(bzmVar);
                    Object objP3 = fetVar.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new Function0() { // from class: a.zym
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b5 = b2;
                                bzm bzmVar2 = bzmVar;
                                switch (b5) {
                                    case 0:
                                        return new u6n(d4d.SECONDARY60, w6n.j, bzmVar2.b);
                                    case 1:
                                        return new u6n(d4d.SECONDARY60, w6n.j, bzmVar2.c);
                                    case 2:
                                        return new u6n(d4d.SECONDARY60, w6n.j, bzmVar2.b);
                                    default:
                                        return new u6n(d4d.SECONDARY60, w6n.j, bzmVar2.c);
                                }
                            }
                        };
                        fetVar.o0(objP3);
                    }
                    kkb.p(1, fetVar, null, (Function0) objP3);
                    fetVar.r(false);
                    if (bzmVar.c != null) {
                        fetVar.e0(785906274);
                        boolean zG4 = fetVar.g(bzmVar);
                        Object objP4 = fetVar.P();
                        if (zG4 || objP4 == cl5Var) {
                            final byte b5 = 3;
                            objP4 = new Function0() { // from class: a.zym
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    byte b6 = b5;
                                    bzm bzmVar2 = bzmVar;
                                    switch (b6) {
                                        case 0:
                                            return new u6n(d4d.SECONDARY60, w6n.j, bzmVar2.b);
                                        case 1:
                                            return new u6n(d4d.SECONDARY60, w6n.j, bzmVar2.c);
                                        case 2:
                                            return new u6n(d4d.SECONDARY60, w6n.j, bzmVar2.b);
                                        default:
                                            return new u6n(d4d.SECONDARY60, w6n.j, bzmVar2.c);
                                    }
                                }
                            };
                            fetVar.o0(objP4);
                        }
                        kkb.p(1, fetVar, null, (Function0) objP4);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(786265688);
                        fetVar.r(false);
                    }
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
