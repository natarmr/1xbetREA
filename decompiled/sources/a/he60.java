package a;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class he60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iox f12906a;
    public final int[] b;
    public final String[] c;
    public final Set d;

    public he60(iox ioxVar, int[] iArr, String[] strArr) {
        ioxVar.getClass();
        iArr.getClass();
        strArr.getClass();
        this.f12906a = ioxVar;
        this.b = iArr;
        this.c = strArr;
        if (iArr.length == strArr.length) {
            this.d = !(strArr.length == 0) ? cui0.b(strArr[0]) : xun.f41520a;
        } else {
            jf4.n("Check failed.");
            throw null;
        }
    }
}
