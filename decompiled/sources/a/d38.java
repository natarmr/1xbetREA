package a;

import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.media3.exoplayer.ExoPlayer;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Request;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.wallet.impl.presentation.dialogs.bonusaccountaction.models.BonusAccountUiModel;
import org.xplatform.wallet.impl.presentation.dialogs.bonusaccountaction.params.BonusAccountScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d38 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5390a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d38(Object obj, byte b) {
        this.f5390a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:190:0x0544  */
    /* JADX WARN: Code duplicated, block: B:200:0x057f  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        iun iunVar;
        Object value2;
        float fCeil;
        int i;
        m78 m78Var;
        boolean z;
        vz2 vz2VarC;
        uw2 uw2VarA;
        Object value3;
        Object value4;
        Object value5;
        wxa wxaVar;
        byte b = this.f5390a;
        int i2 = R.color.static_white;
        byte b2 = 9;
        byte b3 = 2;
        yje yjeVar = null;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                iqt0 iqt0Var = (iqt0) obj;
                yk5 yk5Var = h38.V1;
                iqt0Var.getClass();
                ((h38) obj2).H0().v.a(iqt0Var);
                return Unit.f46060a;
            case 1:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((d48) obj2).r.a(th);
                return Unit.f46060a;
            case 2:
                c58 c58Var = (c58) obj2;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                a4x a4xVar = ((y48) c58Var).d;
                hczVar.f(a4xVar.size(), null, new wl0(a4xVar, (byte) 9), new ugd(2039820996, true, new xe4(a4xVar, c58Var, b3)));
                return Unit.f46060a;
            case 3:
                wb8 wb8Var = (wb8) obj2;
                bc8 bc8Var = (bc8) obj;
                kj5 kj5Var = wb8.n2;
                bc8Var.getClass();
                BonusAccountUiModel bonusAccountUiModel = bc8Var.f2342a;
                String str = ((BonusAccountScreenParams) wb8Var.m2.n(wb8Var, wb8.o2[0])).f47317a;
                vcc.f0(i120.V(new Pair(str, bonusAccountUiModel)), wb8Var, str);
                wb8Var.y0();
                ((k3t0) wb8Var.l2.getValue()).x(sb8.f31919a);
                return Unit.f46060a;
            case 4:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((ld8) obj2).O(th2, false);
                return Unit.f46060a;
            case 5:
                bh8 bh8Var = (bh8) obj2;
                pi9 pi9Var = (pi9) obj;
                pi9Var.getClass();
                zcl zclVar = qmk.f28987a;
                float density = pi9Var.getDensity() * 1.0f;
                float density2 = pi9Var.getDensity() * 16.0f;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(density2)) & 4294967295L) | (((long) Float.floatToRawIntBits(density2)) << 32);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (pi9Var.f27033a.d() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (pi9Var.f27033a.d() & 4294967295L));
                w03 w03VarA = z03.a();
                int i3 = (int) (jFloatToRawIntBits >> 32);
                int i4 = (int) (jFloatToRawIntBits & 4294967295L);
                w03.b(w03VarA, r8x.t(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)));
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (pi9Var.f27033a.d() >> 32)) - density;
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (pi9Var.f27033a.d() & 4294967295L)) - density;
                w03 w03VarA2 = z03.a();
                w03.b(w03VarA2, r8x.t(density, density, fIntBitsToFloat3, fIntBitsToFloat4, Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)));
                return pi9Var.b(new dc0((Object) w03VarA, (Object) bh8Var, (Object) w03VarA2, (Object) maz.b(new vb8(pi9Var, b3)), (byte) 15));
            case 6:
                lf8 lf8Var = (lf8) obj2;
                a4x a4xVarO0 = dyb.o0((List) obj);
                int i5 = lf8.J;
                sac.V(jiu0.a(lf8Var), new ye7(1, lf8Var, lf8.class, "onError", "onError(Ljava/lang/Throwable;)V", 0, (byte) 27), null, lf8Var.v.b, new kf8(lf8Var, a4xVarO0, null, (byte) 1), 10);
                return Unit.f46060a;
            case 7:
                gj8 gj8Var = (gj8) obj2;
                ((Throwable) obj).getClass();
                p7m0 p7m0Var = gj8Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    gj8Var.f.getClass();
                    iunVar = iun.f15405a;
                    iunVar.getClass();
                } while (!p7m0Var.m(value, new zi8(iunVar, false)));
                return Unit.f46060a;
            case 8:
                tj8 tj8Var = (tj8) obj2;
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                tj8Var.r.b(th3, new yr0(th3, (byte) 8));
                p7m0 p7m0Var2 = tj8Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    tj8Var.f.getClass();
                } while (!p7m0Var2.m(value2, pj8.a((pj8) value2, null, true, false, null, 29)));
                return Unit.f46060a;
            case 9:
                yj8 yj8Var = (yj8) obj2;
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                yj8Var.e.b(th4, new m87(yj8Var, (byte) 16));
                return Unit.f46060a;
            case 10:
                jm8 jm8Var = (jm8) obj2;
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.c(oct.f(jm8Var.E, 0L, null, 0, null, null, 31));
                c8d c8dVar = (c8d) k0w0Var.h(jm8Var.E.e()).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                return Unit.f46060a;
            case 11:
                bn8 bn8Var = (bn8) obj2;
                pi9 pi9Var2 = (pi9) obj;
                if (pi9Var2.getDensity() * bn8Var.r < 0.0f || h7k0.d(pi9Var2.f27033a.d()) <= 0.0f) {
                    return pi9Var2.b(new nk7((byte) 21));
                }
                if (ycl.b(bn8Var.r, 0.0f)) {
                    fCeil = 1.0f;
                } else {
                    fCeil = (float) Math.ceil(pi9Var2.getDensity() * bn8Var.r);
                }
                final float fMin = Math.min(fCeil, (float) Math.ceil(h7k0.d(pi9Var2.f27033a.d()) / 2.0f));
                final float f = fMin / 2.0f;
                final long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
                final long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (pi9Var2.f27033a.d() >> 32)) - fMin)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (pi9Var2.f27033a.d() & 4294967295L)) - fMin)) & 4294967295L);
                float f2 = fMin * 2.0f;
                boolean z2 = f2 > h7k0.d(pi9Var2.f27033a.d());
                x1x x1xVarA = bn8Var.t.a(pi9Var2.f27033a.d(), pi9Var2.f27033a.getLayoutDirection(), pi9Var2);
                if (!(x1xVarA instanceof ne80)) {
                    if (!(x1xVarA instanceof pe80)) {
                        boolean z3 = z2;
                        if (!(x1xVarA instanceof oe80)) {
                            t9f.b();
                            return null;
                        }
                        skk0 skk0Var = bn8Var.s;
                        if (z3) {
                            jFloatToRawIntBits2 = 0;
                        }
                        long j = jFloatToRawIntBits2;
                        if (z3) {
                            jFloatToRawIntBits3 = pi9Var2.f27033a.d();
                        }
                        return pi9Var2.b(new zm8((Object) skk0Var, j, jFloatToRawIntBits3, z3 ? l0q.f19214a : new vtm0(fMin, 0.0f, 0, 0, null, 30), (byte) 0));
                    }
                    final skk0 skk0Var2 = bn8Var.s;
                    wfg0 wfg0Var = ((pe80) x1xVarA).f26840a;
                    if (r8x.S(wfg0Var)) {
                        final long j2 = wfg0Var.e;
                        final vtm0 vtm0Var = new vtm0(fMin, 0.0f, 0, 0, null, 30);
                        final boolean z4 = z2;
                        return pi9Var2.b(new Function1() { // from class: a.an8
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) throws Throwable {
                                long j3;
                                g7z g7zVar = (g7z) obj3;
                                g7zVar.a();
                                a6a a6aVar = g7zVar.f10839a;
                                boolean z5 = z4;
                                t89 t89Var = skk0Var2;
                                long j4 = j2;
                                if (z5) {
                                    fhl.f(g7zVar, t89Var, 0L, 0L, j4, null, 246);
                                } else {
                                    float fIntBitsToFloat5 = Float.intBitsToFloat((int) (j4 >> 32));
                                    float f3 = f;
                                    if (fIntBitsToFloat5 < f3) {
                                        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (a6aVar.d() >> 32));
                                        float f4 = fMin;
                                        float f5 = fIntBitsToFloat6 - f4;
                                        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (a6aVar.d() & 4294967295L)) - f4;
                                        nr nrVar = a6aVar.b;
                                        long jP = nrVar.p();
                                        nrVar.i().l();
                                        try {
                                            ((fvt0) nrVar.b).k(f4, f4, f5, fIntBitsToFloat7, 0);
                                            j3 = jP;
                                            try {
                                                fhl.f(g7zVar, t89Var, 0L, 0L, j4, null, 246);
                                                defpackage.c.g(nrVar, j3);
                                            } catch (Throwable th5) {
                                                th = th5;
                                                defpackage.c.g(nrVar, j3);
                                                throw th;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            j3 = jP;
                                        }
                                    } else {
                                        fhl.f(g7zVar, t89Var, jFloatToRawIntBits2, jFloatToRawIntBits3, i120.d0(f3, j4), vtm0Var, 208);
                                    }
                                }
                                return Unit.f46060a;
                            }
                        });
                    }
                    boolean z5 = z2;
                    xm8 xm8Var = bn8Var.q;
                    if (xm8Var == null) {
                        xm8Var = new xm8();
                        bn8Var.q = xm8Var;
                    }
                    w03 w03VarA3 = xm8Var.d;
                    if (w03VarA3 == null) {
                        w03VarA3 = z03.a();
                        xm8Var.d = w03VarA3;
                    }
                    w03VarA3.h();
                    w03.b(w03VarA3, wfg0Var);
                    if (!z5) {
                        w03 w03VarA4 = z03.a();
                        w03.b(w03VarA4, new wfg0(fMin, fMin, wfg0Var.b() - fMin, wfg0Var.a() - fMin, i120.d0(fMin, wfg0Var.e), i120.d0(fMin, wfg0Var.f), i120.d0(fMin, wfg0Var.g), i120.d0(fMin, wfg0Var.h)));
                        w03VarA3.g(w03VarA3, w03VarA4, 0);
                    }
                    return pi9Var2.b(new op7(w03VarA3, skk0Var2, b2));
                }
                skk0 skk0Var3 = bn8Var.s;
                ne80 ne80Var = (ne80) x1xVarA;
                w03 w03Var = ne80Var.f23373a;
                if (z2) {
                    return pi9Var2.b(new op7(ne80Var, skk0Var3, (byte) 10));
                }
                if (skk0Var3 != null) {
                    m78Var = new m78(y3d.c(1.0f, skk0Var3.f32354a), 5);
                    i = 1;
                } else {
                    i = 0;
                    m78Var = null;
                }
                jge0 jge0VarD = w03Var.d();
                float f3 = jge0VarD.b;
                float f4 = jge0VarD.f16474a;
                xm8 xm8Var2 = bn8Var.q;
                if (xm8Var2 == null) {
                    xm8Var2 = new xm8();
                    bn8Var.q = xm8Var2;
                }
                w03 w03VarA5 = xm8Var2.d;
                if (w03VarA5 == null) {
                    w03VarA5 = z03.a();
                    xm8Var2.d = w03VarA5;
                }
                w03VarA5.h();
                x190 x190Var = x190.f40111a;
                float f5 = jge0VarD.f16474a;
                float f6 = jge0VarD.d;
                float f7 = jge0VarD.c;
                float f8 = jge0VarD.b;
                if (Float.isNaN(f5) || Float.isNaN(f8) || Float.isNaN(f7) || Float.isNaN(f6)) {
                    z03.b("Invalid rectangle, make sure no value is NaN");
                }
                RectF rectF = w03VarA5.b;
                if (rectF == null) {
                    rectF = new RectF();
                    w03VarA5.b = rectF;
                }
                rectF.set(f5, f8, f7, f6);
                Path path = w03VarA5.f38329a;
                RectF rectF2 = w03VarA5.b;
                rectF2.getClass();
                path.addRect(rectF2, z03.c(x190Var));
                w03VarA5.g(w03VarA5, w03Var, 0);
                mie0 mie0Var = new mie0();
                long jCeil = (((long) ((int) Math.ceil(jge0VarD.c - f4))) << 32) | (((long) ((int) Math.ceil(jge0VarD.d - f3))) & 4294967295L);
                xm8 xm8Var3 = bn8Var.q;
                xm8Var3.getClass();
                vz2 vz2Var = xm8Var3.f41111a;
                uw2 uw2Var = xm8Var3.b;
                zyw zywVar = vz2Var != null ? new zyw(vz2Var.a()) : null;
                if (zywVar != null && zywVar.f45225a == 0) {
                    z = true;
                } else {
                    zyw zywVar2 = vz2Var != null ? new zyw(vz2Var.a()) : null;
                    if (zywVar2 != null && i == zywVar2.f45225a) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (vz2Var == null || uw2Var == null) {
                    vz2VarC = azw.c((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i);
                    xm8Var3.f41111a = vz2VarC;
                    uw2VarA = vw2.a(vz2VarC);
                    xm8Var3.b = uw2VarA;
                } else {
                    float fIntBitsToFloat5 = Float.intBitsToFloat((int) (pi9Var2.f27033a.d() >> 32));
                    Bitmap bitmap = vz2Var.f38278a;
                    if (fIntBitsToFloat5 > bitmap.getWidth() || Float.intBitsToFloat((int) (pi9Var2.f27033a.d() & 4294967295L)) > bitmap.getHeight() || !z) {
                        vz2VarC = azw.c((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i);
                        xm8Var3.f41111a = vz2VarC;
                        uw2VarA = vw2.a(vz2VarC);
                        xm8Var3.b = uw2VarA;
                    } else {
                        vz2VarC = vz2Var;
                        uw2VarA = uw2Var;
                    }
                }
                a6a a6aVar = xm8Var3.c;
                if (a6aVar == null) {
                    a6aVar = new a6a();
                    xm8Var3.c = a6aVar;
                }
                nr nrVar = a6aVar.b;
                z5a z5aVar = a6aVar.f308a;
                long jQ = n2x.Q(jCeil);
                k6z layoutDirection = pi9Var2.f27033a.getLayoutDirection();
                w6k w6kVar = z5aVar.f43806a;
                a6a a6aVar2 = a6aVar;
                k6z k6zVar = z5aVar.b;
                x5a x5aVar = z5aVar.c;
                vz2 vz2Var2 = vz2VarC;
                long j3 = z5aVar.d;
                z5aVar.f43806a = pi9Var2;
                z5aVar.b = layoutDirection;
                z5aVar.c = uw2VarA;
                z5aVar.d = jQ;
                uw2VarA.l();
                fhl.u(a6aVar2, y3d.b, 0L, jQ, 0.0f, null, null, 0, 58);
                float f9 = -f4;
                float f10 = -f3;
                ((fvt0) nrVar.b).A(f9, f10);
                try {
                    fhl.K0(a6aVar2, ne80Var.f23373a, skk0Var3, 0.0f, new vtm0(f2, 0.0f, 0, 0, null, 30), 52);
                    float fIntBitsToFloat6 = (Float.intBitsToFloat((int) (a6aVar2.d() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (a6aVar2.d() >> 32));
                    float fIntBitsToFloat7 = (Float.intBitsToFloat((int) (a6aVar2.d() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (a6aVar2.d() & 4294967295L));
                    long jE0 = a6aVar2.E0();
                    long jP = nrVar.p();
                    nrVar.i().l();
                    uw2 uw2Var2 = uw2VarA;
                    try {
                        ((fvt0) nrVar.b).z(fIntBitsToFloat6, fIntBitsToFloat7, jE0);
                        fhl.K0(a6aVar2, w03VarA5, skk0Var3, 0.0f, null, 28);
                        nrVar.i().i();
                        nrVar.H(jP);
                        ((fvt0) nrVar.b).A(-f9, -f10);
                        uw2Var2.i();
                        z5aVar.f43806a = w6kVar;
                        z5aVar.b = k6zVar;
                        z5aVar.c = x5aVar;
                        z5aVar.d = j3;
                        vz2Var2.f38278a.prepareToDraw();
                        mie0Var.f21842a = vz2Var2;
                        return pi9Var2.b(new as0((Object) jge0VarD, (Object) mie0Var, jCeil, (Object) m78Var, (byte) 1));
                    } catch (Throwable th5) {
                        nrVar.i().i();
                        nrVar.H(jP);
                        throw th5;
                    }
                } catch (Throwable th6) {
                    ((fvt0) nrVar.b).A(-f9, -f10);
                    throw th6;
                }
            case 12:
                zr8 zr8Var = ((et8) obj2).b;
                if (zr8Var != null) {
                    zr8Var.m();
                    zr8Var.x = zr8Var.L;
                    zr8Var.J = true;
                }
                return Unit.f46060a;
            case 13:
                pw8 pw8Var = (pw8) obj2;
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                pw8Var.o.b(th7, new yr0(th7, (byte) 9));
                p7m0 p7m0Var3 = pw8Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    pw8Var.f.getClass();
                } while (!p7m0Var3.m(value3, jw8.a((jw8) value3, sx8.f32963a, null, 27)));
                return Unit.f46060a;
            case 14:
                Set set = (Set) obj;
                set.getClass();
                String strA = ((b09) obj2).b.b.a(R.string.all_languages, Arrays.copyOf(new Object[0], 0));
                pz40 pz40Var = s6t0.f31722a;
                return new rqm((vui0) new tui0(strA, new y3d(s6t0.b().f33626a.getTextPrimary())), (pui0) null, (pvi0) new lvi0(tc00.f33696a, set.isEmpty()), d4d.BACKGROUND_CONTENT, (tvi0) null, wui0.f39793a, false, (e900) null, 426);
            case 15:
                a39 a39Var = (a39) obj2;
                jge0 jge0Var = (jge0) obj;
                if (a39Var.n) {
                    qjj.W(a39Var.N0(), null, null, new d09((Object) a39Var, (Object) jge0Var, yjeVar, (byte) 4), 3);
                }
                return Unit.f46060a;
            case 16:
                j49 j49Var = (j49) ((l49) obj2);
                i49 i49Var = (i49) CollectionsKt.W(((Integer) obj).intValue(), j49Var.d);
                if (i49Var == null) {
                    i49Var = (i49) CollectionsKt.U(j49Var.d);
                }
                if (i49Var != null) {
                    if (i49Var instanceof g49) {
                        return ((g49) i49Var).f10653a;
                    }
                    if (i49Var instanceof h49) {
                        return ((h49) i49Var).f12423a;
                    }
                }
                t9f.b();
                return null;
            case 17:
                k69 k69Var = (k69) obj2;
                ((Throwable) obj).getClass();
                p7m0 p7m0Var4 = k69Var.i.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                    k69Var.f.getClass();
                } while (!p7m0Var4.m(value4, z59.a((z59) value4, null, false, false, false, false, null, true, false, null, null, 522207)));
                return Unit.f46060a;
            case 18:
                ((lwk) obj).getClass();
                return new ty2((ExoPlayer) obj2, (byte) 5);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ab9 ab9Var = (ab9) obj2;
                ((Throwable) obj).getClass();
                p7m0 p7m0Var5 = ab9Var.i.f25029a;
                do {
                    value5 = p7m0Var5.getValue();
                    value5.getClass();
                    ab9Var.f.getClass();
                } while (!p7m0Var5.m(value5, pa9.a((pa9) value5, null, null, null, true, null, null, null, null, false, 247)));
                return Unit.f46060a;
            case 20:
                ((qoj0) ((gr00) obj2).b).g(null);
                return Unit.f46060a;
            case 21:
                String str2 = (String) obj;
                str2.getClass();
                String strB = ((Request) obj2).c.b(str2);
                return strB == null ? "" : strB;
            case 22:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                ((ksx) cpVar.u).f18836a.setOnClickListener(new wg(obj2, (Object) cpVar, (byte) 6));
                cpVar.t(new rn5(cpVar, b3));
                return Unit.f46060a;
            case 23:
                gu9 gu9Var = (gu9) obj2;
                ((Throwable) obj).getClass();
                gu9Var.G(new au9(gu9Var.o.b.a(R.string.error_send_operator_rating_try_later, Arrays.copyOf(new Object[0], 0))));
                return Unit.f46060a;
            case 24:
                return Boolean.valueOf(((x1a) obj).f40112a == ((rrd) obj2));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((yyj0) obj2).b.e(null, false);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((fhl) obj).getClass();
                ((g7z) obj2).a();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                tca tcaVar = (tca) obj2;
                bnk0 bnk0Var = (bnk0) obj;
                bnk0Var.getClass();
                String str3 = tcaVar.g;
                String str4 = tcaVar.j;
                String str5 = tcaVar.e;
                String str6 = tcaVar.d;
                String str7 = tcaVar.h;
                String str8 = tcaVar.f;
                if (str3.length() == 0) {
                    i2 = R.color.static_white_60;
                }
                if (str8.length() > 0) {
                    ju70.L(bnk0Var, str8, i2);
                }
                if (!StringsKt.W(str7)) {
                    ju70.L(bnk0Var, str7, i2);
                }
                if (str6.length() > 0) {
                    ju70.L(bnk0Var, str6, i2);
                }
                if (str5.length() > 0) {
                    ju70.L(bnk0Var, str5, i2);
                }
                if (str4.length() > 0) {
                    ju70.L(bnk0Var, str4, i2);
                }
                if (str3.length() > 0) {
                    ju70.L(bnk0Var, str3, R.color.static_white_60);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                xca xcaVar = (xca) obj2;
                bnk0 bnk0Var2 = (bnk0) obj;
                bnk0Var2.getClass();
                String str9 = xcaVar.m;
                String str10 = xcaVar.r;
                String str11 = xcaVar.k;
                String str12 = xcaVar.j;
                String str13 = xcaVar.o;
                String str14 = xcaVar.n;
                if (str9.length() == 0) {
                    i2 = R.color.static_white_60;
                }
                if (str14.length() > 0) {
                    wha0.K(bnk0Var2, str14, i2);
                }
                if (!StringsKt.W(str13)) {
                    wha0.K(bnk0Var2, str13, i2);
                }
                if (str12.length() > 0) {
                    wha0.K(bnk0Var2, str12, i2);
                }
                if (str11.length() > 0) {
                    wha0.K(bnk0Var2, str11, i2);
                }
                if (str10.length() > 0) {
                    wha0.K(bnk0Var2, str10, i2);
                }
                if (str9.length() > 0) {
                    wha0.K(bnk0Var2, str9, R.color.static_white_60);
                }
                return Unit.f46060a;
            default:
                wxa wxaVar2 = (wxa) obj2;
                jya jyaVar = (jya) obj;
                kl5 kl5Var = wxa.U1;
                jyaVar.getClass();
                if (!(jyaVar instanceof gya)) {
                    if (jyaVar instanceof hya) {
                        ii iiVar = wxaVar2.N1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH = wxaVar2.H(R.string.cashback);
                        String strH2 = wxaVar2.H(R.string.games_cashback_saved_successfully);
                        String strH3 = wxaVar2.H(R.string.ok);
                        strH3.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, "SAVE_SUCCESS_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.c, false, 1496);
                        androidx.fragment.app.e eVarC = wxaVar2.C();
                        eVarC.getClass();
                        iiVar.d(dialogFields, eVarC);
                    } else {
                        if (!(jyaVar instanceof iya)) {
                            t9f.b();
                            return null;
                        }
                        String str15 = ((iya) jyaVar).f15579a;
                        wdk0 wdk0Var = wxaVar2.O1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        wxaVar = wxaVar2;
                        wdk0.k(wdk0Var, new xdk0(rek0.b, str15, null, null, null, null, 124), wxaVar, null, null, false, null, 1020);
                    }
                    wxaVar.G0().x(fxa.f10301a);
                    return Unit.f46060a;
                }
                ii iiVar2 = wxaVar2.N1;
                if (iiVar2 == null) {
                    Intrinsics.h("actionDialogManager");
                    throw null;
                }
                String strH4 = wxaVar2.H(R.string.attention);
                String strH5 = wxaVar2.H(R.string.games_cashback_save_selected_games);
                String strH6 = wxaVar2.H(R.string.ok);
                strH6.getClass();
                DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, wxaVar2.H(R.string.no), (String) null, "SAVE_CONFIRMATION_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                androidx.fragment.app.e eVarC2 = wxaVar2.C();
                eVarC2.getClass();
                iiVar2.d(dialogFields2, eVarC2);
                wxaVar = wxaVar2;
                wxaVar.G0().x(fxa.f10301a);
                return Unit.f46060a;
        }
    }
}
