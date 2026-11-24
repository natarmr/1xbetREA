package a;

import android.javax.sip.message.Response;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zep0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f44264a = new zfn(new ccp0((byte) 11), (byte) 0);

    public static final ujv0 a(float f, long j) {
        return fem0.i(ujv0.f, ((int) (j >> 32)) / f, ((int) (j & 4294967295L)) / f);
    }

    public static final w6n b(ujv0 ujv0Var, w6n w6nVar, w6n w6nVar2, w6n w6nVar3) {
        w6nVar.getClass();
        w6nVar2.getClass();
        w6nVar3.getClass();
        return ujv0Var.a(Response.BUSY_EVERYWHERE) ? w6nVar : w6nVar2;
    }
}
