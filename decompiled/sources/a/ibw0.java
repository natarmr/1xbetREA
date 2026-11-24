package a;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.material.badge.BadgeState$State;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Locale;
import org.xplatform.aggregator.impl.category.data.models.AggregatorSortingOptionModel;
import org.xplatform.aggregator.impl.category.presentation.models.AggregatorJackpotBottomSheetParams;
import org.xplatform.aggregator.impl.category.presentation.models.AggregatorProvidersFiltersUiModel;
import org.xplatform.aggregator.impl.category.presentation.models.FilterCategoryUiModel;
import org.xplatform.aggregator.impl.category.presentation.models.PromotedCategoryUiModel;
import org.xplatform.aggregator.impl.core.domain.models.AggregatorGameLanguage;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;
import org.xplatform.app_update.api.presentation.AppUpdateScreenParams;
import org.xplatform.authenticator.impl.ui.dialogs.authenticator_filter.AuthenticatorFilterViewModel$ViewModelState;
import org.xplatform.authenticator.impl.ui.dialogs.authenticator_filter.models.AuthenticatorFilterDialogSettings;
import org.xplatform.authenticator.impl.util.NotificationPeriodInfo;
import org.xplatform.authenticator.impl.util.NotificationTypeInfo;
import org.xplatform.bet_history.bet_info.presentation.model.BetInfoScreenModel;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.bethistory.history.domain.model.BetHistoryFilterItemModel;
import org.xplatform.betting.core.zip.model.zip.BetPlayerZip;
import org.xplatform.betting.core.zip.model.zip.BetZip;
import org.xplatform.betting.core.zip.model.zip.bet.BetGroupZip;
import org.xplatform.betting.core.zip.model.zip.bet.BetViewType;
import org.xplatform.betting.core.zip.model.zip.bet.ChildBets;
import org.xplatform.core.navigation.authorization.model.AuthType;
import org.xplatform.login.core.presentation.model.AuthDataErrorModel;
import org.xplatform.login.core.presentation.model.AuthDataModel;
import org.xplatform.make_bet.impl.presentation.model.AutoMaxUiModel;
import org.xplatform.make_bet.impl.presentation.model.BetDetailsUiModel;
import org.xplatform.picker.api.presentation.AnalyticsEntryPoint;
import org.xplatform.search.impl.presentation.aggregator_brands.models.AggregatorBrandsFragmentSettings;
import org.xplatform.search.impl.presentation.aggregator_games.models.AggregatorGamesFragmentSettings;
import org.xplatform.sportgame.action_menu.api.ActionMenuDialogParams;
import org.xplatform.sportgame.classic.impl.presentation.legacy.models.AnimatedViewsHeights;
import org.xplatform.sportgame.markets.betbuilder.api.navigation.BetBuilderMarketsParams;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.components.successbetalert.model.BetDoneIconStyleEnum;
import org.xplatform.uikit.components.successbetalert.model.BetDoneScreenStyleEnum;
import org.xplatform.wallet.impl.presentation.dialogs.accountactions.params.AccountActionsScreenParams;

/* JADX INFO: loaded from: classes3.dex */
public final class ibw0 implements Parcelable.Creator {
    public static final ibw0 b = new ibw0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14510a;

    public /* synthetic */ ibw0(byte b2) {
        this.f14510a = b2;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ComplianceOptions complianceOptions = null;
        boolean zT = false;
        switch (this.f14510a) {
            case 0:
                int iDataPosition = parcel.dataPosition();
                if (parcel.readInt() != -204102970) {
                    parcel.setDataPosition(iDataPosition - 4);
                    return ApiMetadata.d;
                }
                int iI0 = b5x.i0(parcel);
                while (parcel.dataPosition() < iI0) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        complianceOptions = (ComplianceOptions) b5x.C(parcel, i, ComplianceOptions.CREATOR);
                    } else if (c != 2) {
                        b5x.b0(parcel, i);
                    } else {
                        zT = b5x.T(parcel, i);
                    }
                }
                b5x.H(parcel, iI0);
                return new ApiMetadata(complianceOptions, zT);
            case 1:
                parcel.getClass();
                return new AccountActionsScreenParams(parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readDouble(), parcel.readInt() != 0);
            case 2:
                parcel.getClass();
                return new ActionDialogButtonStyle(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 3:
                parcel.getClass();
                return new ActionMenuDialogParams(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readInt() != 0, parcel.readLong(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
            case 4:
                parcel.getClass();
                return new ActivityResult(parcel.readInt(), parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null);
            case 5:
                parcel.getClass();
                return new AggregatorBrandsFragmentSettings(parcel.readString());
            case 6:
                parcel.getClass();
                return new AggregatorGameLanguage(parcel.readInt(), parcel.readString(), parcel.readString());
            case 7:
                parcel.getClass();
                return new AggregatorGamesFragmentSettings(parcel.readString());
            case 8:
                parcel.getClass();
                return new AggregatorJackpotBottomSheetParams(parcel.readString(), parcel.readString());
            case 9:
                parcel.getClass();
                long j = parcel.readLong();
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList.add(FilterCategoryUiModel.CREATOR.createFromParcel(parcel));
                }
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    arrayList2.add(PromotedCategoryUiModel.CREATOR.createFromParcel(parcel));
                }
                return new AggregatorProvidersFiltersUiModel(j, arrayList, arrayList2);
            case 10:
                parcel.getClass();
                return new AggregatorScreenModel(parcel.readString(), parcel.readString(), parcel.readLong(), (tm1) parcel.readSerializable(), wgh0.valueOf(parcel.readString()), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readInt() != 0);
            case 11:
                parcel.getClass();
                return new AggregatorSortingOptionModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 12:
                parcel.getClass();
                return AnalyticsEntryPoint.valueOf(parcel.readString());
            case 13:
                parcel.getClass();
                return new AnimatedViewsHeights(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 14:
                parcel.getClass();
                return new AppUpdateScreenParams(parcel.readString(), parcel.readInt() != 0, parcel.readString());
            case 15:
                parcel.getClass();
                return new AuthDataErrorModel((Throwable) parcel.readSerializable(), (AuthDataModel) parcel.readParcelable(AuthDataErrorModel.class.getClassLoader()));
            case 16:
                parcel.getClass();
                return AuthType.valueOf(parcel.readString());
            case 17:
                parcel.getClass();
                return new AuthenticatorFilterDialogSettings(NotificationTypeInfo.CREATOR.createFromParcel(parcel), NotificationPeriodInfo.CREATOR.createFromParcel(parcel), parcel.readString());
            case 18:
                parcel.getClass();
                return new AuthenticatorFilterViewModel$ViewModelState(c860.valueOf(parcel.readString()), NotificationPeriodInfo.CREATOR.createFromParcel(parcel), q760.valueOf(parcel.readString()));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                parcel.getClass();
                return new AutoMaxUiModel(parcel.readDouble(), parcel.readInt() != 0);
            case 20:
                parcel.getClass();
                return new org.xplatform.coupon.impl.make_bet.presentation.model.AutoMaxUiModel(parcel.readDouble(), parcel.readInt() != 0);
            case 21:
                BadgeState$State badgeState$State = new BadgeState$State();
                badgeState$State.i = 255;
                badgeState$State.k = -2;
                badgeState$State.l = -2;
                badgeState$State.m = -2;
                badgeState$State.t = Boolean.TRUE;
                badgeState$State.f45558a = parcel.readInt();
                badgeState$State.b = (Integer) parcel.readSerializable();
                badgeState$State.c = (Integer) parcel.readSerializable();
                badgeState$State.d = (Integer) parcel.readSerializable();
                badgeState$State.e = (Integer) parcel.readSerializable();
                badgeState$State.f = (Integer) parcel.readSerializable();
                badgeState$State.g = (Integer) parcel.readSerializable();
                badgeState$State.h = (Integer) parcel.readSerializable();
                badgeState$State.i = parcel.readInt();
                badgeState$State.j = parcel.readString();
                badgeState$State.k = parcel.readInt();
                badgeState$State.l = parcel.readInt();
                badgeState$State.m = parcel.readInt();
                badgeState$State.o = parcel.readString();
                badgeState$State.p = parcel.readString();
                badgeState$State.q = parcel.readInt();
                badgeState$State.s = (Integer) parcel.readSerializable();
                badgeState$State.u = (Integer) parcel.readSerializable();
                badgeState$State.v = (Integer) parcel.readSerializable();
                badgeState$State.w = (Integer) parcel.readSerializable();
                badgeState$State.x = (Integer) parcel.readSerializable();
                badgeState$State.y = (Integer) parcel.readSerializable();
                badgeState$State.z = (Integer) parcel.readSerializable();
                badgeState$State.Y = (Integer) parcel.readSerializable();
                badgeState$State.A = (Integer) parcel.readSerializable();
                badgeState$State.B = (Integer) parcel.readSerializable();
                badgeState$State.t = (Boolean) parcel.readSerializable();
                badgeState$State.n = (Locale) parcel.readSerializable();
                badgeState$State.Z = (Boolean) parcel.readSerializable();
                badgeState$State.f1 = (Integer) parcel.readSerializable();
                return badgeState$State;
            case 22:
                parcel.getClass();
                return new BetBuilderMarketsParams(parcel.readLong());
            case 23:
                parcel.getClass();
                String string = parcel.readString();
                boolean z = false;
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new BetDetailsUiModel(string, string2, string3, z, parcel.readInt() != 0);
            case 24:
                parcel.getClass();
                return BetDoneIconStyleEnum.valueOf(parcel.readString());
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                parcel.getClass();
                return BetDoneScreenStyleEnum.valueOf(parcel.readString());
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                parcel.getClass();
                long j2 = parcel.readLong();
                long j3 = parcel.readLong();
                String string4 = parcel.readString();
                int i6 = parcel.readInt();
                int i7 = parcel.readInt();
                int i8 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i8);
                for (int i9 = 0; i9 != i8; i9++) {
                    arrayList3.add(BetZip.CREATOR.createFromParcel(parcel));
                }
                int i10 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList4.add(ChildBets.CREATOR.createFromParcel(parcel));
                }
                return new BetGroupZip(j2, j3, string4, i6, i7, arrayList3, arrayList4, parcel.readInt() != 0, BetViewType.CREATOR.createFromParcel(parcel));
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                parcel.getClass();
                return new BetHistoryFilterItemModel(e4f.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                parcel.getClass();
                return new BetInfoScreenModel(HistoryTypeModel.CREATOR.createFromParcel(parcel), parcel.readLong(), f8w.valueOf(parcel.readString()), parcel.readInt() != 0);
            default:
                parcel.getClass();
                return new BetPlayerZip(parcel.readLong(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f14510a) {
            case 0:
                return new ApiMetadata[i];
            case 1:
                return new AccountActionsScreenParams[i];
            case 2:
                return new ActionDialogButtonStyle[i];
            case 3:
                return new ActionMenuDialogParams[i];
            case 4:
                return new ActivityResult[i];
            case 5:
                return new AggregatorBrandsFragmentSettings[i];
            case 6:
                return new AggregatorGameLanguage[i];
            case 7:
                return new AggregatorGamesFragmentSettings[i];
            case 8:
                return new AggregatorJackpotBottomSheetParams[i];
            case 9:
                return new AggregatorProvidersFiltersUiModel[i];
            case 10:
                return new AggregatorScreenModel[i];
            case 11:
                return new AggregatorSortingOptionModel[i];
            case 12:
                return new AnalyticsEntryPoint[i];
            case 13:
                return new AnimatedViewsHeights[i];
            case 14:
                return new AppUpdateScreenParams[i];
            case 15:
                return new AuthDataErrorModel[i];
            case 16:
                return new AuthType[i];
            case 17:
                return new AuthenticatorFilterDialogSettings[i];
            case 18:
                return new AuthenticatorFilterViewModel$ViewModelState[i];
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new AutoMaxUiModel[i];
            case 20:
                return new org.xplatform.coupon.impl.make_bet.presentation.model.AutoMaxUiModel[i];
            case 21:
                return new BadgeState$State[i];
            case 22:
                return new BetBuilderMarketsParams[i];
            case 23:
                return new BetDetailsUiModel[i];
            case 24:
                return new BetDoneIconStyleEnum[i];
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new BetDoneScreenStyleEnum[i];
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new BetGroupZip[i];
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new BetHistoryFilterItemModel[i];
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new BetInfoScreenModel[i];
            default:
                return new BetPlayerZip[i];
        }
    }
}
