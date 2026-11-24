package a;

import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetAlertModel;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kjn implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18394a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ kjn(View view, ImageView imageView, RecyclerView recyclerView, zr50 zr50Var, ct5 ct5Var) {
        this.f18394a = (byte) 1;
        this.b = view;
        this.c = imageView;
        this.d = recyclerView;
        this.e = zr50Var;
        this.f = ct5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f18394a;
        boolean z = false;
        Object obj = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                c9o0 c9o0Var = (c9o0) obj4;
                c9o0 c9o0Var2 = (c9o0) obj3;
                View view = (View) obj;
                Window window = ((agd) obj2).getWindow();
                window.getClass();
                Function1 function1 = c9o0Var.c;
                Resources resources = view.getResources();
                resources.getClass();
                boolean zBooleanValue = ((Boolean) function1.invoke(resources)).booleanValue();
                Function1 function2 = c9o0Var2.c;
                Resources resources2 = view.getResources();
                resources2.getClass();
                ((tjn) obj5).b(c9o0Var, c9o0Var2, window, view, zBooleanValue, ((Boolean) function2.invoke(resources2)).booleanValue());
                break;
            case 1:
                View view2 = (View) obj;
                ImageView imageView = (ImageView) obj5;
                zr50 zr50Var = (zr50) obj3;
                ct5 ct5Var = (ct5) obj2;
                view2.getLayoutParams().width = (int) Math.min(((RecyclerView) obj4).getWidth() * 0.88f, (imageView.getLayoutParams().height * 2.58f) + view2.getPaddingEnd() + view2.getPaddingStart());
                zr50Var.y = null;
                List list = u0d.f34849a;
                u0d.j(imageView, ct5Var.b, R.drawable.plug_news, 0, kotlin.collections.a.c(new j2x(16)), new rw40(zr50Var, ct5Var, (byte) 13), new b530((Object) zr50Var, (byte) 22), 108);
                break;
            case 2:
                TableViewImpl tableViewImpl = (TableViewImpl) obj4;
                iva ivaVar = (iva) obj3;
                pz40 pz40Var = (pz40) obj;
                ((glo0) obj5).getClass();
                glo0.a(tableViewImpl);
                TableViewImpl tableViewImpl2 = (TableViewImpl) ((pz40) obj2).getValue();
                if (tableViewImpl2 != null) {
                    glo0.a(tableViewImpl2);
                }
                if (!ivaVar.d.isEmpty() && tableViewImpl.getCellRecyclerView().canScrollVertically(1)) {
                    z = true;
                }
                pz40Var.setValue(Boolean.valueOf(z));
                break;
            default:
                Fragment fragment = (Fragment) obj5;
                lgn0 lgn0Var = (lgn0) obj4;
                String str = (String) obj3;
                v1r v1rVar = (v1r) obj2;
                SuccessBetAlertModel successBetAlertModel = (SuccessBetAlertModel) obj;
                if (fragment.N()) {
                    wdk0.k(lgn0Var.c, new xdk0(qek0.f28589a, str, null, new hdk0(lgn0Var.d.b.a(R.string.history, Arrays.copyOf(new Object[0], 0)), new o0k0(lgn0Var, v1rVar, successBetAlertModel)), jtv.x, null, 100), fragment, null, null, false, null, 1020);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ kjn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.f18394a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = obj5;
    }
}
