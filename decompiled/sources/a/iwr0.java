package a;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes6.dex */
public final class iwr0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15505a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ViewGroup c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ iwr0(View view, ViewGroup viewGroup, int i, int i2, byte b) {
        this.f15505a = b;
        this.b = view;
        this.c = viewGroup;
        this.d = i;
        this.e = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lld lldVar;
        byte b = this.f15505a;
        int i = this.e;
        int i2 = this.d;
        ViewGroup viewGroup = this.c;
        View view = this.b;
        switch (b) {
            case 0:
                Rect rect = new Rect();
                view.getDrawingRect(rect);
                viewGroup.offsetDescendantRectToMyCoords(view, rect);
                int dimensionPixelSize = view.getResources().getDimensionPixelSize(i2);
                int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(i);
                int i3 = rect.right;
                int i4 = rect.left;
                int i5 = i3 - i4;
                int i6 = rect.bottom;
                int i7 = rect.top;
                int i8 = i6 - i7;
                if (dimensionPixelSize2 > i8) {
                    int i9 = dimensionPixelSize2 - i8;
                    int i10 = i9 / 2;
                    rect.top = i7 - i10;
                    rect.bottom = (i9 - i10) + i6;
                }
                if (dimensionPixelSize > i5) {
                    int i11 = dimensionPixelSize - i5;
                    int i12 = i11 / 2;
                    rect.left = i4 - i12;
                    rect.right = (i11 - i12) + i3;
                }
                TouchDelegate touchDelegate = viewGroup.getTouchDelegate();
                lldVar = touchDelegate instanceof lld ? (lld) touchDelegate : null;
                if (lldVar == null) {
                    lldVar = new lld(viewGroup);
                    viewGroup.setTouchDelegate(lldVar);
                }
                lldVar.f20241a.put(view, new TouchDelegate(rect, view));
                break;
            default:
                Rect rect2 = new Rect();
                view.getDrawingRect(rect2);
                viewGroup.offsetDescendantRectToMyCoords(view, rect2);
                rect2.left -= i2;
                rect2.right += i2;
                rect2.top -= i;
                rect2.bottom += i;
                TouchDelegate touchDelegate2 = viewGroup.getTouchDelegate();
                lldVar = touchDelegate2 instanceof lld ? (lld) touchDelegate2 : null;
                if (lldVar == null) {
                    lldVar = new lld(viewGroup);
                    viewGroup.setTouchDelegate(lldVar);
                }
                lldVar.f20241a.put(view, new TouchDelegate(rect2, view));
                break;
        }
    }
}
