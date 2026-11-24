package a;

import android.os.Environment;
import android.widget.FrameLayout;
import androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class vqc implements tdo0, qe60, giu0, ev3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37850a;
    public Object b;

    public vqc(byte b) {
        this.f37850a = b;
        switch (b) {
            case 8:
                this.b = new k050();
                break;
            case 16:
                this.b = mbl.b(new x5i(0));
                mbl.b(new x5i(1));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                this.b = new ConcurrentHashMap(16);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                break;
            default:
                kpd0 kpd0Var = mhk.f21798a;
                this.b = (CloseCameraDeviceOnCameraGraphCloseQuirk) mhk.a().b(CloseCameraDeviceOnCameraGraphCloseQuirk.class);
                break;
        }
    }

    public ytt a() {
        ytt yttVarG = ((vue0) this.b).g();
        x1x.x(yttVarG);
        return yttVarG;
    }

    @Override // a.ev3
    public Object b(qah0 qah0Var, Float f, Float f2, Function1 function1, zek0 zek0Var) {
        Object objQ = bdx.Q(qah0Var, f.floatValue(), x4d0.d(0.0f, f2.floatValue(), 28), (sjj) this.b, function1, zek0Var);
        return objQ == wne.f39444a ? objQ : (g73) objQ;
    }

    @Override // a.giu0
    public diu0 c(Object obj) {
        switch (this.f37850a) {
            case 17:
                ufi ufiVar = (ufi) ((c7i) this.b).c;
                qa60 qa60Var = (qa60) ufiVar.F.get();
                xcc xccVar = (xcc) ufiVar.U.get();
                return new gh70((fq) ufiVar.x.get(), xccVar, ufiVar.f35578a.v1(), (lzt) ufiVar.f.get(), qa60Var, (i1w0) obj);
            case 18:
                pki pkiVar = (pki) ((c7i) this.b).c;
                qa60 qa60Var2 = (qa60) pkiVar.G.get();
                xcc xccVar2 = (xcc) pkiVar.V.get();
                return new gh70((fq) pkiVar.y.get(), xccVar2, pkiVar.f27135a.v1(), (lzt) pkiVar.g.get(), qa60Var2, (i1w0) obj);
            default:
                c7i c7iVar = (c7i) this.b;
                kui kuiVar = (kui) c7iVar.c;
                v88 v88VarU0 = kuiVar.f18911a.u0();
                wsf0 wsf0VarF0 = kuiVar.f18911a.f0();
                mne mneVarV1 = kuiVar.f18911a.v1();
                fpi0 fpi0Var = (fpi0) kuiVar.m.get();
                fq fqVar = (fq) kuiVar.x.get();
                db dbVar = (db) c7iVar.d;
                return new wm70((i1w0) obj, v88VarU0, wsf0VarF0, mneVarV1, fpi0Var, fqVar, (dqx) ((n5d0) dbVar.h).get(), (itt) kuiVar.u.get(), (qni0) kuiVar.f0.get(), (l1u) kuiVar.c0.get(), (lg60) kuiVar.g0.get(), (qa60) kuiVar.F.get(), (ppb) ((n5d0) dbVar.m).get(), (i5m0) kuiVar.h0.get(), (lzt) kuiVar.f.get(), (xcc) kuiVar.U.get(), (ztt) kuiVar.k.get(), (d3c) kuiVar.e.get(), (xyb) kuiVar.h.get(), (oqt) kuiVar.p.get(), (y5s) kuiVar.T.get(), (t0u) kuiVar.X.get());
        }
    }

    public v0f d() {
        return (v0f) ((u0f) this.b).f34851a.getValue();
    }

    public q4f e() {
        return ((v0f) ((u0f) this.b).f34851a.getValue()).b;
    }

    public zav f() {
        return (zav) ((n5d0) this.b).get();
    }

    public jru g() {
        jru jruVarH = ((vue0) this.b).h();
        x1x.x(jruVarH);
        return jruVarH;
    }

    public String h() {
        Object g0g0Var;
        wsf0 wsf0Var = (wsf0) this.b;
        String str = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date());
        str.getClass();
        String strL = kng0.l("image_", str, BundleUtil.UNDERLINE_TAG);
        bb6 bb6Var = (bb6) wsf0Var.b;
        try {
            e0g0 e0g0Var = j0g0.b;
            File file = new File(bb6Var.f2293a.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS), "files");
            file.mkdirs();
            File file2 = new File(file, strL.concat(".jpg"));
            if (file2.exists()) {
                file2.delete();
            }
            file2.createNewFile();
            g0g0Var = file2;
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        boolean z = g0g0Var instanceof g0g0;
        Object obj = g0g0Var;
        if (z) {
            obj = null;
        }
        File file3 = (File) obj;
        String absolutePath = file3 != null ? file3.getAbsolutePath() : null;
        return absolutePath == null ? "" : absolutePath;
    }

    public ArrayList i(uaq0 uaq0Var) {
        aog aogVar = (aog) this.b;
        List list = aog.d;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(vfc.O((kdh) it.next(), StringsKt.O(aogVar.c.c(), "ru", false), uaq0Var));
        }
        return arrayList;
    }

    @Override // a.tdo0
    public void j(FrameLayout frameLayout) {
        Function1 function1;
        w4d w4dVar = (w4d) this.b;
        w4dVar.c(frameLayout);
        Object tag = frameLayout.getTag();
        String str = tag instanceof String ? (String) tag : null;
        if (str == null || (function1 = w4dVar.b) == null) {
            return;
        }
        function1.invoke(str);
    }

    /* JADX WARN: Code duplicated, block: B:81:0x00d9  */
    public void k(m1g m1gVar) {
        int i;
        yje yjeVar;
        Integer numValueOf;
        q1g q1gVar = (q1g) this.b;
        q1gVar.getClass();
        p1g p1gVar = q1gVar.f27951a;
        hcp0 hcp0Var = q1gVar.b;
        String string = (String) hcp0Var.c;
        if (string.length() == 0) {
            q7d0 q7d0Var = (q7d0) hcp0Var.b;
            q7d0Var.getClass();
            string = q7d0Var.a().getString("UNIQUE_SESSION_ID", "");
            if (string == null) {
                string = "";
            }
            hcp0Var.c = string;
        }
        String str = string;
        q1gVar.c.getClass();
        q1gVar.d.getClass();
        long j = m1gVar.g;
        j1g j1gVar = j == 40 ? j1g.REAL : m1gVar.e;
        ms2 ms2Var = m1gVar.b;
        byte b = 6;
        if (ms2Var == null) {
            i = -1;
        } else if ((ms2Var instanceof mr2) || (ms2Var instanceof lr2) || (ms2Var instanceof ir2) || (ms2Var instanceof gr2) || (ms2Var instanceof hr2) || (ms2Var instanceof kr2)) {
            i = 1;
        } else if ((ms2Var instanceof fr2) || (ms2Var instanceof jr2)) {
            i = 2;
        } else if (ms2Var instanceof uq2) {
            i = 3;
        } else if (ms2Var instanceof jq2) {
            i = 4;
        } else if (ms2Var instanceof kq2) {
            i = 6;
        } else if (ms2Var instanceof dq2) {
            i = 7;
        } else if (ms2Var instanceof sq2) {
            i = 8;
        } else if (ms2Var instanceof oq2) {
            i = 9;
        } else if (ms2Var instanceof tq2) {
            i = 10;
        } else if ((ms2Var instanceof lq2) || (ms2Var instanceof zq2)) {
            i = 12;
        } else if (ms2Var instanceof qq2) {
            i = 13;
        } else if (ms2Var instanceof pq2) {
            i = 14;
        } else if (ms2Var instanceof rq2) {
            i = 15;
        } else if (ms2Var instanceof mq2) {
            i = 16;
        } else if (ms2Var instanceof nq2) {
            i = 17;
        } else {
            i = -1;
        }
        Integer numValueOf2 = Integer.valueOf(i);
        if (i <= 0) {
            numValueOf2 = null;
        }
        String str2 = m1gVar.f21006a;
        if (str2.length() <= 0) {
            str2 = null;
        }
        l1g l1gVar = m1gVar.c;
        if (l1gVar == l1g.UNKNOWN) {
            l1gVar = null;
        }
        Integer numValueOf3 = l1gVar != null ? Integer.valueOf(l1gVar.f19250a) : null;
        k1g k1gVar = m1gVar.d;
        if (k1gVar == k1g.UNKNOWN) {
            k1gVar = null;
        }
        Integer numValueOf4 = k1gVar != null ? Integer.valueOf(k1gVar.f17520a) : null;
        if (j1gVar == j1g.UNKNOWN) {
            j1gVar = null;
        }
        Integer numValueOf5 = j1gVar != null ? Integer.valueOf(j1gVar.f15732a) : null;
        long j2 = m1gVar.f;
        Long lValueOf = Long.valueOf(j2);
        if (j2 <= 0) {
            lValueOf = null;
        }
        Integer numValueOf6 = lValueOf != null ? Integer.valueOf((int) lValueOf.longValue()) : null;
        Long lValueOf2 = Long.valueOf(j);
        if (j <= 0) {
            lValueOf2 = null;
        }
        if (lValueOf2 != null) {
            numValueOf = Integer.valueOf((int) lValueOf2.longValue());
            yjeVar = null;
        } else {
            yjeVar = null;
            numValueOf = null;
        }
        us2 us2Var = new us2(str2, str, numValueOf2, numValueOf3, numValueOf4, numValueOf5, 1357, numValueOf6, numValueOf);
        vs2[] vs2VarArr = vs2.f37927a;
        xs2 xs2Var = new xs2(us2Var);
        p1gVar.getClass();
        sac.V(p1gVar.f26200a, o1g.f24478a, null, null, new b1f(p1gVar, xs2Var, yjeVar, b), 14);
    }

    public void l(v0f v0fVar) {
        u0f u0fVar = (u0f) this.b;
        if (u0fVar.b == q4f.b) {
            u0fVar.b = v0fVar.b;
        }
        p7m0 p7m0Var = u0fVar.f34851a;
        p7m0Var.getClass();
        p7m0Var.o(null, v0fVar);
    }

    public void m(q4f q4fVar) {
        Object value;
        q4fVar.getClass();
        u0f u0fVar = (u0f) this.b;
        u0fVar.getClass();
        p7m0 p7m0Var = u0fVar.f34851a;
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, v0f.a((v0f) value, q4fVar, 0.0d, null, 0.0d, null, null, 0.0d, false, 0.0d, null, 8189)));
    }

    @Override // a.qe60
    public int n(int i) {
        return l1e0.d(i, 0, ((j83) this.b).b.length());
    }

    public ytt o() {
        ytt yttVarC = ((vue0) this.b).C();
        x1x.x(yttVarC);
        return yttVarC;
    }

    @Override // a.qe60
    public int s(int i) {
        return l1e0.d(i, 0, ((j83) this.b).b.length());
    }

    public vqc(q1g q1gVar) {
        this.f37850a = (byte) 12;
        q1gVar.getClass();
        this.b = q1gVar;
    }

    public vqc(yse0 yse0Var) {
        this.f37850a = (byte) 2;
        yse0Var.getClass();
        this.b = yse0Var;
    }

    public vqc(azj0 azj0Var) {
        this.f37850a = (byte) 27;
        azj0Var.getClass();
        this.b = azj0Var;
    }

    public vqc(u0f u0fVar) {
        this.f37850a = (byte) 9;
        u0fVar.getClass();
        this.b = u0fVar;
    }

    public vqc(cad cadVar, q7d0 q7d0Var) {
        this.f37850a = (byte) 5;
        q7d0Var.getClass();
        this.b = new cih(q7d0Var, (byte) 1);
    }

    public vqc(gii0 gii0Var, byte b) {
        this.f37850a = b;
        gii0Var.getClass();
        switch (b) {
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                this.b = new wgn(gii0Var, (byte) 2);
                break;
            default:
                this.b = new sza(gii0Var, (byte) 24);
                break;
        }
    }

    public /* synthetic */ vqc(Object obj, byte b) {
        this.f37850a = b;
        this.b = obj;
    }
}
