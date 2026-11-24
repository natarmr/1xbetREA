package a;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class n2h0 implements o5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22801a;
    public final o5d0 b;
    public final o5d0 c;
    public final o5d0 d;

    public /* synthetic */ n2h0(o5d0 o5d0Var, o5d0 o5d0Var2, o5d0 o5d0Var3, byte b) {
        this.f22801a = b;
        this.b = o5d0Var;
        this.c = o5d0Var2;
        this.d = o5d0Var3;
    }

    @Override // a.o5d0
    public final Object get() {
        byte b = this.f22801a;
        o5d0 o5d0Var = this.d;
        o5d0 o5d0Var2 = this.c;
        o5d0 o5d0Var3 = this.b;
        switch (b) {
            case 0:
                return new y3v((Context) o5d0Var3.get(), (wpg0) o5d0Var2.get(), (y45) ((nho) o5d0Var).get(), (byte) 5);
            default:
                return new eps0(new uxs0((byte) 10), new bzs0((byte) 3), (swj) ((twj) o5d0Var3).get(), (wdu) ((znt0) o5d0Var2).get(), (fht0) ((bpv0) o5d0Var).get());
        }
    }
}
