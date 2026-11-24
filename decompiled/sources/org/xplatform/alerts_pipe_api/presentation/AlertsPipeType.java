package org.xplatform.alerts_pipe_api.presentation;

import a.kng0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tÊ\u0001\u0002\b\u000b¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType;", "Landroid/os/Parcelable;", "UserAgreementDocumentsDialog", "IdentificationAlertKzAlert", "KzFirstDepositBottom", "NotIdentifiedKzAlert", "Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType$IdentificationAlertKzAlert;", "Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType$KzFirstDepositBottom;", "Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType$NotIdentifiedKzAlert;", "Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType$UserAgreementDocumentsDialog;", "api", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface AlertsPipeType extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType$IdentificationAlertKzAlert;", "Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class IdentificationAlertKzAlert implements AlertsPipeType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final IdentificationAlertKzAlert f46312a = new IdentificationAlertKzAlert();
        public static final Parcelable.Creator<IdentificationAlertKzAlert> CREATOR = new a();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof IdentificationAlertKzAlert);
        }

        public final int hashCode() {
            return 396296068;
        }

        public final String toString() {
            return "IdentificationAlertKzAlert";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType$KzFirstDepositBottom;", "Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class KzFirstDepositBottom implements AlertsPipeType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final KzFirstDepositBottom f46313a = new KzFirstDepositBottom();
        public static final Parcelable.Creator<KzFirstDepositBottom> CREATOR = new b();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof KzFirstDepositBottom);
        }

        public final int hashCode() {
            return 873120493;
        }

        public final String toString() {
            return "KzFirstDepositBottom";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType$NotIdentifiedKzAlert;", "Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class NotIdentifiedKzAlert implements AlertsPipeType {
        public static final Parcelable.Creator<NotIdentifiedKzAlert> CREATOR = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46314a;

        public NotIdentifiedKzAlert(String str) {
            str.getClass();
            this.f46314a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotIdentifiedKzAlert) && Intrinsics.d(this.f46314a, ((NotIdentifiedKzAlert) obj).f46314a);
        }

        public final int hashCode() {
            return this.f46314a.hashCode();
        }

        public final String toString() {
            return kng0.l("NotIdentifiedKzAlert(errorMessage=", this.f46314a, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f46314a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType$UserAgreementDocumentsDialog;", "Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class UserAgreementDocumentsDialog implements AlertsPipeType {
        public static final Parcelable.Creator<UserAgreementDocumentsDialog> CREATOR = new d();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f46315a;

        public UserAgreementDocumentsDialog(boolean z) {
            this.f46315a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserAgreementDocumentsDialog) && this.f46315a == ((UserAgreementDocumentsDialog) obj).f46315a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f46315a);
        }

        public final String toString() {
            return defpackage.c.d("UserAgreementDocumentsDialog(withStatusError=", Separators.RPAREN, this.f46315a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.f46315a ? 1 : 0);
        }
    }
}
