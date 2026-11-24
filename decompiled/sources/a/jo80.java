package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class jo80 extends q8x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16845a;
    public final String b;
    public final boolean c;

    public jo80(byte b, String str, boolean z) {
        this.f16845a = b;
        switch (b) {
            case 1:
                Objects.requireNonNull(str, "name == null");
                this.b = str;
                this.c = z;
                break;
            case 2:
                Objects.requireNonNull(str, "name == null");
                this.b = str;
                this.c = z;
                break;
            default:
                Objects.requireNonNull(str, "name == null");
                this.b = str;
                this.c = z;
                break;
        }
    }

    @Override // a.q8x
    public final void y(emf0 emf0Var, Object obj) {
        String string;
        String string2;
        String string3;
        byte b = this.f16845a;
        boolean z = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                if (obj != null && (string = obj.toString()) != null) {
                    emf0Var.a(str, string, z);
                }
                break;
            case 1:
                if (obj != null && (string2 = obj.toString()) != null) {
                    emf0Var.b(str, string2, z);
                }
                break;
            default:
                if (obj != null && (string3 = obj.toString()) != null) {
                    emf0Var.c(str, string3, z);
                }
                break;
        }
    }
}
