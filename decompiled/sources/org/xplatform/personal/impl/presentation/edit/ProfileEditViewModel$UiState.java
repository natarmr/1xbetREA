package org.xplatform.personal.impl.presentation.edit;

import a.w2c0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"org/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState", "Landroid/os/Parcelable;", "Loading", "Loaded", "Error", "Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Error;", "Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;", "Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loading;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface ProfileEditViewModel$UiState extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Error;", "Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Error implements ProfileEditViewModel$UiState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Error f46785a = new Error();
        public static final Parcelable.Creator<Error> CREATOR = new c();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return -1738916745;
        }

        public final String toString() {
            return "Error";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;", "Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Loaded implements ProfileEditViewModel$UiState {
        public static final Parcelable.Creator<Loaded> CREATOR = new d();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f46786a;

        public Loaded(Map map) {
            this.f46786a = map;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loaded) && this.f46786a.equals(((Loaded) obj).f46786a);
        }

        public final int hashCode() {
            return this.f46786a.hashCode();
        }

        public final String toString() {
            return "Loaded(items=" + this.f46786a + Separators.RPAREN;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Map map = this.f46786a;
            parcel.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                parcel.writeString(((w2c0) entry.getKey()).name());
                parcel.writeParcelable((Parcelable) entry.getValue(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loading;", "Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Loading implements ProfileEditViewModel$UiState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Loading f46787a = new Loading();
        public static final Parcelable.Creator<Loading> CREATOR = new e();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1458924523;
        }

        public final String toString() {
            return "Loading";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
