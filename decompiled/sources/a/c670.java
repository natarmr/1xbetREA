package a;

import android.javax.sip.message.Response;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.personal.impl.presentation.edit_tj.models.EditProfileTjItemEnum;
import org.xplatform.personal.impl.presentation.edit_tj.models.ProfileEditTjUiModel;

/* JADX INFO: loaded from: classes3.dex */
public final class c670 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c670(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:287:0x034c  */
    private final Object l(Object obj) {
        Object objA;
        jqt0 jqt0Var;
        cau0 cau0Var;
        b3c0 b3c0Var = (b3c0) this.k;
        knf0 knf0Var = b3c0Var.c;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            lpb lpbVar = b3c0Var.f1896a;
            String strA = b3c0Var.g.a();
            knf0Var.getClass();
            knf0Var.getClass();
            knf0Var.getClass();
            String strC = knf0Var.c();
            this.j = true;
            objA = ((z2c0) lpbVar.f20432a.b(sre0.f32672a.b(z2c0.class))).a(strA, strC, 1, 1357, 22, this);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            objA = obj;
        }
        r2c0 r2c0Var = (r2c0) ((q16) objA).a();
        String str = r2c0Var.f29725a;
        String str2 = str == null ? "" : str;
        String str3 = r2c0Var.b;
        String str4 = str3 == null ? "" : str3;
        Long l = r2c0Var.c;
        String strValueOf = l != null ? String.valueOf(l.longValue()) : null;
        String str5 = strValueOf == null ? "" : strValueOf;
        Integer num = r2c0Var.d;
        int iIntValue = num != null ? num.intValue() : 0;
        String str6 = r2c0Var.e;
        String str7 = str6 == null ? "" : str6;
        String str8 = r2c0Var.f;
        String str9 = str8 == null ? "" : str8;
        Integer num2 = r2c0Var.g;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        Double d = r2c0Var.h;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        Double d2 = r2c0Var.i;
        double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
        Long l2 = r2c0Var.j;
        String strValueOf2 = l2 != null ? String.valueOf(l2.longValue()) : null;
        String str10 = strValueOf2 == null ? "" : strValueOf2;
        uxs0 uxs0Var = jqt0.f16972a;
        Integer num3 = r2c0Var.k;
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        uxs0Var.getClass();
        if (iIntValue3 == 0) {
            jqt0Var = jqt0.b;
        } else if (iIntValue3 == 1) {
            jqt0Var = jqt0.c;
        } else if (iIntValue3 != 2) {
            jqt0Var = iIntValue3 != 3 ? jqt0.f : jqt0.e;
        } else {
            jqt0Var = jqt0.d;
        }
        jqt0 jqt0Var2 = jqt0Var;
        Boolean bool = r2c0Var.l;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = r2c0Var.m;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        Boolean bool3 = r2c0Var.n;
        boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
        Boolean bool4 = r2c0Var.o;
        boolean zBooleanValue4 = bool4 != null ? bool4.booleanValue() : false;
        String str11 = r2c0Var.p;
        String str12 = str11 == null ? "" : str11;
        String str13 = r2c0Var.q;
        String str14 = str13 == null ? "" : str13;
        String str15 = r2c0Var.r;
        String str16 = str15 == null ? "" : str15;
        Integer num4 = r2c0Var.s;
        int iIntValue4 = num4 != null ? num4.intValue() : 0;
        String str17 = r2c0Var.t;
        String str18 = str17 == null ? "" : str17;
        String str19 = r2c0Var.u;
        String str20 = str19 == null ? "" : str19;
        String str21 = r2c0Var.v;
        String str22 = str21 == null ? "" : str21;
        String str23 = r2c0Var.w;
        String str24 = str23 == null ? "" : str23;
        String str25 = r2c0Var.x;
        String str26 = str25 == null ? "" : str25;
        String str27 = r2c0Var.y;
        String str28 = str27 == null ? "" : str27;
        String str29 = r2c0Var.z;
        String str30 = str29 == null ? "" : str29;
        Boolean bool5 = r2c0Var.A;
        boolean zBooleanValue5 = bool5 != null ? bool5.booleanValue() : false;
        Boolean bool6 = r2c0Var.B;
        boolean zBooleanValue6 = bool6 != null ? bool6.booleanValue() : false;
        String str31 = r2c0Var.C;
        String str32 = str31 == null ? "" : str31;
        String str33 = r2c0Var.D;
        String str34 = str33 == null ? "" : str33;
        String str35 = r2c0Var.E;
        String str36 = str35 == null ? "" : str35;
        Integer num5 = r2c0Var.F;
        int iIntValue5 = num5 != null ? num5.intValue() : 0;
        String str37 = r2c0Var.G;
        String str38 = str37 == null ? "" : str37;
        String str39 = r2c0Var.H;
        String str40 = str39 == null ? "" : str39;
        Boolean bool7 = r2c0Var.I;
        boolean zBooleanValue7 = bool7 != null ? bool7.booleanValue() : false;
        y0b y0bVar = r2c0Var.J ? y0b.PERCENT : y0b.PROMO;
        Double d3 = r2c0Var.K;
        long jDoubleValue = d3 != null ? (long) d3.doubleValue() : 0L;
        int i = r2c0Var.L;
        Integer num6 = r2c0Var.M;
        int iIntValue6 = num6 != null ? num6.intValue() : 0;
        Boolean bool8 = r2c0Var.N;
        boolean zBooleanValue8 = bool8 != null ? bool8.booleanValue() : false;
        String str41 = r2c0Var.O;
        String str42 = str41 == null ? "" : str41;
        Boolean bool9 = r2c0Var.P;
        boolean zBooleanValue9 = bool9 != null ? bool9.booleanValue() : false;
        Integer num7 = r2c0Var.Q;
        int iIntValue7 = num7 != null ? num7.intValue() : 0;
        Boolean bool10 = r2c0Var.R;
        boolean zBooleanValue10 = bool10 != null ? bool10.booleanValue() : false;
        Long l3 = r2c0Var.S;
        long jLongValue = l3 != null ? l3.longValue() : 0L;
        String str43 = r2c0Var.T;
        String str44 = str43 == null ? "" : str43;
        String str45 = r2c0Var.U;
        String str46 = str45 == null ? "" : str45;
        String str47 = r2c0Var.V;
        String str48 = str47 == null ? "" : str47;
        String str49 = r2c0Var.W;
        String str50 = str49 == null ? "" : str49;
        String str51 = r2c0Var.X;
        String str52 = str51 == null ? "" : str51;
        String str53 = r2c0Var.Y;
        String str54 = str53 == null ? "" : str53;
        String str55 = r2c0Var.Z;
        String str56 = str55 == null ? "" : str55;
        Boolean bool11 = r2c0Var.a0;
        boolean zBooleanValue11 = bool11 != null ? bool11.booleanValue() : false;
        Boolean bool12 = r2c0Var.b0;
        boolean zBooleanValue12 = bool12 != null ? bool12.booleanValue() : false;
        String str57 = r2c0Var.c0;
        String str58 = str57 == null ? "" : str57;
        String str59 = r2c0Var.d0;
        String str60 = str59 == null ? "" : str59;
        wxs0 wxs0Var = cau0.f4031a;
        String str61 = r2c0Var.e0;
        if (str61 == null) {
            str61 = "";
        }
        wxs0Var.getClass();
        switch (str61) {
            case "VERIFICATION_DATA_ACCEPTED":
                cau0Var = cau0.d;
                break;
            case "VERIFICATION_DENIED":
                cau0Var = cau0.f;
                break;
            case "PARTNER_VERIFICATION_ERROR":
                cau0Var = cau0.i;
                break;
            case "REVERIFICATION_REQUIRED":
                cau0Var = cau0.j;
                break;
            case "CLARIFICATION_REQUIRED":
                cau0Var = cau0.g;
                break;
            case "VERIFICATION_IN_PROGRESS":
                cau0Var = cau0.e;
                break;
            case "VERIFICATION_SUCCESSFUL":
                cau0Var = cau0.h;
                break;
            case "UNVERIFIED":
                cau0Var = cau0.c;
                break;
            default:
                cau0Var = cau0.b;
                break;
        }
        cau0 cau0Var2 = cau0Var;
        String str62 = r2c0Var.f0;
        String str63 = str62 == null ? "" : str62;
        String str64 = r2c0Var.g0;
        String str65 = str64 == null ? "" : str64;
        String str66 = r2c0Var.h0;
        String str67 = str66 == null ? "" : str66;
        Integer num8 = r2c0Var.i0;
        int iIntValue8 = num8 != null ? num8.intValue() : 0;
        Boolean bool13 = r2c0Var.j0;
        boolean zBooleanValue13 = bool13 != null ? bool13.booleanValue() : false;
        Double d4 = r2c0Var.k0;
        double dDoubleValue3 = d4 != null ? d4.doubleValue() : 0.0d;
        Integer num9 = r2c0Var.l0;
        int iIntValue9 = num9 != null ? num9.intValue() : 0;
        Boolean bool14 = r2c0Var.m0;
        boolean zBooleanValue14 = bool14 != null ? bool14.booleanValue() : false;
        Boolean bool15 = r2c0Var.n0;
        boolean zBooleanValue15 = bool15 != null ? bool15.booleanValue() : false;
        Boolean bool16 = r2c0Var.o0;
        boolean zBooleanValue16 = bool16 != null ? bool16.booleanValue() : false;
        Boolean bool17 = r2c0Var.p0;
        boolean zBooleanValue17 = bool17 != null ? bool17.booleanValue() : false;
        Boolean bool18 = r2c0Var.q0;
        boolean zBooleanValue18 = bool18 != null ? bool18.booleanValue() : false;
        String str68 = r2c0Var.r0;
        String str69 = str68 == null ? "" : str68;
        Boolean bool19 = r2c0Var.s0;
        boolean zBooleanValue19 = bool19 != null ? bool19.booleanValue() : false;
        Boolean bool20 = r2c0Var.t0;
        m2c0 m2c0Var = new m2c0(str2, str4, str5, iIntValue, str7, str9, iIntValue2, dDoubleValue, dDoubleValue2, str10, jqt0Var2, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, str12, str14, str16, iIntValue4, str18, str20, str22, str24, str26, str28, str30, zBooleanValue5, zBooleanValue6, str32, str34, str36, iIntValue5, str38, str40, zBooleanValue7, y0bVar, jDoubleValue, i, iIntValue6, zBooleanValue8, str42, zBooleanValue9, iIntValue7, zBooleanValue10, jLongValue, str44, str46, str48, str50, str52, str54, str56, zBooleanValue11, zBooleanValue12, str58, str60, cau0Var2, str63, str65, str67, iIntValue8, zBooleanValue13, dDoubleValue3, iIntValue9, zBooleanValue14, zBooleanValue15, zBooleanValue16, zBooleanValue17, zBooleanValue18, str69, zBooleanValue19, bool20 != null ? bool20.booleanValue() : false);
        b3c0Var.b.f40159a.o(null, m2c0Var);
        b3c0Var.d.e("available_multicurrency_key", zBooleanValue13);
        return m2c0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                c670 c670Var = new c670((g670) obj2, yjeVar, (byte) 0);
                c670Var.j = ((Boolean) obj).booleanValue();
                return c670Var;
            case 1:
                return new c670((xf70) obj2, yjeVar, (byte) 1);
            case 2:
                return new c670((eh70) obj2, yjeVar, (byte) 2);
            case 3:
                return new c670((qm70) obj2, yjeVar, (byte) 3);
            case 4:
                c670 c670Var2 = new c670((Function0) obj2, yjeVar, (byte) 4);
                c670Var2.j = ((Boolean) obj).booleanValue();
                return c670Var2;
            case 5:
                return new c670((zo70) obj2, yjeVar, (byte) 5);
            case 6:
                return new c670((cy70) obj2, yjeVar, (byte) 6);
            case 7:
                return new c670((ag80) obj2, yjeVar, (byte) 7);
            case 8:
                return new c670((fk80) obj2, yjeVar, (byte) 8);
            case 9:
                c670 c670Var3 = new c670((org.xplatform.security.impl.presentation.password.change.input_password.f) obj2, yjeVar, (byte) 9);
                c670Var3.j = ((Boolean) obj).booleanValue();
                return c670Var3;
            case 10:
                return new c670((t090) obj2, yjeVar, (byte) 10);
            case 11:
                return new c670((t190) obj2, yjeVar, (byte) 11);
            case 12:
                return new c670((kt90) obj2, yjeVar, (byte) 12);
            case 13:
                c670 c670Var4 = new c670((u3a0) obj2, yjeVar, (byte) 13);
                c670Var4.j = ((Boolean) obj).booleanValue();
                return c670Var4;
            case 14:
                c670 c670Var5 = new c670((iha0) obj2, yjeVar, (byte) 14);
                c670Var5.j = ((Boolean) obj).booleanValue();
                return c670Var5;
            case 15:
                c670 c670Var6 = new c670((xja0) obj2, yjeVar, (byte) 15);
                c670Var6.j = ((Boolean) obj).booleanValue();
                return c670Var6;
            case 16:
                c670 c670Var7 = new c670((ata0) obj2, yjeVar, (byte) 16);
                c670Var7.j = ((Boolean) obj).booleanValue();
                return c670Var7;
            case 17:
                return new c670((uwa0) obj2, yjeVar, (byte) 17);
            case 18:
                c670 c670Var8 = new c670((g9b0) obj2, yjeVar, (byte) 18);
                c670Var8.j = ((Boolean) obj).booleanValue();
                return c670Var8;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new c670((xib0) obj2, yjeVar, (byte) 19);
            case 20:
                return new c670((w5z) obj2, yjeVar, (byte) 20);
            case 21:
                return new c670((b2c0) obj2, yjeVar, (byte) 21);
            case 22:
                return new c670((eqx) obj2, yjeVar, (byte) 22);
            case 23:
                return new c670((b3c0) obj2, yjeVar, (byte) 23);
            case 24:
                c670 c670Var9 = new c670((h6c0) obj2, yjeVar, (byte) 24);
                c670Var9.j = ((dg5) obj).f6031a;
                return c670Var9;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                c670 c670Var10 = new c670((g7c0) obj2, yjeVar, (byte) 25);
                c670Var10.j = ((Boolean) obj).booleanValue();
                return c670Var10;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                c670 c670Var11 = new c670((pac0) obj2, yjeVar, (byte) 26);
                c670Var11.j = ((Boolean) obj).booleanValue();
                return c670Var11;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                c670 c670Var12 = new c670((idc0) obj2, yjeVar, (byte) 27);
                c670Var12.j = ((Boolean) obj).booleanValue();
                return c670Var12;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                c670 c670Var13 = new c670((jhc0) obj2, yjeVar, (byte) 28);
                c670Var13.j = ((Boolean) obj).booleanValue();
                return c670Var13;
            default:
                return new c670((qnc0) obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((c670) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((c670) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((c670) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((c670) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((c670) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((c670) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((c670) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((c670) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((c670) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((c670) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((c670) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((c670) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((c670) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return ((c670) create(bool4, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                return ((c670) create(bool5, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                return ((c670) create(bool6, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                return ((c670) create(bool7, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((c670) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                Boolean bool8 = (Boolean) obj;
                bool8.booleanValue();
                return ((c670) create(bool8, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((c670) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((c670) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((c670) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((c670) create(Integer.valueOf(((Number) obj).intValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((c670) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                boolean z = ((dg5) obj).f6031a;
                c670 c670Var = new c670((h6c0) this.k, (yje) obj2, (byte) 24);
                c670Var.j = z;
                return c670Var.invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Boolean bool9 = (Boolean) obj;
                bool9.booleanValue();
                return ((c670) create(bool9, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Boolean bool10 = (Boolean) obj;
                bool10.booleanValue();
                return ((c670) create(bool10, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Boolean bool11 = (Boolean) obj;
                bool11.booleanValue();
                return ((c670) create(bool11, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Boolean bool12 = (Boolean) obj;
                bool12.booleanValue();
                return ((c670) create(bool12, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((c670) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:342:0x0749  */
    /* JADX WARN: Code duplicated, block: B:343:0x074b  */
    /* JADX WARN: Code duplicated, block: B:349:0x0777  */
    /* JADX WARN: Code duplicated, block: B:353:0x0785  */
    /* JADX WARN: Code duplicated, block: B:354:0x0787  */
    /* JADX WARN: Code duplicated, block: B:356:0x078a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:485:0x0782 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:486:? A[LOOP:6: B:347:0x0771->B:486:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r8v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v23 */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objA;
        Object value2;
        Object objR;
        Object value3;
        Object objA2;
        List listW;
        Object objA3;
        Object value4;
        List listA0;
        boolean z;
        boolean z2;
        ?? r1;
        qz40 qz40Var;
        p7m0 p7m0Var;
        Object value5;
        jqt0 jqt0Var;
        Object value6;
        Object value7;
        Object objA4;
        Object value8;
        Object objA5;
        Object value9;
        Object value10;
        byte b = this.i;
        byte b2 = 2;
        byte b3 = 16;
        byte b4 = 0;
        byte b5 = 1;
        ?? r8 = 0;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                boolean z3 = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var2 = ((g670) obj2).E;
                do {
                    value = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value, gz60.a((gz60) value, null, false, false, z3, false, false, Response.SERVICE_UNAVAILABLE)));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    fq fqVar = ((xf70) obj2).d;
                    this.j = true;
                    if (fqVar.f(fle.f9733a, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    eh70 eh70Var = (eh70) obj2;
                    a6u a6uVar = eh70Var.q;
                    double d = ((tg70) eh70Var.z.getValue()).e;
                    this.j = true;
                    if (a6uVar.G(d, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    fq fqVar2 = ((qm70) obj2).d;
                    this.j = true;
                    if (fqVar2.f(rle.f30692a, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                boolean z7 = this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                if (z7) {
                    ((Function0) obj2).invoke();
                }
                return Boolean.valueOf(z7);
            case 5:
                zo70 zo70Var = (zo70) obj2;
                wne wneVar6 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    ucu ucuVar = zo70Var.b;
                    long jA = zo70Var.d.f33685a.f26724a.z.f42064a.a();
                    this.j = true;
                    objA = ucuVar.a(jA, this);
                    if (objA == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                qjj.W(jiu0.a(zo70Var), null, null, new wk70(zo70Var, new xo70((String) objA), r8, b3), 3);
                return Unit.f46060a;
            case 6:
                cy70 cy70Var = (cy70) obj2;
                ocj ocjVar = cy70Var.i;
                wne wneVar7 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    int i = cy70.u;
                    zr1 zr1Var = cy70Var.s;
                    yo4 yo4Var = cy70Var.r;
                    int iOrdinal = cy70Var.t.ordinal();
                    if (iOrdinal == 0) {
                        yo4Var.j(kvp0.MENU_OTHER);
                        zr1Var.n(lvp0.MENU_OTHER);
                    } else {
                        if (iOrdinal != 1) {
                            t9f.b();
                            return null;
                        }
                        yo4Var.j(kvp0.MAILING);
                        zr1Var.n(lvp0.MAILING);
                    }
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var3.getValue();
                        value2.getClass();
                    } while (!p7m0Var3.m(value2, ay70.a((ay70) value2, true)));
                    svu svuVar = cy70Var.q;
                    this.j = true;
                    objR = ((cyu) svuVar.f32888a).r(this);
                    if (objR == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objR = obj;
                }
                String str = (String) objR;
                str.getClass();
                xx70 xx70Var = new xx70(str);
                int i2 = cy70.u;
                cy70Var.G(xx70Var);
                p7m0 p7m0Var4 = ocjVar.f25029a;
                do {
                    value3 = p7m0Var4.getValue();
                    value3.getClass();
                } while (!p7m0Var4.m(value3, ay70.a((ay70) value3, false)));
                return Unit.f46060a;
            case 7:
                ag80 ag80Var = (ag80) obj2;
                wne wneVar8 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    float fL = ag80Var.r.l();
                    ds60 ds60Var = new ds60(ag80Var, (byte) 17);
                    this.j = true;
                    if (hhm0.n(fL, 0.0f, null, ds60Var, this, 12) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 8:
                fk80 fk80Var = (fk80) obj2;
                wne wneVar9 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    bby bbyVar = fk80Var.d;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    this.j = true;
                    if (fk80Var.b(true, this) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 9:
                boolean z12 = this.j;
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                ((org.xplatform.security.impl.presentation.password.change.input_password.f) obj2).s = z12;
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    t090 t090Var = (t090) obj2;
                    nr00 nr00Var = t090Var.f33109a;
                    String strC = t090Var.b.c();
                    this.j = true;
                    objA2 = ((n090) ((tpv) nr00Var.f23980a).invoke()).a(strC, 0, this);
                    if (objA2 == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA2 = obj;
                }
                return ((q16) objA2).a();
            case 11:
                t190 t190Var = (t190) obj2;
                p7m0 p7m0Var5 = t190Var.s;
                wne wneVar12 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    if (t190Var.h.f15225a.a()) {
                        rou rouVar = t190Var.i;
                        this.j = true;
                        objA3 = rouVar.a(false, this);
                        if (objA3 == wneVar12) {
                            return wneVar12;
                        }
                    } else {
                        listW = t190Var.w(false);
                    }
                    do {
                        value4 = p7m0Var5.getValue();
                        l190 l190Var = (l190) value4;
                        listA0 = CollectionsKt.A0(listW, new lk30((byte) 15));
                        if (listW.size() > 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        l190Var.getClass();
                        listA0.getClass();
                    } while (!p7m0Var5.m(value4, new l190(listA0, z)));
                    z2 = ((l190) p7m0Var5.getValue()).b;
                    for (Object obj3 : ((l190) p7m0Var5.getValue()).f19239a) {
                        if (((wzf0) obj3) instanceof uzf0) {
                            r8 = obj3;
                            if (r8 != 0) {
                                r1 = true;
                            } else {
                                r1 = false;
                            }
                            if (!z2 && r1 != false && t190Var.p != we50.c) {
                                t190Var.c.e("SAVED_VP_SIZE", Integer.valueOf(R.dimen.size_102));
                                qz40Var = (qz40) t190Var.r.getValue();
                                do {
                                    p7m0Var = (p7m0) qz40Var;
                                    value5 = p7m0Var.getValue();
                                } while (!p7m0Var.m(value5, n190.a((n190) value5, 0, R.dimen.size_102, 1)));
                            }
                            return Unit.f46060a;
                        }
                    }
                    if (r8 != 0) {
                        r1 = true;
                    } else {
                        r1 = false;
                    }
                    if (!z2) {
                        t190Var.c.e("SAVED_VP_SIZE", Integer.valueOf(R.dimen.size_102));
                        qz40Var = (qz40) t190Var.r.getValue();
                        do {
                            p7m0Var = (p7m0) qz40Var;
                            value5 = p7m0Var.getValue();
                        } while (!p7m0Var.m(value5, n190.a((n190) value5, 0, R.dimen.size_102, 1)));
                    }
                    return Unit.f46060a;
                }
                if (!z14) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objA3 = obj;
                m2c0 m2c0Var = (m2c0) objA3;
                listW = t190Var.w(StringsKt.W(m2c0Var.T) || !((jqt0Var = m2c0Var.k) == jqt0.c || jqt0Var == jqt0.d));
                do {
                    value4 = p7m0Var5.getValue();
                    l190 l190Var2 = (l190) value4;
                    listA0 = CollectionsKt.A0(listW, new lk30((byte) 15));
                    if (listW.size() > 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    l190Var2.getClass();
                    listA0.getClass();
                } while (!p7m0Var5.m(value4, new l190(listA0, z)));
                z2 = ((l190) p7m0Var5.getValue()).b;
                while (r1.hasNext()) {
                    if (((wzf0) obj3) instanceof uzf0) {
                        r8 = obj3;
                        if (r8 != 0) {
                            r1 = true;
                        } else {
                            r1 = false;
                        }
                        if (!z2) {
                            t190Var.c.e("SAVED_VP_SIZE", Integer.valueOf(R.dimen.size_102));
                            qz40Var = (qz40) t190Var.r.getValue();
                            do {
                                p7m0Var = (p7m0) qz40Var;
                                value5 = p7m0Var.getValue();
                            } while (!p7m0Var.m(value5, n190.a((n190) value5, 0, R.dimen.size_102, 1)));
                        }
                        return Unit.f46060a;
                    }
                }
                if (r8 != 0) {
                    r1 = true;
                } else {
                    r1 = false;
                }
                if (!z2) {
                    t190Var.c.e("SAVED_VP_SIZE", Integer.valueOf(R.dimen.size_102));
                    qz40Var = (qz40) t190Var.r.getValue();
                    do {
                        p7m0Var = (p7m0) qz40Var;
                        value5 = p7m0Var.getValue();
                    } while (!p7m0Var.m(value5, n190.a((n190) value5, 0, R.dimen.size_102, 1)));
                }
                return Unit.f46060a;
            case 12:
                wne wneVar13 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    kt90 kt90Var = (kt90) obj2;
                    qoj0 qoj0Var = kt90Var.f;
                    String str2 = ((lt90) kt90Var.e.getValue()).b;
                    this.j = true;
                    if (qoj0Var.a(str2, this) == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (!z15) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 13:
                u3a0 u3a0Var = (u3a0) obj2;
                boolean z16 = this.j;
                wne wneVar14 = wne.f39444a;
                z1x.P(obj);
                ?? r2 = !z16 && ((n3a0) u3a0Var.D()).e;
                if (z16 && ((n3a0) u3a0Var.D()).f) {
                    b4 = 1;
                }
                if (r2 != false || b4 != 0) {
                    int i3 = u3a0.u;
                    u3a0Var.M();
                }
                return Unit.f46060a;
            case 14:
                iha0 iha0Var = (iha0) obj2;
                boolean z17 = this.j;
                wne wneVar15 = wne.f39444a;
                z1x.P(obj);
                if (z17 && (((dha0) iha0Var.D()).d || ((dha0) iha0Var.D()).c)) {
                    int i4 = iha0.t;
                    iha0Var.M();
                }
                return Unit.f46060a;
            case 15:
                xja0 xja0Var = (xja0) obj2;
                boolean z18 = this.j;
                wne wneVar16 = wne.f39444a;
                z1x.P(obj);
                if (z18 && (((rja0) xja0Var.D()).f || ((rja0) xja0Var.D()).g)) {
                    int i5 = xja0.v;
                    xja0Var.M();
                }
                return Unit.f46060a;
            case 16:
                boolean z19 = this.j;
                wne wneVar17 = wne.f39444a;
                z1x.P(obj);
                ata0 ata0Var = (ata0) obj2;
                mne mneVar = ata0Var.q;
                oyg0 oyg0Var = ata0Var.f;
                int i6 = ata0.S;
                ocj ocjVar2 = ata0Var.i;
                p7m0 p7m0Var6 = ocjVar2.f25029a;
                do {
                    value6 = p7m0Var6.getValue();
                    value6.getClass();
                } while (!p7m0Var6.m(value6, nsa0.a((nsa0) value6, null, null, null, false, null, false, null, 1022)));
                if (z19) {
                    v3c.N(ata0Var.L);
                }
                bby bbyVar2 = ata0Var.L;
                if (bbyVar2 != null) {
                    bbyVar2.cancel(null);
                }
                ata0Var.L = ata0Var.I(mneVar.b, new tsa0(ata0Var, b5), new zsa0(ata0Var, r8, b4));
                if (!(((nsa0) ata0Var.D()).b instanceof in00)) {
                    p7m0 p7m0Var7 = ocjVar2.f25029a;
                    do {
                        value7 = p7m0Var7.getValue();
                        value7.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var7.m(value7, nsa0.a((nsa0) value7, new mn00(), null, null, false, null, false, null, 1021)));
                }
                bby bbyVar3 = ata0Var.M;
                if (bbyVar3 != null) {
                    bbyVar3.cancel(null);
                }
                ata0Var.M = ata0Var.I(mneVar.b, new tsa0(ata0Var, (byte) 4), new wsa0(ata0Var, r8, b2));
                ata0Var.N();
                return Unit.f46060a;
            case 17:
                wne wneVar18 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    uwa0 uwa0Var = (uwa0) obj2;
                    vqc vqcVar = uwa0Var.s;
                    List listC = kotlin.collections.a.c(((swa0) uwa0Var.D()).f32913a.f29426a);
                    this.j = true;
                    Object objA6 = ((pzu) vqcVar.b).A(listC, this);
                    if (objA6 != wneVar18) {
                        objA6 = Unit.f46060a;
                    }
                    if (objA6 == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (!z20) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 18:
                boolean z21 = this.j;
                wne wneVar19 = wne.f39444a;
                z1x.P(obj);
                if (z21) {
                    ((g9b0) obj2).A(s8b0.c);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                xib0 xib0Var = (xib0) obj2;
                wne wneVar20 = wne.f39444a;
                boolean z22 = this.j;
                if (!z22) {
                    z1x.P(obj);
                    oqx oqxVar = xib0Var.t;
                    List list = ((uib0) xib0Var.D()).c;
                    this.j = true;
                    objA4 = oqxVar.a(list, this);
                    if (objA4 == wneVar20) {
                        return wneVar20;
                    }
                } else {
                    if (!z22) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA4 = obj;
                }
                boolean zBooleanValue = ((Boolean) objA4).booleanValue();
                int i7 = xib0.x;
                p7m0 p7m0Var8 = xib0Var.i.f25029a;
                do {
                    value8 = p7m0Var8.getValue();
                    value8.getClass();
                } while (!p7m0Var8.m(value8, uib0.a((uib0) value8, zBooleanValue, false, false, false, false, 2046)));
                return Unit.f46060a;
            case 20:
                wne wneVar21 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    this.j = true;
                    ((w5z) obj2).f0(this);
                    return wneVar21;
                }
                if (z23) {
                    z1x.P(obj);
                    return Unit.f46060a;
                }
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 21:
                b2c0 b2c0Var = (b2c0) obj2;
                wne wneVar22 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    rou rouVar2 = b2c0Var.p;
                    this.j = true;
                    objA5 = rouVar2.a(false, this);
                    if (objA5 == wneVar22) {
                        return wneVar22;
                    }
                } else {
                    if (!z24) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA5 = obj;
                }
                m2c0 m2c0Var2 = (m2c0) objA5;
                ctf0 ctf0Var = b2c0Var.u;
                vzg0 vzg0Var = b2c0Var.o;
                m2c0Var2.getClass();
                String strC2 = m2c0Var2.D;
                ctf0Var.getClass();
                vzg0Var.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str3 = m2c0Var2.c;
                if (strC2.length() > 0) {
                    strC2 = rdj.c(rdj.f30294a, sdj.UNIVERSAL, gqw0.I0(strC2, "dd.MM.yy"), null, 56);
                }
                String str4 = strC2;
                linkedHashMap.put(EditProfileTjItemEnum.c, new ProfileEditTjUiModel.ProfileEditTitleTjUiModel(R.string.basic_data));
                EditProfileTjItemEnum editProfileTjItemEnum = EditProfileTjItemEnum.f;
                ProfileEditTjUiModel profileEditItemTjUiModel = (ProfileEditTjUiModel) vzg0Var.a(agc.J(editProfileTjItemEnum));
                if (profileEditItemTjUiModel == null) {
                    String str5 = m2c0Var2.V;
                    profileEditItemTjUiModel = new ProfileEditTjUiModel.ProfileEditItemTjUiModel(editProfileTjItemEnum, str5, 0, R.string.surname_title, str5.length() == 0, true, false, true, "");
                }
                linkedHashMap.put(editProfileTjItemEnum, profileEditItemTjUiModel);
                EditProfileTjItemEnum editProfileTjItemEnum2 = EditProfileTjItemEnum.g;
                ProfileEditTjUiModel profileEditItemTjUiModel2 = (ProfileEditTjUiModel) vzg0Var.a(agc.J(editProfileTjItemEnum2));
                if (profileEditItemTjUiModel2 == null) {
                    String str6 = m2c0Var2.U;
                    profileEditItemTjUiModel2 = new ProfileEditTjUiModel.ProfileEditItemTjUiModel(editProfileTjItemEnum2, str6, 0, R.string.name_title, str6.length() == 0, false, false, true, "");
                }
                linkedHashMap.put(editProfileTjItemEnum2, profileEditItemTjUiModel2);
                EditProfileTjItemEnum editProfileTjItemEnum3 = EditProfileTjItemEnum.h;
                ProfileEditTjUiModel profileEditItemTjUiModel3 = (ProfileEditTjUiModel) vzg0Var.a(agc.J(editProfileTjItemEnum3));
                if (profileEditItemTjUiModel3 == null) {
                    String str7 = m2c0Var2.f21050a;
                    profileEditItemTjUiModel3 = new ProfileEditTjUiModel.ProfileEditItemTjUiModel(editProfileTjItemEnum3, str7, 0, R.string.reg_user_middle_name_x_if_available, str7.length() == 0, false, false, true, "");
                }
                linkedHashMap.put(editProfileTjItemEnum3, profileEditItemTjUiModel3);
                EditProfileTjItemEnum editProfileTjItemEnum4 = EditProfileTjItemEnum.i;
                ProfileEditTjUiModel profileEditItemClickableTjUiModel = (ProfileEditTjUiModel) vzg0Var.a(agc.J(editProfileTjItemEnum4));
                if (profileEditItemClickableTjUiModel == null) {
                    profileEditItemClickableTjUiModel = new ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel(editProfileTjItemEnum4, str4, 0, R.string.date_of_birth, str4.length() == 0, false, false, true, "");
                }
                linkedHashMap.put(editProfileTjItemEnum4, profileEditItemClickableTjUiModel);
                EditProfileTjItemEnum editProfileTjItemEnum5 = EditProfileTjItemEnum.j;
                ProfileEditTjUiModel profileEditItemClickableTjUiModel2 = (ProfileEditTjUiModel) vzg0Var.a(agc.J(editProfileTjItemEnum5));
                if (profileEditItemClickableTjUiModel2 == null) {
                    int i8 = m2c0Var2.s;
                    String strA = i8 != 1 ? i8 != 2 ? "" : ctf0Var.b.a(R.string.female, Arrays.copyOf(new Object[0], 0)) : ctf0Var.b.a(R.string.male, Arrays.copyOf(new Object[0], 0));
                    int i9 = m2c0Var2.s;
                    profileEditItemClickableTjUiModel2 = new ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel(editProfileTjItemEnum5, strA, i9, R.string.gender, i9 == 0, false, true, true, "");
                }
                linkedHashMap.put(editProfileTjItemEnum5, profileEditItemClickableTjUiModel2);
                linkedHashMap.put(EditProfileTjItemEnum.d, new ProfileEditTjUiModel.ProfileEditTitleTjUiModel(R.string.living_place));
                EditProfileTjItemEnum editProfileTjItemEnum6 = EditProfileTjItemEnum.k;
                ProfileEditTjUiModel profileEditItemClickableTjUiModel3 = (ProfileEditTjUiModel) vzg0Var.a(agc.J(editProfileTjItemEnum6));
                if (profileEditItemClickableTjUiModel3 == null) {
                    Integer intOrNull = StringsKt.toIntOrNull(str3);
                    String strA2 = ctf0Var.b.a((intOrNull != null ? intOrNull.intValue() : 0) == 178 ? R.string.resident : R.string.not_resident, Arrays.copyOf(new Object[0], 0));
                    Integer intOrNull2 = StringsKt.toIntOrNull(str3);
                    int i10 = (intOrNull2 != null ? intOrNull2.intValue() : 0) == 178 ? 1 : 0;
                    Integer intOrNull3 = StringsKt.toIntOrNull(str3);
                    profileEditItemClickableTjUiModel3 = new ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel(editProfileTjItemEnum6, strA2, i10, R.string.resident_status, (intOrNull3 != null ? intOrNull3.intValue() : 0) == 178, true, false, true, "");
                }
                linkedHashMap.put(editProfileTjItemEnum6, profileEditItemClickableTjUiModel3);
                EditProfileTjItemEnum editProfileTjItemEnum7 = EditProfileTjItemEnum.l;
                ProfileEditTjUiModel profileEditItemClickableTjUiModel4 = (ProfileEditTjUiModel) vzg0Var.a(agc.J(editProfileTjItemEnum7));
                if (profileEditItemClickableTjUiModel4 == null) {
                    String str8 = m2c0Var2.e;
                    Integer intOrNull4 = StringsKt.toIntOrNull(str3);
                    int iIntValue = intOrNull4 != null ? intOrNull4.intValue() : 0;
                    Integer intOrNull5 = StringsKt.toIntOrNull(str3);
                    profileEditItemClickableTjUiModel4 = new ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel(editProfileTjItemEnum7, str8, iIntValue, R.string.country_title, false, false, (intOrNull5 != null ? intOrNull5.intValue() : 0) != 178, true, "");
                }
                linkedHashMap.put(editProfileTjItemEnum7, profileEditItemClickableTjUiModel4);
                EditProfileTjItemEnum editProfileTjItemEnum8 = EditProfileTjItemEnum.m;
                ProfileEditTjUiModel profileEditItemClickableTjUiModel5 = (ProfileEditTjUiModel) vzg0Var.a(agc.J(editProfileTjItemEnum8));
                if (profileEditItemClickableTjUiModel5 == null) {
                    String str9 = m2c0Var2.f;
                    int i11 = m2c0Var2.g;
                    boolean z25 = i11 == 0;
                    Integer intOrNull6 = StringsKt.toIntOrNull(str3);
                    profileEditItemClickableTjUiModel5 = new ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel(editProfileTjItemEnum8, str9, i11, R.string.province, z25, false, false, (intOrNull6 != null ? intOrNull6.intValue() : 0) == 178, "");
                }
                linkedHashMap.put(editProfileTjItemEnum8, profileEditItemClickableTjUiModel5);
                EditProfileTjItemEnum editProfileTjItemEnum9 = EditProfileTjItemEnum.n;
                ProfileEditTjUiModel profileEditItemClickableTjUiModel6 = (ProfileEditTjUiModel) vzg0Var.a(agc.J(editProfileTjItemEnum9));
                if (profileEditItemClickableTjUiModel6 == null) {
                    String str10 = m2c0Var2.W;
                    int i12 = m2c0Var2.d;
                    boolean z26 = i12 == 0;
                    Integer intOrNull7 = StringsKt.toIntOrNull(str3);
                    profileEditItemClickableTjUiModel6 = new ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel(editProfileTjItemEnum9, str10, i12, R.string.city_title, z26, false, false, (intOrNull7 != null ? intOrNull7.intValue() : 0) == 178, "");
                }
                linkedHashMap.put(editProfileTjItemEnum9, profileEditItemClickableTjUiModel6);
                EditProfileTjItemEnum editProfileTjItemEnum10 = EditProfileTjItemEnum.o;
                ProfileEditTjUiModel profileEditItemTjUiModel4 = (ProfileEditTjUiModel) vzg0Var.a(agc.J(editProfileTjItemEnum10));
                if (profileEditItemTjUiModel4 == null) {
                    String str11 = m2c0Var2.u;
                    boolean z27 = str11.length() == 0;
                    Integer intOrNull8 = StringsKt.toIntOrNull(str3);
                    profileEditItemTjUiModel4 = new ProfileEditTjUiModel.ProfileEditItemTjUiModel(editProfileTjItemEnum10, str11, 0, R.string.living_address, z27, false, true, (intOrNull8 != null ? intOrNull8.intValue() : 0) == 178, "");
                }
                linkedHashMap.put(editProfileTjItemEnum10, profileEditItemTjUiModel4);
                linkedHashMap.put(EditProfileTjItemEnum.e, new ProfileEditTjUiModel.ProfileEditTitleTjUiModel(R.string.document));
                EditProfileTjItemEnum editProfileTjItemEnum11 = EditProfileTjItemEnum.p;
                ProfileEditTjUiModel profileEditItemTjUiModel5 = (ProfileEditTjUiModel) vzg0Var.a(agc.J(editProfileTjItemEnum11));
                if (profileEditItemTjUiModel5 == null) {
                    String str12 = m2c0Var2.x;
                    boolean z28 = str12.length() == 0;
                    Integer intOrNull9 = StringsKt.toIntOrNull(str3);
                    profileEditItemTjUiModel5 = new ProfileEditTjUiModel.ProfileEditItemTjUiModel(editProfileTjItemEnum11, str12, 0, R.string.document_number_new, z28, true, (intOrNull9 != null ? intOrNull9.intValue() : 0) != 178, true, "");
                }
                linkedHashMap.put(editProfileTjItemEnum11, profileEditItemTjUiModel5);
                EditProfileTjItemEnum editProfileTjItemEnum12 = EditProfileTjItemEnum.q;
                ProfileEditTjUiModel profileEditItemTjUiModel6 = (ProfileEditTjUiModel) vzg0Var.a(agc.J(editProfileTjItemEnum12));
                if (profileEditItemTjUiModel6 == null) {
                    String str13 = m2c0Var2.H;
                    boolean z29 = str13.length() == 0;
                    Integer intOrNull10 = StringsKt.toIntOrNull(str3);
                    profileEditItemTjUiModel6 = new ProfileEditTjUiModel.ProfileEditItemTjUiModel(editProfileTjItemEnum12, str13, 0, R.string.inn, z29, false, true, (intOrNull10 != null ? intOrNull10.intValue() : 0) == 178, "");
                }
                linkedHashMap.put(editProfileTjItemEnum12, profileEditItemTjUiModel6);
                Object objA7 = vzg0Var.a("NAVIGATE_TO_BIND_PHONE_KEY");
                p1c0 p1c0Var = new p1c0(false, linkedHashMap, false, Intrinsics.d(objA7 instanceof Boolean ? (Boolean) objA7 : null, Boolean.TRUE));
                p7m0 p7m0Var9 = b2c0Var.i.f25029a;
                do {
                    value9 = p7m0Var9.getValue();
                    value9.getClass();
                } while (!p7m0Var9.m(value9, p1c0Var));
                return Unit.f46060a;
            case 22:
                wne wneVar23 = wne.f39444a;
                boolean z30 = this.j;
                if (z30) {
                    if (z30) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                b3c0 b3c0Var = ((eqx) obj2).f8256a;
                this.j = true;
                Object objA8 = b3c0Var.a(false, this);
                return objA8 == wneVar23 ? wneVar23 : objA8;
            case 23:
                return l(obj);
            case 24:
                boolean z31 = this.j;
                wne wneVar24 = wne.f39444a;
                z1x.P(obj);
                nh70 nh70Var = h6c0.W1;
                ((h6c0) obj2).H0().d.setVisibility(z31 ? 0 : 8);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                boolean z32 = this.j;
                wne wneVar25 = wne.f39444a;
                z1x.P(obj);
                if (z32) {
                    p7m0 p7m0Var10 = ((g7c0) obj2).B;
                    p7m0Var10.getClass();
                    p7m0Var10.o(null, cfe.f4257a);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                boolean z33 = this.j;
                wne wneVar26 = wne.f39444a;
                z1x.P(obj);
                int i13 = pac0.y;
                p7m0 p7m0Var11 = ((pac0) obj2).i.f25029a;
                do {
                    value10 = p7m0Var11.getValue();
                    value10.getClass();
                } while (!p7m0Var11.m(value10, jac0.a((jac0) value10, false, z33, false, null, null, 29)));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                boolean z34 = this.j;
                wne wneVar27 = wne.f39444a;
                z1x.P(obj);
                jh70 jh70Var = idc0.S1;
                ((idc0) obj2).L0().d.setVisibility(z34 ? 0 : 8);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                boolean z35 = this.j;
                wne wneVar28 = wne.f39444a;
                z1x.P(obj);
                if (z35) {
                    jhc0 jhc0Var = (jhc0) obj2;
                    sac.V(jiu0.a(jhc0Var), new ppb0(jhc0Var, b3), new ssa0(jhc0Var, (byte) 22), jhc0Var.d.b, new dhc0(jhc0Var, null), 8);
                }
                return Unit.f46060a;
            default:
                wne wneVar29 = wne.f39444a;
                boolean z36 = this.j;
                if (!z36) {
                    z1x.P(obj);
                    this.j = true;
                    if (((qnc0) obj2).w(this) == wneVar29) {
                        return wneVar29;
                    }
                } else {
                    if (!z36) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
