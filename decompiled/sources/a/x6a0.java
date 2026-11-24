package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class x6a0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40354a = 1;
    public final /* synthetic */ j4n b;
    public final /* synthetic */ mm40 c;

    public /* synthetic */ x6a0(j4n j4nVar, mm40 mm40Var) {
        this.b = j4nVar;
        this.c = mm40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        float f;
        mm40 mm40VarE;
        fqj0 fqj0VarD0;
        byte b = this.f40354a;
        mm40 mm40Var = this.c;
        j4n j4nVar = this.b;
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                num.getClass();
                b8k0.l(mm40Var, j4nVar, fetVar, x8x.L(1));
                return Unit.f46060a;
            default:
                int iIntValue = num.intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zG = fetVar.g(j4nVar);
                    Object objP = fetVar.P();
                    e4n e4nVar = e4n.f7190a;
                    if (zG || objP == ukd.f35823a) {
                        if (Intrinsics.d(j4nVar, f4n.f8923a)) {
                            zcl zclVar = qmk.f28987a;
                            f = 6.0f;
                        } else {
                            if (Intrinsics.d(j4nVar, g4n.f10675a)) {
                                zcl zclVar2 = qmk.f28987a;
                            } else if (Intrinsics.d(j4nVar, h4n.f12441a)) {
                                zcl zclVar3 = qmk.f28987a;
                                f = 2.0f;
                            } else if (Intrinsics.d(j4nVar, i4n.f14154a)) {
                                zcl zclVar4 = qmk.f28987a;
                            } else {
                                if (!Intrinsics.d(j4nVar, e4nVar)) {
                                    t9f.b();
                                    return null;
                                }
                                zcl zclVar5 = qmk.f28987a;
                                f = 4.0f;
                            }
                            f = 8.0f;
                        }
                        objP = twn.j(f, fetVar);
                    }
                    thg0 thg0VarA = shg0.a(new qw3(((ycl) objP).f42389a, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
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
                    fetVar.e0(529637684);
                    int i = 0;
                    while (i < 3) {
                        boolean z = j4nVar instanceof f4n;
                        jm40 jm40Var = jm40.b;
                        zhg0 zhg0Var = zhg0.f44392a;
                        if (z) {
                            fetVar.e0(67916531);
                            mm40 mm40VarA = zhg0Var.a(1.0f, jm40Var, true);
                            zcl zclVar6 = qmk.f28987a;
                            mm40 mm40VarE2 = o7k0.e(mm40VarA, 40.0f);
                            zcl zclVar7 = qmk.h;
                            ugg0 ugg0Var = vgg0.f37379a;
                            mm40VarE = h97.e(zclVar7, zclVar7, zclVar7, zclVar7, mm40VarE2);
                            fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
                        } else {
                            if (j4nVar instanceof g4n) {
                                fetVar.e0(68362032);
                                mm40 mm40VarA2 = zhg0Var.a(1.0f, jm40Var, true);
                                zcl zclVar8 = qmk.f28987a;
                                mm40 mm40VarE3 = o7k0.e(s5x0.L(mm40VarA2, 0.0f, 6.0f, 1), 36.0f);
                                zcl zclVar9 = qmk.f;
                                ugg0 ugg0Var2 = vgg0.f37379a;
                                mm40VarE = h97.e(zclVar9, zclVar9, zclVar9, zclVar9, mm40VarE3);
                                fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
                            } else if (j4nVar instanceof h4n) {
                                fetVar.e0(68893558);
                                mm40 mm40VarA3 = zhg0Var.a(1.0f, jm40Var, true);
                                zcl zclVar10 = qmk.f28987a;
                                mm40VarE = lgb.J(o7k0.e(s5x0.L(mm40VarA3, 0.0f, 6.0f, 1), 36.0f), vgg0.b(i == 0 ? 12.0f : 0.0f, i == 2 ? 12.0f : 0.0f, i == 2 ? 12.0f : 0.0f, i == 0 ? 12.0f : 0.0f));
                                fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
                            } else if (j4nVar instanceof i4n) {
                                fetVar.e0(69920464);
                                mm40 mm40VarA4 = zhg0Var.a(1.0f, jm40Var, true);
                                zcl zclVar11 = qmk.f28987a;
                                mm40 mm40VarE4 = o7k0.e(s5x0.L(mm40VarA4, 0.0f, 6.0f, 1), 36.0f);
                                zcl zclVar12 = qmk.h;
                                ugg0 ugg0Var3 = vgg0.f37379a;
                                mm40VarE = h97.e(zclVar12, zclVar12, zclVar12, zclVar12, mm40VarE4);
                                fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
                            } else {
                                if (!Intrinsics.d(j4nVar, e4nVar)) {
                                    throw b1j.f(-829093153, fetVar, false);
                                }
                                fetVar.e0(70433297);
                                mm40 mm40VarA5 = zhg0Var.a(1.0f, jm40Var, true);
                                zcl zclVar13 = qmk.f28987a;
                                mm40 mm40VarE5 = o7k0.e(s5x0.L(mm40VarA5, 0.0f, 8.0f, 1), 24.0f);
                                zcl zclVar14 = qmk.e;
                                ugg0 ugg0Var4 = vgg0.f37379a;
                                mm40VarE = h97.e(zclVar14, zclVar14, zclVar14, zclVar14, mm40VarE5);
                                fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
                            }
                        }
                        dw9.x(mm40VarE, fqj0VarD0, fetVar, 0, false);
                        i++;
                    }
                    fetVar.r(false);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ x6a0(mm40 mm40Var, j4n j4nVar, int i) {
        this.c = mm40Var;
        this.b = j4nVar;
    }
}
