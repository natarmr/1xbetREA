package a;

import com.huawei.hms.api.ConnectionResult;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gg90 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11244a;
    public final /* synthetic */ xcz b;

    public /* synthetic */ gg90(xcz xczVar, byte b) {
        this.f11244a = b;
        this.b = xczVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long jH;
        byte b = this.f11244a;
        boolean z = false;
        xcz xczVar = this.b;
        switch (b) {
            case 0:
                return xczVar.j();
            case 1:
                return xczVar.j();
            case 2:
                return xczVar.j();
            case 3:
                return xczVar.j();
            case 4:
                return Boolean.valueOf(xczVar.j.a());
            case 5:
                return xczVar.j();
            case 6:
                jh70 jh70Var = ep90.c2;
                if (xczVar.h() == 0 && xczVar.i() == 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                return Boolean.valueOf(!xczVar.j().l.isEmpty());
            case 8:
                return Boolean.valueOf(xczVar.j.a());
            case 9:
                return Boolean.valueOf(xczVar.j.a());
            case 10:
                if (xczVar.h() == 0 && xczVar.i() == 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 11:
                if (xczVar.h() == 0 && (xczVar.c() || xczVar.d())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 12:
                return Boolean.valueOf(xczVar.h() > 0);
            case 13:
                return xczVar.j();
            case 14:
                List list = xczVar.j().l;
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((ncz) it.next()).l.equals("REGISTRATION_TABS")) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 15:
                mcz mczVarJ = xczVar.j();
                int iOrdinal = mczVarJ.q.ordinal();
                if (iOrdinal == 0) {
                    jH = mczVarJ.h() & 4294967295L;
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return null;
                    }
                    jH = mczVarJ.h() >> 32;
                }
                return Float.valueOf(((int) jH) * 0.05f);
            case 16:
                return xczVar.j().q;
            case 17:
                if (xczVar.h() == 0 && (xczVar.c() || xczVar.d())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 18:
                if (xczVar.h() == 0 && (xczVar.c() || xczVar.d())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                if (xczVar.h() == 0 && xczVar.i() == 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return Boolean.valueOf(xczVar.j.a());
        }
    }
}
