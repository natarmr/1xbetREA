package a;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.registration.success.api.RegistrationSuccessParams;
import org.xplatform.security.api.presentation.models.ConfirmationNewPlaceResultType;

/* JADX INFO: loaded from: classes5.dex */
public final class d7f0 extends i3t0 {
    public static final /* synthetic */ int M = 0;
    public final im4 A;
    public final uyn B;
    public final cmt C;
    public final drm0 D;
    public final nou E;
    public final rou F;
    public final cyh G;
    public final z4w0 H;
    public final kwd I;
    public final mi70 J;
    public final x860 K;
    public bby L;
    public final RegistrationSuccessParams o;
    public final xte0 p;
    public final nr q;
    public final je r;
    public final ctf0 s;
    public final rrc t;
    public final eru u;
    public final mne v;
    public final i1w0 w;
    public final bk3 x;
    public final f4u y;
    public final lrc z;

    public d7f0(RegistrationSuccessParams registrationSuccessParams, xte0 xte0Var, nr nrVar, je jeVar, ctf0 ctf0Var, rrc rrcVar, eru eruVar, mne mneVar, i1w0 i1w0Var, bk3 bk3Var, f4u f4uVar, lrc lrcVar, im4 im4Var, pru pruVar, uyn uynVar, cmt cmtVar, drm0 drm0Var, nou nouVar, rou rouVar, cyh cyhVar, z4w0 z4w0Var, ljf0 ljf0Var, kwd kwdVar, mi70 mi70Var, sqx sqxVar) {
        ctf0Var.getClass();
        gvb0 gvb0Var = new gvb0(pruVar, registrationSuccessParams, (byte) 19);
        iv80 iv80Var = new iv80(ctf0Var, (byte) 21);
        vs10 vs10Var = mneVar.c;
        super(null, gvb0Var, iv80Var, cvm0.p(vs10Var, vs10Var), null);
        this.o = registrationSuccessParams;
        this.p = xte0Var;
        this.q = nrVar;
        this.r = jeVar;
        this.s = ctf0Var;
        this.t = rrcVar;
        this.u = eruVar;
        this.v = mneVar;
        this.w = i1w0Var;
        this.x = bk3Var;
        this.y = f4uVar;
        this.z = lrcVar;
        this.A = im4Var;
        this.B = uynVar;
        this.C = cmtVar;
        this.D = drm0Var;
        this.E = nouVar;
        this.F = rouVar;
        this.G = cyhVar;
        this.H = z4w0Var;
        this.I = kwdVar;
        this.J = mi70Var;
        this.K = new x860();
        i3t0.K(this, null, c7f0.f3859a, new bu(this, null, (byte) 14), 1);
        i3t0.A(this, im4Var, new ll4(((o7f0) D()).e), null, null, 6);
        i3t0.A(this, im4Var, new kl4(((o7f0) D()).h), null, null, 6);
        sqxVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b A[PHI: r11
  0x007b: PHI (r11v3 a.uu4) = (r11v14 a.uu4), (r11v15 a.uu4) binds: [B:27:0x0078, B:18:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a6 A[PHI: r11 r12
  0x00a6: PHI (r11v2 a.uu4) = (r11v16 a.uu4), (r11v17 a.uu4) binds: [B:30:0x00a3, B:17:0x003e] A[DONT_GENERATE, DONT_INLINE]
  0x00a6: PHI (r12v7 java.lang.Object) = (r12v14 java.lang.Object), (r12v1 java.lang.Object) binds: [B:30:0x00a3, B:17:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (r12 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bb, code lost:
    
        if (r12 == r1) goto L34;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00bb -> B:35:0x00be). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(a.tu4 r11, a.zje r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof a.p6f0
            if (r0 == 0) goto L13
            r0 = r12
            a.p6f0 r0 = (a.p6f0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.p6f0 r0 = new a.p6f0
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            a.cmt r3 = r10.C
            a.x860 r4 = r10.K
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r2 == 0) goto L50
            if (r2 == r8) goto L4a
            if (r2 == r7) goto L44
            if (r2 == r6) goto L3e
            if (r2 != r5) goto L38
            a.uu4 r11 = r0.i
            a.z1x.P(r12)
            goto Lbe
        L38:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r10)
            return r9
        L3e:
            a.uu4 r11 = r0.i
            a.z1x.P(r12)
            goto La6
        L44:
            a.uu4 r11 = r0.i
            a.z1x.P(r12)
            goto L7b
        L4a:
            a.uu4 r11 = r0.i
            a.z1x.P(r12)
            goto L6a
        L50:
            a.z1x.P(r12)
            r12 = 0
            r4.f40449a = r12
            a.ql4 r12 = new a.ql4
            java.lang.String r2 = r3.g()
            r12.<init>(r11, r2)
            r0.i = r11
            r0.l = r8
            java.lang.Object r12 = r10.O(r12, r0)
            if (r12 != r1) goto L6a
            goto Lbd
        L6a:
            a.qm4 r12 = (a.qm4) r12
        L6c:
            boolean r2 = r12 instanceof a.om4
            if (r2 == 0) goto Lc1
            r0.i = r11
            r0.l = r7
            java.lang.Object r12 = r4.b(r0)
            if (r12 != r1) goto L7b
            goto Lbd
        L7b:
            r0.i = r11
            r0.l = r6
            a.p6a r12 = new a.p6a
            java.lang.String r2 = a.atm0.m(r11)
            r12.<init>(r2, r6)
            a.cyh r2 = r10.G
            a.p5a r12 = r2.a(r12)
            a.tye0 r2 = new a.tye0
            r2.<init>(r10, r9, r7)
            a.fnq r8 = new a.fnq
            r8.<init>(r12, r2, r5)
            a.rf0 r12 = new a.rf0
            r2 = 11
            r12.<init>(r8, r2)
            java.lang.Object r12 = a.ntb.K(r12, r0)
            if (r12 != r1) goto La6
            goto Lbd
        La6:
            a.c7a r12 = (a.c7a) r12
            a.rl4 r2 = new a.rl4
            a.ynb0 r12 = r12.f3852a
            java.lang.String r8 = r3.g()
            r2.<init>(r11, r12, r8)
            r0.i = r11
            r0.l = r5
            java.lang.Object r12 = r10.O(r2, r0)
            if (r12 != r1) goto Lbe
        Lbd:
            return r1
        Lbe:
            a.qm4 r12 = (a.qm4) r12
            goto L6c
        Lc1:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a.d7f0.M(a.tu4, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object N(tu4 tu4Var, String str, zje zjeVar) {
        s6f0 s6f0Var;
        mm4 mm4Var;
        if (zjeVar instanceof s6f0) {
            s6f0Var = (s6f0) zjeVar;
            int i = s6f0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                s6f0Var.l = i - Integer.MIN_VALUE;
            } else {
                s6f0Var = new s6f0(this, zjeVar);
            }
        } else {
            s6f0Var = new s6f0(this, zjeVar);
        }
        Object objK = s6f0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = s6f0Var.l;
        im4 im4Var = this.A;
        if (i2 == 0) {
            z1x.P(objK);
            ol4 ol4Var = new ol4(tu4Var, str, this.C.g());
            s6f0Var.l = 1;
            im4Var.getClass();
            if (im4Var.a(ol4Var, s6f0Var) != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            z1x.P(objK);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mm4 mm4Var2 = s6f0Var.i;
                z1x.P(objK);
                return mm4Var2;
            }
            z1x.P(objK);
        }
        mm4Var = (mm4) objK;
        s6f0Var.i = mm4Var;
        s6f0Var.l = 3;
        im4Var.getClass();
        if (im4Var.a(jl4.f16698a, s6f0Var) != wneVar) {
            return wneVar;
        }
        return mm4Var;
        xp90 xp90Var = new xp90(im4Var.b(), (byte) 1);
        s6f0Var.l = 2;
        objK = ntb.K(xp90Var, s6f0Var);
        if (objK != wneVar) {
            mm4Var = (mm4) objK;
            s6f0Var.i = mm4Var;
            s6f0Var.l = 3;
            im4Var.getClass();
            if (im4Var.a(jl4.f16698a, s6f0Var) != wneVar) {
                return mm4Var;
            }
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0073 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object O(sl4 sl4Var, zje zjeVar) {
        v6f0 v6f0Var;
        qm4 qm4Var;
        if (zjeVar instanceof v6f0) {
            v6f0Var = (v6f0) zjeVar;
            int i = v6f0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                v6f0Var.l = i - Integer.MIN_VALUE;
            } else {
                v6f0Var = new v6f0(this, zjeVar);
            }
        } else {
            v6f0Var = new v6f0(this, zjeVar);
        }
        Object objK = v6f0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = v6f0Var.l;
        im4 im4Var = this.A;
        if (i2 == 0) {
            z1x.P(objK);
            v6f0Var.l = 1;
            im4Var.getClass();
            if (im4Var.a(sl4Var, v6f0Var) != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            z1x.P(objK);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qm4 qm4Var2 = v6f0Var.i;
                z1x.P(objK);
                return qm4Var2;
            }
            z1x.P(objK);
        }
        qm4Var = (qm4) objK;
        v6f0Var.i = qm4Var;
        v6f0Var.l = 3;
        im4Var.getClass();
        if (im4Var.a(jl4.f16698a, v6f0Var) != wneVar) {
            return wneVar;
        }
        return qm4Var;
        xp90 xp90Var = new xp90(im4Var.b(), (byte) 2);
        v6f0Var.l = 2;
        objK = ntb.K(xp90Var, v6f0Var);
        if (objK != wneVar) {
            qm4Var = (qm4) objK;
            v6f0Var.i = qm4Var;
            v6f0Var.l = 3;
            im4Var.getClass();
            if (im4Var.a(jl4.f16698a, v6f0Var) != wneVar) {
                return qm4Var;
            }
        }
        return wneVar;
    }

    public final tu4 P() {
        return new tu4(((o7f0) D()).f24784a, ((o7f0) D()).b, ((o7f0) D()).c, ((o7f0) D()).d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Q(zje zjeVar) {
        w6f0 w6f0Var;
        Object value;
        if (zjeVar instanceof w6f0) {
            w6f0Var = (w6f0) zjeVar;
            int i = w6f0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                w6f0Var.k = i - Integer.MIN_VALUE;
            } else {
                w6f0Var = new w6f0(this, zjeVar);
            }
        } else {
            w6f0Var = new w6f0(this, zjeVar);
        }
        Object obj = w6f0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = w6f0Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, o7f0.a((o7f0) value, true, false, 2015)));
            G(new l7f0(this.s.b.a(R.string.auth_process_failed, Arrays.copyOf(new Object[0], 0))));
            w6f0Var.k = 1;
            if (qcc.O(1000L, w6f0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        i1w0 i1w0Var = this.w;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, l0w0.f19221a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return Unit.f46060a;
            }
            i1w0Var.a((oe50) pawVar.next());
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0034  */
    public final Object R(Throwable th, bnn0 bnn0Var) {
        Object value;
        if (!(th instanceof i660)) {
            if (!(th instanceof fn50)) {
                Object objQ = Q(bnn0Var);
                return objQ == wne.f39444a ? objQ : Unit.f46060a;
            }
            Object objT = T(new xwe0(this, (fn50) th, (byte) 18), bnn0Var);
            wne wneVar = wne.f39444a;
            if (objT != wneVar) {
                objT = Unit.f46060a;
            }
            return objT == wneVar ? objT : Unit.f46060a;
        }
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, o7f0.a((o7f0) value, false, false, 2015)));
        String message = th.getMessage();
        if (message == null) {
            message = this.s.b.a(R.string.auth_process_failed, Arrays.copyOf(new Object[0], 0));
        } else {
            if (message.length() <= 0) {
                message = null;
            }
            if (message == null) {
                message = this.s.b.a(R.string.auth_process_failed, Arrays.copyOf(new Object[0], 0));
            }
        }
        G(new m7f0(message));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object S(zje zjeVar) {
        x6f0 x6f0Var;
        final boolean z;
        if (zjeVar instanceof x6f0) {
            x6f0Var = (x6f0) zjeVar;
            int i = x6f0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                x6f0Var.l = i - Integer.MIN_VALUE;
            } else {
                x6f0Var = new x6f0(this, zjeVar);
            }
        } else {
            x6f0Var = new x6f0(this, zjeVar);
        }
        Object objU = x6f0Var.j;
        Object obj = wne.f39444a;
        int i2 = x6f0Var.l;
        if (i2 == 0) {
            z1x.P(objU);
            x6f0Var.l = 1;
            objU = U(x6f0Var);
            if (objU != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            z1x.P(objU);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = x6f0Var.i;
            z1x.P(objU);
        }
        final double d = ((ql5) objU).b;
        this.w.d(new Function1() { // from class: a.o6f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                k0w0 k0w0Var = (k0w0) obj2;
                k0w0Var.getClass();
                boolean z2 = z;
                d7f0 d7f0Var = this;
                if (z2) {
                    k0w0Var.f();
                    k0w0Var.m(drm0.e(d7f0Var.D));
                } else if (((o7f0) d7f0Var.D()).i && d == 0.0d) {
                    d7f0Var.G(new i7f0());
                    k0w0Var.f();
                } else {
                    k0w0Var.f();
                }
                return Unit.f46060a;
            }
        });
        return Unit.f46060a;
        boolean zBooleanValue = ((Boolean) objU).booleanValue();
        x6f0Var.i = zBooleanValue;
        x6f0Var.l = 2;
        Object objA = this.E.a(tl5.c, x6f0Var);
        if (objA != obj) {
            z = zBooleanValue;
            objU = objA;
            final double d2 = ((ql5) objU).b;
            this.w.d(new Function1() { // from class: a.o6f0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    k0w0 k0w0Var = (k0w0) obj2;
                    k0w0Var.getClass();
                    boolean z2 = z;
                    d7f0 d7f0Var = this;
                    if (z2) {
                        k0w0Var.f();
                        k0w0Var.m(drm0.e(d7f0Var.D));
                    } else if (((o7f0) d7f0Var.D()).i && d2 == 0.0d) {
                        d7f0Var.G(new i7f0());
                        k0w0Var.f();
                    } else {
                        k0w0Var.f();
                    }
                    return Unit.f46060a;
                }
            });
            return Unit.f46060a;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object T(Function1 function1, zje zjeVar) {
        y6f0 y6f0Var;
        Object value;
        if (zjeVar instanceof y6f0) {
            y6f0Var = (y6f0) zjeVar;
            int i = y6f0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                y6f0Var.l = i - Integer.MIN_VALUE;
            } else {
                y6f0Var = new y6f0(this, zjeVar);
            }
        } else {
            y6f0Var = new y6f0(this, zjeVar);
        }
        Object obj = y6f0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = y6f0Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, o7f0.a((o7f0) value, false, false, 1951)));
            y6f0Var.i = function1;
            y6f0Var.l = 1;
            if (qcc.O(200L, y6f0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            function1 = y6f0Var.i;
            z1x.P(obj);
        }
        this.w.d(function1);
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object U(zje zjeVar) {
        z6f0 z6f0Var;
        if (zjeVar instanceof z6f0) {
            z6f0Var = (z6f0) zjeVar;
            int i = z6f0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                z6f0Var.k = i - Integer.MIN_VALUE;
            } else {
                z6f0Var = new z6f0(this, zjeVar);
            }
        } else {
            z6f0Var = new z6f0(this, zjeVar);
        }
        Object objA = z6f0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = z6f0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            z6f0Var.k = 1;
            objA = this.F.a(false, z6f0Var);
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
        cau0 cau0Var = ((m2c0) objA).e0;
        return Boolean.valueOf(((cau0Var == cau0.c || cau0Var == cau0.j) && ((o7f0) D()).k) || (cau0Var != cau0.h && ((o7f0) D()).j));
    }

    @Override // a.i3t0, a.k3t0
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final void x(i6f0 i6f0Var) throws Exception {
        Object value;
        Object value2;
        i6f0Var.getClass();
        super.x(i6f0Var);
        boolean z = i6f0Var instanceof h6f0;
        je jeVar = this.r;
        nr nrVar = this.q;
        ctf0 ctf0Var = this.s;
        if (z) {
            G(new j7f0(xww.d0((o7f0) D(), ctf0Var)));
            i8i.D("action", "share", (kt2) nrVar.b, "reg_popup_save");
            b1j.v("share", jeVar.f16351a, 3034L);
            return;
        }
        if (i6f0Var instanceof e6f0) {
            G(new h7f0(xww.d0((o7f0) D(), ctf0Var)));
            i8i.D("action", "copy", (kt2) nrVar.b, "reg_popup_save");
            b1j.v("copy", jeVar.f16351a, 3034L);
            return;
        }
        boolean z2 = i6f0Var instanceof g6f0;
        byte b = 2;
        yje yjeVar = null;
        mne mneVar = this.v;
        if (z2) {
            ((owp0) this.t.b).a();
            String str = ((o7f0) D()).f24784a;
            String str2 = ((o7f0) D()).b;
            String str3 = ((o7f0) D()).c;
            String str4 = ((o7f0) D()).d;
            cs0.x(str, str2, str3, str4);
            owp0 owp0Var = this.u.f8298a;
            uwb0 uwb0Var = (uwb0) owp0Var.b;
            if (str.length() > 0) {
                uwb0Var.c("USER_PASS_LOGIN", str);
            }
            if (str2.length() > 0) {
                owp0Var.i(str2);
            }
            if (str3.length() > 0 && str4.length() > 0) {
                uwb0Var.c("USER_PASS_PHONE_CODE", str3);
                uwb0Var.c("USER_PASS_PHONE_BODY", str4);
            }
            tu4 tu4VarP = P();
            e3c.n(this.L);
            this.L = i3t0.K(this, mneVar.c, null, new em4(this, tu4VarP, null), 2);
            return;
        }
        boolean z3 = i6f0Var instanceof f6f0;
        l0w0 l0w0Var = l0w0.f19221a;
        i1w0 i1w0Var = this.w;
        if (z3) {
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, l0w0Var), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            if (i6f0Var instanceof c6f0) {
                this.H.a(((c6f0) i6f0Var).f3815a);
                return;
            }
            if (!(i6f0Var instanceof b6f0)) {
                if (!(i6f0Var instanceof d6f0)) {
                    if (i6f0Var instanceof z5f0) {
                        E();
                        return;
                    } else {
                        if (i6f0Var.equals(y5f0.f42043a) || i6f0Var.equals(a6f0.f315a)) {
                            return;
                        }
                        t9f.b();
                        return;
                    }
                }
                ConfirmationNewPlaceResultType confirmationNewPlaceResultType = ((d6f0) i6f0Var).f5546a;
                if (confirmationNewPlaceResultType instanceof ConfirmationNewPlaceResultType.Success) {
                    String str5 = ((ConfirmationNewPlaceResultType.Success) confirmationNewPlaceResultType).f46937a;
                    e3c.n(this.L);
                    this.L = i3t0.K(this, mneVar.c, null, new hr(this, str5, yjeVar, (byte) 24), 2);
                    return;
                }
                boolean zEquals = confirmationNewPlaceResultType.equals(ConfirmationNewPlaceResultType.Canceled.f46935a);
                oyg0 oyg0Var = this.f;
                ocj ocjVar = this.i;
                if (zEquals) {
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var.m(value2, o7f0.a((o7f0) value2, false, true, 1951)));
                    return;
                }
                if (!confirmationNewPlaceResultType.equals(ConfirmationNewPlaceResultType.Error.f46936a)) {
                    t9f.b();
                    return;
                }
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value, o7f0.a((o7f0) value, false, true, 1983)));
                e3c.n(this.L);
                this.L = i3t0.K(this, mneVar.c, null, new hhb0(this, yjeVar, b), 2);
                return;
            }
            e3c.n(this.L);
            i1w0Var.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            v7d v7dVar = y7d.f42146a;
            copyOnWriteArrayList.add(new c8d(v7dVar, l0w0Var));
            copyOnWriteArrayList.add(new c8d(v7dVar, n0w0.f22721a));
            ListIterator listIteratorP2 = rz4.p(wez.b, new y9v0((byte) 15), i1w0Var, copyOnWriteArrayList, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorP2;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        }
    }
}
