package a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class nb8 extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23227a = 1;
    public float b;
    public final Paint c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Parcelable g;

    public nb8(Context context, Drawable drawable, int i, int i2) {
        int i3;
        context.getClass();
        drawable.getClass();
        this.d = drawable;
        this.b = 1.0f;
        int i4 = R.drawable.domino_value_1;
        switch (i) {
            case 1:
                i3 = R.drawable.domino_value_1;
                break;
            case 2:
                i3 = R.drawable.domino_value_2;
                break;
            case 3:
                i3 = R.drawable.domino_value_3;
                break;
            case 4:
                i3 = R.drawable.domino_value_4;
                break;
            case 5:
                i3 = R.drawable.domino_value_5;
                break;
            case 6:
                i3 = R.drawable.domino_value_6;
                break;
            default:
                i3 = -1;
                break;
        }
        this.e = i3 == -1 ? null : epv0.U(i3, context);
        switch (i2) {
            case 1:
                break;
            case 2:
                i4 = R.drawable.domino_value_2;
                break;
            case 3:
                i4 = R.drawable.domino_value_3;
                break;
            case 4:
                i4 = R.drawable.domino_value_4;
                break;
            case 5:
                i4 = R.drawable.domino_value_5;
                break;
            case 6:
                i4 = R.drawable.domino_value_6;
                break;
            default:
                i4 = -1;
                break;
        }
        this.f = i4 != -1 ? epv0.U(i4, context) : null;
        this.c = new Paint();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        byte b = this.f23227a;
        Paint paint = this.c;
        canvas.getClass();
        switch (b) {
            case 0:
                Bitmap bitmap = (Bitmap) this.g;
                if (bitmap != null) {
                    paint.setAlpha((int) (255.0f * this.b));
                    canvas.drawBitmap(bitmap, getBounds().left, getBounds().top, paint);
                    break;
                }
                break;
            default:
                Path path = (Path) this.e;
                path.moveTo(0.0f, 0.0f);
                RectF rectF = (RectF) this.g;
                float f = this.b;
                path.addRoundRect(rectF, f, f, Path.Direction.CW);
                double radians = Math.toRadians(45.0d);
                float fHeight = (float) (((double) getBounds().height()) * 0.23d);
                float fTan = (float) (((double) fHeight) / Math.tan(radians));
                Path path2 = (Path) this.f;
                path2.moveTo(0.0f, 0.0f);
                path2.lineTo(fTan, fHeight);
                float f2 = fTan * 2.0f;
                path2.lineTo(f2, 0.0f);
                path.addPath(path2, (float) ((((double) getBounds().width()) * 0.8d) - ((double) f2)), (float) (((double) getBounds().height()) * 0.73d));
                canvas.drawPath(path, paint);
                canvas.drawPath(path, (Paint) this.d);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.f23227a) {
            case 0:
                return 0;
            default:
                return -2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        byte b = this.f23227a;
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        switch (this.f23227a) {
            case 0:
                Drawable drawable = (Drawable) this.f;
                Drawable drawable2 = (Drawable) this.e;
                Drawable drawable3 = (Drawable) this.d;
                rect.getClass();
                super.setBounds(rect);
                if (rect.height() != 0 || rect.width() != 0) {
                    drawable3.setBounds(0, 0, rect.width(), rect.height());
                    int iHeight = rect.height() >> 1;
                    if (drawable2 != null) {
                        drawable2.setBounds(0, 0, rect.width(), rect.height() - iHeight);
                    }
                    if (drawable != null) {
                        drawable.setBounds(0, rect.height() - iHeight, rect.width(), rect.height());
                    }
                    Bitmap bitmap = (Bitmap) this.g;
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap.getClass();
                    this.g = bitmapCreateBitmap;
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    drawable3.draw(canvas);
                    if (drawable2 != null) {
                        drawable2.draw(canvas);
                    }
                    if (drawable != null) {
                        drawable.draw(canvas);
                    }
                }
                break;
            default:
                super.setBounds(rect);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        byte b = this.f23227a;
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }

    public nb8(float f, int i) {
        this.b = f;
        Paint paint = new Paint(1);
        paint.setShadowLayer(4.0f, 0.0f, 2.0f, -16777216);
        this.c = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(i);
        paint2.setStyle(Paint.Style.FILL);
        this.d = paint2;
        this.e = new Path();
        this.f = new Path();
        this.g = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        switch (this.f23227a) {
            case 1:
                super.setBounds(i, i2, i3, i4);
                ((RectF) this.g).set(i, i2, getBounds().width(), (float) (((double) getBounds().height()) * 0.73d));
                break;
            default:
                super.setBounds(i, i2, i3, i4);
                break;
        }
    }
}
