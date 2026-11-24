package a;

import android.content.ComponentCallbacks2;
import android.graphics.RectF;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.game.core.betting.presentation.sub_games_filter.SubGamesFilterBottomSheetParams;
import org.xplatform.special_event.impl.special_event_tab.presentation.model.SpecialEventTabScreenParams;
import org.xplatform.swipex.impl.presentation.dialogs.confirmation.models.SwipeActionConfirmationParams;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jfm0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16435a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jfm0(Object obj, byte b) {
        this.f16435a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:138:0x031e A[PHI: r5 r6
  0x031e: PHI (r5v7 int) = (r5v6 int), (r5v6 int), (r5v12 int), (r5v12 int) binds: [B:112:0x02b7, B:113:0x02b9, B:133:0x0304, B:136:0x0310] A[DONT_GENERATE, DONT_INLINE]
  0x031e: PHI (r6v9 int) = (r6v8 int), (r6v8 int), (r6v13 int), (r6v13 int) binds: [B:112:0x02b7, B:113:0x02b9, B:133:0x0304, B:136:0x0310] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:140:0x0324  */
    /* JADX WARN: Code duplicated, block: B:142:0x0332  */
    /* JADX WARN: Code duplicated, block: B:144:0x0342  */
    /* JADX WARN: Code duplicated, block: B:146:0x0378  */
    /* JADX WARN: Code duplicated, block: B:147:0x037d  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Throwable {
        Throwable th;
        yzn0 yzn0VarA;
        float f;
        float f2;
        yqg0 yqg0Var;
        yqg0 yqg0Var2;
        String str;
        float fMax;
        Object value;
        byte b = this.f16435a;
        byte b2 = 7;
        byte b3 = 1;
        yje yjeVar = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (e9m0) ((gii0) ((kd30) obj).f18086a).b(sre0.f32672a.b(e9m0.class));
            case 1:
                return (hgm0) ((gii0) ((fuj0) obj).f10166a).b(sre0.f32672a.b(hgm0.class));
            case 2:
                return (sgm0) ((gii0) ((gxu) obj).b).b(sre0.f32672a.b(sgm0.class));
            case 3:
                return (xgm0) ((gii0) ((g090) obj).f10448a).b(sre0.f32672a.b(xgm0.class));
            case 4:
                return (bhm0) ((gii0) ((afm0) obj).b).b(sre0.f32672a.b(bhm0.class));
            case 5:
                long j = ((SubGamesFilterBottomSheetParams) obj).f46505a;
                Long lValueOf = Long.valueOf(j);
                if (j == -1) {
                    lValueOf = null;
                }
                return new txm0(null, lValueOf, "");
            case 6:
                return new w0n0((o2n0) obj, null, z0q0.g, "", "", false, 50, ljj.f20154a);
            case 7:
                ((r4n0) obj).i();
                return Unit.f46060a;
            case 8:
                r7z r7zVarA = ((b5n0) obj).a();
                e7z e7zVar = r7zVarA.f30000a;
                if (r7zVarA.n != ((xz40) ((ty40) e7zVar.p()).b).c) {
                    hz40 hz40Var = r7zVarA.f;
                    Object[] objArr = hz40Var.c;
                    long[] jArr = hz40Var.f13891a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j2 = jArr[i];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j2) < 128) {
                                        ((k7z) objArr[(i << 3) + i3]).d = true;
                                    }
                                    j2 >>= 8;
                                }
                                if (i2 == 8) {
                                }
                            }
                            if (i != length) {
                                i++;
                            }
                        }
                    }
                    if (e7zVar.i != null) {
                        if (!e7zVar.i1.e) {
                            e7z.U(e7zVar, false, 7);
                        }
                    } else if (!e7zVar.r()) {
                        e7z.W(e7zVar, false, 7);
                    }
                }
                return Unit.f46060a;
            case 9:
                return ((rdn0) obj).s.a();
            case 10:
                ((oen0) obj).getClass();
                return Boolean.FALSE;
            case 11:
                return ((ven0) obj).t.a();
            case 12:
                y2m0 y2m0Var = yfn0.c2;
                ((yfn0) obj).K0(fhn0.c, false);
                return Unit.f46060a;
            case 13:
                return ((uii) ((mkn0) obj).d.f15470a).r().a();
            case 14:
                mnn0 mnn0Var = (mnn0) obj;
                y1x y1xVar = mnn0Var.f22098a;
                a780 a780Var = mnn0Var.b;
                u99 u99VarV0 = y1xVar.V0();
                try {
                    yzn0VarA = knn0.f18595a.a(u99VarV0);
                    try {
                        u99VarV0.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    try {
                        u99VarV0.close();
                    } catch (Throwable th4) {
                        tjo.a(th3, th4);
                    }
                    th = th3;
                    yzn0VarA = null;
                    break;
                }
                if (th != null) {
                    throw th;
                }
                cyu cyuVar = (cyu) yzn0VarA.f43523a;
                yqg0 yqg0Var3 = (yqg0) cyuVar.f5196a;
                if (yqg0Var3 != null) {
                    gz40 gz40Var = yqg0Var3.o;
                    RectF rectF = gz40Var == null ? null : new RectF(gz40Var.b, gz40Var.c, gz40Var.c(), gz40Var.d());
                    lnn0 lnn0Var = rectF != null ? new lnn0(rectF.left, rectF.top, rectF.right, rectF.bottom) : null;
                    if (lnn0Var != null) {
                        f = lnn0Var.c - lnn0Var.f20355a;
                        f2 = lnn0Var.d - lnn0Var.b;
                    } else if (((yqg0) cyuVar.f5196a) != null) {
                        f = cyuVar.m().d;
                        if (((yqg0) cyuVar.f5196a) != null) {
                            f2 = cyuVar.m().e;
                        } else {
                            jf4.o("SVG document is empty");
                        }
                    } else {
                        jf4.o("SVG document is empty");
                    }
                    f7k0 f7k0Var = a780Var.b;
                    j1h0 j1h0Var = a780Var.c;
                    if (Intrinsics.d(f7k0Var, f7k0.c)) {
                        float fFloatValue = ((Number) mnn0Var.c.invoke(a780Var.f354a)).floatValue();
                        if (f > 0.0f) {
                            f *= fFloatValue;
                        }
                        if (f2 > 0.0f) {
                            f2 *= fFloatValue;
                        }
                    }
                    int iB = f > 0.0f ? si30.b(f) : 512;
                    int iB2 = f2 > 0.0f ? si30.b(f2) : 512;
                    f7k0 f7k0Var2 = a780Var.b;
                    kuo kuoVar = q1x.b;
                    long jZ = u1c.z(iB, iB2, f7k0Var2, j1h0Var, (f7k0) qbc.Q(a780Var, kuoVar));
                    int i4 = (int) (jZ >> 32);
                    int i5 = (int) (jZ & 4294967295L);
                    if (f <= 0.0f || f2 <= 0.0f) {
                        yqg0Var = (yqg0) cyuVar.f5196a;
                        if (yqg0Var != null) {
                            yqg0Var.r = osg0.s("100%");
                            yqg0Var2 = (yqg0) cyuVar.f5196a;
                            if (yqg0Var2 != null) {
                                yqg0Var2.s = osg0.s("100%");
                                str = (String) qbc.Q(a780Var, s1x.f31476a);
                                if (str != null) {
                                    dq00 dq00Var = new dq00((byte) 24);
                                    u3u0 u3u0Var = new u3u0(2);
                                    rh9 rh9Var = new rh9(str);
                                    rh9Var.h0();
                                    dq00Var.b = u3u0Var.f(rh9Var);
                                    yzn0VarA.b = dq00Var;
                                }
                                return new hkj(new b78(c3x.F(new onn0(cyuVar, (dq00) yzn0VarA.b, i4, i5))), true);
                            }
                            jf4.o("SVG document is empty");
                        } else {
                            jf4.o("SVG document is empty");
                        }
                    } else {
                        f7k0 f7k0Var3 = (f7k0) qbc.Q(a780Var, kuoVar);
                        float f3 = i4 / f;
                        float f4 = i5 / f2;
                        int iOrdinal = j1h0Var.ordinal();
                        if (iOrdinal == 0) {
                            fMax = Math.max(f3, f4);
                        } else if (iOrdinal == 1) {
                            fMax = Math.min(f3, f4);
                        } else {
                            t9f.b();
                        }
                        umk umkVar = f7k0Var3.f9062a;
                        if (umkVar instanceof rmk) {
                            float f5 = ((rmk) umkVar).f30747a / f;
                            if (fMax > f5) {
                                fMax = f5;
                            }
                        }
                        umk umkVar2 = f7k0Var3.b;
                        if (umkVar2 instanceof rmk) {
                            float f6 = ((rmk) umkVar2).f30747a / f2;
                            if (fMax > f6) {
                                fMax = f6;
                            }
                        }
                        i4 = (int) (fMax * f);
                        i5 = (int) (fMax * f2);
                        if (lnn0Var == null) {
                            float f7 = f - 0.0f;
                            float f8 = f2 - 0.0f;
                            yqg0 yqg0Var4 = (yqg0) cyuVar.f5196a;
                            if (yqg0Var4 != null) {
                                yqg0Var4.o = new gz40(0.0f, 0.0f, f7, f8);
                                yqg0Var = (yqg0) cyuVar.f5196a;
                                if (yqg0Var != null) {
                                    yqg0Var.r = osg0.s("100%");
                                    yqg0Var2 = (yqg0) cyuVar.f5196a;
                                    if (yqg0Var2 != null) {
                                        yqg0Var2.s = osg0.s("100%");
                                        str = (String) qbc.Q(a780Var, s1x.f31476a);
                                        if (str != null) {
                                            dq00 dq00Var2 = new dq00((byte) 24);
                                            u3u0 u3u0Var2 = new u3u0(2);
                                            rh9 rh9Var2 = new rh9(str);
                                            rh9Var2.h0();
                                            dq00Var2.b = u3u0Var2.f(rh9Var2);
                                            yzn0VarA.b = dq00Var2;
                                        }
                                        return new hkj(new b78(c3x.F(new onn0(cyuVar, (dq00) yzn0VarA.b, i4, i5))), true);
                                    }
                                    jf4.o("SVG document is empty");
                                } else {
                                    jf4.o("SVG document is empty");
                                }
                            } else {
                                jf4.o("SVG document is empty");
                            }
                        } else {
                            yqg0Var = (yqg0) cyuVar.f5196a;
                            if (yqg0Var != null) {
                                yqg0Var.r = osg0.s("100%");
                                yqg0Var2 = (yqg0) cyuVar.f5196a;
                                if (yqg0Var2 != null) {
                                    yqg0Var2.s = osg0.s("100%");
                                    str = (String) qbc.Q(a780Var, s1x.f31476a);
                                    if (str != null) {
                                        dq00 dq00Var3 = new dq00((byte) 24);
                                        u3u0 u3u0Var3 = new u3u0(2);
                                        rh9 rh9Var3 = new rh9(str);
                                        rh9Var3.h0();
                                        dq00Var3.b = u3u0Var3.f(rh9Var3);
                                        yzn0VarA.b = dq00Var3;
                                    }
                                    return new hkj(new b78(c3x.F(new onn0(cyuVar, (dq00) yzn0VarA.b, i4, i5))), true);
                                }
                                jf4.o("SVG document is empty");
                            } else {
                                jf4.o("SVG document is empty");
                            }
                        }
                    }
                } else {
                    jf4.o("SVG document is empty");
                }
                return null;
            case 15:
                j6m0 j6m0Var = snn0.n2;
                fiu0 fiu0Var = ((snn0) obj).k2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 16:
                return new non0(((SwipeActionConfirmationParams) obj).f47116a, new yvl((evq0) null, false, 7));
            case 17:
                return ((arn0) obj).q.a();
            case 18:
                tun0 tun0Var = (tun0) obj;
                y2m0 y2m0Var2 = tun0.P1;
                ComponentCallbacks2 application = tun0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(run0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof run0)) {
                        ze3Var = null;
                    }
                    run0 run0Var = (run0) ze3Var;
                    if (run0Var != null) {
                        i1w0 i1w0VarF = a4n0.f(tun0Var);
                        r34 r34Var = tun0Var.N1;
                        iiy[] iiyVarArr = tun0.Q1;
                        u3q u3qVar = new u3q(r34Var.n(tun0Var, iiyVarArr[1]).longValue(), tun0Var.O1.n(tun0Var, iiyVarArr[2]).longValue());
                        i1w0VarF.getClass();
                        mne mneVar = run0Var.f31135a;
                        gii0 gii0Var = run0Var.b;
                        knf0 knf0Var = run0Var.c;
                        yvn0 yvn0Var = run0Var.d;
                        q7d0 q7d0Var = run0Var.e;
                        vby vbyVar = run0Var.f;
                        ii iiVar = run0Var.g;
                        g9m0 g9m0Var = run0Var.h;
                        sjl0 sjl0Var = run0Var.j;
                        s31 s31Var = run0Var.k;
                        e41 e41Var = run0Var.l;
                        g2v g2vVar = run0Var.i;
                        wdk0 wdk0Var = run0Var.m;
                        rou rouVar = run0Var.n;
                        ctf0 ctf0Var = run0Var.o;
                        iiVar.getClass();
                        gii0Var.getClass();
                        knf0Var.getClass();
                        yvn0Var.getClass();
                        q7d0Var.getClass();
                        vbyVar.getClass();
                        sjl0Var.getClass();
                        wdk0Var.getClass();
                        ctf0Var.getClass();
                        return new vvi(iiVar, i1w0VarF, mneVar, gii0Var, knf0Var, yvn0Var, g9m0Var, u3qVar, sjl0Var, s31Var, g2vVar, e41Var, wdk0Var, rouVar, ctf0Var);
                    }
                }
                jf4.n(b1j.i(run0.class, "Cannot create dependency "));
                return null;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                bvn0 bvn0Var = (bvn0) obj;
                p7m0 p7m0Var = bvn0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    bvn0Var.f.getClass();
                } while (!p7m0Var.m(value, gvn0.a((gvn0) value, false, false, false, false, null, null, null, 253)));
                return Unit.f46060a;
            case 20:
                return (isn0) ((gii0) ((afm0) obj).b).b(sre0.f32672a.b(isn0.class));
            case 21:
                return ((a7o0) obj).f381a;
            case 22:
                return (x8o0) ((gii0) ((n0o0) ((trm0) obj).b).getValue()).b(sre0.f32672a.b(x8o0.class));
            case 23:
                return (SpecialEventTabScreenParams) obj;
            case 24:
                return ((zco0) obj).r.a();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                s9m0 s9m0Var = nfo0.O1;
                ttn0 ttn0Var = new ttn0((nfo0) obj, b2);
                kfo0 kfo0Var = new kfo0(ek5.h);
                kfo0Var.d.b(pym0.h(ttn0Var));
                return kfo0Var;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                umo0 umo0Var = (umo0) obj;
                bby bbyVar = umo0Var.H;
                if (bbyVar == null || !bbyVar.isActive()) {
                    umo0Var.H = sac.V(jiu0.a(umo0Var), new tfo0(1, umo0Var, umo0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 13), null, umo0Var.t.b, new rmo0(umo0Var, yjeVar, b3), 10);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return Integer.valueOf(((xno0) obj).f41179a.size());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Integer.valueOf(((yno0) obj).f42950a.size());
            default:
                hvo0 hvo0Var = (hvo0) obj;
                int i6 = hvo0.k2;
                if (!hvo0Var.R()) {
                    vcc.f0(i120.U(), hvo0Var, "TAX_INFO_DIALOG_RESULT_KEY");
                    hvo0Var.y0();
                }
                return Unit.f46060a;
        }
    }
}
