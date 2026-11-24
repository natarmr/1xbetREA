package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.FixedSelectionTextView;
import org.xplatform.ui_core.viewcomponents.views.large_banner_games_collection.LargeBannerGamesCollection;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.menu.DsMenuCompactCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightBanner;
import org.xplatform.uikit.components.cells.right.DsCellRightLabel;
import org.xplatform.uikit.components.header.DsHeader;
import org.xplatform.uikit.components.separator.DsSeparator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v1x implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36654a;

    public /* synthetic */ v1x(byte b) {
        this.f36654a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f36654a;
        int i = R.id.recyclerImages;
        int i2 = R.id.imgStatus;
        int i3 = R.id.title;
        boolean z = true;
        switch (b) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.delegate_image_send_message, viewGroup, false);
                ImageView imageView = (ImageView) yum0.f(viewF, R.id.imgError);
                if (imageView != null) {
                    ShapeableImageView shapeableImageView = (ShapeableImageView) yum0.f(viewF, R.id.imgPicture);
                    if (shapeableImageView != null) {
                        AppCompatImageView appCompatImageView = (AppCompatImageView) yum0.f(viewF, R.id.imgStatus);
                        if (appCompatImageView != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) yum0.f(viewF, R.id.messageContainer);
                            if (constraintLayout != null) {
                                FixedSelectionTextView fixedSelectionTextView = (FixedSelectionTextView) yum0.f(viewF, R.id.messageTextView);
                                if (fixedSelectionTextView != null) {
                                    i2 = R.id.progressBar;
                                    ImageView imageView2 = (ImageView) yum0.f(viewF, R.id.progressBar);
                                    if (imageView2 != null) {
                                        TextView textView = (TextView) yum0.f(viewF, R.id.txtTime);
                                        if (textView != null) {
                                            return new c2k((LinearLayout) viewF, imageView, shapeableImageView, appCompatImageView, constraintLayout, fixedSelectionTextView, imageView2, textView);
                                        }
                                        i2 = R.id.txtTime;
                                    }
                                } else {
                                    i2 = R.id.messageTextView;
                                }
                            } else {
                                i2 = R.id.messageContainer;
                            }
                        }
                    } else {
                        i2 = R.id.imgPicture;
                    }
                } else {
                    i2 = R.id.imgError;
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i2)));
                return null;
            case 1:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.delegate_images_receive_message, viewGroup2, false);
                ShapeableImageView shapeableImageView2 = (ShapeableImageView) yum0.f(viewF2, R.id.imgAvatar);
                if (shapeableImageView2 != null) {
                    ImageView imageView3 = (ImageView) yum0.f(viewF2, R.id.imgError);
                    if (imageView3 != null) {
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) yum0.f(viewF2, R.id.messageContainer);
                        if (constraintLayout2 != null) {
                            FixedSelectionTextView fixedSelectionTextView2 = (FixedSelectionTextView) yum0.f(viewF2, R.id.messageTextView);
                            if (fixedSelectionTextView2 != null) {
                                RecyclerView recyclerView = (RecyclerView) yum0.f(viewF2, R.id.recyclerImages);
                                if (recyclerView != null) {
                                    i = R.id.txtAuthorName;
                                    TextView textView2 = (TextView) yum0.f(viewF2, R.id.txtAuthorName);
                                    if (textView2 != null) {
                                        i = R.id.txtBotLabel;
                                        TextView textView3 = (TextView) yum0.f(viewF2, R.id.txtBotLabel);
                                        if (textView3 != null) {
                                            TextView textView4 = (TextView) yum0.f(viewF2, R.id.txtTime);
                                            if (textView4 != null) {
                                                return new d2k((LinearLayout) viewF2, shapeableImageView2, imageView3, constraintLayout2, fixedSelectionTextView2, recyclerView, textView2, textView3, textView4);
                                            }
                                            i = R.id.txtTime;
                                        }
                                    }
                                }
                            } else {
                                i = R.id.messageTextView;
                            }
                        } else {
                            i = R.id.messageContainer;
                        }
                    } else {
                        i = R.id.imgError;
                    }
                } else {
                    i = R.id.imgAvatar;
                }
                hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(i)));
                return null;
            case 2:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.delegate_images_send_message, viewGroup3, false);
                ImageView imageView4 = (ImageView) yum0.f(viewF3, R.id.imgError);
                if (imageView4 != null) {
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) yum0.f(viewF3, R.id.imgStatus);
                    if (appCompatImageView2 != null) {
                        ConstraintLayout constraintLayout3 = (ConstraintLayout) yum0.f(viewF3, R.id.messageContainer);
                        if (constraintLayout3 != null) {
                            FixedSelectionTextView fixedSelectionTextView3 = (FixedSelectionTextView) yum0.f(viewF3, R.id.messageTextView);
                            if (fixedSelectionTextView3 != null) {
                                RecyclerView recyclerView2 = (RecyclerView) yum0.f(viewF3, R.id.recyclerImages);
                                if (recyclerView2 != null) {
                                    TextView textView5 = (TextView) yum0.f(viewF3, R.id.txtTime);
                                    if (textView5 != null) {
                                        return new e2k((LinearLayout) viewF3, imageView4, appCompatImageView2, constraintLayout3, fixedSelectionTextView3, recyclerView2, textView5);
                                    }
                                    i = R.id.txtTime;
                                }
                            } else {
                                i = R.id.messageTextView;
                            }
                        } else {
                            i = R.id.messageContainer;
                        }
                    } else {
                        i = R.id.imgStatus;
                    }
                } else {
                    i = R.id.imgError;
                }
                hny.u("Missing required view with ID: ".concat(viewF3.getResources().getResourceName(i)));
                return null;
            case 3:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup4.getClass();
                return wtx.a(layoutInflater, viewGroup4);
            case 4:
                ViewGroup viewGroup5 = (ViewGroup) obj2;
                View viewF4 = rw2.f((LayoutInflater) obj, viewGroup5, R.layout.item_end_icon_line_menu_small_icon_item, viewGroup5, false);
                DsMenuCell dsMenuCell = (DsMenuCell) viewF4;
                DsCellRightBanner dsCellRightBanner = (DsCellRightBanner) yum0.f(viewF4, R.id.decorIcon);
                if (dsCellRightBanner != null) {
                    DsCellLeftIcon dsCellLeftIcon = (DsCellLeftIcon) yum0.f(viewF4, R.id.icon);
                    if (dsCellLeftIcon != null) {
                        DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(viewF4, R.id.title);
                        if (dsCellMiddleTitle != null) {
                            return new eux(dsMenuCell, dsCellRightBanner, dsCellLeftIcon, dsCellMiddleTitle);
                        }
                    } else {
                        i3 = R.id.icon;
                    }
                } else {
                    i3 = R.id.decorIcon;
                }
                hny.u("Missing required view with ID: ".concat(viewF4.getResources().getResourceName(i3)));
                return null;
            case 5:
                LayoutInflater layoutInflater2 = (LayoutInflater) obj;
                ViewGroup viewGroup6 = (ViewGroup) obj2;
                layoutInflater2.getClass();
                viewGroup6.getClass();
                return bwx.a(layoutInflater2, viewGroup6);
            case 6:
                LayoutInflater layoutInflater3 = (LayoutInflater) obj;
                ViewGroup viewGroup7 = (ViewGroup) obj2;
                layoutInflater3.getClass();
                viewGroup7.getClass();
                return wxx.a(layoutInflater3, viewGroup7);
            case 7:
                LayoutInflater layoutInflater4 = (LayoutInflater) obj;
                ViewGroup viewGroup8 = (ViewGroup) obj2;
                layoutInflater4.getClass();
                viewGroup8.getClass();
                return bzx.a(layoutInflater4, viewGroup8);
            case 8:
                ViewGroup viewGroup9 = (ViewGroup) obj2;
                View viewF5 = rw2.f((LayoutInflater) obj, viewGroup9, R.layout.item_info_type_compact, viewGroup9, false);
                if (viewF5 != null) {
                    DsMenuCompactCell dsMenuCompactCell = (DsMenuCompactCell) viewF5;
                    return new svx(dsMenuCompactCell, dsMenuCompactCell);
                }
                hny.u("rootView");
                return null;
            case 9:
                ViewGroup viewGroup10 = (ViewGroup) obj2;
                View viewF6 = rw2.f((LayoutInflater) obj, viewGroup10, R.layout.item_info_type, viewGroup10, false);
                DsMenuCell dsMenuCell2 = (DsMenuCell) viewF6;
                DsCellLeftIcon dsCellLeftIcon2 = (DsCellLeftIcon) yum0.f(viewF6, R.id.icon);
                if (dsCellLeftIcon2 != null) {
                    DsCellMiddleTitle dsCellMiddleTitle2 = (DsCellMiddleTitle) yum0.f(viewF6, R.id.title);
                    if (dsCellMiddleTitle2 != null) {
                        return new rvx(dsMenuCell2, dsCellLeftIcon2, dsCellMiddleTitle2);
                    }
                } else {
                    i3 = R.id.icon;
                }
                hny.u("Missing required view with ID: ".concat(viewF6.getResources().getResourceName(i3)));
                return null;
            case 10:
                Integer num = (Integer) obj;
                num.getClass();
                jax jaxVar = (jax) obj2;
                jaxVar.getClass();
                return new Pair(jaxVar.getType(), num);
            case 11:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 12:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 13:
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                uc9.H(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 15:
                ((Integer) obj).getClass();
                zgx zgxVar = (zgx) obj2;
                zgxVar.getClass();
                return zgxVar.c;
            case 16:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(new h7w((byte) 27));
                function2.invoke(new qgx(z ? (byte) 1 : (byte) 0));
                return Unit.f46060a;
            case 17:
                ViewGroup viewGroup11 = (ViewGroup) obj2;
                View viewF7 = rw2.f((LayoutInflater) obj, viewGroup11, R.layout.item_instruments, viewGroup11, false);
                TextView textView6 = (TextView) yum0.f(viewF7, R.id.instrument_name_tv);
                if (textView6 != null) {
                    return new uvx((ConstraintLayout) viewF7, textView6);
                }
                hny.u("Missing required view with ID: ".concat(viewF7.getResources().getResourceName(R.id.instrument_name_tv)));
                return null;
            case 18:
                ViewGroup viewGroup12 = (ViewGroup) obj2;
                View viewF8 = rw2.f((LayoutInflater) obj, viewGroup12, R.layout.item_stadium_info, viewGroup12, false);
                if (viewF8 != null) {
                    TextView textView7 = (TextView) viewF8;
                    return new yxx(textView7, textView7);
                }
                hny.u("rootView");
                return null;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                LayoutInflater layoutInflater5 = (LayoutInflater) obj;
                ViewGroup viewGroup13 = (ViewGroup) obj2;
                layoutInflater5.getClass();
                viewGroup13.getClass();
                return vjd.a(layoutInflater5, viewGroup13);
            case 20:
                ql5 ql5Var = (ql5) obj;
                ql5 ql5Var2 = (ql5) obj2;
                ql5Var.getClass();
                ql5Var2.getClass();
                return Boolean.valueOf(ql5Var.f28916a == ql5Var2.f28916a);
            case 21:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 22:
                ql5 ql5Var3 = (ql5) obj;
                ql5 ql5Var4 = (ql5) obj2;
                ql5Var3.getClass();
                ql5Var4.getClass();
                return Boolean.valueOf(ql5Var3.f28916a == ql5Var4.f28916a);
            case 23:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 24:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                zgc.x(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ViewGroup viewGroup14 = (ViewGroup) obj2;
                View viewF9 = rw2.f((LayoutInflater) obj, viewGroup14, R.layout.item_label, viewGroup14, false);
                int i4 = R.id.cmTitle;
                DsCellMiddleTitle dsCellMiddleTitle3 = (DsCellMiddleTitle) yum0.f(viewF9, R.id.cmTitle);
                if (dsCellMiddleTitle3 != null) {
                    i4 = R.id.crLabel;
                    DsCellRightLabel dsCellRightLabel = (DsCellRightLabel) yum0.f(viewF9, R.id.crLabel);
                    if (dsCellRightLabel != null) {
                        i4 = R.id.separator;
                        if (((DsSeparator) yum0.f(viewF9, R.id.separator)) != null) {
                            return new vvx((DsSettingsCell) viewF9, dsCellMiddleTitle3, dsCellRightLabel);
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF9.getResources().getResourceName(i4)));
                return null;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((rvy) obj).getClass();
                return Unit.f46060a;
            default:
                ViewGroup viewGroup15 = (ViewGroup) obj2;
                View viewF10 = rw2.f((LayoutInflater) obj, viewGroup15, R.layout.popular_classic_item_large_banner_games_collection, viewGroup15, false);
                int i5 = R.id.bannerGamesCollection;
                LargeBannerGamesCollection largeBannerGamesCollection = (LargeBannerGamesCollection) yum0.f(viewF10, R.id.bannerGamesCollection);
                if (largeBannerGamesCollection != null) {
                    i5 = R.id.header;
                    DsHeader dsHeader = (DsHeader) yum0.f(viewF10, R.id.header);
                    if (dsHeader != null) {
                        return new r7b0((LinearLayout) viewF10, largeBannerGamesCollection, dsHeader);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF10.getResources().getResourceName(i5)));
                return null;
        }
    }

    public /* synthetic */ v1x(int i, byte b) {
        this.f36654a = b;
    }
}
