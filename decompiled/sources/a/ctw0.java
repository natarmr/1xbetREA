package a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzpl;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ctw0 extends y4w0 implements gtw0 {
    public ctw0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", (byte) 4);
    }

    @Override // a.gtw0
    public final List A(String str, String str2, com.google.android.gms.measurement.internal.zzr zzrVar) {
        Parcel parcelG = G();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        wmw0.b(parcelG, zzrVar);
        Parcel parcelF = F(parcelG, 16);
        ArrayList arrayListCreateTypedArrayList = parcelF.createTypedArrayList(zzah.CREATOR);
        parcelF.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // a.gtw0
    public final void B(com.google.android.gms.measurement.internal.zzr zzrVar) {
        Parcel parcelG = G();
        wmw0.b(parcelG, zzrVar);
        H(parcelG, 20);
    }

    @Override // a.gtw0
    public final List c(String str, String str2, String str3, boolean z) {
        Parcel parcelG = G();
        parcelG.writeString(null);
        parcelG.writeString(str2);
        parcelG.writeString(str3);
        ClassLoader classLoader = wmw0.f39422a;
        parcelG.writeInt(z ? 1 : 0);
        Parcel parcelF = F(parcelG, 15);
        ArrayList arrayListCreateTypedArrayList = parcelF.createTypedArrayList(zzpl.CREATOR);
        parcelF.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // a.gtw0
    public final void e(zzah zzahVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        Parcel parcelG = G();
        wmw0.b(parcelG, zzahVar);
        wmw0.b(parcelG, zzrVar);
        H(parcelG, 12);
    }

    @Override // a.gtw0
    public final List f(String str, String str2, String str3) {
        Parcel parcelG = G();
        parcelG.writeString(null);
        parcelG.writeString(str2);
        parcelG.writeString(str3);
        Parcel parcelF = F(parcelG, 17);
        ArrayList arrayListCreateTypedArrayList = parcelF.createTypedArrayList(zzah.CREATOR);
        parcelF.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // a.gtw0
    public final void g(com.google.android.gms.measurement.internal.zzr zzrVar, zzoo zzooVar, ttw0 ttw0Var) {
        Parcel parcelG = G();
        wmw0.b(parcelG, zzrVar);
        wmw0.b(parcelG, zzooVar);
        wmw0.c(parcelG, ttw0Var);
        H(parcelG, 29);
    }

    @Override // a.gtw0
    public final byte[] h(zzbh zzbhVar, String str) {
        Parcel parcelG = G();
        wmw0.b(parcelG, zzbhVar);
        parcelG.writeString(str);
        Parcel parcelF = F(parcelG, 9);
        byte[] bArrCreateByteArray = parcelF.createByteArray();
        parcelF.recycle();
        return bArrCreateByteArray;
    }

    @Override // a.gtw0
    public final void i(com.google.android.gms.measurement.internal.zzr zzrVar) {
        Parcel parcelG = G();
        wmw0.b(parcelG, zzrVar);
        H(parcelG, 25);
    }

    @Override // a.gtw0
    public final void j(com.google.android.gms.measurement.internal.zzr zzrVar) {
        Parcel parcelG = G();
        wmw0.b(parcelG, zzrVar);
        H(parcelG, 6);
    }

    @Override // a.gtw0
    public final void k(com.google.android.gms.measurement.internal.zzr zzrVar, Bundle bundle, mtw0 mtw0Var) {
        Parcel parcelG = G();
        wmw0.b(parcelG, zzrVar);
        wmw0.b(parcelG, bundle);
        wmw0.c(parcelG, mtw0Var);
        H(parcelG, 31);
    }

    @Override // a.gtw0
    public final void l(com.google.android.gms.measurement.internal.zzr zzrVar) {
        Parcel parcelG = G();
        wmw0.b(parcelG, zzrVar);
        H(parcelG, 26);
    }

    @Override // a.gtw0
    public final void m(zzpl zzplVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        Parcel parcelG = G();
        wmw0.b(parcelG, zzplVar);
        wmw0.b(parcelG, zzrVar);
        H(parcelG, 2);
    }

    @Override // a.gtw0
    public final String o(com.google.android.gms.measurement.internal.zzr zzrVar) {
        Parcel parcelG = G();
        wmw0.b(parcelG, zzrVar);
        Parcel parcelF = F(parcelG, 11);
        String string = parcelF.readString();
        parcelF.recycle();
        return string;
    }

    @Override // a.gtw0
    public final void p(long j, String str, String str2, String str3) {
        Parcel parcelG = G();
        parcelG.writeLong(j);
        parcelG.writeString(str);
        parcelG.writeString(str2);
        parcelG.writeString(str3);
        H(parcelG, 10);
    }

    @Override // a.gtw0
    public final void q(com.google.android.gms.measurement.internal.zzr zzrVar) {
        Parcel parcelG = G();
        wmw0.b(parcelG, zzrVar);
        H(parcelG, 18);
    }

    @Override // a.gtw0
    public final void r(com.google.android.gms.measurement.internal.zzr zzrVar, zzaf zzafVar) {
        Parcel parcelG = G();
        wmw0.b(parcelG, zzrVar);
        wmw0.b(parcelG, zzafVar);
        H(parcelG, 30);
    }

    @Override // a.gtw0
    public final zzao s(com.google.android.gms.measurement.internal.zzr zzrVar) {
        Parcel parcelG = G();
        wmw0.b(parcelG, zzrVar);
        Parcel parcelF = F(parcelG, 21);
        zzao zzaoVar = (zzao) wmw0.a(parcelF, zzao.CREATOR);
        parcelF.recycle();
        return zzaoVar;
    }

    @Override // a.gtw0
    public final void t(Bundle bundle, com.google.android.gms.measurement.internal.zzr zzrVar) {
        Parcel parcelG = G();
        wmw0.b(parcelG, bundle);
        wmw0.b(parcelG, zzrVar);
        H(parcelG, 19);
    }

    @Override // a.gtw0
    public final void v(com.google.android.gms.measurement.internal.zzr zzrVar) {
        Parcel parcelG = G();
        wmw0.b(parcelG, zzrVar);
        H(parcelG, 4);
    }

    @Override // a.gtw0
    public final void x(com.google.android.gms.measurement.internal.zzr zzrVar) {
        Parcel parcelG = G();
        wmw0.b(parcelG, zzrVar);
        H(parcelG, 27);
    }

    @Override // a.gtw0
    public final List y(String str, String str2, boolean z, com.google.android.gms.measurement.internal.zzr zzrVar) {
        Parcel parcelG = G();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        ClassLoader classLoader = wmw0.f39422a;
        parcelG.writeInt(z ? 1 : 0);
        wmw0.b(parcelG, zzrVar);
        Parcel parcelF = F(parcelG, 14);
        ArrayList arrayListCreateTypedArrayList = parcelF.createTypedArrayList(zzpl.CREATOR);
        parcelF.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // a.gtw0
    public final void z(zzbh zzbhVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        Parcel parcelG = G();
        wmw0.b(parcelG, zzbhVar);
        wmw0.b(parcelG, zzrVar);
        H(parcelG, 1);
    }
}
