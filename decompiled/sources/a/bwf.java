package a;

import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes.dex */
public final class bwf extends DataSetObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3321a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bwf(Object obj, byte b) {
        this.f3321a = b;
        this.b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        byte b = this.f3321a;
        Object obj = this.b;
        switch (b) {
            case 0:
                lhn0 lhn0Var = (lhn0) obj;
                lhn0Var.f5078a = true;
                lhn0Var.notifyDataSetChanged();
                break;
            case 1:
                of00 of00Var = (of00) obj;
                if (of00Var.z.isShowing()) {
                    of00Var.q();
                }
                break;
            case 2:
                ((TabLayout) obj).h();
                break;
            default:
                ((ViewPager) obj).e();
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        byte b = this.f3321a;
        Object obj = this.b;
        switch (b) {
            case 0:
                lhn0 lhn0Var = (lhn0) obj;
                lhn0Var.f5078a = false;
                lhn0Var.notifyDataSetInvalidated();
                break;
            case 1:
                ((of00) obj).dismiss();
                break;
            case 2:
                ((TabLayout) obj).h();
                break;
            default:
                ((ViewPager) obj).e();
                break;
        }
    }
}
