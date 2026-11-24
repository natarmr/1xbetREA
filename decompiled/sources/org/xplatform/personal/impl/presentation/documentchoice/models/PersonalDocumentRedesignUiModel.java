package org.xplatform.personal.impl.presentation.documentchoice.models;

import a.brm0;
import a.d4d;
import a.d860;
import a.p6t0;
import a.ua80;
import a.vqd;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lorg/xplatform/personal/impl/presentation/documentchoice/models/PersonalDocumentRedesignUiModel;", "La/p6t0;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PersonalDocumentRedesignUiModel implements p6t0, Parcelable {
    public static final Parcelable.Creator<PersonalDocumentRedesignUiModel> CREATOR = new d860((byte) 9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46783a;
    public final String b;
    public final boolean c;
    public final d4d d;

    public PersonalDocumentRedesignUiModel(int i, String str, boolean z, d4d d4dVar) {
        str.getClass();
        d4dVar.getClass();
        this.f46783a = i;
        this.b = str;
        this.c = z;
        this.d = d4dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalDocumentRedesignUiModel)) {
            return false;
        }
        PersonalDocumentRedesignUiModel personalDocumentRedesignUiModel = (PersonalDocumentRedesignUiModel) obj;
        return this.f46783a == personalDocumentRedesignUiModel.f46783a && Intrinsics.d(this.b, personalDocumentRedesignUiModel.b) && this.c == personalDocumentRedesignUiModel.c && this.d == personalDocumentRedesignUiModel.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(ua80.b(Integer.hashCode(this.f46783a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f46783a, "PersonalDocumentRedesignUiModel(documentId=", ", documentTitle=", this.b, ", isSelected=");
        sbR.append(this.c);
        sbR.append(", textColor=");
        sbR.append(this.d);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f46783a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d.name());
    }
}
