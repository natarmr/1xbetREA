package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.api.ConnectionResult;
import org.xbet.client1.R;
import org.xplatform.cyber.game.universal.impl.presentation.cardfootball.views.CardFootballAttackCardView;
import org.xplatform.cyber.game.universal.impl.presentation.cardfootball.views.CardFootballPeriodView;
import org.xplatform.feature.balance_management_old.impl.presentation.view.TransactionCell;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.cells.right.DsCellRightMediumLabel;
import org.xplatform.uikit.components.header.DsHeader;

/* JADX INFO: loaded from: classes6.dex */
public final class nq8 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23948a;
    public final View b;
    public final View c;

    public nq8(CardFootballPeriodView cardFootballPeriodView, CardFootballAttackCardView cardFootballAttackCardView, CardFootballAttackCardView cardFootballAttackCardView2, CardFootballAttackCardView cardFootballAttackCardView3, CardFootballAttackCardView cardFootballAttackCardView4, CardFootballAttackCardView cardFootballAttackCardView5, CardFootballAttackCardView cardFootballAttackCardView6, TextView textView) {
        this.f23948a = (byte) 14;
        this.b = cardFootballPeriodView;
        this.c = textView;
    }

    public static nq8 a(View view) {
        int i = R.id.header;
        DsHeader dsHeader = (DsHeader) yum0.f(view, R.id.header);
        if (dsHeader != null) {
            i = R.id.shimmer1;
            if (((LinearLayout) yum0.f(view, R.id.shimmer1)) != null) {
                i = R.id.shimmer2;
                if (((LinearLayout) yum0.f(view, R.id.shimmer2)) != null) {
                    i = R.id.shimmer3;
                    if (((LinearLayout) yum0.f(view, R.id.shimmer3)) != null) {
                        i = R.id.shimmer4;
                        if (((LinearLayout) yum0.f(view, R.id.shimmer4)) != null) {
                            i = R.id.shimmer5;
                            if (((LinearLayout) yum0.f(view, R.id.shimmer5)) != null) {
                                i = R.id.shimmer6;
                                if (((LinearLayout) yum0.f(view, R.id.shimmer6)) != null) {
                                    return new nq8((ConstraintLayout) view, dsHeader, (byte) 11);
                                }
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static nq8 b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.vh_icon_column_header, viewGroup, false);
        ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.imageView);
        if (imageView != null) {
            return new nq8((FrameLayout) viewInflate, imageView, (byte) 16);
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.imageView)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        byte b = this.f23948a;
        View view = this.b;
        switch (b) {
            case 0:
                return (LinearLayout) view;
            case 1:
                return (org.xplatform.app_start.impl.presentation.view.content.loader.b) view;
            case 2:
                return (org.xplatform.app_start.impl.presentation.view.content.logo.b) view;
            case 3:
                return (org.xplatform.app_start.impl.presentation.view.content.partner.b) view;
            case 4:
                return (LinearLayout) view;
            case 5:
                return (DsCellRightMediumLabel) view;
            case 6:
                return (ConstraintLayout) view;
            case 7:
                return (DsButton) view;
            case 8:
                return (FrameLayout) view;
            case 9:
                return (FrameLayout) view;
            case 10:
                return (LinearLayout) view;
            case 11:
                return (ConstraintLayout) view;
            case 12:
                return (FrameLayout) view;
            case 13:
                return (TransactionCell) view;
            case 14:
                return (CardFootballPeriodView) view;
            case 15:
                return (RecyclerView) view;
            case 16:
                return (FrameLayout) view;
            case 17:
                return (FrameLayout) view;
            case 18:
                return (FrameLayout) view;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (ImageView) view;
            case 20:
                return (ProgressBar) view;
            default:
                return (org.xplatform.ui_core.viewcomponents.smart_background.c) view;
        }
    }

    public /* synthetic */ nq8(View view, View view2, byte b) {
        this.f23948a = b;
        this.b = view;
        this.c = view2;
    }
}
