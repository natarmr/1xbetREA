package a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* JADX INFO: loaded from: classes2.dex */
public final class dc5 extends lls0 {
    public static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5834a;
    public final Context b;
    public final String c;

    public dc5(Context context, byte b) {
        this.f5834a = b;
        switch (b) {
            case 1:
                context.getClass();
                this.b = context;
                this.c = "BlurCoilTransformation(25.0)";
                break;
            default:
                context.getClass();
                this.b = context;
                this.c = "BackgroundBlurCoilTransformation(25.0)";
                break;
        }
    }

    @Override // a.lls0
    public final String a() {
        byte b = this.f5834a;
        return this.c;
    }

    @Override // a.lls0
    public final Bitmap b(Bitmap bitmap, f7k0 f7k0Var) throws Throwable {
        switch (this.f5834a) {
            case 0:
                umk umkVar = f7k0Var.f9062a;
                int width = umkVar instanceof rmk ? ((rmk) umkVar).f30747a : bitmap.getWidth();
                umk umkVar2 = f7k0Var.b;
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, umkVar2 instanceof rmk ? ((rmk) umkVar2).f30747a : bitmap.getHeight(), false);
                bitmapCreateScaledBitmap.getClass();
                Context context = this.b;
                int iArgb = Color.argb(90, 0, 0, 0);
                synchronized (d) {
                    Canvas canvas = new Canvas(bitmapCreateScaledBitmap);
                    canvas.scale(1.0f, 1.0f);
                    Paint paint = new Paint();
                    paint.setFlags(2);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    canvas.drawColor(iArgb);
                    canvas.setBitmap(null);
                    try {
                        c(context, bitmapCreateScaledBitmap);
                    } catch (RSRuntimeException e) {
                        e.printStackTrace();
                    }
                    break;
                }
                float height = bitmap.getHeight() / bitmap.getWidth();
                float width2 = bitmap.getWidth() * (bitmapCreateScaledBitmap.getWidth() / bitmap.getWidth());
                float f = height * width2;
                Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmap, (int) width2, (int) f, false);
                bitmapCreateScaledBitmap2.getClass();
                float width3 = (bitmapCreateScaledBitmap.getWidth() - width2) / 2.0f;
                float height2 = (bitmapCreateScaledBitmap.getHeight() - f) / 2.0f;
                synchronized (d) {
                    Canvas canvas2 = new Canvas(bitmapCreateScaledBitmap);
                    Paint paint2 = new Paint();
                    paint2.setFlags(2);
                    canvas2.drawBitmap(bitmapCreateScaledBitmap2, width3, height2, paint2);
                    canvas2.setBitmap(null);
                }
                return bitmapCreateScaledBitmap;
            default:
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (bitmap.getWidth() * 0.55f), (int) (bitmap.getHeight() * 0.55f), Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.getClass();
                Context context2 = this.b;
                int iArgb2 = Color.argb(90, 0, 0, 0);
                Canvas canvas3 = new Canvas(bitmapCreateBitmap);
                canvas3.scale(0.55f, 0.55f);
                Paint paint3 = new Paint();
                paint3.setFlags(2);
                canvas3.drawBitmap(bitmap, 0.0f, 0.0f, paint3);
                canvas3.drawColor(iArgb2);
                canvas3.setBitmap(null);
                try {
                    d(context2, bitmapCreateBitmap);
                    break;
                } catch (RSRuntimeException e2) {
                    e2.printStackTrace();
                }
                return bitmapCreateBitmap;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.renderscript.BaseObj] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.renderscript.BaseObj, android.renderscript.ScriptIntrinsicBlur] */
    public void c(Context context, Bitmap bitmap) throws Throwable {
        Allocation allocationCreateFromBitmap;
        Allocation allocationCreateTyped;
        ?? Create;
        Throwable th;
        RenderScript renderScriptCreate;
        try {
            renderScriptCreate = RenderScript.create(context);
            try {
                renderScriptCreate.setMessageHandler(new RenderScript.RSMessageHandler());
                allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap, Allocation.MipmapControl.MIPMAP_FULL, 128);
                try {
                    allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
                    try {
                        Create = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                        Create.setInput(allocationCreateFromBitmap);
                        Create.setRadius(25.0f);
                        Create.forEach(allocationCreateTyped);
                        try {
                            allocationCreateTyped.copyTo(bitmap);
                            renderScriptCreate.destroy();
                            allocationCreateFromBitmap.destroy();
                            allocationCreateTyped.destroy();
                            Create.destroy();
                        } catch (Throwable th2) {
                            th = th2;
                            if (renderScriptCreate != null) {
                                renderScriptCreate.destroy();
                            }
                            if (allocationCreateFromBitmap != null) {
                                allocationCreateFromBitmap.destroy();
                            }
                            if (allocationCreateTyped != null) {
                                allocationCreateTyped.destroy();
                            }
                            if (Create != 0) {
                                Create.destroy();
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        Create = 0;
                        th = th;
                        if (renderScriptCreate != null) {
                            renderScriptCreate.destroy();
                        }
                        if (allocationCreateFromBitmap != null) {
                            allocationCreateFromBitmap.destroy();
                        }
                        if (allocationCreateTyped != null) {
                            allocationCreateTyped.destroy();
                        }
                        if (Create != 0) {
                            Create.destroy();
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    allocationCreateTyped = null;
                    Create = allocationCreateTyped;
                    th = th;
                    if (renderScriptCreate != null) {
                        renderScriptCreate.destroy();
                    }
                    if (allocationCreateFromBitmap != null) {
                        allocationCreateFromBitmap.destroy();
                    }
                    if (allocationCreateTyped != null) {
                        allocationCreateTyped.destroy();
                    }
                    if (Create != 0) {
                        Create.destroy();
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                allocationCreateFromBitmap = null;
                allocationCreateTyped = null;
            }
        } catch (Throwable th6) {
            allocationCreateFromBitmap = null;
            allocationCreateTyped = null;
            Create = 0;
            th = th6;
            renderScriptCreate = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0055  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.renderscript.BaseObj] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.renderscript.BaseObj, android.renderscript.ScriptIntrinsicBlur] */
    public void d(Context context, Bitmap bitmap) throws Throwable {
        Allocation allocationCreateFromBitmap;
        Allocation allocationCreateTyped;
        ?? Create;
        Throwable th;
        RenderScript renderScriptCreate;
        try {
            renderScriptCreate = RenderScript.create(context);
            try {
                renderScriptCreate.setMessageHandler(new RenderScript.RSMessageHandler());
                allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
                try {
                    allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
                    try {
                        Create = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                        Create.setInput(allocationCreateFromBitmap);
                        Create.setRadius(25.0f);
                        Create.forEach(allocationCreateTyped);
                        try {
                            allocationCreateTyped.copyTo(bitmap);
                            renderScriptCreate.destroy();
                            allocationCreateFromBitmap.destroy();
                            allocationCreateTyped.destroy();
                            Create.destroy();
                        } catch (Throwable th2) {
                            th = th2;
                            if (renderScriptCreate != null) {
                                renderScriptCreate.destroy();
                            }
                            if (allocationCreateFromBitmap != null) {
                                allocationCreateFromBitmap.destroy();
                            }
                            if (allocationCreateTyped != null) {
                                allocationCreateTyped.destroy();
                            }
                            if (Create != 0) {
                                Create.destroy();
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        Create = 0;
                        th = th;
                        if (renderScriptCreate != null) {
                            renderScriptCreate.destroy();
                        }
                        if (allocationCreateFromBitmap != null) {
                            allocationCreateFromBitmap.destroy();
                        }
                        if (allocationCreateTyped != null) {
                            allocationCreateTyped.destroy();
                        }
                        if (Create != 0) {
                            Create.destroy();
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    allocationCreateTyped = null;
                    Create = allocationCreateTyped;
                    th = th;
                    if (renderScriptCreate != null) {
                        renderScriptCreate.destroy();
                    }
                    if (allocationCreateFromBitmap != null) {
                        allocationCreateFromBitmap.destroy();
                    }
                    if (allocationCreateTyped != null) {
                        allocationCreateTyped.destroy();
                    }
                    if (Create != 0) {
                        Create.destroy();
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                allocationCreateFromBitmap = null;
                allocationCreateTyped = null;
            }
        } catch (Throwable th6) {
            allocationCreateFromBitmap = null;
            allocationCreateTyped = null;
            Create = 0;
            th = th6;
            renderScriptCreate = null;
        }
    }
}
