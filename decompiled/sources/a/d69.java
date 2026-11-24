package a;

import android.javax.sip.message.Response;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;
import org.xbet.client1.R;
import org.xplatform.cyber.game.universal.impl.presentation.cardfootball.views.CardFootballView;
import org.xplatform.feature.fin_bet.impl.presentation.view.CarriageContainer;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d69 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5541a;

    public /* synthetic */ d69(byte b) {
        this.f5541a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = 1;
        byte b2 = 2;
        byte b3 = 6;
        byte b4 = 0;
        switch (this.f5541a) {
            case 0:
                z59 z59Var = (z59) obj;
                z59Var.getClass();
                return new c69(z59Var);
            case 1:
                ((Integer) obj).getClass();
                return Unit.f46060a;
            case 2:
                ((jtl) obj).getClass();
                return Unit.f46060a;
            case 3:
                yai0.e((abi0) obj, 0);
                return Unit.f46060a;
            case 4:
                Pair pair = (Pair) obj;
                pair.getClass();
                return w6x.q((String) pair.f46059a, ": ", (String) pair.b);
            case 5:
                eu9 eu9Var = (eu9) obj;
                eu9Var.getClass();
                String str = eu9Var.b;
                int length = str.length();
                String strI = f140.i(length, "/500");
                boolean z = length > 500;
                int i = eu9Var.f8409a;
                return new fu9(i, str, strI, z, z || i <= 0);
            case 6:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 7:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                return Unit.f46060a;
            case 8:
                return obj instanceof nfi0 ? ((nfi0) obj).f23438a : String.valueOf(obj);
            case 9:
                Pair pair2 = (Pair) obj;
                pair2.getClass();
                return (CharSequence) pair2.b;
            case 10:
                ((b7r) obj).getClass();
                return Boolean.TRUE;
            case 11:
                MatchResult matchResult = (MatchResult) obj;
                matchResult.getClass();
                return Integer.valueOf(Integer.parseInt(matchResult.getValue()));
            case 12:
                MatchResult matchResult2 = (MatchResult) obj;
                matchResult2.getClass();
                return Integer.valueOf(Integer.parseInt(matchResult2.getValue()));
            case 13:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new ok(cpVar, cpVar, (byte) 5));
                return Unit.f46060a;
            case 14:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                cpVar2.t(new ok(cpVar2, cpVar2, b3));
                return Unit.f46060a;
            case 15:
                int i2 = CardFootballView.x;
                ((Throwable) obj).getClass();
                return Unit.f46060a;
            case 16:
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                qmk0 qmk0Var = new qmk0(cpVar3.w.getResources().getDimensionPixelSize(R.dimen.space_4), 0, 0, 0, 0, 1, null, null, 478);
                gkz gkzVar = new gkz();
                msx msxVar = (msx) cpVar3.u;
                msxVar.b.m(qmk0Var);
                RecyclerView recyclerView = msxVar.b;
                recyclerView.setAdapter(gkzVar);
                gkz gkzVar2 = new gkz();
                RecyclerView recyclerView2 = msxVar.c;
                recyclerView2.m(qmk0Var);
                recyclerView2.setAdapter(gkzVar2);
                nka nkaVar = new nka();
                nka nkaVar2 = new nka();
                nkaVar.b = recyclerView2;
                nkaVar.c = nkaVar2;
                nkaVar2.b = recyclerView;
                nkaVar2.c = nkaVar;
                nkaVar.f23673a = new kja(cpVar3, b4);
                nkaVar2.f23673a = new kja(cpVar3, b);
                recyclerView.o(nkaVar);
                recyclerView2.o(nkaVar2);
                cpVar3.t(new lja(cpVar3, gkzVar, gkzVar2, cpVar3, (byte) 0));
                return Unit.f46060a;
            case 17:
                cp cpVar4 = (cp) obj;
                cpVar4.getClass();
                qmk0 qmk0Var2 = new qmk0(cpVar4.w.getResources().getDimensionPixelSize(R.dimen.space_4), 0, 0, 0, 0, 1, null, null, 478);
                gkz gkzVar3 = new gkz();
                msx msxVar2 = (msx) cpVar4.u;
                msxVar2.b.m(qmk0Var2);
                RecyclerView recyclerView3 = msxVar2.b;
                recyclerView3.setAdapter(gkzVar3);
                gkz gkzVar4 = new gkz();
                RecyclerView recyclerView4 = msxVar2.c;
                recyclerView4.m(qmk0Var2);
                recyclerView4.setAdapter(gkzVar4);
                nka nkaVar3 = new nka();
                nka nkaVar4 = new nka();
                nkaVar3.b = recyclerView4;
                nkaVar3.c = nkaVar4;
                nkaVar4.b = recyclerView3;
                nkaVar4.c = nkaVar3;
                nkaVar3.f23673a = new kja(cpVar4, b2);
                nkaVar4.f23673a = new kja(cpVar4, (byte) 3);
                recyclerView3.o(nkaVar3);
                recyclerView4.o(nkaVar4);
                cpVar4.t(new lja(cpVar4, gkzVar3, gkzVar4, cpVar4, (byte) 1));
                return Unit.f46060a;
            case 18:
                pi9 pi9Var = (pi9) obj;
                pi9Var.getClass();
                zcl zclVar = qmk.f28987a;
                float density = pi9Var.getDensity() * 10.0f;
                return pi9Var.a(new rja((((long) Float.floatToRawIntBits(density)) & 4294967295L) | (((long) Float.floatToRawIntBits(density)) << 32), new vtm0(pi9Var.getDensity() * 1.0f, 0.0f, 0, 0, null, 30), b4));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                StaticColors staticColors = StaticColors.INSTANCE;
                long jM78getBlack800d7_KjU = staticColors.m78getBlack800d7_KjU();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar.d() >> 32));
                zcl zclVar2 = qmk.f28987a;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fhlVar.w0(22.0f))) & 4294967295L);
                float fW0 = fhlVar.w0(8.0f);
                fhl.o0(fhlVar, jM78getBlack800d7_KjU, 0L, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fW0)) << 32) | (((long) Float.floatToRawIntBits(fW0)) & 4294967295L), null, 242);
                float fW1 = fhlVar.w0(8.0f);
                long jM130getWhite600d7_KjU = staticColors.m130getWhite600d7_KjU();
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fW1)) << 32) | (((long) Float.floatToRawIntBits(fhlVar.w0(70.0f))) & 4294967295L);
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - (fW1 * 2.0f))) << 32) | (((long) Float.floatToRawIntBits(fhlVar.w0(1.0f))) & 4294967295L);
                float fW2 = fhlVar.w0(360.0f);
                fhl.o0(fhlVar, jM130getWhite600d7_KjU, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fW2)) << 32) | (((long) Float.floatToRawIntBits(fW2)) & 4294967295L), null, 240);
                return Unit.f46060a;
            case 20:
                kc90 kc90Var = (kc90) obj;
                kc90Var.getClass();
                return Integer.valueOf(kc90Var.getKey());
            case 21:
                ((c53) obj).getClass();
                return ay3.e0(kzn.d(ro4.m0(Response.BAD_REQUEST, 0, null, 6), 0.0f, 2), kzn.e(ro4.m0(Response.BAD_REQUEST, 0, null, 6), 2));
            case 22:
                oc90 oc90Var = (oc90) obj;
                oc90Var.getClass();
                return Integer.valueOf(oc90Var.getKey());
            case 23:
                ((c53) obj).getClass();
                return ay3.e0(kzn.d(ro4.m0(Response.BAD_REQUEST, 0, null, 6), 0.0f, 2), kzn.e(ro4.m0(Response.BAD_REQUEST, 0, null, 6), 2));
            case 24:
                fhl fhlVar2 = (fhl) obj;
                fhlVar2.getClass();
                pz40 pz40Var = s6t0.f31722a;
                fhl.u(fhlVar2, s6t0.b().f33626a.getBackgroundContent(), 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                sjd sjdVar = (sjd) obj;
                sjdVar.getClass();
                return new asa(sjdVar);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                dja djaVar = (dja) obj;
                djaVar.getClass();
                return djaVar.name();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj).getClass();
                int i3 = CarriageContainer.f;
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((ou90) obj).getClass();
                return Unit.f46060a;
            default:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                th3.printStackTrace();
                return Unit.f46060a;
        }
    }
}
