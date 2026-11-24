package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class h31 {
    public static final c31 Companion = new c31();
    public static final a8z[] d = {maz.a(wez.f39042a, new mg0(26)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12363a;
    public final int b;
    public final String c;

    public /* synthetic */ h31(int i, int i2, String str, List list) {
        if ((i & 1) == 0) {
            this.f12363a = null;
        } else {
            this.f12363a = list;
        }
        this.b = (i & 2) == 0 ? 0 : i2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
    }
}
