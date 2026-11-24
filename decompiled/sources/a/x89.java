package a;

import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.util.Property;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes6.dex */
public final class x89 extends Property {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40453a = 1;
    public final Object b;

    public x89() {
        super(Matrix.class, "imageMatrixProperty");
        this.b = new Matrix();
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        byte b = this.f40453a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((ImageView) obj).getClass();
                return Integer.valueOf(((y89) obj2).o);
            default:
                Matrix matrix = (Matrix) obj2;
                matrix.set(((ImageView) obj).getImageMatrix());
                return matrix;
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f40453a) {
            case 0:
                ImageView imageView = (ImageView) obj;
                int iIntValue = ((Number) obj2).intValue();
                imageView.getClass();
                ((y89) this.b).o = iIntValue;
                imageView.setColorFilter(iIntValue, PorterDuff.Mode.SRC_IN);
                break;
            default:
                ((ImageView) obj).setImageMatrix((Matrix) obj2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x89(y89 y89Var) {
        super(Integer.TYPE, "tintColor");
        this.b = y89Var;
    }
}
