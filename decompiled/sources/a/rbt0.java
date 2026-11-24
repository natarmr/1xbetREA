package a;

import androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.math.BigInteger;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.presentation.rules.VirtualSportRulesParams;
import org.xplatform.promo.impl.promocodes.presentation.shop.components.VerticalPromoStoreCollectionItem;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rbt0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30206a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rbt0(Object obj, byte b) {
        this.f30206a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f30206a;
        final byte b2 = 2;
        final byte b3 = 0;
        final byte b4 = 1;
        yje yjeVar = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((lbt0) obj).f19767a;
            case 1:
                bzs0 bzs0Var = igt0.Q1;
                fiu0 fiu0Var = ((igt0) obj).N1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 2:
                return (rgt0) ((gii0) ((trm0) obj).b).b(sre0.f32672a.b(rgt0.class));
            case 3:
                return Boolean.valueOf(((i2a) ((h0q0) obj).f12247a).a().a(UltraWideFlashCaptureUnderexposureQuirk.class));
            case 4:
                pyi pyiVar = ((sxt0) obj).L1;
                if (pyiVar != null) {
                    return new q0h0(pyiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 5:
                return (mxt0) ((gii0) ((afm0) obj).b).b(sre0.f32672a.b(mxt0.class));
            case 6:
                bsf bsfVar = (bsf) obj;
                lc00 lc00VarB = kotlin.collections.a.b();
                lc00VarB.addAll((Collection) ((fee) bsfVar.m.getValue()).b());
                lc00VarB.addAll((Collection) ((fee) bsfVar.n.getValue()).b());
                lc00VarB.addAll((Collection) ((fee) bsfVar.p.getValue()).b());
                return twn.k(lc00VarB, (Collection) ((fee) bsfVar.o.getValue()).b(), lc00VarB);
            case 7:
                Unit unit = Unit.f46060a;
                ((hgk0) ((s4u0) obj).j).setValue(unit);
                return unit;
            case 8:
                w7u0 w7u0Var = (w7u0) obj;
                svs0 svs0Var = w7u0.e2;
                i1w0 i1w0VarF = a4n0.f(w7u0Var);
                vyi vyiVar = w7u0Var.c2;
                if (vyiVar != null) {
                    return new ry3(i1w0VarF, vyiVar);
                }
                Intrinsics.h("verificationStatusViewModelFactory");
                throw null;
            case 9:
                sbu0 sbu0Var = (sbu0) obj;
                return BigInteger.valueOf(sbu0Var.f31954a).shiftLeft(32).or(BigInteger.valueOf(sbu0Var.b)).shiftLeft(32).or(BigInteger.valueOf(sbu0Var.c));
            case 10:
                return new yoe(((VerticalPromoStoreCollectionItem) obj).c, null);
            case 11:
                xiu0 xiu0Var = (xiu0) obj;
                piu0 piu0Var = xiu0Var.f40964a;
                if (piu0Var == null) {
                    return new wiu0();
                }
                Long l = xiu0Var.b;
                LinkedHashMap linkedHashMap = piu0Var.f27059a;
                Object wiu0Var = linkedHashMap.get(l);
                if (wiu0Var == null) {
                    wiu0Var = new wiu0();
                    linkedHashMap.put(l, wiu0Var);
                }
                return (wiu0) ((diu0) wiu0Var);
            case 12:
                return ((fou0) ((gou0) obj)).f9901a;
            case 13:
                return ((aru0) ((bru0) obj)).f1362a;
            case 14:
                final xru0 xru0Var = (xru0) obj;
                kys0 kys0Var = xru0.O1;
                Function1 function1 = new Function1() { // from class: a.vru0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        byte b5 = b3;
                        xru0 xru0Var2 = xru0Var;
                        switch (b5) {
                            case 0:
                                f240 f240Var = (f240) obj2;
                                kys0 kys0Var2 = xru0.O1;
                                f240Var.getClass();
                                ((fho0) xru0Var2.M1.getValue()).F(f240Var);
                                break;
                            case 1:
                                d240 d240Var = (d240) obj2;
                                kys0 kys0Var3 = xru0.O1;
                                d240Var.getClass();
                                fho0 fho0Var = (fho0) xru0Var2.M1.getValue();
                                fho0Var.C(d240Var);
                                fho0Var.y.d(new itn0(fho0Var, d240Var, (byte) 7));
                                break;
                            default:
                                c240 c240Var = (c240) obj2;
                                kys0 kys0Var4 = xru0.O1;
                                c240Var.getClass();
                                fho0 fho0Var2 = (fho0) xru0Var2.M1.getValue();
                                fho0Var2.C(c240Var);
                                fho0Var2.y.d(new itn0(fho0Var2, c240Var, (byte) 8));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                Function1 function2 = new Function1() { // from class: a.vru0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        byte b5 = b4;
                        xru0 xru0Var2 = xru0Var;
                        switch (b5) {
                            case 0:
                                f240 f240Var = (f240) obj2;
                                kys0 kys0Var2 = xru0.O1;
                                f240Var.getClass();
                                ((fho0) xru0Var2.M1.getValue()).F(f240Var);
                                break;
                            case 1:
                                d240 d240Var = (d240) obj2;
                                kys0 kys0Var3 = xru0.O1;
                                d240Var.getClass();
                                fho0 fho0Var = (fho0) xru0Var2.M1.getValue();
                                fho0Var.C(d240Var);
                                fho0Var.y.d(new itn0(fho0Var, d240Var, (byte) 7));
                                break;
                            default:
                                c240 c240Var = (c240) obj2;
                                kys0 kys0Var4 = xru0.O1;
                                c240Var.getClass();
                                fho0 fho0Var2 = (fho0) xru0Var2.M1.getValue();
                                fho0Var2.C(c240Var);
                                fho0Var2.y.d(new itn0(fho0Var2, c240Var, (byte) 8));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                Function1 function3 = new Function1() { // from class: a.vru0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        byte b5 = b2;
                        xru0 xru0Var2 = xru0Var;
                        switch (b5) {
                            case 0:
                                f240 f240Var = (f240) obj2;
                                kys0 kys0Var2 = xru0.O1;
                                f240Var.getClass();
                                ((fho0) xru0Var2.M1.getValue()).F(f240Var);
                                break;
                            case 1:
                                d240 d240Var = (d240) obj2;
                                kys0 kys0Var3 = xru0.O1;
                                d240Var.getClass();
                                fho0 fho0Var = (fho0) xru0Var2.M1.getValue();
                                fho0Var.C(d240Var);
                                fho0Var.y.d(new itn0(fho0Var, d240Var, (byte) 7));
                                break;
                            default:
                                c240 c240Var = (c240) obj2;
                                kys0 kys0Var4 = xru0.O1;
                                c240Var.getClass();
                                fho0 fho0Var2 = (fho0) xru0Var2.M1.getValue();
                                fho0Var2.C(c240Var);
                                fho0Var2.y.d(new itn0(fho0Var2, c240Var, (byte) 8));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                uru0 uru0Var = new uru0(ek5.h);
                gbn gbnVarM = ihm0.m(function2);
                dp dpVar = uru0Var.d;
                dpVar.b(gbnVarM);
                dpVar.b(ycm0.r(function1));
                dpVar.b(p8a.Q(function3));
                return uru0Var;
            case 15:
                final hsu0 hsu0Var = (hsu0) obj;
                svs0 svs0Var2 = hsu0.O1;
                Function1 function4 = new Function1() { // from class: a.fsu0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        byte b5 = b3;
                        hsu0 hsu0Var2 = hsu0Var;
                        switch (b5) {
                            case 0:
                                f240 f240Var = (f240) obj2;
                                svs0 svs0Var3 = hsu0.O1;
                                f240Var.getClass();
                                ((rio0) hsu0Var2.M1.getValue()).E(f240Var);
                                break;
                            case 1:
                                d240 d240Var = (d240) obj2;
                                svs0 svs0Var4 = hsu0.O1;
                                d240Var.getClass();
                                rio0 rio0Var = (rio0) hsu0Var2.M1.getValue();
                                rio0Var.C(d240Var);
                                rio0Var.z.d(new itn0(rio0Var, d240Var, (byte) 13));
                                break;
                            default:
                                c240 c240Var = (c240) obj2;
                                svs0 svs0Var5 = hsu0.O1;
                                c240Var.getClass();
                                rio0 rio0Var2 = (rio0) hsu0Var2.M1.getValue();
                                rio0Var2.C(c240Var);
                                rio0Var2.z.d(new itn0(rio0Var2, c240Var, (byte) 12));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                Function1 function5 = new Function1() { // from class: a.fsu0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        byte b5 = b4;
                        hsu0 hsu0Var2 = hsu0Var;
                        switch (b5) {
                            case 0:
                                f240 f240Var = (f240) obj2;
                                svs0 svs0Var3 = hsu0.O1;
                                f240Var.getClass();
                                ((rio0) hsu0Var2.M1.getValue()).E(f240Var);
                                break;
                            case 1:
                                d240 d240Var = (d240) obj2;
                                svs0 svs0Var4 = hsu0.O1;
                                d240Var.getClass();
                                rio0 rio0Var = (rio0) hsu0Var2.M1.getValue();
                                rio0Var.C(d240Var);
                                rio0Var.z.d(new itn0(rio0Var, d240Var, (byte) 13));
                                break;
                            default:
                                c240 c240Var = (c240) obj2;
                                svs0 svs0Var5 = hsu0.O1;
                                c240Var.getClass();
                                rio0 rio0Var2 = (rio0) hsu0Var2.M1.getValue();
                                rio0Var2.C(c240Var);
                                rio0Var2.z.d(new itn0(rio0Var2, c240Var, (byte) 12));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                Function1 function6 = new Function1() { // from class: a.fsu0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        byte b5 = b2;
                        hsu0 hsu0Var2 = hsu0Var;
                        switch (b5) {
                            case 0:
                                f240 f240Var = (f240) obj2;
                                svs0 svs0Var3 = hsu0.O1;
                                f240Var.getClass();
                                ((rio0) hsu0Var2.M1.getValue()).E(f240Var);
                                break;
                            case 1:
                                d240 d240Var = (d240) obj2;
                                svs0 svs0Var4 = hsu0.O1;
                                d240Var.getClass();
                                rio0 rio0Var = (rio0) hsu0Var2.M1.getValue();
                                rio0Var.C(d240Var);
                                rio0Var.z.d(new itn0(rio0Var, d240Var, (byte) 13));
                                break;
                            default:
                                c240 c240Var = (c240) obj2;
                                svs0 svs0Var5 = hsu0.O1;
                                c240Var.getClass();
                                rio0 rio0Var2 = (rio0) hsu0Var2.M1.getValue();
                                rio0Var2.C(c240Var);
                                rio0Var2.z.d(new itn0(rio0Var2, c240Var, (byte) 12));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                tio0 tio0Var = new tio0(ek5.h);
                gbn gbnVar = new gbn(new b4u0((byte) 21), new d8q0(3, (byte) 24), new sbt0(function5, (byte) 26), mnu0.c);
                dp dpVar2 = tio0Var.d;
                dpVar2.b(gbnVar);
                dpVar2.b(ycm0.r(function4));
                dpVar2.b(p8a.Q(function6));
                return tio0Var;
            case 16:
                sxs0 sxs0Var = rsu0.O1;
                fiu0 fiu0Var2 = ((rsu0) obj).L1;
                if (fiu0Var2 != null) {
                    return fiu0Var2;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 17:
                VirtualSportRulesParams virtualSportRulesParams = (VirtualSportRulesParams) obj;
                xtu0 xtu0Var = xtu0.MAIN;
                return new wtu0(true, virtualSportRulesParams, 1L, null);
            case 18:
                return (iwu0) ((gii0) ((trm0) obj).b).b(sre0.f32672a.b(iwu0.class));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (qyu0) ((gii0) ((okt0) obj).f25422a).b(sre0.f32672a.b(qyu0.class));
            case 20:
                boolean zC = ((eqx) obj).f8256a.c();
                iun iunVar = iun.f15405a;
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                return new j0v0(false, false, zC, false, iunVar, lunVar, null, null, null, 0L, false);
            case 21:
                bzs0 bzs0Var2 = w1v0.j2;
                return new ko60((w1v0) obj, (byte) 12);
            case 22:
                u3v0 u3v0Var = (u3v0) obj;
                kys0 kys0Var2 = u3v0.P1;
                i1w0 i1w0VarF2 = a4n0.f(u3v0Var);
                lzi lziVar = u3v0Var.K1;
                if (lziVar != null) {
                    return new ry3(i1w0VarF2, lziVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 23:
                c4v0 c4v0Var = (c4v0) obj;
                sac.V(jiu0.a(c4v0Var), new x3v0(c4v0Var, b4), null, null, new n7t0(c4v0Var, yjeVar, (byte) 13), 14);
                return Unit.f46060a;
            case 24:
                return (t4v0) ((gii0) ((hcp0) obj).b).b(sre0.f32672a.b(t4v0.class));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return (e7v0) ((m6v0) obj).f21290a.b(sre0.f32672a.b(e7v0.class));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                uxs0 uxs0Var = ccv0.Q1;
                return Integer.valueOf(((ocv0) obj).b.f26012a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new u6n(d4d.STATIC_WHITE60, w6n.f, new c280(((qdv0) obj).f28554a, R.drawable.ic_glyph_placeholder_player));
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return (okv0) ((gii0) ((trm0) obj).b).b(sre0.f32672a.b(okv0.class));
            default:
                uxs0 uxs0Var2 = ulv0.R1;
                fiu0 fiu0Var3 = ((ulv0) obj).P1;
                if (fiu0Var3 != null) {
                    return fiu0Var3;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}
