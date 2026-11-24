package a;

import android.content.SharedPreferences;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class iuy implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15419a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iuy(Object obj, Object obj2, byte b) {
        this.f15419a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        Object obj;
        byte b = this.f15419a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                hzb0 hzb0Var = (hzb0) obj3;
                kuy kuyVar = (kuy) obj2;
                if (str != null && str.hashCode() == -623218809 && str.equals("ISO_CODE_KEY")) {
                    hzb0Var.f(kuyVar.a());
                    break;
                }
                break;
            default:
                w5z w5zVar = (w5z) obj3;
                p7m0 p7m0Var = (p7m0) obj2;
                if (Intrinsics.d(str, "SAVED_SPORTS_ID")) {
                    try {
                        String string = sharedPreferences.getString(str, null);
                        if (string == null || string.length() == 0) {
                            obj = iun.f15405a;
                        } else {
                            vby vbyVar = (vby) w5zVar.e;
                            vbyVar.getClass();
                            obj = (List) vbyVar.b(new zw3(s710.f31729a, (byte) 0), string);
                        }
                    } catch (Exception unused) {
                        obj = iun.f15405a;
                    }
                    p7m0Var.n(obj);
                    break;
                }
                break;
        }
    }
}
