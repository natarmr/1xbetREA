package a;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class a0q extends zzp {
    public boolean b;
    public File[] c;
    public int d;
    public boolean e;
    public final /* synthetic */ d0q f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0q(d0q d0qVar, File file) {
        super(file);
        file.getClass();
        this.f = d0qVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0057  */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    @Override // a.e0q
    public final File a() {
        File[] fileArr;
        Function1 function1;
        f0q f0qVar = this.f.d;
        boolean z = this.e;
        File file = this.f7000a;
        if (z || this.c != null) {
            fileArr = this.c;
            if (fileArr == null && this.d < fileArr.length) {
                fileArr.getClass();
                int i = this.d;
                this.d = i + 1;
                return fileArr[i];
            }
            if (!this.b) {
                this.b = true;
                return file;
            }
            function1 = f0qVar.d;
            if (function1 != null) {
                function1.invoke(file);
            }
        } else {
            Function1 function2 = f0qVar.c;
            if (function2 == null || ((Boolean) function2.invoke(file)).booleanValue()) {
                File[] fileArrListFiles = file.listFiles();
                this.c = fileArrListFiles;
                if (fileArrListFiles == null) {
                    Function2 function3 = f0qVar.e;
                    if (function3 != null) {
                        File file2 = this.f7000a;
                        function3.invoke(file2, new l6(file2, null, "Cannot list files in a directory", 2, null));
                    }
                    this.e = true;
                }
                fileArr = this.c;
                if (fileArr == null) {
                }
                if (!this.b) {
                    this.b = true;
                    return file;
                }
                function1 = f0qVar.d;
                if (function1 != null) {
                    function1.invoke(file);
                }
            }
        }
        return null;
    }
}
