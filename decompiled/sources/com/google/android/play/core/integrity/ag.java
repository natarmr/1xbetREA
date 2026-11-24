package com.google.android.play.core.integrity;

import a.e7w0;
import a.k7w0;
import a.m8w0;
import a.z5w0;
import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class ag extends m8w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f45594a;
    final /* synthetic */ Activity b;
    final /* synthetic */ TaskCompletionSource c;
    final /* synthetic */ int d;
    final /* synthetic */ aj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(aj ajVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i) {
        super(taskCompletionSource);
        this.e = ajVar;
        this.f45594a = bundle;
        this.b = activity;
        this.c = taskCompletionSource2;
        this.d = i;
    }

    @Override // a.m8w0
    public final void b() {
        try {
            aj ajVar = this.e;
            k7w0 k7w0Var = (k7w0) ajVar.f45597a.n;
            Bundle bundle = this.f45594a;
            as asVarA = ajVar.d.a(this.b, this.c, ajVar.f45597a);
            e7w0 e7w0Var = (e7w0) k7w0Var;
            e7w0Var.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(e7w0Var.c);
            int i = z5w0.f43837a;
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(asVarA);
            e7w0Var.b(parcelObtain, 3);
        } catch (RemoteException e) {
            this.e.b.a(e, "requestAndShowDialog(%s)", Integer.valueOf(this.d));
            this.c.trySetException(new IntegrityServiceException(-100, e));
        }
    }
}
