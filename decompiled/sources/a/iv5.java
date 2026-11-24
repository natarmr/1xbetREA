package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class iv5 {
    public static final hv5 Companion = new hv5();
    public static final a8z[] g = {maz.a(wez.f39042a, new o85(13)), null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15429a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final int f;

    public /* synthetic */ iv5(int i, List list, int i2, int i3, String str, String str2, int i4) {
        if (48 != (i & 48)) {
            m2x.I(i, 48, gv5.f11960a.getDescriptor());
            throw null;
        }
        this.f15429a = (i & 1) == 0 ? kotlin.collections.a.c(0) : list;
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = 0;
        } else {
            this.c = i3;
        }
        if ((i & 8) == 0) {
            this.d = "0";
        } else {
            this.d = str;
        }
        this.e = str2;
        this.f = i4;
    }

    public iv5(List list, int i, String str, String str2, int i2) {
        list = (i2 & 1) != 0 ? kotlin.collections.a.c(0) : list;
        i = (i2 & 2) != 0 ? 0 : i;
        list.getClass();
        this.f15429a = list;
        this.b = i;
        this.c = 0;
        this.d = str;
        this.e = str2;
        this.f = 22;
    }
}
