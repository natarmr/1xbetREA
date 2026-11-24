package org.xplatform.consultantchat.presentation.dialogs.file.model;

import a.cs0;
import a.twn;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lorg/xplatform/consultantchat/presentation/dialogs/file/model/FileBottomDialogResult;", "Landroid/os/Parcelable;", "ImageResult", "FileResult", "Lorg/xplatform/consultantchat/presentation/dialogs/file/model/FileBottomDialogResult$FileResult;", "Lorg/xplatform/consultantchat/presentation/dialogs/file/model/FileBottomDialogResult$ImageResult;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface FileBottomDialogResult extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/consultantchat/presentation/dialogs/file/model/FileBottomDialogResult$FileResult;", "Lorg/xplatform/consultantchat/presentation/dialogs/file/model/FileBottomDialogResult;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class FileResult implements FileBottomDialogResult {
        public static final Parcelable.Creator<FileResult> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f46448a;

        public FileResult(File file) {
            file.getClass();
            this.f46448a = file;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FileResult) && Intrinsics.d(this.f46448a, ((FileResult) obj).f46448a);
        }

        public final int hashCode() {
            return this.f46448a.hashCode();
        }

        public final String toString() {
            return "FileResult(file=" + this.f46448a + Separators.RPAREN;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeSerializable(this.f46448a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/consultantchat/presentation/dialogs/file/model/FileBottomDialogResult$ImageResult;", "Lorg/xplatform/consultantchat/presentation/dialogs/file/model/FileBottomDialogResult;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class ImageResult implements FileBottomDialogResult {
        public static final Parcelable.Creator<ImageResult> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f46449a;

        public ImageResult(List list) {
            list.getClass();
            this.f46449a = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ImageResult) && Intrinsics.d(this.f46449a, ((ImageResult) obj).f46449a);
        }

        public final int hashCode() {
            return this.f46449a.hashCode();
        }

        public final String toString() {
            return twn.r(this.f46449a, "ImageResult(files=", Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Iterator itT = cs0.t(this.f46449a, parcel);
            while (itT.hasNext()) {
                parcel.writeSerializable((Serializable) itT.next());
            }
        }
    }
}
