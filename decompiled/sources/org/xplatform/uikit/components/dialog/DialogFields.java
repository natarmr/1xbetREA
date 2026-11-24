package org.xplatform.uikit.components.dialog;

import a.h9g;
import a.n12;
import a.rw2;
import a.twn;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/uikit/components/dialog/DialogFields;", "Landroid/os/Parcelable;", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class DialogFields implements Parcelable {
    public static final Parcelable.Creator<DialogFields> CREATOR = new h9g(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f47242a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final String f;
    public final CharSequence g;
    public final ActionDialogButtonStyle h;
    public final int i;
    public final n12 j;
    public final boolean k;

    public /* synthetic */ DialogFields(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, String str, String str2, String str3, String str4, ActionDialogButtonStyle actionDialogButtonStyle, n12 n12Var, boolean z, int i) {
        this((i & 1) != 0 ? null : charSequence, (i & 2) != 0 ? null : charSequence2, charSequence3, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : actionDialogButtonStyle, 0, n12Var, (i & 1024) != 0 ? false : z);
    }

    public static DialogFields a(DialogFields dialogFields, String str, String str2, int i, int i2) {
        CharSequence charSequence = dialogFields.f47242a;
        CharSequence charSequence2 = str;
        if ((i2 & 2) != 0) {
            charSequence2 = dialogFields.b;
        }
        CharSequence charSequence3 = charSequence2;
        CharSequence charSequence4 = dialogFields.c;
        CharSequence charSequence5 = dialogFields.d;
        CharSequence charSequence6 = dialogFields.e;
        String str3 = dialogFields.f;
        CharSequence charSequence7 = str2;
        if ((i2 & 64) != 0) {
            charSequence7 = dialogFields.g;
        }
        CharSequence charSequence8 = charSequence7;
        ActionDialogButtonStyle actionDialogButtonStyle = dialogFields.h;
        int i3 = (i2 & 256) != 0 ? dialogFields.i : i;
        n12 n12Var = dialogFields.j;
        boolean z = dialogFields.k;
        charSequence4.getClass();
        n12Var.getClass();
        return new DialogFields(charSequence, charSequence3, charSequence4, charSequence5, charSequence6, str3, charSequence8, actionDialogButtonStyle, i3, n12Var, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogFields)) {
            return false;
        }
        DialogFields dialogFields = (DialogFields) obj;
        return Intrinsics.d(this.f47242a, dialogFields.f47242a) && Intrinsics.d(this.b, dialogFields.b) && Intrinsics.d(this.c, dialogFields.c) && Intrinsics.d(this.d, dialogFields.d) && Intrinsics.d(this.e, dialogFields.e) && Intrinsics.d(this.f, dialogFields.f) && Intrinsics.d(this.g, dialogFields.g) && Intrinsics.d(this.h, dialogFields.h) && this.i == dialogFields.i && this.j == dialogFields.j && this.k == dialogFields.k;
    }

    public final int hashCode() {
        CharSequence charSequence = this.f47242a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31)) * 31;
        CharSequence charSequence3 = this.d;
        int iHashCode3 = (iHashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        CharSequence charSequence4 = this.e;
        int iHashCode4 = (iHashCode3 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
        String str = this.f;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence5 = this.g;
        int iHashCode6 = (iHashCode5 + (charSequence5 == null ? 0 : charSequence5.hashCode())) * 31;
        ActionDialogButtonStyle actionDialogButtonStyle = this.h;
        return Boolean.hashCode(this.k) + ((this.j.hashCode() + twn.a(this.i, (iHashCode6 + (actionDialogButtonStyle != null ? actionDialogButtonStyle.hashCode() : 0)) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogFields(title=");
        sb.append((Object) this.f47242a);
        sb.append(", message=");
        sb.append((Object) this.b);
        sb.append(", positiveTextButton=");
        sb.append((Object) this.c);
        sb.append(", negativeTextButton=");
        sb.append((Object) this.d);
        sb.append(", neutralTextButton=");
        sb.append((Object) this.e);
        sb.append(", requestKey=");
        sb.append(this.f);
        sb.append(", checkerText=");
        sb.append((Object) this.g);
        sb.append(", buttonStyle=");
        sb.append(this.h);
        sb.append(", lottieAnimation=");
        sb.append(this.i);
        sb.append(", alertType=");
        sb.append(this.j);
        sb.append(", isCancelable=");
        return rw2.p(sb, this.k, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        TextUtils.writeToParcel(this.f47242a, parcel, i);
        TextUtils.writeToParcel(this.b, parcel, i);
        TextUtils.writeToParcel(this.c, parcel, i);
        TextUtils.writeToParcel(this.d, parcel, i);
        TextUtils.writeToParcel(this.e, parcel, i);
        parcel.writeString(this.f);
        TextUtils.writeToParcel(this.g, parcel, i);
        ActionDialogButtonStyle actionDialogButtonStyle = this.h;
        if (actionDialogButtonStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actionDialogButtonStyle.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.i);
        parcel.writeString(this.j.name());
        parcel.writeInt(this.k ? 1 : 0);
    }

    public DialogFields(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, String str, CharSequence charSequence6, ActionDialogButtonStyle actionDialogButtonStyle, int i, n12 n12Var, boolean z) {
        charSequence3.getClass();
        n12Var.getClass();
        this.f47242a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
        this.d = charSequence4;
        this.e = charSequence5;
        this.f = str;
        this.g = charSequence6;
        this.h = actionDialogButtonStyle;
        this.i = i;
        this.j = n12Var;
        this.k = z;
    }
}
