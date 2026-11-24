package a;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class so5 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32528a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ so5(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet);
        this.f32528a = b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.f32528a) {
            case 0:
                super.onAttachedToWindow();
                x0x.s(this);
                break;
            case 1:
                super.onAttachedToWindow();
                x0x.s(this);
                break;
            case 2:
                super.onAttachedToWindow();
                x0x.s(this);
                break;
            case 3:
                super.onAttachedToWindow();
                x0x.s(this);
                break;
            case 4:
                super.onAttachedToWindow();
                x0x.s(this);
                break;
            case 5:
                super.onAttachedToWindow();
                x0x.s(this);
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.f32528a) {
            case 0:
                super.onDetachedFromWindow();
                x0x.O(this);
                break;
            case 1:
                super.onDetachedFromWindow();
                x0x.O(this);
                break;
            case 2:
                super.onDetachedFromWindow();
                x0x.O(this);
                break;
            case 3:
                super.onDetachedFromWindow();
                x0x.O(this);
                break;
            case 4:
                super.onDetachedFromWindow();
                x0x.O(this);
                break;
            case 5:
                super.onDetachedFromWindow();
                x0x.O(this);
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }
}
