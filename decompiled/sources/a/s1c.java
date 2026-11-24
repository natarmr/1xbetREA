package a;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.limits.rs.impl.navigation.internal.LimitsRsInternalScreens$SelfExclusionFragmentScreen;
import org.xplatform.mailing.impl.navigation.MailingScreenFactoryImpl$getMailingManagementFragment$1;
import org.xplatform.registration.success.api.RegistrationSuccessParams;
import org.xplatform.security.api.navigation.EndFlowNavigation;
import org.xplatform.security.api.presentation.models.SendEmailIntention;
import org.xplatform.security.impl.presentation.email.send_code.model.CheckEmailScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final class s1c extends w46 {
    public final c4m0 A;
    public final vzg0 b;
    public final i1w0 c;
    public final mne d;
    public final s64 e;
    public final n5c f;
    public final zg g;
    public final uuz h;
    public final atz i;
    public final jh70 j;
    public final nr k;
    public final duj l;
    public final n5c m;
    public final xzb n;
    public final xzb o;
    public final zn00 p;
    public final mxg0 q;
    public final f5c r;
    public final usd s;
    public final lme0 t;
    public final SendEmailIntention u;
    public final ol60 v;
    public final p7m0 w;
    public final p7m0 x;
    public swp0 y;
    public c4m0 z;

    public s1c(vzg0 vzg0Var, CheckEmailScreenParams checkEmailScreenParams, i1w0 i1w0Var, mne mneVar, s64 s64Var, n5c n5cVar, zg zgVar, uuz uuzVar, atz atzVar, jh70 jh70Var, nr nrVar, duj dujVar, n5c n5cVar2, pru pruVar, xzb xzbVar, xzb xzbVar2, zn00 zn00Var, mxg0 mxg0Var, m1e m1eVar, f5c f5cVar, usd usdVar, lme0 lme0Var, qgd qgdVar, ctf0 ctf0Var) {
        m1eVar.getClass();
        ctf0Var.getClass();
        this.b = vzg0Var;
        this.c = i1w0Var;
        this.d = mneVar;
        this.e = s64Var;
        this.f = n5cVar;
        this.g = zgVar;
        this.h = uuzVar;
        this.i = atzVar;
        this.j = jh70Var;
        this.k = nrVar;
        this.l = dujVar;
        this.m = n5cVar2;
        this.n = xzbVar;
        this.o = xzbVar2;
        this.p = zn00Var;
        this.q = mxg0Var;
        this.r = f5cVar;
        this.s = usdVar;
        this.t = lme0Var;
        SendEmailIntention c = checkEmailScreenParams.getC();
        this.u = c;
        this.v = new ol60(3);
        this.w = q7m0.a(t0c.f33112a);
        boolean z = checkEmailScreenParams instanceof CheckEmailScreenParams.RestorePassword;
        this.x = q7m0.a(new f1c(c.getF46940a(), "", false, false, ctf0Var.f(z ? R.string.confirmation : R.string.email_activ, new Object[0]), ctf0Var.f(z ? R.string.confirm : R.string.activate, new Object[0]), pruVar.a().E0, false));
        this.y = checkEmailScreenParams.getF46954a();
        int b = checkEmailScreenParams.getB();
        if (z() == 0) {
            vzg0Var.e("SAVED_FINISH_TIME", Long.valueOf((((long) b) * 1000) + System.currentTimeMillis()));
            E();
        } else if (z() > System.currentTimeMillis()) {
            E();
        } else {
            y(v0c.f36574a);
        }
        c4m0 c4m0Var = this.A;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.A = sac.T(new fnq(m1eVar.b(), new igb((Object) this, (yje) null, (byte) 4), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), r1c.h);
        }
    }

    public final void A(Throwable th) {
        boolean z = th instanceof zhi0;
        byte b = 22;
        duj dujVar = this.l;
        ol60 ol60Var = this.v;
        if (!z) {
            if ((th instanceof SocketTimeoutException) || (th instanceof UnknownHostException)) {
                ol60Var.f(b1c.f1799a);
                return;
            } else {
                dujVar.b(th, new bna(this, b));
                return;
            }
        }
        zhi0 zhi0Var = (zhi0) th;
        kuw kuwVar = zhi0Var.c;
        i2o i2oVar = i2o.TooManyRequests;
        y0c y0cVar = y0c.f41798a;
        if (kuwVar == i2oVar) {
            ol60Var.f(y0cVar);
            ol60Var.f(a1c.f65a);
        } else {
            if (kuwVar != i2o.TokenExpiredError) {
                dujVar.b(zhi0Var, new bna(this, b));
                return;
            }
            ol60Var.f(y0cVar);
            String message = zhi0Var.getMessage();
            if (message == null) {
                message = "";
            }
            ol60Var.f(new c1c(message));
        }
    }

    public final void B(bvc bvcVar, CoroutineContext coroutineContext, Function1 function1, Function2 function2) {
        sac.V(bvcVar, new zhb(1, function1, Function1.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0, (byte) 12), new h8a(this, (byte) 11), coroutineContext, new vxb((Object) this, (Object) function2, (yje) null, (byte) 4), 8);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object C(String str, SendEmailIntention.Registration registration, zje zjeVar) {
        o1c o1cVar;
        SendEmailIntention.Registration registration2;
        if (zjeVar instanceof o1c) {
            o1cVar = (o1c) zjeVar;
            int i = o1cVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                o1cVar.l = i - Integer.MIN_VALUE;
            } else {
                o1cVar = new o1c(this, zjeVar);
            }
        } else {
            o1cVar = new o1c(this, zjeVar);
        }
        Object objD = o1cVar.j;
        wne wneVar = wne.f39444a;
        int i2 = o1cVar.l;
        if (i2 == 0) {
            z1x.P(objD);
            swp0 swp0Var = this.y;
            o1cVar.i = registration;
            o1cVar.l = 1;
            objD = this.m.f22937a.D(o1cVar, swp0Var, str);
            if (objD == wneVar) {
                return wneVar;
            }
            registration2 = registration;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            registration2 = o1cVar.i;
            z1x.P(objD);
        }
        mwt0 mwt0Var = (mwt0) objD;
        String strValueOf = String.valueOf(mwt0Var.f22522a);
        String str2 = mwt0Var.b;
        Integer num = new Integer((int) registration2.g);
        gne0 gne0Var = q7f0.b;
        int i3 = registration2.c;
        gne0Var.getClass();
        RegistrationSuccessParams registrationSuccessParams = new RegistrationSuccessParams(strValueOf, str2, "", "", num, gne0.c(i3), registration2.h, registration2.b, registration2.d, registration2.e, registration2.f, registration2.i, registration2.j);
        i1w0 i1w0Var = this.c;
        k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
        this.t.getClass();
        k0w0VarI.l(lme0.a(registrationSuccessParams));
        ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return Unit.f46060a;
            }
            i1w0Var.a((oe50) pawVar.next());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009d, code lost:
    
        if (r8.q.a(r11, r0) == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(java.lang.String r9, final org.xplatform.security.api.presentation.models.SendEmailIntention.RestorePassword r10, a.zje r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof a.p1c
            if (r0 == 0) goto L13
            r0 = r11
            a.p1c r0 = (a.p1c) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            a.p1c r0 = new a.p1c
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.k
            a.wne r1 = a.wne.f39444a
            int r2 = r0.m
            r3 = 0
            r4 = 2
            a.i1w0 r5 = r8.c
            r6 = 1
            if (r2 == 0) goto L3e
            if (r2 == r6) goto L38
            if (r2 != r4) goto L32
            a.owf0 r9 = r0.j
            org.xplatform.security.api.presentation.models.SendEmailIntention$RestorePassword r10 = r0.i
            a.z1x.P(r11)
            goto La0
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r3
        L38:
            org.xplatform.security.api.presentation.models.SendEmailIntention$RestorePassword r10 = r0.i
            a.z1x.P(r11)
            goto L61
        L3e:
            a.z1x.P(r11)
            a.swp0 r11 = r8.y
            r0.i = r10
            r0.m = r6
            a.xzb r2 = r8.n
            a.gst0 r7 = r2.b
            boolean r7 = r7.a()
            a.kd30 r2 = r2.f41747a
            if (r7 == 0) goto L59
            java.lang.Object r9 = r2.y(r0, r11, r9)
        L57:
            r11 = r9
            goto L5e
        L59:
            java.lang.Object r9 = r2.z(r0, r11, r9)
            goto L57
        L5e:
            if (r11 != r1) goto L61
            goto L9f
        L61:
            r9 = r11
            a.owf0 r9 = (a.owf0) r9
            a.c4m0 r11 = r8.z
            if (r11 == 0) goto L6b
            r11.cancel(r3)
        L6b:
            if (r9 == 0) goto Lab
            boolean r11 = r9 instanceof a.nwf0
            if (r11 == 0) goto L7b
            a.s0c r11 = new a.s0c
            r0 = 0
            r11.<init>(r8)
            r5.d(r11)
            goto La8
        L7b:
            boolean r11 = r9 instanceof a.lwf0
            if (r11 == 0) goto L88
            a.s0c r11 = new a.s0c
            r11.<init>(r8)
            r5.d(r11)
            goto La8
        L88:
            boolean r11 = r9 instanceof a.mwf0
            if (r11 == 0) goto Lab
            r11 = r9
            a.mwf0 r11 = (a.mwf0) r11
            java.util.ArrayList r11 = r11.f22500a
            r0.i = r10
            r0.j = r9
            r0.m = r4
            a.mxg0 r2 = r8.q
            java.lang.Object r11 = r2.a(r11, r0)
            if (r11 != r1) goto La0
        L9f:
            return r1
        La0:
            a.s0c r11 = new a.s0c
            r11.<init>(r8)
            r5.d(r11)
        La8:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        Lab:
            a.t9f.b()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a.s1c.D(java.lang.String, org.xplatform.security.api.presentation.models.SendEmailIntention$RestorePassword, a.zje):java.lang.Object");
    }

    public final void E() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z() <= jCurrentTimeMillis) {
            y(v0c.f36574a);
            return;
        }
        long jZ = z() - jCurrentTimeMillis;
        c4m0 c4m0Var = this.z;
        yje yjeVar = null;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        this.z = sac.T(new fnq(sac.L(6, jZ, 0L), new yg1((Object) this, yjeVar, (byte) 4), (byte) 4), d5c.S(jiu0.a(this), this.d.b), q1c.h);
    }

    public final void w() {
        SendEmailIntention sendEmailIntention = this.u;
        if (sendEmailIntention != null) {
            byte b = 0;
            if (sendEmailIntention instanceof SendEmailIntention.Registration) {
                sac.V(jiu0.a(this), h1c.f12276a, null, this.d.f22085a, new i1c(this, null, b), 10);
                return;
            }
            boolean z = sendEmailIntention instanceof SendEmailIntention.RestorePassword;
            i1w0 i1w0Var = this.c;
            if (z) {
                i1w0Var.d(new op7(((SendEmailIntention.RestorePassword) sendEmailIntention).b, this, (byte) 28));
                return;
            }
            if (sendEmailIntention instanceof SendEmailIntention.Bind) {
                EndFlowNavigation endFlowNavigation = ((SendEmailIntention.Bind) sendEmailIntention).b;
                if (Intrinsics.d(endFlowNavigation, EndFlowNavigation.ToMailingManagementScreen.f46925a)) {
                    k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                    this.h.getClass();
                    k0w0VarI.c(new MailingScreenFactoryImpl$getMailingManagementFragment$1());
                    ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorO;
                        if (!pawVar.hasNext()) {
                            return;
                        } else {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                } else if (Intrinsics.d(endFlowNavigation, EndFlowNavigation.ToPersonalDataScreen.f46926a)) {
                    k0w0 k0w0VarI2 = cs0.i(i1w0Var, i1w0Var);
                    k0w0VarI2.c(jh70.j(this.j, false));
                    ListIterator listIteratorO2 = b1j.o(i1w0Var, k0w0VarI2.f17489a, 0);
                    while (true) {
                        paw pawVar2 = (paw) listIteratorO2;
                        if (!pawVar2.hasNext()) {
                            return;
                        } else {
                            i1w0Var.a((oe50) pawVar2.next());
                        }
                    }
                } else {
                    if (!Intrinsics.d(endFlowNavigation, EndFlowNavigation.ToRsSelfExclusionScreen.f46927a)) {
                        if (Intrinsics.d(endFlowNavigation, EndFlowNavigation.ToCustomScreen.f46924a)) {
                            return;
                        }
                        t9f.b();
                        return;
                    }
                    k0w0 k0w0VarI3 = cs0.i(i1w0Var, i1w0Var);
                    this.i.getClass();
                    k0w0VarI3.c(new LimitsRsInternalScreens$SelfExclusionFragmentScreen());
                    ListIterator listIteratorO3 = b1j.o(i1w0Var, k0w0VarI3.f17489a, 0);
                    while (true) {
                        paw pawVar3 = (paw) listIteratorO3;
                        if (!pawVar3.hasNext()) {
                            return;
                        } else {
                            i1w0Var.a((oe50) pawVar3.next());
                        }
                    }
                }
            }
        }
        t9f.b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(String str, zje zjeVar) throws dwq0, zhi0 {
        j1c j1cVar;
        if (zjeVar instanceof j1c) {
            j1cVar = (j1c) zjeVar;
            int i = j1cVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                j1cVar.k = i - Integer.MIN_VALUE;
            } else {
                j1cVar = new j1c(this, zjeVar);
            }
        } else {
            j1cVar = new j1c(this, zjeVar);
        }
        Object obj = j1cVar.i;
        wne wneVar = wne.f39444a;
        int i2 = j1cVar.k;
        if (i2 == 0) {
            z1x.P(obj);
            swp0 swp0Var = this.y;
            j1cVar.k = 1;
            Object objA = this.r.f8955a.A(j1cVar, swp0Var, str);
            if (objA != wneVar) {
                objA = Unit.f46060a;
            }
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        i8i.D("send_code", "done", this.g.f44322a, "acc_add_email_code_input");
        this.v.f(d1c.f5304a);
        w();
        return Unit.f46060a;
    }

    public final void y(w0c w0cVar) {
        sac.V(jiu0.a(this), k1c.f17515a, null, this.d.f22085a, new jtb(this, w0cVar, null, (byte) 3), 10);
    }

    public final long z() {
        Long l = (Long) this.b.a("SAVED_FINISH_TIME");
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }
}
