package a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class m7l extends AppCompatImageView {
    public final Paint d;
    public final int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7l(Context context) {
        super(context, null);
        context.getClass();
        Paint paint = new Paint(1);
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        this.d = paint;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.space_1);
        this.e = dimensionPixelSize;
        setScaleType(ImageView.ScaleType.CENTER);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        float width = getWidth() / 2.0f;
        int width2 = getWidth();
        int height = getHeight();
        if (width2 > height) {
            width2 = height;
        }
        canvas.drawCircle(width, width, width2 / 2.0f, this.d);
        super.onDraw(canvas);
    }

    public final void setRadiant(boolean z) {
        int iP;
        if (z) {
            Context context = getContext();
            context.getClass();
            iP = sj3.P(R.color.dota_stage_hero_radiant_glow_color, context);
        } else {
            Context context2 = getContext();
            context2.getClass();
            iP = sj3.P(R.color.dota_stage_hero_dire_glow_color, context2);
        }
        this.d.setShadowLayer(this.e * 2.0f, 0.0f, 0.0f, iP);
    }
}
