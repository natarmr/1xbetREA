package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class u8d0 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f35227a;
    public final /* synthetic */ long b;
    public final /* synthetic */ d9d0 c;

    public u8d0(boolean z, long j, d9d0 d9d0Var) {
        this.f35227a = z;
        this.b = j;
        this.c = d9d0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        fet fetVar = (fet) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            jwb.e(Boolean.valueOf(this.f35227a), null, d7x.P(yt40.c, fetVar), null, u1c.M(-2064098104, new t8d0(this.b, this.c), fetVar), fetVar, 24576, 10);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }
}
