package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class qpr0 {
    public static final ppr0 Companion = new ppr0();
    public static final a8z[] f = {null, null, null, maz.a(wez.f39042a, new dfr0(27)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29134a;
    public final int b;
    public final long c;
    public final List d;
    public final double e;

    public /* synthetic */ qpr0(int i, long j, int i2, long j2, List list, double d) {
        if (31 != (i & 31)) {
            m2x.I(i, 31, opr0.f25657a.getDescriptor());
            throw null;
        }
        this.f29134a = j;
        this.b = i2;
        this.c = j2;
        this.d = list;
        this.e = d;
    }

    public qpr0(long j, int i, long j2, ArrayList arrayList, double d) {
        this.f29134a = j;
        this.b = i;
        this.c = j2;
        this.d = arrayList;
        this.e = d;
    }
}
