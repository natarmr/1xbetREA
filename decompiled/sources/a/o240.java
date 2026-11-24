package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o240 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24514a;

    public /* synthetic */ o240(byte b) {
        this.f24514a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f24514a;
        byte b2 = 6;
        int i = R.id.tvTeamName;
        byte b3 = 5;
        switch (b) {
            case 0:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 1:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 2:
                fhl fhlVar = (fhl) obj;
                nu90 nu90Var = (nu90) obj2;
                fhlVar.getClass();
                nu90Var.getClass();
                float fM = f7k.M(64);
                float fIntBitsToFloat = (Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - fM) / 2.0f;
                float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) - fM) / 2.0f;
                ((fvt0) fhlVar.A0().b).A(fIntBitsToFloat, fIntBitsToFloat2);
                try {
                    pm80 pm80Var = nu90Var.f24139a;
                    long jFloatToRawIntBits = Float.floatToRawIntBits(fM);
                    pm80Var.e(fhlVar, (Float.floatToRawIntBits(fM) & 4294967295L) | (jFloatToRawIntBits << 32), nu90Var.b, nu90Var.c);
                    return Unit.f46060a;
                } finally {
                    ((fvt0) fhlVar.A0().b).A(-fIntBitsToFloat, -fIntBitsToFloat2);
                }
            case 3:
                ((Integer) obj2).getClass();
                q8a.B(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                q8a.C(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 5:
                uz40 uz40Var = (uz40) obj2;
                ((azg0) obj).getClass();
                uz40Var.getClass();
                return (Boolean) ((hgk0) uz40Var.d).getValue();
            case 6:
                int iIntValue = ((Integer) obj).intValue();
                ja40 ja40Var = (ja40) obj2;
                ja40Var.getClass();
                return f140.i(iIntValue, ja40Var.f16172a);
            case 7:
                ((Integer) obj).getClass();
                cq90 cq90Var = (cq90) obj2;
                cq90Var.getClass();
                return cq90Var.getId();
            case 8:
                ((String) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 9:
                fet fetVar = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar.e0(1169979214);
                xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                fetVar.r(false);
                return xczVarA;
            case 10:
                fet fetVar2 = (fet) obj;
                ((Integer) obj2).getClass();
                fetVar2.e0(1963467502);
                rah0 rah0VarT = wha0.T(fetVar2);
                fetVar2.r(false);
                return rah0VarT;
            case 11:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(new da40(b3));
                function2.invoke(new ec40((byte) 6));
                return Unit.f46060a;
            case 12:
                Function1 function3 = (Function1) obj;
                Function1 function4 = (Function1) obj2;
                function3.getClass();
                function4.getClass();
                function3.invoke(new da40(b2));
                function4.invoke(new ec40((byte) 7));
                return Unit.f46060a;
            case 13:
                ((Integer) obj).getClass();
                in40 in40Var = (in40) obj2;
                in40Var.getClass();
                return in40Var.f15056a;
            case 14:
                ((Integer) obj2).getClass();
                x8f.E(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 15:
                Integer num = (Integer) obj;
                num.intValue();
                ((a4x) obj2).getClass();
                return num;
            case 16:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.item_multi_team_one, viewGroup, false);
                RoundCornerImageView roundCornerImageView = (RoundCornerImageView) yum0.f(viewF, R.id.ivTeamIcon);
                if (roundCornerImageView != null) {
                    TextView textView = (TextView) yum0.f(viewF, R.id.tvTeamName);
                    if (textView != null) {
                        return new lwx((FrameLayout) viewF, roundCornerImageView, textView);
                    }
                } else {
                    i = R.id.ivTeamIcon;
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i)));
                return null;
            case 17:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.item_multi_team_two, viewGroup2, false);
                RoundCornerImageView roundCornerImageView2 = (RoundCornerImageView) yum0.f(viewF2, R.id.ivTeamIcon);
                if (roundCornerImageView2 != null) {
                    TextView textView2 = (TextView) yum0.f(viewF2, R.id.tvTeamName);
                    if (textView2 != null) {
                        return new mwx((FrameLayout) viewF2, roundCornerImageView2, textView2);
                    }
                } else {
                    i = R.id.ivTeamIcon;
                }
                hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(i)));
                return null;
            case 18:
                int iIntValue2 = ((Integer) obj).intValue();
                tf40 tf40Var = (tf40) obj2;
                tf40Var.getClass();
                return twn.m(iIntValue2, tf40Var.getKey());
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 20:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 21:
                return Unit.f46060a;
            case 22:
                Function1 function5 = (Function1) obj;
                Function1 function6 = (Function1) obj2;
                function5.getClass();
                function6.getClass();
                function5.invoke(new da40((byte) 24));
                function6.invoke(new ec40((byte) 20));
                return Unit.f46060a;
            case 23:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 24:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                return new lie(kzn.d(ro4.g0(1.0f, 1600.0f, null, 4), 0.0f, 2), kzn.g(null, 0.7f, 5), (u7k0) null, 12);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new xcz(((Integer) obj).intValue(), ((Integer) obj2).intValue());
            default:
                return new d9z(((Integer) obj).intValue(), ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ o240(int i, byte b) {
        this.f24514a = b;
    }
}
