package a;

import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.games_mania.presentation.views.GamesManiaMapView;
import org.xplatform.related.api.presentation.RelatedParams;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d2s implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5372a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d2s(Object obj, Object obj2, byte b) {
        this.f5372a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        Function1 function1 = (Function1) this.b;
        xcz xczVar = (xcz) this.c;
        i1l0 i1l0Var = (i1l0) obj2;
        fet fetVar = (fet) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((b53) obj).getClass();
        i1l0Var.getClass();
        if ((iIntValue & 48) == 0) {
            iIntValue |= fetVar.g(i1l0Var) ? 32 : 16;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 145) != 144)) {
            boolean z = i1l0Var instanceof h1l0;
            jm40 jm40Var = jm40.b;
            if (z) {
                fetVar.e0(321325578);
                kpb.j(o7k0.y(jm40Var, gqw0.e, 2), null, fetVar, 6, 2);
                fetVar.r(false);
            } else if (i1l0Var instanceof g1l0) {
                fetVar.e0(1371326255);
                mm40 mm40VarE = o7k0.y(jm40Var, null, 3).e(new wkw(gqw0.n));
                mdm mdmVar = ((g1l0) i1l0Var).b;
                boolean zG = fetVar.g(function1);
                Object objP = fetVar.P();
                if (zG || objP == ukd.f35823a) {
                    objP = new uck0(function1, (byte) 6);
                    fetVar.o0(objP);
                }
                jcb.l(mm40VarE, mdmVar, false, (Function0) objP, fetVar, 0, 4);
                fetVar.r(false);
            } else {
                if (!(i1l0Var instanceof d1l0) && !(i1l0Var instanceof e1l0)) {
                    throw b1j.f(321324244, fetVar, false);
                }
                fetVar.e0(321348410);
                o2e.n((f1l0) i1l0Var, xczVar, function1, fetVar, (iIntValue >> 3) & 14);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        lnp0 lnp0Var = (lnp0) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        int iIntValue = ((Integer) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Integer) obj4).intValue();
        ((rk80) obj).getClass();
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
            a4x a4xVar = (a4x) lnp0Var.e.get(iIntValue);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            xcz xczVar = (xcz) arrayList.get(iIntValue);
            boolean zG = fetVar.g(a4xVar);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new oea(a4xVar, (byte) 28);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarD, xczVar, null, null, null, null, false, null, (Function1) objP, fetVar, 6, 508);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        air0 air0Var = (air0) this.b;
        Function1 function1 = (Function1) this.c;
        mm40 mm40Var = (mm40) obj;
        xcz xczVar = (xcz) obj2;
        fet fetVar = (fet) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        mm40Var.getClass();
        xczVar.getClass();
        if ((iIntValue & 6) == 0) {
            i = (fetVar.g(mm40Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= fetVar.g(xczVar) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            hew0.w(mm40Var, xczVar, air0Var.d, function1, fetVar, i & 126);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        l7m0 l7m0Var = (l7m0) this.b;
        njr0 njr0Var = (njr0) this.c;
        mm40 mm40Var = (mm40) obj;
        xcz xczVar = (xcz) obj2;
        fet fetVar = (fet) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        mm40Var.getClass();
        xczVar.getClass();
        if ((iIntValue & 6) == 0) {
            i = (fetVar.g(mm40Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= fetVar.g(xczVar) ? 32 : 16;
        }
        int i2 = i;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean zI = fetVar.i(njr0Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                fup0 fup0Var = new fup0(2, njr0Var, njr0.class, "updateOutcome", "updateOutcome(ILorg/xplatform/toto_bet/active_tirage/domain/model/OutComesModel;)V", 0, (byte) 12);
                fetVar.o0(fup0Var);
                objP = fup0Var;
            }
            Function2 function2 = (Function2) ((jhy) objP);
            boolean zI2 = fetVar.i(njr0Var);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                fup0 fup0Var2 = new fup0(2, njr0Var, njr0.class, "navigateToTotoBetAccurateOutcomesScreen", "navigateToTotoBetAccurateOutcomesScreen(IJ)V", 0, (byte) 13);
                fetVar.o0(fup0Var2);
                objP2 = fup0Var2;
            }
            nia0.Q(mm40Var, xczVar, l7m0Var, function2, (Function2) ((jhy) objP2), fetVar, (i2 & 14) | 384 | (i2 & 112));
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        l7m0 l7m0Var = (l7m0) this.b;
        k3t0 k3t0Var = (k3t0) this.c;
        mm40 mm40Var = (mm40) obj;
        xcz xczVar = (xcz) obj2;
        fet fetVar = (fet) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        mm40Var.getClass();
        xczVar.getClass();
        if ((iIntValue & 6) == 0) {
            i = (fetVar.g(mm40Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        byte b = 16;
        if ((iIntValue & 48) == 0) {
            i |= fetVar.g(xczVar) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            mm40 mm40VarS = o050.S(mm40Var);
            boolean zI = fetVar.i(k3t0Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new ebh(k3t0Var, b);
                fetVar.o0(objP);
            }
            Function1 function1 = (Function1) objP;
            boolean zI2 = fetVar.i(k3t0Var);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                objP2 = new ebh(k3t0Var, (byte) 17);
                fetVar.o0(objP2);
            }
            Function1 function2 = (Function1) objP2;
            boolean zI3 = fetVar.i(k3t0Var);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var) {
                objP3 = new gcn0(k3t0Var, (byte) 15);
                fetVar.o0(objP3);
            }
            x4d0.W(mm40VarS, xczVar, l7m0Var, function1, function2, (xdr) objP3, fetVar, (i & 112) | 384);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:292:0x06c3  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        fet fetVar;
        sr10 sr10Var;
        fet fetVar2;
        boolean z;
        byte b = this.f5372a;
        Object obj5 = null;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        final byte b2 = 1;
        boolean z2 = true;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (b) {
            case 0:
                j2s j2sVar = (j2s) obj7;
                mm40 mm40Var = (mm40) obj6;
                mm40 mm40Var2 = (mm40) obj;
                RelatedParams relatedParams = (RelatedParams) obj2;
                fet fetVar3 = (fet) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                xak xakVar = j2s.b2;
                mm40Var2.getClass();
                relatedParams.getClass();
                int i = (iIntValue & 6) == 0 ? (fetVar3.g(mm40Var2) ? 4 : 2) | iIntValue : iIntValue;
                if ((iIntValue & 48) == 0) {
                    i |= fetVar3.g(relatedParams) ? 32 : 16;
                }
                if (fetVar3.U(i & 1, (i & 147) != 146)) {
                    zcl zclVar = qmk.f28987a;
                    float f = qmk.a(fetVar3).d;
                    ndf0 ndf0Var = j2sVar.M1;
                    if (ndf0Var == null) {
                        Intrinsics.h("relatedGamesFactory");
                        throw null;
                    }
                    ndf0Var.a(i120.Q(mm40Var2, ((ThemeColors) fetVar3.k(zaq0.b)).getBackground(), jd8.n), s5x0.L(mm40Var, f, 0.0f, 2), j2sVar, relatedParams, fetVar3);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 1:
                b8t b8tVar = (b8t) obj7;
                ((Integer) obj).intValue();
                double dDoubleValue = ((Double) obj2).doubleValue();
                i7t i7tVar = (i7t) obj4;
                iiy[] iiyVarArr = b8t.Q1;
                ((String) obj3).getClass();
                i7tVar.getClass();
                a9t a9tVarI0 = b8tVar.I0();
                a9tVarI0.y();
                a9tVarI0.h.getClass();
                ((GamesManiaMapView) obj6).setSelectedCellsListener$games_mania(new x7t(b8tVar, (byte) 0));
                a9t a9tVarI1 = b8tVar.I0();
                sac.V(jiu0.a(a9tVarI1), new h2s(1, a9tVarI1, a9t.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 26), null, a9tVarI1.k.f22085a, new z8t(i7tVar, a9tVarI1, dDoubleValue, null, (byte) 0), 10);
                return Unit.f46060a;
            case 2:
                nuv nuvVar = (nuv) obj7;
                Function1 function1 = (Function1) obj6;
                int iIntValue2 = ((Integer) obj2).intValue();
                fet fetVar4 = (fet) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= fetVar4.e(iIntValue2) ? 32 : 16;
                }
                if (!fetVar4.U(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                    fetVar4.X();
                } else if (iIntValue2 == 0) {
                    fetVar4.e0(1191010518);
                    hew0.r((ztv) nuvVar.b.get(0), nuvVar.c, function1, fetVar4, 0);
                    fetVar4.r(false);
                } else if (iIntValue2 != 1) {
                    fetVar4.e0(1191504224);
                    fetVar4.r(false);
                } else {
                    fetVar4.e0(1191265462);
                    hew0.r((ztv) nuvVar.b.get(1), nuvVar.c, function1, fetVar4, 0);
                    fetVar4.r(false);
                }
                return Unit.f46060a;
            case 3:
                pz40 pz40Var = (pz40) obj7;
                Function1 function2 = (Function1) obj6;
                mm40 mm40Var3 = (mm40) obj2;
                fet fetVar5 = (fet) obj3;
                int iD = dw9.d((Integer) obj4, (y5d) obj, mm40Var3);
                if ((iD & 48) == 0) {
                    iD |= fetVar5.g(mm40Var3) ? 32 : 16;
                }
                if (fetVar5.U(iD & 1, (iD & 145) != 144)) {
                    obc.d(gzy.f12205a.a(fetVar5.k(bmd.n)), u1c.M(-1467460206, new ugv(mm40Var3, pz40Var, function2, b2), fetVar5), fetVar5, 56);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 4:
                e1z e1zVar = (e1z) obj7;
                cgk0 cgk0Var = (cgk0) obj6;
                ((Integer) obj2).getClass();
                fet fetVar6 = (fet) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 129) != 128)) {
                    String str = e1zVar.f7061a;
                    Object objP = fetVar6.P();
                    if (objP == cl5Var) {
                        objP = new nw6(cgk0Var, (byte) 25);
                        fetVar6.o0(objP);
                    }
                    pzw.h(6, fetVar6, ro4.d0(jm40Var, (Function1) objP), str);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 5:
                lmo lmoVar = ((fax) obj7).d;
                Function1 function3 = (Function1) obj6;
                y5d y5dVar = (y5d) obj;
                mm40 mm40Var4 = (mm40) obj2;
                fet fetVar7 = (fet) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                xx7 xx7Var = gqw0.n;
                y5dVar.getClass();
                mm40Var4.getClass();
                int i2 = (iIntValue5 & 6) == 0 ? (fetVar7.g(y5dVar) ? 4 : 2) | iIntValue5 : iIntValue5;
                if ((iIntValue5 & 48) == 0) {
                    i2 |= fetVar7.g(mm40Var4) ? 32 : 16;
                }
                if (fetVar7.U(i2 & 1, (i2 & 147) != 146)) {
                    if (lmoVar == null) {
                        fetVar7.e0(-2129023716);
                        fetVar7.r(false);
                        fetVar = fetVar7;
                    } else {
                        fetVar7.e0(-2129023715);
                        pz40 pz40VarF = androidx.compose.runtime.e.f(lmoVar, fetVar7);
                        mm40 mm40VarA = y5dVar.a(mm40Var4, xx7Var);
                        zcl zclVar2 = qmk.f28987a;
                        mm40 mm40VarN = s5x0.N(mm40VarA, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                        tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                        int iHashCode = Long.hashCode(fetVar7.T);
                        bh90 bh90VarM = fetVar7.m();
                        mm40 mm40VarC0 = kbc.c0(fetVar7, mm40VarN);
                        mkd.c0.getClass();
                        fetVar7.i0();
                        if (fetVar7.S) {
                            fetVar7.l(e7z.u1);
                        } else {
                            fetVar7.r0();
                        }
                        jpm0.o(fetVar7, tj30VarC, gqw0.x);
                        jpm0.o(fetVar7, bh90VarM, gqw0.w);
                        jpm0.o(fetVar7, Integer.valueOf(iHashCode), gqw0.y);
                        jpm0.n(fetVar7);
                        jpm0.o(fetVar7, mm40VarC0, gqw0.v);
                        jm40 jm40Var2 = jm40.b;
                        mbc.o(zfi0.f44303a, o7k0.d(jm40Var2, 1.0f), false, fetVar7, 54, 4);
                        vdb.D(jm40Var2, (lmo) pz40VarF.getValue(), function3, fetVar7, 6, 0);
                        fetVar = fetVar7;
                        fetVar.r(true);
                        fetVar.r(false);
                        obj5 = Unit.f46060a;
                    }
                    if (obj5 == null) {
                        fetVar.e0(-2128411341);
                        mm40 mm40VarA2 = y5dVar.a(mm40Var4, xx7Var);
                        zcl zclVar3 = qmk.f28987a;
                        zq8.a(0, fetVar, s5x0.N(mm40VarA2, 0.0f, 8.0f, 0.0f, 0.0f, 13));
                        fetVar.r(false);
                    } else {
                        fetVar.e0(1455342073);
                        fetVar.r(false);
                    }
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 6:
                f1z f1zVar = (f1z) obj7;
                cgk0 cgk0Var2 = (cgk0) obj6;
                ((Integer) obj2).getClass();
                fet fetVar8 = (fet) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar8.U(iIntValue6 & 1, (iIntValue6 & 129) != 128)) {
                    String str2 = f1zVar.f8790a;
                    Object objP2 = fetVar8.P();
                    if (objP2 == cl5Var) {
                        objP2 = new nw6(cgk0Var2, (byte) 26);
                        fetVar8.o0(objP2);
                    }
                    mm40 mm40VarD0 = ro4.d0(jm40Var, (Function1) objP2);
                    zcl zclVar4 = qmk.f28987a;
                    j0x.d(0, fetVar8, s5x0.N(mm40VarD0, 0.0f, 0.0f, 0.0f, 2.0f, 7), str2);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 7:
                l1z l1zVar = (l1z) obj7;
                mdm mdmVar = l1zVar.j;
                Function1 function4 = (Function1) obj6;
                int iIntValue7 = ((Integer) obj2).intValue();
                fet fetVar9 = (fet) obj3;
                int iIntValue8 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue8 & 48) == 0) {
                    iIntValue8 |= fetVar9.e(iIntValue7) ? 32 : 16;
                }
                if (!fetVar9.U(iIntValue8 & 1, (iIntValue8 & 145) != 144)) {
                    fetVar9.X();
                } else if (iIntValue7 == 0) {
                    fetVar9.e0(-1341438387);
                    ntr.D(mdmVar, l1zVar.g, function4, fetVar9, 0);
                    fetVar9.r(false);
                } else {
                    fetVar9.e0(-1341168532);
                    ntr.D(mdmVar, l1zVar.h, function4, fetVar9, 0);
                    fetVar9.r(false);
                }
                return Unit.f46060a;
            case 8:
                l7m0 l7m0Var = (l7m0) obj7;
                xk80 xk80Var = (xk80) obj6;
                int iIntValue9 = ((Integer) obj2).intValue();
                fet fetVar10 = (fet) obj3;
                int iIntValue10 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue10 & 48) == 0) {
                    iIntValue10 |= fetVar10.e(iIntValue9) ? 32 : 16;
                }
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 145) != 144)) {
                    fg10 fg10Var = (fg10) CollectionsKt.W(iIntValue9, ((mh10) l7m0Var.getValue()).d);
                    if (fg10Var == null) {
                        fetVar10.e0(800273605);
                        fetVar10.r(false);
                    } else {
                        fetVar10.e0(800273606);
                        mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                        int i3 = (fetVar10.g(xk80Var) ? 1 : 0) | ((iIntValue10 & 112) != 32 ? (byte) 0 : (byte) 1);
                        Object objP3 = fetVar10.P();
                        if (i3 != 0 || objP3 == cl5Var) {
                            objP3 = new yg10(xk80Var, iIntValue9, false ? (byte) 1 : (byte) 0);
                            fetVar10.o0(objP3);
                        }
                        oja0.l(i4w0.T(mm40VarD, (Function1) objP3), fg10Var.f9470a, fetVar10, 0);
                        fetVar10.r(false);
                    }
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 9:
                ugd ugdVar = (ugd) obj7;
                tr10 tr10Var = (tr10) obj6;
                int iIntValue11 = ((Integer) obj2).intValue();
                fet fetVar11 = (fet) obj3;
                int iIntValue12 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue12 & 48) == 0) {
                    iIntValue12 |= fetVar11.e(iIntValue11) ? 32 : 16;
                }
                if (fetVar11.U(iIntValue12 & 1, (iIntValue12 & 145) != 144)) {
                    for (Object obj8 : sr10.d) {
                        if (((sr10) obj8).f32655a == iIntValue11) {
                            obj5 = obj8;
                            sr10Var = (sr10) obj5;
                            if (sr10Var == null) {
                                sr10Var = tr10Var.c;
                            }
                            ugdVar.j(y5d.f42040a, sr10Var, fetVar11, 0);
                        }
                    }
                    sr10Var = (sr10) obj5;
                    if (sr10Var == null) {
                        sr10Var = tr10Var.c;
                    }
                    ugdVar.j(y5d.f42040a, sr10Var, fetVar11, 0);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 10:
                Map map = (Map) obj7;
                qd30 qd30Var = (qd30) obj6;
                Integer num = (Integer) obj2;
                int iIntValue13 = num.intValue();
                fet fetVar12 = (fet) obj3;
                int iIntValue14 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue14 & 48) == 0) {
                    iIntValue14 |= fetVar12.e(iIntValue13) ? 32 : 16;
                }
                if (fetVar12.U(iIntValue14 & 1, (iIntValue14 & 145) != 144)) {
                    fetVar12.e0(711441525);
                    Object obj9 = map.get(num);
                    Object obj10 = obj9;
                    if (obj9 == null) {
                        Object[] objArr = new Object[0];
                        v0h0 v0h0Var = xcz.y;
                        Object objP4 = fetVar12.P();
                        if (objP4 == cl5Var) {
                            objP4 = new n230((byte) 13);
                            fetVar12.o0(objP4);
                        }
                        xcz xczVar = (xcz) e9x.R(objArr, v0h0Var, (Function0) objP4, fetVar12, 384);
                        map.put(num, xczVar);
                        obj10 = xczVar;
                    }
                    xcz xczVar2 = (xcz) obj10;
                    fetVar12.r(false);
                    boolean zG = fetVar12.g(qd30Var) | ((iIntValue14 & 112) == 32);
                    Object objP5 = fetVar12.P();
                    if (zG != 0 || objP5 == cl5Var) {
                        objP5 = new z08((Object) qd30Var, iIntValue13, (byte) 11);
                        fetVar12.o0(objP5);
                    }
                    b8k0.e(null, xczVar2, null, null, null, null, false, null, (Function1) objP5, fetVar12, 0, 509);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 11:
                gax gaxVar = (gax) obj7;
                Function1 function5 = (Function1) obj6;
                mm40 mm40Var5 = (mm40) obj2;
                fet fetVar13 = (fet) obj3;
                int iD2 = dw9.d((Integer) obj4, (y5d) obj, mm40Var5);
                if ((iD2 & 48) == 0) {
                    iD2 |= fetVar13.g(mm40Var5) ? 32 : 16;
                }
                if (fetVar13.U(iD2 & 1, (iD2 & 145) != 144)) {
                    j0x.g(mm40Var5, gaxVar.f10990a, function5, fetVar13, (iD2 >> 3) & 14);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 12:
                ru50 ru50Var = (ru50) obj7;
                Fragment fragment = (Fragment) obj6;
                int iIntValue15 = ((Integer) obj2).intValue();
                fet fetVar14 = (fet) obj3;
                int iIntValue16 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue16 & 48) == 0) {
                    iIntValue16 |= fetVar14.e(iIntValue15) ? 32 : 16;
                }
                if (fetVar14.U(iIntValue16 & 1, (iIntValue16 & 145) != 144)) {
                    ((bhg0) ru50Var.b.get(iIntValue15)).f2605a.j(fragment, jm40Var, fetVar14, 48);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case 13:
                Fragment fragment2 = (Fragment) obj;
                mm40 mm40Var6 = (mm40) obj2;
                int iIntValue17 = ((Integer) obj4).intValue();
                fragment2.getClass();
                mm40Var6.getClass();
                ((wu50) obj7).M(mm40Var6, (kr5) obj6, fragment2, (fet) obj3, ((iIntValue17 >> 3) & 14) | ((iIntValue17 << 6) & 896));
                return Unit.f46060a;
            case 14:
                kw50 kw50Var = (kw50) obj7;
                Fragment fragment3 = (Fragment) obj;
                mm40 mm40Var7 = (mm40) obj2;
                int iIntValue18 = ((Integer) obj4).intValue();
                fragment3.getClass();
                mm40Var7.getClass();
                kw50Var.M(mm40Var7, ((kr5) obj6).d, fragment3, (fet) obj3, ((iIntValue18 >> 3) & 14) | ((iIntValue18 << 6) & 896));
                return Unit.f46060a;
            case 15:
                u170 u170Var = (u170) obj7;
                final Function1 function6 = (Function1) obj6;
                int iIntValue19 = ((Integer) obj2).intValue();
                fet fetVar15 = (fet) obj3;
                int iIntValue20 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if ((iIntValue20 & 48) == 0) {
                    iIntValue20 |= fetVar15.e(iIntValue19) ? 32 : 16;
                }
                if (fetVar15.U(iIntValue20 & 1, (iIntValue20 & 145) != 144)) {
                    final r170 r170Var = (r170) CollectionsKt.W(iIntValue19, u170Var.f34890a);
                    if (r170Var == null) {
                        fetVar15.e0(-320757636);
                        fetVar15.r(false);
                    } else {
                        fetVar15.e0(-320757635);
                        int i4 = r170Var.f29664a;
                        evz evzVar = d270.b;
                        if (i4 == 3) {
                            fetVar15.e0(1971557979);
                            mm40 mm40VarW = o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3);
                            boolean zG2 = fetVar15.g(function6) | fetVar15.g(r170Var);
                            Object objP6 = fetVar15.P();
                            if (zG2 || objP6 == cl5Var) {
                                final byte b3 = false ? (byte) 1 : (byte) 0;
                                objP6 = new Function0() { // from class: a.t170
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        byte b4 = b3;
                                        r170 r170Var2 = r170Var;
                                        Function1 function7 = function6;
                                        switch (b4) {
                                            case 0:
                                                function7.invoke(new c170(r170Var2.f29664a));
                                                break;
                                            default:
                                                function7.invoke(new c170(r170Var2.f29664a));
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                };
                                fetVar15.o0(objP6);
                            }
                            bsr0.C(mm40VarW, r170Var, (Function0) objP6, fetVar15, 6);
                            fetVar15.r(false);
                            fetVar2 = fetVar15;
                        } else {
                            fetVar15.e0(1972131913);
                            mm40 mm40VarW2 = o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3);
                            gy30 gy30Var = r170Var.b;
                            boolean zG3 = fetVar15.g(function6) | fetVar15.g(r170Var);
                            Object objP7 = fetVar15.P();
                            if (zG3 || objP7 == cl5Var) {
                                objP7 = new Function0() { // from class: a.t170
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        byte b4 = b2;
                                        r170 r170Var2 = r170Var;
                                        Function1 function7 = function6;
                                        switch (b4) {
                                            case 0:
                                                function7.invoke(new c170(r170Var2.f29664a));
                                                break;
                                            default:
                                                function7.invoke(new c170(r170Var2.f29664a));
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                };
                                fetVar15.o0(objP7);
                            }
                            jiq0.y(mm40VarW2, gy30Var, (Function0) objP7, null, null, fetVar15, 6, 24);
                            fetVar2 = fetVar15;
                            fetVar2.r(false);
                        }
                        fetVar2.r(false);
                    }
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
            case 16:
                w170 w170Var = (w170) obj7;
                fqj0 fqj0Var = (fqj0) obj6;
                int iIntValue21 = ((Integer) obj2).intValue();
                fet fetVar16 = (fet) obj3;
                int iIntValue22 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if ((iIntValue22 & 48) == 0) {
                    iIntValue22 |= fetVar16.e(iIntValue21) ? 32 : 16;
                }
                if (fetVar16.U(iIntValue22 & 1, (iIntValue22 & 145) != 144)) {
                    a270 a270Var = (a270) CollectionsKt.W(iIntValue21, w170Var.f38385a);
                    if (a270Var == null) {
                        fetVar16.e0(1609433589);
                        fetVar16.r(false);
                    } else {
                        fetVar16.e0(1609433590);
                        bsr0.E(o7k0.d(jm40Var, 1.0f), fqj0Var, a270Var, fetVar16, 6);
                        fetVar16.r(false);
                    }
                } else {
                    fetVar16.X();
                }
                return Unit.f46060a;
            case 17:
                hdz hdzVar = (hdz) obj7;
                Function1 function7 = (Function1) obj6;
                int iIntValue23 = ((Integer) obj2).intValue();
                fet fetVar17 = (fet) obj3;
                int iIntValue24 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if ((iIntValue24 & 48) == 0) {
                    iIntValue24 |= fetVar17.e(iIntValue23) ? 32 : 16;
                }
                if (fetVar17.U(iIntValue24 & 1, (iIntValue24 & 145) != 144)) {
                    vk5 vk5Var = (vk5) hdzVar.b(iIntValue23);
                    if (vk5Var instanceof aes0) {
                        fetVar17.e0(-655890734);
                        ofm0.g(((aes0) vk5Var).f745a, fetVar17, 0);
                        fetVar17.r(false);
                    } else if (vk5Var instanceof ogs0) {
                        fetVar17.e0(1142326865);
                        try {
                            z = !(hdzVar.b(iIntValue23 - 1) instanceof ogs0);
                        } catch (Exception unused) {
                            z = true;
                        }
                        try {
                            z2 = true ^ (hdzVar.b(iIntValue23 + 1) instanceof ogs0);
                        } catch (Exception unused2) {
                        }
                        vds0.a(null, (ogs0) vk5Var, z, z2, fetVar17, 0);
                        fetVar17.r(false);
                    } else if (Intrinsics.d(vk5Var, ues0.f35545a)) {
                        fetVar17.e0(-655865590);
                        egm0.c(0.0f, fetVar17, 0, 1);
                        fetVar17.r(false);
                    } else if (Intrinsics.d(vk5Var, gxn.f12084a)) {
                        fetVar17.e0(1143153697);
                        mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                        zcl zclVar5 = qmk.f28987a;
                        mm40 mm40VarL = s5x0.L(mm40VarD2, 0.0f, 24.0f, 1);
                        Object objP8 = fetVar17.P();
                        if (objP8 == cl5Var) {
                            objP8 = new r580((byte) 18);
                            fetVar17.o0(objP8);
                        }
                        Function1 function8 = (Function1) objP8;
                        boolean zG4 = fetVar17.g(function7) | fetVar17.i(hdzVar);
                        Object objP9 = fetVar17.P();
                        if (zG4 || objP9 == cl5Var) {
                            objP9 = new dbr(function7, hdzVar, b2);
                            fetVar17.o0(objP9);
                        }
                        dwi0.b(function8, mm40VarL, (Function1) objP9, fetVar17, 6, 0);
                        fetVar17.r(false);
                    } else if (vk5Var == null) {
                        fetVar17.e0(-655821581);
                        fetVar17.r(false);
                    } else {
                        fetVar17.e0(-655820397);
                        fetVar17.r(false);
                    }
                } else {
                    fetVar17.X();
                }
                return Unit.f46060a;
            case 18:
                zw80 zw80Var = (zw80) obj7;
                Function2 function9 = (Function2) obj6;
                int iIntValue25 = ((Integer) obj2).intValue();
                fet fetVar18 = (fet) obj3;
                int iIntValue26 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if ((iIntValue26 & 48) == 0) {
                    iIntValue26 |= fetVar18.e(iIntValue25) ? 32 : 16;
                }
                if (fetVar18.U(iIntValue26 & 1, (iIntValue26 & 145) != 144)) {
                    vw80 vw80Var = (vw80) ((xw80) zw80Var).c.get(iIntValue25);
                    boolean zG5 = fetVar18.g(function9) | fetVar18.i(zw80Var);
                    Object objP10 = fetVar18.P();
                    if (zG5 || objP10 == cl5Var) {
                        objP10 = new ww80(function9, zw80Var);
                        fetVar18.o0(objP10);
                    }
                    k9x.l(jm40Var, vw80Var, (Function1) objP10, fetVar18, 6);
                } else {
                    fetVar18.X();
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                nkg0 nkg0Var = (nkg0) obj7;
                hgk0 hgk0Var = (hgk0) obj6;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                fet fetVar19 = (fet) obj3;
                int iIntValue27 = ((Integer) obj4).intValue();
                ((b53) obj).getClass();
                if ((iIntValue27 & 48) == 0) {
                    iIntValue27 |= fetVar19.h(zBooleanValue) ? 32 : 16;
                }
                if (!fetVar19.U(iIntValue27 & 1, (iIntValue27 & 145) != 144)) {
                    fetVar19.X();
                } else if (zBooleanValue) {
                    fetVar19.e0(-2112921365);
                    pkg0.a((mig0) hgk0Var.getValue(), nkg0Var, fetVar19, 0);
                    fetVar19.r(false);
                } else {
                    fetVar19.e0(-2112810478);
                    gfx.n((mig0) hgk0Var.getValue(), nkg0Var, fetVar19, 0);
                    fetVar19.r(false);
                }
                return Unit.f46060a;
            case 20:
                lmo lmoVar2 = ((hax) obj7).b;
                Function1 function10 = (Function1) obj6;
                y5d y5dVar2 = (y5d) obj;
                fet fetVar20 = (fet) obj3;
                int iD3 = dw9.d((Integer) obj4, y5dVar2, (mm40) obj2);
                if ((iD3 & 6) == 0) {
                    iD3 |= fetVar20.g(y5dVar2) ? 4 : 2;
                }
                if (!fetVar20.U(iD3 & 1, (iD3 & 131) != 130)) {
                    fetVar20.X();
                } else if (lmoVar2 == null) {
                    fetVar20.e0(-685736208);
                    fetVar20.r(false);
                } else {
                    fetVar20.e0(-685736207);
                    pz40 pz40VarF2 = androidx.compose.runtime.e.f(lmoVar2, fetVar20);
                    mm40 mm40VarA3 = y5dVar2.a(jm40Var, gqw0.n);
                    zcl zclVar6 = qmk.f28987a;
                    vdb.D(s5x0.N(s5x0.L(mm40VarA3, 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 12.0f, 7), (lmo) pz40VarF2.getValue(), function10, fetVar20, 0, 0);
                    fetVar20.r(false);
                }
                return Unit.f46060a;
            case 21:
                return a(obj, obj2, obj3, obj4);
            case 22:
                return b(obj, obj2, obj3, obj4);
            case 23:
                xiu0 xiu0Var = (xiu0) obj7;
                pdz pdzVar = (pdz) obj6;
                Integer num2 = (Integer) obj2;
                int iIntValue28 = num2.intValue();
                fet fetVar21 = (fet) obj3;
                int iIntValue29 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue29 & 48) == 0) {
                    iIntValue29 |= fetVar21.e(iIntValue28) ? 32 : 16;
                }
                if (fetVar21.U(iIntValue29 & 1, (iIntValue29 & 145) != 144)) {
                    obc.d(ms00.f22297a.a(t9x.L(num2, xiu0Var, null, fetVar21, 4)), u1c.M(787594231, new nb50(iIntValue28, pdzVar), fetVar21), fetVar21, 48);
                } else {
                    fetVar21.X();
                }
                return Unit.f46060a;
            case 24:
                return c(obj, obj2, obj3, obj4);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return g(obj, obj2, obj3, obj4);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return h(obj, obj2, obj3, obj4);
            default:
                List list = (List) obj7;
                Function1 function11 = (Function1) obj6;
                int iIntValue30 = ((Integer) obj2).intValue();
                fet fetVar22 = (fet) obj3;
                int iIntValue31 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if ((iIntValue31 & 48) == 0) {
                    iIntValue31 |= fetVar22.e(iIntValue30) ? 32 : 16;
                }
                if (fetVar22.U(iIntValue31 & 1, (iIntValue31 & 145) != 144)) {
                    p6t0 p6t0Var = (p6t0) list.get(iIntValue30);
                    if (p6t0Var instanceof pnu0) {
                        fetVar22.e0(452463737);
                        uc9.Q((pnu0) p6t0Var, function11, fetVar22, 0);
                        fetVar22.r(false);
                    } else {
                        fetVar22.e0(1141549353);
                        fetVar22.r(false);
                    }
                } else {
                    fetVar22.X();
                }
                return Unit.f46060a;
        }
    }
}
