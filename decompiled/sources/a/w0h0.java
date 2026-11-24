package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.ui_core.viewcomponents.views.date.ScrollableSquaredDateView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w0h0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38349a;

    public /* synthetic */ w0h0(byte b) {
        this.f38349a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        i83 i83Var;
        int i;
        long textPrimary;
        etn etnVar = null;
        etnVar = null;
        switch (this.f38349a) {
            case 0:
                obj.getClass();
                String str = (String) obj;
                Locale localeForLanguageTag = Locale.forLanguageTag(str);
                if (Intrinsics.d(localeForLanguageTag.toLanguageTag(), "und")) {
                    System.err.println("The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new qs00(localeForLanguageTag);
            case 1:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                String str2 = obj2 != null ? (String) obj2 : null;
                str2.getClass();
                Object obj3 = list.get(1);
                return new ib00(str2, (Intrinsics.d(obj3, Boolean.FALSE) || obj3 == null) ? null : (f9q0) z0h0.i.b.invoke(obj3), null);
            case 2:
                obj.getClass();
                List list2 = (List) obj;
                Object obj4 = list2.get(0);
                float f = j600.b;
                y0h0 y0h0Var = z0h0.B;
                Boolean bool = Boolean.FALSE;
                Intrinsics.d(obj4, bool);
                j600 j600Var = obj4 != null ? (j600) y0h0Var.b.invoke(obj4) : null;
                j600Var.getClass();
                float f2 = j600Var.f15960a;
                Object obj5 = list2.get(1);
                y0h0 y0h0Var2 = z0h0.C;
                Intrinsics.d(obj5, bool);
                l600 l600Var = obj5 != null ? (l600) y0h0Var2.b.invoke(obj5) : null;
                l600Var.getClass();
                int i2 = l600Var.f19483a;
                Object obj6 = list2.get(2);
                y0h0 y0h0Var3 = z0h0.D;
                Intrinsics.d(obj6, bool);
                k600 k600Var = obj6 != null ? (k600) y0h0Var3.b.invoke(obj6) : null;
                k600Var.getClass();
                return new m600(i2, f2, k600Var.f17743a);
            case 3:
                obj.getClass();
                float fFloatValue = ((Float) obj).floatValue();
                j600.a(fFloatValue);
                return new j600(fFloatValue);
            case 4:
                obj.getClass();
                return new l600(((Integer) obj).intValue());
            case 5:
                obj.getClass();
                List list3 = (List) obj;
                Object obj7 = list3.get(0);
                z83 z83Var = obj7 != null ? (z83) obj7 : null;
                z83Var.getClass();
                Object obj8 = list3.get(2);
                Integer num = obj8 != null ? (Integer) obj8 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj9 = list3.get(3);
                Integer num2 = obj9 != null ? (Integer) obj9 : null;
                num2.getClass();
                int iIntValue2 = num2.intValue();
                Object obj10 = list3.get(4);
                String str3 = obj10 != null ? (String) obj10 : null;
                str3.getClass();
                switch (z83Var.ordinal()) {
                    case 0:
                        Object obj11 = list3.get(1);
                        eo80 eo80Var = (Intrinsics.d(obj11, Boolean.FALSE) || obj11 == null) ? null : (eo80) z0h0.g.b.invoke(obj11);
                        eo80Var.getClass();
                        i83Var = new i83(iIntValue, iIntValue2, eo80Var, str3);
                        break;
                    case 1:
                        Object obj12 = list3.get(1);
                        smk0 smk0Var = (Intrinsics.d(obj12, Boolean.FALSE) || obj12 == null) ? null : (smk0) z0h0.h.b.invoke(obj12);
                        smk0Var.getClass();
                        i83Var = new i83(iIntValue, iIntValue2, smk0Var, str3);
                        break;
                    case 2:
                        Object obj13 = list3.get(1);
                        h7u0 h7u0Var = (Intrinsics.d(obj13, Boolean.FALSE) || obj13 == null) ? null : (h7u0) z0h0.c.b.invoke(obj13);
                        h7u0Var.getClass();
                        i83Var = new i83(iIntValue, iIntValue2, h7u0Var, str3);
                        break;
                    case 3:
                        Object obj14 = list3.get(1);
                        cot0 cot0Var = (Intrinsics.d(obj14, Boolean.FALSE) || obj14 == null) ? null : (cot0) z0h0.d.b.invoke(obj14);
                        cot0Var.getClass();
                        i83Var = new i83(iIntValue, iIntValue2, cot0Var, str3);
                        break;
                    case 4:
                        Object obj15 = list3.get(1);
                        jb00 jb00Var = (Intrinsics.d(obj15, Boolean.FALSE) || obj15 == null) ? null : (jb00) z0h0.e.b.invoke(obj15);
                        jb00Var.getClass();
                        i83Var = new i83(iIntValue, iIntValue2, jb00Var, str3);
                        break;
                    case 5:
                        Object obj16 = list3.get(1);
                        ib00 ib00Var = (Intrinsics.d(obj16, Boolean.FALSE) || obj16 == null) ? null : (ib00) z0h0.f.b.invoke(obj16);
                        ib00Var.getClass();
                        i83Var = new i83(iIntValue, iIntValue2, ib00Var, str3);
                        break;
                    case 6:
                        Object obj17 = list3.get(1);
                        String str4 = obj17 != null ? (String) obj17 : null;
                        str4.getClass();
                        i83Var = new i83(iIntValue, iIntValue2, new fsm0(str4), str3);
                        break;
                    default:
                        t9f.b();
                        return null;
                }
                return i83Var;
            case 6:
                obj.getClass();
                return new k600(((Integer) obj).intValue());
            case 7:
                String str5 = obj != null ? (String) obj : null;
                str5.getClass();
                return new h7u0(str5);
            case 8:
                String str6 = obj != null ? (String) obj : null;
                str6.getClass();
                return new cot0(str6);
            case 9:
                obj.getClass();
                List list4 = (List) obj;
                Object obj18 = list4.get(0);
                y0h0 y0h0Var4 = z0h0.q;
                Boolean bool2 = Boolean.FALSE;
                Intrinsics.d(obj18, bool2);
                f2q0 f2q0Var = obj18 != null ? (f2q0) y0h0Var4.b.invoke(obj18) : null;
                f2q0Var.getClass();
                int i3 = f2q0Var.f8826a;
                Object obj19 = list4.get(1);
                y0h0 y0h0Var5 = z0h0.r;
                Intrinsics.d(obj19, bool2);
                n5q0 n5q0Var = obj19 != null ? (n5q0) y0h0Var5.b.invoke(obj19) : null;
                n5q0Var.getClass();
                int i4 = n5q0Var.f22957a;
                Object obj20 = list4.get(2);
                eaq0[] eaq0VarArr = daq0.b;
                y0h0 y0h0Var6 = z0h0.v;
                Intrinsics.d(obj20, bool2);
                daq0 daq0Var = obj20 != null ? (daq0) y0h0Var6.b.invoke(obj20) : null;
                daq0Var.getClass();
                long j = daq0Var.f5764a;
                Object obj21 = list4.get(3);
                g8q0 g8q0Var = g8q0.c;
                g8q0 g8q0Var2 = (Intrinsics.d(obj21, bool2) || obj21 == null) ? null : (g8q0) z0h0.l.b.invoke(obj21);
                Object obj22 = list4.get(4);
                ew90 ew90Var = (Intrinsics.d(obj22, bool2) || obj22 == null) ? null : (ew90) gq80.g.b.invoke(obj22);
                Object obj23 = list4.get(5);
                m600 m600Var = m600.d;
                m600 m600Var2 = (Intrinsics.d(obj23, bool2) || obj23 == null) ? null : (m600) z0h0.A.b.invoke(obj23);
                Object obj24 = list4.get(6);
                p500 p500Var = (Intrinsics.d(obj24, bool2) || obj24 == null) ? null : (p500) gq80.i.b.invoke(obj24);
                p500Var.getClass();
                int i5 = p500Var.f26381a;
                Object obj25 = list4.get(7);
                y0h0 y0h0Var7 = z0h0.s;
                Intrinsics.d(obj25, bool2);
                fuw fuwVar = obj25 != null ? (fuw) y0h0Var7.b.invoke(obj25) : null;
                fuwVar.getClass();
                int i6 = fuwVar.f10185a;
                Object obj26 = list4.get(8);
                return new eo80(i3, i4, j, g8q0Var2, ew90Var, m600Var2, i5, i6, (Intrinsics.d(obj26, bool2) || obj26 == null) ? null : (i9q0) gq80.j.b.invoke(obj26));
            case 10:
                obj.getClass();
                List list5 = (List) obj;
                Object obj27 = list5.get(0);
                int i7 = y3d.h;
                Boolean bool3 = Boolean.FALSE;
                Intrinsics.d(obj27, bool3);
                y3d y3dVar = obj27 != null ? Intrinsics.d(obj27, Boolean.FALSE) ? new y3d(y3d.g) : new y3d(fbc.d(((Integer) obj27).intValue())) : null;
                y3dVar.getClass();
                long j2 = y3dVar.f41946a;
                Object obj28 = list5.get(1);
                eaq0[] eaq0VarArr2 = daq0.b;
                Function1 function1 = z0h0.v.b;
                Intrinsics.d(obj28, bool3);
                daq0 daq0Var2 = obj28 != null ? (daq0) function1.invoke(obj28) : null;
                daq0Var2.getClass();
                long j3 = daq0Var2.f5764a;
                Object obj29 = list5.get(2);
                psq psqVar = psq.b;
                psq psqVar2 = (Intrinsics.d(obj29, bool3) || obj29 == null) ? null : (psq) z0h0.m.b.invoke(obj29);
                Object obj30 = list5.get(3);
                lsq lsqVar = (Intrinsics.d(obj30, bool3) || obj30 == null) ? null : (lsq) z0h0.t.b.invoke(obj30);
                Object obj31 = list5.get(4);
                msq msqVar = (Intrinsics.d(obj31, bool3) || obj31 == null) ? null : (msq) z0h0.u.b.invoke(obj31);
                Object obj32 = list5.get(6);
                String str7 = obj32 != null ? (String) obj32 : null;
                Object obj33 = list5.get(7);
                Intrinsics.d(obj33, bool3);
                daq0 daq0Var3 = obj33 != null ? (daq0) function1.invoke(obj33) : null;
                daq0Var3.getClass();
                long j4 = daq0Var3.f5764a;
                Object obj34 = list5.get(8);
                j56 j56Var = (Intrinsics.d(obj34, bool3) || obj34 == null) ? null : (j56) z0h0.n.b.invoke(obj34);
                Object obj35 = list5.get(9);
                f8q0 f8q0Var = (Intrinsics.d(obj35, bool3) || obj35 == null) ? null : (f8q0) z0h0.k.b.invoke(obj35);
                Object obj36 = list5.get(10);
                rs00 rs00Var = rs00.c;
                rs00 rs00Var2 = (Intrinsics.d(obj36, bool3) || obj36 == null) ? null : (rs00) z0h0.y.b.invoke(obj36);
                Object obj37 = list5.get(11);
                Intrinsics.d(obj37, bool3);
                y3d y3dVar2 = obj37 != null ? Intrinsics.d(obj37, Boolean.FALSE) ? new y3d(y3d.g) : new y3d(fbc.d(((Integer) obj37).intValue())) : null;
                y3dVar2.getClass();
                long j5 = y3dVar2.f41946a;
                Object obj38 = list5.get(12);
                k5q0 k5q0Var = (Intrinsics.d(obj38, bool3) || obj38 == null) ? null : (k5q0) z0h0.j.b.invoke(obj38);
                Object obj39 = list5.get(13);
                ljj0 ljj0Var = ljj0.d;
                return new smk0(j2, j3, psqVar2, lsqVar, msqVar, null, str7, j4, j56Var, f8q0Var, rs00Var2, j5, k5q0Var, (Intrinsics.d(obj39, bool3) || obj39 == null) ? null : (ljj0) z0h0.o.b.invoke(obj39), null, 49184);
            case 11:
                obj.getClass();
                List list6 = (List) obj;
                Object obj40 = list6.get(0);
                Boolean bool4 = obj40 != null ? (Boolean) obj40 : null;
                bool4.getClass();
                boolean zBooleanValue = bool4.booleanValue();
                Object obj41 = list6.get(1);
                v0h0 v0h0Var = gq80.h;
                if (!Intrinsics.d(obj41, Boolean.FALSE) && obj41 != null) {
                    etnVar = (etn) v0h0Var.b.invoke(obj41);
                }
                etnVar.getClass();
                return new ew90(etnVar.f8383a, zBooleanValue);
            case 12:
                obj.getClass();
                return new etn(((Integer) obj).intValue());
            case 13:
                obj.getClass();
                return new p500(((Integer) obj).intValue());
            case 14:
                obj.getClass();
                List list7 = (List) obj;
                Object obj42 = list7.get(0);
                h9q0 h9q0Var = (Intrinsics.d(obj42, Boolean.FALSE) || obj42 == null) ? null : (h9q0) gq80.k.b.invoke(obj42);
                h9q0Var.getClass();
                int i8 = h9q0Var.f12690a;
                Object obj43 = list7.get(1);
                Boolean bool5 = obj43 != null ? (Boolean) obj43 : null;
                bool5.getClass();
                return new i9q0(i8, bool5.booleanValue());
            case 15:
                obj.getClass();
                return new h9q0(((Integer) obj).intValue());
            case 16:
                ((Throwable) obj).getClass();
                return Boolean.FALSE;
            case 17:
                return Integer.valueOf(((v9h0) obj).b);
            case 18:
                return Integer.valueOf(((v9h0) obj).c.a());
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new rah0(((Integer) obj).intValue());
            case 20:
                int i9 = ScrollableSquaredDateView.j;
                ((Date) obj).getClass();
                return Unit.f46060a;
            case 21:
                p6t0 p6t0Var = (p6t0) obj;
                p6t0Var.getClass();
                return p6t0Var.getKey();
            case 22:
                p6t0 p6t0Var2 = (p6t0) obj;
                p6t0Var2.getClass();
                return sre0.f32672a.b(p6t0Var2.getClass());
            case 23:
                List list8 = (List) obj;
                list8.getClass();
                if (list8.isEmpty()) {
                    i = 0;
                } else {
                    Iterator it = list8.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        if ((((dok0) it.next()) instanceof cok0) && (i = i + 1) < 0) {
                            q3d.o();
                            throw null;
                        }
                    }
                }
                return Boolean.valueOf(i > 1);
            case 24:
                pjh0 pjh0Var = (pjh0) obj;
                pjh0Var.getClass();
                List list9 = pjh0Var.b;
                ArrayList arrayList = new ArrayList(r3d.q(list9, 10));
                int i10 = 0;
                for (Object obj44 : list9) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        q3d.p();
                        throw null;
                    }
                    int iIntValue3 = ((Number) obj44).intValue();
                    if (iIntValue3 == pjh0Var.f27091a) {
                        pz40 pz40Var = s6t0.f31722a;
                        textPrimary = s6t0.b().f33626a.getPrimary();
                    } else {
                        pz40 pz40Var2 = s6t0.f31722a;
                        textPrimary = s6t0.b().f33626a.getTextPrimary();
                    }
                    arrayList.add(new ejh0(iIntValue3, textPrimary, i10 != list9.size() - 1));
                    i10 = i11;
                }
                return new qjh0(dyb.r0(arrayList));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                pkh0 pkh0Var = (pkh0) obj;
                pkh0Var.getClass();
                return pkh0Var.f27134a.toString();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((vzg0) obj).getClass();
                return new mmh0(jlh0.f16718a, iun.f15405a, false, -1, "", "", "", true, null);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hcz.g(hczVar, 3, null, null, cy2.t, 6);
                return Unit.f46060a;
            default:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new ui80(cpVar, (byte) 18));
                return Unit.f46060a;
        }
    }
}
