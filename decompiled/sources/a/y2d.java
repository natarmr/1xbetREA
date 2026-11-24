package a;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;
import org.xbet.client1.R;
import org.xplatform.uikit.components.account_control.AmountCurrencyView;
import org.xplatform.uikit.components.loader.DsLoader;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class y2d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41898a;

    public /* synthetic */ y2d(byte b) {
        this.f41898a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = 27;
        int i = 3;
        byte b2 = 28;
        byte b3 = 1;
        switch (this.f41898a) {
            case 0:
                List list = (List) obj;
                list.getClass();
                f3d f3dVar = new f3d();
                float fFloatValue = ((Number) list.get(0)).floatValue();
                float fFloatValue2 = ((Number) list.get(1)).floatValue();
                int iFloatValue = (int) ((Number) list.get(2)).floatValue();
                agk0 agk0Var = f3dVar.f8856a;
                agk0Var.m(fFloatValue);
                f3dVar.f(fFloatValue2);
                ((hgk0) f3dVar.b).setValue(Boolean.valueOf(agk0Var.l() >= f3dVar.d.l()));
                f3dVar.i = -iFloatValue;
                return f3dVar;
            case 1:
                ((ou90) obj).getClass();
                return Unit.f46060a;
            case 2:
                ((p8d) obj).getClass();
                return Unit.f46060a;
            case 3:
                ((p8d) obj).getClass();
                return Unit.f46060a;
            case 4:
                ((p8d) obj).getClass();
                return Unit.f46060a;
            case 5:
                Context context = (Context) obj;
                context.getClass();
                DsLoader dsLoader = new DsLoader(context, null, 6);
                TypedValue typedValue = j5d.f15927a;
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(j5d.a(context, R.attr.uikitSecondary60, false));
                colorStateListValueOf.getClass();
                dsLoader.setIndeterminateTintList(colorStateListValueOf);
                return dsLoader;
            case 6:
                Context context2 = (Context) obj;
                context2.getClass();
                AmountCurrencyView amountCurrencyView = new AmountCurrencyView(context2, null);
                amountCurrencyView.b(context2, R.style.TextStyle_Title_Medium_XL_TextPrimary, Float.valueOf(amountCurrencyView.getResources().getDimension(R.dimen.text_32)), Float.valueOf(amountCurrencyView.getResources().getDimension(R.dimen.text_20)));
                return amountCurrencyView;
            case 7:
                o8w o8wVar = (o8w) obj;
                o8wVar.getClass();
                return o8wVar.getKey();
            case 8:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hcz.g(hczVar, 9, null, null, wha0.b, 6);
                return Unit.f46060a;
            case 9:
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                uag0Var.b(0.99f);
                return Unit.f46060a;
            case 10:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                hcz.g(hczVar2, 6, null, null, jd8.f, 6);
                return Unit.f46060a;
            case 11:
                ((bem) obj).getClass();
                return Unit.f46060a;
            case 12:
                ((m8m) obj).getClass();
                return Unit.f46060a;
            case 13:
                ((Long) obj).getClass();
                return Unit.f46060a;
            case 14:
                mkd mkdVar = (mkd) obj;
                e7z e7zVar = mkdVar instanceof e7z ? (e7z) mkdVar : null;
                if (e7zVar != null && e7zVar.s1) {
                    xcx.b("Apply is called on deactivated node " + mkdVar);
                }
                return Unit.f46060a;
            case 15:
                return Boolean.valueOf(!(((km40) obj) instanceof tkd));
            case 16:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new ok(cpVar, cpVar, (byte) 11));
                return Unit.f46060a;
            case 17:
                MatchResult matchResult = (MatchResult) obj;
                matchResult.getClass();
                return Integer.valueOf(Integer.parseInt(matchResult.getValue()));
            case 18:
                MatchResult matchResult2 = (MatchResult) obj;
                matchResult2.getClass();
                return Integer.valueOf(Integer.parseInt(matchResult2.getValue()));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                cpVar2.t(new w0(cpVar2, cpVar2));
                return Unit.f46060a;
            case 20:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                StaticColors staticColors = StaticColors.INSTANCE;
                long jM78getBlack800d7_KjU = staticColors.m78getBlack800d7_KjU();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar.d() >> 32));
                zcl zclVar = qmk.f28987a;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fhlVar.w0(18.0f))) & 4294967295L);
                float fW0 = fhlVar.w0(8.0f);
                fhl.o0(fhlVar, jM78getBlack800d7_KjU, 0L, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fW0)) << 32) | (((long) Float.floatToRawIntBits(fW0)) & 4294967295L), null, 242);
                float fW1 = fhlVar.w0(8.0f);
                long jM130getWhite600d7_KjU = staticColors.m130getWhite600d7_KjU();
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fW1)) << 32) | (((long) Float.floatToRawIntBits(fhlVar.w0(48.0f))) & 4294967295L);
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - (fW1 * 2.0f))) << 32) | (((long) Float.floatToRawIntBits(fhlVar.w0(1.0f))) & 4294967295L);
                float fW2 = fhlVar.w0(360.0f);
                fhl.o0(fhlVar, jM130getWhite600d7_KjU, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fW2)) << 32) | (((long) Float.floatToRawIntBits(fW2)) & 4294967295L), null, 240);
                return Unit.f46060a;
            case 21:
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                cpVar3.t(new ok(cpVar3, cpVar3, (byte) 12));
                return Unit.f46060a;
            case 22:
                cp cpVar4 = (cp) obj;
                cpVar4.getClass();
                gkz gkzVar = new gkz(gqd.d);
                gkzVar.d.b(new gbn(new bqd(b3), new tad(i, b), new y2d(b2), fpd.h));
                mtx mtxVar = (mtx) cpVar4.u;
                mtxVar.j.setAdapter(gkzVar);
                RecyclerView recyclerView = mtxVar.j;
                recyclerView.n(new bie0(recyclerView));
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(mtxVar.d, "rotation", 0.0f, 360.0f);
                objectAnimatorOfFloat.setDuration(1000L);
                objectAnimatorOfFloat.setRepeatCount(-1);
                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(mtxVar.g, "rotation", 0.0f, 360.0f);
                objectAnimatorOfFloat2.setDuration(1000L);
                objectAnimatorOfFloat2.setRepeatCount(-1);
                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                cpVar4.t(new gpd(cpVar4, gkzVar, objectAnimatorOfFloat, objectAnimatorOfFloat2, cpVar4, gkzVar, objectAnimatorOfFloat, objectAnimatorOfFloat2, (byte) 0));
                return Unit.f46060a;
            case 23:
                cp cpVar5 = (cp) obj;
                cpVar5.getClass();
                cpVar5.t(new ok(cpVar5, cpVar5, (byte) 13));
                return Unit.f46060a;
            case 24:
                cp cpVar6 = (cp) obj;
                cpVar6.getClass();
                cpVar6.t(new ok(cpVar6, cpVar6, (byte) 14));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                cp cpVar7 = (cp) obj;
                cpVar7.getClass();
                cpVar7.t(new ok(cpVar7, cpVar7, (byte) 15));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                cp cpVar8 = (cp) obj;
                cpVar8.getClass();
                gkz gkzVar2 = new gkz(m2a.h);
                byte b4 = 24;
                gbn gbnVar = new gbn(new shd(b2), new tad(i, b4), new y2d((byte) 25), fpd.e);
                dp dpVar = gkzVar2.d;
                dpVar.b(gbnVar);
                dpVar.b(new gbn(new shd(b), new tad(i, (byte) 23), new y2d(b4), fpd.d));
                ltx ltxVar = (ltx) cpVar8.u;
                ltxVar.d.setAdapter(gkzVar2);
                RecyclerView recyclerView2 = ltxVar.d;
                recyclerView2.n(new bie0(recyclerView2));
                cpVar8.t(new if6(cpVar8, gkzVar2, cpVar8, gkzVar2, (byte) 1));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                cp cpVar9 = (cp) obj;
                cpVar9.getClass();
                cpVar9.t(new ok(cpVar9, cpVar9, (byte) 16));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                cp cpVar10 = (cp) obj;
                cpVar10.getClass();
                cpVar10.t(new ok(cpVar10, cpVar10, (byte) 17));
                return Unit.f46060a;
            default:
                gwd gwdVar = (gwd) obj;
                gwdVar.getClass();
                return new hwd(new ytl(gwdVar.f12020a, gwdVar.b, gwdVar.d, gwdVar.e, gwdVar.f));
        }
    }
}
