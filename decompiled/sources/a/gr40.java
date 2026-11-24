package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gr40 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11763a = 1;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ ur40 c;

    public /* synthetic */ gr40(mm40 mm40Var, ur40 ur40Var, int i) {
        this.b = mm40Var;
        this.c = ur40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f11763a;
        final ur40 ur40Var = this.c;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                final byte b2 = 0;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean z = ur40Var instanceof sr40;
                    mm40 mm40Var = this.b;
                    if (z) {
                        fetVar.e0(-80110045);
                        v8q0.a(((sr40) ur40Var).f32658a, mm40Var, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 0, 0, 130040);
                        fetVar.r(false);
                    } else {
                        if (!(ur40Var instanceof tr40)) {
                            throw b1j.f(-2080794189, fetVar, false);
                        }
                        fetVar.e0(-79712873);
                        pm80 pm80VarF = a8k0.F(R.drawable.hero_mortal_kombat_placeholder, 0, fetVar);
                        String strW = rsm0.w(R.string.vs, 0, fetVar);
                        thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar, 54);
                        int iHashCode = Long.hashCode(fetVar.T);
                        bh90 bh90VarM = fetVar.m();
                        mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, thg0VarA, gqw0.x);
                        jpm0.o(fetVar, bh90VarM, gqw0.w);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC0, gqw0.v);
                        zcl zclVar = qmk.f28987a;
                        jm40 jm40Var = jm40.b;
                        mm40 mm40VarN = o7k0.n(jm40Var, 28.0f);
                        tr40 tr40Var = (tr40) ur40Var;
                        long j = tr40Var.c;
                        zcl zclVar2 = qmk.d;
                        ugg0 ugg0Var = vgg0.f37379a;
                        mm40 mm40VarE0 = o2e.e0(i120.S(mm40VarN, 2.0f, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), "FIRST_HERO_IMAGE_TEST_TAG");
                        boolean zI = fetVar.i(ur40Var);
                        Object objP = fetVar.P();
                        cl5 cl5Var = ukd.f35823a;
                        if (zI || objP == cl5Var) {
                            objP = new Function1() { // from class: a.hr40
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    byte b3 = b2;
                                    ur40 ur40Var2 = ur40Var;
                                    abi0 abi0Var = (abi0) obj3;
                                    switch (b3) {
                                        case 0:
                                            abi0Var.getClass();
                                            cbi0.f(abi0Var, ((tr40) ur40Var2).c);
                                            break;
                                        default:
                                            abi0Var.getClass();
                                            cbi0.f(abi0Var, ((tr40) ur40Var2).d);
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            };
                            fetVar.o0(objP);
                        }
                        k7x.b(tr40Var.f34407a, "", h97.e(zclVar2, zclVar2, zclVar2, zclVar2, s5x0.J(pai0.a(mm40VarE0, false, (Function1) objP), 2.0f)), pm80VarF, pm80VarF, null, null, null, null, null, null, null, fetVar, 36912, 0, 32736);
                        v8q0.a(strW, s5x0.N(jm40Var, 10.0f, 0.0f, 10.0f, 0.0f, 10), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 0, 0, 130040);
                        mm40 mm40VarE1 = o2e.e0(i120.S(o7k0.n(jm40Var, 28.0f), 2.0f, tr40Var.d, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), "SECOND_HERO_IMAGE_TEST_TAG");
                        boolean zI2 = fetVar.i(ur40Var);
                        Object objP2 = fetVar.P();
                        if (zI2 || objP2 == cl5Var) {
                            final byte b3 = 1;
                            objP2 = new Function1() { // from class: a.hr40
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    byte b4 = b3;
                                    ur40 ur40Var2 = ur40Var;
                                    abi0 abi0Var = (abi0) obj3;
                                    switch (b4) {
                                        case 0:
                                            abi0Var.getClass();
                                            cbi0.f(abi0Var, ((tr40) ur40Var2).c);
                                            break;
                                        default:
                                            abi0Var.getClass();
                                            cbi0.f(abi0Var, ((tr40) ur40Var2).d);
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            };
                            fetVar.o0(objP2);
                        }
                        k7x.b(tr40Var.b, "", h97.e(zclVar2, zclVar2, zclVar2, zclVar2, s5x0.J(pai0.a(mm40VarE1, false, (Function1) objP2), 2.0f)), pm80VarF, pm80VarF, null, null, null, null, null, null, null, fetVar, 36912, 0, 32736);
                        fetVar.r(true);
                        fetVar.r(false);
                    }
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                x2x.x(this.b, ur40Var, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ gr40(ur40 ur40Var, mm40 mm40Var) {
        this.c = ur40Var;
        this.b = mm40Var;
    }
}
