package com.huawei.agconnect.core.impl;

import android.content.Context;
import android.util.Log;
import com.huawei.agconnect.AGCRoutePolicy;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.AGConnectOptions;
import com.huawei.agconnect.JsonProcessingFactory;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.agconnect.config.impl.AGConnectOptionsImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class AGConnectInstanceImpl extends AGConnectInstance {
    public static ArrayList b;
    public static final HashMap c = new HashMap();
    public static String d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AGConnectOptions f45689a;

    /* JADX INFO: renamed from: com.huawei.agconnect.core.impl.AGConnectInstanceImpl$1, reason: invalid class name */
    class AnonymousClass1 implements JsonProcessingFactory.JsonProcessor {
        @Override // com.huawei.agconnect.JsonProcessingFactory.JsonProcessor
        public final String a(AGConnectOptions aGConnectOptions) {
            if (aGConnectOptions.b().equals(AGCRoutePolicy.c)) {
                return aGConnectOptions.getString("/agcgw_all/CN");
            }
            if (aGConnectOptions.b().equals(AGCRoutePolicy.e)) {
                return aGConnectOptions.getString("/agcgw_all/RU");
            }
            if (aGConnectOptions.b().equals(AGCRoutePolicy.d)) {
                return aGConnectOptions.getString("/agcgw_all/DE");
            }
            if (aGConnectOptions.b().equals(AGCRoutePolicy.f)) {
                return aGConnectOptions.getString("/agcgw_all/SG");
            }
            Log.e("AGC_Instance", "region is error, please check region");
            return null;
        }
    }

    /* JADX INFO: renamed from: com.huawei.agconnect.core.impl.AGConnectInstanceImpl$2, reason: invalid class name */
    class AnonymousClass2 implements JsonProcessingFactory.JsonProcessor {
        @Override // com.huawei.agconnect.JsonProcessingFactory.JsonProcessor
        public final String a(AGConnectOptions aGConnectOptions) {
            if (aGConnectOptions.b().equals(AGCRoutePolicy.c)) {
                return aGConnectOptions.getString("/agcgw_all/CN_back");
            }
            if (aGConnectOptions.b().equals(AGCRoutePolicy.e)) {
                return aGConnectOptions.getString("/agcgw_all/RU_back");
            }
            if (aGConnectOptions.b().equals(AGCRoutePolicy.d)) {
                return aGConnectOptions.getString("/agcgw_all/DE_back");
            }
            if (aGConnectOptions.b().equals(AGCRoutePolicy.f)) {
                return aGConnectOptions.getString("/agcgw_all/SG_back");
            }
            Log.e("AGC_Instance", "region is error, please check region");
            return null;
        }
    }

    public AGConnectInstanceImpl(AGConnectOptions aGConnectOptions) {
        Log.d("AGC_Instance", "AGConnectInstanceImpl init");
        this.f45689a = aGConnectOptions;
        if (b == null) {
            Log.e("AGC_Instance", "please call `initialize()` first");
        }
        new ServiceRepository(b);
        new ServiceRepository(null);
        if (aGConnectOptions instanceof AGConnectOptionsImpl) {
            ServiceRepository.a(((AGConnectOptionsImpl) aGConnectOptions).h);
        }
        Log.d("AGC_Instance", "AGConnectInstanceImpl init end");
    }

    public static synchronized AGConnectInstance a(AGConnectOptions aGConnectOptions, boolean z) {
        AGConnectInstance aGConnectInstanceImpl;
        HashMap map = c;
        aGConnectInstanceImpl = (AGConnectInstance) map.get(aGConnectOptions.a());
        if (aGConnectInstanceImpl == null || z) {
            aGConnectInstanceImpl = new AGConnectInstanceImpl(aGConnectOptions);
            map.put(aGConnectOptions.a(), aGConnectInstanceImpl);
        }
        return aGConnectInstanceImpl;
    }

    public static synchronized void b(Context context, AGConnectServicesConfig aGConnectServicesConfig) {
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                Log.w("AGC_Instance", "context.getApplicationContext null");
            } else {
                context = applicationContext;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            HashMap map = JsonProcessingFactory.f45676a;
            map.put("/agcgw/url", anonymousClass1);
            map.put("/agcgw/backurl", new AnonymousClass2());
            if (b == null) {
                b = new ServiceRegistrarParser(context).a();
            }
            a(aGConnectServicesConfig, true);
            d = "DEFAULT_INSTANCE";
            Log.i("AGC_Instance", "initFinish callback start");
            Iterator it = AGCInitFinishManagerImpl.f45688a.iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
            Log.i("AGC_Instance", "AGC SDK initialize end");
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized AGConnectInstance c(String str) {
        AGConnectInstance aGConnectInstance;
        try {
            aGConnectInstance = (AGConnectInstance) c.get(str);
            if (aGConnectInstance == null) {
                if ("DEFAULT_INSTANCE".equals(str)) {
                    Log.w("AGC_Instance", "please call `initialize()` first");
                } else {
                    Log.w("AGC_Instance", "not find instance for : ".concat(str));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return aGConnectInstance;
    }
}
