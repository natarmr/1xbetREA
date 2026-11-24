package a;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class pmn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f27245a = new Object();
    public final Size b;
    public final agn c;
    public final s0a d;
    public final boolean e;
    public final wu9 f;
    public final tu9 g;
    public final wu9 h;
    public final tu9 i;
    public final tu9 j;
    public final o3x k;
    public l55 l;
    public omn0 m;
    public Executor n;

    static {
        Range range = h55.h;
    }

    public pmn0(Size size, s0a s0aVar, boolean z, agn agnVar, xln0 xln0Var) {
        this.b = size;
        this.d = s0aVar;
        this.e = z;
        z1x.t("SurfaceRequest's DynamicRange must always be fully specified.", agnVar.b());
        this.c = agnVar;
        String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference(null);
        tu9 tu9Var = new tu9();
        tu9Var.c = new msf0();
        wu9 wu9Var = new wu9(tu9Var);
        tu9Var.b = wu9Var;
        tu9Var.f34540a = hne.class;
        try {
            atomicReference.set(tu9Var);
            tu9Var.f34540a = str.concat("-cancellation");
        } catch (Exception e) {
            wu9Var.b(e);
        }
        tu9 tu9Var2 = (tu9) atomicReference.get();
        tu9Var2.getClass();
        this.j = tu9Var2;
        AtomicReference atomicReference2 = new AtomicReference(null);
        tu9 tu9Var3 = new tu9();
        tu9Var3.c = new msf0();
        wu9 wu9Var2 = new wu9(tu9Var3);
        tu9Var3.b = wu9Var2;
        tu9Var3.f34540a = hne.class;
        try {
            atomicReference2.set(tu9Var3);
            tu9Var3.f34540a = str.concat("-status");
        } catch (Exception e2) {
            wu9Var2.b(e2);
        }
        this.h = wu9Var2;
        kd30 kd30Var = new kd30(tu9Var2, wu9Var);
        byte b = 0;
        wu9Var2.a(new mfr(wu9Var2, kd30Var, b), bnk.a());
        tu9 tu9Var4 = (tu9) atomicReference2.get();
        tu9Var4.getClass();
        AtomicReference atomicReference3 = new AtomicReference(null);
        tu9 tu9Var5 = new tu9();
        tu9Var5.c = new msf0();
        wu9 wu9Var3 = new wu9(tu9Var5);
        tu9Var5.b = wu9Var3;
        tu9Var5.f34540a = hne.class;
        try {
            atomicReference3.set(tu9Var5);
            tu9Var5.f34540a = str.concat("-Surface");
        } catch (Exception e3) {
            wu9Var3.b(e3);
        }
        this.f = wu9Var3;
        tu9 tu9Var6 = (tu9) atomicReference3.get();
        tu9Var6.getClass();
        this.g = tu9Var6;
        o3x o3xVar = new o3x(this, size);
        this.k = o3xVar;
        ig00 ig00VarC0 = ro4.c0(o3xVar.e);
        wu9Var3.a(new mfr(wu9Var3, new ouu((Object) ig00VarC0, (Object) tu9Var4, (Object) str, (byte) 25), b), bnk.a());
        ig00VarC0.a(new rxj(this, (byte) 1), bnk.a());
        bnk bnkVarA = bnk.a();
        AtomicReference atomicReference4 = new AtomicReference(null);
        wu9 wu9VarI = y0x0.I(new lmn0(this, atomicReference4, b));
        wu9VarI.a(new mfr(wu9VarI, new dpi0(xln0Var), b), bnkVarA);
        tu9 tu9Var7 = (tu9) atomicReference4.get();
        tu9Var7.getClass();
        this.i = tu9Var7;
    }

    public final void a(final Surface surface, Executor executor, final sbe sbeVar) {
        final byte b = 0;
        if (!surface.isValid()) {
            executor.execute(new Runnable() { // from class: a.mmn0
                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = b;
                    Surface surface2 = surface;
                    sbe sbeVar2 = sbeVar;
                    switch (b2) {
                        case 0:
                            sbeVar2.accept(new k55(2, surface2));
                            break;
                        case 1:
                            sbeVar2.accept(new k55(3, surface2));
                            break;
                        default:
                            sbeVar2.accept(new k55(4, surface2));
                            break;
                    }
                }
            });
            return;
        }
        final byte b2 = 1;
        if (!this.g.b(surface)) {
            wu9 wu9Var = this.f;
            if (!wu9Var.isCancelled()) {
                z1x.y(null, wu9Var.b.isDone());
                try {
                    wu9Var.get();
                    executor.execute(new Runnable() { // from class: a.mmn0
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = b2;
                            Surface surface2 = surface;
                            sbe sbeVar2 = sbeVar;
                            switch (b3) {
                                case 0:
                                    sbeVar2.accept(new k55(2, surface2));
                                    break;
                                case 1:
                                    sbeVar2.accept(new k55(3, surface2));
                                    break;
                                default:
                                    sbeVar2.accept(new k55(4, surface2));
                                    break;
                            }
                        }
                    });
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    final byte b3 = 2;
                    executor.execute(new Runnable() { // from class: a.mmn0
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b4 = b3;
                            Surface surface2 = surface;
                            sbe sbeVar2 = sbeVar;
                            switch (b4) {
                                case 0:
                                    sbeVar2.accept(new k55(2, surface2));
                                    break;
                                case 1:
                                    sbeVar2.accept(new k55(3, surface2));
                                    break;
                                default:
                                    sbeVar2.accept(new k55(4, surface2));
                                    break;
                            }
                        }
                    });
                    return;
                }
            }
        }
        trm0 trm0Var = new trm0(sbeVar, surface, b2);
        wu9 wu9Var2 = this.h;
        wu9Var2.a(new mfr(wu9Var2, trm0Var, b), executor);
    }

    public final void b(Executor executor, omn0 omn0Var) {
        l55 l55Var;
        synchronized (this.f27245a) {
            this.m = omn0Var;
            this.n = executor;
            l55Var = this.l;
        }
        if (l55Var != null) {
            executor.execute(new kmn0(omn0Var, l55Var, (byte) 1));
        }
    }

    public final boolean c() {
        return this.g.d(new c44("Surface request will not complete.", (byte) 2));
    }
}
