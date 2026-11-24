package a;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class f7l extends AppCompatImageView {
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final s1g h;
    public final float i;
    public final float j;
    public x9b k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7l(Context context) {
        super(context, null, 0);
        context.getClass();
        this.d = context.getResources().getDimensionPixelSize(R.dimen.corner_radius_4);
        this.e = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.f = getResources().getDimensionPixelSize(R.dimen.space_1);
        this.g = getResources().getDimensionPixelSize(R.dimen.space_6);
        this.h = new s1g(this, R.color.static_black_40);
        this.i = getResources().getDimension(R.dimen.corner_radius_8);
        this.j = getResources().getDimension(R.dimen.corner_radius_16);
        setLayoutParams(new ViewGroup.LayoutParams(getResources().getDimensionPixelOffset(R.dimen.size_42), getResources().getDimensionPixelOffset(R.dimen.size_32)));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        this.h.a(canvas);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.h.b(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b  */
    public final void setImageItem(x9b x9bVar) {
        f7l f7lVar;
        b9b b9bVar;
        boolean zD;
        c9b c9bVar;
        float f;
        e9b type;
        boolean zD2;
        int i;
        int i2;
        x9bVar.getClass();
        if (Intrinsics.d(this.k, x9bVar)) {
            return;
        }
        if (!(x9bVar instanceof u9b)) {
            if (x9bVar instanceof v9b) {
                List list = u0d.f34849a;
                f7lVar = this;
                u0d.j(f7lVar, ((v9b) x9bVar).f37026a, R.drawable.dota2_item_placeholder_with_background, 0, kotlin.collections.a.c(new j2x(this.d)), null, null, 492);
            }
            e9b type2 = x9bVar.getType();
            b9bVar = b9b.f2200a;
            zD = Intrinsics.d(type2, b9bVar);
            c9bVar = c9b.f3954a;
            if (!zD || Intrinsics.d(type2, c9bVar)) {
                f = f7lVar.j;
            } else {
                f = f7lVar.i;
            }
            type = x9bVar.getType();
            if (Intrinsics.d(type, c9bVar)) {
                i2 = f7lVar.f;
            } else {
                zD2 = Intrinsics.d(type, b9bVar);
                i = f7lVar.g;
                if (!zD2) {
                    i2 = i;
                } else if (type instanceof a9b) {
                    i2 = f7lVar.e;
                } else {
                    if (!(type instanceof d9b)) {
                        t9f.b();
                        return;
                    }
                    i2 = i;
                }
            }
            f7lVar.setPadding(i2, i2, i2, i2);
            f7lVar.h.c(f);
            f7lVar.k = x9bVar;
            f7lVar.setTag("DotaSingleImageItem");
        }
        List list2 = u0d.f34849a;
        u0d.i(this, ((u9b) x9bVar).f35275a);
        f7lVar = this;
        e9b type3 = x9bVar.getType();
        b9bVar = b9b.f2200a;
        zD = Intrinsics.d(type3, b9bVar);
        c9bVar = c9b.f3954a;
        if (zD) {
            f = f7lVar.j;
        } else {
            f = f7lVar.j;
        }
        type = x9bVar.getType();
        if (Intrinsics.d(type, c9bVar)) {
            i2 = f7lVar.f;
        } else {
            zD2 = Intrinsics.d(type, b9bVar);
            i = f7lVar.g;
            if (!zD2) {
                i2 = i;
            } else if (type instanceof a9b) {
                i2 = f7lVar.e;
            } else {
                if (!(type instanceof d9b)) {
                    t9f.b();
                    return;
                }
                i2 = i;
            }
        }
        f7lVar.setPadding(i2, i2, i2, i2);
        f7lVar.h.c(f);
        f7lVar.k = x9bVar;
        f7lVar.setTag("DotaSingleImageItem");
    }
}
