package a;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class c1x0 {
    public static final Object j = new Object();
    public static final AtomicReference k = new AtomicReference();
    public static volatile c1x0 l = null;
    public static final lin0 m = hfm0.z(l1x0.f19281a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cmt0 f3597a;
    public final Context b;
    public final lin0 c;
    public final lin0 d;
    public final lin0 e;
    public final lin0 f;
    public final i8x0 g;
    public final lin0 h;
    public final l7x0 i;

    public c1x0(Context context, lin0 lin0Var, lin0 lin0Var2, lin0 lin0Var3, lin0 lin0Var4, lin0 lin0Var5) {
        cmt0 cmt0Var = new cmt0();
        cmt0Var.f4625a = new AtomicBoolean(false);
        new ConcurrentHashMap();
        cmt0Var.b = new ConcurrentHashMap();
        new ConcurrentHashMap();
        cmt0Var.c = new ConcurrentHashMap();
        this.f3597a = cmt0Var;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        lin0Var.getClass();
        lin0Var2.getClass();
        lin0Var3.getClass();
        lin0Var4.getClass();
        lin0Var5.getClass();
        lin0 lin0VarZ = hfm0.z(lin0Var);
        lin0 lin0VarZ2 = hfm0.z(lin0Var2);
        lin0 lin0VarZ3 = hfm0.z(new n1x0(lin0Var3, (byte) 0));
        lin0 lin0VarZ4 = hfm0.z(lin0Var4);
        lin0 lin0VarZ5 = hfm0.z(lin0Var5);
        this.b = applicationContext;
        this.c = lin0VarZ;
        this.d = lin0VarZ2;
        this.e = lin0VarZ3;
        this.f = lin0VarZ4;
        this.g = new i8x0(applicationContext, lin0VarZ, lin0VarZ4, lin0VarZ2);
        this.h = lin0VarZ5;
        this.i = new l7x0(applicationContext, lin0VarZ, lin0VarZ3, lin0VarZ2);
    }

    public static void b() {
        synchronized (vbw0.g) {
        }
        if (k.get() == null && vbw0.h == null) {
            vbw0.h = new c44((byte) 19);
        }
    }

    public final fr40 a() {
        return (fr40) this.c.get();
    }
}
