package a;

import android.content.DialogInterface;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/a6d0;", "La/ix5;", "<init>", "()V", "a/jh70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class a6d0 extends ix5 {
    public final nae0 d2 = ltt0.p(this, z5d0.f43811a);
    public final phf0 e2 = new phf0("REQUEST_KEY");
    public static final /* synthetic */ iiy[] g2 = {new j0d0(a6d0.class, "binding", "getBinding()Lorg/xplatform/proxy/impl/databinding/DialogProxyCheckingBinding;", 0), new ez40(a6d0.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0)};
    public static final jh70 f2 = new jh70();

    @Override // a.ix5
    public final yfu0 J0() {
        Object objN = this.d2.n(g2[0], this);
        objN.getClass();
        return (gjk) objN;
    }

    @Override // a.ix5
    public final int L0() {
        return R.style.ThemeOverlay_AppTheme_MaterialAlertDialog_Rounded_New;
    }

    @Override // a.ix5
    public final void M0() {
        E0(false);
        Object objN = this.d2.n(g2[0], this);
        objN.getClass();
        ((gjk) objN).b.setOnClickListener(new l910(this, (byte) 25));
    }

    @Override // a.ix5, a.sik, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        vcc.f0(i120.U(), this, this.e2.n(this, g2[1]));
        super.onDismiss(dialogInterface);
    }

    @Override // a.ix5
    public final void S0() {
    }
}
