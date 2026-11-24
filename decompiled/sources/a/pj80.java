package a;

import android.database.DataSetObservable;
import android.os.Parcelable;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class pj80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataSetObservable f27076a = new DataSetObservable();

    public void a(ViewPager viewPager, int i, Object obj) {
        obj.getClass();
        viewPager.removeView((View) obj);
    }

    public abstract int c();

    public abstract Object d(ViewPager viewPager, int i);

    public boolean e(View view, Object obj) {
        view.getClass();
        obj.getClass();
        return Intrinsics.d(view, obj);
    }

    public Parcelable g() {
        return null;
    }

    public void b() {
    }

    public void h(Object obj) {
    }

    public void i(ViewPager viewPager) {
    }

    public void f(Parcelable parcelable, ClassLoader classLoader) {
    }
}
