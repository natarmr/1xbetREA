package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.xplatform.uikit.components.badges.DsBadge;

/* JADX INFO: loaded from: classes.dex */
public final class le3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19881a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public le3(int i, View view, ViewParent viewParent) {
        this.f19881a = (byte) 4;
        this.c = view;
        this.b = i;
        this.d = viewParent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        tu9 tu9Var;
        ArrayList arrayList2;
        byte b = this.f19881a;
        Object obj = this.c;
        Object obj2 = this.d;
        int i = this.b;
        switch (b) {
            case 0:
                pe3.d((TextView) obj, (Typeface) obj2, i);
                return;
            case 1:
                if5 if5Var = (if5) obj2;
                DsBadge dsBadge = if5Var.c;
                if (dsBadge != null) {
                    Context context = if5Var.f14670a.getContext();
                    context.getClass();
                    jmu0.j(dsBadge, ColorStateList.valueOf(m5d.b(i, context)));
                    return;
                }
                return;
            case 2:
                ((BottomSheetBehavior) obj2).Q((View) obj, i, false);
                return;
            case 3:
                gd00 gd00Var = (gd00) obj2;
                ig00 ig00Var = (ig00) obj;
                boolean z = gd00Var.c;
                AtomicInteger atomicInteger = gd00Var.d;
                ArrayList arrayList3 = gd00Var.b;
                ig00 ig00Var2 = gd00Var.e;
                if (ig00Var2.isDone() || arrayList3 == null) {
                    z1x.y("Future was done before all dependencies completed", z);
                    return;
                }
                try {
                    z1x.y("Tried to set value from future which is not done", ig00Var.isDone());
                    arrayList3.set(i, ro4.Z(ig00Var));
                    int iDecrementAndGet = atomicInteger.decrementAndGet();
                    z1x.y("Less than 0 remaining futures", iDecrementAndGet >= 0);
                    if (iDecrementAndGet == 0) {
                        if (arrayList != null) {
                            tu9Var = gd00Var.f;
                            arrayList2 = new ArrayList(arrayList);
                            tu9Var.b(arrayList2);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (ExecutionException e) {
                    if (z) {
                        gd00Var.f.d(e.getCause());
                    }
                    int iDecrementAndGet2 = atomicInteger.decrementAndGet();
                    z1x.y("Less than 0 remaining futures", iDecrementAndGet2 >= 0);
                    if (iDecrementAndGet2 == 0) {
                        if (arrayList != null) {
                            tu9Var = gd00Var.f;
                            arrayList2 = new ArrayList(arrayList);
                        }
                        return;
                    }
                    return;
                } catch (RuntimeException e2) {
                    if (z) {
                        gd00Var.f.d(e2);
                    }
                    int iDecrementAndGet3 = atomicInteger.decrementAndGet();
                    z1x.y("Less than 0 remaining futures", iDecrementAndGet3 >= 0);
                    if (iDecrementAndGet3 == 0) {
                        if (arrayList != null) {
                            tu9Var = gd00Var.f;
                            arrayList2 = new ArrayList(arrayList);
                        }
                        return;
                    }
                    return;
                } catch (Error e3) {
                    gd00Var.f.d(e3);
                    int iDecrementAndGet4 = atomicInteger.decrementAndGet();
                    z1x.y("Less than 0 remaining futures", iDecrementAndGet4 >= 0);
                    if (iDecrementAndGet4 == 0) {
                        if (arrayList != null) {
                            tu9Var = gd00Var.f;
                            arrayList2 = new ArrayList(arrayList);
                        }
                        return;
                    }
                    return;
                } catch (CancellationException unused) {
                    if (z) {
                        gd00Var.cancel(false);
                    }
                    int iDecrementAndGet5 = atomicInteger.decrementAndGet();
                    z1x.y("Less than 0 remaining futures", iDecrementAndGet5 >= 0);
                    if (iDecrementAndGet5 == 0) {
                        if (arrayList != null) {
                            tu9Var = gd00Var.f;
                            arrayList2 = new ArrayList(arrayList);
                        }
                        return;
                    }
                    return;
                } finally {
                    int iDecrementAndGet6 = atomicInteger.decrementAndGet();
                    z1x.y("Less than 0 remaining futures", iDecrementAndGet6 >= 0);
                    if (iDecrementAndGet6 == 0) {
                        arrayList = gd00Var.b;
                        if (arrayList != null) {
                            gd00Var.f.b(new ArrayList(arrayList));
                        } else {
                            z1x.y(null, ig00Var2.isDone());
                        }
                    }
                }
            default:
                Rect rect = new Rect();
                View view = (View) obj;
                view.getHitRect(rect);
                rect.left = rect.left;
                rect.right = rect.right;
                rect.top -= i;
                rect.bottom += i;
                Object obj3 = (ViewParent) obj2;
                obj3.getClass();
                ((View) obj3).setTouchDelegate(new TouchDelegate(rect, view));
                return;
        }
    }

    public /* synthetic */ le3(View view, Object obj, int i, byte b) {
        this.f19881a = b;
        this.c = view;
        this.d = obj;
        this.b = i;
    }

    public le3(gd00 gd00Var, int i, ig00 ig00Var) {
        this.f19881a = (byte) 3;
        this.d = gd00Var;
        this.b = i;
        this.c = ig00Var;
    }

    public le3(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f19881a = (byte) 2;
        this.d = bottomSheetBehavior;
        this.c = view;
        this.b = i;
    }
}
