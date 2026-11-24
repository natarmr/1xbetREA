package a;

/* JADX INFO: loaded from: classes4.dex */
public final class nrd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ref f23996a;

    public nrd(ref refVar) {
        this.f23996a = refVar;
    }

    public final yff0 a(mwn mwnVar, rhi0 rhi0Var, vby vbyVar) {
        Object g0g0Var;
        mwnVar.getClass();
        rhi0Var.getClass();
        String str = mwnVar.f22513a;
        if (str == null) {
            throw new roe(null);
        }
        String str2 = mwnVar.b;
        if (str2 == null) {
            throw new roe(null);
        }
        ref refVar = this.f23996a;
        byte[] bArrA = refVar.a(str, rhi0Var, str2);
        if (bArrA == null) {
            rhi0 rhi0Var2 = rhi0.f30492a;
            if (rhi0Var == rhi0Var2) {
                rhi0Var2 = rhi0.b;
            }
            bArrA = refVar.a(str, rhi0Var2, str2);
        }
        if (bArrA == null) {
            throw new roe("Content description failed or corrupted.");
        }
        try {
            e0g0 e0g0Var = j0g0.b;
            g0g0Var = (yff0) vbyVar.b(yff0.Companion.serializer(), kotlin.text.c.m(bArrA));
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (j0g0.a(g0g0Var) == null) {
            return (yff0) g0g0Var;
        }
        throw new roe("JSON parsing failed");
    }
}
