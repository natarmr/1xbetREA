package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rb4 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30166a;
    public final /* synthetic */ qkt b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ rb4(qkt qktVar, boolean z, byte b) {
        this.f30166a = b;
        this.b = qktVar;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f30166a;
        qkt qktVar = this.b;
        switch (b) {
            case 0:
                oyg0 oyg0Var = (oyg0) obj;
                mb4 mb4Var = (mb4) obj2;
                oyg0Var.getClass();
                mb4Var.getClass();
                int i = qktVar.f28902a;
                q7x.F(oyg0Var, Integer.valueOf(i), "KEY_SELECTED_COUNTRY_ID");
                String str = qktVar.c;
                q7x.F(oyg0Var, str, "KEY_PHONE_CODE");
                q7x.F(oyg0Var, "", "KEY_PHONE");
                String str2 = qktVar.f;
                q7x.F(oyg0Var, str2, "KEY_CODE_COUNTRY_IMAGE");
                cm90 cm90Var = qktVar.h;
                String str3 = cm90Var.d;
                q7x.F(oyg0Var, str3, "KEY_PHONE_MASK");
                int i2 = cm90Var.c;
                q7x.F(oyg0Var, Integer.valueOf(i2), "KEY_PHONE_MASK_MAX_LENGTH");
                id4 id4VarA = id4.a(i2, "", str3, str, str2);
                boolean z = this.c;
                q7x.F(oyg0Var, Boolean.valueOf(z), "KEY_COUNTRY_ALLOWED");
                return mb4.a(mb4Var, false, false, false, null, null, id4VarA, i, z, null, null, false, 15927);
            case 1:
                oyg0 oyg0Var2 = (oyg0) obj;
                zf4 zf4Var = (zf4) obj2;
                oyg0Var2.getClass();
                zf4Var.getClass();
                int i3 = qktVar.f28902a;
                q7x.F(oyg0Var2, Integer.valueOf(i3), "KEY_SELECTED_COUNTRY_ID");
                String str4 = qktVar.c;
                q7x.F(oyg0Var2, str4, "KEY_PHONE_CODE");
                q7x.F(oyg0Var2, "", "KEY_PHONE");
                String str5 = qktVar.f;
                q7x.F(oyg0Var2, str5, "KEY_CODE_COUNTRY_IMAGE");
                cm90 cm90Var2 = qktVar.h;
                String str6 = cm90Var2.d;
                q7x.F(oyg0Var2, str6, "KEY_PHONE_MASK");
                int i4 = cm90Var2.c;
                q7x.F(oyg0Var2, Integer.valueOf(i4), "KEY_PHONE_MASK_MAX_LENGTH");
                id4 id4VarA2 = id4.a(i4, "", str6, str4, str5);
                boolean z2 = this.c;
                q7x.F(oyg0Var2, Boolean.valueOf(z2), "KEY_COUNTRY_ALLOWED");
                return zf4.a(zf4Var, false, false, false, null, null, id4VarA2, i3, z2, null, null, false, false, 32311);
            case 2:
                oyg0 oyg0Var3 = (oyg0) obj;
                tj4 tj4Var = (tj4) obj2;
                oyg0Var3.getClass();
                tj4Var.getClass();
                int i5 = qktVar.f28902a;
                q7x.F(oyg0Var3, Integer.valueOf(i5), "KEY_SELECTED_COUNTRY_ID");
                String str7 = qktVar.c;
                q7x.F(oyg0Var3, str7, "KEY_PHONE_CODE");
                q7x.F(oyg0Var3, "", "KEY_PHONE");
                String str8 = qktVar.f;
                q7x.F(oyg0Var3, str8, "KEY_CODE_COUNTRY_IMAGE");
                cm90 cm90Var3 = qktVar.h;
                String str9 = cm90Var3.d;
                q7x.F(oyg0Var3, str9, "KEY_PHONE_MASK");
                int i6 = cm90Var3.c;
                q7x.F(oyg0Var3, Integer.valueOf(i6), "KEY_PHONE_MASK_MAX_LENGTH");
                id4 id4VarA3 = id4.a(i6, "", str9, str7, str8);
                boolean z3 = this.c;
                q7x.F(oyg0Var3, Boolean.valueOf(z3), "KEY_COUNTRY_ALLOWED");
                return tj4.a(tj4Var, false, false, false, null, null, id4VarA3, i5, z3, null, null, false, 65079);
            default:
                y780 y780Var = (y780) obj2;
                ((oyg0) obj).getClass();
                y780Var.getClass();
                int i7 = qktVar.f28902a;
                StringBuilder sb = new StringBuilder(ujn.h);
                String str10 = qktVar.f;
                str10.getClass();
                if (str10.length() == 0) {
                    sb.setLength(0);
                } else if (StringsKt.O(str10, ujn.h, false) || kotlin.text.c.x(str10, "https://", false)) {
                    sb.setLength(0);
                    sb.append(str10);
                } else {
                    if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                        sb.append('/');
                    }
                    sb.append(StringsKt.y0(str10, '/'));
                }
                String string = sb.toString();
                String str11 = qktVar.c;
                cm90 cm90Var4 = qktVar.h;
                int i8 = cm90Var4.c;
                String str12 = cm90Var4.d;
                return y780.a(y780Var, "", i8, null, null, null, Integer.valueOf(i7), string, str11, str12, str12, this.c, null, false, false, false, false, 258108);
        }
    }
}
