package com.google.firebase.perf.config;

import a.dhq;
import a.ehq;
import a.f03;
import a.krd;
import a.msd;
import a.ord;
import a.p5d0;
import a.qff0;
import a.rff0;
import a.rgk;
import a.rrd;
import a.udk;
import a.v680;
import a.wgq;
import a.xgq;
import a.yfq;
import a.zsd;
import android.content.Context;
import android.content.pm.PackageManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, dhq> allRcConfigMap;
    private final rgk cache;
    private final Executor executor;
    private xgq firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private p5d0 firebaseRemoteConfigProvider;
    private final long rcmInitTimestamp;
    private final long remoteConfigFetchDelayInMs;
    private static final f03 logger = f03.d();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = 43200000;

    private RemoteConfigManager() {
        this(rgk.b(), new ThreadPoolExecutor(0, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, ((long) new Random().nextInt(RANDOM_CONFIG_FETCH_DELAY_MS)) + 5000);
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private dhq getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (!isFirebaseRemoteConfigAvailable() || !this.allRcConfigMap.containsKey(str)) {
            return null;
        }
        dhq dhqVar = this.allRcConfigMap.get(str);
        if (((ehq) dhqVar).b != 2) {
            return null;
        }
        logger.b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", ((ehq) dhqVar).d(), str);
        return dhqVar;
    }

    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasLastFetchBecomeStale(long j) {
        return j - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    private boolean hasRemoteConfigFetchDelayElapsed(long j) {
        return j - this.rcmInitTimestamp >= this.remoteConfigFetchDelayInMs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Exception exc) {
        logger.g("Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/", exc);
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        return hasRemoteConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis);
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        xgq xgqVar = this.firebaseRemoteConfig;
        rrd rrdVar = xgqVar.e;
        long j = ((msd) rrdVar.h).f22313a.getLong("minimum_fetch_interval_in_seconds", 43200L);
        HashMap map = new HashMap((Map) rrdVar.i);
        map.put("X-Firebase-RC-Fetch-Type", "BASE/1");
        ((krd) rrdVar.f).b().continueWithTask((Executor) rrdVar.d, new ord(rrdVar, j, map)).onSuccessTask(yfq.f42553a, new udk((byte) 27)).onSuccessTask(xgqVar.b, new wgq(xgqVar)).addOnSuccessListener(this.executor, new rff0(this)).addOnFailureListener(this.executor, new rff0(this));
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                this.allRcConfigMap.putAll(this.firebaseRemoteConfig.a());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    public v680 getBoolean(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config boolean value is null.");
            return new v680();
        }
        dhq remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new v680(Boolean.valueOf(((ehq) remoteConfigValue).a()));
            } catch (IllegalArgumentException unused) {
                ehq ehqVar = (ehq) remoteConfigValue;
                if (!ehqVar.d().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", ehqVar.d(), str);
                }
            }
        }
        return new v680();
    }

    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public v680 getDouble(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config double value is null.");
            return new v680();
        }
        dhq remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new v680(Double.valueOf(((ehq) remoteConfigValue).b()));
            } catch (IllegalArgumentException unused) {
                ehq ehqVar = (ehq) remoteConfigValue;
                if (!ehqVar.d().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", ehqVar.d(), str);
                }
            }
        }
        return new v680();
    }

    public v680 getLong(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config long value is null.");
            return new v680();
        }
        dhq remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new v680(Long.valueOf(((ehq) remoteConfigValue).c()));
            } catch (IllegalArgumentException unused) {
                ehq ehqVar = (ehq) remoteConfigValue;
                if (!ehqVar.d().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", ehqVar.d(), str);
                }
            }
        }
        return new v680();
    }

    public <T> T getRemoteConfigValueOrDefault(String str, T t) {
        dhq remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                if (t instanceof Boolean) {
                    return (T) Boolean.valueOf(((ehq) remoteConfigValue).a());
                }
                if (t instanceof Double) {
                    return (T) Double.valueOf(((ehq) remoteConfigValue).b());
                }
                if (!(t instanceof Long) && !(t instanceof Integer)) {
                    if (t instanceof String) {
                        return (T) ((ehq) remoteConfigValue).d();
                    }
                    T t2 = (T) ((ehq) remoteConfigValue).d();
                    try {
                        logger.b("No matching type found for the defaultValue: '%s', using String.", t);
                        return t2;
                    } catch (IllegalArgumentException unused) {
                        t = t2;
                        ehq ehqVar = (ehq) remoteConfigValue;
                        if (!ehqVar.d().isEmpty()) {
                            logger.b("Could not parse value: '%s' for key: '%s'.", ehqVar.d(), str);
                        }
                        return t;
                    }
                }
                return (T) Long.valueOf(((ehq) remoteConfigValue).c());
            } catch (IllegalArgumentException unused2) {
            }
        }
        return t;
    }

    public v680 getString(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config String value is null.");
            return new v680();
        }
        dhq remoteConfigValue = getRemoteConfigValue(str);
        return remoteConfigValue != null ? new v680(((ehq) remoteConfigValue).d()) : new v680();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        p5d0 p5d0Var;
        qff0 qff0Var;
        if (this.firebaseRemoteConfig == null && (p5d0Var = this.firebaseRemoteConfigProvider) != null && (qff0Var = (qff0) p5d0Var.get()) != null) {
            this.firebaseRemoteConfig = qff0Var.b(FIREPERF_FRC_NAMESPACE_NAME);
        }
        return this.firebaseRemoteConfig != null;
    }

    public boolean isLastFetchFailed() {
        xgq xgqVar = this.firebaseRemoteConfig;
        return xgqVar == null || xgqVar.b().f40449a == 1 || this.firebaseRemoteConfig.b().f40449a == 2;
    }

    public void setFirebaseRemoteConfigProvider(p5d0 p5d0Var) {
        this.firebaseRemoteConfigProvider = p5d0Var;
    }

    public void syncConfigValues(Map<String, dhq> map) {
        this.allRcConfigMap.putAll(map);
        for (String str : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str)) {
                this.allRcConfigMap.remove(str);
            }
        }
        zsd zsdVarQ0 = zsd.q0();
        ConcurrentHashMap<String, dhq> concurrentHashMap = this.allRcConfigMap;
        zsdVarQ0.getClass();
        dhq dhqVar = concurrentHashMap.get("fpr_experiment_app_start_ttid");
        if (dhqVar == null) {
            logger.a("ExperimentTTID remote config flag does not exist.");
            return;
        }
        try {
            this.cache.g("com.google.firebase.perf.ExperimentTTID", ((ehq) dhqVar).a());
        } catch (Exception unused) {
            logger.a("ExperimentTTID remote config flag has invalid value, expected boolean.");
        }
    }

    public RemoteConfigManager(rgk rgkVar, Executor executor, xgq xgqVar, long j) {
        ConcurrentHashMap<String, dhq> concurrentHashMap;
        this.rcmInitTimestamp = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
        this.cache = rgkVar;
        this.executor = executor;
        this.firebaseRemoteConfig = xgqVar;
        if (xgqVar == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(xgqVar.a());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.remoteConfigFetchDelayInMs = j;
    }
}
