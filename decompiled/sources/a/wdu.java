package a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.gov.nist.core.Separators;
import android.util.Log;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.responsible_game.impl.domain.models.LimitTypeEnum;

/* JADX INFO: loaded from: classes3.dex */
public final class wdu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38991a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;

    public wdu(bwl bwlVar, cad cadVar, a7q a7qVar, x2c0 x2c0Var, knf0 knf0Var, bwl bwlVar2, sjl0 sjl0Var, y78 y78Var, f8p f8pVar) {
        this.f38991a = (byte) 7;
        x2c0Var.getClass();
        knf0Var.getClass();
        sjl0Var.getClass();
        f8pVar.getClass();
        this.b = bwlVar;
        this.c = cadVar;
        this.d = a7qVar;
        this.e = x2c0Var;
        this.f = knf0Var;
        this.g = bwlVar2;
        this.h = sjl0Var;
        this.i = y78Var;
        this.j = f8pVar;
    }

    public static j8b b(wdu wduVar, s0s s0sVar, Object obj, long j, int i) {
        int i2;
        nw80 nw80Var = nw80.b;
        if ((i & 4) != 0) {
            nw80Var = nw80.f24223a;
        }
        long j2 = (i & 16) != 0 ? 1L : 2L;
        long j3 = s0sVar.f31424a;
        ctf0 ctf0Var = (ctf0) wduVar.e;
        int iOrdinal = s0sVar.ordinal();
        if (iOrdinal == 0) {
            i2 = R.string.aggregator_one_x_live;
        } else if (iOrdinal == 1) {
            i2 = R.string.slots_popular;
        } else if (iOrdinal != 2) {
            i2 = iOrdinal != 3 ? R.string.empty_str : R.string.live_casino_popular;
        } else {
            i2 = R.string.casino_category_title_recommended;
        }
        String strA = ctf0Var.b.a(i2, Arrays.copyOf(new Object[0], 0));
        Object obj2 = iun.f15405a;
        e0g0 e0g0Var = j0g0.b;
        if (!(obj instanceof g0g0)) {
            obj2 = obj;
        }
        return new j8b(j3, strA, (List) obj2, nw80Var.getId(), j2, j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object B(boolean z, boolean z2, boolean z3, boolean z4, zje zjeVar) {
        mdu mduVar;
        if (zjeVar instanceof mdu) {
            mduVar = (mdu) zjeVar;
            int i = mduVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                mduVar.k = i - Integer.MIN_VALUE;
            } else {
                mduVar = new mdu(this, zjeVar);
            }
        } else {
            mduVar = new mdu(this, zjeVar);
        }
        Object objJ = mduVar.i;
        wne wneVar = wne.f39444a;
        int i2 = mduVar.k;
        if (i2 == 0) {
            z1x.P(objJ);
            pdu pduVar = new pdu(this, z, z3, z4, z2, null);
            mduVar.k = 1;
            objJ = d5c.J(mduVar, pduVar);
            if (objJ == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objJ);
        }
        return ((j0g0) objJ).f15681a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:12|13|72|22|23|68|24|(1:27)|64) */
    /* JADX WARN: Code duplicated, block: B:27:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:53:0x0111  */
    /* JADX WARN: Code duplicated, block: B:54:0x0113  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d2, code lost:
    
        r9 = r1;
        r11 = r2;
        r10 = r13;
        r12 = r14;
        r13 = r15;
        r8 = r16;
        r1 = r17;
        r2 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00de, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00df, code lost:
    
        r16 = r4;
        r17 = r8;
        r18 = r9;
        r4 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f4, code lost:
    
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0103, code lost:
    
        if ((r0 instanceof a.zhi0) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0105, code lost:
    
        r14 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010a, code lost:
    
        if (r14.f != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0111, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0113, code lost:
    
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0119, code lost:
    
        if (a.hic.C(r0) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011c, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011e, code lost:
    
        if (r2 > 3) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0123, code lost:
    
        java.lang.System.out.println((java.lang.Object) a.b1j.g(r2, "error (", "): ", r0));
        r1.l = r13;
        r1.m = r12;
        r1.n = r11;
        r1.i = r10;
        r1.j = r9;
        r1.k = r8;
        r1.o = r4;
        r1.p = r2;
        r1.s = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0148, code lost:
    
        if (a.qcc.O(3000, r1) == r3) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014b, code lost:
    
        r1 = a.j0g0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0153, code lost:
    
        return new a.g0g0(r0);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0148 -> B:13:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object C(boolean r22, java.lang.String r23, java.lang.String r24, boolean r25, boolean r26, a.zje r27) throws a.zhi0 {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wdu.C(boolean, java.lang.String, java.lang.String, boolean, boolean, a.zje):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:12|13|70|22|23|72|24|(1:27)|64) */
    /* JADX WARN: Code duplicated, block: B:27:0x0098  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
    
        r9 = r1;
        r11 = r2;
        r2 = r4;
        r1 = r12;
        r12 = r13;
        r10 = r14;
        r8 = r15;
        r4 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b3, code lost:
    
        r16 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0115, code lost:
    
        if (a.qcc.O(3000, r1) == r3) goto L64;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0115 -> B:13:0x003e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object D(boolean r18, java.lang.String r19, boolean r20, boolean r21, a.zje r22) throws a.zhi0 {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wdu.D(boolean, java.lang.String, boolean, boolean, a.zje):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:12|13|72|22|23|68|24|(1:27)|64) */
    /* JADX WARN: Code duplicated, block: B:27:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:53:0x0111  */
    /* JADX WARN: Code duplicated, block: B:54:0x0113  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d2, code lost:
    
        r9 = r1;
        r11 = r2;
        r10 = r13;
        r12 = r14;
        r13 = r15;
        r8 = r16;
        r1 = r17;
        r2 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00de, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00df, code lost:
    
        r16 = r4;
        r17 = r8;
        r18 = r9;
        r4 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f4, code lost:
    
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0103, code lost:
    
        if ((r0 instanceof a.zhi0) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0105, code lost:
    
        r14 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010a, code lost:
    
        if (r14.f != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0111, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0113, code lost:
    
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0119, code lost:
    
        if (a.hic.C(r0) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011c, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011e, code lost:
    
        if (r2 > 3) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0123, code lost:
    
        java.lang.System.out.println((java.lang.Object) a.b1j.g(r2, "error (", "): ", r0));
        r1.l = r13;
        r1.m = r12;
        r1.n = r11;
        r1.i = r10;
        r1.j = r9;
        r1.k = r8;
        r1.o = r4;
        r1.p = r2;
        r1.s = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0148, code lost:
    
        if (a.qcc.O(3000, r1) == r3) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014b, code lost:
    
        r1 = a.j0g0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0153, code lost:
    
        return new a.g0g0(r0);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0148 -> B:13:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object E(boolean r22, java.lang.String r23, java.lang.String r24, boolean r25, boolean r26, a.zje r27) throws a.zhi0 {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wdu.E(boolean, java.lang.String, java.lang.String, boolean, boolean, a.zje):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:30|31|97|32|33|(1:36)) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:13|14|91|102|28|(6:30|31|97|32|33|(1:36))(7:46|104|47|48|99|49|(1:52))|90) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:46|104|47|48|99|49|(1:52)) */
    /* JADX WARN: Code duplicated, block: B:30:0x009d A[Catch: all -> 0x00ed, TRY_LEAVE, TryCatch #3 {all -> 0x00ed, blocks: (B:28:0x0099, B:30:0x009d), top: B:102:0x0099 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:52:0x0129  */
    /* JADX WARN: Code duplicated, block: B:61:0x0142  */
    /* JADX WARN: Code duplicated, block: B:66:0x0150  */
    /* JADX WARN: Code duplicated, block: B:69:0x0155  */
    /* JADX WARN: Code duplicated, block: B:79:0x016b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x016d  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e2, code lost:
    
        r9 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e4, code lost:
    
        r12 = r1;
        r11 = r4;
        r4 = r7;
        r1 = r13;
        r10 = r15;
        r13 = r2;
        r2 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ed, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ee, code lost:
    
        r17 = r8;
        r8 = r10;
        r7 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0136, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0137, code lost:
    
        r13 = r25;
        r14 = r26;
        r9 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014d, code lost:
    
        r7 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015d, code lost:
    
        if ((r0 instanceof a.zhi0) != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x015f, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0164, code lost:
    
        if (r7.f != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x016b, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x016d, code lost:
    
        r7 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0174, code lost:
    
        if (a.hic.C(r0) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0177, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0179, code lost:
    
        if (r2 > 3) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x017e, code lost:
    
        java.lang.System.out.println((java.lang.Object) a.b1j.g(r2, "error (", "): ", r0));
        r1.m = r14;
        r1.n = r13;
        r1.i = r12;
        r1.j = r11;
        r1.k = r10;
        r1.l = r9;
        r1.o = r4;
        r1.p = r2;
        r1.s = 3;
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a3, code lost:
    
        if (a.qcc.O(3000, r1) == r3) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01aa, code lost:
    
        r1 = a.j0g0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b2, code lost:
    
        return new a.g0g0(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v4, types: [a.wdu] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [a.wdu] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x01a6 -> B:102:0x0099). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object F(boolean r22, boolean r23, java.lang.String r24, boolean r25, boolean r26, a.zje r27) throws a.zhi0 {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wdu.F(boolean, boolean, java.lang.String, boolean, boolean, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object G(int i, boolean z, boolean z2, zje zjeVar) {
        udu uduVar;
        if (zjeVar instanceof udu) {
            uduVar = (udu) zjeVar;
            int i2 = uduVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uduVar.k = i2 - Integer.MIN_VALUE;
            } else {
                uduVar = new udu(this, zjeVar);
            }
        } else {
            uduVar = new udu(this, zjeVar);
        }
        Object objJ = uduVar.i;
        wne wneVar = wne.f39444a;
        int i3 = uduVar.k;
        if (i3 == 0) {
            z1x.P(objJ);
            vdu vduVar = new vdu(this, z2, i, null);
            uduVar.k = 1;
            objJ = d5c.J(uduVar, vduVar);
            if (objJ == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objJ);
        }
        return ((j0g0) objJ).f15681a;
    }

    public void H(q55 q55Var, int i) {
        byte[] bArr;
        long j;
        m15 m15Var;
        String str;
        m15 m15Var2;
        int i2;
        vw3 vw3VarD;
        String str2;
        Integer numValueOf;
        g45 g45Var;
        final wdu wduVar = this;
        final q55 q55Var2 = q55Var;
        byte[] bArr2 = q55Var2.b;
        wpg0 wpg0Var = (wpg0) wduVar.g;
        los0 los0VarA = ((hd40) wduVar.c).a(q55Var2.f28133a);
        long jMax = 0;
        while (true) {
            final byte b = 0;
            if (!((Boolean) wpg0Var.l(new wzn0(wduVar) { // from class: a.ynt0
                public final /* synthetic */ wdu b;

                {
                    this.b = wduVar;
                }

                @Override // a.wzn0
                public final Object k() {
                    Boolean bool;
                    byte b2 = b;
                    q55 q55Var3 = q55Var2;
                    wdu wduVar2 = this.b;
                    switch (b2) {
                        case 0:
                            wpg0 wpg0Var2 = (wpg0) wduVar2.d;
                            SQLiteDatabase sQLiteDatabaseA = wpg0Var2.a();
                            sQLiteDatabaseA.beginTransaction();
                            try {
                                Long lC = wpg0.c(sQLiteDatabaseA, q55Var3);
                                if (lC == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = wpg0Var2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lC.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseA.setTransactionSuccessful();
                                sQLiteDatabaseA.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseA.endTransaction();
                                throw th2;
                            }
                        default:
                            wpg0 wpg0Var3 = (wpg0) wduVar2.d;
                            wpg0Var3.getClass();
                            return (Iterable) wpg0Var3.d(new uq(wpg0Var3, q55Var3, (byte) 28));
                    }
                }
            })).booleanValue()) {
                wpg0Var.l(new ord(wduVar, q55Var2, jMax));
                return;
            }
            final byte b2 = 1;
            Iterable iterable = (Iterable) wpg0Var.l(new wzn0(wduVar) { // from class: a.ynt0
                public final /* synthetic */ wdu b;

                {
                    this.b = wduVar;
                }

                @Override // a.wzn0
                public final Object k() {
                    Boolean bool;
                    byte b3 = b2;
                    q55 q55Var3 = q55Var2;
                    wdu wduVar2 = this.b;
                    switch (b3) {
                        case 0:
                            wpg0 wpg0Var2 = (wpg0) wduVar2.d;
                            SQLiteDatabase sQLiteDatabaseA = wpg0Var2.a();
                            sQLiteDatabaseA.beginTransaction();
                            try {
                                Long lC = wpg0.c(sQLiteDatabaseA, q55Var3);
                                if (lC == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = wpg0Var2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lC.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseA.setTransactionSuccessful();
                                sQLiteDatabaseA.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseA.endTransaction();
                                throw th2;
                            }
                        default:
                            wpg0 wpg0Var3 = (wpg0) wduVar2.d;
                            wpg0Var3.getClass();
                            return (Iterable) wpg0Var3.d(new uq(wpg0Var3, q55Var3, (byte) 28));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (los0VarA == null) {
                m8x.N(q55Var2, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                m15Var2 = new m15(3, -1L);
                bArr = bArr2;
                j = jMax;
            } else {
                ArrayList<q35> arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((o45) it.next()).c);
                }
                if (bArr2 != null) {
                    wpg0 wpg0Var2 = (wpg0) wduVar.j;
                    Objects.requireNonNull(wpg0Var2);
                    auc aucVar = (auc) wpg0Var.l(new xnt0(wpg0Var2, b));
                    ru ruVar = new ru();
                    ruVar.f = new HashMap();
                    ruVar.d = Long.valueOf(((quc) wduVar.h).getTime());
                    ruVar.e = Long.valueOf(((quc) wduVar.i).getTime());
                    ruVar.f31100a = "GDT_CLIENT_METRICS";
                    gwn gwnVar = new gwn("proto");
                    aucVar.getClass();
                    j910 j910Var = s4d0.f31600a;
                    j910Var.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        j910Var.f(aucVar, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    ruVar.c = new zvn(gwnVar, byteArrayOutputStream.toByteArray());
                    arrayList.add(((k8b) los0VarA).a(ruVar.b()));
                }
                k8b k8bVar = (k8b) los0VarA;
                HashMap map = new HashMap();
                for (q35 q35Var : arrayList) {
                    String str3 = q35Var.f28034a;
                    if (map.containsKey(str3)) {
                        ((List) map.get(str3)).add(q35Var);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(q35Var);
                        map.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    q35 q35Var2 = (q35) ((List) entry.getValue()).get(0);
                    xed0 xed0Var = xed0.f40741a;
                    long time = k8bVar.f.getTime();
                    long time2 = k8bVar.e.getTime();
                    s15 s15Var = new s15(new k15(Integer.valueOf(q35Var2.b("sdk-version")), q35Var2.a("model"), q35Var2.a("hardware"), q35Var2.a("device"), q35Var2.a("product"), q35Var2.a("os-uild"), q35Var2.a("manufacturer"), q35Var2.a(HiAnalyticsConstant.HaKey.BI_KEY_FINGERPRINT), q35Var2.a("locale"), q35Var2.a("country"), q35Var2.a("mcc_mnc"), q35Var2.a("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (q35 q35Var3 : (List) entry.getValue()) {
                        byte[] bArr3 = bArr2;
                        zvn zvnVar = q35Var3.c;
                        byte[] bArr4 = q35Var3.j;
                        gwn gwnVar2 = zvnVar.f45066a;
                        byte[] bArr5 = zvnVar.b;
                        long j2 = jMax;
                        if (gwnVar2.equals(new gwn("proto"))) {
                            g45Var = new g45();
                            g45Var.f = bArr5;
                        } else {
                            if (gwnVar2.equals(new gwn("json"))) {
                                String str4 = new String(bArr5, Charset.forName("UTF-8"));
                                g45 g45Var2 = new g45();
                                g45Var2.g = str4;
                                g45Var = g45Var2;
                            } else {
                                String strY = m8x.Y("CctTransportBackend");
                                if (Log.isLoggable(strY, 5)) {
                                    Log.w(strY, "Received event of unsupported encoding " + gwnVar2 + ". Skipping...");
                                }
                            }
                            bArr2 = bArr3;
                            jMax = j2;
                        }
                        g45Var.f10647a = Long.valueOf(q35Var3.d);
                        g45Var.b = Long.valueOf(q35Var3.e);
                        String str5 = (String) q35Var3.f.get("tz-offset");
                        g45Var.c = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        g45Var.h = new k45((rk50) rk50.f30632a.get(q35Var3.b("net-type")), (qk50) qk50.f28869a.get(q35Var3.b("mobile-subtype")));
                        Integer num = q35Var3.b;
                        if (num != null) {
                            g45Var.d = num;
                        }
                        Integer num2 = q35Var3.g;
                        if (num2 != null) {
                            u35 u35Var = new u35(new t35(num2));
                            lfd lfdVar = lfd.f19949a;
                            g45Var.e = new t15(u35Var);
                        }
                        byte[] bArr6 = q35Var3.i;
                        if (bArr6 != null || bArr4 != null) {
                            if (bArr6 == null) {
                                bArr6 = null;
                            }
                            g45Var.i = new s35(bArr6, bArr4 != null ? bArr4 : null);
                        }
                        String strConcat = ((Long) g45Var.f10647a) == null ? " eventTimeMs" : "";
                        if (((Long) g45Var.b) == null) {
                            strConcat = strConcat.concat(" eventUptimeMs");
                        }
                        if (((Long) g45Var.c) == null) {
                            strConcat = strConcat.concat(" timezoneOffsetSeconds");
                        }
                        if (!strConcat.isEmpty()) {
                            jf4.n("Missing required properties:".concat(strConcat));
                            return;
                        } else {
                            arrayList4.add(new h45(((Long) g45Var.f10647a).longValue(), (Integer) g45Var.d, (t15) g45Var.e, ((Long) g45Var.b).longValue(), (byte[]) g45Var.f, (String) g45Var.g, ((Long) g45Var.c).longValue(), (k45) g45Var.h, (s35) g45Var.i));
                            bArr2 = bArr3;
                            jMax = j2;
                        }
                    }
                    arrayList3.add(new i45(time, time2, s15Var, numValueOf, str2, arrayList4));
                }
                bArr = bArr2;
                j = jMax;
                n15 n15Var = new n15(arrayList3);
                URL urlB = k8bVar.d;
                if (bArr != null) {
                    try {
                        ug9 ug9VarA = ug9.a(bArr);
                        str = ug9VarA.b;
                        if (str == null) {
                            str = null;
                        }
                        String str6 = ug9VarA.f35614a;
                        if (str6 != null) {
                            urlB = k8b.b(str6);
                        }
                    } catch (IllegalArgumentException unused3) {
                        m15Var = new m15(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    es esVar = new es(urlB, n15Var, str);
                    gne gneVar = new gne(k8bVar, (byte) 24);
                    int i3 = 5;
                    do {
                        vw3VarD = gneVar.d(esVar);
                        URL url = (URL) vw3VarD.c;
                        if (url != null) {
                            m8x.N(url, "CctTransportBackend", "Following redirect to: %s");
                            esVar = new es(url, (n15) esVar.b, (String) esVar.c);
                        } else {
                            esVar = null;
                        }
                        if (esVar == null) {
                            break;
                        } else {
                            i3--;
                        }
                    } while (i3 >= 1);
                    int i4 = vw3VarD.f38129a;
                    if (i4 == 200) {
                        m15Var2 = new m15(1, vw3VarD.b);
                    } else {
                        if (i4 >= 500 || i4 == 404) {
                            m15Var = new m15(2, -1L);
                        } else if (i4 == 400) {
                            try {
                                m15Var = new m15(4, -1L);
                            } catch (IOException e) {
                                e = e;
                                m8x.O(e, "CctTransportBackend", "Could not make request to the backend");
                                i2 = 2;
                                m15Var2 = new m15(2, -1L);
                            }
                        } else {
                            m15Var = new m15(3, -1L);
                        }
                        m15Var2 = m15Var;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            }
            i2 = 2;
            int i5 = m15Var2.f20988a;
            if (i5 == i2) {
                wpg0Var.l(new h3k(this, iterable, q55Var, j));
                ((y3v) this.e).v(q55Var, i + 1, true);
                return;
            }
            wduVar = this;
            q55Var2 = q55Var;
            long j3 = j;
            wpg0Var.l(new lmn0(wduVar, iterable, (byte) 4));
            if (i5 == 1) {
                jMax = Math.max(j3, m15Var2.b);
                if (bArr != null) {
                    wpg0Var.l(new b0l0(wduVar, (byte) 28));
                }
            } else {
                if (i5 == 4) {
                    HashMap map2 = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String str7 = ((o45) it2.next()).c.f28034a;
                        if (map2.containsKey(str7)) {
                            map2.put(str7, Integer.valueOf(((Integer) map2.get(str7)).intValue() + 1));
                        } else {
                            map2.put(str7, 1);
                        }
                    }
                    wpg0Var.l(new lmn0(wduVar, map2, (byte) 5));
                }
                jMax = j3;
            }
            bArr2 = bArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object I(String str, oa20 oa20Var, zje zjeVar) {
        tn20 tn20Var;
        r7v r7vVar;
        Object objA;
        String str2;
        oa20 oa20Var2;
        r7v r7vVar2;
        boolean z;
        if (zjeVar instanceof tn20) {
            tn20Var = (tn20) zjeVar;
            int i = tn20Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                tn20Var.o = i - Integer.MIN_VALUE;
            } else {
                tn20Var = new tn20(this, zjeVar);
            }
        } else {
            tn20Var = new tn20(this, zjeVar);
        }
        Object obj = tn20Var.m;
        wne wneVar = wne.f39444a;
        int i2 = tn20Var.o;
        if (i2 == 0) {
            z1x.P(obj);
            r7vVar = (r7v) this.d;
            nrt nrtVar = (nrt) this.e;
            long j = oa20Var.e;
            tn20Var.i = str;
            tn20Var.j = oa20Var;
            tn20Var.k = r7vVar;
            tn20Var.o = 1;
            objA = nrt.a(nrtVar, j, tn20Var);
            if (objA != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            r7v r7vVar3 = tn20Var.k;
            oa20Var = tn20Var.j;
            String str3 = tn20Var.i;
            z1x.P(obj);
            r7vVar = r7vVar3;
            str = str3;
            objA = obj;
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z2 = tn20Var.l;
            r7v r7vVar4 = tn20Var.k;
            oa20Var2 = tn20Var.j;
            String str4 = tn20Var.i;
            z1x.P(obj);
            z = z2;
            r7vVar2 = r7vVar4;
            str2 = str4;
        }
        r7vVar2.e("standart", str2, false, z, ((Boolean) obj).booleanValue());
        ony onyVar = (ony) this.c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("betUniqueToken", ncy.c(""));
        linkedHashMap.put("betQuickBet", ncy.a(Boolean.FALSE));
        linkedHashMap.put("betClickTime", ncy.b(new Long(System.currentTimeMillis())));
        linkedHashMap.put("betGUID", ncy.c(""));
        linkedHashMap.put("betCouponId", ncy.c(oa20Var2.f24910a));
        linkedHashMap.put("betVid", ncy.c(str2));
        ((rny) onyVar).a("BetEvResponse", new tny("logBetResponse", xp20.n(linkedHashMap)));
        return Unit.f46060a;
        boolean zA = ((ql5) objA).i.a();
        mrt mrtVar = (mrt) this.f;
        tn20Var.i = str;
        tn20Var.j = oa20Var;
        tn20Var.k = r7vVar;
        tn20Var.l = zA;
        tn20Var.o = 2;
        Object objA2 = mrtVar.a(tn20Var);
        if (objA2 != wneVar) {
            str2 = str;
            oa20Var2 = oa20Var;
            r7vVar2 = r7vVar;
            obj = objA2;
            z = zA;
            r7vVar2.e("standart", str2, false, z, ((Boolean) obj).booleanValue());
            ony onyVar2 = (ony) this.c;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("betUniqueToken", ncy.c(""));
            linkedHashMap2.put("betQuickBet", ncy.a(Boolean.FALSE));
            linkedHashMap2.put("betClickTime", ncy.b(new Long(System.currentTimeMillis())));
            linkedHashMap2.put("betGUID", ncy.c(""));
            linkedHashMap2.put("betCouponId", ncy.c(oa20Var2.f24910a));
            linkedHashMap2.put("betVid", ncy.c(str2));
            ((rny) onyVar2).a("BetEvResponse", new tny("logBetResponse", xp20.n(linkedHashMap2)));
            return Unit.f46060a;
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x023c A[EDGE_INSN: B:113:0x023c->B:89:0x023c BREAK  A[LOOP:0: B:76:0x0202->B:116:0x0202], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x021c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0238 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:? A[LOOP:1: B:84:0x0220->B:120:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0161  */
    /* JADX WARN: Code duplicated, block: B:78:0x020a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0215  */
    /* JADX WARN: Code duplicated, block: B:86:0x0226  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0251 A[LOOP:2: B:90:0x024b->B:92:0x0251, LOOP_END] */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x029f, code lost:
    
        if (r0 == r10) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object J(a.nw40 r27, long r28, a.zje r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wdu.J(a.nw40, long, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object a(u3z u3zVar, Long l, zje zjeVar) {
        w2z w2zVar;
        Object g0g0Var;
        long jLongValue;
        Object g0g0Var2;
        boolean z;
        boolean z2;
        Long l2;
        u3z u3zVar2 = u3zVar;
        if (zjeVar instanceof w2z) {
            w2zVar = (w2z) zjeVar;
            int i = w2zVar.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                w2zVar.p = i - Integer.MIN_VALUE;
            } else {
                w2zVar = new w2z(this, zjeVar);
            }
        } else {
            w2zVar = new w2z(this, zjeVar);
        }
        Object obj = w2zVar.n;
        wne wneVar = wne.f39444a;
        int i2 = w2zVar.p;
        if (i2 == 0) {
            z1x.P(obj);
            try {
                e0g0 e0g0Var = j0g0.b;
                g0g0Var = new Long(((x1u) this.d).a());
            } catch (Throwable th) {
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
            Object l3 = new Long(0L);
            if (g0g0Var instanceof g0g0) {
                g0g0Var = l3;
            }
            jLongValue = ((Number) g0g0Var).longValue();
            t3z t3zVar = u3zVar2.b;
            t3zVar.getClass();
            boolean z3 = t3zVar == t3z.c;
            try {
                g0g0Var2 = Boolean.valueOf(((x1u) this.e).f40137a.d(z3));
            } catch (Throwable th2) {
                e0g0 e0g0Var3 = j0g0.b;
                g0g0Var2 = new g0g0(th2);
            }
            Object obj2 = Boolean.FALSE;
            if (g0g0Var2 instanceof g0g0) {
                g0g0Var2 = obj2;
            }
            boolean zBooleanValue = ((Boolean) g0g0Var2).booleanValue();
            x0u x0uVar = (x0u) this.f;
            w2zVar.i = u3zVar2;
            w2zVar.j = l;
            w2zVar.k = jLongValue;
            w2zVar.l = z3;
            w2zVar.m = zBooleanValue;
            w2zVar.p = 1;
            Object objC = x0uVar.c(w2zVar);
            if (objC == wneVar) {
                return wneVar;
            }
            z = zBooleanValue;
            obj = objC;
            z2 = z3;
            l2 = l;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z4 = w2zVar.m;
            boolean z5 = w2zVar.l;
            jLongValue = w2zVar.k;
            Long l4 = w2zVar.j;
            u3z u3zVar3 = w2zVar.i;
            z1x.P(obj);
            z = z4;
            u3zVar2 = u3zVar3;
            z2 = z5;
            l2 = l4;
        }
        return new rh6(u3zVar2.f35019a, jLongValue, z, u3zVar2.c, l2, new are(((Number) obj).intValue(), !((iqt) this.c).f15225a.a()), z2);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b6, code lost:
    
        if (r9 == r10) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(a.zje r10) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wdu.c(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    /* JADX WARN: Code duplicated, block: B:53:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[LOOP:0: B:28:0x006f->B:55:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00a3 -> B:42:0x00a6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object d(java.util.List r11, a.zje r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof a.zgf0
            if (r0 == 0) goto L13
            r0 = r12
            a.zgf0 r0 = (a.zgf0) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            a.zgf0 r0 = new a.zgf0
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.k
            a.wne r1 = a.wne.f39444a
            int r2 = r0.m
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2e
            java.util.Iterator r11 = r0.j
            java.util.List r2 = r0.i
            a.z1x.P(r12)
            goto La6
        L2e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r10)
            return r3
        L34:
            a.z1x.P(r12)
            java.lang.Object r12 = r10.e
            a.hst r12 = (a.hst) r12
            a.oif0 r12 = r12.f13600a
            java.util.List r12 = r12.n()
            if (r12 == 0) goto L4c
            boolean r2 = r12.isEmpty()
            if (r2 == 0) goto L4c
        L49:
            r4 = r5
            goto Lb3
        L4c:
            java.util.Iterator r12 = r12.iterator()
            r9 = r12
            r12 = r11
            r11 = r9
        L53:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L49
            java.lang.Object r2 = r11.next()
            a.hf6 r2 = (a.hf6) r2
            java.util.List r6 = r2.c
            if (r6 == 0) goto L6b
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L6b
        L69:
            r6 = r5
            goto L86
        L6b:
            java.util.Iterator r6 = r6.iterator()
        L6f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L69
            java.lang.Object r7 = r6.next()
            java.lang.Number r7 = (java.lang.Number) r7
            long r7 = r7.longValue()
            boolean r7 = a.axq.y(r7, r12)
            if (r7 == 0) goto L6f
            r6 = r4
        L86:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)
            if (r6 == 0) goto L8d
            goto L8e
        L8d:
            r7 = r3
        L8e:
            if (r7 == 0) goto Lac
            java.lang.Object r6 = r10.h
            a.lhf0 r6 = (a.lhf0) r6
            int r2 = r2.f12958a
            r0.i = r12
            r0.j = r11
            r0.m = r4
            java.lang.Enum r2 = r6.v(r2, r0)
            if (r2 != r1) goto La3
            return r1
        La3:
            r9 = r2
            r2 = r12
            r12 = r9
        La6:
            a.u4k r6 = a.u4k.f35053a
            if (r12 == r6) goto Lad
            r12 = r4
            goto Lae
        Lac:
            r2 = r12
        Lad:
            r12 = r5
        Lae:
            if (r12 == 0) goto Lb1
            goto Lb3
        Lb1:
            r12 = r2
            goto L53
        Lb3:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r4)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wdu.d(java.util.List, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(LimitTypeEnum limitTypeEnum, List list, zje zjeVar) {
        jhu jhuVar;
        if (zjeVar instanceof jhu) {
            jhuVar = (jhu) zjeVar;
            int i = jhuVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                jhuVar.l = i - Integer.MIN_VALUE;
            } else {
                jhuVar = new jhu(this, zjeVar);
            }
        } else {
            jhuVar = new jhu(this, zjeVar);
        }
        Object objE = jhuVar.j;
        Object obj = wne.f39444a;
        int i2 = jhuVar.l;
        boolean z = false;
        Object obj2 = null;
        if (i2 == 0) {
            z1x.P(objE);
            ucq ucqVar = ((sff0) this.j).f;
            if (ucqVar.e || ucqVar.p) {
                xqt xqtVar = (xqt) this.b;
                jhuVar.i = limitTypeEnum;
                jhuVar.l = 1;
                objE = xqtVar.b.E(jhuVar);
                if (objE == obj) {
                    return obj;
                }
            } else {
                for (Object obj3 : list) {
                    if (((kzz) obj3).f19172a == limitTypeEnum) {
                        obj2 = obj3;
                        break;
                    }
                }
                if (obj2 != null) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        limitTypeEnum = jhuVar.i;
        z1x.P(objE);
        for (Object obj4 : (Iterable) objE) {
            if (((h85) obj4).b == limitTypeEnum) {
                obj2 = obj4;
                break;
            }
        }
        if (obj2 != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public dnq f(long j, boolean z, long j2) {
        return new dnq(bkb.j0(((hsj) this.c).k(j, j2 != 0 ? kotlin.collections.a.c(String.valueOf(j2)) : iun.f15405a, iun.f15405a, ((ntu) this.i).a(), 8, z), "GetPopularGamesCategoriesScenarioImpl.getGames", null, 56), new oz0(3, null, (byte) 11), (byte) 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e0, code lost:
    
        if (r4 == r7) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00fe, code lost:
    
        if (r4 == r7) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable g(boolean r17, long r18, long r20, boolean r22, a.jvn r23, long r24, a.zje r26) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wdu.g(boolean, long, long, boolean, a.jvn, long, a.zje):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a2, code lost:
    
        if (r4 == r8) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
    
        if (r4 == r8) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable h(java.util.List r21, boolean r22, int r23, long r24, long r26, a.j8p r28, boolean r29, java.lang.String r30, a.zje r31) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wdu.h(java.util.List, boolean, int, long, long, a.j8p, boolean, java.lang.String, a.zje):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Serializable i(ygq0 ygq0Var, int i, Set set, jvn jvnVar, boolean z, long j, Set set2, long j2, Pair pair, zje zjeVar) {
        c700 c700Var;
        long j3;
        if (zjeVar instanceof c700) {
            c700Var = (c700) zjeVar;
            int i2 = c700Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c700Var.l = i2 - Integer.MIN_VALUE;
            } else {
                c700Var = new c700(this, zjeVar);
            }
        } else {
            c700Var = new c700(this, zjeVar);
        }
        Object objA = c700Var.j;
        wne wneVar = wne.f39444a;
        int i3 = c700Var.l;
        if (i3 == 0) {
            z1x.P(objA);
            long jLongValue = ((Number) pair.f46059a).longValue();
            if (j2 >= jLongValue) {
                jLongValue = -1;
            }
            long jLongValue2 = ((Number) pair.b).longValue();
            ygq0 ygq0Var2 = ygq0.CUSTOM_DATE;
            if (ygq0Var == ygq0Var2 && j2 > jLongValue2) {
                return iun.f15405a;
            }
            Pair pair2 = new Pair(new Long(jLongValue), new Long(jLongValue2));
            c700Var.i = j2;
            c700Var.l = 1;
            cad cadVar = (cad) this.c;
            knf0 knf0Var = (knf0) this.f;
            String strC = knf0Var.c();
            int iB = knf0Var.b();
            ygq0Var.getClass();
            set.getClass();
            jvnVar.getClass();
            set2.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            e3c.o(linkedHashMap, jvnVar);
            e3c.p(linkedHashMap, set);
            if (i != 0) {
                ulb.m0(linkedHashMap, i);
            }
            ulb.K(iB, linkedHashMap);
            e3c.u(linkedHashMap, set2);
            if (ygq0Var == ygq0Var2) {
                ulb.J(linkedHashMap, pair2);
            }
            ulb.P(linkedHashMap);
            ulb.V(linkedHashMap, strC);
            ulb.X(linkedHashMap, ygq0Var);
            linkedHashMap.put("mode", 2);
            linkedHashMap.put("ref", 1);
            ulb.l0(linkedHashMap, z, j);
            tlb.m0(22, linkedHashMap);
            objA = ((q6t) ((wgn) cadVar.b).invoke()).a(new TreeMap(linkedHashMap), c700Var);
            if (objA == wneVar) {
                return wneVar;
            }
            j3 = j2;
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j3 = c700Var.i;
            z1x.P(objA);
        }
        Iterable iterable = (Iterable) ((dx5) objA).a();
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(v3c.g0((a4t) it.next(), sip.b, j3));
        }
        return r3d.r(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
    
        if (r2 == r6) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b5, code lost:
    
        if (r2 == r6) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable j(java.util.List r19, boolean r20, int r21, long r22, a.j8p r24, boolean r25, java.lang.String r26, a.zje r27) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wdu.j(java.util.List, boolean, int, long, a.j8p, boolean, java.lang.String, a.zje):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable k(boolean z, j700 j700Var, int i, Set set, jvn jvnVar, boolean z2, long j, Set set2, boolean z3, zje zjeVar) {
        e700 e700Var;
        if (zjeVar instanceof e700) {
            e700Var = (e700) zjeVar;
            int i2 = e700Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e700Var.k = i2 - Integer.MIN_VALUE;
            } else {
                e700Var = new e700(this, zjeVar);
            }
        } else {
            e700Var = new e700(this, zjeVar);
        }
        Object objA = e700Var.i;
        wne wneVar = wne.f39444a;
        int i3 = e700Var.k;
        if (i3 == 0) {
            z1x.P(objA);
            e700Var.k = 1;
            a7q a7qVar = (a7q) this.d;
            knf0 knf0Var = (knf0) this.f;
            String strC = knf0Var.c();
            int iB = knf0Var.b();
            j700Var.getClass();
            set.getClass();
            jvnVar.getClass();
            set2.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            e3c.o(linkedHashMap, jvnVar);
            e3c.p(linkedHashMap, set);
            if (i != 0) {
                ulb.m0(linkedHashMap, i);
            }
            ulb.K(iB, linkedHashMap);
            e3c.u(linkedHashMap, set2);
            ulb.P(linkedHashMap);
            ulb.S(linkedHashMap, z);
            ulb.V(linkedHashMap, strC);
            linkedHashMap.put("mode", 2);
            linkedHashMap.put("ref", 1);
            ulb.l0(linkedHashMap, z2, j);
            tlb.m0(22, linkedHashMap);
            objA = ((c7t) ((wgn) a7qVar.f384a).invoke()).a(new TreeMap(linkedHashMap), e700Var);
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
        Iterable iterable = (Iterable) ((dx5) objA).a();
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(n4c.U((d4t) it.next(), sip.c));
        }
        return r3d.r(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object l(gu1 gu1Var, boolean z, zje zjeVar) {
        l2v l2vVar;
        Object g0g0Var;
        if (zjeVar instanceof l2v) {
            l2vVar = (l2v) zjeVar;
            int i = l2vVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                l2vVar.l = i - Integer.MIN_VALUE;
            } else {
                l2vVar = new l2v(this, zjeVar);
            }
        } else {
            l2vVar = new l2v(this, zjeVar);
        }
        Object objM = l2vVar.j;
        wne wneVar = wne.f39444a;
        int i2 = l2vVar.l;
        yje yjeVar = null;
        byte b = 1;
        try {
            if (i2 == 0) {
                z1x.P(objM);
                e0g0 e0g0Var = j0g0.b;
                byte b2 = 3;
                dnq dnqVar = new dnq(uvw.Q(dub.f0(new dnq(uvw.Q(new vsg0(new n2v(this, gu1Var, yjeVar, (byte) 0)), true), new oz0(b2, yjeVar, (byte) 20), b), new dnq(uvw.Q(new vsg0(new n2v(this, gu1Var, yjeVar, b)), true), new oz0(b2, yjeVar, (byte) 21), b), new dnq(uvw.Q(new vsg0(new we5(this, gu1Var, yjeVar, b2)), true), new rl2(b2, yjeVar, (byte) 25), b), new tvu(gu1Var, this, yjeVar, b)), true), new sot((Object) gu1Var, yjeVar, (byte) 18), b);
                l2vVar.i = gu1Var;
                l2vVar.l = 1;
                objM = ntb.M(dnqVar, l2vVar);
                if (objM == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gu1Var = l2vVar.i;
                z1x.P(objM);
            }
            g0g0Var = (gu1) objM;
            if (g0g0Var == null) {
                throw new IllegalArgumentException();
            }
            e0g0 e0g0Var2 = j0g0.b;
            return g0g0Var instanceof g0g0 ? gu1Var : g0g0Var;
        } catch (Throwable th) {
            if ((th instanceof SocketTimeoutException) || (th instanceof ConnectException) || (th instanceof UnknownHostException) || (th instanceof CancellationException) || (th instanceof u660)) {
                throw th;
            }
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object m(gu1 gu1Var, zje zjeVar) {
        m2v m2vVar;
        Object g0g0Var;
        if (zjeVar instanceof m2v) {
            m2vVar = (m2v) zjeVar;
            int i = m2vVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                m2vVar.l = i - Integer.MIN_VALUE;
            } else {
                m2vVar = new m2v(this, zjeVar);
            }
        } else {
            m2vVar = new m2v(this, zjeVar);
        }
        Object objM = m2vVar.j;
        wne wneVar = wne.f39444a;
        int i2 = m2vVar.l;
        yje yjeVar = null;
        byte b = 1;
        try {
            if (i2 == 0) {
                z1x.P(objM);
                e0g0 e0g0Var = j0g0.b;
                int i3 = 3;
                a1g a1gVarQ = uvw.Q(new dnq(new p6d(new dnq(uvw.Q(new vsg0(new we5(this, gu1Var, yjeVar, (byte) 4)), true), new oz0(i3, yjeVar, (byte) 22), b), new dnq(uvw.Q(new vsg0(new n2v(this, gu1Var, yjeVar, (byte) 0)), true), new oz0(i3, yjeVar, (byte) 20), b), new wx4((Object) gu1Var, yjeVar, (byte) 18), b), new ko0((Object) gu1Var, yjeVar, (byte) 24), b), true);
                m2vVar.i = gu1Var;
                m2vVar.l = 1;
                objM = ntb.M(a1gVarQ, m2vVar);
                if (objM == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gu1Var = m2vVar.i;
                z1x.P(objM);
            }
            g0g0Var = (gu1) objM;
            if (g0g0Var == null) {
                throw new IllegalArgumentException();
            }
            e0g0 e0g0Var2 = j0g0.b;
            return g0g0Var instanceof g0g0 ? gu1Var : g0g0Var;
        } catch (Throwable th) {
            if ((th instanceof SocketTimeoutException) || (th instanceof ConnectException) || (th instanceof UnknownHostException) || (th instanceof CancellationException) || (th instanceof u660)) {
                throw th;
            }
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object n(int i, long j, zje zjeVar, boolean z) {
        cou couVar;
        Object g0g0Var;
        if (zjeVar instanceof cou) {
            couVar = (cou) zjeVar;
            int i2 = couVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                couVar.k = i2 - Integer.MIN_VALUE;
            } else {
                couVar = new cou(this, zjeVar);
            }
        } else {
            couVar = new cou(this, zjeVar);
        }
        Object objM = couVar.i;
        wne wneVar = wne.f39444a;
        int i3 = couVar.k;
        byte b = 1;
        yje yjeVar = null;
        try {
            if (i3 == 0) {
                z1x.P(objM);
                e0g0 e0g0Var = j0g0.b;
                hsj hsjVar = (hsj) this.c;
                iun iunVar = iun.f15405a;
                dnq dnqVar = new dnq(bkb.j0(hsjVar.k(j, iunVar, iunVar, ((ntu) this.i).a(), i, z), "GetPopularGamesCategoriesScenarioImpl.getVirtualGames", null, 56), new oz0(3, yjeVar, (byte) 12), b);
                couVar.k = 1;
                objM = ntb.M(dnqVar, couVar);
                if (objM == wneVar) {
                    return wneVar;
                }
            } else {
                if (i3 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objM);
            }
            g0g0Var = (List) objM;
            if (g0g0Var == null) {
                g0g0Var = iun.f15405a;
            }
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            if ((th instanceof SocketTimeoutException) || (th instanceof ConnectException) || (th instanceof UnknownHostException) || (th instanceof CancellationException) || (th instanceof u660)) {
                throw th;
            }
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        return g0g0Var instanceof g0g0 ? iun.f15405a : g0g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0128, code lost:
    
        if (r10.J(r11, r12, r0) == r1) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(a.zje r11, java.lang.String r12, java.util.List r13) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wdu.o(a.zje, java.lang.String, java.util.List):java.lang.Object");
    }

    public utb p(String str, boolean z, boolean z2, boolean z3) {
        str.getClass();
        v8v v8vVar = (v8v) ((gxu) ((yk50) this.g).b).c;
        (z2 ? v8vVar.f37005a : v8vVar.b).a();
        hie0 hie0Var = new hie0();
        hie0Var.f13108a = z;
        yje yjeVar = null;
        byte b = 0;
        byte b2 = 22;
        return aoq.c(aoq.b(new i89(uvw.P(new a1g(new qqu(new vsg0(new fsu(this, z2, str, (yje) null)), hie0Var, (byte) 2), new gsu(this, z2, yjeVar, b), (byte) 20), new lqu(hie0Var, (byte) 2), 60L, new hsu(this, yjeVar, b), new isu(this, z2, yjeVar, b), null, 40), b2), uvw.O(new i89(((ocl) this.c).f(z2), b2), new hsu(this, yjeVar, (byte) 1), new oz0(3, yjeVar, (byte) 15))), new b9u(null, z2, this, z3));
    }

    public utb q(boolean z, long j) {
        return aoq.c(new vsg0(new atj(this, null, (byte) 24)), new i0v((yje) null, this, j, z));
    }

    public utb r(boolean z, boolean z2) {
        hl1 hl1Var = ((pru) this.j).a().b;
        byte b = 1;
        yje yjeVar = null;
        if (z) {
            boolean z3 = hl1Var.N;
            return aoq.c(new vsg0(new unu(null, this, z3)), new snu(yjeVar, this, z3, b));
        }
        boolean z4 = hl1Var.N;
        if (z2) {
            return aoq.c(aoq.a(i120.W(new a1t(((ort) this.d).a(), (byte) 19)), new wz0((yje) null, this, z4)), new snu(yjeVar, this, z4, b));
        }
        nw80 nw80Var = nw80.b;
        dnq dnqVarF = f(nw80Var.getId(), z4, 89L);
        nw80 nw80Var2 = nw80.f24223a;
        return aoq.c(dub.e0(dnqVarF, f(nw80Var2.getId(), z4, 75L), f(nw80Var.getId(), z4, 17L), f(nw80Var2.getId(), z4, 17L), new lxt(this, yjeVar, (byte) 2)), new snu(yjeVar, this, z4, (byte) 0));
    }

    public utb s(boolean z, boolean z2, boolean z3, Function1 function1) {
        hie0 hie0Var = new hie0();
        if (z2) {
            ((yqc) this.g).w(y9s.f42264a);
        }
        yje yjeVar = null;
        vsg0 vsg0Var = new vsg0(new fsu(z, this, function1, (yje) null));
        i89 i89Var = new i89(new p1v(new i89(((w5z) ((ivn) this.e).f15453a).r(y9s.f42264a), (byte) 23), hie0Var, (byte) 0), (byte) 22);
        byte b = 1;
        if (function1 == null) {
            function1 = new i1v(this, yjeVar, b);
        }
        return aoq.c(aoq.b(vsg0Var, uvw.O(i89Var, function1, new oz0(3, yjeVar, (byte) 18))), new xpp(yjeVar, (Object) this, z3, (byte) 12));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:104:0x0203  */
    /* JADX WARN: Code duplicated, block: B:105:0x0208  */
    /* JADX WARN: Code duplicated, block: B:108:0x020e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0217  */
    /* JADX WARN: Code duplicated, block: B:112:0x021d  */
    /* JADX WARN: Code duplicated, block: B:115:0x022b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0234  */
    /* JADX WARN: Code duplicated, block: B:119:0x023a A[PHI: r0 r13 r14
  0x023a: PHI (r0v9 java.util.List) = (r0v6 java.util.List), (r0v10 java.util.List) binds: [B:117:0x0236, B:14:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x023a: PHI (r13v15 java.util.List) = (r13v12 java.util.List), (r13v16 java.util.List) binds: [B:117:0x0236, B:14:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x023a: PHI (r14v78 java.lang.Object) = (r14v70 java.lang.Object), (r14v1 java.lang.Object) binds: [B:117:0x0236, B:14:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:121:0x0242  */
    /* JADX WARN: Code duplicated, block: B:124:0x025a  */
    /* JADX WARN: Code duplicated, block: B:126:0x025e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0270 A[PHI: r0 r13 r14
  0x0270: PHI (r0v11 java.util.List) = (r0v9 java.util.List), (r0v12 java.util.List) binds: [B:130:0x026d, B:13:0x0039] A[DONT_GENERATE, DONT_INLINE]
  0x0270: PHI (r13v17 java.util.List) = (r13v15 java.util.List), (r13v19 java.util.List) binds: [B:130:0x026d, B:13:0x0039] A[DONT_GENERATE, DONT_INLINE]
  0x0270: PHI (r14v92 java.lang.Object) = (r14v87 java.lang.Object), (r14v1 java.lang.Object) binds: [B:130:0x026d, B:13:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:134:0x0278  */
    /* JADX WARN: Code duplicated, block: B:137:0x0292 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x0294  */
    /* JADX WARN: Code duplicated, block: B:140:0x029e  */
    /* JADX WARN: Code duplicated, block: B:144:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:147:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:150:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:153:0x017d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x017e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:41:0x0101  */
    /* JADX WARN: Code duplicated, block: B:42:0x0102 A[PHI: r9
  0x0102: PHI (r9v1 boolean) = (r9v0 boolean), (r9v2 boolean) binds: [B:38:0x00f4, B:41:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x010a A[PHI: r4 r8 r13 r14
  0x010a: PHI (r4v12 java.util.List) = (r4v10 java.util.List), (r4v13 java.util.List) binds: [B:43:0x0106, B:19:0x0075] A[DONT_GENERATE, DONT_INLINE]
  0x010a: PHI (r8v6 java.util.List) = (r8v4 java.util.List), (r8v7 java.util.List) binds: [B:43:0x0106, B:19:0x0075] A[DONT_GENERATE, DONT_INLINE]
  0x010a: PHI (r13v4 java.util.List) = (r13v2 java.util.List), (r13v5 java.util.List) binds: [B:43:0x0106, B:19:0x0075] A[DONT_GENERATE, DONT_INLINE]
  0x010a: PHI (r14v20 java.lang.Object) = (r14v10 java.lang.Object), (r14v1 java.lang.Object) binds: [B:43:0x0106, B:19:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x0112  */
    /* JADX WARN: Code duplicated, block: B:49:0x0116  */
    /* JADX WARN: Code duplicated, block: B:50:0x011c  */
    /* JADX WARN: Code duplicated, block: B:54:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0141  */
    /* JADX WARN: Code duplicated, block: B:56:0x014a  */
    /* JADX WARN: Code duplicated, block: B:57:0x014c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0150 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0152  */
    /* JADX WARN: Code duplicated, block: B:61:0x015b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x015d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0167  */
    /* JADX WARN: Code duplicated, block: B:67:0x0174  */
    /* JADX WARN: Code duplicated, block: B:77:0x0188  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x0191  */
    /* JADX WARN: Code duplicated, block: B:82:0x0195  */
    /* JADX WARN: Code duplicated, block: B:83:0x019b  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:90:0x01bc A[PHI: r4 r5 r13 r14
  0x01bc: PHI (r4v16 java.util.List) = (r4v14 java.util.List), (r4v17 java.util.List) binds: [B:88:0x01b8, B:17:0x005f] A[DONT_GENERATE, DONT_INLINE]
  0x01bc: PHI (r5v6 java.util.List) = (r5v4 java.util.List), (r5v7 java.util.List) binds: [B:88:0x01b8, B:17:0x005f] A[DONT_GENERATE, DONT_INLINE]
  0x01bc: PHI (r13v8 java.util.List) = (r13v6 java.util.List), (r13v9 java.util.List) binds: [B:88:0x01b8, B:17:0x005f] A[DONT_GENERATE, DONT_INLINE]
  0x01bc: PHI (r14v51 java.lang.Object) = (r14v48 java.lang.Object), (r14v1 java.lang.Object) binds: [B:88:0x01b8, B:17:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:92:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:95:0x01da  */
    /* JADX WARN: Code duplicated, block: B:96:0x01df  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e5 A[PHI: r4 r5 r13 r14
  0x01e5: PHI (r4v18 java.util.List) = (r4v16 java.util.List), (r4v19 java.util.List) binds: [B:97:0x01e1, B:16:0x0054] A[DONT_GENERATE, DONT_INLINE]
  0x01e5: PHI (r5v8 java.util.List) = (r5v6 java.util.List), (r5v9 java.util.List) binds: [B:97:0x01e1, B:16:0x0054] A[DONT_GENERATE, DONT_INLINE]
  0x01e5: PHI (r13v10 java.util.List) = (r13v8 java.util.List), (r13v11 java.util.List) binds: [B:97:0x01e1, B:16:0x0054] A[DONT_GENERATE, DONT_INLINE]
  0x01e5: PHI (r14v59 java.lang.Object) = (r14v56 java.lang.Object), (r14v1 java.lang.Object) binds: [B:97:0x01e1, B:16:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    public Serializable t(List list, zje zjeVar) {
        khu khuVar;
        Object objValueOf;
        List list2;
        List list3;
        List list4;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Iterator it;
        Object next;
        LimitTypeEnum limitTypeEnum;
        List list5;
        List list6;
        LimitTypeEnum limitTypeEnum2;
        LimitTypeEnum limitTypeEnum3;
        LimitTypeEnum limitTypeEnum4;
        boolean z5;
        boolean z6;
        Object objValueOf2;
        List list7;
        List list8;
        sff0 sff0Var = (sff0) this.j;
        ucq ucqVar = sff0Var.f;
        if (zjeVar instanceof khu) {
            khuVar = (khu) zjeVar;
            int i = khuVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                khuVar.n = i - Integer.MIN_VALUE;
            } else {
                khuVar = new khu(this, zjeVar);
            }
        } else {
            khuVar = new khu(this, zjeVar);
        }
        Object objValueOf3 = khuVar.l;
        wne wneVar = wne.f39444a;
        boolean z7 = true;
        boolean z8 = false;
        switch (khuVar.n) {
            case 0:
                z1x.P(objValueOf3);
                lc00 lc00VarB = kotlin.collections.a.b();
                lc00VarB.add(enz.f8116a);
                lc00VarB.add(enz.b);
                khuVar.i = list;
                khuVar.j = lc00VarB;
                khuVar.k = lc00VarB;
                khuVar.n = 1;
                boolean z9 = ucqVar.e;
                boolean z10 = ucqVar.l;
                if (!z9) {
                    objValueOf = Boolean.valueOf(z10);
                } else if (z10) {
                    objValueOf = ((mtt) this.c).a(khuVar);
                } else {
                    z10 = false;
                    objValueOf = Boolean.valueOf(z10);
                }
                if (objValueOf != wneVar) {
                    list2 = list;
                    list3 = lc00VarB;
                    objValueOf3 = objValueOf;
                    list4 = list3;
                    if (((Boolean) objValueOf3).booleanValue()) {
                        if (ucqVar.e) {
                            list3.add(enz.d);
                        } else {
                            list3.add(enz.c);
                        }
                        list3.add(enz.e);
                        list3.add(enz.f);
                        list3.add(enz.g);
                    }
                    khuVar.i = list2;
                    khuVar.j = list4;
                    khuVar.k = list3;
                    khuVar.n = 2;
                    z = ucqVar.e;
                    z2 = ucqVar.m;
                    if (!z) {
                        objValueOf3 = Boolean.valueOf(z2);
                    } else if (z2) {
                        objValueOf3 = ((xqt) this.d).a(khuVar);
                    } else {
                        z2 = false;
                        objValueOf3 = Boolean.valueOf(z2);
                    }
                    if (objValueOf3 != wneVar) {
                        if (((Boolean) objValueOf3).booleanValue()) {
                            if (ucqVar.e) {
                                list3.add(enz.i);
                            } else {
                                list3.add(enz.h);
                            }
                            list3.add(enz.j);
                            list3.add(enz.k);
                            list3.add(enz.l);
                        }
                        khuVar.i = list2;
                        khuVar.j = list4;
                        khuVar.k = list3;
                        khuVar.n = 3;
                        z3 = ucqVar.e;
                        z4 = ucqVar.i;
                        if (!z3) {
                            if (!ucqVar.p) {
                                if (z4) {
                                    it = list2.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            next = it.next();
                                            limitTypeEnum = ((kzz) next).f19172a;
                                            if (limitTypeEnum != LimitTypeEnum.DEPOSIT_LIMIT_1_DAY || limitTypeEnum == LimitTypeEnum.DEPOSIT_LIMIT_7_DAY) {
                                            }
                                        } else {
                                            next = null;
                                        }
                                        if (next == null) {
                                        }
                                    } while (limitTypeEnum != LimitTypeEnum.DEPOSIT_LIMIT_30_DAY);
                                    if (next == null) {
                                    }
                                }
                                objValueOf3 = Boolean.valueOf(z7);
                            } else if (z4) {
                                objValueOf3 = ((fpc) this.h).a(khuVar);
                            }
                            z7 = false;
                            objValueOf3 = Boolean.valueOf(z7);
                        } else if (z4) {
                            objValueOf3 = ((f5a) this.g).b(khuVar);
                        } else {
                            z7 = false;
                            objValueOf3 = Boolean.valueOf(z7);
                        }
                        if (objValueOf3 != wneVar) {
                            list5 = list2;
                            if (((Boolean) objValueOf3).booleanValue()) {
                                if (ucqVar.e) {
                                    list3.add(enz.m);
                                } else {
                                    list3.add(enz.n);
                                }
                                limitTypeEnum2 = LimitTypeEnum.DEPOSIT_LIMIT_1_DAY;
                                khuVar.i = list5;
                                khuVar.j = list4;
                                khuVar.k = list3;
                                khuVar.n = 4;
                                if (sff0Var.f.i) {
                                    objValueOf3 = e(limitTypeEnum2, list5, khuVar);
                                } else {
                                    objValueOf3 = Boolean.FALSE;
                                }
                                if (objValueOf3 != wneVar) {
                                    if (((Boolean) objValueOf3).booleanValue()) {
                                        list3.add(enz.o);
                                    }
                                    limitTypeEnum3 = LimitTypeEnum.DEPOSIT_LIMIT_7_DAY;
                                    khuVar.i = list5;
                                    khuVar.j = list4;
                                    khuVar.k = list3;
                                    khuVar.n = 5;
                                    if (sff0Var.f.i) {
                                        objValueOf3 = e(limitTypeEnum3, list5, khuVar);
                                    } else {
                                        objValueOf3 = Boolean.FALSE;
                                    }
                                    if (objValueOf3 != wneVar) {
                                        if (((Boolean) objValueOf3).booleanValue()) {
                                            list3.add(enz.p);
                                        }
                                        limitTypeEnum4 = LimitTypeEnum.DEPOSIT_LIMIT_30_DAY;
                                        khuVar.i = null;
                                        khuVar.j = list4;
                                        khuVar.k = list3;
                                        khuVar.n = 6;
                                        if (sff0Var.f.i) {
                                            objValueOf3 = e(limitTypeEnum4, list5, khuVar);
                                        } else {
                                            objValueOf3 = Boolean.FALSE;
                                        }
                                        if (objValueOf3 != wneVar) {
                                            list6 = list4;
                                            if (((Boolean) objValueOf3).booleanValue()) {
                                                list3.add(enz.q);
                                            }
                                            khuVar.i = null;
                                            khuVar.j = list6;
                                            khuVar.k = list3;
                                            khuVar.n = 7;
                                            if (ucqVar.n) {
                                                objValueOf3 = ((xqt) this.f).a(khuVar);
                                            } else {
                                                objValueOf3 = Boolean.FALSE;
                                            }
                                            if (objValueOf3 != wneVar) {
                                                if (((Boolean) objValueOf3).booleanValue()) {
                                                    list3.add(enz.v);
                                                    list3.add(enz.w);
                                                }
                                                khuVar.i = null;
                                                khuVar.j = list6;
                                                khuVar.k = list3;
                                                khuVar.n = 8;
                                                objValueOf3 = ((!ucqVar.e || ucqVar.p) && ucqVar.j) ? ((mtt) this.i).a(khuVar) : Boolean.FALSE;
                                                if (objValueOf3 != wneVar) {
                                                    if (((Boolean) objValueOf3).booleanValue()) {
                                                        list3.add(enz.x);
                                                        list3.add(enz.y);
                                                    }
                                                    khuVar.i = null;
                                                    khuVar.j = list6;
                                                    khuVar.k = list3;
                                                    khuVar.n = 9;
                                                    z5 = ucqVar.e;
                                                    z6 = ucqVar.k;
                                                    if (z5) {
                                                        if (z6) {
                                                            objValueOf2 = ((ciu) this.e).a(khuVar);
                                                        }
                                                        objValueOf3 = objValueOf2;
                                                        if (objValueOf3 != wneVar) {
                                                            list7 = list3;
                                                            list8 = list6;
                                                            if (((Boolean) objValueOf3).booleanValue()) {
                                                                list7.add(enz.r);
                                                                list7.add(enz.s);
                                                            }
                                                            if (ucqVar.o) {
                                                                list7.add(enz.t);
                                                                list7.add(enz.u);
                                                            }
                                                            return kotlin.collections.a.a(list8);
                                                        }
                                                    } else {
                                                        z8 = z6;
                                                    }
                                                    objValueOf2 = Boolean.valueOf(z8);
                                                    objValueOf3 = objValueOf2;
                                                    if (objValueOf3 != wneVar) {
                                                        list7 = list3;
                                                        list8 = list6;
                                                        if (((Boolean) objValueOf3).booleanValue()) {
                                                            list7.add(enz.r);
                                                            list7.add(enz.s);
                                                        }
                                                        if (ucqVar.o) {
                                                            list7.add(enz.t);
                                                            list7.add(enz.u);
                                                        }
                                                        return kotlin.collections.a.a(list8);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                list6 = list4;
                                khuVar.i = null;
                                khuVar.j = list6;
                                khuVar.k = list3;
                                khuVar.n = 7;
                                if (ucqVar.n) {
                                    objValueOf3 = ((xqt) this.f).a(khuVar);
                                } else {
                                    objValueOf3 = Boolean.FALSE;
                                }
                                if (objValueOf3 != wneVar) {
                                    if (((Boolean) objValueOf3).booleanValue()) {
                                        list3.add(enz.v);
                                        list3.add(enz.w);
                                    }
                                    khuVar.i = null;
                                    khuVar.j = list6;
                                    khuVar.k = list3;
                                    khuVar.n = 8;
                                    if (ucqVar.e) {
                                    }
                                    if (objValueOf3 != wneVar) {
                                        if (((Boolean) objValueOf3).booleanValue()) {
                                            list3.add(enz.x);
                                            list3.add(enz.y);
                                        }
                                        khuVar.i = null;
                                        khuVar.j = list6;
                                        khuVar.k = list3;
                                        khuVar.n = 9;
                                        z5 = ucqVar.e;
                                        z6 = ucqVar.k;
                                        if (z5) {
                                            if (z6) {
                                                objValueOf2 = ((ciu) this.e).a(khuVar);
                                            }
                                            objValueOf3 = objValueOf2;
                                            if (objValueOf3 != wneVar) {
                                                list7 = list3;
                                                list8 = list6;
                                                if (((Boolean) objValueOf3).booleanValue()) {
                                                    list7.add(enz.r);
                                                    list7.add(enz.s);
                                                }
                                                if (ucqVar.o) {
                                                    list7.add(enz.t);
                                                    list7.add(enz.u);
                                                }
                                                return kotlin.collections.a.a(list8);
                                            }
                                        } else {
                                            z8 = z6;
                                        }
                                        objValueOf2 = Boolean.valueOf(z8);
                                        objValueOf3 = objValueOf2;
                                        if (objValueOf3 != wneVar) {
                                            list7 = list3;
                                            list8 = list6;
                                            if (((Boolean) objValueOf3).booleanValue()) {
                                                list7.add(enz.r);
                                                list7.add(enz.s);
                                            }
                                            if (ucqVar.o) {
                                                list7.add(enz.t);
                                                list7.add(enz.u);
                                            }
                                            return kotlin.collections.a.a(list8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return wneVar;
            case 1:
                list3 = khuVar.k;
                list4 = khuVar.j;
                list2 = khuVar.i;
                z1x.P(objValueOf3);
                if (((Boolean) objValueOf3).booleanValue()) {
                    if (ucqVar.e) {
                        list3.add(enz.d);
                    } else {
                        list3.add(enz.c);
                    }
                    list3.add(enz.e);
                    list3.add(enz.f);
                    list3.add(enz.g);
                }
                khuVar.i = list2;
                khuVar.j = list4;
                khuVar.k = list3;
                khuVar.n = 2;
                z = ucqVar.e;
                z2 = ucqVar.m;
                if (!z) {
                    objValueOf3 = Boolean.valueOf(z2);
                } else if (z2) {
                    objValueOf3 = ((xqt) this.d).a(khuVar);
                } else {
                    z2 = false;
                    objValueOf3 = Boolean.valueOf(z2);
                }
                if (objValueOf3 != wneVar) {
                    if (((Boolean) objValueOf3).booleanValue()) {
                        if (ucqVar.e) {
                            list3.add(enz.i);
                        } else {
                            list3.add(enz.h);
                        }
                        list3.add(enz.j);
                        list3.add(enz.k);
                        list3.add(enz.l);
                    }
                    khuVar.i = list2;
                    khuVar.j = list4;
                    khuVar.k = list3;
                    khuVar.n = 3;
                    z3 = ucqVar.e;
                    z4 = ucqVar.i;
                    if (!z3) {
                        if (!ucqVar.p) {
                            if (z4) {
                                it = list2.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next = it.next();
                                        limitTypeEnum = ((kzz) next).f19172a;
                                        if (limitTypeEnum != LimitTypeEnum.DEPOSIT_LIMIT_1_DAY) {
                                        }
                                    } else {
                                        next = null;
                                    }
                                    if (next == null) {
                                    }
                                } while (limitTypeEnum != LimitTypeEnum.DEPOSIT_LIMIT_30_DAY);
                                if (next == null) {
                                }
                            }
                            objValueOf3 = Boolean.valueOf(z7);
                        } else if (z4) {
                            objValueOf3 = ((fpc) this.h).a(khuVar);
                        }
                        z7 = false;
                        objValueOf3 = Boolean.valueOf(z7);
                    } else if (z4) {
                        objValueOf3 = ((f5a) this.g).b(khuVar);
                    } else {
                        z7 = false;
                        objValueOf3 = Boolean.valueOf(z7);
                    }
                    if (objValueOf3 != wneVar) {
                        list5 = list2;
                        if (((Boolean) objValueOf3).booleanValue()) {
                            if (ucqVar.e) {
                                list3.add(enz.m);
                            } else {
                                list3.add(enz.n);
                            }
                            limitTypeEnum2 = LimitTypeEnum.DEPOSIT_LIMIT_1_DAY;
                            khuVar.i = list5;
                            khuVar.j = list4;
                            khuVar.k = list3;
                            khuVar.n = 4;
                            if (sff0Var.f.i) {
                                objValueOf3 = e(limitTypeEnum2, list5, khuVar);
                            } else {
                                objValueOf3 = Boolean.FALSE;
                            }
                            if (objValueOf3 != wneVar) {
                                if (((Boolean) objValueOf3).booleanValue()) {
                                    list3.add(enz.o);
                                }
                                limitTypeEnum3 = LimitTypeEnum.DEPOSIT_LIMIT_7_DAY;
                                khuVar.i = list5;
                                khuVar.j = list4;
                                khuVar.k = list3;
                                khuVar.n = 5;
                                if (sff0Var.f.i) {
                                    objValueOf3 = e(limitTypeEnum3, list5, khuVar);
                                } else {
                                    objValueOf3 = Boolean.FALSE;
                                }
                                if (objValueOf3 != wneVar) {
                                    if (((Boolean) objValueOf3).booleanValue()) {
                                        list3.add(enz.p);
                                    }
                                    limitTypeEnum4 = LimitTypeEnum.DEPOSIT_LIMIT_30_DAY;
                                    khuVar.i = null;
                                    khuVar.j = list4;
                                    khuVar.k = list3;
                                    khuVar.n = 6;
                                    if (sff0Var.f.i) {
                                        objValueOf3 = e(limitTypeEnum4, list5, khuVar);
                                    } else {
                                        objValueOf3 = Boolean.FALSE;
                                    }
                                    if (objValueOf3 != wneVar) {
                                        list6 = list4;
                                        if (((Boolean) objValueOf3).booleanValue()) {
                                            list3.add(enz.q);
                                        }
                                        khuVar.i = null;
                                        khuVar.j = list6;
                                        khuVar.k = list3;
                                        khuVar.n = 7;
                                        if (ucqVar.n) {
                                            objValueOf3 = ((xqt) this.f).a(khuVar);
                                        } else {
                                            objValueOf3 = Boolean.FALSE;
                                        }
                                        if (objValueOf3 != wneVar) {
                                            if (((Boolean) objValueOf3).booleanValue()) {
                                                list3.add(enz.v);
                                                list3.add(enz.w);
                                            }
                                            khuVar.i = null;
                                            khuVar.j = list6;
                                            khuVar.k = list3;
                                            khuVar.n = 8;
                                            if (ucqVar.e) {
                                            }
                                            if (objValueOf3 != wneVar) {
                                                if (((Boolean) objValueOf3).booleanValue()) {
                                                    list3.add(enz.x);
                                                    list3.add(enz.y);
                                                }
                                                khuVar.i = null;
                                                khuVar.j = list6;
                                                khuVar.k = list3;
                                                khuVar.n = 9;
                                                z5 = ucqVar.e;
                                                z6 = ucqVar.k;
                                                if (z5) {
                                                    if (z6) {
                                                        objValueOf2 = ((ciu) this.e).a(khuVar);
                                                    }
                                                    objValueOf3 = objValueOf2;
                                                    if (objValueOf3 != wneVar) {
                                                        list7 = list3;
                                                        list8 = list6;
                                                        if (((Boolean) objValueOf3).booleanValue()) {
                                                            list7.add(enz.r);
                                                            list7.add(enz.s);
                                                        }
                                                        if (ucqVar.o) {
                                                            list7.add(enz.t);
                                                            list7.add(enz.u);
                                                        }
                                                        return kotlin.collections.a.a(list8);
                                                    }
                                                } else {
                                                    z8 = z6;
                                                }
                                                objValueOf2 = Boolean.valueOf(z8);
                                                objValueOf3 = objValueOf2;
                                                if (objValueOf3 != wneVar) {
                                                    list7 = list3;
                                                    list8 = list6;
                                                    if (((Boolean) objValueOf3).booleanValue()) {
                                                        list7.add(enz.r);
                                                        list7.add(enz.s);
                                                    }
                                                    if (ucqVar.o) {
                                                        list7.add(enz.t);
                                                        list7.add(enz.u);
                                                    }
                                                    return kotlin.collections.a.a(list8);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            list6 = list4;
                            khuVar.i = null;
                            khuVar.j = list6;
                            khuVar.k = list3;
                            khuVar.n = 7;
                            if (ucqVar.n) {
                                objValueOf3 = ((xqt) this.f).a(khuVar);
                            } else {
                                objValueOf3 = Boolean.FALSE;
                            }
                            if (objValueOf3 != wneVar) {
                                if (((Boolean) objValueOf3).booleanValue()) {
                                    list3.add(enz.v);
                                    list3.add(enz.w);
                                }
                                khuVar.i = null;
                                khuVar.j = list6;
                                khuVar.k = list3;
                                khuVar.n = 8;
                                if (ucqVar.e) {
                                }
                                if (objValueOf3 != wneVar) {
                                    if (((Boolean) objValueOf3).booleanValue()) {
                                        list3.add(enz.x);
                                        list3.add(enz.y);
                                    }
                                    khuVar.i = null;
                                    khuVar.j = list6;
                                    khuVar.k = list3;
                                    khuVar.n = 9;
                                    z5 = ucqVar.e;
                                    z6 = ucqVar.k;
                                    if (z5) {
                                        if (z6) {
                                            objValueOf2 = ((ciu) this.e).a(khuVar);
                                        }
                                        objValueOf3 = objValueOf2;
                                        if (objValueOf3 != wneVar) {
                                            list7 = list3;
                                            list8 = list6;
                                            if (((Boolean) objValueOf3).booleanValue()) {
                                                list7.add(enz.r);
                                                list7.add(enz.s);
                                            }
                                            if (ucqVar.o) {
                                                list7.add(enz.t);
                                                list7.add(enz.u);
                                            }
                                            return kotlin.collections.a.a(list8);
                                        }
                                    } else {
                                        z8 = z6;
                                    }
                                    objValueOf2 = Boolean.valueOf(z8);
                                    objValueOf3 = objValueOf2;
                                    if (objValueOf3 != wneVar) {
                                        list7 = list3;
                                        list8 = list6;
                                        if (((Boolean) objValueOf3).booleanValue()) {
                                            list7.add(enz.r);
                                            list7.add(enz.s);
                                        }
                                        if (ucqVar.o) {
                                            list7.add(enz.t);
                                            list7.add(enz.u);
                                        }
                                        return kotlin.collections.a.a(list8);
                                    }
                                }
                            }
                        }
                    }
                }
                return wneVar;
            case 2:
                list3 = khuVar.k;
                list4 = khuVar.j;
                list2 = khuVar.i;
                z1x.P(objValueOf3);
                if (((Boolean) objValueOf3).booleanValue()) {
                    if (ucqVar.e) {
                        list3.add(enz.i);
                    } else {
                        list3.add(enz.h);
                    }
                    list3.add(enz.j);
                    list3.add(enz.k);
                    list3.add(enz.l);
                }
                khuVar.i = list2;
                khuVar.j = list4;
                khuVar.k = list3;
                khuVar.n = 3;
                z3 = ucqVar.e;
                z4 = ucqVar.i;
                if (!z3) {
                    if (!ucqVar.p) {
                        if (z4) {
                            it = list2.iterator();
                            do {
                                if (it.hasNext()) {
                                    next = it.next();
                                    limitTypeEnum = ((kzz) next).f19172a;
                                    if (limitTypeEnum != LimitTypeEnum.DEPOSIT_LIMIT_1_DAY) {
                                    }
                                } else {
                                    next = null;
                                }
                                if (next == null) {
                                }
                            } while (limitTypeEnum != LimitTypeEnum.DEPOSIT_LIMIT_30_DAY);
                            if (next == null) {
                            }
                        }
                        objValueOf3 = Boolean.valueOf(z7);
                    } else if (z4) {
                        objValueOf3 = ((fpc) this.h).a(khuVar);
                    }
                    z7 = false;
                    objValueOf3 = Boolean.valueOf(z7);
                } else if (z4) {
                    objValueOf3 = ((f5a) this.g).b(khuVar);
                } else {
                    z7 = false;
                    objValueOf3 = Boolean.valueOf(z7);
                }
                if (objValueOf3 != wneVar) {
                    list5 = list2;
                    if (((Boolean) objValueOf3).booleanValue()) {
                        if (ucqVar.e) {
                            list3.add(enz.m);
                        } else {
                            list3.add(enz.n);
                        }
                        limitTypeEnum2 = LimitTypeEnum.DEPOSIT_LIMIT_1_DAY;
                        khuVar.i = list5;
                        khuVar.j = list4;
                        khuVar.k = list3;
                        khuVar.n = 4;
                        if (sff0Var.f.i) {
                            objValueOf3 = e(limitTypeEnum2, list5, khuVar);
                        } else {
                            objValueOf3 = Boolean.FALSE;
                        }
                        if (objValueOf3 != wneVar) {
                            if (((Boolean) objValueOf3).booleanValue()) {
                                list3.add(enz.o);
                            }
                            limitTypeEnum3 = LimitTypeEnum.DEPOSIT_LIMIT_7_DAY;
                            khuVar.i = list5;
                            khuVar.j = list4;
                            khuVar.k = list3;
                            khuVar.n = 5;
                            if (sff0Var.f.i) {
                                objValueOf3 = e(limitTypeEnum3, list5, khuVar);
                            } else {
                                objValueOf3 = Boolean.FALSE;
                            }
                            if (objValueOf3 != wneVar) {
                                if (((Boolean) objValueOf3).booleanValue()) {
                                    list3.add(enz.p);
                                }
                                limitTypeEnum4 = LimitTypeEnum.DEPOSIT_LIMIT_30_DAY;
                                khuVar.i = null;
                                khuVar.j = list4;
                                khuVar.k = list3;
                                khuVar.n = 6;
                                if (sff0Var.f.i) {
                                    objValueOf3 = e(limitTypeEnum4, list5, khuVar);
                                } else {
                                    objValueOf3 = Boolean.FALSE;
                                }
                                if (objValueOf3 != wneVar) {
                                    list6 = list4;
                                    if (((Boolean) objValueOf3).booleanValue()) {
                                        list3.add(enz.q);
                                    }
                                    khuVar.i = null;
                                    khuVar.j = list6;
                                    khuVar.k = list3;
                                    khuVar.n = 7;
                                    if (ucqVar.n) {
                                        objValueOf3 = ((xqt) this.f).a(khuVar);
                                    } else {
                                        objValueOf3 = Boolean.FALSE;
                                    }
                                    if (objValueOf3 != wneVar) {
                                        if (((Boolean) objValueOf3).booleanValue()) {
                                            list3.add(enz.v);
                                            list3.add(enz.w);
                                        }
                                        khuVar.i = null;
                                        khuVar.j = list6;
                                        khuVar.k = list3;
                                        khuVar.n = 8;
                                        if (ucqVar.e) {
                                        }
                                        if (objValueOf3 != wneVar) {
                                            if (((Boolean) objValueOf3).booleanValue()) {
                                                list3.add(enz.x);
                                                list3.add(enz.y);
                                            }
                                            khuVar.i = null;
                                            khuVar.j = list6;
                                            khuVar.k = list3;
                                            khuVar.n = 9;
                                            z5 = ucqVar.e;
                                            z6 = ucqVar.k;
                                            if (z5) {
                                                if (z6) {
                                                    objValueOf2 = ((ciu) this.e).a(khuVar);
                                                }
                                                objValueOf3 = objValueOf2;
                                                if (objValueOf3 != wneVar) {
                                                    list7 = list3;
                                                    list8 = list6;
                                                    if (((Boolean) objValueOf3).booleanValue()) {
                                                        list7.add(enz.r);
                                                        list7.add(enz.s);
                                                    }
                                                    if (ucqVar.o) {
                                                        list7.add(enz.t);
                                                        list7.add(enz.u);
                                                    }
                                                    return kotlin.collections.a.a(list8);
                                                }
                                            } else {
                                                z8 = z6;
                                            }
                                            objValueOf2 = Boolean.valueOf(z8);
                                            objValueOf3 = objValueOf2;
                                            if (objValueOf3 != wneVar) {
                                                list7 = list3;
                                                list8 = list6;
                                                if (((Boolean) objValueOf3).booleanValue()) {
                                                    list7.add(enz.r);
                                                    list7.add(enz.s);
                                                }
                                                if (ucqVar.o) {
                                                    list7.add(enz.t);
                                                    list7.add(enz.u);
                                                }
                                                return kotlin.collections.a.a(list8);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        list6 = list4;
                        khuVar.i = null;
                        khuVar.j = list6;
                        khuVar.k = list3;
                        khuVar.n = 7;
                        if (ucqVar.n) {
                            objValueOf3 = ((xqt) this.f).a(khuVar);
                        } else {
                            objValueOf3 = Boolean.FALSE;
                        }
                        if (objValueOf3 != wneVar) {
                            if (((Boolean) objValueOf3).booleanValue()) {
                                list3.add(enz.v);
                                list3.add(enz.w);
                            }
                            khuVar.i = null;
                            khuVar.j = list6;
                            khuVar.k = list3;
                            khuVar.n = 8;
                            if (ucqVar.e) {
                            }
                            if (objValueOf3 != wneVar) {
                                if (((Boolean) objValueOf3).booleanValue()) {
                                    list3.add(enz.x);
                                    list3.add(enz.y);
                                }
                                khuVar.i = null;
                                khuVar.j = list6;
                                khuVar.k = list3;
                                khuVar.n = 9;
                                z5 = ucqVar.e;
                                z6 = ucqVar.k;
                                if (z5) {
                                    if (z6) {
                                        objValueOf2 = ((ciu) this.e).a(khuVar);
                                    }
                                    objValueOf3 = objValueOf2;
                                    if (objValueOf3 != wneVar) {
                                        list7 = list3;
                                        list8 = list6;
                                        if (((Boolean) objValueOf3).booleanValue()) {
                                            list7.add(enz.r);
                                            list7.add(enz.s);
                                        }
                                        if (ucqVar.o) {
                                            list7.add(enz.t);
                                            list7.add(enz.u);
                                        }
                                        return kotlin.collections.a.a(list8);
                                    }
                                } else {
                                    z8 = z6;
                                }
                                objValueOf2 = Boolean.valueOf(z8);
                                objValueOf3 = objValueOf2;
                                if (objValueOf3 != wneVar) {
                                    list7 = list3;
                                    list8 = list6;
                                    if (((Boolean) objValueOf3).booleanValue()) {
                                        list7.add(enz.r);
                                        list7.add(enz.s);
                                    }
                                    if (ucqVar.o) {
                                        list7.add(enz.t);
                                        list7.add(enz.u);
                                    }
                                    return kotlin.collections.a.a(list8);
                                }
                            }
                        }
                    }
                }
                return wneVar;
            case 3:
                list3 = khuVar.k;
                list4 = khuVar.j;
                list5 = khuVar.i;
                z1x.P(objValueOf3);
                if (((Boolean) objValueOf3).booleanValue()) {
                    if (ucqVar.e) {
                        list3.add(enz.m);
                    } else {
                        list3.add(enz.n);
                    }
                    limitTypeEnum2 = LimitTypeEnum.DEPOSIT_LIMIT_1_DAY;
                    khuVar.i = list5;
                    khuVar.j = list4;
                    khuVar.k = list3;
                    khuVar.n = 4;
                    if (sff0Var.f.i) {
                        objValueOf3 = e(limitTypeEnum2, list5, khuVar);
                    } else {
                        objValueOf3 = Boolean.FALSE;
                    }
                    if (objValueOf3 != wneVar) {
                        if (((Boolean) objValueOf3).booleanValue()) {
                            list3.add(enz.o);
                        }
                        limitTypeEnum3 = LimitTypeEnum.DEPOSIT_LIMIT_7_DAY;
                        khuVar.i = list5;
                        khuVar.j = list4;
                        khuVar.k = list3;
                        khuVar.n = 5;
                        if (sff0Var.f.i) {
                            objValueOf3 = e(limitTypeEnum3, list5, khuVar);
                        } else {
                            objValueOf3 = Boolean.FALSE;
                        }
                        if (objValueOf3 != wneVar) {
                            if (((Boolean) objValueOf3).booleanValue()) {
                                list3.add(enz.p);
                            }
                            limitTypeEnum4 = LimitTypeEnum.DEPOSIT_LIMIT_30_DAY;
                            khuVar.i = null;
                            khuVar.j = list4;
                            khuVar.k = list3;
                            khuVar.n = 6;
                            if (sff0Var.f.i) {
                                objValueOf3 = e(limitTypeEnum4, list5, khuVar);
                            } else {
                                objValueOf3 = Boolean.FALSE;
                            }
                            if (objValueOf3 != wneVar) {
                                list6 = list4;
                                if (((Boolean) objValueOf3).booleanValue()) {
                                    list3.add(enz.q);
                                }
                                khuVar.i = null;
                                khuVar.j = list6;
                                khuVar.k = list3;
                                khuVar.n = 7;
                                if (ucqVar.n) {
                                    objValueOf3 = ((xqt) this.f).a(khuVar);
                                } else {
                                    objValueOf3 = Boolean.FALSE;
                                }
                                if (objValueOf3 != wneVar) {
                                    if (((Boolean) objValueOf3).booleanValue()) {
                                        list3.add(enz.v);
                                        list3.add(enz.w);
                                    }
                                    khuVar.i = null;
                                    khuVar.j = list6;
                                    khuVar.k = list3;
                                    khuVar.n = 8;
                                    if (ucqVar.e) {
                                    }
                                    if (objValueOf3 != wneVar) {
                                        if (((Boolean) objValueOf3).booleanValue()) {
                                            list3.add(enz.x);
                                            list3.add(enz.y);
                                        }
                                        khuVar.i = null;
                                        khuVar.j = list6;
                                        khuVar.k = list3;
                                        khuVar.n = 9;
                                        z5 = ucqVar.e;
                                        z6 = ucqVar.k;
                                        if (z5) {
                                            if (z6) {
                                                objValueOf2 = ((ciu) this.e).a(khuVar);
                                            }
                                            objValueOf3 = objValueOf2;
                                            if (objValueOf3 != wneVar) {
                                                list7 = list3;
                                                list8 = list6;
                                                if (((Boolean) objValueOf3).booleanValue()) {
                                                    list7.add(enz.r);
                                                    list7.add(enz.s);
                                                }
                                                if (ucqVar.o) {
                                                    list7.add(enz.t);
                                                    list7.add(enz.u);
                                                }
                                                return kotlin.collections.a.a(list8);
                                            }
                                        } else {
                                            z8 = z6;
                                        }
                                        objValueOf2 = Boolean.valueOf(z8);
                                        objValueOf3 = objValueOf2;
                                        if (objValueOf3 != wneVar) {
                                            list7 = list3;
                                            list8 = list6;
                                            if (((Boolean) objValueOf3).booleanValue()) {
                                                list7.add(enz.r);
                                                list7.add(enz.s);
                                            }
                                            if (ucqVar.o) {
                                                list7.add(enz.t);
                                                list7.add(enz.u);
                                            }
                                            return kotlin.collections.a.a(list8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    list6 = list4;
                    khuVar.i = null;
                    khuVar.j = list6;
                    khuVar.k = list3;
                    khuVar.n = 7;
                    if (ucqVar.n) {
                        objValueOf3 = ((xqt) this.f).a(khuVar);
                    } else {
                        objValueOf3 = Boolean.FALSE;
                    }
                    if (objValueOf3 != wneVar) {
                        if (((Boolean) objValueOf3).booleanValue()) {
                            list3.add(enz.v);
                            list3.add(enz.w);
                        }
                        khuVar.i = null;
                        khuVar.j = list6;
                        khuVar.k = list3;
                        khuVar.n = 8;
                        if (ucqVar.e) {
                        }
                        if (objValueOf3 != wneVar) {
                            if (((Boolean) objValueOf3).booleanValue()) {
                                list3.add(enz.x);
                                list3.add(enz.y);
                            }
                            khuVar.i = null;
                            khuVar.j = list6;
                            khuVar.k = list3;
                            khuVar.n = 9;
                            z5 = ucqVar.e;
                            z6 = ucqVar.k;
                            if (z5) {
                                if (z6) {
                                    objValueOf2 = ((ciu) this.e).a(khuVar);
                                }
                                objValueOf3 = objValueOf2;
                                if (objValueOf3 != wneVar) {
                                    list7 = list3;
                                    list8 = list6;
                                    if (((Boolean) objValueOf3).booleanValue()) {
                                        list7.add(enz.r);
                                        list7.add(enz.s);
                                    }
                                    if (ucqVar.o) {
                                        list7.add(enz.t);
                                        list7.add(enz.u);
                                    }
                                    return kotlin.collections.a.a(list8);
                                }
                            } else {
                                z8 = z6;
                            }
                            objValueOf2 = Boolean.valueOf(z8);
                            objValueOf3 = objValueOf2;
                            if (objValueOf3 != wneVar) {
                                list7 = list3;
                                list8 = list6;
                                if (((Boolean) objValueOf3).booleanValue()) {
                                    list7.add(enz.r);
                                    list7.add(enz.s);
                                }
                                if (ucqVar.o) {
                                    list7.add(enz.t);
                                    list7.add(enz.u);
                                }
                                return kotlin.collections.a.a(list8);
                            }
                        }
                    }
                }
                return wneVar;
            case 4:
                list3 = khuVar.k;
                list4 = khuVar.j;
                list5 = khuVar.i;
                z1x.P(objValueOf3);
                if (((Boolean) objValueOf3).booleanValue()) {
                    list3.add(enz.o);
                }
                limitTypeEnum3 = LimitTypeEnum.DEPOSIT_LIMIT_7_DAY;
                khuVar.i = list5;
                khuVar.j = list4;
                khuVar.k = list3;
                khuVar.n = 5;
                if (sff0Var.f.i) {
                    objValueOf3 = e(limitTypeEnum3, list5, khuVar);
                } else {
                    objValueOf3 = Boolean.FALSE;
                }
                if (objValueOf3 != wneVar) {
                    if (((Boolean) objValueOf3).booleanValue()) {
                        list3.add(enz.p);
                    }
                    limitTypeEnum4 = LimitTypeEnum.DEPOSIT_LIMIT_30_DAY;
                    khuVar.i = null;
                    khuVar.j = list4;
                    khuVar.k = list3;
                    khuVar.n = 6;
                    if (sff0Var.f.i) {
                        objValueOf3 = e(limitTypeEnum4, list5, khuVar);
                    } else {
                        objValueOf3 = Boolean.FALSE;
                    }
                    if (objValueOf3 != wneVar) {
                        list6 = list4;
                        if (((Boolean) objValueOf3).booleanValue()) {
                            list3.add(enz.q);
                        }
                        khuVar.i = null;
                        khuVar.j = list6;
                        khuVar.k = list3;
                        khuVar.n = 7;
                        if (ucqVar.n) {
                            objValueOf3 = ((xqt) this.f).a(khuVar);
                        } else {
                            objValueOf3 = Boolean.FALSE;
                        }
                        if (objValueOf3 != wneVar) {
                            if (((Boolean) objValueOf3).booleanValue()) {
                                list3.add(enz.v);
                                list3.add(enz.w);
                            }
                            khuVar.i = null;
                            khuVar.j = list6;
                            khuVar.k = list3;
                            khuVar.n = 8;
                            if (ucqVar.e) {
                            }
                            if (objValueOf3 != wneVar) {
                                if (((Boolean) objValueOf3).booleanValue()) {
                                    list3.add(enz.x);
                                    list3.add(enz.y);
                                }
                                khuVar.i = null;
                                khuVar.j = list6;
                                khuVar.k = list3;
                                khuVar.n = 9;
                                z5 = ucqVar.e;
                                z6 = ucqVar.k;
                                if (z5) {
                                    if (z6) {
                                        objValueOf2 = ((ciu) this.e).a(khuVar);
                                    }
                                    objValueOf3 = objValueOf2;
                                    if (objValueOf3 != wneVar) {
                                        list7 = list3;
                                        list8 = list6;
                                        if (((Boolean) objValueOf3).booleanValue()) {
                                            list7.add(enz.r);
                                            list7.add(enz.s);
                                        }
                                        if (ucqVar.o) {
                                            list7.add(enz.t);
                                            list7.add(enz.u);
                                        }
                                        return kotlin.collections.a.a(list8);
                                    }
                                } else {
                                    z8 = z6;
                                }
                                objValueOf2 = Boolean.valueOf(z8);
                                objValueOf3 = objValueOf2;
                                if (objValueOf3 != wneVar) {
                                    list7 = list3;
                                    list8 = list6;
                                    if (((Boolean) objValueOf3).booleanValue()) {
                                        list7.add(enz.r);
                                        list7.add(enz.s);
                                    }
                                    if (ucqVar.o) {
                                        list7.add(enz.t);
                                        list7.add(enz.u);
                                    }
                                    return kotlin.collections.a.a(list8);
                                }
                            }
                        }
                    }
                }
                return wneVar;
            case 5:
                list3 = khuVar.k;
                list4 = khuVar.j;
                list5 = khuVar.i;
                z1x.P(objValueOf3);
                if (((Boolean) objValueOf3).booleanValue()) {
                    list3.add(enz.p);
                }
                limitTypeEnum4 = LimitTypeEnum.DEPOSIT_LIMIT_30_DAY;
                khuVar.i = null;
                khuVar.j = list4;
                khuVar.k = list3;
                khuVar.n = 6;
                if (sff0Var.f.i) {
                    objValueOf3 = e(limitTypeEnum4, list5, khuVar);
                } else {
                    objValueOf3 = Boolean.FALSE;
                }
                if (objValueOf3 != wneVar) {
                    list6 = list4;
                    if (((Boolean) objValueOf3).booleanValue()) {
                        list3.add(enz.q);
                    }
                    khuVar.i = null;
                    khuVar.j = list6;
                    khuVar.k = list3;
                    khuVar.n = 7;
                    if (ucqVar.n) {
                        objValueOf3 = ((xqt) this.f).a(khuVar);
                    } else {
                        objValueOf3 = Boolean.FALSE;
                    }
                    if (objValueOf3 != wneVar) {
                        if (((Boolean) objValueOf3).booleanValue()) {
                            list3.add(enz.v);
                            list3.add(enz.w);
                        }
                        khuVar.i = null;
                        khuVar.j = list6;
                        khuVar.k = list3;
                        khuVar.n = 8;
                        if (ucqVar.e) {
                        }
                        if (objValueOf3 != wneVar) {
                            if (((Boolean) objValueOf3).booleanValue()) {
                                list3.add(enz.x);
                                list3.add(enz.y);
                            }
                            khuVar.i = null;
                            khuVar.j = list6;
                            khuVar.k = list3;
                            khuVar.n = 9;
                            z5 = ucqVar.e;
                            z6 = ucqVar.k;
                            if (z5) {
                                if (z6) {
                                    objValueOf2 = ((ciu) this.e).a(khuVar);
                                }
                                objValueOf3 = objValueOf2;
                                if (objValueOf3 != wneVar) {
                                    list7 = list3;
                                    list8 = list6;
                                    if (((Boolean) objValueOf3).booleanValue()) {
                                        list7.add(enz.r);
                                        list7.add(enz.s);
                                    }
                                    if (ucqVar.o) {
                                        list7.add(enz.t);
                                        list7.add(enz.u);
                                    }
                                    return kotlin.collections.a.a(list8);
                                }
                            } else {
                                z8 = z6;
                            }
                            objValueOf2 = Boolean.valueOf(z8);
                            objValueOf3 = objValueOf2;
                            if (objValueOf3 != wneVar) {
                                list7 = list3;
                                list8 = list6;
                                if (((Boolean) objValueOf3).booleanValue()) {
                                    list7.add(enz.r);
                                    list7.add(enz.s);
                                }
                                if (ucqVar.o) {
                                    list7.add(enz.t);
                                    list7.add(enz.u);
                                }
                                return kotlin.collections.a.a(list8);
                            }
                        }
                    }
                }
                return wneVar;
            case 6:
                list3 = khuVar.k;
                list6 = khuVar.j;
                z1x.P(objValueOf3);
                if (((Boolean) objValueOf3).booleanValue()) {
                    list3.add(enz.q);
                }
                khuVar.i = null;
                khuVar.j = list6;
                khuVar.k = list3;
                khuVar.n = 7;
                if (ucqVar.n) {
                    objValueOf3 = ((xqt) this.f).a(khuVar);
                } else {
                    objValueOf3 = Boolean.FALSE;
                }
                if (objValueOf3 != wneVar) {
                    if (((Boolean) objValueOf3).booleanValue()) {
                        list3.add(enz.v);
                        list3.add(enz.w);
                    }
                    khuVar.i = null;
                    khuVar.j = list6;
                    khuVar.k = list3;
                    khuVar.n = 8;
                    if (ucqVar.e) {
                    }
                    if (objValueOf3 != wneVar) {
                        if (((Boolean) objValueOf3).booleanValue()) {
                            list3.add(enz.x);
                            list3.add(enz.y);
                        }
                        khuVar.i = null;
                        khuVar.j = list6;
                        khuVar.k = list3;
                        khuVar.n = 9;
                        z5 = ucqVar.e;
                        z6 = ucqVar.k;
                        if (z5) {
                            if (z6) {
                                objValueOf2 = ((ciu) this.e).a(khuVar);
                            }
                            objValueOf3 = objValueOf2;
                            if (objValueOf3 != wneVar) {
                                list7 = list3;
                                list8 = list6;
                                if (((Boolean) objValueOf3).booleanValue()) {
                                    list7.add(enz.r);
                                    list7.add(enz.s);
                                }
                                if (ucqVar.o) {
                                    list7.add(enz.t);
                                    list7.add(enz.u);
                                }
                                return kotlin.collections.a.a(list8);
                            }
                        } else {
                            z8 = z6;
                        }
                        objValueOf2 = Boolean.valueOf(z8);
                        objValueOf3 = objValueOf2;
                        if (objValueOf3 != wneVar) {
                            list7 = list3;
                            list8 = list6;
                            if (((Boolean) objValueOf3).booleanValue()) {
                                list7.add(enz.r);
                                list7.add(enz.s);
                            }
                            if (ucqVar.o) {
                                list7.add(enz.t);
                                list7.add(enz.u);
                            }
                            return kotlin.collections.a.a(list8);
                        }
                    }
                }
                return wneVar;
            case 7:
                list3 = khuVar.k;
                list6 = khuVar.j;
                z1x.P(objValueOf3);
                if (((Boolean) objValueOf3).booleanValue()) {
                    list3.add(enz.v);
                    list3.add(enz.w);
                }
                khuVar.i = null;
                khuVar.j = list6;
                khuVar.k = list3;
                khuVar.n = 8;
                if (ucqVar.e) {
                }
                if (objValueOf3 != wneVar) {
                    if (((Boolean) objValueOf3).booleanValue()) {
                        list3.add(enz.x);
                        list3.add(enz.y);
                    }
                    khuVar.i = null;
                    khuVar.j = list6;
                    khuVar.k = list3;
                    khuVar.n = 9;
                    z5 = ucqVar.e;
                    z6 = ucqVar.k;
                    if (z5) {
                        if (z6) {
                            objValueOf2 = ((ciu) this.e).a(khuVar);
                        }
                        objValueOf3 = objValueOf2;
                        if (objValueOf3 != wneVar) {
                            list7 = list3;
                            list8 = list6;
                            if (((Boolean) objValueOf3).booleanValue()) {
                                list7.add(enz.r);
                                list7.add(enz.s);
                            }
                            if (ucqVar.o) {
                                list7.add(enz.t);
                                list7.add(enz.u);
                            }
                            return kotlin.collections.a.a(list8);
                        }
                    } else {
                        z8 = z6;
                    }
                    objValueOf2 = Boolean.valueOf(z8);
                    objValueOf3 = objValueOf2;
                    if (objValueOf3 != wneVar) {
                        list7 = list3;
                        list8 = list6;
                        if (((Boolean) objValueOf3).booleanValue()) {
                            list7.add(enz.r);
                            list7.add(enz.s);
                        }
                        if (ucqVar.o) {
                            list7.add(enz.t);
                            list7.add(enz.u);
                        }
                        return kotlin.collections.a.a(list8);
                    }
                }
                return wneVar;
            case 8:
                list3 = khuVar.k;
                list6 = khuVar.j;
                z1x.P(objValueOf3);
                if (((Boolean) objValueOf3).booleanValue()) {
                    list3.add(enz.x);
                    list3.add(enz.y);
                }
                khuVar.i = null;
                khuVar.j = list6;
                khuVar.k = list3;
                khuVar.n = 9;
                z5 = ucqVar.e;
                z6 = ucqVar.k;
                if (z5) {
                    if (z6) {
                        objValueOf2 = ((ciu) this.e).a(khuVar);
                    }
                    objValueOf3 = objValueOf2;
                    if (objValueOf3 != wneVar) {
                        list7 = list3;
                        list8 = list6;
                        if (((Boolean) objValueOf3).booleanValue()) {
                            list7.add(enz.r);
                            list7.add(enz.s);
                        }
                        if (ucqVar.o) {
                            list7.add(enz.t);
                            list7.add(enz.u);
                        }
                        return kotlin.collections.a.a(list8);
                    }
                    return wneVar;
                }
                z8 = z6;
                objValueOf2 = Boolean.valueOf(z8);
                objValueOf3 = objValueOf2;
                if (objValueOf3 != wneVar) {
                    list7 = list3;
                    list8 = list6;
                    if (((Boolean) objValueOf3).booleanValue()) {
                        list7.add(enz.r);
                        list7.add(enz.s);
                    }
                    if (ucqVar.o) {
                        list7.add(enz.t);
                        list7.add(enz.u);
                    }
                    return kotlin.collections.a.a(list8);
                }
                return wneVar;
            case 9:
                list7 = khuVar.k;
                list8 = khuVar.j;
                z1x.P(objValueOf3);
                if (((Boolean) objValueOf3).booleanValue()) {
                    list7.add(enz.r);
                    list7.add(enz.s);
                }
                if (ucqVar.o) {
                    list7.add(enz.t);
                    list7.add(enz.u);
                }
                return kotlin.collections.a.a(list8);
            default:
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00b0 A[PHI: r1 r2 r3 r6 r9
  0x00b0: PHI (r1v4 boolean) = (r1v2 boolean), (r1v7 boolean) binds: [B:23:0x00ac, B:16:0x0053] A[DONT_GENERATE, DONT_INLINE]
  0x00b0: PHI (r2v3 int) = (r2v1 int), (r2v4 int) binds: [B:23:0x00ac, B:16:0x0053] A[DONT_GENERATE, DONT_INLINE]
  0x00b0: PHI (r3v9 java.lang.Object) = (r3v8 java.lang.Object), (r3v1 java.lang.Object) binds: [B:23:0x00ac, B:16:0x0053] A[DONT_GENERATE, DONT_INLINE]
  0x00b0: PHI (r6v7 a.q4f) = (r6v5 a.q4f), (r6v16 a.q4f) binds: [B:23:0x00ac, B:16:0x0053] A[DONT_GENERATE, DONT_INLINE]
  0x00b0: PHI (r9v4 long) = (r9v2 long), (r9v5 long) binds: [B:23:0x00ac, B:16:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:76:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a3, code lost:
    
        if (r0.g(r4) == r5) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01e4, code lost:
    
        if (r0.b(r4) == r5) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v2, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object u(int r26, long r27, a.zje r29, boolean r30) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wdu.u(int, long, a.zje, boolean):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Object v(long j, zje zjeVar) {
        lc60 lc60Var;
        long j2;
        n0o0 n0o0Var = (n0o0) this.i;
        if (zjeVar instanceof lc60) {
            lc60Var = (lc60) zjeVar;
            int i = lc60Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                lc60Var.l = i - Integer.MIN_VALUE;
            } else {
                lc60Var = new lc60(this, zjeVar);
            }
        } else {
            lc60Var = new lc60(this, zjeVar);
        }
        lc60 lc60Var2 = lc60Var;
        Object objT = lc60Var2.j;
        wne wneVar = wne.f39444a;
        int i2 = lc60Var2.l;
        if (i2 == 0) {
            z1x.P(objT);
            dgu dguVar = (dgu) this.b;
            boolean z = ((sff0) n0o0Var.getValue()).J1;
            boolean z2 = ((sff0) n0o0Var.getValue()).O1;
            lc60Var2.i = j;
            lc60Var2.l = 1;
            objT = dguVar.t(j, z, z2, lc60Var2);
            if (objT == wneVar) {
                return wneVar;
            }
            j2 = j;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = lc60Var2.i;
            z1x.P(objT);
        }
        return dub.d0((gmq) objT, ((reu) this.h).a(), ((h9c) this.g).a(), ((goo) ((f4u) this.c).b).f11640a.a(j2).f22099a, ((nku) this.d).a(), new nc60(j2, this, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
    
        if (r11 == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object w(a.u3z r9, java.lang.Long r10, a.zje r11) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wdu.w(a.u3z, java.lang.Long, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0117  */
    /* JADX WARN: Code duplicated, block: B:45:0x012f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0141  */
    /* JADX WARN: Code duplicated, block: B:53:0x016f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0174  */
    /* JADX WARN: Code duplicated, block: B:60:0x018d A[PHI: r1 r2 r5 r7
  0x018d: PHI (r1v5 boolean) = (r1v4 boolean), (r1v14 boolean) binds: [B:58:0x018a, B:18:0x0043] A[DONT_GENERATE, DONT_INLINE]
  0x018d: PHI (r2v26 java.lang.Object) = (r2v25 java.lang.Object), (r2v1 java.lang.Object) binds: [B:58:0x018a, B:18:0x0043] A[DONT_GENERATE, DONT_INLINE]
  0x018d: PHI (r5v5 int) = (r5v4 int), (r5v10 int) binds: [B:58:0x018a, B:18:0x0043] A[DONT_GENERATE, DONT_INLINE]
  0x018d: PHI (r7v5 a.q4f) = (r7v4 a.q4f), (r7v10 a.q4f) binds: [B:58:0x018a, B:18:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0198 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:71:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x0144 A[SYNTHETIC] */
    public Object x(ArrayList arrayList, zje zjeVar) {
        ahf0 ahf0Var;
        int iE;
        q4f q4fVar;
        List list;
        boolean z;
        q4f q4fVar2;
        ArrayList arrayList2;
        Object objG;
        q4f q4fVar3;
        ArrayList arrayList3;
        long jLongValue;
        vit0 vit0Var;
        long j;
        List list2 = arrayList;
        if (zjeVar instanceof ahf0) {
            ahf0Var = (ahf0) zjeVar;
            int i = ahf0Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                ahf0Var.p = i - Integer.MIN_VALUE;
            } else {
                ahf0Var = new ahf0(this, zjeVar);
            }
        } else {
            ahf0Var = new ahf0(this, zjeVar);
        }
        Object objD = ahf0Var.n;
        Object obj = wne.f39444a;
        int i2 = ahf0Var.p;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objD);
            q4f q4fVarA = ((j9c) this.c).a();
            iE = tqt.e(q4fVarA);
            ahf0Var.i = list2;
            ahf0Var.j = q4fVarA;
            ahf0Var.k = iE;
            ahf0Var.p = 1;
            Object objD2 = d(list2, ahf0Var);
            if (objD2 != obj) {
                q4fVar = q4fVarA;
                objD = objD2;
            }
            return obj;
        }
        if (i2 == 1) {
            int i3 = ahf0Var.k;
            q4f q4fVar4 = ahf0Var.j;
            List list3 = ahf0Var.i;
            z1x.P(objD);
            iE = i3;
            list2 = list3;
            q4fVar = q4fVar4;
        } else {
            if (i2 == 2) {
                z = ahf0Var.l;
                iE = ahf0Var.k;
                q4fVar2 = ahf0Var.j;
                list = ahf0Var.i;
                z1x.P(objD);
                ahf0Var.i = null;
                ahf0Var.j = q4fVar2;
                ahf0Var.k = iE;
                ahf0Var.l = z;
                ahf0Var.p = 3;
                List<hf6> listN = ((hst) this.e).f13600a.n();
                arrayList2 = new ArrayList();
                for (hf6 hf6Var : listN) {
                    List list4 = hf6Var.c;
                    arrayList3 = new ArrayList();
                    for (Object obj2 : list4) {
                        if (!axq.y(((Number) obj2).longValue(), list)) {
                            arrayList3.add(obj2);
                        }
                    }
                    arrayList2.add(hf6.a(hf6Var, 0, 0, arrayList3, 0.0d, 27));
                }
                ((ymv) this.f).f42910a.I(arrayList2);
                objG = ((dq00) this.i).g(ahf0Var);
                if (objG != wne.f39444a) {
                    objG = Unit.f46060a;
                }
                if (objG != obj) {
                    q4fVar3 = q4fVar2;
                    h9c h9cVar = (h9c) this.g;
                    ahf0Var.i = null;
                    ahf0Var.j = q4fVar3;
                    ahf0Var.k = iE;
                    ahf0Var.l = z;
                    ahf0Var.p = 4;
                    objD = h9cVar.f12667a.D(ahf0Var);
                    if (objD != obj) {
                        jLongValue = ((Number) objD).longValue();
                        if (jLongValue >= iE) {
                        }
                        vit0Var = (vit0) this.d;
                        switch (q4fVar3.ordinal()) {
                            case 1:
                            case 3:
                            case 5:
                            case 6:
                            case 9:
                                q4fVar3 = q4f.d;
                                break;
                            case 2:
                            case 4:
                            case 7:
                            case 8:
                            case 11:
                                q4fVar3 = q4f.c;
                                break;
                        }
                        ahf0Var.i = null;
                        ahf0Var.j = null;
                        ahf0Var.k = iE;
                        ahf0Var.l = z;
                        ahf0Var.m = jLongValue;
                        ahf0Var.p = 5;
                        if (vit0Var.g(q4fVar3, ahf0Var) != obj) {
                            j = jLongValue;
                        }
                    }
                }
                return obj;
            }
            if (i2 == 3) {
                z = ahf0Var.l;
                iE = ahf0Var.k;
                q4f q4fVar5 = ahf0Var.j;
                z1x.P(objD);
                q4fVar3 = q4fVar5;
                h9c h9cVar2 = (h9c) this.g;
                ahf0Var.i = null;
                ahf0Var.j = q4fVar3;
                ahf0Var.k = iE;
                ahf0Var.l = z;
                ahf0Var.p = 4;
                objD = h9cVar2.f12667a.D(ahf0Var);
                if (objD != obj) {
                    jLongValue = ((Number) objD).longValue();
                    if (jLongValue >= iE) {
                    }
                    vit0Var = (vit0) this.d;
                    switch (q4fVar3.ordinal()) {
                        case 1:
                        case 3:
                        case 5:
                        case 6:
                        case 9:
                            q4fVar3 = q4f.d;
                            break;
                        case 2:
                        case 4:
                        case 7:
                        case 8:
                        case 11:
                            q4fVar3 = q4f.c;
                            break;
                    }
                    ahf0Var.i = null;
                    ahf0Var.j = null;
                    ahf0Var.k = iE;
                    ahf0Var.l = z;
                    ahf0Var.m = jLongValue;
                    ahf0Var.p = 5;
                    if (vit0Var.g(q4fVar3, ahf0Var) != obj) {
                        j = jLongValue;
                    }
                }
                return obj;
            }
            if (i2 == 4) {
                z = ahf0Var.l;
                iE = ahf0Var.k;
                q4fVar3 = ahf0Var.j;
                z1x.P(objD);
                jLongValue = ((Number) objD).longValue();
                if (jLongValue >= iE || z) {
                    vit0Var = (vit0) this.d;
                    switch (q4fVar3.ordinal()) {
                        case 1:
                        case 3:
                        case 5:
                        case 6:
                        case 9:
                            q4fVar3 = q4f.d;
                            break;
                        case 2:
                        case 4:
                        case 7:
                        case 8:
                        case 11:
                            q4fVar3 = q4f.c;
                            break;
                    }
                    ahf0Var.i = null;
                    ahf0Var.j = null;
                    ahf0Var.k = iE;
                    ahf0Var.l = z;
                    ahf0Var.m = jLongValue;
                    ahf0Var.p = 5;
                    if (vit0Var.g(q4fVar3, ahf0Var) != obj) {
                        j = jLongValue;
                    }
                    return obj;
                }
                if (jLongValue == 0) {
                    ((ni9) this.j).b();
                }
                return Unit.f46060a;
            }
            if (i2 != 5) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = ahf0Var.m;
            z1x.P(objD);
        }
        jLongValue = j;
        if (jLongValue == 0) {
            ((ni9) this.j).b();
        }
        return Unit.f46060a;
        boolean zBooleanValue = ((Boolean) objD).booleanValue();
        g3v g3vVar = (g3v) this.b;
        ahf0Var.i = list2;
        ahf0Var.j = q4fVar;
        ahf0Var.k = iE;
        ahf0Var.l = zBooleanValue;
        ahf0Var.p = 2;
        ou6 ou6Var = (ou6) g3vVar.f10630a.c;
        ou6Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("delete from bet_events where id IN (");
        tnq0.h(list2.size(), sb);
        sb.append(Separators.RPAREN);
        Object objW0 = sj3.w0(ahf0Var, ou6Var.f25862a, new iu6(sb.toString(), list2, yjeVar, (byte) 0), false, true);
        if (objW0 != obj) {
            objW0 = Unit.f46060a;
        }
        if (objW0 != obj) {
            objW0 = Unit.f46060a;
        }
        if (objW0 != obj) {
            objW0 = Unit.f46060a;
        }
        if (objW0 != obj) {
            list = list2;
            z = zBooleanValue;
            q4fVar2 = q4fVar;
            ahf0Var.i = null;
            ahf0Var.j = q4fVar2;
            ahf0Var.k = iE;
            ahf0Var.l = z;
            ahf0Var.p = 3;
            List<hf6> listN2 = ((hst) this.e).f13600a.n();
            arrayList2 = new ArrayList();
            while (r2.hasNext()) {
                List list5 = hf6Var.c;
                arrayList3 = new ArrayList();
                while (r12.hasNext()) {
                    if (!axq.y(((Number) obj2).longValue(), list)) {
                        arrayList3.add(obj2);
                    }
                }
                arrayList2.add(hf6.a(hf6Var, 0, 0, arrayList3, 0.0d, 27));
            }
            ((ymv) this.f).f42910a.I(arrayList2);
            objG = ((dq00) this.i).g(ahf0Var);
            if (objG != wne.f39444a) {
                objG = Unit.f46060a;
            }
            if (objG != obj) {
                q4fVar3 = q4fVar2;
                h9c h9cVar3 = (h9c) this.g;
                ahf0Var.i = null;
                ahf0Var.j = q4fVar3;
                ahf0Var.k = iE;
                ahf0Var.l = z;
                ahf0Var.p = 4;
                objD = h9cVar3.f12667a.D(ahf0Var);
                if (objD != obj) {
                    jLongValue = ((Number) objD).longValue();
                    if (jLongValue >= iE) {
                    }
                    vit0Var = (vit0) this.d;
                    switch (q4fVar3.ordinal()) {
                        case 1:
                        case 3:
                        case 5:
                        case 6:
                        case 9:
                            q4fVar3 = q4f.d;
                            break;
                        case 2:
                        case 4:
                        case 7:
                        case 8:
                        case 11:
                            q4fVar3 = q4f.c;
                            break;
                    }
                    ahf0Var.i = null;
                    ahf0Var.j = null;
                    ahf0Var.k = iE;
                    ahf0Var.l = z;
                    ahf0Var.m = jLongValue;
                    ahf0Var.p = 5;
                    if (vit0Var.g(q4fVar3, ahf0Var) != obj) {
                        j = jLongValue;
                        jLongValue = j;
                        if (jLongValue == 0) {
                            ((ni9) this.j).b();
                        }
                        return Unit.f46060a;
                    }
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public Object z(boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5, zje zjeVar) {
        kdu kduVar;
        if (zjeVar instanceof kdu) {
            kduVar = (kdu) zjeVar;
            int i2 = kduVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kduVar.k = i2 - Integer.MIN_VALUE;
            } else {
                kduVar = new kdu(this, zjeVar);
            }
        } else {
            kduVar = new kdu(this, zjeVar);
        }
        kdu kduVar2 = kduVar;
        Object objD0 = kduVar2.i;
        wne wneVar = wne.f39444a;
        int i3 = kduVar2.k;
        if (i3 == 0) {
            z1x.P(objD0);
            sff0 sff0VarA = ((pru) this.j).a();
            dvj dvjVar = ((mne) this.g).b;
            ldu lduVar = new ldu(z, this, i, z5, z2, z3, z4, sff0VarA, null);
            kduVar2.k = 1;
            objD0 = qjj.d0(dvjVar, lduVar, kduVar2);
            if (objD0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD0);
        }
        return ((j0g0) objD0).f15681a;
    }

    public wdu(g3v g3vVar, j9c j9cVar, vit0 vit0Var, hst hstVar, ymv ymvVar, tqt tqtVar, h9c h9cVar, lhf0 lhf0Var, dq00 dq00Var, ni9 ni9Var) {
        this.f38991a = (byte) 10;
        this.b = g3vVar;
        this.c = j9cVar;
        this.d = vit0Var;
        this.e = hstVar;
        this.f = ymvVar;
        this.g = h9cVar;
        this.h = lhf0Var;
        this.i = dq00Var;
        this.j = ni9Var;
    }

    public wdu(vit0 vit0Var, hst hstVar, ymv ymvVar, h9c h9cVar, tqt tqtVar, zri zriVar, j9c j9cVar, dq00 dq00Var, ipc ipcVar, ipc ipcVar2) {
        this.f38991a = (byte) 11;
        this.b = vit0Var;
        this.c = hstVar;
        this.d = ymvVar;
        this.e = h9cVar;
        this.f = zriVar;
        this.g = j9cVar;
        this.h = dq00Var;
        this.i = ipcVar;
        this.j = ipcVar2;
    }

    public wdu(owp0 owp0Var, viu viuVar, x4u x4uVar, aqt aqtVar, cmt cmtVar, n4u n4uVar, hru hruVar, db9 db9Var, yfu yfuVar) {
        this.f38991a = (byte) 12;
        aqtVar.getClass();
        this.b = owp0Var;
        this.c = viuVar;
        this.d = x4uVar;
        this.e = aqtVar;
        this.f = cmtVar;
        this.g = n4uVar;
        this.h = hruVar;
        this.i = db9Var;
        this.j = yfuVar;
    }

    public wdu(pru pruVar, xqt xqtVar, mtt mttVar, xqt xqtVar2, ciu ciuVar, xqt xqtVar3, f5a f5aVar, fpc fpcVar, mtt mttVar2) {
        this.f38991a = (byte) 1;
        this.b = xqtVar;
        this.c = mttVar;
        this.d = xqtVar2;
        this.e = ciuVar;
        this.f = xqtVar3;
        this.g = f5aVar;
        this.h = fpcVar;
        this.i = mttVar2;
        this.j = pruVar.a();
    }

    public wdu(dgu dguVar, f4u f4uVar, nku nkuVar, a1d a1dVar, b8u b8uVar, h9c h9cVar, reu reuVar, pru pruVar) {
        this.f38991a = (byte) 9;
        this.b = dguVar;
        this.c = f4uVar;
        this.d = nkuVar;
        this.e = a1dVar;
        this.f = b8uVar;
        this.g = h9cVar;
        this.h = reuVar;
        this.j = pruVar;
        this.i = maz.b(new pu50(this, (byte) 9));
    }

    public wdu(ha20 ha20Var, ony onyVar, r7v r7vVar, nrt nrtVar, mrt mrtVar, nvu nvuVar, ort ortVar, g45 g45Var, pru pruVar) {
        this.f38991a = (byte) 8;
        onyVar.getClass();
        this.b = ha20Var;
        this.c = onyVar;
        this.d = r7vVar;
        this.e = nrtVar;
        this.f = mrtVar;
        this.g = nvuVar;
        this.h = ortVar;
        this.i = g45Var;
        this.j = pruVar;
    }

    public wdu(hsj hsjVar, ntu ntuVar, ort ortVar, jtj jtjVar, wsf0 wsf0Var, hsj hsjVar2, moc mocVar, yr yrVar, pru pruVar) {
        this.f38991a = (byte) 2;
        this.c = hsjVar;
        this.i = ntuVar;
        this.d = ortVar;
        this.e = jtjVar;
        this.f = wsf0Var;
        this.b = hsjVar2;
        this.g = mocVar;
        this.h = yrVar;
        this.j = pruVar;
    }

    public wdu(hsj hsjVar, cu cuVar, dn0 dn0Var, ctf0 ctf0Var, j1q0 j1q0Var, mne mneVar, xoc xocVar, ntu ntuVar, pru pruVar) {
        this.f38991a = (byte) 0;
        dn0Var.getClass();
        ctf0Var.getClass();
        j1q0Var.getClass();
        this.b = hsjVar;
        this.c = cuVar;
        this.d = dn0Var;
        this.e = ctf0Var;
        this.f = j1q0Var;
        this.g = mneVar;
        this.h = xocVar;
        this.i = ntuVar;
        this.j = pruVar;
    }

    public wdu(kvt kvtVar, azt aztVar, v7i v7iVar, ivn ivnVar, wsc wscVar, yqc yqcVar, pru pruVar, viu viuVar, reu reuVar) {
        this.f38991a = (byte) 4;
        this.b = kvtVar;
        this.c = aztVar;
        this.d = v7iVar;
        this.e = ivnVar;
        this.f = wscVar;
        this.g = yqcVar;
        this.j = pruVar;
        this.h = viuVar;
        this.i = reuVar;
    }

    public /* synthetic */ wdu(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, byte b) {
        this.f38991a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
        this.i = obj8;
        this.j = obj9;
    }
}
