package com.google.android.gms.common.api.internal;

import a.j9w0;
import a.law0;
import a.m0g0;
import a.n06;
import a.s0x;
import a.y50;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BasePendingResult<R extends m0g0> {
    public static final y50 j = new y50(15);
    public m0g0 e;
    public Status f;
    public volatile boolean g;
    public boolean h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f45487a = new Object();
    public final CountDownLatch b = new CountDownLatch(1);
    public final ArrayList c = new ArrayList();
    public final AtomicReference d = new AtomicReference();
    public boolean i = false;

    public BasePendingResult(j9w0 j9w0Var) {
        new n06(j9w0Var != null ? j9w0Var.f16161a.g : Looper.getMainLooper(), (byte) 0);
        new WeakReference(j9w0Var);
    }

    public final void a(law0 law0Var) {
        synchronized (this.f45487a) {
            try {
                if (d()) {
                    law0Var.a(this.f);
                } else {
                    this.c.add(law0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Status status) {
        synchronized (this.f45487a) {
            try {
                if (!d()) {
                    e(b(status));
                    this.h = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        return this.b.getCount() == 0;
    }

    public final void e(m0g0 m0g0Var) {
        synchronized (this.f45487a) {
            try {
                if (this.h) {
                    return;
                }
                d();
                s0x.J("Results have already been set", !d());
                s0x.J("Result has already been consumed", !this.g);
                this.e = m0g0Var;
                this.f = m0g0Var.b();
                this.b.countDown();
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((law0) arrayList.get(i)).a(this.f);
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* bridge */ /* synthetic */ m0g0 b(Status status) {
        return status;
    }
}
