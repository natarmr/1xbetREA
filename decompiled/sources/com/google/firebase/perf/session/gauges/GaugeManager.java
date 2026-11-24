package com.google.firebase.perf.session.gauges;

import a.b1;
import a.b8z;
import a.brm0;
import a.dps0;
import a.f03;
import a.gut0;
import a.hsd;
import a.jtd;
import a.ktd;
import a.m03;
import a.mtd;
import a.net;
import a.ntd;
import a.oet;
import a.ogd;
import a.os30;
import a.pet;
import a.ps30;
import a.qet;
import a.ret;
import a.set;
import a.t7f;
import a.ts3;
import a.u7f;
import a.v680;
import a.y7f;
import android.content.Context;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.util.Timer;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private ts3 applicationProcessState;
    private final hsd configResolver;
    private final b8z cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final b8z gaugeManagerExecutor;
    private qet gaugeMetadataManager;
    private final b8z memoryGaugeCollector;
    private String sessionId;
    private final dps0 transportManager;
    private static final f03 logger = f03.d();
    private static final GaugeManager instance = new GaugeManager();

    private GaugeManager() {
        this(new b8z(new ogd((byte) 6)), dps0.s, hsd.e(), null, new b8z(new ogd((byte) 7)), new b8z(new ogd((byte) 8)));
    }

    private static void collectGaugeMetricOnce(u7f u7fVar, ps30 ps30Var, Timer timer) {
        byte b;
        synchronized (u7fVar) {
            b = 1;
            try {
                u7fVar.b.schedule(new t7f(u7fVar, timer, b), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                u7f.g.f("Unable to collect Cpu Metric: " + e.getMessage());
            }
        }
        synchronized (ps30Var) {
            try {
                ps30Var.f27496a.schedule(new os30(ps30Var, timer, b), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e2) {
                ps30.f.f("Unable to collect Memory Metric: " + e2.getMessage());
            }
        }
    }

    private long getCpuGaugeCollectionFrequencyMs(ts3 ts3Var) {
        ktd ktdVar;
        long jLongValue;
        jtd jtdVar;
        int iOrdinal = ts3Var.ordinal();
        if (iOrdinal == 1) {
            hsd hsdVar = this.configResolver;
            hsdVar.getClass();
            synchronized (ktd.class) {
                ktdVar = ktd.f18859a;
                if (ktdVar == null) {
                    ktdVar = new ktd();
                    ktd.f18859a = ktdVar;
                }
            }
            v680 v680VarI = hsdVar.i(ktdVar);
            if (v680VarI.b() && hsd.m(((Long) v680VarI.a()).longValue())) {
                jLongValue = ((Long) v680VarI.a()).longValue();
            } else {
                v680 v680Var = hsdVar.f13576a.getLong("fpr_session_gauge_cpu_capture_frequency_fg_ms");
                if (v680Var.b() && hsd.m(((Long) v680Var.a()).longValue())) {
                    hsdVar.c.d(((Long) v680Var.a()).longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs");
                    jLongValue = ((Long) v680Var.a()).longValue();
                } else {
                    v680 v680VarC = hsdVar.c(ktdVar);
                    if (v680VarC.b() && hsd.m(((Long) v680VarC.a()).longValue())) {
                        jLongValue = ((Long) v680VarC.a()).longValue();
                    } else {
                        jLongValue = hsdVar.f13576a.isLastFetchFailed() ? 300L : 100L;
                    }
                }
            }
        } else if (iOrdinal != 2) {
            jLongValue = -1;
        } else {
            hsd hsdVar2 = this.configResolver;
            hsdVar2.getClass();
            synchronized (jtd.class) {
                jtdVar = jtd.f17093a;
                if (jtdVar == null) {
                    jtdVar = new jtd();
                    jtd.f17093a = jtdVar;
                }
            }
            v680 v680VarI2 = hsdVar2.i(jtdVar);
            if (v680VarI2.b() && hsd.m(((Long) v680VarI2.a()).longValue())) {
                jLongValue = ((Long) v680VarI2.a()).longValue();
            } else {
                v680 v680Var2 = hsdVar2.f13576a.getLong("fpr_session_gauge_cpu_capture_frequency_bg_ms");
                if (v680Var2.b() && hsd.m(((Long) v680Var2.a()).longValue())) {
                    hsdVar2.c.d(((Long) v680Var2.a()).longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs");
                    jLongValue = ((Long) v680Var2.a()).longValue();
                } else {
                    v680 v680VarC2 = hsdVar2.c(jtdVar);
                    jLongValue = (v680VarC2.b() && hsd.m(((Long) v680VarC2.a()).longValue())) ? ((Long) v680VarC2.a()).longValue() : 0L;
                }
            }
        }
        f03 f03Var = u7f.g;
        return jLongValue <= 0 ? INVALID_GAUGE_COLLECTION_FREQUENCY : jLongValue;
    }

    private pet getGaugeMetadata() {
        oet oetVarT = pet.t();
        int iB = gut0.b((brm0.c(5) * this.gaugeMetadataManager.c.totalMem) / 1024);
        oetVarT.i();
        ((pet) oetVarT.b).u(iB);
        int iB2 = gut0.b((brm0.c(5) * this.gaugeMetadataManager.f28599a.maxMemory()) / 1024);
        oetVarT.i();
        ((pet) oetVarT.b).v(iB2);
        int iB3 = gut0.b((brm0.c(3) * ((long) this.gaugeMetadataManager.b.getMemoryClass())) / 1024);
        oetVarT.i();
        ((pet) oetVarT.b).w(iB3);
        return (pet) oetVarT.h();
    }

    public static synchronized GaugeManager getInstance() {
        return instance;
    }

    private long getMemoryGaugeCollectionFrequencyMs(ts3 ts3Var) {
        ntd ntdVar;
        long jLongValue;
        mtd mtdVar;
        int iOrdinal = ts3Var.ordinal();
        if (iOrdinal == 1) {
            hsd hsdVar = this.configResolver;
            hsdVar.getClass();
            synchronized (ntd.class) {
                ntdVar = ntd.f24093a;
                if (ntdVar == null) {
                    ntdVar = new ntd();
                    ntd.f24093a = ntdVar;
                }
            }
            v680 v680VarI = hsdVar.i(ntdVar);
            if (v680VarI.b() && hsd.m(((Long) v680VarI.a()).longValue())) {
                jLongValue = ((Long) v680VarI.a()).longValue();
            } else {
                v680 v680Var = hsdVar.f13576a.getLong("fpr_session_gauge_memory_capture_frequency_fg_ms");
                if (v680Var.b() && hsd.m(((Long) v680Var.a()).longValue())) {
                    hsdVar.c.d(((Long) v680Var.a()).longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs");
                    jLongValue = ((Long) v680Var.a()).longValue();
                } else {
                    v680 v680VarC = hsdVar.c(ntdVar);
                    if (v680VarC.b() && hsd.m(((Long) v680VarC.a()).longValue())) {
                        jLongValue = ((Long) v680VarC.a()).longValue();
                    } else {
                        jLongValue = hsdVar.f13576a.isLastFetchFailed() ? 300L : 100L;
                    }
                }
            }
        } else if (iOrdinal != 2) {
            jLongValue = -1;
        } else {
            hsd hsdVar2 = this.configResolver;
            hsdVar2.getClass();
            synchronized (mtd.class) {
                mtdVar = mtd.f22365a;
                if (mtdVar == null) {
                    mtdVar = new mtd();
                    mtd.f22365a = mtdVar;
                }
            }
            v680 v680VarI2 = hsdVar2.i(mtdVar);
            if (v680VarI2.b() && hsd.m(((Long) v680VarI2.a()).longValue())) {
                jLongValue = ((Long) v680VarI2.a()).longValue();
            } else {
                v680 v680Var2 = hsdVar2.f13576a.getLong("fpr_session_gauge_memory_capture_frequency_bg_ms");
                if (v680Var2.b() && hsd.m(((Long) v680Var2.a()).longValue())) {
                    hsdVar2.c.d(((Long) v680Var2.a()).longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs");
                    jLongValue = ((Long) v680Var2.a()).longValue();
                } else {
                    v680 v680VarC2 = hsdVar2.c(mtdVar);
                    jLongValue = (v680VarC2.b() && hsd.m(((Long) v680VarC2.a()).longValue())) ? ((Long) v680VarC2.a()).longValue() : 0L;
                }
            }
        }
        f03 f03Var = ps30.f;
        return jLongValue <= 0 ? INVALID_GAUGE_COLLECTION_FREQUENCY : jLongValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ u7f lambda$new$0() {
        return new u7f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ps30 lambda$new$1() {
        return new ps30();
    }

    private boolean startCollectingCpuMetrics(long j, Timer timer) {
        if (j == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        u7f u7fVar = (u7f) this.cpuGaugeCollector.get();
        long j2 = u7fVar.d;
        if (j2 == INVALID_GAUGE_COLLECTION_FREQUENCY || j2 == 0 || j <= 0) {
            return true;
        }
        ScheduledFuture scheduledFuture = u7fVar.e;
        if (scheduledFuture == null) {
            u7fVar.a(j, timer);
            return true;
        }
        if (u7fVar.f == j) {
            return true;
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            u7fVar.e = null;
            u7fVar.f = INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        u7fVar.a(j, timer);
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j, Timer timer) {
        if (j == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        ps30 ps30Var = (ps30) this.memoryGaugeCollector.get();
        f03 f03Var = ps30.f;
        if (j <= 0) {
            ps30Var.getClass();
            return true;
        }
        ScheduledFuture scheduledFuture = ps30Var.d;
        if (scheduledFuture == null) {
            ps30Var.a(j, timer);
            return true;
        }
        if (ps30Var.e == j) {
            return true;
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            ps30Var.d = null;
            ps30Var.e = INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        ps30Var.a(j, timer);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: syncFlush, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$stopCollectingGauges$3(String str, ts3 ts3Var) {
        ret retVarZ = set.z();
        while (!((u7f) this.cpuGaugeCollector.get()).f35181a.isEmpty()) {
            y7f y7fVar = (y7f) ((u7f) this.cpuGaugeCollector.get()).f35181a.poll();
            retVarZ.i();
            ((set) retVarZ.b).s(y7fVar);
        }
        while (!((ps30) this.memoryGaugeCollector.get()).b.isEmpty()) {
            m03 m03Var = (m03) ((ps30) this.memoryGaugeCollector.get()).b.poll();
            retVarZ.i();
            ((set) retVarZ.b).r(m03Var);
        }
        retVarZ.i();
        ((set) retVarZ.b).B(str);
        dps0 dps0Var = this.transportManager;
        dps0Var.i.execute(new b1(dps0Var, (set) retVarZ.h(), ts3Var, (byte) 28));
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new qet(context);
    }

    public boolean logGaugeMetadata(String str, ts3 ts3Var) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        ret retVarZ = set.z();
        retVarZ.i();
        ((set) retVarZ.b).B(str);
        pet gaugeMetadata = getGaugeMetadata();
        retVarZ.i();
        ((set) retVarZ.b).A(gaugeMetadata);
        set setVar = (set) retVarZ.h();
        dps0 dps0Var = this.transportManager;
        dps0Var.i.execute(new b1(dps0Var, setVar, ts3Var, (byte) 28));
        return true;
    }

    public void startCollectingGauges(PerfSession perfSession, ts3 ts3Var) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long jStartCollectingGauges = startCollectingGauges(ts3Var, perfSession.b);
        if (jStartCollectingGauges == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.f("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        String str = perfSession.f45670a;
        this.sessionId = str;
        this.applicationProcessState = ts3Var;
        try {
            long j = jStartCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).scheduleAtFixedRate(new net(this, str, ts3Var, (byte) 1), j, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            logger.f("Unable to start collecting Gauges: " + e.getMessage());
        }
    }

    public void stopCollectingGauges() {
        String str = this.sessionId;
        if (str == null) {
            return;
        }
        ts3 ts3Var = this.applicationProcessState;
        u7f u7fVar = (u7f) this.cpuGaugeCollector.get();
        ScheduledFuture scheduledFuture = u7fVar.e;
        byte b = 0;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            u7fVar.e = null;
            u7fVar.f = INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        ps30 ps30Var = (ps30) this.memoryGaugeCollector.get();
        ScheduledFuture scheduledFuture2 = ps30Var.d;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            ps30Var.d = null;
            ps30Var.e = INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        ScheduledFuture scheduledFuture3 = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture3 != null) {
            scheduledFuture3.cancel(false);
        }
        ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).schedule(new net(this, str, ts3Var, b), 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = ts3.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    public GaugeManager(b8z b8zVar, dps0 dps0Var, hsd hsdVar, qet qetVar, b8z b8zVar2, b8z b8zVar3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = ts3.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = b8zVar;
        this.transportManager = dps0Var;
        this.configResolver = hsdVar;
        this.gaugeMetadataManager = qetVar;
        this.cpuGaugeCollector = b8zVar2;
        this.memoryGaugeCollector = b8zVar3;
    }

    private long startCollectingGauges(ts3 ts3Var, Timer timer) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(ts3Var);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, timer)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(ts3Var);
        if (startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, timer)) {
            return cpuGaugeCollectionFrequencyMs == INVALID_GAUGE_COLLECTION_FREQUENCY ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs);
        }
        return cpuGaugeCollectionFrequencyMs;
    }

    public void collectGaugeMetricOnce(Timer timer) {
        collectGaugeMetricOnce((u7f) this.cpuGaugeCollector.get(), (ps30) this.memoryGaugeCollector.get(), timer);
    }
}
