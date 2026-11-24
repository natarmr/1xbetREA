package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class kvq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eio f18967a;
    public final int b;
    public final int c;
    public final Function0 d;

    public kvq0(eio eioVar, long j, long j2) {
        w7f w7fVar = w7f.w;
        this.f18967a = eioVar;
        this.b = (int) j;
        this.c = (int) j2;
        this.d = w7fVar;
    }

    public final void a(String str) {
        str.getClass();
        eio eioVar = this.f18967a;
        long jLongValue = ((Number) this.d.invoke()).longValue();
        synchronized (eioVar) {
            eioVar.c().edit().putLong(str, jLongValue).putInt("count#".concat(str), eioVar.c().getInt("count#".concat(str), -1) + 1).apply();
        }
    }

    public final void b(String str) {
        str.getClass();
        eio eioVar = this.f18967a;
        if (eioVar.c().contains(str)) {
            eioVar.c().edit().remove(str).remove("count#".concat(str)).apply();
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0014  */
    public final boolean c(String str) {
        long j;
        int i;
        long j2;
        str.getClass();
        if (this.f18967a.c().contains(str)) {
            eio eioVar = this.f18967a;
            synchronized (eioVar) {
                j = eioVar.c().getLong(str, Long.MAX_VALUE);
                i = eioVar.c().getInt("count#".concat(str), 0);
            }
            long jLongValue = ((Number) this.d.invoke()).longValue() - j;
            long j3 = this.b;
            for (int i2 = 0; i2 < i; i2++) {
                j3 = (long) (j3 * 1.5f);
            }
            long jMin = Math.min(j3, this.c);
            if (jLongValue >= 0 && jLongValue < jMin) {
                j2 = jMin - jLongValue;
            } else {
                j2 = 0;
            }
        } else {
            j2 = 0;
        }
        return j2 > 0;
    }
}
