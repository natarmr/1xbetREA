package org.xplatform.favorites.impl.presentation.adapters.models;

import a.axq;
import a.kng0;
import a.p6t0;
import a.rw2;
import a.rz4;
import a.twn;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\n\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\n\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem;", "La/p6t0;", "Landroid/os/Parcelable;", "All", "Live", "Line", "Results", "Teams", "Champs", "XGames", "Aggregator", "LiveCategory", "LineCategory", "Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Aggregator;", "Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$All;", "Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Champs;", "Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Line;", "Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$LineCategory;", "Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Live;", "Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$LiveCategory;", "Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Results;", "Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Teams;", "Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$XGames;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class FavoriteGroupHeaderUiItem implements p6t0, Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46634a;
    public final boolean b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Aggregator;", "Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Aggregator extends FavoriteGroupHeaderUiItem {
        public static final Parcelable.Creator<Aggregator> CREATOR = new a();
        public final boolean c;
        public final String d;
        public final int e;
        public final String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Aggregator(int i, String str, String str2, boolean z) {
            super(true, false);
            str.getClass();
            str2.getClass();
            this.c = z;
            this.d = str;
            this.e = i;
            this.f = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Aggregator)) {
                return false;
            }
            Aggregator aggregator = (Aggregator) obj;
            return this.c == aggregator.c && Intrinsics.d(this.d, aggregator.d) && this.e == aggregator.e && Intrinsics.d(this.f, aggregator.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + twn.a(this.e, ua80.b(Boolean.hashCode(this.c) * 31, 31, this.d), 31);
        }

        @Override // org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem
        /* JADX INFO: renamed from: p, reason: from getter */
        public final String getF() {
            return this.f;
        }

        public final String toString() {
            return rw2.k(this.e, ", headerButtonLabel=", this.f, Separators.RPAREN, axq.q("Aggregator(clearGroupButtonVisible=", ", headerName=", this.d, this.c, ", headerCounter="));
        }

        @Override // org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem
        /* JADX INFO: renamed from: u, reason: from getter */
        public final int getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.c ? 1 : 0);
            parcel.writeString(this.d);
            parcel.writeInt(this.e);
            parcel.writeString(this.f);
        }

        @Override // org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem
        /* JADX INFO: renamed from: z, reason: from getter */
        public final String getD() {
            return this.d;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$All;", "Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class All extends FavoriteGroupHeaderUiItem {
        public static final Parcelable.Creator<All> CREATOR = new b();
        public final String c;
        public final int d;
        public final boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public All(String str, int i, boolean z) {
            super(true, false);
            str.getClass();
            this.c = str;
            this.d = i;
            this.e = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof All)) {
                return false;
            }
            All all = (All) obj;
            return Intrinsics.d(this.c, all.c) && this.d == all.d && this.e == all.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + twn.a(this.d, this.c.hashCode() * 31, 31);
        }

        public final String toString() {
            return rw2.p(kng0.p(this.d, "All(headerName=", this.c, ", headerCounter=", ", clearGroupButtonVisible="), this.e, Separators.RPAREN);
        }

        @Override // org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem
        /* JADX INFO: renamed from: u, reason: from getter */
        public final int getE() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e ? 1 : 0);
        }

        @Override // org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem
        /* JADX INFO: renamed from: z, reason: from getter */
        public final String getD() {
            return this.c;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Champs;", "Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Champs extends FavoriteGroupHeaderUiItem {
        public static final Parcelable.Creator<Champs> CREATOR = new c();
        public final boolean c;
        public final String d;
        public final int e;
        public final String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Champs(int i, String str, String str2, boolean z) {
            super(true, false);
            str.getClass();
            str2.getClass();
            this.c = z;
            this.d = str;
            this.e = i;
            this.f = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Champs)) {
                return false;
            }
            Champs champs = (Champs) obj;
            return this.c == champs.c && Intrinsics.d(this.d, champs.d) && this.e == champs.e && Intrinsics.d(this.f, champs.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + twn.a(this.e, ua80.b(Boolean.hashCode(this.c) * 31, 31, this.d), 31);
        }

        @Override // org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem
        /* JADX INFO: renamed from: p, reason: from getter */
        public final String getF() {
            return this.f;
        }

        public final String toString() {
            return rw2.k(this.e, ", headerButtonLabel=", this.f, Separators.RPAREN, axq.q("Champs(clearGroupButtonVisible=", ", headerName=", this.d, this.c, ", headerCounter="));
        }

        @Override // org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem
        /* JADX INFO: renamed from: u, reason: from getter */
        public final int getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.c ? 1 : 0);
            parcel.writeString(this.d);
            parcel.writeInt(this.e);
            parcel.writeString(this.f);
        }

        @Override // org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem
        /* JADX INFO: renamed from: z, reason: from getter */
        public final String getD() {
            return this.d;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Line;", "Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Line extends FavoriteGroupHeaderUiItem {
        public static final Parcelable.Creator<Line> CREATOR = new d();
        public final boolean c;
        public final String d;
        public final int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Line(String str, int i, boolean z) {
            super(false, false);
            str.getClass();
            this.c = z;
            this.d = str;
            this.e = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Line)) {
                return false;
            }
            Line line = (Line) obj;
            return this.c == line.c && Intrinsics.d(this.d, line.d) && this.e == line.e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + ua80.b(Boolean.hashCode(this.c) * 31, 31, this.d);
        }

        @Override // org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem
        /* JADX INFO: renamed from: p */
        public final String getF() {
            return "";
        }

        public final String toString() {
            return rz4.j(this.e, Separators.RPAREN, axq.q("Line(clearGroupButtonVisible=", ", headerName=", this.d, this.c, ", headerCounter="));
        }

        @Override // org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem
        /* JADX INFO: renamed from: u, reason: from getter */
        public final int getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.c ? 1 : 0);
            parcel.writeString(this.d);
            parcel.writeInt(this.e);
        }

        @Override // org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem
        /* JADX INFO: renamed from: z, reason: from getter */
        public final String getD() {
            return this.d;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$LineCategory;", "Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class LineCategory extends FavoriteGroupHeaderUiItem {
        public static final Parcelable.Creator<LineCategory> CREATOR = new e();
        public final boolean c;
        public final String d;
        public final int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LineCategory(String str, int i, boolean z) {
            super(false, false);
            str.getClass();
            this.c = z;
            this.d = str;
            this.e = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LineCategory)) {
                return false;
            }
            LineCategory lineCategory = (LineCategory) obj;
            return this.c == lineCategory.c && Intrinsics.d(this.d, lineCategory.d) && this.e == lineCategory.e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + ua80.b(Boolean.hashCode(this.c) * 31, 31, this.d);
        }

        @Override // org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem
        /* JADX INFO: renamed from: p */
        public final String getF() {
            return "";
        }

        public final String toString() {
            return rz4.j(this.e, Separators.RPAREN, axq.q("LineCategory(clearGroupButtonVisible=", ", headerName=", this.d, this.c, ", headerCounter="));
        }

        @Override // org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem
        /* JADX INFO: renamed from: u, reason: from getter */
        public final int getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.c ? 1 : 0);
            parcel.writeString(this.d);
            parcel.writeInt(this.e);
        }

        @Override // org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem
        /* JADX INFO: renamed from: z, reason: from getter */
        public final String getD() {
            return this.d;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Live;", "Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Live extends FavoriteGroupHeaderUiItem {
        public static final Parcelable.Creator<Live> CREATOR = new f();
        public final boolean c;
        public final String d;
        public final int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Live(String str, int i, boolean z) {
            super(false, true);
            str.getClass();
            this.c = z;
            this.d = str;
            this.e = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Live)) {
                return false;
            }
            Live live = (Live) obj;
            return this.c == live.c && Intrinsics.d(this.d, live.d) && this.e == live.e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + ua80.b(Boolean.hashCode(this.c) * 31, 31, this.d);
        }

        @Override // org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem
        /* JADX INFO: renamed from: p */
        public final String getF() {
            return "";
        }

        public final String toString() {
            return rz4.j(this.e, Separators.RPAREN, axq.q("Live(clearGroupButtonVisible=", ", headerName=", this.d, this.c, ", headerCounter="));
        }

        @Override // org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem
        /* JADX INFO: renamed from: u, reason: from getter */
        public final int getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.c ? 1 : 0);
            parcel.writeString(this.d);
            parcel.writeInt(this.e);
        }

        @Override // org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem
        /* JADX INFO: renamed from: z, reason: from getter */
        public final String getD() {
            return this.d;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$LiveCategory;", "Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class LiveCategory extends FavoriteGroupHeaderUiItem {
        public static final Parcelable.Creator<LiveCategory> CREATOR = new g();
        public final boolean c;
        public final String d;
        public final int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LiveCategory(String str, int i, boolean z) {
            super(false, true);
            str.getClass();
            this.c = z;
            this.d = str;
            this.e = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LiveCategory)) {
                return false;
            }
            LiveCategory liveCategory = (LiveCategory) obj;
            return this.c == liveCategory.c && Intrinsics.d(this.d, liveCategory.d) && this.e == liveCategory.e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + ua80.b(Boolean.hashCode(this.c) * 31, 31, this.d);
        }

        @Override // org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem
        /* JADX INFO: renamed from: p */
        public final String getF() {
            return "";
        }

        public final String toString() {
            return rz4.j(this.e, Separators.RPAREN, axq.q("LiveCategory(clearGroupButtonVisible=", ", headerName=", this.d, this.c, ", headerCounter="));
        }

        @Override // org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem
        /* JADX INFO: renamed from: u, reason: from getter */
        public final int getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.c ? 1 : 0);
            parcel.writeString(this.d);
            parcel.writeInt(this.e);
        }

        @Override // org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem
        /* JADX INFO: renamed from: z, reason: from getter */
        public final String getD() {
            return this.d;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Results;", "Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Results extends FavoriteGroupHeaderUiItem {
        public static final Parcelable.Creator<Results> CREATOR = new h();
        public final boolean c;
        public final String d;
        public final int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Results(String str, int i, boolean z) {
            super(false, false);
            str.getClass();
            this.c = z;
            this.d = str;
            this.e = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Results)) {
                return false;
            }
            Results results = (Results) obj;
            return this.c == results.c && Intrinsics.d(this.d, results.d) && this.e == results.e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + ua80.b(Boolean.hashCode(this.c) * 31, 31, this.d);
        }

        @Override // org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem
        /* JADX INFO: renamed from: p */
        public final String getF() {
            return "";
        }

        public final String toString() {
            return rz4.j(this.e, Separators.RPAREN, axq.q("Results(clearGroupButtonVisible=", ", headerName=", this.d, this.c, ", headerCounter="));
        }

        @Override // org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem
        /* JADX INFO: renamed from: u, reason: from getter */
        public final int getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.c ? 1 : 0);
            parcel.writeString(this.d);
            parcel.writeInt(this.e);
        }

        @Override // org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem
        /* JADX INFO: renamed from: z, reason: from getter */
        public final String getD() {
            return this.d;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Teams;", "Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Teams extends FavoriteGroupHeaderUiItem {
        public static final Parcelable.Creator<Teams> CREATOR = new i();
        public final boolean c;
        public final String d;
        public final int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Teams(String str, int i, boolean z) {
            super(true, false);
            str.getClass();
            this.c = z;
            this.d = str;
            this.e = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Teams)) {
                return false;
            }
            Teams teams = (Teams) obj;
            return this.c == teams.c && Intrinsics.d(this.d, teams.d) && this.e == teams.e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + ua80.b(Boolean.hashCode(this.c) * 31, 31, this.d);
        }

        @Override // org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem
        /* JADX INFO: renamed from: p */
        public final String getF() {
            return "";
        }

        public final String toString() {
            return rz4.j(this.e, Separators.RPAREN, axq.q("Teams(clearGroupButtonVisible=", ", headerName=", this.d, this.c, ", headerCounter="));
        }

        @Override // org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem
        /* JADX INFO: renamed from: u, reason: from getter */
        public final int getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.c ? 1 : 0);
            parcel.writeString(this.d);
            parcel.writeInt(this.e);
        }

        @Override // org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem
        /* JADX INFO: renamed from: z, reason: from getter */
        public final String getD() {
            return this.d;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$XGames;", "Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class XGames extends FavoriteGroupHeaderUiItem {
        public static final Parcelable.Creator<XGames> CREATOR = new j();
        public final boolean c;
        public final String d;
        public final int e;
        public final String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public XGames(int i, String str, String str2, boolean z) {
            super(true, false);
            str.getClass();
            str2.getClass();
            this.c = z;
            this.d = str;
            this.e = i;
            this.f = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof XGames)) {
                return false;
            }
            XGames xGames = (XGames) obj;
            return this.c == xGames.c && Intrinsics.d(this.d, xGames.d) && this.e == xGames.e && Intrinsics.d(this.f, xGames.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + twn.a(this.e, ua80.b(Boolean.hashCode(this.c) * 31, 31, this.d), 31);
        }

        @Override // org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem
        /* JADX INFO: renamed from: p, reason: from getter */
        public final String getF() {
            return this.f;
        }

        public final String toString() {
            return rw2.k(this.e, ", headerButtonLabel=", this.f, Separators.RPAREN, axq.q("XGames(clearGroupButtonVisible=", ", headerName=", this.d, this.c, ", headerCounter="));
        }

        @Override // org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem
        /* JADX INFO: renamed from: u, reason: from getter */
        public final int getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.c ? 1 : 0);
            parcel.writeString(this.d);
            parcel.writeInt(this.e);
            parcel.writeString(this.f);
        }

        @Override // org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem
        /* JADX INFO: renamed from: z, reason: from getter */
        public final String getD() {
            return this.d;
        }
    }

    public FavoriteGroupHeaderUiItem(boolean z, boolean z2) {
        this.f46634a = z;
        this.b = z2;
    }

    /* JADX INFO: renamed from: p */
    public String getF() {
        return "";
    }

    /* JADX INFO: renamed from: u */
    public abstract int getE();

    /* JADX INFO: renamed from: z */
    public abstract String getD();
}
