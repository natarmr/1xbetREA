package a;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.gov.nist.core.Separators;
import android.os.Build;
import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class wpt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z220 f39557a;

    public /* synthetic */ wpt(z220 z220Var) {
        this.f39557a = z220Var;
    }

    public String a() {
        Signature[] apkContentsSigners;
        String strSubstring;
        us00 us00Var = ((esh0) this.f39557a.b).f8328a;
        String packageName = us00Var.getPackageName();
        PackageManager packageManager = us00Var.getPackageManager();
        String str = null;
        if (Build.VERSION.SDK_INT >= 28) {
            SigningInfo signingInfo = packageManager.getPackageInfo(packageName, 134217728).signingInfo;
            apkContentsSigners = signingInfo != null ? signingInfo.getApkContentsSigners() : null;
        } else {
            apkContentsSigners = packageManager.getPackageInfo(packageName, 64).signatures;
        }
        if (apkContentsSigners != null) {
            for (Signature signature : apkContentsSigners) {
                packageName.getClass();
                String charsString = signature.toCharsString();
                charsString.getClass();
                String strL = kng0.l(packageName, Separators.SP, charsString);
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    Charset charset = StandardCharsets.UTF_8;
                    charset.getClass();
                    byte[] bytes = strL.getBytes(charset);
                    bytes.getClass();
                    messageDigest.update(bytes);
                    String strEncodeToString = Base64.encodeToString(Arrays.copyOfRange(messageDigest.digest(), 0, 9), 3);
                    strEncodeToString.getClass();
                    strSubstring = strEncodeToString.substring(0, 11);
                } catch (NoSuchAlgorithmException e) {
                    e.printStackTrace();
                    strSubstring = null;
                }
                if (strSubstring != null) {
                    str = strSubstring;
                    break;
                }
            }
        }
        return str == null ? "" : str;
    }
}
