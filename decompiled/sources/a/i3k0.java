package a;

import android.net.Uri;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline$Window;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i3k0 extends bmq0 {
    public static final Object o = new Object();
    public final long b;
    public final long c;
    public final long d = -9223372036854775807L;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final Object l;
    public final MediaItem m;
    public final dn30 n;

    static {
        mtc mtcVar = new mtc();
        new xuz((byte) 15);
        List list = Collections.EMPTY_LIST;
        v3x v3xVar = b4x.b;
        rcf0 rcf0Var = rcf0.e;
        cn30 cn30Var = new cn30();
        fn30 fn30Var = fn30.f9813a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new en30(uri, null, null, list, rcf0Var, -9223372036854775807L);
        }
        new bn30(mtcVar);
        new dn30(cn30Var);
        jn30 jn30Var = jn30.C;
    }

    public i3k0(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, gst gstVar, MediaItem mediaItem, dn30 dn30Var) {
        this.b = j;
        this.c = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = j6;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = gstVar;
        mediaItem.getClass();
        this.m = mediaItem;
        this.n = dn30Var;
    }

    @Override // a.bmq0
    public final int b(Object obj) {
        return o != obj ? -1 : 0;
    }

    @Override // a.bmq0
    public final amq0 f(int i, amq0 amq0Var, boolean z) {
        x0x.D(i, 1);
        Object obj = z ? o : null;
        long j = -this.g;
        uo uoVar = uo.c;
        amq0Var.h(null, obj, 0, this.e, j, false);
        return amq0Var;
    }

    @Override // a.bmq0
    public final int h() {
        return 1;
    }

    @Override // a.bmq0
    public final Object l(int i) {
        x0x.D(i, 1);
        return o;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c A[PHI: r1
  0x002c: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v5 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // a.bmq0
    public final Timeline$Window m(int i, Timeline$Window timeline$Window, long j) {
        long j2;
        x0x.D(i, 1);
        long j3 = this.h;
        boolean z = this.j;
        if (!z || this.k || j == 0) {
            j2 = j3;
        } else {
            long j4 = this.f;
            if (j4 != -9223372036854775807L) {
                j3 += j;
                if (j3 <= j4) {
                    j2 = j3;
                }
            }
            j2 = -9223372036854775807L;
        }
        Object obj = Timeline$Window.p;
        timeline$Window.b(this.m, this.l, this.b, this.c, this.d, this.i, z, this.n, j2, this.f, this.g);
        return timeline$Window;
    }

    @Override // a.bmq0
    public final int o() {
        return 1;
    }
}
