package a;

import android.content.res.AssetManager;
import android.javax.sip.message.Response;
import android.os.Build;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class hhk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f13068a;
    public final Object b;
    public Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public hhk(AssetManager assetManager, Executor executor, s2c0 s2c0Var, String str, File file) {
        byte[] bArr;
        this.f13068a = false;
        this.b = executor;
        this.c = s2c0Var;
        this.g = str;
        this.f = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 24:
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    bArr = jiq0.q;
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    bArr = jiq0.p;
                    break;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    bArr = jiq0.o;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                    bArr = jiq0.n;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = jiq0.m;
        }
        this.d = bArr;
    }

    public static int b(int[] iArr) {
        int i = Integer.MAX_VALUE;
        for (int i2 : iArr) {
            if (i2 <= 0) {
                return 0;
            }
            if (i > i2) {
                i = i2;
            }
        }
        if (i == Integer.MAX_VALUE) {
            return 0;
        }
        return i;
    }

    public static int c(int[] iArr, int[] iArr2) {
        int iB = b(iArr);
        int length = iArr2.length;
        int iMin = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            if (iArr[i] == iB) {
                iMin = Math.min(iMin, iArr2[i]);
            }
        }
        if (iMin == Integer.MAX_VALUE) {
            return 0;
        }
        return iMin;
    }

    public void a() {
        TabLayout tabLayout = (TabLayout) this.b;
        ViewPager2 viewPager2 = (ViewPager2) this.c;
        if (this.f13068a) {
            jf4.n("TabLayoutMediator is already attached");
            return;
        }
        yge0 adapter = viewPager2.getAdapter();
        this.e = adapter;
        if (adapter == null) {
            jf4.n("TabLayoutMediator attached before ViewPager2 has an adapter");
            return;
        }
        this.f13068a = true;
        zbo0 zbo0Var = new zbo0(tabLayout);
        this.f = zbo0Var;
        viewPager2.c(zbo0Var);
        wbo0 wbo0Var = new wbo0(viewPager2, (byte) 1);
        this.g = wbo0Var;
        ArrayList arrayList = tabLayout.o1;
        if (!arrayList.contains(wbo0Var)) {
            arrayList.add(wbo0Var);
        }
        l5g l5gVar = new l5g(this, (byte) 8);
        this.h = l5gVar;
        ((yge0) this.e).v(l5gVar);
        g();
        tabLayout.l(viewPager2.getCurrentItem(), 0.0f, true, true, true);
    }

    public Integer d(int i) {
        Integer num = (Integer) ((LinkedHashMap) this.g).get(Integer.valueOf(i));
        if (num != null) {
            return num;
        }
        hhk hhkVar = (hhk) this.e;
        if (hhkVar != null) {
            return hhkVar.d(i);
        }
        return null;
    }

    public void e(k6z k6zVar) {
        w5z w5zVar = (w5z) this.g;
        if (w5zVar == null || k6zVar != ((k6z) this.h) || w5zVar.b()) {
            this.h = k6zVar;
            w5zVar = new w5z((j83) this.b, (w6k) this.d, (mrq) this.e, afn0.A((y9q0) this.c, k6zVar), (List) this.f, this.f13068a);
        }
        this.g = w5zVar;
    }

    public FileInputStream f(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((s2c0) this.c).d();
            return null;
        }
    }

    public void g() {
        TabLayout tabLayout = (TabLayout) this.b;
        tabLayout.i();
        yge0 yge0Var = (yge0) this.e;
        if (yge0Var != null) {
            int iD = yge0Var.d();
            for (int i = 0; i < iD; i++) {
                tbo0 tbo0VarG = tabLayout.g();
                ((ybo0) this.d).g(tbo0VarG, i);
                tabLayout.a(tbo0VarG, tabLayout.b.size(), false);
            }
            if (iD > 0) {
                int iMin = Math.min(((ViewPager2) this.c).getCurrentItem(), tabLayout.getTabCount() - 1);
                if (iMin != tabLayout.getSelectedTabPosition()) {
                    tabLayout.j(tabLayout.f(iMin), true);
                }
            }
        }
    }

    public void h(final Serializable serializable, final int i) {
        ((Executor) this.b).execute(new Runnable() { // from class: a.ghk
            @Override // java.lang.Runnable
            public final void run() {
                ((s2c0) this.f11304a.c).e(i, serializable);
            }
        });
    }

    public hhk i(List list) {
        list.getClass();
        hhk hhkVar = new hhk((h950) this.b, (roi0) this.c, (xbu0) this.d, this.f13068a, this, (List) this.f);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f4d0 f4d0Var = (f4d0) it.next();
            ((LinkedHashMap) hhkVar.g).put(Integer.valueOf(f4d0Var.e), Integer.valueOf(f4d0Var.d));
        }
        return hhkVar;
    }

    public hhk(int[] iArr, int[] iArr2, ens ensVar) {
        this.b = ensVar;
        this.c = iArr;
        this.d = androidx.compose.runtime.e.b(b(iArr));
        this.e = iArr2;
        this.f = androidx.compose.runtime.e.b(c(iArr, iArr2));
        Integer numT = tx3.T(iArr);
        this.h = new lbz(numT != null ? numT.intValue() : 0, 90, Response.OK);
    }

    public hhk(j83 j83Var, w6k w6kVar, mrq mrqVar, y9q0 y9q0Var, List list, boolean z) {
        this.b = j83Var;
        this.c = y9q0Var;
        this.f13068a = z;
        this.d = w6kVar;
        this.e = mrqVar;
        this.f = list;
    }

    public hhk(h950 h950Var, roi0 roi0Var, xbu0 xbu0Var, boolean z, List list, int i) {
        this(h950Var, roi0Var, xbu0Var, z, (hhk) null, (i & 32) != 0 ? iun.f15405a : list);
    }

    public hhk(TabLayout tabLayout, ViewPager2 viewPager2, ybo0 ybo0Var) {
        this.b = tabLayout;
        this.c = viewPager2;
        this.d = ybo0Var;
    }

    public hhk(h950 h950Var, roi0 roi0Var, xbu0 xbu0Var, boolean z, hhk hhkVar, List list) {
        h950Var.getClass();
        roi0Var.getClass();
        xbu0Var.getClass();
        list.getClass();
        this.b = h950Var;
        this.c = roi0Var;
        this.d = xbu0Var;
        this.f13068a = z;
        this.e = hhkVar;
        this.f = list;
        this.g = new LinkedHashMap();
        kd40.f18088a.getClass();
        this.h = jd40.a();
    }
}
