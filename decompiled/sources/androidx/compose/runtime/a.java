package androidx.compose.runtime;

import a.bh90;
import a.bv3;
import a.fet;
import a.hgk0;
import a.isj0;
import a.iz40;
import a.lrc;
import a.lu40;
import a.mld;
import a.mu40;
import a.nld;
import a.pz40;
import a.rcz;
import a.s5a;
import a.tld;
import a.ujn;
import a.v1h0;
import a.yfe0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class a extends nld {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f45345a;
    public final boolean b;
    public final boolean c;
    public HashSet d;
    public final iz40 e;
    public final pz40 f;
    public final /* synthetic */ fet g;

    public a(fet fetVar, long j, boolean z, boolean z2, lrc lrcVar) {
        this.g = fetVar;
        this.f45345a = j;
        this.b = z;
        this.c = z2;
        iz40 iz40Var = v1h0.f36630a;
        this.e = new iz40();
        this.f = new ParcelableSnapshotMutableState(bh90.g, ujn.A);
    }

    @Override // a.nld
    public final void a(tld tldVar, Function2 function2) {
        this.g.b.a(tldVar, function2);
    }

    @Override // a.nld
    public final iz40 b(tld tldVar, isj0 isj0Var, Function2 function2) {
        return this.g.b.b(tldVar, isj0Var, function2);
    }

    @Override // a.nld
    public final void c(mu40 mu40Var) {
        this.g.b.c(mu40Var);
    }

    @Override // a.nld
    public final void d() {
        this.g.A--;
    }

    @Override // a.nld
    public final boolean e() {
        return this.g.b.e();
    }

    @Override // a.nld
    public final boolean f() {
        return this.b;
    }

    @Override // a.nld
    public final boolean g() {
        return this.c;
    }

    @Override // a.nld
    public final long h() {
        return this.f45345a;
    }

    @Override // a.nld
    public final mld i() {
        return this.g.h;
    }

    @Override // a.nld
    public final bh90 j() {
        return (bh90) ((hgk0) this.f).getValue();
    }

    @Override // a.nld
    public final CoroutineContext k() {
        return this.g.b.k();
    }

    @Override // a.nld
    public final boolean l() {
        return this.g.b.l();
    }

    @Override // a.nld
    public final void m(mu40 mu40Var) {
        this.g.b.m(mu40Var);
    }

    @Override // a.nld
    public final void n(tld tldVar) {
        fet fetVar = this.g;
        nld nldVar = fetVar.b;
        nldVar.n(fetVar.h);
        nldVar.n(tldVar);
    }

    @Override // a.nld
    public final void o(mu40 mu40Var, lu40 lu40Var, bv3 bv3Var) {
        this.g.b.o(mu40Var, lu40Var, bv3Var);
    }

    @Override // a.nld
    public final lu40 p(mu40 mu40Var) {
        return this.g.b.p(mu40Var);
    }

    @Override // a.nld
    public final iz40 q(tld tldVar, isj0 isj0Var, iz40 iz40Var) {
        return this.g.b.q(tldVar, isj0Var, iz40Var);
    }

    @Override // a.nld
    public final void r(Set set) {
        HashSet hashSet = this.d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // a.nld
    public final void s(fet fetVar) {
        this.e.a(fetVar);
    }

    @Override // a.nld
    public final void t(yfe0 yfe0Var) {
        this.g.b.t(yfe0Var);
    }

    @Override // a.nld
    public final void u(tld tldVar) {
        this.g.b.u(tldVar);
    }

    @Override // a.nld
    public final s5a v(rcz rczVar) {
        return this.g.b.v(rczVar);
    }

    @Override // a.nld
    public final void w() {
        this.g.A++;
    }

    @Override // a.nld
    public final void x(fet fetVar) {
        HashSet<Set> hashSet = this.d;
        if (hashSet != null) {
            for (Set set : hashSet) {
                fetVar.getClass();
                set.remove(fetVar.z());
            }
        }
        if (fetVar != null) {
            this.e.l(fetVar);
        }
    }

    @Override // a.nld
    public final void y(tld tldVar) {
        this.g.b.y(tldVar);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0063 A[LOOP:0: B:9:0x0017->B:22:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0066 A[EDGE_INSN: B:26:0x0066->B:23:0x0066 BREAK  A[LOOP:0: B:9:0x0017->B:22:0x0063], SYNTHETIC] */
    public final void z() {
        iz40 iz40Var = this.e;
        if (iz40Var.h()) {
            HashSet hashSet = this.d;
            if (hashSet != null) {
                Object[] objArr = iz40Var.b;
                long[] jArr = iz40Var.f15620a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    fet fetVar = (fet) objArr[(i << 3) + i3];
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((Set) it.next()).remove(fetVar.z());
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
            iz40Var.b();
        }
    }
}
