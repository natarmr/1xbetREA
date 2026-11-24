package a;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.IntentSenderRequest;
import com.google.android.gms.identitycredentials.ImportCredentialsForDeviceSetupResponse;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import org.xplatform.aggregator.loyalty_program.api.navigation.models.LoyaltyProgramScreenParams;
import org.xplatform.authenticator.impl.util.NotificationPeriodInfo;
import org.xplatform.cyber.game.lol.api.LolPostGameStatScreenParams;
import org.xplatform.cyber.game.lol.api.LolScreenParams;
import org.xplatform.cyber.game.mlbb.api.MlbbGameScreenParams;
import org.xplatform.cyber.game.mlbb.api.MlbbPostGameStatScreenParams;
import org.xplatform.cyber.section.api.meta_heroes.presentation.MetaHeroesParams;
import org.xplatform.cyber.section.api.presentation.LeaderBoardScreenParams;
import org.xplatform.cyber.section.impl.leaderboard.presentation.dialogs.discipline_filter.model.LeaderboardDisciplineFilter;
import org.xplatform.cyber.section.impl.leaderboard.presentation.dialogs.discipline_filter.model.LeaderboardDisciplineFilterParams;
import org.xplatform.cyber.section.impl.leaderboard.presentation.dialogs.regions.LeaderboardRegionModelParams;
import org.xplatform.cyber.section.impl.leaderboard.presentation.dialogs.teams_type.model.LeaderboardTeamsTypeModelParams;
import org.xplatform.cyber.section.impl.leaderboard.presentation.dialogs.time_filter.LeaderboardTimeFilterModelParams;
import org.xplatform.cyber.section.impl.leaderboard.presentation.dialogs.time_filter.LeaderboardTimeFilterYearsModel;
import org.xplatform.cyber.section.impl.leaderboard.presentation.dialogs.type.model.LeaderboardTypeModelParams;
import org.xplatform.cyber.section.impl.meta_heroes.presentation.dialog.MetaHeroesRoleModelParams;
import org.xplatform.feed.linelive.presentation.feeds.child.liveexpress.models.LiveExpressItemsScreenParams;
import org.xplatform.feed.notifictation.data.NotificationInfoUiModel;
import org.xplatform.limits_ee.api.domain.LimitGroupEnum;
import org.xplatform.limits_kenya.api.domain.LimitKenyaGroupEnum;
import org.xplatform.limits_ne.api.domain.LimitNeGroupEnum;
import org.xplatform.market_statistic.api.presentation.MarketStatisticParams;
import org.xplatform.responsible_game.impl.domain.models.LimitTypeEnum;
import org.xplatform.sportgame.categories_subgames.api.MarketsCategoriesParams;
import org.xplatform.statistic.horse_menu.domain.model.HorseInfoModel;
import org.xplatform.ufc.api.last_fights.LastFightsParams;
import org.xplatform.uikit.components.toolbar.base.styles.NavigationBarSavedState;

/* JADX INFO: loaded from: classes5.dex */
public final class imw implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15046a;

    public /* synthetic */ imw(byte b) {
        this.f15046a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f15046a) {
            case 0:
                parcel.getClass();
                return new HorseInfoModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
            case 1:
                int iI0 = b5x.i0(parcel);
                Bundle bundleY = null;
                while (parcel.dataPosition() < iI0) {
                    int i = parcel.readInt();
                    if (((char) i) != 1) {
                        b5x.b0(parcel, i);
                    } else {
                        bundleY = b5x.y(parcel, i);
                    }
                }
                b5x.H(parcel, iI0);
                return new ImportCredentialsForDeviceSetupResponse(bundleY);
            case 2:
                parcel.getClass();
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                parcelable.getClass();
                return new IntentSenderRequest((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 3:
                parcel.getClass();
                return new LastFightsParams(parcel.readLong());
            case 4:
                parcel.getClass();
                return new LeaderBoardScreenParams(parcel.readLong(), parcel.readLong(), ggz.valueOf(parcel.readString()));
            case 5:
                parcel.getClass();
                return new LeaderboardDisciplineFilter(parcel.readLong(), parcel.readString(), parcel.readString());
            case 6:
                parcel.getClass();
                long j = parcel.readLong();
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList.add(LeaderboardDisciplineFilter.CREATOR.createFromParcel(parcel));
                }
                return new LeaderboardDisciplineFilterParams(j, arrayList);
            case 7:
                parcel.getClass();
                return new LeaderboardRegionModelParams(qgz.valueOf(parcel.readString()));
            case 8:
                parcel.getClass();
                return new LeaderboardTeamsTypeModelParams(epe.valueOf(parcel.readString()));
            case 9:
                parcel.getClass();
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    arrayList2.add(LeaderboardTimeFilterYearsModel.CREATOR.createFromParcel(parcel));
                }
                return new LeaderboardTimeFilterModelParams(arrayList2, parcel.readInt());
            case 10:
                parcel.getClass();
                return new LeaderboardTimeFilterYearsModel(parcel.readInt(), parcel.readString());
            case 11:
                parcel.getClass();
                int i6 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    arrayList3.add(xhz.valueOf(parcel.readString()));
                }
                return new LeaderboardTypeModelParams(arrayList3, xhz.valueOf(parcel.readString()));
            case 12:
                parcel.getClass();
                return LimitGroupEnum.valueOf(parcel.readString());
            case 13:
                parcel.getClass();
                return org.xplatform.limits_africa.api.domain.LimitGroupEnum.valueOf(parcel.readString());
            case 14:
                parcel.getClass();
                return LimitKenyaGroupEnum.valueOf(parcel.readString());
            case 15:
                parcel.getClass();
                return LimitNeGroupEnum.valueOf(parcel.readString());
            case 16:
                parcel.getClass();
                return LimitTypeEnum.valueOf(parcel.readString());
            case 17:
                parcel.getClass();
                return new LiveExpressItemsScreenParams(parcel.readLong(), (aj00) parcel.readSerializable(), parcel.readString(), parcel.readString());
            case 18:
                parcel.getClass();
                return new LolPostGameStatScreenParams(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readLong());
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                parcel.getClass();
                return new LolScreenParams(parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), k1g.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            case 20:
                parcel.getClass();
                return new LoyaltyProgramScreenParams(parcel.readInt() != 0);
            case 21:
                parcel.getClass();
                return new MarketStatisticParams(parcel.readInt() != 0, parcel.readLong());
            case 22:
                parcel.getClass();
                return new MarketsCategoriesParams(parcel.readLong(), parcel.readLong(), parcel.readLong(), (ms2) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0);
            case 23:
                parcel.getClass();
                return new MetaHeroesParams(parcel.readLong());
            case 24:
                parcel.getClass();
                xb40 xb40VarValueOf = xb40.valueOf(parcel.readString());
                int i8 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i8);
                for (int i9 = 0; i9 != i8; i9++) {
                    arrayList4.add(xb40.valueOf(parcel.readString()));
                }
                return new MetaHeroesRoleModelParams(xb40VarValueOf, arrayList4);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                parcel.getClass();
                return new MlbbGameScreenParams(parcel.readLong(), parcel.readInt() != 0, parcel.readLong(), parcel.readLong(), parcel.readLong(), grs.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString(), parcel.readLong(), parcel.readInt(), k1g.valueOf(parcel.readString()));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                parcel.getClass();
                return new MlbbPostGameStatScreenParams(parcel.readString(), parcel.readLong(), parcel.readInt());
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                parcel.getClass();
                NavigationBarSavedState navigationBarSavedState = new NavigationBarSavedState(parcel);
                navigationBarSavedState.f47280a = parcel.readInt() != 0;
                return navigationBarSavedState;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                parcel.getClass();
                return new NotificationInfoUiModel(j760.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, parcel.readLong(), parcel.readLong());
            default:
                parcel.getClass();
                return new NotificationPeriodInfo(q760.valueOf(parcel.readString()), parcel.readString(), parcel.readLong(), parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f15046a) {
            case 0:
                return new HorseInfoModel[i];
            case 1:
                return new ImportCredentialsForDeviceSetupResponse[i];
            case 2:
                return new IntentSenderRequest[i];
            case 3:
                return new LastFightsParams[i];
            case 4:
                return new LeaderBoardScreenParams[i];
            case 5:
                return new LeaderboardDisciplineFilter[i];
            case 6:
                return new LeaderboardDisciplineFilterParams[i];
            case 7:
                return new LeaderboardRegionModelParams[i];
            case 8:
                return new LeaderboardTeamsTypeModelParams[i];
            case 9:
                return new LeaderboardTimeFilterModelParams[i];
            case 10:
                return new LeaderboardTimeFilterYearsModel[i];
            case 11:
                return new LeaderboardTypeModelParams[i];
            case 12:
                return new LimitGroupEnum[i];
            case 13:
                return new org.xplatform.limits_africa.api.domain.LimitGroupEnum[i];
            case 14:
                return new LimitKenyaGroupEnum[i];
            case 15:
                return new LimitNeGroupEnum[i];
            case 16:
                return new LimitTypeEnum[i];
            case 17:
                return new LiveExpressItemsScreenParams[i];
            case 18:
                return new LolPostGameStatScreenParams[i];
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new LolScreenParams[i];
            case 20:
                return new LoyaltyProgramScreenParams[i];
            case 21:
                return new MarketStatisticParams[i];
            case 22:
                return new MarketsCategoriesParams[i];
            case 23:
                return new MetaHeroesParams[i];
            case 24:
                return new MetaHeroesRoleModelParams[i];
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new MlbbGameScreenParams[i];
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new MlbbPostGameStatScreenParams[i];
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                NavigationBarSavedState[] navigationBarSavedStateArr = new NavigationBarSavedState[i];
                for (int i2 = 0; i2 < i; i2++) {
                    navigationBarSavedStateArr[i2] = null;
                }
                return navigationBarSavedStateArr;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new NotificationInfoUiModel[i];
            default:
                return new NotificationPeriodInfo[i];
        }
    }
}
