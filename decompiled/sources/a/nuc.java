package a;

import androidx.media3.common.Timeline$Window;

/* JADX INFO: loaded from: classes.dex */
public final class nuc extends pwq {
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;

    public nuc(bmq0 bmq0Var, long j, long j2) throws ouc {
        super(bmq0Var);
        if (j2 != Long.MIN_VALUE && j2 < j) {
            throw new ouc(2, j, j2);
        }
        boolean z = false;
        if (bmq0Var.h() != 1) {
            throw new ouc(0);
        }
        Timeline$Window timeline$WindowM = bmq0Var.m(0, new Timeline$Window(), 0L);
        long jMax = Math.max(0L, j);
        if (!timeline$WindowM.j && jMax != 0 && !timeline$WindowM.g) {
            throw new ouc(1);
        }
        long jMax2 = j2 == Long.MIN_VALUE ? timeline$WindowM.l : Math.max(0L, j2);
        long j3 = timeline$WindowM.l;
        if (j3 != -9223372036854775807L) {
            jMax2 = jMax2 > j3 ? j3 : jMax2;
            if (jMax > jMax2) {
                jMax = jMax2;
            }
        }
        this.c = jMax;
        this.d = jMax2;
        this.e = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
        if (timeline$WindowM.h && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
            z = true;
        }
        this.f = z;
    }

    @Override // a.pwq, a.bmq0
    public final amq0 f(int i, amq0 amq0Var, boolean z) {
        this.b.f(0, amq0Var, z);
        long j = amq0Var.e - this.c;
        long j2 = this.e;
        long j3 = j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L;
        Object obj = amq0Var.f1123a;
        Object obj2 = amq0Var.b;
        uo uoVar = uo.c;
        amq0Var.h(obj, obj2, 0, j3, j, amq0Var.f);
        return amq0Var;
    }

    @Override // a.pwq, a.bmq0
    public final Timeline$Window m(int i, Timeline$Window timeline$Window, long j) {
        this.b.m(0, timeline$Window, 0L);
        long j2 = timeline$Window.o;
        long j3 = this.c;
        timeline$Window.o = j2 + j3;
        timeline$Window.l = this.e;
        timeline$Window.h = this.f;
        long j4 = timeline$Window.k;
        if (j4 != -9223372036854775807L) {
            long jMax = Math.max(j4, j3);
            timeline$Window.k = jMax;
            long j5 = this.d;
            if (j5 != -9223372036854775807L) {
                jMax = Math.min(jMax, j5);
            }
            timeline$Window.k = jMax - j3;
        }
        long jY = vtt0.Y(j3);
        long j6 = timeline$Window.d;
        if (j6 != -9223372036854775807L) {
            timeline$Window.d = j6 + jY;
        }
        long j7 = timeline$Window.e;
        if (j7 != -9223372036854775807L) {
            timeline$Window.e = j7 + jY;
        }
        return timeline$Window;
    }
}
