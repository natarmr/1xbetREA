package a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.components.views.LoadableImageView;
import org.xplatform.uikit.components.views.LoadableShapeableImageView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w800 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38698a;

    public /* synthetic */ w800(byte b) {
        this.f38698a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = null;
        int size = 0;
        switch (this.f38698a) {
            case 0:
                lu90 lu90Var = (lu90) obj;
                lu90Var.getClass();
                return Integer.valueOf(lu90Var.e);
            case 1:
                ma00 ma00Var = (ma00) obj;
                ma00Var.getClass();
                return Integer.valueOf(ma00Var.c == 0 ? ma00Var.d : ma00Var.e);
            case 2:
                n1g n1gVar = (n1g) obj;
                dr2 dr2Var = new dr2();
                n1gVar.getClass();
                n1gVar.e = dr2Var;
                n1gVar.f = l1g.OPEN_SCREEN;
                n1gVar.g = k1g.OPEN_FROM_MENU;
                n1gVar.d = j1g.REAL;
                return Unit.f46060a;
            case 3:
                oea0 oea0Var = (oea0) obj;
                oea0Var.getClass();
                return oea0Var.f25114a;
            case 4:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                while (size < 40) {
                    hcz.e(hczVar, null, null, new ugd(1840060674, true, new cl2(size, (byte) 6)), 3);
                    size++;
                }
                return Unit.f46060a;
            case 5:
                fee feeVar = (fee) obj;
                feeVar.getClass();
                my6 my6Var = (my6) feeVar.c();
                my6Var.getClass();
                kur kurVar = my6Var.c;
                kgs kgsVar = new kgs(kurVar.f18925a.f39867a);
                j580 j580Var = my6Var.b;
                return new ny6(new uf40(kgsVar, new a480(j580Var.f15922a, j580Var.b, j580Var.c), kurVar.b, null));
            case 6:
                zvh0 zvh0Var = (zvh0) obj;
                zvh0Var.getClass();
                return ydx.a0(zvh0Var);
            case 7:
                vsr0 vsr0Var = (vsr0) obj;
                vsr0Var.getClass();
                return Integer.valueOf(vsr0Var.f37966a ? 1 : 0);
            case 8:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 9:
                sjd sjdVar = (sjd) obj;
                sjdVar.getClass();
                return new pj00(sjdVar);
            case 10:
                a2n a2nVar = (a2n) obj;
                a2nVar.getClass();
                if (a2nVar instanceof q56) {
                    return Long.valueOf(((q56) a2nVar).a());
                }
                if (a2nVar instanceof w56) {
                    return Long.valueOf(((w56) a2nVar).a());
                }
                if (a2nVar instanceof v1o0) {
                    return Long.valueOf(((v1o0) a2nVar).a());
                }
                return a2nVar instanceof b2o0 ? Long.valueOf(((b2o0) a2nVar).a()) : axq.g();
            case 11:
                ((bem) obj).getClass();
                return Unit.f46060a;
            case 12:
                List list = (List) obj;
                list.getClass();
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        List list2 = ((npm0) it.next()).b;
                        if (!list2.isEmpty()) {
                            Iterator it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    continue;
                                } else if (!((mpm0) it2.next()).b) {
                                }
                            }
                        }
                        size++;
                    } else {
                        size = -1;
                    }
                }
                if (size == -1) {
                    size = list.size();
                }
                return Integer.valueOf(size);
            case 13:
                int i = LoadableImageView.i;
                ((Drawable) obj).getClass();
                return Boolean.FALSE;
            case 14:
                int i2 = LoadableImageView.i;
                return Unit.f46060a;
            case 15:
                int i3 = LoadableImageView.i;
                return Boolean.FALSE;
            case 16:
                int i4 = LoadableImageView.i;
                ((Drawable) obj).getClass();
                return Boolean.FALSE;
            case 17:
                int i5 = LoadableImageView.i;
                ((Drawable) obj).getClass();
                return Boolean.FALSE;
            case 18:
                int i6 = LoadableImageView.i;
                ((Drawable) obj).getClass();
                return Boolean.FALSE;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                int i7 = LoadableShapeableImageView.B;
                ((Drawable) obj).getClass();
                return Boolean.FALSE;
            case 20:
                int i8 = LoadableShapeableImageView.B;
                ((Drawable) obj).getClass();
                return Boolean.FALSE;
            case 21:
                int i9 = LoadableShapeableImageView.B;
                return Boolean.FALSE;
            case 22:
                int i10 = LoadableShapeableImageView.B;
                ((Drawable) obj).getClass();
                return Boolean.FALSE;
            case 23:
                int i11 = LoadableShapeableImageView.B;
                ((Drawable) obj).getClass();
                return Boolean.FALSE;
            case 24:
                ((cp) obj).getClass();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                bh90 bh90Var = (bh90) obj;
                zfn zfnVar = dy2.b;
                bh90Var.getClass();
                for (Context baseContext = (Context) qbc.V(bh90Var, zfnVar); baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
                    if (baseContext instanceof Activity) {
                        context = baseContext;
                        return (Activity) context;
                    }
                }
                return (Activity) context;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj).getClass();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                mbp0 mbp0Var = (mbp0) obj;
                mbp0Var.getClass();
                return xnm0.h(mbp0Var.c, mbp0Var.d, mbp0Var.b, mbp0Var.e, mbp0Var.g, mbp0Var.f21520a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                mbp0 mbp0Var2 = (mbp0) obj;
                mbp0Var2.getClass();
                return qim0.k(mbp0Var2.h, ucx.X(mbp0Var2.f), mbp0Var2.f21520a, mbp0Var2.k, mbp0Var2.l);
            default:
                fee feeVar2 = (fee) obj;
                feeVar2.getClass();
                return kpb.o0((bqr) feeVar2.c(), false);
        }
    }
}
