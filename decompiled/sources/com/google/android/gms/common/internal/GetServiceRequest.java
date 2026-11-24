package com.google.android.gms.common.internal;

import a.erw0;
import a.fc;
import a.guw;
import a.mnw0;
import a.s9x0;
import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new erw0((byte) 20);
    public static final Scope[] o = new Scope[0];
    public static final Feature[] p = new Feature[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45489a;
    public final int b;
    public final int c;
    public String d;
    public IBinder e;
    public Scope[] f;
    public Bundle g;
    public Account h;
    public Feature[] i;
    public Feature[] j;
    public final boolean k;
    public final int l;
    public boolean m;
    public final String n;

    public GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z, int i4, boolean z2, String str2) {
        Account account2;
        Scope[] scopeArr2 = scopeArr == null ? o : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        Feature[] featureArr3 = p;
        Feature[] featureArr4 = featureArr == null ? featureArr3 : featureArr;
        featureArr3 = featureArr2 != null ? featureArr2 : featureArr3;
        this.f45489a = i;
        this.b = i2;
        this.c = i3;
        if ("com.google.android.gms".equals(str)) {
            this.d = "com.google.android.gms";
        } else {
            this.d = str;
        }
        if (i < 2) {
            account2 = null;
            if (iBinder != null) {
                int i5 = fc.b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                guw s9x0Var = iInterfaceQueryLocalInterface instanceof guw ? (guw) iInterfaceQueryLocalInterface : new s9x0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 3);
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        s9x0 s9x0Var2 = (s9x0) s9x0Var;
                        Parcel parcelE = s9x0Var2.E(s9x0Var2.G(), 2);
                        Account account3 = (Account) mnw0.a(parcelE, Account.CREATOR);
                        parcelE.recycle();
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    }
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    throw th;
                }
            }
        } else {
            this.e = iBinder;
            account2 = account;
        }
        this.h = account2;
        this.f = scopeArr2;
        this.g = bundle2;
        this.i = featureArr4;
        this.j = featureArr3;
        this.k = z;
        this.l = i4;
        this.m = z2;
        this.n = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        erw0.a(this, parcel, i);
    }
}
