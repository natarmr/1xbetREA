package a;

import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cx2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5104a;
    public final /* synthetic */ mie0 b;

    public /* synthetic */ cx2(mie0 mie0Var, byte b) {
        this.f5104a = b;
        this.b = mie0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f5104a;
        boolean z = true;
        mie0 mie0Var = this.b;
        switch (b) {
            case 0:
                Class cls = AndroidComposeView.j2;
                mie0Var.f21842a = (nqq) obj;
                return Boolean.TRUE;
            case 1:
                zlt zltVar = (zlt) obj;
                if (Intrinsics.d(zltVar.F(), "waiting")) {
                    mie0Var.f21842a = zltVar;
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                mie0Var.f21842a = (Throwable) obj;
                return Unit.f46060a;
            case 3:
                mie0Var.f21842a = (Throwable) obj;
                return Unit.f46060a;
            case 4:
                mie0Var.f21842a = (Exception) obj;
                return Unit.f46060a;
            case 5:
                mie0Var.f21842a = (Exception) obj;
                return Unit.f46060a;
            case 6:
                qsw qswVar = (qsw) obj;
                Object obj2 = mie0Var.f21842a;
                if (obj2 == null && qswVar.q) {
                    mie0Var.f21842a = qswVar;
                } else if (obj2 != null) {
                    qswVar.getClass();
                }
                return Boolean.TRUE;
            case 7:
                yzj yzjVar = (hps0) obj;
                if (((lm40) yzjVar).f20279a.n) {
                    mie0Var.f21842a = yzjVar;
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                hps0 hps0Var = (hps0) obj;
                hps0Var.getClass();
                tbz tbzVar = ((jps0) hps0Var).o;
                List listL = (List) mie0Var.f21842a;
                if (listL != null) {
                    listL.add(tbzVar);
                } else {
                    listL = q3d.l(tbzVar);
                }
                mie0Var.f21842a = listL;
                return gps0.b;
            default:
                mcy mcyVar = (mcy) obj;
                mcyVar.getClass();
                mie0Var.f21842a = mcyVar;
                return Unit.f46060a;
        }
    }
}
