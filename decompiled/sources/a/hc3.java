package a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.motion.AppBarMotionLayout;
import org.xplatform.uikit.components.account_selection.DsAccountSelection;

/* JADX INFO: loaded from: classes.dex */
public final class hc3 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12800a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public hc3(dc3 dc3Var, do20 do20Var, ViewGroup viewGroup, int i) {
        this.c = dc3Var;
        this.d = viewGroup;
        this.b = i;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        byte b = this.f12800a;
        int i9 = this.b;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                if (((AppBarMotionLayout) ((dc3) obj).b).getCurrentState() == R.id.start) {
                    do20.q((ViewGroup) obj2, i9);
                }
                break;
            case 1:
                view.getClass();
                view.removeOnLayoutChangeListener(this);
                p8l p8lVar = (p8l) obj;
                o7l o7lVarM = p8lVar.m();
                p7l p7lVar = (p7l) p8lVar.c;
                o7lVarM.j(p7lVar.v * p7lVar.e, i9, si30.b(p7lVar.w * p7lVar.e), (String) obj2);
                break;
            default:
                DsAccountSelection dsAccountSelection = (DsAccountSelection) obj2;
                jg jgVar = (jg) obj;
                view.getClass();
                view.removeOnLayoutChangeListener(this);
                boolean z = i9 == 0;
                ImageView imageView = (ImageView) jgVar.j;
                ImageView imageView2 = (ImageView) jgVar.j;
                ImageView imageView3 = (ImageView) jgVar.i;
                imageView.setVisibility(z ? 0 : 8);
                if (i9 == 0) {
                    int i10 = DsAccountSelection.z;
                    int i11 = dsAccountSelection.p() ? R.drawable.ic_glyph_wallet_alt_subtract_rtl : R.drawable.ic_glyph_wallet_alt_subtract;
                    int i12 = dsAccountSelection.p() ? R.drawable.ic_glyph_update_rtl : R.drawable.ic_glyph_update;
                    imageView3.setImageResource(i11);
                    imageView2.setImageResource(i12);
                } else {
                    int i13 = DsAccountSelection.z;
                    imageView3.setImageResource(dsAccountSelection.p() ? R.drawable.ic_glyph_reload_rtl : R.drawable.ic_glyph_reload);
                }
                if (dsAccountSelection.u == 1) {
                    Context context = dsAccountSelection.getContext();
                    context.getClass();
                    imageView3.setColorFilter(m5d.b(R.attr.uikitStaticWhite, context));
                    Context context2 = dsAccountSelection.getContext();
                    context2.getClass();
                    imageView2.setColorFilter(m5d.b(R.attr.uikitStaticWhite, context2));
                }
                break;
        }
    }

    public hc3(int i, jg jgVar, DsAccountSelection dsAccountSelection) {
        this.b = i;
        this.c = jgVar;
        this.d = dsAccountSelection;
    }

    public hc3(p8l p8lVar, int i, String str) {
        this.c = p8lVar;
        this.b = i;
        this.d = str;
    }
}
