package a;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.metrics.Trace;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import org.xplatform.aggregator.api.model.tournaments.UserActionButtonModel;
import org.xplatform.cyber.game.valorant.api.ValorantGameScreenParams;
import org.xplatform.cyber.game.valorant.api.ValorantPostGameScreenParams;
import org.xplatform.cyber.section.api.championships.universal.presentation.UniversalChampInfoParams;
import org.xplatform.cyber.section.api.championships.universal.presentation.UniversalChampParams;
import org.xplatform.cyber.section.api.championships.universal.presentation.UniversalChampPrizePoolParams;
import org.xplatform.cyber.section.api.championships.universal.presentation.UniversalChampResultsParams;
import org.xplatform.cyber.section.api.presentation.TransferScreenParams;
import org.xplatform.cyber.section.api.virtualgamescategories.VirtualCategoryDisciplinesParams;
import org.xplatform.cyber.section.impl.transfers.presentation.common.timefilter.TransferTimeFilterUiModel;
import org.xplatform.cyber.section.impl.transfers.presentation.dialogs.disciplinefilter.model.TransfersDisciplineFilter;
import org.xplatform.cyber.section.impl.transfers.presentation.dialogs.disciplinefilter.model.TransfersDisciplineFilterBottomParams;
import org.xplatform.cyber.section.impl.transfers.presentation.dialogs.timefilter.model.TransfersTimeFilterBottomParams;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Cyber$Champs$Line;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Cyber$Champs$Live;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Cyber$Disciplines;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Cyber$Games$Line;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Cyber$Games$Live;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$OneXGames$Categories;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$OneXGames$Spotlight;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$OneXGames$Tape;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Sport$Champs$Live;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Sport$FilterTape;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Sport$Games$Line;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Sport$Games$Live;
import org.xplatform.ufc.api.championship.UfcChampionshipParams;
import org.xplatform.ufc.api.game.UfcGameParams;
import org.xplatform.ufc.api.game.UfcPostGameParams;
import org.xplatform.ufc.api.weight_class_rating.UfcWeightClassRatingParams;

/* JADX INFO: loaded from: classes6.dex */
public final class rdr0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30303a;

    public /* synthetic */ rdr0(byte b) {
        this.f30303a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 0;
        switch (this.f30303a) {
            case 0:
                parcel.getClass();
                parcel.readInt();
                return TopSectionKey$Cyber$Champs$Line.f47128a;
            case 1:
                parcel.getClass();
                parcel.readInt();
                return TopSectionKey$Cyber$Champs$Live.f47129a;
            case 2:
                parcel.getClass();
                parcel.readInt();
                return TopSectionKey$Cyber$Disciplines.f47130a;
            case 3:
                parcel.getClass();
                parcel.readInt();
                return TopSectionKey$Cyber$Games$Line.f47131a;
            case 4:
                parcel.getClass();
                parcel.readInt();
                return TopSectionKey$Cyber$Games$Live.f47132a;
            case 5:
                parcel.getClass();
                parcel.readInt();
                return TopSectionKey$OneXGames$Categories.f47151a;
            case 6:
                parcel.getClass();
                parcel.readInt();
                return TopSectionKey$OneXGames$Spotlight.f47152a;
            case 7:
                parcel.getClass();
                parcel.readInt();
                return TopSectionKey$OneXGames$Tape.f47153a;
            case 8:
                parcel.getClass();
                parcel.readInt();
                return TopSectionKey$Sport$Champs$Live.f47154a;
            case 9:
                parcel.getClass();
                parcel.readInt();
                return TopSectionKey$Sport$FilterTape.f47155a;
            case 10:
                parcel.getClass();
                parcel.readInt();
                return TopSectionKey$Sport$Games$Line.f47156a;
            case 11:
                parcel.getClass();
                parcel.readInt();
                return TopSectionKey$Sport$Games$Live.f47157a;
            case 12:
                return new Trace(parcel, false);
            case 13:
                parcel.getClass();
                return new TransferScreenParams(parcel.readLong(), parcel.readLong());
            case 14:
                parcel.getClass();
                return new TransfersDisciplineFilter(parcel.readLong(), parcel.readString(), parcel.readString());
            case 15:
                parcel.getClass();
                long j = parcel.readLong();
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                while (i != i2) {
                    arrayList.add(TransfersDisciplineFilter.CREATOR.createFromParcel(parcel));
                    i++;
                }
                return new TransfersDisciplineFilterBottomParams(j, arrayList);
            case 16:
                parcel.getClass();
                TransferTimeFilterUiModel transferTimeFilterUiModel = (TransferTimeFilterUiModel) parcel.readParcelable(TransfersTimeFilterBottomParams.class.getClassLoader());
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                while (i != i3) {
                    arrayList2.add(parcel.readParcelable(TransfersTimeFilterBottomParams.class.getClassLoader()));
                    i++;
                }
                return new TransfersTimeFilterBottomParams(transferTimeFilterUiModel, arrayList2);
            case 17:
                parcel.getClass();
                return new UfcChampionshipParams(parcel.readLong(), parcel.readString());
            case 18:
                parcel.getClass();
                return new UfcGameParams(parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readInt() != 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                parcel.getClass();
                return new UfcPostGameParams(parcel.readLong(), parcel.readLong(), parcel.readString());
            case 20:
                parcel.getClass();
                return new UfcWeightClassRatingParams(kgz.valueOf(parcel.readString()), f7v0.valueOf(parcel.readString()));
            case 21:
                parcel.getClass();
                return new UniversalChampInfoParams(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
            case 22:
                parcel.getClass();
                return new UniversalChampParams(parcel.readLong(), parcel.readLong(), parcel.readString());
            case 23:
                parcel.getClass();
                return new UniversalChampPrizePoolParams(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
            case 24:
                parcel.getClass();
                return new UniversalChampResultsParams(parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readString());
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                parcel.getClass();
                return new UserActionButtonModel(parcel.readString(), gqt0.valueOf(parcel.readString()));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                parcel.getClass();
                return new UserId(parcel.readLong());
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                parcel.getClass();
                long j2 = parcel.readLong();
                long j3 = parcel.readLong();
                long j4 = parcel.readLong();
                boolean z = parcel.readInt() != 0;
                long j5 = parcel.readLong();
                boolean z2 = parcel.readInt() != 0;
                return new ValorantGameScreenParams(parcel.readInt(), j2, j3, j4, j5, parcel.readLong(), k1g.valueOf(parcel.readString()), parcel.readString(), z, z2);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                parcel.getClass();
                return new ValorantPostGameScreenParams(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readLong());
            default:
                parcel.getClass();
                int i4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i4);
                while (i != i4) {
                    arrayList3.add(Long.valueOf(parcel.readLong()));
                    i++;
                }
                return new VirtualCategoryDisciplinesParams(arrayList3);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f30303a) {
            case 0:
                return new TopSectionKey$Cyber$Champs$Line[i];
            case 1:
                return new TopSectionKey$Cyber$Champs$Live[i];
            case 2:
                return new TopSectionKey$Cyber$Disciplines[i];
            case 3:
                return new TopSectionKey$Cyber$Games$Line[i];
            case 4:
                return new TopSectionKey$Cyber$Games$Live[i];
            case 5:
                return new TopSectionKey$OneXGames$Categories[i];
            case 6:
                return new TopSectionKey$OneXGames$Spotlight[i];
            case 7:
                return new TopSectionKey$OneXGames$Tape[i];
            case 8:
                return new TopSectionKey$Sport$Champs$Live[i];
            case 9:
                return new TopSectionKey$Sport$FilterTape[i];
            case 10:
                return new TopSectionKey$Sport$Games$Line[i];
            case 11:
                return new TopSectionKey$Sport$Games$Live[i];
            case 12:
                return new Trace[i];
            case 13:
                return new TransferScreenParams[i];
            case 14:
                return new TransfersDisciplineFilter[i];
            case 15:
                return new TransfersDisciplineFilterBottomParams[i];
            case 16:
                return new TransfersTimeFilterBottomParams[i];
            case 17:
                return new UfcChampionshipParams[i];
            case 18:
                return new UfcGameParams[i];
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new UfcPostGameParams[i];
            case 20:
                return new UfcWeightClassRatingParams[i];
            case 21:
                return new UniversalChampInfoParams[i];
            case 22:
                return new UniversalChampParams[i];
            case 23:
                return new UniversalChampPrizePoolParams[i];
            case 24:
                return new UniversalChampResultsParams[i];
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new UserActionButtonModel[i];
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new UserId[i];
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new ValorantGameScreenParams[i];
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new ValorantPostGameScreenParams[i];
            default:
                return new VirtualCategoryDisciplinesParams[i];
        }
    }
}
