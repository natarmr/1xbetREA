package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class d2w0 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f5377a;

    /* JADX WARN: Illegal instructions before constructor call */
    public d2w0(String[] strArr) {
        String string = Arrays.toString(strArr);
        string.getClass();
        super(string);
        this.f5377a = strArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !d2w0.class.equals(obj.getClass())) {
            return false;
        }
        return Arrays.equals(this.f5377a, ((d2w0) obj).f5377a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5377a);
    }

    public d2w0(String str) {
        this(new String[]{str});
    }
}
