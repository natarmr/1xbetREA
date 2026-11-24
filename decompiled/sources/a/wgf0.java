package a;

import android.os.Build;
import android.util.Log;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public final class wgf0 implements w6j0 {
    public static final int g;
    public static final Regex h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final olq0 f39115a;
    public final dgq b;
    public final bs3 c;
    public final xgf0 d;
    public final wzi0 e;
    public final k050 f;

    static {
        uen uenVar = wen.b;
        g = (int) wen.l(ibc.v0(24, bfn.HOURS), bfn.SECONDS);
        h = new Regex("com/google/firebase/sessions//");
    }

    public wgf0(olq0 olq0Var, dgq dgqVar, bs3 bs3Var, xgf0 xgf0Var, wzi0 wzi0Var) {
        olq0Var.getClass();
        dgqVar.getClass();
        bs3Var.getClass();
        xgf0Var.getClass();
        wzi0Var.getClass();
        this.f39115a = olq0Var;
        this.b = dgqVar;
        this.c = bs3Var;
        this.d = xgf0Var;
        this.e = wzi0Var;
        this.f = new k050();
    }

    @Override // a.w6j0
    public final Boolean a() {
        return this.e.a().f6188a;
    }

    @Override // a.w6j0
    public final wen b() {
        Integer num = this.e.a().c;
        if (num == null) {
            return null;
        }
        uen uenVar = wen.b;
        return new wen(ibc.v0(num.intValue(), bfn.SECONDS));
    }

    @Override // a.w6j0
    public final Double c() {
        return this.e.a().b;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ab A[Catch: all -> 0x004c, TRY_LEAVE, TryCatch #1 {all -> 0x004c, blocks: (B:21:0x0048, B:46:0x00a1, B:48:0x00ab, B:51:0x00b6, B:54:0x0140), top: B:63:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00b6 A[Catch: all -> 0x004c, TRY_ENTER, TryCatch #1 {all -> 0x004c, blocks: (B:21:0x0048, B:46:0x00a1, B:48:0x00ab, B:51:0x00b6, B:54:0x0140), top: B:63:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x013f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0140 A[Catch: all -> 0x004c, TRY_LEAVE, TryCatch #1 {all -> 0x004c, blocks: (B:21:0x0048, B:46:0x00a1, B:48:0x00ab, B:51:0x00b6, B:54:0x0140), top: B:63:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0145  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x00b6, please report this as an issue */
    @Override // a.w6j0
    public final Object d(yje yjeVar) throws Throwable {
        vgf0 vgf0Var;
        i050 i050Var;
        i050 i050Var2;
        i050 i050Var3;
        String str;
        Object objD0;
        if (yjeVar instanceof vgf0) {
            vgf0Var = (vgf0) yjeVar;
            int i = vgf0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                vgf0Var.l = i - Integer.MIN_VALUE;
            } else {
                vgf0Var = new vgf0(this, (zje) yjeVar);
            }
        } else {
            vgf0Var = new vgf0(this, (zje) yjeVar);
        }
        Object obj = vgf0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = vgf0Var.l;
        wzi0 wzi0Var = this.e;
        int i3 = 2;
        yje yjeVar2 = null;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                i050Var = this.f;
                if (!i050Var.a() && !wzi0Var.b()) {
                    return Unit.f46060a;
                }
                vgf0Var.i = i050Var;
                vgf0Var.l = 1;
                if (i050Var.d(vgf0Var) != wneVar) {
                }
                return wneVar;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    i050Var3 = vgf0Var.i;
                    try {
                        z1x.P(obj);
                        str = ((tix) obj).f34027a;
                        if (str.equals("")) {
                            Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                            Unit unit = Unit.f46060a;
                            i050Var3.c(null);
                            return unit;
                        }
                        Pair pair = new Pair("X-Crashlytics-Installation-ID", str);
                        String str2 = Build.MANUFACTURER + Build.MODEL;
                        Regex regex = h;
                        Pair pair2 = new Pair("X-Crashlytics-Device-Model", regex.replace(str2, ""));
                        String str3 = Build.VERSION.INCREMENTAL;
                        str3.getClass();
                        Pair pair3 = new Pair("X-Crashlytics-OS-Build-Version", regex.replace(str3, ""));
                        String str4 = Build.VERSION.RELEASE;
                        str4.getClass();
                        Pair pair4 = new Pair("X-Crashlytics-OS-Display-Version", regex.replace(str4, ""));
                        this.c.getClass();
                        Map mapF = xp20.f(pair, pair2, pair3, pair4, new Pair("X-Crashlytics-API-Client-Version", "3.0.8"));
                        Log.d("FirebaseSessions", "Fetching settings from server.");
                        xgf0 xgf0Var = this.d;
                        k6d0 k6d0Var = new k6d0(this, yjeVar2, (byte) 10);
                        st20 st20Var = new st20(i3, yjeVar2, (byte) 26);
                        vgf0Var.i = i050Var3;
                        vgf0Var.l = 3;
                        objD0 = qjj.d0(xgf0Var.b, new pnd0(xgf0Var, mapF, k6d0Var, st20Var, null, (byte) 7), vgf0Var);
                        if (objD0 == wneVar) {
                            objD0 = Unit.f46060a;
                        }
                        if (objD0 != wneVar) {
                            i050Var2 = i050Var3;
                            i050Var2.c(null);
                            return Unit.f46060a;
                        }
                        return wneVar;
                    } catch (Throwable th) {
                        th = th;
                        i050Var2 = i050Var3;
                    }
                } else {
                    if (i2 != 3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i050Var2 = vgf0Var.i;
                    try {
                        z1x.P(obj);
                        i050Var2.c(null);
                        return Unit.f46060a;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                i050Var2.c(null);
                throw th;
            }
            i050 i050Var4 = vgf0Var.i;
            z1x.P(obj);
            i050Var = i050Var4;
            if (!wzi0Var.b()) {
                Log.d("FirebaseSessions", "Remote settings cache not expired. Using cached values.");
                Unit unit2 = Unit.f46060a;
                i050Var.c(null);
                return unit2;
            }
            rqt rqtVar = tix.c;
            dgq dgqVar = this.b;
            vgf0Var.i = i050Var;
            vgf0Var.l = 2;
            Object objA = rqtVar.a(dgqVar, vgf0Var);
            if (objA != wneVar) {
                i050Var3 = i050Var;
                obj = objA;
                str = ((tix) obj).f34027a;
                if (str.equals("")) {
                    Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                    Unit unit3 = Unit.f46060a;
                    i050Var3.c(null);
                    return unit3;
                }
                Pair pair5 = new Pair("X-Crashlytics-Installation-ID", str);
                String str5 = Build.MANUFACTURER + Build.MODEL;
                Regex regex2 = h;
                Pair pair6 = new Pair("X-Crashlytics-Device-Model", regex2.replace(str5, ""));
                String str6 = Build.VERSION.INCREMENTAL;
                str6.getClass();
                Pair pair7 = new Pair("X-Crashlytics-OS-Build-Version", regex2.replace(str6, ""));
                String str7 = Build.VERSION.RELEASE;
                str7.getClass();
                Pair pair8 = new Pair("X-Crashlytics-OS-Display-Version", regex2.replace(str7, ""));
                this.c.getClass();
                Map mapF2 = xp20.f(pair5, pair6, pair7, pair8, new Pair("X-Crashlytics-API-Client-Version", "3.0.8"));
                Log.d("FirebaseSessions", "Fetching settings from server.");
                xgf0 xgf0Var2 = this.d;
                k6d0 k6d0Var2 = new k6d0(this, yjeVar2, (byte) 10);
                st20 st20Var2 = new st20(i3, yjeVar2, (byte) 26);
                vgf0Var.i = i050Var3;
                vgf0Var.l = 3;
                objD0 = qjj.d0(xgf0Var2.b, new pnd0(xgf0Var2, mapF2, k6d0Var2, st20Var2, null, (byte) 7), vgf0Var);
                if (objD0 == wneVar) {
                    objD0 = Unit.f46060a;
                }
                if (objD0 != wneVar) {
                    i050Var2 = i050Var3;
                    i050Var2.c(null);
                    return Unit.f46060a;
                }
            }
            return wneVar;
        } catch (Throwable th3) {
            th = th3;
            i050Var2 = i050Var;
        }
    }
}
