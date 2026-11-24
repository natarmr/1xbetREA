package a;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.StreamKey;
import com.google.android.gms.identitycredentials.SignalCredentialStateResponse;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.xplatform.aggregator.impl.category.presentation.models.SortingOptionUiModel;
import org.xplatform.bet_constructor.impl.makebet.domain.model.StepInputConfigModel;
import org.xplatform.betting.core.zip.model.zip.game.GameStatistic;
import org.xplatform.betting.core.zip.model.zip.game.StatInfo;
import org.xplatform.cyber.game.core.betting.presentation.sub_games_filter.SubGamesFilterBottomSheetParams;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlockModel;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlocksParams;
import org.xplatform.feature.fin_bet.impl.makebet.presentation.make_bet.ui_model.StepInputUiModel;
import org.xplatform.feed.linelive.presentation.feeds.child.sports.models.SportItemsSelectionState;
import org.xplatform.feed.navigation.SportFilterScreenParams;
import org.xplatform.feed.notifictation.presentation.models.SubscriptionEventSettingsUiModel;
import org.xplatform.feed.notifictation.presentation.models.SubscriptionEventUiModel;
import org.xplatform.make_bet.impl.presentation.model.AutoMaxUiModel;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.SocialStateModel;
import org.xplatform.search.api.models.GlobalSearchContainerSettings;
import org.xplatform.search.impl.presentation.sport.models.SportSearchFragmentSettings;
import org.xplatform.security.api.presentation.models.ConfirmSendEmailScreenParams;
import org.xplatform.security.impl.navigation.SendConfirmationSMSScreen;
import org.xplatform.security.impl.presentation.email.confirmation.screen.SendConfirmationEmailScreen;
import org.xplatform.special_event.impl.filter.navigation.SportGameFilterSelectionScreenParams;
import org.xplatform.special_event.impl.main.presentation.model.SpecialEventTabs;
import org.xplatform.special_event.impl.special_event_tab.presentation.model.SpecialEventTab;
import org.xplatform.special_event.impl.special_event_tab.presentation.model.SpecialEventTabScreenParams;
import org.xplatform.sportgame.advanced.api.SportGameAdvancedScreenParams;
import org.xplatform.sportgame.classic.api.navigation.SportGameClassicScreenParams;
import org.xplatform.sportgame.dashboard.api.SportGameDashboardScreenParams;
import org.xplatform.sportgame.lite.api.SportGameLiteScreenParams;
import org.xplatform.sportgame.subgames.api.SubGamesParams;
import org.xplatform.ui_core.game_broadcating.models.GameBroadcastType;
import org.xplatform.uikit.compose.components.calendar.model.SimpleDateTime;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;
import org.xplatform.uikit.compose.components.picker.model.TimeOfDay23;

/* JADX INFO: loaded from: classes5.dex */
public final class lbi0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19756a;

    public /* synthetic */ lbi0(byte b) {
        this.f19756a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f19756a) {
            case 0:
                parcel.getClass();
                return new SendConfirmationEmailScreen((ConfirmSendEmailScreenParams) parcel.readParcelable(SendConfirmationEmailScreen.class.getClassLoader()));
            case 1:
                parcel.getClass();
                return new SendConfirmationSMSScreen((dci0) parcel.readSerializable());
            case 2:
                int iI0 = b5x.i0(parcel);
                while (parcel.dataPosition() < iI0) {
                    b5x.b0(parcel, parcel.readInt());
                }
                b5x.H(parcel, iI0);
                return new SignalCredentialStateResponse();
            case 3:
                parcel.getClass();
                return new SimpleDate(parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 4:
                parcel.getClass();
                return new SimpleDateTime(SimpleDate.CREATOR.createFromParcel(parcel), TimeOfDay23.CREATOR.createFromParcel(parcel));
            case 5:
                parcel.getClass();
                return new SocialStateModel(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 6:
                parcel.getClass();
                return new org.xplatform.registration_default.impl.presentation.udf.state.models.fields.SocialStateModel(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 7:
                parcel.getClass();
                return new org.xplatform.registration.simple.impl.presentation.state.models.fields.SocialStateModel(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 8:
                parcel.getClass();
                return new SortingOptionUiModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 9:
                parcel.getClass();
                int i = parcel.readInt();
                String string = parcel.readString();
                SpecialEventTab specialEventTab = (SpecialEventTab) parcel.readParcelable(SpecialEventTabScreenParams.class.getClassLoader());
                boolean z = parcel.readInt() != 0;
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                }
                return new SpecialEventTabScreenParams(i, string, specialEventTab, z, arrayList);
            case 10:
                parcel.getClass();
                return SpecialEventTabs.valueOf(parcel.readString());
            case 11:
                parcel.getClass();
                return new SportFilterScreenParams((ms2) parcel.readSerializable());
            case 12:
                parcel.getClass();
                return new SportGameAdvancedScreenParams(parcel.readLong(), parcel.readInt() != 0, parcel.readLong(), (GameBroadcastType) parcel.readParcelable(SportGameAdvancedScreenParams.class.getClassLoader()), parcel.readLong(), parcel.readLong());
            case 13:
                parcel.getClass();
                return new SportGameClassicScreenParams(parcel.readLong(), parcel.readInt() != 0, parcel.readLong(), parcel.readLong(), parcel.readLong(), (GameBroadcastType) parcel.readParcelable(SportGameClassicScreenParams.class.getClassLoader()), parcel.readInt() != 0);
            case 14:
                parcel.getClass();
                return new SportGameDashboardScreenParams(parcel.readLong(), parcel.readInt() != 0, parcel.readLong(), (GameBroadcastType) parcel.readParcelable(SportGameDashboardScreenParams.class.getClassLoader()), parcel.readLong());
            case 15:
                parcel.getClass();
                return new SportGameFilterSelectionScreenParams(parcel.readInt(), parcel.readString(), (ms2) parcel.readSerializable());
            case 16:
                parcel.getClass();
                return new SportGameLiteScreenParams(parcel.readLong(), parcel.readInt() != 0, parcel.readLong(), (GameBroadcastType) parcel.readParcelable(SportGameLiteScreenParams.class.getClassLoader()), parcel.readLong());
            case 17:
                parcel.getClass();
                boolean z2 = parcel.readInt() != 0;
                int i4 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    linkedHashSet.add(Long.valueOf(parcel.readLong()));
                }
                return new SportItemsSelectionState(linkedHashSet, z2);
            case 18:
                parcel.getClass();
                return new SportSearchFragmentSettings(parcel.readString(), (GlobalSearchContainerSettings) parcel.readParcelable(SportSearchFragmentSettings.class.getClassLoader()));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                parcel.getClass();
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                int i6 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    arrayList2.add(GameStatistic.CREATOR.createFromParcel(parcel));
                }
                return new StatInfo(numValueOf, arrayList2);
            case 20:
                parcel.getClass();
                return new StatisticBlockModel(t9m0.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt() != 0);
            case 21:
                parcel.getClass();
                sip sipVarValueOf = sip.valueOf(parcel.readString());
                dam0 dam0VarValueOf = dam0.valueOf(parcel.readString());
                long j = parcel.readLong();
                long j2 = parcel.readLong();
                String string2 = parcel.readString();
                int i8 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i8);
                for (int i9 = 0; i9 != i8; i9++) {
                    arrayList3.add(Integer.valueOf(parcel.readInt()));
                }
                int i10 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList4.add(Integer.valueOf(parcel.readInt()));
                }
                return new StatisticBlocksParams(sipVarValueOf, dam0VarValueOf, j, j2, string2, arrayList3, arrayList4);
            case 22:
                parcel.getClass();
                return new StepInputConfigModel(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readLong(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 23:
                parcel.getClass();
                return new StepInputUiModel(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 24:
                parcel.getClass();
                return new org.xplatform.make_bet.impl.presentation.model.StepInputUiModel(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, AutoMaxUiModel.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                parcel.getClass();
                double d = parcel.readDouble();
                double d2 = parcel.readDouble();
                double d3 = parcel.readDouble();
                double d4 = parcel.readDouble();
                boolean z3 = true;
                double d5 = parcel.readDouble();
                boolean z4 = false;
                String string3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    z3 = false;
                }
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                org.xplatform.coupon.impl.make_bet.presentation.model.AutoMaxUiModel autoMaxUiModelCreateFromParcel = org.xplatform.coupon.impl.make_bet.presentation.model.AutoMaxUiModel.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                return new org.xplatform.coupon.impl.make_bet.presentation.model.StepInputUiModel(d, d2, d3, d4, d5, string3, z3, z4, autoMaxUiModelCreateFromParcel, z4, z4, z4, z4, z4, z4, z4, z4, parcel.readInt() != 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new StreamKey(parcel);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                parcel.getClass();
                return new SubGamesFilterBottomSheetParams(parcel.readLong(), parcel.readString());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                parcel.getClass();
                return new SubGamesParams(parcel.readLong(), parcel.readLong(), parcel.readLong(), (ms2) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0);
            default:
                parcel.getClass();
                return new SubscriptionEventSettingsUiModel(SubscriptionEventUiModel.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f19756a) {
            case 0:
                return new SendConfirmationEmailScreen[i];
            case 1:
                return new SendConfirmationSMSScreen[i];
            case 2:
                return new SignalCredentialStateResponse[i];
            case 3:
                return new SimpleDate[i];
            case 4:
                return new SimpleDateTime[i];
            case 5:
                return new SocialStateModel[i];
            case 6:
                return new org.xplatform.registration_default.impl.presentation.udf.state.models.fields.SocialStateModel[i];
            case 7:
                return new org.xplatform.registration.simple.impl.presentation.state.models.fields.SocialStateModel[i];
            case 8:
                return new SortingOptionUiModel[i];
            case 9:
                return new SpecialEventTabScreenParams[i];
            case 10:
                return new SpecialEventTabs[i];
            case 11:
                return new SportFilterScreenParams[i];
            case 12:
                return new SportGameAdvancedScreenParams[i];
            case 13:
                return new SportGameClassicScreenParams[i];
            case 14:
                return new SportGameDashboardScreenParams[i];
            case 15:
                return new SportGameFilterSelectionScreenParams[i];
            case 16:
                return new SportGameLiteScreenParams[i];
            case 17:
                return new SportItemsSelectionState[i];
            case 18:
                return new SportSearchFragmentSettings[i];
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new StatInfo[i];
            case 20:
                return new StatisticBlockModel[i];
            case 21:
                return new StatisticBlocksParams[i];
            case 22:
                return new StepInputConfigModel[i];
            case 23:
                return new StepInputUiModel[i];
            case 24:
                return new org.xplatform.make_bet.impl.presentation.model.StepInputUiModel[i];
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new org.xplatform.coupon.impl.make_bet.presentation.model.StepInputUiModel[i];
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new StreamKey[i];
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new SubGamesFilterBottomSheetParams[i];
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new SubGamesParams[i];
            default:
                return new SubscriptionEventSettingsUiModel[i];
        }
    }
}
