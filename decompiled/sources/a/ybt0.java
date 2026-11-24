package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ybt0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42355a;
    public final /* synthetic */ l7m0 b;

    public /* synthetic */ ybt0(l7m0 l7m0Var, byte b) {
        this.f42355a = b;
        this.b = l7m0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f42355a;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                return ((fdt0) l7m0Var.getValue()).b.f646a;
            case 1:
                return ((fdt0) l7m0Var.getValue()).b.b;
            case 2:
                return Boolean.valueOf(((fdt0) l7m0Var.getValue()).b.c);
            case 3:
                return Boolean.valueOf(!(((Number) l7m0Var.getValue()).floatValue() == 1.0f));
            case 4:
                return Integer.valueOf(((CharSequence) l7m0Var.getValue()).length() == 0 ? 2 : 1);
            case 5:
                return Boolean.valueOf(((mou0) l7m0Var.getValue()).d);
            case 6:
                return ((mou0) l7m0Var.getValue()).f22149a;
            case 7:
                return ((mou0) l7m0Var.getValue()).b;
            case 8:
                return ((mou0) l7m0Var.getValue()).c;
            case 9:
                return Boolean.valueOf(!(((Number) l7m0Var.getValue()).floatValue() == 1.0f));
            case 10:
                return Boolean.valueOf(((hru0) l7m0Var.getValue()).d);
            case 11:
                return ((hru0) l7m0Var.getValue()).f13550a;
            case 12:
                return ((hru0) l7m0Var.getValue()).b;
            case 13:
                return ((hru0) l7m0Var.getValue()).c;
            case 14:
                return ((ytu0) l7m0Var.getValue()).f43238a;
            case 15:
                return ((ytu0) l7m0Var.getValue()).b;
            case 16:
                return ((b8v0) l7m0Var.getValue()).b;
            default:
                return ((b8v0) l7m0Var.getValue()).b.b;
        }
    }
}
