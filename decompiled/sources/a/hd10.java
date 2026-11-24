package a;

import android.gov.nist.core.Separators;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$3;

/* JADX INFO: loaded from: classes2.dex */
public final class hd10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btt0 f12848a;
    public final knf0 b;
    public final vby c;
    public final tpv d;

    public hd10(btt0 btt0Var, knf0 knf0Var, vby vbyVar, gii0 gii0Var) {
        btt0Var.getClass();
        knf0Var.getClass();
        vbyVar.getClass();
        gii0Var.getClass();
        this.f12848a = btt0Var;
        this.b = knf0Var;
        this.c = vbyVar;
        this.d = new tpv(gii0Var, (byte) 16);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(long j, String str, String str2, lu0 lu0Var, zje zjeVar) throws bii0 {
        gd10 gd10Var;
        Object g0g0Var;
        MediaType mediaTypeA;
        String strH = str2;
        if (zjeVar instanceof gd10) {
            gd10Var = (gd10) zjeVar;
            int i = gd10Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                gd10Var.k = i - Integer.MIN_VALUE;
            } else {
                gd10Var = new gd10(this, zjeVar);
            }
        } else {
            gd10Var = new gd10(this, zjeVar);
        }
        Object objA = gd10Var.i;
        wne wneVar = wne.f39444a;
        int i2 = gd10Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            if (StringsKt.O(strH, "https://", false)) {
                strH = StringsKt.d0("https://", strH);
            }
            if (Intrinsics.d(String.valueOf(ttm0.J(strH)), Separators.SLASH)) {
                strH = ttm0.H(1, strH);
            }
            String strL = kng0.l("https://", strH, "/slots");
            knf0 knf0Var = this.b;
            String strC = knf0Var.c();
            jc10 jc10Var = (jc10) this.d.invoke();
            try {
                e0g0 e0g0Var = j0g0.b;
                g0g0Var = this.f12848a.a();
            } catch (Throwable th) {
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
            if (g0g0Var instanceof g0g0) {
                g0g0Var = "";
            }
            String str3 = (String) g0g0Var;
            int i3 = RequestBody.f46110a;
            ld10 ld10Var = new ld10(strC, nsm0.l(strL, strC), knf0Var.a(), j, String.format("%s/", Arrays.copyOf(new Object[]{str}, 1)), new Integer(0), jiq0.w0(lu0Var));
            vby vbyVar = this.c;
            vbyVar.getClass();
            String strD = vbyVar.d(ld10.Companion.serializer(), ld10Var);
            Regex regex = MediaType.e;
            try {
                mediaTypeA = MediaType.Companion.a("application/json; charset=utf-8");
            } catch (IllegalArgumentException unused) {
                mediaTypeA = null;
            }
            RequestBody$Companion$toRequestBody$3 requestBody$Companion$toRequestBody$3A = RequestBody.Companion.a(strD, mediaTypeA);
            gd10Var.k = 1;
            objA = jc10Var.a(str3, requestBody$Companion$toRequestBody$3A, gd10Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        od10 od10Var = (od10) objA;
        od10Var.getClass();
        Integer num = od10Var.d;
        if (num != null && num.intValue() > 0) {
            String str4 = od10Var.e;
            throw new bii0(str4 != null ? str4 : "");
        }
        String str5 = od10Var.b;
        if (str5 != null) {
            String str6 = od10Var.c;
            return new ed10(str5, str6 != null ? str6 : "");
        }
        jf4.k(null);
        return null;
    }
}
