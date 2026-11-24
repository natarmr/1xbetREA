package a;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class pva implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27653a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pva(ViewGroup viewGroup, Object obj, Object obj2, byte b) {
        this.f27653a = b;
        this.b = viewGroup;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        byte b = this.f27653a;
        Object obj = this.d;
        Object obj2 = this.c;
        ViewGroup viewGroup = this.b;
        switch (b) {
            case 0:
                view.getClass();
                view.removeOnLayoutChangeListener(this);
                ((qva) viewGroup).d((TextView) obj2, (String) obj);
                break;
            case 1:
                view.getClass();
                view.removeOnLayoutChangeListener(this);
                ((WebView) viewGroup).scrollTo(0, ((Integer) obj2).intValue());
                bj5 bj5Var = bib.X1;
                ((bib) obj).L0();
                break;
            case 2:
                view.getClass();
                view.removeOnLayoutChangeListener(this);
                i8l i8lVar = (i8l) viewGroup;
                j8l roshanTextView = i8lVar.getRoshanTextView();
                d8l d8lVar = (d8l) obj2;
                p7l p7lVar = i8lVar.f14344a;
                j8l.l(roshanTextView, R.drawable.dota_roshan_ic, d8lVar.f5654a, (vne) obj, p7lVar.e(), p7lVar.f(), null, 32);
                j8l roshanTextView2 = i8lVar.getRoshanTextView();
                boolean z = d8lVar.b;
                roshanTextView2.setVisibility(z ? 0 : 8);
                i8lVar.j = z;
                break;
            case 3:
                view.removeOnLayoutChangeListener(this);
                ((WebView) viewGroup).scrollTo(0, ((Integer) obj2).intValue());
                rl70 rl70Var = qwc0.Z1;
                ((qwc0) obj).L0();
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                ((WebView) viewGroup).scrollTo(0, ((Integer) obj2).intValue());
                jh70 jh70Var = kxc0.Y1;
                ((kxc0) obj).L0();
                break;
        }
    }
}
