package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class dps0 implements lj3 {
    public static final f03 r = f03.d();
    public static final dps0 s = new dps0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f6482a;
    public nfq d;
    public sgq e;
    public dgq f;
    public p5d0 g;
    public pkq h;
    public Context j;
    public hsd k;
    public y2e0 l;
    public mj3 m;
    public zr3 n;
    public String o;
    public String p;
    public final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    public final AtomicBoolean c = new AtomicBoolean(false);
    public boolean q = false;
    public final ThreadPoolExecutor i = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public dps0() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f6482a = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    public static String a(od90 od90Var) {
        if (od90Var.d()) {
            ibs0 ibs0VarE = od90Var.e();
            long jA = ibs0VarE.A();
            Locale locale = Locale.ENGLISH;
            return b1j.k("trace metric: ", ibs0VarE.B(), " (duration: ", new DecimalFormat("#.####").format(jA / 1000.0d), "ms)");
        }
        if (od90Var.b()) {
            ll50 ll50VarC = od90Var.c();
            long jB = ll50VarC.K() ? ll50VarC.B() : 0L;
            String strValueOf = ll50VarC.G() ? String.valueOf(ll50VarC.w()) : GrsBaseInfo.CountryCodeSource.UNKNOWN;
            Locale locale2 = Locale.ENGLISH;
            return axq.n(b1j.n("network request trace: ", ll50VarC.D(), " (responseCode: ", strValueOf, ", responseTime: "), new DecimalFormat("#.####").format(jB / 1000.0d), "ms)");
        }
        if (!od90Var.a()) {
            return "log";
        }
        set setVarF = od90Var.f();
        Locale locale3 = Locale.ENGLISH;
        return rz4.j(setVarF.t(), Separators.RPAREN, ohs0.t(setVarF.u(), "gauges (hasMetadata: ", ", cpuGaugeCount: ", ", memoryGaugeCount: ", setVarF.x()));
    }

    public final void b(nd90 nd90Var) {
        if (nd90Var.d()) {
            this.m.b("_fstec");
        } else if (nd90Var.b()) {
            this.m.b("_fsntc");
        }
    }

    public final void c(ibs0 ibs0Var, ts3 ts3Var) {
        this.i.execute(new b1(this, ibs0Var, ts3Var, (byte) 29));
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0303  */
    /* JADX WARN: Code duplicated, block: B:141:0x0359  */
    /* JADX WARN: Code duplicated, block: B:146:0x0393  */
    /* JADX WARN: Code duplicated, block: B:148:0x039d  */
    /* JADX WARN: Code duplicated, block: B:151:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:160:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:162:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:166:0x03e5 A[Catch: all -> 0x03ed, TRY_LEAVE, TryCatch #4 {, blocks: (B:164:0x03e1, B:166:0x03e5), top: B:237:0x03e1 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:176:0x042b  */
    /* JADX WARN: Code duplicated, block: B:178:0x0435  */
    /* JADX WARN: Code duplicated, block: B:181:0x0450  */
    /* JADX WARN: Code duplicated, block: B:183:0x0458  */
    /* JADX WARN: Code duplicated, block: B:187:0x0460  */
    /* JADX WARN: Code duplicated, block: B:194:0x048f  */
    /* JADX WARN: Code duplicated, block: B:201:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:206:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:208:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:210:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:212:0x04df  */
    /* JADX WARN: Code duplicated, block: B:213:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:215:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:217:0x0517  */
    /* JADX WARN: Code duplicated, block: B:218:0x0522  */
    /* JADX WARN: Code duplicated, block: B:220:0x0534  */
    /* JADX WARN: Code duplicated, block: B:223:0x0549  */
    /* JADX WARN: Code duplicated, block: B:225:0x0553  */
    /* JADX WARN: Code duplicated, block: B:226:0x056b  */
    /* JADX WARN: Code duplicated, block: B:229:0x0574  */
    /* JADX WARN: Code duplicated, block: B:230:0x0586  */
    /* JADX WARN: Code duplicated, block: B:237:0x03e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x046c, code lost:
    
        if (a.y2e0.a(r14.c().x()) == false) goto L189;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(a.md90 r14, a.ts3 r15) {
        /*
            Method dump skipped, instruction units count: 1427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dps0.d(a.md90, a.ts3):void");
    }

    @Override // a.lj3
    public final void onUpdateAppState(ts3 ts3Var) {
        byte b = 0;
        this.q = ts3Var == ts3.FOREGROUND;
        if (this.c.get()) {
            this.i.execute(new bps0(this, b));
        }
    }
}
