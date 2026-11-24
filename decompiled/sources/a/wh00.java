package a;

import android.os.Looper;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class wh00 {
    public static final Object k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f39142a;
    public final atg0 b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final mx2 j;

    public wh00() {
        this.f39142a = new Object();
        this.b = new atg0();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new mx2(this, (byte) 19);
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        vxj vxjVar = fw3.y().f10239a;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        jf4.n(kng0.l("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(vh00 vh00Var) {
        if (vh00Var.b) {
            if (!vh00Var.d()) {
                vh00Var.a(false);
                return;
            }
            int i = vh00Var.c;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            vh00Var.c = i2;
            vh00Var.f37409a.a(this.e);
        }
    }

    public final void c(vh00 vh00Var) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (vh00Var != null) {
                b(vh00Var);
                vh00Var = null;
            } else {
                atg0 atg0Var = this.b;
                ysg0 ysg0Var = new ysg0(atg0Var);
                atg0Var.c.put(ysg0Var, Boolean.FALSE);
                while (ysg0Var.hasNext()) {
                    b((vh00) ((Map.Entry) ysg0Var.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final Object d() {
        Object obj = this.e;
        if (obj != k) {
            return obj;
        }
        return null;
    }

    public final void e(clz clzVar, ee60 ee60Var) {
        a("observe");
        if (clzVar.x().i == lkz.f20223a) {
            return;
        }
        uh00 uh00Var = new uh00(this, clzVar, ee60Var);
        vh00 vh00Var = (vh00) this.b.b(ee60Var, uh00Var);
        if (vh00Var != null && !vh00Var.c(clzVar)) {
            jf4.o("Cannot add the same observer with different lifecycles");
        } else {
            if (vh00Var != null) {
                return;
            }
            clzVar.x().a(uh00Var);
        }
    }

    public final void f(ee60 ee60Var) {
        a("observeForever");
        th00 th00Var = new th00(this, ee60Var);
        vh00 vh00Var = (vh00) this.b.b(ee60Var, th00Var);
        if (vh00Var instanceof uh00) {
            jf4.o("Cannot add the same observer with different lifecycles");
        } else {
            if (vh00Var != null) {
                return;
            }
            th00Var.a(true);
        }
    }

    public void i(Object obj) {
        boolean z;
        synchronized (this.f39142a) {
            z = this.f == k;
            this.f = obj;
        }
        if (z) {
            fw3.y().z(this.j);
        }
    }

    public void j(ee60 ee60Var) {
        a("removeObserver");
        atg0 atg0Var = this.b;
        WeakHashMap weakHashMap = atg0Var.c;
        xsg0 xsg0Var = atg0Var.f1431a;
        while (xsg0Var != null && !xsg0Var.f41415a.equals(ee60Var)) {
            xsg0Var = xsg0Var.c;
        }
        Object obj = null;
        if (xsg0Var != null) {
            atg0Var.d--;
            if (!weakHashMap.isEmpty()) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    ((zsg0) it.next()).a(xsg0Var);
                }
            }
            xsg0 xsg0Var2 = xsg0Var.d;
            xsg0 xsg0Var3 = xsg0Var.c;
            if (xsg0Var2 != null) {
                xsg0Var2.c = xsg0Var3;
            } else {
                atg0Var.f1431a = xsg0Var3;
            }
            xsg0 xsg0Var4 = xsg0Var.c;
            if (xsg0Var4 != null) {
                xsg0Var4.d = xsg0Var2;
            } else {
                atg0Var.b = xsg0Var2;
            }
            xsg0Var.c = null;
            xsg0Var.d = null;
            obj = xsg0Var.b;
        }
        vh00 vh00Var = (vh00) obj;
        if (vh00Var == null) {
            return;
        }
        vh00Var.b();
        vh00Var.a(false);
    }

    public final void k(clz clzVar) {
        a("removeObservers");
        Iterator it = this.b.iterator();
        while (true) {
            wsg0 wsg0Var = (wsg0) it;
            if (!wsg0Var.hasNext()) {
                return;
            }
            Map.Entry entry = (Map.Entry) wsg0Var.next();
            if (((vh00) entry.getValue()).c(clzVar)) {
                j((ee60) entry.getKey());
            }
        }
    }

    public void l(Object obj) {
        a("setValue");
        this.g++;
        this.e = obj;
        c(null);
    }

    public void g() {
    }

    public void h() {
    }

    public wh00(Object obj) {
        this.f39142a = new Object();
        this.b = new atg0();
        this.c = 0;
        this.f = k;
        this.j = new mx2(this, (byte) 19);
        this.e = obj;
        this.g = 0;
    }
}
