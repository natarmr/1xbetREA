package a;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class ozw0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26119a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Bundle e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ b1x0 i;

    public ozw0(b1x0 b1x0Var, String str, String str2, long j, long j2, Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.f26119a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bundle;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = b1x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.i.u1(this.f26119a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
