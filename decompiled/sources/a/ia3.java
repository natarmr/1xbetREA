package a;

import android.app.Application;
import android.app.Notification;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Typeface;
import android.graphics.drawable.Icon;
import android.hardware.biometrics.BiometricPrompt;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.PrecomputedText;
import android.text.style.TypefaceSpan;
import android.view.DisplayCutout;
import android.view.ViewConfiguration;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.security.Signature;
import java.util.List;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public abstract class ia3 {
    public static int A(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri B(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static boolean C(Handler handler, i4a i4aVar, long j) {
        return handler.postDelayed(i4aVar, "retry_token", j);
    }

    public static void D(int i, TextView textView) {
        textView.setFirstBaselineToTopHeight(i);
    }

    public static void E(Notification.Action.Builder builder) {
        builder.setSemanticAction(0);
    }

    public static boolean F(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    public static Typeface a(Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }

    public static BiometricPrompt.CryptoObject b(Signature signature) {
        return new BiometricPrompt.CryptoObject(signature);
    }

    public static BiometricPrompt.CryptoObject c(Cipher cipher) {
        return new BiometricPrompt.CryptoObject(cipher);
    }

    public static BiometricPrompt.CryptoObject d(Mac mac) {
        return new BiometricPrompt.CryptoObject(mac);
    }

    public static Handler e(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler f(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static TextClassifier g(Context context, r4i0 r4i0Var) {
        String str;
        TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
        int iOrdinal = r4i0Var.ordinal();
        if (iOrdinal == 0) {
            str = "edittext";
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return null;
            }
            str = "textview";
        }
        return textClassificationManager.createTextClassificationSession(new TextClassificationContext.Builder(context.getPackageName(), str).build());
    }

    public static TypefaceSpan h(Typeface typeface) {
        return new TypefaceSpan(typeface);
    }

    public static List i(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    public static Cipher j(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getCipher();
    }

    public static BiometricPrompt.CryptoObject k(BiometricPrompt.AuthenticationResult authenticationResult) {
        return authenticationResult.getCryptoObject();
    }

    public static String[] l(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static long m(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static Mac n(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getMac();
    }

    public static Executor o(Context context) {
        return context.getMainExecutor();
    }

    public static void p(JobParameters jobParameters) {
        jobParameters.getNetwork();
    }

    public static String q() {
        String processName = Application.getProcessName();
        processName.getClass();
        return processName;
    }

    public static int r(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String s(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int t(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int u(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int v(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int w(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int x(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static Signature y(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getSignature();
    }

    public static PrecomputedText.Params z(AppCompatTextView appCompatTextView) {
        return appCompatTextView.getTextMetricsParams();
    }
}
