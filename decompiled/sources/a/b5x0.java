package a;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b5x0 implements lin0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2028a;
    public final fbv b;
    public volatile int c = -1;
    public yvj d;

    public b5x0(String str, fbv fbvVar) {
        this.f2028a = str;
        this.b = fbvVar;
    }

    public /* synthetic */ Object a() {
        return Double.valueOf(-3.0d);
    }

    public /* synthetic */ Object b(String str) {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    public /* synthetic */ Object c(Object obj) {
        return (Boolean) obj;
    }

    public abstract Object d();

    public abstract void e(Object obj);

    /* JADX WARN: Code duplicated, block: B:48:0x00ef  */
    @Override // a.lin0
    public final Object get() {
        l6x0 l6x0VarE;
        Object objA;
        nuj0 nuj0Var;
        c1x0 c1x0Var;
        if (vbw0.i == null) {
            Object obj = c1x0.j;
            vbw0.i = new c44((byte) 19);
        }
        Context context = (Context) c1x0.k.get();
        Object objC = null;
        if (context == null) {
            synchronized (vbw0.g) {
            }
            jf4.n("Must call PhenotypeContext.setContext() first");
            return null;
        }
        c1x0 c1x0Var2 = c1x0.l;
        if (c1x0Var2 == null) {
            Context applicationContext = context.getApplicationContext();
            try {
                applicationContext.getClass();
                Context applicationContext2 = applicationContext.getApplicationContext();
                applicationContext2.getClass();
                Class<?> cls = applicationContext2.getClass();
                new StringBuilder(String.valueOf(cls).length() + 72);
                cls.toString();
                throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(cls)));
            } catch (IllegalStateException unused) {
                synchronized (c1x0.j) {
                    try {
                        if (c1x0.l != null) {
                            c1x0Var = c1x0.l;
                        } else {
                            c1x0Var = (c1x0) new f1x0(applicationContext, (byte) 0).get();
                            c1x0.l = c1x0Var;
                            k7n0.I(Level.CONFIG, c1x0Var.a(), null, "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
                        }
                        c1x0Var2 = c1x0Var;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        int i = this.c;
        if (i == -1 || i < this.d.f43322a.get()) {
            synchronized (this) {
                try {
                    int i2 = this.c;
                    if (i2 == -1) {
                        c1x0.b();
                        c1x0Var2.getClass();
                        l6x0VarE = this.b.e(c1x0Var2);
                        this.d = l6x0VarE.f;
                    } else {
                        l6x0VarE = null;
                    }
                    int i3 = this.d.f43322a.get();
                    if (i2 < i3) {
                        c1x0.b();
                        c1x0Var2.getClass();
                        w680 w680VarO = y0x0.O(c1x0Var2.b);
                        if (w680VarO.b()) {
                            w0x0 w0x0Var = (w0x0) w680VarO.a();
                            Uri uriA = z0x0.a();
                            String str = this.f2028a;
                            if (uriA != null) {
                                nuj0Var = (nuj0) w0x0Var.f38371a.get(uriA.toString());
                            } else {
                                w0x0Var.getClass();
                                nuj0Var = null;
                            }
                            String str2 = nuj0Var == null ? null : (String) nuj0Var.get(str);
                            if (str2 == null) {
                                objA = null;
                            } else {
                                try {
                                    objA = b(str2);
                                } catch (IOException | IllegalArgumentException e) {
                                    Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.f2028a), e);
                                    objA = null;
                                }
                            }
                        } else {
                            objA = null;
                        }
                        if (l6x0VarE == null) {
                            l6x0VarE = this.b.e(c1x0Var2);
                        }
                        String str3 = l6x0VarE.c;
                        byte b = 1;
                        if (Build.VERSION.SDK_INT >= 26 && !c1x0Var2.b.getPackageName().equals("com.android.vending") && !str3.startsWith("com.google.android.gms.measurement#")) {
                            ig00 ig00VarA = c1x0Var2.a().a(new k3x0((Object) c1x0Var2, (Object) str3, (byte) 4));
                            ig00VarA.a(new kfr(ig00VarA, b), ank.f1158a);
                        }
                        Object obj2 = ((wcf0) l6x0VarE.a().d).get(this.f2028a);
                        if (obj2 != null) {
                            try {
                                objC = c(obj2);
                            } catch (IOException | ClassCastException e2) {
                                Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.f2028a), e2);
                            }
                        }
                        if (true != w680VarO.b()) {
                            objA = objC;
                        }
                        if (objA == null) {
                            objA = a();
                        }
                        if (objA != null) {
                            e(objA);
                            this.c = i3;
                        }
                    } else {
                        objA = d();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            objA = d();
        }
        objA.getClass();
        return objA;
    }
}
