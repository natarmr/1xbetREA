package a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.common.MediaItem;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qrm implements zf60, sg00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29218a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qrm(Object obj, int i) {
        this.b = obj;
        this.f29218a = i;
    }

    @Override // a.sg00
    public void invoke(Object obj) {
        ((ky90) obj).o((MediaItem) this.b, this.f29218a);
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        int iWidth;
        Context context = (Context) this.b;
        view.getClass();
        pfx pfxVarI = xiv0Var.f40966a.i(519);
        pfxVarI.getClass();
        int i = pfxVarI.c;
        int i2 = pfxVarI.f26926a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            hny.u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (f7k.X(context)) {
            iWidth = this.f29218a;
        } else {
            mjv0.f21914a.getClass();
            njv0 njv0Var = ljv0.b;
            njv0Var.getClass();
            iWidth = njv0Var.b(context).f18406a.c().width() - (i2 + i);
        }
        marginLayoutParams.bottomMargin = pfxVarI.d;
        marginLayoutParams.width = iWidth;
        if (f7k.X(context)) {
            mjv0.f21914a.getClass();
            njv0 njv0Var2 = ljv0.b;
            njv0Var2.getClass();
            int iWidth2 = ((njv0Var2.b(context).f18406a.c().width() - iWidth) - (i2 + i)) / 2;
            marginLayoutParams.leftMargin = i2 + iWidth2;
            marginLayoutParams.rightMargin = iWidth2 + i;
        } else {
            marginLayoutParams.leftMargin = i2;
            marginLayoutParams.rightMargin = i;
        }
        view.setLayoutParams(marginLayoutParams);
        return xiv0.b;
    }
}
