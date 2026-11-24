package a;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.authqr.impl.qr.presentation.confirmation.sms.send.params.QrSendConfirmationSmsParams;

/* JADX INFO: loaded from: classes3.dex */
public final class fkd0 extends w46 {
    public final i1w0 b;
    public final QrSendConfirmationSmsParams c;
    public final duj d;
    public final n5c e;
    public final mne f;
    public final rou g;
    public final m1e h;
    public final wpt i;
    public final s64 j;
    public final p7m0 k;
    public final ol60 l;
    public c4m0 m;

    public fkd0(i1w0 i1w0Var, QrSendConfirmationSmsParams qrSendConfirmationSmsParams, duj dujVar, n5c n5cVar, mne mneVar, rou rouVar, m1e m1eVar, wpt wptVar, s64 s64Var) {
        i1w0Var.getClass();
        m1eVar.getClass();
        this.b = i1w0Var;
        this.c = qrSendConfirmationSmsParams;
        this.d = dujVar;
        this.e = n5cVar;
        this.f = mneVar;
        this.g = rouVar;
        this.h = m1eVar;
        this.i = wptVar;
        this.j = s64Var;
        zie0 zie0Var = obk0.b;
        List list = qrSendConfirmationSmsParams.b;
        zie0Var.getClass();
        this.k = q7m0.a(new yjd0("", true, zie0.d(list), zie0.f(list), zie0.e(list), zie0.c(list)));
        this.l = new ol60(3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A(zje zjeVar) {
        ckd0 ckd0Var;
        if (zjeVar instanceof ckd0) {
            ckd0Var = (ckd0) zjeVar;
            int i = ckd0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ckd0Var.k = i - Integer.MIN_VALUE;
            } else {
                ckd0Var = new ckd0(this, zjeVar);
            }
        } else {
            ckd0Var = new ckd0(this, zjeVar);
        }
        Object objA = ckd0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ckd0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            swp0 swp0Var = this.c.f46366a;
            obk0 obk0Var = obk0.SMS;
            String strA = this.i.a();
            ckd0Var.k = 1;
            objA = this.e.a(swp0Var, obk0Var, 0, false, strA, ckd0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        this.b.d(new zlb0((pfi0) objA, yed0.f42481a, this, (byte) 8));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B(zje zjeVar) {
        dkd0 dkd0Var;
        if (zjeVar instanceof dkd0) {
            dkd0Var = (dkd0) zjeVar;
            int i = dkd0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                dkd0Var.k = i - Integer.MIN_VALUE;
            } else {
                dkd0Var = new dkd0(this, zjeVar);
            }
        } else {
            dkd0Var = new dkd0(this, zjeVar);
        }
        Object objA = dkd0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = dkd0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            swp0 swp0Var = this.c.f46366a;
            obk0 obk0Var = obk0.TELEGRAM;
            String strA = this.i.a();
            dkd0Var.k = 1;
            objA = this.e.a(swp0Var, obk0Var, 0, false, strA, dkd0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        this.b.d(new zlb0((pfi0) objA, yed0.c, this, (byte) 8));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C(zje zjeVar) {
        ekd0 ekd0Var;
        if (zjeVar instanceof ekd0) {
            ekd0Var = (ekd0) zjeVar;
            int i = ekd0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ekd0Var.k = i - Integer.MIN_VALUE;
            } else {
                ekd0Var = new ekd0(this, zjeVar);
            }
        } else {
            ekd0Var = new ekd0(this, zjeVar);
        }
        Object objA = ekd0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ekd0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            swp0 swp0Var = this.c.f46366a;
            obk0 obk0Var = obk0.VOICE_SMS;
            String strA = this.i.a();
            ekd0Var.k = 1;
            objA = this.e.a(swp0Var, obk0Var, 0, false, strA, ekd0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        this.b.d(new zlb0((pfi0) objA, yed0.b, this, (byte) 8));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(zje zjeVar) {
        akd0 akd0Var;
        p7m0 p7m0Var;
        Object value;
        if (zjeVar instanceof akd0) {
            akd0Var = (akd0) zjeVar;
            int i = akd0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                akd0Var.k = i - Integer.MIN_VALUE;
            } else {
                akd0Var = new akd0(this, zjeVar);
            }
        } else {
            akd0Var = new akd0(this, zjeVar);
        }
        Object objA = akd0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = akd0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            akd0Var.k = 1;
            objA = this.g.a(false, akd0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        String str = ((m2c0) objA).Z;
        do {
            p7m0Var = this.k;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, yjd0.a((yjd0) value, str, false, 62)));
        return Unit.f46060a;
    }

    public final void x(Throwable th) {
        if ((th instanceof SocketTimeoutException) || (th instanceof UnknownHostException)) {
            y(tjd0.f34042a);
            return;
        }
        boolean z = th instanceof zhi0;
        duj dujVar = this.d;
        if (!z) {
            final byte b = 1;
            dujVar.b(th, new Function2(this) { // from class: a.pjd0
                public final /* synthetic */ fkd0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b2 = b;
                    fkd0 fkd0Var = this.b;
                    Throwable th2 = (Throwable) obj;
                    String str = (String) obj2;
                    switch (b2) {
                        case 0:
                            th2.getClass();
                            str.getClass();
                            th2.printStackTrace();
                            fkd0Var.y(new ujd0(str));
                            break;
                        default:
                            th2.getClass();
                            str.getClass();
                            th2.printStackTrace();
                            fkd0Var.y(new ujd0(str));
                            break;
                    }
                    return Unit.f46060a;
                }
            });
        } else if (((zhi0) th).c != i2o.TokenExpiredError) {
            final byte b2 = 0;
            dujVar.b(th, new Function2(this) { // from class: a.pjd0
                public final /* synthetic */ fkd0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = b2;
                    fkd0 fkd0Var = this.b;
                    Throwable th2 = (Throwable) obj;
                    String str = (String) obj2;
                    switch (b3) {
                        case 0:
                            th2.getClass();
                            str.getClass();
                            th2.printStackTrace();
                            fkd0Var.y(new ujd0(str));
                            break;
                        default:
                            th2.getClass();
                            str.getClass();
                            th2.printStackTrace();
                            fkd0Var.y(new ujd0(str));
                            break;
                    }
                    return Unit.f46060a;
                }
            });
        } else {
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            y(new qjd0(message));
        }
    }

    public final void y(xjd0 xjd0Var) {
        this.l.f(xjd0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z(zje zjeVar) {
        bkd0 bkd0Var;
        if (zjeVar instanceof bkd0) {
            bkd0Var = (bkd0) zjeVar;
            int i = bkd0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                bkd0Var.k = i - Integer.MIN_VALUE;
            } else {
                bkd0Var = new bkd0(this, zjeVar);
            }
        } else {
            bkd0Var = new bkd0(this, zjeVar);
        }
        Object objA = bkd0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = bkd0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            swp0 swp0Var = this.c.f46366a;
            obk0 obk0Var = obk0.FLASH_CALL;
            String strA = this.i.a();
            bkd0Var.k = 1;
            objA = this.e.a(swp0Var, obk0Var, 0, false, strA, bkd0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        this.b.d(new zlb0((pfi0) objA, yed0.d, this, (byte) 8));
        return Unit.f46060a;
    }
}
