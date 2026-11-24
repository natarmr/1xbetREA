package org.xplatform.cyber.section.api.domain.entity;

import a.a0h;
import a.a8z;
import a.ahi0;
import a.jiy;
import a.maz;
import a.wez;
import a.xng;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;", "Landroid/os/Parcelable;", "Companion", "FromMain", "FromPopular", "FromNewPopular", "FromSection", "FromGame", "a/a0h", "Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromGame;", "Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromMain;", "Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromNewPopular;", "Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromPopular;", "Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromSection;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class CyberGamesParentSectionModel implements Parcelable {
    public static final a0h Companion = new a0h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a8z f46557a = maz.a(wez.f39042a, new xng(12));

    @ahi0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromGame;", "Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;", "La/jiy;", "serializer", "()La/jiy;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class FromGame extends CyberGamesParentSectionModel {
        public static final FromGame INSTANCE = new FromGame();
        public static final Parcelable.Creator<FromGame> CREATOR = new e();
        public static final /* synthetic */ a8z b = maz.a(wez.f39042a, new xng(13));

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final jiy serializer() {
            return (jiy) b.getValue();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @ahi0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromMain;", "Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;", "La/jiy;", "serializer", "()La/jiy;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class FromMain extends CyberGamesParentSectionModel {
        public static final FromMain INSTANCE = new FromMain();
        public static final Parcelable.Creator<FromMain> CREATOR = new f();
        public static final /* synthetic */ a8z b = maz.a(wez.f39042a, new xng(14));

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final jiy serializer() {
            return (jiy) b.getValue();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @ahi0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromNewPopular;", "Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;", "La/jiy;", "serializer", "()La/jiy;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class FromNewPopular extends CyberGamesParentSectionModel {
        public static final FromNewPopular INSTANCE = new FromNewPopular();
        public static final Parcelable.Creator<FromNewPopular> CREATOR = new g();
        public static final /* synthetic */ a8z b = maz.a(wez.f39042a, new xng(15));

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final jiy serializer() {
            return (jiy) b.getValue();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @ahi0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromPopular;", "Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;", "La/jiy;", "serializer", "()La/jiy;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class FromPopular extends CyberGamesParentSectionModel {
        public static final FromPopular INSTANCE = new FromPopular();
        public static final Parcelable.Creator<FromPopular> CREATOR = new h();
        public static final /* synthetic */ a8z b = maz.a(wez.f39042a, new xng(16));

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final jiy serializer() {
            return (jiy) b.getValue();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @ahi0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromSection;", "Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;", "La/jiy;", "serializer", "()La/jiy;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class FromSection extends CyberGamesParentSectionModel {
        public static final FromSection INSTANCE = new FromSection();
        public static final Parcelable.Creator<FromSection> CREATOR = new i();
        public static final /* synthetic */ a8z b = maz.a(wez.f39042a, new xng(17));

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final jiy serializer() {
            return (jiy) b.getValue();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
