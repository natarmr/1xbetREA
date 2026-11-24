package a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vjl implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37533a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ bkl c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ pz40 e;

    public /* synthetic */ vjl(Map map, bkl bklVar, Context context, pz40 pz40Var, byte b) {
        this.f37533a = b;
        this.b = map;
        this.c = bklVar;
        this.d = context;
        this.e = pz40Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        byte b = this.f37533a;
        Bitmap bitmapS0 = null;
        pz40 pz40Var = this.e;
        Context context = this.d;
        bkl bklVar = this.c;
        Map map = this.b;
        kz3 kz3Var = (kz3) obj;
        switch (b) {
            case 0:
                kz3Var.getClass();
                y3d y3dVar = (y3d) map.get(Long.valueOf(bklVar.f2754a));
                if (y3dVar == null) {
                    dyw dywVar = kz3Var.b.f13073a;
                    Resources resources = context.getResources();
                    resources.getClass();
                    Drawable drawableQ = c3x.q(dywVar, resources);
                    BitmapDrawable bitmapDrawable = drawableQ instanceof BitmapDrawable ? (BitmapDrawable) drawableQ : null;
                    if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                        bitmapS0 = vzb.s0(bitmap);
                    }
                    if (bitmapS0 != null) {
                        long jD = fbc.d(bitmapS0.getPixel(2, bitmapS0.getHeight() / 2));
                        map.put(Long.valueOf(bklVar.f2754a), new y3d(jD));
                        pz40Var.setValue(new y3d(jD));
                    }
                } else {
                    pz40Var.setValue(y3dVar);
                }
                break;
            default:
                kz3Var.getClass();
                y3d y3dVar2 = (y3d) map.get(Long.valueOf(bklVar.f2754a));
                if (y3dVar2 == null) {
                    dyw dywVar2 = kz3Var.b.f13073a;
                    Resources resources2 = context.getResources();
                    resources2.getClass();
                    Drawable drawableQ2 = c3x.q(dywVar2, resources2);
                    BitmapDrawable bitmapDrawable2 = drawableQ2 instanceof BitmapDrawable ? (BitmapDrawable) drawableQ2 : null;
                    if (bitmapDrawable2 != null && (bitmap2 = bitmapDrawable2.getBitmap()) != null) {
                        bitmapS0 = vzb.s0(bitmap2);
                    }
                    if (bitmapS0 != null) {
                        long jD2 = fbc.d(bitmapS0.getPixel(2, bitmapS0.getHeight() / 2));
                        map.put(Long.valueOf(bklVar.f2754a), new y3d(jD2));
                        pz40Var.setValue(new y3d(jD2));
                    }
                } else {
                    pz40Var.setValue(y3dVar2);
                }
                break;
        }
        return Unit.f46060a;
    }
}
