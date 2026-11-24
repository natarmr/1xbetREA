package a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f1x0 implements lin0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8788a;
    public final /* synthetic */ Context b;

    public /* synthetic */ f1x0(Context context, byte b) {
        this.f8788a = b;
        this.b = context;
    }

    @Override // a.lin0
    public final Object get() {
        byte b = this.f8788a;
        Context context = this.b;
        switch (b) {
            case 0:
                Object obj = c1x0.j;
                final zcw0 zcw0Var = new zcw0();
                zcw0Var.f44186a = context;
                context.getClass();
                if (((lin0) zcw0Var.b) == null) {
                    zcw0Var.b = c1x0.m;
                }
                final byte b2 = 1;
                if (((lin0) zcw0Var.c) == null) {
                    zcw0Var.c = hfm0.z(new f1x0((Context) zcw0Var.f44186a, b2));
                }
                if (((a1x0) zcw0Var.d) == null) {
                    zcw0Var.d = new lin0() { // from class: a.a1x0
                        @Override // a.lin0
                        public final Object get() {
                            byte b3 = b2;
                            zcw0 zcw0Var2 = zcw0Var;
                            switch (b3) {
                                case 0:
                                    Context context2 = (Context) zcw0Var2.f44186a;
                                    Object obj2 = c1x0.j;
                                    try {
                                        ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo("com.google.android.gms", 0);
                                        applicationInfo.getClass();
                                        return new ztb0(applicationInfo);
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        return p0.f26122a;
                                    }
                                default:
                                    return new ztb0(new o7x0((lin0) zcw0Var2.b));
                            }
                        }
                    };
                }
                final byte b3 = 0;
                if (((lin0) zcw0Var.e) == null) {
                    Context context2 = (Context) zcw0Var.f44186a;
                    ArrayList arrayList = new ArrayList();
                    z8x0 z8x0Var = new z8x0(new dwj(context2, (byte) 2));
                    new ConcurrentHashMap();
                    Collections.addAll(arrayList, z8x0Var, new d9x0());
                    zcw0Var.e = hfm0.z(new h1x0(arrayList, b3));
                }
                if (((a1x0) zcw0Var.f) == null) {
                    zcw0Var.f = new lin0() { // from class: a.a1x0
                        @Override // a.lin0
                        public final Object get() {
                            byte b4 = b3;
                            zcw0 zcw0Var2 = zcw0Var;
                            switch (b4) {
                                case 0:
                                    Context context3 = (Context) zcw0Var2.f44186a;
                                    Object obj2 = c1x0.j;
                                    try {
                                        ApplicationInfo applicationInfo = context3.getPackageManager().getApplicationInfo("com.google.android.gms", 0);
                                        applicationInfo.getClass();
                                        return new ztb0(applicationInfo);
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        return p0.f26122a;
                                    }
                                default:
                                    return new ztb0(new o7x0((lin0) zcw0Var2.b));
                            }
                        }
                    };
                }
                return new c1x0((Context) zcw0Var.f44186a, (lin0) zcw0Var.b, (lin0) zcw0Var.c, (a1x0) zcw0Var.d, (lin0) zcw0Var.e, (a1x0) zcw0Var.f);
            case 1:
                Object obj2 = c1x0.j;
                return new y2x0(new tzw0(context, gzw0.f12204a, ea3.D, mav.c));
            default:
                Object obj3 = t1x0.f33191a;
                return y0x0.O(context);
        }
    }
}
