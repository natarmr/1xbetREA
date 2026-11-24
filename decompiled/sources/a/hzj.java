package a;

import android.gov.nist.core.Separators;
import android.util.Log;
import android.util.Size;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class hzj {
    public static final boolean k;
    public static final AtomicInteger l;
    public static final AtomicInteger m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13909a = new Object();
    public int b = 0;
    public boolean c = false;
    public tu9 d;
    public final wu9 e;
    public tu9 f;
    public final wu9 g;
    public final Size h;
    public final int i;
    public Class j;

    static {
        new Size(0, 0);
        k = l8x.f0("DeferrableSurface");
        l = new AtomicInteger(0);
        m = new AtomicInteger(0);
    }

    public hzj(int i, Size size) {
        final byte b = 0;
        this.h = size;
        this.i = i;
        wu9 wu9VarI = y0x0.I(new uu9(this) { // from class: a.fzj
            public final /* synthetic */ hzj b;

            {
                this.b = this;
            }

            @Override // a.uu9
            public final Object f(tu9 tu9Var) {
                byte b2 = b;
                hzj hzjVar = this.b;
                switch (b2) {
                    case 0:
                        synchronized (hzjVar.f13909a) {
                            hzjVar.d = tu9Var;
                            break;
                        }
                        return "DeferrableSurface-termination(" + hzjVar + Separators.RPAREN;
                    default:
                        synchronized (hzjVar.f13909a) {
                            hzjVar.f = tu9Var;
                            break;
                        }
                        return "DeferrableSurface-close(" + hzjVar + Separators.RPAREN;
                }
            }
        });
        this.e = wu9VarI;
        final byte b2 = 1;
        this.g = y0x0.I(new uu9(this) { // from class: a.fzj
            public final /* synthetic */ hzj b;

            {
                this.b = this;
            }

            @Override // a.uu9
            public final Object f(tu9 tu9Var) {
                byte b3 = b2;
                hzj hzjVar = this.b;
                switch (b3) {
                    case 0:
                        synchronized (hzjVar.f13909a) {
                            hzjVar.d = tu9Var;
                            break;
                        }
                        return "DeferrableSurface-termination(" + hzjVar + Separators.RPAREN;
                    default:
                        synchronized (hzjVar.f13909a) {
                            hzjVar.f = tu9Var;
                            break;
                        }
                        return "DeferrableSurface-close(" + hzjVar + Separators.RPAREN;
                }
            }
        });
        if (l8x.f0("DeferrableSurface")) {
            e(m.incrementAndGet(), l.get(), "Surface created");
            wu9VarI.b.a(new a4e(this, Log.getStackTraceString(new Exception()), (byte) 22), bnk.a());
        }
    }

    public void a() {
        tu9 tu9Var;
        synchronized (this.f13909a) {
            try {
                if (this.c) {
                    tu9Var = null;
                } else {
                    this.c = true;
                    this.f.b(null);
                    if (this.b == 0) {
                        tu9Var = this.d;
                        this.d = null;
                    } else {
                        tu9Var = null;
                    }
                    if (l8x.f0("DeferrableSurface")) {
                        l8x.U("DeferrableSurface", "surface closed,  useCount=" + this.b + " closed=true " + this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (tu9Var != null) {
            tu9Var.b(null);
        }
    }

    public final void b() {
        tu9 tu9Var;
        synchronized (this.f13909a) {
            try {
                int i = this.b;
                if (i == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i2 = i - 1;
                this.b = i2;
                if (i2 == 0 && this.c) {
                    tu9Var = this.d;
                    this.d = null;
                } else {
                    tu9Var = null;
                }
                if (l8x.f0("DeferrableSurface")) {
                    l8x.U("DeferrableSurface", "use count-1,  useCount=" + this.b + " closed=" + this.c + Separators.SP + this);
                    if (this.b == 0) {
                        e(m.get(), l.decrementAndGet(), "Surface no longer in use");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (tu9Var != null) {
            tu9Var.b(null);
        }
    }

    public final ig00 c() {
        synchronized (this.f13909a) {
            try {
                if (this.c) {
                    return new m3x(new gzj("DeferrableSurface already closed.", this), (byte) 1);
                }
                return f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.f13909a) {
            try {
                int i = this.b;
                if (i == 0 && this.c) {
                    throw new gzj("Cannot begin use on a closed surface.", this);
                }
                this.b = i + 1;
                if (l8x.f0("DeferrableSurface")) {
                    if (this.b == 1) {
                        e(m.get(), l.incrementAndGet(), "New surface in use");
                    }
                    l8x.U("DeferrableSurface", "use count+1, useCount=" + this.b + Separators.SP + this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(int i, int i2, String str) {
        if (!k && l8x.f0("DeferrableSurface")) {
            l8x.U("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        l8x.U("DeferrableSurface", str + "[total_surfaces=" + i + ", used_surfaces=" + i2 + "](" + this + "}");
    }

    public ig00 f() {
        return m3x.c;
    }
}
