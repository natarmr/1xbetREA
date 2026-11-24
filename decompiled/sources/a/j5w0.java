package a;

import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j5w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h8w0 f15954a = new h8w0("PhoneskyVerificationUtils");

    public static boolean a(Signature[] signatureArr) {
        String strEncodeToString;
        if (signatureArr == null || (signatureArr.length) == 0) {
            Object[] objArr = new Object[0];
            h8w0 h8w0Var = f15954a;
            h8w0Var.getClass();
            if (Log.isLoggable("PlayCore", 5)) {
                Log.w("PlayCore", h8w0.c(h8w0Var.f12650a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
            }
        } else {
            for (Signature signature : signatureArr) {
                byte[] byteArray = signature.toByteArray();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    messageDigest.update(byteArray);
                    strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                } catch (NoSuchAlgorithmException unused) {
                    strEncodeToString = "";
                }
                if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                    return true;
                }
                String str = Build.TAGS;
                if ((str.contains("dev-keys") || str.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                    return true;
                }
            }
        }
        return false;
    }
}
