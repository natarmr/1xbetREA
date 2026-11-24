package a;

import android.gov.nist.core.Separators;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import com.huawei.hms.api.ConnectionResult;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.feed.navigation.FeedPopularScreenFactoryImpl$getTopGamesContainerScreen$1;
import org.xplatform.feed.navigation.SubscriptionsScreenFactoryImpl$getSubscriptionsScreen$1;
import org.xplatform.security.impl.navigation.ChangePhoneNumberScreen;
import org.xplatform.security.impl.navigation.PasswordScreenFactoryImpl$getPasswordChangeFragment$1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ij90 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14863a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ij90(Object obj, boolean z, byte b) {
        this.f14863a = b;
        this.c = obj;
        this.b = z;
    }

    /* JADX WARN: Code duplicated, block: B:139:0x02f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:140:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:143:0x0305 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x032a  */
    /* JADX WARN: Code duplicated, block: B:155:0x0337 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x0339  */
    /* JADX WARN: Code duplicated, block: B:160:0x0353 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:161:0x0355  */
    /* JADX WARN: Code duplicated, block: B:165:0x036b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0179 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x017b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0188 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ee  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3, types: [int] */
    /* JADX WARN: Type inference failed for: r13v9 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        m7h0 passwordScreenFactoryImpl$getPasswordChangeFragment$1;
        Object value;
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        long j;
        long jFloatToRawIntBits2;
        int iFloatToRawIntBits2;
        long j2;
        long jFloatToRawIntBits3;
        int iFloatToRawIntBits3;
        long j3;
        long jFloatToRawIntBits4;
        int iFloatToRawIntBits4;
        long jFloatToRawIntBits5;
        int iFloatToRawIntBits5;
        long j4;
        long jFloatToRawIntBits6;
        int iFloatToRawIntBits6;
        long j5;
        long jFloatToRawIntBits7;
        int iFloatToRawIntBits7;
        long j6;
        long jFloatToRawIntBits8;
        int iFloatToRawIntBits8;
        byte b = this.f14863a;
        byte b2 = 2;
        byte b3 = 15;
        byte b4 = 10;
        byte b5 = 20;
        byte b6 = 24;
        long j7 = 0;
        boolean z = false;
        boolean z2 = false;
        byte b7 = 1;
        boolean z3 = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                kk90 kk90Var = (kk90) obj2;
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                if (z3) {
                    Object obj3 = kk90Var.i.f;
                    passwordScreenFactoryImpl$getPasswordChangeFragment$1 = new ChangePhoneNumberScreen(sqb.f32620a);
                } else {
                    zn00 zn00Var = kk90Var.f;
                    we50 we50Var = we50.f39003a;
                    zn00Var.getClass();
                    passwordScreenFactoryImpl$getPasswordChangeFragment$1 = new PasswordScreenFactoryImpl$getPasswordChangeFragment$1(zn00Var, we50Var);
                }
                k0w0Var.h(passwordScreenFactoryImpl$getPasswordChangeFragment$1);
                return Unit.f46060a;
            case 1:
                ov0 ov0Var = (ov0) obj2;
                List<i6a0> list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                for (i6a0 i6a0Var : list) {
                    udl0 udl0Var = (udl0) ov0Var.d;
                    aw20 aw20Var = (aw20) ((fee) ov0Var.c.getValue()).c();
                    i6a0Var.getClass();
                    ArrayList arrayList2 = i6a0Var.f14230a;
                    aw20Var.getClass();
                    y9q0 y9q0VarJ0 = uzb.J0(aw20Var);
                    long j8 = i6a0Var.b;
                    String str = i6a0Var.c;
                    boolean z4 = this.b;
                    if (z4) {
                        str = "[" + j8 + "]: " + str;
                    }
                    String str2 = str;
                    boolean z5 = i6a0Var.f;
                    boolean z6 = i6a0Var.d;
                    Iterator it = arrayList2.iterator();
                    ?? size = z2;
                    while (it.hasNext()) {
                        size = ((List) it.next()).size() + size;
                    }
                    arrayList.add(new j6a0(new h6a0(j8, str2, z5, z6, ua80.e(size, Separators.LPAREN, Separators.RPAREN), i6a0Var.e, y9q0VarJ0), ro4.j0(arrayList2, i6a0Var.b, z4, x8x.G(aw20Var), null), String.valueOf(i6a0Var.b), udl0Var));
                    z2 = false;
                }
                return dyb.o0(arrayList);
            case 2:
                ckd ckdVar = (ckd) obj2;
                ckdVar.Q(z3);
                return new ub5((nlz) obj, ckdVar, b2);
            case 3:
                doc0 doc0Var = (doc0) obj2;
                ((Throwable) obj).getClass();
                if (z3) {
                    p7m0 p7m0Var = doc0Var.t;
                    p7m0Var.getClass();
                    p7m0Var.o(null, yee.f42482a);
                }
                return Unit.f46060a;
            case 4:
                aqc0 aqc0Var = (aqc0) obj2;
                Throwable th = (Throwable) obj;
                th.getClass();
                if ((th instanceof SocketTimeoutException) || (th instanceof UnknownHostException)) {
                    bby bbyVar = aqc0Var.z;
                    if (bbyVar == null || !bbyVar.isActive()) {
                        aqc0Var.z = sac.V(jiu0.a(aqc0Var), new ppb0(aqc0Var, b6), null, null, new xpc0(aqc0Var, z ? 1 : 0, b7), 14);
                    }
                } else if (!(th instanceof zhi0)) {
                    aqc0Var.w.b(th, new xh20(z2, aqc0Var, b3));
                }
                p7m0 p7m0Var2 = aqc0Var.i.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                    aqc0Var.f.getClass();
                } while (!p7m0Var2.m(value, wpc0.a((wpc0) value, false, true, this.b, null, 17)));
                return Unit.f46060a;
            case 5:
                g090 g090Var = (g090) obj2;
                u4f0 u4f0Var = (u4f0) obj;
                u4f0Var.getClass();
                r1f0 r1f0VarA = r1f0.a(u4f0Var.g, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z3), null, null, null, null, false, false, null, false, false, false, null, null, null, false, null, null, null, false, false, null, -262145, 127);
                List listC = kotlin.collections.a.c(u0f0.Z);
                g090Var.getClass();
                Map mapF = g090.f(u4f0Var, listC);
                ((vzg0) g090Var.f10448a).e("POLITICALLY_EXPOSED_PERSON", r1f0VarA.s);
                return new Pair(r1f0VarA, mapF);
            case 6:
                a4x a4xVar = (a4x) obj2;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hczVar.f(a4xVar.size(), new pwe0(new vtf0(b5), a4xVar, b4), new d1c0(a4xVar, (byte) 15), new ugd(2039820996, true, new gx(a4xVar, z3, a4xVar, b2)));
                return Unit.f46060a;
            case 7:
                xxi0 xxi0Var = (xxi0) obj2;
                ((Throwable) obj).getClass();
                if (z3 && ((twi0) xxi0Var.D()).R) {
                    xxi0Var.W();
                    xxi0Var.H(new kui0((byte) 19));
                }
                if (!((twi0) xxi0Var.D()).R) {
                    xxi0Var.H(new kui0(b5));
                }
                return Unit.f46060a;
            case 8:
                odj0 odj0Var = (odj0) obj2;
                ((Throwable) obj).getClass();
                if (z3 && ((tcj0) odj0Var.D()).T) {
                    odj0Var.V();
                    odj0Var.H(new r3j0((byte) 23));
                }
                if (!((tcj0) odj0Var.D()).T) {
                    odj0Var.H(new r3j0(b6));
                }
                return Unit.f46060a;
            case 9:
                org.xplatform.settings.impl.presentation.a aVar = (org.xplatform.settings.impl.presentation.a) obj2;
                ((Throwable) obj).getClass();
                if (z3 && aVar.O0) {
                    aVar.L();
                    aVar.P0++;
                }
                aVar.O0 = true;
                return Unit.f46060a;
            case 10:
                ngj0 ngj0Var = (ngj0) obj2;
                ((Throwable) obj).getClass();
                if (z3 && ((pfj0) ngj0Var.D()).P) {
                    ngj0Var.W();
                    ngj0Var.H(new mej0((byte) 26));
                }
                ngj0Var.H(new mej0((byte) 27));
                return Unit.f46060a;
            case 11:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                rrc rrcVar = ((zco0) obj2).s;
                m7r0 m7r0Var = z3 ? m7r0.f21334a : m7r0.b;
                rrcVar.getClass();
                k0w0Var2.h(new FeedPopularScreenFactoryImpl$getTopGamesContainerScreen$1(rrcVar, m7r0Var));
                return Unit.f46060a;
            case 12:
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                ((fho0) obj2).J.getClass();
                c8d c8dVar = (c8d) k0w0Var3.h(new SubscriptionsScreenFactoryImpl$getSubscriptionsScreen$1(z3)).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                return Unit.f46060a;
            case 13:
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                ((rio0) obj2).K.getClass();
                c8d c8dVar2 = (c8d) k0w0Var4.h(new SubscriptionsScreenFactoryImpl$getSubscriptionsScreen$1(z3)).f14945a;
                bjk bjkVar2 = cfx0.o;
                c8dVar2.f3908a = new v7d(true, bjkVar2, bjkVar2);
                return Unit.f46060a;
            case 14:
                pz10 pz10Var = (pz10) obj2;
                bnk0 bnk0Var = (bnk0) obj;
                bnk0Var.getClass();
                boolean z7 = pz10Var instanceof lz10;
                String strA = z7 ? ((lz10) pz10Var).g : pz10Var.a();
                String strB = z7 ? ((lz10) pz10Var).h : pz10Var.b();
                pzw.E(bnk0Var, "\u2066", 0, 0, 0, 0, 62);
                if (cy7.c() && z3) {
                    pzw.E(bnk0Var, strB, 0, pz10Var.i() ? R.color.static_green : R.color.static_white_60, 0, 0, 54);
                    pzw.E(bnk0Var, " : ", 0, R.color.static_white_60, 0, 0, 54);
                    pzw.E(bnk0Var, strA, 0, pz10Var.j() ? R.color.static_green : R.color.static_white_60, 0, 0, 54);
                } else {
                    pzw.E(bnk0Var, strA, 0, pz10Var.j() ? R.color.static_green : R.color.static_white_60, 0, 0, 54);
                    pzw.E(bnk0Var, " : ", 0, R.color.static_white_60, 0, 0, 54);
                    pzw.E(bnk0Var, strB, 0, pz10Var.i() ? R.color.static_green : R.color.static_white_60, 0, 0, 54);
                }
                pzw.E(bnk0Var, "\u2069", 0, 0, 0, 0, 62);
                return Unit.f46060a;
            case 15:
                tpq0 tpq0Var = (tpq0) obj2;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                tpq0Var.d.b(th2, new xh20((Object) tpq0Var, z3, (byte) 21));
                return Unit.f46060a;
            case 16:
                yqq0 yqq0Var = (yqq0) obj2;
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                yqq0Var.g.b(th3, new xh20((Object) yqq0Var, z3, (byte) 22));
                return Unit.f46060a;
            case 17:
                k0w0 k0w0Var5 = (k0w0) obj;
                k0w0Var5.getClass();
                ((xtq0) obj2).J.getClass();
                c8d c8dVar3 = (c8d) k0w0Var5.h(new SubscriptionsScreenFactoryImpl$getSubscriptionsScreen$1(z3)).f14945a;
                bjk bjkVar3 = cfx0.o;
                c8dVar3.f3908a = new v7d(true, bjkVar3, bjkVar3);
                return Unit.f46060a;
            case 18:
                ikv0 ikv0Var = (ikv0) obj2;
                pi9 pi9Var = (pi9) obj;
                pi9Var.getClass();
                zcl zclVar = qmk.f28987a;
                float density = pi9Var.getDensity() * 360.0f;
                w03 w03VarA = z03.a();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (pi9Var.f27033a.d() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (pi9Var.f27033a.d() & 4294967295L));
                if (z3 && pi9Var.f27033a.getLayoutDirection() == k6z.f17794a) {
                    j = 0;
                } else {
                    if (z3 && pi9Var.f27033a.getLayoutDirection() == k6z.b) {
                        jFloatToRawIntBits = Float.floatToRawIntBits(density);
                        iFloatToRawIntBits = Float.floatToRawIntBits(density);
                    } else if (z3 || pi9Var.f27033a.getLayoutDirection() != k6z.f17794a) {
                        if (!z3) {
                            pi9Var.f27033a.getLayoutDirection();
                            k6z k6zVar = k6z.b;
                        }
                        j = 0;
                    } else {
                        jFloatToRawIntBits = Float.floatToRawIntBits(density);
                        iFloatToRawIntBits = Float.floatToRawIntBits(density);
                    }
                    j = (jFloatToRawIntBits << 32) | (((long) iFloatToRawIntBits) & 4294967295L);
                }
                if (!z3 || pi9Var.f27033a.getLayoutDirection() != k6z.f17794a) {
                    if (!(z3 && pi9Var.f27033a.getLayoutDirection() == k6z.b) && ((z3 || pi9Var.f27033a.getLayoutDirection() != k6z.f17794a) && !z3 && pi9Var.f27033a.getLayoutDirection() == k6z.b)) {
                        jFloatToRawIntBits2 = Float.floatToRawIntBits(density);
                        iFloatToRawIntBits2 = Float.floatToRawIntBits(density);
                    } else {
                        j2 = 0;
                    }
                    if (z3 || pi9Var.f27033a.getLayoutDirection() != k6z.f17794a) {
                        if ((z3 || pi9Var.f27033a.getLayoutDirection() != k6z.b) && ((z3 || pi9Var.f27033a.getLayoutDirection() != k6z.f17794a) && !z3 && pi9Var.f27033a.getLayoutDirection() == k6z.b)) {
                            jFloatToRawIntBits3 = Float.floatToRawIntBits(density);
                            iFloatToRawIntBits3 = Float.floatToRawIntBits(density);
                        } else {
                            j3 = 0;
                        }
                        if (z3 || pi9Var.f27033a.getLayoutDirection() != k6z.f17794a) {
                            if (!z3 && pi9Var.f27033a.getLayoutDirection() == k6z.b) {
                                jFloatToRawIntBits4 = Float.floatToRawIntBits(density);
                                iFloatToRawIntBits4 = Float.floatToRawIntBits(density);
                            } else if (z3 && pi9Var.f27033a.getLayoutDirection() == k6z.f17794a) {
                                jFloatToRawIntBits4 = Float.floatToRawIntBits(density);
                                iFloatToRawIntBits4 = Float.floatToRawIntBits(density);
                            } else if (!z3) {
                                pi9Var.f27033a.getLayoutDirection();
                                k6z k6zVar2 = k6z.b;
                            }
                            j7 = (jFloatToRawIntBits4 << 32) | (((long) iFloatToRawIntBits4) & 4294967295L);
                        }
                        w03.b(w03VarA, new wfg0(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, j, j2, j3, j7));
                        return pi9Var.a(new zfv0(w03VarA, ikv0Var, (byte) 3));
                    }
                    jFloatToRawIntBits3 = Float.floatToRawIntBits(density);
                    iFloatToRawIntBits3 = Float.floatToRawIntBits(density);
                    j3 = (jFloatToRawIntBits3 << 32) | (((long) iFloatToRawIntBits3) & 4294967295L);
                    if (z3) {
                        if (!z3) {
                            if (z3) {
                            }
                            if (!z3) {
                                pi9Var.f27033a.getLayoutDirection();
                                k6z k6zVar3 = k6z.b;
                            }
                        } else {
                            if (z3) {
                            }
                            if (!z3) {
                                pi9Var.f27033a.getLayoutDirection();
                                k6z k6zVar4 = k6z.b;
                            }
                        }
                    } else if (!z3) {
                        if (z3) {
                        }
                        if (!z3) {
                            pi9Var.f27033a.getLayoutDirection();
                            k6z k6zVar5 = k6z.b;
                        }
                    } else {
                        if (z3) {
                        }
                        if (!z3) {
                            pi9Var.f27033a.getLayoutDirection();
                            k6z k6zVar6 = k6z.b;
                        }
                    }
                    w03.b(w03VarA, new wfg0(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, j, j2, j3, j7));
                    return pi9Var.a(new zfv0(w03VarA, ikv0Var, (byte) 3));
                }
                jFloatToRawIntBits2 = Float.floatToRawIntBits(density);
                iFloatToRawIntBits2 = Float.floatToRawIntBits(density);
                j2 = (jFloatToRawIntBits2 << 32) | (((long) iFloatToRawIntBits2) & 4294967295L);
                if (z3) {
                    if (z3) {
                        jFloatToRawIntBits3 = Float.floatToRawIntBits(density);
                        iFloatToRawIntBits3 = Float.floatToRawIntBits(density);
                        j3 = (jFloatToRawIntBits3 << 32) | (((long) iFloatToRawIntBits3) & 4294967295L);
                    } else {
                        jFloatToRawIntBits3 = Float.floatToRawIntBits(density);
                        iFloatToRawIntBits3 = Float.floatToRawIntBits(density);
                        j3 = (jFloatToRawIntBits3 << 32) | (((long) iFloatToRawIntBits3) & 4294967295L);
                    }
                    j3 = 0;
                } else {
                    if (z3) {
                        jFloatToRawIntBits3 = Float.floatToRawIntBits(density);
                        iFloatToRawIntBits3 = Float.floatToRawIntBits(density);
                        j3 = (jFloatToRawIntBits3 << 32) | (((long) iFloatToRawIntBits3) & 4294967295L);
                    } else {
                        jFloatToRawIntBits3 = Float.floatToRawIntBits(density);
                        iFloatToRawIntBits3 = Float.floatToRawIntBits(density);
                        j3 = (jFloatToRawIntBits3 << 32) | (((long) iFloatToRawIntBits3) & 4294967295L);
                    }
                    j3 = 0;
                }
                if (z3) {
                    if (!z3) {
                        if (z3) {
                        }
                        if (!z3) {
                            pi9Var.f27033a.getLayoutDirection();
                            k6z k6zVar7 = k6z.b;
                        }
                    } else {
                        if (z3) {
                        }
                        if (!z3) {
                            pi9Var.f27033a.getLayoutDirection();
                            k6z k6zVar8 = k6z.b;
                        }
                    }
                } else if (!z3) {
                    if (z3) {
                    }
                    if (!z3) {
                        pi9Var.f27033a.getLayoutDirection();
                        k6z k6zVar9 = k6z.b;
                    }
                } else {
                    if (z3) {
                    }
                    if (!z3) {
                        pi9Var.f27033a.getLayoutDirection();
                        k6z k6zVar10 = k6z.b;
                    }
                }
                w03.b(w03VarA, new wfg0(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, j, j2, j3, j7));
                return pi9Var.a(new zfv0(w03VarA, ikv0Var, (byte) 3));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                jkv0 jkv0Var = (jkv0) obj2;
                pi9 pi9Var2 = (pi9) obj;
                pi9Var2.getClass();
                zcl zclVar2 = qmk.f28987a;
                float density2 = pi9Var2.getDensity() * 360.0f;
                w03 w03VarA2 = z03.a();
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (pi9Var2.f27033a.d() >> 32));
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (pi9Var2.f27033a.d() & 4294967295L));
                if (z3 && pi9Var2.f27033a.getLayoutDirection() == k6z.f17794a) {
                    j4 = 0;
                } else {
                    if (z3 && pi9Var2.f27033a.getLayoutDirection() == k6z.b) {
                        jFloatToRawIntBits5 = Float.floatToRawIntBits(density2);
                        iFloatToRawIntBits5 = Float.floatToRawIntBits(density2);
                    } else if (z3 || pi9Var2.f27033a.getLayoutDirection() != k6z.f17794a) {
                        if (!z3) {
                            pi9Var2.f27033a.getLayoutDirection();
                            k6z k6zVar11 = k6z.b;
                        }
                        j4 = 0;
                    } else {
                        jFloatToRawIntBits5 = Float.floatToRawIntBits(density2);
                        iFloatToRawIntBits5 = Float.floatToRawIntBits(density2);
                    }
                    j4 = (jFloatToRawIntBits5 << 32) | (((long) iFloatToRawIntBits5) & 4294967295L);
                }
                if (!z3 || pi9Var2.f27033a.getLayoutDirection() != k6z.f17794a) {
                    if (!(z3 && pi9Var2.f27033a.getLayoutDirection() == k6z.b) && ((z3 || pi9Var2.f27033a.getLayoutDirection() != k6z.f17794a) && !z3 && pi9Var2.f27033a.getLayoutDirection() == k6z.b)) {
                        jFloatToRawIntBits6 = Float.floatToRawIntBits(density2);
                        iFloatToRawIntBits6 = Float.floatToRawIntBits(density2);
                    } else {
                        j5 = 0;
                    }
                    if (z3 || pi9Var2.f27033a.getLayoutDirection() != k6z.f17794a) {
                        if ((z3 || pi9Var2.f27033a.getLayoutDirection() != k6z.b) && ((z3 || pi9Var2.f27033a.getLayoutDirection() != k6z.f17794a) && !z3 && pi9Var2.f27033a.getLayoutDirection() == k6z.b)) {
                            jFloatToRawIntBits7 = Float.floatToRawIntBits(density2);
                            iFloatToRawIntBits7 = Float.floatToRawIntBits(density2);
                        } else {
                            j6 = 0;
                        }
                        if (z3 || pi9Var2.f27033a.getLayoutDirection() != k6z.f17794a) {
                            if (!z3 && pi9Var2.f27033a.getLayoutDirection() == k6z.b) {
                                jFloatToRawIntBits8 = Float.floatToRawIntBits(density2);
                                iFloatToRawIntBits8 = Float.floatToRawIntBits(density2);
                            } else if (z3 && pi9Var2.f27033a.getLayoutDirection() == k6z.f17794a) {
                                jFloatToRawIntBits8 = Float.floatToRawIntBits(density2);
                                iFloatToRawIntBits8 = Float.floatToRawIntBits(density2);
                            } else if (!z3) {
                                pi9Var2.f27033a.getLayoutDirection();
                                k6z k6zVar12 = k6z.b;
                            }
                            j7 = (jFloatToRawIntBits8 << 32) | (((long) iFloatToRawIntBits8) & 4294967295L);
                        }
                        w03.b(w03VarA2, new wfg0(0.0f, 0.0f, fIntBitsToFloat3, fIntBitsToFloat4, j4, j5, j6, j7));
                        return pi9Var2.a(new zfv0(w03VarA2, jkv0Var, (byte) 4));
                    }
                    jFloatToRawIntBits7 = Float.floatToRawIntBits(density2);
                    iFloatToRawIntBits7 = Float.floatToRawIntBits(density2);
                    j6 = (jFloatToRawIntBits7 << 32) | (((long) iFloatToRawIntBits7) & 4294967295L);
                    if (z3) {
                        if (!z3) {
                            if (z3) {
                            }
                            if (!z3) {
                                pi9Var2.f27033a.getLayoutDirection();
                                k6z k6zVar13 = k6z.b;
                            }
                        } else {
                            if (z3) {
                            }
                            if (!z3) {
                                pi9Var2.f27033a.getLayoutDirection();
                                k6z k6zVar14 = k6z.b;
                            }
                        }
                    } else if (!z3) {
                        if (z3) {
                        }
                        if (!z3) {
                            pi9Var2.f27033a.getLayoutDirection();
                            k6z k6zVar15 = k6z.b;
                        }
                    } else {
                        if (z3) {
                        }
                        if (!z3) {
                            pi9Var2.f27033a.getLayoutDirection();
                            k6z k6zVar16 = k6z.b;
                        }
                    }
                    w03.b(w03VarA2, new wfg0(0.0f, 0.0f, fIntBitsToFloat3, fIntBitsToFloat4, j4, j5, j6, j7));
                    return pi9Var2.a(new zfv0(w03VarA2, jkv0Var, (byte) 4));
                }
                jFloatToRawIntBits6 = Float.floatToRawIntBits(density2);
                iFloatToRawIntBits6 = Float.floatToRawIntBits(density2);
                j5 = (jFloatToRawIntBits6 << 32) | (((long) iFloatToRawIntBits6) & 4294967295L);
                if (z3) {
                    if (z3) {
                        jFloatToRawIntBits7 = Float.floatToRawIntBits(density2);
                        iFloatToRawIntBits7 = Float.floatToRawIntBits(density2);
                        j6 = (jFloatToRawIntBits7 << 32) | (((long) iFloatToRawIntBits7) & 4294967295L);
                    } else {
                        jFloatToRawIntBits7 = Float.floatToRawIntBits(density2);
                        iFloatToRawIntBits7 = Float.floatToRawIntBits(density2);
                        j6 = (jFloatToRawIntBits7 << 32) | (((long) iFloatToRawIntBits7) & 4294967295L);
                    }
                    j6 = 0;
                } else {
                    if (z3) {
                        jFloatToRawIntBits7 = Float.floatToRawIntBits(density2);
                        iFloatToRawIntBits7 = Float.floatToRawIntBits(density2);
                        j6 = (jFloatToRawIntBits7 << 32) | (((long) iFloatToRawIntBits7) & 4294967295L);
                    } else {
                        jFloatToRawIntBits7 = Float.floatToRawIntBits(density2);
                        iFloatToRawIntBits7 = Float.floatToRawIntBits(density2);
                        j6 = (jFloatToRawIntBits7 << 32) | (((long) iFloatToRawIntBits7) & 4294967295L);
                    }
                    j6 = 0;
                }
                if (z3) {
                    if (!z3) {
                        if (z3) {
                        }
                        if (!z3) {
                            pi9Var2.f27033a.getLayoutDirection();
                            k6z k6zVar17 = k6z.b;
                        }
                    } else {
                        if (z3) {
                        }
                        if (!z3) {
                            pi9Var2.f27033a.getLayoutDirection();
                            k6z k6zVar18 = k6z.b;
                        }
                    }
                } else if (!z3) {
                    if (z3) {
                    }
                    if (!z3) {
                        pi9Var2.f27033a.getLayoutDirection();
                        k6z k6zVar19 = k6z.b;
                    }
                } else {
                    if (z3) {
                    }
                    if (!z3) {
                        pi9Var2.f27033a.getLayoutDirection();
                        k6z k6zVar110 = k6z.b;
                    }
                }
                w03.b(w03VarA2, new wfg0(0.0f, 0.0f, fIntBitsToFloat3, fIntBitsToFloat4, j4, j5, j6, j7));
                return pi9Var2.a(new zfv0(w03VarA2, jkv0Var, (byte) 4));
            case 20:
                View view = (View) obj2;
                ((lwk) obj).getClass();
                ViewParent parent = view.getParent();
                vjk vjkVar = parent instanceof vjk ? (vjk) parent : null;
                Window window = vjkVar != null ? vjkVar.getWindow() : null;
                Window windowL = etm0.l(view);
                if (z3) {
                    if (window != null) {
                        hxv0.a(window);
                    }
                    if (windowL != null) {
                        hxv0.a(windowL);
                    }
                }
                return new fxv0(z3, window, windowL);
            default:
                List list2 = (List) obj2;
                iz30 iz30Var = (iz30) obj;
                iz30Var.getClass();
                int iOrdinal = iz30Var.ordinal();
                if (iOrdinal == 9) {
                    return (list2.isEmpty() || z3) ? new sx10(iz30Var, false) : new nx10(iz30Var, list2);
                }
                if (iOrdinal != 13) {
                    return iOrdinal != 14 ? new sx10(iz30Var, false) : new qx10(iz30Var);
                }
                return new rx10(iz30Var);
        }
    }

    public /* synthetic */ ij90(boolean z, Object obj, byte b) {
        this.f14863a = b;
        this.b = z;
        this.c = obj;
    }
}
