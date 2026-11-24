package a;

import android.gov.nist.core.Separators;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class hva0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13718a;
    public final Function0 b;
    public final ReentrantLock c = new ReentrantLock();
    public int d;
    public boolean e;
    public final e2e[] f;
    public final gbi0 g;
    public final hu5 h;

    public hva0(int i, Function0 function0) {
        this.f13718a = i;
        this.b = function0;
        this.f = new e2e[i];
        int i2 = hbi0.f12772a;
        this.g = new gbi0(i);
        hu5 hu5Var = new hu5((byte) 1);
        if (i < 1) {
            jf4.o("capacity must be >= 1");
            throw null;
        }
        if (i > 1073741824) {
            jf4.o("capacity must be <= 2^30");
            throw null;
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        hu5Var.d = i - 1;
        hu5Var.e = new Object[i];
        this.h = hu5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        eva0 eva0Var;
        if (zjeVar instanceof eva0) {
            eva0Var = (eva0) zjeVar;
            int i = eva0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                eva0Var.l = i - Integer.MIN_VALUE;
            } else {
                eva0Var = new eva0(this, zjeVar);
            }
        } else {
            eva0Var = new eva0(this, zjeVar);
        }
        Object obj = eva0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = eva0Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            eva0Var.i = this;
            eva0Var.l = 1;
            if (this.g.b(eva0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = eva0Var.i;
            z1x.P(obj);
        }
        try {
            ReentrantLock reentrantLock = this.c;
            hu5 hu5Var = this.h;
            reentrantLock.lock();
            try {
                if (this.e) {
                    m2x.J(21, "Connection pool is closed");
                    throw null;
                }
                if (hu5Var.b == hu5Var.c && this.d < this.f13718a) {
                    e2e e2eVar = new e2e((qpg0) this.b.invoke());
                    e2e[] e2eVarArr = this.f;
                    int i3 = this.d;
                    this.d = i3 + 1;
                    e2eVarArr[i3] = e2eVar;
                    hu5Var.a(e2eVar);
                }
                int i4 = hu5Var.b;
                if (i4 == hu5Var.c) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                Object[] objArr = (Object[]) hu5Var.e;
                Object obj2 = objArr[i4];
                objArr[i4] = null;
                hu5Var.b = (i4 + 1) & hu5Var.d;
                e2e e2eVar2 = (e2e) obj2;
                reentrantLock.unlock();
                return e2eVar2;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            this.g.f();
            throw th2;
        }
    }

    public final void b() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.e = true;
            for (e2e e2eVar : this.f) {
                if (e2eVar != null) {
                    e2eVar.close();
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void c(StringBuilder sb) {
        hu5 hu5Var = this.h;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            lc00 lc00VarB = kotlin.collections.a.b();
            int i = (hu5Var.c - hu5Var.b) & hu5Var.d;
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 >= 0) {
                    int i3 = hu5Var.c;
                    int i4 = hu5Var.b;
                    int i5 = hu5Var.d;
                    if (i2 < ((i3 - i4) & i5)) {
                        Object obj = ((Object[]) hu5Var.e)[(i4 + i2) & i5];
                        obj.getClass();
                        lc00VarB.add(obj);
                    }
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.f13718a + ", ");
            sb.append("permits=" + Math.max(defpackage.a.f0a.getIntVolatile(this.g, fbi0.f), 0) + ", ");
            sb.append("queue=(size=" + lc00VarA.b() + ")[" + CollectionsKt.b0(lc00VarA, null, null, null, null, 63) + "], ");
            sb.append(Separators.RPAREN);
            sb.append('\n');
            e2e[] e2eVarArr = this.f;
            int length = e2eVarArr.length;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                e2e e2eVar = e2eVarArr[i7];
                i6++;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\t\t[");
                sb2.append(i6);
                sb2.append("] - ");
                sb2.append(e2eVar != null ? e2eVar.f7079a.toString() : null);
                sb.append(sb2.toString());
                sb.append('\n');
                if (e2eVar != null) {
                    e2eVar.e(sb);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void d(e2e e2eVar) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.h.a(e2eVar);
            reentrantLock.unlock();
            this.g.f();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
