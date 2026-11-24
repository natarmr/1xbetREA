package a;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.mailing.impl.navigation.MailingScreenFactoryImpl$getMailingManagementFragment$1;
import org.xplatform.personal.impl.navigation.PersonalScreen$EditProfileTjScreen;
import org.xplatform.security.api.presentation.models.TokenRestoreData;

/* JADX INFO: loaded from: classes5.dex */
public final class v7c extends w46 {
    public final qgd A;
    public final rou B;
    public final cyh C;
    public final z4w0 D;
    public final dmt E;
    public final fnk F;
    public final kd30 G;
    public final rek0 H;
    public final h03 I;
    public final r7v J;
    public final lme0 K;
    public final ytt L;
    public final s31 M;
    public final e41 N;
    public final p7m0 O;
    public final ol60 P;
    public final p7m0 Q;
    public c4m0 R;
    public final c4m0 S;
    public bby T;
    public final vzg0 b;
    public final i1w0 c;
    public final d6c d;
    public final duj e;
    public final ctf0 f;
    public final mne g;
    public final nr h;
    public final s64 i;
    public final uuz j;
    public final jh70 k;
    public final eru l;
    public final pmi0 m;
    public final rjo n;
    public final zn00 o;
    public final usd p;
    public final iw20 q;
    public final mi70 r;
    public final n5c s;
    public final nvu t;
    public final pru u;
    public final xzb v;
    public final mxg0 w;
    public final yuu x;
    public final jnk y;
    public final ouu z;

    public v7c(vzg0 vzg0Var, i1w0 i1w0Var, d6c d6cVar, duj dujVar, ctf0 ctf0Var, mne mneVar, nr nrVar, s64 s64Var, yo4 yo4Var, uuz uuzVar, jh70 jh70Var, eru eruVar, pmi0 pmi0Var, rjo rjoVar, zn00 zn00Var, qud qudVar, usd usdVar, iw20 iw20Var, mi70 mi70Var, n5c n5cVar, nvu nvuVar, pru pruVar, m1e m1eVar, xzb xzbVar, mxg0 mxg0Var, yuu yuuVar, jnk jnkVar, ouu ouuVar, qgd qgdVar, rou rouVar, cyh cyhVar, z4w0 z4w0Var, dmt dmtVar, fnk fnkVar, kd30 kd30Var, rek0 rek0Var, h03 h03Var, r7v r7vVar, lme0 lme0Var, ytt yttVar, s31 s31Var, e41 e41Var) {
        SpannableStringBuilder spannableStringBuilderJ;
        rwj rwjVar = mneVar.f22085a;
        ctf0Var.getClass();
        m1eVar.getClass();
        this.b = vzg0Var;
        this.c = i1w0Var;
        this.d = d6cVar;
        this.e = dujVar;
        this.f = ctf0Var;
        this.g = mneVar;
        this.h = nrVar;
        this.i = s64Var;
        this.j = uuzVar;
        this.k = jh70Var;
        this.l = eruVar;
        this.m = pmi0Var;
        this.n = rjoVar;
        this.o = zn00Var;
        this.p = usdVar;
        this.q = iw20Var;
        this.r = mi70Var;
        this.s = n5cVar;
        this.t = nvuVar;
        this.u = pruVar;
        this.v = xzbVar;
        this.w = mxg0Var;
        this.x = yuuVar;
        this.y = jnkVar;
        this.z = ouuVar;
        this.A = qgdVar;
        this.B = rouVar;
        this.C = cyhVar;
        this.D = z4w0Var;
        this.E = dmtVar;
        this.F = fnkVar;
        this.G = kd30Var;
        this.H = rek0Var;
        this.I = h03Var;
        this.J = r7vVar;
        this.K = lme0Var;
        this.L = yttVar;
        this.M = s31Var;
        this.N = e41Var;
        p7m0 p7m0VarA = q7m0.a(p6c.f26447a);
        this.O = p7m0VarA;
        this.P = new ol60(3);
        boolean z = d6cVar instanceof u5c;
        int iQ0 = rcb.q0(d6cVar.p(), z);
        int iR0 = rcb.r0(d6cVar.p(), z);
        boolean z2 = pruVar.a().E0;
        byte b = 1;
        boolean z3 = pruVar.a().o && rcb.d1(d6cVar.p());
        m6c m6cVarB = B();
        int iQ1 = rcb.q0(d6cVar.p(), z);
        lsm0 lsm0Var = ctf0Var.b;
        n6c n6cVar = new n6c(lsm0Var.a(iQ1, Arrays.copyOf(new Object[0], 0)), false);
        int iOrdinal = z().ordinal();
        yje yjeVar = null;
        if (iOrdinal == 0) {
            spannableStringBuilderJ = h8x.J(ctf0Var, d6cVar.getPhoneNumber(), R.string.send_sms_for_confirm_v2);
        } else if (iOrdinal == 1) {
            spannableStringBuilderJ = h8x.J(ctf0Var, d6cVar.getPhoneNumber(), R.string.send_voice_sms_for_confirm_new_v2);
        } else if (iOrdinal == 2) {
            spannableStringBuilderJ = new SpannableStringBuilder(lsm0Var.a(R.string.sent_code_to_telegram, Arrays.copyOf(new Object[0], 0)));
        } else {
            if (iOrdinal != 3) {
                t9f.b();
                throw null;
            }
            spannableStringBuilderJ = h8x.J(ctf0Var, d6cVar.getPhoneNumber(), R.string.send_flash_call_for_confirm_correct_v2);
        }
        zie0 zie0Var = obk0.b;
        List listZ = d6cVar.z();
        zie0Var.getClass();
        boolean z4 = z3;
        this.Q = q7m0.a(new i7c(iQ0, iR0, z2, z4, "", spannableStringBuilderJ, i6c.f14232a, m6cVarB, n6cVar, s6c.f31696a, zie0.f(listZ), false, true, false));
        c4m0 c4m0Var = this.S;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.S = sac.T(new fnq(m1eVar.b(), new t7c(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), rwjVar), new pd(2, yjeVar, (byte) 26));
        }
        sac.T(new fnq(p7m0VarA, new fob(this, yjeVar, (byte) 8), (byte) 4), d5c.S(jiu0.a(this), rwjVar), new pd(2, yjeVar, (byte) 25));
    }

    public final long A() {
        Long l = (Long) this.b.a("SAVED_FINISH_TIME");
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final m6c B() {
        r6c r6cVar = (r6c) this.O.getValue();
        if (r6cVar != null) {
            if (r6cVar instanceof o6c) {
                String strA = this.f.b.a(R.string.send_again, Arrays.copyOf(new Object[0], 0));
                j6c j6cVar = j6c.f15977a;
                return new l6c(strA, ((i7c) this.Q.getValue()).m);
            }
            if ((r6cVar instanceof p6c) || (r6cVar instanceof q6c)) {
                return k6c.f17761a;
            }
        }
        t9f.b();
        return null;
    }

    public final ifi0 C() {
        d6c d6cVar = this.d;
        if (d6cVar != null) {
            if (d6cVar instanceof o5c) {
                return ifi0.LINK_PHONE_AUTHENTICATOR;
            }
            if (d6cVar instanceof p5c) {
                return ifi0.LINK_PHONE_AUTHENTICATOR;
            }
            if (d6cVar instanceof q5c) {
                return ifi0.LINK_PHONE_AUTHENTICATOR;
            }
            if (d6cVar instanceof s5c) {
                return ifi0.SKIP;
            }
            if (d6cVar instanceof t5c) {
                return ifi0.CHANGE_PHONE_NUMBER;
            }
            if (d6cVar instanceof u5c) {
                return ifi0.PHONE_ACTIVATION;
            }
            if (d6cVar instanceof w5c) {
                return ifi0.PHONE_ACTIVATION;
            }
            if (d6cVar instanceof x5c) {
                return ifi0.LINK_PHONE;
            }
            if (d6cVar instanceof z5c) {
                return ifi0.PHONE_ACTIVATION;
            }
            if (d6cVar instanceof a6c) {
                return ifi0.REGISTRATION_BY_PHONE;
            }
            if (d6cVar instanceof b6c) {
                return ifi0.PASSWORD_RECOVERY;
            }
            if (d6cVar instanceof c6c) {
                int i = ((c6c) d6cVar).c;
                return (12 > i || i >= 17) ? ifi0.LINK_PHONE : ifi0.LINK_PHONE_AUTHENTICATOR;
            }
        }
        t9f.b();
        return null;
    }

    public final n6c D() {
        d6c d6cVar = this.d;
        boolean z = false;
        String strA = this.f.b.a(rcb.q0(d6cVar.p(), d6cVar instanceof u5c), Arrays.copyOf(new Object[0], 0));
        p7m0 p7m0Var = this.Q;
        if (((i7c) p7m0Var.getValue()).l && ((i7c) p7m0Var.getValue()).m) {
            z = true;
        }
        return new n6c(strA, z);
    }

    public final swp0 E() {
        swp0 swp0Var = (swp0) this.b.a("TEMPORARY_TOKEN_KEY");
        return swp0Var == null ? this.d.getToken() : swp0Var;
    }

    public final void F(bvc bvcVar, CoroutineContext coroutineContext, Function1 function1, Function2 function2) {
        sac.V(bvcVar, new zhb(1, function1, Function1.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0, (byte) 16), new h8a(this, (byte) 12), coroutineContext, new vxb((Object) this, (Object) function2, (yje) null, (byte) 7), 8);
    }

    public final void G(wm4 wm4Var, o64 o64Var) {
        xm4 xm4VarR = k9x.R(z());
        ym4 ym4VarY = y();
        nr nrVar = this.h;
        nrVar.getClass();
        kt2 kt2Var = (kt2) nrVar.b;
        jo20 jo20Var = new jo20();
        jo20Var.put("option", xm4VarR.f41103a);
        jo20Var.put("action", wm4Var.f39387a);
        if (ym4VarY != ym4.SKIP) {
            jo20Var.put("point", ym4VarY.f42869a);
        }
        kt2Var.a("acc_add_phone_break", jo20Var.b());
        r64 r64VarS = k9x.S(z());
        ifi0 ifi0VarC = C();
        s64 s64Var = this.i;
        s64Var.getClass();
        s1p s1pVar = s64Var.f31684a;
        yni0 yni0Var = new yni0();
        yni0Var.add(new j1p(r64VarS.f29917a, (byte) 0));
        if (ifi0VarC != ifi0.SKIP) {
            yni0Var.add(new j1p(ifi0VarC.f14689a, (byte) 1));
        }
        yni0Var.add(new j1p(o64Var.f24716a, (byte) 2));
        s1pVar.a(cui0.a(yni0Var), 12635L);
    }

    public final void H(vm4 vm4Var, q64 q64Var) {
        xm4 xm4VarR = k9x.R(z());
        ym4 ym4VarY = y();
        nr nrVar = this.h;
        nrVar.getClass();
        kt2 kt2Var = (kt2) nrVar.b;
        jo20 jo20Var = new jo20();
        jo20Var.put("option", xm4VarR.f41103a);
        jo20Var.put("action", vm4Var.f37659a);
        if (ym4VarY != ym4.SKIP) {
            jo20Var.put("point", ym4VarY.f42869a);
        }
        kt2Var.a("acc_add_phone_confirm_click", jo20Var.b());
        r64 r64VarS = k9x.S(z());
        ifi0 ifi0VarC = C();
        s64 s64Var = this.i;
        s64Var.getClass();
        s1p s1pVar = s64Var.f31684a;
        yni0 yni0Var = new yni0();
        yni0Var.add(new j1p(r64VarS.f29917a, (byte) 0));
        yni0Var.add(new j1p(q64Var.f28182a, (byte) 1));
        if (ifi0VarC != ifi0.SKIP) {
            yni0Var.add(new j1p(ifi0VarC.f14689a, (byte) 2));
        }
        s1pVar.a(cui0.a(yni0Var), 12546L);
    }

    public final void I(zm4 zm4Var, p64 p64Var, String str) {
        d6c d6cVar = this.d;
        xm4 xm4VarR = k9x.R(d6cVar.P());
        ym4 ym4VarY = y();
        nr nrVar = this.h;
        nrVar.getClass();
        str.getClass();
        kt2 kt2Var = (kt2) nrVar.b;
        jo20 jo20Var = new jo20();
        jo20Var.put("option", xm4VarR.f41103a);
        jo20Var.put("send_code", zm4Var.f44606a);
        if (str.length() > 0) {
            jo20Var.put("error_code", str);
        }
        if (ym4VarY != ym4.SKIP) {
            jo20Var.put("point", ym4VarY.f42869a);
        }
        kt2Var.a("acc_add_phone_code_result", jo20Var.b());
        r64 r64VarS = k9x.S(d6cVar.P());
        ifi0 ifi0VarC = C();
        s64 s64Var = this.i;
        s64Var.getClass();
        s1p s1pVar = s64Var.f31684a;
        yni0 yni0Var = new yni0();
        yni0Var.add(new j1p(r64VarS.f29917a, (byte) 0));
        yni0Var.add(new j1p(p64Var.f26436a, (byte) 1));
        if (ifi0VarC != ifi0.SKIP) {
            yni0Var.add(new j1p(ifi0VarC.f14689a, (byte) 2));
        }
        s1pVar.a(cui0.a(yni0Var), 11799L);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        if (a.ntb.K(r8, r0) == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(boolean r9, a.zje r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof a.o7c
            if (r0 == 0) goto L13
            r0 = r10
            a.o7c r0 = (a.o7c) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.o7c r0 = new a.o7c
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            a.z1x.P(r10)
            goto L7d
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r5
        L31:
            boolean r9 = r0.i
            a.z1x.P(r10)
            goto L47
        L37:
            a.z1x.P(r10)
            r0.i = r9
            r0.l = r4
            a.rou r10 = r8.B
            java.lang.Object r10 = r10.a(r4, r0)
            if (r10 != r1) goto L47
            goto L7c
        L47:
            a.m2c0 r10 = (a.m2c0) r10
            a.d6c r2 = r8.d
            java.lang.String r2 = r2.getPhoneNumber()
            int r4 = r2.length()
            if (r4 != 0) goto L57
            java.lang.String r2 = r10.Z
        L57:
            long r6 = r10.S
            java.lang.String r10 = java.lang.String.valueOf(r6)
            a.zl60 r4 = new a.zl60
            r4.<init>(r10, r2)
            a.cyh r10 = r8.C
            a.p5a r10 = r10.a(r4)
            a.tu3 r2 = new a.tu3
            r2.<init>(r10, r5, r8, r9)
            a.vsg0 r8 = new a.vsg0
            r8.<init>(r2)
            r0.i = r9
            r0.l = r3
            java.lang.Object r8 = a.ntb.K(r8, r0)
            if (r8 != r1) goto L7d
        L7c:
            return r1
        L7d:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.v7c.J(boolean, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r9.B.a(true, r6) == r0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K(java.lang.String r10, a.zje r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof a.p7c
            if (r0 == 0) goto L14
            r0 = r11
            a.p7c r0 = (a.p7c) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.k = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            a.p7c r0 = new a.p7c
            r0.<init>(r9, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.i
            a.wne r0 = a.wne.f39444a
            int r1 = r6.k
            r7 = 2
            r8 = 1
            if (r1 == 0) goto L37
            if (r1 == r8) goto L33
            if (r1 != r7) goto L2c
            a.z1x.P(r11)
            goto L69
        L2c:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            r9 = 0
            return r9
        L33:
            a.z1x.P(r11)
            goto L5e
        L37:
            a.z1x.P(r11)
            r6.k = r8
            a.kd30 r11 = r9.G
            java.lang.Object r1 = r11.b
            a.ts4 r1 = (a.ts4) r1
            a.qr4 r1 = r1.b
            a.rr4 r1 = r1.b
            java.lang.Object r11 = r11.f18086a
            a.y3v r11 = (a.y3v) r11
            java.lang.String r2 = r1.f30962a
            java.lang.String r3 = r1.b
            java.lang.String r5 = ""
            r4 = r10
            r1 = r11
            java.lang.Object r10 = r1.p(r2, r3, r4, r5, r6)
            if (r10 != r0) goto L59
            goto L5b
        L59:
            kotlin.Unit r10 = kotlin.Unit.f46060a
        L5b:
            if (r10 != r0) goto L5e
            goto L68
        L5e:
            r6.k = r7
            a.rou r10 = r9.B
            java.lang.Object r10 = r10.a(r8, r6)
            if (r10 != r0) goto L69
        L68:
            return r0
        L69:
            a.i1w0 r10 = r9.c
            java.util.concurrent.CopyOnWriteArrayList r11 = a.b1j.q(r10)
            a.qgd r9 = r9.A
            org.xplatform.authenticator.impl.navigation.AuthenticatorScreenFactoryImpl$authenticatorScreen$1 r9 = r9.c()
            a.d1w0 r0 = new a.d1w0
            r0.<init>(r9)
            a.c8d r9 = new a.c8d
            a.v7d r1 = a.y7d.f42146a
            r9.<init>(r1, r0)
            r0 = 0
            java.util.ListIterator r9 = a.b1j.p(r11, r9, r10, r11, r0)
        L86:
            r11 = r9
            a.paw r11 = (a.paw) r11
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L99
            java.lang.Object r11 = r11.next()
            a.oe50 r11 = (a.oe50) r11
            r10.a(r11)
            goto L86
        L99:
            kotlin.Unit r9 = kotlin.Unit.f46060a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.v7c.K(java.lang.String, a.zje):java.lang.Object");
    }

    public final void L(int i, boolean z) {
        i1w0 i1w0Var = this.c;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new q0w0(null)), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                bb50 bb50Var = new bb50(false);
                ouu ouuVar = this.z;
                ouuVar.getClass();
                ouuVar.q(bb50Var, true);
                ouuVar.M(bb50Var).d(new hka(this, i, z));
                return;
            }
            i1w0Var.a((oe50) pawVar.next());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M(final owf0 owf0Var, final we50 we50Var, zje zjeVar) {
        q7c q7cVar;
        if (zjeVar instanceof q7c) {
            q7cVar = (q7c) zjeVar;
            int i = q7cVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                q7cVar.m = i - Integer.MIN_VALUE;
            } else {
                q7cVar = new q7c(this, zjeVar);
            }
        } else {
            q7cVar = new q7c(this, zjeVar);
        }
        Object obj = q7cVar.k;
        wne wneVar = wne.f39444a;
        int i2 = q7cVar.m;
        i1w0 i1w0Var = this.c;
        final byte b = 1;
        if (i2 == 0) {
            z1x.P(obj);
            c4m0 c4m0Var = this.R;
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            if (owf0Var != null) {
                if (owf0Var instanceof nwf0) {
                    final byte b2 = 0;
                    i1w0Var.d(new Function1(this) { // from class: a.g6c
                        public final /* synthetic */ v7c b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            byte b3 = b2;
                            we50 we50Var2 = we50Var;
                            owf0 owf0Var2 = owf0Var;
                            v7c v7cVar = this.b;
                            k0w0 k0w0Var = (k0w0) obj2;
                            switch (b3) {
                                case 0:
                                    k0w0Var.getClass();
                                    zn00 zn00Var = v7cVar.o;
                                    swp0 swp0Var = ((nwf0) owf0Var2).f24231a;
                                    k0w0Var.h(zn00Var.J0(new TokenRestoreData(swp0Var.b, swp0Var.f32933a, tzf0.f34801a), -1L, we50Var2));
                                    break;
                                case 1:
                                    k0w0Var.getClass();
                                    zn00 zn00Var2 = v7cVar.o;
                                    lwf0 lwf0Var = (lwf0) owf0Var2;
                                    swp0 swp0Var2 = lwf0Var.b;
                                    k0w0Var.k(zn00Var2.E0(new TokenRestoreData(swp0Var2.b, swp0Var2.f32933a, tzf0.f34801a), CollectionsKt.M0(lwf0Var.f20762a), we50Var2));
                                    break;
                                default:
                                    k0w0Var.getClass();
                                    zn00 zn00Var3 = v7cVar.o;
                                    swp0 swp0Var3 = ((mwf0) owf0Var2).b;
                                    k0w0Var.k(zn00Var3.x0(new TokenRestoreData(swp0Var3.b, swp0Var3.f32933a, tzf0.f34801a), we50Var2));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    });
                } else if (owf0Var instanceof lwf0) {
                    i1w0Var.d(new Function1(this) { // from class: a.g6c
                        public final /* synthetic */ v7c b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            byte b3 = b;
                            we50 we50Var2 = we50Var;
                            owf0 owf0Var2 = owf0Var;
                            v7c v7cVar = this.b;
                            k0w0 k0w0Var = (k0w0) obj2;
                            switch (b3) {
                                case 0:
                                    k0w0Var.getClass();
                                    zn00 zn00Var = v7cVar.o;
                                    swp0 swp0Var = ((nwf0) owf0Var2).f24231a;
                                    k0w0Var.h(zn00Var.J0(new TokenRestoreData(swp0Var.b, swp0Var.f32933a, tzf0.f34801a), -1L, we50Var2));
                                    break;
                                case 1:
                                    k0w0Var.getClass();
                                    zn00 zn00Var2 = v7cVar.o;
                                    lwf0 lwf0Var = (lwf0) owf0Var2;
                                    swp0 swp0Var2 = lwf0Var.b;
                                    k0w0Var.k(zn00Var2.E0(new TokenRestoreData(swp0Var2.b, swp0Var2.f32933a, tzf0.f34801a), CollectionsKt.M0(lwf0Var.f20762a), we50Var2));
                                    break;
                                default:
                                    k0w0Var.getClass();
                                    zn00 zn00Var3 = v7cVar.o;
                                    swp0 swp0Var3 = ((mwf0) owf0Var2).b;
                                    k0w0Var.k(zn00Var3.x0(new TokenRestoreData(swp0Var3.b, swp0Var3.f32933a, tzf0.f34801a), we50Var2));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    });
                } else if (owf0Var instanceof mwf0) {
                    ArrayList arrayList = ((mwf0) owf0Var).f22500a;
                    q7cVar.i = owf0Var;
                    q7cVar.j = we50Var;
                    q7cVar.m = 1;
                    if (this.w.a(arrayList, q7cVar) == wneVar) {
                        return wneVar;
                    }
                }
                return Unit.f46060a;
            }
            t9f.b();
            return null;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        we50Var = q7cVar.j;
        owf0Var = q7cVar.i;
        z1x.P(obj);
        final byte b3 = 2;
        i1w0Var.d(new Function1(this) { // from class: a.g6c
            public final /* synthetic */ v7c b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                byte b4 = b3;
                we50 we50Var2 = we50Var;
                owf0 owf0Var2 = owf0Var;
                v7c v7cVar = this.b;
                k0w0 k0w0Var = (k0w0) obj2;
                switch (b4) {
                    case 0:
                        k0w0Var.getClass();
                        zn00 zn00Var = v7cVar.o;
                        swp0 swp0Var = ((nwf0) owf0Var2).f24231a;
                        k0w0Var.h(zn00Var.J0(new TokenRestoreData(swp0Var.b, swp0Var.f32933a, tzf0.f34801a), -1L, we50Var2));
                        break;
                    case 1:
                        k0w0Var.getClass();
                        zn00 zn00Var2 = v7cVar.o;
                        lwf0 lwf0Var = (lwf0) owf0Var2;
                        swp0 swp0Var2 = lwf0Var.b;
                        k0w0Var.k(zn00Var2.E0(new TokenRestoreData(swp0Var2.b, swp0Var2.f32933a, tzf0.f34801a), CollectionsKt.M0(lwf0Var.f20762a), we50Var2));
                        break;
                    default:
                        k0w0Var.getClass();
                        zn00 zn00Var3 = v7cVar.o;
                        swp0 swp0Var3 = ((mwf0) owf0Var2).b;
                        k0w0Var.k(zn00Var3.x0(new TokenRestoreData(swp0Var3.b, swp0Var3.f32933a, tzf0.f34801a), we50Var2));
                        break;
                }
                return Unit.f46060a;
            }
        });
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (a.ntb.K(r8, r0) == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(a.zje r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof a.s7c
            if (r0 == 0) goto L13
            r0 = r9
            a.s7c r0 = (a.s7c) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.s7c r0 = new a.s7c
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            a.z1x.P(r9)
            goto L77
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r5
        L31:
            a.z1x.P(r9)
            goto L43
        L35:
            a.z1x.P(r9)
            r0.k = r4
            a.rou r9 = r8.B
            java.lang.Object r9 = r9.a(r4, r0)
            if (r9 != r1) goto L43
            goto L76
        L43:
            a.m2c0 r9 = (a.m2c0) r9
            a.d6c r2 = r8.d
            java.lang.String r2 = r2.getPhoneNumber()
            int r4 = r2.length()
            if (r4 != 0) goto L53
            java.lang.String r2 = r9.Z
        L53:
            long r6 = r9.S
            java.lang.String r9 = java.lang.String.valueOf(r6)
            a.zl60 r4 = new a.zl60
            r4.<init>(r9, r2)
            a.cyh r9 = r8.C
            a.p5a r9 = r9.a(r4)
            a.vxb r2 = new a.vxb
            r2.<init>(r9, r5, r8)
            a.vsg0 r8 = new a.vsg0
            r8.<init>(r2)
            r0.k = r3
            java.lang.Object r8 = a.ntb.K(r8, r0)
            if (r8 != r1) goto L77
        L76:
            return r1
        L77:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.v7c.N(a.zje):java.lang.Object");
    }

    public final void O(String str) {
        this.P.f(new a7c(str, (str == null || str.length() == 0) ? R.attr.uikitSecondary : R.attr.uikitWarning));
    }

    public final void P() {
        d6c d6cVar = this.d;
        boolean z = d6cVar instanceof s5c;
        iw20 iw20Var = this.q;
        i1w0 i1w0Var = this.c;
        if (z) {
            s5c s5cVar = (s5c) d6cVar;
            String str = s5cVar.i;
            str.getClass();
            owp0 owp0Var = this.l.f8298a;
            if (str.length() > 0) {
                owp0Var.i(str);
            }
            ((kt2) this.h.b).c("acc_change_password_done");
            this.i.f31684a.a(xun.f41520a, 3244L);
            if (j7c.f16033a[s5cVar.j.ordinal()] == 2) {
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new q0w0(iw20.f(iw20Var, nqh0.f23960a))), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar.next());
                    }
                }
            } else {
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
                ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, new q0w0(pmi0.b(this.m, false))), i1w0Var, copyOnWriteArrayListQ2, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorP2;
                    if (!pawVar2.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar2.next());
                    }
                }
            }
        } else if (d6cVar.p() == 17 || d6cVar.p() == 1) {
            CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var);
            ListIterator listIteratorP3 = b1j.p(copyOnWriteArrayListQ3, new c8d(y7d.f42146a, new q0w0(iw20.f(iw20Var, nqh0.f23960a))), i1w0Var, copyOnWriteArrayListQ3, 0);
            while (true) {
                paw pawVar3 = (paw) listIteratorP3;
                if (!pawVar3.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar3.next());
                }
            }
        } else if (d6cVar instanceof y5c) {
            CopyOnWriteArrayList copyOnWriteArrayListQ4 = b1j.q(i1w0Var);
            ListIterator listIteratorP4 = b1j.p(copyOnWriteArrayListQ4, new c8d(y7d.f42146a, u0w0.f34875a), i1w0Var, copyOnWriteArrayListQ4, 0);
            while (true) {
                paw pawVar4 = (paw) listIteratorP4;
                if (!pawVar4.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar4.next());
                }
            }
        } else if (d6cVar.p() == 8 || d6cVar.p() == 9) {
            k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
            this.j.getClass();
            k0w0VarI.c(new MailingScreenFactoryImpl$getMailingManagementFragment$1());
            ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
            while (true) {
                paw pawVar5 = (paw) listIteratorO;
                if (!pawVar5.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar5.next());
                }
            }
        } else {
            int iP = d6cVar.p();
            jh70 jh70Var = this.k;
            if (iP == 25) {
                i1w0Var.getClass();
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                jh70Var.getClass();
                ListIterator listIteratorP5 = b1j.p(copyOnWriteArrayList, new c8d(y7d.f42146a, new q0w0(PersonalScreen$EditProfileTjScreen.f46781a)), i1w0Var, copyOnWriteArrayList, 0);
                while (true) {
                    paw pawVar6 = (paw) listIteratorP5;
                    if (!pawVar6.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar6.next());
                    }
                }
            } else {
                CopyOnWriteArrayList copyOnWriteArrayListQ5 = b1j.q(i1w0Var);
                ListIterator listIteratorP6 = b1j.p(copyOnWriteArrayListQ5, new c8d(y7d.f42146a, new q0w0(jh70.j(jh70Var, false))), i1w0Var, copyOnWriteArrayListQ5, 0);
                while (true) {
                    paw pawVar7 = (paw) listIteratorP6;
                    if (!pawVar7.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar7.next());
                    }
                }
            }
        }
    }

    public final void Q() {
        p7m0 p7m0Var;
        Object value;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (A() <= jCurrentTimeMillis) {
            do {
                p7m0Var = this.O;
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, o6c.f24727a));
            return;
        }
        long jA = A() - jCurrentTimeMillis;
        c4m0 c4m0Var = this.R;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        this.R = sac.T(new fnq(sac.L(6, jA, 0L), new l7c(this, null), (byte) 4), d5c.S(jiu0.a(this), this.g.c), u7c.h);
    }

    public final void a() {
        Object x6cVar;
        boolean z = this.u.a().T;
        d6c d6cVar = this.d;
        if (z && !(d6cVar instanceof a6c) && rcb.d1(d6cVar.p())) {
            x6cVar = c7c.f3855a;
        } else {
            x6cVar = new x6c(this.f.b.a(d6cVar instanceof r5c ? R.string.interrupt_authenticator_activation : R.string.close_the_activation_process_new, Arrays.copyOf(new Object[0], 0)));
        }
        this.P.f(x6cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w() {
        G(wm4.BREAK, o64.BREAK);
        d6c d6cVar = this.d;
        boolean z = d6cVar instanceof y5c;
        byte b = 0;
        i1w0 i1w0Var = this.c;
        if (z) {
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, u0w0.f34875a), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            Object[] objArr = 0;
            if (d6cVar instanceof a6c) {
                F(jiu0.a(this), this.g.f22085a, new e6c(b), new jtb(this, (a6c) d6cVar, objArr == true ? 1 : 0, (byte) 4));
                return;
            }
            if (d6cVar.p() == 24 && (d6cVar instanceof b6c)) {
                i1w0Var.d(new h6c(((b6c) d6cVar).h, this, b));
                return;
            }
            if (d6cVar.p() == 8 || d6cVar.p() == 9) {
                k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                this.j.getClass();
                k0w0VarI.c(new MailingScreenFactoryImpl$getMailingManagementFragment$1());
                ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorO;
                    if (!pawVar2.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar2.next());
                    }
                }
            } else {
                if (d6cVar.p() != 10 && d6cVar.p() != 11 && d6cVar.p() != 18) {
                    s5c s5cVar = d6cVar instanceof s5c ? (s5c) d6cVar : null;
                    if ((s5cVar != null ? s5cVar.j : null) != we50.f39003a) {
                        if (d6cVar.p() == 13) {
                            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
                            ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ2, 0);
                            while (true) {
                                paw pawVar3 = (paw) listIteratorP2;
                                if (!pawVar3.hasNext()) {
                                    return;
                                } else {
                                    i1w0Var.a((oe50) pawVar3.next());
                                }
                            }
                        } else {
                            CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var);
                            ListIterator listIteratorP3 = b1j.p(copyOnWriteArrayListQ3, new c8d(y7d.f42146a, new q0w0(iw20.f(this.q, nqh0.f23960a))), i1w0Var, copyOnWriteArrayListQ3, 0);
                            while (true) {
                                paw pawVar4 = (paw) listIteratorP3;
                                if (!pawVar4.hasNext()) {
                                    return;
                                } else {
                                    i1w0Var.a((oe50) pawVar4.next());
                                }
                            }
                        }
                    }
                }
                CopyOnWriteArrayList copyOnWriteArrayListQ4 = b1j.q(i1w0Var);
                ListIterator listIteratorP4 = b1j.p(copyOnWriteArrayListQ4, new c8d(y7d.f42146a, new q0w0(jh70.j(this.k, false))), i1w0Var, copyOnWriteArrayListQ4, 0);
                while (true) {
                    paw pawVar5 = (paw) listIteratorP4;
                    if (!pawVar5.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar5.next());
                    }
                }
            }
        }
    }

    public final void x() {
        i1w0 i1w0Var = this.c;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new q0w0(null)), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                this.z.q(new bb50(false), true);
                return;
            }
            i1w0Var.a((oe50) pawVar.next());
        }
    }

    public final ym4 y() {
        d6c d6cVar = this.d;
        if (d6cVar != null) {
            if (d6cVar instanceof o5c) {
                return ym4.LINK_PHONE_AUTHENTICATOR;
            }
            if (d6cVar instanceof p5c) {
                return ym4.LINK_PHONE_AUTHENTICATOR;
            }
            if (d6cVar instanceof q5c) {
                return ym4.LINK_PHONE_AUTHENTICATOR;
            }
            if (d6cVar instanceof s5c) {
                return ym4.SKIP;
            }
            if (d6cVar instanceof t5c) {
                return ym4.CHANGE_PHONE_NUMBER;
            }
            if (d6cVar instanceof u5c) {
                return ym4.PHONE_ACTIVATION;
            }
            if (d6cVar instanceof w5c) {
                return ym4.PHONE_ACTIVATION;
            }
            if (d6cVar instanceof x5c) {
                return ym4.LINK_PHONE;
            }
            if (d6cVar instanceof z5c) {
                return ym4.PHONE_ACTIVATION;
            }
            if (d6cVar instanceof a6c) {
                return ym4.REGISTRATION_BY_PHONE;
            }
            if (d6cVar instanceof b6c) {
                return ym4.PASSWORD_RECOVERY;
            }
            if (d6cVar instanceof c6c) {
                int i = ((c6c) d6cVar).c;
                return (12 > i || i >= 17) ? ym4.LINK_PHONE : ym4.LINK_PHONE_AUTHENTICATOR;
            }
        }
        t9f.b();
        return null;
    }

    public final obk0 z() {
        obk0 obk0Var = (obk0) this.b.a("SAVED_CURRENT_ACTIVATION_TYPE");
        return obk0Var == null ? this.d.P() : obk0Var;
    }
}
