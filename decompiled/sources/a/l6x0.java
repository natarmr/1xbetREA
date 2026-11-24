package a;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.common.Feature;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class l6x0 {
    public static final zas0 h = new zas0((byte) 20);
    public static final n5x0 i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile td9 f19530a;
    public final c1x0 b;
    public final String c;
    public final boolean d;
    public final f4x e;
    public final yvj f;
    public final glt0 g;

    static {
        wgw0 wgw0Var = wgw0.c;
        int i2 = f4x.c;
        i = new n5x0(wgw0Var, false, ycf0.j);
    }

    public l6x0(c1x0 c1x0Var, n5x0 n5x0Var) {
        this.b = c1x0Var;
        Context context = c1x0Var.b;
        String str = n5x0Var.d;
        if (str == null) {
            str = (String) n5x0Var.f22967a.apply(context);
            n5x0Var.d = str;
        }
        this.c = str;
        this.d = n5x0Var.b;
        this.e = n5x0Var.c;
        this.f19530a = null;
        this.f = new yvj((byte) 1);
        this.g = new glt0(c1x0Var, str);
    }

    public final td9 a() {
        td9 td9Var;
        td9 td9Var2 = this.f19530a;
        if (td9Var2 != null) {
            return td9Var2;
        }
        synchronized (this) {
            try {
                td9Var = this.f19530a;
                if (td9Var == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                    try {
                        td9 td9VarJ = this.g.j();
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        int i2 = ((un00) td9VarJ.e).b - 2;
                        if (i2 == 15 || i2 == 16) {
                            td9Var = td9VarJ;
                        } else {
                            c1x0 c1x0Var = this.b;
                            c1x0Var.g.a();
                            if (this.d || this.g.l() || !((String) td9VarJ.b).isEmpty()) {
                                final byte b = 2;
                                c1x0Var.a().execute(new Runnable(this) { // from class: a.r5x0
                                    public final /* synthetic */ l6x0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ig00 ig00Var;
                                        d1 d1VarB;
                                        byte b2 = b;
                                        l6x0 l6x0Var = this.b;
                                        switch (b2) {
                                            case 0:
                                                l6x0Var.b();
                                                return;
                                            case 1:
                                                final l7x0 l7x0Var = l6x0Var.b.i;
                                                boolean z = l6x0Var.d;
                                                y5x0 y5x0Var = y5x0.f42069a;
                                                final r7x0 r7x0Var = (r7x0) l7x0Var.c.get();
                                                if (r7x0Var == null && !z) {
                                                    n3x n3xVar = n3x.b;
                                                    return;
                                                }
                                                if ((l7x0Var.e & 64) == 0) {
                                                    CopyOnWriteArrayList copyOnWriteArrayList = l7x0Var.f;
                                                    synchronized (copyOnWriteArrayList) {
                                                        try {
                                                            int i3 = l7x0Var.e;
                                                            if ((i3 & 64) == 0) {
                                                                copyOnWriteArrayList.add(y5x0Var);
                                                                l7x0Var.e = i3 | 64;
                                                            }
                                                        } catch (Throwable th) {
                                                            throw th;
                                                        }
                                                        break;
                                                    }
                                                }
                                                if (l7x0Var.h == null) {
                                                    synchronized (l7x0Var.g) {
                                                        try {
                                                            if (l7x0Var.h == null) {
                                                                if (r7x0Var == null) {
                                                                    r7x0Var = i7x0.f14316a;
                                                                }
                                                                Context context = l7x0Var.f19581a;
                                                                if (m0x0.X(context)) {
                                                                    d1 d1VarA = ((y2x0) l7x0Var.d.get()).a(new k7x0(l7x0Var, r7x0Var));
                                                                    l7x0Var.h = d1VarA;
                                                                    ig00Var = d1VarA;
                                                                } else {
                                                                    tsn tsnVar = tsn.c;
                                                                    lin0 lin0Var = l7x0Var.b;
                                                                    l5 l5VarQ = n5.q(m0x0.W(context, Executors.callable(tsnVar, null), (Executor) lin0Var.get()), new yy3() { // from class: a.g7x0
                                                                        @Override // a.yy3
                                                                        public final ig00 apply(Object obj) {
                                                                            l7x0 l7x0Var2 = l7x0Var;
                                                                            return ((y2x0) l7x0Var2.d.get()).a(new k7x0(l7x0Var2, r7x0Var));
                                                                        }
                                                                    }, (Executor) lin0Var.get());
                                                                    l7x0Var.h = l5VarQ;
                                                                    ig00Var = l5VarQ;
                                                                }
                                                                ig00Var.a(new fju0((Object) ig00Var, (byte) 14), (Executor) l7x0Var.b.get());
                                                            }
                                                        } catch (Throwable th2) {
                                                            throw th2;
                                                        }
                                                        break;
                                                    }
                                                    return;
                                                }
                                                return;
                                            default:
                                                td9 td9VarA = l6x0Var.a();
                                                String str = (String) td9VarA.b;
                                                c1x0 c1x0Var2 = l6x0Var.b;
                                                lin0 lin0Var2 = c1x0Var2.d;
                                                t7x0 t7x0VarB = c1x0Var2.g.b();
                                                boolean z2 = t7x0VarB.i;
                                                boolean z3 = false;
                                                boolean z4 = false;
                                                if (t7x0VarB.j) {
                                                    if ((str == null || str.isEmpty()) && !z2) {
                                                        n3x n3xVar2 = n3x.b;
                                                        return;
                                                    }
                                                    b2x0 b2x0VarS = g2x0.s();
                                                    un00 un00Var = (un00) td9VarA.e;
                                                    byte b3 = un00Var.f35939a;
                                                    d2x0 d2x0VarR = f2x0.r();
                                                    d2x0VarR.c();
                                                    ((f2x0) d2x0VarR.b).s(b3);
                                                    int i4 = un00Var.b;
                                                    d2x0VarR.c();
                                                    ((f2x0) d2x0VarR.b).t(i4);
                                                    f2x0 f2x0Var = (f2x0) d2x0VarR.e();
                                                    b2x0VarS.c();
                                                    ((g2x0) b2x0VarS.b).u(f2x0Var);
                                                    if (str != null && !str.isEmpty()) {
                                                        b2x0VarS.c();
                                                        ((g2x0) b2x0VarS.b).t(str);
                                                    }
                                                    if (z2) {
                                                        String str2 = l6x0Var.c;
                                                        b2x0VarS.c();
                                                        ((g2x0) b2x0VarS.b).v(str2);
                                                    }
                                                    y2x0 y2x0Var = (y2x0) lin0Var2.get();
                                                    g2x0 g2x0Var = (g2x0) b2x0VarS.e();
                                                    tzw0 tzw0Var = y2x0Var.f41927a;
                                                    euo0 euo0VarA = s9w0.a();
                                                    euo0VarA.f8431a = new owp0((Object) g2x0Var, (byte) 25);
                                                    euo0VarA.d = new Feature[]{f1t0.i};
                                                    euo0VarA.c = true;
                                                    euo0VarA.b = false;
                                                    d1VarB = y2x0.b(tzw0Var.b(0, euo0VarA.a()).continueWithTask(ank.f1158a, new fuj0(tzw0Var, g2x0Var, z3)));
                                                } else {
                                                    if (str == null || str.isEmpty()) {
                                                        n3x n3xVar3 = n3x.b;
                                                        return;
                                                    }
                                                    y2x0 y2x0Var2 = (y2x0) lin0Var2.get();
                                                    y2x0Var2.getClass();
                                                    str.getClass();
                                                    d1VarB = y2x0.b(y2x0Var2.f41927a.c(str));
                                                }
                                                v5x0 v5x0Var = new v5x0(l6x0Var, z4 ? 1 : 0);
                                                fr40 fr40VarA = c1x0Var2.a();
                                                int i5 = f1.l;
                                                d1 d1Var = new d1(d1VarB, s2x0.class, v5x0Var);
                                                d1VarB.a(d1Var, n2x.I(fr40VarA, d1Var));
                                                return;
                                        }
                                    }
                                });
                                c1x0Var.f3597a.e((qdw0) td9VarJ.c, this.e, this.c);
                                if (this.g.l()) {
                                    final byte b2 = 1;
                                    c1x0Var.a().execute(new Runnable(this) { // from class: a.r5x0
                                        public final /* synthetic */ l6x0 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            ig00 ig00Var;
                                            d1 d1VarB;
                                            byte b3 = b2;
                                            l6x0 l6x0Var = this.b;
                                            switch (b3) {
                                                case 0:
                                                    l6x0Var.b();
                                                    return;
                                                case 1:
                                                    final l7x0 l7x0Var = l6x0Var.b.i;
                                                    boolean z = l6x0Var.d;
                                                    y5x0 y5x0Var = y5x0.f42069a;
                                                    final r7x0 r7x0Var = (r7x0) l7x0Var.c.get();
                                                    if (r7x0Var == null && !z) {
                                                        n3x n3xVar = n3x.b;
                                                        return;
                                                    }
                                                    if ((l7x0Var.e & 64) == 0) {
                                                        CopyOnWriteArrayList copyOnWriteArrayList = l7x0Var.f;
                                                        synchronized (copyOnWriteArrayList) {
                                                            try {
                                                                int i3 = l7x0Var.e;
                                                                if ((i3 & 64) == 0) {
                                                                    copyOnWriteArrayList.add(y5x0Var);
                                                                    l7x0Var.e = i3 | 64;
                                                                }
                                                            } catch (Throwable th) {
                                                                throw th;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    if (l7x0Var.h == null) {
                                                        synchronized (l7x0Var.g) {
                                                            try {
                                                                if (l7x0Var.h == null) {
                                                                    if (r7x0Var == null) {
                                                                        r7x0Var = i7x0.f14316a;
                                                                    }
                                                                    Context context = l7x0Var.f19581a;
                                                                    if (m0x0.X(context)) {
                                                                        d1 d1VarA = ((y2x0) l7x0Var.d.get()).a(new k7x0(l7x0Var, r7x0Var));
                                                                        l7x0Var.h = d1VarA;
                                                                        ig00Var = d1VarA;
                                                                    } else {
                                                                        tsn tsnVar = tsn.c;
                                                                        lin0 lin0Var = l7x0Var.b;
                                                                        l5 l5VarQ = n5.q(m0x0.W(context, Executors.callable(tsnVar, null), (Executor) lin0Var.get()), new yy3() { // from class: a.g7x0
                                                                            @Override // a.yy3
                                                                            public final ig00 apply(Object obj) {
                                                                                l7x0 l7x0Var2 = l7x0Var;
                                                                                return ((y2x0) l7x0Var2.d.get()).a(new k7x0(l7x0Var2, r7x0Var));
                                                                            }
                                                                        }, (Executor) lin0Var.get());
                                                                        l7x0Var.h = l5VarQ;
                                                                        ig00Var = l5VarQ;
                                                                    }
                                                                    ig00Var.a(new fju0((Object) ig00Var, (byte) 14), (Executor) l7x0Var.b.get());
                                                                }
                                                            } catch (Throwable th2) {
                                                                throw th2;
                                                            }
                                                            break;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    td9 td9VarA = l6x0Var.a();
                                                    String str = (String) td9VarA.b;
                                                    c1x0 c1x0Var2 = l6x0Var.b;
                                                    lin0 lin0Var2 = c1x0Var2.d;
                                                    t7x0 t7x0VarB = c1x0Var2.g.b();
                                                    boolean z2 = t7x0VarB.i;
                                                    boolean z3 = false;
                                                    boolean z4 = false;
                                                    if (t7x0VarB.j) {
                                                        if ((str == null || str.isEmpty()) && !z2) {
                                                            n3x n3xVar2 = n3x.b;
                                                            return;
                                                        }
                                                        b2x0 b2x0VarS = g2x0.s();
                                                        un00 un00Var = (un00) td9VarA.e;
                                                        byte b4 = un00Var.f35939a;
                                                        d2x0 d2x0VarR = f2x0.r();
                                                        d2x0VarR.c();
                                                        ((f2x0) d2x0VarR.b).s(b4);
                                                        int i4 = un00Var.b;
                                                        d2x0VarR.c();
                                                        ((f2x0) d2x0VarR.b).t(i4);
                                                        f2x0 f2x0Var = (f2x0) d2x0VarR.e();
                                                        b2x0VarS.c();
                                                        ((g2x0) b2x0VarS.b).u(f2x0Var);
                                                        if (str != null && !str.isEmpty()) {
                                                            b2x0VarS.c();
                                                            ((g2x0) b2x0VarS.b).t(str);
                                                        }
                                                        if (z2) {
                                                            String str2 = l6x0Var.c;
                                                            b2x0VarS.c();
                                                            ((g2x0) b2x0VarS.b).v(str2);
                                                        }
                                                        y2x0 y2x0Var = (y2x0) lin0Var2.get();
                                                        g2x0 g2x0Var = (g2x0) b2x0VarS.e();
                                                        tzw0 tzw0Var = y2x0Var.f41927a;
                                                        euo0 euo0VarA = s9w0.a();
                                                        euo0VarA.f8431a = new owp0((Object) g2x0Var, (byte) 25);
                                                        euo0VarA.d = new Feature[]{f1t0.i};
                                                        euo0VarA.c = true;
                                                        euo0VarA.b = false;
                                                        d1VarB = y2x0.b(tzw0Var.b(0, euo0VarA.a()).continueWithTask(ank.f1158a, new fuj0(tzw0Var, g2x0Var, z3)));
                                                    } else {
                                                        if (str == null || str.isEmpty()) {
                                                            n3x n3xVar3 = n3x.b;
                                                            return;
                                                        }
                                                        y2x0 y2x0Var2 = (y2x0) lin0Var2.get();
                                                        y2x0Var2.getClass();
                                                        str.getClass();
                                                        d1VarB = y2x0.b(y2x0Var2.f41927a.c(str));
                                                    }
                                                    v5x0 v5x0Var = new v5x0(l6x0Var, z4 ? 1 : 0);
                                                    fr40 fr40VarA = c1x0Var2.a();
                                                    int i5 = f1.l;
                                                    d1 d1Var = new d1(d1VarB, s2x0.class, v5x0Var);
                                                    d1VarB.a(d1Var, n2x.I(fr40VarA, d1Var));
                                                    return;
                                            }
                                        }
                                    });
                                }
                                td9Var = td9VarJ;
                            } else {
                                final byte b3 = 0;
                                c1x0Var.a().execute(new Runnable(this) { // from class: a.r5x0
                                    public final /* synthetic */ l6x0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ig00 ig00Var;
                                        d1 d1VarB;
                                        byte b4 = b3;
                                        l6x0 l6x0Var = this.b;
                                        switch (b4) {
                                            case 0:
                                                l6x0Var.b();
                                                return;
                                            case 1:
                                                final l7x0 l7x0Var = l6x0Var.b.i;
                                                boolean z = l6x0Var.d;
                                                y5x0 y5x0Var = y5x0.f42069a;
                                                final r7x0 r7x0Var = (r7x0) l7x0Var.c.get();
                                                if (r7x0Var == null && !z) {
                                                    n3x n3xVar = n3x.b;
                                                    return;
                                                }
                                                if ((l7x0Var.e & 64) == 0) {
                                                    CopyOnWriteArrayList copyOnWriteArrayList = l7x0Var.f;
                                                    synchronized (copyOnWriteArrayList) {
                                                        try {
                                                            int i3 = l7x0Var.e;
                                                            if ((i3 & 64) == 0) {
                                                                copyOnWriteArrayList.add(y5x0Var);
                                                                l7x0Var.e = i3 | 64;
                                                            }
                                                        } catch (Throwable th) {
                                                            throw th;
                                                        }
                                                        break;
                                                    }
                                                }
                                                if (l7x0Var.h == null) {
                                                    synchronized (l7x0Var.g) {
                                                        try {
                                                            if (l7x0Var.h == null) {
                                                                if (r7x0Var == null) {
                                                                    r7x0Var = i7x0.f14316a;
                                                                }
                                                                Context context = l7x0Var.f19581a;
                                                                if (m0x0.X(context)) {
                                                                    d1 d1VarA = ((y2x0) l7x0Var.d.get()).a(new k7x0(l7x0Var, r7x0Var));
                                                                    l7x0Var.h = d1VarA;
                                                                    ig00Var = d1VarA;
                                                                } else {
                                                                    tsn tsnVar = tsn.c;
                                                                    lin0 lin0Var = l7x0Var.b;
                                                                    l5 l5VarQ = n5.q(m0x0.W(context, Executors.callable(tsnVar, null), (Executor) lin0Var.get()), new yy3() { // from class: a.g7x0
                                                                        @Override // a.yy3
                                                                        public final ig00 apply(Object obj) {
                                                                            l7x0 l7x0Var2 = l7x0Var;
                                                                            return ((y2x0) l7x0Var2.d.get()).a(new k7x0(l7x0Var2, r7x0Var));
                                                                        }
                                                                    }, (Executor) lin0Var.get());
                                                                    l7x0Var.h = l5VarQ;
                                                                    ig00Var = l5VarQ;
                                                                }
                                                                ig00Var.a(new fju0((Object) ig00Var, (byte) 14), (Executor) l7x0Var.b.get());
                                                            }
                                                        } catch (Throwable th2) {
                                                            throw th2;
                                                        }
                                                        break;
                                                    }
                                                    return;
                                                }
                                                return;
                                            default:
                                                td9 td9VarA = l6x0Var.a();
                                                String str = (String) td9VarA.b;
                                                c1x0 c1x0Var2 = l6x0Var.b;
                                                lin0 lin0Var2 = c1x0Var2.d;
                                                t7x0 t7x0VarB = c1x0Var2.g.b();
                                                boolean z2 = t7x0VarB.i;
                                                boolean z3 = false;
                                                boolean z4 = false;
                                                if (t7x0VarB.j) {
                                                    if ((str == null || str.isEmpty()) && !z2) {
                                                        n3x n3xVar2 = n3x.b;
                                                        return;
                                                    }
                                                    b2x0 b2x0VarS = g2x0.s();
                                                    un00 un00Var = (un00) td9VarA.e;
                                                    byte b5 = un00Var.f35939a;
                                                    d2x0 d2x0VarR = f2x0.r();
                                                    d2x0VarR.c();
                                                    ((f2x0) d2x0VarR.b).s(b5);
                                                    int i4 = un00Var.b;
                                                    d2x0VarR.c();
                                                    ((f2x0) d2x0VarR.b).t(i4);
                                                    f2x0 f2x0Var = (f2x0) d2x0VarR.e();
                                                    b2x0VarS.c();
                                                    ((g2x0) b2x0VarS.b).u(f2x0Var);
                                                    if (str != null && !str.isEmpty()) {
                                                        b2x0VarS.c();
                                                        ((g2x0) b2x0VarS.b).t(str);
                                                    }
                                                    if (z2) {
                                                        String str2 = l6x0Var.c;
                                                        b2x0VarS.c();
                                                        ((g2x0) b2x0VarS.b).v(str2);
                                                    }
                                                    y2x0 y2x0Var = (y2x0) lin0Var2.get();
                                                    g2x0 g2x0Var = (g2x0) b2x0VarS.e();
                                                    tzw0 tzw0Var = y2x0Var.f41927a;
                                                    euo0 euo0VarA = s9w0.a();
                                                    euo0VarA.f8431a = new owp0((Object) g2x0Var, (byte) 25);
                                                    euo0VarA.d = new Feature[]{f1t0.i};
                                                    euo0VarA.c = true;
                                                    euo0VarA.b = false;
                                                    d1VarB = y2x0.b(tzw0Var.b(0, euo0VarA.a()).continueWithTask(ank.f1158a, new fuj0(tzw0Var, g2x0Var, z3)));
                                                } else {
                                                    if (str == null || str.isEmpty()) {
                                                        n3x n3xVar3 = n3x.b;
                                                        return;
                                                    }
                                                    y2x0 y2x0Var2 = (y2x0) lin0Var2.get();
                                                    y2x0Var2.getClass();
                                                    str.getClass();
                                                    d1VarB = y2x0.b(y2x0Var2.f41927a.c(str));
                                                }
                                                v5x0 v5x0Var = new v5x0(l6x0Var, z4 ? 1 : 0);
                                                fr40 fr40VarA = c1x0Var2.a();
                                                int i5 = f1.l;
                                                d1 d1Var = new d1(d1VarB, s2x0.class, v5x0Var);
                                                d1VarB.a(d1Var, n2x.I(fr40VarA, d1Var));
                                                return;
                                        }
                                    }
                                });
                                td9Var = new td9(y7x0.y(), (un00) td9VarJ.e);
                            }
                        }
                        if (!this.d || ((un00) td9Var.e).b != 17) {
                            this.f19530a = td9Var;
                        }
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return td9Var;
    }

    public final void b() {
        glt0 glt0Var = this.g;
        c1x0 c1x0Var = (c1x0) glt0Var.b;
        y2x0 y2x0Var = (y2x0) c1x0Var.d.get();
        String str = (String) glt0Var.d;
        y2x0Var.getClass();
        str.getClass();
        tzw0 tzw0Var = y2x0Var.f41927a;
        euo0 euo0VarA = s9w0.a();
        euo0VarA.f8431a = new hbb(str, (byte) 7);
        d1 d1VarB = y2x0.b(tzw0Var.b(0, euo0VarA.a()).continueWith(ank.f1158a, new epw0((byte) 28)));
        wgw0 wgw0Var = wgw0.d;
        fr40 fr40VarA = c1x0Var.a();
        int i2 = n5.k;
        m5 m5Var = new m5(d1VarB, wgw0Var);
        d1VarB.a(m5Var, n2x.I(fr40VarA, m5Var));
        v5x0 v5x0Var = new v5x0(glt0Var, (byte) 1);
        c1x0 c1x0Var2 = this.b;
        n5.q(m5Var, v5x0Var, c1x0Var2.a()).a(new z5x0(this, m5Var), c1x0Var2.a());
    }
}
