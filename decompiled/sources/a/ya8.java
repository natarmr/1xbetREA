package a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ya8 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 1;
    public boolean j;
    public final /* synthetic */ pz40 k;
    public final /* synthetic */ Context l;
    public final /* synthetic */ String m;
    public final /* synthetic */ w6k n;
    public final /* synthetic */ float o;
    public final /* synthetic */ pz40 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya8(pz40 pz40Var, Context context, String str, w6k w6kVar, float f, pz40 pz40Var2, yje yjeVar) {
        super(2, yjeVar);
        this.k = pz40Var;
        this.l = context;
        this.m = str;
        this.n = w6kVar;
        this.o = f;
        this.p = pz40Var2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new ya8(this.l, this.m, this.n, this.k, this.o, this.p, yjeVar);
            default:
                return new ya8(this.k, this.l, this.m, this.n, this.o, this.p, yjeVar);
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
        return ((ya8) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objC;
        Bitmap bitmap;
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                Context context = this.l;
                if (!z) {
                    z1x.P(obj);
                    gbe0 gbe0VarB = new f7u(context).b();
                    k1x k1xVar = new k1x(context);
                    k1xVar.c = this.m;
                    pz40 pz40Var = this.k;
                    k1xVar.d((int) (((qkx) pz40Var.getValue()).f28908a >> 32), (int) (4294967295L & ((qkx) pz40Var.getValue()).f28908a));
                    t1x.a(k1xVar, false);
                    o1x o1xVarA = k1xVar.a();
                    this.j = true;
                    objC = gbe0VarB.c(o1xVarA, this);
                    if (objC == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objC = obj;
                }
                u1x u1xVar = (u1x) objC;
                boolean z2 = u1xVar instanceof hhn0;
                pz40 pz40Var2 = this.p;
                if (z2) {
                    dyw dywVar = ((hhn0) u1xVar).f13073a;
                    Resources resources = context.getResources();
                    resources.getClass();
                    Drawable drawableQ = c3x.q(dywVar, resources);
                    if (drawableQ instanceof BitmapDrawable) {
                        bitmap = ((BitmapDrawable) drawableQ).getBitmap();
                    } else {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableQ.getIntrinsicWidth(), drawableQ.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        drawableQ.setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                        drawableQ.draw(canvas);
                        bitmap = bitmapCreateBitmap;
                    }
                    float fW0 = this.n.w0(this.o);
                    bitmap.getClass();
                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap);
                    bitmapCreateBitmap2.getClass();
                    RenderScript renderScriptCreate = RenderScript.create(context);
                    Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
                    Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap2);
                    ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                    scriptIntrinsicBlurCreate.setRadius(l1e0.c(fW0, 1.0f, 25.0f));
                    scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                    scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                    allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap2);
                    renderScriptCreate.destroy();
                    pz40Var2.setValue(bitmapCreateBitmap2);
                } else {
                    pz40Var2.setValue(null);
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    pz40 pz40Var3 = this.k;
                    if (((int) (((qkx) pz40Var3.getValue()).f28908a >> 32)) == 0 || ((int) (4294967295L & ((qkx) pz40Var3.getValue()).f28908a)) == 0) {
                        return Unit.f46060a;
                    }
                    rwj rwjVar = tvk.f34603a;
                    dvj dvjVar = dvj.c;
                    ya8 ya8Var = new ya8(this.l, this.m, this.n, pz40Var3, this.o, this.p, (yje) null);
                    this.j = true;
                    if (qjj.d0(dvjVar, ya8Var, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya8(Context context, String str, w6k w6kVar, pz40 pz40Var, float f, pz40 pz40Var2, yje yjeVar) {
        super(2, yjeVar);
        this.l = context;
        this.m = str;
        this.n = w6kVar;
        this.k = pz40Var;
        this.o = f;
        this.p = pz40Var2;
    }
}
