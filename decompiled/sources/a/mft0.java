package a;

/* JADX INFO: loaded from: classes2.dex */
public enum mft0 {
    /* JADX INFO: Fake field, exist only in values array */
    UBYTE(plc.D("kotlin/UByte", false)),
    /* JADX INFO: Fake field, exist only in values array */
    USHORT(plc.D("kotlin/UShort", false)),
    /* JADX INFO: Fake field, exist only in values array */
    UINT(plc.D("kotlin/UInt", false)),
    /* JADX INFO: Fake field, exist only in values array */
    ULONG(plc.D("kotlin/ULong", false));


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qlc f21711a;
    public final g950 b;
    public final qlc c;

    mft0(qlc qlcVar) {
        this.f21711a = qlcVar;
        g950 g950VarF = qlcVar.f();
        this.b = g950VarF;
        this.c = new qlc(qlcVar.f28927a, g950.e(g950VarF.b() + "Array"));
    }
}
