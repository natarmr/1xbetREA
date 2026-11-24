package a;

import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iz9 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15625a;
    public final /* synthetic */ qz9 b;

    public /* synthetic */ iz9(qz9 qz9Var, byte b) {
        this.f15625a = b;
        this.b = qz9Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        ike ikeVar;
        List list;
        Object value2;
        Object value3;
        Object value4;
        ike ikeVar2;
        int i;
        int i2;
        Object value5;
        Object value6;
        byte b = this.f15625a;
        cvb0 cvb0Var = cvb0.b;
        qz9 qz9Var = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                kl5 kl5Var = qz9.t2;
                p7m0 p7m0Var = qz9Var.S0().m;
                do {
                    value = p7m0Var.getValue();
                    ikeVar = (ike) value;
                    list = d4a.q;
                } while (!p7m0Var.m(value, ike.a(ikeVar, false, 0, 0, iIntValue, ((Number) ((iIntValue < 0 || iIntValue >= list.size()) ? Float.valueOf(((Number) CollectionsKt.U(list)).floatValue()) : list.get(iIntValue))).floatValue(), false, false, false, false, false, 4071)));
                break;
            case 1:
                kl5 kl5Var2 = qz9.t2;
                ((View) obj).getClass();
                qz9Var.I0().k.animate().rotationBy(-180.0f);
                d4a d4aVarS0 = qz9Var.S0();
                Bitmap bitmap = qz9Var.I0().e.getBitmap();
                Bitmap bitmapG = bitmap != null ? wb.G(bitmap, 0.08f) : null;
                p7m0 p7m0Var2 = d4aVarS0.k;
                do {
                    value2 = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value2, bitmapG));
                d4a d4aVarS1 = qz9Var.S0();
                p7m0 p7m0Var3 = d4aVarS1.f;
                ArrayList arrayList = d4aVarS1.e;
                p7m0 p7m0Var4 = d4aVarS1.j;
                p7m0Var4.getClass();
                p7m0Var4.o(null, e4a.f7172a);
                p7m0 p7m0Var5 = d4aVarS1.m;
                do {
                    value3 = p7m0Var5.getValue();
                } while (!p7m0Var5.m(value3, ike.a((ike) value3, false, 0, 0, 0, 0.0f, false, false, false, false, false, 255)));
                Iterator it = arrayList.iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                    } else if (((j0a) it.next()).h() != ((ez9) p7m0Var3.getValue()).f8661a) {
                        i3++;
                    }
                }
                j0a j0aVar = (j0a) CollectionsKt.W(i3 >= arrayList.size() - 1 ? 0 : i3 + 1, arrayList);
                if (j0aVar != null) {
                    ez9 ez9Var = new ez9(j0aVar.h());
                    p7m0Var3.getClass();
                    p7m0Var3.o(null, ez9Var);
                    p7m0 p7m0Var6 = d4aVarS1.l;
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap.getClass();
                    wub0 wub0Var = new wub0(bitmapCreateBitmap, 0.0f, false, false);
                    p7m0Var6.getClass();
                    p7m0Var6.o(null, wub0Var);
                    d4aVarS1.A();
                } else {
                    d4aVarS1.w();
                }
                break;
            case 2:
                kl5 kl5Var3 = qz9.t2;
                ((View) obj).getClass();
                d4a d4aVarS2 = qz9Var.S0();
                List list2 = d4a.p;
                p7m0 p7m0Var7 = d4aVarS2.g;
                int iIndexOf = list2.indexOf(Integer.valueOf(((wjq) p7m0Var7.getValue()).f39276a)) + 1;
                p7m0Var7.o(null, new wjq(((Number) ((iIndexOf < 0 || iIndexOf >= list2.size()) ? Integer.valueOf(((Number) CollectionsKt.U(list2)).intValue()) : list2.get(iIndexOf))).intValue()));
                p7m0 p7m0Var8 = d4aVarS2.m;
                do {
                    value4 = p7m0Var8.getValue();
                    ikeVar2 = (ike) value4;
                    i = ((wjq) p7m0Var7.getValue()).f39276a;
                    i2 = R.drawable.ic_glyph_flash_auto;
                    if (i != 0) {
                        if (i == 1) {
                            i2 = R.drawable.ic_glyph_flash_on;
                        } else if (i == 2) {
                            i2 = R.drawable.ic_glyph_flash_off;
                        }
                    }
                } while (!p7m0Var8.m(value4, ike.a(ikeVar2, false, i2, i, 0, 0.0f, false, false, false, false, false, 4089)));
                break;
            case 3:
                kl5 kl5Var4 = qz9.t2;
                ((View) obj).getClass();
                d4a d4aVarS3 = qz9Var.S0();
                d4aVarS3.C(r0k0.f29635a);
                p7m0 p7m0Var9 = d4aVarS3.m;
                do {
                    value5 = p7m0Var9.getValue();
                } while (!p7m0Var9.m(value5, ike.a((ike) value5, false, 0, 0, 0, 0.0f, false, false, false, false, false, 4094)));
                p7m0 p7m0Var10 = d4aVarS3.l;
                do {
                    value6 = p7m0Var10.getValue();
                } while (!p7m0Var10.m(value6, wub0.a((wub0) value6, true, 7)));
                break;
            case 4:
                kl5 kl5Var5 = qz9.t2;
                ((View) obj).getClass();
                qz9Var.S0().z(false);
                break;
            case 5:
                kl5 kl5Var6 = qz9.t2;
                ((View) obj).getClass();
                qz9Var.S0().z(true);
                break;
            case 6:
                kl5 kl5Var7 = qz9.t2;
                ((View) obj).getClass();
                qz9Var.z0(false, false, false);
                break;
            case 7:
                cvb0 cvb0Var2 = (cvb0) obj;
                kl5 kl5Var8 = qz9.t2;
                qz9Var.I0().e.getSurfaceProvider();
                if (cvb0Var2 == cvb0Var) {
                    qz9Var.I0().e.getPreviewStreamState().k(qz9Var);
                    qz9Var.S0().x();
                }
                break;
            default:
                cvb0 cvb0Var3 = (cvb0) obj;
                kl5 kl5Var9 = qz9.t2;
                if (cvb0Var3 == cvb0Var) {
                    qz9Var.I0().e.getPreviewStreamState().k(qz9Var);
                    qz9Var.S0().x();
                }
                break;
        }
        return Unit.f46060a;
    }
}
