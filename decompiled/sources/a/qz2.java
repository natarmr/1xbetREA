package a;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class qz2 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29560a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qz2(Object obj, byte b) {
        this.f29560a = b;
        this.b = obj;
    }

    private final void c(int i) {
        if (i >= 40) {
            rz2 rz2Var = (rz2) this.b;
            ehf0 ehf0Var = rz2Var.e;
            if (ehf0Var != null) {
                synchronized (ehf0Var) {
                    try {
                        hz40 hz40Var = (hz40) ehf0Var.b;
                        if (hz40Var != null) {
                            hz40Var.a();
                        }
                        ehf0Var.c = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            rz2Var.e = null;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        switch (this.f29560a) {
            case 0:
                return;
            default:
                td9 td9Var = (td9) this.b;
                synchronized (td9Var) {
                    if (((gbe0) ((WeakReference) td9Var.b).get()) == null) {
                        td9Var.i();
                        break;
                    }
                }
                return;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        switch (this.f29560a) {
            case 0:
                break;
            default:
                onTrimMemory(80);
                break;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        jbe0 jbe0VarD;
        long jL;
        switch (this.f29560a) {
            case 0:
                c(i);
                return;
            default:
                td9 td9Var = (td9) this.b;
                synchronized (td9Var) {
                    try {
                        gbe0 gbe0Var = (gbe0) ((WeakReference) td9Var.b).get();
                        if (gbe0Var != null) {
                            dbe0 dbe0Var = gbe0Var.f11014a;
                            if (i >= 40) {
                                jbe0 jbe0VarD2 = gbe0Var.d();
                                if (jbe0VarD2 != null) {
                                    synchronized (jbe0VarD2.c) {
                                        ((dr8) jbe0VarD2.f16237a.c).q(-1L);
                                        y78 y78Var = jbe0VarD2.b;
                                        y78Var.b = 0;
                                        ((LinkedHashMap) y78Var.c).clear();
                                    }
                                }
                            } else if (i >= 20) {
                                ((b23) td9Var.c).a(dbe0Var.f5800a);
                            } else if (i >= 10 && (jbe0VarD = gbe0Var.d()) != null) {
                                synchronized (jbe0VarD.c) {
                                    jL = ((dr8) jbe0VarD.f16237a.c).l();
                                }
                                long j = jL / 2;
                                synchronized (jbe0VarD.c) {
                                    ((dr8) jbe0VarD.f16237a.c).q(j);
                                }
                            }
                        } else {
                            td9Var.i();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    private final void b() {
    }

    private final void a(Configuration configuration) {
    }
}
