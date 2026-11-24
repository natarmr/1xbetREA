package a;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public abstract class u8b implements efn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f35224a = new ArrayDeque();
    public final ArrayDeque b;
    public final ArrayDeque c;
    public s8b d;
    public long e;
    public long f;
    public long g;

    public u8b() {
        for (int i = 0; i < 10; i++) {
            this.f35224a.add(new s8b(1));
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.b;
            gne gneVar = new gne(this, (byte) 25);
            t8b t8bVar = new t8b();
            t8bVar.j = gneVar;
            arrayDeque.add(t8bVar);
        }
        this.c = new ArrayDeque();
        this.g = -9223372036854775807L;
    }

    @Override // a.efn0
    public final void a(long j) {
        this.e = j;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    @Override // a.skj
    public final void c(hfn0 hfn0Var) {
        x0x.A(hfn0Var == this.d);
        s8b s8bVar = (s8b) hfn0Var;
        if (s8bVar.m(4)) {
            long j = this.f;
            this.f = 1 + j;
            s8bVar.m = j;
            this.c.add(s8bVar);
        } else {
            long j2 = s8bVar.i;
            if (j2 != Long.MIN_VALUE) {
                long j3 = this.g;
                if (j3 == -9223372036854775807L || j2 >= j3) {
                    long j4 = this.f;
                    this.f = 1 + j4;
                    s8bVar.m = j4;
                    this.c.add(s8bVar);
                } else {
                    s8bVar.v();
                    this.f35224a.add(s8bVar);
                }
            } else {
                long j5 = this.f;
                this.f = 1 + j5;
                s8bVar.m = j5;
                this.c.add(s8bVar);
            }
        }
        this.d = null;
    }

    @Override // a.skj
    public final void d(long j) {
        this.g = j;
    }

    @Override // a.skj
    public final Object e() {
        x0x.K(this.d == null);
        ArrayDeque arrayDeque = this.f35224a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        s8b s8bVar = (s8b) arrayDeque.pollFirst();
        this.d = s8bVar;
        return s8bVar;
    }

    public abstract fvt0 f();

    @Override // a.skj
    public void flush() {
        ArrayDeque arrayDeque;
        this.f = 0L;
        this.e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f35224a;
            if (zIsEmpty) {
                break;
            }
            s8b s8bVar = (s8b) arrayDeque2.poll();
            String str = vtt0.f38024a;
            s8bVar.v();
            arrayDeque.add(s8bVar);
        }
        s8b s8bVar2 = this.d;
        if (s8bVar2 != null) {
            s8bVar2.v();
            arrayDeque.add(s8bVar2);
            this.d = null;
        }
    }

    public abstract void g(s8b s8bVar);

    @Override // a.skj
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public t8b b() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            s8b s8bVar = (s8b) arrayDeque2.peek();
            String str = vtt0.f38024a;
            if (s8bVar.i > this.e) {
                return null;
            }
            s8b s8bVar2 = (s8b) arrayDeque2.poll();
            boolean zM = s8bVar2.m(4);
            ArrayDeque arrayDeque3 = this.f35224a;
            if (zM) {
                t8b t8bVar = (t8b) arrayDeque.pollFirst();
                t8bVar.b(4);
                s8bVar2.v();
                arrayDeque3.add(s8bVar2);
                return t8bVar;
            }
            g(s8bVar2);
            if (i()) {
                fvt0 fvt0VarF = f();
                t8b t8bVar2 = (t8b) arrayDeque.pollFirst();
                long j = s8bVar2.i;
                t8bVar2.e = j;
                t8bVar2.g = fvt0VarF;
                t8bVar2.h = j;
                s8bVar2.v();
                arrayDeque3.add(s8bVar2);
                return t8bVar2;
            }
            s8bVar2.v();
            arrayDeque3.add(s8bVar2);
        }
    }

    public abstract boolean i();

    @Override // a.skj
    public void release() {
    }
}
