package a;

import android.graphics.Path;
import android.graphics.RectF;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.game.core.game_background.presentation.view.TopCropFillImageView;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesParentSectionModel;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ufp implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35585a;
    public final /* synthetic */ l7m0 b;

    public /* synthetic */ ufp(l7m0 l7m0Var, byte b) {
        this.f35585a = b;
        this.b = l7m0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f35585a;
        byte b2 = 18;
        byte b3 = 3;
        byte b4 = 1;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                fhl.E(fhlVar, ((y3d) l7m0Var.getValue()).f41946a, 0.0f, 0L, 0.0f, null, 126);
                return Unit.f46060a;
            case 1:
                fhl fhlVar2 = (fhl) obj;
                fhlVar2.getClass();
                fhl.E(fhlVar2, ((y3d) l7m0Var.getValue()).f41946a, 0.0f, 0L, 0.0f, null, 126);
                return Unit.f46060a;
            case 2:
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                uag0Var.b(((Number) l7m0Var.getValue()).floatValue());
                return Unit.f46060a;
            case 3:
                uag0 uag0Var2 = (uag0) obj;
                uag0Var2.getClass();
                uag0Var2.I(((Number) l7m0Var.getValue()).floatValue());
                return Unit.f46060a;
            case 4:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                cbi0.g(abi0Var, ((a4x) l7m0Var.getValue()).size());
                return Unit.f46060a;
            case 5:
                uag0 uag0Var3 = (uag0) obj;
                uag0Var3.getClass();
                uag0Var3.I(((Number) l7m0Var.getValue()).floatValue());
                return Unit.f46060a;
            case 6:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                i4 i4Var = ((uls) l7m0Var.getValue()).d;
                hczVar.f(i4Var.size(), null, new pn7(i4Var, (byte) 2), new ugd(802480018, true, new qn7(i4Var, b4)));
                return Unit.f46060a;
            case 7:
                uag0 uag0Var4 = (uag0) obj;
                uag0Var4.getClass();
                uag0Var4.b(1.0f - ((Number) l7m0Var.getValue()).floatValue());
                return Unit.f46060a;
            case 8:
                uag0 uag0Var5 = (uag0) obj;
                uag0Var5.getClass();
                uag0Var5.v(((Number) l7m0Var.getValue()).floatValue());
                return Unit.f46060a;
            case 9:
                fhl fhlVar3 = (fhl) obj;
                fhlVar3.getClass();
                fhl.E(fhlVar3, ((y3d) l7m0Var.getValue()).f41946a, Float.intBitsToFloat((int) (fhlVar3.d() >> 32)) / 4.0f, 0L, 0.0f, null, 124);
                return Unit.f46060a;
            case 10:
                fhl fhlVar4 = (fhl) obj;
                fhlVar4.getClass();
                fhl.E(fhlVar4, ((y3d) l7m0Var.getValue()).f41946a, Float.intBitsToFloat((int) (fhlVar4.d() >> 32)) / 4.0f, 0L, 0.0f, null, 124);
                return Unit.f46060a;
            case 11:
                fhl fhlVar5 = (fhl) obj;
                fhlVar5.getClass();
                fhl.E(fhlVar5, ((y3d) l7m0Var.getValue()).f41946a, Float.intBitsToFloat((int) (fhlVar5.d() >> 32)) / 3.0f, 0L, 0.0f, null, 124);
                return Unit.f46060a;
            case 12:
                fhl fhlVar6 = (fhl) obj;
                fhlVar6.getClass();
                fhl.E(fhlVar6, ((y3d) l7m0Var.getValue()).f41946a, Float.intBitsToFloat((int) (fhlVar6.d() >> 32)) / 3.0f, 0L, 0.0f, null, 124);
                return Unit.f46060a;
            case 13:
                uag0 uag0Var6 = (uag0) obj;
                uag0Var6.getClass();
                uag0Var6.v(((Number) l7m0Var.getValue()).floatValue());
                return Unit.f46060a;
            case 14:
                fhl fhlVar7 = (fhl) obj;
                fhlVar7.getClass();
                long j = ((y3d) l7m0Var.getValue()).f41946a;
                zcl zclVar = qmk.f28987a;
                float fW0 = fhlVar7.w0(16.0f);
                fhl.o0(fhlVar7, j, 0L, 0L, (((long) Float.floatToRawIntBits(fW0)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fW0))), null, 246);
                return Unit.f46060a;
            case 15:
                pi9 pi9Var = (pi9) obj;
                pi9Var.getClass();
                return pi9Var.a(new ufp(l7m0Var, (byte) 16));
            case 16:
                fhl fhlVar8 = (fhl) obj;
                fhlVar8.getClass();
                pz40 pz40Var = s6t0.f31722a;
                fhl.u(fhlVar8, s6t0.b().f33626a.getBackgroundContent(), 0L, 0L, 1.0f - ((Number) l7m0Var.getValue()).floatValue(), null, null, 0, 118);
                return Unit.f46060a;
            case 17:
                g7z g7zVar = (g7z) obj;
                g7zVar.getClass();
                nr nrVar = g7zVar.f10839a.b;
                long jP = nrVar.p();
                nrVar.i().l();
                try {
                    fvt0 fvt0Var = (fvt0) nrVar.b;
                    fvt0Var.y(((Number) l7m0Var.getValue()).floatValue(), p7x.u(((nr) fvt0Var.f10231a).p()));
                    g7zVar.a();
                    return Unit.f46060a;
                } finally {
                    defpackage.c.g(nrVar, jP);
                }
            case 18:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                a4x a4xVar = ((jn40) l7m0Var.getValue()).b;
                hczVar2.f(a4xVar.size(), new ygy(new o240((byte) 13), a4xVar, (byte) 22), new ubn(a4xVar, (byte) 13), new ugd(2039820996, true, new zd1(a4xVar, (byte) 6)));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                fhl fhlVar9 = (fhl) obj;
                fhlVar9.getClass();
                zcl zclVar2 = qmk.f28987a;
                float fT = fhlVar9.T(18.0f);
                w03 w03VarA = z03.a();
                jge0 jge0VarQ = k9x.q(fT, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar9.d() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(fT)) & 4294967295L));
                x190 x190Var = x190.f40111a;
                RectF rectF = w03VarA.b;
                if (rectF == null) {
                    rectF = new RectF();
                    w03VarA.b = rectF;
                }
                rectF.set(jge0VarQ.f16474a, jge0VarQ.b, jge0VarQ.c, jge0VarQ.d);
                Path path = w03VarA.f38329a;
                RectF rectF2 = w03VarA.b;
                rectF2.getClass();
                path.addOval(rectF2, z03.c(x190Var));
                float fT2 = (fT * 2.0f) - fhlVar9.T(4.0f);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar9.d() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fhlVar9.d() & 4294967295L));
                float fT3 = fhlVar9.T(8.0f);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fT3)) << 32) | (((long) Float.floatToRawIntBits(fT3)) & 4294967295L);
                w03.b(w03VarA, r8x.t(0.0f, fT2, fIntBitsToFloat, fIntBitsToFloat2, Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits))));
                fhl.C0(fhlVar9, w03VarA, ((y3d) l7m0Var.getValue()).f41946a, 0.0f, null, 60);
                return Unit.f46060a;
            case 20:
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                a4x a4xVar2 = ((twa0) l7m0Var.getValue()).b;
                hczVar3.f(a4xVar2.size(), null, new ubn(a4xVar2, (byte) 20), new ugd(802480018, true, new xe4(a4xVar2, l7m0Var, (byte) 12)));
                hcz.e(hczVar3, null, null, unh0.d, 3);
                return Unit.f46060a;
            case 21:
                ov40 ov40Var = (ov40) obj;
                mi70 mi70Var = ccb0.X1;
                ov40Var.getClass();
                ov40Var.b = ((emb0) l7m0Var.getValue()).c;
                ov40Var.a(xlb0.f41064a, afo0.INSTANCE);
                ov40Var.a(wlb0.f39346a, vdo0.INSTANCE);
                ov40Var.a(ulb0.f35864a, new hbo0(CyberGamesPage.Real.INSTANCE, CyberGamesParentSectionModel.FromNewPopular.INSTANCE));
                ov40Var.a(vlb0.f37614a, cco0.INSTANCE);
                ov40Var.a(tlb0.f34134a, iao0.INSTANCE);
                return Unit.f46060a;
            case 22:
                uag0 uag0Var7 = (uag0) obj;
                uag0Var7.getClass();
                uag0Var7.H(((Number) l7m0Var.getValue()).floatValue());
                return Unit.f46060a;
            case 23:
                hcz hczVar4 = (hcz) obj;
                hczVar4.getClass();
                hcz.e(hczVar4, null, null, kc5.i, 3);
                hcz.e(hczVar4, null, null, new ugd(-363784451, true, new tft(l7m0Var, (byte) 17)), 3);
                hcz.e(hczVar4, null, null, new ugd(-1428751682, true, new tft(l7m0Var, b2)), 3);
                hcz.e(hczVar4, null, null, new ugd(1801248383, true, new tft(l7m0Var, (byte) 19)), 3);
                i4 i4Var2 = ((c8i0) l7m0Var.getValue()).f;
                hczVar4.f(i4Var2.size(), null, new pn7(i4Var2, (byte) 5), new ugd(802480018, true, new qn7(i4Var2, b3)));
                return Unit.f46060a;
            case 24:
                return ((ewi0) ((ucj0) l7m0Var.getValue()).d.get(((Integer) obj).intValue())).d;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                uag0 uag0Var8 = (uag0) obj;
                uag0Var8.getClass();
                uag0Var8.v(((Number) l7m0Var.getValue()).floatValue());
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                g7z g7zVar2 = (g7z) obj;
                g7zVar2.getClass();
                nr nrVar2 = g7zVar2.f10839a.b;
                long jP2 = nrVar2.p();
                nrVar2.i().l();
                try {
                    fvt0 fvt0Var2 = (fvt0) nrVar2.b;
                    fvt0Var2.y(((Number) l7m0Var.getValue()).floatValue(), p7x.u(((nr) fvt0Var2.f10231a).p()));
                    g7zVar2.a();
                    return Unit.f46060a;
                } finally {
                    defpackage.c.g(nrVar2, jP2);
                }
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                uag0 uag0Var9 = (uag0) obj;
                uag0Var9.getClass();
                uag0Var9.b(((Number) l7m0Var.getValue()).floatValue());
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                TopCropFillImageView topCropFillImageView = (TopCropFillImageView) obj;
                topCropFillImageView.getClass();
                List list = u0d.f34849a;
                u0d.j(topCropFillImageView, ((cqr) l7m0Var.getValue()).f4810a, 0, 0, null, null, null, 446);
                return Unit.f46060a;
            default:
                hcz hczVar5 = (hcz) obj;
                hczVar5.getClass();
                List list2 = (List) l7m0Var.getValue();
                hczVar5.f(list2.size(), new zcn0(new t6q0((byte) 27), list2, b2), new adn0(list2, (byte) 28), new ugd(802480018, true, new bzp0(list2, b3)));
                return Unit.f46060a;
        }
    }
}
