package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.promo.impl.promocodes.presentation.components.PromoBanner;
import org.xplatform.promo.impl.promocodes.presentation.shop.components.PromoStoreCollection;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightBanner;
import org.xplatform.uikit.components.header.DsHeader;
import org.xplatform.uikit.components.shimmer.DsShimmerView;
import org.xplatform.uikit.components.views.OptimizedScrollRecyclerView;
import org.xplatform.uikit_web_games.game_collection.WebGamesGameCollection;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t4c0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33314a;

    public /* synthetic */ t4c0(byte b) {
        this.f33314a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f33314a;
        int i = R.id.titleShimmer;
        int i2 = R.id.tvLabel;
        int i3 = R.id.games;
        int i4 = R.id.icon;
        int i5 = R.id.header;
        switch (b) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.delegate_promo_additional_vertical_shimmer_item, viewGroup, false);
                if (viewF != null) {
                    return new m2k((LinearLayout) viewF);
                }
                hny.u("rootView");
                return null;
            case 1:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.delegate_promo_additional_vertical_item, viewGroup2, false);
                if (((DsHeader) yum0.f(viewF2, R.id.header)) != null) {
                    i5 = R.id.optimizedScrollRecyclerView;
                    OptimizedScrollRecyclerView optimizedScrollRecyclerView = (OptimizedScrollRecyclerView) yum0.f(viewF2, R.id.optimizedScrollRecyclerView);
                    if (optimizedScrollRecyclerView != null) {
                        return new l2k((LinearLayout) viewF2, optimizedScrollRecyclerView);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(i5)));
                return null;
            case 2:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.delegate_promo_banner_with_categories_card_shimmer_item, viewGroup3, false);
                DsShimmerView dsShimmerView = (DsShimmerView) yum0.f(viewF3, R.id.balanceShimmer);
                if (dsShimmerView != null) {
                    LinearLayout linearLayout = (LinearLayout) yum0.f(viewF3, R.id.llShimmers);
                    if (linearLayout != null) {
                        DsHeader dsHeader = (DsHeader) yum0.f(viewF3, R.id.titleShimmer);
                        if (dsHeader != null) {
                            return new q2k((LinearLayout) viewF3, dsShimmerView, linearLayout, dsHeader);
                        }
                    } else {
                        i = R.id.llShimmers;
                    }
                } else {
                    i = R.id.balanceShimmer;
                }
                hny.u("Missing required view with ID: ".concat(viewF3.getResources().getResourceName(i)));
                return null;
            case 3:
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                View viewF4 = rw2.f((LayoutInflater) obj, viewGroup4, R.layout.delegate_promo_banner_with_categories_card_item, viewGroup4, false);
                DsButton dsButton = (DsButton) yum0.f(viewF4, R.id.btnRequest);
                if (dsButton != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) yum0.f(viewF4, R.id.clBalance);
                    if (constraintLayout != null) {
                        DsHeader dsHeader2 = (DsHeader) yum0.f(viewF4, R.id.header);
                        if (dsHeader2 != null) {
                            PromoStoreCollection promoStoreCollection = (PromoStoreCollection) yum0.f(viewF4, R.id.promoStoreCollection);
                            if (promoStoreCollection != null) {
                                TextView textView = (TextView) yum0.f(viewF4, R.id.tvBalance);
                                if (textView == null) {
                                    i2 = R.id.tvBalance;
                                } else if (((TextView) yum0.f(viewF4, R.id.tvLabel)) != null) {
                                    return new p2k((LinearLayout) viewF4, dsButton, constraintLayout, dsHeader2, promoStoreCollection, textView);
                                }
                            } else {
                                i2 = R.id.promoStoreCollection;
                            }
                        } else {
                            i2 = R.id.header;
                        }
                    } else {
                        i2 = R.id.clBalance;
                    }
                } else {
                    i2 = R.id.btnRequest;
                }
                hny.u("Missing required view with ID: ".concat(viewF4.getResources().getResourceName(i2)));
                return null;
            case 4:
                ViewGroup viewGroup5 = (ViewGroup) obj2;
                View viewF5 = rw2.f((LayoutInflater) obj, viewGroup5, R.layout.delegate_promo_simple_shimmer_item, viewGroup5, false);
                if (viewF5 != null) {
                    return new y2k((FrameLayout) viewF5);
                }
                hny.u("rootView");
                return null;
            case 5:
                ViewGroup viewGroup6 = (ViewGroup) obj2;
                View viewF6 = rw2.f((LayoutInflater) obj, viewGroup6, R.layout.delegate_promo_banner_item, viewGroup6, false);
                if (viewF6 != null) {
                    PromoBanner promoBanner = (PromoBanner) viewF6;
                    return new o2k(promoBanner, promoBanner);
                }
                hny.u("rootView");
                return null;
            case 6:
                ViewGroup viewGroup7 = (ViewGroup) obj2;
                View viewF7 = rw2.f((LayoutInflater) obj, viewGroup7, R.layout.delegate_promo_banner_default_item, viewGroup7, false);
                if (((DsCellRightBanner) yum0.f(viewF7, R.id.banner)) == null) {
                    i4 = R.id.banner;
                } else if (((DsCellLeftIcon) yum0.f(viewF7, R.id.icon)) != null) {
                    i4 = R.id.menuCell;
                    DsMenuCell dsMenuCell = (DsMenuCell) yum0.f(viewF7, R.id.menuCell);
                    if (dsMenuCell != null) {
                        i4 = R.id.texts;
                        DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(viewF7, R.id.texts);
                        if (dsCellMiddleTitle != null) {
                            return new n2k((FrameLayout) viewF7, dsMenuCell, dsCellMiddleTitle);
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF7.getResources().getResourceName(i4)));
                return null;
            case 7:
                ViewGroup viewGroup8 = (ViewGroup) obj2;
                View viewF8 = rw2.f((LayoutInflater) obj, viewGroup8, R.layout.delegate_promo_banner_with_categories_shimmer_item, viewGroup8, false);
                DsShimmerView dsShimmerView2 = (DsShimmerView) yum0.f(viewF8, R.id.balanceShimmer);
                if (dsShimmerView2 != null) {
                    LinearLayout linearLayout2 = (LinearLayout) yum0.f(viewF8, R.id.llShimmers);
                    if (linearLayout2 != null) {
                        DsHeader dsHeader3 = (DsHeader) yum0.f(viewF8, R.id.titleShimmer);
                        if (dsHeader3 != null) {
                            return new s2k((LinearLayout) viewF8, dsShimmerView2, linearLayout2, dsHeader3);
                        }
                    } else {
                        i = R.id.llShimmers;
                    }
                } else {
                    i = R.id.balanceShimmer;
                }
                hny.u("Missing required view with ID: ".concat(viewF8.getResources().getResourceName(i)));
                return null;
            case 8:
                ViewGroup viewGroup9 = (ViewGroup) obj2;
                View viewF9 = rw2.f((LayoutInflater) obj, viewGroup9, R.layout.delegate_promo_banner_with_categories_item, viewGroup9, false);
                DsButton dsButton2 = (DsButton) yum0.f(viewF9, R.id.btnRequest);
                if (dsButton2 != null) {
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) yum0.f(viewF9, R.id.clBalance);
                    if (constraintLayout2 != null) {
                        DsHeader dsHeader4 = (DsHeader) yum0.f(viewF9, R.id.header);
                        if (dsHeader4 != null) {
                            PromoStoreCollection promoStoreCollection2 = (PromoStoreCollection) yum0.f(viewF9, R.id.promoStoreCollection);
                            if (promoStoreCollection2 != null) {
                                TextView textView2 = (TextView) yum0.f(viewF9, R.id.tvBalance);
                                if (textView2 == null) {
                                    i2 = R.id.tvBalance;
                                } else if (((TextView) yum0.f(viewF9, R.id.tvLabel)) != null) {
                                    return new r2k((LinearLayout) viewF9, dsButton2, constraintLayout2, dsHeader4, promoStoreCollection2, textView2);
                                }
                            } else {
                                i2 = R.id.promoStoreCollection;
                            }
                        } else {
                            i2 = R.id.header;
                        }
                    } else {
                        i2 = R.id.clBalance;
                    }
                } else {
                    i2 = R.id.btnRequest;
                }
                hny.u("Missing required view with ID: ".concat(viewF9.getResources().getResourceName(i2)));
                return null;
            case 9:
                ViewGroup viewGroup10 = (ViewGroup) obj2;
                View viewF10 = rw2.f((LayoutInflater) obj, viewGroup10, R.layout.delegate_promo_bonus_games_card_shimmer_item, viewGroup10, false);
                if (viewF10 != null) {
                    return new u2k((CardView) viewF10);
                }
                hny.u("rootView");
                return null;
            case 10:
                ViewGroup viewGroup11 = (ViewGroup) obj2;
                View viewF11 = rw2.f((LayoutInflater) obj, viewGroup11, R.layout.delegate_promo_bonus_games_card_item, viewGroup11, false);
                WebGamesGameCollection webGamesGameCollection = (WebGamesGameCollection) yum0.f(viewF11, R.id.games);
                if (webGamesGameCollection != null) {
                    DsHeader dsHeader5 = (DsHeader) yum0.f(viewF11, R.id.header);
                    if (dsHeader5 != null) {
                        return new t2k((CardView) viewF11, webGamesGameCollection, dsHeader5);
                    }
                    i3 = R.id.header;
                }
                hny.u("Missing required view with ID: ".concat(viewF11.getResources().getResourceName(i3)));
                return null;
            case 11:
                ViewGroup viewGroup12 = (ViewGroup) obj2;
                View viewF12 = rw2.f((LayoutInflater) obj, viewGroup12, R.layout.delegate_promo_bonus_games_shimmer_item, viewGroup12, false);
                if (((LinearLayout) yum0.f(viewF12, R.id.llShimmers)) != null) {
                    return new w2k((LinearLayout) viewF12);
                }
                hny.u("Missing required view with ID: ".concat(viewF12.getResources().getResourceName(R.id.llShimmers)));
                return null;
            case 12:
                ViewGroup viewGroup13 = (ViewGroup) obj2;
                View viewF13 = rw2.f((LayoutInflater) obj, viewGroup13, R.layout.delegate_promo_bonus_games_item, viewGroup13, false);
                WebGamesGameCollection webGamesGameCollection2 = (WebGamesGameCollection) yum0.f(viewF13, R.id.games);
                if (webGamesGameCollection2 != null) {
                    DsHeader dsHeader6 = (DsHeader) yum0.f(viewF13, R.id.header);
                    if (dsHeader6 != null) {
                        return new v2k((LinearLayout) viewF13, webGamesGameCollection2, dsHeader6);
                    }
                    i3 = R.id.header;
                }
                hny.u("Missing required view with ID: ".concat(viewF13.getResources().getResourceName(i3)));
                return null;
            case 13:
                ((Throwable) obj).printStackTrace();
                return Unit.f46060a;
            case 14:
                ((Integer) obj).getClass();
                yrc0 yrc0Var = (yrc0) obj2;
                yrc0Var.getClass();
                return Long.valueOf(yrc0Var.getId());
            case 15:
                ((Integer) obj).intValue();
                aec0 aec0Var = (aec0) obj2;
                aec0Var.getClass();
                return Long.valueOf(aec0Var.f721a);
            case 16:
                return Unit.f46060a;
            case 17:
                ViewGroup viewGroup14 = (ViewGroup) obj2;
                View viewF14 = rw2.f((LayoutInflater) obj, viewGroup14, R.layout.item_promo_code_ds, viewGroup14, false);
                int i6 = R.id.ivPromoCode;
                DsCellLeftIcon dsCellLeftIcon = (DsCellLeftIcon) yum0.f(viewF14, R.id.ivPromoCode);
                if (dsCellLeftIcon != null) {
                    i6 = R.id.promoCodeInfo;
                    DsCellMiddleTitle dsCellMiddleTitle2 = (DsCellMiddleTitle) yum0.f(viewF14, R.id.promoCodeInfo);
                    if (dsCellMiddleTitle2 != null) {
                        return new ywx((DsSettingsCell) viewF14, dsCellLeftIcon, dsCellMiddleTitle2);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF14.getResources().getResourceName(i6)));
                return null;
            case 18:
                ((Integer) obj2).getClass();
                i4w0.A(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((wim) obj).getClass();
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                i4w0.t(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                i4w0.u(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                i4w0.C(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 23:
                ViewGroup viewGroup15 = (ViewGroup) obj2;
                View viewF15 = rw2.f((LayoutInflater) obj, viewGroup15, R.layout.item_decorated_tint_item, viewGroup15, false);
                DsMenuCell dsMenuCell2 = (DsMenuCell) viewF15;
                DsCellRightBanner dsCellRightBanner = (DsCellRightBanner) yum0.f(viewF15, R.id.decorIcon);
                if (dsCellRightBanner != null) {
                    DsCellLeftIcon dsCellLeftIcon2 = (DsCellLeftIcon) yum0.f(viewF15, R.id.icon);
                    if (dsCellLeftIcon2 != null) {
                        i4 = R.id.title;
                        DsCellMiddleTitle dsCellMiddleTitle3 = (DsCellMiddleTitle) yum0.f(viewF15, R.id.title);
                        if (dsCellMiddleTitle3 != null) {
                            return new xtx(dsMenuCell2, dsMenuCell2, dsCellRightBanner, dsCellLeftIcon2, dsCellMiddleTitle3);
                        }
                    }
                } else {
                    i4 = R.id.decorIcon;
                }
                hny.u("Missing required view with ID: ".concat(viewF15.getResources().getResourceName(i4)));
                return null;
            case 24:
                ((Integer) obj2).getClass();
                vbw0.I(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                vbw0.J(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Integer num = (Integer) obj;
                num.intValue();
                ((p6t0) obj2).getClass();
                return num;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                hmw0.o(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                hmw0.b(x8x.L(1), (fet) obj);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ t4c0(int i, byte b) {
        this.f33314a = b;
    }
}
