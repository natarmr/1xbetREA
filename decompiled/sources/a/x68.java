package a;

import android.graphics.ImageDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class x68 implements okj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40349a = 0;
    public final a780 b;
    public final gbi0 c;
    public final Object d;
    public final Object e;

    public x68(y1x y1xVar, a780 a780Var, gbi0 gbi0Var, uko ukoVar) {
        this.d = y1xVar;
        this.b = a780Var;
        this.c = gbi0Var;
        this.e = ukoVar;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // a.okj
    public final Object a(yje yjeVar) throws Throwable {
        w68 w68Var;
        gbi0 gbi0Var;
        zo4 zo4Var;
        r8m0 r8m0Var;
        byte b = this.f40349a;
        gbi0 gbi0Var2 = this.c;
        yje yjeVar2 = null;
        switch (b) {
            case 0:
                if (yjeVar instanceof w68) {
                    w68Var = (w68) yjeVar;
                    int i = w68Var.l;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        w68Var.l = i - Integer.MIN_VALUE;
                    } else {
                        w68Var = new w68(this, (zje) yjeVar);
                    }
                } else {
                    w68Var = new w68(this, (zje) yjeVar);
                }
                Object objD0 = w68Var.j;
                wne wneVar = wne.f39444a;
                int i2 = w68Var.l;
                try {
                    try {
                        if (i2 == 0) {
                            z1x.P(objD0);
                            w68Var.i = gbi0Var2;
                            w68Var.l = 1;
                            if (gbi0Var2.b(w68Var) != wneVar) {
                            }
                            return wneVar;
                        }
                        if (i2 != 1) {
                            if (i2 != 2) {
                                jf4.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            gbi0Var = w68Var.i;
                            try {
                                z1x.P(objD0);
                                hkj hkjVar = (hkj) objD0;
                                gbi0Var.f();
                                return hkjVar;
                            } catch (Throwable th) {
                                th = th;
                                gbi0Var.f();
                                throw th;
                            }
                        }
                        gbi0Var2 = w68Var.i;
                        z1x.P(objD0);
                        objD0 = qjj.d0(kotlin.coroutines.g.f46065a, new kaw(zo4Var, yjeVar2, (byte) 9), w68Var);
                        if (objD0 != wneVar) {
                            gbi0Var = gbi0Var2;
                            hkj hkjVar2 = (hkj) objD0;
                            gbi0Var.f();
                            return hkjVar2;
                        }
                        return wneVar;
                    } catch (Throwable th2) {
                        th = th2;
                        gbi0Var = gbi0Var2;
                        gbi0Var.f();
                        throw th;
                    }
                    zo4Var = new zo4(this, (byte) 29);
                    w68Var.i = gbi0Var2;
                    w68Var.l = 2;
                } catch (Throwable th3) {
                    th = th3;
                }
                break;
            default:
                if (yjeVar instanceof r8m0) {
                    r8m0Var = (r8m0) yjeVar;
                    int i3 = r8m0Var.l;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        r8m0Var.l = i3 - Integer.MIN_VALUE;
                    } else {
                        r8m0Var = new r8m0(this, (zje) yjeVar);
                    }
                } else {
                    r8m0Var = new r8m0(this, (zje) yjeVar);
                }
                Object obj = r8m0Var.j;
                wne wneVar2 = wne.f39444a;
                int i4 = r8m0Var.l;
                if (i4 == 0) {
                    z1x.P(obj);
                    r8m0Var.i = gbi0Var2;
                    r8m0Var.l = 1;
                    if (gbi0Var2.b(r8m0Var) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gbi0Var2 = r8m0Var.i;
                    z1x.P(obj);
                }
                try {
                    AutoCloseable autoCloseable = (AutoCloseable) this.e;
                    try {
                        hie0 hie0Var = new hie0();
                        hkj hkjVar3 = new hkj(new b78(ImageDecoder.decodeBitmap((ImageDecoder.Source) this.d, new s8m0(this, hie0Var))), hie0Var.f13108a);
                        ay3.L(autoCloseable, null);
                        gbi0Var2.f();
                        return hkjVar3;
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            ay3.L(autoCloseable, th4);
                            throw th5;
                        }
                    }
                } catch (Throwable th6) {
                    gbi0Var2.f();
                    throw th6;
                }
        }
    }

    public x68(ImageDecoder.Source source, AutoCloseable autoCloseable, a780 a780Var, gbi0 gbi0Var) {
        this.d = source;
        this.e = autoCloseable;
        this.b = a780Var;
        this.c = gbi0Var;
    }
}
