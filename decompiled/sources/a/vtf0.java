package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.components.check_box.DsCheckbox;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vtf0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38005a;

    public /* synthetic */ vtf0(byte b) {
        this.f38005a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = 5;
        switch (this.f38005a) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.item_responsible_title, viewGroup, false);
                int i = R.id.tvDescription;
                TextView textView = (TextView) yum0.f(viewF, R.id.tvDescription);
                if (textView != null) {
                    i = R.id.tvTitle;
                    TextView textView2 = (TextView) yum0.f(viewF, R.id.tvTitle);
                    if (textView2 != null) {
                        return new dxx((LinearLayout) viewF, textView, textView2);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i)));
                return null;
            case 1:
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).intValue();
                ((mxl) obj).getClass();
                return Unit.f46060a;
            case 3:
                fet fetVar = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar.e0(1523147057);
                xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                fetVar.r(false);
                return xczVarA;
            case 4:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(new wtf0(b));
                function2.invoke(new b4f0((byte) 29));
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                d7g0.a(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 6:
                ((Integer) obj).getClass();
                dyl0 dyl0Var = (dyl0) obj2;
                cge0 cge0Var = n7g0.p2;
                dyl0Var.getClass();
                return dyl0Var.b;
            case 7:
                w7g0 w7g0Var = (w7g0) obj2;
                ((oyg0) obj).getClass();
                w7g0Var.getClass();
                return w7g0.a(w7g0Var, false, false, true, null, null, null, 56);
            case 8:
                w7g0 w7g0Var2 = (w7g0) obj2;
                ((oyg0) obj).getClass();
                w7g0Var2.getClass();
                return w7g0.a(w7g0Var2, false, true, false, null, null, null, 56);
            case 9:
                ((Integer) obj2).getClass();
                b5x.o(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                b5x.c(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 11:
                Function1 function3 = (Function1) obj;
                Function1 function4 = (Function1) obj2;
                function3.getClass();
                function4.getClass();
                function3.invoke(new wtf0((byte) 8));
                function4.invoke(new j6g0((byte) 5));
                return Unit.f46060a;
            case 12:
                sgy sgyVar = (sgy) obj;
                sgy sgyVar2 = (sgy) obj2;
                sgyVar.getClass();
                sgyVar2.getClass();
                return b1j.k("A required DAO return type converter (", sgyVar.v(), ") for ", sgyVar2.v(), " is missing in the database configuration.");
            case 13:
                sgy sgyVar3 = (sgy) obj;
                sgy sgyVar4 = (sgy) obj2;
                sgyVar3.getClass();
                sgyVar4.getClass();
                return b1j.k("A required column type converter (", sgyVar3.v(), ") for ", sgyVar4.v(), " is missing in the database configuration.");
            case 14:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.synthetic_roulette_round_item, viewGroup2, false);
                int i2 = R.id.roundNumberTv;
                TextView textView3 = (TextView) yum0.f(viewF2, R.id.roundNumberTv);
                if (textView3 != null) {
                    i2 = R.id.roundValueTv;
                    TextView textView4 = (TextView) yum0.f(viewF2, R.id.roundValueTv);
                    if (textView4 != null) {
                        return new o7o0((LinearLayout) viewF2, textView3, textView4);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(i2)));
                return null;
            case 15:
                fet fetVar2 = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar2.e0(-205807313);
                xcz xczVarA2 = ddz.a(0, 0, fetVar2, 0, 3);
                fetVar2.r(false);
                return xczVarA2;
            case 16:
                fet fetVar3 = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar3.e0(494105813);
                xcz xczVarA3 = ddz.a(0, 0, fetVar3, 0, 3);
                fetVar3.r(false);
                return xczVarA3;
            case 17:
                ((Integer) obj2).getClass();
                kcx.p(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 18:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup3.getClass();
                return cth.a(layoutInflater, viewGroup3, false);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup4, R.layout.cybergame_cs2_round_statistics_item, viewGroup4, false);
                int i3 = R.id.counterTerroristsStatIv;
                ImageView imageView = (ImageView) yum0.f(viewF3, R.id.counterTerroristsStatIv);
                if (imageView != null) {
                    i3 = R.id.indicatorContainer;
                    FrameLayout frameLayout = (FrameLayout) yum0.f(viewF3, R.id.indicatorContainer);
                    if (frameLayout != null) {
                        i3 = R.id.roundText;
                        TextView textView5 = (TextView) yum0.f(viewF3, R.id.roundText);
                        if (textView5 != null) {
                            i3 = R.id.roundTextBackground;
                            View viewF4 = yum0.f(viewF3, R.id.roundTextBackground);
                            if (viewF4 != null) {
                                i3 = R.id.roundWinIndicator;
                                View viewF5 = yum0.f(viewF3, R.id.roundWinIndicator);
                                if (viewF5 != null) {
                                    i3 = R.id.terroristsStatIv;
                                    ImageView imageView2 = (ImageView) yum0.f(viewF3, R.id.terroristsStatIv);
                                    if (imageView2 != null) {
                                        return new bth((ConstraintLayout) viewF3, imageView, frameLayout, textView5, viewF4, viewF5, imageView2);
                                    }
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF3.getResources().getResourceName(i3)));
                return null;
            case 20:
                Integer num = (Integer) obj;
                num.intValue();
                ((bkg0) obj2).getClass();
                return num;
            case 21:
                ViewGroup viewGroup5 = (ViewGroup) obj2;
                View viewF6 = rw2.f((LayoutInflater) obj, viewGroup5, R.layout.layout_rules_check_item, viewGroup5, false);
                int i4 = R.id.acceptRules;
                DsCheckbox dsCheckbox = (DsCheckbox) yum0.f(viewF6, R.id.acceptRules);
                if (dsCheckbox != null) {
                    i4 = R.id.ic_info;
                    if (((ImageView) yum0.f(viewF6, R.id.ic_info)) != null) {
                        i4 = R.id.participationRules;
                        LinearLayout linearLayout = (LinearLayout) yum0.f(viewF6, R.id.participationRules);
                        if (linearLayout != null) {
                            return new u7z((LinearLayoutCompat) viewF6, dsCheckbox, linearLayout);
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF6.getResources().getResourceName(i4)));
                return null;
            case 22:
                dmg0 dmg0Var = (dmg0) obj2;
                ((azg0) obj).getClass();
                dmg0Var.getClass();
                return Float.valueOf(dmg0Var.b.l());
            case 23:
                ((Integer) obj2).getClass();
                piz.i(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 24:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                svg0 svg0Var = (svg0) obj2;
                ((oyg0) obj).getClass();
                svg0Var.getClass();
                return svg0.a(svg0Var, 0.0f, 0.0f, 0.0f, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, false, false, utg0.f36253a, null, null, null, null, null, 8372223);
            default:
                svg0 svg0Var2 = (svg0) obj2;
                ((oyg0) obj).getClass();
                svg0Var2.getClass();
                return svg0.a(svg0Var2, 0.0f, 0.0f, 0.0f, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, false, false, utg0.f36253a, null, null, null, null, null, 8372223);
        }
    }

    public /* synthetic */ vtf0(int i, byte b) {
        this.f38005a = b;
    }
}
