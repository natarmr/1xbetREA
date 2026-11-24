package a;

import android.javax.sip.message.Response;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.MatchTimerView;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;
import org.xplatform.ui_core.viewcomponents.views.FrozenRecyclerView;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class im8 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15013a;

    public /* synthetic */ im8(byte b) {
        this.f15013a = b;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x018a A[PHI: r1
  0x018a: PHI (r1v45 int) = 
  (r1v44 int)
  (r1v46 int)
  (r1v47 int)
  (r1v48 int)
  (r1v49 int)
  (r1v50 int)
  (r1v51 int)
  (r1v52 int)
  (r1v53 int)
  (r1v54 int)
  (r1v55 int)
  (r1v56 int)
 binds: [B:24:0x00d3, B:26:0x00dc, B:28:0x00e7, B:30:0x00f2, B:32:0x00fe, B:34:0x010a, B:36:0x0116, B:38:0x0122, B:40:0x012b, B:42:0x0134, B:44:0x0141, B:46:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f15013a;
        int i = R.id.tvMatchPeriodInfo;
        switch (b) {
            case 0:
                ((Throwable) obj).printStackTrace();
                return Unit.f46060a;
            case 1:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(new cp8((byte) 18));
                function2.invoke(new ej8((byte) 6));
                return Unit.f46060a;
            case 2:
                return Unit.f46060a;
            case 3:
                x19 x19Var = (x19) obj2;
                ((oyg0) obj).getClass();
                x19Var.getClass();
                v19 v19VarA = v19.a(x19Var.c, false, false, false, null, 29);
                u19 u19Var = x19Var.b;
                boolean z = u19Var.f34892a;
                boolean z2 = u19Var.c;
                List list = u19Var.d;
                hr10 hr10Var = u19Var.e;
                hr10Var.getClass();
                return x19.a(x19Var, null, new u19(z, false, z2, list, hr10Var), v19VarA, false, null, null, Response.VERSION_NOT_SUPPORTED);
            case 4:
                Function1 function3 = (Function1) obj;
                Function1 function4 = (Function1) obj2;
                function3.getClass();
                function4.getClass();
                function3.invoke(new cp8((byte) 27));
                function4.invoke(new ej8((byte) 8));
                return Unit.f46060a;
            case 5:
                return Unit.f46060a;
            case 6:
                ((Throwable) obj).printStackTrace();
                return Unit.f46060a;
            case 7:
                ((Throwable) obj).printStackTrace();
                return Unit.f46060a;
            case 8:
                ((Integer) obj).intValue();
                la9 la9Var = (la9) obj2;
                la9Var.getClass();
                return Long.valueOf(la9Var.f19695a);
            case 9:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.item_button, viewGroup, false);
                if (viewF != null) {
                    DsButton dsButton = (DsButton) viewF;
                    return new isx(dsButton, dsButton);
                }
                hny.u("rootView");
                return null;
            case 10:
                fet fetVar = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar.e0(1142730171);
                xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                fetVar.r(false);
                return xczVarA;
            case 11:
                ((Integer) obj2).getClass();
                ay3.G(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 12:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup2.getClass();
                return jsx.a(layoutInflater, viewGroup2);
            case 13:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.item_call_theme, viewGroup3, false);
                DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(viewF2, R.id.cmtTitle);
                if (dsCellMiddleTitle != null) {
                    DsSettingsCell dsSettingsCell = (DsSettingsCell) viewF2;
                    return new ksx(dsSettingsCell, dsCellMiddleTitle, dsSettingsCell);
                }
                hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(R.id.cmtTitle)));
                return null;
            case 14:
                ((Integer) obj2).getClass();
                nnw0.r(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 15:
                LayoutInflater layoutInflater2 = (LayoutInflater) obj;
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                layoutInflater2.getClass();
                viewGroup4.getClass();
                return lsx.a(layoutInflater2, viewGroup4);
            case 16:
                LayoutInflater layoutInflater3 = (LayoutInflater) obj;
                ViewGroup viewGroup5 = (ViewGroup) obj2;
                layoutInflater3.getClass();
                viewGroup5.getClass();
                return lsx.a(layoutInflater3, viewGroup5);
            case 17:
                ViewGroup viewGroup6 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup6, R.layout.item_card_common_single_game, viewGroup6, false);
                TextView textView = (TextView) yum0.f(viewF3, R.id.tvMatchDescription);
                if (textView != null) {
                    TextView textView2 = (TextView) yum0.f(viewF3, R.id.tvMatchName);
                    if (textView2 != null) {
                        TextView textView3 = (TextView) yum0.f(viewF3, R.id.tvMatchPeriodInfo);
                        if (textView3 != null) {
                            i = R.id.vMatchTimer;
                            MatchTimerView matchTimerView = (MatchTimerView) yum0.f(viewF3, R.id.vMatchTimer);
                            if (matchTimerView != null) {
                                return new nsx((ConstraintLayout) viewF3, textView, textView2, textView3, matchTimerView);
                            }
                        }
                    } else {
                        i = R.id.tvMatchName;
                    }
                } else {
                    i = R.id.tvMatchDescription;
                }
                hny.u("Missing required view with ID: ".concat(viewF3.getResources().getResourceName(i)));
                return null;
            case 18:
                ((Integer) obj).getClass();
                tea teaVar = (tea) obj2;
                teaVar.getClass();
                return teaVar.f33810a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ViewGroup viewGroup7 = (ViewGroup) obj2;
                View viewF4 = rw2.f((LayoutInflater) obj, viewGroup7, R.layout.item_card_error, viewGroup7, false);
                AppCompatTextView appCompatTextView = (AppCompatTextView) yum0.f(viewF4, R.id.tvErrorMessage);
                if (appCompatTextView != null) {
                    return new psx((FrameLayout) viewF4, appCompatTextView);
                }
                hny.u("Missing required view with ID: ".concat(viewF4.getResources().getResourceName(R.id.tvErrorMessage)));
                return null;
            case 20:
                LayoutInflater layoutInflater4 = (LayoutInflater) obj;
                ViewGroup viewGroup8 = (ViewGroup) obj2;
                layoutInflater4.getClass();
                viewGroup8.getClass();
                return msx.a(layoutInflater4, viewGroup8);
            case 21:
                ViewGroup viewGroup9 = (ViewGroup) obj2;
                View viewF5 = rw2.f((LayoutInflater) obj, viewGroup9, R.layout.item_card_cricket, viewGroup9, false);
                int i2 = R.id.dividerGuideline;
                if (((Guideline) yum0.f(viewF5, R.id.dividerGuideline)) != null) {
                    i2 = R.id.firstTeamVerticalSeparatorView;
                    View viewF6 = yum0.f(viewF5, R.id.firstTeamVerticalSeparatorView);
                    if (viewF6 != null) {
                        i2 = R.id.flFirstTeamLogo;
                        if (((FrameLayout) yum0.f(viewF5, R.id.flFirstTeamLogo)) != null) {
                            i2 = R.id.flSecondTeamLogo;
                            if (((FrameLayout) yum0.f(viewF5, R.id.flSecondTeamLogo)) != null) {
                                i2 = R.id.ivFirstTeamFavorite;
                                ImageView imageView = (ImageView) yum0.f(viewF5, R.id.ivFirstTeamFavorite);
                                if (imageView != null) {
                                    i2 = R.id.ivFirstTeamImage;
                                    RoundCornerImageView roundCornerImageView = (RoundCornerImageView) yum0.f(viewF5, R.id.ivFirstTeamImage);
                                    if (roundCornerImageView != null) {
                                        i2 = R.id.ivSecondTeamFavorite;
                                        ImageView imageView2 = (ImageView) yum0.f(viewF5, R.id.ivSecondTeamFavorite);
                                        if (imageView2 != null) {
                                            i2 = R.id.ivSecondTeamImage;
                                            RoundCornerImageView roundCornerImageView2 = (RoundCornerImageView) yum0.f(viewF5, R.id.ivSecondTeamImage);
                                            if (roundCornerImageView2 != null) {
                                                i2 = R.id.secondTeamVerticalSeparatorView;
                                                View viewF7 = yum0.f(viewF5, R.id.secondTeamVerticalSeparatorView);
                                                if (viewF7 != null) {
                                                    i2 = R.id.teamsHorizontalSeparatorView;
                                                    View viewF8 = yum0.f(viewF5, R.id.teamsHorizontalSeparatorView);
                                                    if (viewF8 != null) {
                                                        i2 = R.id.tvFirstTeamName;
                                                        TextView textView4 = (TextView) yum0.f(viewF5, R.id.tvFirstTeamName);
                                                        if (textView4 != null) {
                                                            i2 = R.id.tvFirstTeamScore;
                                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) yum0.f(viewF5, R.id.tvFirstTeamScore);
                                                            if (appCompatTextView2 != null) {
                                                                TextView textView5 = (TextView) yum0.f(viewF5, R.id.tvMatchDescription);
                                                                if (textView5 != null) {
                                                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) yum0.f(viewF5, R.id.tvMatchPeriodInfo);
                                                                    if (appCompatTextView3 != null) {
                                                                        i = R.id.tvSecondTeamName;
                                                                        TextView textView6 = (TextView) yum0.f(viewF5, R.id.tvSecondTeamName);
                                                                        if (textView6 != null) {
                                                                            i = R.id.tvSecondTeamScore;
                                                                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) yum0.f(viewF5, R.id.tvSecondTeamScore);
                                                                            if (appCompatTextView4 != null) {
                                                                                return new osx((ConstraintLayout) viewF5, viewF6, imageView, roundCornerImageView, imageView2, roundCornerImageView2, viewF7, viewF8, textView4, appCompatTextView2, textView5, appCompatTextView3, textView6, appCompatTextView4);
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    i = R.id.tvMatchDescription;
                                                                }
                                                            } else {
                                                                i = i2;
                                                            }
                                                        } else {
                                                            i = i2;
                                                        }
                                                    } else {
                                                        i = i2;
                                                    }
                                                } else {
                                                    i = i2;
                                                }
                                            } else {
                                                i = i2;
                                            }
                                        } else {
                                            i = i2;
                                        }
                                    } else {
                                        i = i2;
                                    }
                                } else {
                                    i = i2;
                                }
                            } else {
                                i = i2;
                            }
                        } else {
                            i = i2;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    i = i2;
                }
                hny.u("Missing required view with ID: ".concat(viewF5.getResources().getResourceName(i)));
                return null;
            case 22:
                LayoutInflater layoutInflater5 = (LayoutInflater) obj;
                ViewGroup viewGroup10 = (ViewGroup) obj2;
                layoutInflater5.getClass();
                viewGroup10.getClass();
                return msx.a(layoutInflater5, viewGroup10);
            case 23:
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                return Unit.f46060a;
            case 24:
                ((Long) obj).getClass();
                ((Boolean) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Long) obj).getClass();
                ((Boolean) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ViewGroup viewGroup11 = (ViewGroup) obj2;
                View viewF9 = rw2.f((LayoutInflater) obj, viewGroup11, R.layout.item_card_with_timer, viewGroup11, false);
                if (viewF9 != null) {
                    FrozenRecyclerView frozenRecyclerView = (FrozenRecyclerView) viewF9;
                    return new atx(frozenRecyclerView, frozenRecyclerView);
                }
                hny.u("rootView");
                return null;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Function1 function5 = (Function1) obj;
                Function1 function6 = (Function1) obj2;
                function5.getClass();
                function6.getClass();
                function5.invoke(new d69((byte) 25));
                function6.invoke(new mn9((byte) 26));
                return Unit.f46060a;
            default:
                ((Integer) obj).intValue();
                eja ejaVar = (eja) obj2;
                ejaVar.getClass();
                return ejaVar.f7899a;
        }
    }

    public /* synthetic */ im8(int i, byte b) {
        this.f15013a = b;
    }
}
