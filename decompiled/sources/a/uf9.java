package a;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class uf9 implements oqp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35566a;
    public final a780 b;
    public final Object c;

    public /* synthetic */ uf9(Object obj, a780 a780Var, byte b) {
        this.f35566a = b;
        this.c = obj;
        this.b = a780Var;
    }

    @Override // a.oqp
    public final Object a(pyn pynVar) {
        byte b = this.f35566a;
        Object obj = this.c;
        a780 a780Var = this.b;
        switch (b) {
            case 0:
                f99 f99Var = new f99();
                f99Var.m1write((byte[]) obj);
                return new hmk0(new imk0(f99Var, a780Var.f, null), null, ibj.b);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                return new hmk0(new imk0(new zae0(new wf9(byteBuffer)), a780Var.f, new xf9(byteBuffer)), null, ibj.b);
            default:
                Drawable bitmapDrawable = (Drawable) obj;
                Bitmap.Config[] configArr = lut0.f20691a;
                boolean z = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof n4u0);
                if (z) {
                    bitmapDrawable = new BitmapDrawable(a780Var.f354a.getResources(), vic.u(bitmapDrawable, t1x.e(a780Var), a780Var.b, a780Var.c, (f7k0) qbc.Q(a780Var, q1x.b), a780Var.d == asb0.b));
                }
                return new wzw(c3x.r(bitmapDrawable), z, ibj.b);
        }
    }
}
