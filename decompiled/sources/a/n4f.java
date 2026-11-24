package a;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/n4f;", "La/stl;", "La/o4f;", "<init>", "()V", "a/kwd", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class n4f extends stl<o4f> {
    public final nae0 g2 = ltt0.p(this, m4f.f21167a);
    public final es h2 = new es("PARAM_COUPON_TYPES");
    public final phf0 i2 = new phf0("PARAM_REQUEST_KEY");
    public final phf0 j2 = new phf0("PARAM_TITLE_KEY");
    public static final /* synthetic */ iiy[] l2 = {new j0d0(n4f.class, "binding", "getBinding()Lorg/xplatform/coupon/impl/databinding/CouponTypeDialogBinding;", 0), new ez40(n4f.class, "couponTypes", "getCouponTypes()Ljava/util/List;", 0), new ez40(n4f.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(n4f.class, "title", "getTitle()Ljava/lang/String;", 0)};
    public static final kwd k2 = new kwd();
    public static final String m2 = n4f.class.getName();

    @Override // a.stl
    public final yfu0 Q0() {
        Object objN = this.g2.n(l2[0], this);
        objN.getClass();
        return (o4f) objN;
    }

    @Override // a.stl
    public final void S0() {
        BottomSheetBehavior bottomSheetBehavior = this.c2;
        byte b = 3;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.K = true;
            bottomSheetBehavior.N(3);
        }
        iiy[] iiyVarArr = l2;
        I0(new kp8(this.j2.n(this, iiyVarArr[3]), 0));
        Object objN = this.g2.n(iiyVarArr[0], this);
        objN.getClass();
        RecyclerView recyclerView = ((o4f) objN).b;
        recyclerView.setLayoutManager(new LinearLayoutManager(o0()));
        ejd ejdVar = new ejd(this, (byte) 20);
        k4f k4fVar = new k4f();
        ((dp) k4fVar.e).b(new gbn(new bqd((byte) 21), new pue(b, b), new ejd(ejdVar, (byte) 19), fpd.n));
        k4fVar.f = this.h2.n(this, iiyVarArr[1]);
        recyclerView.setAdapter(k4fVar);
    }
}
