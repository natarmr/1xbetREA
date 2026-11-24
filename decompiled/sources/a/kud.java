package a;

import android.content.res.TypedArray;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.calendar.impl.presentation.container.champinfo.CyberCalendarChampInfoParams;
import org.xplatform.ui_core.calendar.model.DateCalendarBottomSheetParams;

/* JADX INFO: loaded from: classes2.dex */
public final class kud implements kotlin.coroutines.f {
    public static zvj b(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new zvj(httpURLConnection);
    }

    public static i5i c(TypedArray typedArray) {
        typedArray.getClass();
        i5i i5iVar = i5i.BASIC;
        int i = typedArray.getInt(36, 0);
        if (i == 0) {
            return i5iVar;
        }
        i5i i5iVar2 = i5i.FILLED;
        if (i == 4) {
            return i5iVar2;
        }
        jf4.o(twn.m(i, "Unknown style value: "));
        return null;
    }

    public static frj d(String str) {
        Object next;
        c0o c0oVar = frj.e;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        do {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
        } while (!((frj) next).f10021a.equalsIgnoreCase(str));
        frj frjVar = (frj) next;
        return frjVar == null ? frj.Unknown : frjVar;
    }

    public static szj e(tft0 tft0Var, boolean z) {
        boolean zE;
        tft0Var.getClass();
        if (tft0Var instanceof szj) {
            return (szj) tft0Var;
        }
        tft0Var.S();
        if ((tft0Var.S().n() instanceof hzs0) || (tft0Var instanceof yl50)) {
            foc focVarN = tft0Var.S().n();
            izs0 izs0Var = focVarN instanceof izs0 ? (izs0) focVarN : null;
            zE = true;
            if (izs0Var == null || izs0Var.m) {
                zE = (z && (tft0Var.S().n() instanceof hzs0)) ? e0t0.e(tft0Var) : true ^ uc9.X(gqw0.C1.L0(), thb.P(tft0Var), fys0.b);
            }
        } else {
            zE = false;
        }
        if (!zE) {
            return null;
        }
        if (tft0Var instanceof kkq) {
            kkq kkqVar = (kkq) tft0Var;
            Intrinsics.d(kkqVar.b.S(), kkqVar.c.S());
        }
        return new szj(thb.P(tft0Var).k0(false), z);
    }

    public static v4g f(CyberCalendarChampInfoParams cyberCalendarChampInfoParams, boolean z) {
        v4g v4gVar = new v4g();
        iiy[] iiyVarArr = v4g.m2;
        v4gVar.j2.J(v4gVar, iiyVarArr[1], cyberCalendarChampInfoParams);
        v4gVar.k2.u(v4gVar, iiyVarArr[2], Boolean.valueOf(z));
        return v4gVar;
    }

    public static void g(DateCalendarBottomSheetParams dateCalendarBottomSheetParams, androidx.fragment.app.e eVar, String str) {
        eVar.getClass();
        String str2 = vcj.o2;
        if (eVar.J(str2) != null) {
            return;
        }
        vcj vcjVar = new vcj();
        iiy[] iiyVarArr = vcj.n2;
        vcjVar.k2.J(vcjVar, iiyVarArr[0], dateCalendarBottomSheetParams);
        vcjVar.l2.x(vcjVar, iiyVarArr[1], str);
        vcjVar.H0(eVar, str2);
    }

    public xex a() {
        return new xex(new nwd(), new jtv());
    }
}
