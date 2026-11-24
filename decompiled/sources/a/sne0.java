package a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identitycredentials.RegisterCreationOptionsResponse;
import com.google.android.gms.identitycredentials.RegisterExportResponse;
import com.google.android.gms.identitycredentials.RegistrationResponse;
import com.google.firebase.messaging.RemoteMessage;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.bet_history.sale.presentation.model.SaleScreenModel;
import org.xplatform.bethistory.sale.presentation.SaleDataModel;
import org.xplatform.cyber.section.api.championships.hltv.SelectAwardParams;
import org.xplatform.feed.linelive.presentation.dialogs.select_date_time.params.ChoosenDate;
import org.xplatform.feed.linelive.presentation.dialogs.select_date_time.params.SelectDateTimeScreenParams;
import org.xplatform.feed.linelive.presentation.dialogs.select_date_time.params.SelectTimeRangeScreenParams;
import org.xplatform.feed.linelive.presentation.dialogs.select_time_filter.params.SelectTimeFilterScreenParams;
import org.xplatform.referral.api.domain.model.ReferralNetworkInfo;
import org.xplatform.referral.api.domain.model.ReferralUser;
import org.xplatform.referral.api.presentation.ReferralNetworkParams;
import org.xplatform.referral.api.presentation.ReferralsListParams;
import org.xplatform.registration.success.api.RegistrationSuccessParams;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.RegionStateModel;
import org.xplatform.registration_default.api.presentation.model.RegistrationDefaultScreenParams;
import org.xplatform.registration_default.impl.presentation.registration_bonus.models.RegistrationBonusDefaultScreenParams;
import org.xplatform.related.api.presentation.RelatedParams;
import org.xplatform.results.impl.presentation.dialogs.results.params.SelectDateScreenParams;
import org.xplatform.rules.api.presentation.models.RuleData;
import org.xplatform.security.api.domain.models.SecretQuestionModel;
import org.xplatform.security.impl.presentation.secret_question.models.SecretQuestionUiModel;
import org.xplatform.security.impl.presentation.secret_question_choice.params.SecretQuestionChoiceScreenParams;
import org.xplatform.special_event.impl.results.presentation.model.ResultsScreenParams;
import org.xplatform.statistic.grand_prix.presentation.model.SeasonItemUIModel;
import org.xplatform.statistic.rating.impl.rating_statistic.domain.model.SelectorOptionModel;
import org.xplatform.top.impl.utils.nested_list_scroll_anchor_holder.model.ScrollPosition;

/* JADX INFO: loaded from: classes5.dex */
public final class sne0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32490a;

    public /* synthetic */ sne0(byte b) {
        this.f32490a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Bundle bundleY = null;
        switch (this.f32490a) {
            case 0:
                parcel.getClass();
                return new ReferralNetworkParams(ReferralNetworkInfo.CREATOR.createFromParcel(parcel));
            case 1:
                parcel.getClass();
                return new ReferralUser(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readInt(), parcel.readInt() != 0);
            case 2:
                parcel.getClass();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ReferralUser.CREATOR.createFromParcel(parcel));
                }
                return new ReferralsListParams(arrayList);
            case 3:
                parcel.getClass();
                return new RegionStateModel(parcel.readInt(), parcel.readString());
            case 4:
                parcel.getClass();
                return new org.xplatform.registration_default.impl.presentation.udf.state.models.fields.RegionStateModel(parcel.readInt(), parcel.readString());
            case 5:
                parcel.getClass();
                return new org.xplatform.registration.simple.impl.presentation.state.models.fields.RegionStateModel(parcel.readInt(), parcel.readString());
            case 6:
                int iI0 = b5x.i0(parcel);
                while (parcel.dataPosition() < iI0) {
                    b5x.b0(parcel, parcel.readInt());
                }
                b5x.H(parcel, iI0);
                return new RegisterCreationOptionsResponse();
            case 7:
                int iI1 = b5x.i0(parcel);
                while (parcel.dataPosition() < iI1) {
                    b5x.b0(parcel, parcel.readInt());
                }
                b5x.H(parcel, iI1);
                return new RegisterExportResponse();
            case 8:
                parcel.getClass();
                return new RegistrationBonusDefaultScreenParams(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readInt() != 0);
            case 9:
                parcel.getClass();
                return new RegistrationDefaultScreenParams(q7f0.valueOf(parcel.readString()));
            case 10:
                int iI2 = b5x.i0(parcel);
                while (parcel.dataPosition() < iI2) {
                    b5x.b0(parcel, parcel.readInt());
                }
                b5x.H(parcel, iI2);
                return new RegistrationResponse();
            case 11:
                parcel.getClass();
                return new RegistrationSuccessParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), q7f0.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 12:
                parcel.getClass();
                return new RelatedParams(parcel.readInt() != 0, parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), tef0.valueOf(parcel.readString()), pb10.valueOf(parcel.readString()), (ms2) parcel.readSerializable());
            case 13:
                parcel.getClass();
                return new org.xplatform.cyber.game.core.betting.domain.model.RelatedParams(parcel.readInt() != 0, parcel.readLong(), parcel.readLong(), pb10.valueOf(parcel.readString()), parcel.readLong(), parcel.readLong());
            case 14:
                int iI3 = b5x.i0(parcel);
                while (parcel.dataPosition() < iI3) {
                    int i3 = parcel.readInt();
                    if (((char) i3) != 2) {
                        b5x.b0(parcel, i3);
                    } else {
                        bundleY = b5x.y(parcel, i3);
                    }
                }
                b5x.H(parcel, iI3);
                return new RemoteMessage(bundleY);
            case 15:
                parcel.getClass();
                return new ResultsScreenParams(parcel.readInt(), parcel.readLong(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            case 16:
                parcel.getClass();
                String string = parcel.readString();
                int i4 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new RuleData(string, parcel.readString(), parcel.readString(), linkedHashMap);
            case 17:
                parcel.getClass();
                return new SaleDataModel(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
            case 18:
                parcel.getClass();
                return new SaleScreenModel(parcel.readString(), parcel.readInt() != 0, parcel.readLong(), parcel.readInt() != 0, HistoryTypeModel.CREATOR.createFromParcel(parcel));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                parcel.getClass();
                return new ScrollPosition(parcel.readParcelable(ScrollPosition.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 20:
                parcel.getClass();
                return new SeasonItemUIModel(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 21:
                parcel.getClass();
                return new SecretQuestionChoiceScreenParams(parcel.readString(), parcel.readInt());
            case 22:
                parcel.getClass();
                return new SecretQuestionModel(parcel.readInt(), parcel.readString());
            case 23:
                parcel.getClass();
                int i6 = parcel.readInt();
                return new SecretQuestionUiModel(parcel.readString(), i6, parcel.readInt() != 0);
            case 24:
                parcel.getClass();
                return new SelectAwardParams(parcel.readLong(), parcel.readLong(), parcel.readLong());
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                parcel.getClass();
                return new SelectDateScreenParams((Date) parcel.readSerializable(), parcel.readString());
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                parcel.getClass();
                return new SelectDateTimeScreenParams(parcel.readLong(), (Date) parcel.readSerializable(), parcel.readString(), j2i0.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, (Date) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                parcel.getClass();
                return new SelectTimeFilterScreenParams(ygq0.valueOf(parcel.readString()), parcel.readLong(), parcel.readLong(), parcel.readInt() != 0, parcel.readInt() != 0, (Date) parcel.readSerializable(), parcel.readInt() != 0, jhq0.valueOf(parcel.readString()));
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                parcel.getClass();
                return new SelectTimeRangeScreenParams((ChoosenDate) parcel.readParcelable(SelectTimeRangeScreenParams.class.getClassLoader()), parcel.readString());
            default:
                parcel.getClass();
                return new SelectorOptionModel(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f32490a) {
            case 0:
                return new ReferralNetworkParams[i];
            case 1:
                return new ReferralUser[i];
            case 2:
                return new ReferralsListParams[i];
            case 3:
                return new RegionStateModel[i];
            case 4:
                return new org.xplatform.registration_default.impl.presentation.udf.state.models.fields.RegionStateModel[i];
            case 5:
                return new org.xplatform.registration.simple.impl.presentation.state.models.fields.RegionStateModel[i];
            case 6:
                return new RegisterCreationOptionsResponse[i];
            case 7:
                return new RegisterExportResponse[i];
            case 8:
                return new RegistrationBonusDefaultScreenParams[i];
            case 9:
                return new RegistrationDefaultScreenParams[i];
            case 10:
                return new RegistrationResponse[i];
            case 11:
                return new RegistrationSuccessParams[i];
            case 12:
                return new RelatedParams[i];
            case 13:
                return new org.xplatform.cyber.game.core.betting.domain.model.RelatedParams[i];
            case 14:
                return new RemoteMessage[i];
            case 15:
                return new ResultsScreenParams[i];
            case 16:
                return new RuleData[i];
            case 17:
                return new SaleDataModel[i];
            case 18:
                return new SaleScreenModel[i];
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new ScrollPosition[i];
            case 20:
                return new SeasonItemUIModel[i];
            case 21:
                return new SecretQuestionChoiceScreenParams[i];
            case 22:
                return new SecretQuestionModel[i];
            case 23:
                return new SecretQuestionUiModel[i];
            case 24:
                return new SelectAwardParams[i];
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new SelectDateScreenParams[i];
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new SelectDateTimeScreenParams[i];
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new SelectTimeFilterScreenParams[i];
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new SelectTimeRangeScreenParams[i];
            default:
                return new SelectorOptionModel[i];
        }
    }
}
