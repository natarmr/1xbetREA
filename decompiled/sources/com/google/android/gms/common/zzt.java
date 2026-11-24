package com.google.android.gms.common;

import a.aa60;
import a.erw0;
import a.gvw;
import a.jzw0;
import a.kyw0;
import a.mex0;
import a.q5x;
import a.rbx0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new erw0((byte) 29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45499a;
    public final jzw0 b;
    public final boolean c;
    public final boolean d;

    public zzt(String str, IBinder iBinder, boolean z, boolean z2) {
        this.f45499a = str;
        jzw0 jzw0Var = null;
        if (iBinder != null) {
            try {
                int i = kyw0.c;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                gvw gvwVarZzd = (iInterfaceQueryLocalInterface instanceof mex0 ? (mex0) iInterfaceQueryLocalInterface : new rbx0(iBinder, "com.google.android.gms.common.internal.ICertData", (byte) 3)).zzd();
                byte[] bArr = gvwVarZzd == null ? null : (byte[]) aa60.H(gvwVarZzd);
                if (bArr != null) {
                    jzw0Var = new jzw0(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.b = jzw0Var;
        this.c = z;
        this.d = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.k0(parcel, 1, this.f45499a);
        jzw0 jzw0Var = this.b;
        if (jzw0Var == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            jzw0Var = null;
        }
        q5x.g0(parcel, 2, jzw0Var);
        q5x.o0(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        q5x.o0(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        q5x.q0(parcel, iP0);
    }

    public zzt(String str, jzw0 jzw0Var, boolean z, boolean z2) {
        this.f45499a = str;
        this.b = jzw0Var;
        this.c = z;
        this.d = z2;
    }
}
