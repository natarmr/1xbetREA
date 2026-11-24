package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class fro {
    public static final ero Companion = new ero();
    public static final a8z[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10028a;
    public final long b;
    public final int c;
    public final List d;
    public final List e;

    static {
        wez wezVar = wez.f39042a;
        f = new a8z[]{null, null, null, maz.a(wezVar, new ago((byte) 20)), maz.a(wezVar, new ago((byte) 21))};
    }

    public /* synthetic */ fro(int i, long j, long j2, int i2, List list, List list2) {
        if (31 != (i & 31)) {
            m2x.I(i, 31, dro.f6571a.getDescriptor());
            throw null;
        }
        this.f10028a = j;
        this.b = j2;
        this.c = i2;
        this.d = list;
        this.e = list2;
    }

    public fro(long j, long j2, int i, ArrayList arrayList, ArrayList arrayList2) {
        this.f10028a = j;
        this.b = j2;
        this.c = i;
        this.d = arrayList;
        this.e = arrayList2;
    }
}
