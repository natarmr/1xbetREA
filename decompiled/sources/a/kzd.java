package a;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.security.api.presentation.models.ConfirmSendEmailScreenParams;
import org.xplatform.security.api.presentation.models.SendEmailIntention;

/* JADX INFO: loaded from: classes5.dex */
public final class kzd extends w46 {
    public final i1w0 b;
    public final ConfirmSendEmailScreenParams c;
    public final mne d;
    public final nr e;
    public final s64 f;
    public final cyh g;
    public final ort h;
    public final zg i;
    public final au0 j;
    public final f5c k;
    public final z4w0 l;
    public final n5c m;
    public final duj n;
    public final xzb o;
    public final m1e p;
    public final ctf0 q;
    public final ol60 r;
    public final p7m0 s;
    public bby t;
    public c4m0 u;

    public kzd(vzg0 vzg0Var, i1w0 i1w0Var, ConfirmSendEmailScreenParams confirmSendEmailScreenParams, mne mneVar, nr nrVar, s64 s64Var, zg zgVar, cyh cyhVar, ort ortVar, zg zgVar2, au0 au0Var, f5c f5cVar, z4w0 z4w0Var, n5c n5cVar, duj dujVar, xzb xzbVar, m1e m1eVar, ctf0 ctf0Var) {
        m1eVar.getClass();
        ctf0Var.getClass();
        this.b = i1w0Var;
        this.c = confirmSendEmailScreenParams;
        this.d = mneVar;
        this.e = nrVar;
        this.f = s64Var;
        this.g = cyhVar;
        this.h = ortVar;
        this.i = zgVar2;
        this.j = au0Var;
        this.k = f5cVar;
        this.l = z4w0Var;
        this.m = n5cVar;
        this.n = dujVar;
        this.o = xzbVar;
        this.p = m1eVar;
        this.q = ctf0Var;
        this.r = new ol60(3);
        String f46940a = confirmSendEmailScreenParams.w().getF46940a();
        SendEmailIntention sendEmailIntentionW = confirmSendEmailScreenParams.w();
        sendEmailIntentionW.getClass();
        this.s = q7m0.a(new ezd(f46940a, false, ctf0Var.f(sendEmailIntentionW instanceof SendEmailIntention.RestorePassword ? R.string.confirmation : R.string.email_activ, new Object[0])));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A(ConfirmSendEmailScreenParams.RestorePassword restorePassword, zje zjeVar) {
        jzd jzdVar;
        if (zjeVar instanceof jzd) {
            jzdVar = (jzd) zjeVar;
            int i = jzdVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                jzdVar.l = i - Integer.MIN_VALUE;
            } else {
                jzdVar = new jzd(this, zjeVar);
            }
        } else {
            jzdVar = new jzd(this, zjeVar);
        }
        Object objA = jzdVar.j;
        wne wneVar = wne.f39444a;
        int i2 = jzdVar.l;
        if (i2 == 0) {
            z1x.P(objA);
            swp0 swp0Var = restorePassword.b;
            jzdVar.i = restorePassword;
            jzdVar.l = 1;
            objA = this.o.a(swp0Var, true, jzdVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            restorePassword = jzdVar.i;
            z1x.P(objA);
        }
        this.b.d(new h6c((pfi0) objA, restorePassword, (byte) 17));
        return Unit.f46060a;
    }

    public final void w() {
        i1w0 i1w0Var = this.b;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    public final void x(Throwable th) {
        duj dujVar = this.n;
        if (th != null) {
            boolean z = th instanceof SocketTimeoutException;
            ol60 ol60Var = this.r;
            if (z || (th instanceof UnknownHostException)) {
                ol60Var.f(bzd.f3461a);
                return;
            }
            if (th instanceof zhi0) {
                if (((zhi0) th).c == i2o.TokenExpiredError) {
                    String message = th.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    ol60Var.f(new czd(message));
                    return;
                }
                dujVar.b(th, new mhc(2, this, kzd.class, "onErrorHandlerCalled", "onErrorHandlerCalled(Ljava/lang/Throwable;Ljava/lang/String;)V", 0, (byte) 7));
                return;
            }
        }
        dujVar.b(th, new mhc(2, this, kzd.class, "onErrorHandlerCalled", "onErrorHandlerCalled(Ljava/lang/Throwable;Ljava/lang/String;)V", 0, (byte) 8));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b0, code lost:
    
        if (r13 == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(org.xplatform.security.api.presentation.models.ConfirmSendEmailScreenParams.BindEmail r12, a.zje r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof a.hzd
            if (r0 == 0) goto L13
            r0 = r13
            a.hzd r0 = (a.hzd) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.hzd r0 = new a.hzd
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L38
            if (r2 != r3) goto L31
            org.xplatform.security.api.presentation.models.ConfirmSendEmailScreenParams$BindEmail r12 = r0.i
            a.z1x.P(r13)
            r8 = r11
            goto Lb3
        L31:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r11)
            r11 = 0
            return r11
        L38:
            org.xplatform.security.api.presentation.models.ConfirmSendEmailScreenParams$BindEmail r12 = r0.i
            a.z1x.P(r13)
            r8 = r11
            goto La3
        L3f:
            org.xplatform.security.api.presentation.models.ConfirmSendEmailScreenParams$BindEmail r12 = r0.i
            a.z1x.P(r13)
            r8 = r11
            goto L8e
        L46:
            a.z1x.P(r13)
            r0.i = r12
            r0.l = r5
            a.lie0 r9 = new a.lie0
            r9.<init>()
            a.ort r13 = r11.h
            long r5 = r13.b()
            java.lang.String r13 = java.lang.String.valueOf(r5)
            a.p6a r2 = new a.p6a
            r13.getClass()
            java.lang.String r5 = "ActivateEmail"
            java.lang.String r6 = ""
            r2.<init>(r5, r6, r13)
            a.cyh r13 = r11.g
            a.p5a r13 = r13.a(r2)
            a.fzd r2 = new a.fzd
            r7 = 0
            r2.<init>(r11, r9, r7)
            a.fnq r6 = new a.fnq
            r5 = 4
            r6.<init>(r13, r2, r5)
            a.ic1 r5 = new a.ic1
            r10 = 14
            r8 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            a.vsg0 r11 = new a.vsg0
            r11.<init>(r5)
            java.lang.Object r13 = a.ntb.K(r11, r0)
            if (r13 != r1) goto L8e
            goto Lb2
        L8e:
            a.ynb0 r13 = (a.ynb0) r13
            org.xplatform.security.api.presentation.models.SendEmailIntention$Bind r11 = r12.f46932a
            java.lang.String r11 = r11.f46938a
            r0.i = r12
            r0.l = r4
            a.f5c r2 = r8.k
            a.kd30 r2 = r2.f8955a
            java.io.Serializable r13 = r2.Z(r0, r13, r11)
            if (r13 != r1) goto La3
            goto Lb2
        La3:
            a.swp0 r13 = (a.swp0) r13
            r0.i = r12
            r0.l = r3
            a.xzb r11 = r8.o
            r2 = 0
            java.lang.Object r13 = r11.a(r13, r2, r0)
            if (r13 != r1) goto Lb3
        Lb2:
            return r1
        Lb3:
            a.pfi0 r13 = (a.pfi0) r13
            a.h6c r11 = new a.h6c
            r0 = 18
            r11.<init>(r13, r12, r0)
            a.i1w0 r12 = r8.b
            r12.d(r11)
            kotlin.Unit r11 = kotlin.Unit.f46060a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kzd.y(org.xplatform.security.api.presentation.models.ConfirmSendEmailScreenParams$BindEmail, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object z(ConfirmSendEmailScreenParams.Registration registration, zje zjeVar) {
        izd izdVar;
        if (zjeVar instanceof izd) {
            izdVar = (izd) zjeVar;
            int i = izdVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                izdVar.l = i - Integer.MIN_VALUE;
            } else {
                izdVar = new izd(this, zjeVar);
            }
        } else {
            izdVar = new izd(this, zjeVar);
        }
        izd izdVar2 = izdVar;
        Object objA = izdVar2.j;
        wne wneVar = wne.f39444a;
        int i2 = izdVar2.l;
        if (i2 == 0) {
            z1x.P(objA);
            swp0 swp0Var = registration.b;
            obk0 obk0Var = obk0.SMS;
            izdVar2.i = registration;
            izdVar2.l = 1;
            objA = this.m.a(swp0Var, obk0Var, 0, true, "", izdVar2);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            registration = izdVar2.i;
            z1x.P(objA);
        }
        this.b.d(new h6c((pfi0) objA, registration, (byte) 16));
        return Unit.f46060a;
    }
}
