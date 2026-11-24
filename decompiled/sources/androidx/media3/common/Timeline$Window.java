package androidx.media3.common;

import a.b4x;
import a.bn30;
import a.cn30;
import a.dn30;
import a.en30;
import a.fn30;
import a.hne;
import a.jn30;
import a.mtc;
import a.rcf0;
import a.v3x;
import a.vtt0;
import a.xuz;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class Timeline$Window {
    public static final Object p = new Object();
    public static final MediaItem q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f45385a = p;
    public MediaItem b = q;
    public Object c;
    public long d;
    public long e;
    public long f;
    public boolean g;
    public boolean h;
    public dn30 i;
    public boolean j;
    public long k;
    public long l;
    public int m;
    public int n;
    public long o;

    static {
        mtc mtcVar = new mtc();
        new xuz((byte) 15);
        List list = Collections.EMPTY_LIST;
        v3x v3xVar = b4x.b;
        rcf0 rcf0Var = rcf0.e;
        cn30 cn30Var = new cn30();
        fn30 fn30Var = fn30.f9813a;
        Uri uri = Uri.EMPTY;
        q = new MediaItem("androidx.media3.common.Timeline", new bn30(mtcVar), uri != null ? new en30(uri, null, null, list, rcf0Var, -9223372036854775807L) : null, new dn30(cn30Var), jn30.C, fn30Var);
        hne.s(1, 2, 3, 4, 5);
        hne.s(6, 7, 8, 9, 10);
        vtt0.H(11);
        vtt0.H(12);
        vtt0.H(13);
        vtt0.H(14);
    }

    public final boolean a() {
        return this.i != null;
    }

    public final void b(MediaItem mediaItem, Object obj, long j, long j2, long j3, boolean z, boolean z2, dn30 dn30Var, long j4, long j5, long j6) {
        this.f45385a = p;
        this.b = mediaItem != null ? mediaItem : q;
        if (mediaItem != null) {
            en30 en30Var = mediaItem.b;
        }
        this.c = obj;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = z;
        this.h = z2;
        this.i = dn30Var;
        this.k = j4;
        this.l = j5;
        this.m = 0;
        this.n = 0;
        this.o = j6;
        this.j = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Timeline$Window.class.equals(obj.getClass())) {
            return false;
        }
        Timeline$Window timeline$Window = (Timeline$Window) obj;
        return Objects.equals(this.f45385a, timeline$Window.f45385a) && Objects.equals(this.b, timeline$Window.b) && Objects.equals(this.c, timeline$Window.c) && Objects.equals(this.i, timeline$Window.i) && this.d == timeline$Window.d && this.e == timeline$Window.e && this.f == timeline$Window.f && this.g == timeline$Window.g && this.h == timeline$Window.h && this.j == timeline$Window.j && this.k == timeline$Window.k && this.l == timeline$Window.l && this.m == timeline$Window.m && this.n == timeline$Window.n && this.o == timeline$Window.o;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + ((this.f45385a.hashCode() + 217) * 31)) * 31;
        Object obj = this.c;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        dn30 dn30Var = this.i;
        int iHashCode3 = (iHashCode2 + (dn30Var != null ? dn30Var.hashCode() : 0)) * 31;
        long j = this.d;
        int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.e;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31;
        long j4 = this.k;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.l;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.m) * 31) + this.n) * 31;
        long j6 = this.o;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
