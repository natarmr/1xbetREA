package a;

import a.iiy;
import a.m1r;
import a.njd0;
import a.swp0;
import android.graphics.Typeface;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.authqr.impl.qr.navigation.QrAuthScreenFactoryImpl$qrSendConfirmationSmsScreen$1;
import org.xplatform.core.navigation.dialog.DialogScreen$Companion$invoke$1;
import org.xplatform.picker.api.presentation.PickerDialogParams;

/* JADX INFO: loaded from: classes3.dex */
public final class nh70 implements w6t0, uw90, s2c0 {
    public static Typeface f(String str, psq psqVar, int i) {
        if (i == 0 && Intrinsics.d(psqVar, psq.e) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iK = zgc.K(psqVar, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iK) : Typeface.create(str, iK);
    }

    public static sub0 g(int i) {
        Object next;
        c0o c0oVar = sub0.i;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        do {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
        } while (((sub0) next).f32812a != i);
        sub0 sub0Var = (sub0) next;
        return sub0Var == null ? sub0.DEFAULT : sub0Var;
    }

    public static DialogScreen$Companion$invoke$1 h(PickerDialogParams pickerDialogParams) {
        ep90.c2.getClass();
        return new DialogScreen$Companion$invoke$1(ep90.e2, new ex60(pickerDialogParams, (byte) 10));
    }

    public static sub0 i(Throwable th) {
        if (agc.L(th)) {
            return sub0.CLIENT_ERROR;
        }
        return agc.N(th) ? sub0.SERVER_ERROR : sub0.ERROR;
    }

    public static boolean j(sub0 sub0Var) {
        return !q3d.j(sub0.CLIENT_ERROR, sub0.SERVER_ERROR).contains(sub0Var);
    }

    public static void l(androidx.fragment.app.e eVar) {
        eVar.getClass();
        iz80 iz80Var = new iz80();
        iz80Var.e2.x(iz80Var, iz80.h2[0], "DEV_PASS_REQUEST_KEY");
        iz80.g2.getClass();
        iz80Var.H0(eVar, iz80.i2);
    }

    @Override // a.uw90
    public Typeface b(vjt vjtVar, psq psqVar, int i) {
        String strConcat = vjtVar.f;
        int i2 = psqVar.f27526a / 100;
        if (i2 >= 0 && i2 < 2) {
            strConcat = strConcat.concat("-thin");
        } else if (2 <= i2 && i2 < 4) {
            strConcat = strConcat.concat("-light");
        } else if (i2 != 4) {
            if (i2 == 5) {
                strConcat = strConcat.concat("-medium");
            } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
                strConcat = strConcat.concat("-black");
            }
        }
        Typeface typeface = null;
        if (strConcat.length() != 0) {
            Typeface typefaceF = f(strConcat, psqVar, i);
            if (!Intrinsics.d(typefaceF, Typeface.create(Typeface.DEFAULT, zgc.K(psqVar, i))) && !Intrinsics.d(typefaceF, f(null, psqVar, i))) {
                typeface = typefaceF;
            }
        }
        return typeface == null ? f(vjtVar.f, psqVar, i) : typeface;
    }

    @Override // a.uw90
    public Typeface c(psq psqVar, int i) {
        return f(null, psqVar, i);
    }

    @Override // a.s2c0
    public void d() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // a.s2c0
    public void e(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [org.xplatform.authqr.impl.qr.navigation.QrAuthScreenFactoryImpl$qrSendConfirmationSmsScreen$1] */
    public QrAuthScreenFactoryImpl$qrSendConfirmationSmsScreen$1 k(final swp0 swp0Var, final List list) {
        swp0Var.getClass();
        list.getClass();
        return new FragmentScreen() { // from class: org.xplatform.authqr.impl.qr.navigation.QrAuthScreenFactoryImpl$qrSendConfirmationSmsScreen$1
            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
            public final Fragment a(m1r m1rVar) {
                m1rVar.getClass();
                njd0.S1.getClass();
                swp0 swp0Var2 = swp0Var;
                swp0Var2.getClass();
                List list2 = list;
                list2.getClass();
                njd0 njd0Var = new njd0();
                iiy[] iiyVarArr = njd0.U1;
                njd0Var.Q1.u(njd0Var, iiyVarArr[1], swp0Var2);
                njd0Var.R1.D(njd0Var, iiyVarArr[2], list2);
                return njd0Var;
            }

            @Override // a.m7h0
            /* JADX INFO: renamed from: b */
            public final String getF46460a() {
                return "QrSendConfirmationSmsFragment";
            }

            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
            /* JADX INFO: renamed from: g */
            public final /* bridge */ boolean getB() {
                return true;
            }
        };
    }

    @Override // a.w6t0
    public void a() {
    }

    @Override // a.w6t0
    public void p() {
    }
}
