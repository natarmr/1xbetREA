package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ftf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b4x f10109a;
    public final long b;
    public final long c;
    public final long d;

    public ftf(long j, long j2, List list) {
        this.f10109a = b4x.o(list);
        this.b = j;
        this.c = j2;
        long j3 = -9223372036854775807L;
        if (j != -9223372036854775807L && j2 != -9223372036854775807L) {
            j3 = j + j2;
        }
        this.d = j3;
    }
}
