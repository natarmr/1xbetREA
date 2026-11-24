package org.xplatform.special_event.impl.alleventsgames.presentation;

import a.brm0;
import a.dw9;
import a.f140;
import a.rw2;
import a.twn;
import a.ua80;
import a.vqd;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams;", "Landroid/os/Parcelable;", "AllGames", "ParticipantGames", "StadiumGames", "Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams$AllGames;", "Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams$ParticipantGames;", "Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams$StadiumGames;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface AllEventGamesScreenParams extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams$AllGames;", "Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class AllGames implements AllEventGamesScreenParams {
        public static final Parcelable.Creator<AllGames> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f46961a;
        public final ArrayList b;

        public AllGames(int i, ArrayList arrayList) {
            this.f46961a = i;
            this.b = arrayList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AllGames)) {
                return false;
            }
            AllGames allGames = (AllGames) obj;
            return this.f46961a == allGames.f46961a && this.b.equals(allGames.b);
        }

        @Override // org.xplatform.special_event.impl.alleventsgames.presentation.AllEventGamesScreenParams
        /* JADX INFO: renamed from: getEventId, reason: from getter */
        public final int getF46963a() {
            return this.f46961a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.f46961a) * 31);
        }

        public final String toString() {
            return "AllGames(eventId=" + this.f46961a + ", teamsIds=" + this.b + Separators.RPAREN;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.f46961a);
            ArrayList arrayList = this.b;
            parcel.writeInt(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                parcel.writeLong(((Number) it.next()).longValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams$ParticipantGames;", "Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class ParticipantGames implements AllEventGamesScreenParams {
        public static final Parcelable.Creator<ParticipantGames> CREATOR = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f46962a;
        public final int b;
        public final String c;
        public final String d;
        public final long e;

        public ParticipantGames(int i, int i2, long j, String str, String str2) {
            str.getClass();
            str2.getClass();
            this.f46962a = i;
            this.b = i2;
            this.c = str;
            this.d = str2;
            this.e = j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ParticipantGames)) {
                return false;
            }
            ParticipantGames participantGames = (ParticipantGames) obj;
            return this.f46962a == participantGames.f46962a && this.b == participantGames.b && Intrinsics.d(this.c, participantGames.c) && Intrinsics.d(this.d, participantGames.d) && this.e == participantGames.e;
        }

        @Override // org.xplatform.special_event.impl.alleventsgames.presentation.AllEventGamesScreenParams
        /* JADX INFO: renamed from: getEventId, reason: from getter */
        public final int getF46963a() {
            return this.f46962a;
        }

        public final int hashCode() {
            return Long.hashCode(this.e) + ua80.b(ua80.b(twn.a(this.b, Integer.hashCode(this.f46962a) * 31, 31), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sbT = dw9.t("ParticipantGames(eventId=", this.f46962a, ", teamClId=", ", participantName=", this.b);
            f140.v(sbT, this.c, ", teamId=", this.d, ", sportId=");
            return brm0.k(this.e, Separators.RPAREN, sbT);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.f46962a);
            parcel.writeInt(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeLong(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams$StadiumGames;", "Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class StadiumGames implements AllEventGamesScreenParams {
        public static final Parcelable.Creator<StadiumGames> CREATOR = new d();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f46963a;
        public final long b;
        public final String c;

        public StadiumGames(String str, int i, long j) {
            str.getClass();
            this.f46963a = i;
            this.b = j;
            this.c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StadiumGames)) {
                return false;
            }
            StadiumGames stadiumGames = (StadiumGames) obj;
            return this.f46963a == stadiumGames.f46963a && this.b == stadiumGames.b && Intrinsics.d(this.c, stadiumGames.c);
        }

        @Override // org.xplatform.special_event.impl.alleventsgames.presentation.AllEventGamesScreenParams
        /* JADX INFO: renamed from: getEventId, reason: from getter */
        public final int getF46963a() {
            return this.f46963a;
        }

        public final int hashCode() {
            return this.c.hashCode() + rw2.b(Integer.hashCode(this.f46963a) * 31, 31, this.b);
        }

        public final String toString() {
            return rw2.o(vqd.q(this.f46963a, this.b, "StadiumGames(eventId=", ", stadiumId="), ", stadiumName=", this.c, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.f46963a);
            parcel.writeLong(this.b);
            parcel.writeString(this.c);
        }
    }

    /* JADX INFO: renamed from: getEventId */
    int getF46963a();
}
