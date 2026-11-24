package com.google.android.play.core.integrity;

import a.q6w0;
import a.w6w0;
import a.z5w0;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class bf extends bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f45615a;
    final /* synthetic */ TaskCompletionSource b;
    final /* synthetic */ bn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(bn bnVar, TaskCompletionSource taskCompletionSource, int i, long j, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.c = bnVar;
        this.f45615a = j;
        this.b = taskCompletionSource2;
    }

    @Override // a.m8w0
    public final void b() {
        if (bn.k(this.c)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.c;
            w6w0 w6w0Var = (w6w0) bnVar.f45620a.n;
            Bundle bundleB = bn.b(bnVar, this.f45615a, 0);
            bl blVar = new bl(this.c, this.b);
            q6w0 q6w0Var = (q6w0) w6w0Var;
            q6w0Var.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(q6w0Var.c);
            int i = z5w0.f43837a;
            parcelObtain.writeInt(1);
            bundleB.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(blVar);
            q6w0Var.b(parcelObtain, 2);
        } catch (RemoteException e) {
            this.c.b.a(e, "warmUpIntegrityToken(%s)", Long.valueOf(this.f45615a));
            this.b.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}
