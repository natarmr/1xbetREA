package com.huawei.agconnect.core.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.gov.nist.core.Separators;
import android.os.Bundle;
import android.util.Log;
import com.huawei.agconnect.core.ServiceDiscovery;
import com.huawei.agconnect.core.ServiceRegistrar;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ServiceRegistrarParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f45690a;

    public static class ValueComparator implements Comparator<Map.Entry<String, Integer>>, Serializable {
        @Override // java.util.Comparator
        public final int compare(Map.Entry<String, Integer> entry, Map.Entry<String, Integer> entry2) {
            return entry.getValue().intValue() - entry2.getValue().intValue();
        }
    }

    public ServiceRegistrarParser(Context context) {
        this.f45690a = context;
    }

    public final ArrayList a() {
        StringBuilder sb;
        String string;
        String strConcat;
        Log.i("AGC_Registrar", "getServices");
        ArrayList<String> arrayList = new ArrayList();
        Context context = this.f45690a;
        PackageManager packageManager = context.getPackageManager();
        Bundle bundle = null;
        if (packageManager != null) {
            try {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ServiceDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.e("AGC_Registrar", "Can not found ServiceDiscovery service.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("AGC_Registrar", "get ServiceDiscovery exception." + e.getLocalizedMessage());
            }
        }
        if (bundle != null) {
            HashMap map = new HashMap(10);
            for (String str : bundle.keySet()) {
                if ("com.huawei.agconnect.core.ServiceRegistrar".equals(bundle.getString(str))) {
                    String[] strArrSplit = str.split(Separators.COLON);
                    if (strArrSplit.length == 2) {
                        try {
                            map.put(strArrSplit[0], Integer.valueOf(strArrSplit[1]));
                        } catch (NumberFormatException e2) {
                            strConcat = "registrar configuration format error:" + e2.getMessage();
                            Log.e("AGC_Registrar", strConcat);
                        }
                    } else if (strArrSplit.length == 1) {
                        map.put(strArrSplit[0], 1000);
                    } else {
                        strConcat = "registrar configuration error, ".concat(str);
                        Log.e("AGC_Registrar", strConcat);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(map.entrySet());
            Collections.sort(arrayList2, new ValueComparator());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(((Map.Entry) it.next()).getKey());
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (String str2 : arrayList) {
            try {
                Class<?> cls = Class.forName(str2);
                if (!ServiceRegistrar.class.isAssignableFrom(cls)) {
                    Log.e("AGC_Registrar", cls + " must extends from ServiceRegistrar.");
                } else if (Class.forName(str2).newInstance() != null) {
                    throw new ClassCastException();
                }
            } catch (ClassNotFoundException e3) {
                string = "Can not found service class, " + e3.getMessage();
                Log.e("AGC_Registrar", string);
            } catch (IllegalAccessException e4) {
                e = e4;
                sb = new StringBuilder("instantiate service class exception ");
                sb.append(e.getLocalizedMessage());
                string = sb.toString();
                Log.e("AGC_Registrar", string);
            } catch (InstantiationException e5) {
                e = e5;
                sb = new StringBuilder("instantiate service class exception ");
                sb.append(e.getLocalizedMessage());
                string = sb.toString();
                Log.e("AGC_Registrar", string);
            }
        }
        Log.i("AGC_Registrar", "services:" + arrayList3.size());
        return arrayList3;
    }
}
