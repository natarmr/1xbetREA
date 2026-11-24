package a;

import android.gov.nist.core.Separators;
import java.util.Arrays;
import kotlin.text.Regex;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$3;

/* JADX INFO: loaded from: classes2.dex */
public final class pl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btt0 f27159a;
    public final knf0 b;
    public final vby c;
    public final zm d;

    public pl1(btt0 btt0Var, knf0 knf0Var, vby vbyVar, gii0 gii0Var) {
        this.f27159a = btt0Var;
        this.b = knf0Var;
        this.c = vbyVar;
        this.d = new zm(gii0Var, (byte) 6);
    }

    public static String a(String str, String str2) {
        if (str.length() == 0) {
            return str;
        }
        if (kotlin.text.c.n(str, Separators.SLASH, false)) {
            str = ttm0.H(1, str);
        }
        boolean z = kotlin.text.c.x(str, "http://", true) || kotlin.text.c.x(str, "https://", true);
        StringBuilder sb = new StringBuilder();
        if (!z) {
            sb.append("https://");
        }
        sb.append(str);
        sb.append("/slots");
        return nsm0.l(sb.toString(), str2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static Object b(pl1 pl1Var, long j, long j2, String str, String str2, int i, boolean z, lu0 lu0Var, zje zjeVar) throws lx50, cii0 {
        nl1 nl1Var;
        Object g0g0Var;
        String str3;
        if (zjeVar instanceof nl1) {
            nl1Var = (nl1) zjeVar;
            int i2 = nl1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nl1Var.l = i2 - Integer.MIN_VALUE;
            } else {
                nl1Var = new nl1(pl1Var, zjeVar);
            }
        } else {
            nl1Var = new nl1(pl1Var, zjeVar);
        }
        Object objC = nl1Var.j;
        wne wneVar = wne.f39444a;
        int i3 = nl1Var.l;
        MediaType mediaTypeA = null;
        if (i3 == 0) {
            z1x.P(objC);
            knf0 knf0Var = pl1Var.b;
            String strC = knf0Var.c();
            String strA = a(str2, strC);
            ta0 ta0Var = (ta0) pl1Var.d.invoke();
            try {
                e0g0 e0g0Var = j0g0.b;
                g0g0Var = pl1Var.f27159a.a();
            } catch (Throwable th) {
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
            if (g0g0Var instanceof g0g0) {
                g0g0Var = "";
            }
            String str4 = (String) g0g0Var;
            int i4 = RequestBody.f46110a;
            vby vbyVar = pl1Var.c;
            String strA2 = knf0Var.a();
            String str5 = String.format("%s/", Arrays.copyOf(new Object[]{str}, 1));
            Integer numValueOf = Integer.valueOf(i);
            if (i < 0) {
                numValueOf = null;
            }
            String strD = vbyVar.d(yv0.Companion.serializer(), new yv0(j, strC, strA, strA2, j2, str5, z, new Integer(numValueOf != null ? numValueOf.intValue() : 0), lu0Var != null ? jiq0.w0(lu0Var) : null));
            Regex regex = MediaType.e;
            try {
                mediaTypeA = MediaType.Companion.a("application/json; charset=utf-8");
            } catch (IllegalArgumentException unused) {
            }
            RequestBody$Companion$toRequestBody$3 requestBody$Companion$toRequestBody$3A = RequestBody.Companion.a(strD, mediaTypeA);
            nl1Var.i = strA;
            nl1Var.l = 1;
            objC = ta0Var.c(str4, requestBody$Companion$toRequestBody$3A, nl1Var);
            if (objC == wneVar) {
                return wneVar;
            }
            str3 = strA;
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str3 = nl1Var.i;
            z1x.P(objC);
        }
        e02 e02Var = (e02) objC;
        e02Var.a();
        return ju70.U(e02Var, str3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static Object c(pl1 pl1Var, long j, String str, String str2, int i, boolean z, lu0 lu0Var, zje zjeVar) throws lx50, cii0 {
        ol1 ol1Var;
        String str3;
        if (zjeVar instanceof ol1) {
            ol1Var = (ol1) zjeVar;
            int i2 = ol1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ol1Var.l = i2 - Integer.MIN_VALUE;
            } else {
                ol1Var = new ol1(pl1Var, zjeVar);
            }
        } else {
            ol1Var = new ol1(pl1Var, zjeVar);
        }
        Object objB = ol1Var.j;
        wne wneVar = wne.f39444a;
        int i3 = ol1Var.l;
        MediaType mediaTypeA = null;
        if (i3 == 0) {
            z1x.P(objB);
            String strC = pl1Var.b.c();
            String strA = a(str2, strC);
            ta0 ta0Var = (ta0) pl1Var.d.invoke();
            int i4 = RequestBody.f46110a;
            vby vbyVar = pl1Var.c;
            String str4 = String.format("%s/", Arrays.copyOf(new Object[]{str}, 1));
            Integer numValueOf = Integer.valueOf(i);
            if (i < 0) {
                numValueOf = null;
            }
            String strD = vbyVar.d(vv0.Companion.serializer(), new vv0(z, str4, j, strC, strA, new Integer(numValueOf != null ? numValueOf.intValue() : 0), lu0Var != null ? jiq0.w0(lu0Var) : null));
            Regex regex = MediaType.e;
            try {
                mediaTypeA = MediaType.Companion.a("application/json; charset=utf-8");
            } catch (IllegalArgumentException unused) {
            }
            RequestBody$Companion$toRequestBody$3 requestBody$Companion$toRequestBody$3A = RequestBody.Companion.a(strD, mediaTypeA);
            ol1Var.i = strA;
            ol1Var.l = 1;
            objB = ta0Var.b(requestBody$Companion$toRequestBody$3A, ol1Var);
            if (objB == wneVar) {
                return wneVar;
            }
            str3 = strA;
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str3 = ol1Var.i;
            z1x.P(objB);
        }
        e02 e02Var = (e02) objB;
        e02Var.a();
        return ju70.U(e02Var, str3);
    }
}
