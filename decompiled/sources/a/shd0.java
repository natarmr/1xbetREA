package a;

import android.text.SpannableStringBuilder;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.authqr.impl.qr.presentation.confirmation.sms.check.params.QrCheckCodeBySmsParams;

/* JADX INFO: loaded from: classes3.dex */
public final class shd0 extends w46 {
    public final vzg0 b;
    public final i1w0 c;
    public final QrCheckCodeBySmsParams d;
    public final f5c e;
    public final ubu f;
    public final zoi0 g;
    public final rou h;
    public final duj i;
    public final mne j;
    public final pmi0 k;
    public final rjo l;
    public final m1e m;
    public final yuu n;
    public final usd o;
    public final ctf0 p;
    public final nh70 q;
    public final p7m0 r;
    public final p7m0 s;
    public final p7m0 t;
    public final ol60 u;
    public final swp0 v;
    public c4m0 w;
    public c4m0 x;
    public bby y;

    public shd0(vzg0 vzg0Var, i1w0 i1w0Var, QrCheckCodeBySmsParams qrCheckCodeBySmsParams, f5c f5cVar, ubu ubuVar, zoi0 zoi0Var, rou rouVar, duj dujVar, mne mneVar, pmi0 pmi0Var, rjo rjoVar, m1e m1eVar, yuu yuuVar, usd usdVar, pru pruVar, ctf0 ctf0Var, nh70 nh70Var) {
        i1w0Var.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        this.b = vzg0Var;
        this.c = i1w0Var;
        this.d = qrCheckCodeBySmsParams;
        this.e = f5cVar;
        this.f = ubuVar;
        this.g = zoi0Var;
        this.h = rouVar;
        this.i = dujVar;
        this.j = mneVar;
        this.k = pmi0Var;
        this.l = rjoVar;
        this.m = m1eVar;
        this.n = yuuVar;
        this.o = usdVar;
        this.p = ctf0Var;
        this.q = nh70Var;
        p7m0 p7m0VarA = q7m0.a(tgd0.f33905a);
        this.r = p7m0VarA;
        p7m0 p7m0VarA2 = q7m0.a("");
        this.s = p7m0VarA2;
        this.t = q7m0.a(new lhd0(new SpannableStringBuilder(""), qrCheckCodeBySmsParams.c, pruVar.a().E0, mgd0.f21737a, x(), new rgd0(ctf0Var.b.a(R.string.confirm, Arrays.copyOf(new Object[0], 0)), false), wgd0.f39111a));
        this.u = new ol60(3);
        this.v = qrCheckCodeBySmsParams.f46365a;
        yje yjeVar = null;
        p6d p6dVar = new p6d(p7m0VarA2, m1eVar.b(), new ib60(this, yjeVar, (byte) 7), (byte) 1);
        bvc bvcVarA = jiu0.a(this);
        rwj rwjVar = mneVar.f22085a;
        sac.T(p6dVar, d5c.S(bvcVarA, rwjVar), ohd0.h);
        sac.T(new fnq(p7m0VarA, new s9c0(this, yjeVar, (byte) 12), (byte) 4), d5c.S(jiu0.a(this), rwjVar), new st20(2, yjeVar, (byte) 17));
    }

    public final void A() {
        if (StringsKt.W((String) this.s.getValue())) {
            return;
        }
        sac.V(jiu0.a(this), new prc0(1, this, shd0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 10), null, this.j.b, new qhd0(this, null, (byte) 0), 10);
    }

    public final void B(khd0 khd0Var) {
        this.u.f(khd0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        if (r10 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        if (r10 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c1, code lost:
    
        if (r10 == r1) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(a.zje r10) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.shd0.C(a.zje):java.lang.Object");
    }

    public final void D(long j) {
        long j2 = j / 1000;
        Object ugd0Var = j2 == 0 ? sgd0.f32155a : new ugd0(j2);
        p7m0 p7m0Var = this.r;
        p7m0Var.getClass();
        p7m0Var.o(null, ugd0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        if (r7.h.a(true, r0) == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(a.zje r8) throws a.dwq0, a.zhi0 {
        /*
            r7 = this;
            boolean r0 = r8 instanceof a.nhd0
            if (r0 == 0) goto L13
            r0 = r8
            a.nhd0 r0 = (a.nhd0) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.nhd0 r0 = new a.nhd0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 2
            a.ol60 r4 = r7.u
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r3) goto L2c
            a.z1x.P(r8)
            goto L7a
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            r7 = 0
            return r7
        L33:
            a.z1x.P(r8)
            goto L63
        L37:
            a.z1x.P(r8)
            a.ahd0 r8 = a.ahd0.f870a
            r4.f(r8)
            a.chd0 r8 = new a.chd0
            r8.<init>(r5)
            r4.f(r8)
            a.p7m0 r8 = r7.s
            java.lang.Object r8 = r8.getValue()
            java.lang.String r8 = (java.lang.String) r8
            r0.k = r5
            a.f5c r2 = r7.e
            a.kd30 r2 = r2.f8955a
            a.swp0 r6 = r7.v
            java.lang.Object r8 = r2.A(r0, r6, r8)
            if (r8 != r1) goto L5e
            goto L60
        L5e:
            kotlin.Unit r8 = kotlin.Unit.f46060a
        L60:
            if (r8 != r1) goto L63
            goto L79
        L63:
            a.ubu r8 = r7.f
            boolean r8 = r8.a()
            r8 = r8 ^ r5
            a.zoi0 r2 = r7.g
            r2.a(r8)
            r0.k = r3
            a.rou r7 = r7.h
            java.lang.Object r7 = r7.a(r5, r0)
            if (r7 != r1) goto L7a
        L79:
            return r1
        L7a:
            a.ihd0 r7 = a.ihd0.f14775a
            r4.f(r7)
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.shd0.w(a.zje):java.lang.Object");
    }

    public final qgd0 x() {
        vgd0 vgd0Var = (vgd0) this.r.getValue();
        if (vgd0Var instanceof sgd0) {
            String strA = this.p.b.a(R.string.send_again, Arrays.copyOf(new Object[0], 0));
            ngd0 ngd0Var = ngd0.f23480a;
            return new pgd0(strA);
        }
        if (Intrinsics.d(vgd0Var, tgd0.f33905a) || (vgd0Var instanceof ugd0)) {
            return ogd0.f25214a;
        }
        t9f.b();
        return null;
    }

    public final void y(Throwable th) {
        final byte b = 0;
        B(new chd0(false));
        this.l.a(th);
        if ((th instanceof SocketTimeoutException) || (th instanceof UnknownHostException)) {
            B(hhd0.f13058a);
            return;
        }
        boolean z = th instanceof zhi0;
        duj dujVar = this.i;
        if (!z) {
            if (th instanceof dwq0) {
                B(new ehd0(sj3.j0(th.getMessage(), this.p.f(R.string.to_many_requests_try_later, new Object[0]))));
                return;
            } else {
                dujVar.b(th, new Function2(this) { // from class: a.lgd0
                    public final /* synthetic */ shd0 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b2 = b;
                        shd0 shd0Var = this.b;
                        Throwable th2 = (Throwable) obj;
                        String str = (String) obj2;
                        switch (b2) {
                            case 0:
                                th2.getClass();
                                str.getClass();
                                th2.printStackTrace();
                                shd0Var.B(new ghd0(str));
                                break;
                            default:
                                th2.getClass();
                                str.getClass();
                                th2.printStackTrace();
                                shd0Var.B(new ghd0(str));
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
            B(new ehd0(message != null ? message : ""));
            return;
        }
        if (kuwVar == i2o.CodeAlreadySent) {
            String message2 = zhi0Var.getMessage();
            B(new dhd0(message2 != null ? message2 : ""));
        } else if (kuwVar == i2o.TokenExpiredError) {
            String message3 = zhi0Var.getMessage();
            B(new jhd0(message3 != null ? message3 : ""));
        } else if (kuwVar == i2o.LimitOfSendSms) {
            String message4 = zhi0Var.getMessage();
            B(new ghd0(message4 != null ? message4 : ""));
        } else {
            final byte b2 = 1;
            dujVar.b(zhi0Var, new Function2(this) { // from class: a.lgd0
                public final /* synthetic */ shd0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = b2;
                    shd0 shd0Var = this.b;
                    Throwable th2 = (Throwable) obj;
                    String str = (String) obj2;
                    switch (b3) {
                        case 0:
                            th2.getClass();
                            str.getClass();
                            th2.printStackTrace();
                            shd0Var.B(new ghd0(str));
                            break;
                        default:
                            th2.getClass();
                            str.getClass();
                            th2.printStackTrace();
                            shd0Var.B(new ghd0(str));
                            break;
                    }
                    return Unit.f46060a;
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object z(zje zjeVar) {
        phd0 phd0Var;
        if (zjeVar instanceof phd0) {
            phd0Var = (phd0) zjeVar;
            int i = phd0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                phd0Var.k = i - Integer.MIN_VALUE;
            } else {
                phd0Var = new phd0(this, zjeVar);
            }
        } else {
            phd0Var = new phd0(this, zjeVar);
        }
        Object obj = phd0Var.i;
        Object obj2 = wne.f39444a;
        int i2 = phd0Var.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(obj);
            phd0Var.k = 1;
            if (C(phd0Var) == obj2) {
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
        Long l2 = (Long) vzg0Var.a("TIME_LEFT_KEY");
        long jLongValue = ((l2 != null ? l2.longValue() : -1L) * 1000) - System.currentTimeMillis();
        if (jLongValue < 0) {
            D(0L);
        } else {
            c4m0 c4m0Var = this.w;
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            this.w = sac.T(new fnq(sac.L(6, jLongValue, 0L), new yg1((Object) this, yjeVar, (byte) 23), (byte) 4), d5c.S(jiu0.a(this), this.j.f22085a), new jjc0(2, this, shd0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 4, (byte) 9));
        }
        return Unit.f46060a;
    }
}
