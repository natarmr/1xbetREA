package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.Range;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.cyber.game.core.game_screen.presentation.bottomsheet.CyberBottomSheetParams;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes.dex */
public class xex implements b4w0, nhi0, xo80, zjj {
    public static volatile xex c;
    public static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f40764a;
    public Object b;

    public xex(gii0 gii0Var, byte b) {
        byte b2 = 25;
        gii0Var.getClass();
        switch (b) {
            case 12:
                this.f40764a = gii0Var;
                this.b = new zo4(this, b2);
                break;
            case 13:
            case 15:
            default:
                this.f40764a = gii0Var;
                this.b = new nc((Object) this, (byte) 19);
                break;
            case 14:
                this.f40764a = gii0Var;
                this.b = new vb8(this, b2);
                break;
            case 16:
                this.f40764a = gii0Var;
                this.b = new h8a(this, (byte) 5);
                break;
        }
    }

    public static x680 G(kzv kzvVar, ctf0 ctf0Var, boolean z) {
        if (e3c.r(kzvVar, z)) {
            return new x680("INDONESIAN_ID", ctf0Var.b.a(R.string.coefficient_type_title, Arrays.copyOf(new Object[0], 0)), new auy(ctf0Var.b.a(R.string.coef_view_ind, Arrays.copyOf(new Object[0], 0))));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object A(int i, int i2, int i3, int i4, ArrayList arrayList, zje zjeVar) {
        ycb ycbVar;
        if (zjeVar instanceof ycb) {
            ycbVar = (ycb) zjeVar;
            int i5 = ycbVar.k;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                ycbVar.k = i5 - Integer.MIN_VALUE;
            } else {
                ycbVar = new ycb(this, zjeVar);
            }
        } else {
            ycbVar = new ycb(this, zjeVar);
        }
        ycb ycbVar2 = ycbVar;
        Object objA = ycbVar2.i;
        wne wneVar = wne.f39444a;
        int i6 = ycbVar2.k;
        if (i6 == 0) {
            z1x.P(objA);
            scb scbVar = (scb) ((h8a) this.b).invoke();
            ycbVar2.k = 1;
            objA = scbVar.a(i, i2, i3, i4, arrayList, ycbVar2);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i6 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return ((dx5) objA).a();
    }

    public x680 B(kzv kzvVar, boolean z) {
        String str = kzvVar.i;
        boolean z2 = z && kzvVar.b != q4f.d;
        if (str.length() == 0 || z2) {
            return null;
        }
        String strA = ((ctf0) this.f40764a).b.a(j0w.f15701a[kzvVar.g.ordinal()] == 1 ? R.string.sell_coefficient_no_dots : R.string.coefficient, Arrays.copyOf(new Object[0], 0));
        str.getClass();
        return new x680("COEF_ID", strA, new auy(str));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0065 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (r7 == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object C(int r6, a.zje r7, boolean r8) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof a.lce
            if (r0 == 0) goto L13
            r0 = r7
            a.lce r0 = (a.lce) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            a.lce r0 = new a.lce
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.k
            a.wne r1 = a.wne.f39444a
            int r2 = r0.m
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            a.z1x.P(r7)
            return r7
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L31:
            boolean r8 = r0.j
            int r6 = r0.i
            a.z1x.P(r7)
            goto L50
        L39:
            a.z1x.P(r7)
            r7 = 0
            if (r8 == 0) goto L54
            java.lang.Object r2 = r5.b
            a.b3c0 r2 = (a.b3c0) r2
            r0.i = r6
            r0.j = r8
            r0.m = r4
            java.lang.Object r7 = r2.a(r7, r0)
            if (r7 != r1) goto L50
            goto L64
        L50:
            a.m2c0 r7 = (a.m2c0) r7
            boolean r7 = r7.I
        L54:
            java.lang.Object r5 = r5.f40764a
            a.c5k r5 = (a.c5k) r5
            r0.i = r6
            r0.j = r8
            r0.m = r3
            java.lang.Object r5 = r5.g(r6, r0, r7)
            if (r5 != r1) goto L65
        L64:
            return r1
        L65:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xex.C(int, a.zje, boolean):java.lang.Object");
    }

    public InputMethodManager D() {
        return (InputMethodManager) ((a8z) this.b).getValue();
    }

    public x680 E(kzv kzvVar, boolean z) {
        String str = kzvVar.l;
        if (str.length() > 0 && z && kzvVar.b == q4f.c) {
            return new x680("OPTION_COEF_ID", ((ctf0) this.f40764a).b.a(R.string.optional_coef, Arrays.copyOf(new Object[0], 0)), new auy(str));
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:82|24|78|25|26|27|80|28|(1:31)) */
    /* JADX WARN: Code duplicated, block: B:31:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:44:0x0111 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0113  */
    /* JADX WARN: Code duplicated, block: B:46:0x011b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0122  */
    /* JADX WARN: Code duplicated, block: B:49:0x0124  */
    /* JADX WARN: Code duplicated, block: B:52:0x0129  */
    /* JADX WARN: Code duplicated, block: B:55:0x0143  */
    /* JADX WARN: Code duplicated, block: B:56:0x014b  */
    /* JADX WARN: Code duplicated, block: B:57:0x014e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0154  */
    /* JADX WARN: Code duplicated, block: B:61:0x015b  */
    /* JADX WARN: Code duplicated, block: B:62:0x015d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0162  */
    /* JADX WARN: Code duplicated, block: B:69:0x017f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0189  */
    /* JADX WARN: Code duplicated, block: B:72:0x018f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x0191  */
    /* JADX WARN: Code duplicated, block: B:75:0x0197  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:82:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f9, code lost:
    
        r17 = r3;
        r21 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fd, code lost:
    
        r3 = r17;
        r5 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0102, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0104, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0179, code lost:
    
        if (a.qcc.P(r11, r5) == r4) goto L67;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0113 -> B:23:0x00a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0179 -> B:70:0x0187). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x017f -> B:70:0x0187). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0189 -> B:68:0x017c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object F(java.lang.String r25, a.zje r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xex.F(java.lang.String, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object H(yje yjeVar) {
        oyb oybVar;
        boolean zA;
        if (yjeVar instanceof oyb) {
            oybVar = (oyb) yjeVar;
            int i = oybVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                oybVar.k = i - Integer.MIN_VALUE;
            } else {
                oybVar = new oyb(this, yjeVar);
            }
        } else {
            oybVar = new oyb(this, yjeVar);
        }
        Object objB = oybVar.i;
        Object obj = wne.f39444a;
        int i2 = oybVar.k;
        if (i2 == 0) {
            z1x.P(objB);
            if (((iqt) this.f40764a).f15225a.a()) {
                ahu ahuVar = (ahu) this.b;
                oybVar.k = 1;
                objB = ahuVar.b(bm5.f2822a, oybVar);
                if (objB == obj) {
                    return obj;
                }
            } else {
                zA = false;
            }
            return Boolean.valueOf(zA);
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objB);
        zA = ((ql5) objB).i.a();
        return Boolean.valueOf(zA);
    }

    public Object I(mlr mlrVar, int i, String str, bnn0 bnn0Var) {
        Object objD0;
        khf0 khf0Var = (khf0) this.f40764a;
        lu0 lu0VarG = ((uyn) this.b).g(str);
        if (!((m1e) khf0Var.d).c() || (objD0 = qjj.d0(((mne) khf0Var.c).b, new fs((Object) khf0Var, (Serializable) mlrVar, i, (Object) lu0VarG, (yje) null, (byte) 0), bnn0Var)) != wne.f39444a) {
            objD0 = Unit.f46060a;
        }
        return objD0 == wne.f39444a ? objD0 : Unit.f46060a;
    }

    public void J() {
        f8w f8wVar = f8w.f9129a;
        ((o470) this.b).h(iun.f15405a);
        ((j77) ((dpi0) ((r7v) this.f40764a).f29996a).f6468a).f16027a.clear();
    }

    public void K(xj xjVar) {
        z220 z220Var = (z220) this.f40764a;
        ((ActionMode.Callback) z220Var.b).onDestroyActionMode(z220Var.i(xjVar));
        pd3 pd3Var = (pd3) this.b;
        if (pd3Var.v != null) {
            pd3Var.l.getDecorView().removeCallbacks(pd3Var.w);
        }
        if (pd3Var.u != null) {
            zju0 zju0Var = pd3Var.x;
            if (zju0Var != null) {
                zju0Var.b();
            }
            zju0 zju0VarA = rgu0.a(pd3Var.u);
            zju0VarA.a(0.0f);
            pd3Var.x = zju0VarA;
            zju0VarA.d(new jd3(this, (byte) 2));
        }
        pd3Var.t = null;
        ViewGroup viewGroup = pd3Var.z;
        WeakHashMap weakHashMap = rgu0.f30456a;
        viewGroup.requestApplyInsets();
        pd3Var.Z();
    }

    public boolean L(xj xjVar, Menu menu) {
        ViewGroup viewGroup = ((pd3) this.b).z;
        WeakHashMap weakHashMap = rgu0.f30456a;
        viewGroup.requestApplyInsets();
        z220 z220Var = (z220) this.f40764a;
        ActionMode.Callback callback = (ActionMode.Callback) z220Var.b;
        pin0 pin0VarI = z220Var.i(xjVar);
        nuj0 nuj0Var = (nuj0) z220Var.e;
        Menu k340Var = (Menu) nuj0Var.get(menu);
        if (k340Var == null) {
            k340Var = new k340((Context) z220Var.c, (ox30) menu);
            nuj0Var.put(menu, k340Var);
        }
        return callback.onPrepareActionMode(pin0VarI, k340Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object M(String str, String str2, String str3, zje zjeVar) {
        owf owfVar;
        if (zjeVar instanceof owf) {
            owfVar = (owf) zjeVar;
            int i = owfVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                owfVar.k = i - Integer.MIN_VALUE;
            } else {
                owfVar = new owf(this, zjeVar);
            }
        } else {
            owfVar = new owf(this, zjeVar);
        }
        Object objA = owfVar.i;
        wne wneVar = wne.f39444a;
        int i2 = owfVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            psc pscVar = (psc) this.f40764a;
            owfVar.k = 1;
            objA = ((mwf) ((sza) pscVar.b).invoke()).a(str, str2, str3, owfVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        String str4 = ((lb5) ((dx5) objA).a()).f19739a;
        if (str4 == null) {
            str4 = "";
        }
        nwf nwfVar = (nwf) this.b;
        nwfVar.getClass();
        nwfVar.f24230a = str4;
        return Unit.f46060a;
    }

    public void N(p39 p39Var, v39 v39Var, long j, long j2, long j3) {
        vd1 vd1Var = (vd1) this.f40764a;
        String str = v39Var.f36722a;
        String str2 = p39Var.f26289a;
        vd1Var.getClass();
        kt2 kt2Var = vd1Var.f37210a;
        jo20 jo20Var = new jo20();
        jo20Var.put("sport_id", Long.valueOf(j));
        if (j == 40) {
            jo20Var.put("sub_sport_id", Long.valueOf(j2));
        }
        jo20Var.put("game_id", Long.valueOf(j3));
        jo20Var.put("option", str);
        jo20Var.put("action", str2);
        kt2Var.a("broadcast_player_click", jo20Var.b());
        ik4 ik4Var = (ik4) this.b;
        ik4Var.getClass();
        s1p s1pVar = ik4Var.f14907a;
        yni0 yni0Var = new yni0();
        yni0Var.add(new i1p((byte) 2, j));
        if (j == 40) {
            yni0Var.add(new i1p((byte) 0, j2));
        }
        yni0Var.add(new i1p((byte) 1, j3));
        yni0Var.add(new j1p(str, (byte) 0));
        yni0Var.add(new j1p(str2, (byte) 1));
        s1pVar.a(cui0.a(yni0Var), 12384L);
    }

    public void O(long j, long j2, long j3, v39 v39Var, long j4) {
        String str = v39Var.f36722a;
        String strValueOf = String.valueOf(j4);
        vd1 vd1Var = (vd1) this.f40764a;
        vd1Var.getClass();
        strValueOf.getClass();
        kt2 kt2Var = vd1Var.f37210a;
        jo20 jo20Var = new jo20();
        jo20Var.put("sport_id", Long.valueOf(j));
        if (j == 40) {
            jo20Var.put("sub_sport_id", Long.valueOf(j2));
        }
        jo20Var.put("game_id", Long.valueOf(j3));
        jo20Var.put("option", str);
        jo20Var.put("point", strValueOf);
        kt2Var.a("broadcast_watch_time", jo20Var.b());
        ik4 ik4Var = (ik4) this.b;
        ik4Var.getClass();
        s1p s1pVar = ik4Var.f14907a;
        yni0 yni0Var = new yni0();
        yni0Var.add(new i1p((byte) 2, j));
        if (j == 40) {
            yni0Var.add(new i1p((byte) 0, j2));
        }
        yni0Var.add(new i1p((byte) 1, j3));
        yni0Var.add(new j1p(str, (byte) 0));
        yni0Var.add(new j1p(strValueOf, (byte) 1));
        s1pVar.a(cui0.a(yni0Var), 12382L);
    }

    public synchronized void P(int i, int i2, long j, long j2) {
        AtomicLong atomicLong = (AtomicLong) this.b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = atomicLong.get();
        StringBuilder sb = new StringBuilder(String.valueOf(j3).length() + 14);
        sb.append("shouldSendLog ");
        sb.append(j3);
        Log.i("AdvertisingIdClient", sb.toString());
        if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        ((mmx) this.f40764a).c(new TelemetryData(0, Arrays.asList(new MethodInvocation(35401, i, 0, 0, i2, j, j2, null, null)))).addOnFailureListener(new hac((Object) this, jElapsedRealtime, (byte) 6));
    }

    @Override // a.nhi0
    public jiy a(sgy sgyVar) {
        Object obj = ((emc) this.b).get(azw.G(sgyVar));
        obj.getClass();
        oz40 oz40Var = (oz40) obj;
        Object qi9Var = oz40Var.f26088a.get();
        if (qi9Var == null) {
            synchronized (oz40Var) {
                qi9Var = oz40Var.f26088a.get();
                if (qi9Var == null) {
                    qi9Var = new qi9((jiy) ((Function1) this.f40764a).invoke(sgyVar));
                    oz40Var.f26088a = new SoftReference(qi9Var);
                }
            }
        }
        return ((qi9) qi9Var).f28780a;
    }

    @Override // a.b4w0
    public jzj b(float f, pot0 pot0Var) {
        pot0Var.getClass();
        float fK = k();
        if (f > c() || fK > f) {
            jf4.o("Failed requirement.");
            return null;
        }
        LinkedHashMap linkedHashMapH = xp20.h(new Pair(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(f)));
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b1a b1aVar = c1a.a0;
            c1a c1aVar = ((l1a) this.f40764a).b;
            b1aVar.getClass();
            c1aVar.getClass();
            if (i >= 34) {
                CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES;
                key.getClass();
                int[] iArr = (int[]) ((ow9) c1aVar).c(key);
                if (iArr != null && tx3.w(iArr, 1)) {
                    linkedHashMapH.put(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1);
                }
            }
        }
        return pot0.c(pot0Var, linkedHashMapH);
    }

    @Override // a.b4w0
    public float c() {
        Object upper = ((Range) this.b).getUpper();
        upper.getClass();
        return ((Number) upper).floatValue();
    }

    @Override // a.zjj
    public Object d(wm40 wm40Var, Object obj) {
        return null;
    }

    @Override // a.zjj
    public Object e(t5 t5Var, Object obj) {
        return null;
    }

    @Override // a.zjj
    public Object f(f0d0 f0d0Var, Object obj) {
        int i;
        ihy ihyVar = (ihy) this.b;
        ((Unit) obj).getClass();
        List listW = f0d0Var.W();
        listW.getClass();
        if (listW.isEmpty()) {
            i = (f0d0Var.u != null ? 1 : 0) + (f0d0Var.v != null ? 1 : 0);
        } else {
            i = -1;
        }
        if (f0d0Var.g) {
            if (i == -1) {
                return new yck(ihyVar, f0d0Var, rgy.k);
            }
            if (i == 0) {
                return new sck(ihyVar, f0d0Var, rgy.k);
            }
            if (i == 1) {
                return new uck(ihyVar, f0d0Var, rgy.k);
            }
            if (i == 2) {
                return new wck(ihyVar, f0d0Var, rgy.k);
            }
        } else {
            if (i == -1) {
                return new tdk(ihyVar, f0d0Var, rgy.k);
            }
            if (i == 0) {
                return new kdk(ihyVar, f0d0Var, rgy.k);
            }
            if (i == 1) {
                return new ndk(ihyVar, f0d0Var, rgy.k);
            }
            if (i == 2) {
                return new qdk(ihyVar, f0d0Var, rgy.k);
            }
        }
        ohq.u(f0d0Var, "Unsupported property: ");
        return null;
    }

    @Override // a.zjj
    public Object g(ng80 ng80Var, Object obj) {
        return null;
    }

    @Override // a.xo80
    public Object h(sgy sgyVar, ArrayList arrayList) {
        Object g0g0Var;
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
        Class clsG = azw.G(sgyVar);
        Object wo80Var = concurrentHashMap.get(clsG);
        if (wo80Var == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsG, (wo80Var = new wo80()))) != null) {
            wo80Var = objPutIfAbsent;
        }
        wo80 wo80Var2 = (wo80) wo80Var;
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new tiy((kiy) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = wo80Var2.f39481a;
        Object obj = concurrentHashMap2.get(arrayList2);
        if (obj == null) {
            try {
                e0g0 e0g0Var = j0g0.b;
                g0g0Var = (jiy) ((Function2) this.f40764a).invoke(sgyVar, arrayList);
            } catch (Throwable th) {
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
            j0g0 j0g0Var = new j0g0(g0g0Var);
            Object objPutIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList2, j0g0Var);
            obj = objPutIfAbsent2 == null ? j0g0Var : objPutIfAbsent2;
        }
        return ((j0g0) obj).f15681a;
    }

    @Override // a.b4w0
    public jzj i(pot0 pot0Var) {
        pot0Var.getClass();
        CaptureRequest.Key key = CaptureRequest.CONTROL_ZOOM_RATIO;
        key.getClass();
        ArrayList arrayListL = q3d.l(key);
        if (Build.VERSION.SDK_INT >= 34) {
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_SETTINGS_OVERRIDE;
            key2.getClass();
            arrayListL.add(key2);
        }
        oot0 oot0Var = oot0.f25610a;
        return pot0Var.j(arrayListL);
    }

    @Override // a.zjj
    public Object j(mer merVar, Object obj) {
        ((Unit) obj).getClass();
        return new qck((ihy) this.f40764a, merVar);
    }

    @Override // a.b4w0
    public float k() {
        Object lower = ((Range) this.b).getLower();
        lower.getClass();
        return ((Number) lower).floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:210:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:218:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:220:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:222:0x0415  */
    /* JADX WARN: Code duplicated, block: B:223:0x041b  */
    /* JADX WARN: Code duplicated, block: B:226:0x0459  */
    /* JADX WARN: Code duplicated, block: B:228:0x0472  */
    /* JADX WARN: Code duplicated, block: B:236:0x049e  */
    /* JADX WARN: Code duplicated, block: B:238:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:239:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:241:0x04af  */
    /* JADX WARN: Code duplicated, block: B:242:0x04b8  */
    /* JADX WARN: Multi-variable type inference failed */
    public void l(CyberBottomSheetParams cyberBottomSheetParams, i3m i3mVar, d9z d9zVar, l7m0 l7m0Var, boolean z, boolean z2, boolean z3, boolean z4, fet fetVar, int i) {
        int i2;
        Object obj;
        byte b;
        Object obj2;
        pz40 pz40Var;
        int i3;
        byte b2;
        boolean z5;
        Object ic1Var;
        Object obj3;
        int i4;
        boolean z6;
        Float f;
        boolean z7;
        boolean z8;
        Float fValueOf;
        Float fValueOf2;
        Object objP;
        Object obj4;
        y3m y3mVar;
        d9zVar.getClass();
        l7m0Var.getClass();
        fetVar.g0(851253328);
        int i5 = i & 6;
        Object obj5 = jm40.b;
        if (i5 == 0) {
            i2 = (fetVar.g(obj5) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(cyberBottomSheetParams) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(i3mVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(d9zVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.h(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.h(z2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.h(z3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= fetVar.h(z4) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= fetVar.g(this) ? 536870912 : 268435456;
        }
        if (fetVar.U(i2 & 1, (i2 & 306783379) != 306783378)) {
            View view = (View) fetVar.k(dy2.f);
            view.getClass();
            Fragment fragmentH = androidx.fragment.app.e.H(view);
            Object objP2 = fetVar.P();
            Object obj6 = ukd.f35823a;
            Object obj7 = objP2;
            if (objP2 == obj6) {
                ComponentCallbacks2 componentCallbacks2I = vqd.i(fragmentH);
                af3 af3Var = componentCallbacks2I instanceof af3 ? (af3) componentCallbacks2I : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(v2g.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof v2g)) {
                        ze3Var = null;
                    }
                    v2g v2gVar = (v2g) ze3Var;
                    if (v2gVar != null) {
                        Fragment fragment = fragmentH;
                        while (true) {
                            if (fragment == 0) {
                                jf4.n("Can't find feature provider!");
                                return;
                            } else {
                                if (fragment instanceof drs) {
                                    Object udiVar = new udi(v2gVar.f36679a, ((drs) fragment).q());
                                    fetVar.o0(udiVar);
                                    obj7 = udiVar;
                                    break;
                                }
                                fragment = fragment.y;
                            }
                        }
                    }
                }
                jf4.n(b1j.i(v2g.class, "Cannot create dependency "));
                return;
            }
            q0h0 q0h0Var = new q0h0((tdi) ((udi) obj7).c.get());
            sgy sgyVarB = sre0.f32672a.b(j3g.class);
            int i6 = j3g.r;
            i3t0 i3t0Var = (i3t0) n4c.X(sgyVarB, null, q0h0Var, fetVar, 14);
            pz40 pz40VarY = i3t0Var.y(fetVar);
            nwd nwdVar = (nwd) this.f40764a;
            jtv jtvVar = (jtv) this.b;
            boolean zI = fetVar.i(i3t0Var);
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj6) {
                Object ui6Var = new ui6(i3t0Var, (byte) 1);
                fetVar.o0(ui6Var);
                obj = ui6Var;
            } else {
                obj = objP3;
            }
            Function0 function0 = (Function0) obj;
            v0h0 v0h0Var = e3g.f7133a;
            pz40VarY.getClass();
            grs grsVar = cyberBottomSheetParams.h;
            function0.getClass();
            pz40 pz40VarF = androidx.compose.runtime.e.f(Boolean.valueOf(z2), fetVar);
            pz40 pz40VarF2 = androidx.compose.runtime.e.f(Boolean.valueOf(z3), fetVar);
            Object[] objArr = new Object[0];
            v0h0 v0h0Var2 = e3g.f7133a;
            Object objP4 = fetVar.P();
            Object obj8 = objP4;
            if (objP4 == obj6) {
                Object dpfVar = new dpf((byte) 17);
                fetVar.o0(dpfVar);
                obj8 = dpfVar;
            }
            upj0 upj0Var = (upj0) e9x.R(objArr, v0h0Var2, (Function0) obj8, fetVar, 384);
            Object objP5 = fetVar.P();
            Object obj9 = objP5;
            if (objP5 == obj6) {
                Object obj10 = upj0Var.f36068a;
                fetVar.o0(obj10);
                obj9 = obj10;
            }
            f3g f3gVar = (f3g) obj9;
            Object objP6 = fetVar.P();
            Object obj11 = objP6;
            if (objP6 == obj6) {
                Object objE = androidx.compose.runtime.e.e(f3gVar != null ? f3gVar.f8861a : null);
                fetVar.o0(objE);
                obj11 = objE;
            }
            pz40 pz40Var2 = (pz40) obj11;
            if (((y3m) pz40Var2.getValue()) == null && z) {
                boolean z9 = ((h3g) pz40VarY.getValue()).c && z3;
                grsVar.getClass();
                boolean z10 = z9;
                if (grsVar == grs.f11797a) {
                    y3mVar = y3m.c;
                } else if (z10 && z2) {
                    y3mVar = y3m.f41958a;
                } else if (z10 || z4) {
                    y3mVar = y3m.b;
                } else {
                    y3mVar = z2 ? y3m.f41958a : y3m.c;
                }
                pz40Var2.setValue(y3mVar);
            }
            y3m y3mVar2 = (y3m) pz40Var2.getValue();
            if (y3mVar2 == null) {
                y3mVar2 = y3m.f41958a;
            }
            x3m x3mVarC = w3m.c(y3mVar2, fetVar, 0);
            Object objP7 = fetVar.P();
            Object objJ = objP7;
            if (objP7 == obj6) {
                objJ = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objJ;
            y3m y3mVar3 = (y3m) pz40Var2.getValue();
            boolean zG = fetVar.g(x3mVarC) | fetVar.i(upj0Var);
            int i7 = i2;
            Object objP8 = fetVar.P();
            Object obj12 = objP8;
            if (zG || objP8 == obj6) {
                Object fzeVar = new fze(pz40Var2, x3mVarC, upj0Var, (yje) null);
                fetVar.o0(fzeVar);
                obj12 = fzeVar;
            }
            m0x0.v(x3mVarC, y3mVar3, (Function2) obj12, fetVar);
            pz40 pz40VarD = vcc.D(gy40Var, fetVar);
            Object[] objArr2 = new Object[0];
            Object objP9 = fetVar.P();
            Object obj13 = objP9;
            if (objP9 == obj6) {
                Object dpfVar2 = new dpf((byte) 18);
                fetVar.o0(dpfVar2);
                obj13 = dpfVar2;
            }
            pz40 pz40Var3 = (pz40) e9x.Q(objArr2, (Function0) obj13, fetVar, 48);
            Boolean bool = (Boolean) pz40VarD.getValue();
            bool.getClass();
            boolean zG2 = fetVar.g(pz40VarD) | fetVar.g(pz40Var3);
            Object objP10 = fetVar.P();
            if (zG2 || objP10 == obj6) {
                b = 0;
                Object z2gVar = new z2g(pz40Var3, pz40VarD, null, b);
                fetVar.o0(z2gVar);
                obj2 = z2gVar;
            } else {
                b = 0;
                obj2 = objP10;
            }
            m0x0.t(fetVar, bool, (Function2) obj2);
            boolean z11 = (f3gVar == null && grsVar == grs.f11797a) ? 1 : b;
            Object[] objArr3 = {x3mVarC, pz40VarY, pz40VarF, pz40VarF2, pz40Var3};
            int i8 = (((((((fetVar.i(f3gVar) ? 1 : 0) | (fetVar.g(pz40VarY) ? 1 : 0)) | (fetVar.g(pz40VarF) ? 1 : 0) ? 1 : 0) | (fetVar.g(pz40VarF2) ? 1 : 0)) | (fetVar.h(z11) ? 1 : 0) ? 1 : 0) | (fetVar.g(x3mVarC) ? 1 : 0)) | (fetVar.g(pz40Var3) ? 1 : 0) ? 1 : 0) | (((((i7 & 234881024) ^ 100663296) <= 67108864 || !fetVar.h(z4)) && (i7 & 100663296) != 67108864) ? b : (byte) 1);
            Object objP11 = fetVar.P();
            if (i8 != 0 || objP11 == obj6) {
                pz40Var = pz40VarY;
                objP11 = new c3g(f3gVar, pz40Var, pz40VarF, pz40VarF2, z11, x3mVarC, pz40Var3, z4, pz40Var2, null);
                fetVar.o0(objP11);
            } else {
                pz40Var = pz40VarY;
            }
            m0x0.w(objArr3, (Function2) objP11, fetVar);
            Object objP12 = fetVar.P();
            Object obj14 = objP12;
            if (objP12 == obj6) {
                Object objI = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objI);
                obj14 = objI;
            }
            Object obj15 = (vne) obj14;
            Object[] objArr4 = {d9zVar, l7m0Var, x3mVarC, obj15};
            if (((i7 & 57344) ^ 24576) <= 16384 || !fetVar.g(l7m0Var)) {
                i3 = i7;
                if ((i3 & 24576) != 16384) {
                    b2 = b;
                }
                z5 = (((b2 | (((((i3 & 7168) ^ 3072) > 2048 || !fetVar.g(d9zVar)) && (i3 & 3072) != 2048) ? b : (byte) 1)) | (fetVar.g(x3mVarC) ? 1 : 0)) == true ? 1 : 0) | (fetVar.i(obj15) ? 1 : 0);
                Object objP13 = fetVar.P();
                if (z5 == 0 || objP13 == obj6) {
                    obj3 = obj6;
                    i4 = i3;
                    z6 = true;
                    f = null;
                    ic1Var = new ic1((Object) l7m0Var, (Object) d9zVar, (Object) x3mVarC, obj15, (yje) null, (byte) 19);
                    fetVar.o0(ic1Var);
                } else {
                    i4 = i3;
                    obj3 = obj6;
                    z6 = true;
                    f = null;
                    ic1Var = objP13;
                }
                m0x0.w(objArr4, (Function2) ic1Var, fetVar);
                if (z || ((h3g) pz40Var.getValue()).b == w2g.f38445a) {
                    z7 = b;
                } else {
                    z7 = z6;
                }
                if (z7 != 0) {
                    fetVar.e0(1082424455);
                    n0q n0qVar = o7k0.c;
                    tj30 tj30VarC = zq8.c(gqw0.h, b);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    mm40 mm40VarQ = i120.Q(o7k0.d(obj5, 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
                    Unit unit = Unit.f46060a;
                    objP = fetVar.P();
                    obj4 = objP;
                    if (objP == obj3) {
                        Object obj16 = i54.i;
                        fetVar.o0(obj16);
                        obj4 = obj16;
                    }
                    zq8.a(b, fetVar, knm0.s(b, fetVar, fnn0.a(mm40VarQ, unit, (PointerInputEventHandler) obj4)));
                    fetVar.r(z6);
                    fetVar.r(b);
                } else {
                    fetVar.e0(1083241305);
                    fetVar.r(b);
                }
                mm40 mm40VarS = knm0.s(i4 & 14, fetVar, r35);
                if (((Boolean) l7m0Var.getValue()).booleanValue() || !((((h3g) pz40Var.getValue()).c && z3) || z4)) {
                    z8 = b;
                } else {
                    z8 = z6;
                }
                if (f3gVar != null) {
                    fValueOf = Float.valueOf(f3gVar.b);
                } else {
                    fValueOf = f;
                }
                if (f3gVar != null) {
                    fValueOf2 = Float.valueOf(f3gVar.c);
                } else {
                    fValueOf2 = f;
                }
                w3m.a(mm40VarS, x3mVarC, i3mVar, gy40Var, z8, z7, fValueOf, fValueOf2, ((h3g) pz40Var.getValue()).f12383a, function0, u1c.M(-543501310, new t39(pz40Var, nwdVar, fragmentH, cyberBottomSheetParams, x3mVarC, jtvVar), fetVar), fetVar, i4 & 896);
            } else {
                i3 = i7;
            }
            b2 = 1;
            z5 = (((b2 | (((((i3 & 7168) ^ 3072) > 2048 || !fetVar.g(d9zVar)) && (i3 & 3072) != 2048) ? b : (byte) 1)) | (fetVar.g(x3mVarC) ? 1 : 0)) == true ? 1 : 0) | (fetVar.i(obj15) ? 1 : 0);
            Object objP14 = fetVar.P();
            if (z5 == 0) {
                obj3 = obj6;
                i4 = i3;
                z6 = true;
                f = null;
                ic1Var = new ic1((Object) l7m0Var, (Object) d9zVar, (Object) x3mVarC, obj15, (yje) null, (byte) 19);
                fetVar.o0(ic1Var);
            } else {
                obj3 = obj6;
                i4 = i3;
                z6 = true;
                f = null;
                ic1Var = new ic1((Object) l7m0Var, (Object) d9zVar, (Object) x3mVarC, obj15, (yje) null, (byte) 19);
                fetVar.o0(ic1Var);
            }
            m0x0.w(objArr4, (Function2) ic1Var, fetVar);
            if (z) {
                z7 = b;
            } else {
                z7 = b;
            }
            if (z7 != 0) {
                fetVar.e0(1082424455);
                n0q n0qVar2 = o7k0.c;
                tj30 tj30VarC2 = zq8.c(gqw0.h, b);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, n0qVar2);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC2, gqw0.x);
                jpm0.o(fetVar, bh90VarM2, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode2), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC1, gqw0.v);
                mm40 mm40VarQ2 = i120.Q(o7k0.d(obj5, 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
                Unit unit2 = Unit.f46060a;
                objP = fetVar.P();
                obj4 = objP;
                if (objP == obj3) {
                    Object obj17 = i54.i;
                    fetVar.o0(obj17);
                    obj4 = obj17;
                }
                zq8.a(b, fetVar, knm0.s(b, fetVar, fnn0.a(mm40VarQ2, unit2, (PointerInputEventHandler) obj4)));
                fetVar.r(z6);
                fetVar.r(b);
            } else {
                fetVar.e0(1083241305);
                fetVar.r(b);
            }
            mm40 mm40VarS2 = knm0.s(i4 & 14, fetVar, r35);
            if (((Boolean) l7m0Var.getValue()).booleanValue()) {
                z8 = b;
            } else {
                z8 = b;
            }
            if (f3gVar != null) {
                fValueOf = Float.valueOf(f3gVar.b);
            } else {
                fValueOf = f;
            }
            if (f3gVar != null) {
                fValueOf2 = Float.valueOf(f3gVar.c);
            } else {
                fValueOf2 = f;
            }
            w3m.a(mm40VarS2, x3mVarC, i3mVar, gy40Var, z8, z7, fValueOf, fValueOf2, ((h3g) pz40Var.getValue()).f12383a, function0, u1c.M(-543501310, new t39(pz40Var, nwdVar, fragmentH, cyberBottomSheetParams, x3mVarC, jtvVar), fetVar), fetVar, i4 & 896);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new oa2(this, cyberBottomSheetParams, i3mVar, d9zVar, l7m0Var, z, z2, z3, z4, i);
        }
    }

    @Override // a.zjj
    public Object m(c8z c8zVar, Object obj) {
        return null;
    }

    @Override // a.zjj
    public Object n(tfk tfkVar, Object obj) {
        return null;
    }

    @Override // a.zjj
    public Object o(zm40 zm40Var, Object obj) {
        return null;
    }

    @Override // a.zjj
    public Object p(flc flcVar, Object obj) {
        return j(flcVar, obj);
    }

    @Override // a.zjj
    public Object q(k3u0 k3u0Var, Object obj) {
        return null;
    }

    @Override // a.b4w0
    public Rect r() {
        c1a c1aVar = ((l1a) this.f40764a).b;
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        key.getClass();
        Object objC = ((ow9) c1aVar).c(key);
        objC.getClass();
        return (Rect) objC;
    }

    @Override // a.zjj
    public Object s(g0d0 g0d0Var, Object obj) {
        return j(g0d0Var, obj);
    }

    @Override // a.zjj
    public Object t(n0d0 n0d0Var, Object obj) {
        return j(n0d0Var, obj);
    }

    @Override // a.zjj
    public Object u(gdz gdzVar, Object obj) {
        return null;
    }

    public void v(tkj tkjVar) {
        synchronized (tkjVar) {
        }
        Handler handler = (Handler) this.f40764a;
        if (handler != null) {
            handler.post(new fy2(this, tkjVar, (byte) 8));
        }
    }

    public x680 w(kzv kzvVar) {
        double d2 = kzvVar.V;
        if (d2 == 0.0d || kzvVar.U != 0.0d) {
            return null;
        }
        String strA = ((ctf0) this.f40764a).b.a(R.string.advance, Arrays.copyOf(new Object[0], 0));
        pn40 pn40Var = pn40.f27267a;
        String strC = pn40.c(d2, p3u0.c);
        String str = (String) this.b;
        pz40 pz40Var = s6t0.f31722a;
        return new x680("ADVANCE_BET_ID", strA, new wty(strC, str, s6t0.b().f33626a.getTextPrimary()));
    }

    public x680 x(kzv kzvVar) {
        double d2 = kzvVar.w;
        if (d2 == -1.0d) {
            return null;
        }
        String strA = ((ctf0) this.f40764a).b.a(R.string.advance_close_no_dots, Arrays.copyOf(new Object[0], 0));
        pn40 pn40Var = pn40.f27267a;
        String strC = pn40.c(d2, p3u0.c);
        String str = (String) this.b;
        pz40 pz40Var = s6t0.f31722a;
        return new x680("ADVANCE_CLOSED_BET_ID", strA, new wty(strC, str, s6t0.b().f33626a.getTextPrimary()));
    }

    public x680 y(kzv kzvVar) {
        double d2 = kzvVar.U;
        if (d2 == 0.0d || kzvVar.g != i0w.e) {
            return null;
        }
        String strA = ((ctf0) this.f40764a).b.a(R.string.advance_conf_bet_no_colon, Arrays.copyOf(new Object[0], 0));
        pn40 pn40Var = pn40.f27267a;
        String strC = pn40.c(d2, p3u0.c);
        String str = (String) this.b;
        pz40 pz40Var = s6t0.f31722a;
        return new x680("ADVANCE_PAID_BET_ID", strA, new wty(strC, str, s6t0.b().f33626a.getTextPrimary()));
    }

    public x680 z(kzv kzvVar) {
        if (!kzvVar.x) {
            return null;
        }
        String strA = ((ctf0) this.f40764a).b.a(R.string.history_auto_sale, Arrays.copyOf(new Object[0], 0));
        pn40 pn40Var = pn40.f27267a;
        String strC = pn40.c(kzvVar.y, p3u0.c);
        String str = (String) this.b;
        pz40 pz40Var = s6t0.f31722a;
        return new x680("AUTO_SALE_ID", strA, new wty(strC, str, s6t0.b().f33626a.getTextPrimary()));
    }

    public xex(psc pscVar, nwf nwfVar) {
        nwfVar.getClass();
        this.f40764a = pscVar;
        this.b = nwfVar;
    }

    public xex(vd1 vd1Var, ik4 ik4Var) {
        vd1Var.getClass();
        ik4Var.getClass();
        this.f40764a = vd1Var;
        this.b = ik4Var;
    }

    public xex(mne mneVar, ie5 ie5Var) {
        ie5Var.getClass();
        this.f40764a = mneVar;
        this.b = ie5Var;
    }

    public /* synthetic */ xex(Object obj, Object obj2) {
        this.f40764a = obj;
        this.b = obj2;
    }

    public xex(Function1 function1) {
        this.f40764a = function1;
        this.b = new emc();
    }

    public xex(View view) {
        this.f40764a = view;
        this.b = maz.a(wez.b, new y2x(this, (byte) 6));
    }

    public xex(Function2 function2) {
        this.f40764a = function2;
        this.b = new ConcurrentHashMap();
    }

    public xex(ihy ihyVar) {
        ihyVar.getClass();
        ihyVar.getClass();
        this.f40764a = ihyVar;
        this.b = ihyVar;
    }
}
