package a;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.net.ssl.SSLException;
import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.security.api.presentation.models.ConfirmRestoreByAuthenticatorType;

/* JADX INFO: loaded from: classes5.dex */
public final class kyd extends w46 {
    public final zr1 A;
    public final p7m0 B;
    public final p7m0 C;
    public final ol60 D;
    public c4m0 E;
    public bby F;
    public bby G;
    public bby H;
    public c4m0 I;
    public boolean J;
    public boolean K;
    public final vzg0 b;
    public final mne c;
    public final hse0 d;
    public final rou e;
    public final duj f;
    public final mi70 g;
    public final gxu h;
    public final rek0 i;
    public final i1w0 j;
    public final m1e k;
    public final ctf0 l;
    public final mne m;
    public final iqt n;
    public final suk o;
    public final ConfirmRestoreByAuthenticatorType p;
    public final zn00 q;
    public final qgd r;
    public final qgd s;
    public final suk t;
    public final tvd u;
    public final nyb v;
    public final nw20 w;
    public final epc x;
    public final zx10 y;
    public final yo4 z;

    public kyd(vzg0 vzg0Var, mne mneVar, hse0 hse0Var, rou rouVar, duj dujVar, mi70 mi70Var, gxu gxuVar, z4w0 z4w0Var, rek0 rek0Var, i1w0 i1w0Var, pru pruVar, m1e m1eVar, ctf0 ctf0Var, mne mneVar2, iqt iqtVar, suk sukVar, ConfirmRestoreByAuthenticatorType confirmRestoreByAuthenticatorType, zn00 zn00Var, qgd qgdVar, qgd qgdVar2, myb mybVar, suk sukVar2, tvd tvdVar, nyb nybVar, nw20 nw20Var, epc epcVar, zx10 zx10Var, g2v g2vVar, yo4 yo4Var, zr1 zr1Var) {
        hse0Var.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        this.b = vzg0Var;
        this.c = mneVar;
        this.d = hse0Var;
        this.e = rouVar;
        this.f = dujVar;
        this.g = mi70Var;
        this.h = gxuVar;
        this.i = rek0Var;
        this.j = i1w0Var;
        this.k = m1eVar;
        this.l = ctf0Var;
        this.m = mneVar2;
        this.n = iqtVar;
        this.o = sukVar;
        this.p = confirmRestoreByAuthenticatorType;
        this.q = zn00Var;
        this.r = qgdVar;
        this.s = qgdVar2;
        this.t = sukVar2;
        this.u = tvdVar;
        this.v = nybVar;
        this.w = nw20Var;
        this.x = epcVar;
        this.y = zx10Var;
        this.z = yo4Var;
        this.A = zr1Var;
        xuz xuzVar = pb10.c;
        boolean z = false;
        this.B = q7m0.a(new wxd(g2v.e(g2vVar, new mkm(), new fxd(this, (byte) 0)), "", true, false, true, false, false, (confirmRestoreByAuthenticatorType instanceof ConfirmRestoreByAuthenticatorType.Confirmation) || (confirmRestoreByAuthenticatorType instanceof ConfirmRestoreByAuthenticatorType.ConfirmByAuthenticator)));
        this.C = q7m0.a(gxd.f12073a);
        ol60 ol60Var = new ol60(3);
        this.D = ol60Var;
        this.J = true;
        if (!sj3.L(mybVar.f22595a.f34444a) && iqtVar.f15225a.a()) {
            z = true;
        }
        this.K = z;
        if (z) {
            ol60Var.f(nxd.f24278a);
        } else {
            H();
        }
    }

    public final long A() {
        Long l = (Long) this.b.a("SAVED_FINISH_TIME");
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final void B(Throwable th) {
        p7m0 p7m0Var;
        Object value;
        Object value2;
        do {
            p7m0Var = this.B;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, wxd.a((wxd) value, false, null, false, false, false, 254)));
        boolean z = th instanceof an4;
        i1w0 i1w0Var = this.j;
        if (z) {
            i1w0Var.d(new h6c(this, (an4) th, (byte) 15));
            return;
        }
        boolean z2 = th instanceof mu4;
        ctf0 ctf0Var = this.l;
        ol60 ol60Var = this.D;
        if (!z2) {
            if ((th instanceof SocketTimeoutException) || (th instanceof UnknownHostException)) {
                ol60Var.f(uxd.f36435a);
                return;
            }
            if (!(th instanceof zhi0)) {
                if (th instanceof z080) {
                    ol60Var.f(new oxd(ctf0Var.b.a(R.string.caution, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.data_retrieval_error_try_again, Arrays.copyOf(new Object[0], 0))));
                    return;
                } else if (th instanceof SSLException) {
                    ol60Var.f(mxd.f22548a);
                    return;
                } else {
                    this.f.b(th, new mhc(2, this, kyd.class, "onErrorHandlerCalled", "onErrorHandlerCalled(Ljava/lang/Throwable;Ljava/lang/String;)V", 0, (byte) 5));
                    return;
                }
            }
            zhi0 zhi0Var = (zhi0) th;
            if (zhi0Var instanceof uoo) {
                x();
                ol60Var.f(new qxd(ctf0Var.b.a(R.string.expired_operation_time_connection, Arrays.copyOf(new Object[0], 0))));
                return;
            }
            kuw kuwVar = zhi0Var.c;
            if (kuwVar == i2o.AuthCodeConfirmationLimit) {
                String message = zhi0Var.getMessage();
                ol60Var.f(new qxd(message != null ? message : ""));
                x();
                return;
            }
            if (kuwVar == i2o.OnlyOperatorCanEditParticipants) {
                String message2 = zhi0Var.getMessage();
                ol60Var.f(new sxd(message2 != null ? message2 : ""));
                return;
            }
            if (kuwVar == i2o.AuthInvalidCode) {
                I(zhi0Var.getMessage());
                return;
            }
            if (kuwVar != i2o.AnotherRelatedAccountParticipating) {
                String strA = ctf0Var.b.a(R.string.caution, Arrays.copyOf(new Object[0], 0));
                String message3 = zhi0Var.getMessage();
                ol60Var.f(new oxd(strA, message3 != null ? message3 : ""));
                return;
            } else {
                String message4 = zhi0Var.getMessage();
                String str = message4 != null ? message4 : "";
                ol60Var.f(kxd.f19048a);
                ol60Var.f(new rxd(str));
                return;
            }
        }
        if (xxd.f41652a[((mu4) th).f22396a.ordinal()] == 1) {
            if (((wxd) p7m0Var.getValue()).e) {
                G();
                return;
            } else {
                do {
                    value2 = p7m0Var.getValue();
                } while (!p7m0Var.m(value2, wxd.a((wxd) value2, false, null, true, false, false, 251)));
                return;
            }
        }
        if (!this.J) {
            return;
        }
        ol60Var.f(new rxd(ctf0Var.b.a(R.string.something_went_wrong, Arrays.copyOf(new Object[0], 0))));
        i1w0Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayList, new c8d(y7d.f42146a, new q0w0(null)), i1w0Var, copyOnWriteArrayList, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    public final void C(String str, lkk0 lkk0Var) {
        int iOrdinal = lkk0Var.ordinal();
        ctf0 ctf0Var = this.l;
        ol60 ol60Var = this.D;
        if (iOrdinal == 0) {
            ol60Var.f(new oxd(ctf0Var.b.a(R.string.caution, Arrays.copyOf(new Object[0], 0)), str));
            return;
        }
        if (iOrdinal == 1) {
            ol60Var.f(new sxd(str));
            return;
        }
        if (iOrdinal == 2) {
            ol60Var.f(new oxd(ctf0Var.b.a(R.string.error, Arrays.copyOf(new Object[0], 0)), str));
        } else if (iOrdinal == 3) {
            ol60Var.f(new sxd(str));
        } else {
            t9f.b();
        }
    }

    public final void D(boolean z) {
        if (z) {
            x();
        }
        i1w0 i1w0Var = this.j;
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

    public final void E(boolean z) {
        ConfirmRestoreByAuthenticatorType confirmRestoreByAuthenticatorType = this.p;
        if (confirmRestoreByAuthenticatorType == null) {
            return;
        }
        if (!(confirmRestoreByAuthenticatorType instanceof ConfirmRestoreByAuthenticatorType.ConfirmByAuthenticator)) {
            boolean z2 = confirmRestoreByAuthenticatorType instanceof ConfirmRestoreByAuthenticatorType.Confirmation;
            if (z2 && z2) {
                bby bbyVar = this.F;
                if (bbyVar != null) {
                    bbyVar.cancel(plc.b("Operation canceled by user", new art0()));
                }
                this.j.d(new x9((Object) this, z, (byte) 9));
                return;
            }
            return;
        }
        i8i.D("action", "other_method", this.z.f42966a, "authenticator_linked_device_click");
        b1j.v("other_method", this.A.f44833a, 3341L);
        bby bbyVar2 = this.F;
        if (bbyVar2 != null) {
            bbyVar2.cancel(plc.b("Operation canceled by user", new art0()));
        }
        sac.V(jiu0.a(this), new enc(1, this, kyd.class, "handleServerError", "handleServerError(Ljava/lang/Throwable;)V", 0, (byte) 25), null, null, new u88((Object) this, z, (yje) null, (byte) 4), 14);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object F(jkk0 jkk0Var, yje yjeVar) {
        iyd iydVar;
        p7m0 p7m0Var;
        Object value;
        Object value2;
        Object objY;
        Object value3;
        if (yjeVar instanceof iyd) {
            iydVar = (iyd) yjeVar;
            int i = iydVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                iydVar.k = i - Integer.MIN_VALUE;
            } else {
                iydVar = new iyd(this, yjeVar);
            }
        } else {
            iydVar = new iyd(this, yjeVar);
        }
        Object obj = iydVar.i;
        Object obj2 = wne.f39444a;
        int i2 = iydVar.k;
        if (i2 == 0) {
            z1x.P(obj);
            do {
                p7m0Var = this.B;
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, wxd.a((wxd) value, false, null, false, false, false, 251)));
            kkk0 kkk0Var = jkk0Var.e;
            lkk0 lkk0Var = jkk0Var.f;
            String str = jkk0Var.g;
            int iOrdinal = kkk0Var.ordinal();
            vzg0 vzg0Var = this.b;
            ol60 ol60Var = this.D;
            switch (iOrdinal) {
                case 1:
                case 4:
                    do {
                        value2 = p7m0Var.getValue();
                    } while (!p7m0Var.m(value2, wxd.a((wxd) value2, false, null, false, false, false, 222)));
                    vzg0Var.e("SAVED_FINISH_TIME", Long.valueOf(System.currentTimeMillis() + 30000));
                    K();
                    break;
                case 2:
                    String str2 = jkk0Var.b;
                    iydVar.k = 1;
                    ConfirmRestoreByAuthenticatorType confirmRestoreByAuthenticatorType = this.p;
                    if (confirmRestoreByAuthenticatorType != null) {
                        if ((confirmRestoreByAuthenticatorType instanceof ConfirmRestoreByAuthenticatorType.Migration) || (confirmRestoreByAuthenticatorType instanceof ConfirmRestoreByAuthenticatorType.ConfirmByAuthenticator)) {
                            objY = y(str2, iydVar);
                            if (objY != wne.f39444a) {
                                objY = Unit.f46060a;
                            }
                        } else if (confirmRestoreByAuthenticatorType instanceof ConfirmRestoreByAuthenticatorType.Confirmation) {
                            objY = w(str2, ((ConfirmRestoreByAuthenticatorType.Confirmation) confirmRestoreByAuthenticatorType).g, iydVar);
                            if (objY != wne.f39444a) {
                                objY = Unit.f46060a;
                            }
                        }
                        if (objY == obj2) {
                            return obj2;
                        }
                    }
                    t9f.b();
                    return null;
                case 3:
                    x();
                    ol60Var.f(txd.f34692a);
                    break;
                case 5:
                    C(str, lkk0Var);
                    break;
                case 6:
                    vzg0Var.e("SAVED_FINISH_TIME", Long.valueOf(System.currentTimeMillis() + 30000));
                    do {
                        value3 = p7m0Var.getValue();
                    } while (!p7m0Var.m(value3, wxd.a((wxd) value3, false, null, false, false, false, 222)));
                    K();
                    break;
                case 7:
                    break;
                case 8:
                    C(str, lkk0Var);
                    break;
                default:
                    this.x.b();
                    ol60Var.f(new oxd(this.l.b.a(R.string.caution, Arrays.copyOf(new Object[0], 0)), str));
                    break;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    public final void G() {
        bby bbyVar = this.G;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        bby bbyVar2 = this.F;
        if (bbyVar2 != null) {
            bbyVar2.cancel(null);
        }
        this.G = sac.V(jiu0.a(this), null, null, null, new yxd(this, yjeVar, (byte) 1), 15);
    }

    public final void H() {
        ckk0 ckk0Var;
        boolean zA = this.n.f15225a.a();
        ConfirmRestoreByAuthenticatorType confirmRestoreByAuthenticatorType = this.p;
        if (confirmRestoreByAuthenticatorType != null) {
            if (confirmRestoreByAuthenticatorType instanceof ConfirmRestoreByAuthenticatorType.Migration) {
                ckk0Var = ckk0.c;
            } else if (confirmRestoreByAuthenticatorType instanceof ConfirmRestoreByAuthenticatorType.ConfirmByAuthenticator) {
                ckk0Var = ckk0.e;
            } else if (confirmRestoreByAuthenticatorType instanceof ConfirmRestoreByAuthenticatorType.Confirmation) {
                ckk0Var = zA ? ckk0.b : ckk0.f4511a;
            }
            ckk0 ckk0Var2 = ckk0Var;
            bby bbyVar = this.F;
            if (bbyVar == null || !bbyVar.isActive()) {
                yje yjeVar = null;
                ConfirmRestoreByAuthenticatorType.Confirmation confirmation = confirmRestoreByAuthenticatorType instanceof ConfirmRestoreByAuthenticatorType.Confirmation ? (ConfirmRestoreByAuthenticatorType.Confirmation) confirmRestoreByAuthenticatorType : null;
                if (confirmation != null) {
                    String str = confirmation.c;
                    String str2 = confirmation.b;
                    zx10 zx10Var = this.y;
                    zx10Var.getClass();
                    str2.getClass();
                    str.getClass();
                    at4 at4Var = (at4) ((dpi0) zx10Var.f45137a).f6468a;
                    at4Var.getClass();
                    at4Var.f = new zs4(str2, str, null, 4);
                }
                this.F = sac.V(jiu0.a(this), new enc(1, this, kyd.class, "handleServerError", "handleServerError(Ljava/lang/Throwable;)V", 0, (byte) 24), null, this.c.b, new jtb(this, ckk0Var2, yjeVar, (byte) 14), 10);
                return;
            }
            return;
        }
        t9f.b();
    }

    public final void I(String str) {
        this.D.f(new lxd(str, (str == null || str.length() == 0) ? R.attr.uikitSecondary : R.attr.uikitWarning));
    }

    public final void J() {
        ctf0 ctf0Var = this.l;
        ConfirmRestoreByAuthenticatorType confirmRestoreByAuthenticatorType = this.p;
        this.D.f(new pxd((confirmRestoreByAuthenticatorType != null && ((confirmRestoreByAuthenticatorType instanceof ConfirmRestoreByAuthenticatorType.Migration) || (confirmRestoreByAuthenticatorType instanceof ConfirmRestoreByAuthenticatorType.ConfirmByAuthenticator))) ? ctf0Var.f(R.string.interrupt_authenticator_activation, new Object[0]) : ctf0Var.f(R.string.close_the_activation_process_new, new Object[0])));
    }

    public final void K() {
        p7m0 p7m0Var;
        Object value;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jA = A();
        gxd gxdVar = gxd.f12073a;
        p7m0 p7m0Var2 = this.C;
        yje yjeVar = null;
        if (jA == 0) {
            p7m0Var2.getClass();
            p7m0Var2.o(null, gxdVar);
            return;
        }
        if (A() <= jCurrentTimeMillis) {
            do {
                p7m0Var = this.B;
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, wxd.a((wxd) value, false, null, false, true, false, 223)));
            p7m0Var2.getClass();
            p7m0Var2.o(null, gxdVar);
            return;
        }
        long jA2 = A() - jCurrentTimeMillis;
        c4m0 c4m0Var = this.I;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        vsg0 vsg0VarL = sac.L(6, jA2, 0L);
        byte b = 12;
        this.I = sac.T(new dnq(new fnq(vsg0VarL, new ey(this, yjeVar, b), (byte) 4), new rj(this, yjeVar, b), (byte) 0), d5c.S(jiu0.a(this), this.m.c), jyd.h);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(String str, we50 we50Var, zje zjeVar) {
        zxd zxdVar;
        if (zjeVar instanceof zxd) {
            zxdVar = (zxd) zjeVar;
            int i = zxdVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                zxdVar.l = i - Integer.MIN_VALUE;
            } else {
                zxdVar = new zxd(this, zjeVar);
            }
        } else {
            zxdVar = new zxd(this, zjeVar);
        }
        Object objA = zxdVar.j;
        Object obj = wne.f39444a;
        int i2 = zxdVar.l;
        if (i2 == 0) {
            z1x.P(objA);
            zxdVar.i = we50Var;
            zxdVar.l = 1;
            objA = this.v.f24323a.a(str, zxdVar);
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            we50Var = zxdVar.i;
            z1x.P(objA);
        }
        this.x.b();
        this.j.d(new sw8((Object) this, objA, (Object) we50Var, (byte) 11));
        return Unit.f46060a;
    }

    public final void x() {
        bby bbyVar = this.F;
        if (bbyVar != null) {
            bbyVar.cancel(plc.b("Operation canceled by user", new art0()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (r9.e.a(true, r6) == r0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(java.lang.String r10, a.zje r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof a.ayd
            if (r0 == 0) goto L14
            r0 = r11
            a.ayd r0 = (a.ayd) r0
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
            a.ayd r0 = new a.ayd
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
            goto L6e
        L2c:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            r9 = 0
            return r9
        L33:
            a.z1x.P(r11)
            goto L63
        L37:
            a.z1x.P(r11)
            a.epc r11 = r9.x
            r11.b()
            r6.k = r8
            a.nw20 r11 = r9.w
            java.lang.Object r1 = r11.b
            a.ts4 r1 = (a.ts4) r1
            a.qr4 r1 = r1.b
            a.rr4 r1 = r1.b
            java.lang.Object r11 = r11.f24215a
            a.y3v r11 = (a.y3v) r11
            java.lang.String r2 = r1.f30962a
            java.lang.String r3 = r1.b
            java.lang.String r4 = ""
            r5 = r10
            r1 = r11
            java.lang.Object r10 = r1.p(r2, r3, r4, r5, r6)
            if (r10 != r0) goto L5e
            goto L60
        L5e:
            kotlin.Unit r10 = kotlin.Unit.f46060a
        L60:
            if (r10 != r0) goto L63
            goto L6d
        L63:
            r6.k = r7
            a.rou r10 = r9.e
            java.lang.Object r10 = r10.a(r8, r6)
            if (r10 != r0) goto L6e
        L6d:
            return r0
        L6e:
            a.i1w0 r10 = r9.j
            java.util.concurrent.CopyOnWriteArrayList r11 = a.b1j.q(r10)
            a.qgd r9 = r9.r
            org.xplatform.authenticator.impl.navigation.AuthenticatorScreenFactoryImpl$authenticatorScreen$1 r9 = r9.c()
            a.d1w0 r0 = new a.d1w0
            r0.<init>(r9)
            a.c8d r9 = new a.c8d
            a.v7d r1 = a.y7d.f42146a
            r9.<init>(r1, r0)
            r0 = 0
            java.util.ListIterator r9 = a.b1j.p(r11, r9, r10, r11, r0)
        L8b:
            r11 = r9
            a.paw r11 = (a.paw) r11
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L9e
            java.lang.Object r11 = r11.next()
            a.oe50 r11 = (a.oe50) r11
            r10.a(r11)
            goto L8b
        L9e:
            kotlin.Unit r9 = kotlin.Unit.f46060a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kyd.y(java.lang.String, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (r6 == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(a.zje r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof a.fyd
            if (r0 == 0) goto L13
            r0 = r6
            a.fyd r0 = (a.fyd) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.fyd r0 = new a.fyd
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            a.z1x.P(r6)
            goto L55
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L31:
            a.z1x.P(r6)
            goto L44
        L35:
            a.z1x.P(r6)
            r0.k = r4
            a.rou r6 = r5.e
            r2 = 0
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 != r1) goto L44
            goto L54
        L44:
            a.m2c0 r6 = (a.m2c0) r6
            boolean r6 = r6.n0
            if (r6 == 0) goto L72
            r0.k = r3
            a.gxu r6 = r5.h
            java.lang.Object r6 = r6.n(r0)
            if (r6 != r1) goto L55
        L54:
            return r1
        L55:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L72
            a.suk r5 = r5.t
            a.ts4 r5 = r5.f32825a
            a.vo4 r5 = r5.e
            a.qoj0 r5 = r5.f37746a
            a.i89 r6 = new a.i89
            r0 = 7
            r6.<init>(r5, r0)
            a.eu4 r5 = new a.eu4
            r0 = 4
            r5.<init>(r6, r0)
            return r5
        L72:
            a.eu4 r5 = new a.eu4
            r6 = 12
            java.lang.String r0 = ""
            r5.<init>(r0, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kyd.z(a.zje):java.lang.Object");
    }
}
