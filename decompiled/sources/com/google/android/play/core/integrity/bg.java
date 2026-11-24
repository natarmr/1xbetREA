package com.google.android.play.core.integrity;

import a.q6w0;
import a.w6w0;
import a.z5w0;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class bg extends bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f45616a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;
    final /* synthetic */ TaskCompletionSource d;
    final /* synthetic */ bn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(bn bnVar, TaskCompletionSource taskCompletionSource, int i, String str, long j, long j2, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.e = bnVar;
        this.f45616a = str;
        this.b = j;
        this.c = j2;
        this.d = taskCompletionSource2;
    }

    @Override // a.m8w0
    public final void b() {
        if (bn.k(this.e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.e;
            w6w0 w6w0Var = (w6w0) bnVar.f45620a.n;
            Bundle bundleA = bn.a(bnVar, this.f45616a, this.b, this.c, 0);
            bk bkVar = new bk(this.e, this.d, this.b);
            q6w0 q6w0Var = (q6w0) w6w0Var;
            q6w0Var.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(q6w0Var.c);
            int i = z5w0.f43837a;
            parcelObtain.writeInt(1);
            bundleA.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(bkVar);
            q6w0Var.b(parcelObtain, 3);
        } catch (RemoteException e) {
            this.e.b.a(e, "requestExpressIntegrityToken(%s, %s)", this.f45616a, Long.valueOf(this.b));
            this.d.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}
