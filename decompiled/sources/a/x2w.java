package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.ExpandBtnView;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;
import org.xplatform.ui_core.viewcomponents.views.FixedSelectionTextView;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.check_box.old.DsCheckBoxOld;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x2w implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40190a;

    public /* synthetic */ x2w(int i) {
        this.f40190a = (byte) 23;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f40190a) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.history_header_item, viewGroup, false);
                int i = R.id.tvBetsCount;
                TextView textView = (TextView) yum0.f(viewF, R.id.tvBetsCount);
                if (textView != null) {
                    i = R.id.tvBetsCountSum;
                    TextView textView2 = (TextView) yum0.f(viewF, R.id.tvBetsCountSum);
                    if (textView2 != null) {
                        i = R.id.tvPeriod;
                        if (((TextView) yum0.f(viewF, R.id.tvPeriod)) != null) {
                            return new s2w((MaterialCardView) viewF, textView, textView2);
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i)));
                return null;
            case 1:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.menu_item, viewGroup2, false);
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewF2;
                int i2 = R.id.itemIcon;
                ImageView imageView = (ImageView) yum0.f(viewF2, R.id.itemIcon);
                if (imageView != null) {
                    i2 = R.id.itemTitle;
                    TextView textView3 = (TextView) yum0.f(viewF2, R.id.itemTitle);
                    if (textView3 != null) {
                        return new fz30(linearLayoutCompat, imageView, textView3);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(i2)));
                return null;
            case 2:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 3:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.fallback_adapter_delegate_view, viewGroup3, false);
                if (viewF3 != null) {
                    return new mzq((ViewStub) viewF3, (byte) 2);
                }
                hny.u("rootView");
                return null;
            case 4:
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                View viewF4 = rw2.f((LayoutInflater) obj, viewGroup4, R.layout.item_history_simple, viewGroup4, false);
                DsSettingsCell dsSettingsCell = (DsSettingsCell) viewF4;
                int i3 = R.id.icon;
                DsCellLeftIcon dsCellLeftIcon = (DsCellLeftIcon) yum0.f(viewF4, R.id.icon);
                if (dsCellLeftIcon != null) {
                    i3 = R.id.title;
                    DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(viewF4, R.id.title);
                    if (dsCellMiddleTitle != null) {
                        return new mvx(dsSettingsCell, dsCellLeftIcon, dsCellMiddleTitle);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF4.getResources().getResourceName(i3)));
                return null;
            case 5:
                ViewGroup viewGroup5 = (ViewGroup) obj2;
                View viewF5 = rw2.f((LayoutInflater) obj, viewGroup5, R.layout.history_filter_layout, viewGroup5, false);
                int i4 = R.id.checkboxItem;
                DsCheckBoxOld dsCheckBoxOld = (DsCheckBoxOld) yum0.f(viewF5, R.id.checkboxItem);
                if (dsCheckBoxOld != null) {
                    i4 = R.id.checkbox_item_text;
                    TextView textView4 = (TextView) yum0.f(viewF5, R.id.checkbox_item_text);
                    if (textView4 != null) {
                        i4 = R.id.divider;
                        View viewF6 = yum0.f(viewF5, R.id.divider);
                        if (viewF6 != null) {
                            return new j1w((ConstraintLayout) viewF5, dsCheckBoxOld, textView4, viewF6);
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF5.getResources().getResourceName(i4)));
                return null;
            case 6:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 7:
                return Unit.f46060a;
            case 8:
                return Unit.f46060a;
            case 9:
                return Unit.f46060a;
            case 10:
                int iIntValue = ((Integer) obj).intValue();
                hdw hdwVar = (hdw) obj2;
                hdwVar.getClass();
                return rz4.h(iIntValue, hdwVar.f12891a);
            case 11:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 12:
                fet fetVar = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar.e0(1968112426);
                xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                fetVar.r(false);
                return xczVarA;
            case 13:
                fet fetVar2 = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar2.e0(-822128809);
                xcz xczVarA2 = ddz.a(0, 0, fetVar2, 0, 3);
                fetVar2.r(false);
                return xczVarA2;
            case 14:
                fet fetVar3 = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar3.e0(1764578410);
                xcz xczVarA3 = ddz.a(0, 0, fetVar3, 0, 3);
                fetVar3.r(false);
                return xczVarA3;
            case 15:
                fet fetVar4 = (fet) obj;
                ((Integer) obj2).getClass();
                fetVar4.e0(1133164336);
                xcz xczVarB = ddz.b(new uwq(), fetVar4);
                fetVar4.r(false);
                return xczVarB;
            case 16:
                int iIntValue2 = ((Integer) obj).intValue();
                xjw xjwVar = (xjw) obj2;
                xjwVar.getClass();
                int i5 = xjwVar.f41006a;
                StringBuilder sb = new StringBuilder();
                sb.append(i5);
                sb.append(iIntValue2);
                return sb.toString();
            case 17:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 18:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(new h7w((byte) 9));
                function2.invoke(new kdw((byte) 4));
                return Unit.f46060a;
            case 20:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 21:
                Function1 function3 = (Function1) obj;
                Function1 function4 = (Function1) obj2;
                function3.getClass();
                function4.getClass();
                function3.invoke(new h7w((byte) 7));
                function4.invoke(new kdw((byte) 3));
                return Unit.f46060a;
            case 22:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                mbc.K(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 24:
                crw crwVar = (crw) obj2;
                ((oyg0) obj).getClass();
                crwVar.getClass();
                boolean z = !crwVar.e;
                List list = crwVar.d;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(epw.a((epw) it.next(), z));
                }
                return crw.a(crwVar, false, false, false, arrayList, z, 7);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ViewGroup viewGroup6 = (ViewGroup) obj2;
                View viewF7 = rw2.f((LayoutInflater) obj, viewGroup6, R.layout.item_host_vs_guests, viewGroup6, false);
                int i6 = R.id.ivOneTeamLogo;
                RoundCornerImageView roundCornerImageView = (RoundCornerImageView) yum0.f(viewF7, R.id.ivOneTeamLogo);
                if (roundCornerImageView != null) {
                    i6 = R.id.ivTwoTeamLogo;
                    RoundCornerImageView roundCornerImageView2 = (RoundCornerImageView) yum0.f(viewF7, R.id.ivTwoTeamLogo);
                    if (roundCornerImageView2 != null) {
                        i6 = R.id.tvInfo;
                        TextView textView5 = (TextView) yum0.f(viewF7, R.id.tvInfo);
                        if (textView5 != null) {
                            i6 = R.id.tvOneTeamName;
                            TextView textView6 = (TextView) yum0.f(viewF7, R.id.tvOneTeamName);
                            if (textView6 != null) {
                                i6 = R.id.tvTwoTeamName;
                                TextView textView7 = (TextView) yum0.f(viewF7, R.id.tvTwoTeamName);
                                if (textView7 != null) {
                                    return new nvx((ConstraintLayout) viewF7, roundCornerImageView, roundCornerImageView2, textView5, textView6, textView7);
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF7.getResources().getResourceName(i6)));
                return null;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ViewGroup viewGroup7 = (ViewGroup) obj2;
                View viewF8 = rw2.f((LayoutInflater) obj, viewGroup7, R.layout.item_card_host_vs_guests, viewGroup7, false);
                int i7 = R.id.btnExpand;
                ExpandBtnView expandBtnView = (ExpandBtnView) yum0.f(viewF8, R.id.btnExpand);
                if (expandBtnView != null) {
                    i7 = R.id.containerHeader;
                    LinearLayout linearLayout = (LinearLayout) yum0.f(viewF8, R.id.containerHeader);
                    if (linearLayout != null) {
                        i7 = R.id.rvHostVsGuest;
                        RecyclerView recyclerView = (RecyclerView) yum0.f(viewF8, R.id.rvHostVsGuest);
                        if (recyclerView != null) {
                            i7 = R.id.tvGuest;
                            TextView textView8 = (TextView) yum0.f(viewF8, R.id.tvGuest);
                            if (textView8 != null) {
                                i7 = R.id.tvHost;
                                TextView textView9 = (TextView) yum0.f(viewF8, R.id.tvHost);
                                if (textView9 != null) {
                                    return new rsx((LinearLayout) viewF8, expandBtnView, linearLayout, recyclerView, textView8, textView9);
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF8.getResources().getResourceName(i7)));
                return null;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Long) obj).getClass();
                ((Boolean) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Long) obj).getClass();
                ((Boolean) obj2).getClass();
                return Unit.f46060a;
            default:
                ViewGroup viewGroup8 = (ViewGroup) obj2;
                View viewF9 = rw2.f((LayoutInflater) obj, viewGroup8, R.layout.delegate_image_receive_message, viewGroup8, false);
                int i8 = R.id.imgAvatar;
                ShapeableImageView shapeableImageView = (ShapeableImageView) yum0.f(viewF9, R.id.imgAvatar);
                if (shapeableImageView != null) {
                    i8 = R.id.imgError;
                    ImageView imageView2 = (ImageView) yum0.f(viewF9, R.id.imgError);
                    if (imageView2 != null) {
                        i8 = R.id.imgPicture;
                        ShapeableImageView shapeableImageView2 = (ShapeableImageView) yum0.f(viewF9, R.id.imgPicture);
                        if (shapeableImageView2 != null) {
                            i8 = R.id.messageContainer;
                            ConstraintLayout constraintLayout = (ConstraintLayout) yum0.f(viewF9, R.id.messageContainer);
                            if (constraintLayout != null) {
                                i8 = R.id.messageTextView;
                                FixedSelectionTextView fixedSelectionTextView = (FixedSelectionTextView) yum0.f(viewF9, R.id.messageTextView);
                                if (fixedSelectionTextView != null) {
                                    i8 = R.id.progressBar;
                                    ImageView imageView3 = (ImageView) yum0.f(viewF9, R.id.progressBar);
                                    if (imageView3 != null) {
                                        i8 = R.id.txtAuthorName;
                                        TextView textView10 = (TextView) yum0.f(viewF9, R.id.txtAuthorName);
                                        if (textView10 != null) {
                                            i8 = R.id.txtBotLabel;
                                            TextView textView11 = (TextView) yum0.f(viewF9, R.id.txtBotLabel);
                                            if (textView11 != null) {
                                                i8 = R.id.txtTime;
                                                TextView textView12 = (TextView) yum0.f(viewF9, R.id.txtTime);
                                                if (textView12 != null) {
                                                    return new b2k((LinearLayout) viewF9, shapeableImageView, imageView2, shapeableImageView2, constraintLayout, fixedSelectionTextView, imageView3, textView10, textView11, textView12);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF9.getResources().getResourceName(i8)));
                return null;
        }
    }

    public /* synthetic */ x2w(byte b) {
        this.f40190a = b;
    }
}
