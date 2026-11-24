package org.xplatform.registration_default.impl.presentation.udf.state.models.fields;

import a.h9g;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/DocumentStateModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class DocumentStateModel implements Parcelable {
    public static final Parcelable.Creator<DocumentStateModel> CREATOR = new h9g((byte) 22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46876a;
    public final String b;

    public DocumentStateModel(int i, String str) {
        str.getClass();
        this.f46876a = i;
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
        if (!(obj instanceof DocumentStateModel)) {
            return false;
        }
        DocumentStateModel documentStateModel = (DocumentStateModel) obj;
        return this.f46876a == documentStateModel.f46876a && Intrinsics.d(this.b, documentStateModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f46876a) * 31);
    }

    public final String toString() {
        return c.b(this.f46876a, "DocumentStateModel(id=", ", documentName=", this.b, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f46876a);
        parcel.writeString(this.b);
    }
}
