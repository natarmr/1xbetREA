package a;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wgw0 implements tdr {
    public static final /* synthetic */ wgw0 b = new wgw0(0);
    public static final /* synthetic */ wgw0 c = new wgw0(1);
    public static final /* synthetic */ wgw0 d = new wgw0(2);
    public static final /* synthetic */ wgw0 e = new wgw0(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39137a;

    public /* synthetic */ wgw0(byte b2) {
        this.f39137a = b2;
    }

    @Override // a.tdr
    public final Object apply(Object obj) {
        switch (this.f39137a) {
            case 0:
                Context context = (Context) obj;
                String strB = ygw0.b;
                if (strB == null) {
                    synchronized (ygw0.class) {
                        try {
                            strB = ygw0.b;
                            if (strB == null) {
                                strB = z0x0.b(context, "com.google.android.gms.measurement");
                                ygw0.b = strB;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return strB;
            case 1:
                zas0 zas0Var = l6x0.h;
                return "";
            case 2:
                l2x0 l2x0Var = (l2x0) obj;
                w7x0 w7x0VarX = y7x0.x();
                if (l2x0Var == null) {
                    return (y7x0) w7x0VarX.e();
                }
                for (q2x0 q2x0Var : l2x0Var.v()) {
                    z7x0 z7x0VarX = a8x0.x();
                    String strR = q2x0Var.r();
                    z7x0VarX.c();
                    ((a8x0) z7x0VarX.b).y(strR);
                    int iF = q2x0Var.F();
                    int i = iF - 1;
                    if (iF == 0) {
                        throw null;
                    }
                    if (i == 0) {
                        long jS = q2x0Var.s();
                        z7x0VarX.c();
                        ((a8x0) z7x0VarX.b).z(jS);
                    } else if (i == 1) {
                        boolean zT = q2x0Var.t();
                        z7x0VarX.c();
                        ((a8x0) z7x0VarX.b).A(zT);
                    } else if (i == 2) {
                        double dU = q2x0Var.u();
                        z7x0VarX.c();
                        ((a8x0) z7x0VarX.b).B(dU);
                    } else if (i == 3) {
                        String strV = q2x0Var.v();
                        z7x0VarX.c();
                        ((a8x0) z7x0VarX.b).C(strV);
                    } else {
                        if (i != 4) {
                            jf4.n("No known flag type");
                            return null;
                        }
                        qdw0 qdw0VarW = q2x0Var.w();
                        z7x0VarX.c();
                        ((a8x0) z7x0VarX.b).D(qdw0VarW);
                    }
                    a8x0 a8x0Var = (a8x0) z7x0VarX.e();
                    w7x0VarX.c();
                    ((y7x0) w7x0VarX.b).D(a8x0Var);
                }
                String strU = l2x0Var.u();
                w7x0VarX.c();
                ((y7x0) w7x0VarX.b).B(strU);
                String strR2 = l2x0Var.r();
                w7x0VarX.c();
                ((y7x0) w7x0VarX.b).z(strR2);
                long jW = l2x0Var.w();
                w7x0VarX.c();
                ((y7x0) w7x0VarX.b).C(jW);
                if (l2x0Var.s()) {
                    qdw0 qdw0VarT = l2x0Var.t();
                    w7x0VarX.c();
                    ((y7x0) w7x0VarX.b).A(qdw0VarT);
                }
                return (y7x0) w7x0VarX.e();
            default:
                s2x0 s2x0Var = (s2x0) obj;
                if (s2x0Var.f31527a != 29514) {
                    throw s2x0Var;
                }
                e4x0 e4x0VarU = f4x0.u();
                u3x0 u3x0VarE = w3x0.E();
                long jCurrentTimeMillis = System.currentTimeMillis();
                u3x0VarE.c();
                ((w3x0) u3x0VarE.b).G(jCurrentTimeMillis);
                e4x0VarU.c();
                ((f4x0) e4x0VarU.b).v((w3x0) u3x0VarE.e());
                return (f4x0) e4x0VarU.e();
        }
    }
}
