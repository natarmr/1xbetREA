package org.xplatform.security.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lorg/xplatform/security/api/navigation/EndFlowNavigation;", "Landroid/os/Parcelable;", "ToPersonalDataScreen", "ToMailingManagementScreen", "ToCustomScreen", "ToRsSelfExclusionScreen", "Lorg/xplatform/security/api/navigation/EndFlowNavigation$ToCustomScreen;", "Lorg/xplatform/security/api/navigation/EndFlowNavigation$ToMailingManagementScreen;", "Lorg/xplatform/security/api/navigation/EndFlowNavigation$ToPersonalDataScreen;", "Lorg/xplatform/security/api/navigation/EndFlowNavigation$ToRsSelfExclusionScreen;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface EndFlowNavigation extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/security/api/navigation/EndFlowNavigation$ToCustomScreen;", "Lorg/xplatform/security/api/navigation/EndFlowNavigation;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class ToCustomScreen implements EndFlowNavigation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ToCustomScreen f46924a = new ToCustomScreen();
        public static final Parcelable.Creator<ToCustomScreen> CREATOR = new a();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ToCustomScreen);
        }

        public final int hashCode() {
            return 1322270478;
        }

        public final String toString() {
            return "ToCustomScreen";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/security/api/navigation/EndFlowNavigation$ToMailingManagementScreen;", "Lorg/xplatform/security/api/navigation/EndFlowNavigation;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class ToMailingManagementScreen implements EndFlowNavigation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ToMailingManagementScreen f46925a = new ToMailingManagementScreen();
        public static final Parcelable.Creator<ToMailingManagementScreen> CREATOR = new b();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ToMailingManagementScreen);
        }

        public final int hashCode() {
            return 1888426761;
        }

        public final String toString() {
            return "ToMailingManagementScreen";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/security/api/navigation/EndFlowNavigation$ToPersonalDataScreen;", "Lorg/xplatform/security/api/navigation/EndFlowNavigation;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class ToPersonalDataScreen implements EndFlowNavigation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ToPersonalDataScreen f46926a = new ToPersonalDataScreen();
        public static final Parcelable.Creator<ToPersonalDataScreen> CREATOR = new c();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ToPersonalDataScreen);
        }

        public final int hashCode() {
            return -1893390809;
        }

        public final String toString() {
            return "ToPersonalDataScreen";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/security/api/navigation/EndFlowNavigation$ToRsSelfExclusionScreen;", "Lorg/xplatform/security/api/navigation/EndFlowNavigation;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class ToRsSelfExclusionScreen implements EndFlowNavigation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ToRsSelfExclusionScreen f46927a = new ToRsSelfExclusionScreen();
        public static final Parcelable.Creator<ToRsSelfExclusionScreen> CREATOR = new d();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ToRsSelfExclusionScreen);
        }

        public final int hashCode() {
            return 1995489852;
        }

        public final String toString() {
            return "ToRsSelfExclusionScreen";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
