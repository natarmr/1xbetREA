package a;

import android.javax.sip.message.Response;
import android.util.Log;
import android.view.View;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import okhttp3.Request;

/* JADX INFO: loaded from: classes.dex */
public final class onv implements InstallReferrerStateListener, syh, pp9, uu9, zxv, s2c0, lry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f25567a;

    public onv(gii0 gii0Var, byte b) {
        gii0Var.getClass();
        switch (b) {
            case 23:
                this.f25567a = new tpv(gii0Var, (byte) 29);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                this.f25567a = new rta0(gii0Var, (byte) 15);
                break;
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                this.f25567a = new rta0(gii0Var, (byte) 16);
                break;
            default:
                this.f25567a = new tpv(gii0Var, (byte) 18);
                break;
        }
    }

    @Override // a.lry
    public void c(g950 g950Var, Object obj) {
        mae0 mae0Var = (mae0) this.f25567a;
        String strB = g950Var.b();
        if ("version".equals(strB)) {
            if (obj instanceof int[]) {
                mae0Var.f21454a = (int[]) obj;
            }
        } else if ("multifileClassName".equals(strB)) {
            mae0Var.b = obj instanceof String ? (String) obj : null;
        }
    }

    @Override // a.s2c0
    public void d() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // a.s2c0
    public void e(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f25567a).setResultCode(i);
    }

    @Override // a.uu9
    public Object f(tu9 tu9Var) {
        gd00 gd00Var = (gd00) this.f25567a;
        z1x.y("The result can only set once!", gd00Var.f == null);
        gd00Var.f = tu9Var;
        return "ListFuture[" + this + "]";
    }

    @Override // a.pp9
    public void g(to9 to9Var, jtf0 jtf0Var) {
        n5a n5aVar = (n5a) this.f25567a;
        if (!jtf0Var.f17098a.q) {
            e0g0 e0g0Var = j0g0.b;
            n5aVar.resumeWith(new g0g0(new rtw(jtf0Var)));
            return;
        }
        Object obj = jtf0Var.b;
        if (obj != null) {
            e0g0 e0g0Var2 = j0g0.b;
            n5aVar.resumeWith(obj);
            return;
        }
        Request requestL = to9Var.l();
        requestL.getClass();
        Object objB = requestL.b(sre0.f32672a.b(qox.class));
        objB.getClass();
        qox qoxVar = (qox) objB;
        ssy ssyVar = new ssy("Response from " + qoxVar.f29090a.getName() + '.' + qoxVar.c.getName() + " was null but response body type was declared as non-null");
        e0g0 e0g0Var3 = j0g0.b;
        n5aVar.resumeWith(new g0g0(ssyVar));
    }

    @Override // a.syh
    public Iterable h(Object obj) {
        mey meyVar = (mey) this.f25567a;
        Collection collectionB = ((wm40) obj).h().b();
        collectionB.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            foc focVarN = ((wsy) it.next()).S().n();
            wm40 wm40VarB = null;
            foc focVarO1 = focVarN != null ? focVarN.o1() : null;
            wm40 wm40Var = focVarO1 instanceof wm40 ? (wm40) focVarO1 : null;
            if (wm40Var != null && (wm40VarB = meyVar.b(wm40Var)) == null) {
                wm40VarB = wm40Var;
            }
            if (wm40VarB != null) {
                arrayList.add(wm40VarB);
            }
        }
        return arrayList;
    }

    @Override // a.lry
    public lry i(qlc qlcVar, g950 g950Var) {
        return null;
    }

    @Override // a.lry
    public mry j(g950 g950Var) {
        String strB = g950Var.b();
        if (RemoteMessageConst.DATA.equals(strB) || "filePartClassNames".equals(strB)) {
            return new lae0(this, (byte) 0);
        }
        if ("strings".equals(strB)) {
            return new lae0(this, (byte) 1);
        }
        return null;
    }

    @Override // a.zxv
    public void k(vmu0 vmu0Var) {
        jru jruVar = ((qi80) this.f25567a).g;
        jruVar.getClass();
        dgu dguVar = (dgu) jruVar.b;
        tmu0 tmu0Var = vmu0Var instanceof tmu0 ? (tmu0) vmu0Var : null;
        xxv xxvVar = new xxv(vmu0Var, (byte) 0);
        synchronized (((s9m0) dguVar.d)) {
            if (tmu0Var != null) {
                try {
                    dguVar.c = tmu0Var;
                } catch (Throwable th) {
                    throw th;
                }
            }
            xxvVar.invoke((yxv) dguVar.f6058a, (yxv) dguVar.b);
        }
    }

    public dne l(dne dneVar) {
        return dneVar instanceof zef0 ? dneVar : new w20(-((ki30) this.f25567a).k(), dneVar);
    }

    @Override // a.pp9
    public void m(to9 to9Var, Throwable th) {
        n5a n5aVar = (n5a) this.f25567a;
        e0g0 e0g0Var = j0g0.b;
        n5aVar.resumeWith(new g0g0(th));
    }

    public void o(ep epVar) {
        RecyclerView recyclerView = (RecyclerView) this.f25567a;
        byte b = epVar.f8161a;
        if (b == 1) {
            recyclerView.n.m0(recyclerView, epVar.b, epVar.d);
            return;
        }
        if (b == 2) {
            recyclerView.n.p0(epVar.b, epVar.d);
        } else if (b == 4) {
            recyclerView.n.r0(recyclerView, epVar.b, epVar.d);
        } else {
            if (b != 8) {
                return;
            }
            recyclerView.n.o0(epVar.b, epVar.d);
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerSetupFinished(int i) {
        rix rixVar = (rix) this.f25567a;
        yje yjeVar = null;
        if (i == 0) {
            sac.V(rixVar.d, new adw(rixVar, (byte) 16), null, null, new r1w(rixVar, yjeVar, (byte) 18), 14);
        } else if (i == 1 || i == 2) {
            sac.V(rixVar.d, qix.f28810a, null, null, new cin(rixVar, yjeVar, (byte) 21), 14);
        }
    }

    public xhe0 p(int i) {
        RecyclerView recyclerView = (RecyclerView) this.f25567a;
        xhe0 xhe0VarP = recyclerView.P(i, true);
        if (xhe0VarP != null) {
            iac iacVar = recyclerView.f;
            if (!iacVar.c.contains(xhe0VarP.f40887a)) {
                return xhe0VarP;
            }
            if (RecyclerView.e2) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    public void q() {
        ony onyVar = (ony) this.f25567a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("requestUrl", ncy.c("ipv4.fiddler"));
        linkedHashMap.put("response", ncy.b(Integer.valueOf(Response.OK)));
        linkedHashMap.put("responseTime", ncy.b(0));
        ((rny) onyVar).a("", new tny("request", xp20.n(linkedHashMap)));
    }

    public boolean r() {
        List<hf6> listN = ((oif0) this.f25567a).n();
        if (listN != null && listN.isEmpty()) {
            return false;
        }
        for (hf6 hf6Var : listN) {
            boolean z = hf6Var.e;
            List list = hf6Var.c;
            if ((z && !list.isEmpty()) || list.size() > 1) {
                return true;
            }
        }
        return false;
    }

    public void s(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = (RecyclerView) this.f25567a;
        int iH = recyclerView.f.h();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iH; i6++) {
            View viewG = recyclerView.f.g(i6);
            xhe0 xhe0VarX = RecyclerView.X(viewG);
            if (xhe0VarX != null && !xhe0VarX.r() && (i4 = xhe0VarX.c) >= i && i4 < i5) {
                xhe0VarX.b(2);
                if (obj == null) {
                    xhe0VarX.b(1024);
                } else if ((1024 & xhe0VarX.j) == 0) {
                    if (xhe0VarX.k == null) {
                        ArrayList arrayList = new ArrayList();
                        xhe0VarX.k = arrayList;
                        xhe0VarX.l = Collections.unmodifiableList(arrayList);
                    }
                    xhe0VarX.k.add(obj);
                }
                ((hhe0) viewG.getLayoutParams()).c = true;
            }
        }
        msj msjVar = recyclerView.c;
        ArrayList arrayList2 = (ArrayList) msjVar.e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            xhe0 xhe0Var = (xhe0) arrayList2.get(size);
            if (xhe0Var != null && (i3 = xhe0Var.c) >= i && i3 < i5) {
                xhe0Var.b(2);
                msjVar.j(size);
            }
        }
        recyclerView.L1 = true;
    }

    public void t(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.f25567a;
        int iH = recyclerView.f.h();
        for (int i3 = 0; i3 < iH; i3++) {
            xhe0 xhe0VarX = RecyclerView.X(recyclerView.f.g(i3));
            if (xhe0VarX != null && !xhe0VarX.r() && xhe0VarX.c >= i) {
                if (RecyclerView.e2) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i3 + " holder " + xhe0VarX + " now at position " + (xhe0VarX.c + i2));
                }
                xhe0VarX.o(i2, false);
                recyclerView.H1.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.c.e;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            xhe0 xhe0Var = (xhe0) arrayList.get(i4);
            if (xhe0Var != null && xhe0Var.c >= i) {
                if (RecyclerView.e2) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i4 + " holder " + xhe0Var + " now at position " + (xhe0Var.c + i2));
                }
                xhe0Var.o(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.K1 = true;
    }

    public void u(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = (RecyclerView) this.f25567a;
        int iH = recyclerView.f.h();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iH; i11++) {
            xhe0 xhe0VarX = RecyclerView.X(recyclerView.f.g(i11));
            if (xhe0VarX != null && (i9 = xhe0VarX.c) >= i4 && i9 <= i3) {
                if (RecyclerView.e2) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i11 + " holder " + xhe0VarX);
                }
                if (xhe0VarX.c == i) {
                    xhe0VarX.o(i2 - i, false);
                } else {
                    xhe0VarX.o(i5, false);
                }
                recyclerView.H1.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.c.e;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            xhe0 xhe0Var = (xhe0) arrayList.get(i12);
            if (xhe0Var != null && (i8 = xhe0Var.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    xhe0Var.o(i2 - i, false);
                } else {
                    xhe0Var.o(i10, false);
                }
                if (RecyclerView.e2) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i12 + " holder " + xhe0Var);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.K1 = true;
    }

    @Override // a.lry
    public void a() {
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerServiceDisconnected() {
    }

    public /* synthetic */ onv(Object obj) {
        this.f25567a = obj;
    }

    public onv(lgc0 lgc0Var) {
        lgc0Var.getClass();
        this.f25567a = lgc0Var;
    }

    @Override // a.lry
    public void n(g950 g950Var, tlc tlcVar) {
    }

    @Override // a.lry
    public void b(g950 g950Var, qlc qlcVar, g950 g950Var2) {
    }
}
