package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.framework.common.BundleUtil;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.coupon.impl.core.presentation.base.view.CouponCardBlock;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightRadioButton;
import org.xplatform.uikit.components.separator.DsSeparator;
import org.xplatform.uikit_sport.sport_coupon_card.common.DsSportCouponCard;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bqd implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3023a;

    public /* synthetic */ bqd(byte b) {
        this.f3023a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.c cVar;
        byte b = 0;
        switch (this.f3023a) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.item_compressed_main_cricket_binding, viewGroup, false);
                int i = R.id.dividerGuideline;
                if (((Guideline) yum0.f(viewF, R.id.dividerGuideline)) != null) {
                    i = R.id.firstTeamLogo;
                    RoundCornerImageView roundCornerImageView = (RoundCornerImageView) yum0.f(viewF, R.id.firstTeamLogo);
                    if (roundCornerImageView != null) {
                        i = R.id.firstTeamVerticalSeparatorView;
                        View viewF2 = yum0.f(viewF, R.id.firstTeamVerticalSeparatorView);
                        if (viewF2 != null) {
                            i = R.id.secondTeamLogo;
                            RoundCornerImageView roundCornerImageView2 = (RoundCornerImageView) yum0.f(viewF, R.id.secondTeamLogo);
                            if (roundCornerImageView2 != null) {
                                i = R.id.secondTeamVerticalSeparatorView;
                                View viewF3 = yum0.f(viewF, R.id.secondTeamVerticalSeparatorView);
                                if (viewF3 != null) {
                                    i = R.id.teamsHorizontalSeparatorView;
                                    View viewF4 = yum0.f(viewF, R.id.teamsHorizontalSeparatorView);
                                    if (viewF4 != null) {
                                        i = R.id.tvFirstTeamName;
                                        TextView textView = (TextView) yum0.f(viewF, R.id.tvFirstTeamName);
                                        if (textView != null) {
                                            i = R.id.tvFirstTeamScore;
                                            AppCompatTextView appCompatTextView = (AppCompatTextView) yum0.f(viewF, R.id.tvFirstTeamScore);
                                            if (appCompatTextView != null) {
                                                i = R.id.tvMatchBaseInfo;
                                                TextView textView2 = (TextView) yum0.f(viewF, R.id.tvMatchBaseInfo);
                                                if (textView2 != null) {
                                                    i = R.id.tvSecondTeamName;
                                                    TextView textView3 = (TextView) yum0.f(viewF, R.id.tvSecondTeamName);
                                                    if (textView3 != null) {
                                                        i = R.id.tvSecondTeamScore;
                                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) yum0.f(viewF, R.id.tvSecondTeamScore);
                                                        if (appCompatTextView2 != null) {
                                                            return new otx((ConstraintLayout) viewF, roundCornerImageView, viewF2, roundCornerImageView2, viewF3, viewF4, textView, appCompatTextView, textView2, textView3, appCompatTextView2);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i)));
                return null;
            case 1:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup2.getClass();
                return qtx.a(layoutInflater, viewGroup2);
            case 2:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 3:
                int iIntValue = ((Integer) obj).intValue();
                ks9 ks9Var = (ks9) obj2;
                ks9Var.getClass();
                if (ks9Var instanceof is9) {
                    return ((is9) ks9Var).f15292a + BundleUtil.UNDERLINE_TAG + sre0.f32672a.b(ks9Var.getClass()).J() + BundleUtil.UNDERLINE_TAG + iIntValue;
                }
                if (ks9Var instanceof gs9) {
                    return ((gs9) ks9Var).f11818a + BundleUtil.UNDERLINE_TAG + sre0.f32672a.b(ks9Var.getClass()).J() + BundleUtil.UNDERLINE_TAG + iIntValue;
                }
                if (ks9Var instanceof fs9) {
                    return ((fs9) ks9Var).f10055a + BundleUtil.UNDERLINE_TAG + sre0.f32672a.b(ks9Var.getClass()).J() + BundleUtil.UNDERLINE_TAG + iIntValue;
                }
                if (ks9Var instanceof js9) {
                    return ((js9) ks9Var).f17040a + BundleUtil.UNDERLINE_TAG + sre0.f32672a.b(ks9Var.getClass()).J() + BundleUtil.UNDERLINE_TAG + iIntValue;
                }
                if (!(ks9Var instanceof hs9)) {
                    sgy sgyVarB = sre0.f32672a.b(ks9Var.getClass());
                    StringBuilder sb = new StringBuilder();
                    sb.append(sgyVarB);
                    sb.append(iIntValue);
                    return sb.toString();
                }
                return ((hs9) ks9Var).f13569a + BundleUtil.UNDERLINE_TAG + sre0.f32672a.b(ks9Var.getClass()).J() + BundleUtil.UNDERLINE_TAG + iIntValue;
            case 4:
                int iIntValue2 = ((Integer) obj).intValue();
                nz30 nz30Var = (nz30) obj2;
                nz30Var.getClass();
                return nz30Var.b + iIntValue2 + nz30Var.f24355a;
            case 5:
                ((Integer) obj).getClass();
                nz30 nz30Var2 = (nz30) obj2;
                nz30Var2.getClass();
                return nz30Var2.b.toString();
            case 6:
                CoroutineContext coroutineContext = (CoroutineContext) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                coroutineContext.getClass();
                element.getClass();
                CoroutineContext coroutineContextMinusKey = coroutineContext.minusKey(element.getKey());
                kotlin.coroutines.g gVar = kotlin.coroutines.g.f46065a;
                if (coroutineContextMinusKey == gVar) {
                    return element;
                }
                ake akeVar = kotlin.coroutines.d.d1;
                kotlin.coroutines.d dVar = (kotlin.coroutines.d) coroutineContextMinusKey.get(akeVar);
                if (dVar == null) {
                    cVar = new kotlin.coroutines.c(element, coroutineContextMinusKey);
                } else {
                    CoroutineContext coroutineContextMinusKey2 = coroutineContextMinusKey.minusKey(akeVar);
                    if (coroutineContextMinusKey2 == gVar) {
                        return new kotlin.coroutines.c(dVar, element);
                    }
                    cVar = new kotlin.coroutines.c(dVar, new kotlin.coroutines.c(element, coroutineContextMinusKey2));
                }
                return cVar;
            case 7:
                return Boolean.valueOf(((Boolean) obj).booleanValue());
            case 8:
                return ((CoroutineContext) obj).plus((CoroutineContext.Element) obj2);
            case 9:
                return ((CoroutineContext) obj).plus((CoroutineContext.Element) obj2);
            case 10:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF5 = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.vh_coupon_block_item, viewGroup3, false);
                if (viewF5 != null) {
                    CouponCardBlock couponCardBlock = (CouponCardBlock) viewF5;
                    return new rcu0(couponCardBlock, couponCardBlock);
                }
                hny.u("rootView");
                return null;
            case 11:
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                View viewF6 = rw2.f((LayoutInflater) obj, viewGroup4, R.layout.vh_coupon_item, viewGroup4, false);
                if (viewF6 != null) {
                    DsSportCouponCard dsSportCouponCard = (DsSportCouponCard) viewF6;
                    return new scu0(dsSportCouponCard, dsSportCouponCard);
                }
                hny.u("rootView");
                return null;
            case 12:
                ViewGroup viewGroup5 = (ViewGroup) obj2;
                View viewF7 = rw2.f((LayoutInflater) obj, viewGroup5, R.layout.item_change_block, viewGroup5, false);
                int i2 = R.id.cellRightRadioButton;
                DsCellRightRadioButton dsCellRightRadioButton = (DsCellRightRadioButton) yum0.f(viewF7, R.id.cellRightRadioButton);
                if (dsCellRightRadioButton != null) {
                    i2 = R.id.cellSeparator;
                    DsSeparator dsSeparator = (DsSeparator) yum0.f(viewF7, R.id.cellSeparator);
                    if (dsSeparator != null) {
                        i2 = R.id.cellTitle;
                        DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(viewF7, R.id.cellTitle);
                        if (dsCellMiddleTitle != null) {
                            return new btx((DsSettingsCell) viewF7, dsCellRightRadioButton, dsSeparator, dsCellMiddleTitle);
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF7.getResources().getResourceName(i2)));
                return null;
            case 13:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 14:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 15:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 16:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 17:
                ViewGroup viewGroup6 = (ViewGroup) obj2;
                View viewF8 = rw2.f((LayoutInflater) obj, viewGroup6, R.layout.coupon_empty_item, viewGroup6, false);
                if (((ImageView) yum0.f(viewF8, R.id.ivEmpty)) != null) {
                    return new ewe((ConstraintLayout) viewF8, b);
                }
                hny.u("Missing required view with ID: ".concat(viewF8.getResources().getResourceName(R.id.ivEmpty)));
                return null;
            case 18:
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Unit.f46060a;
            case 20:
                ViewGroup viewGroup7 = (ViewGroup) obj2;
                View viewF9 = rw2.f((LayoutInflater) obj, viewGroup7, R.layout.vh_coupon_item, viewGroup7, false);
                if (viewF9 != null) {
                    DsSportCouponCard dsSportCouponCard2 = (DsSportCouponCard) viewF9;
                    return new scu0(dsSportCouponCard2, dsSportCouponCard2);
                }
                hny.u("rootView");
                return null;
            case 21:
                ViewGroup viewGroup8 = (ViewGroup) obj2;
                View viewF10 = rw2.f((LayoutInflater) obj, viewGroup8, R.layout.item_coupon_type, viewGroup8, false);
                int i3 = R.id.cmtCoupon;
                DsCellMiddleTitle dsCellMiddleTitle2 = (DsCellMiddleTitle) yum0.f(viewF10, R.id.cmtCoupon);
                if (dsCellMiddleTitle2 != null) {
                    i3 = R.id.rbType;
                    if (((DsCellRightRadioButton) yum0.f(viewF10, R.id.rbType)) != null) {
                        DsSettingsCell dsSettingsCell = (DsSettingsCell) viewF10;
                        DsSeparator dsSeparator2 = (DsSeparator) yum0.f(viewF10, R.id.separator);
                        if (dsSeparator2 != null) {
                            return new utx(dsSettingsCell, dsSettingsCell, dsCellMiddleTitle2, dsSeparator2);
                        }
                        i3 = R.id.separator;
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF10.getResources().getResourceName(i3)));
                return null;
            case 22:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 23:
                ViewGroup viewGroup9 = (ViewGroup) obj2;
                View viewF11 = rw2.f((LayoutInflater) obj, viewGroup9, R.layout.cybergame_cs2_game_log_bomb_item, viewGroup9, false);
                int i4 = R.id.bombImage;
                ImageView imageView = (ImageView) yum0.f(viewF11, R.id.bombImage);
                if (imageView != null) {
                    i4 = R.id.bombText;
                    TextView textView4 = (TextView) yum0.f(viewF11, R.id.bombText);
                    if (textView4 != null) {
                        i4 = R.id.playerName;
                        TextView textView5 = (TextView) yum0.f(viewF11, R.id.playerName);
                        if (textView5 != null) {
                            return new tsh((LinearLayoutCompat) viewF11, imageView, textView4, textView5);
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF11.getResources().getResourceName(i4)));
                return null;
            case 24:
                ViewGroup viewGroup10 = (ViewGroup) obj2;
                View viewF12 = rw2.f((LayoutInflater) obj, viewGroup10, R.layout.cybergame_cs2_game_log_kill_item, viewGroup10, false);
                int i5 = R.id.headshot;
                ImageView imageView2 = (ImageView) yum0.f(viewF12, R.id.headshot);
                if (imageView2 != null) {
                    i5 = R.id.imgFlesher;
                    ImageView imageView3 = (ImageView) yum0.f(viewF12, R.id.imgFlesher);
                    if (imageView3 != null) {
                        i5 = R.id.killerBlind;
                        ImageView imageView4 = (ImageView) yum0.f(viewF12, R.id.killerBlind);
                        if (imageView4 != null) {
                            i5 = R.id.killerName;
                            TextView textView6 = (TextView) yum0.f(viewF12, R.id.killerName);
                            if (textView6 != null) {
                                i5 = R.id.noScope;
                                ImageView imageView5 = (ImageView) yum0.f(viewF12, R.id.noScope);
                                if (imageView5 != null) {
                                    i5 = R.id.penetrated;
                                    ImageView imageView6 = (ImageView) yum0.f(viewF12, R.id.penetrated);
                                    if (imageView6 != null) {
                                        i5 = R.id.smoke;
                                        ImageView imageView7 = (ImageView) yum0.f(viewF12, R.id.smoke);
                                        if (imageView7 != null) {
                                            i5 = R.id.tvHelpKillerName;
                                            TextView textView7 = (TextView) yum0.f(viewF12, R.id.tvHelpKillerName);
                                            if (textView7 != null) {
                                                i5 = R.id.victimName;
                                                TextView textView8 = (TextView) yum0.f(viewF12, R.id.victimName);
                                                if (textView8 != null) {
                                                    i5 = R.id.weaponImage;
                                                    ImageView imageView8 = (ImageView) yum0.f(viewF12, R.id.weaponImage);
                                                    if (imageView8 != null) {
                                                        return new vsh((LinearLayoutCompat) viewF12, imageView2, imageView3, imageView4, textView6, imageView5, imageView6, imageView7, textView7, textView8, imageView8);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF12.getResources().getResourceName(i5)));
                return null;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ViewGroup viewGroup11 = (ViewGroup) obj2;
                View viewF13 = rw2.f((LayoutInflater) obj, viewGroup11, R.layout.cybergame_cs2_log_finished_round_item, viewGroup11, false);
                int i6 = R.id.tvGameLog;
                TextView textView9 = (TextView) yum0.f(viewF13, R.id.tvGameLog);
                if (textView9 != null) {
                    i6 = R.id.tvWinner;
                    TextView textView10 = (TextView) yum0.f(viewF13, R.id.tvWinner);
                    if (textView10 != null) {
                        return new ysh((ConstraintLayout) viewF13, textView9, textView10);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF13.getResources().getResourceName(i6)));
                return null;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ViewGroup viewGroup12 = (ViewGroup) obj2;
                View viewF14 = rw2.f((LayoutInflater) obj, viewGroup12, R.layout.cybergame_cs2_game_log_text_item, viewGroup12, false);
                if (viewF14 != null) {
                    TextView textView11 = (TextView) viewF14;
                    return new wsh(textView11, textView11);
                }
                hny.u("rootView");
                return null;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(new vlf((byte) 2));
                function2.invoke(new x5f((byte) 28));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                wmf wmfVar = (wmf) obj2;
                ((oyg0) obj).getClass();
                wmfVar.getClass();
                qmf qmfVar = wmfVar.u;
                return wmf.a(wmfVar, null, null, false, null, null, null, false, false, null, false, null, null, qmf.a(qmfVar, 0L, 0L, !qmfVar.c, null, 0L, 27), null, null, 15728639);
            default:
                Function1 function3 = (Function1) obj;
                Function1 function4 = (Function1) obj2;
                function3.getClass();
                function4.getClass();
                function3.invoke(new vlf((byte) 3));
                function4.invoke(new x5f((byte) 29));
                return Unit.f46060a;
        }
    }
}
