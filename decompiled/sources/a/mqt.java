package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class mqt {
    public static final lqt Companion = new lqt();
    public static final a8z[] h = {null, null, null, maz.a(wez.f39042a, new tet(17)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22240a;
    public final int b;
    public final Long c;
    public final List d;
    public final long e;
    public final long f;
    public final int g;

    public /* synthetic */ mqt(int i, String str, int i2, Long l, List list, long j, long j2, int i3) {
        if (127 != (i & 127)) {
            m2x.I(i, 127, kqt.f18736a.getDescriptor());
            throw null;
        }
        this.f22240a = str;
        this.b = i2;
        this.c = l;
        this.d = list;
        this.e = j;
        this.f = j2;
        this.g = i3;
    }

    public mqt(String str, int i, Long l, List list, long j, long j2) {
        list.getClass();
        this.f22240a = str;
        this.b = i;
        this.c = l;
        this.d = list;
        this.e = j;
        this.f = j2;
        this.g = 2;
    }
}
