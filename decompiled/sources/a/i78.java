package a;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i78 {
    static {
        Uri.parse("content://com.huawei.hwid");
    }

    public static FileInputStream a(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.createDeviceProtectedStorageContext().getFilesDir());
        String str = File.separator;
        if (!new File(axq.n(new StringBuilder(axq.n(sb, str, "aegis")), str, "hmsrootcas.bks")).exists()) {
            return null;
        }
        ibm0.j("BksUtil", "getFilesBksIS ");
        try {
            return new FileInputStream((context.createDeviceProtectedStorageContext().getFilesDir() + str + "aegis") + str + "hmsrootcas.bks");
        } catch (FileNotFoundException unused) {
            ibm0.g("BksUtil", "FileNotFoundExceptio: ");
            return null;
        }
    }
}
