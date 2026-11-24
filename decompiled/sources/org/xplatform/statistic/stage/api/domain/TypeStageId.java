package org.xplatform.statistic.stage.api.domain;

import a.kng0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lorg/xplatform/statistic/stage/api/domain/TypeStageId;", "Landroid/os/Parcelable;", "Game", "Champ", "Lorg/xplatform/statistic/stage/api/domain/TypeStageId$Champ;", "Lorg/xplatform/statistic/stage/api/domain/TypeStageId$Game;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface TypeStageId extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/stage/api/domain/TypeStageId$Champ;", "Lorg/xplatform/statistic/stage/api/domain/TypeStageId;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Champ implements TypeStageId {
        public static final Parcelable.Creator<Champ> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f47067a;

        public Champ(String str) {
            str.getClass();
            this.f47067a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Champ) && Intrinsics.d(this.f47067a, ((Champ) obj).f47067a);
        }

        public final int hashCode() {
            return this.f47067a.hashCode();
        }

        public final String toString() {
            return kng0.l("Champ(id=", this.f47067a, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f47067a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/stage/api/domain/TypeStageId$Game;", "Lorg/xplatform/statistic/stage/api/domain/TypeStageId;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Game implements TypeStageId {
        public static final Parcelable.Creator<Game> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f47068a;

        public Game(String str) {
            str.getClass();
            this.f47068a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Game) && Intrinsics.d(this.f47068a, ((Game) obj).f47068a);
        }

        public final int hashCode() {
            return this.f47068a.hashCode();
        }

        public final String toString() {
            return kng0.l("Game(id=", this.f47068a, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f47068a);
        }
    }
}
