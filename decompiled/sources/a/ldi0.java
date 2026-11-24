package a;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.security.impl.navigation.PhoneScreenFactoryImpl$getConfirmPhoneNumberBySmsScreen$1;
import org.xplatform.security.impl.navigation.SendConfirmationSMSScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class ldi0 extends w46 {
    public final au0 A;
    public final ag3 B;
    public final ik4 C;
    public c4m0 D;
    public c4m0 E;
    public bby F;
    public final p7m0 G;
    public final p7m0 H;
    public final ol60 I;
    public final i1w0 b;
    public final dci0 c;
    public final duj d;
    public final mne e;
    public final x1u f;
    public final c5k g;
    public final cyh h;
    public final z4w0 i;
    public final zn00 j;
    public final qud k;
    public final nv20 l;
    public final zg m;
    public final nr n;
    public final s64 o;
    public final ctf0 p;
    public final rou q;
    public final n5c r;
    public final pru s;
    public final fvt0 t;
    public final m1e u;
    public final mi70 v;
    public final zn00 w;
    public final wpt x;
    public final zx10 y;
    public final rek0 z;

    public ldi0(vzg0 vzg0Var, i1w0 i1w0Var, dci0 dci0Var, duj dujVar, mne mneVar, x1u x1uVar, c5k c5kVar, cyh cyhVar, z4w0 z4w0Var, zn00 zn00Var, qud qudVar, nv20 nv20Var, zg zgVar, nr nrVar, s64 s64Var, ctf0 ctf0Var, rou rouVar, n5c n5cVar, pru pruVar, fvt0 fvt0Var, m1e m1eVar, mi70 mi70Var, zn00 zn00Var2, wpt wptVar, zx10 zx10Var, rek0 rek0Var, au0 au0Var, ag3 ag3Var, ik4 ik4Var) {
        ici0 ici0Var;
        ctf0Var.getClass();
        m1eVar.getClass();
        this.b = i1w0Var;
        this.c = dci0Var;
        this.d = dujVar;
        this.e = mneVar;
        this.f = x1uVar;
        this.g = c5kVar;
        this.h = cyhVar;
        this.i = z4w0Var;
        this.j = zn00Var;
        this.k = qudVar;
        this.l = nv20Var;
        this.m = zgVar;
        this.n = nrVar;
        this.o = s64Var;
        this.p = ctf0Var;
        this.q = rouVar;
        this.r = n5cVar;
        this.s = pruVar;
        this.t = fvt0Var;
        this.u = m1eVar;
        this.v = mi70Var;
        this.w = zn00Var2;
        this.x = wptVar;
        this.y = zx10Var;
        this.z = rek0Var;
        this.A = au0Var;
        this.B = ag3Var;
        this.C = ik4Var;
        p7m0 p7m0VarA = q7m0.a(new kbi0(dci0Var.getToken(), dci0Var.u() ? dci0Var.D() : dci0Var.z()));
        this.G = p7m0VarA;
        byte b = 0;
        int iR0 = rcb.r0(dci0Var.p(), false);
        boolean z = ((dci0Var instanceof tbi0) && ((tbi0) dci0Var).b) || ((dci0Var instanceof vbi0) && ((vbi0) dci0Var).g) || ((dci0Var instanceof aci0) && ((aci0) dci0Var).h);
        zie0 zie0Var = obk0.b;
        List list = ((kbi0) p7m0VarA.getValue()).b;
        zie0Var.getClass();
        boolean zD = zie0.d(list);
        boolean zF = zie0.f(((kbi0) p7m0VarA.getValue()).b);
        boolean zE = zie0.e(((kbi0) p7m0VarA.getValue()).b);
        boolean zC = zie0.c(((kbi0) p7m0VarA.getValue()).b);
        if (zie0.f(dci0Var.z())) {
            ici0Var = gci0.f11064a;
        } else {
            ici0Var = ((dci0Var instanceof xbi0) || (dci0Var instanceof ybi0)) ? hci0.f12826a : fci0.f9314a;
        }
        p7m0 p7m0VarA2 = q7m0.a(new uci0(z, zD, zF, zE, zC, iR0, h8x.J(ctf0Var, dci0Var.getPhoneNumber(), R.string.code_has_been_sent_for_confirmation_v2), ici0Var, true, pruVar.a().o && rcb.d1(dci0Var.p()), false));
        this.H = p7m0VarA2;
        this.I = new ol60(3);
        yje yjeVar = null;
        sac.T(new fnq(p7m0VarA, new zci0(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), adi0.h);
        if (((uci0) p7m0VarA2.getValue()).h instanceof hci0) {
            B(jiu0.a(this), new nxh0(1, this, ldi0.class, "localHandleError", "localHandleError(Ljava/lang/Throwable;)V", 0, (byte) 24), new yci0(this, yjeVar, b));
        }
    }

    public final ym4 A() {
        dci0 dci0Var = this.c;
        if (dci0Var != null) {
            if (dci0Var instanceof tbi0) {
                return ym4.LINK_PHONE_AUTHENTICATOR;
            }
            if (dci0Var instanceof ubi0) {
                return ym4.LINK_PHONE_AUTHENTICATOR;
            }
            if (dci0Var instanceof sbi0) {
                return ym4.LINK_PHONE_AUTHENTICATOR;
            }
            if (dci0Var instanceof wbi0) {
                return ym4.CHANGE_PHONE_NUMBER;
            }
            if (dci0Var instanceof xbi0) {
                return ym4.PHONE_ACTIVATION;
            }
            if (dci0Var instanceof ybi0) {
                return ym4.PHONE_ACTIVATION;
            }
            if (dci0Var instanceof zbi0) {
                return ym4.REGISTRATION_BY_PHONE;
            }
            if (dci0Var instanceof aci0) {
                return ym4.PASSWORD_RECOVERY;
            }
            if (dci0Var instanceof vbi0) {
                return ym4.SKIP;
            }
            if (dci0Var instanceof bci0) {
                int i = ((bci0) dci0Var).c;
                return (12 > i || i >= 17) ? ym4.LINK_PHONE : ym4.LINK_PHONE_AUTHENTICATOR;
            }
            if (dci0Var instanceof cci0) {
                return ym4.LINK_PHONE;
            }
        }
        t9f.b();
        return null;
    }

    public final bby B(bvc bvcVar, Function1 function1, Function2 function2) {
        return sac.V(bvcVar, new nxh0(1, function1, Function1.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0, (byte) 25), new a7g0(this, (byte) 28), this.e.b, new r7i0(this, function2, null), 8);
    }

    public final void C(Throwable th) {
        byte b = 13;
        duj dujVar = this.d;
        if (th != null) {
            boolean z = th instanceof SocketTimeoutException;
            ol60 ol60Var = this.I;
            if (z || (th instanceof UnknownHostException)) {
                ol60Var.f(pci0.f26761a);
                return;
            }
            if (th instanceof an4) {
                i1w0 i1w0Var = this.b;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new q0w0(null)), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        i1w0Var.d(new huh0(this, th, (byte) 1));
                        return;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
            } else if (th instanceof zhi0) {
                kuw kuwVar = ((zhi0) th).c;
                if (kuwVar == i2o.TokenExpiredError) {
                    String message = th.getMessage();
                    ol60Var.f(new jci0(message != null ? message : ""));
                    return;
                } else if (kuwVar != i2o.LimitOfSms) {
                    dujVar.b(th, new uph0(this, b));
                    return;
                } else {
                    String message2 = th.getMessage();
                    ol60Var.f(new qci0(message2 != null ? message2 : ""));
                    return;
                }
            }
        }
        dujVar.b(th, new uph0(this, b));
    }

    public final void D() {
        c4m0 c4m0Var = this.E;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        dci0 dci0Var = this.c;
        boolean z = dci0Var instanceof ubi0;
        ol60 ol60Var = this.I;
        if (z) {
            ol60Var.f(mci0.f21554a);
            return;
        }
        if (this.s.a().T && !(dci0Var instanceof zbi0) && rcb.d1(dci0Var.p())) {
            ol60Var.f(nci0.f23296a);
        } else if (dci0Var.p() == 24 || dci0Var.p() == 12) {
            ol60Var.f(oci0.f25028a);
        } else {
            x();
        }
    }

    public final void E() {
        bby bbyVar = this.F;
        if ((bbyVar == null || !bbyVar.isActive()) && ((uci0) this.H.getValue()).i) {
            this.F = B(jiu0.a(this), new nxh0(1, this, ldi0.class, "localHandleError", "localHandleError(Ljava/lang/Throwable;)V", 0, (byte) 28), new yci0(this, null, (byte) 3));
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0293 A[LOOP:0: B:55:0x028a->B:57:0x0293, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x029d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object F(qfi0 qfi0Var, obk0 obk0Var, zje zjeVar) {
        ddi0 ddi0Var;
        d6c p5cVar;
        d6c w5cVar;
        sbi0 sbi0Var;
        Object objA;
        obk0 obk0Var2;
        i1w0 i1w0Var;
        ListIterator listIteratorO;
        paw pawVar;
        qfi0 qfi0Var2 = qfi0Var;
        if (zjeVar instanceof ddi0) {
            ddi0Var = (ddi0) zjeVar;
            int i = ddi0Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                ddi0Var.n = i - Integer.MIN_VALUE;
            } else {
                ddi0Var = new ddi0(this, zjeVar);
            }
        } else {
            ddi0Var = new ddi0(this, zjeVar);
        }
        Object obj = ddi0Var.l;
        wne wneVar = wne.f39444a;
        int i2 = ddi0Var.n;
        dci0 dci0Var = this.c;
        if (i2 == 0) {
            z1x.P(obj);
            if (dci0Var != null) {
                if (dci0Var instanceof vbi0) {
                    vbi0 vbi0Var = (vbi0) dci0Var;
                    List list = vbi0Var.d;
                    List list2 = vbi0Var.e;
                    qfi0Var2.getClass();
                    obk0Var.getClass();
                    list.getClass();
                    list2.getClass();
                    String str = vbi0Var.f37143a;
                    swp0 swp0Var = qfi0Var2.f28636a;
                    int i3 = vbi0Var.c;
                    String str2 = vbi0Var.h;
                    p5cVar = new s5c(str, swp0Var, i3, list, list2, qfi0Var2.b, obk0Var, vbi0Var.f, str2, vbi0Var.i, vbi0Var.g);
                } else {
                    if (dci0Var instanceof wbi0) {
                        wbi0 wbi0Var = (wbi0) dci0Var;
                        List list3 = wbi0Var.d;
                        List list4 = wbi0Var.e;
                        qfi0Var2.getClass();
                        obk0Var.getClass();
                        list3.getClass();
                        list4.getClass();
                        w5cVar = new t5c(wbi0Var.f38881a, qfi0Var2.f28636a, wbi0Var.c, list3, list4, qfi0Var2.b, obk0Var, wbi0Var.h, wbi0Var.f, wbi0Var.g);
                    } else if (dci0Var instanceof sbi0) {
                        sbi0Var = (sbi0) dci0Var;
                        ddi0Var.i = qfi0Var2;
                        ddi0Var.j = obk0Var;
                        ddi0Var.k = sbi0Var;
                        ddi0Var.n = 1;
                        objA = this.q.a(false, ddi0Var);
                        if (objA == wneVar) {
                            return wneVar;
                        }
                        obk0Var2 = obk0Var;
                    } else if (dci0Var instanceof zbi0) {
                        zbi0 zbi0Var = (zbi0) dci0Var;
                        ArrayList arrayList = zbi0Var.c;
                        ArrayList arrayList2 = zbi0Var.d;
                        qfi0Var2.getClass();
                        obk0Var.getClass();
                        w5cVar = new a6c(zbi0Var.f44118a, qfi0Var2.f28636a, arrayList, arrayList2, qfi0Var2.b, obk0Var, zbi0Var.f, zbi0Var.g, zbi0Var.h, zbi0Var.i, zbi0Var.j, zbi0Var.k, zbi0Var.l, zbi0Var.m, zbi0Var.n, zbi0Var.o, zbi0Var.e);
                    } else if (dci0Var instanceof aci0) {
                        aci0 aci0Var = (aci0) dci0Var;
                        List list5 = aci0Var.c;
                        List list6 = aci0Var.d;
                        qfi0Var2.getClass();
                        obk0Var.getClass();
                        list5.getClass();
                        list6.getClass();
                        w5cVar = new b6c(aci0Var.f628a, qfi0Var2.f28636a, list5, list6, qfi0Var2.b, obk0Var, aci0Var.e, aci0Var.i, aci0Var.f, aci0Var.g, aci0Var.h);
                    } else if (dci0Var instanceof xbi0) {
                        xbi0 xbi0Var = (xbi0) dci0Var;
                        List list7 = xbi0Var.d;
                        List list8 = xbi0Var.e;
                        qfi0Var2.getClass();
                        obk0Var.getClass();
                        list7.getClass();
                        list8.getClass();
                        w5cVar = new z5c(xbi0Var.f40601a, qfi0Var2.f28636a, xbi0Var.b, list7, list8, qfi0Var2.b, obk0Var, xbi0Var.c, new SendConfirmationSMSScreen(xbi0Var));
                    } else if (dci0Var instanceof bci0) {
                        bci0 bci0Var = (bci0) dci0Var;
                        List list9 = bci0Var.d;
                        List list10 = bci0Var.e;
                        qfi0Var2.getClass();
                        obk0Var.getClass();
                        list9.getClass();
                        list10.getClass();
                        w5cVar = new c6c(bci0Var.f2358a, qfi0Var2.f28636a, bci0Var.c, list9, list10, qfi0Var2.b, obk0Var, bci0Var.f, bci0Var.g);
                    } else if (dci0Var instanceof cci0) {
                        cci0 cci0Var = (cci0) dci0Var;
                        List list11 = cci0Var.c;
                        List list12 = cci0Var.d;
                        qfi0Var2.getClass();
                        obk0Var.getClass();
                        list11.getClass();
                        list12.getClass();
                        w5cVar = new x5c(cci0Var.f4113a, qfi0Var2.f28636a, list11, list12, qfi0Var2.b, obk0Var, cci0Var.f, cci0Var.e);
                    } else if (dci0Var instanceof ybi0) {
                        ybi0 ybi0Var = (ybi0) dci0Var;
                        List list13 = ybi0Var.c;
                        List list14 = ybi0Var.d;
                        qfi0Var2.getClass();
                        obk0Var.getClass();
                        list13.getClass();
                        list14.getClass();
                        w5cVar = new w5c(ybi0Var.f42344a, qfi0Var2.f28636a, list13, list14, qfi0Var2.b, obk0Var, new SendConfirmationSMSScreen(ybi0Var), ybi0Var.b);
                    } else if (dci0Var instanceof tbi0) {
                        qfi0Var2.getClass();
                        p5cVar = new p5c(((tbi0) dci0Var).f33666a, qfi0Var2.b, true);
                    } else if (dci0Var instanceof ubi0) {
                        ubi0 ubi0Var = (ubi0) dci0Var;
                        qfi0Var2.getClass();
                        p5cVar = new p5c(ubi0Var.f35383a, qfi0Var2.b, ubi0Var.b);
                    }
                    p5cVar = w5cVar;
                }
                i1w0Var = this.b;
                k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                this.v.getClass();
                k0w0VarI.k(new PhoneScreenFactoryImpl$getConfirmPhoneNumberBySmsScreen$1(p5cVar));
                listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                while (true) {
                    pawVar = (paw) listIteratorO;
                    if (pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
            t9f.b();
            return null;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sbi0 sbi0Var2 = ddi0Var.k;
        obk0 obk0Var3 = ddi0Var.j;
        qfi0 qfi0Var3 = ddi0Var.i;
        z1x.P(obj);
        sbi0Var = sbi0Var2;
        qfi0Var2 = qfi0Var3;
        objA = obj;
        obk0Var2 = obk0Var3;
        String str3 = ((m2c0) objA).Z;
        sbi0 sbi0Var3 = (sbi0) dci0Var;
        List list15 = sbi0Var3.c;
        List list16 = sbi0Var3.d;
        sbi0Var.getClass();
        qfi0Var2.getClass();
        obk0Var2.getClass();
        list15.getClass();
        list16.getClass();
        p5cVar = new o5c(str3, qfi0Var2.f28636a, list15, list16, qfi0Var2.b, obk0Var2, sbi0Var.e, sbi0Var.f, sbi0Var.g);
        i1w0Var = this.b;
        k0w0 k0w0VarI2 = cs0.i(i1w0Var, i1w0Var);
        this.v.getClass();
        k0w0VarI2.k(new PhoneScreenFactoryImpl$getConfirmPhoneNumberBySmsScreen$1(p5cVar));
        listIteratorO = b1j.o(i1w0Var, k0w0VarI2.f17489a, 0);
        while (true) {
            pawVar = (paw) listIteratorO;
            if (pawVar.hasNext()) {
                return Unit.f46060a;
            }
            i1w0Var.a((oe50) pawVar.next());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object G(ynb0 ynb0Var, zje zjeVar) {
        gdi0 gdi0Var;
        if (zjeVar instanceof gdi0) {
            gdi0Var = (gdi0) zjeVar;
            int i = gdi0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                gdi0Var.k = i - Integer.MIN_VALUE;
            } else {
                gdi0Var = new gdi0(this, zjeVar);
            }
        } else {
            gdi0Var = new gdi0(this, zjeVar);
        }
        Object objP0 = gdi0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = gdi0Var.k;
        if (i2 == 0) {
            z1x.P(objP0);
            String strA = this.x.a();
            gdi0Var.k = 1;
            objP0 = this.j.P0(gdi0Var, ynb0Var, strA);
            if (objP0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objP0);
        }
        return new Integer(((nte0) objP0).b);
    }

    public final void H(hfi0 hfi0Var) {
        ifi0 ifi0Var;
        dci0 dci0Var = this.c;
        if (dci0Var != null) {
            if ((dci0Var instanceof tbi0) || (dci0Var instanceof ubi0) || (dci0Var instanceof sbi0)) {
                ifi0Var = ifi0.LINK_PHONE_AUTHENTICATOR;
            } else if (dci0Var instanceof wbi0) {
                ifi0Var = ifi0.CHANGE_PHONE_NUMBER;
            } else if ((dci0Var instanceof xbi0) || (dci0Var instanceof ybi0)) {
                ifi0Var = ifi0.PHONE_ACTIVATION;
            } else if (dci0Var instanceof zbi0) {
                ifi0Var = ifi0.REGISTRATION_BY_PHONE;
            } else if (dci0Var instanceof aci0) {
                ifi0Var = ifi0.PASSWORD_RECOVERY;
            } else if (dci0Var instanceof vbi0) {
                ifi0Var = ifi0.SKIP;
            } else if (dci0Var instanceof bci0) {
                int i = ((bci0) dci0Var).c;
                ifi0Var = (12 > i || i >= 17) ? ifi0.LINK_PHONE : ifi0.LINK_PHONE_AUTHENTICATOR;
            } else if (dci0Var instanceof cci0) {
                ifi0Var = ifi0.LINK_PHONE;
            }
            s64 s64Var = this.o;
            s64Var.getClass();
            s1p s1pVar = s64Var.f31684a;
            yni0 yni0Var = new yni0();
            yni0Var.add(new j1p(hfi0Var.f12975a, (byte) 0));
            if (ifi0Var != ifi0.SKIP) {
                yni0Var.add(new j1p(ifi0Var.f14689a, (byte) 1));
            }
            s1pVar.a(cui0.a(yni0Var), 11076L);
            return;
        }
        t9f.b();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        if (r10 == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
    
        if (r10 == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a8, code lost:
    
        if (r10 == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b5, code lost:
    
        if (F(r10, r9, r0) == r1) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(a.obk0 r9, a.zje r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof a.jdi0
            if (r0 == 0) goto L13
            r0 = r10
            a.jdi0 r0 = (a.jdi0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.jdi0 r0 = new a.jdi0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L4b
            if (r2 == r7) goto L45
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L38
            if (r2 != r3) goto L32
            a.z1x.P(r10)
            goto Lb8
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r6
        L38:
            a.obk0 r9 = r0.i
            a.z1x.P(r10)
            goto Lab
        L3f:
            a.obk0 r9 = r0.i
            a.z1x.P(r10)
            goto L9c
        L45:
            a.obk0 r9 = r0.i
            a.z1x.P(r10)
            goto L87
        L4b:
            a.z1x.P(r10)
            a.dci0 r10 = r8.c
            if (r10 != 0) goto L53
            goto L9f
        L53:
            boolean r2 = r10 instanceof a.xbi0
            if (r2 == 0) goto L58
            goto L5c
        L58:
            boolean r2 = r10 instanceof a.ybi0
            if (r2 == 0) goto L8d
        L5c:
            a.p7m0 r10 = r8.H
            java.lang.Object r10 = r10.getValue()
            a.uci0 r10 = (a.uci0) r10
            a.ici0 r10 = r10.h
            boolean r2 = r10 instanceof a.eci0
            if (r2 == 0) goto L8a
            a.eci0 r10 = (a.eci0) r10
            a.pk r10 = r10.f7568a
            r0.i = r9
            r0.l = r7
            a.swp0 r10 = r10.f27112a
            a.wpt r2 = r8.x
            java.lang.String r2 = r2.a()
            a.zx10 r4 = r8.y
            java.lang.Object r4 = r4.f45137a
            a.kd30 r4 = (a.kd30) r4
            java.lang.Object r10 = r4.Y(r9, r10, r2, r0)
            if (r10 != r1) goto L87
            goto Lb7
        L87:
            a.qfi0 r10 = (a.qfi0) r10
            goto Lad
        L8a:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        L8d:
            boolean r10 = r10 instanceof a.zbi0
            if (r10 == 0) goto L9f
            r0.i = r9
            r0.l = r5
            java.lang.Object r10 = r8.J(r9, r7, r0)
            if (r10 != r1) goto L9c
            goto Lb7
        L9c:
            a.qfi0 r10 = (a.qfi0) r10
            goto Lad
        L9f:
            r0.i = r9
            r0.l = r4
            r10 = 0
            java.lang.Object r10 = r8.J(r9, r10, r0)
            if (r10 != r1) goto Lab
            goto Lb7
        Lab:
            a.qfi0 r10 = (a.qfi0) r10
        Lad:
            r0.i = r6
            r0.l = r3
            java.lang.Object r8 = r8.F(r10, r9, r0)
            if (r8 != r1) goto Lb8
        Lb7:
            return r1
        Lb8:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ldi0.I(a.obk0, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object J(obk0 obk0Var, boolean z, zje zjeVar) {
        kdi0 kdi0Var;
        if (zjeVar instanceof kdi0) {
            kdi0Var = (kdi0) zjeVar;
            int i = kdi0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                kdi0Var.k = i - Integer.MIN_VALUE;
            } else {
                kdi0Var = new kdi0(this, zjeVar);
            }
        } else {
            kdi0Var = new kdi0(this, zjeVar);
        }
        kdi0 kdi0Var2 = kdi0Var;
        Object objA = kdi0Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = kdi0Var2.k;
        if (i2 == 0) {
            z1x.P(objA);
            dci0 dci0Var = this.c;
            swp0 token = dci0Var.getToken();
            int iP = dci0Var.p();
            String strA = this.x.a();
            kdi0Var2.k = 1;
            objA = this.r.a(token, obk0Var, iP, z, strA, kdi0Var2);
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
        return new qfi0(pfi0Var.b, pfi0Var.f26908a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(ynb0 ynb0Var, zje zjeVar) {
        vci0 vci0Var;
        if (zjeVar instanceof vci0) {
            vci0Var = (vci0) zjeVar;
            int i = vci0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                vci0Var.k = i - Integer.MIN_VALUE;
            } else {
                vci0Var = new vci0(this, zjeVar);
            }
        } else {
            vci0Var = new vci0(this, zjeVar);
        }
        Object objW = vci0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = vci0Var.k;
        try {
            if (i2 == 0) {
                z1x.P(objW);
                fvt0 fvt0Var = this.t;
                vci0Var.k = 1;
                objW = ((kd30) fvt0Var.f10231a).w("", 0, ynb0Var, vci0Var);
                if (objW == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objW);
            }
            return (pk) objW;
        } catch (zhi0 e) {
            ym4 ym4VarA = A();
            int errorCode = e.c.getErrorCode();
            this.B.d(ym4VarA, errorCode);
            this.C.c(errorCode, ym4VarA.f42869a);
            throw e;
        }
    }

    public final void x() {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(zje zjeVar) {
        xci0 xci0Var;
        lie0 lie0Var;
        if (zjeVar instanceof xci0) {
            xci0Var = (xci0) zjeVar;
            int i = xci0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                xci0Var.l = i - Integer.MIN_VALUE;
            } else {
                xci0Var = new xci0(this, zjeVar);
            }
        } else {
            xci0Var = new xci0(this, zjeVar);
        }
        Object objA = xci0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = xci0Var.l;
        if (i2 == 0) {
            z1x.P(objA);
            lie0Var = new lie0();
            xci0Var.i = lie0Var;
            xci0Var.l = 1;
            objA = this.q.a(true, xci0Var);
            if (objA != wneVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(objA);
                return objA;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        lie0Var = xci0Var.i;
        z1x.P(objA);
        lie0 lie0Var2 = lie0Var;
        m2c0 m2c0Var = (m2c0) objA;
        dci0 dci0Var = this.c;
        String phoneNumber = dci0Var.getPhoneNumber();
        if (phoneNumber.length() == 0) {
            phoneNumber = m2c0Var.Z;
        }
        int iP = dci0Var.p();
        vsg0 vsg0Var = new vsg0(new wn2(this.h.a(new p6a(phoneNumber, String.valueOf(m2c0Var.S))), (yje) null, (w46) this, (iP == 8 || iP == 9) ? "link_phone_mailing" : "phone_binding", lie0Var2, (byte) 28));
        xci0Var.i = null;
        xci0Var.l = 2;
        Object objK = ntb.K(vsg0Var, xci0Var);
        return objK == wneVar ? wneVar : objK;
    }

    public final it2 z() {
        dci0 dci0Var = this.c;
        if (dci0Var != null) {
            if (dci0Var instanceof sbi0) {
                return it2.LINKING_AUTHENTICATOR;
            }
            if (dci0Var instanceof tbi0) {
                return it2.LINKING_AUTHENTICATOR;
            }
            if (dci0Var instanceof ubi0) {
                return it2.LINKING_AUTHENTICATOR;
            }
            if (dci0Var instanceof wbi0) {
                return it2.CHANGE;
            }
            if (dci0Var instanceof xbi0) {
                return it2.PHONE_ACTIVATE;
            }
            if (dci0Var instanceof ybi0) {
                return it2.PHONE_ACTIVATE;
            }
            if (dci0Var instanceof zbi0) {
                return it2.REGISTRATION_BY_PHONE;
            }
            if (dci0Var instanceof aci0) {
                return it2.PASS_RECOVERY;
            }
            if (dci0Var instanceof vbi0) {
                return it2.PASS_RECOVERY;
            }
            if (dci0Var instanceof bci0) {
                return it2.LINKING_PHONE;
            }
            if (dci0Var instanceof cci0) {
                return it2.LINKING_PHONE;
            }
        }
        t9f.b();
        return null;
    }
}
