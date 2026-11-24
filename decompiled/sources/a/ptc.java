package a;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class ptc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us00 f27557a;

    public /* synthetic */ ptc(us00 us00Var) {
        this.f27557a = us00Var;
    }

    public String a(String str) {
        byte[] byteArray;
        try {
            Signature signature = (Signature) tx3.B(c());
            if (signature != null && (byteArray = signature.toByteArray()) != null) {
                byte[] bArrDigest = MessageDigest.getInstance(str).digest(byteArray);
                bArrDigest.getClass();
                return tx3.L(bArrDigest, "", new e6c((byte) 13), 30);
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public PackageInfo b() throws PackageManager.NameNotFoundException {
        int i = Build.VERSION.SDK_INT;
        us00 us00Var = this.f27557a;
        if (i >= 33) {
            PackageInfo packageInfo = us00Var.getPackageManager().getPackageInfo(us00Var.getPackageName(), PackageManager.PackageInfoFlags.of(134217728L));
            packageInfo.getClass();
            return packageInfo;
        }
        PackageInfo packageInfo2 = us00Var.getPackageManager().getPackageInfo(us00Var.getPackageName(), 64);
        packageInfo2.getClass();
        return packageInfo2;
    }

    public Signature[] c() {
        Signature[] apkContentsSigners;
        SigningInfo signingInfo;
        if (Build.VERSION.SDK_INT < 28 || (signingInfo = b().signingInfo) == null || (apkContentsSigners = signingInfo.getApkContentsSigners()) == null) {
            apkContentsSigners = b().signatures;
        }
        return apkContentsSigners == null ? new Signature[0] : apkContentsSigners;
    }
}
