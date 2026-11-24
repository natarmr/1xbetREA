package a;

import java.io.File;
import kotlin.io.FileWalkDirection;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public class k0q extends j0q {
    public static void d(File file) {
        d0q d0qVar = new d0q(new f0q(file, FileWalkDirection.b, null, null, null, 0, 32, null));
        while (true) {
            boolean z = true;
            while (d0qVar.hasNext()) {
                File file2 = (File) d0qVar.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
            return;
        }
    }

    public static String e(File file) {
        file.getClass();
        String name = file.getName();
        name.getClass();
        return StringsKt.o0('.', name, "");
    }
}
