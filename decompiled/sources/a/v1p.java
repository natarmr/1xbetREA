package a;

import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class v1p {
    public static final u1p Companion = new u1p();
    public static final a8z[] g = {null, null, null, null, null, maz.a(wez.f39042a, new ago(27))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36644a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final List f;

    public /* synthetic */ v1p(int i, String str, String str2, int i2, int i3, long j, List list) {
        if (63 != (i & 63)) {
            m2x.I(i, 63, t1p.f33177a.getDescriptor());
            throw null;
        }
        this.f36644a = str;
        this.b = str2;
        this.c = i2;
        this.d = i3;
        this.e = j;
        this.f = list;
    }

    public v1p(String str, int i, int i2, long j, ArrayList arrayList) {
        String str2 = Build.VERSION.RELEASE;
        str2.getClass();
        this.f36644a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = arrayList;
    }
}
