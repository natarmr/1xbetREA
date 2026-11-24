package a;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class c0q extends zzp {
    public boolean b;
    public File[] c;
    public int d;
    public final /* synthetic */ d0q e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0q(d0q d0qVar, File file) {
        super(file);
        file.getClass();
        this.e = d0qVar;
    }

    @Override // a.e0q
    public final File a() {
        Function2 function2;
        f0q f0qVar = this.e.d;
        boolean z = this.b;
        File file = this.f7000a;
        if (z) {
            File[] fileArr = this.c;
            if (fileArr == null || this.d < fileArr.length) {
                if (fileArr == null) {
                    File[] fileArrListFiles = file.listFiles();
                    this.c = fileArrListFiles;
                    if (fileArrListFiles == null && (function2 = f0qVar.e) != null) {
                        File file2 = this.f7000a;
                        function2.invoke(file2, new l6(file2, null, "Cannot list files in a directory", 2, null));
                    }
                    fileArr = this.c;
                    if (fileArr == null || fileArr.length == 0) {
                        Function1 function1 = f0qVar.d;
                        if (function1 != null) {
                            function1.invoke(file);
                        }
                    }
                }
                fileArr.getClass();
                int i = this.d;
                this.d = i + 1;
                return fileArr[i];
            }
            Function1 function3 = f0qVar.d;
            if (function3 != null) {
                function3.invoke(file);
                return null;
            }
        } else {
            Function1 function4 = f0qVar.c;
            if (function4 == null || ((Boolean) function4.invoke(file)).booleanValue()) {
                this.b = true;
                return file;
            }
        }
        return null;
    }
}
