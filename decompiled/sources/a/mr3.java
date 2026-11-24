package a;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import org.xbet.client1.R;
import org.xplatform.client1.features.appactivity.ApplicationActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mr3 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22249a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mr3(View view, View view2, w6k w6kVar, pz40 pz40Var) {
        this.f22249a = (byte) 1;
        this.b = view;
        this.c = view2;
        this.d = w6kVar;
        this.e = pz40Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int height;
        byte b = this.f22249a;
        Object obj = this.e;
        Object obj2 = this.d;
        View view = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                jie0 jie0Var = (jie0) obj2;
                ApplicationActivity applicationActivity = (ApplicationActivity) obj;
                int i = ApplicationActivity.F1;
                if (!((hie0) obj3).f13108a) {
                    ApplicationActivity.y(view, jie0Var, applicationActivity);
                    break;
                }
                break;
            case 1:
                View view2 = (View) obj3;
                w6k w6kVar = (w6k) obj2;
                pz40 pz40Var = (pz40) obj;
                view.getClass();
                View viewFindViewById = view.findViewById(R.id.snackBarView);
                if (viewFindViewById != null) {
                    int[] iArr = new int[2];
                    viewFindViewById.getLocationInWindow(iArr);
                    height = iArr[1];
                } else {
                    height = view.getHeight();
                }
                Rect rect = new Rect();
                view2.getWindowVisibleDisplayFrame(rect);
                int i2 = rect.bottom;
                int[] iArr2 = new int[2];
                view2.getLocationInWindow(iArr2);
                int measuredHeight = view2.getMeasuredHeight() + iArr2[1];
                float fR0 = i2 < height ? w6kVar.r0(measuredHeight - i2) : w6kVar.r0(measuredHeight - height);
                zcl zclVar = qmk.f28987a;
                if (fR0 < 0.0f) {
                    fR0 = 0.0f;
                }
                pz40Var.setValue(new ycl(fR0));
                break;
            default:
                jie0 jie0Var2 = (jie0) obj2;
                pz40 pz40Var2 = (pz40) obj;
                if (!((hie0) obj3).f13108a) {
                    osm0.n(view, jie0Var2, pz40Var2);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ mr3(byte b, hie0 hie0Var, jie0 jie0Var, View view, Object obj) {
        this.f22249a = b;
        this.c = hie0Var;
        this.b = view;
        this.d = jie0Var;
        this.e = obj;
    }
}
