package a;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qev {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c14 f28601a = o2e.Z(new h7m0(null, null, null, null, null, null, null, null, null, null));

    /* JADX WARN: Code duplicated, block: B:64:0x0085  */
    /* JADX WARN: Code duplicated, block: B:73:0x009c  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ad  */
    public static void b(qev qevVar, z40 z40Var, q70 q70Var, va5 va5Var, xjq xjqVar, List list, List list2, List list3, Boolean bool, Boolean bool2, Boolean bool3, int i) {
        List list4;
        List list5;
        List list6;
        z40 z40Var2 = (i & 1) != 0 ? null : z40Var;
        q70 q70Var2 = (i & 2) != 0 ? null : q70Var;
        va5 va5Var2 = (i & 4) != 0 ? null : va5Var;
        xjq xjqVar2 = (i & 8) != 0 ? null : xjqVar;
        List list7 = (i & 16) != 0 ? null : list;
        List list8 = (i & 32) != 0 ? null : list2;
        List list9 = (i & 64) != 0 ? null : list3;
        Boolean bool4 = (i & 128) != 0 ? null : bool;
        Boolean bool5 = (i & 256) != 0 ? null : bool2;
        Boolean bool6 = (i & 512) != 0 ? null : bool3;
        c14 c14Var = qevVar.f28601a;
        while (true) {
            Object obj = c14Var.f3556a;
            h7m0 h7m0Var = (h7m0) obj;
            z40 z40Var3 = z40Var2 == null ? h7m0Var.f12583a : z40Var2;
            q70 q70Var3 = q70Var2 == null ? h7m0Var.b : q70Var2;
            va5 va5Var3 = va5Var2 == null ? h7m0Var.c : va5Var2;
            Boolean bool7 = bool6;
            xjq xjqVar3 = xjqVar2 == null ? h7m0Var.d : xjqVar2;
            if (list7 == null) {
                list4 = h7m0Var.e;
            } else {
                list4 = list7.isEmpty() ? null : list7;
                if (list4 == null) {
                    list4 = h7m0Var.e;
                }
            }
            if (list8 == null) {
                list5 = h7m0Var.f;
            } else {
                list5 = list8.isEmpty() ? null : list8;
                if (list5 == null) {
                    list5 = h7m0Var.f;
                }
            }
            if (list9 == null) {
                list6 = h7m0Var.g;
            } else {
                list6 = list9.isEmpty() ? null : list9;
                if (list6 == null) {
                    list6 = h7m0Var.g;
                }
            }
            Boolean bool8 = bool4 == null ? h7m0Var.h : bool4;
            Boolean bool9 = bool5 == null ? h7m0Var.i : bool5;
            Boolean bool10 = bool7 == null ? h7m0Var.j : bool7;
            h7m0Var.getClass();
            if (c14Var.a(obj, new h7m0(z40Var3, q70Var3, va5Var3, xjqVar3, list4, list5, list6, bool8, bool9, bool10))) {
                return;
            } else {
                bool6 = bool7;
            }
        }
    }

    public final LinkedHashMap a() {
        h7m0 h7m0Var = (h7m0) this.f28601a.f3556a;
        h7m0Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        z40 z40Var = h7m0Var.f12583a;
        if (z40Var != null) {
            int i = z40Var.f43743a;
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
            key.getClass();
            linkedHashMap.put(key, Integer.valueOf(i));
        }
        q70 q70Var = h7m0Var.b;
        if (q70Var != null) {
            byte b = q70Var.f28225a;
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_AF_MODE;
            key2.getClass();
            linkedHashMap.put(key2, Integer.valueOf(b));
        }
        va5 va5Var = h7m0Var.c;
        if (va5Var != null) {
            byte b2 = va5Var.f37069a;
            CaptureRequest.Key key3 = CaptureRequest.CONTROL_AWB_MODE;
            key3.getClass();
            linkedHashMap.put(key3, Integer.valueOf(b2));
        }
        xjq xjqVar = h7m0Var.d;
        if (xjqVar != null) {
            byte b3 = xjqVar.f40999a;
            CaptureRequest.Key key4 = CaptureRequest.FLASH_MODE;
            key4.getClass();
            linkedHashMap.put(key4, Integer.valueOf(b3));
        }
        List list = h7m0Var.e;
        if (list != null) {
            CaptureRequest.Key key5 = CaptureRequest.CONTROL_AE_REGIONS;
            key5.getClass();
            linkedHashMap.put(key5, list.toArray(new MeteringRectangle[0]));
        }
        List list2 = h7m0Var.f;
        if (list2 != null) {
            CaptureRequest.Key key6 = CaptureRequest.CONTROL_AF_REGIONS;
            key6.getClass();
            linkedHashMap.put(key6, list2.toArray(new MeteringRectangle[0]));
        }
        List list3 = h7m0Var.g;
        if (list3 != null) {
            CaptureRequest.Key key7 = CaptureRequest.CONTROL_AWB_REGIONS;
            key7.getClass();
            linkedHashMap.put(key7, list3.toArray(new MeteringRectangle[0]));
        }
        Boolean bool = h7m0Var.h;
        if (bool != null) {
            CaptureRequest.Key key8 = CaptureRequest.CONTROL_AE_LOCK;
            key8.getClass();
            linkedHashMap.put(key8, bool);
        }
        Boolean bool2 = h7m0Var.j;
        if (bool2 != null) {
            CaptureRequest.Key key9 = CaptureRequest.CONTROL_AWB_LOCK;
            key9.getClass();
            linkedHashMap.put(key9, bool2);
        }
        return linkedHashMap;
    }
}
