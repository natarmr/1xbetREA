package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wb4 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38858a;
    public final /* synthetic */ qkt b;

    public /* synthetic */ wb4(qkt qktVar, byte b) {
        this.f38858a = b;
        this.b = qktVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        String str2;
        String str3;
        cm90 cm90Var;
        cm90 cm90Var2;
        String str4;
        String str5;
        String str6;
        cm90 cm90Var3;
        cm90 cm90Var4;
        String str7;
        String str8;
        String str9;
        cm90 cm90Var5;
        cm90 cm90Var6;
        byte b = this.f38858a;
        qkt qktVar = this.b;
        switch (b) {
            case 0:
                oyg0 oyg0Var = (oyg0) obj;
                mb4 mb4Var = (mb4) obj2;
                oyg0Var.getClass();
                mb4Var.getClass();
                Object objD = q7x.D(oyg0Var, "", "KEY_PHONE");
                q7x.F(oyg0Var, objD, "KEY_PHONE");
                String str10 = (String) objD;
                if (qktVar == null || (str = qktVar.c) == null) {
                    str = (String) q7x.D(oyg0Var, "", "KEY_PHONE_CODE");
                }
                q7x.F(oyg0Var, str, "KEY_PHONE_CODE");
                if (qktVar == null || (str2 = qktVar.f) == null) {
                    str2 = (String) q7x.D(oyg0Var, "", "KEY_CODE_COUNTRY_IMAGE");
                }
                q7x.F(oyg0Var, str2, "KEY_CODE_COUNTRY_IMAGE");
                if (qktVar == null || (cm90Var2 = qktVar.h) == null || (str3 = cm90Var2.d) == null) {
                    str3 = (String) q7x.D(oyg0Var, "", "KEY_PHONE_MASK");
                }
                q7x.F(oyg0Var, str3, "KEY_PHONE_MASK");
                int iIntValue = (qktVar == null || (cm90Var = qktVar.h) == null) ? ((Number) q7x.D(oyg0Var, 255, "KEY_PHONE_MASK_MAX_LENGTH")).intValue() : cm90Var.c;
                q7x.F(oyg0Var, Integer.valueOf(iIntValue), "KEY_PHONE_MASK_MAX_LENGTH");
                id4 id4VarA = id4.a(iIntValue, str10, str3, str, str2);
                int iIntValue2 = qktVar != null ? qktVar.f28902a : ((Number) q7x.D(oyg0Var, 225, "KEY_SELECTED_COUNTRY_ID")).intValue();
                q7x.F(oyg0Var, Integer.valueOf(iIntValue2), "KEY_SELECTED_COUNTRY_ID");
                return mb4.a(mb4Var, false, false, false, null, null, id4VarA, iIntValue2, false, null, null, false, 16191);
            case 1:
                oyg0 oyg0Var2 = (oyg0) obj;
                mb4 mb4Var2 = (mb4) obj2;
                oyg0Var2.getClass();
                mb4Var2.getClass();
                int i = qktVar.f28902a;
                q7x.F(oyg0Var2, Integer.valueOf(i), "KEY_SELECTED_COUNTRY_ID");
                String str11 = qktVar.c;
                q7x.F(oyg0Var2, str11, "KEY_PHONE_CODE");
                q7x.F(oyg0Var2, "", "KEY_PHONE");
                String str12 = qktVar.f;
                q7x.F(oyg0Var2, str12, "KEY_CODE_COUNTRY_IMAGE");
                cm90 cm90Var7 = qktVar.h;
                String str13 = cm90Var7.d;
                q7x.F(oyg0Var2, str13, "KEY_PHONE_MASK");
                int i2 = cm90Var7.c;
                q7x.F(oyg0Var2, Integer.valueOf(i2), "KEY_PHONE_MASK_MAX_LENGTH");
                id4 id4VarA2 = id4.a(i2, "", str13, str11, str12);
                q7x.F(oyg0Var2, Boolean.TRUE, "KEY_COUNTRY_ALLOWED");
                return mb4.a(mb4Var2, false, false, false, null, null, id4VarA2, i, true, null, null, false, 15927);
            case 2:
                oyg0 oyg0Var3 = (oyg0) obj;
                zf4 zf4Var = (zf4) obj2;
                oyg0Var3.getClass();
                zf4Var.getClass();
                int i3 = qktVar.f28902a;
                q7x.F(oyg0Var3, Integer.valueOf(i3), "KEY_SELECTED_COUNTRY_ID");
                String str14 = qktVar.c;
                q7x.F(oyg0Var3, str14, "KEY_PHONE_CODE");
                q7x.F(oyg0Var3, "", "KEY_PHONE");
                String str15 = qktVar.f;
                q7x.F(oyg0Var3, str15, "KEY_CODE_COUNTRY_IMAGE");
                cm90 cm90Var8 = qktVar.h;
                String str16 = cm90Var8.d;
                q7x.F(oyg0Var3, str16, "KEY_PHONE_MASK");
                int i4 = cm90Var8.c;
                q7x.F(oyg0Var3, Integer.valueOf(i4), "KEY_PHONE_MASK_MAX_LENGTH");
                id4 id4VarA3 = id4.a(i4, "", str16, str14, str15);
                q7x.F(oyg0Var3, Boolean.TRUE, "KEY_COUNTRY_ALLOWED");
                return zf4.a(zf4Var, false, false, false, null, null, id4VarA3, i3, true, null, null, false, false, 32311);
            case 3:
                oyg0 oyg0Var4 = (oyg0) obj;
                zf4 zf4Var2 = (zf4) obj2;
                oyg0Var4.getClass();
                zf4Var2.getClass();
                Object objD2 = q7x.D(oyg0Var4, "", "KEY_PHONE");
                q7x.F(oyg0Var4, objD2, "KEY_PHONE");
                String str17 = (String) objD2;
                if (qktVar == null || (str4 = qktVar.c) == null) {
                    str4 = (String) q7x.D(oyg0Var4, "", "KEY_PHONE_CODE");
                }
                q7x.F(oyg0Var4, str4, "KEY_PHONE_CODE");
                if (qktVar == null || (str5 = qktVar.f) == null) {
                    str5 = (String) q7x.D(oyg0Var4, "", "KEY_CODE_COUNTRY_IMAGE");
                }
                q7x.F(oyg0Var4, str5, "KEY_CODE_COUNTRY_IMAGE");
                if (qktVar == null || (cm90Var4 = qktVar.h) == null || (str6 = cm90Var4.d) == null) {
                    str6 = (String) q7x.D(oyg0Var4, "", "KEY_PHONE_MASK");
                }
                q7x.F(oyg0Var4, str6, "KEY_PHONE_MASK");
                int iIntValue3 = (qktVar == null || (cm90Var3 = qktVar.h) == null) ? ((Number) q7x.D(oyg0Var4, 255, "KEY_PHONE_MASK_MAX_LENGTH")).intValue() : cm90Var3.c;
                q7x.F(oyg0Var4, Integer.valueOf(iIntValue3), "KEY_PHONE_MASK_MAX_LENGTH");
                id4 id4VarA4 = id4.a(iIntValue3, str17, str6, str4, str5);
                int iIntValue4 = qktVar != null ? qktVar.f28902a : ((Number) q7x.D(oyg0Var4, 225, "KEY_SELECTED_COUNTRY_ID")).intValue();
                q7x.F(oyg0Var4, Integer.valueOf(iIntValue4), "KEY_SELECTED_COUNTRY_ID");
                return zf4.a(zf4Var2, false, false, false, null, null, id4VarA4, iIntValue4, false, null, null, false, false, 32575);
            case 4:
                oyg0 oyg0Var5 = (oyg0) obj;
                tj4 tj4Var = (tj4) obj2;
                oyg0Var5.getClass();
                tj4Var.getClass();
                int i5 = qktVar.f28902a;
                q7x.F(oyg0Var5, Integer.valueOf(i5), "KEY_SELECTED_COUNTRY_ID");
                String str18 = qktVar.c;
                q7x.F(oyg0Var5, str18, "KEY_PHONE_CODE");
                q7x.F(oyg0Var5, "", "KEY_PHONE");
                String str19 = qktVar.f;
                q7x.F(oyg0Var5, str19, "KEY_CODE_COUNTRY_IMAGE");
                cm90 cm90Var9 = qktVar.h;
                String str20 = cm90Var9.d;
                q7x.F(oyg0Var5, str20, "KEY_PHONE_MASK");
                int i6 = cm90Var9.c;
                q7x.F(oyg0Var5, Integer.valueOf(i6), "KEY_PHONE_MASK_MAX_LENGTH");
                id4 id4VarA5 = id4.a(i6, "", str20, str18, str19);
                q7x.F(oyg0Var5, Boolean.TRUE, "KEY_COUNTRY_ALLOWED");
                return tj4.a(tj4Var, false, false, false, null, null, id4VarA5, i5, true, null, null, false, 65079);
            default:
                oyg0 oyg0Var6 = (oyg0) obj;
                tj4 tj4Var2 = (tj4) obj2;
                oyg0Var6.getClass();
                tj4Var2.getClass();
                Object objD3 = q7x.D(oyg0Var6, "", "KEY_PHONE");
                q7x.F(oyg0Var6, objD3, "KEY_PHONE");
                String str21 = (String) objD3;
                if (qktVar == null || (str7 = qktVar.c) == null) {
                    str7 = (String) q7x.D(oyg0Var6, "", "KEY_PHONE_CODE");
                }
                q7x.F(oyg0Var6, str7, "KEY_PHONE_CODE");
                if (qktVar == null || (str8 = qktVar.f) == null) {
                    str8 = (String) q7x.D(oyg0Var6, "", "KEY_CODE_COUNTRY_IMAGE");
                }
                q7x.F(oyg0Var6, str8, "KEY_CODE_COUNTRY_IMAGE");
                if (qktVar == null || (cm90Var6 = qktVar.h) == null || (str9 = cm90Var6.d) == null) {
                    str9 = (String) q7x.D(oyg0Var6, "", "KEY_PHONE_MASK");
                }
                q7x.F(oyg0Var6, str9, "KEY_PHONE_MASK");
                int iIntValue5 = (qktVar == null || (cm90Var5 = qktVar.h) == null) ? ((Number) q7x.D(oyg0Var6, 255, "KEY_PHONE_MASK_MAX_LENGTH")).intValue() : cm90Var5.c;
                q7x.F(oyg0Var6, Integer.valueOf(iIntValue5), "KEY_PHONE_MASK_MAX_LENGTH");
                id4 id4VarA6 = id4.a(iIntValue5, str21, str9, str7, str8);
                int iIntValue6 = qktVar != null ? qktVar.f28902a : ((Number) q7x.D(oyg0Var6, 225, "KEY_SELECTED_COUNTRY_ID")).intValue();
                q7x.F(oyg0Var6, Integer.valueOf(iIntValue6), "KEY_SELECTED_COUNTRY_ID");
                return tj4.a(tj4Var2, false, false, false, null, null, id4VarA6, iIntValue6, false, null, null, false, 65343);
        }
    }
}
