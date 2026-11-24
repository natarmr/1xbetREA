package a;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import org.xplatform.bet_history.history.presentation.dialog.bet_summary.BetsSummaryInfoUiModel;
import org.xplatform.betting.core.zip.model.zip.BetPlayerZip;
import org.xplatform.betting.core.zip.model.zip.BetZip;
import org.xplatform.betting.core.zip.model.zip.EventParams;
import org.xplatform.betting.core.zip.model.zip.PlayersDuelZip;
import org.xplatform.betting.core.zip.model.zip.bet.BetViewType;
import org.xplatform.betting.core.zip.model.zip.bet.ChildBets;
import org.xplatform.cyber.section.impl.championships.universal.domain.model.calendar_tournament.CalendarTournamentMatchStatusModel;
import org.xplatform.favorites.impl.presentation.screen.category_image_header.models.CategoryImageHeaderTab;
import org.xplatform.game_broadcasting.api.presentation.models.BroadcastingVideoLandscapeParams;
import org.xplatform.game_broadcasting.api.presentation.models.BroadcastingZoneLandscapeParams;
import org.xplatform.game_broadcasting.api.presentation.models.events.BroadcastingVideoEvent$Fullscreen;
import org.xplatform.game_broadcasting.api.presentation.models.events.BroadcastingZoneEvent$Fullscreen;
import org.xplatform.registration.api.domain.models.BonusInfoModel;
import org.xplatform.registration.bonus.api.BonusSelectionScreenParams;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.BonusStateModel;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.CitizenshipStateModel;
import org.xplatform.results.impl.presentation.alt_champs.ChampsResultsParams;
import org.xplatform.security.api.navigation.EndFlowNavigation;
import org.xplatform.security.api.presentation.models.BindEmailScreenParams;
import org.xplatform.security.impl.navigation.BindPhoneNumberScreen;
import org.xplatform.security.impl.navigation.ChangePhoneNumberScreen;
import org.xplatform.sportgame.bets_on_players.api.navigation.BetsOnPlayersScreenParams;
import org.xplatform.sportgame.bets_on_players.impl.presentation.model.ChooseSubGameParams;
import org.xplatform.sportgame.classic.impl.presentation.legacy.models.CardIdentity;
import org.xplatform.sportgame.markets.categories.api.navigation.CategoryMarketsParams;
import org.xplatform.statistic.champ_statistic.presentation.models.ChampMenuType;
import org.xplatform.statistic.champ_statistic.presentation.models.ChampSubMenuItem;
import org.xplatform.statistic.tennis.impl.summary.presentation.chose_filter.ChoseFilterScreenParams;
import org.xplatform.statistic.tennis.impl.summary.presentation.chose_filter.ChoseFilterUiModel;
import org.xplatform.ui_core.calendar.model.BorderDateTimeModel;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;
import org.xplatform.uikit.compose.components.picker.model.TimeOfDay23;
import org.xplatform.wallet.impl.presentation.dialogs.bonusaccountaction.params.BonusAccountScreenParams;

/* JADX INFO: loaded from: classes3.dex */
public final class qo7 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29059a;

    public /* synthetic */ qo7(byte b) {
        this.f29059a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f29059a) {
            case 0:
                parcel.getClass();
                return BetViewType.valueOf(parcel.readString());
            case 1:
                boolean z = false;
                parcel.getClass();
                long j = parcel.readLong();
                double d = parcel.readDouble();
                long j2 = parcel.readLong();
                double d2 = parcel.readDouble();
                String string = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new BetZip(j, d, j2, d2, string, z, parcel.readString(), parcel.readString(), BetPlayerZip.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readLong(), uoy.valueOf(parcel.readString()), parcel.readLong(), parcel.readInt(), parcel.readLong(), parcel.readInt() != 0, parcel.readLong(), parcel.readInt() != 0, PlayersDuelZip.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), izc.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, EventParams.CREATOR.createFromParcel(parcel));
            case 2:
                parcel.getClass();
                return new BetsOnPlayersScreenParams(parcel.readLong(), parcel.readInt() != 0, parcel.readLong());
            case 3:
                parcel.getClass();
                return new BetsSummaryInfoUiModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 4:
                parcel.getClass();
                return new BindEmailScreenParams((EndFlowNavigation) parcel.readParcelable(BindEmailScreenParams.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt());
            case 5:
                parcel.getClass();
                return new BindPhoneNumberScreen((l38) parcel.readSerializable());
            case 6:
                parcel.getClass();
                String string2 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(BonusAccountScreenParams.class.getClassLoader()));
                }
                return new BonusAccountScreenParams(string2, arrayList);
            case 7:
                parcel.getClass();
                return new BonusInfoModel(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 8:
                parcel.getClass();
                return new BonusSelectionScreenParams(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readInt() != 0);
            case 9:
                parcel.getClass();
                return new BonusStateModel(parcel.readInt(), parcel.readString(), parcel.readString());
            case 10:
                parcel.getClass();
                return new org.xplatform.registration_default.impl.presentation.udf.state.models.fields.BonusStateModel(parcel.readInt(), parcel.readString(), parcel.readString());
            case 11:
                parcel.getClass();
                return new org.xplatform.registration.simple.impl.presentation.state.models.fields.BonusStateModel(parcel.readInt(), parcel.readString(), parcel.readString());
            case 12:
                parcel.getClass();
                return new BorderDateTimeModel((SimpleDate) parcel.readParcelable(BorderDateTimeModel.class.getClassLoader()), (TimeOfDay23) parcel.readParcelable(BorderDateTimeModel.class.getClassLoader()));
            case 13:
                parcel.getClass();
                parcel.readInt();
                return BroadcastingVideoEvent$Fullscreen.f46699a;
            case 14:
                parcel.getClass();
                return new BroadcastingVideoLandscapeParams(parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 15:
                parcel.getClass();
                parcel.readInt();
                return BroadcastingZoneEvent$Fullscreen.f46700a;
            case 16:
                parcel.getClass();
                return new BroadcastingZoneLandscapeParams(parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readLong(), parcel.readInt() != 0);
            case 17:
                parcel.getClass();
                return CalendarTournamentMatchStatusModel.valueOf(parcel.readString());
            case 18:
                parcel.getClass();
                return new CardIdentity(dja.valueOf(parcel.readString()), parcel.readInt());
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                parcel.getClass();
                return CategoryImageHeaderTab.valueOf(parcel.readString());
            case 20:
                parcel.getClass();
                return new CategoryMarketsParams(parcel.readLong(), parcel.readLong(), parcel.readLong());
            case 21:
                parcel.getClass();
                return new ChampSubMenuItem((ChampMenuType) parcel.readParcelable(ChampSubMenuItem.class.getClassLoader()), parcel.readString(), parcel.readString());
            case 22:
                parcel.getClass();
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(Long.valueOf(parcel.readLong()));
                }
                return new ChampsResultsParams(parcel.readInt(), parcel.readLong(), arrayList2, parcel.readInt() != 0);
            case 23:
                parcel.getClass();
                return new ChangePhoneNumberScreen((uqb) parcel.readSerializable());
            case 24:
                parcel.getClass();
                int i5 = parcel.readInt();
                int i6 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    arrayList3.add(BetZip.CREATOR.createFromParcel(parcel));
                }
                return new ChildBets(i5, arrayList3);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                parcel.getClass();
                return new ChooseSubGameParams(parcel.readLong(), parcel.readLong());
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                parcel.getClass();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                int i8 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i8);
                for (int i9 = 0; i9 != i8; i9++) {
                    arrayList4.add(ChoseFilterUiModel.CREATOR.createFromParcel(parcel));
                }
                return new ChoseFilterScreenParams(string3, string4, arrayList4);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                parcel.getClass();
                return new ChoseFilterUiModel(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                parcel.getClass();
                return new CitizenshipStateModel(parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
            default:
                parcel.getClass();
                return new org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CitizenshipStateModel(parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f29059a) {
            case 0:
                return new BetViewType[i];
            case 1:
                return new BetZip[i];
            case 2:
                return new BetsOnPlayersScreenParams[i];
            case 3:
                return new BetsSummaryInfoUiModel[i];
            case 4:
                return new BindEmailScreenParams[i];
            case 5:
                return new BindPhoneNumberScreen[i];
            case 6:
                return new BonusAccountScreenParams[i];
            case 7:
                return new BonusInfoModel[i];
            case 8:
                return new BonusSelectionScreenParams[i];
            case 9:
                return new BonusStateModel[i];
            case 10:
                return new org.xplatform.registration_default.impl.presentation.udf.state.models.fields.BonusStateModel[i];
            case 11:
                return new org.xplatform.registration.simple.impl.presentation.state.models.fields.BonusStateModel[i];
            case 12:
                return new BorderDateTimeModel[i];
            case 13:
                return new BroadcastingVideoEvent$Fullscreen[i];
            case 14:
                return new BroadcastingVideoLandscapeParams[i];
            case 15:
                return new BroadcastingZoneEvent$Fullscreen[i];
            case 16:
                return new BroadcastingZoneLandscapeParams[i];
            case 17:
                return new CalendarTournamentMatchStatusModel[i];
            case 18:
                return new CardIdentity[i];
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new CategoryImageHeaderTab[i];
            case 20:
                return new CategoryMarketsParams[i];
            case 21:
                return new ChampSubMenuItem[i];
            case 22:
                return new ChampsResultsParams[i];
            case 23:
                return new ChangePhoneNumberScreen[i];
            case 24:
                return new ChildBets[i];
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new ChooseSubGameParams[i];
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new ChoseFilterScreenParams[i];
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new ChoseFilterUiModel[i];
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new CitizenshipStateModel[i];
            default:
                return new org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CitizenshipStateModel[i];
        }
    }
}
