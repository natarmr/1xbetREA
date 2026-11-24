package a;

import android.content.Context;
import android.graphics.Point;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class z68 extends cyj0 {
    public final Context n;
    public final int o;

    public z68(Context context) {
        super(new wkj[1], new y68[1]);
        this.n = context;
        this.o = -1;
    }

    @Override // a.cyj0
    public final xkj g() {
        return new y68(this);
    }

    @Override // a.cyj0
    public final ypc i(wkj wkjVar, xkj xkjVar, boolean z) {
        y68 y68Var = (y68) xkjVar;
        ByteBuffer byteBuffer = wkjVar.g;
        byteBuffer.getClass();
        x0x.K(byteBuffer.hasArray());
        x0x.A(byteBuffer.arrayOffset() == 0);
        try {
            int iMax = this.o;
            if (iMax == -1) {
                Context context = this.n;
                if (context != null) {
                    Point pointT = vtt0.t(context);
                    int i = pointT.x;
                    int i2 = pointT.y;
                    androidx.media3.common.b bVar = wkjVar.e;
                    if (bVar != null) {
                        int i3 = bVar.R;
                        if (i3 != -1) {
                            i *= i3;
                        }
                        int i4 = bVar.S;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                    }
                    iMax = (Math.max(i, i2) * 2) - 1;
                } else {
                    iMax = 4096;
                }
            }
            y68Var.g = cfx0.E(byteBuffer.array(), byteBuffer.remaining(), iMax);
            y68Var.e = wkjVar.i;
            return null;
        } catch (kq80 e) {
            return new uzw("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e2) {
            return new uzw(e2);
        }
    }
}
