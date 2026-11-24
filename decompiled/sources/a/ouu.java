package a;

import android.content.pm.PackageManager;
import android.gov.nist.core.Separators;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.MutableIntList;
import androidx.media3.ui.PlayerControlView;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.yandex.authsdk.YandexAuthOptions;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes5.dex */
public final class ouu implements bfr, bv3, cfr {
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25895a;
    public final Object b;
    public final Object c;
    public Object d;

    public ouu(qo8 qo8Var, ubu0 ubu0Var, rg40 rg40Var) {
        hm40 hm40Var;
        int i;
        int i2;
        this.f25895a = (byte) 11;
        this.d = qo8Var;
        this.b = new ArrayList();
        rg40 rg40Var2 = rg40Var;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            hm40Var = hm40.ECI;
            i = 1;
            if (rg40Var2 == null) {
                break;
            }
            int i5 = rg40Var2.c;
            int i6 = i3 + rg40Var2.d;
            rg40 rg40Var3 = rg40Var2.e;
            int i7 = i4;
            hm40 hm40Var2 = rg40Var2.f30415a;
            boolean z = (hm40Var2 == hm40.BYTE && rg40Var3 == null && i5 != 0) || !(rg40Var3 == null || i5 == rg40Var3.c);
            i = z ? 1 : i7;
            if (rg40Var3 == null || rg40Var3.f30415a != hm40Var2 || z) {
                ((ArrayList) this.b).add(0, new sg40(this, hm40Var2, rg40Var2.b, i5, i6));
                i2 = 0;
            } else {
                i2 = i6;
            }
            if (z) {
                ((ArrayList) this.b).add(0, new sg40(this, hm40Var, rg40Var2.b, rg40Var2.c, 0));
            }
            i4 = i;
            rg40Var2 = rg40Var3;
            i3 = i2;
        }
        int i8 = i4;
        boolean z2 = qo8Var.c;
        int i9 = qo8Var.b;
        if (z2) {
            sg40 sg40Var = (sg40) ((ArrayList) this.b).get(0);
            if (sg40Var != null && sg40Var.f32143a != hm40Var && i8 != 0) {
                ((ArrayList) this.b).add(0, new sg40(this, hm40Var, 0, 0, 0));
            }
            ((ArrayList) this.b).add(((sg40) ((ArrayList) this.b).get(0)).f32143a == hm40Var ? 1 : 0, new sg40(this, hm40.FNC1_FIRST_POSITION, 0, 0, 0));
        }
        int i10 = ubu0Var.f35401a;
        int i11 = 26;
        int iE = hne.E(i10 <= 9 ? 1 : i10 <= 26 ? 2 : 3);
        if (iE == 0) {
            i11 = 9;
        } else if (iE != 1) {
            i = 27;
            i11 = 40;
        } else {
            i = 10;
        }
        int iV = v(ubu0Var);
        while (i10 < i11 && !awn.c(iV, ubu0.c(i10), i9)) {
            i10++;
        }
        while (i10 > i && awn.c(iV, ubu0.c(i10 - 1), i9)) {
            i10--;
        }
        this.c = ubu0.c(i10);
    }

    public static Object k(Task task) throws IOException {
        try {
            return Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e2) {
            csj.c("SERVICE_NOT_AVAILABLE", e2);
            return null;
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e3);
        }
    }

    public static void o(ouu ouuVar, cb50 cb50Var, Function1 function1, int i) {
        boolean z = (i & 2) != 0;
        if ((i & 4) != 0) {
            function1 = new da40((byte) 27);
        }
        ouuVar.getClass();
        ouuVar.n(cb50Var, z);
        function1.invoke(ouuVar.M(cb50Var));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:12|13|116|22|(1:25)|61) */
    /* JADX WARN: Code duplicated, block: B:100:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:101:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:104:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:105:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:109:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:118:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0090  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:65:0x0111  */
    /* JADX WARN: Code duplicated, block: B:67:0x0117  */
    /* JADX WARN: Code duplicated, block: B:68:0x011c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0120  */
    /* JADX WARN: Code duplicated, block: B:73:0x0137  */
    /* JADX WARN: Code duplicated, block: B:75:0x0141  */
    /* JADX WARN: Code duplicated, block: B:78:0x0154  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0168  */
    /* JADX WARN: Code duplicated, block: B:83:0x016e  */
    /* JADX WARN: Code duplicated, block: B:87:0x017b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0180  */
    /* JADX WARN: Code duplicated, block: B:91:0x0185  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ac  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009a, code lost:
    
        r9 = r2;
        r10 = r12;
        r2 = r1;
        r1 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fa, code lost:
    
        if (a.qcc.O(3000, r1) == r3) goto L61;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x00fa -> B:13:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A(java.lang.String r18, a.zje r19) throws a.zhi0 {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ouu.A(java.lang.String, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x011e -> B:65:0x007a). Please report as a decompilation issue!!! */
    public Object B(int i, zje zjeVar, String str, boolean z) throws zhi0 {
        yfh0 yfh0Var;
        byte b;
        String str2;
        boolean z2;
        hl1 hl1Var;
        yfh0 yfh0Var2;
        int i2;
        boolean z3;
        ouu ouuVar;
        String str3;
        hl1 hl1Var2;
        byte b2;
        boolean z4;
        boolean z5;
        int i3;
        zhi0 th;
        boolean z6;
        boolean z7;
        Object g0g0Var;
        hl1 hl1Var3;
        ouu ouuVar2;
        byte b3;
        Serializable serializableI;
        if (zjeVar instanceof yfh0) {
            yfh0Var = (yfh0) zjeVar;
            int i4 = yfh0Var.r;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                yfh0Var.r = i4 - Integer.MIN_VALUE;
            } else {
                yfh0Var = new yfh0(this, zjeVar);
            }
        } else {
            yfh0Var = new yfh0(this, zjeVar);
        }
        Object obj = yfh0Var.p;
        Serializable serializable = wne.f39444a;
        int i5 = yfh0Var.r;
        try {
            if (i5 != 0) {
                if (i5 == 1) {
                    i3 = yfh0Var.m;
                    z5 = yfh0Var.o;
                    z4 = yfh0Var.n;
                    b3 = yfh0Var.l;
                    ouuVar2 = yfh0Var.k;
                    hl1Var3 = yfh0Var.j;
                    str3 = yfh0Var.i;
                    try {
                        z1x.P(obj);
                        b3 = b3;
                    } catch (Throwable th2) {
                        th = th2;
                        ouuVar = ouuVar2;
                        hl1Var2 = hl1Var3;
                        b2 = b3;
                        if (!z5) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        if (th instanceof CancellationException) {
                        }
                        throw th;
                    }
                } else {
                    if (i5 != 2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i6 = yfh0Var.m;
                    z2 = yfh0Var.o;
                    boolean z8 = yfh0Var.n;
                    byte b4 = yfh0Var.l;
                    ouu ouuVar3 = yfh0Var.k;
                    hl1 hl1Var4 = yfh0Var.j;
                    String str4 = yfh0Var.i;
                    z1x.P(obj);
                    i2 = i6;
                    yfh0Var2 = yfh0Var;
                    z3 = z8;
                    ouuVar = ouuVar3;
                    hl1Var = hl1Var4;
                    b = b4;
                    str2 = str4;
                }
                g0g0Var = (List) obj;
                e0g0 e0g0Var = j0g0.b;
                z1x.P(g0g0Var);
                return g0g0Var;
            }
            z1x.P(obj);
            b = i;
            str2 = str;
            z2 = z;
            hl1Var = ((pru) this.c).a().b;
            yfh0Var2 = yfh0Var;
            i2 = 0;
            z3 = z2;
            ouuVar = this;
        } catch (Throwable th3) {
            th = th3;
            String str5 = str2;
            z4 = z3;
            yfh0Var = yfh0Var2;
            str3 = str5;
            z5 = z2;
            b2 = b;
            i3 = i2;
            hl1Var2 = hl1Var;
            if (!z5 && (th instanceof zhi0) && th.e) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!(th instanceof CancellationException) || (th instanceof ConnectException) || z6) {
                throw th;
            }
            if (th instanceof zhi0) {
                zhi0 zhi0Var = th;
                if (zhi0Var.f || zhi0Var.e) {
                    z7 = true;
                } else {
                    z7 = false;
                }
            } else if (hic.C(th)) {
                z7 = false;
            } else {
                z7 = true;
            }
            int i7 = i3 + 1;
            if (i7 <= 3 && !z7) {
                System.out.println((Object) b1j.g(i7, "error (", "): ", th));
                yfh0Var.i = str3;
                yfh0Var.j = hl1Var2;
                yfh0Var.k = ouuVar;
                yfh0Var.l = b2;
                yfh0Var.n = z4;
                yfh0Var.o = z5;
                yfh0Var.m = i7;
                yfh0Var.r = 2;
                if (qcc.O(3000L, yfh0Var) != serializable) {
                    String str6 = str3;
                    yfh0Var2 = yfh0Var;
                    z3 = z4;
                    str2 = str6;
                    i2 = i7;
                    z2 = z5;
                    hl1Var = hl1Var2;
                    b = b2;
                    e0g0 e0g0Var2 = j0g0.b;
                    rpt rptVar = (rpt) ouuVar.b;
                    String strA = ((ntu) ouuVar.d).a();
                    boolean z9 = hl1Var.M;
                    yfh0Var2.i = str2;
                    yfh0Var2.j = hl1Var;
                    yfh0Var2.k = ouuVar;
                    yfh0Var2.l = b;
                    yfh0Var2.n = z3;
                    yfh0Var2.o = z2;
                    yfh0Var2.m = i2;
                    yfh0Var2.r = 1;
                    serializableI = rptVar.i(str2, strA, b, z9, yfh0Var2);
                    if (serializableI != serializable) {
                        String str7 = str2;
                        z4 = z3;
                        yfh0Var = yfh0Var2;
                        str3 = str7;
                        z5 = z2;
                        b3 = b;
                        i3 = i2;
                        hl1Var3 = hl1Var;
                        ouuVar2 = ouuVar;
                        obj = serializableI;
                        g0g0Var = (List) obj;
                        e0g0 e0g0Var3 = j0g0.b;
                    }
                }
                return serializable;
            }
            e0g0 e0g0Var4 = j0g0.b;
            g0g0Var = new g0g0(th);
            z1x.P(g0g0Var);
            return g0g0Var;
        }
        e0g0 e0g0Var5 = j0g0.b;
        rpt rptVar2 = (rpt) ouuVar.b;
        String strA2 = ((ntu) ouuVar.d).a();
        boolean z10 = hl1Var.M;
        yfh0Var2.i = str2;
        yfh0Var2.j = hl1Var;
        yfh0Var2.k = ouuVar;
        yfh0Var2.l = b;
        yfh0Var2.n = z3;
        yfh0Var2.o = z2;
        yfh0Var2.m = i2;
        yfh0Var2.r = 1;
        serializableI = rptVar2.i(str2, strA2, b, z10, yfh0Var2);
        if (serializableI != serializable) {
            String str8 = str2;
            z4 = z3;
            yfh0Var = yfh0Var2;
            str3 = str8;
            z5 = z2;
            b3 = b;
            i3 = i2;
            hl1Var3 = hl1Var;
            ouuVar2 = ouuVar;
            obj = serializableI;
            g0g0Var = (List) obj;
            e0g0 e0g0Var6 = j0g0.b;
            z1x.P(g0g0Var);
            return g0g0Var;
        }
        return serializable;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:12|13|66|77|22|23|79|24|(1:27)|64) */
    /* JADX WARN: Code duplicated, block: B:27:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:53:0x0113  */
    /* JADX WARN: Code duplicated, block: B:54:0x0115  */
    /* JADX WARN: Code duplicated, block: B:70:0x015e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0160  */
    /* JADX WARN: Code duplicated, block: B:74:0x0165  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d9, code lost:
    
        r10 = r6;
        r6 = r1;
        r1 = r4;
        r4 = r10;
        r11 = r2;
        r10 = r13;
        r2 = r18;
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e4, code lost:
    
        r18 = r2;
        r6 = r9;
        r2 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f6, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0105, code lost:
    
        if ((r0 instanceof a.zhi0) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0107, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010c, code lost:
    
        if (r9.f != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0113, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0115, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011b, code lost:
    
        if (a.hic.C(r0) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011e, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0120, code lost:
    
        if (r1 > 3) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0125, code lost:
    
        java.lang.System.out.println((java.lang.Object) a.b1j.g(r1, "error (", "): ", r0));
        r2.i = r13;
        r2.j = r11;
        r2.k = r6;
        r2.l = r10;
        r2.m = r4;
        r2.n = r1;
        r2.q = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0146, code lost:
    
        if (a.qcc.O(3000, r2) != r3) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0149, code lost:
    
        r9 = r4;
        r12 = r13;
        r4 = r1;
        r1 = r6;
        r13 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0153, code lost:
    
        r1 = a.j0g0.b;
        r1 = new a.g0g0(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [byte] */
    /* JADX WARN: Type inference failed for: r10v10, types: [byte] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v5, types: [byte, int] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r14v2, types: [a.dn0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0149 -> B:13:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object C(int r23, a.zje r24, java.util.List r25) throws a.zhi0 {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ouu.C(int, a.zje, java.util.List):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object D(int i, sip sipVar, CyberGamesPage.Virtual virtual, int i2, zje zjeVar) {
        c6v c6vVar;
        cyu cyuVar;
        CyberGamesPage.Virtual virtual2;
        int i3;
        int i4;
        sip sipVar2;
        if (zjeVar instanceof c6v) {
            c6vVar = (c6v) zjeVar;
            int i5 = c6vVar.p;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c6vVar.p = i5 - Integer.MIN_VALUE;
            } else {
                c6vVar = new c6v(this, zjeVar);
            }
        } else {
            c6vVar = new c6v(this, zjeVar);
        }
        Object obj = c6vVar.n;
        wne wneVar = wne.f39444a;
        int i6 = c6vVar.p;
        if (i6 == 0) {
            z1x.P(obj);
            cyu cyuVar2 = (cyu) this.b;
            sjl0 sjl0Var = (sjl0) this.c;
            c6vVar.k = sipVar;
            c6vVar.l = virtual;
            c6vVar.m = cyuVar2;
            c6vVar.i = i;
            c6vVar.j = i2;
            c6vVar.p = 1;
            Serializable serializableD = sjl0Var.d(c6vVar);
            if (serializableD == wneVar) {
                return wneVar;
            }
            cyuVar = cyuVar2;
            obj = serializableD;
            virtual2 = virtual;
            i3 = i;
            i4 = i2;
            sipVar2 = sipVar;
        } else {
            if (i6 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i4 = c6vVar.j;
            i3 = c6vVar.i;
            cyu cyuVar3 = c6vVar.m;
            CyberGamesPage.Virtual virtual3 = c6vVar.l;
            sip sipVar3 = c6vVar.k;
            z1x.P(obj);
            sipVar2 = sipVar3;
            cyuVar = cyuVar3;
            virtual2 = virtual3;
        }
        List list = (List) obj;
        boolean zA = ((gst0) this.d).a();
        cyuVar.getClass();
        sipVar2.getClass();
        virtual2.getClass();
        list.getClass();
        hie0 hie0Var = new hie0();
        lnf0 lnf0VarD = ((knf0) cyuVar.f5196a).d();
        jo20 jo20Var = new jo20();
        qbt.d(jo20Var, i4, zA);
        qbt.g(lnf0VarD.b, jo20Var);
        qbt.h(jo20Var);
        qbt.j(lnf0VarD.f20342a, jo20Var);
        qbt.l(jo20Var);
        if (i3 > 0) {
            jo20Var.put("sportCategoryId", Integer.valueOf(i3));
        }
        qbt.p(jo20Var);
        cyu cyuVar4 = cyuVar;
        return new yzq0(gfx.R(((n660) cyuVar.c).r(virtual2, sipVar2), kpb.v(sipVar2), null, new zzq0(cyuVar4, sipVar2, virtual2, jo20Var.b(), null, (byte) 0), 252), cyuVar4, hie0Var, virtual2, list, (byte) 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object E(yje yjeVar) {
        kpx kpxVar;
        if (yjeVar instanceof kpx) {
            kpxVar = (kpx) yjeVar;
            int i = kpxVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                kpxVar.k = i - Integer.MIN_VALUE;
            } else {
                kpxVar = new kpx(this, yjeVar);
            }
        } else {
            kpxVar = new kpx(this, yjeVar);
        }
        Object objX = kpxVar.i;
        Object obj = wne.f39444a;
        int i2 = kpxVar.k;
        boolean z = true;
        if (i2 == 0) {
            z1x.P(objX);
            pmi pmiVar = (pmi) this.d;
            kpxVar.k = 1;
            objX = pmiVar.x(kpxVar);
            if (objX == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objX);
        }
        boolean z2 = ((Number) objX).intValue() == 225;
        int iA = ((rqc) this.c).a();
        boolean zA = ((iqt) this.b).f15225a.a();
        if ((zA || iA != 225) && (!zA || !z2)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public Object F(boolean z, long j, Long l, zje zjeVar) {
        nuu nuuVar;
        long j2;
        int i;
        Long l2;
        boolean z2;
        if (zjeVar instanceof nuu) {
            nuuVar = (nuu) zjeVar;
            int i2 = nuuVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nuuVar.o = i2 - Integer.MIN_VALUE;
            } else {
                nuuVar = new nuu(this, zjeVar);
            }
        } else {
            nuuVar = new nuu(this, zjeVar);
        }
        Object obj = nuuVar.m;
        wne wneVar = wne.f39444a;
        int i3 = nuuVar.o;
        if (i3 == 0) {
            z1x.P(obj);
            int i4 = h97.A((wyu) this.b, uaq0.f35345a) ? 108 : 100;
            bbw0 bbw0Var = (bbw0) this.c;
            List listJ = q3d.j(new Long(85L), new Long(103L), new Long(235L), new Long(146L));
            nuuVar.k = l;
            nuuVar.i = z;
            nuuVar.j = j;
            nuuVar.l = i4;
            nuuVar.o = 1;
            Object objP = bbw0Var.p(j, nuuVar, listJ);
            if (objP == wneVar) {
                return wneVar;
            }
            j2 = j;
            i = i4;
            obj = objP;
            l2 = l;
            z2 = z;
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = nuuVar.l;
            j2 = nuuVar.j;
            z2 = nuuVar.i;
            l2 = nuuVar.k;
            z1x.P(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean z3 = j2 == 40;
        String strA = ((ntu) this.d).a();
        if (z2) {
            return strA + "/static/img/android/BottomBet/backgrounds/duels/en/01-" + ((char) i) + ".png";
        }
        if (zBooleanValue) {
            return strA + "/static/img/android/BottomBet/backgrounds/en/40-" + ((char) i) + ".png";
        }
        if (!z3 || l2 == null || l2.longValue() == -1) {
            return strA + "/static/img/android/BottomBet/backgrounds/en/" + j2 + "-" + ((char) i) + ".png";
        }
        return strA + "/static/img/android/BottomBet/backgrounds/en/" + j2 + Separators.SLASH + l2 + "-" + ((char) i) + ".png";
    }

    public boolean G() {
        String strB = ((mrc) this.b).b();
        return !((t1u) this.d).b(((mrc) this.c).a(strB), strB).isEmpty();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public Object H(int i, int i2, s470 s470Var, zje zjeVar) {
        d320 d320Var;
        kgq0 kgq0Var = (kgq0) this.c;
        if (zjeVar instanceof d320) {
            d320Var = (d320) zjeVar;
            int i3 = d320Var.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                d320Var.k = i3 - Integer.MIN_VALUE;
            } else {
                d320Var = new d320(this, zjeVar);
            }
        } else {
            d320Var = new d320(this, zjeVar);
        }
        d320 d320Var2 = d320Var;
        Object objC = d320Var2.i;
        wne wneVar = wne.f39444a;
        int i4 = d320Var2.k;
        if (i4 == 0) {
            z1x.P(objC);
            ql5 ql5VarA = ((gmt) this.b).a();
            if (ql5VarA == null) {
                throw new ss3();
            }
            long j = ql5VarA.f28916a;
            int i5 = kgq0Var.c.f2464a.f40804a;
            long j2 = ((gst0) this.d).f11847a.a().f18785a;
            d320Var2.k = 1;
            objC = kgq0Var.c(j, i5, i, i2, s470Var, j2, d320Var2);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        kgq0Var.f((xfq0) objC);
        return Unit.f46060a;
    }

    public boolean I() {
        Pair pair = (Pair) ((p7m0) this.b).getValue();
        if (pair != null) {
            return !(pair.b instanceof cqk0);
        }
        return true;
    }

    public void J(Response response, boolean z) {
        nmf0 nmf0Var;
        Charset charsetA;
        Request request = response.f46111a;
        ResponseBody responseBody = response.g;
        int i = response.d;
        String str = request.f46108a.i;
        if (StringsKt.O(str, "/log/Android", false)) {
            return;
        }
        Set setP0 = CollectionsKt.P0(request.c);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setP0) {
            String str2 = (String) ((Pair) obj).f46059a;
            if (!kotlin.text.c.o(str2, "X-Auth") && !kotlin.text.c.o(str2, "X-Sign")) {
                arrayList.add(obj);
            }
        }
        String strL = kng0.l("headers:'", CollectionsKt.b0(arrayList, Separators.COMMA, null, null, new bue0((byte) 22), 30), Separators.QUOTE);
        try {
            f99 f99VarD = responseBody.getD().g().d();
            Charset charset = (Charset) this.d;
            MediaType b = responseBody.getB();
            if (b == null || (charsetA = b.a(charset)) == null) {
                charset.getClass();
            } else {
                charset = charsetA;
            }
            String strL2 = f99VarD.L(f99VarD.b, charset);
            nmf0Var = StringsKt.W(strL2) ? new nmf0(ncy.c("Empty content")) : (nmf0) ((vby) this.c).b(nmf0.Companion.serializer(), strL2);
        } catch (fhi0 unused) {
            String str3 = response.c;
            if (StringsKt.W(str3)) {
                str3 = "Non-JSON response";
            }
            nmf0Var = new nmf0(ncy.c("HTTP " + i + Separators.SP + str3));
        } catch (Exception unused2) {
            nmf0Var = new nmf0(ncy.c("Unknown error"));
        }
        mcy mcyVar = nmf0Var.f23769a;
        String string = (mcyVar == null || (mcyVar instanceof bdy)) ? "" : mcyVar.toString();
        ony onyVar = (ony) this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("requestUrl", ncy.c(str));
        linkedHashMap.put("response", ncy.b(Integer.valueOf(i)));
        linkedHashMap.put("responseTime", ncy.b(Long.valueOf(response.m - response.l)));
        if (string.length() > 0) {
            linkedHashMap.put("requestError", ncy.c(string + " | " + strL));
        }
        IntRange intRange = pnm0.f27296a;
        int i2 = intRange.f46068a;
        int i3 = intRange.b;
        if (i2 > i || i > i3) {
            linkedHashMap.put("prophylaxisStatus", ncy.a(Boolean.valueOf(z)));
        }
        ((rny) onyVar).a("", new tny("request", xp20.n(linkedHashMap)));
    }

    public void K(String str, String str2, String str3, String str4) {
        nfq nfqVar = (nfq) this.c;
        if (str2 == null || str3 == null) {
            ohq.l("FIS auth token or FIS ID is empty");
            return;
        }
        nfqVar.a();
        mgq mgqVar = nfqVar.c;
        String str5 = mgqVar.h;
        nfqVar.a();
        String str6 = mgqVar.f21755a;
        if (str5 == null) {
            ohq.l("Project ID or API Key is missing");
            return;
        }
        URL url = new URL(rw2.o(b1j.n("https://fcmregistrations.googleapis.com/v1/projects/", str5, "/registrations/", str3, "/topicSubscriptions/"), str, Separators.COLON, str4));
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sbN = b1j.n("Topic ", str4, " for: ", str, " with url: ");
            sbN.append(url);
            Log.d("FirebaseMessaging", sbN.toString());
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("x-goog-api-key", str6);
        httpURLConnection.setRequestProperty("x-goog-firebase-installations-auth", str2);
        httpURLConnection.setDoOutput(false);
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                String responseMessage = httpURLConnection.getResponseMessage();
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException unused) {
                }
                try {
                    InputStream errorStream = httpURLConnection.getErrorStream();
                    if (errorStream != null) {
                        errorStream.close();
                    }
                } catch (IOException unused2) {
                }
                httpURLConnection.disconnect();
                if (responseCode >= 200 && responseCode < 300) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", b1j.k("Topic ", str4, " for: ", str, " succeeded."));
                    }
                } else {
                    if (responseCode != 404 && responseCode != 403) {
                        if (responseCode >= 500) {
                            ohq.l("INTERNAL_SERVER_ERROR");
                            return;
                        } else {
                            ohq.m("Topic ", str4, " failed with status: ", responseCode);
                            return;
                        }
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Topic " + str4 + " failed: " + responseMessage);
                    }
                    ohq.l(ua80.i("Topic ", str4, " failed: ", responseMessage));
                }
            } catch (IOException e2) {
                throw new IOException("SERVICE_NOT_AVAILABLE", e2);
            }
        } catch (Throwable th) {
            try {
                InputStream inputStream2 = httpURLConnection.getInputStream();
                if (inputStream2 != null) {
                    inputStream2.close();
                }
            } catch (IOException unused3) {
            }
            try {
                InputStream errorStream2 = httpURLConnection.getErrorStream();
                if (errorStream2 != null) {
                    errorStream2.close();
                }
            } catch (IOException unused4) {
            }
            httpURLConnection.disconnect();
            throw th;
        }
    }

    public void L(v0 v0Var, pwi pwiVar) {
        Exception exc;
        Exception exc2;
        int i;
        MutableIntList mutableIntList = (MutableIntList) this.b;
        int i2 = mutableIntList.b;
        vy40 vy40Var = (vy40) this.c;
        vy40 vy40Var2 = new vy40();
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i3 + 1;
            try {
                try {
                    switch (mutableIntList.c(i3)) {
                        case 0:
                            v0Var.l();
                            i3 = i5;
                            break;
                        case 1:
                            int i6 = i4 + 1;
                            v0Var.i(vy40Var.g(i4));
                            i4 = i6;
                            i3 = i5;
                            break;
                        case 2:
                            int i7 = i3 + 2;
                            i3 += 3;
                            v0Var.b(mutableIntList.c(i5), mutableIntList.c(i7));
                            break;
                        case 3:
                            int i8 = i3 + 2;
                            try {
                                int i9 = i3 + 3;
                                try {
                                    i3 += 4;
                                    v0Var.a(mutableIntList.c(i5), mutableIntList.c(i8), mutableIntList.c(i9));
                                } catch (Exception e2) {
                                    exc = e2;
                                    i3 = i9;
                                    throw new bkd(vy40Var, vy40Var2, mutableIntList, i3 - 1, exc);
                                }
                            } catch (Exception e3) {
                                exc = e3;
                                i3 = i8;
                            }
                            break;
                        case 4:
                            v0Var.n();
                            i3 = i5;
                            break;
                        case 5:
                            i3 += 2;
                            i = i4 + 1;
                            v0Var.h(mutableIntList.c(i5), vy40Var.g(i4));
                            i4 = i;
                            break;
                        case 6:
                            i3 += 2;
                            try {
                                i = i4 + 1;
                                v0Var.d(mutableIntList.c(i5), vy40Var.g(i4));
                                i4 = i;
                            } catch (Exception e4) {
                                exc2 = e4;
                                exc = exc2;
                                throw new bkd(vy40Var, vy40Var2, mutableIntList, i3 - 1, exc);
                            }
                            break;
                        case 7:
                            int i10 = i4 + 1;
                            Object objG = vy40Var.g(i4);
                            objG.getClass();
                            zys0.e(2, objG);
                            i4 += 2;
                            v0Var.c(vy40Var.g(i10), (Function2) objG);
                            i3 = i5;
                            break;
                        case 8:
                            Object obj = v0Var.c;
                            if (obj instanceof zjd) {
                                zjd zjdVar = (zjd) obj;
                                if (((xz40) pwiVar.i).j(zjdVar)) {
                                    zjdVar.a();
                                }
                            }
                            vy40Var2.a(obj);
                            v0Var.j();
                            i3 = i5;
                            break;
                        default:
                            i3 = i5;
                            break;
                    }
                } catch (Exception e5) {
                    exc2 = e5;
                    i3 = i5;
                    exc = exc2;
                    throw new bkd(vy40Var, vy40Var2, mutableIntList, i3 - 1, exc);
                }
            } catch (Throwable th) {
                v0Var.e();
                throw th;
            }
        }
        if (i4 != vy40Var.b) {
            ykd.a("Applier operation size mismatch");
        }
        vy40Var.d();
        mutableIntList.b = 0;
        v0Var.e();
    }

    public i1w0 M(cb50 cb50Var) {
        return ((hr00) this.c).a(cb50Var, true).f7902a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object N(List list, zje zjeVar) {
        p4x p4xVar;
        k050 k050Var;
        ArrayList arrayList = (ArrayList) this.c;
        if (zjeVar instanceof p4x) {
            p4xVar = (p4x) zjeVar;
            int i = p4xVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                p4xVar.m = i - Integer.MIN_VALUE;
            } else {
                p4xVar = new p4x(this, zjeVar);
            }
        } else {
            p4xVar = new p4x(this, zjeVar);
        }
        Object obj = p4xVar.k;
        wne wneVar = wne.f39444a;
        int i2 = p4xVar.m;
        if (i2 == 0) {
            z1x.P(obj);
            k050Var = (k050) this.b;
            p4xVar.i = list;
            p4xVar.j = k050Var;
            p4xVar.m = 1;
            if (k050Var.d(p4xVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050 k050Var2 = p4xVar.j;
            List list2 = p4xVar.i;
            z1x.P(obj);
            k050Var = k050Var2;
            list = list2;
        }
        try {
            arrayList.clear();
            arrayList.addAll(list);
            ((p7m0) this.d).n(CollectionsKt.L0(arrayList));
            return Unit.f46060a;
        } finally {
            k050Var.c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0085  */
    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x008f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0092  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        if (kotlin.Unit.f46060a == r2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a7, code lost:
    
        if (kotlin.Unit.f46060a == r2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cd, code lost:
    
        if (kotlin.Unit.f46060a == r2) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object O(a.dqk0 r11, a.yje r12) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ouu.O(a.dqk0, a.yje):java.lang.Object");
    }

    @Override // a.bv3
    public void a(int i, int i2, int i3) {
        MutableIntList mutableIntList = (MutableIntList) this.b;
        mutableIntList.a(3);
        mutableIntList.a(i);
        mutableIntList.a(i2);
        mutableIntList.a(i3);
    }

    @Override // a.bv3
    public void b(int i, int i2) {
        MutableIntList mutableIntList = (MutableIntList) this.b;
        mutableIntList.a(2);
        mutableIntList.a(i);
        mutableIntList.a(i2);
    }

    @Override // a.bv3
    public void c(Object obj, Function2 function2) {
        ((MutableIntList) this.b).a(7);
        vy40 vy40Var = (vy40) this.c;
        vy40Var.a(function2);
        vy40Var.a(obj);
    }

    @Override // a.bv3
    public void d(int i, Object obj) {
        MutableIntList mutableIntList = (MutableIntList) this.b;
        mutableIntList.a(6);
        mutableIntList.a(i);
        ((vy40) this.c).a(obj);
    }

    @Override // a.bv3
    public Object f() {
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object g(List list, zje zjeVar) {
        n4x n4xVar;
        k050 k050Var;
        ArrayList arrayList = (ArrayList) this.c;
        if (zjeVar instanceof n4x) {
            n4xVar = (n4x) zjeVar;
            int i = n4xVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                n4xVar.m = i - Integer.MIN_VALUE;
            } else {
                n4xVar = new n4x(this, zjeVar);
            }
        } else {
            n4xVar = new n4x(this, zjeVar);
        }
        Object obj = n4xVar.k;
        wne wneVar = wne.f39444a;
        int i2 = n4xVar.m;
        if (i2 == 0) {
            z1x.P(obj);
            k050Var = (k050) this.b;
            n4xVar.i = list;
            n4xVar.j = k050Var;
            n4xVar.m = 1;
            if (k050Var.d(n4xVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050 k050Var2 = n4xVar.j;
            List list2 = n4xVar.i;
            z1x.P(obj);
            k050Var = k050Var2;
            list = list2;
        }
        try {
            arrayList.addAll(list);
            ((p7m0) this.d).n(CollectionsKt.L0(arrayList));
            return Unit.f46060a;
        } finally {
            k050Var.c(null);
        }
    }

    @Override // a.bv3
    public void h(int i, Object obj) {
        MutableIntList mutableIntList = (MutableIntList) this.b;
        mutableIntList.a(5);
        mutableIntList.a(i);
        ((vy40) this.c).a(obj);
    }

    @Override // a.bv3
    public void i(Object obj) {
        ((MutableIntList) this.b).a(1);
        ((vy40) this.c).a(obj);
    }

    @Override // a.bv3
    public void j() {
        ((MutableIntList) this.b).a(8);
    }

    @Override // a.bv3
    public void l() {
        ((MutableIntList) this.b).a(0);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.ArrayList] */
    public Object m(int i, zje zjeVar, String str) throws bfc0 {
        aac0 aac0Var;
        String str2;
        ?? arrayList;
        if (zjeVar instanceof aac0) {
            aac0Var = (aac0) zjeVar;
            int i2 = aac0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aac0Var.l = i2 - Integer.MIN_VALUE;
            } else {
                aac0Var = new aac0(this, zjeVar);
            }
        } else {
            aac0Var = new aac0(this, zjeVar);
        }
        aac0 aac0Var2 = aac0Var;
        Object objA = aac0Var2.j;
        wne wneVar = wne.f39444a;
        int i3 = aac0Var2.l;
        Object obj = null;
        if (i3 == 0) {
            z1x.P(objA);
            String strC = ((knf0) this.b).c();
            o470 o470Var = (o470) this.d;
            String strA = ((btt0) this.c).a();
            aac0Var2.i = str;
            aac0Var2.l = 1;
            objA = ((roc0) ((rta0) o470Var.f24619a).invoke()).a(strC, str, i, strA, "application/vnd.xenvelop+json", aac0Var2);
            if (objA == wneVar) {
                return wneVar;
            }
            str2 = str;
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = aac0Var2.i;
            z1x.P(objA);
        }
        List list = ((phc0) ((dx5) objA).a()).f26990a;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zdx.N((mhc0) it.next()));
            }
        } else {
            arrayList = iun.f15405a;
        }
        for (Object obj2 : arrayList) {
            if (Intrinsics.d(((zec0) obj2).f44243a, str2)) {
                obj = obj2;
                break;
            }
        }
        zec0 zec0Var = (zec0) obj;
        if (zec0Var != null) {
            return zec0Var;
        }
        throw new bfc0(kng0.l("Promocode ", str2, " not found"));
    }

    public void n(cb50 cb50Var, boolean z) {
        hr00 hr00Var = (hr00) this.c;
        hr00Var.getClass();
        hdo0 hdo0Var = hr00Var.b;
        boolean zContainsKey = hdo0Var.b.containsKey(cb50Var.f4046a);
        i1w0 i1w0Var = hr00Var.a(cb50Var, true).f7902a;
        if (!zContainsKey) {
            return;
        }
        if (z) {
            i1w0Var.d(new rw40(this, cb50Var, (byte) 8));
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayList, new c8d(y7d.f42146a, new q0w0(null)), i1w0Var, copyOnWriteArrayList, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    @Override // a.bfr, a.cfr
    public void onFailure(Throwable th) {
        switch (this.f25895a) {
            case 14:
                ((View) this.b).setVisibility(8);
                break;
            default:
                boolean z = th instanceof CancellationException;
                tu9 tu9Var = (tu9) this.c;
                if (!z) {
                    tu9Var.b(null);
                } else {
                    z1x.y(null, tu9Var.d(new nmn0(((String) this.d).concat(" cancelled."), th)));
                }
                break;
        }
    }

    @Override // a.bfr, a.cfr
    public void onSuccess(Object obj) {
        byte b = this.f25895a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 14:
                View view = (View) obj;
                ViewGroup viewGroup = (ViewGroup) obj2;
                View view2 = (View) obj3;
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams == null) {
                    jf4.n("The media route button placeholder missing layout params.");
                } else {
                    view.setId(R.id.exo_media_route_button_placeholder);
                    view.setLayoutParams(layoutParams);
                    int iIndexOfChild = viewGroup.indexOfChild(view2);
                    viewGroup.removeView(view2);
                    viewGroup.addView(view, iIndexOfChild);
                    view.setVisibility(0);
                    ((PlayerControlView) this.d).f45391a.h(view, true);
                }
                break;
            default:
                ro4.e0(true, (ig00) obj3, (tu9) obj2, bnk.a());
                break;
        }
    }

    public void p(cb50 cb50Var, Function1 function1) {
        q(cb50Var, true);
        function1.invoke(M(cb50Var));
    }

    public void q(cb50 cb50Var, boolean z) {
        n(cb50Var, z);
        ((qe50) this.b).a(cb50Var, true);
    }

    public void r() {
        ((p7m0) this.b).n(null);
        v3c.N((bby) this.d);
    }

    public i1w0 s() {
        return M(t());
    }

    public cb50 t() {
        return ((w950) ((qe50) this.b).f28566a.getValue()).f38762a;
    }

    public String toString() {
        switch (this.f25895a) {
            case 11:
                StringBuilder sb = new StringBuilder();
                sg40 sg40Var = null;
                for (sg40 sg40Var2 : (ArrayList) this.b) {
                    if (sg40Var != null) {
                        sb.append(Separators.COMMA);
                    }
                    sb.append(sg40Var2.toString());
                    sg40Var = sg40Var2;
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object u(long j, long j2, zje zjeVar, String str) {
        lvg0 lvg0Var;
        if (zjeVar instanceof lvg0) {
            lvg0Var = (lvg0) zjeVar;
            int i = lvg0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                lvg0Var.k = i - Integer.MIN_VALUE;
            } else {
                lvg0Var = new lvg0(this, zjeVar);
            }
        } else {
            lvg0Var = new lvg0(this, zjeVar);
        }
        Object objA = lvg0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = lvg0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            vvg0 vvg0Var = new vvg0(j2, j, str, ((kuy) this.c).a());
            ugf0 ugf0Var = (ugf0) this.b;
            String strA = ((btt0) this.d).a();
            lvg0Var.k = 1;
            objA = ((nvg0) ((rta0) ugf0Var.f35622a).invoke()).a(strA, vvg0Var, lvg0Var);
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
        return d7x.O(g7x.z((q16) objA));
    }

    public int v(ubu0 ubu0Var) {
        int i = 0;
        for (sg40 sg40Var : (ArrayList) this.b) {
            int i2 = sg40Var.d;
            hm40 hm40Var = sg40Var.f32143a;
            int iA = hm40Var.a(ubu0Var);
            int iB = iA + 4;
            int iOrdinal = hm40Var.ordinal();
            if (iOrdinal == 1) {
                int iB2 = f140.b(i2, 3, 10, iB);
                int i3 = i2 % 3;
                iB = iB2 + (i3 != 1 ? i3 == 2 ? 7 : 0 : 4);
            } else if (iOrdinal == 2) {
                iB = f140.b(i2, 2, 11, iB) + (i2 % 2 != 1 ? 0 : 6);
            } else if (iOrdinal == 4) {
                iB += sg40Var.a() * 8;
            } else if (iOrdinal == 5) {
                iB = iA + 12;
            } else if (iOrdinal == 6) {
                iB += i2 * 13;
            }
            i += iB;
        }
        return i;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:44|148|45|140|46|47|137|48|158|49|50|152|51|52|146|53|160|54|55|156|56|57|(2:59|121)(1:60)) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:139|(1:(3:(1:(4:13|14|15|123)(2:18|19))(4:20|21|22|163)|107|(23:44|148|45|140|46|47|137|48|158|49|50|152|51|52|146|53|160|54|55|156|56|57|(2:59|121)(1:60))(2:129|(2:131|132)(1:133)))(4:23|150|24|25))(3:28|(1:33)|(2:35|36)(6:37|(1:39)|40|41|42|(23:44|148|45|140|46|47|137|48|158|49|50|152|51|52|146|53|160|54|55|156|56|57|(2:59|121)(1:60))(2:129|(2:131|132)(1:133))))|142|61|62|63) */
    /* JADX WARN: Code duplicated, block: B:102:0x025e A[Catch: all -> 0x024a, TryCatch #4 {all -> 0x024a, blocks: (B:89:0x0234, B:92:0x023c, B:96:0x024e, B:100:0x025a, B:102:0x025e, B:108:0x02a4, B:109:0x02bf, B:111:0x02c9, B:115:0x02d3, B:117:0x02d7), top: B:144:0x0234 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x028e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0291  */
    /* JADX WARN: Code duplicated, block: B:108:0x02a4 A[Catch: all -> 0x024a, TryCatch #4 {all -> 0x024a, blocks: (B:89:0x0234, B:92:0x023c, B:96:0x024e, B:100:0x025a, B:102:0x025e, B:108:0x02a4, B:109:0x02bf, B:111:0x02c9, B:115:0x02d3, B:117:0x02d7), top: B:144:0x0234 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x02bf A[Catch: all -> 0x024a, TryCatch #4 {all -> 0x024a, blocks: (B:89:0x0234, B:92:0x023c, B:96:0x024e, B:100:0x025a, B:102:0x025e, B:108:0x02a4, B:109:0x02bf, B:111:0x02c9, B:115:0x02d3, B:117:0x02d7), top: B:144:0x0234 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x02c9 A[Catch: all -> 0x024a, TryCatch #4 {all -> 0x024a, blocks: (B:89:0x0234, B:92:0x023c, B:96:0x024e, B:100:0x025a, B:102:0x025e, B:108:0x02a4, B:109:0x02bf, B:111:0x02c9, B:115:0x02d3, B:117:0x02d7), top: B:144:0x0234 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:114:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:117:0x02d7 A[Catch: all -> 0x024a, TRY_LEAVE, TryCatch #4 {all -> 0x024a, blocks: (B:89:0x0234, B:92:0x023c, B:96:0x024e, B:100:0x025a, B:102:0x025e, B:108:0x02a4, B:109:0x02bf, B:111:0x02c9, B:115:0x02d3, B:117:0x02d7), top: B:144:0x0234 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0305  */
    /* JADX WARN: Code duplicated, block: B:126:0x031e A[Catch: all -> 0x031c, TryCatch #10 {all -> 0x031c, blocks: (B:119:0x02f1, B:126:0x031e, B:127:0x033d), top: B:154:0x02f1 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x033d A[Catch: all -> 0x031c, TRY_LEAVE, TryCatch #10 {all -> 0x031c, blocks: (B:119:0x02f1, B:126:0x031e, B:127:0x033d), top: B:154:0x02f1 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0359  */
    /* JADX WARN: Code duplicated, block: B:131:0x035d A[Catch: all -> 0x01e4, TRY_ENTER, TryCatch #1 {all -> 0x01e4, blocks: (B:62:0x01de, B:131:0x035d, B:132:0x0364, B:133:0x0365), top: B:139:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0365 A[Catch: all -> 0x01e4, TRY_LEAVE, TryCatch #1 {all -> 0x01e4, blocks: (B:62:0x01de, B:131:0x035d, B:132:0x0364, B:133:0x0365), top: B:139:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x017d  */
    /* JADX WARN: Code duplicated, block: B:59:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:60:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:91:0x023a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x023c A[Catch: all -> 0x024a, TryCatch #4 {all -> 0x024a, blocks: (B:89:0x0234, B:92:0x023c, B:96:0x024e, B:100:0x025a, B:102:0x025e, B:108:0x02a4, B:109:0x02bf, B:111:0x02c9, B:115:0x02d3, B:117:0x02d7), top: B:144:0x0234 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x024e A[Catch: all -> 0x024a, TryCatch #4 {all -> 0x024a, blocks: (B:89:0x0234, B:92:0x023c, B:96:0x024e, B:100:0x025a, B:102:0x025e, B:108:0x02a4, B:109:0x02bf, B:111:0x02c9, B:115:0x02d3, B:117:0x02d7), top: B:144:0x0234 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0257  */
    /* JADX WARN: Code duplicated, block: B:99:0x0259  */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01e9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01ea, code lost:
    
        r20 = r12;
        r12 = r5;
        r5 = r20;
        r24 = r1;
        r1 = r2;
        r2 = r18;
        r20 = r10;
        r10 = r3;
        r11 = r4;
        r3 = r7;
        r7 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01fc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01fe, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ff, code lost:
    
        r15 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0202, code lost:
    
        r24 = r17;
        r17 = r15;
        r15 = r24;
        r24 = r24;
        r1 = r2;
        r2 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x020e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x020f, code lost:
    
        r15 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0214, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0215, code lost:
    
        r15 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0217, code lost:
    
        r17 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x021c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x021f, code lost:
    
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0222, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0225, code lost:
    
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0228, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0229, code lost:
    
        r18 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x022e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x022f, code lost:
    
        r18 = r2;
     */
    /* JADX WARN: Not initialized variable reg: 18, insn: 0x01e5: MOVE (r13 I:??[OBJECT, ARRAY]) = (r18 I:??[OBJECT, ARRAY]) (LINE:486), block:B:65:0x01e5 */
    /* JADX WARN: Type inference failed for: r0v25, types: [int, short] */
    /* JADX WARN: Type inference failed for: r0v32, types: [int, short] */
    /* JADX WARN: Type inference failed for: r2v23, types: [int, short] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x02a4 -> B:43:0x017b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:122:0x0305 -> B:123:0x0313). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:126:0x031e -> B:43:0x017b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object w(long r25, long r27, a.zje r29) {
        /*
            Method dump skipped, instruction units count: 893
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ouu.w(long, long, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Serializable x(long j, aj00 aj00Var, boolean z, long j2, int i, jvn jvnVar, zje zjeVar) {
        mi00 mi00Var;
        knf0 knf0Var = (knf0) this.c;
        if (zjeVar instanceof mi00) {
            mi00Var = (mi00) zjeVar;
            int i2 = mi00Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mi00Var.k = i2 - Integer.MIN_VALUE;
            } else {
                mi00Var = new mi00(this, zjeVar);
            }
        } else {
            mi00Var = new mi00(this, zjeVar);
        }
        Object objA = mi00Var.i;
        wne wneVar = wne.f39444a;
        int i3 = mi00Var.k;
        if (i3 == 0) {
            z1x.P(objA);
            int iB = knf0Var.b();
            m2c0 m2c0VarA = ((x2c0) this.d).a();
            Integer intOrNull = m2c0VarA != null ? StringsKt.toIntOrNull(m2c0VarA.c) : null;
            String strC = knf0Var.c();
            jvnVar.getClass();
            aj00Var.getClass();
            jo20 jo20Var = new jo20();
            jo20Var.put("cfView", Integer.valueOf(jvnVar.getId()));
            if (intOrNull != null && intOrNull.intValue() > 0) {
                jo20Var.put("country", intOrNull);
            }
            ulb.K(iB, jo20Var);
            jo20Var.put("gr", 1357);
            jo20Var.put("lng", strC);
            jo20Var.put("ref", 1);
            if (j > 0) {
                jo20Var.put("sportId", Long.valueOf(j));
            }
            jo20Var.put("tabId", Integer.valueOf(aj00Var.getId()));
            ulb.l0(jo20Var, z, j2);
            tlb.m0(22, jo20Var);
            jo20 jo20VarB = jo20Var.b();
            lbu lbuVar = (lbu) this.b;
            mi00Var.k = 1;
            objA = ((ni00) ((rcz) lbuVar.c).invoke()).a(jo20VarB, mi00Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        List list = (List) ((dx5) objA).a();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nas nasVarD0 = ay3.d0((rt10) it.next(), sip.c, 0L);
            if (nasVarD0 != null) {
                arrayList.add(nasVarD0);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(1:(1:(4:13|14|15|96)(2:18|19))(4:20|21|22|130))(4:23|120|24|25)|123|44|(6:46|47|118|48|(2:51|49)|132)(1:56)|(1:58)|59|105|(1:107)(1:108)|109|(1:115)(2:113|114)) */
    /* JADX WARN: Can't wrap try/catch for region: R(12:35|116|36|128|37|38|125|39|40|(1:43)|42|94) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:46|47|118|48|(2:51|49)|132) */
    /* JADX WARN: Code duplicated, block: B:100:0x02f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x02f5 A[Catch: all -> 0x01c7, TryCatch #3 {all -> 0x01c7, blocks: (B:59:0x01c3, B:68:0x01e4, B:71:0x01ec, B:72:0x01fd, B:76:0x0205, B:78:0x0209, B:83:0x0243, B:84:0x025b, B:86:0x0269, B:90:0x0275, B:92:0x0279, B:97:0x02c2, B:99:0x02e1, B:101:0x02f5, B:102:0x02fc, B:103:0x02fd), top: B:122:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x02fd A[Catch: all -> 0x01c7, TRY_LEAVE, TryCatch #3 {all -> 0x01c7, blocks: (B:59:0x01c3, B:68:0x01e4, B:71:0x01ec, B:72:0x01fd, B:76:0x0205, B:78:0x0209, B:83:0x0243, B:84:0x025b, B:86:0x0269, B:90:0x0275, B:92:0x0279, B:97:0x02c2, B:99:0x02e1, B:101:0x02f5, B:102:0x02fc, B:103:0x02fd), top: B:122:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0309  */
    /* JADX WARN: Code duplicated, block: B:108:0x0314  */
    /* JADX WARN: Code duplicated, block: B:111:0x031c  */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0136  */
    /* JADX WARN: Code duplicated, block: B:43:0x016c  */
    /* JADX WARN: Code duplicated, block: B:46:0x017f A[Catch: all -> 0x01b7, TRY_LEAVE, TryCatch #4 {all -> 0x01b7, blocks: (B:44:0x0179, B:46:0x017f), top: B:123:0x0179 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0196 A[Catch: all -> 0x01a4, LOOP:0: B:49:0x0190->B:51:0x0196, LOOP_END, TryCatch #1 {all -> 0x01a4, blocks: (B:48:0x0185, B:49:0x0190, B:51:0x0196, B:58:0x01c1), top: B:118:0x0185 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:58:0x01c1 A[Catch: all -> 0x01a4, TRY_LEAVE, TryCatch #1 {all -> 0x01a4, blocks: (B:48:0x0185, B:49:0x0190, B:51:0x0196, B:58:0x01c1), top: B:118:0x0185 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x01ec A[Catch: all -> 0x01c7, TryCatch #3 {all -> 0x01c7, blocks: (B:59:0x01c3, B:68:0x01e4, B:71:0x01ec, B:72:0x01fd, B:76:0x0205, B:78:0x0209, B:83:0x0243, B:84:0x025b, B:86:0x0269, B:90:0x0275, B:92:0x0279, B:97:0x02c2, B:99:0x02e1, B:101:0x02f5, B:102:0x02fc, B:103:0x02fd), top: B:122:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01fd A[Catch: all -> 0x01c7, TryCatch #3 {all -> 0x01c7, blocks: (B:59:0x01c3, B:68:0x01e4, B:71:0x01ec, B:72:0x01fd, B:76:0x0205, B:78:0x0209, B:83:0x0243, B:84:0x025b, B:86:0x0269, B:90:0x0275, B:92:0x0279, B:97:0x02c2, B:99:0x02e1, B:101:0x02f5, B:102:0x02fc, B:103:0x02fd), top: B:122:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0202  */
    /* JADX WARN: Code duplicated, block: B:75:0x0204  */
    /* JADX WARN: Code duplicated, block: B:78:0x0209 A[Catch: all -> 0x01c7, TryCatch #3 {all -> 0x01c7, blocks: (B:59:0x01c3, B:68:0x01e4, B:71:0x01ec, B:72:0x01fd, B:76:0x0205, B:78:0x0209, B:83:0x0243, B:84:0x025b, B:86:0x0269, B:90:0x0275, B:92:0x0279, B:97:0x02c2, B:99:0x02e1, B:101:0x02f5, B:102:0x02fc, B:103:0x02fd), top: B:122:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0231  */
    /* JADX WARN: Code duplicated, block: B:81:0x0233  */
    /* JADX WARN: Code duplicated, block: B:83:0x0243 A[Catch: all -> 0x01c7, TryCatch #3 {all -> 0x01c7, blocks: (B:59:0x01c3, B:68:0x01e4, B:71:0x01ec, B:72:0x01fd, B:76:0x0205, B:78:0x0209, B:83:0x0243, B:84:0x025b, B:86:0x0269, B:90:0x0275, B:92:0x0279, B:97:0x02c2, B:99:0x02e1, B:101:0x02f5, B:102:0x02fc, B:103:0x02fd), top: B:122:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x025b A[Catch: all -> 0x01c7, TryCatch #3 {all -> 0x01c7, blocks: (B:59:0x01c3, B:68:0x01e4, B:71:0x01ec, B:72:0x01fd, B:76:0x0205, B:78:0x0209, B:83:0x0243, B:84:0x025b, B:86:0x0269, B:90:0x0275, B:92:0x0279, B:97:0x02c2, B:99:0x02e1, B:101:0x02f5, B:102:0x02fc, B:103:0x02fd), top: B:122:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0269 A[Catch: all -> 0x01c7, TryCatch #3 {all -> 0x01c7, blocks: (B:59:0x01c3, B:68:0x01e4, B:71:0x01ec, B:72:0x01fd, B:76:0x0205, B:78:0x0209, B:83:0x0243, B:84:0x025b, B:86:0x0269, B:90:0x0275, B:92:0x0279, B:97:0x02c2, B:99:0x02e1, B:101:0x02f5, B:102:0x02fc, B:103:0x02fd), top: B:122:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0272  */
    /* JADX WARN: Code duplicated, block: B:89:0x0274  */
    /* JADX WARN: Code duplicated, block: B:92:0x0279 A[Catch: all -> 0x01c7, TryCatch #3 {all -> 0x01c7, blocks: (B:59:0x01c3, B:68:0x01e4, B:71:0x01ec, B:72:0x01fd, B:76:0x0205, B:78:0x0209, B:83:0x0243, B:84:0x025b, B:86:0x0269, B:90:0x0275, B:92:0x0279, B:97:0x02c2, B:99:0x02e1, B:101:0x02f5, B:102:0x02fc, B:103:0x02fd), top: B:122:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:97:0x02c2 A[Catch: all -> 0x01c7, TryCatch #3 {all -> 0x01c7, blocks: (B:59:0x01c3, B:68:0x01e4, B:71:0x01ec, B:72:0x01fd, B:76:0x0205, B:78:0x0209, B:83:0x0243, B:84:0x025b, B:86:0x0269, B:90:0x0275, B:92:0x0279, B:97:0x02c2, B:99:0x02e1, B:101:0x02f5, B:102:0x02fc, B:103:0x02fd), top: B:122:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x02e1 A[Catch: all -> 0x01c7, TryCatch #3 {all -> 0x01c7, blocks: (B:59:0x01c3, B:68:0x01e4, B:71:0x01ec, B:72:0x01fd, B:76:0x0205, B:78:0x0209, B:83:0x0243, B:84:0x025b, B:86:0x0269, B:90:0x0275, B:92:0x0279, B:97:0x02c2, B:99:0x02e1, B:101:0x02f5, B:102:0x02fc, B:103:0x02fd), top: B:122:0x01e4 }] */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01a4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01a5, code lost:
    
        r2 = r0;
        r0 = r24;
        r24 = r6;
        r15 = r4;
        r4 = r10;
        r10 = r5;
        r5 = r18;
        r18 = r7;
        r7 = r11;
        r11 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01b7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01b8, code lost:
    
        r24 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01ca, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01cb, code lost:
    
        r24 = r1;
        r1 = r18;
        r18 = r12;
        r22 = r0;
        r0 = r24;
        r24 = r11;
        r11 = r14;
        r15 = r2;
        r2 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01dc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01dd, code lost:
    
        r4 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01e0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01e1, code lost:
    
        r4 = r24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x01ec -> B:34:0x0134). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0243 -> B:34:0x0134). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x02a4 -> B:96:0x02b5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable y(long r25, long r27, a.zje r29) {
        /*
            Method dump skipped, instruction units count: 809
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ouu.y(long, long, a.zje):java.io.Serializable");
    }

    public xp90 z() {
        return new xp90(new i89((p7m0) this.b, (byte) 22), (byte) 10);
    }

    public /* synthetic */ ouu(Object obj, Object obj2, Object obj3, byte b) {
        this.f25895a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public ouu(qe50 qe50Var, hr00 hr00Var, nv20 nv20Var) {
        this.f25895a = (byte) 12;
        qe50Var.getClass();
        hr00Var.getClass();
        this.b = qe50Var;
        this.c = hr00Var;
        this.d = nv20Var;
    }

    public ouu(ugf0 ugf0Var, kuy kuyVar, btt0 btt0Var) {
        this.f25895a = (byte) 19;
        kuyVar.getClass();
        btt0Var.getClass();
        this.b = ugf0Var;
        this.c = kuyVar;
        this.d = btt0Var;
    }

    public ouu(knf0 knf0Var, btt0 btt0Var, o470 o470Var) {
        this.f25895a = (byte) 16;
        knf0Var.getClass();
        btt0Var.getClass();
        this.b = knf0Var;
        this.c = btt0Var;
        this.d = o470Var;
    }

    public ouu(String str, PackageManager packageManager, YandexAuthOptions yandexAuthOptions) {
        this.f25895a = (byte) 13;
        str.getClass();
        packageManager.getClass();
        this.b = str;
        this.c = packageManager;
        this.d = yandexAuthOptions;
    }

    public ouu() {
        this.f25895a = (byte) 5;
        this.b = new k050();
        this.c = new ArrayList();
        this.d = q7m0.a(iun.f15405a);
    }

    public ouu(cyu cyuVar, sjl0 sjl0Var, gst0 gst0Var) {
        this.f25895a = (byte) 2;
        sjl0Var.getClass();
        gst0Var.getClass();
        this.b = cyuVar;
        this.c = sjl0Var;
        this.d = gst0Var;
    }

    public ouu(mne mneVar, zpu zpuVar, knf0 knf0Var) {
        this.f25895a = (byte) 4;
        knf0Var.getClass();
        this.b = mneVar;
        this.c = zpuVar;
        this.d = knf0Var;
    }

    public ouu(mne mneVar, eyg0 eyg0Var, knf0 knf0Var) {
        this.f25895a = (byte) 24;
        knf0Var.getClass();
        this.b = mneVar;
        this.c = eyg0Var;
        this.d = knf0Var;
    }

    public ouu(knf0 knf0Var, kuy kuyVar, gii0 gii0Var) {
        this.f25895a = (byte) 29;
        knf0Var.getClass();
        kuyVar.getClass();
        gii0Var.getClass();
        this.b = knf0Var;
        this.c = kuyVar;
        this.d = maz.b(new lkr0(gii0Var, (byte) 15));
    }

    public ouu(knf0 knf0Var, fck0 fck0Var, vwl0 vwl0Var) {
        this.f25895a = (byte) 23;
        knf0Var.getClass();
        vwl0Var.getClass();
        this.b = knf0Var;
        this.c = fck0Var;
        this.d = vwl0Var;
    }

    public ouu(wyu wyuVar, bbw0 bbw0Var, ntu ntuVar) {
        this.f25895a = (byte) 0;
        wyuVar.getClass();
        this.b = wyuVar;
        this.c = bbw0Var;
        this.d = ntuVar;
    }

    public ouu(lbu lbuVar, knf0 knf0Var, x2c0 x2c0Var) {
        this.f25895a = (byte) 7;
        knf0Var.getClass();
        x2c0Var.getClass();
        this.b = lbuVar;
        this.c = knf0Var;
        this.d = x2c0Var;
    }

    public ouu(fsd fsdVar, lef0 lef0Var, w5z w5zVar) {
        this.f25895a = (byte) 8;
        fsdVar.getClass();
        this.b = fsdVar;
        this.c = lef0Var;
        this.d = w5zVar;
    }

    public ouu(kd30 kd30Var, jd30 jd30Var, knf0 knf0Var, mne mneVar) {
        this.f25895a = (byte) 10;
        jd30Var.getClass();
        knf0Var.getClass();
        this.b = kd30Var;
        this.c = jd30Var;
        this.d = knf0Var;
    }

    public ouu(ony onyVar, vby vbyVar) {
        this.f25895a = (byte) 18;
        onyVar.getClass();
        vbyVar.getClass();
        this.b = onyVar;
        this.c = vbyVar;
        this.d = Charset.forName("UTF-8");
    }

    public ouu(mne mneVar) {
        this.f25895a = (byte) 27;
        this.b = q7m0.a(null);
        this.c = maz.a(wez.b, new nxo0(mneVar, (byte) 26));
    }

    public ouu(dpi0 dpi0Var, cyu cyuVar, knf0 knf0Var) {
        this.f25895a = (byte) 26;
        knf0Var.getClass();
        this.b = dpi0Var;
        this.c = cyuVar;
        this.d = knf0Var;
    }

    public ouu(goc gocVar, List list, ouu ouuVar) {
        this.f25895a = (byte) 15;
        gocVar.getClass();
        list.getClass();
        this.b = gocVar;
        this.c = list;
        this.d = ouuVar;
    }

    public ouu(nfq nfqVar, FirebaseMessaging firebaseMessaging, dgq dgqVar) {
        this.f25895a = (byte) 28;
        this.b = dgqVar;
        this.c = nfqVar;
        this.d = firebaseMessaging;
    }

    public ouu(Object obj) {
        this.f25895a = (byte) 17;
        this.b = new MutableIntList();
        this.c = new vy40();
        this.d = obj;
    }

    public /* synthetic */ ouu(Object obj, ntu ntuVar, pru pruVar, byte b) {
        this.f25895a = b;
        this.b = obj;
        this.d = ntuVar;
        this.c = pruVar;
    }

    public ouu(PlayerControlView playerControlView, View view, ViewGroup viewGroup) {
        this.f25895a = (byte) 14;
        this.d = playerControlView;
        this.b = view;
        this.c = viewGroup;
    }
}
