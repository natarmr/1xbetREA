package a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.identitycredentials.CredentialOption;
import com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupResponse;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.xplatform.aggregator.impl.category.presentation.models.FilterCategoryUiModel;
import org.xplatform.aggregator.impl.category.presentation.models.FilterUiModel;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.bet_history.history.presentation.dialog.history_data_filter.model.HistoryDateFilterTypeModel;
import org.xplatform.bet_history.history.presentation.dialog.history_data_filter.model.HistoryDateFilterTypeUiModel;
import org.xplatform.bet_history.history.presentation.dialog.history_menu.model.HistoryMenuItemUiModel;
import org.xplatform.bethistory.domain.model.GeneralBetInfoModel;
import org.xplatform.betting.core.zip.model.zip.game.GameStatistic;
import org.xplatform.coupon.impl.generate_coupon.presentation.model.compose.GenerateCouponTypeUiModel;
import org.xplatform.feature.fin_bet.impl.domain.model.FinBetInfoModel;
import org.xplatform.feature.fin_bet.impl.presentation.model.FinInstrumentUIModel;
import org.xplatform.feed.linelive.presentation.feeds.child.champs.models.FeedGameItemsScreenParams;
import org.xplatform.feed.linelive.presentation.feeds.child.champs.models.FeedsChampsItemsScreenParams;
import org.xplatform.feed.linelive.presentation.feeds.child.champs.models.FeedsChampsItemsSelectionState;
import org.xplatform.feed.notifictation.presentation.models.GameNotificationScreenParams;
import org.xplatform.feed.notifictation.presentation.models.GameSubscriptionSettingsScreenUiModel;
import org.xplatform.feed.notifictation.presentation.models.PeriodSubscriptionSettingsScreenUiModel;
import org.xplatform.game_broadcasting.api.presentation.GameVideoPlayerColorScheme;
import org.xplatform.game_broadcasting.api.presentation.models.GameBroadcastingParams;
import org.xplatform.game_broadcasting.api.presentation.models.GameVideoUiConfig;
import org.xplatform.results.impl.presentation.alt_history.GamesHistoryResultsParams;
import org.xplatform.results.impl.presentation.alt_live_games.GamesLiveResultsParams;
import org.xplatform.sportgame.markets.settings.impl.presentation.models.FilterActionDialogUiModel;
import org.xplatform.sportgame.markets.settings.impl.presentation.models.FilterActionResultUiModel;
import org.xplatform.sportgame.navigation.api.presentation.GameScreenGeneralParams;
import org.xplatform.ufc.api.fighter.FighterParams;
import org.xplatform.ui_core.game_broadcating.models.GameBroadcastType;

/* JADX INFO: loaded from: classes5.dex */
public final class yoo implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42996a;

    public /* synthetic */ yoo(byte b) {
        this.f42996a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Bundle bundleY = null;
        ArrayList arrayListG = null;
        switch (this.f42996a) {
            case 0:
                int iI0 = b5x.i0(parcel);
                while (parcel.dataPosition() < iI0) {
                    int i = parcel.readInt();
                    if (((char) i) != 1) {
                        b5x.b0(parcel, i);
                    } else {
                        bundleY = b5x.y(parcel, i);
                    }
                }
                b5x.H(parcel, iI0);
                return new ExportCredentialsToDeviceSetupResponse(bundleY);
            case 1:
                parcel.getClass();
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
                j700 j700VarValueOf = j700.valueOf(parcel.readString());
                int i4 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    linkedHashSet.add(Integer.valueOf(parcel.readInt()));
                }
                return new FeedGameItemsScreenParams(arrayList, j700VarValueOf, linkedHashSet, parcel.readInt() != 0, parcel.readString(), parcel.readString());
            case 2:
                parcel.getClass();
                int i6 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    arrayList2.add(Long.valueOf(parcel.readLong()));
                }
                j700 j700VarValueOf2 = j700.valueOf(parcel.readString());
                int i8 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i8);
                for (int i9 = 0; i9 != i8; i9++) {
                    linkedHashSet2.add(Integer.valueOf(parcel.readInt()));
                }
                return new FeedsChampsItemsScreenParams(arrayList2, j700VarValueOf2, linkedHashSet2, parcel.readString(), parcel.readInt() != 0);
            case 3:
                parcel.getClass();
                boolean z = parcel.readInt() != 0;
                int i10 = parcel.readInt();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    linkedHashSet3.add(Long.valueOf(parcel.readLong()));
                }
                return new FeedsChampsItemsSelectionState(linkedHashSet3, z);
            case 4:
                parcel.getClass();
                return new FighterParams(parcel.readLong());
            case 5:
                parcel.getClass();
                return new FilterActionDialogUiModel(parcel.readString(), parcel.readLong(), ji.valueOf(parcel.readString()), ji.valueOf(parcel.readString()));
            case 6:
                parcel.getClass();
                return new org.xplatform.cyber.game.core.betting.presentation.settings.FilterActionDialogUiModel(parcel.readString(), parcel.readLong(), ki.valueOf(parcel.readString()), ki.valueOf(parcel.readString()));
            case 7:
                parcel.getClass();
                return new FilterActionResultUiModel(parcel.readLong(), parcel.readInt());
            case 8:
                parcel.getClass();
                return new org.xplatform.cyber.game.core.betting.presentation.filter.FilterActionResultUiModel(parcel.readLong(), parcel.readInt());
            case 9:
                parcel.getClass();
                String string = parcel.readString();
                String string2 = parcel.readString();
                w3q w3qVarValueOf = w3q.valueOf(parcel.readString());
                int i12 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList3.add(parcel.readParcelable(FilterCategoryUiModel.class.getClassLoader()));
                }
                return new FilterCategoryUiModel(string, string2, w3qVarValueOf, arrayList3);
            case 10:
                parcel.getClass();
                return new FilterUiModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 11:
                parcel.getClass();
                return new FinBetInfoModel(parcel.readInt(), parcel.readString(), parcel.readDouble(), parcel.readString(), fcq.valueOf(parcel.readString()), parcel.readDouble(), parcel.readInt(), parcel.readLong(), parcel.readDouble(), parcel.readDouble(), parcel.readInt() != 0, parcel.readInt(), parcel.readLong());
            case 12:
                parcel.getClass();
                return new FinInstrumentUIModel(parcel.readInt(), parcel.readString(), parcel.readInt(), fcq.valueOf(parcel.readString()), parcel.readInt() != 0);
            case 13:
                parcel.getClass();
                return GameBroadcastType.valueOf(parcel.readString());
            case 14:
                parcel.getClass();
                return new GameBroadcastingParams(parcel.readLong(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readLong(), parcel.readString());
            case 15:
                parcel.getClass();
                return new GameNotificationScreenParams(parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readInt() != 0);
            case 16:
                parcel.getClass();
                return new GameScreenGeneralParams(parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readInt() != 0, parcel.readLong(), parcel.readInt() != 0, (GameBroadcastType) parcel.readParcelable(GameScreenGeneralParams.class.getClassLoader()), grs.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), ors.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt() != 0, k1g.valueOf(parcel.readString()));
            case 17:
                parcel.getClass();
                return new GameStatistic(z6m0.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
            case 18:
                parcel.getClass();
                long j = parcel.readLong();
                boolean z2 = parcel.readInt() != 0;
                int i14 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    arrayList4.add(PeriodSubscriptionSettingsScreenUiModel.CREATOR.createFromParcel(parcel));
                }
                return new GameSubscriptionSettingsScreenUiModel(j, z2, arrayList4);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                parcel.getClass();
                return new GameVideoUiConfig(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (GameVideoPlayerColorScheme) parcel.readParcelable(GameVideoUiConfig.class.getClassLoader()));
            case 20:
                parcel.getClass();
                String string3 = parcel.readString();
                int i16 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i16);
                for (int i17 = 0; i17 != i16; i17++) {
                    arrayList5.add(Long.valueOf(parcel.readLong()));
                }
                return new GamesHistoryResultsParams(parcel.readInt(), string3, arrayList5, parcel.readInt() != 0);
            case 21:
                parcel.getClass();
                int i18 = parcel.readInt();
                LinkedHashSet linkedHashSet4 = new LinkedHashSet(i18);
                for (int i19 = 0; i19 != i18; i19++) {
                    linkedHashSet4.add(Long.valueOf(parcel.readLong()));
                }
                return new GamesLiveResultsParams(linkedHashSet4);
            case 22:
                parcel.getClass();
                return new GeneralBetInfoModel(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readString());
            case 23:
                parcel.getClass();
                return new GenerateCouponTypeUiModel(parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
            case 24:
                int iI1 = b5x.i0(parcel);
                Bundle bundleY2 = null;
                String strD = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < iI1) {
                    int i20 = parcel.readInt();
                    char c = (char) i20;
                    if (c == 1) {
                        arrayListG = b5x.G(parcel, i20, CredentialOption.CREATOR);
                    } else if (c == 2) {
                        bundleY2 = b5x.y(parcel, i20);
                    } else if (c == 3) {
                        strD = b5x.D(parcel, i20);
                    } else if (c != 4) {
                        b5x.b0(parcel, i20);
                    } else {
                        resultReceiver = (ResultReceiver) b5x.C(parcel, i20, ResultReceiver.CREATOR);
                    }
                }
                b5x.H(parcel, iI1);
                return new GetCredentialRequest(arrayListG, bundleY2, strD, resultReceiver);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                parcel.getClass();
                return HistoryDateFilterTypeModel.valueOf(parcel.readString());
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                parcel.getClass();
                return new HistoryDateFilterTypeUiModel(parcel.readString(), parcel.readString(), HistoryDateFilterTypeModel.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                parcel.getClass();
                return HistoryMenuItem.valueOf(parcel.readString());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                parcel.getClass();
                return new HistoryMenuItemUiModel(parcel.readString(), parcel.readInt(), HistoryMenuItem.CREATOR.createFromParcel(parcel));
            default:
                parcel.getClass();
                return HistoryTypeModel.valueOf(parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f42996a) {
            case 0:
                return new ExportCredentialsToDeviceSetupResponse[i];
            case 1:
                return new FeedGameItemsScreenParams[i];
            case 2:
                return new FeedsChampsItemsScreenParams[i];
            case 3:
                return new FeedsChampsItemsSelectionState[i];
            case 4:
                return new FighterParams[i];
            case 5:
                return new FilterActionDialogUiModel[i];
            case 6:
                return new org.xplatform.cyber.game.core.betting.presentation.settings.FilterActionDialogUiModel[i];
            case 7:
                return new FilterActionResultUiModel[i];
            case 8:
                return new org.xplatform.cyber.game.core.betting.presentation.filter.FilterActionResultUiModel[i];
            case 9:
                return new FilterCategoryUiModel[i];
            case 10:
                return new FilterUiModel[i];
            case 11:
                return new FinBetInfoModel[i];
            case 12:
                return new FinInstrumentUIModel[i];
            case 13:
                return new GameBroadcastType[i];
            case 14:
                return new GameBroadcastingParams[i];
            case 15:
                return new GameNotificationScreenParams[i];
            case 16:
                return new GameScreenGeneralParams[i];
            case 17:
                return new GameStatistic[i];
            case 18:
                return new GameSubscriptionSettingsScreenUiModel[i];
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new GameVideoUiConfig[i];
            case 20:
                return new GamesHistoryResultsParams[i];
            case 21:
                return new GamesLiveResultsParams[i];
            case 22:
                return new GeneralBetInfoModel[i];
            case 23:
                return new GenerateCouponTypeUiModel[i];
            case 24:
                return new GetCredentialRequest[i];
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new HistoryDateFilterTypeModel[i];
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new HistoryDateFilterTypeUiModel[i];
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new HistoryMenuItem[i];
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new HistoryMenuItemUiModel[i];
            default:
                return new HistoryTypeModel[i];
        }
    }
}
