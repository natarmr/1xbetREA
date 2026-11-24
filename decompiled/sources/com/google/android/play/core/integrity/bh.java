package com.google.android.play.core.integrity;

import a.h5w0;
import a.q6w0;
import a.w6w0;
import a.z5w0;
import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class bh extends bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f45617a;
    final /* synthetic */ Activity b;
    final /* synthetic */ TaskCompletionSource c;
    final /* synthetic */ int d;
    final /* synthetic */ bn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(bn bnVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i) {
        super(bnVar, taskCompletionSource);
        this.e = bnVar;
        this.f45617a = bundle;
        this.b = activity;
        this.c = taskCompletionSource2;
        this.d = i;
    }

    @Override // a.m8w0
    public final void b() {
        if (bn.k(this.e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.e;
            h5w0 h5w0Var = bnVar.f45620a;
            w6w0 w6w0Var = (w6w0) h5w0Var.n;
            Bundle bundle = this.f45617a;
            as asVarA = bnVar.e.a(this.b, this.c, h5w0Var);
            q6w0 q6w0Var = (q6w0) w6w0Var;
            q6w0Var.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(q6w0Var.c);
            int i = z5w0.f43837a;
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(asVarA);
            q6w0Var.b(parcelObtain, 6);
        } catch (RemoteException e) {
            this.e.b.a(e, "requestAndShowDialog(%s)", Integer.valueOf(this.d));
            this.c.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}
