package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class gd00 implements ig00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f11084a;
    public ArrayList b;
    public final boolean c;
    public final AtomicInteger d;
    public final ig00 e = y0x0.I(new onv(this));
    public tu9 f;

    public gd00(ArrayList arrayList, boolean z, bnk bnkVar) {
        this.f11084a = arrayList;
        this.b = new ArrayList(arrayList.size());
        this.c = z;
        this.d = new AtomicInteger(arrayList.size());
        a(new mx2(this, (byte) 18), bnk.a());
        if (this.f11084a.isEmpty()) {
            this.f.b(new ArrayList(this.b));
            return;
        }
        for (int i = 0; i < this.f11084a.size(); i++) {
            this.b.add(null);
        }
        ArrayList arrayList2 = this.f11084a;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            ig00 ig00Var = (ig00) arrayList2.get(i2);
            ig00Var.a(new le3(this, i2, ig00Var), bnkVar);
        }
    }

    @Override // a.ig00
    public final void a(Runnable runnable, Executor executor) {
        this.e.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        ArrayList arrayList = this.f11084a;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ig00) it.next()).cancel(z);
            }
        }
        return this.e.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        ArrayList<ig00> arrayList = this.f11084a;
        ig00 ig00Var = this.e;
        if (arrayList != null && !ig00Var.isDone()) {
            loop0: for (ig00 ig00Var2 : arrayList) {
                while (!ig00Var2.isDone()) {
                    try {
                        ig00Var2.get();
                    } catch (Error e) {
                        throw e;
                    } catch (InterruptedException e2) {
                        throw e2;
                    } catch (Throwable unused) {
                        if (this.c) {
                            return (List) ig00Var.get();
                        }
                    }
                }
            }
        }
        return (List) ig00Var.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.e.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.e.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return (List) this.e.get(j, timeUnit);
    }
}
