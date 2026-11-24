package org.xplatform.top.impl.presentation.ui.model;

import a.axq;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey;", "Landroid/os/Parcelable;", "BannerTape", "TopEvents", "VirtualGames", "Header", "Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$BannerTape;", "Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;", "Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$TopEvents;", "Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$VirtualGames;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface TopSectionKey extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$BannerTape;", "Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class BannerTape implements TopSectionKey {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BannerTape f47127a = new BannerTape();
        public static final Parcelable.Creator<BannerTape> CREATOR = new a();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BannerTape);
        }

        public final int hashCode() {
            return -668515232;
        }

        public final String toString() {
            return "BannerTape";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;", "Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey;", "TopEvents", "BannerTape", "VirtualGames", "Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$BannerTape;", "Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$TopEvents;", "Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$VirtualGames;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface Header extends TopSectionKey {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$BannerTape;", "Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class BannerTape implements Header {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final BannerTape f47138a = new BannerTape();
            public static final Parcelable.Creator<BannerTape> CREATOR = new g();

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof BannerTape);
            }

            public final int hashCode() {
                return 2140101213;
            }

            public final String toString() {
                return "BannerTape";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$TopEvents;", "Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class TopEvents implements Header {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final TopEvents f47149a = new TopEvents();
            public static final Parcelable.Creator<TopEvents> CREATOR = new r();

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof TopEvents);
            }

            public final int hashCode() {
                return 1417779455;
            }

            public final String toString() {
                return "TopEvents";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$VirtualGames;", "Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class VirtualGames implements Header {
            public static final Parcelable.Creator<VirtualGames> CREATOR = new s();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f47150a;
            public final String b;

            public VirtualGames(long j, String str) {
                str.getClass();
                this.f47150a = j;
                this.b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof VirtualGames)) {
                    return false;
                }
                VirtualGames virtualGames = (VirtualGames) obj;
                return this.f47150a == virtualGames.f47150a && Intrinsics.d(this.b, virtualGames.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (Long.hashCode(this.f47150a) * 31);
            }

            public final String toString() {
                StringBuilder sbO = axq.o(this.f47150a, "VirtualGames(categoryId=", ", title=", this.b);
                sbO.append(Separators.RPAREN);
                return sbO.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeLong(this.f47150a);
                parcel.writeString(this.b);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$TopEvents;", "Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class TopEvents implements TopSectionKey {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TopEvents f47158a = new TopEvents();
        public static final Parcelable.Creator<TopEvents> CREATOR = new t();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TopEvents);
        }

        public final int hashCode() {
            return 772989596;
        }

        public final String toString() {
            return "TopEvents";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$VirtualGames;", "Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class VirtualGames implements TopSectionKey {
        public static final Parcelable.Creator<VirtualGames> CREATOR = new u();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f47159a;

        public VirtualGames(long j) {
            this.f47159a = j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VirtualGames) && this.f47159a == ((VirtualGames) obj).f47159a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f47159a);
        }

        public final String toString() {
            return axq.h(this.f47159a, "VirtualGames(id=", Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeLong(this.f47159a);
        }
    }
}
