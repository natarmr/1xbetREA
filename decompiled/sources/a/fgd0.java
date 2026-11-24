package a;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.authqr.impl.qr.presentation.confirmation.mail.check.params.QrCheckCodeByMailParams;

/* JADX INFO: loaded from: classes3.dex */
public final class fgd0 extends w46 {
    public final vzg0 b;
    public final i1w0 c;
    public final QrCheckCodeByMailParams d;
    public final n5c e;
    public final f5c f;
    public final ubu g;
    public final zoi0 h;
    public final rou i;
    public final duj j;
    public final mne k;
    public final pmi0 l;
    public final rjo m;
    public final m1e n;
    public final ctf0 o;
    public final usd p;
    public final p7m0 q;
    public final p7m0 r;
    public final ol60 s;
    public swp0 t;
    public c4m0 u;
    public c4m0 v;

    public fgd0(vzg0 vzg0Var, i1w0 i1w0Var, QrCheckCodeByMailParams qrCheckCodeByMailParams, n5c n5cVar, f5c f5cVar, ubu ubuVar, zoi0 zoi0Var, rou rouVar, duj dujVar, mne mneVar, pmi0 pmi0Var, rjo rjoVar, m1e m1eVar, ctf0 ctf0Var, usd usdVar, pru pruVar) {
        i1w0Var.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        this.b = vzg0Var;
        this.c = i1w0Var;
        this.d = qrCheckCodeByMailParams;
        this.e = n5cVar;
        this.f = f5cVar;
        this.g = ubuVar;
        this.h = zoi0Var;
        this.i = rouVar;
        this.j = dujVar;
        this.k = mneVar;
        this.l = pmi0Var;
        this.m = rjoVar;
        this.n = m1eVar;
        this.o = ctf0Var;
        this.p = usdVar;
        this.q = q7m0.a(new yfd0("", "", pruVar.a().E0));
        this.r = q7m0.a(kfd0.f18190a);
        this.s = new ol60(3);
        this.t = qrCheckCodeByMailParams.f46361a;
    }

    public final void A() {
        if (StringsKt.W(((yfd0) this.q.getValue()).f42536a)) {
            return;
        }
        sac.V(jiu0.a(this), new prc0(1, this, fgd0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 8), null, this.k.b, new cgd0(this, null, (byte) 0), 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B(zje zjeVar) {
        dgd0 dgd0Var;
        if (zjeVar instanceof dgd0) {
            dgd0Var = (dgd0) zjeVar;
            int i = dgd0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                dgd0Var.k = i - Integer.MIN_VALUE;
            } else {
                dgd0Var = new dgd0(this, zjeVar);
            }
        } else {
            dgd0Var = new dgd0(this, zjeVar);
        }
        Object objA = dgd0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = dgd0Var.k;
        ol60 ol60Var = this.s;
        if (i2 == 0) {
            z1x.P(objA);
            ol60Var.f(ofd0.f25162a);
            ol60Var.f(new pfd0(true));
            swp0 swp0Var = this.t;
            obk0 obk0Var = obk0.SMS;
            dgd0Var.k = 1;
            objA = this.e.a(swp0Var, obk0Var, 0, false, "", dgd0Var);
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
        pfi0 pfi0Var = (pfi0) objA;
        this.t = pfi0Var.b;
        this.b.e("TIME_LEFT_KEY", Long.valueOf((System.currentTimeMillis() / 1000) + ((long) pfi0Var.f26908a)));
        D();
        ol60Var.f(new pfd0(false));
        return Unit.f46060a;
    }

    public final void C(xfd0 xfd0Var) {
        sac.V(jiu0.a(this), new ljc0((byte) 23), null, this.k.c, new s9c0(this, xfd0Var, null, (byte) 11), 10);
    }

    public final void D() {
        Long l = (Long) this.b.a("TIME_LEFT_KEY");
        long jLongValue = ((l != null ? l.longValue() : -1L) * 1000) - System.currentTimeMillis();
        long j = 0;
        yje yjeVar = null;
        if (jLongValue < 0) {
            sac.V(jiu0.a(this), egd0.f7759a, null, null, new wn10(this, j, yjeVar, (byte) 11), 14);
            return;
        }
        c4m0 c4m0Var = this.u;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        this.u = sac.T(new fnq(sac.L(6, jLongValue, 0L), new yg1((Object) this, yjeVar, (byte) 22), (byte) 4), d5c.S(jiu0.a(this), this.k.f22085a), new jjc0(2, this, fgd0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 4, (byte) 8));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
    
        if (r7.i.a(true, r0) == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(a.zje r8) throws a.dwq0, a.zhi0 {
        /*
            r7 = this;
            boolean r0 = r8 instanceof a.zfd0
            if (r0 == 0) goto L13
            r0 = r8
            a.zfd0 r0 = (a.zfd0) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.zfd0 r0 = new a.zfd0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 2
            a.ol60 r4 = r7.s
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r3) goto L2c
            a.z1x.P(r8)
            goto L7c
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            r7 = 0
            return r7
        L33:
            a.z1x.P(r8)
            goto L65
        L37:
            a.z1x.P(r8)
            a.ofd0 r8 = a.ofd0.f25162a
            r4.f(r8)
            a.pfd0 r8 = new a.pfd0
            r8.<init>(r5)
            r4.f(r8)
            a.p7m0 r8 = r7.q
            java.lang.Object r8 = r8.getValue()
            a.yfd0 r8 = (a.yfd0) r8
            java.lang.String r8 = r8.f42536a
            a.swp0 r2 = r7.t
            r0.k = r5
            a.f5c r6 = r7.f
            a.kd30 r6 = r6.f8955a
            java.lang.Object r8 = r6.A(r0, r2, r8)
            if (r8 != r1) goto L60
            goto L62
        L60:
            kotlin.Unit r8 = kotlin.Unit.f46060a
        L62:
            if (r8 != r1) goto L65
            goto L7b
        L65:
            a.ubu r8 = r7.g
            boolean r8 = r8.a()
            r8 = r8 ^ r5
            a.zoi0 r2 = r7.h
            r2.a(r8)
            r0.k = r3
            a.rou r7 = r7.i
            java.lang.Object r7 = r7.a(r5, r0)
            if (r7 != r1) goto L7c
        L7b:
            return r1
        L7c:
            a.vfd0 r7 = a.vfd0.f37325a
            r4.f(r7)
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fgd0.w(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(zje zjeVar) {
        agd0 agd0Var;
        p7m0 p7m0Var;
        Object value;
        if (zjeVar instanceof agd0) {
            agd0Var = (agd0) zjeVar;
            int i = agd0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                agd0Var.k = i - Integer.MIN_VALUE;
            } else {
                agd0Var = new agd0(this, zjeVar);
            }
        } else {
            agd0Var = new agd0(this, zjeVar);
        }
        Object objA = agd0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = agd0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            agd0Var.k = 1;
            objA = this.i.a(false, agd0Var);
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
        String str = ((m2c0) objA).T;
        do {
            p7m0Var = this.q;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, yfd0.a((yfd0) value, null, str, 5)));
        return Unit.f46060a;
    }

    public final void y(Throwable th) {
        final byte b = 0;
        C(new pfd0(false));
        this.m.a(th);
        if ((th instanceof SocketTimeoutException) || (th instanceof UnknownHostException)) {
            C(ufd0.f35573a);
            return;
        }
        boolean z = th instanceof zhi0;
        duj dujVar = this.j;
        if (!z) {
            if (th instanceof dwq0) {
                C(new rfd0(sj3.j0(th.getMessage(), this.o.f(R.string.to_many_requests_try_later, new Object[0]))));
                return;
            } else {
                dujVar.b(th, new Function2(this) { // from class: a.ifd0
                    public final /* synthetic */ fgd0 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b2 = b;
                        fgd0 fgd0Var = this.b;
                        Throwable th2 = (Throwable) obj;
                        String str = (String) obj2;
                        switch (b2) {
                            case 0:
                                th2.getClass();
                                str.getClass();
                                th2.printStackTrace();
                                fgd0Var.C(new tfd0(str));
                                break;
                            default:
                                th2.getClass();
                                str.getClass();
                                th2.printStackTrace();
                                fgd0Var.C(new tfd0(str));
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                return;
            }
        }
        zhi0 zhi0Var = (zhi0) th;
        kuw kuwVar = zhi0Var.c;
        if (kuwVar == i2o.WrongSMSCode || kuwVar == i2o.LimitOfSms) {
            String message = zhi0Var.getMessage();
            C(new rfd0(message != null ? message : ""));
            return;
        }
        if (kuwVar == i2o.CodeAlreadySent) {
            String message2 = zhi0Var.getMessage();
            C(new qfd0(message2 != null ? message2 : ""));
        } else if (kuwVar == i2o.TokenExpiredError) {
            String message3 = zhi0Var.getMessage();
            C(new wfd0(message3 != null ? message3 : ""));
        } else if (kuwVar == i2o.LimitOfSendSms) {
            String message4 = zhi0Var.getMessage();
            C(new tfd0(message4 != null ? message4 : ""));
        } else {
            final byte b2 = 1;
            dujVar.b(zhi0Var, new Function2(this) { // from class: a.ifd0
                public final /* synthetic */ fgd0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = b2;
                    fgd0 fgd0Var = this.b;
                    Throwable th2 = (Throwable) obj;
                    String str = (String) obj2;
                    switch (b3) {
                        case 0:
                            th2.getClass();
                            str.getClass();
                            th2.printStackTrace();
                            fgd0Var.C(new tfd0(str));
                            break;
                        default:
                            th2.getClass();
                            str.getClass();
                            th2.printStackTrace();
                            fgd0Var.C(new tfd0(str));
                            break;
                    }
                    return Unit.f46060a;
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z(zje zjeVar) {
        bgd0 bgd0Var;
        if (zjeVar instanceof bgd0) {
            bgd0Var = (bgd0) zjeVar;
            int i = bgd0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                bgd0Var.k = i - Integer.MIN_VALUE;
            } else {
                bgd0Var = new bgd0(this, zjeVar);
            }
        } else {
            bgd0Var = new bgd0(this, zjeVar);
        }
        Object obj = bgd0Var.i;
        Object obj2 = wne.f39444a;
        int i2 = bgd0Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            bgd0Var.k = 1;
            if (x(bgd0Var) == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        long j = this.d.b;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        vzg0 vzg0Var = this.b;
        Long l = (Long) vzg0Var.a("TIME_LEFT_KEY");
        if ((l != null ? l.longValue() : -1L) < 0) {
            vzg0Var.e("TIME_LEFT_KEY", Long.valueOf(jCurrentTimeMillis + j));
        }
        D();
        return Unit.f46060a;
    }
}
