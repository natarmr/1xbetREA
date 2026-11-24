package a;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class hk3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us00 f13190a;

    public hk3(us00 us00Var) {
        this.f13190a = us00Var;
    }

    public static String b(String str) {
        return kng0.l("full_update_", str, "_.apk");
    }

    public static String c(String str) {
        return kng0.l("update_", str, "_.apk");
    }

    public final File a(String str) {
        File[] fileArrListFiles;
        str.getClass();
        File file = new File(this.f13190a.getFilesDir(), ".CWAC-Update");
        file.mkdirs();
        String[] list = file.list();
        if (list != null && !tx3.u(c(str), list) && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                file2.delete();
            }
        }
        return new File(file, c(str));
    }
}
