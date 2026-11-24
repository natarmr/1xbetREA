package com.google.android.gms.identitycredentials;

import a.f140;
import a.jf4;
import a.okc;
import a.q5x;
import a.rw2;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/android/gms/identitycredentials/CredentialOption;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "toBundle", "()Landroid/os/Bundle;", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CredentialOption extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CredentialOption> CREATOR = new okc((byte) 19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45516a;
    public final Bundle b;
    public final Bundle c;
    public final String d;
    public final String e;
    public final String f;

    public CredentialOption(String str, Bundle bundle, Bundle bundle2, String str2, String str3, String str4) {
        str.getClass();
        bundle.getClass();
        bundle2.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.f45516a = str;
        this.b = bundle;
        this.c = bundle2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        boolean z = (StringsKt.W(str3) || StringsKt.W(str4)) ? false : true;
        boolean z2 = !StringsKt.W(str) && str3.length() == 0 && str4.length() == 0;
        if (z || z2) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + String.valueOf(str).length() + 31 + String.valueOf(str3).length() + 19 + 69);
        f140.v(sb, "Either type: ", str, ", or requestType: ", str3);
        jf4.o(rw2.o(sb, " and protocolType: ", str4, " must be specified, but at least one contains an invalid blank value."));
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int iP0 = q5x.p0(parcel, 20293);
        q5x.k0(parcel, 1, this.f45516a);
        q5x.d0(parcel, 2, this.b);
        q5x.d0(parcel, 3, this.c);
        q5x.k0(parcel, 4, this.d);
        q5x.k0(parcel, 5, this.e);
        q5x.k0(parcel, 6, this.f);
        q5x.q0(parcel, iP0);
    }
}
