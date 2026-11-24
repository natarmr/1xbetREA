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
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.core.presentation.bonuses.views.GamesBonusButtonViewNew;
import org.xplatform.games_mania.presentation.views.GamesManiaMapView;
import org.xplatform.ui_core.viewcomponents.views.large_banner_games_collection.LargeBannerGamesShimmerCollection;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightButton;
import org.xplatform.uikit.components.cells.right.DsCellRightListCheckBox;
import org.xplatform.uikit.components.cells.right.DsCellRightRadioButton;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;
import org.xplatform.uikit.components.header.DsHeader;
import org.xplatform.uikit.components.shimmer.DsShimmerView;
import org.xplatform.uikit_web_games.game_collection.WebGamesGameCollection;
import org.xplatform.uikit_web_games.top_games_collection.WebGamesTopGamesCollection;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s3t implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31575a;

    public /* synthetic */ s3t(byte b) {
        this.f31575a = b;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02cf A[PHI: r1
  0x02cf: PHI (r1v47 int) = (r1v46 int), (r1v48 int) binds: [B:87:0x0286, B:89:0x0291] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:11:0x0051 A[PHI: r2
  0x0051: PHI (r2v54 int) = (r2v53 int), (r2v55 int) binds: [B:5:0x0036, B:7:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f31575a;
        int i = R.id.tvTitle;
        int i2 = R.id.title;
        int i3 = R.id.header;
        byte b2 = 3;
        switch (b) {
            case 0:
                ((Boolean) obj).booleanValue();
                int i4 = GamesBonusButtonViewNew.g;
                ((csr) obj2).getClass();
                return Unit.f46060a;
            case 1:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.popular_classic_item_games_category_with_banner, viewGroup, false);
                WebGamesTopGamesCollection webGamesTopGamesCollection = (WebGamesTopGamesCollection) yum0.f(viewF, R.id.oneXGamesTopGamesCollection);
                if (webGamesTopGamesCollection != null) {
                    return new q7b0((FrameLayout) viewF, webGamesTopGamesCollection);
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(R.id.oneXGamesTopGamesCollection)));
                return null;
            case 2:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.popular_classic_one_x_games_section_shimmer, viewGroup2, false);
                int i5 = R.id.bannerShimmerOne;
                View viewF3 = yum0.f(viewF2, R.id.bannerShimmerOne);
                if (viewF3 != null) {
                    auh auhVar = new auh((FrameLayout) viewF3, (byte) 6);
                    View viewF4 = yum0.f(viewF2, R.id.bannerShimmerTwo);
                    if (viewF4 != null) {
                        auh auhVar2 = new auh((FrameLayout) viewF4, (byte) 6);
                        i5 = R.id.gameCollectionShimmerFive;
                        View viewF5 = yum0.f(viewF2, R.id.gameCollectionShimmerFive);
                        if (viewF5 != null) {
                            nq8 nq8VarA = nq8.a(viewF5);
                            i5 = R.id.gameCollectionShimmerFour;
                            View viewF6 = yum0.f(viewF2, R.id.gameCollectionShimmerFour);
                            if (viewF6 != null) {
                                nq8 nq8VarA2 = nq8.a(viewF6);
                                i5 = R.id.gameCollectionShimmerOne;
                                View viewF7 = yum0.f(viewF2, R.id.gameCollectionShimmerOne);
                                if (viewF7 != null) {
                                    nq8 nq8VarA3 = nq8.a(viewF7);
                                    i5 = R.id.gameCollectionShimmerSix;
                                    View viewF8 = yum0.f(viewF2, R.id.gameCollectionShimmerSix);
                                    if (viewF8 != null) {
                                        nq8 nq8VarA4 = nq8.a(viewF8);
                                        i5 = R.id.gameCollectionShimmerThree;
                                        View viewF9 = yum0.f(viewF2, R.id.gameCollectionShimmerThree);
                                        if (viewF9 != null) {
                                            nq8 nq8VarA5 = nq8.a(viewF9);
                                            i5 = R.id.gameCollectionShimmerTwo;
                                            View viewF10 = yum0.f(viewF2, R.id.gameCollectionShimmerTwo);
                                            if (viewF10 != null) {
                                                nq8 nq8VarA6 = nq8.a(viewF10);
                                                i5 = R.id.shimmerViewLargeBanner;
                                                View viewF11 = yum0.f(viewF2, R.id.shimmerViewLargeBanner);
                                                if (viewF11 != null) {
                                                    LargeBannerGamesShimmerCollection largeBannerGamesShimmerCollection = (LargeBannerGamesShimmerCollection) yum0.f(viewF11, R.id.bannerGamesShimmerCollection);
                                                    if (largeBannerGamesShimmerCollection != null) {
                                                        DsHeader dsHeader = (DsHeader) yum0.f(viewF11, R.id.header);
                                                        if (dsHeader != null) {
                                                            return new i8b0((LinearLayout) viewF2, auhVar, auhVar2, nq8VarA, nq8VarA2, nq8VarA3, nq8VarA4, nq8VarA5, nq8VarA6, new vd7((LinearLayout) viewF11, largeBannerGamesShimmerCollection, dsHeader, (byte) 20));
                                                        }
                                                    } else {
                                                        i3 = R.id.bannerGamesShimmerCollection;
                                                    }
                                                    hny.u("Missing required view with ID: ".concat(viewF11.getResources().getResourceName(i3)));
                                                    return null;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        i5 = R.id.bannerShimmerTwo;
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(i5)));
                return null;
            case 3:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF12 = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.popular_classic_game_collection_item, viewGroup3, false);
                WebGamesGameCollection webGamesGameCollection = (WebGamesGameCollection) yum0.f(viewF12, R.id.collectionView);
                if (webGamesGameCollection != null) {
                    DsHeader dsHeader2 = (DsHeader) yum0.f(viewF12, R.id.header);
                    if (dsHeader2 != null) {
                        return new v6b0((LinearLayout) viewF12, webGamesGameCollection, dsHeader2);
                    }
                } else {
                    i3 = R.id.collectionView;
                }
                hny.u("Missing required view with ID: ".concat(viewF12.getResources().getResourceName(i3)));
                return null;
            case 4:
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                View viewF13 = rw2.f((LayoutInflater) obj, viewGroup4, R.layout.item_bet_games_count, viewGroup4, false);
                if (viewF13 != null) {
                    TextView textView = (TextView) viewF13;
                    return new hsx(textView, textView);
                }
                hny.u("rootView");
                return null;
            case 5:
                ((Boolean) obj).getClass();
                ((Boolean) obj2).getClass();
                List list = GamesManiaMapView.z1;
                return Unit.f46060a;
            case 6:
                gxb gxbVar = (gxb) obj;
                gxb gxbVar2 = (gxb) obj2;
                gxbVar.getClass();
                gxbVar2.getClass();
                return Boolean.valueOf(gxbVar.d == gxbVar2.d && gxbVar.e == gxbVar2.e && Intrinsics.d(gxbVar.i, gxbVar2.i));
            case 7:
                a640 a640Var = (a640) obj;
                a640 a640Var2 = (a640) obj2;
                return Integer.valueOf((a640Var.b() == -1 || a640Var2.b() == -1) ? a640Var.a().compareTo(a640Var2.a()) : Intrinsics.e(a640Var.b(), a640Var2.b()));
            case 8:
                ((Integer) obj).getClass();
                jfo0 jfo0Var = (jfo0) obj2;
                jfo0Var.getClass();
                return jfo0Var.f16439a;
            case 9:
                ((Integer) obj2).getClass();
                epv0.G(x8x.L(7), (fet) obj);
                return Unit.f46060a;
            case 10:
                ViewGroup viewGroup5 = (ViewGroup) obj2;
                View viewF14 = rw2.f((LayoutInflater) obj, viewGroup5, R.layout.group_selector_item, viewGroup5, false);
                DsCellRightListCheckBox dsCellRightListCheckBox = (DsCellRightListCheckBox) yum0.f(viewF14, R.id.rbGroupSelector);
                if (dsCellRightListCheckBox != null) {
                    DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(viewF14, R.id.tvTitle);
                    if (dsCellMiddleTitle != null) {
                        return new ohv((DsSettingsCell) viewF14, dsCellRightListCheckBox, dsCellMiddleTitle);
                    }
                } else {
                    i = R.id.rbGroupSelector;
                }
                hny.u("Missing required view with ID: ".concat(viewF14.getResources().getResourceName(i)));
                return null;
            case 11:
                ((Integer) obj).getClass();
                djv djvVar = (djv) obj2;
                djvVar.getClass();
                return djvVar.f6204a;
            case 12:
                ViewGroup viewGroup6 = (ViewGroup) obj2;
                View viewF15 = rw2.f((LayoutInflater) obj, viewGroup6, R.layout.item_shake_settings_header, viewGroup6, false);
                int i6 = R.id.cmtUseGesture;
                if (((DsCellMiddleTitle) yum0.f(viewF15, R.id.cmtUseGesture)) != null) {
                    i6 = R.id.crsSwitchUseGesture;
                    DsCellRightSwitch dsCellRightSwitch = (DsCellRightSwitch) yum0.f(viewF15, R.id.crsSwitchUseGesture);
                    if (dsCellRightSwitch == null) {
                        i3 = i6;
                    } else if (((DsHeader) yum0.f(viewF15, R.id.header)) != null) {
                        i3 = R.id.ivShake;
                        if (((ImageView) yum0.f(viewF15, R.id.ivShake)) != null) {
                            i3 = R.id.scFeatureAvailability;
                            if (((DsSettingsCell) yum0.f(viewF15, R.id.scFeatureAvailability)) != null) {
                                i3 = R.id.scToggleContainer;
                                if (((DsSettingsCell) yum0.f(viewF15, R.id.scToggleContainer)) != null) {
                                    i3 = R.id.tvUseGesture;
                                    if (((DsCellMiddleTitle) yum0.f(viewF15, R.id.tvUseGesture)) != null) {
                                        return new oxx((ConstraintLayout) viewF15, dsCellRightSwitch);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    i3 = i6;
                }
                hny.u("Missing required view with ID: ".concat(viewF15.getResources().getResourceName(i3)));
                return null;
            case 13:
                ViewGroup viewGroup7 = (ViewGroup) obj2;
                View viewF16 = rw2.f((LayoutInflater) obj, viewGroup7, R.layout.item_shake_settings_screen, viewGroup7, false);
                int i7 = R.id.cliSectionIcon;
                DsCellLeftIcon dsCellLeftIcon = (DsCellLeftIcon) yum0.f(viewF16, R.id.cliSectionIcon);
                if (dsCellLeftIcon != null) {
                    i7 = R.id.cmtSectionName;
                    DsCellMiddleTitle dsCellMiddleTitle2 = (DsCellMiddleTitle) yum0.f(viewF16, R.id.cmtSectionName);
                    if (dsCellMiddleTitle2 != null) {
                        i7 = R.id.crrbSection;
                        DsCellRightRadioButton dsCellRightRadioButton = (DsCellRightRadioButton) yum0.f(viewF16, R.id.crrbSection);
                        if (dsCellRightRadioButton != null) {
                            DsSettingsCell dsSettingsCell = (DsSettingsCell) viewF16;
                            return new pxx(dsSettingsCell, dsCellLeftIcon, dsCellMiddleTitle2, dsCellRightRadioButton, dsSettingsCell);
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF16.getResources().getResourceName(i7)));
                return null;
            case 14:
                ViewGroup viewGroup8 = (ViewGroup) obj2;
                View viewF17 = rw2.f((LayoutInflater) obj, viewGroup8, R.layout.item_header, viewGroup8, false);
                if (viewF17 != null) {
                    DsHeader dsHeader3 = (DsHeader) viewF17;
                    return new jvx(dsHeader3, dsHeader3);
                }
                hny.u("rootView");
                return null;
            case 15:
                fet fetVar = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar.e0(-212895774);
                xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                fetVar.r(false);
                return xczVarA;
            case 16:
                fet fetVar2 = (fet) obj;
                ((Integer) obj2).getClass();
                fetVar2.e0(126102344);
                d9z d9zVarA = f9z.a(fetVar2);
                fetVar2.r(false);
                return d9zVarA;
            case 17:
                ViewGroup viewGroup9 = (ViewGroup) obj2;
                View viewF18 = rw2.f((LayoutInflater) obj, viewGroup9, R.layout.header_shimmer, viewGroup9, false);
                if (viewF18 != null) {
                    return new mzq((DsShimmerView) viewF18, b2);
                }
                hny.u("rootView");
                return null;
            case 18:
                ViewGroup viewGroup10 = (ViewGroup) obj2;
                View viewF19 = rw2.f((LayoutInflater) obj, viewGroup10, R.layout.header_statistic_block_item, viewGroup10, false);
                TextView textView2 = (TextView) yum0.f(viewF19, R.id.subtitle);
                if (textView2 != null) {
                    DsHeader dsHeader4 = (DsHeader) yum0.f(viewF19, R.id.title);
                    if (dsHeader4 != null) {
                        return new xrv((ConstraintLayout) viewF19, textView2, dsHeader4);
                    }
                } else {
                    i2 = R.id.subtitle;
                }
                hny.u("Missing required view with ID: ".concat(viewF19.getResources().getResourceName(i2)));
                return null;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ViewGroup viewGroup11 = (ViewGroup) obj2;
                View viewF20 = rw2.f((LayoutInflater) obj, viewGroup11, R.layout.cybergame_header_item, viewGroup11, false);
                if (viewF20 != null) {
                    TextView textView3 = (TextView) viewF20;
                    return new kth(textView3, textView3);
                }
                hny.u("rootView");
                return null;
            case 20:
                ViewGroup viewGroup12 = (ViewGroup) obj2;
                View viewF21 = rw2.f((LayoutInflater) obj, viewGroup12, R.layout.cybergames_item_header, viewGroup12, false);
                if (viewF21 != null) {
                    DsHeader dsHeader5 = (DsHeader) viewF21;
                    return new yth(dsHeader5, dsHeader5);
                }
                hny.u("rootView");
                return null;
            case 21:
                ViewGroup viewGroup13 = (ViewGroup) obj2;
                View viewF22 = rw2.f((LayoutInflater) obj, viewGroup13, R.layout.item_header, viewGroup13, false);
                if (viewF22 != null) {
                    DsHeader dsHeader6 = (DsHeader) viewF22;
                    return new ivx(dsHeader6, dsHeader6);
                }
                hny.u("rootView");
                return null;
            case 22:
                ViewGroup viewGroup14 = (ViewGroup) obj2;
                View viewF23 = rw2.f((LayoutInflater) obj, viewGroup14, R.layout.item_stadium_info, viewGroup14, false);
                if (viewF23 != null) {
                    TextView textView4 = (TextView) viewF23;
                    return new yxx(textView4, textView4);
                }
                hny.u("rootView");
                return null;
            case 23:
                ViewGroup viewGroup15 = (ViewGroup) obj2;
                View viewF24 = rw2.f((LayoutInflater) obj, viewGroup15, R.layout.item_history_header, viewGroup15, false);
                if (viewF24 != null) {
                    DsHeader dsHeader7 = (DsHeader) viewF24;
                    return new lvx(dsHeader7, dsHeader7);
                }
                hny.u("rootView");
                return null;
            case 24:
                ((Integer) obj).getClass();
                z3a0 z3a0Var = (z3a0) obj2;
                z3a0Var.getClass();
                return z3a0Var.f43710a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                hew0.t(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                fet fetVar3 = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar3.e0(-1710830408);
                xcz xczVarA2 = ddz.a(0, 0, fetVar3, 0, 3);
                fetVar3.r(false);
                return xczVarA2;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ViewGroup viewGroup16 = (ViewGroup) obj2;
                View viewF25 = rw2.f((LayoutInflater) obj, viewGroup16, R.layout.history_aggregator_filter_item, viewGroup16, false);
                if (viewF25 != null) {
                    TextView textView5 = (TextView) viewF25;
                    return new kyv(textView5, textView5);
                }
                hny.u("rootView");
                return null;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ViewGroup viewGroup17 = (ViewGroup) obj2;
                View viewF26 = rw2.f((LayoutInflater) obj, viewGroup17, R.layout.bet_history_date_filter_type_item, viewGroup17, false);
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewF26;
                TextView textView6 = (TextView) yum0.f(viewF26, R.id.tvTitle);
                if (textView6 != null) {
                    return new b47(linearLayoutCompat, textView6);
                }
                hny.u("Missing required view with ID: ".concat(viewF26.getResources().getResourceName(R.id.tvTitle)));
                return null;
            default:
                ViewGroup viewGroup18 = (ViewGroup) obj2;
                View viewF27 = rw2.f((LayoutInflater) obj, viewGroup18, R.layout.item_history_extended, viewGroup18, false);
                DsSettingsCell dsSettingsCell2 = (DsSettingsCell) viewF27;
                int i8 = R.id.delete;
                DsCellRightButton dsCellRightButton = (DsCellRightButton) yum0.f(viewF27, R.id.delete);
                if (dsCellRightButton != null) {
                    i8 = R.id.icon;
                    DsCellLeftIcon dsCellLeftIcon2 = (DsCellLeftIcon) yum0.f(viewF27, R.id.icon);
                    if (dsCellLeftIcon2 != null) {
                        DsCellMiddleTitle dsCellMiddleTitle3 = (DsCellMiddleTitle) yum0.f(viewF27, R.id.title);
                        if (dsCellMiddleTitle3 != null) {
                            return new kvx(dsSettingsCell2, dsCellRightButton, dsCellLeftIcon2, dsCellMiddleTitle3);
                        }
                    } else {
                        i2 = i8;
                    }
                } else {
                    i2 = i8;
                }
                hny.u("Missing required view with ID: ".concat(viewF27.getResources().getResourceName(i2)));
                return null;
        }
    }

    public /* synthetic */ s3t(int i, byte b) {
        this.f31575a = b;
    }
}
