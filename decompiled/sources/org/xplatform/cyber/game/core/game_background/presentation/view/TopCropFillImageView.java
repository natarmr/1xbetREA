package org.xplatform.cyber.game.core.game_background.presentation.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes2.dex */
public final class TopCropFillImageView extends AppCompatImageView {
    public final Matrix d;

    /* JADX WARN: Illegal instructions before constructor call */
    public TopCropFillImageView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.d = new Matrix();
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float width = getWidth();
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0.0f || intrinsicHeight <= 0.0f) {
            return;
        }
        float f = width / intrinsicWidth;
        Matrix matrix = this.d;
        matrix.reset();
        matrix.setScale(f, f);
        setImageMatrix(matrix);
        super.onDraw(canvas);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (bitmap != null) {
            if (Build.VERSION.SDK_INT >= 26 && bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, false);
            }
            if (bitmap != null) {
                setBackgroundColor(bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() - 1));
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (drawable != null) {
            Bitmap bitmap = null;
            if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
                BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
                bitmap = bitmapDrawable != null ? bitmapDrawable.getBitmap() : null;
                if (bitmap == null) {
                    bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                    drawable.draw(new Canvas(bitmap));
                } else if (Build.VERSION.SDK_INT >= 26 && bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                    bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, false);
                }
            }
            if (bitmap != null) {
                setBackgroundColor(bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() - 1));
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TopCropFillImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TopCropFillImageView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
