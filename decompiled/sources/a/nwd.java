package a;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.huawei.hms.android.HwBuildEx;
import org.xplatform.ui_core.calendar.model.DateRangeWithTimeCalendarBottomSheetParams;

/* JADX INFO: loaded from: classes3.dex */
public class nwd implements kotlin.coroutines.f {
    public /* synthetic */ nwd(Object obj) {
    }

    public static q4f a(int i) {
        if (i == 11) {
            return q4f.m;
        }
        if (i == 115967) {
            return q4f.u;
        }
        switch (i) {
            case 0:
                return q4f.c;
            case 1:
                return q4f.d;
            case 2:
                return q4f.e;
            case 3:
                return q4f.f;
            case 4:
                return q4f.g;
            case 5:
                return q4f.h;
            case 6:
                return q4f.i;
            case 7:
                return q4f.j;
            case 8:
                return q4f.k;
            case 9:
                return q4f.l;
            default:
                switch (i) {
                    case 33:
                        return q4f.q;
                    case 34:
                        return q4f.n;
                    case 35:
                        return q4f.o;
                    case 36:
                        return q4f.p;
                    case 37:
                        return q4f.w;
                    case 38:
                        return q4f.r;
                    case 39:
                        return q4f.t;
                    case 40:
                        return q4f.s;
                    case 41:
                        return q4f.v;
                    default:
                        return q4f.b;
                }
        }
    }

    public static q4f b(int i) {
        return i > 10000 ? a(i / HwBuildEx.VersionCodes.CUR_DEVELOPMENT) : a(i);
    }

    public static int c(q4f q4fVar) {
        q4fVar.getClass();
        int iOrdinal = q4fVar.ordinal();
        if (iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal == 3) {
            return 20;
        }
        if (iOrdinal == 5 || iOrdinal == 6) {
            return 12;
        }
        return (iOrdinal == 8 || iOrdinal == 9) ? 8 : 50;
    }

    public static int d(q4f q4fVar) {
        q4fVar.getClass();
        switch (q4fVar.ordinal()) {
            case 1:
                return 1;
            case 2:
            case 4:
            case 7:
            case 8:
            case 11:
                return 2;
            case 3:
            case 5:
            case 6:
            case 9:
                return 3;
            case 10:
            default:
                return 0;
        }
    }

    public static void f(DateRangeWithTimeCalendarBottomSheetParams dateRangeWithTimeCalendarBottomSheetParams, androidx.fragment.app.e eVar) {
        dateRangeWithTimeCalendarBottomSheetParams.getClass();
        eVar.getClass();
        String str = xej.n2;
        if (eVar.J(str) != null) {
            return;
        }
        xej xejVar = new xej();
        xejVar.k2.J(xejVar, xej.m2[0], dateRangeWithTimeCalendarBottomSheetParams);
        xejVar.H0(eVar, str);
    }

    public static void g(androidx.fragment.app.e eVar) {
        eVar.getClass();
        mwd.k2.getClass();
        new mwd().H0(eVar, "ConfirmChooseLanguageDialog");
    }

    public Signature[] e(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
