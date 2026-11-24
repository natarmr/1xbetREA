package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class kqb {
    public static final jqb Companion = new jqb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iqb f18714a;
    public final vwp0 b;

    public kqb(String str, String str2, String str3, String str4, long j) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        iqb iqbVar = new iqb(j, str, str4);
        vwp0 vwp0Var = new vwp0(str2, str3);
        this.f18714a = iqbVar;
        this.b = vwp0Var;
    }

    public /* synthetic */ kqb(int i, iqb iqbVar, vwp0 vwp0Var) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, fqb.f9966a.getDescriptor());
            throw null;
        }
        this.f18714a = iqbVar;
        this.b = vwp0Var;
    }
}
