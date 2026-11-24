package a;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identitycredentials.ClearCreationOptionsResponse;
import com.google.android.gms.identitycredentials.ClearCredentialStateResponse;
import com.google.android.gms.identitycredentials.ClearExportResponse;
import com.google.android.gms.identitycredentials.ClearRegistryResponse;
import com.google.android.gms.identitycredentials.CreateCredentialHandle;
import com.google.android.gms.identitycredentials.CreateCredentialResponse;
import com.google.android.gms.identitycredentials.CredentialOption;
import com.google.android.gms.identitycredentials.CredentialTransferCapabilities;
import com.google.firebase.perf.metrics.Counter;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.math.BigDecimal;
import java.util.ArrayList;
import org.xplatform.coupon.impl.coupon.presentation.models.CouponTypeUiModel;
import org.xplatform.cyber.calendar.impl.presentation.common.model.CyberCalendarPeriodUiModel;
import org.xplatform.cyber.calendar.impl.presentation.container.champinfo.CyberCalendarChampInfoParams;
import org.xplatform.cyber.calendar.impl.presentation.content.daysofweek.CyberCalendarDaysOfWeekParams;
import org.xplatform.cyber.game.core.game_screen.presentation.bottomsheet.CyberBottomSheetParams;
import org.xplatform.cyber.game.core.presentation.action.CyberActionDialogParams;
import org.xplatform.cyber.game.counterstrike.api.Cs2GameScreenParams;
import org.xplatform.cyber.section.api.activeteams.CyberActiveTeamsParams;
import org.xplatform.favorites.impl.presentation.screen.classic.models.ClassicFavoriteTab;
import org.xplatform.make_bet.impl.presentation.model.CoefStepInputUiModel;
import org.xplatform.make_bet.impl.presentation.model.CoefUiModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.CitizenshipStateModel;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.CityStateModel;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.CountryStateModel;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.CurrencyStateModel;

/* JADX INFO: loaded from: classes5.dex */
public final class okc implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25400a;

    public /* synthetic */ okc(byte b) {
        this.f25400a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        PendingIntent pendingIntent = null;
        Bundle bundleY = null;
        String strD = null;
        switch (this.f25400a) {
            case 0:
                parcel.getClass();
                return new CitizenshipStateModel(parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
            case 1:
                parcel.getClass();
                return new CityStateModel(parcel.readInt(), parcel.readString());
            case 2:
                parcel.getClass();
                return new org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CityStateModel(parcel.readInt(), parcel.readString());
            case 3:
                parcel.getClass();
                return new org.xplatform.registration.simple.impl.presentation.state.models.fields.CityStateModel(parcel.readInt(), parcel.readString());
            case 4:
                parcel.getClass();
                return ClassicFavoriteTab.valueOf(parcel.readString());
            case 5:
                int iI0 = b5x.i0(parcel);
                boolean zT = false;
                while (parcel.dataPosition() < iI0) {
                    int i = parcel.readInt();
                    if (((char) i) != 1) {
                        b5x.b0(parcel, i);
                    } else {
                        zT = b5x.T(parcel, i);
                    }
                }
                b5x.H(parcel, iI0);
                return new ClearCreationOptionsResponse(zT);
            case 6:
                int iI1 = b5x.i0(parcel);
                while (parcel.dataPosition() < iI1) {
                    b5x.b0(parcel, parcel.readInt());
                }
                b5x.H(parcel, iI1);
                return new ClearCredentialStateResponse();
            case 7:
                int iI2 = b5x.i0(parcel);
                boolean zT2 = false;
                while (parcel.dataPosition() < iI2) {
                    int i2 = parcel.readInt();
                    if (((char) i2) != 1) {
                        b5x.b0(parcel, i2);
                    } else {
                        zT2 = b5x.T(parcel, i2);
                    }
                }
                b5x.H(parcel, iI2);
                return new ClearExportResponse(zT2);
            case 8:
                int iI3 = b5x.i0(parcel);
                boolean zT3 = false;
                while (parcel.dataPosition() < iI3) {
                    int i3 = parcel.readInt();
                    if (((char) i3) != 1) {
                        b5x.b0(parcel, i3);
                    } else {
                        zT3 = b5x.T(parcel, i3);
                    }
                }
                b5x.H(parcel, iI3);
                return new ClearRegistryResponse(zT3);
            case 9:
                parcel.getClass();
                return new CoefStepInputUiModel((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 10:
                parcel.getClass();
                return new org.xplatform.coupon.impl.make_bet.presentation.model.CoefStepInputUiModel((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 11:
                parcel.getClass();
                return new CoefUiModel(parcel.readString(), parcel.readDouble(), parcel.readString(), l0d.valueOf(parcel.readString()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readString(), parcel.readString(), l0d.valueOf(parcel.readString()), parcel.readInt() != 0);
            case 12:
                return new Counter(parcel);
            case 13:
                parcel.getClass();
                return new CountryStateModel(parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
            case 14:
                parcel.getClass();
                return new org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CountryStateModel(parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
            case 15:
                parcel.getClass();
                return new org.xplatform.registration.simple.impl.presentation.state.models.fields.CountryStateModel(parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
            case 16:
                parcel.getClass();
                return new CouponTypeUiModel(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 17:
                int iI4 = b5x.i0(parcel);
                CreateCredentialResponse createCredentialResponse = null;
                while (parcel.dataPosition() < iI4) {
                    int i4 = parcel.readInt();
                    char c = (char) i4;
                    if (c == 1) {
                        pendingIntent = (PendingIntent) b5x.C(parcel, i4, PendingIntent.CREATOR);
                    } else if (c != 2) {
                        b5x.b0(parcel, i4);
                    } else {
                        createCredentialResponse = (CreateCredentialResponse) b5x.C(parcel, i4, CreateCredentialResponse.CREATOR);
                    }
                }
                b5x.H(parcel, iI4);
                return new CreateCredentialHandle(pendingIntent, createCredentialResponse);
            case 18:
                int iI5 = b5x.i0(parcel);
                Bundle bundleY2 = null;
                while (parcel.dataPosition() < iI5) {
                    int i5 = parcel.readInt();
                    char c2 = (char) i5;
                    if (c2 == 1) {
                        strD = b5x.D(parcel, i5);
                    } else if (c2 != 2) {
                        b5x.b0(parcel, i5);
                    } else {
                        bundleY2 = b5x.y(parcel, i5);
                    }
                }
                b5x.H(parcel, iI5);
                return new CreateCredentialResponse(bundleY2, strD);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                int iI6 = b5x.i0(parcel);
                String strD2 = "";
                String strD3 = strD2;
                String strD4 = strD3;
                Bundle bundleY3 = null;
                Bundle bundleY4 = null;
                String strD5 = null;
                while (parcel.dataPosition() < iI6) {
                    int i6 = parcel.readInt();
                    switch ((char) i6) {
                        case 1:
                            strD2 = b5x.D(parcel, i6);
                            break;
                        case 2:
                            bundleY3 = b5x.y(parcel, i6);
                            break;
                        case 3:
                            bundleY4 = b5x.y(parcel, i6);
                            break;
                        case 4:
                            strD5 = b5x.D(parcel, i6);
                            break;
                        case 5:
                            strD3 = b5x.D(parcel, i6);
                            break;
                        case 6:
                            strD4 = b5x.D(parcel, i6);
                            break;
                        default:
                            b5x.b0(parcel, i6);
                            break;
                    }
                }
                b5x.H(parcel, iI6);
                return new CredentialOption(strD2, bundleY3, bundleY4, strD5, strD3, strD4);
            case 20:
                char c3 = 1;
                int iI7 = b5x.i0(parcel);
                while (parcel.dataPosition() < iI7) {
                    int i7 = parcel.readInt();
                    if (((char) i7) != c3) {
                        b5x.b0(parcel, i7);
                    } else {
                        bundleY = b5x.y(parcel, i7);
                    }
                    c3 = 1;
                }
                b5x.H(parcel, iI7);
                return new CredentialTransferCapabilities(bundleY);
            case 21:
                parcel.getClass();
                return new Cs2GameScreenParams(parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), k1g.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            case 22:
                parcel.getClass();
                return new CurrencyStateModel(parcel.readInt(), parcel.readString(), parcel.readString());
            case 23:
                parcel.getClass();
                return new org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CurrencyStateModel(parcel.readInt(), parcel.readString(), parcel.readString());
            case 24:
                parcel.getClass();
                return new org.xplatform.registration.simple.impl.presentation.state.models.fields.CurrencyStateModel(parcel.readInt(), parcel.readString(), parcel.readString());
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                parcel.getClass();
                long j = parcel.readLong();
                long j2 = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z2 = true;
                    z = true;
                } else {
                    z = false;
                    z2 = true;
                }
                long j3 = parcel.readLong();
                long j4 = parcel.readLong();
                boolean z3 = parcel.readInt() != 0 ? z2 : false;
                long j5 = parcel.readLong();
                long j6 = parcel.readLong();
                String string = parcel.readString();
                int i8 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i8);
                for (int i9 = 0; i9 != i8; i9++) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                }
                int i10 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i10);
                int i11 = 0;
                while (i11 != i10) {
                    arrayList2.add(Integer.valueOf(parcel.readInt()));
                    i11++;
                    i10 = i10;
                }
                return new CyberActionDialogParams(parcel.readInt(), j, j2, j3, j4, j5, j6, parcel.readLong(), string, parcel.readString(), parcel.readString(), arrayList, arrayList2, z, z3, parcel.readInt() != 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                parcel.getClass();
                return new CyberActiveTeamsParams(parcel.readLong());
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                parcel.getClass();
                return new CyberBottomSheetParams(parcel.readLong(), parcel.readLong(), parcel.readInt() != 0, parcel.readLong(), parcel.readLong(), parcel.readLong(), (ms2) parcel.readSerializable(), grs.valueOf(parcel.readString()), parcel.readString());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                parcel.getClass();
                return new CyberCalendarChampInfoParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readLong());
            default:
                parcel.getClass();
                return new CyberCalendarDaysOfWeekParams(yag.valueOf(parcel.readString()), CyberCalendarPeriodUiModel.CREATOR.createFromParcel(parcel));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f25400a) {
            case 0:
                return new CitizenshipStateModel[i];
            case 1:
                return new CityStateModel[i];
            case 2:
                return new org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CityStateModel[i];
            case 3:
                return new org.xplatform.registration.simple.impl.presentation.state.models.fields.CityStateModel[i];
            case 4:
                return new ClassicFavoriteTab[i];
            case 5:
                return new ClearCreationOptionsResponse[i];
            case 6:
                return new ClearCredentialStateResponse[i];
            case 7:
                return new ClearExportResponse[i];
            case 8:
                return new ClearRegistryResponse[i];
            case 9:
                return new CoefStepInputUiModel[i];
            case 10:
                return new org.xplatform.coupon.impl.make_bet.presentation.model.CoefStepInputUiModel[i];
            case 11:
                return new CoefUiModel[i];
            case 12:
                return new Counter[i];
            case 13:
                return new CountryStateModel[i];
            case 14:
                return new org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CountryStateModel[i];
            case 15:
                return new org.xplatform.registration.simple.impl.presentation.state.models.fields.CountryStateModel[i];
            case 16:
                return new CouponTypeUiModel[i];
            case 17:
                return new CreateCredentialHandle[i];
            case 18:
                return new CreateCredentialResponse[i];
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new CredentialOption[i];
            case 20:
                return new CredentialTransferCapabilities[i];
            case 21:
                return new Cs2GameScreenParams[i];
            case 22:
                return new CurrencyStateModel[i];
            case 23:
                return new org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CurrencyStateModel[i];
            case 24:
                return new org.xplatform.registration.simple.impl.presentation.state.models.fields.CurrencyStateModel[i];
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new CyberActionDialogParams[i];
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new CyberActiveTeamsParams[i];
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new CyberBottomSheetParams[i];
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new CyberCalendarChampInfoParams[i];
            default:
                return new CyberCalendarDaysOfWeekParams[i];
        }
    }
}
