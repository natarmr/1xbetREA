package a;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/sin0;", "La/stl;", "La/tin0;", "<init>", "()V", "a/j6m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class sin0 extends stl<tin0> {
    public final cgx0 g2 = new cgx0("REQUEST_KEY_IS_OPEN_APP");
    public final phf0 h2 = new phf0("EXTRA_REQUEST_KEY");
    public final nae0 i2 = ltt0.p(this, rin0.f30552a);
    public static final /* synthetic */ iiy[] k2 = {new ez40(sin0.class, "isOpenApp", "isOpenApp()Z", 0), new ez40(sin0.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new j0d0(sin0.class, "binding", "getBinding()Lorg/xplatform/support/impl/databinding/SupportAppBottomSheetDialogBinding;", 0)};
    public static final j6m0 j2 = new j6m0((byte) 6);

    @Override // a.stl
    public final void S0() {
        BottomSheetBehavior bottomSheetBehavior = this.c2;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.N(3);
        }
        final byte b = 0;
        Q0().b.setText(this.g2.n(this, k2[0]).booleanValue() ? H(R.string.go_to) : H(R.string.download));
        dyb.c0(Q0().b, new Function1(this) { // from class: a.qin0
            public final /* synthetic */ sin0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                sin0 sin0Var = this.b;
                View view = (View) obj;
                switch (b2) {
                    case 0:
                        j6m0 j6m0Var = sin0.j2;
                        view.getClass();
                        phf0 phf0Var = sin0Var.h2;
                        iiy[] iiyVarArr = sin0.k2;
                        vcc.f0(i120.V(new Pair(phf0Var.n(sin0Var, iiyVarArr[1]), Boolean.TRUE)), sin0Var, phf0Var.n(sin0Var, iiyVarArr[1]));
                        sin0Var.x0();
                        break;
                    case 1:
                        j6m0 j6m0Var2 = sin0.j2;
                        view.getClass();
                        sin0Var.x0();
                        break;
                    default:
                        j6m0 j6m0Var3 = sin0.j2;
                        view.getClass();
                        sin0Var.x0();
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b2 = 1;
        dyb.c0(Q0().c, new Function1(this) { // from class: a.qin0
            public final /* synthetic */ sin0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                sin0 sin0Var = this.b;
                View view = (View) obj;
                switch (b3) {
                    case 0:
                        j6m0 j6m0Var = sin0.j2;
                        view.getClass();
                        phf0 phf0Var = sin0Var.h2;
                        iiy[] iiyVarArr = sin0.k2;
                        vcc.f0(i120.V(new Pair(phf0Var.n(sin0Var, iiyVarArr[1]), Boolean.TRUE)), sin0Var, phf0Var.n(sin0Var, iiyVarArr[1]));
                        sin0Var.x0();
                        break;
                    case 1:
                        j6m0 j6m0Var2 = sin0.j2;
                        view.getClass();
                        sin0Var.x0();
                        break;
                    default:
                        j6m0 j6m0Var3 = sin0.j2;
                        view.getClass();
                        sin0Var.x0();
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b3 = 2;
        dyb.c0(Q0().d, new Function1(this) { // from class: a.qin0
            public final /* synthetic */ sin0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b3;
                sin0 sin0Var = this.b;
                View view = (View) obj;
                switch (b4) {
                    case 0:
                        j6m0 j6m0Var = sin0.j2;
                        view.getClass();
                        phf0 phf0Var = sin0Var.h2;
                        iiy[] iiyVarArr = sin0.k2;
                        vcc.f0(i120.V(new Pair(phf0Var.n(sin0Var, iiyVarArr[1]), Boolean.TRUE)), sin0Var, phf0Var.n(sin0Var, iiyVarArr[1]));
                        sin0Var.x0();
                        break;
                    case 1:
                        j6m0 j6m0Var2 = sin0.j2;
                        view.getClass();
                        sin0Var.x0();
                        break;
                    default:
                        j6m0 j6m0Var3 = sin0.j2;
                        view.getClass();
                        sin0Var.x0();
                        break;
                }
                return Unit.f46060a;
            }
        });
    }

    @Override // a.stl
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public final tin0 Q0() {
        Object objN = this.i2.n(k2[2], this);
        objN.getClass();
        return (tin0) objN;
    }
}
