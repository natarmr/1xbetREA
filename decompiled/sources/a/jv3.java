package a;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jv3 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17187a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ jv3(boolean z, boolean z2, Fragment fragment) {
        this.f17187a = (byte) 3;
        this.c = z;
        this.d = z2;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f17187a;
        Object obj = this.b;
        boolean z = this.d;
        boolean z2 = this.c;
        switch (b) {
            case 0:
                ((ov3) obj).d(z2, z);
                break;
            case 1:
                ((ov3) obj).d(z2, z);
                break;
            case 2:
                ((ov3) obj).d(z2, z);
                break;
            default:
                im60 im60Var = new im60();
                iiy[] iiyVarArr = im60.i2;
                im60Var.e2.v(im60Var, iiyVarArr[0], z2);
                im60Var.f2.x(im60Var, iiyVarArr[1], "REQUEST_ACTION_SELECTOR_DIALOG_KEY");
                im60Var.g2.v(im60Var, iiyVarArr[2], z);
                sj3.D0(im60Var, ((Fragment) obj).F());
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ jv3(ov3 ov3Var, boolean z, boolean z2, byte b) {
        this.f17187a = b;
        this.b = ov3Var;
        this.c = z;
        this.d = z2;
    }
}
