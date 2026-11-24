package a;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.identitycredentials.PendingGetCredentialHandle;
import com.google.android.gms.identitycredentials.PendingImportCredentialsHandle;
import com.google.firebase.perf.session.PerfSession;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import org.xplatform.aggregator.impl.category.presentation.models.PromotedCategoryUiModel;
import org.xplatform.aggregator.impl.category.presentation.models.ProviderUIModel;
import org.xplatform.authenticator.impl.util.NotificationTypeInfo;
import org.xplatform.authqr.impl.qr.presentation.confirmation.mail.check.params.QrCheckCodeByMailParams;
import org.xplatform.authqr.impl.qr.presentation.confirmation.mail.send.params.QrSendConfirmationMailParams;
import org.xplatform.authqr.impl.qr.presentation.confirmation.secret_question.params.QrConfirmSecretQuestionFragmentScreenParams;
import org.xplatform.authqr.impl.qr.presentation.confirmation.sms.check.params.QrCheckCodeBySmsParams;
import org.xplatform.authqr.impl.qr.presentation.confirmation.sms.send.params.QrSendConfirmationSmsParams;
import org.xplatform.banners.api.domain.models.PartnersTeamInfoBannerModel;
import org.xplatform.bet_history.edit_coupon.presentation.model.OptionSelectBottomSheetDialogModel;
import org.xplatform.betting.core.zip.model.zip.PlayersDuelZip;
import org.xplatform.cyber.game.rainbow.api.RainbowGameScreenParams;
import org.xplatform.cyber.game.rainbow.api.RainbowPostGameScreenParams;
import org.xplatform.cyber.section.api.presentation.player_transfers.PlayerTransfersScreenParams;
import org.xplatform.feed.notifictation.presentation.models.PeriodSubscriptionSettingsScreenUiModel;
import org.xplatform.feed.notifictation.presentation.models.SubscriptionEventSettingsUiModel;
import org.xplatform.feed.notifictation.presentation.models.SubscriptionPeriodUiModel;
import org.xplatform.makebet_promocodes.api.presentation.models.PromoCodeInfoUiModel;
import org.xplatform.personal.impl.presentation.documentchoice.models.PersonalDocumentRedesignUiModel;
import org.xplatform.personal.impl.presentation.documentchoice.models.PersonalDocumentUiModel;
import org.xplatform.personal.impl.presentation.edit.models.ProfileEditUiModelTitle;
import org.xplatform.playersduel.api.presentation.PlayerDuelParams;
import org.xplatform.playersduel.impl.presentation.players_duel.screen.PlayersDuelParams;
import org.xplatform.referral.api.domain.model.ReferralNetworkInfo;
import org.xplatform.referral.api.domain.model.ReferralUser;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.PhoneStateModel;
import org.xplatform.rules.impl.presentation.models.PaymentInfoParams;

/* JADX INFO: loaded from: classes3.dex */
public final class d860 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5630a;

    public /* synthetic */ d860(byte b) {
        this.f5630a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        PendingIntent pendingIntent = null;
        ArrayList arrayList2 = null;
        PendingIntent pendingIntent2 = null;
        switch (this.f5630a) {
            case 0:
                parcel.getClass();
                return new NotificationTypeInfo(c860.valueOf(parcel.readString()), parcel.readString());
            case 1:
                parcel.getClass();
                return new OptionSelectBottomSheetDialogModel(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            case 2:
                return new ParcelImpl(parcel);
            case 3:
                parcel.getClass();
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList3.add(Long.valueOf(parcel.readLong()));
                }
                return new PartnersTeamInfoBannerModel(string, string2, string3, string4, arrayList3);
            case 4:
                parcel.getClass();
                return new PaymentInfoParams(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
            case 5:
                int iI0 = b5x.i0(parcel);
                while (parcel.dataPosition() < iI0) {
                    int i3 = parcel.readInt();
                    if (((char) i3) != 1) {
                        b5x.b0(parcel, i3);
                    } else {
                        pendingIntent = (PendingIntent) b5x.C(parcel, i3, PendingIntent.CREATOR);
                    }
                }
                b5x.H(parcel, iI0);
                return new PendingGetCredentialHandle(pendingIntent);
            case 6:
                int iI1 = b5x.i0(parcel);
                while (parcel.dataPosition() < iI1) {
                    int i4 = parcel.readInt();
                    if (((char) i4) != 1) {
                        b5x.b0(parcel, i4);
                    } else {
                        pendingIntent2 = (PendingIntent) b5x.C(parcel, i4, PendingIntent.CREATOR);
                    }
                }
                b5x.H(parcel, iI1);
                return new PendingImportCredentialsHandle(pendingIntent2);
            case 7:
                return new PerfSession(parcel);
            case 8:
                parcel.getClass();
                SubscriptionPeriodUiModel subscriptionPeriodUiModelCreateFromParcel = SubscriptionPeriodUiModel.CREATOR.createFromParcel(parcel);
                int i5 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList4.add(SubscriptionEventSettingsUiModel.CREATOR.createFromParcel(parcel));
                }
                return new PeriodSubscriptionSettingsScreenUiModel(subscriptionPeriodUiModelCreateFromParcel, arrayList4);
            case 9:
                parcel.getClass();
                return new PersonalDocumentRedesignUiModel(parcel.readInt(), parcel.readString(), parcel.readInt() != 0, d4d.valueOf(parcel.readString()));
            case 10:
                parcel.getClass();
                return new PersonalDocumentUiModel(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
            case 11:
                parcel.getClass();
                return new PhoneStateModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 12:
                parcel.getClass();
                return new org.xplatform.registration_default.impl.presentation.udf.state.models.fields.PhoneStateModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 13:
                parcel.getClass();
                return new org.xplatform.registration.simple.impl.presentation.state.models.fields.PhoneStateModel(parcel.readString(), parcel.readString(), parcel.readString());
            case 14:
                parcel.getClass();
                return new PlayerDuelParams(parcel.readLong(), parcel.readInt() != 0, parcel.readLong());
            case 15:
                parcel.getClass();
                return new PlayerTransfersScreenParams(parcel.readLong(), parcel.readString());
            case 16:
                parcel.getClass();
                return new PlayersDuelParams(parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readInt() != 0);
            case 17:
                parcel.getClass();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i7 = parcel.readInt();
                    arrayList = new ArrayList(i7);
                    for (int i8 = 0; i8 != i7; i8++) {
                        arrayList.add(Long.valueOf(parcel.readLong()));
                    }
                }
                if (parcel.readInt() != 0) {
                    int i9 = parcel.readInt();
                    arrayList2 = new ArrayList(i9);
                    for (int i10 = 0; i10 != i9; i10++) {
                        arrayList2.add(Long.valueOf(parcel.readLong()));
                    }
                }
                return new PlayersDuelZip(arrayList, arrayList2);
            case 18:
                parcel.getClass();
                return new ProfileEditUiModelTitle(parcel.readInt());
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                parcel.getClass();
                return new PromoCodeInfoUiModel(parcel.readDouble(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
            case 20:
                parcel.getClass();
                return new PromotedCategoryUiModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 21:
                parcel.getClass();
                return new ProviderUIModel(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, rh1.valueOf(parcel.readString()));
            case 22:
                parcel.getClass();
                return new QrCheckCodeByMailParams((swp0) parcel.readSerializable(), parcel.readLong());
            case 23:
                parcel.getClass();
                swp0 swp0Var = (swp0) parcel.readSerializable();
                long j = parcel.readLong();
                yed0 yed0VarValueOf = yed0.valueOf(parcel.readString());
                int i11 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList5.add(obk0.valueOf(parcel.readString()));
                }
                return new QrCheckCodeBySmsParams(swp0Var, j, yed0VarValueOf, arrayList5);
            case 24:
                parcel.getClass();
                return new QrConfirmSecretQuestionFragmentScreenParams((swp0) parcel.readSerializable(), parcel.readString(), parcel.readString());
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                parcel.getClass();
                return new QrSendConfirmationMailParams((swp0) parcel.readSerializable());
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                parcel.getClass();
                swp0 swp0Var2 = (swp0) parcel.readSerializable();
                int i13 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList6.add(obk0.valueOf(parcel.readString()));
                }
                return new QrSendConfirmationSmsParams(swp0Var2, arrayList6);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                parcel.getClass();
                return new RainbowGameScreenParams(parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), k1g.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                parcel.getClass();
                return new RainbowPostGameScreenParams(parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString());
            default:
                parcel.getClass();
                double d = parcel.readDouble();
                double d2 = parcel.readDouble();
                double d3 = parcel.readDouble();
                String string5 = parcel.readString();
                int i15 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    arrayList7.add(ReferralUser.CREATOR.createFromParcel(parcel));
                }
                return new ReferralNetworkInfo(d, d2, d3, string5, arrayList7);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f5630a) {
            case 0:
                return new NotificationTypeInfo[i];
            case 1:
                return new OptionSelectBottomSheetDialogModel[i];
            case 2:
                return new ParcelImpl[i];
            case 3:
                return new PartnersTeamInfoBannerModel[i];
            case 4:
                return new PaymentInfoParams[i];
            case 5:
                return new PendingGetCredentialHandle[i];
            case 6:
                return new PendingImportCredentialsHandle[i];
            case 7:
                return new PerfSession[i];
            case 8:
                return new PeriodSubscriptionSettingsScreenUiModel[i];
            case 9:
                return new PersonalDocumentRedesignUiModel[i];
            case 10:
                return new PersonalDocumentUiModel[i];
            case 11:
                return new PhoneStateModel[i];
            case 12:
                return new org.xplatform.registration_default.impl.presentation.udf.state.models.fields.PhoneStateModel[i];
            case 13:
                return new org.xplatform.registration.simple.impl.presentation.state.models.fields.PhoneStateModel[i];
            case 14:
                return new PlayerDuelParams[i];
            case 15:
                return new PlayerTransfersScreenParams[i];
            case 16:
                return new PlayersDuelParams[i];
            case 17:
                return new PlayersDuelZip[i];
            case 18:
                return new ProfileEditUiModelTitle[i];
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new PromoCodeInfoUiModel[i];
            case 20:
                return new PromotedCategoryUiModel[i];
            case 21:
                return new ProviderUIModel[i];
            case 22:
                return new QrCheckCodeByMailParams[i];
            case 23:
                return new QrCheckCodeBySmsParams[i];
            case 24:
                return new QrConfirmSecretQuestionFragmentScreenParams[i];
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new QrSendConfirmationMailParams[i];
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new QrSendConfirmationSmsParams[i];
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new RainbowGameScreenParams[i];
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new RainbowPostGameScreenParams[i];
            default:
                return new ReferralNetworkInfo[i];
        }
    }
}
