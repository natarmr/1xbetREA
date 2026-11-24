package a;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.firebase.perf.util.Timer;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import org.xplatform.bet_history.history.domain.model.bet_history.TimeTypeModel;
import org.xplatform.cyber.section.api.team_details.presentation.TeamDetailsAchievementParams;
import org.xplatform.cyber.section.api.team_details.presentation.TeamDetailsParams;
import org.xplatform.cyber.section.api.team_details.presentation.TeamDetailsResultsParams;
import org.xplatform.cyber.section.impl.team_details.presentation.main.dialog.model.TeamDetailsDisciplineDialogParams;
import org.xplatform.cyber.section.impl.team_details.presentation.main.dialog.model.TeamDetailsDisciplineLineupModel;
import org.xplatform.favorites.impl.presentation.teambet.presentation.models.TeamBetScreenParams;
import org.xplatform.feed.notifictation.presentation.models.SubscriptionEventUiModel;
import org.xplatform.feed.notifictation.presentation.models.SubscriptionPeriodUiModel;
import org.xplatform.feed.topgamesbystat.presentation.params.TopGamesByStatBottomSheetScreenParams;
import org.xplatform.mailing.api.presentation.models.TelegramBonusCodeParams;
import org.xplatform.security.api.presentation.models.TokenRestoreData;
import org.xplatform.special_event.impl.top_players.presentation.model.TopPlayersSearchModel;
import org.xplatform.statistic.tennis.impl.summary.domain.models.TennisSummaryFilterModel;
import org.xplatform.statistic.tennis.impl.summary.domain.models.TennisSurfaceType;
import org.xplatform.swipex.impl.presentation.dialogs.change_bet_sum.SwipexChangeBetValueViewModel$BetValue;
import org.xplatform.swipex.impl.presentation.dialogs.change_bet_sum.SwipexChangeBetValueViewModel$UiState;
import org.xplatform.swipex.impl.presentation.dialogs.confirmation.models.SwipeActionConfirmationParams;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Aggregator$Categories;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Aggregator$MonthProvider;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Aggregator$PromoGames;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Aggregator$Recommended;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Aggregator$Tournaments;
import org.xplatform.uikit.components.successbetalert.model.BetDoneIconStyleEnum;
import org.xplatform.uikit.components.successbetalert.model.BetDoneScreenStyleEnum;
import org.xplatform.uikit.components.successbetalert.model.SuccessBetAlertModel;
import org.xplatform.uikit.components.successbetalert.model.SuccessBetStringModel;
import org.xplatform.uikit.components.successbetalert.model.TmpBetDoneUiModel;
import org.xplatform.uikit.compose.components.picker.model.TimeOfDay23;

/* JADX INFO: loaded from: classes3.dex */
public final class l7n0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19568a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f19568a) {
            case 0:
                parcel.getClass();
                return new SubscriptionEventUiModel(parcel.readLong(), parcel.readString());
            case 1:
                parcel.getClass();
                return new SubscriptionPeriodUiModel(parcel.readLong(), parcel.readString());
            case 2:
                parcel.getClass();
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                String string4 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(SuccessBetAlertModel.class.getClassLoader()));
                }
                return new SuccessBetAlertModel(string, string2, string3, lValueOf, string4, arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 3:
                parcel.getClass();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                Long lValueOf2 = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
                String string8 = parcel.readString();
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readParcelable(org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetAlertModel.class.getClassLoader()));
                }
                return new org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetAlertModel(string5, string6, string7, lValueOf2, string8, arrayList2);
            case 4:
                parcel.getClass();
                return new SuccessBetStringModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 5:
                parcel.getClass();
                return new org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetStringModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 6:
                parcel.getClass();
                return new SwipeActionConfirmationParams(parcel.readString(), parcel.readString());
            case 7:
                parcel.getClass();
                return new SwipexChangeBetValueViewModel$BetValue(parcel.readString());
            case 8:
                parcel.getClass();
                return new SwipexChangeBetValueViewModel$UiState(parcel.readLong(), SwipexChangeBetValueViewModel$BetValue.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            case 9:
                parcel.getClass();
                return new TeamBetScreenParams(parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString());
            case 10:
                parcel.getClass();
                return new TeamDetailsAchievementParams(parcel.readLong(), parcel.readString());
            case 11:
                parcel.getClass();
                long j = parcel.readLong();
                int i5 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList3.add(TeamDetailsDisciplineLineupModel.CREATOR.createFromParcel(parcel));
                }
                return new TeamDetailsDisciplineDialogParams(j, arrayList3);
            case 12:
                parcel.getClass();
                return new TeamDetailsDisciplineLineupModel(parcel.readLong(), parcel.readString(), parcel.readString());
            case 13:
                parcel.getClass();
                return new TeamDetailsParams(parcel.readLong(), parcel.readLong(), parcel.readString());
            case 14:
                parcel.getClass();
                return new TeamDetailsResultsParams(parcel.readLong(), parcel.readLong(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 15:
                parcel.getClass();
                return new TelegramBonusCodeParams(parcel.readString(), parcel.readString());
            case 16:
                parcel.getClass();
                return new TennisSummaryFilterModel(parcel.readString(), TennisSurfaceType.CREATOR.createFromParcel(parcel));
            case 17:
                parcel.getClass();
                return TennisSurfaceType.valueOf(parcel.readString());
            case 18:
                parcel.getClass();
                return new TimeOfDay23(parcel.readInt(), parcel.readInt());
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                parcel.getClass();
                return TimeTypeModel.valueOf(parcel.readString());
            case 20:
                return new Timer(parcel.readLong(), parcel.readLong());
            case 21:
                parcel.getClass();
                return new TmpBetDoneUiModel(BetDoneScreenStyleEnum.CREATOR.createFromParcel(parcel), BetDoneIconStyleEnum.CREATOR.createFromParcel(parcel));
            case 22:
                parcel.getClass();
                return new TokenRestoreData(parcel.readString(), parcel.readString(), tzf0.valueOf(parcel.readString()));
            case 23:
                parcel.getClass();
                boolean z = parcel.readInt() != 0;
                int i7 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    arrayList4.add(Long.valueOf(parcel.readLong()));
                }
                return new TopGamesByStatBottomSheetScreenParams(parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readString(), arrayList4, z);
            case 24:
                parcel.getClass();
                return new TopPlayersSearchModel(parcel.readString(), parcel.readInt() != 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                parcel.getClass();
                parcel.readInt();
                return TopSectionKey$Aggregator$Categories.f47122a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                parcel.getClass();
                parcel.readInt();
                return TopSectionKey$Aggregator$MonthProvider.f47123a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                parcel.getClass();
                parcel.readInt();
                return TopSectionKey$Aggregator$PromoGames.f47124a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                parcel.getClass();
                parcel.readInt();
                return TopSectionKey$Aggregator$Recommended.f47125a;
            default:
                parcel.getClass();
                parcel.readInt();
                return TopSectionKey$Aggregator$Tournaments.f47126a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f19568a) {
            case 0:
                return new SubscriptionEventUiModel[i];
            case 1:
                return new SubscriptionPeriodUiModel[i];
            case 2:
                return new SuccessBetAlertModel[i];
            case 3:
                return new org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetAlertModel[i];
            case 4:
                return new SuccessBetStringModel[i];
            case 5:
                return new org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetStringModel[i];
            case 6:
                return new SwipeActionConfirmationParams[i];
            case 7:
                return new SwipexChangeBetValueViewModel$BetValue[i];
            case 8:
                return new SwipexChangeBetValueViewModel$UiState[i];
            case 9:
                return new TeamBetScreenParams[i];
            case 10:
                return new TeamDetailsAchievementParams[i];
            case 11:
                return new TeamDetailsDisciplineDialogParams[i];
            case 12:
                return new TeamDetailsDisciplineLineupModel[i];
            case 13:
                return new TeamDetailsParams[i];
            case 14:
                return new TeamDetailsResultsParams[i];
            case 15:
                return new TelegramBonusCodeParams[i];
            case 16:
                return new TennisSummaryFilterModel[i];
            case 17:
                return new TennisSurfaceType[i];
            case 18:
                return new TimeOfDay23[i];
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new TimeTypeModel[i];
            case 20:
                return new Timer[i];
            case 21:
                return new TmpBetDoneUiModel[i];
            case 22:
                return new TokenRestoreData[i];
            case 23:
                return new TopGamesByStatBottomSheetScreenParams[i];
            case 24:
                return new TopPlayersSearchModel[i];
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new TopSectionKey$Aggregator$Categories[i];
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new TopSectionKey$Aggregator$MonthProvider[i];
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new TopSectionKey$Aggregator$PromoGames[i];
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new TopSectionKey$Aggregator$Recommended[i];
            default:
                return new TopSectionKey$Aggregator$Tournaments[i];
        }
    }
}
