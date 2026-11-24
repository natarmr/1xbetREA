package a;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class z3a extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ d4a j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z3a(d4a d4aVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = d4aVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        d4a d4aVar = this.j;
        switch (b) {
            case 0:
                return new z3a(d4aVar, yjeVar, (byte) 0);
            default:
                return new z3a(d4aVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((z3a) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        d4a d4aVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(d4aVar.j.getValue(), g4a.f10655a)) {
                    d4aVar.C(y0k0.f41810a);
                } else {
                    bby bbyVar = d4aVar.d;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var = d4aVar.l;
                Bitmap bitmap = ((wub0) p7m0Var.getValue()).f39784a;
                float f = ((wub0) p7m0Var.getValue()).b;
                bitmap.getClass();
                Matrix matrix = new Matrix();
                matrix.postRotate(f);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                bitmapCreateBitmap.getClass();
                bitmap.recycle();
                d4aVar.C(new x0k0(axq.h(System.currentTimeMillis(), "IMAGE_", ".jpg"), bitmapCreateBitmap));
                break;
        }
        return Unit.f46060a;
    }
}
