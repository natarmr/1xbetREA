package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class os6 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25769a;

    public /* synthetic */ os6(byte b) {
        this.f25769a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        pz40 pz40Var;
        String str = null;
        switch (this.f25769a) {
            case 0:
                c820 c820Var = (c820) obj2;
                ((oyg0) obj).getClass();
                c820Var.getClass();
                svj0 svj0Var = c820Var.d;
                ex6 ex6Var = svj0Var.f32870a;
                return c820.a(c820Var, null, null, null, svj0.a(svj0Var, ex6.a(ex6Var, null, ww6.a(ex6Var.b, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, null, false, true, 8191), 1), null, null, 14), null, null, false, false, false, false, null, 8183);
            case 1:
                jg7 jg7Var = (jg7) obj;
                jg7 jg7Var2 = (jg7) obj2;
                jg7Var.getClass();
                jg7Var2.getClass();
                return Boolean.valueOf(Intrinsics.d(jg7Var, jg7Var2));
            case 2:
                c820 c820Var2 = (c820) obj2;
                ((oyg0) obj).getClass();
                c820Var2.getClass();
                xtb0 xtb0Var = c820Var2.f;
                return c820.a(c820Var2, null, null, null, null, null, xtb0Var != null ? new xtb0(xtb0Var.f41458a, xtb0Var.c, true) : new xtb0(c820Var2.d.f32870a.b.f39872a, null, true), false, false, false, false, null, 8159);
            case 3:
                c820 c820Var3 = (c820) obj2;
                ((oyg0) obj).getClass();
                c820Var3.getClass();
                jfc0 jfc0Var = c820Var3.e;
                if (jfc0Var != null && (pz40Var = jfc0Var.f16419a.f1710a) != null) {
                    str = (String) pz40Var.getValue();
                }
                return c820.a(c820Var3, null, null, null, null, null, new xtb0(0.0d, str, false), false, false, false, false, null, 8159);
            case 4:
                c820 c820Var4 = (c820) obj2;
                ((oyg0) obj).getClass();
                c820Var4.getClass();
                svj0 svj0Var2 = c820Var4.d;
                ex6 ex6Var2 = svj0Var2.f32870a;
                return c820.a(c820Var4, null, null, null, svj0.a(svj0Var2, ex6.a(ex6Var2, null, ww6.a(ex6Var2.b, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, null, false, false, 8191), 1), null, null, 14), null, null, false, false, false, false, null, 8183);
            case 5:
                return Unit.f46060a;
            case 6:
                ((Throwable) obj).printStackTrace();
                return Unit.f46060a;
            case 7:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.bet_constructor_item_bet_header, viewGroup, false);
                int i = R.id.ivArrow;
                ImageView imageView = (ImageView) yum0.f(viewF, R.id.ivArrow);
                if (imageView != null) {
                    MaterialCardView materialCardView = (MaterialCardView) viewF;
                    TextView textView = (TextView) yum0.f(viewF, R.id.tvHeaderTitle);
                    if (textView != null) {
                        return new cs6(materialCardView, imageView, materialCardView, textView);
                    }
                    i = R.id.tvHeaderTitle;
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i)));
                return null;
            case 8:
                ((Integer) obj).getClass();
                o8w o8wVar = (o8w) obj2;
                o8wVar.getClass();
                return o8wVar.getKey();
            case 9:
                i77 i77Var = (i77) obj2;
                ((oyg0) obj).getClass();
                i77Var.getClass();
                return i77.a(i77Var, false, false, false, null, null, null, null, false, null, null, false, false, false, null, null, null, null, true, null, false, false, false, null, null, null, null, null, -4194305, 2047);
            case 10:
                i77 i77Var2 = (i77) obj2;
                ((oyg0) obj).getClass();
                i77Var2.getClass();
                return i77.a(i77Var2, false, true, false, null, null, null, null, false, null, null, false, false, false, null, null, null, null, false, null, false, false, false, null, null, null, null, null, -3, 2047);
            case 11:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 12:
                i77 i77Var3 = (i77) obj2;
                ((oyg0) obj).getClass();
                i77Var3.getClass();
                return i77.a(i77Var3, false, false, false, null, null, null, null, false, null, null, false, false, false, null, null, null, null, true, null, true, false, false, null, null, null, null, null, -20971521, 2047);
            case 13:
                i77 i77Var4 = (i77) obj2;
                ((oyg0) obj).getClass();
                i77Var4.getClass();
                return i77.a(i77Var4, false, false, false, null, null, null, null, false, null, null, false, false, !i77Var4.q, null, null, null, null, false, null, false, false, false, null, null, null, null, null, -65537, 2047);
            case 14:
                i77 i77Var5 = (i77) obj2;
                ((oyg0) obj).getClass();
                i77Var5.getClass();
                return i77.a(i77Var5, true, false, false, null, null, null, null, false, udj.f35481a, null, false, false, false, null, null, null, null, false, null, true, false, false, null, null, null, null, null, -16779266, 2047);
            case 15:
                i77 i77Var6 = (i77) obj2;
                ((oyg0) obj).getClass();
                i77Var6.getClass();
                return i77.a(i77Var6, true, false, false, null, null, null, null, false, udj.f35481a, null, false, false, false, null, null, null, null, false, null, true, false, false, null, null, null, null, null, -16779266, 2047);
            case 16:
                i77 i77Var7 = (i77) obj2;
                ((oyg0) obj).getClass();
                i77Var7.getClass();
                return i77.a(i77Var7, true, false, false, null, null, null, null, false, null, null, false, false, false, null, null, null, null, false, null, false, false, false, null, null, null, null, null, -2, 2047);
            case 17:
                i77 i77Var8 = (i77) obj2;
                ((oyg0) obj).getClass();
                i77Var8.getClass();
                return i77.a(i77Var8, false, false, false, null, null, null, null, false, null, null, false, false, false, null, null, null, null, false, null, true, false, false, null, null, null, null, null, -16777217, 2047);
            case 18:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                i77 i77Var9 = (i77) obj2;
                ((oyg0) obj).getClass();
                i77Var9.getClass();
                return i77.a(i77Var9, false, false, true, null, null, null, null, false, null, null, false, false, false, null, null, null, null, false, null, false, false, false, null, null, null, null, null, -4194310, 2047);
            case 20:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 21:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 22:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 23:
                i77 i77Var10 = (i77) obj2;
                ((oyg0) obj).getClass();
                i77Var10.getClass();
                return i77.a(i77Var10, false, false, false, null, null, null, null, false, null, null, false, false, false, null, null, null, null, false, null, false, false, false, null, null, null, null, null, -50331649, 2047);
            case 24:
                i77 i77Var11 = (i77) obj2;
                ((oyg0) obj).getClass();
                i77Var11.getClass();
                return i77.a(i77Var11, false, false, false, null, null, null, null, false, null, null, false, false, false, null, null, null, null, false, null, false, false, false, null, null, null, null, null, -3, 2047);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                i77 i77Var12 = (i77) obj2;
                ((oyg0) obj).getClass();
                i77Var12.getClass();
                return i77.a(i77Var12, false, false, false, null, null, null, null, false, null, null, false, false, false, null, null, null, null, false, null, false, false, false, null, null, null, null, null, -3, 2047);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            default:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
        }
    }
}
