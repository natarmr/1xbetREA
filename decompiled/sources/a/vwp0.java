package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class vwp0 {
    public static final uwp0 Companion = new uwp0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38163a;
    public final String b;

    public /* synthetic */ vwp0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, twp0.f34662a.getDescriptor());
            throw null;
        }
        this.f38163a = str;
        this.b = str2;
    }

    public vwp0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f38163a = str;
        this.b = str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vwp0(swp0 swp0Var) {
        this(swp0Var.f32933a, swp0Var.b);
        swp0Var.getClass();
    }
}
