package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class mro {
    public static final zqo Companion = new zqo();
    public static final a8z[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22283a;
    public final int b;
    public final List c;
    public final List d;

    static {
        wez wezVar = wez.f39042a;
        e = new a8z[]{null, null, maz.a(wezVar, new ago((byte) 18)), maz.a(wezVar, new ago((byte) 19))};
    }

    public /* synthetic */ mro(int i, String str, int i2, List list, List list2) {
        if (15 != (i & 15)) {
            m2x.I(i, 15, yqo.f43084a.getDescriptor());
            throw null;
        }
        this.f22283a = str;
        this.b = i2;
        this.c = list;
        this.d = list2;
    }

    public mro(String str, List list, List list2) {
        this.f22283a = str;
        this.b = 1;
        this.c = list;
        this.d = list2;
    }
}
