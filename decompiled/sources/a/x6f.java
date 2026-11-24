package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x6f extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40362a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x6f(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f40362a = b;
    }

    /* JADX WARN: Code duplicated, block: B:92:0x0353  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object aegVar;
        Object value;
        String str;
        Object value2;
        wmm0 wmm0Var;
        hyx hyxVar;
        ArrayList arrayListR0;
        Object value3;
        wmm0 wmm0Var2;
        Object value4;
        wmm0 wmm0Var3;
        ArrayList arrayListR1;
        Object value5;
        wmm0 wmm0Var4;
        switch (this.f40362a) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                r7f r7fVar = (r7f) this.receiver;
                ctf0 ctf0Var = r7fVar.T0;
                if (th instanceof zhi0) {
                    zhi0 zhi0Var = (zhi0) th;
                    if (zhi0Var.c == i2o.SaveCouponError) {
                        String strF = ctf0Var.f(R.string.caution, new Object[0]);
                        String message = zhi0Var.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        r7fVar.R(new a4f(strF, message, rek0.b));
                    } else {
                        r7fVar.R(new p3f(ctf0Var.f(R.string.coupon_save_error, new Object[0])));
                    }
                } else {
                    r7fVar.R(new p3f(ctf0Var.f(R.string.coupon_save_error, new Object[0])));
                }
                return Unit.f46060a;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((r7f) this.receiver).f0(th2);
                return Unit.f46060a;
            case 2:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((r7f) this.receiver).f0(th3);
                return Unit.f46060a;
            case 3:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((r7f) this.receiver).f0(th4);
                return Unit.f46060a;
            case 4:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ((r7f) this.receiver).d0(th5);
                return Unit.f46060a;
            case 5:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((wff) this.receiver).w(th6);
                return Unit.f46060a;
            case 6:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                ((wff) this.receiver).w(th7);
                return Unit.f46060a;
            case 7:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                ((wff) this.receiver).w(th8);
                return Unit.f46060a;
            case 8:
                nkf nkfVar = (nkf) obj;
                nkfVar.getClass();
                ((k3t0) this.receiver).x(nkfVar);
                return Unit.f46060a;
            case 9:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                ((duj) this.receiver).a(th9);
                return Unit.f46060a;
            case 10:
                ((hbg) this.receiver).C(((Number) obj).intValue());
                return Unit.f46060a;
            case 11:
                int iIntValue = ((Number) obj).intValue();
                gdg gdgVar = (gdg) this.receiver;
                gdgVar.getClass();
                ceg cegVar = ceg.f4210a;
                beg begVar = beg.f2448a;
                if (iIntValue == 0) {
                    aegVar = begVar;
                } else if (iIntValue == 1) {
                    aegVar = cegVar;
                } else if (iIntValue != 2) {
                    aegVar = begVar;
                } else {
                    aegVar = new aeg(gdgVar.q.contains(Long.valueOf(gdgVar.d.f46549a)));
                }
                p7m0 p7m0Var = gdgVar.u;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, cfb.a((cfb) value, null, iIntValue, 3)));
                if (aegVar.equals(begVar)) {
                    str = "events";
                } else if (aegVar.equals(cegVar)) {
                    str = "results";
                } else {
                    if (!(aegVar instanceof aeg)) {
                        t9f.b();
                        return null;
                    }
                    str = "description";
                }
                zr1 zr1Var = gdgVar.p;
                zr1Var.getClass();
                b1j.v(str, zr1Var.f44833a, 3390L);
                u58 u58Var = gdgVar.o;
                u58Var.getClass();
                i8i.D("option", str, u58Var.f35083a, "cyber_champ_option");
                gdgVar.c.e("SELECTED_SEGMENT_KEY", aegVar);
                return Unit.f46060a;
            case 12:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                gdg gdgVar2 = (gdg) this.receiver;
                gdgVar2.getClass();
                sac.V(jiu0.a(gdgVar2), new v4f(gdgVar2, th10, (byte) 17), null, null, new edg(gdgVar2, null), 14);
                return Unit.f46060a;
            case 13:
                cfg cfgVar = (cfg) obj;
                cfgVar.getClass();
                afg afgVar = (afg) this.receiver;
                std stdVar = afg.S1;
                ujd ujdVar = afgVar.M1;
                if (ujdVar == null) {
                    Intrinsics.h("composeGameCardFragmentDelegate");
                    throw null;
                }
                ujdVar.b(afgVar, cfgVar.f4259a);
                afgVar.G0().x(leg.f19900a);
                return Unit.f46060a;
            case 14:
                dgg dggVar = (dgg) obj;
                dggVar.getClass();
                zfg zfgVar = (zfg) this.receiver;
                kud kudVar = zfg.S1;
                wdk0 wdk0Var = zfgVar.M1;
                if (wdk0Var == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                wdk0.k(wdk0Var, new xdk0(rek0.b, dggVar.f6041a, null, null, null, null, 124), zfgVar, null, null, false, null, 1020);
                zfgVar.G0().x(kfg.f18193a);
                return Unit.f46060a;
            case 15:
                jig jigVar = (jig) obj;
                jigVar.getClass();
                ((k3t0) this.receiver).x(jigVar);
                return Unit.f46060a;
            case 16:
                ygq0 ygq0Var = (ygq0) obj;
                ygq0Var.getClass();
                djg djgVar = (djg) this.receiver;
                kwd kwdVar = djg.n2;
                r34 r34Var = djgVar.l2;
                iiy[] iiyVarArr = djg.o2;
                vcc.f0(i120.V(new Pair("REQUEST_CHAMPS_TIME_FILTER_RESULT_KEY", new hhq0(ygq0Var, r34Var.n(djgVar, iiyVarArr[1]).longValue(), djgVar.m2.n(djgVar, iiyVarArr[2]).longValue()))), djgVar, "REQUEST_CHAMPS_TIME_FILTER_RESULT_KEY");
                if (!djgVar.R()) {
                    djgVar.y0();
                }
                return Unit.f46060a;
            case 17:
                long jLongValue = ((Number) obj).longValue();
                p7m0 p7m0Var2 = ((vqg) this.receiver).K;
                do {
                    value2 = p7m0Var2.getValue();
                    wmm0Var = (wmm0) value2;
                    hyxVar = wmm0Var.h;
                    List list = hyxVar.b;
                    if (list.contains(Long.valueOf(jLongValue))) {
                        arrayListR0 = new ArrayList();
                        for (Object obj2 : list) {
                            if (((Number) obj2).longValue() != jLongValue) {
                                arrayListR0.add(obj2);
                            }
                        }
                    } else {
                        arrayListR0 = CollectionsKt.r0(list, Long.valueOf(jLongValue));
                    }
                } while (!p7m0Var2.m(value2, wmm0.a(wmm0Var, 0L, 0L, 0L, 0L, 0L, 0L, null, hyx.a(hyxVar, 0L, arrayListR0, 1), 0L, null, 895)));
                return Unit.f46060a;
            case 18:
                long jLongValue2 = ((Number) obj).longValue();
                p7m0 p7m0Var3 = ((vqg) this.receiver).K;
                do {
                    value3 = p7m0Var3.getValue();
                    wmm0Var2 = (wmm0) value3;
                    hyx hyxVar2 = wmm0Var2.h;
                } while (!p7m0Var3.m(value3, wmm0.a(wmm0Var2, 0L, 0L, 0L, 0L, 0L, 0L, null, null, jLongValue2, null, 767)));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                String str2 = (String) obj;
                str2.getClass();
                vqg vqgVar = (vqg) this.receiver;
                vqgVar.getClass();
                p7m0 p7m0Var4 = vqgVar.K;
                do {
                    value4 = p7m0Var4.getValue();
                    wmm0Var3 = (wmm0) value4;
                    List list2 = wmm0Var3.j;
                    if (list2.contains(str2)) {
                        arrayListR1 = new ArrayList();
                        for (Object obj3 : list2) {
                            if (!Intrinsics.d((String) obj3, str2)) {
                                arrayListR1.add(obj3);
                            }
                        }
                    } else {
                        arrayListR1 = CollectionsKt.r0(list2, str2);
                    }
                } while (!p7m0Var4.m(value4, wmm0.a(wmm0Var3, 0L, 0L, 0L, 0L, 0L, 0L, null, null, 0L, arrayListR1, 511)));
                return Unit.f46060a;
            case 20:
                ((vqg) this.receiver).y(((Number) obj).longValue());
                return Unit.f46060a;
            case 21:
                long jLongValue3 = ((Number) obj).longValue();
                vqg vqgVar2 = (vqg) this.receiver;
                vqgVar2.getClass();
                sac.V(jiu0.a(vqgVar2), null, null, vqgVar2.g.f22085a, new ey((Object) vqgVar2, jLongValue3, (yje) null, (byte) 15), 11);
                return Unit.f46060a;
            case 22:
                long jLongValue4 = ((Number) obj).longValue();
                p7m0 p7m0Var5 = ((vqg) this.receiver).K;
                do {
                    value5 = p7m0Var5.getValue();
                    wmm0Var4 = (wmm0) value5;
                } while (!p7m0Var5.m(value5, wmm0.a(wmm0Var4, 0L, 0L, 0L, 0L, 0L, 0L, null, hyx.a(wmm0Var4.h, jLongValue4, null, 2), 0L, null, 895)));
                return Unit.f46060a;
            case 23:
                ((vqg) this.receiver).y(((Number) obj).longValue());
                return Unit.f46060a;
            case 24:
                long jLongValue5 = ((Number) obj).longValue();
                vqg vqgVar3 = (vqg) this.receiver;
                vqgVar3.getClass();
                sac.V(jiu0.a(vqgVar3), null, null, vqgVar3.g.f22085a, new ey((Object) vqgVar3, jLongValue5, (yje) null, (byte) 15), 11);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int iIntValue2 = ((Number) obj).intValue();
                vqg vqgVar4 = (vqg) this.receiver;
                p7m0 p7m0Var6 = vqgVar4.H;
                if (((Number) p7m0Var6.getValue()).intValue() != iIntValue2) {
                    vqgVar4.D.f(oqg.f25686a);
                    p7m0Var6.o(null, Integer.valueOf(iIntValue2));
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                String str3 = (String) obj;
                str3.getClass();
                luk lukVar = (luk) this.receiver;
                lukVar.getClass();
                p7m0 p7m0Var7 = lukVar.b;
                p7m0Var7.getClass();
                p7m0Var7.o(null, str3);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                ((duj) this.receiver).a(th11);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                ((duj) this.receiver).a(th12);
                return Unit.f46060a;
            default:
                n6h n6hVar = (n6h) obj;
                n6hVar.getClass();
                ((k3t0) this.receiver).x(n6hVar);
                return Unit.f46060a;
        }
    }
}
