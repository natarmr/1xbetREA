package a;

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
import org.xbet.client1.R;
import org.xplatform.cyber.calendar.impl.presentation.content.daysofweekview.CyberCalendarWeekView;
import org.xplatform.cyber.game.universal.impl.presentation.cardfootball.views.CardFootballAttackCardView;
import org.xplatform.cyber.game.universal.impl.presentation.cardfootball.views.CardFootballFieldView;
import org.xplatform.cyber.game.universal.impl.presentation.russianlotto.view.RussianLottoBiletNumbersView;
import org.xplatform.cyber.game.universal.impl.presentation.russianlotto.view.RussianLottoCounterfoilView;
import org.xplatform.promo.impl.promocodes.presentation.components.PromoBanner;
import org.xplatform.ui_core.viewcomponents.motion.AppBarMotionLayout;
import org.xplatform.ui_core.viewcomponents.views.BetInputView;
import org.xplatform.ui_core.viewcomponents.views.MakeBetBalanceViewDs;
import org.xplatform.uikit.components.account_info.DsAccountInfo;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.cells.right.DsCellRightDragAndDropAndButton;
import org.xplatform.uikit.components.cells.right.DsCellRightIconAndButton;
import org.xplatform.uikit.components.cells.right.DsCellRightLabel;
import org.xplatform.uikit.components.header.Header;
import org.xplatform.uikit.components.team_logo.DsTeamLogo;
import org.xplatform.uikit.components.upload_documents.DsDocumentStatus;
import org.xplatform.uikit_sport.eventcard.info.EventCardInfoFavorites;
import org.xplatform.uikit_sport.eventcard.info.EventCardInfoLive;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleSingleTeam;

/* JADX INFO: loaded from: classes6.dex */
public final class vd7 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37217a;
    public final ViewGroup b;
    public final View c;
    public final View d;

    public vd7(MakeBetBalanceViewDs makeBetBalanceViewDs, DsAccountInfo dsAccountInfo, DsButton dsButton) {
        this.f37217a = (byte) 19;
        this.b = makeBetBalanceViewDs;
        this.d = dsAccountInfo;
        this.c = dsButton;
    }

    public static vd7 a(View view) {
        int i = R.id.russianLottoBiletCounterfoil;
        RussianLottoCounterfoilView russianLottoCounterfoilView = (RussianLottoCounterfoilView) yum0.f(view, R.id.russianLottoBiletCounterfoil);
        if (russianLottoCounterfoilView != null) {
            i = R.id.russianLottoBiletNumbers;
            RussianLottoBiletNumbersView russianLottoBiletNumbersView = (RussianLottoBiletNumbersView) yum0.f(view, R.id.russianLottoBiletNumbers);
            if (russianLottoBiletNumbersView != null) {
                return new vd7((LinearLayout) view, russianLottoCounterfoilView, russianLottoBiletNumbersView, (byte) 24);
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static vd7 b(View view) {
        int i = R.id.ivTeamIcon;
        DsTeamLogo dsTeamLogo = (DsTeamLogo) yum0.f(view, R.id.ivTeamIcon);
        if (dsTeamLogo != null) {
            i = R.id.tvTeamTitle;
            TextView textView = (TextView) yum0.f(view, R.id.tvTeamTitle);
            if (textView != null) {
                return new vd7((LinearLayout) view, dsTeamLogo, textView, (byte) 25);
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        byte b = this.f37217a;
        ViewGroup viewGroup = this.b;
        switch (b) {
            case 0:
                return (BetInputView) viewGroup;
            case 1:
                return (o3b) viewGroup;
            case 2:
                return (FrameLayout) viewGroup;
            case 3:
                return (DsCellRightDragAndDropAndButton) viewGroup;
            case 4:
                return (DsCellRightIconAndButton) viewGroup;
            case 5:
                return (DsCellRightLabel) viewGroup;
            case 6:
                return (ConstraintLayout) viewGroup;
            case 7:
                return (CyberCalendarWeekView) viewGroup;
            case 8:
                return (j7l) viewGroup;
            case 9:
                return (DsDocumentStatus) viewGroup;
            case 10:
                return (zao) viewGroup;
            case 11:
                return (EventCardInfoFavorites) viewGroup;
            case 12:
                return (EventCardInfoLive) viewGroup;
            case 13:
                return (EventCardMiddleSingleTeam) viewGroup;
            case 14:
                return (ConstraintLayout) viewGroup;
            case 15:
                return (Header) viewGroup;
            case 16:
                return (LinearLayoutCompat) viewGroup;
            case 17:
                return (ConstraintLayout) viewGroup;
            case 18:
                return (AppBarMotionLayout) viewGroup;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (MakeBetBalanceViewDs) viewGroup;
            case 20:
                return (LinearLayout) viewGroup;
            case 21:
                return (PromoBanner) viewGroup;
            case 22:
                return (CardFootballAttackCardView) viewGroup;
            case 23:
                return (CardFootballFieldView) viewGroup;
            case 24:
                return (LinearLayout) viewGroup;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return (LinearLayout) viewGroup;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return (ConstraintLayout) viewGroup;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return (ConstraintLayout) viewGroup;
            default:
                return (org.xplatform.ui_core.viewcomponents.smart_background.e) viewGroup;
        }
    }

    public /* synthetic */ vd7(FrameLayout frameLayout, View view, View view2, View view3, byte b) {
        this.f37217a = b;
        this.b = frameLayout;
        this.c = view2;
        this.d = view3;
    }

    public /* synthetic */ vd7(ViewGroup viewGroup, View view, View view2, byte b) {
        this.f37217a = b;
        this.b = viewGroup;
        this.c = view;
        this.d = view2;
    }

    public vd7(CardFootballFieldView cardFootballFieldView, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8) {
        this.f37217a = (byte) 23;
        this.b = cardFootballFieldView;
        this.c = imageView;
        this.d = imageView2;
    }
}
