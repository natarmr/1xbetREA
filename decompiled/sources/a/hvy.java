package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.referral.impl.presentation.takepart.view.LevelInfoView;
import org.xplatform.ui_core.viewcomponents.views.large_banner_games_collection.LargeBannerGamesSingleItem;
import org.xplatform.uikit.components.header.DsHeader;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hvy implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13745a;

    public /* synthetic */ hvy(byte b) {
        this.f13745a = b;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x011e A[PHI: r11
  0x011e: PHI (r11v44 int) = (r11v43 int), (r11v45 int), (r11v46 int) binds: [B:32:0x00f1, B:34:0x00fd, B:36:0x0109] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        r9h0 r9h0Var;
        byte b = this.f13745a;
        int i = R.id.tvTitle;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ufx.b(x8x.L(7), (fet) obj);
                return Unit.f46060a;
            case 1:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.popular_classic_item_large_banner_games_single, viewGroup, false);
                int i2 = R.id.bannerGamesSingleItem;
                LargeBannerGamesSingleItem largeBannerGamesSingleItem = (LargeBannerGamesSingleItem) yum0.f(viewF, R.id.bannerGamesSingleItem);
                if (largeBannerGamesSingleItem != null) {
                    i2 = R.id.header;
                    DsHeader dsHeader = (DsHeader) yum0.f(viewF, R.id.header);
                    if (dsHeader != null) {
                        return new s7b0((LinearLayout) viewF, largeBannerGamesSingleItem, dsHeader);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i2)));
                return null;
            case 2:
                fet fetVar = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar.e0(1790826);
                xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                fetVar.r(false);
                return xczVarA;
            case 3:
                fet fetVar2 = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar2.e0(-1792764854);
                xcz xczVarA2 = ddz.a(0, 0, fetVar2, 0, 3);
                fetVar2.r(false);
                return xczVarA2;
            case 4:
                fet fetVar3 = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar3.e0(72227082);
                xcz xczVarA3 = ddz.a(0, 0, fetVar3, 0, 3);
                fetVar3.r(false);
                return xczVarA3;
            case 5:
                ((Long) obj).getClass();
                ((Boolean) obj2).getClass();
                return Unit.f46060a;
            case 6:
                ((Long) obj).getClass();
                ((Boolean) obj2).getClass();
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                ntr.Q(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 8:
                int iIntValue = ((Integer) obj).intValue();
                xyy xyyVar = (xyy) obj2;
                xyyVar.getClass();
                return xyyVar.b + BundleUtil.UNDERLINE_TAG + iIntValue;
            case 9:
                ((Integer) obj2).intValue();
                return new pgv(q8x.e(1));
            case 10:
                d9z d9zVar = (d9z) obj2;
                return q3d.j(Integer.valueOf(d9zVar.h()), Integer.valueOf(d9zVar.i()));
            case 11:
                xcz xczVar = (xcz) obj2;
                return q3d.j(Integer.valueOf(xczVar.h()), Integer.valueOf(xczVar.i()));
            case 12:
                xcz xczVar2 = (xcz) obj2;
                return q3d.j(Integer.valueOf(xczVar2.h()), Integer.valueOf(xczVar2.i()));
            case 13:
                xcz xczVar3 = (xcz) obj2;
                return q3d.j(Integer.valueOf(xczVar3.h()), Integer.valueOf(xczVar3.i()));
            case 14:
                Map mapE = ((ldz) obj2).e();
                if (mapE.isEmpty()) {
                    return null;
                }
                return mapE;
            case 15:
                ((Integer) obj).intValue();
                return new rah0(((Integer) obj2).intValue());
            case 16:
                return new xcz(((Integer) obj).intValue(), ((Integer) obj2).intValue());
            case 17:
                pdz pdzVar = (pdz) obj2;
                ((azg0) obj).getClass();
                pdzVar.getClass();
                LinkedHashMap linkedHashMap = pdzVar.f26826a;
                ArrayList<kzg0> arrayList = new ArrayList();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Object key = entry.getKey();
                    ndz ndzVar = (ndz) entry.getValue();
                    bch0 bch0Var = ndzVar.b;
                    r9h0 r9h0Var2 = ndzVar.f23357a;
                    if (bch0Var != null) {
                        if (bch0Var instanceof xcz) {
                            xcz xczVar4 = (xcz) bch0Var;
                            r9h0Var = new r9h0(xczVar4.h(), xczVar4.i());
                        } else if (bch0Var instanceof rah0) {
                            r9h0Var = new r9h0(0, ((rah0) bch0Var).f30133a.l());
                        } else if (bch0Var instanceof d9z) {
                            d9z d9zVar2 = (d9z) bch0Var;
                            r9h0Var = new r9h0(d9zVar2.h(), d9zVar2.i());
                        } else if (bch0Var instanceof mez) {
                            mez mezVar = (mez) bch0Var;
                            r9h0Var = new r9h0(mezVar.g(), mezVar.h());
                        } else {
                            r9h0Var = new r9h0(0, 0);
                        }
                        if (!r9h0Var.equals(new r9h0(0, 0)) || ndzVar.c) {
                            r9h0Var2 = r9h0Var;
                        }
                    }
                    kzg0 kzg0Var = r9h0Var2.equals(new r9h0(0, 0)) ? null : new kzg0(r9h0Var2.f30082a, r9h0Var2.b, key);
                    if (kzg0Var != null) {
                        arrayList.add(kzg0Var);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (kzg0 kzg0Var2 : arrayList) {
                    w3d.u(arrayList2, q3d.j(kzg0Var2.f19152a, Integer.valueOf(kzg0Var2.b), Integer.valueOf(kzg0Var2.c)));
                }
                return arrayList2;
            case 18:
                hhk hhkVar = ((mez) obj2).c;
                return q3d.j((int[]) hhkVar.c, (int[]) hhkVar.e);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.layout_level_info_item, viewGroup2, false);
                LevelInfoView levelInfoView = (LevelInfoView) yum0.f(viewF2, R.id.level);
                if (levelInfoView != null) {
                    return new r6z((FrameLayout) viewF2, levelInfoView);
                }
                hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(R.id.level)));
                return null;
            case 20:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.item_limit_row, viewGroup3, false);
                int i3 = R.id.limitChangeInfo;
                TextView textView = (TextView) yum0.f(viewF3, R.id.limitChangeInfo);
                if (textView != null) {
                    i3 = R.id.tvActual;
                    TextView textView2 = (TextView) yum0.f(viewF3, R.id.tvActual);
                    if (textView2 != null) {
                        i3 = R.id.tvPrevious;
                        TextView textView3 = (TextView) yum0.f(viewF3, R.id.tvPrevious);
                        if (textView3 != null) {
                            TextView textView4 = (TextView) yum0.f(viewF3, R.id.tvTitle);
                            if (textView4 != null) {
                                return new wvx((LinearLayout) viewF3, textView, textView2, textView3, textView4);
                            }
                        } else {
                            i = i3;
                        }
                    } else {
                        i = i3;
                    }
                } else {
                    i = i3;
                }
                hny.u("Missing required view with ID: ".concat(viewF3.getResources().getResourceName(i)));
                return null;
            case 21:
                ((Integer) obj2).getClass();
                wha0.w(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                nia0.L(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                xia0.H(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 24:
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                View viewF4 = rw2.f((LayoutInflater) obj, viewGroup4, R.layout.item_limit_title_description, viewGroup4, false);
                TextView textView5 = (TextView) yum0.f(viewF4, R.id.tvDescription);
                if (textView5 != null) {
                    TextView textView6 = (TextView) yum0.f(viewF4, R.id.tvTitle);
                    if (textView6 != null) {
                        return new yvx((LinearLayout) viewF4, textView5, textView6);
                    }
                } else {
                    i = R.id.tvDescription;
                }
                hny.u("Missing required view with ID: ".concat(viewF4.getResources().getResourceName(i)));
                return null;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ViewGroup viewGroup5 = (ViewGroup) obj2;
                View viewF5 = rw2.f((LayoutInflater) obj, viewGroup5, R.layout.item_limit_title, viewGroup5, false);
                if (viewF5 != null) {
                    return new xvx((TextView) viewF5);
                }
                hny.u("rootView");
                return null;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup6 = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup6.getClass();
                return cxx.a(layoutInflater.inflate(R.layout.item_responsible_gambling_limit, viewGroup6, false));
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                oja0.E(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                ffb0.x(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                ro4.J(x8x.L(1), (fet) obj);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ hvy(int i, byte b) {
        this.f13745a = b;
    }
}
