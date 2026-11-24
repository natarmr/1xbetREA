package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e4p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7194a;

    public /* synthetic */ e4p(byte b) {
        this.f7194a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = 2;
        switch (this.f7194a) {
            case 0:
                ((List) obj).getClass();
                return Unit.f46060a;
            case 1:
                ((cp) obj).getClass();
                return Unit.f46060a;
            case 2:
                ((bem) obj).getClass();
                return Unit.f46060a;
            case 3:
                sjd sjdVar = (sjd) obj;
                sjdVar.getClass();
                return new b5p(sjdVar);
            case 4:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.x(new bb(cpVar, b));
                cpVar.y(new bb(cpVar, (byte) 3));
                return Unit.f46060a;
            case 5:
                return Integer.valueOf(((Boolean) obj).booleanValue() ? (byte) 2 : (byte) 1);
            case 6:
                String str = (String) obj;
                str.getClass();
                pz40 pz40Var = s6t0.f31722a;
                return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(str, s6t0.b().f33626a.getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, true, ra50.f30118a, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), true, null);
            case 7:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                cpVar2.x(new bb(cpVar2, (byte) 4));
                cpVar2.y(new bb(cpVar2, (byte) 5));
                return Unit.f46060a;
            case 8:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 9:
                fee feeVar = (fee) obj;
                feeVar.getClass();
                return Boolean.valueOf(!((Collection) feeVar.c()).isEmpty());
            case 10:
                ((zia) obj).getClass();
                return Unit.f46060a;
            case 11:
                ofp ofpVar = (ofp) obj;
                ofpVar.getClass();
                return ofpVar.f25180a;
            case 12:
                ofp ofpVar2 = (ofp) obj;
                ofpVar2.getClass();
                return ofpVar2.f25180a;
            case 13:
                ofp ofpVar3 = (ofp) obj;
                ofpVar3.getClass();
                return ofpVar3.f25180a;
            case 14:
                return Boolean.valueOf(obj instanceof b0s);
            case 15:
                tn60 tn60Var = (tn60) obj;
                tn60Var.getClass();
                return new zc80(tn60Var);
            case 16:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                return Unit.f46060a;
            case 17:
                sjd sjdVar2 = (sjd) obj;
                sjdVar2.getClass();
                return new yc80(sjdVar2);
            case 18:
                ((abi0) obj).getClass();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((abi0) obj).getClass();
                return Unit.f46060a;
            case 20:
                ((abi0) obj).getClass();
                return Unit.f46060a;
            case 21:
                sek sekVar = org.xplatform.favorites.impl.presentation.category.e.V1;
                obj.getClass();
                return Boolean.valueOf(obj instanceof b0s);
            case 22:
                return String.valueOf(((Long) obj).longValue());
            case 23:
                tn60 tn60Var2 = (tn60) obj;
                tn60Var2.getClass();
                return new rct(tn60Var2);
            case 24:
                zs2 zs2Var = (zs2) obj;
                zs2Var.getClass();
                return zs2Var.f44887a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                zs2 zs2Var2 = (zs2) obj;
                zs2Var2.getClass();
                return zs2Var2.f44887a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                zs2 zs2Var3 = (zs2) obj;
                zs2Var3.getClass();
                return zs2Var3.f44887a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                grq grqVar = (grq) obj;
                grqVar.getClass();
                return Integer.valueOf(grqVar.f11793a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                grq grqVar2 = (grq) obj;
                grqVar2.getClass();
                return Integer.valueOf(grqVar2.f11793a);
            default:
                sjd sjdVar3 = (sjd) obj;
                sjdVar3.getClass();
                return new ump(sjdVar3);
        }
    }
}
