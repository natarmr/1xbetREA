package a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xplatform.security.impl.navigation.SecuritySettingsScreenFactoryImpl$getSecuritySettingsScreen$1;
import org.xplatform.ui_core.viewcomponents.views.search.SearchMaterialViewNew;

/* JADX INFO: loaded from: classes4.dex */
public final class iw20 implements zf60, vh30, imk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f15470a;

    public iw20(gii0 gii0Var, byte b) {
        gii0Var.getClass();
        switch (b) {
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                this.f15470a = new rta0(gii0Var, (byte) 17);
                break;
            default:
                this.f15470a = new tpv(gii0Var, (byte) 22);
                break;
        }
    }

    public static SecuritySettingsScreenFactoryImpl$getSecuritySettingsScreen$1 f(iw20 iw20Var, nqh0 nqh0Var) {
        iw20Var.getClass();
        return new SecuritySettingsScreenFactoryImpl$getSecuritySettingsScreen$1(iw20Var, null, nqh0Var);
    }

    @Override // a.imk
    public boolean a(float f) {
        int i;
        int i2;
        RecyclerView recyclerView = (RecyclerView) this.f15470a;
        if (recyclerView.n.r()) {
            i2 = (int) f;
            i = 0;
        } else if (recyclerView.n.q()) {
            i = (int) f;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        recyclerView.G0();
        return recyclerView.R(i, i2, 0, Integer.MAX_VALUE);
    }

    @Override // a.imk
    public float b() {
        float f;
        RecyclerView recyclerView = (RecyclerView) this.f15470a;
        if (recyclerView.n.r()) {
            f = recyclerView.C1;
        } else {
            if (!recyclerView.n.q()) {
                return 0.0f;
            }
            f = recyclerView.B1;
        }
        return -f;
    }

    @Override // a.imk
    public void c() {
        ((RecyclerView) this.f15470a).G0();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:65|24|(1:27)|57) */
    /* JADX WARN: Code duplicated, block: B:27:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:35:0x0101  */
    /* JADX WARN: Code duplicated, block: B:37:0x0108  */
    /* JADX WARN: Code duplicated, block: B:38:0x010a  */
    /* JADX WARN: Code duplicated, block: B:41:0x010f  */
    /* JADX WARN: Code duplicated, block: B:45:0x012d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0135  */
    /* JADX WARN: Code duplicated, block: B:47:0x0137  */
    /* JADX WARN: Code duplicated, block: B:49:0x013e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0145  */
    /* JADX WARN: Code duplicated, block: B:52:0x0147  */
    /* JADX WARN: Code duplicated, block: B:55:0x014c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0169  */
    /* JADX WARN: Code duplicated, block: B:60:0x0172  */
    /* JADX WARN: Code duplicated, block: B:61:0x017c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x017e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0184  */
    /* JADX WARN: Code duplicated, block: B:65:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0163, code lost:
    
        if (a.qcc.P(r10, r6) == r3) goto L57;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00fa -> B:23:0x00bc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0163 -> B:58:0x0166). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0169 -> B:58:0x0166). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0172 -> B:44:0x012b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(long r21, a.zje r23, java.lang.String r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.iw20.d(long, a.zje, java.lang.String):java.lang.Object");
    }

    public s9h0 e(p3d p3dVar) {
        long jH;
        p3dVar.getClass();
        float f = p3dVar.f26294a;
        float f2 = p3dVar.b;
        mcz mczVar = (mcz) this.f15470a;
        int iOrdinal = mczVar.q.ordinal();
        if (iOrdinal == 0) {
            jH = mczVar.h() & 4294967295L;
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return null;
            }
            jH = mczVar.h() >> 32;
        }
        return new s9h0(f, ((int) jH) - f2);
    }

    public ArrayList g() {
        mcz mczVar = (mcz) this.f15470a;
        List list = mczVar.l;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new gkf0((ncz) it.next(), mczVar.q));
        }
        return arrayList;
    }

    public void h() {
        ros rosVar = (ros) this.f15470a;
        gps gpsVar = (gps) rosVar.b.f44549a.getValue();
        if (gpsVar instanceof fps) {
            fps fpsVar = (fps) gpsVar;
            sos sosVar = fpsVar.d;
            sosVar.getClass();
            if (sosVar == sos.c) {
                rosVar.b(new zos(fpsVar.f9943a, fpsVar.b, fpsVar.c));
            }
        }
    }

    public void i(la30 la30Var) {
        Object value;
        oa30 oa30Var = (oa30) this.f15470a;
        oa30Var.getClass();
        ja30 ja30Var = oa30Var.f24911a;
        ja30Var.getClass();
        p7m0 p7m0Var = ja30Var.f16170a;
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, la30Var));
    }

    public void j(androidx.fragment.app.e eVar, ngc0 ngc0Var) {
        eVar.getClass();
        lgc0 lgc0Var = (lgc0) ((onv) ((lef0) this.f15470a).f19899a).f25567a;
        lgc0Var.getClass();
        lgc0Var.f20002a = ngc0Var;
        if (eVar.J("PromoCodesBottomSheetFragment") != null) {
            return;
        }
        yfc0.l2.getClass();
        yfc0 yfc0Var = new yfc0();
        yfc0Var.k2.x(yfc0Var, yfc0.m2[1], "REQUEST_SELECT_PROMO_CODE");
        yfc0Var.H0(eVar, "PromoCodesBottomSheetFragment");
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        view.getClass();
        SearchMaterialViewNew searchMaterialViewNew = (SearchMaterialViewNew) this.f15470a;
        if (searchMaterialViewNew != null && searchMaterialViewNew.hasFocus() && !xiv0Var.f40966a.u(8)) {
            searchMaterialViewNew.clearFocus();
        }
        return xiv0.b;
    }

    public iw20(d49 d49Var) {
        d49Var.getClass();
        this.f15470a = d49Var;
    }

    public iw20(vwb0 vwb0Var) {
        vwb0Var.getClass();
        this.f15470a = vwb0Var;
    }

    public iw20(drb0 drb0Var) {
        drb0Var.getClass();
        this.f15470a = drb0Var;
    }

    public /* synthetic */ iw20(Object obj) {
        this.f15470a = obj;
    }

    public iw20(b6s b6sVar) {
        b6sVar.getClass();
        this.f15470a = b6sVar;
    }
}
