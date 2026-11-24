package a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatTextView;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class j8l extends AppCompatTextView {
    public final float i;
    public final int j;
    public int k;
    public c4m0 l;
    public final String m;
    public final DecimalFormat n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8l(Context context, boolean z) {
        super(context);
        context.getClass();
        float dimension = getResources().getDimension(R.dimen.text_10);
        this.i = dimension;
        this.j = getResources().getDimensionPixelSize(R.dimen.size_16);
        this.k = getResources().getDimensionPixelOffset(R.dimen.space_4);
        String string = context.getResources().getString(R.string.moba_hero_respawn_timer);
        string.getClass();
        this.m = string;
        this.n = new DecimalFormat("00");
        setTextAppearance(R.style.TextAppearance_Caption_Medium_M);
        setTextColor(context.getColor(R.color.static_white));
        setIncludeFontPadding(false);
        setGravity(16);
        setMaxLines(1);
        if (z) {
            aem0.r(this, (int) (dimension / 2.0f), (int) dimension, 1, 0);
        }
    }

    public static /* synthetic */ void l(j8l j8lVar, int i, long j, vne vneVar, int i2, float f, ucj ucjVar, int i3) {
        if ((i3 & 8) != 0) {
            i2 = j8lVar.j;
        }
        int i4 = i2;
        if ((i3 & 16) != 0) {
            f = j8lVar.i;
        }
        float f2 = f;
        Function0 rtjVar = ucjVar;
        if ((i3 & 32) != 0) {
            rtjVar = new rtj((byte) 28);
        }
        j8lVar.k(i, j, vneVar, i4, f2, rtjVar);
    }

    public final void j(int i, int i2) {
        int iB = si30.b(i2 * 0.25f);
        this.k = iB;
        setCompoundDrawablePadding(iB);
        Context context = getContext();
        context.getClass();
        Drawable drawableU = sj3.U(i, context);
        if (drawableU != null) {
            drawableU.setBounds(0, 0, i2, i2);
        }
        setCompoundDrawables(drawableU, null, null, null);
    }

    public final void k(int i, long j, vne vneVar, int i2, float f, Function0 function0) {
        vneVar.getClass();
        function0.getClass();
        setTextSize(0, f);
        j(i, i2);
        c4m0 c4m0Var = this.l;
        yje yjeVar = null;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        this.l = slb.U(new fnq(sac.L(6, TimeUnit.SECONDS.toMillis(j), 0L), new qe5((Object) this, (Object) function0, yjeVar, (byte) 3), (byte) 4), d5c.S(vneVar, tvk.f34603a));
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c4m0 c4m0Var = this.l;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
    }
}
