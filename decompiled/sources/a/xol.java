package a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xol implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41226a;
    public final /* synthetic */ ngk0 b;
    public final /* synthetic */ bpl c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ pz40 e;

    public /* synthetic */ xol(ngk0 ngk0Var, bpl bplVar, Context context, pz40 pz40Var, byte b) {
        this.f41226a = b;
        this.b = ngk0Var;
        this.c = bplVar;
        this.d = context;
        this.e = pz40Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        Bitmap bitmap4;
        byte b = this.f41226a;
        Bitmap bitmapS0 = null;
        pz40 pz40Var = this.e;
        Context context = this.d;
        bpl bplVar = this.c;
        ngk0 ngk0Var = this.b;
        kz3 kz3Var = (kz3) obj;
        switch (b) {
            case 0:
                kz3Var.getClass();
                y3d y3dVar = (y3d) ngk0Var.get(bplVar.c);
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
                        ngk0Var.put(bplVar.c, new y3d(jD));
                        pz40Var.setValue(new y3d(jD));
                    }
                } else {
                    pz40Var.setValue(y3dVar);
                }
                break;
            case 1:
                kz3Var.getClass();
                y3d y3dVar2 = (y3d) ngk0Var.get(bplVar.c);
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
                        ngk0Var.put(bplVar.c, new y3d(jD2));
                        pz40Var.setValue(new y3d(jD2));
                    }
                } else {
                    pz40Var.setValue(y3dVar2);
                }
                break;
            case 2:
                kz3Var.getClass();
                y3d y3dVar3 = (y3d) ngk0Var.get(bplVar.c);
                if (y3dVar3 == null) {
                    dyw dywVar3 = kz3Var.b.f13073a;
                    Resources resources3 = context.getResources();
                    resources3.getClass();
                    Drawable drawableQ3 = c3x.q(dywVar3, resources3);
                    BitmapDrawable bitmapDrawable3 = drawableQ3 instanceof BitmapDrawable ? (BitmapDrawable) drawableQ3 : null;
                    if (bitmapDrawable3 != null && (bitmap3 = bitmapDrawable3.getBitmap()) != null) {
                        bitmapS0 = vzb.s0(bitmap3);
                    }
                    if (bitmapS0 != null) {
                        long jD3 = fbc.d(bitmapS0.getPixel(2, bitmapS0.getHeight() / 2));
                        ngk0Var.put(bplVar.c, new y3d(jD3));
                        pz40Var.setValue(new y3d(jD3));
                    }
                } else {
                    pz40Var.setValue(y3dVar3);
                }
                break;
            default:
                kz3Var.getClass();
                y3d y3dVar4 = (y3d) ngk0Var.get(bplVar.c);
                if (y3dVar4 == null) {
                    dyw dywVar4 = kz3Var.b.f13073a;
                    Resources resources4 = context.getResources();
                    resources4.getClass();
                    Drawable drawableQ4 = c3x.q(dywVar4, resources4);
                    BitmapDrawable bitmapDrawable4 = drawableQ4 instanceof BitmapDrawable ? (BitmapDrawable) drawableQ4 : null;
                    if (bitmapDrawable4 != null && (bitmap4 = bitmapDrawable4.getBitmap()) != null) {
                        bitmapS0 = vzb.s0(bitmap4);
                    }
                    if (bitmapS0 != null) {
                        long jD4 = fbc.d(bitmapS0.getPixel(2, bitmapS0.getHeight() / 2));
                        ngk0Var.put(bplVar.c, new y3d(jD4));
                        pz40Var.setValue(new y3d(jD4));
                    }
                } else {
                    pz40Var.setValue(y3dVar4);
                }
                break;
        }
        return Unit.f46060a;
    }
}
