package a;

import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class bys {
    public static final ays Companion = new ays();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3434a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;

    public /* synthetic */ bys(int i, int i2, String str, String str2, String str3, String str4) {
        if (31 != (i & 31)) {
            m2x.I(i, 31, zxs.f45176a.getDescriptor());
            throw null;
        }
        this.f3434a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i2;
    }

    public bys(String str, String str2, String str3) {
        String str4 = Build.VERSION.RELEASE;
        str4.getClass();
        str2.getClass();
        this.f3434a = str;
        this.b = str4;
        this.c = str2;
        this.d = str3;
        this.e = 1;
    }
}
