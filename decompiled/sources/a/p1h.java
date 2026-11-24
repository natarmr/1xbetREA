package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.cyber.cyberstatistic.impl.presentation.stagetable.view.CyberStageView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p1h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26201a;

    public /* synthetic */ p1h(byte b) {
        this.f26201a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f26201a;
        int i = R.id.title;
        byte b2 = 0;
        switch (b) {
            case 0:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup.getClass();
                return dux.a(layoutInflater, viewGroup);
            case 1:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.cybergame_last_matches_footer, viewGroup2, false);
                ImageView imageView = (ImageView) yum0.f(viewF, R.id.ivArrow);
                if (imageView != null) {
                    return new mth((FrameLayout) viewF, imageView);
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(R.id.ivArrow)));
                return null;
            case 2:
                ((Integer) obj).getClass();
                l5h l5hVar = (l5h) obj2;
                l5hVar.getClass();
                return l5hVar.f19455a;
            case 3:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(new vlf((byte) 28));
                function2.invoke(new x3h((byte) 12));
                return Unit.f46060a;
            case 4:
                Function1 function3 = (Function1) obj;
                Function1 function4 = (Function1) obj2;
                function3.getClass();
                function4.getClass();
                function3.invoke(new m7h(b2));
                function4.invoke(new x3h((byte) 14));
                return Unit.f46060a;
            case 5:
                Function1 function5 = (Function1) obj;
                Function1 function6 = (Function1) obj2;
                function5.getClass();
                function6.getClass();
                function5.invoke(new vlf((byte) 29));
                function6.invoke(new x3h((byte) 13));
                return Unit.f46060a;
            case 6:
                Function1 function7 = (Function1) obj;
                Function1 function8 = (Function1) obj2;
                function7.getClass();
                function8.getClass();
                function7.invoke(zbh.f44115a);
                function8.invoke(new x3h((byte) 28));
                return Unit.f46060a;
            case 7:
                LayoutInflater layoutInflater2 = (LayoutInflater) obj;
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                layoutInflater2.getClass();
                viewGroup3.getClass();
                return oth.a(layoutInflater2, viewGroup3, false);
            case 8:
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup4, R.layout.cybergame_single_team_last_matches_item, viewGroup4, false);
                int i2 = R.id.ivEnemyTeam;
                ImageView imageView2 = (ImageView) yum0.f(viewF2, R.id.ivEnemyTeam);
                if (imageView2 != null) {
                    i2 = R.id.tvBoTitle;
                    TextView textView = (TextView) yum0.f(viewF2, R.id.tvBoTitle);
                    if (textView != null) {
                        i2 = R.id.tvChampName;
                        TextView textView2 = (TextView) yum0.f(viewF2, R.id.tvChampName);
                        if (textView2 != null) {
                            i2 = R.id.tvDate;
                            TextView textView3 = (TextView) yum0.f(viewF2, R.id.tvDate);
                            if (textView3 != null) {
                                i2 = R.id.tvEnemyTeam;
                                TextView textView4 = (TextView) yum0.f(viewF2, R.id.tvEnemyTeam);
                                if (textView4 != null) {
                                    i2 = R.id.tvGameScore;
                                    TextView textView5 = (TextView) yum0.f(viewF2, R.id.tvGameScore);
                                    if (textView5 != null) {
                                        return new qth((ConstraintLayout) viewF2, imageView2, textView, textView2, textView3, textView4, textView5);
                                    }
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(i2)));
                return null;
            case 9:
                ViewGroup viewGroup5 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup5, R.layout.cybergame_single_team_last_matches_header, viewGroup5, false);
                ImageView imageView3 = (ImageView) yum0.f(viewF3, R.id.ivTeam);
                if (imageView3 != null) {
                    return new pth((FrameLayout) viewF3, imageView3);
                }
                hny.u("Missing required view with ID: ".concat(viewF3.getResources().getResourceName(R.id.ivTeam)));
                return null;
            case 10:
                ViewGroup viewGroup6 = (ViewGroup) obj2;
                View viewF4 = rw2.f((LayoutInflater) obj, viewGroup6, R.layout.cyber_stage_view, viewGroup6, false);
                if (viewF4 != null) {
                    return new rfh((CyberStageView) viewF4);
                }
                hny.u("rootView");
                return null;
            case 11:
                ViewGroup viewGroup7 = (ViewGroup) obj2;
                View viewF5 = rw2.f((LayoutInflater) obj, viewGroup7, R.layout.cyber_statistic_button, viewGroup7, false);
                ShapeableImageView shapeableImageView = (ShapeableImageView) yum0.f(viewF5, R.id.icon);
                if (shapeableImageView != null) {
                    ShapeableImageView shapeableImageView2 = (ShapeableImageView) yum0.f(viewF5, R.id.ivBackground);
                    if (shapeableImageView2 != null) {
                        TextView textView6 = (TextView) yum0.f(viewF5, R.id.title);
                        if (textView6 != null) {
                            return new tfh((ConstraintLayout) viewF5, shapeableImageView, shapeableImageView2, textView6);
                        }
                    } else {
                        i = R.id.ivBackground;
                    }
                } else {
                    i = R.id.icon;
                }
                hny.u("Missing required view with ID: ".concat(viewF5.getResources().getResourceName(i)));
                return null;
            case 12:
                LayoutInflater layoutInflater3 = (LayoutInflater) obj;
                ViewGroup viewGroup8 = (ViewGroup) obj2;
                layoutInflater3.getClass();
                viewGroup8.getClass();
                return vjd.a(layoutInflater3, viewGroup8);
            case 13:
                LayoutInflater layoutInflater4 = (LayoutInflater) obj;
                ViewGroup viewGroup9 = (ViewGroup) obj2;
                layoutInflater4.getClass();
                viewGroup9.getClass();
                return vjd.a(layoutInflater4, viewGroup9);
            case 14:
                ViewGroup viewGroup10 = (ViewGroup) obj2;
                View viewF6 = rw2.f((LayoutInflater) obj, viewGroup10, R.layout.cyber_statistic_settings_button, viewGroup10, false);
                ShapeableImageView shapeableImageView3 = (ShapeableImageView) yum0.f(viewF6, R.id.icon);
                if (shapeableImageView3 != null) {
                    TextView textView7 = (TextView) yum0.f(viewF6, R.id.subTitle);
                    if (textView7 == null) {
                        i = R.id.subTitle;
                    } else if (((TextView) yum0.f(viewF6, R.id.title)) != null) {
                        return new lgh((ConstraintLayout) viewF6, shapeableImageView3, textView7);
                    }
                } else {
                    i = R.id.icon;
                }
                hny.u("Missing required view with ID: ".concat(viewF6.getResources().getResourceName(i)));
                return null;
            case 15:
                LayoutInflater layoutInflater5 = (LayoutInflater) obj;
                ViewGroup viewGroup11 = (ViewGroup) obj2;
                layoutInflater5.getClass();
                viewGroup11.getClass();
                return vjd.a(layoutInflater5, viewGroup11);
            case 16:
                wwv0 wwv0Var = (wwv0) obj;
                wwv0Var.getClass();
                ((kkh) obj2).getClass();
                wwv0Var.c.c = ltv0.f20644a;
                return Unit.f46060a;
            case 17:
                int iIntValue = ((Integer) obj).intValue();
                smh smhVar = (smh) obj2;
                smhVar.getClass();
                long j = smhVar.f32446a;
                StringBuilder sb = new StringBuilder();
                sb.append(j);
                sb.append(iIntValue);
                return sb.toString();
            case 18:
                ((Integer) obj2).getClass();
                tlb.B(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                int iIntValue2 = ((Integer) obj).intValue();
                smh smhVar2 = (smh) obj2;
                smhVar2.getClass();
                long j2 = smhVar2.f32446a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(j2);
                sb2.append(iIntValue2);
                return sb2.toString();
            case 20:
                ((Integer) obj2).getClass();
                f7k.c(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 21:
                int iIntValue3 = ((Integer) obj).intValue();
                smh smhVar3 = (smh) obj2;
                smhVar3.getClass();
                long j3 = smhVar3.f32446a;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(j3);
                sb3.append(iIntValue3);
                return sb3.toString();
            case 22:
                ((Integer) obj2).getClass();
                ntb.f(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 23:
                ((Integer) obj).getClass();
                jnh jnhVar = (jnh) obj2;
                jnhVar.getClass();
                return jnhVar.f16812a;
            case 24:
                ((Integer) obj2).getClass();
                jwb.h(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                ozb.m(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                bfb.x(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                gkb.u(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                o050.v(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                kkb.A(x8x.L(1), (fet) obj);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ p1h(int i, byte b) {
        this.f26201a = b;
    }
}
