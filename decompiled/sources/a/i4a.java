package a;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i4a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14137a = 0;
    public final /* synthetic */ j4a b;
    public final /* synthetic */ Executor c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ tu9 g;

    public /* synthetic */ i4a(j4a j4aVar, Context context, Executor executor, int i, tu9 tu9Var, long j) {
        this.b = j4aVar;
        this.f = context;
        this.c = executor;
        this.e = i;
        this.g = tu9Var;
        this.d = j;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0181  */
    /* JADX WARN: Code duplicated, block: B:61:0x01cd A[Catch: all -> 0x0230, TryCatch #0 {all -> 0x0230, blocks: (B:7:0x0030, B:9:0x0038, B:11:0x005d, B:13:0x0078, B:15:0x0086, B:17:0x00a7, B:24:0x00b9, B:25:0x00e2, B:27:0x00e8, B:28:0x00f8, B:30:0x012a, B:31:0x012d, B:32:0x012f, B:36:0x0134, B:40:0x013e, B:41:0x013f, B:42:0x014b, B:53:0x016f, B:57:0x0186, B:59:0x01bf, B:85:0x0225, B:60:0x01c3, B:61:0x01cd, B:62:0x01d0, B:66:0x01d5, B:68:0x01d9, B:69:0x01db, B:73:0x01e0, B:77:0x01e7, B:78:0x01e8, B:80:0x01ec, B:81:0x0215, B:83:0x0219, B:84:0x021d, B:90:0x022f, B:49:0x0153, B:50:0x0160, B:51:0x0161, B:52:0x016e, B:71:0x01dd, B:72:0x01df, B:64:0x01d2, B:65:0x01d4), top: B:94:0x0030, inners: #1, #6 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d9 A[Catch: all -> 0x0230, TryCatch #0 {all -> 0x0230, blocks: (B:7:0x0030, B:9:0x0038, B:11:0x005d, B:13:0x0078, B:15:0x0086, B:17:0x00a7, B:24:0x00b9, B:25:0x00e2, B:27:0x00e8, B:28:0x00f8, B:30:0x012a, B:31:0x012d, B:32:0x012f, B:36:0x0134, B:40:0x013e, B:41:0x013f, B:42:0x014b, B:53:0x016f, B:57:0x0186, B:59:0x01bf, B:85:0x0225, B:60:0x01c3, B:61:0x01cd, B:62:0x01d0, B:66:0x01d5, B:68:0x01d9, B:69:0x01db, B:73:0x01e0, B:77:0x01e7, B:78:0x01e8, B:80:0x01ec, B:81:0x0215, B:83:0x0219, B:84:0x021d, B:90:0x022f, B:49:0x0153, B:50:0x0160, B:51:0x0161, B:52:0x016e, B:71:0x01dd, B:72:0x01df, B:64:0x01d2, B:65:0x01d4), top: B:94:0x0030, inners: #1, #6 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e8 A[Catch: all -> 0x0230, TryCatch #0 {all -> 0x0230, blocks: (B:7:0x0030, B:9:0x0038, B:11:0x005d, B:13:0x0078, B:15:0x0086, B:17:0x00a7, B:24:0x00b9, B:25:0x00e2, B:27:0x00e8, B:28:0x00f8, B:30:0x012a, B:31:0x012d, B:32:0x012f, B:36:0x0134, B:40:0x013e, B:41:0x013f, B:42:0x014b, B:53:0x016f, B:57:0x0186, B:59:0x01bf, B:85:0x0225, B:60:0x01c3, B:61:0x01cd, B:62:0x01d0, B:66:0x01d5, B:68:0x01d9, B:69:0x01db, B:73:0x01e0, B:77:0x01e7, B:78:0x01e8, B:80:0x01ec, B:81:0x0215, B:83:0x0219, B:84:0x021d, B:90:0x022f, B:49:0x0153, B:50:0x0160, B:51:0x0161, B:52:0x016e, B:71:0x01dd, B:72:0x01df, B:64:0x01d2, B:65:0x01d4), top: B:94:0x0030, inners: #1, #6 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01ec A[Catch: all -> 0x0230, TryCatch #0 {all -> 0x0230, blocks: (B:7:0x0030, B:9:0x0038, B:11:0x005d, B:13:0x0078, B:15:0x0086, B:17:0x00a7, B:24:0x00b9, B:25:0x00e2, B:27:0x00e8, B:28:0x00f8, B:30:0x012a, B:31:0x012d, B:32:0x012f, B:36:0x0134, B:40:0x013e, B:41:0x013f, B:42:0x014b, B:53:0x016f, B:57:0x0186, B:59:0x01bf, B:85:0x0225, B:60:0x01c3, B:61:0x01cd, B:62:0x01d0, B:66:0x01d5, B:68:0x01d9, B:69:0x01db, B:73:0x01e0, B:77:0x01e7, B:78:0x01e8, B:80:0x01ec, B:81:0x0215, B:83:0x0219, B:84:0x021d, B:90:0x022f, B:49:0x0153, B:50:0x0160, B:51:0x0161, B:52:0x016e, B:71:0x01dd, B:72:0x01df, B:64:0x01d2, B:65:0x01d4), top: B:94:0x0030, inners: #1, #6 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0215 A[Catch: all -> 0x0230, TryCatch #0 {all -> 0x0230, blocks: (B:7:0x0030, B:9:0x0038, B:11:0x005d, B:13:0x0078, B:15:0x0086, B:17:0x00a7, B:24:0x00b9, B:25:0x00e2, B:27:0x00e8, B:28:0x00f8, B:30:0x012a, B:31:0x012d, B:32:0x012f, B:36:0x0134, B:40:0x013e, B:41:0x013f, B:42:0x014b, B:53:0x016f, B:57:0x0186, B:59:0x01bf, B:85:0x0225, B:60:0x01c3, B:61:0x01cd, B:62:0x01d0, B:66:0x01d5, B:68:0x01d9, B:69:0x01db, B:73:0x01e0, B:77:0x01e7, B:78:0x01e8, B:80:0x01ec, B:81:0x0215, B:83:0x0219, B:84:0x021d, B:90:0x022f, B:49:0x0153, B:50:0x0160, B:51:0x0161, B:52:0x016e, B:71:0x01dd, B:72:0x01df, B:64:0x01d2, B:65:0x01d4), top: B:94:0x0030, inners: #1, #6 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0219 A[Catch: all -> 0x0230, TryCatch #0 {all -> 0x0230, blocks: (B:7:0x0030, B:9:0x0038, B:11:0x005d, B:13:0x0078, B:15:0x0086, B:17:0x00a7, B:24:0x00b9, B:25:0x00e2, B:27:0x00e8, B:28:0x00f8, B:30:0x012a, B:31:0x012d, B:32:0x012f, B:36:0x0134, B:40:0x013e, B:41:0x013f, B:42:0x014b, B:53:0x016f, B:57:0x0186, B:59:0x01bf, B:85:0x0225, B:60:0x01c3, B:61:0x01cd, B:62:0x01d0, B:66:0x01d5, B:68:0x01d9, B:69:0x01db, B:73:0x01e0, B:77:0x01e7, B:78:0x01e8, B:80:0x01ec, B:81:0x0215, B:83:0x0219, B:84:0x021d, B:90:0x022f, B:49:0x0153, B:50:0x0160, B:51:0x0161, B:52:0x016e, B:71:0x01dd, B:72:0x01df, B:64:0x01d2, B:65:0x01d4), top: B:94:0x0030, inners: #1, #6 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x021d A[Catch: all -> 0x0230, TryCatch #0 {all -> 0x0230, blocks: (B:7:0x0030, B:9:0x0038, B:11:0x005d, B:13:0x0078, B:15:0x0086, B:17:0x00a7, B:24:0x00b9, B:25:0x00e2, B:27:0x00e8, B:28:0x00f8, B:30:0x012a, B:31:0x012d, B:32:0x012f, B:36:0x0134, B:40:0x013e, B:41:0x013f, B:42:0x014b, B:53:0x016f, B:57:0x0186, B:59:0x01bf, B:85:0x0225, B:60:0x01c3, B:61:0x01cd, B:62:0x01d0, B:66:0x01d5, B:68:0x01d9, B:69:0x01db, B:73:0x01e0, B:77:0x01e7, B:78:0x01e8, B:80:0x01ec, B:81:0x0215, B:83:0x0219, B:84:0x021d, B:90:0x022f, B:49:0x0153, B:50:0x0160, B:51:0x0161, B:52:0x016e, B:71:0x01dd, B:72:0x01df, B:64:0x01d2, B:65:0x01d4), top: B:94:0x0030, inners: #1, #6 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:80:0x01ec, please report this as an issue */
    @Override // java.lang.Runnable
    public final void run() {
        eag0 eag0VarB;
        switch (this.f14137a) {
            case 0:
                j4a j4aVar = this.b;
                Context context = this.f;
                Executor executor = this.c;
                int i = this.e;
                tu9 tu9Var = this.g;
                long j = this.d;
                Trace.beginSection("CX:initAndRetryRecursively");
                try {
                    try {
                        fz9 fz9VarL = j4aVar.c.l();
                        try {
                            if (fz9VarL == null) {
                                throw new nbx(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
                            }
                            q15 q15Var = new q15(j4aVar.d, j4aVar.e);
                            n2a n2aVarJ = j4aVar.c.j();
                            context.getClass();
                            s88 s88Var = new s88(context, n2aVarJ);
                            long jP = j4aVar.c.p();
                            if (j4aVar.c.y() == null) {
                                throw new nbx(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                            }
                            u3a u3aVar = new u3a(context);
                            j4aVar.i = u3aVar;
                            trm0 trm0Var = new trm0(u3aVar);
                            j4aVar.j = trm0Var;
                            j4aVar.g = fz9VarL.a(context, q15Var, n2aVarJ, jP, j4aVar.c, trm0Var);
                            if (j4aVar.c.x() == null) {
                                throw new nbx(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
                            }
                            h3a h3aVar = new h3a(context, (cbi) ((n0o0) j4aVar.g.g).getValue(), j4aVar.g.d());
                            j4aVar.h = h3aVar;
                            j4aVar.j.c = h3aVar;
                            if (executor instanceof dz9) {
                                ((dz9) executor).a(j4aVar.g);
                            }
                            j4aVar.f15874a.d(j4aVar.g);
                            wy9 wy9Var = (wy9) j4aVar.g.e;
                            wy9Var.b(j4aVar.f15874a);
                            j4aVar.k = new nhf0(j4aVar.f15874a, wy9Var, j4aVar.i, j4aVar.j);
                            Iterator it = j4aVar.f15874a.c().iterator();
                            while (it.hasNext()) {
                                ((s0a) it.next()).h().D(j4aVar.k);
                            }
                            j4aVar.n.g(s88Var, j4aVar.g, j4aVar.f15874a);
                            z1a z1aVar = j4aVar.n;
                            h3a h3aVar2 = j4aVar.h;
                            z1aVar.getClass();
                            h3aVar2.getClass();
                            z1aVar.m.add(h3aVar2);
                            z1a z1aVar2 = j4aVar.n;
                            wy9 wy9Var2 = (wy9) j4aVar.g.e;
                            z1aVar2.getClass();
                            wy9Var2.getClass();
                            z1aVar2.m.add(wy9Var2);
                            s88Var.w(j4aVar.f15874a);
                            if (i > 1) {
                                j4a.b(null);
                            }
                            synchronized (j4aVar.b) {
                                j4aVar.p = 4;
                                break;
                            }
                            tu9Var.b(null);
                            Trace.endSection();
                            return;
                        } catch (nbx e) {
                            e = e;
                            f2a f2aVar = new f2a(e, j);
                            eag0VarB = j4aVar.l.b(f2aVar);
                            j4a.b(f2aVar);
                            if (eag0VarB.b) {
                                synchronized (j4aVar.b) {
                                    j4aVar.p = 3;
                                    if (eag0VarB.c) {
                                        synchronized (j4aVar.b) {
                                            j4aVar.p = 4;
                                            tu9Var.b(null);
                                        }
                                    } else {
                                        if (e instanceof w3a) {
                                            String str = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((w3a) e).f38492a;
                                            l8x.Y("CameraX", str, e);
                                            tu9Var.d(new nbx(new k3a(str)));
                                        } else if (e instanceof nbx) {
                                            tu9Var.d(e);
                                        } else {
                                            tu9Var.d(new nbx(e));
                                        }
                                        j4aVar.n.f();
                                    }
                                }
                            } else {
                                synchronized (j4aVar.b) {
                                    j4aVar.p = 3;
                                    if (eag0VarB.c) {
                                        synchronized (j4aVar.b) {
                                            j4aVar.p = 4;
                                            tu9Var.b(null);
                                        }
                                    } else {
                                        if (e instanceof w3a) {
                                            String str2 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((w3a) e).f38492a;
                                            l8x.Y("CameraX", str2, e);
                                            tu9Var.d(new nbx(new k3a(str2)));
                                        } else if (e instanceof nbx) {
                                            tu9Var.d(e);
                                        } else {
                                            tu9Var.d(new nbx(e));
                                        }
                                        j4aVar.n.f();
                                    }
                                }
                            }
                        } catch (w3a e2) {
                            e = e2;
                            f2a f2aVar2 = new f2a(e, j);
                            eag0VarB = j4aVar.l.b(f2aVar2);
                            j4a.b(f2aVar2);
                            if (eag0VarB.b) {
                                synchronized (j4aVar.b) {
                                    j4aVar.p = 3;
                                    if (eag0VarB.c) {
                                        synchronized (j4aVar.b) {
                                            j4aVar.p = 4;
                                            tu9Var.b(null);
                                        }
                                    } else {
                                        if (e instanceof w3a) {
                                            String str3 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((w3a) e).f38492a;
                                            l8x.Y("CameraX", str3, e);
                                            tu9Var.d(new nbx(new k3a(str3)));
                                        } else if (e instanceof nbx) {
                                            tu9Var.d(e);
                                        } else {
                                            tu9Var.d(new nbx(e));
                                        }
                                        j4aVar.n.f();
                                    }
                                }
                            } else {
                                synchronized (j4aVar.b) {
                                    j4aVar.p = 3;
                                    if (eag0VarB.c) {
                                        synchronized (j4aVar.b) {
                                            j4aVar.p = 4;
                                            tu9Var.b(null);
                                        }
                                    } else {
                                        if (e instanceof w3a) {
                                            String str4 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((w3a) e).f38492a;
                                            l8x.Y("CameraX", str4, e);
                                            tu9Var.d(new nbx(new k3a(str4)));
                                        } else if (e instanceof nbx) {
                                            tu9Var.d(e);
                                        } else {
                                            tu9Var.d(new nbx(e));
                                        }
                                        j4aVar.n.f();
                                    }
                                }
                            }
                        } catch (RuntimeException e3) {
                            e = e3;
                            f2a f2aVar3 = new f2a(e, j);
                            eag0VarB = j4aVar.l.b(f2aVar3);
                            j4a.b(f2aVar3);
                            if (eag0VarB.b) {
                                synchronized (j4aVar.b) {
                                    j4aVar.p = 3;
                                    if (eag0VarB.c) {
                                        synchronized (j4aVar.b) {
                                            j4aVar.p = 4;
                                            tu9Var.b(null);
                                        }
                                    } else {
                                        if (e instanceof w3a) {
                                            String str5 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((w3a) e).f38492a;
                                            l8x.Y("CameraX", str5, e);
                                            tu9Var.d(new nbx(new k3a(str5)));
                                        } else if (e instanceof nbx) {
                                            tu9Var.d(e);
                                        } else {
                                            tu9Var.d(new nbx(e));
                                        }
                                        j4aVar.n.f();
                                    }
                                }
                            } else {
                                synchronized (j4aVar.b) {
                                    j4aVar.p = 3;
                                    if (eag0VarB.c) {
                                        synchronized (j4aVar.b) {
                                            j4aVar.p = 4;
                                            tu9Var.b(null);
                                        }
                                    } else {
                                        if (e instanceof w3a) {
                                            String str6 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((w3a) e).f38492a;
                                            l8x.Y("CameraX", str6, e);
                                            tu9Var.d(new nbx(new k3a(str6)));
                                        } else if (e instanceof nbx) {
                                            tu9Var.d(e);
                                        } else {
                                            tu9Var.d(new nbx(e));
                                        }
                                        j4aVar.n.f();
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } catch (nbx e4) {
                    e = e4;
                } catch (w3a e5) {
                    e = e5;
                } catch (RuntimeException e6) {
                    e = e6;
                }
                f2a f2aVar4 = new f2a(e, j);
                eag0VarB = j4aVar.l.b(f2aVar4);
                j4a.b(f2aVar4);
                if (eag0VarB.b || i >= Integer.MAX_VALUE) {
                    synchronized (j4aVar.b) {
                        j4aVar.p = 3;
                        break;
                    }
                    if (eag0VarB.c) {
                        synchronized (j4aVar.b) {
                            j4aVar.p = 4;
                            break;
                        }
                        tu9Var.b(null);
                    } else if (e instanceof w3a) {
                        String str7 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((w3a) e).f38492a;
                        l8x.Y("CameraX", str7, e);
                        tu9Var.d(new nbx(new k3a(str7)));
                    } else if (e instanceof nbx) {
                        tu9Var.d(e);
                    } else {
                        tu9Var.d(new nbx(e));
                    }
                    Trace.endSection();
                    return;
                }
                l8x.F0("CameraX", "Retry init. Start time " + j + " current time " + SystemClock.elapsedRealtime(), e);
                Handler handler = j4aVar.e;
                i4a i4aVar = new i4a(j4aVar, executor, j, i, context, tu9Var);
                long j2 = (long) eag0VarB.f7464a;
                if (Build.VERSION.SDK_INT >= 28) {
                    ia3.C(handler, i4aVar, j2);
                } else {
                    Message messageObtain = Message.obtain(handler, i4aVar);
                    messageObtain.obj = "retry_token";
                    handler.sendMessageDelayed(messageObtain, j2);
                }
                j4aVar.n.f();
                Trace.endSection();
                return;
            default:
                j4a j4aVar2 = this.b;
                Executor executor2 = this.c;
                executor2.execute(new i4a(j4aVar2, this.f, executor2, this.e + 1, this.g, this.d));
                return;
        }
    }

    public /* synthetic */ i4a(j4a j4aVar, Executor executor, long j, int i, Context context, tu9 tu9Var) {
        this.b = j4aVar;
        this.c = executor;
        this.d = j;
        this.e = i;
        this.f = context;
        this.g = tu9Var;
    }
}
