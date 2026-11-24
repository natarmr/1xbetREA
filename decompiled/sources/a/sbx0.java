package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;

/* JADX INFO: loaded from: classes2.dex */
public final class sbx0 implements ukj, n1x {
    public static sbx0 f;
    public static sbx0 g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31960a;
    public int b;
    public Object c;
    public Object d;
    public Object e;

    public sbx0(byte b) {
        this.f31960a = b;
        switch (b) {
            case 8:
                this.c = new Object();
                this.d = null;
                this.e = null;
                this.b = 0;
                break;
            case 9:
                this.c = new ArrayList();
                this.d = new ArrayList();
                this.e = new ArrayList();
                break;
            case 13:
                this.d = new xp6(this, (byte) 16);
                this.e = new z0i(this, (byte) 4);
                break;
            default:
                this.b = 0;
                this.e = new Object();
                break;
        }
    }

    public static synchronized sbx0 m(Context context) {
        sbx0 sbx0Var;
        sbx0Var = f;
        if (sbx0Var == null) {
            sbx0Var = new sbx0(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new n950("MessengerIpcClient"))));
            f = sbx0Var;
        }
        return sbx0Var;
    }

    public void a(zri zriVar) {
        if (zriVar != null) {
            egk egkVar = (egk) zriVar;
            ku5 ku5Var = (ku5) this.c;
            ku5[] ku5VarArr = (ku5[]) egkVar.c;
            for (ku5 ku5Var2 : ku5VarArr) {
                if (ku5Var2 != null) {
                    ku5Var2.c();
                }
            }
            egkVar.r(ku5VarArr, ku5Var);
            sq8 sq8Var = (sq8) egkVar.b;
            boolean z = egkVar.d;
            d3g0 d3g0Var = z ? (d3g0) sq8Var.f : (d3g0) sq8Var.h;
            d3g0 d3g0Var2 = z ? (d3g0) sq8Var.g : (d3g0) sq8Var.i;
            int iD = egkVar.d((int) d3g0Var.b);
            int iD2 = egkVar.d((int) d3g0Var2.b);
            int i = -1;
            int iMax = 1;
            int i2 = 0;
            while (iD < iD2) {
                ku5 ku5Var3 = ku5VarArr[iD];
                if (ku5Var3 != null) {
                    int i3 = ku5Var3.f;
                    int i4 = i3 - i;
                    if (i4 == 0) {
                        i2++;
                    } else {
                        if (i4 == 1) {
                            iMax = Math.max(iMax, i2);
                            i = ku5Var3.f;
                        } else if (i4 < 0 || i3 >= ku5Var.f || i4 > iD) {
                            ku5VarArr[iD] = null;
                        } else {
                            if (iMax > 2) {
                                i4 *= iMax - 2;
                            }
                            boolean z2 = i4 >= iD;
                            for (int i5 = 1; i5 <= i4 && !z2; i5++) {
                                z2 = ku5VarArr[iD - i5] != null;
                            }
                            if (z2) {
                                ku5VarArr[iD] = null;
                            } else {
                                i = ku5Var3.f;
                            }
                        }
                        i2 = 1;
                    }
                }
                iD++;
            }
        }
    }

    public void b(ViewPager2 viewPager2) {
        viewPager2.getClass();
        xp6 xp6Var = (xp6) this.d;
        if (!Intrinsics.d((ViewPager2) this.c, viewPager2)) {
            ViewPager2 viewPager3 = (ViewPager2) this.c;
            if (viewPager3 != null) {
                viewPager3.g(xp6Var);
            }
            this.c = viewPager2;
            viewPager2.c(xp6Var);
        }
        viewPager2.getViewTreeObserver().addOnGlobalLayoutListener((z0i) this.e);
    }

    public void c() {
        synchronized (this.e) {
            try {
                if (((Handler) this.c) == null) {
                    if (this.b <= 0) {
                        throw new IllegalStateException("CameraThread is not open");
                    }
                    HandlerThread handlerThread = new HandlerThread("CameraThread");
                    this.d = handlerThread;
                    handlerThread.start();
                    this.c = new Handler(((HandlerThread) this.d).getLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d() {
        ViewTreeObserver viewTreeObserver;
        xp6 xp6Var = (xp6) this.d;
        ViewPager2 viewPager2 = (ViewPager2) this.c;
        if (viewPager2 != null) {
            viewPager2.g(xp6Var);
        }
        ViewPager2 viewPager3 = (ViewPager2) this.c;
        if (viewPager3 != null && (viewTreeObserver = viewPager3.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener((z0i) this.e);
        }
        this.b = 0;
        if (Intrinsics.d((ViewPager2) this.c, null)) {
            return;
        }
        ViewPager2 viewPager4 = (ViewPager2) this.c;
        if (viewPager4 != null) {
            viewPager4.g(xp6Var);
        }
        this.c = null;
    }

    public void e(Runnable runnable) {
        synchronized (this.e) {
            c();
            ((Handler) this.c).post(runnable);
        }
    }

    public String f() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.b + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.d)[i2];
            if (obj instanceof ugi0) {
                ugi0 ugi0Var = (ugi0) obj;
                boolean zD = Intrinsics.d(ugi0Var.l(), aum0.c);
                int[] iArr = (int[]) this.e;
                if (!zD) {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(Separators.DOT);
                        sb.append(ugi0Var.e(i3));
                    }
                } else if (iArr[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.e)[i2]);
                    sb.append("]");
                }
            } else if (obj == m2a.p) {
                sb.append("[<debug info disabled>]");
            } else if (obj != lwf.p) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public int g() {
        int i = this.b;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }

    @Override // a.n1x
    public void h(o1x o1xVar, hhn0 hhn0Var) {
        ColorStateList colorStateListValueOf;
        dyw dywVar = hhn0Var.f13073a;
        DsCellLeftIcon dsCellLeftIcon = (DsCellLeftIcon) this.c;
        Resources resources = dsCellLeftIcon.getContext().getResources();
        resources.getClass();
        dsCellLeftIcon.setIconDrawable(c3x.q(dywVar, resources));
        Integer num = (Integer) this.e;
        if (num == null || (colorStateListValueOf = ColorStateList.valueOf(num.intValue())) == null) {
            colorStateListValueOf = dsCellLeftIcon.q;
        }
        dsCellLeftIcon.setImageTintList(colorStateListValueOf);
    }

    public void i(float f2, int i) {
        View viewD;
        ViewPager2 viewPager2 = (ViewPager2) this.c;
        Integer numValueOf = null;
        View childAt = viewPager2 != null ? viewPager2.getChildAt(0) : null;
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        androidx.recyclerview.widget.b layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || (viewD = linearLayoutManager.D(i)) == null) {
            return;
        }
        View viewD2 = linearLayoutManager.D(i + 1);
        ViewPager2 viewPager3 = (ViewPager2) this.c;
        if (viewPager3 != null) {
            viewD.measure(View.MeasureSpec.makeMeasureSpec(viewD.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = viewD.getMeasuredHeight();
            if (viewD2 != null) {
                viewD2.measure(View.MeasureSpec.makeMeasureSpec(viewD2.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                numValueOf = Integer.valueOf(viewD2.getMeasuredHeight());
            }
            if (numValueOf != null) {
                measuredHeight += (int) ((numValueOf.intValue() - measuredHeight) * f2);
            }
            if (this.b != measuredHeight) {
                this.b = measuredHeight;
                ViewGroup.LayoutParams layoutParams = viewPager3.getLayoutParams();
                layoutParams.height = measuredHeight;
                viewPager3.setLayoutParams(layoutParams);
                viewPager3.invalidate();
            }
        }
    }

    public void j() {
        HandlerThread handlerThread;
        synchronized (this.c) {
            try {
                x0x.K(this.b > 0);
                int i = this.b - 1;
                this.b = i;
                if (i == 0 && (handlerThread = (HandlerThread) this.e) != null) {
                    handlerThread.quit();
                    this.e = null;
                    this.d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.n1x
    public void k(o1x o1xVar, r1o r1oVar) {
        ColorStateList colorStateListValueOf;
        DsCellLeftIcon dsCellLeftIcon = (DsCellLeftIcon) this.c;
        dsCellLeftIcon.setImageResource(this.b);
        Integer num = (Integer) this.d;
        if (num == null || (colorStateListValueOf = ColorStateList.valueOf(num.intValue())) == null) {
            colorStateListValueOf = dsCellLeftIcon.q;
        }
        dsCellLeftIcon.setImageTintList(colorStateListValueOf);
        dsCellLeftIcon.p = null;
    }

    public void l() {
        int i = this.b * 2;
        this.d = Arrays.copyOf((Object[]) this.d, i);
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        qx3.h(0, 0, 14, (int[]) this.e, iArr);
        this.e = iArr;
    }

    public synchronized Task n(f8x0 f8x0Var) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(f8x0Var.toString()));
            }
            if (!((d6x0) this.e).a(f8x0Var)) {
                d6x0 d6x0Var = new d6x0(this);
                this.e = d6x0Var;
                d6x0Var.a(f8x0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8x0Var.b.getTask();
    }

    public String toString() {
        switch (this.f31960a) {
            case 5:
                int i = this.b;
                zri[] zriVarArr = (zri[]) this.d;
                zri zriVar = zriVarArr[0];
                if (zriVar == null) {
                    zriVar = zriVarArr[i + 1];
                }
                Formatter formatter = new Formatter();
                for (int i2 = 0; i2 < ((ku5[]) zriVar.c).length; i2++) {
                    try {
                        formatter.format("CW %3d:", Integer.valueOf(i2));
                        for (int i3 = 0; i3 < i + 2; i3++) {
                            zri zriVar2 = zriVarArr[i3];
                            if (zriVar2 == null) {
                                formatter.format("    |   ", new Object[0]);
                            } else {
                                ku5 ku5Var = ((ku5[]) zriVar2.c)[i2];
                                if (ku5Var == null) {
                                    formatter.format("    |   ", new Object[0]);
                                } else {
                                    formatter.format(" %3d|%3d", Integer.valueOf(ku5Var.f), Integer.valueOf(ku5Var.e));
                                }
                            }
                        }
                        formatter.format("%n", new Object[0]);
                    } catch (Throwable th) {
                        try {
                            formatter.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                String string = formatter.toString();
                formatter.close();
                return string;
            case 6:
            default:
                return super.toString();
            case 7:
                return f();
        }
    }

    public /* synthetic */ sbx0(Object obj, int i, Object obj2, Object obj3, byte b) {
        this.f31960a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
    }

    public sbx0(String str, int i, String str2, String str3) {
        this.f31960a = (byte) 2;
        brm0.B(str, str2, str3);
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public sbx0(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f31960a = (byte) 0;
        this.e = new d6x0(this);
        this.b = 1;
        this.d = scheduledExecutorService;
        this.c = context.getApplicationContext();
    }

    public sbx0(u33 u33Var, u33 u33Var2, u33 u33Var3, int i) {
        this.f31960a = (byte) 1;
        this.c = u33Var;
        this.d = u33Var2;
        this.e = u33Var3;
        this.b = i;
    }

    public sbx0(dcy dcyVar) {
        this.f31960a = (byte) 7;
        this.c = dcyVar;
        this.d = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.e = iArr;
        this.b = -1;
    }

    public /* synthetic */ sbx0(byte b, boolean z) {
        this.f31960a = b;
    }

    public sbx0(ku5 ku5Var, sq8 sq8Var) {
        this.f31960a = (byte) 5;
        this.c = ku5Var;
        int i = ku5Var.b;
        this.b = i;
        this.e = sq8Var;
        this.d = new zri[i + 2];
    }

    public sbx0(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.f31960a = (byte) 12;
        this.c = str;
        this.b = i2;
        if (arrayList == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.d = listUnmodifiableList;
        this.e = bArr;
    }
}
