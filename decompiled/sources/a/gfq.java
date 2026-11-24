package a;

import android.javax.sip.header.SubscriptionStateHeader;
import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class gfq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p5d0 f11217a;
    public Integer b = null;

    public gfq(p5d0 p5d0Var) {
        this.f11217a = p5d0Var;
    }

    public static boolean a(ArrayList arrayList, e6 e6Var) {
        String str = e6Var.f7257a;
        String str2 = e6Var.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e6 e6Var2 = (e6) it.next();
            if (e6Var2.f7257a.equals(str) && e6Var2.b.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList b() {
        wp2 wp2Var = (wp2) ((vp2) this.f11217a.get());
        wp2Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : wp2Var.f39524a.f45538a.f("frc", "")) {
            f4x f4xVar = tnw0.f34257a;
            s0x.H(bundle);
            up2 up2Var = new up2();
            String str = (String) u4n0.y(bundle, "origin", String.class, null);
            s0x.H(str);
            up2Var.f36041a = str;
            String str2 = (String) u4n0.y(bundle, "name", String.class, null);
            s0x.H(str2);
            up2Var.b = str2;
            up2Var.c = u4n0.y(bundle, "value", Object.class, null);
            up2Var.d = (String) u4n0.y(bundle, "trigger_event_name", String.class, null);
            up2Var.e = ((Long) u4n0.y(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            up2Var.f = (String) u4n0.y(bundle, "timed_out_event_name", String.class, null);
            up2Var.g = (Bundle) u4n0.y(bundle, "timed_out_event_params", Bundle.class, null);
            up2Var.h = (String) u4n0.y(bundle, "triggered_event_name", String.class, null);
            up2Var.i = (Bundle) u4n0.y(bundle, "triggered_event_params", Bundle.class, null);
            up2Var.j = ((Long) u4n0.y(bundle, "time_to_live", Long.class, 0L)).longValue();
            up2Var.k = (String) u4n0.y(bundle, "expired_event_name", String.class, null);
            up2Var.l = (Bundle) u4n0.y(bundle, "expired_event_params", Bundle.class, null);
            up2Var.n = ((Boolean) u4n0.y(bundle, SubscriptionStateHeader.ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            up2Var.m = ((Long) u4n0.y(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            up2Var.o = ((Long) u4n0.y(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(up2Var);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x026a  */
    /* JADX WARN: Code duplicated, block: B:110:0x028e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0292  */
    /* JADX WARN: Code duplicated, block: B:114:0x029a  */
    /* JADX WARN: Code duplicated, block: B:116:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:118:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:120:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:124:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:127:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:130:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:133:0x02de  */
    /* JADX WARN: Code duplicated, block: B:136:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:139:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:142:0x0300  */
    /* JADX WARN: Code duplicated, block: B:145:0x0309  */
    /* JADX WARN: Code duplicated, block: B:148:0x0319  */
    /* JADX WARN: Code duplicated, block: B:151:0x0322  */
    /* JADX WARN: Code duplicated, block: B:99:0x0267  */
    public final void c(ArrayList arrayList) throws d6 {
        ObjectOutputStream objectOutputStream;
        ObjectInputStream objectInputStream;
        String str;
        String str2;
        Bundle bundle;
        String str3;
        String str4;
        Object obj;
        String str5;
        String str6;
        Bundle bundle2;
        String str7;
        Bundle bundle3;
        String str8;
        Bundle bundle4;
        p5d0 p5d0Var = this.f11217a;
        if (p5d0Var.get() == null) {
            throw new d6("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
        ArrayList<e6> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            String str9 = "";
            if (!it.hasNext()) {
                if (arrayList2.isEmpty()) {
                    if (p5d0Var.get() == null) {
                        throw new d6("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                    }
                    Iterator it2 = b().iterator();
                    while (it2.hasNext()) {
                        String str10 = ((up2) it2.next()).b;
                        wrw0 wrw0Var = ((wp2) ((vp2) p5d0Var.get())).f39524a.f45538a;
                        wrw0Var.c(new kqw0(wrw0Var, str10, (String) null, (Bundle) null));
                    }
                    return;
                }
                if (p5d0Var.get() == null) {
                    throw new d6("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                }
                ArrayList<up2> arrayListB = b();
                ArrayList<e6> arrayList3 = new ArrayList();
                for (up2 up2Var : arrayListB) {
                    String[] strArr = e6.g;
                    String str11 = up2Var.d;
                    arrayList3.add(new e6(up2Var.b, String.valueOf(up2Var.c), str11 != null ? str11 : str9, new Date(up2Var.m), up2Var.e, up2Var.j));
                    str9 = str9;
                }
                ArrayList arrayList4 = new ArrayList();
                for (e6 e6Var : arrayList3) {
                    if (!a(arrayList2, e6Var)) {
                        arrayList4.add(e6Var.a());
                    }
                }
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    String str12 = ((up2) it3.next()).b;
                    wrw0 wrw0Var2 = ((wp2) ((vp2) p5d0Var.get())).f39524a.f45538a;
                    wrw0Var2.c(new kqw0(wrw0Var2, str12, (String) null, (Bundle) null));
                }
                ArrayList<e6> arrayList5 = new ArrayList();
                for (e6 e6Var2 : arrayList2) {
                    if (!a(arrayList3, e6Var2)) {
                        arrayList5.add(e6Var2);
                    }
                }
                ArrayDeque arrayDeque = new ArrayDeque(b());
                Integer numValueOf = this.b;
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(((wp2) ((vp2) p5d0Var.get())).f39524a.f45538a.b("frc"));
                    this.b = numValueOf;
                }
                int iIntValue = numValueOf.intValue();
                for (e6 e6Var3 : arrayList5) {
                    while (arrayDeque.size() >= iIntValue) {
                        String str13 = ((up2) arrayDeque.pollFirst()).b;
                        wrw0 wrw0Var3 = ((wp2) ((vp2) p5d0Var.get())).f39524a.f45538a;
                        wrw0Var3.c(new kqw0(wrw0Var3, str13, (String) null, (Bundle) null));
                    }
                    up2 up2VarA = e6Var3.a();
                    wp2 wp2Var = (wp2) ((vp2) p5d0Var.get());
                    wp2Var.getClass();
                    f4x f4xVar = tnw0.f34257a;
                    String str14 = up2VarA.f36041a;
                    if (str14 != null && !str14.isEmpty()) {
                        Object obj2 = up2VarA.c;
                        if (obj2 != null) {
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                try {
                                    objectOutputStream.writeObject(obj2);
                                    objectOutputStream.flush();
                                    objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                                    try {
                                        Object object = objectInputStream.readObject();
                                        try {
                                            objectOutputStream.close();
                                            objectInputStream.close();
                                        } catch (IOException | ClassNotFoundException unused) {
                                            object = null;
                                        }
                                        if (object != null) {
                                            if (!tnw0.a(str14) && tnw0.c(str14, up2VarA.b)) {
                                                String str15 = up2VarA.k;
                                                if (str15 == null) {
                                                    str = up2VarA.h;
                                                    if (str == null) {
                                                        str2 = up2VarA.f;
                                                        if (str2 != null) {
                                                            if (tnw0.b(up2VarA.g, str2)) {
                                                                if (tnw0.d(up2VarA.g, str14, up2VarA.f)) {
                                                                }
                                                            }
                                                        }
                                                        AppMeasurementSdk appMeasurementSdk = wp2Var.f39524a;
                                                        bundle = new Bundle();
                                                        str3 = up2VarA.f36041a;
                                                        if (str3 != null) {
                                                            bundle.putString("origin", str3);
                                                        }
                                                        str4 = up2VarA.b;
                                                        if (str4 != null) {
                                                            bundle.putString("name", str4);
                                                        }
                                                        obj = up2VarA.c;
                                                        if (obj != null) {
                                                            u4n0.x(bundle, obj);
                                                        }
                                                        str5 = up2VarA.d;
                                                        if (str5 != null) {
                                                            bundle.putString("trigger_event_name", str5);
                                                        }
                                                        bundle.putLong("trigger_timeout", up2VarA.e);
                                                        str6 = up2VarA.f;
                                                        if (str6 != null) {
                                                            bundle.putString("timed_out_event_name", str6);
                                                        }
                                                        bundle2 = up2VarA.g;
                                                        if (bundle2 != null) {
                                                            bundle.putBundle("timed_out_event_params", bundle2);
                                                        }
                                                        str7 = up2VarA.h;
                                                        if (str7 != null) {
                                                            bundle.putString("triggered_event_name", str7);
                                                        }
                                                        bundle3 = up2VarA.i;
                                                        if (bundle3 != null) {
                                                            bundle.putBundle("triggered_event_params", bundle3);
                                                        }
                                                        bundle.putLong("time_to_live", up2VarA.j);
                                                        str8 = up2VarA.k;
                                                        if (str8 != null) {
                                                            bundle.putString("expired_event_name", str8);
                                                        }
                                                        bundle4 = up2VarA.l;
                                                        if (bundle4 != null) {
                                                            bundle.putBundle("expired_event_params", bundle4);
                                                        }
                                                        bundle.putLong("creation_timestamp", up2VarA.m);
                                                        bundle.putBoolean(SubscriptionStateHeader.ACTIVE, up2VarA.n);
                                                        bundle.putLong("triggered_timestamp", up2VarA.o);
                                                        wrw0 wrw0Var4 = appMeasurementSdk.f45538a;
                                                        wrw0Var4.c(new jqw0(wrw0Var4, bundle, (byte) 0));
                                                    } else if (tnw0.b(up2VarA.i, str)) {
                                                        if (tnw0.d(up2VarA.i, str14, up2VarA.h)) {
                                                            str2 = up2VarA.f;
                                                            if (str2 != null) {
                                                                if (tnw0.b(up2VarA.g, str2)) {
                                                                    if (tnw0.d(up2VarA.g, str14, up2VarA.f)) {
                                                                    }
                                                                }
                                                            }
                                                            AppMeasurementSdk appMeasurementSdk2 = wp2Var.f39524a;
                                                            bundle = new Bundle();
                                                            str3 = up2VarA.f36041a;
                                                            if (str3 != null) {
                                                                bundle.putString("origin", str3);
                                                            }
                                                            str4 = up2VarA.b;
                                                            if (str4 != null) {
                                                                bundle.putString("name", str4);
                                                            }
                                                            obj = up2VarA.c;
                                                            if (obj != null) {
                                                                u4n0.x(bundle, obj);
                                                            }
                                                            str5 = up2VarA.d;
                                                            if (str5 != null) {
                                                                bundle.putString("trigger_event_name", str5);
                                                            }
                                                            bundle.putLong("trigger_timeout", up2VarA.e);
                                                            str6 = up2VarA.f;
                                                            if (str6 != null) {
                                                                bundle.putString("timed_out_event_name", str6);
                                                            }
                                                            bundle2 = up2VarA.g;
                                                            if (bundle2 != null) {
                                                                bundle.putBundle("timed_out_event_params", bundle2);
                                                            }
                                                            str7 = up2VarA.h;
                                                            if (str7 != null) {
                                                                bundle.putString("triggered_event_name", str7);
                                                            }
                                                            bundle3 = up2VarA.i;
                                                            if (bundle3 != null) {
                                                                bundle.putBundle("triggered_event_params", bundle3);
                                                            }
                                                            bundle.putLong("time_to_live", up2VarA.j);
                                                            str8 = up2VarA.k;
                                                            if (str8 != null) {
                                                                bundle.putString("expired_event_name", str8);
                                                            }
                                                            bundle4 = up2VarA.l;
                                                            if (bundle4 != null) {
                                                                bundle.putBundle("expired_event_params", bundle4);
                                                            }
                                                            bundle.putLong("creation_timestamp", up2VarA.m);
                                                            bundle.putBoolean(SubscriptionStateHeader.ACTIVE, up2VarA.n);
                                                            bundle.putLong("triggered_timestamp", up2VarA.o);
                                                            wrw0 wrw0Var5 = appMeasurementSdk2.f45538a;
                                                            wrw0Var5.c(new jqw0(wrw0Var5, bundle, (byte) 0));
                                                        }
                                                    }
                                                } else if (tnw0.b(up2VarA.l, str15)) {
                                                    if (tnw0.d(up2VarA.l, str14, up2VarA.k)) {
                                                        str = up2VarA.h;
                                                        if (str == null) {
                                                            str2 = up2VarA.f;
                                                            if (str2 != null) {
                                                                if (tnw0.b(up2VarA.g, str2)) {
                                                                    if (tnw0.d(up2VarA.g, str14, up2VarA.f)) {
                                                                    }
                                                                }
                                                            }
                                                            AppMeasurementSdk appMeasurementSdk3 = wp2Var.f39524a;
                                                            bundle = new Bundle();
                                                            str3 = up2VarA.f36041a;
                                                            if (str3 != null) {
                                                                bundle.putString("origin", str3);
                                                            }
                                                            str4 = up2VarA.b;
                                                            if (str4 != null) {
                                                                bundle.putString("name", str4);
                                                            }
                                                            obj = up2VarA.c;
                                                            if (obj != null) {
                                                                u4n0.x(bundle, obj);
                                                            }
                                                            str5 = up2VarA.d;
                                                            if (str5 != null) {
                                                                bundle.putString("trigger_event_name", str5);
                                                            }
                                                            bundle.putLong("trigger_timeout", up2VarA.e);
                                                            str6 = up2VarA.f;
                                                            if (str6 != null) {
                                                                bundle.putString("timed_out_event_name", str6);
                                                            }
                                                            bundle2 = up2VarA.g;
                                                            if (bundle2 != null) {
                                                                bundle.putBundle("timed_out_event_params", bundle2);
                                                            }
                                                            str7 = up2VarA.h;
                                                            if (str7 != null) {
                                                                bundle.putString("triggered_event_name", str7);
                                                            }
                                                            bundle3 = up2VarA.i;
                                                            if (bundle3 != null) {
                                                                bundle.putBundle("triggered_event_params", bundle3);
                                                            }
                                                            bundle.putLong("time_to_live", up2VarA.j);
                                                            str8 = up2VarA.k;
                                                            if (str8 != null) {
                                                                bundle.putString("expired_event_name", str8);
                                                            }
                                                            bundle4 = up2VarA.l;
                                                            if (bundle4 != null) {
                                                                bundle.putBundle("expired_event_params", bundle4);
                                                            }
                                                            bundle.putLong("creation_timestamp", up2VarA.m);
                                                            bundle.putBoolean(SubscriptionStateHeader.ACTIVE, up2VarA.n);
                                                            bundle.putLong("triggered_timestamp", up2VarA.o);
                                                            wrw0 wrw0Var6 = appMeasurementSdk3.f45538a;
                                                            wrw0Var6.c(new jqw0(wrw0Var6, bundle, (byte) 0));
                                                        } else if (tnw0.b(up2VarA.i, str)) {
                                                            if (tnw0.d(up2VarA.i, str14, up2VarA.h)) {
                                                                str2 = up2VarA.f;
                                                                if (str2 != null) {
                                                                    if (tnw0.b(up2VarA.g, str2)) {
                                                                        if (tnw0.d(up2VarA.g, str14, up2VarA.f)) {
                                                                        }
                                                                    }
                                                                }
                                                                AppMeasurementSdk appMeasurementSdk4 = wp2Var.f39524a;
                                                                bundle = new Bundle();
                                                                str3 = up2VarA.f36041a;
                                                                if (str3 != null) {
                                                                    bundle.putString("origin", str3);
                                                                }
                                                                str4 = up2VarA.b;
                                                                if (str4 != null) {
                                                                    bundle.putString("name", str4);
                                                                }
                                                                obj = up2VarA.c;
                                                                if (obj != null) {
                                                                    u4n0.x(bundle, obj);
                                                                }
                                                                str5 = up2VarA.d;
                                                                if (str5 != null) {
                                                                    bundle.putString("trigger_event_name", str5);
                                                                }
                                                                bundle.putLong("trigger_timeout", up2VarA.e);
                                                                str6 = up2VarA.f;
                                                                if (str6 != null) {
                                                                    bundle.putString("timed_out_event_name", str6);
                                                                }
                                                                bundle2 = up2VarA.g;
                                                                if (bundle2 != null) {
                                                                    bundle.putBundle("timed_out_event_params", bundle2);
                                                                }
                                                                str7 = up2VarA.h;
                                                                if (str7 != null) {
                                                                    bundle.putString("triggered_event_name", str7);
                                                                }
                                                                bundle3 = up2VarA.i;
                                                                if (bundle3 != null) {
                                                                    bundle.putBundle("triggered_event_params", bundle3);
                                                                }
                                                                bundle.putLong("time_to_live", up2VarA.j);
                                                                str8 = up2VarA.k;
                                                                if (str8 != null) {
                                                                    bundle.putString("expired_event_name", str8);
                                                                }
                                                                bundle4 = up2VarA.l;
                                                                if (bundle4 != null) {
                                                                    bundle.putBundle("expired_event_params", bundle4);
                                                                }
                                                                bundle.putLong("creation_timestamp", up2VarA.m);
                                                                bundle.putBoolean(SubscriptionStateHeader.ACTIVE, up2VarA.n);
                                                                bundle.putLong("triggered_timestamp", up2VarA.o);
                                                                wrw0 wrw0Var7 = appMeasurementSdk4.f45538a;
                                                                wrw0Var7.c(new jqw0(wrw0Var7, bundle, (byte) 0));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        if (objectOutputStream != null) {
                                            objectOutputStream.close();
                                        }
                                        if (objectInputStream != null) {
                                            objectInputStream.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    objectInputStream = null;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                objectOutputStream = null;
                                objectInputStream = null;
                            }
                        } else if (!tnw0.a(str14)) {
                        }
                    }
                    arrayDeque.offer(up2VarA);
                }
                return;
            }
            Map map = (Map) it.next();
            String[] strArr2 = e6.g;
            ArrayList arrayList6 = new ArrayList();
            String[] strArr3 = e6.g;
            for (int i = 0; i < 5; i++) {
                String str16 = strArr3[i];
                if (!map.containsKey(str16)) {
                    arrayList6.add(str16);
                }
            }
            if (!arrayList6.isEmpty()) {
                throw new d6(String.format("The following keys are missing from the experiment info map: %s", arrayList6));
            }
            try {
                arrayList2.add(new e6((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", e6.h.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis"))));
            } catch (NumberFormatException e) {
                throw new d6("Could not process experiment: one of the durations could not be converted into a long.", e);
            } catch (ParseException e2) {
                throw new d6("Could not process experiment: parsing experiment start time failed.", e2);
            }
        }
    }
}
