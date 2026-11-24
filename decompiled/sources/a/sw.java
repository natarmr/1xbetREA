package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sw implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32895a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ sw(String str, String str2, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f32895a;
        boolean z = this.d;
        switch (b) {
            case 0:
                lw lwVar = (lw) obj2;
                ((oyg0) obj).getClass();
                lwVar.getClass();
                String str = this.b;
                boolean z2 = str.length() == 0;
                int length = StringsKt.u0(str).toString().length();
                boolean z3 = this.d;
                return lw.a(lwVar, false, null, z2, z3, this.c, str, (length <= 0 || lwVar.b.o || z3) ? false : true, 3);
            case 1:
                yx8 yx8Var = (yx8) obj2;
                xx8 xx8Var = yx8Var.c;
                String str2 = xx8Var.f41644a;
                boolean z4 = xx8Var.b;
                String str3 = xx8Var.e;
                str2.getClass();
                String str4 = this.b;
                str4.getClass();
                String str5 = this.c;
                str5.getClass();
                str3.getClass();
                xx8 xx8Var2 = new xx8(str2, str4, str5, z4, str3);
                vx8 vx8VarA = yx8Var.b;
                if (z) {
                    vx8VarA = vx8.a(vx8VarA, false, 3);
                }
                return yx8.a(yx8Var, null, vx8VarA, xx8Var2, false, null, null, null, null, false, 1048569);
            default:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String str6 = this.b;
                    String str7 = this.c;
                    String strL = z ? kng0.l(str6, " - ", str7) : kng0.l(str7, " - ", str6);
                    ((g1t0) fetVar.k(j1t0.e)).getClass();
                    aad.e(strL, o2e.e0(jm40.b, "DATE_TIME_INFO_TEXT"), y9q0.a(g1t0.d(), ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, z ? 1 : 3, 0L, null, null, 16711678), null, 2, false, 1, 0, null, null, fetVar, 1794096, 904);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ sw(String str, boolean z, String str2) {
        this.b = str;
        this.d = z;
        this.c = str2;
    }

    public /* synthetic */ sw(boolean z, String str, String str2) {
        this.d = z;
        this.b = str;
        this.c = str2;
    }
}
