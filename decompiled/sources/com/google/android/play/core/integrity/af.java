package com.google.android.play.core.integrity;

import a.e7w0;
import a.i5w0;
import a.k7w0;
import a.m8w0;
import a.z5w0;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class af extends m8w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f45593a;
    final /* synthetic */ Long b;
    final /* synthetic */ TaskCompletionSource c;
    final /* synthetic */ IntegrityTokenRequest d;
    final /* synthetic */ aj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(aj ajVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.e = ajVar;
        this.f45593a = bArr;
        this.b = l;
        this.c = taskCompletionSource2;
        this.d = integrityTokenRequest;
    }

    @Override // a.m8w0
    public final void a(Exception exc) {
        if (exc instanceof i5w0) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // a.m8w0
    public final void b() {
        try {
            aj ajVar = this.e;
            k7w0 k7w0Var = (k7w0) ajVar.f45597a.n;
            Bundle bundleA = aj.a(ajVar, this.f45593a, this.b, null);
            ai aiVar = new ai(this.e, this.c);
            e7w0 e7w0Var = (e7w0) k7w0Var;
            e7w0Var.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(e7w0Var.c);
            int i = z5w0.f43837a;
            parcelObtain.writeInt(1);
            bundleA.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(aiVar);
            e7w0Var.b(parcelObtain, 2);
        } catch (RemoteException e) {
            this.e.b.a(e, "requestIntegrityToken(%s)", this.d);
            this.c.trySetException(new IntegrityServiceException(-100, e));
        }
    }
}
