package a;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zn30 implements rbe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zhl f44655a;
    public final /* synthetic */ wn00 b;
    public final /* synthetic */ in30 c;
    public final /* synthetic */ IOException d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ zn30(zhl zhlVar, wn00 wn00Var, in30 in30Var, IOException iOException, boolean z) {
        this.f44655a = zhlVar;
        this.b = wn00Var;
        this.c = in30Var;
        this.d = iOException;
        this.e = z;
    }

    @Override // a.rbe
    public final void accept(Object obj) {
        bo30 bo30Var = (bo30) obj;
        zhl zhlVar = this.f44655a;
        bo30Var.B(zhlVar.f44398a, zhlVar.b, this.b, this.c, this.d, this.e);
    }
}
