package a;

import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zhl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44398a;
    public final vn30 b;
    public final CopyOnWriteArrayList c;

    public /* synthetic */ zhl(CopyOnWriteArrayList copyOnWriteArrayList, int i, vn30 vn30Var) {
        this.c = copyOnWriteArrayList;
        this.f44398a = i;
        this.b = vn30Var;
    }

    public void a(rbe rbeVar) {
        for (ao30 ao30Var : this.c) {
            vtt0.Q(ao30Var.f1182a, new llo(rbeVar, ao30Var.b, (byte) 24));
        }
    }

    public void b(wn00 wn00Var, int i, int i2, androidx.media3.common.b bVar, int i3, Object obj, long j, long j2) {
        a(new yn30(this, wn00Var, new in30(i, i2, bVar, i3, obj, vtt0.Y(j), vtt0.Y(j2)), (byte) 1));
    }

    public void c(wn00 wn00Var, int i, int i2, androidx.media3.common.b bVar, int i3, Object obj, long j, long j2) {
        a(new yn30(this, wn00Var, new in30(i, i2, bVar, i3, obj, vtt0.Y(j), vtt0.Y(j2)), (byte) 0));
    }

    public void d(wn00 wn00Var, int i, int i2, androidx.media3.common.b bVar, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        a(new zn30(this, wn00Var, new in30(i, i2, bVar, i3, obj, vtt0.Y(j), vtt0.Y(j2)), iOException, z));
    }

    public void e(wn00 wn00Var, int i, IOException iOException, boolean z) {
        d(wn00Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
    }

    public void f(wn00 wn00Var, int i, int i2, androidx.media3.common.b bVar, int i3, Object obj, long j, long j2, int i4) {
        a(new xn30(this, wn00Var, new in30(i, i2, bVar, i3, obj, vtt0.Y(j), vtt0.Y(j2)), i4));
    }
}
