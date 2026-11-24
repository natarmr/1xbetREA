package org.xplatform.consultantchat.presentation.dialogs.senderror.model;

import a.b1j;
import a.hne;
import a.kng0;
import a.rw2;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lorg/xplatform/consultantchat/presentation/dialogs/senderror/model/MessageErrorState;", "Landroid/os/Parcelable;", "RetryUploading", "Resend", "RemoveMessage", "RetryDownloading", "Lorg/xplatform/consultantchat/presentation/dialogs/senderror/model/MessageErrorState$RemoveMessage;", "Lorg/xplatform/consultantchat/presentation/dialogs/senderror/model/MessageErrorState$Resend;", "Lorg/xplatform/consultantchat/presentation/dialogs/senderror/model/MessageErrorState$RetryDownloading;", "Lorg/xplatform/consultantchat/presentation/dialogs/senderror/model/MessageErrorState$RetryUploading;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface MessageErrorState extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/consultantchat/presentation/dialogs/senderror/model/MessageErrorState$RemoveMessage;", "Lorg/xplatform/consultantchat/presentation/dialogs/senderror/model/MessageErrorState;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class RemoveMessage implements MessageErrorState {
        public static final Parcelable.Creator<RemoveMessage> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46452a;

        public RemoveMessage(String str) {
            str.getClass();
            this.f46452a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoveMessage) && Intrinsics.d(this.f46452a, ((RemoveMessage) obj).f46452a);
        }

        public final int hashCode() {
            return this.f46452a.hashCode();
        }

        public final String toString() {
            return kng0.l("RemoveMessage(keyForLocalStore=", this.f46452a, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f46452a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/consultantchat/presentation/dialogs/senderror/model/MessageErrorState$Resend;", "Lorg/xplatform/consultantchat/presentation/dialogs/senderror/model/MessageErrorState;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Resend implements MessageErrorState {
        public static final Parcelable.Creator<Resend> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46453a;

        public Resend(String str) {
            str.getClass();
            this.f46453a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Resend) && Intrinsics.d(this.f46453a, ((Resend) obj).f46453a);
        }

        public final int hashCode() {
            return this.f46453a.hashCode();
        }

        public final String toString() {
            return kng0.l("Resend(localMessageId=", this.f46453a, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f46453a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/consultantchat/presentation/dialogs/senderror/model/MessageErrorState$RetryDownloading;", "Lorg/xplatform/consultantchat/presentation/dialogs/senderror/model/MessageErrorState;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class RetryDownloading implements MessageErrorState {
        public static final Parcelable.Creator<RetryDownloading> CREATOR = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46454a;
        public final String b;
        public final long c;
        public final boolean d;

        public RetryDownloading(long j, String str, String str2, boolean z) {
            str.getClass();
            str2.getClass();
            this.f46454a = str;
            this.b = str2;
            this.c = j;
            this.d = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RetryDownloading)) {
                return false;
            }
            RetryDownloading retryDownloading = (RetryDownloading) obj;
            return Intrinsics.d(this.f46454a, retryDownloading.f46454a) && Intrinsics.d(this.b, retryDownloading.b) && this.c == retryDownloading.c && this.d == retryDownloading.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + rw2.b(ua80.b(this.f46454a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sbN = b1j.n("RetryDownloading(fileName=", this.f46454a, ", mediaId=", this.b, ", size=");
            hne.t(this.c, ", isFile=", sbN, this.d);
            sbN.append(Separators.RPAREN);
            return sbN.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f46454a);
            parcel.writeString(this.b);
            parcel.writeLong(this.c);
            parcel.writeInt(this.d ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/consultantchat/presentation/dialogs/senderror/model/MessageErrorState$RetryUploading;", "Lorg/xplatform/consultantchat/presentation/dialogs/senderror/model/MessageErrorState;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class RetryUploading implements MessageErrorState {
        public static final Parcelable.Creator<RetryUploading> CREATOR = new d();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46455a;

        public RetryUploading(String str) {
            str.getClass();
            this.f46455a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RetryUploading) && Intrinsics.d(this.f46455a, ((RetryUploading) obj).f46455a);
        }

        public final int hashCode() {
            return this.f46455a.hashCode();
        }

        public final String toString() {
            return kng0.l("RetryUploading(localMessageId=", this.f46455a, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f46455a);
        }
    }
}
