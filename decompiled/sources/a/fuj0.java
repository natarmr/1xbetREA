package a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.graphics.Rect;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.p000firebaseauthapi.zzaia;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class fuj0 implements cfr, zf60, lfn0, awh0, ngw0, nmw0, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10166a;
    public final Object b;

    public fuj0(byte b) {
        switch (b) {
            case 9:
                this.f10166a = new LinkedHashMap();
                this.b = new LinkedHashMap();
                break;
            case 12:
                this.f10166a = new int[4];
                this.b = new StringBuilder();
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                this.f10166a = new fq80();
                this.b = new m5v0();
                break;
            case 21:
                pz40 pz40VarE = androidx.compose.runtime.e.e(new zvv0(0, 0, new nsv0(0, 0, 0, 0.0f, 0.0f, 0.0f), new nsv0(0, 0, 0, 0.0f, 0.0f, 0.0f), new nsv0(0, 0, 0, 0.0f, 0.0f, 0.0f), 0, 0.0f, 0, 0.0f, 0.0f));
                this.f10166a = pz40VarE;
                this.b = pz40VarE;
                break;
            case 22:
                this.f10166a = Collections.synchronizedMap(new WeakHashMap());
                this.b = Collections.synchronizedMap(new WeakHashMap());
                break;
            default:
                this.f10166a = new LinkedList();
                this.b = new k050();
                break;
        }
    }

    public void A(long j, long j2, long j3, v39 v39Var, String str, String str2) {
        Object value;
        String str3;
        Object next;
        ArrayList arrayListR0;
        str.getClass();
        long jA = ((viu) this.b).a();
        d49 d49Var = (d49) ((eyg0) this.f10166a).b;
        d49Var.getClass();
        p7m0 p7m0Var = d49Var.f5443a.f3714a;
        do {
            value = p7m0Var.getValue();
            List<z39> list = (List) value;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str3 = str;
                    next = null;
                    break;
                }
                next = it.next();
                z39 z39Var = (z39) next;
                if (z39Var.f43709a == j) {
                    str3 = str;
                    if (Intrinsics.d(z39Var.e, str3) && z39Var.d == v39Var) {
                        break;
                    }
                }
            }
            z39 z39Var2 = (z39) next;
            if (z39Var2 != null) {
                arrayListR0 = new ArrayList(r3d.q(list, 10));
                for (z39 z39VarA : list) {
                    if (z39VarA == z39Var2) {
                        z39VarA = !z39VarA.h ? z39.a(z39VarA, jA, 0L, true, str2, 95) : z39.a(z39VarA, 0L, 0L, false, str2, 255);
                    }
                    arrayListR0.add(z39VarA);
                }
            } else {
                arrayListR0 = CollectionsKt.r0(list, new z39(j, j2, j3, v39Var, str3, jA, 0L, true, str2));
                p7m0Var = p7m0Var;
            }
        } while (!p7m0Var.m(value, arrayListR0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object B(zje zjeVar) {
        osn0 osn0Var;
        k050 k050Var;
        if (zjeVar instanceof osn0) {
            osn0Var = (osn0) zjeVar;
            int i = osn0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                osn0Var.l = i - Integer.MIN_VALUE;
            } else {
                osn0Var = new osn0(this, zjeVar);
            }
        } else {
            osn0Var = new osn0(this, zjeVar);
        }
        Object obj = osn0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = osn0Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            k050 k050Var2 = (k050) this.b;
            osn0Var.i = k050Var2;
            osn0Var.l = 1;
            if (k050Var2.d(osn0Var) == wneVar) {
                return wneVar;
            }
            k050Var = k050Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050Var = osn0Var.i;
            z1x.P(obj);
        }
        try {
            return Boolean.valueOf(((LinkedList) this.f10166a).isEmpty());
        } finally {
            k050Var.c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object C(zje zjeVar) {
        psn0 psn0Var;
        k050 k050Var;
        if (zjeVar instanceof psn0) {
            psn0Var = (psn0) zjeVar;
            int i = psn0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                psn0Var.l = i - Integer.MIN_VALUE;
            } else {
                psn0Var = new psn0(this, zjeVar);
            }
        } else {
            psn0Var = new psn0(this, zjeVar);
        }
        Object obj = psn0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = psn0Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            k050 k050Var2 = (k050) this.b;
            psn0Var.i = k050Var2;
            psn0Var.l = 1;
            if (k050Var2.d(psn0Var) == wneVar) {
                return wneVar;
            }
            k050Var = k050Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050Var = psn0Var.i;
            z1x.P(obj);
        }
        try {
            return (kka) CollectionsKt.firstOrNull((LinkedList) this.f10166a);
        } finally {
            k050Var.c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object D(zje zjeVar) {
        qsn0 qsn0Var;
        k050 k050Var;
        if (zjeVar instanceof qsn0) {
            qsn0Var = (qsn0) zjeVar;
            int i = qsn0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                qsn0Var.l = i - Integer.MIN_VALUE;
            } else {
                qsn0Var = new qsn0(this, zjeVar);
            }
        } else {
            qsn0Var = new qsn0(this, zjeVar);
        }
        Object obj = qsn0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = qsn0Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            k050 k050Var2 = (k050) this.b;
            qsn0Var.i = k050Var2;
            qsn0Var.l = 1;
            if (k050Var2.d(qsn0Var) == wneVar) {
                return wneVar;
            }
            k050Var = k050Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050Var = qsn0Var.i;
            z1x.P(obj);
        }
        try {
            return new Integer(((LinkedList) this.f10166a).size());
        } finally {
            k050Var.c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object E(zje zjeVar) {
        rsn0 rsn0Var;
        k050 k050Var;
        if (zjeVar instanceof rsn0) {
            rsn0Var = (rsn0) zjeVar;
            int i = rsn0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                rsn0Var.l = i - Integer.MIN_VALUE;
            } else {
                rsn0Var = new rsn0(this, zjeVar);
            }
        } else {
            rsn0Var = new rsn0(this, zjeVar);
        }
        Object obj = rsn0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = rsn0Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            k050 k050Var2 = (k050) this.b;
            rsn0Var.i = k050Var2;
            rsn0Var.l = 1;
            if (k050Var2.d(rsn0Var) == wneVar) {
                return wneVar;
            }
            k050Var = k050Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050Var = rsn0Var.i;
            z1x.P(obj);
        }
        try {
            return CollectionsKt.L0((LinkedList) this.f10166a);
        } finally {
            k050Var.c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object F(long j, long j2, zje zjeVar, String str) {
        hxu0 hxu0Var;
        if (zjeVar instanceof hxu0) {
            hxu0Var = (hxu0) zjeVar;
            int i = hxu0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                hxu0Var.k = i - Integer.MIN_VALUE;
            } else {
                hxu0Var = new hxu0(this, zjeVar);
            }
        } else {
            hxu0Var = new hxu0(this, zjeVar);
        }
        Object objD = hxu0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = hxu0Var.k;
        if (i2 == 0) {
            z1x.P(objD);
            trm0 trm0Var = (trm0) this.f10166a;
            String strA = ((btt0) this.b).a();
            dq40 dq40Var = new dq40(j2, j, str);
            hxu0Var.k = 1;
            objD = ((iwu0) ((rbt0) trm0Var.c).invoke()).d(strA, dq40Var, hxu0Var);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD);
        }
        return j0x.N((gq40) ((dx5) objD).a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object G(long j, long j2, zje zjeVar, String str) {
        ixu0 ixu0Var;
        if (zjeVar instanceof ixu0) {
            ixu0Var = (ixu0) zjeVar;
            int i = ixu0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ixu0Var.k = i - Integer.MIN_VALUE;
            } else {
                ixu0Var = new ixu0(this, zjeVar);
            }
        } else {
            ixu0Var = new ixu0(this, zjeVar);
        }
        Object objA = ixu0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ixu0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            trm0 trm0Var = (trm0) this.f10166a;
            String strA = ((btt0) this.b).a();
            dq40 dq40Var = new dq40(j2, j, str);
            ixu0Var.k = 1;
            objA = ((iwu0) ((rbt0) trm0Var.c).invoke()).a(strA, dq40Var, ixu0Var);
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
        return j0x.N((gq40) ((dx5) objA).a());
    }

    public void H(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        Map map3 = (Map) this.f10166a;
        synchronized (map3) {
            map = new HashMap(map3);
        }
        Map map4 = (Map) this.b;
        synchronized (map4) {
            map2 = new HashMap(map4);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).c(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new qa3(status));
            }
        }
    }

    public void I(mfx0 mfx0Var) throws IOException {
        if (((SharedPreferences.Editor) this.b).putString((String) this.f10166a, zcm0.s(mfx0Var.c())).commit()) {
            return;
        }
        ohq.l("Failed to write to SharedPreferences");
    }

    @Override // a.awh0
    public int a(int i) {
        CharSequence charSequence = (CharSequence) this.f10166a;
        do {
            i = ((tyc) this.b).N(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // a.awh0
    public int b(int i) {
        do {
            i = ((tyc) this.b).b0(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f10166a).charAt(i)));
        return i;
    }

    @Override // a.awh0
    public int c(int i) {
        do {
            i = ((tyc) this.b).N(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f10166a).charAt(i - 1)));
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x022d  */
    /* JADX WARN: Code duplicated, block: B:130:0x024e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0259  */
    /* JADX WARN: Code duplicated, block: B:133:0x0262  */
    /* JADX WARN: Code duplicated, block: B:134:0x026c  */
    /* JADX WARN: Code duplicated, block: B:136:0x0274  */
    /* JADX WARN: Code duplicated, block: B:138:0x027c  */
    /* JADX WARN: Code duplicated, block: B:139:0x0280  */
    /* JADX WARN: Code duplicated, block: B:141:0x0288  */
    /* JADX WARN: Code duplicated, block: B:142:0x028f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0297  */
    /* JADX WARN: Code duplicated, block: B:150:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:152:0x02af  */
    /* JADX WARN: Code duplicated, block: B:154:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:156:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:157:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:159:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:160:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:162:0x02db  */
    /* JADX WARN: Code duplicated, block: B:164:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:165:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:167:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:169:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:171:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:173:0x0305  */
    /* JADX WARN: Code duplicated, block: B:175:0x0315  */
    /* JADX WARN: Code duplicated, block: B:176:0x032f  */
    /* JADX WARN: Code duplicated, block: B:179:0x0340  */
    /* JADX WARN: Code duplicated, block: B:182:0x0349  */
    /* JADX WARN: Code duplicated, block: B:183:0x034b  */
    /* JADX WARN: Code duplicated, block: B:186:0x0354  */
    /* JADX WARN: Code duplicated, block: B:187:0x0356  */
    /* JADX WARN: Code duplicated, block: B:190:0x035f  */
    /* JADX WARN: Code duplicated, block: B:194:0x0367  */
    /* JADX WARN: Code duplicated, block: B:195:0x036c  */
    /* JADX WARN: Code duplicated, block: B:196:0x0371  */
    /* JADX WARN: Code duplicated, block: B:198:0x0384  */
    /* JADX WARN: Code duplicated, block: B:239:0x0363 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:175:0x0315, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v25 */
    @Override // a.lfn0
    public void d(byte[] bArr, int i, int i2, kfn0 kfn0Var, rbe rbeVar) {
        o5v0 o5v0VarD;
        String strTrim;
        int i3;
        String string;
        int i4;
        Matcher matcher;
        String strGroup;
        byte b;
        boolean z;
        fuj0 fuj0Var = this;
        fq80 fq80Var = (fq80) fuj0Var.f10166a;
        fq80Var.K(bArr, i + i2);
        fq80Var.M(i);
        ArrayList arrayList = new ArrayList();
        try {
            v5v0.d(fq80Var);
            while (!TextUtils.isEmpty(fq80Var.n(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z2 = false;
                int i5 = -1;
                int i6 = 0;
                byte b2 = -1;
                while (true) {
                    int i7 = 1;
                    if (b2 == -1) {
                        i6 = fq80Var.b;
                        String strN = fq80Var.n(StandardCharsets.UTF_8);
                        if (strN == null) {
                            b2 = 0;
                        } else if ("STYLE".equals(strN)) {
                            b2 = 2;
                        } else {
                            b2 = strN.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                        }
                    } else {
                        fq80Var.M(i6);
                        if (b2 == 0) {
                            pzw.V(new mpt0(arrayList2), kfn0Var, rbeVar);
                            return;
                        }
                        if (b2 == 1) {
                            while (!TextUtils.isEmpty(fq80Var.n(StandardCharsets.UTF_8))) {
                            }
                        } else {
                            String str = null;
                            if (b2 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    jf4.o("A style block was found after the first cue.");
                                    return;
                                }
                                fq80Var.n(StandardCharsets.UTF_8);
                                m5v0 m5v0Var = (m5v0) fuj0Var.b;
                                fq80 fq80Var2 = m5v0Var.f21236a;
                                StringBuilder sb = m5v0Var.b;
                                sb.setLength(0);
                                int i8 = fq80Var.b;
                                while (!TextUtils.isEmpty(fq80Var.n(StandardCharsets.UTF_8))) {
                                }
                                fq80Var2.K(fq80Var.f9961a, fq80Var.b);
                                fq80Var2.M(i8);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    m5v0.c(fq80Var2);
                                    if (fq80Var2.a() >= 5 && "::cue".equals(fq80Var2.x(5, StandardCharsets.UTF_8))) {
                                        int i9 = fq80Var2.b;
                                        String strB = m5v0.b(fq80Var2, sb);
                                        if (strB == null) {
                                            strTrim = str;
                                        } else if ("{".equals(strB)) {
                                            fq80Var2.M(i9);
                                            strTrim = "";
                                        } else {
                                            if (Separators.LPAREN.equals(strB)) {
                                                int i10 = fq80Var2.b;
                                                int i11 = fq80Var2.c;
                                                int i12 = z2 ? 1 : 0;
                                                while (i10 < i11 && i12 == 0) {
                                                    int i13 = i10 + 1;
                                                    i12 = ((char) fq80Var2.f9961a[i10]) == ')' ? i7 : z2 ? 1 : 0;
                                                    i10 = i13;
                                                }
                                                strTrim = fq80Var2.x((i10 - 1) - fq80Var2.b, StandardCharsets.UTF_8).trim();
                                            } else {
                                                strTrim = str;
                                            }
                                            if (!Separators.RPAREN.equals(m5v0.b(fq80Var2, sb))) {
                                                strTrim = str;
                                            }
                                        }
                                    } else {
                                        strTrim = str;
                                    }
                                    if (strTrim != null && "{".equals(m5v0.b(fq80Var2, sb))) {
                                        n5v0 n5v0Var = new n5v0();
                                        n5v0Var.f22964a = "";
                                        n5v0Var.b = "";
                                        n5v0Var.c = Collections.EMPTY_SET;
                                        n5v0Var.d = "";
                                        n5v0Var.e = str;
                                        n5v0Var.g = z2;
                                        n5v0Var.i = z2;
                                        n5v0Var.j = i5;
                                        n5v0Var.k = i5;
                                        n5v0Var.l = i5;
                                        n5v0Var.m = i5;
                                        n5v0Var.n = i5;
                                        n5v0Var.p = i5;
                                        n5v0Var.q = z2;
                                        if (!strTrim.isEmpty()) {
                                            int iIndexOf = strTrim.indexOf(91);
                                            if (iIndexOf != i5) {
                                                Matcher matcher2 = m5v0.c.matcher(strTrim.substring(iIndexOf));
                                                if (matcher2.matches()) {
                                                    String strGroup2 = matcher2.group(i7);
                                                    strGroup2.getClass();
                                                    n5v0Var.d = strGroup2;
                                                }
                                                strTrim = strTrim.substring(z2 ? 1 : 0, iIndexOf);
                                            }
                                            String str2 = vtt0.f38024a;
                                            String[] strArrSplit = strTrim.split("\\.", i5);
                                            String str3 = strArrSplit[z2 ? 1 : 0];
                                            int iIndexOf2 = str3.indexOf(35);
                                            if (iIndexOf2 != i5) {
                                                n5v0Var.b = str3.substring(z2 ? 1 : 0, iIndexOf2);
                                                n5v0Var.f22964a = str3.substring(iIndexOf2 + 1);
                                            } else {
                                                n5v0Var.b = str3;
                                            }
                                            if (strArrSplit.length > i7) {
                                                int length = strArrSplit.length;
                                                x0x.A(length <= strArrSplit.length ? i7 : z2 ? 1 : 0);
                                                n5v0Var.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, i7, length)));
                                            }
                                        }
                                        ?? r8 = z2 ? 1 : 0;
                                        String strB2 = str;
                                        while (r8 == 0) {
                                            int i14 = fq80Var2.b;
                                            strB2 = m5v0.b(fq80Var2, sb);
                                            ?? r15 = (strB2 == null || "}".equals(strB2)) ? i7 : z2;
                                            if (r15 == 0) {
                                                fq80Var2.M(i14);
                                                m5v0.c(fq80Var2);
                                                String strA = m5v0.a(fq80Var2, sb);
                                                if (!strA.isEmpty() && Separators.COLON.equals(m5v0.b(fq80Var2, sb))) {
                                                    m5v0.c(fq80Var2);
                                                    StringBuilder sb2 = new StringBuilder();
                                                    boolean z3 = false;
                                                    while (true) {
                                                        if (z3) {
                                                            string = sb2.toString();
                                                        } else {
                                                            int i15 = fq80Var2.b;
                                                            String strB3 = m5v0.b(fq80Var2, sb);
                                                            if (strB3 == null) {
                                                                string = null;
                                                            } else if ("}".equals(strB3) || Separators.SEMICOLON.equals(strB3)) {
                                                                fq80Var2.M(i15);
                                                                z3 = true;
                                                            } else {
                                                                sb2.append(strB3);
                                                            }
                                                        }
                                                    }
                                                    if (string == null || string.isEmpty()) {
                                                        i3 = 1;
                                                    } else {
                                                        int i16 = fq80Var2.b;
                                                        String strB4 = m5v0.b(fq80Var2, sb);
                                                        if (Separators.SEMICOLON.equals(strB4)) {
                                                            if (RemoteMessageConst.Notification.COLOR.equals(strA)) {
                                                                i4 = 1;
                                                                n5v0Var.f = j4d.a(string, true);
                                                                n5v0Var.g = true;
                                                            } else {
                                                                i4 = 1;
                                                                if ("background-color".equals(strA)) {
                                                                    n5v0Var.h = j4d.a(string, true);
                                                                    n5v0Var.i = true;
                                                                } else if ("ruby-position".equals(strA)) {
                                                                    if ("text-combine-upright".equals(strA)) {
                                                                        if ("all".equals(string)) {
                                                                            z = true;
                                                                        } else {
                                                                            z = true;
                                                                        }
                                                                        n5v0Var.q = z;
                                                                    } else if ("text-decoration".equals(strA)) {
                                                                        if ("underline".equals(string)) {
                                                                            i4 = 1;
                                                                            n5v0Var.k = 1;
                                                                        }
                                                                    } else if ("font-family".equals(strA)) {
                                                                        n5v0Var.e = j47.H0(string);
                                                                    } else if ("font-weight".equals(strA)) {
                                                                        i4 = 1;
                                                                        if ("font-style".equals(strA)) {
                                                                            if ("italic".equals(string)) {
                                                                                n5v0Var.m = 1;
                                                                            }
                                                                        } else if ("font-size".equals(strA)) {
                                                                            matcher = m5v0.d.matcher(j47.H0(string));
                                                                            if (matcher.matches()) {
                                                                                strGroup = matcher.group(2);
                                                                                strGroup.getClass();
                                                                                switch (strGroup.hashCode()) {
                                                                                    case 37:
                                                                                        if (!strGroup.equals(Separators.PERCENT)) {
                                                                                            b = 0;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                n5v0Var.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                n5v0Var.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                n5v0Var.n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                v4i0.e();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup3 = matcher.group(i3);
                                                                                        strGroup3.getClass();
                                                                                        n5v0Var.o = Float.parseFloat(strGroup3);
                                                                                        break;
                                                                                    case 3240:
                                                                                        if (!strGroup.equals("em")) {
                                                                                            b = 1;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                n5v0Var.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                n5v0Var.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                n5v0Var.n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                v4i0.e();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup4 = matcher.group(i3);
                                                                                        strGroup4.getClass();
                                                                                        n5v0Var.o = Float.parseFloat(strGroup4);
                                                                                        break;
                                                                                    case 3592:
                                                                                        if (!strGroup.equals("px")) {
                                                                                            b = 2;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                n5v0Var.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                n5v0Var.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                n5v0Var.n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                v4i0.e();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup5 = matcher.group(i3);
                                                                                        strGroup5.getClass();
                                                                                        n5v0Var.o = Float.parseFloat(strGroup5);
                                                                                        break;
                                                                                }
                                                                                b = -1;
                                                                                switch (b) {
                                                                                    case 0:
                                                                                        i3 = 1;
                                                                                        n5v0Var.n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i3 = 1;
                                                                                        n5v0Var.n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i3 = 1;
                                                                                        n5v0Var.n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        v4i0.e();
                                                                                        return;
                                                                                }
                                                                                String strGroup6 = matcher.group(i3);
                                                                                strGroup6.getClass();
                                                                                n5v0Var.o = Float.parseFloat(strGroup6);
                                                                            } else {
                                                                                f1t0.g0("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                            }
                                                                        }
                                                                    } else if ("bold".equals(string)) {
                                                                        i4 = 1;
                                                                        n5v0Var.l = 1;
                                                                    }
                                                                    i3 = 1;
                                                                } else if ("over".equals(string)) {
                                                                    n5v0Var.p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    n5v0Var.p = 2;
                                                                    i3 = 1;
                                                                } else {
                                                                    i3 = 1;
                                                                }
                                                            }
                                                            i3 = i4;
                                                        } else if ("}".equals(strB4)) {
                                                            fq80Var2.M(i16);
                                                            if (RemoteMessageConst.Notification.COLOR.equals(strA)) {
                                                                i4 = 1;
                                                                n5v0Var.f = j4d.a(string, true);
                                                                n5v0Var.g = true;
                                                            } else {
                                                                i4 = 1;
                                                                if ("background-color".equals(strA)) {
                                                                    n5v0Var.h = j4d.a(string, true);
                                                                    n5v0Var.i = true;
                                                                } else if ("ruby-position".equals(strA)) {
                                                                    if ("text-combine-upright".equals(strA)) {
                                                                        if ("all".equals(string) || string.startsWith("digits")) {
                                                                            z = true;
                                                                        } else {
                                                                            z = false;
                                                                        }
                                                                        n5v0Var.q = z;
                                                                    } else if ("text-decoration".equals(strA)) {
                                                                        if ("underline".equals(string)) {
                                                                            i4 = 1;
                                                                            n5v0Var.k = 1;
                                                                        }
                                                                    } else if ("font-family".equals(strA)) {
                                                                        n5v0Var.e = j47.H0(string);
                                                                    } else if ("font-weight".equals(strA)) {
                                                                        i4 = 1;
                                                                        if ("font-style".equals(strA)) {
                                                                            if ("italic".equals(string)) {
                                                                                n5v0Var.m = 1;
                                                                            }
                                                                        } else if ("font-size".equals(strA)) {
                                                                            matcher = m5v0.d.matcher(j47.H0(string));
                                                                            if (matcher.matches()) {
                                                                                f1t0.g0("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                            } else {
                                                                                strGroup = matcher.group(2);
                                                                                strGroup.getClass();
                                                                                switch (strGroup.hashCode()) {
                                                                                    case 37:
                                                                                        if (!strGroup.equals(Separators.PERCENT)) {
                                                                                            b = 0;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                n5v0Var.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                n5v0Var.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                n5v0Var.n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                v4i0.e();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup7 = matcher.group(i3);
                                                                                        strGroup7.getClass();
                                                                                        n5v0Var.o = Float.parseFloat(strGroup7);
                                                                                        break;
                                                                                    case 3240:
                                                                                        if (!strGroup.equals("em")) {
                                                                                            b = 1;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                n5v0Var.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                n5v0Var.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                n5v0Var.n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                v4i0.e();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup8 = matcher.group(i3);
                                                                                        strGroup8.getClass();
                                                                                        n5v0Var.o = Float.parseFloat(strGroup8);
                                                                                        break;
                                                                                    case 3592:
                                                                                        if (!strGroup.equals("px")) {
                                                                                            b = 2;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                n5v0Var.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                n5v0Var.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                n5v0Var.n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                v4i0.e();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup9 = matcher.group(i3);
                                                                                        strGroup9.getClass();
                                                                                        n5v0Var.o = Float.parseFloat(strGroup9);
                                                                                        break;
                                                                                }
                                                                                b = -1;
                                                                                switch (b) {
                                                                                    case 0:
                                                                                        i3 = 1;
                                                                                        n5v0Var.n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i3 = 1;
                                                                                        n5v0Var.n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i3 = 1;
                                                                                        n5v0Var.n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        v4i0.e();
                                                                                        return;
                                                                                }
                                                                                String strGroup10 = matcher.group(i3);
                                                                                strGroup10.getClass();
                                                                                n5v0Var.o = Float.parseFloat(strGroup10);
                                                                            }
                                                                        }
                                                                    } else if ("bold".equals(string)) {
                                                                        i4 = 1;
                                                                        n5v0Var.l = 1;
                                                                    }
                                                                    i3 = 1;
                                                                } else if ("over".equals(string)) {
                                                                    n5v0Var.p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    n5v0Var.p = 2;
                                                                    i3 = 1;
                                                                } else {
                                                                    i3 = 1;
                                                                }
                                                            }
                                                            i3 = i4;
                                                        } else {
                                                            i3 = 1;
                                                        }
                                                    }
                                                } else {
                                                    i3 = i7;
                                                }
                                            } else {
                                                i3 = i7;
                                            }
                                            i7 = i3;
                                            r8 = r15;
                                            z2 = false;
                                        }
                                        int i17 = i7;
                                        if ("}".equals(strB2)) {
                                            arrayList3.add(n5v0Var);
                                        }
                                        i7 = i17;
                                        z2 = false;
                                        i5 = -1;
                                        str = null;
                                    }
                                }
                                arrayList.addAll(arrayList3);
                            } else if (b2 == 3) {
                                Pattern pattern = t5v0.f33388a;
                                Charset charset = StandardCharsets.UTF_8;
                                String strN2 = fq80Var.n(charset);
                                if (strN2 == null) {
                                    o5v0VarD = null;
                                } else {
                                    Pattern pattern2 = t5v0.f33388a;
                                    Matcher matcher3 = pattern2.matcher(strN2);
                                    if (matcher3.matches()) {
                                        o5v0VarD = t5v0.d(null, matcher3, fq80Var, arrayList);
                                    } else {
                                        o5v0VarD = null;
                                        String strN3 = fq80Var.n(charset);
                                        if (strN3 != null) {
                                            Matcher matcher4 = pattern2.matcher(strN3);
                                            if (matcher4.matches()) {
                                                o5v0VarD = t5v0.d(strN2.trim(), matcher4, fq80Var, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (o5v0VarD != null) {
                                    arrayList2.add(o5v0VarD);
                                }
                            }
                            fuj0Var = this;
                        }
                    }
                }
            }
        } catch (kq80 e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // a.awh0
    public int e(int i) {
        do {
            i = ((tyc) this.b).b0(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f10166a).charAt(i - 1)));
        return i;
    }

    @Override // a.nmw0
    public h0q0 g(jlw0 jlw0Var) {
        h0q0 h0q0Var = (h0q0) this.b;
        h0q0Var.N((String) this.f10166a, jlw0Var);
        return h0q0Var;
    }

    @Override // a.ngw0
    public void h(xfw0 xfw0Var) {
        hcp0 hcp0Var = (hcp0) this.f10166a;
        phw0 phw0Var = (phw0) xfw0Var;
        if (!TextUtils.isEmpty(phw0Var.f)) {
            hcp0Var.c(new cmt0(phw0Var.f, phw0Var.e, null));
            return;
        }
        ((nmt0) this.b).g(new zzaia(Long.valueOf(phw0Var.d), phw0Var.b, phw0Var.f27018a), null, null, Boolean.valueOf(phw0Var.c), null, hcp0Var, this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(su4 su4Var, String str, zje zjeVar) {
        ljk0 ljk0Var;
        if (zjeVar instanceof ljk0) {
            ljk0Var = (ljk0) zjeVar;
            int i = ljk0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ljk0Var.k = i - Integer.MIN_VALUE;
            } else {
                ljk0Var = new ljk0(this, zjeVar);
            }
        } else {
            ljk0Var = new ljk0(this, zjeVar);
        }
        Object objB = ljk0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ljk0Var.k;
        if (i2 == 0) {
            z1x.P(objB);
            lpb lpbVar = (lpb) this.b;
            String strA = ((btt0) this.f10166a).a();
            vt vtVar = new vt(new tt(su4Var.b, su4Var.f32804a, su4Var.c, su4Var.d, str));
            ljk0Var.k = 1;
            objB = ((kjk0) lpbVar.f20432a.b(sre0.f32672a.b(kjk0.class))).b(strA, vtVar, ljk0Var);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        t16 t16Var = (t16) ((q16) objB).a();
        Boolean bool = t16Var.f33154a;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        String str2 = t16Var.b;
        if (str2 == null) {
            str2 = "";
        }
        Long l = t16Var.c;
        return new pt(str2, l != null ? l.longValue() : -1L, zBooleanValue);
    }

    public void j(tsv0 tsv0Var, nsv0 nsv0Var) {
        zvv0 zvv0VarA;
        hgk0 hgk0Var = (hgk0) ((pz40) this.f10166a);
        zvv0 zvv0Var = (zvv0) hgk0Var.getValue();
        int iOrdinal = tsv0Var.ordinal();
        if (iOrdinal == 0) {
            zvv0VarA = zvv0.a(zvv0Var, 0, 0, null, null, nsv0Var, 0, 0.0f, 0, 0.0f, 0.0f, 4031);
        } else if (iOrdinal == 1) {
            zvv0VarA = zvv0.a(zvv0Var, 0, 0, null, nsv0Var, null, 0, 0.0f, 0, 0.0f, 0.0f, 4063);
        } else {
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                t9f.b();
                return;
            }
            zvv0VarA = zvv0.a(zvv0Var, 0, 0, nsv0Var, null, null, 0, 0.0f, 0, 0.0f, 0.0f, 4079);
        }
        if (zvv0VarA.equals(zvv0Var)) {
            return;
        }
        hgk0Var.setValue(zvv0VarA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object k(zje zjeVar) {
        lsn0 lsn0Var;
        k050 k050Var;
        if (zjeVar instanceof lsn0) {
            lsn0Var = (lsn0) zjeVar;
            int i = lsn0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                lsn0Var.l = i - Integer.MIN_VALUE;
            } else {
                lsn0Var = new lsn0(this, zjeVar);
            }
        } else {
            lsn0Var = new lsn0(this, zjeVar);
        }
        Object obj = lsn0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = lsn0Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            k050 k050Var2 = (k050) this.b;
            lsn0Var.i = k050Var2;
            lsn0Var.l = 1;
            if (k050Var2.d(lsn0Var) == wneVar) {
                return wneVar;
            }
            k050Var = k050Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050Var = lsn0Var.i;
            z1x.P(obj);
        }
        try {
            ((LinkedList) this.f10166a).clear();
            return Unit.f46060a;
        } finally {
            k050Var.c(null);
        }
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        ViewPager viewPager = (ViewPager) this.b;
        xiv0 xiv0VarJ = rgu0.j(view, xiv0Var);
        if (xiv0VarJ.f40966a.s()) {
            return xiv0VarJ;
        }
        Rect rect = (Rect) this.f10166a;
        rect.left = xiv0VarJ.b();
        rect.top = xiv0VarJ.d();
        rect.right = xiv0VarJ.c();
        rect.bottom = xiv0VarJ.a();
        int childCount = viewPager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            xiv0 xiv0VarB = rgu0.b(viewPager.getChildAt(i), xiv0VarJ);
            rect.left = Math.min(xiv0VarB.b(), rect.left);
            rect.top = Math.min(xiv0VarB.d(), rect.top);
            rect.right = Math.min(xiv0VarB.c(), rect.right);
            rect.bottom = Math.min(xiv0VarB.a(), rect.bottom);
        }
        return xiv0VarJ.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object m(zje zjeVar) {
        msn0 msn0Var;
        k050 k050Var;
        LinkedList linkedList = (LinkedList) this.f10166a;
        if (zjeVar instanceof msn0) {
            msn0Var = (msn0) zjeVar;
            int i = msn0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                msn0Var.l = i - Integer.MIN_VALUE;
            } else {
                msn0Var = new msn0(this, zjeVar);
            }
        } else {
            msn0Var = new msn0(this, zjeVar);
        }
        Object obj = msn0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = msn0Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            k050Var = (k050) this.b;
            msn0Var.i = k050Var;
            msn0Var.l = 1;
            if (k050Var.d(msn0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050Var = msn0Var.i;
            z1x.P(obj);
        }
        try {
            return !linkedList.isEmpty() ? (kka) linkedList.removeFirst() : null;
        } finally {
            k050Var.c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(List list, zje zjeVar) {
        nsn0 nsn0Var;
        k050 k050Var;
        if (zjeVar instanceof nsn0) {
            nsn0Var = (nsn0) zjeVar;
            int i = nsn0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                nsn0Var.m = i - Integer.MIN_VALUE;
            } else {
                nsn0Var = new nsn0(this, zjeVar);
            }
        } else {
            nsn0Var = new nsn0(this, zjeVar);
        }
        Object obj = nsn0Var.k;
        wne wneVar = wne.f39444a;
        int i2 = nsn0Var.m;
        if (i2 == 0) {
            z1x.P(obj);
            k050Var = (k050) this.b;
            nsn0Var.i = list;
            nsn0Var.j = k050Var;
            nsn0Var.m = 1;
            if (k050Var.d(nsn0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050 k050Var2 = nsn0Var.j;
            List list2 = nsn0Var.i;
            z1x.P(obj);
            k050Var = k050Var2;
            list = list2;
        }
        try {
            ((LinkedList) this.f10166a).addAll(list);
            return Unit.f46060a;
        } finally {
            k050Var.c(null);
        }
    }

    public void o(String str, String str2, Function1 function1) {
        LinkedHashMap linkedHashMap = ((ea70) this.b).f7454a;
        euj0 euj0Var = new euj0(this, str, str2);
        function1.invoke(euj0Var);
        String str3 = (String) this.f10166a;
        ArrayList arrayList = euj0Var.b;
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((Pair) it.next()).f46059a);
        }
        String strL = (String) euj0Var.c.f46059a;
        strL.getClass();
        StringBuilder sb = new StringBuilder(str);
        sb.append('(');
        sb.append(CollectionsKt.b0(arrayList2, "", null, null, b180.z, 30));
        sb.append(')');
        if (strL.length() > 1) {
            strL = hne.l(';', TokenNames.L, strL);
        }
        sb.append(strL);
        String str4 = str3 + '.' + sb.toString();
        pys0 pys0Var = (pys0) euj0Var.c.b;
        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add((pys0) ((Pair) it2.next()).b);
        }
        linkedHashMap.put(str4, new ksb0(pys0Var, arrayList3, euj0Var.f8422a));
    }

    @Override // a.cfr
    public void onFailure(Throwable th) {
        ito0 ito0Var = (ito0) this.b;
        xr xrVar = (xr) this.f10166a;
        if (((snf0) xrVar.b).g) {
            return;
        }
        Object obj = ((t7a) ((ArrayList) xrVar.f41344a).get(0)).e.f8147a.get("CAPTURE_CONFIG_ID_KEY");
        int iIntValue = obj == null ? -1 : ((Integer) obj).intValue();
        boolean z = th instanceof ozw;
        dgu dguVar = ito0Var.c;
        if (z) {
            n55 n55Var = new n55(iIntValue, (ozw) th);
            dguVar.getClass();
            ofm0.m();
            ((r15) dguVar.d).k.accept(n55Var);
        } else {
            n55 n55Var2 = new n55(iIntValue, new ozw(2, "Failed to submit capture request", th));
            dguVar.getClass();
            ofm0.m();
            ((r15) dguVar.d).k.accept(n55Var2);
        }
        ito0Var.b.m();
    }

    @Override // a.cfr
    public void onSuccess(Object obj) {
        ((ito0) this.b).b.m();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object p(long j, long j2, zje zjeVar) {
        exu0 exu0Var;
        if (zjeVar instanceof exu0) {
            exu0Var = (exu0) zjeVar;
            int i = exu0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                exu0Var.k = i - Integer.MIN_VALUE;
            } else {
                exu0Var = new exu0(this, zjeVar);
            }
        } else {
            exu0Var = new exu0(this, zjeVar);
        }
        Object objC = exu0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = exu0Var.k;
        if (i2 == 0) {
            z1x.P(objC);
            trm0 trm0Var = (trm0) this.f10166a;
            String strA = ((btt0) this.b).a();
            lg5 lg5Var = new lg5(j, j2);
            exu0Var.k = 1;
            objC = ((iwu0) ((rbt0) trm0Var.c).invoke()).c(strA, lg5Var, exu0Var);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        og5 og5Var = (og5) ((dx5) objC).a();
        Double d = og5Var.b;
        if (d == null) {
            jf4.n("Balance can't be null");
            return null;
        }
        double dDoubleValue = d.doubleValue();
        String str = og5Var.c;
        if (str == null) {
            str = "";
        }
        Boolean bool = og5Var.d;
        return new ig5(dDoubleValue, str, bool != null ? bool.booleanValue() : true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable q(zje zjeVar) {
        mjk0 mjk0Var;
        if (zjeVar instanceof mjk0) {
            mjk0Var = (mjk0) zjeVar;
            int i = mjk0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                mjk0Var.k = i - Integer.MIN_VALUE;
            } else {
                mjk0Var = new mjk0(this, zjeVar);
            }
        } else {
            mjk0Var = new mjk0(this, zjeVar);
        }
        Object objA = mjk0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = mjk0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            lpb lpbVar = (lpb) this.b;
            String strA = ((btt0) this.f10166a).a();
            mjk0Var.k = 1;
            objA = ((kjk0) lpbVar.f20432a.b(sre0.f32672a.b(kjk0.class))).a(strA, mjk0Var);
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
        Iterable<buu> iterable = (Iterable) ((q16) objA).a();
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (buu buuVar : iterable) {
            buuVar.getClass();
            Integer num = buuVar.f3252a;
            if (num == null) {
                jf4.k(null);
                return null;
            }
            int iIntValue = num.intValue();
            String str = buuVar.b;
            if (str == null) {
                jf4.k(null);
                return null;
            }
            arrayList.add(new wtu(iIntValue, str));
        }
        return arrayList;
    }

    public String r(String str) {
        String str2 = (String) this.f10166a;
        Resources resources = (Resources) this.b;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public Object s(double d, long j, long j2, zje zjeVar) {
        fxu0 fxu0Var;
        if (zjeVar instanceof fxu0) {
            fxu0Var = (fxu0) zjeVar;
            int i = fxu0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                fxu0Var.k = i - Integer.MIN_VALUE;
            } else {
                fxu0Var = new fxu0(this, zjeVar);
            }
        } else {
            fxu0Var = new fxu0(this, zjeVar);
        }
        fxu0 fxu0Var2 = fxu0Var;
        Object objE = fxu0Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = fxu0Var2.k;
        if (i2 == 0) {
            z1x.P(objE);
            trm0 trm0Var = (trm0) this.f10166a;
            String strA = ((btt0) this.b).a();
            fxu0Var2.k = 1;
            objE = ((iwu0) ((rbt0) trm0Var.c).invoke()).e(strA, j, j2, d, new fk9(false), fxu0Var2);
            if (objE == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objE);
        }
        yyu0 yyu0Var = (yyu0) ((dx5) objE).a();
        Double d2 = yyu0Var.f43486a;
        double dDoubleValue = d2 != null ? d2.doubleValue() : 0.0d;
        String str = yyu0Var.b;
        if (str == null) {
            str = "";
        }
        Double d3 = yyu0Var.c;
        return new vyu0(dDoubleValue, d3 != null ? d3.doubleValue() : 0.0d, str);
    }

    /* JADX INFO: Removed unreachable split cross block B:141:0x02eb */
    /* JADX WARN: Can't wrap try/catch for region: R(3:71|136|(8:132|73|74|129|75|76|77|(1:80))(3:92|93|94)) */
    /* JADX WARN: Can't wrap try/catch for region: R(4:33|142|(6:35|137|36|37|38|(1:41))(2:54|(8:144|56|57|134|58|59|60|(1:63))(3:71|136|(8:132|73|74|129|75|76|77|(1:80))(3:92|93|94)))|122) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:(3:(1:(1:15)(2:16|17))(1:18)|109|(4:33|142|(6:35|137|36|37|38|(1:41))(2:54|(8:144|56|57|134|58|59|60|(1:63))(3:71|136|(8:132|73|74|129|75|76|77|(1:80))(3:92|93|94)))|122)(1:(2:126|127)(1:128)))(3:19|20|21)|139|81|65|149) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:35|137|36|37|38|(1:41)) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:132|73|74|129|75|76|77|(1:80)) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:144|56|57|134|58|59|60|(1:63)) */
    /* JADX WARN: Code duplicated, block: B:100:0x027c  */
    /* JADX WARN: Code duplicated, block: B:102:0x0283  */
    /* JADX WARN: Code duplicated, block: B:103:0x0285  */
    /* JADX WARN: Code duplicated, block: B:106:0x028a  */
    /* JADX WARN: Code duplicated, block: B:110:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:112:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:114:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:116:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:117:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:120:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:123:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:124:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:125:0x0303 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x0305  */
    /* JADX WARN: Code duplicated, block: B:128:0x030b  */
    /* JADX WARN: Code duplicated, block: B:132:0x0203 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x01b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0129  */
    /* JADX WARN: Code duplicated, block: B:35:0x012f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0152  */
    /* JADX WARN: Code duplicated, block: B:45:0x0176 A[Catch: all -> 0x0184, LOOP:0: B:43:0x0170->B:45:0x0176, LOOP_END, TryCatch #1 {all -> 0x0184, blocks: (B:42:0x015f, B:43:0x0170, B:45:0x0176, B:48:0x0192, B:64:0x01e7), top: B:131:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:54:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x01da  */
    /* JADX WARN: Code duplicated, block: B:71:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0226  */
    /* JADX WARN: Code duplicated, block: B:92:0x025b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0269 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x026b  */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02a1, code lost:
    
        if (a.qcc.P(r13, r8) == r1) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02e9, code lost:
    
        if (a.qcc.P(r13, r8) == r1) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0199, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x019a, code lost:
    
        r9 = r15;
        r15 = r0;
        r0 = r9;
        r20 = r11;
        r11 = r6;
        r6 = r13;
        r13 = r20;
        r9 = r17;
        r3 = r3;
        r4 = r4;
        r16 = r16;
        r17 = r17;
        r25 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01a7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01a8, code lost:
    
        r17 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01f5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01f6, code lost:
    
        r17 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01fa, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0239, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x023a, code lost:
    
        r6 = r15;
        r15 = r0;
        r0 = r6;
        r20 = r13;
        r13 = r7;
        r6 = r20;
        r8 = r4;
        r9 = r5;
        r4 = r17 == true ? 1 : 0;
        r3 = r3;
        r11 = r11;
        r16 = r16;
        r17 = r17;
        r25 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0247, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0248, code lost:
    
        r6 = r15;
        r15 = r0;
        r0 = r6;
        r6 = r13;
        r13 = r11;
        r11 = r25;
        r3 = r3;
        r4 = r4;
        r9 = r9;
        r16 = r16;
        r17 = r17;
        r25 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0250, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0251, code lost:
    
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0255, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0256, code lost:
    
        r9 = r17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00ce: MOVE (r4 I:??[long, double]) = (r13 I:??[long, double]) (LINE:207), block:B:23:0x00be */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x018d: MOVE (r6 I:??[long, double]) = (r13 I:??[long, double]) (LINE:398), block:B:47:0x0185 */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x00be: MOVE (r16 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]) (LINE:191), block:B:23:0x00be */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x0185: MOVE (r9 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]) (LINE:390), block:B:47:0x0185 */
    /* JADX WARN: Not initialized variable reg: 17, insn: 0x018e: MOVE (r4 I:??[long, double]) = (r17 I:??[long, double]) (LINE:399), block:B:47:0x0185 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [long] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v5, types: [long] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v20 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v22 */
    /* JADX WARN: Type inference failed for: r16v23 */
    /* JADX WARN: Type inference failed for: r16v24 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v5, types: [int] */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7, types: [a.knf0] */
    /* JADX WARN: Type inference failed for: r16v8, types: [a.knf0] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v14 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v22 */
    /* JADX WARN: Type inference failed for: r17v24 */
    /* JADX WARN: Type inference failed for: r17v25 */
    /* JADX WARN: Type inference failed for: r17v26 */
    /* JADX WARN: Type inference failed for: r17v27 */
    /* JADX WARN: Type inference failed for: r17v28 */
    /* JADX WARN: Type inference failed for: r17v29 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v30 */
    /* JADX WARN: Type inference failed for: r17v31 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9, types: [int] */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r2v1, types: [a.knf0] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v1, types: [a.drm0] */
    /* JADX WARN: Type inference failed for: r3v13, types: [a.drm0] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v13, types: [int] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r9v10, types: [int] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21, types: [int] */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x02a4 -> B:32:0x0127). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t(long r25, long r27, a.zje r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fuj0.t(long, long, a.zje):java.lang.Object");
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z = task.getException() instanceof qft0;
        g2x0 g2x0Var = (g2x0) this.b;
        tzw0 tzw0Var = (tzw0) this.f10166a;
        if (z) {
            return tzw0Var.c(g2x0Var.r());
        }
        if (task.getException() instanceof qa3) {
            qa3 qa3Var = (qa3) task.getException();
            qa3Var.getClass();
            if (qa3Var.getStatusCode() == 29514) {
                return tzw0Var.c(g2x0Var.r());
            }
        }
        return task;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:79|28|(1:31)|67) */
    /* JADX WARN: Code duplicated, block: B:31:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f8 A[Catch: all -> 0x0090, LOOP:0: B:33:0x00f2->B:35:0x00f8, LOOP_END, TryCatch #0 {all -> 0x0090, blocks: (B:32:0x00e1, B:33:0x00f2, B:35:0x00f8, B:36:0x0106, B:20:0x008c), top: B:77:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0119  */
    /* JADX WARN: Code duplicated, block: B:46:0x0122  */
    /* JADX WARN: Code duplicated, block: B:48:0x0127  */
    /* JADX WARN: Code duplicated, block: B:49:0x0129  */
    /* JADX WARN: Code duplicated, block: B:52:0x012e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0149  */
    /* JADX WARN: Code duplicated, block: B:57:0x0153  */
    /* JADX WARN: Code duplicated, block: B:59:0x015a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0160  */
    /* JADX WARN: Code duplicated, block: B:62:0x0162  */
    /* JADX WARN: Code duplicated, block: B:65:0x0167  */
    /* JADX WARN: Code duplicated, block: B:70:0x0183  */
    /* JADX WARN: Code duplicated, block: B:71:0x018d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0195 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x0197  */
    /* JADX WARN: Code duplicated, block: B:75:0x019d  */
    /* JADX WARN: Code duplicated, block: B:79:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010f, code lost:
    
        r15 = r9;
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0143, code lost:
    
        if (a.qcc.P(r11, r3) == r4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x017c, code lost:
    
        if (a.qcc.P(r11, r3) == r4) goto L67;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0146 -> B:45:0x0120). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0149 -> B:45:0x0120). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x017c -> B:14:0x0053). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0183 -> B:69:0x0181). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object u(long r19, a.zje r21) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fuj0.u(long, a.zje):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:90|25|(1:28)|79) */
    /* JADX WARN: Code duplicated, block: B:28:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00eb A[LOOP:0: B:33:0x00e5->B:35:0x00eb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:47:0x0127  */
    /* JADX WARN: Code duplicated, block: B:53:0x0134 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0136  */
    /* JADX WARN: Code duplicated, block: B:55:0x0140  */
    /* JADX WARN: Code duplicated, block: B:57:0x0147  */
    /* JADX WARN: Code duplicated, block: B:58:0x0149  */
    /* JADX WARN: Code duplicated, block: B:61:0x014e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0168  */
    /* JADX WARN: Code duplicated, block: B:67:0x016d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0178  */
    /* JADX WARN: Code duplicated, block: B:71:0x017f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0185  */
    /* JADX WARN: Code duplicated, block: B:74:0x0187  */
    /* JADX WARN: Code duplicated, block: B:77:0x018c  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:87:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:90:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x012b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012c, code lost:
    
        r15 = r9;
        r9 = r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0136 -> B:24:0x00a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x01a4 -> B:14:0x004d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x01ba -> B:66:0x016a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable v(java.lang.String r24, a.zje r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fuj0.v(java.lang.String, a.zje):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public Object w(double d, long j, long j2, zje zjeVar) {
        gxu0 gxu0Var;
        if (zjeVar instanceof gxu0) {
            gxu0Var = (gxu0) zjeVar;
            int i = gxu0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                gxu0Var.k = i - Integer.MIN_VALUE;
            } else {
                gxu0Var = new gxu0(this, zjeVar);
            }
        } else {
            gxu0Var = new gxu0(this, zjeVar);
        }
        gxu0 gxu0Var2 = gxu0Var;
        Object objB = gxu0Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = gxu0Var2.k;
        if (i2 == 0) {
            z1x.P(objB);
            trm0 trm0Var = (trm0) this.f10166a;
            String strA = ((btt0) this.b).a();
            gxu0Var2.k = 1;
            objB = ((iwu0) ((rbt0) trm0Var.c).invoke()).b(strA, j, j2, d, new fk9(false), gxu0Var2);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        czu0 czu0Var = (czu0) ((dx5) objB).a();
        Double d2 = czu0Var.f5241a;
        double dDoubleValue = d2 != null ? d2.doubleValue() : 0.0d;
        String str = czu0Var.b;
        if (str == null) {
            str = "";
        }
        Double d3 = czu0Var.c;
        return new zyu0(dDoubleValue, d3 != null ? d3.doubleValue() : 0.0d, str);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0297  */
    /* JADX WARN: Code duplicated, block: B:115:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:117:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:121:0x02de  */
    /* JADX WARN: Code duplicated, block: B:124:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:130:0x0306  */
    /* JADX WARN: Code duplicated, block: B:131:0x030d  */
    /* JADX WARN: Code duplicated, block: B:133:0x0311  */
    /* JADX WARN: Code duplicated, block: B:134:0x0318  */
    /* JADX WARN: Code duplicated, block: B:136:0x031c  */
    /* JADX WARN: Code duplicated, block: B:137:0x0321  */
    /* JADX WARN: Code duplicated, block: B:139:0x0324  */
    /* JADX WARN: Code duplicated, block: B:140:0x0327  */
    /* JADX WARN: Code duplicated, block: B:142:0x032b  */
    /* JADX WARN: Code duplicated, block: B:143:0x0330  */
    /* JADX WARN: Code duplicated, block: B:145:0x0333  */
    /* JADX WARN: Code duplicated, block: B:146:0x0336  */
    /* JADX WARN: Code duplicated, block: B:148:0x033a  */
    /* JADX WARN: Code duplicated, block: B:151:0x0345  */
    /* JADX WARN: Code duplicated, block: B:153:0x0348  */
    /* JADX WARN: Code duplicated, block: B:156:0x0353  */
    /* JADX WARN: Code duplicated, block: B:161:0x038f  */
    /* JADX WARN: Code duplicated, block: B:167:0x02ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x02fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:? A[LOOP:1: B:122:0x02e8->B:169:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    public Object x(zje zjeVar) {
        kkt0 kkt0Var;
        Iterable iterableR;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        List list;
        List listQ0;
        byte b;
        List list2;
        List list3;
        Object objD0;
        List list4;
        List list5;
        List list6;
        List<qu6> list7;
        ArrayList arrayListQ0;
        ArrayList arrayList4;
        ArrayList arrayList5;
        Iterator it;
        Object obj;
        p5t p5tVar;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int size;
        int size2;
        List list8;
        List list9;
        Object next;
        chf0 chf0Var = (chf0) this.b;
        g45 g45Var = (g45) this.f10166a;
        mne mneVar = (mne) g45Var.i;
        lye lyeVar = (lye) g45Var.f10647a;
        if (zjeVar instanceof kkt0) {
            kkt0Var = (kkt0) zjeVar;
            int i = kkt0Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                kkt0Var.q = i - Integer.MIN_VALUE;
            } else {
                kkt0Var = new kkt0(this, zjeVar);
            }
        } else {
            kkt0Var = new kkt0(this, zjeVar);
        }
        Object obj2 = kkt0Var.o;
        wne wneVar = wne.f39444a;
        int i2 = kkt0Var.q;
        if (i2 == 0) {
            z1x.P(obj2);
            if (((ave) g45Var.c).f1521a != q4f.m) {
                iterableR = lyeVar.b.e;
            } else {
                ArrayList arrayList6 = ((m0f) g45Var.b).b;
                ArrayList arrayList7 = new ArrayList(r3d.q(arrayList6, 10));
                Iterator it2 = arrayList6.iterator();
                while (it2.hasNext()) {
                    arrayList7.add(((cit0) it2.next()).e);
                }
                iterableR = r3d.r(arrayList7);
            }
            ArrayList arrayList8 = new ArrayList();
            for (Object obj3 : iterableR) {
                if (((m97) obj3).s) {
                    arrayList8.add(obj3);
                }
            }
            ArrayList arrayList9 = new ArrayList(r3d.q(arrayList8, 10));
            Iterator it3 = arrayList8.iterator();
            while (it3.hasNext()) {
                axq.t(((m97) it3.next()).f21398a, arrayList9);
            }
            kkt0Var.i = arrayList9;
            kkt0Var.q = 1;
            Serializable serializableP = chf0Var.p(kkt0Var);
            if (serializableP != wneVar) {
                arrayList = arrayList9;
                obj2 = serializableP;
            }
            return wneVar;
        }
        if (i2 == 1) {
            arrayList = kkt0Var.i;
            z1x.P(obj2);
        } else {
            if (i2 == 2) {
                ArrayList arrayList10 = kkt0Var.l;
                arrayList2 = kkt0Var.k;
                List list10 = kkt0Var.j;
                z1x.P(obj2);
                arrayList3 = arrayList10;
                list6 = list10;
                listQ0 = CollectionsKt.q0((Collection) obj2, arrayList3);
                list = list6;
                if (arrayList2.isEmpty()) {
                    b = 0;
                    list2 = listQ0;
                    list3 = iun.f15405a;
                    list7 = list;
                    arrayListQ0 = CollectionsKt.q0(list3, list2);
                    arrayList4 = new ArrayList(r3d.q(list7, 10));
                    for (qu6 qu6Var : list7) {
                        it = arrayListQ0.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            next = it.next();
                            if (((p5t) next).f26422a == qu6Var.b) {
                                obj = next;
                                break;
                            }
                        }
                        p5tVar = (p5t) obj;
                        if (p5tVar != null) {
                            str = p5tVar.v.f12320a;
                        } else {
                            str = "";
                        }
                        if (p5tVar != null) {
                            str2 = p5tVar.w.f12320a;
                        } else {
                            str2 = "";
                        }
                        if (p5tVar != null) {
                            str3 = p5tVar.x.f7170a;
                        } else {
                            str3 = null;
                        }
                        if (str3 == null) {
                            str4 = "";
                        } else {
                            str4 = str3;
                        }
                        if (p5tVar != null) {
                            str5 = p5tVar.y.f23172a;
                        } else {
                            str5 = null;
                        }
                        if (str5 == null) {
                            str6 = "";
                        } else {
                            str6 = str5;
                        }
                        if (p5tVar != null) {
                            size = b;
                        } else {
                            size = b;
                        }
                        if (p5tVar != null) {
                            size2 = b;
                        } else {
                            size2 = b;
                        }
                        arrayList4.add(qu6.a(qu6Var, 0L, 0L, 0L, str, str2, str4, str6, null, 0.0d, null, 0L, null, Math.max(size, size2), null, -67138049));
                    }
                    kkt0Var.i = null;
                    kkt0Var.j = null;
                    kkt0Var.k = null;
                    kkt0Var.l = null;
                    kkt0Var.m = null;
                    kkt0Var.n = arrayListQ0;
                    kkt0Var.q = 4;
                    if (chf0Var.j0(arrayList4, kkt0Var) != wneVar) {
                        arrayList5 = arrayListQ0;
                    }
                } else {
                    kkt0Var.i = null;
                    kkt0Var.j = list;
                    kkt0Var.k = null;
                    kkt0Var.l = null;
                    kkt0Var.m = listQ0;
                    kkt0Var.q = 3;
                    b = 0;
                    objD0 = qjj.d0(mneVar.b, new b1f(g45Var, arrayList2, (yje) null, b), kkt0Var);
                    if (objD0 != wneVar) {
                        list4 = listQ0;
                        obj2 = objD0;
                        list5 = list;
                        list3 = (List) obj2;
                        list7 = list5;
                        list2 = list4;
                        arrayListQ0 = CollectionsKt.q0(list3, list2);
                        arrayList4 = new ArrayList(r3d.q(list7, 10));
                        while (r4.hasNext()) {
                            it = arrayListQ0.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                next = it.next();
                                if (((p5t) next).f26422a == qu6Var.b) {
                                    obj = next;
                                    break;
                                }
                            }
                            p5tVar = (p5t) obj;
                            if (p5tVar != null) {
                                str = p5tVar.v.f12320a;
                            } else {
                                str = "";
                            }
                            if (p5tVar != null) {
                                str2 = p5tVar.w.f12320a;
                            } else {
                                str2 = "";
                            }
                            if (p5tVar != null) {
                                str3 = p5tVar.x.f7170a;
                            } else {
                                str3 = null;
                            }
                            if (str3 == null) {
                                str4 = "";
                            } else {
                                str4 = str3;
                            }
                            if (p5tVar != null) {
                                str5 = p5tVar.y.f23172a;
                            } else {
                                str5 = null;
                            }
                            if (str5 == null) {
                                str6 = "";
                            } else {
                                str6 = str5;
                            }
                            if (p5tVar != null) {
                                size = b;
                            } else {
                                size = b;
                            }
                            if (p5tVar != null) {
                                size2 = b;
                            } else {
                                size2 = b;
                            }
                            arrayList4.add(qu6.a(qu6Var, 0L, 0L, 0L, str, str2, str4, str6, null, 0.0d, null, 0L, null, Math.max(size, size2), null, -67138049));
                        }
                        kkt0Var.i = null;
                        kkt0Var.j = null;
                        kkt0Var.k = null;
                        kkt0Var.l = null;
                        kkt0Var.m = null;
                        kkt0Var.n = arrayListQ0;
                        kkt0Var.q = 4;
                        if (chf0Var.j0(arrayList4, kkt0Var) != wneVar) {
                            arrayList5 = arrayListQ0;
                        }
                    }
                }
                return wneVar;
            }
            if (i2 == 3) {
                List list11 = (List) kkt0Var.m;
                List list12 = kkt0Var.j;
                z1x.P(obj2);
                b = 0;
                list4 = list11;
                list5 = list12;
                list3 = (List) obj2;
                list7 = list5;
                list2 = list4;
                arrayListQ0 = CollectionsKt.q0(list3, list2);
                arrayList4 = new ArrayList(r3d.q(list7, 10));
                while (r4.hasNext()) {
                    it = arrayListQ0.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        next = it.next();
                        if (((p5t) next).f26422a == qu6Var.b) {
                            obj = next;
                            break;
                        }
                    }
                    p5tVar = (p5t) obj;
                    if (p5tVar != null) {
                        str = p5tVar.v.f12320a;
                    } else {
                        str = "";
                    }
                    if (p5tVar != null) {
                        str2 = p5tVar.w.f12320a;
                    } else {
                        str2 = "";
                    }
                    if (p5tVar != null) {
                        str3 = p5tVar.x.f7170a;
                    } else {
                        str3 = null;
                    }
                    if (str3 == null) {
                        str4 = "";
                    } else {
                        str4 = str3;
                    }
                    if (p5tVar != null) {
                        str5 = p5tVar.y.f23172a;
                    } else {
                        str5 = null;
                    }
                    if (str5 == null) {
                        str6 = "";
                    } else {
                        str6 = str5;
                    }
                    if (p5tVar != null || (list9 = p5tVar.v.c) == null) {
                        size = b;
                    } else {
                        size = list9.size();
                    }
                    if (p5tVar != null || (list8 = p5tVar.w.c) == null) {
                        size2 = b;
                    } else {
                        size2 = list8.size();
                    }
                    arrayList4.add(qu6.a(qu6Var, 0L, 0L, 0L, str, str2, str4, str6, null, 0.0d, null, 0L, null, Math.max(size, size2), null, -67138049));
                }
                kkt0Var.i = null;
                kkt0Var.j = null;
                kkt0Var.k = null;
                kkt0Var.l = null;
                kkt0Var.m = null;
                kkt0Var.n = arrayListQ0;
                kkt0Var.q = 4;
                if (chf0Var.j0(arrayList4, kkt0Var) != wneVar) {
                    arrayList5 = arrayListQ0;
                }
                return wneVar;
            }
            if (i2 != 4) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList5 = kkt0Var.n;
            z1x.P(obj2);
        }
        arrayList5.getClass();
        lyeVar.getClass();
        ArrayList arrayList11 = lyeVar.d;
        arrayList11.clear();
        arrayList11.addAll(arrayList5);
        return Unit.f46060a;
        ArrayList arrayList12 = new ArrayList();
        for (Object obj4 : (Iterable) obj2) {
            if (!arrayList.contains(new Long(((qu6) obj4).b))) {
                arrayList12.add(obj4);
            }
        }
        ArrayList arrayList13 = new ArrayList(r3d.q(arrayList12, 10));
        Iterator it4 = arrayList12.iterator();
        while (it4.hasNext()) {
            axq.t(((qu6) it4.next()).b, arrayList13);
        }
        ArrayList arrayList14 = lyeVar.d;
        ArrayList arrayList15 = new ArrayList();
        for (Object obj5 : arrayList14) {
            if (arrayList13.contains(new Long(((p5t) obj5).f26422a))) {
                arrayList15.add(obj5);
            }
        }
        ArrayList arrayList16 = new ArrayList(r3d.q(arrayList15, 10));
        Iterator it5 = arrayList15.iterator();
        while (it5.hasNext()) {
            axq.t(((p5t) it5.next()).f26422a, arrayList16);
        }
        ArrayList arrayList17 = new ArrayList();
        for (Object obj6 : arrayList12) {
            if (((qu6) obj6).w == uoy.LIVE) {
                arrayList17.add(obj6);
            }
        }
        arrayList2 = new ArrayList(r3d.q(arrayList17, 10));
        Iterator it6 = arrayList17.iterator();
        while (it6.hasNext()) {
            axq.t(((qu6) it6.next()).b, arrayList2);
        }
        ArrayList arrayList18 = new ArrayList();
        for (Object obj7 : arrayList12) {
            if (((qu6) obj7).w == uoy.LINE) {
                arrayList18.add(obj7);
            }
        }
        ArrayList arrayList19 = new ArrayList(r3d.q(arrayList18, 10));
        Iterator it7 = arrayList18.iterator();
        while (it7.hasNext()) {
            axq.t(((qu6) it7.next()).b, arrayList19);
        }
        ArrayList arrayList20 = new ArrayList();
        for (Object obj8 : arrayList19) {
            if (!arrayList16.contains(new Long(((Number) obj8).longValue()))) {
                arrayList20.add(obj8);
            }
        }
        ArrayList arrayList21 = new ArrayList();
        for (Object obj9 : arrayList15) {
            int i3 = ((p5t) obj9).o;
            tqt tqtVar = uoy.b;
            if (i3 == 3) {
                arrayList21.add(obj9);
            }
        }
        if (arrayList20.isEmpty()) {
            listQ0 = arrayList21;
            list = arrayList12;
            if (arrayList19.isEmpty()) {
                listQ0 = iun.f15405a;
                list = arrayList12;
            }
            if (arrayList2.isEmpty()) {
                kkt0Var.i = null;
                kkt0Var.j = list;
                kkt0Var.k = null;
                kkt0Var.l = null;
                kkt0Var.m = listQ0;
                kkt0Var.q = 3;
                b = 0;
                objD0 = qjj.d0(mneVar.b, new b1f(g45Var, arrayList2, (yje) null, b), kkt0Var);
                if (objD0 != wneVar) {
                    list4 = listQ0;
                    obj2 = objD0;
                    list5 = list;
                    list3 = (List) obj2;
                    list7 = list5;
                    list2 = list4;
                    arrayListQ0 = CollectionsKt.q0(list3, list2);
                    arrayList4 = new ArrayList(r3d.q(list7, 10));
                    while (r4.hasNext()) {
                        it = arrayListQ0.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            next = it.next();
                            if (((p5t) next).f26422a == qu6Var.b) {
                                obj = next;
                                break;
                            }
                        }
                        p5tVar = (p5t) obj;
                        if (p5tVar != null) {
                            str = p5tVar.v.f12320a;
                        } else {
                            str = "";
                        }
                        if (p5tVar != null) {
                            str2 = p5tVar.w.f12320a;
                        } else {
                            str2 = "";
                        }
                        if (p5tVar != null) {
                            str3 = p5tVar.x.f7170a;
                        } else {
                            str3 = null;
                        }
                        if (str3 == null) {
                            str4 = "";
                        } else {
                            str4 = str3;
                        }
                        if (p5tVar != null) {
                            str5 = p5tVar.y.f23172a;
                        } else {
                            str5 = null;
                        }
                        if (str5 == null) {
                            str6 = "";
                        } else {
                            str6 = str5;
                        }
                        if (p5tVar != null) {
                            size = b;
                        } else {
                            size = b;
                        }
                        if (p5tVar != null) {
                            size2 = b;
                        } else {
                            size2 = b;
                        }
                        arrayList4.add(qu6.a(qu6Var, 0L, 0L, 0L, str, str2, str4, str6, null, 0.0d, null, 0L, null, Math.max(size, size2), null, -67138049));
                    }
                    kkt0Var.i = null;
                    kkt0Var.j = null;
                    kkt0Var.k = null;
                    kkt0Var.l = null;
                    kkt0Var.m = null;
                    kkt0Var.n = arrayListQ0;
                    kkt0Var.q = 4;
                    if (chf0Var.j0(arrayList4, kkt0Var) != wneVar) {
                        arrayList5 = arrayListQ0;
                        arrayList5.getClass();
                        lyeVar.getClass();
                        ArrayList arrayList110 = lyeVar.d;
                        arrayList110.clear();
                        arrayList110.addAll(arrayList5);
                        return Unit.f46060a;
                    }
                }
            } else {
                b = 0;
                list2 = listQ0;
                list3 = iun.f15405a;
                list7 = list;
                arrayListQ0 = CollectionsKt.q0(list3, list2);
                arrayList4 = new ArrayList(r3d.q(list7, 10));
                while (r4.hasNext()) {
                    it = arrayListQ0.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        next = it.next();
                        if (((p5t) next).f26422a == qu6Var.b) {
                            obj = next;
                            break;
                        }
                    }
                    p5tVar = (p5t) obj;
                    if (p5tVar != null) {
                        str = p5tVar.v.f12320a;
                    } else {
                        str = "";
                    }
                    if (p5tVar != null) {
                        str2 = p5tVar.w.f12320a;
                    } else {
                        str2 = "";
                    }
                    if (p5tVar != null) {
                        str3 = p5tVar.x.f7170a;
                    } else {
                        str3 = null;
                    }
                    if (str3 == null) {
                        str4 = "";
                    } else {
                        str4 = str3;
                    }
                    if (p5tVar != null) {
                        str5 = p5tVar.y.f23172a;
                    } else {
                        str5 = null;
                    }
                    if (str5 == null) {
                        str6 = "";
                    } else {
                        str6 = str5;
                    }
                    if (p5tVar != null) {
                        size = b;
                    } else {
                        size = b;
                    }
                    if (p5tVar != null) {
                        size2 = b;
                    } else {
                        size2 = b;
                    }
                    arrayList4.add(qu6.a(qu6Var, 0L, 0L, 0L, str, str2, str4, str6, null, 0.0d, null, 0L, null, Math.max(size, size2), null, -67138049));
                }
                kkt0Var.i = null;
                kkt0Var.j = null;
                kkt0Var.k = null;
                kkt0Var.l = null;
                kkt0Var.m = null;
                kkt0Var.n = arrayListQ0;
                kkt0Var.q = 4;
                if (chf0Var.j0(arrayList4, kkt0Var) != wneVar) {
                    arrayList5 = arrayListQ0;
                    arrayList5.getClass();
                    lyeVar.getClass();
                    ArrayList arrayList111 = lyeVar.d;
                    arrayList111.clear();
                    arrayList111.addAll(arrayList5);
                    return Unit.f46060a;
                }
            }
        } else {
            kkt0Var.i = null;
            kkt0Var.j = arrayList12;
            kkt0Var.k = arrayList2;
            kkt0Var.l = arrayList21;
            kkt0Var.q = 2;
            Object objD1 = qjj.d0(mneVar.b, new jtb(g45Var, arrayList20, null, (byte) 29), kkt0Var);
            if (objD1 != wneVar) {
                arrayList3 = arrayList21;
                obj2 = objD1;
                list6 = arrayList12;
                listQ0 = CollectionsKt.q0((Collection) obj2, arrayList3);
                list = list6;
                if (arrayList2.isEmpty()) {
                    kkt0Var.i = null;
                    kkt0Var.j = list;
                    kkt0Var.k = null;
                    kkt0Var.l = null;
                    kkt0Var.m = listQ0;
                    kkt0Var.q = 3;
                    b = 0;
                    objD0 = qjj.d0(mneVar.b, new b1f(g45Var, arrayList2, (yje) null, b), kkt0Var);
                    if (objD0 != wneVar) {
                        list4 = listQ0;
                        obj2 = objD0;
                        list5 = list;
                        list3 = (List) obj2;
                        list7 = list5;
                        list2 = list4;
                        arrayListQ0 = CollectionsKt.q0(list3, list2);
                        arrayList4 = new ArrayList(r3d.q(list7, 10));
                        while (r4.hasNext()) {
                            it = arrayListQ0.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                next = it.next();
                                if (((p5t) next).f26422a == qu6Var.b) {
                                    obj = next;
                                    break;
                                }
                            }
                            p5tVar = (p5t) obj;
                            if (p5tVar != null) {
                                str = p5tVar.v.f12320a;
                            } else {
                                str = "";
                            }
                            if (p5tVar != null) {
                                str2 = p5tVar.w.f12320a;
                            } else {
                                str2 = "";
                            }
                            if (p5tVar != null) {
                                str3 = p5tVar.x.f7170a;
                            } else {
                                str3 = null;
                            }
                            if (str3 == null) {
                                str4 = "";
                            } else {
                                str4 = str3;
                            }
                            if (p5tVar != null) {
                                str5 = p5tVar.y.f23172a;
                            } else {
                                str5 = null;
                            }
                            if (str5 == null) {
                                str6 = "";
                            } else {
                                str6 = str5;
                            }
                            if (p5tVar != null) {
                                size = b;
                            } else {
                                size = b;
                            }
                            if (p5tVar != null) {
                                size2 = b;
                            } else {
                                size2 = b;
                            }
                            arrayList4.add(qu6.a(qu6Var, 0L, 0L, 0L, str, str2, str4, str6, null, 0.0d, null, 0L, null, Math.max(size, size2), null, -67138049));
                        }
                        kkt0Var.i = null;
                        kkt0Var.j = null;
                        kkt0Var.k = null;
                        kkt0Var.l = null;
                        kkt0Var.m = null;
                        kkt0Var.n = arrayListQ0;
                        kkt0Var.q = 4;
                        if (chf0Var.j0(arrayList4, kkt0Var) != wneVar) {
                            arrayList5 = arrayListQ0;
                            arrayList5.getClass();
                            lyeVar.getClass();
                            ArrayList arrayList112 = lyeVar.d;
                            arrayList112.clear();
                            arrayList112.addAll(arrayList5);
                            return Unit.f46060a;
                        }
                    }
                } else {
                    b = 0;
                    list2 = listQ0;
                    list3 = iun.f15405a;
                    list7 = list;
                    arrayListQ0 = CollectionsKt.q0(list3, list2);
                    arrayList4 = new ArrayList(r3d.q(list7, 10));
                    while (r4.hasNext()) {
                        it = arrayListQ0.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            next = it.next();
                            if (((p5t) next).f26422a == qu6Var.b) {
                                obj = next;
                                break;
                            }
                        }
                        p5tVar = (p5t) obj;
                        if (p5tVar != null) {
                            str = p5tVar.v.f12320a;
                        } else {
                            str = "";
                        }
                        if (p5tVar != null) {
                            str2 = p5tVar.w.f12320a;
                        } else {
                            str2 = "";
                        }
                        if (p5tVar != null) {
                            str3 = p5tVar.x.f7170a;
                        } else {
                            str3 = null;
                        }
                        if (str3 == null) {
                            str4 = "";
                        } else {
                            str4 = str3;
                        }
                        if (p5tVar != null) {
                            str5 = p5tVar.y.f23172a;
                        } else {
                            str5 = null;
                        }
                        if (str5 == null) {
                            str6 = "";
                        } else {
                            str6 = str5;
                        }
                        if (p5tVar != null) {
                            size = b;
                        } else {
                            size = b;
                        }
                        if (p5tVar != null) {
                            size2 = b;
                        } else {
                            size2 = b;
                        }
                        arrayList4.add(qu6.a(qu6Var, 0L, 0L, 0L, str, str2, str4, str6, null, 0.0d, null, 0L, null, Math.max(size, size2), null, -67138049));
                    }
                    kkt0Var.i = null;
                    kkt0Var.j = null;
                    kkt0Var.k = null;
                    kkt0Var.l = null;
                    kkt0Var.m = null;
                    kkt0Var.n = arrayListQ0;
                    kkt0Var.q = 4;
                    if (chf0Var.j0(arrayList4, kkt0Var) != wneVar) {
                        arrayList5 = arrayListQ0;
                        arrayList5.getClass();
                        lyeVar.getClass();
                        ArrayList arrayList113 = lyeVar.d;
                        arrayList113.clear();
                        arrayList113.addAll(arrayList5);
                        return Unit.f46060a;
                    }
                }
            }
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object y(String str, zje zjeVar) throws zhi0 {
        cqt0 cqt0Var;
        if (zjeVar instanceof cqt0) {
            cqt0Var = (cqt0) zjeVar;
            int i = cqt0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                cqt0Var.l = i - Integer.MIN_VALUE;
            } else {
                cqt0Var = new cqt0(this, zjeVar);
            }
        } else {
            cqt0Var = new cqt0(this, zjeVar);
        }
        Object objG = cqt0Var.j;
        Object obj = wne.f39444a;
        int i2 = cqt0Var.l;
        if (i2 == 0) {
            z1x.P(objG);
            khf0 khf0Var = (khf0) this.b;
            bm5 bm5Var = bm5.e;
            cqt0Var.i = str;
            cqt0Var.l = 1;
            objG = khf0.G(khf0Var, bm5Var, cqt0Var);
            if (objG != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(objG);
                return objG;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = cqt0Var.i;
        z1x.P(objG);
        drm0 drm0Var = (drm0) this.f10166a;
        long j = ((ql5) objG).f28916a;
        cqt0Var.i = null;
        cqt0Var.l = 2;
        Object objT = ((cyu) drm0Var.f6568a).T(j, cqt0Var, str);
        return objT == obj ? obj : objT;
    }

    /* JADX WARN: Code duplicated, block: B:142:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0062  */
    /* JADX WARN: Code duplicated, block: B:19:0x006a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0078  */
    /* JADX WARN: Code duplicated, block: B:24:0x008e  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b3 A[LOOP:2: B:27:0x00ad->B:29:0x00b3, LOOP_END] */
    public void z(long j) {
        HashMap map;
        ArrayList arrayList;
        Object value;
        Date date;
        Object next;
        Object next2;
        Object next3;
        Date date2;
        Object next4;
        HashMap map2;
        HashMap map3;
        Set set;
        jtk0 jtk0Var = (jtk0) ((dpi0) this.f10166a).f6468a;
        gl9 gl9Var = (gl9) ((ok50) this.b).f25390a;
        List<HashMap> listJ = q3d.j((HashMap) gl9Var.f11479a.getValue(), (HashMap) gl9Var.b.getValue(), (HashMap) gl9Var.c.getValue());
        if (listJ == null || !listJ.isEmpty()) {
            Iterator it = listJ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    map2 = new HashMap();
                    for (HashMap map4 : listJ) {
                        if (map4 != null) {
                            for (Map.Entry entry : map4.entrySet()) {
                                Object key = entry.getKey();
                                set = (Set) map2.get(entry.getKey());
                                if (set == null) {
                                    set = xun.f41520a;
                                }
                                map2.put(key, eui0.g(set, (Iterable) entry.getValue()));
                            }
                        }
                        map3 = new HashMap();
                        for (Map.Entry entry2 : map2.entrySet()) {
                            map3.put(entry2.getKey(), gl9.a((Set) entry2.getValue()));
                        }
                        map2 = map3;
                    }
                    map = map2;
                } else if (((HashMap) it.next()) == null) {
                    map = new HashMap();
                }
            }
        } else {
            map2 = new HashMap();
            while (r13.hasNext()) {
                if (map4 != null) {
                    while (r2.hasNext()) {
                        Object key2 = entry.getKey();
                        set = (Set) map2.get(entry.getKey());
                        if (set == null) {
                            set = xun.f41520a;
                        }
                        map2.put(key2, eui0.g(set, (Iterable) entry.getValue()));
                    }
                }
                map3 = new HashMap();
                while (r1.hasNext()) {
                    map3.put(entry2.getKey(), gl9.a((Set) entry2.getValue()));
                }
                map2 = map3;
            }
            map = map2;
        }
        Set set2 = (Set) map.get(Long.valueOf(j));
        if (set2 != null) {
            Set set3 = set2;
            arrayList = new ArrayList(r3d.q(set3, 10));
            Iterator it2 = set3.iterator();
            while (it2.hasNext()) {
                arrayList.add(((ofj) it2.next()).f25173a);
            }
        } else {
            arrayList = null;
        }
        Date date3 = ((ktk0) jtk0Var.f17105a.getValue()).f18871a;
        if (arrayList == null || arrayList.isEmpty() || CollectionsKt.L(arrayList, date3)) {
            p7m0 p7m0Var = jtk0Var.f17105a;
            do {
                value = p7m0Var.getValue();
                ktk0 ktk0Var = (ktk0) value;
                date = ktk0Var.f18871a;
                ktk0Var.getClass();
            } while (!p7m0Var.m(value, new ktk0(j, date)));
            return;
        }
        Set set4 = set2;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : set4) {
            if (((ofj) obj).b) {
                arrayList2.add(obj);
            }
        }
        Iterator it3 = arrayList2.iterator();
        if (it3.hasNext()) {
            next = it3.next();
            if (it3.hasNext()) {
                Date date4 = ((ofj) next).f25173a;
                do {
                    Object next5 = it3.next();
                    Date date5 = ((ofj) next5).f25173a;
                    if (date4.compareTo(date5) > 0) {
                        next = next5;
                        date4 = date5;
                    }
                } while (it3.hasNext());
            }
        } else {
            next = null;
        }
        ofj ofjVar = (ofj) next;
        Date date6 = ofjVar != null ? ofjVar.f25173a : null;
        if (date6 != null) {
            ktk0 ktk0Var2 = new ktk0(j, date6);
            jtk0Var.getClass();
            jtk0Var.f17105a.o(null, ktk0Var2);
            return;
        }
        Date date7 = new Date();
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.setTime(date7);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Date time = calendar.getTime();
        time.getClass();
        Date date8 = new Date();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : set4) {
            if (((ofj) obj2).c) {
                arrayList3.add(obj2);
            }
        }
        Iterator it4 = arrayList3.iterator();
        if (it4.hasNext()) {
            next2 = it4.next();
            if (it4.hasNext()) {
                long jAbs = Math.abs(((ofj) next2).f25173a.getTime() - time.getTime());
                do {
                    Object next6 = it4.next();
                    long jAbs2 = Math.abs(((ofj) next6).f25173a.getTime() - time.getTime());
                    if (jAbs > jAbs2) {
                        next2 = next6;
                        jAbs = jAbs2;
                    }
                } while (it4.hasNext());
            }
        } else {
            next2 = null;
        }
        ofj ofjVar2 = (ofj) next2;
        if (ofjVar2 == null || (date2 = ofjVar2.f25173a) == null) {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (!((Date) obj3).before(time)) {
                    arrayList4.add(obj3);
                }
            }
            Iterator it5 = arrayList4.iterator();
            if (it5.hasNext()) {
                next3 = it5.next();
                if (it5.hasNext()) {
                    long jAbs3 = Math.abs(((Date) next3).getTime() - date8.getTime());
                    do {
                        Object next7 = it5.next();
                        long jAbs4 = Math.abs(((Date) next7).getTime() - date8.getTime());
                        if (jAbs3 > jAbs4) {
                            next3 = next7;
                            jAbs3 = jAbs4;
                        }
                    } while (it5.hasNext());
                }
            } else {
                next3 = null;
            }
            date2 = (Date) next3;
            if (date2 == null) {
                ArrayList arrayList5 = new ArrayList();
                for (Object obj4 : arrayList) {
                    if (((Date) obj4).before(time)) {
                        arrayList5.add(obj4);
                    }
                }
                Iterator it6 = arrayList5.iterator();
                if (it6.hasNext()) {
                    next4 = it6.next();
                    if (it6.hasNext()) {
                        long jAbs5 = Math.abs(((Date) next4).getTime() - date8.getTime());
                        do {
                            Object next8 = it6.next();
                            long jAbs6 = Math.abs(((Date) next8).getTime() - date8.getTime());
                            if (jAbs5 > jAbs6) {
                                next4 = next8;
                                jAbs5 = jAbs6;
                            }
                        } while (it6.hasNext());
                    }
                } else {
                    next4 = null;
                }
                date2 = (Date) next4;
            }
        }
        ktk0 ktk0Var3 = new ktk0(j, date2);
        jtk0Var.getClass();
        jtk0Var.f17105a.o(null, ktk0Var3);
    }

    @Override // a.ngw0
    /* JADX INFO: renamed from: zza */
    public void mo2zza(String str) {
        ((hcp0) this.f10166a).a(msm0.v(str));
    }

    public /* synthetic */ fuj0(Object obj, Object obj2, boolean z) {
        this.f10166a = obj;
        this.b = obj2;
    }

    public fuj0(Context context, byte b) {
        switch (b) {
            case 24:
                String packageName = context.getPackageName();
                s0x.E(packageName);
                this.f10166a = packageName;
                try {
                    byte[] bArrN = o050.N(context, packageName);
                    if (bArrN == null) {
                        f140.r("single cert required: ", packageName, "FBA-PackageInfo");
                        this.b = null;
                    } else {
                        this.b = nnw0.C(bArrN);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    f140.r("no pkg: ", packageName, "FBA-PackageInfo");
                    this.b = null;
                    return;
                }
                break;
            default:
                s0x.H(context);
                Resources resources = context.getResources();
                this.b = resources;
                this.f10166a = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                break;
        }
    }

    public fuj0(Context context, String str, String str2) {
        if (str != null) {
            this.f10166a = str;
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                this.b = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
                return;
            } else {
                this.b = applicationContext.getSharedPreferences(str2, 0).edit();
                return;
            }
        }
        jf4.o("keysetName cannot be null");
        throw null;
    }

    public fuj0(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f10166a = new Messenger(iBinder);
            this.b = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.b = new com.google.android.gms.cloudmessaging.zzd(iBinder);
            this.f10166a = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public fuj0(AppMeasurementSdk appMeasurementSdk, yzn0 yzn0Var) {
        this.b = yzn0Var;
        appMeasurementSdk.a(new vpw0(this, (byte) 0));
        this.f10166a = new HashSet();
    }

    public fuj0(eyg0 eyg0Var, viu viuVar) {
        viuVar.getClass();
        this.f10166a = eyg0Var;
        this.b = viuVar;
    }

    public /* synthetic */ fuj0(Object obj, Object obj2) {
        this.b = obj;
        this.f10166a = obj2;
    }

    public fuj0(gii0 gii0Var, byte b) {
        gii0Var.getClass();
        switch (b) {
            case 7:
                this.f10166a = gii0Var;
                this.b = new nxo0(this, (byte) 14);
                break;
            default:
                this.f10166a = gii0Var;
                this.b = new jfm0(this, (byte) 1);
                break;
        }
    }

    public fuj0(drm0 drm0Var, knf0 knf0Var) {
        knf0Var.getClass();
        this.f10166a = drm0Var;
        this.b = knf0Var;
    }

    public fuj0(btt0 btt0Var, lpb lpbVar) {
        btt0Var.getClass();
        this.f10166a = btt0Var;
        this.b = lpbVar;
    }

    public fuj0(knf0 knf0Var, trm0 trm0Var) {
        knf0Var.getClass();
        this.f10166a = knf0Var;
        this.b = trm0Var;
    }

    public fuj0(trm0 trm0Var, btt0 btt0Var) {
        btt0Var.getClass();
        this.f10166a = trm0Var;
        this.b = btt0Var;
    }

    public fuj0(Function0 function0) {
        this.f10166a = function0;
        this.b = new kvb0(this, (byte) 1);
    }

    public fuj0(ViewPager viewPager) {
        this.b = viewPager;
        this.f10166a = new Rect();
    }
}
