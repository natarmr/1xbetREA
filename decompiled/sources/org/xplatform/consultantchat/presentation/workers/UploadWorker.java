package org.xplatform.consultantchat.presentation.workers;

import a.a2c;
import a.af3;
import a.b1j;
import a.c00;
import a.f4v;
import a.frc;
import a.g45;
import a.gcl;
import a.h03;
import a.i050;
import a.i7e;
import a.is;
import a.jf4;
import a.k050;
import a.ng00;
import a.ntb;
import a.o5d0;
import a.oos0;
import a.opt;
import a.pei0;
import a.pnt0;
import a.pos0;
import a.qaf0;
import a.qv;
import a.rei0;
import a.snt0;
import a.tos0;
import a.vae;
import a.vpc;
import a.wne;
import a.wos0;
import a.x1c;
import a.yje;
import a.z1x;
import a.ze3;
import a.zje;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/xplatform/consultantchat/presentation/workers/UploadWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class UploadWorker extends CoroutineWorker {
    public final opt g;
    public final is h;
    public final f4v i;
    public final f4v j;
    public final qv k;
    public final frc l;
    public final vpc m;
    public final qv n;
    public final h03 o;
    public final frc p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        Context context2 = this.f25193a;
        context2.getClass();
        ComponentCallbacks2 componentCallbacks2 = (Application) context2;
        af3 af3Var = componentCallbacks2 instanceof af3 ? (af3) componentCallbacks2 : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(snt0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            snt0 snt0Var = (snt0) (ze3Var instanceof snt0 ? ze3Var : null);
            if (snt0Var != null) {
                g45 g45Var = snt0Var.f32512a;
                this.g = new opt(g45Var);
                this.h = new is(g45Var);
                this.i = new f4v(g45Var);
                this.j = new f4v(g45Var);
                this.k = new qv(g45Var);
                this.l = new frc(g45Var);
                this.m = new vpc(g45Var);
                this.n = new qv(g45Var);
                this.o = new h03((Object) new is(g45Var), (byte) 21);
                this.p = new frc(g45Var);
                return;
            }
        }
        jf4.n(b1j.i(snt0.class, "Cannot create dependency "));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01d9 A[Catch: Exception -> 0x01ce, all -> 0x01df, TRY_ENTER, TryCatch #3 {Exception -> 0x01ce, blocks: (B:132:0x0273, B:134:0x0277, B:139:0x0291, B:140:0x0296, B:128:0x024c, B:129:0x0264, B:145:0x029d, B:146:0x02a0, B:118:0x0219, B:119:0x021b, B:121:0x021f, B:123:0x0224, B:124:0x023b, B:151:0x02a7, B:152:0x02aa, B:153:0x02ab, B:154:0x02b0, B:111:0x01fc, B:112:0x01fe, B:114:0x0202, B:115:0x020f, B:157:0x02b4, B:158:0x02b9, B:89:0x0198, B:91:0x01a2, B:93:0x01a6, B:94:0x01b7, B:95:0x01cd, B:101:0x01d9, B:102:0x01de, B:105:0x01e1, B:107:0x01e5, B:108:0x01f2, B:161:0x02bd, B:162:0x02c2, B:84:0x017f, B:86:0x0183, B:165:0x02c6, B:166:0x02cb), top: B:198:0x017f }] */
    /* JADX WARN: Code duplicated, block: B:107:0x01e5 A[Catch: all -> 0x005a, Exception -> 0x01ce, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x01ce, blocks: (B:132:0x0273, B:134:0x0277, B:139:0x0291, B:140:0x0296, B:128:0x024c, B:129:0x0264, B:145:0x029d, B:146:0x02a0, B:118:0x0219, B:119:0x021b, B:121:0x021f, B:123:0x0224, B:124:0x023b, B:151:0x02a7, B:152:0x02aa, B:153:0x02ab, B:154:0x02b0, B:111:0x01fc, B:112:0x01fe, B:114:0x0202, B:115:0x020f, B:157:0x02b4, B:158:0x02b9, B:89:0x0198, B:91:0x01a2, B:93:0x01a6, B:94:0x01b7, B:95:0x01cd, B:101:0x01d9, B:102:0x01de, B:105:0x01e1, B:107:0x01e5, B:108:0x01f2, B:161:0x02bd, B:162:0x02c2, B:84:0x017f, B:86:0x0183, B:165:0x02c6, B:166:0x02cb), top: B:198:0x017f }] */
    /* JADX WARN: Code duplicated, block: B:111:0x01fc A[Catch: all -> 0x005a, Exception -> 0x01ce, PHI: r0 r3 r7 r8 r9 r14
  0x01fc: PHI (r0v7 java.lang.Object) = (r0v6 java.lang.Object), (r0v11 java.lang.Object) binds: [B:109:0x01f8, B:39:0x0091] A[DONT_GENERATE, DONT_INLINE]
  0x01fc: PHI (r3v20 ??) = (r3v40 ??), (r3v41 ??) binds: [B:109:0x01f8, B:39:0x0091] A[DONT_GENERATE, DONT_INLINE]
  0x01fc: PHI (r7v16 a.rei0) = (r7v12 a.rei0), (r7v17 a.rei0) binds: [B:109:0x01f8, B:39:0x0091] A[DONT_GENERATE, DONT_INLINE]
  0x01fc: PHI (r8v18 java.lang.String) = (r8v14 java.lang.String), (r8v19 java.lang.String) binds: [B:109:0x01f8, B:39:0x0091] A[DONT_GENERATE, DONT_INLINE]
  0x01fc: PHI (r9v12 java.lang.String) = (r9v9 java.lang.String), (r9v13 java.lang.String) binds: [B:109:0x01f8, B:39:0x0091] A[DONT_GENERATE, DONT_INLINE]
  0x01fc: PHI (r14v33 java.io.File) = (r14v29 java.io.File), (r14v34 java.io.File) binds: [B:109:0x01f8, B:39:0x0091] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x01ce, blocks: (B:132:0x0273, B:134:0x0277, B:139:0x0291, B:140:0x0296, B:128:0x024c, B:129:0x0264, B:145:0x029d, B:146:0x02a0, B:118:0x0219, B:119:0x021b, B:121:0x021f, B:123:0x0224, B:124:0x023b, B:151:0x02a7, B:152:0x02aa, B:153:0x02ab, B:154:0x02b0, B:111:0x01fc, B:112:0x01fe, B:114:0x0202, B:115:0x020f, B:157:0x02b4, B:158:0x02b9, B:89:0x0198, B:91:0x01a2, B:93:0x01a6, B:94:0x01b7, B:95:0x01cd, B:101:0x01d9, B:102:0x01de, B:105:0x01e1, B:107:0x01e5, B:108:0x01f2, B:161:0x02bd, B:162:0x02c2, B:84:0x017f, B:86:0x0183, B:165:0x02c6, B:166:0x02cb), top: B:198:0x017f }] */
    /* JADX WARN: Code duplicated, block: B:114:0x0202 A[Catch: all -> 0x005a, Exception -> 0x01ce, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x01ce, blocks: (B:132:0x0273, B:134:0x0277, B:139:0x0291, B:140:0x0296, B:128:0x024c, B:129:0x0264, B:145:0x029d, B:146:0x02a0, B:118:0x0219, B:119:0x021b, B:121:0x021f, B:123:0x0224, B:124:0x023b, B:151:0x02a7, B:152:0x02aa, B:153:0x02ab, B:154:0x02b0, B:111:0x01fc, B:112:0x01fe, B:114:0x0202, B:115:0x020f, B:157:0x02b4, B:158:0x02b9, B:89:0x0198, B:91:0x01a2, B:93:0x01a6, B:94:0x01b7, B:95:0x01cd, B:101:0x01d9, B:102:0x01de, B:105:0x01e1, B:107:0x01e5, B:108:0x01f2, B:161:0x02bd, B:162:0x02c2, B:84:0x017f, B:86:0x0183, B:165:0x02c6, B:166:0x02cb), top: B:198:0x017f }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0219 A[Catch: all -> 0x005a, Exception -> 0x01ce, PHI: r0 r3 r7 r8 r9 r14
  0x0219: PHI (r0v12 java.lang.Object) = (r0v9 java.lang.Object), (r0v20 java.lang.Object) binds: [B:116:0x0215, B:36:0x007f] A[DONT_GENERATE, DONT_INLINE]
  0x0219: PHI (r3v22 ??) = (r3v38 ??), (r3v39 ??) binds: [B:116:0x0215, B:36:0x007f] A[DONT_GENERATE, DONT_INLINE]
  0x0219: PHI (r7v18 a.rei0) = (r7v16 a.rei0), (r7v19 a.rei0) binds: [B:116:0x0215, B:36:0x007f] A[DONT_GENERATE, DONT_INLINE]
  0x0219: PHI (r8v20 java.lang.String) = (r8v18 java.lang.String), (r8v21 java.lang.String) binds: [B:116:0x0215, B:36:0x007f] A[DONT_GENERATE, DONT_INLINE]
  0x0219: PHI (r9v14 java.lang.String) = (r9v12 java.lang.String), (r9v15 java.lang.String) binds: [B:116:0x0215, B:36:0x007f] A[DONT_GENERATE, DONT_INLINE]
  0x0219: PHI (r14v35 java.io.File) = (r14v33 java.io.File), (r14v36 java.io.File) binds: [B:116:0x0215, B:36:0x007f] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x01ce, blocks: (B:132:0x0273, B:134:0x0277, B:139:0x0291, B:140:0x0296, B:128:0x024c, B:129:0x0264, B:145:0x029d, B:146:0x02a0, B:118:0x0219, B:119:0x021b, B:121:0x021f, B:123:0x0224, B:124:0x023b, B:151:0x02a7, B:152:0x02aa, B:153:0x02ab, B:154:0x02b0, B:111:0x01fc, B:112:0x01fe, B:114:0x0202, B:115:0x020f, B:157:0x02b4, B:158:0x02b9, B:89:0x0198, B:91:0x01a2, B:93:0x01a6, B:94:0x01b7, B:95:0x01cd, B:101:0x01d9, B:102:0x01de, B:105:0x01e1, B:107:0x01e5, B:108:0x01f2, B:161:0x02bd, B:162:0x02c2, B:84:0x017f, B:86:0x0183, B:165:0x02c6, B:166:0x02cb), top: B:198:0x017f }] */
    /* JADX WARN: Code duplicated, block: B:121:0x021f A[Catch: all -> 0x005a, Exception -> 0x01ce, TRY_ENTER, TryCatch #3 {Exception -> 0x01ce, blocks: (B:132:0x0273, B:134:0x0277, B:139:0x0291, B:140:0x0296, B:128:0x024c, B:129:0x0264, B:145:0x029d, B:146:0x02a0, B:118:0x0219, B:119:0x021b, B:121:0x021f, B:123:0x0224, B:124:0x023b, B:151:0x02a7, B:152:0x02aa, B:153:0x02ab, B:154:0x02b0, B:111:0x01fc, B:112:0x01fe, B:114:0x0202, B:115:0x020f, B:157:0x02b4, B:158:0x02b9, B:89:0x0198, B:91:0x01a2, B:93:0x01a6, B:94:0x01b7, B:95:0x01cd, B:101:0x01d9, B:102:0x01de, B:105:0x01e1, B:107:0x01e5, B:108:0x01f2, B:161:0x02bd, B:162:0x02c2, B:84:0x017f, B:86:0x0183, B:165:0x02c6, B:166:0x02cb), top: B:198:0x017f }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0224 A[Catch: all -> 0x005a, Exception -> 0x01ce, TRY_LEAVE, TryCatch #3 {Exception -> 0x01ce, blocks: (B:132:0x0273, B:134:0x0277, B:139:0x0291, B:140:0x0296, B:128:0x024c, B:129:0x0264, B:145:0x029d, B:146:0x02a0, B:118:0x0219, B:119:0x021b, B:121:0x021f, B:123:0x0224, B:124:0x023b, B:151:0x02a7, B:152:0x02aa, B:153:0x02ab, B:154:0x02b0, B:111:0x01fc, B:112:0x01fe, B:114:0x0202, B:115:0x020f, B:157:0x02b4, B:158:0x02b9, B:89:0x0198, B:91:0x01a2, B:93:0x01a6, B:94:0x01b7, B:95:0x01cd, B:101:0x01d9, B:102:0x01de, B:105:0x01e1, B:107:0x01e5, B:108:0x01f2, B:161:0x02bd, B:162:0x02c2, B:84:0x017f, B:86:0x0183, B:165:0x02c6, B:166:0x02cb), top: B:198:0x017f }] */
    /* JADX WARN: Code duplicated, block: B:127:0x024a A[DONT_INVERT, PHI: r3 r7 r8 r9 r14
  0x024a: PHI (r3v24 ??) = (r3v36 ??), (r3v37 ??) binds: [B:125:0x0246, B:33:0x006f] A[DONT_GENERATE, DONT_INLINE]
  0x024a: PHI (r7v20 a.rei0) = (r7v18 a.rei0), (r7v21 a.rei0) binds: [B:125:0x0246, B:33:0x006f] A[DONT_GENERATE, DONT_INLINE]
  0x024a: PHI (r8v22 java.lang.String) = (r8v20 java.lang.String), (r8v27 java.lang.String) binds: [B:125:0x0246, B:33:0x006f] A[DONT_GENERATE, DONT_INLINE]
  0x024a: PHI (r9v16 java.lang.String) = (r9v14 java.lang.String), (r9v17 java.lang.String) binds: [B:125:0x0246, B:33:0x006f] A[DONT_GENERATE, DONT_INLINE]
  0x024a: PHI (r14v37 java.io.File) = (r14v35 java.io.File), (r14v38 java.io.File) binds: [B:125:0x0246, B:33:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:128:0x024c A[Catch: all -> 0x005a, Exception -> 0x01ce, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x01ce, blocks: (B:132:0x0273, B:134:0x0277, B:139:0x0291, B:140:0x0296, B:128:0x024c, B:129:0x0264, B:145:0x029d, B:146:0x02a0, B:118:0x0219, B:119:0x021b, B:121:0x021f, B:123:0x0224, B:124:0x023b, B:151:0x02a7, B:152:0x02aa, B:153:0x02ab, B:154:0x02b0, B:111:0x01fc, B:112:0x01fe, B:114:0x0202, B:115:0x020f, B:157:0x02b4, B:158:0x02b9, B:89:0x0198, B:91:0x01a2, B:93:0x01a6, B:94:0x01b7, B:95:0x01cd, B:101:0x01d9, B:102:0x01de, B:105:0x01e1, B:107:0x01e5, B:108:0x01f2, B:161:0x02bd, B:162:0x02c2, B:84:0x017f, B:86:0x0183, B:165:0x02c6, B:166:0x02cb), top: B:198:0x017f }] */
    /* JADX WARN: Code duplicated, block: B:134:0x0277 A[Catch: all -> 0x005a, Exception -> 0x01ce, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x01ce, blocks: (B:132:0x0273, B:134:0x0277, B:139:0x0291, B:140:0x0296, B:128:0x024c, B:129:0x0264, B:145:0x029d, B:146:0x02a0, B:118:0x0219, B:119:0x021b, B:121:0x021f, B:123:0x0224, B:124:0x023b, B:151:0x02a7, B:152:0x02aa, B:153:0x02ab, B:154:0x02b0, B:111:0x01fc, B:112:0x01fe, B:114:0x0202, B:115:0x020f, B:157:0x02b4, B:158:0x02b9, B:89:0x0198, B:91:0x01a2, B:93:0x01a6, B:94:0x01b7, B:95:0x01cd, B:101:0x01d9, B:102:0x01de, B:105:0x01e1, B:107:0x01e5, B:108:0x01f2, B:161:0x02bd, B:162:0x02c2, B:84:0x017f, B:86:0x0183, B:165:0x02c6, B:166:0x02cb), top: B:198:0x017f }] */
    /* JADX WARN: Code duplicated, block: B:137:0x028d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0291 A[Catch: Exception -> 0x01ce, all -> 0x0297, TRY_ENTER, TryCatch #3 {Exception -> 0x01ce, blocks: (B:132:0x0273, B:134:0x0277, B:139:0x0291, B:140:0x0296, B:128:0x024c, B:129:0x0264, B:145:0x029d, B:146:0x02a0, B:118:0x0219, B:119:0x021b, B:121:0x021f, B:123:0x0224, B:124:0x023b, B:151:0x02a7, B:152:0x02aa, B:153:0x02ab, B:154:0x02b0, B:111:0x01fc, B:112:0x01fe, B:114:0x0202, B:115:0x020f, B:157:0x02b4, B:158:0x02b9, B:89:0x0198, B:91:0x01a2, B:93:0x01a6, B:94:0x01b7, B:95:0x01cd, B:101:0x01d9, B:102:0x01de, B:105:0x01e1, B:107:0x01e5, B:108:0x01f2, B:161:0x02bd, B:162:0x02c2, B:84:0x017f, B:86:0x0183, B:165:0x02c6, B:166:0x02cb), top: B:198:0x017f }] */
    /* JADX WARN: Code duplicated, block: B:145:0x029d A[Catch: Exception -> 0x01ce, all -> 0x02a1, TRY_ENTER, TryCatch #1 {all -> 0x02a1, blocks: (B:179:0x030d, B:180:0x0310, B:145:0x029d, B:146:0x02a0, B:151:0x02a7, B:152:0x02aa, B:115:0x020f, B:108:0x01f2), top: B:195:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x02a7 A[Catch: Exception -> 0x01ce, all -> 0x02a1, TryCatch #1 {all -> 0x02a1, blocks: (B:179:0x030d, B:180:0x0310, B:145:0x029d, B:146:0x02a0, B:151:0x02a7, B:152:0x02aa, B:115:0x020f, B:108:0x01f2), top: B:195:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x02ab A[Catch: Exception -> 0x01ce, all -> 0x02b1, TRY_ENTER, TryCatch #3 {Exception -> 0x01ce, blocks: (B:132:0x0273, B:134:0x0277, B:139:0x0291, B:140:0x0296, B:128:0x024c, B:129:0x0264, B:145:0x029d, B:146:0x02a0, B:118:0x0219, B:119:0x021b, B:121:0x021f, B:123:0x0224, B:124:0x023b, B:151:0x02a7, B:152:0x02aa, B:153:0x02ab, B:154:0x02b0, B:111:0x01fc, B:112:0x01fe, B:114:0x0202, B:115:0x020f, B:157:0x02b4, B:158:0x02b9, B:89:0x0198, B:91:0x01a2, B:93:0x01a6, B:94:0x01b7, B:95:0x01cd, B:101:0x01d9, B:102:0x01de, B:105:0x01e1, B:107:0x01e5, B:108:0x01f2, B:161:0x02bd, B:162:0x02c2, B:84:0x017f, B:86:0x0183, B:165:0x02c6, B:166:0x02cb), top: B:198:0x017f }] */
    /* JADX WARN: Code duplicated, block: B:157:0x02b4 A[Catch: Exception -> 0x01ce, all -> 0x02ba, TRY_ENTER, TryCatch #3 {Exception -> 0x01ce, blocks: (B:132:0x0273, B:134:0x0277, B:139:0x0291, B:140:0x0296, B:128:0x024c, B:129:0x0264, B:145:0x029d, B:146:0x02a0, B:118:0x0219, B:119:0x021b, B:121:0x021f, B:123:0x0224, B:124:0x023b, B:151:0x02a7, B:152:0x02aa, B:153:0x02ab, B:154:0x02b0, B:111:0x01fc, B:112:0x01fe, B:114:0x0202, B:115:0x020f, B:157:0x02b4, B:158:0x02b9, B:89:0x0198, B:91:0x01a2, B:93:0x01a6, B:94:0x01b7, B:95:0x01cd, B:101:0x01d9, B:102:0x01de, B:105:0x01e1, B:107:0x01e5, B:108:0x01f2, B:161:0x02bd, B:162:0x02c2, B:84:0x017f, B:86:0x0183, B:165:0x02c6, B:166:0x02cb), top: B:198:0x017f }] */
    /* JADX WARN: Code duplicated, block: B:161:0x02bd A[Catch: Exception -> 0x01ce, all -> 0x02c3, TRY_ENTER, TryCatch #3 {Exception -> 0x01ce, blocks: (B:132:0x0273, B:134:0x0277, B:139:0x0291, B:140:0x0296, B:128:0x024c, B:129:0x0264, B:145:0x029d, B:146:0x02a0, B:118:0x0219, B:119:0x021b, B:121:0x021f, B:123:0x0224, B:124:0x023b, B:151:0x02a7, B:152:0x02aa, B:153:0x02ab, B:154:0x02b0, B:111:0x01fc, B:112:0x01fe, B:114:0x0202, B:115:0x020f, B:157:0x02b4, B:158:0x02b9, B:89:0x0198, B:91:0x01a2, B:93:0x01a6, B:94:0x01b7, B:95:0x01cd, B:101:0x01d9, B:102:0x01de, B:105:0x01e1, B:107:0x01e5, B:108:0x01f2, B:161:0x02bd, B:162:0x02c2, B:84:0x017f, B:86:0x0183, B:165:0x02c6, B:166:0x02cb), top: B:198:0x017f }] */
    /* JADX WARN: Code duplicated, block: B:165:0x02c6 A[Catch: Exception -> 0x01ce, all -> 0x02cc, TRY_ENTER, TryCatch #3 {Exception -> 0x01ce, blocks: (B:132:0x0273, B:134:0x0277, B:139:0x0291, B:140:0x0296, B:128:0x024c, B:129:0x0264, B:145:0x029d, B:146:0x02a0, B:118:0x0219, B:119:0x021b, B:121:0x021f, B:123:0x0224, B:124:0x023b, B:151:0x02a7, B:152:0x02aa, B:153:0x02ab, B:154:0x02b0, B:111:0x01fc, B:112:0x01fe, B:114:0x0202, B:115:0x020f, B:157:0x02b4, B:158:0x02b9, B:89:0x0198, B:91:0x01a2, B:93:0x01a6, B:94:0x01b7, B:95:0x01cd, B:101:0x01d9, B:102:0x01de, B:105:0x01e1, B:107:0x01e5, B:108:0x01f2, B:161:0x02bd, B:162:0x02c2, B:84:0x017f, B:86:0x0183, B:165:0x02c6, B:166:0x02cb), top: B:198:0x017f }] */
    /* JADX WARN: Code duplicated, block: B:171:0x02d4 A[Catch: all -> 0x005a, TRY_LEAVE, TryCatch #19 {all -> 0x005a, blocks: (B:169:0x02cf, B:171:0x02d4, B:25:0x0054, B:134:0x0277, B:32:0x006c, B:128:0x024c, B:35:0x007c, B:118:0x0219, B:121:0x021f, B:123:0x0224, B:38:0x008e, B:111:0x01fc, B:114:0x0202, B:89:0x0198, B:94:0x01b7, B:95:0x01cd, B:107:0x01e5, B:48:0x00be, B:81:0x0176, B:83:0x017a, B:86:0x0183, B:78:0x015c), top: B:195:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:175:0x0307  */
    /* JADX WARN: Code duplicated, block: B:179:0x030d A[Catch: all -> 0x02a1, TRY_ENTER, TryCatch #1 {all -> 0x02a1, blocks: (B:179:0x030d, B:180:0x0310, B:145:0x029d, B:146:0x02a0, B:151:0x02a7, B:152:0x02aa, B:115:0x020f, B:108:0x01f2), top: B:195:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x031c A[Catch: all -> 0x0322, TRY_ENTER, TryCatch #2 {all -> 0x0322, blocks: (B:75:0x0150, B:185:0x031c, B:186:0x0321), top: B:196:0x0150 }] */
    /* JADX WARN: Code duplicated, block: B:191:0x0329  */
    /* JADX WARN: Code duplicated, block: B:199:0x01e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x01a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x0273 A[EXC_TOP_SPLITTER, PHI: r3 r7 r14
  0x0273: PHI (r3v26 ??) = (r3v34 ??), (r3v35 ??) binds: [B:130:0x026f, B:26:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x0273: PHI (r7v22 a.rei0) = (r7v20 a.rei0), (r7v23 a.rei0) binds: [B:130:0x026f, B:26:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x0273: PHI (r14v39 java.io.File) = (r14v37 java.io.File), (r14v40 java.io.File) binds: [B:130:0x026f, B:26:0x0057] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0154 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x01a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0127  */
    /* JADX WARN: Code duplicated, block: B:69:0x012c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0130  */
    /* JADX WARN: Code duplicated, block: B:74:0x014b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:80:0x0174  */
    /* JADX WARN: Code duplicated, block: B:81:0x0176 A[Catch: all -> 0x005a, PHI: r3 r7 r8 r9
  0x0176: PHI (r3v14 ??) = (r3v43 ??), (r3v44 ??) binds: [B:79:0x0172, B:48:0x00be] A[DONT_GENERATE, DONT_INLINE]
  0x0176: PHI (r7v10 a.rei0) = (r7v8 a.rei0), (r7v11 a.rei0) binds: [B:79:0x0172, B:48:0x00be] A[DONT_GENERATE, DONT_INLINE]
  0x0176: PHI (r8v12 java.lang.String) = (r8v10 java.lang.String), (r8v13 java.lang.String) binds: [B:79:0x0172, B:48:0x00be] A[DONT_GENERATE, DONT_INLINE]
  0x0176: PHI (r9v7 java.lang.String) = (r9v5 java.lang.String), (r9v8 java.lang.String) binds: [B:79:0x0172, B:48:0x00be] A[DONT_GENERATE, DONT_INLINE], TryCatch #19 {all -> 0x005a, blocks: (B:169:0x02cf, B:171:0x02d4, B:25:0x0054, B:134:0x0277, B:32:0x006c, B:128:0x024c, B:35:0x007c, B:118:0x0219, B:121:0x021f, B:123:0x0224, B:38:0x008e, B:111:0x01fc, B:114:0x0202, B:89:0x0198, B:94:0x01b7, B:95:0x01cd, B:107:0x01e5, B:48:0x00be, B:81:0x0176, B:83:0x017a, B:86:0x0183, B:78:0x015c), top: B:195:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x017a A[Catch: all -> 0x005a, TRY_LEAVE, TryCatch #19 {all -> 0x005a, blocks: (B:169:0x02cf, B:171:0x02d4, B:25:0x0054, B:134:0x0277, B:32:0x006c, B:128:0x024c, B:35:0x007c, B:118:0x0219, B:121:0x021f, B:123:0x0224, B:38:0x008e, B:111:0x01fc, B:114:0x0202, B:89:0x0198, B:94:0x01b7, B:95:0x01cd, B:107:0x01e5, B:48:0x00be, B:81:0x0176, B:83:0x017a, B:86:0x0183, B:78:0x015c), top: B:195:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0183 A[Catch: all -> 0x005a, Exception -> 0x01ce, TRY_ENTER, TryCatch #3 {Exception -> 0x01ce, blocks: (B:132:0x0273, B:134:0x0277, B:139:0x0291, B:140:0x0296, B:128:0x024c, B:129:0x0264, B:145:0x029d, B:146:0x02a0, B:118:0x0219, B:119:0x021b, B:121:0x021f, B:123:0x0224, B:124:0x023b, B:151:0x02a7, B:152:0x02aa, B:153:0x02ab, B:154:0x02b0, B:111:0x01fc, B:112:0x01fe, B:114:0x0202, B:115:0x020f, B:157:0x02b4, B:158:0x02b9, B:89:0x0198, B:91:0x01a2, B:93:0x01a6, B:94:0x01b7, B:95:0x01cd, B:101:0x01d9, B:102:0x01de, B:105:0x01e1, B:107:0x01e5, B:108:0x01f2, B:161:0x02bd, B:162:0x02c2, B:84:0x017f, B:86:0x0183, B:165:0x02c6, B:166:0x02cb), top: B:198:0x017f }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0196  */
    /* JADX WARN: Code duplicated, block: B:89:0x0198 A[Catch: all -> 0x005a, Exception -> 0x01ce, PHI: r3 r7 r8 r9 r10 r14
  0x0198: PHI (r3v16 ??) = (r3v42 ??), (r3v19 ??) binds: [B:87:0x0194, B:42:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x0198: PHI (r7v12 a.rei0) = (r7v10 a.rei0), (r7v15 a.rei0) binds: [B:87:0x0194, B:42:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x0198: PHI (r8v14 java.lang.String) = (r8v12 java.lang.String), (r8v17 java.lang.String) binds: [B:87:0x0194, B:42:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x0198: PHI (r9v9 java.lang.String) = (r9v7 java.lang.String), (r9v11 java.lang.String) binds: [B:87:0x0194, B:42:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x0198: PHI (r10v4 java.lang.Object) = (r10v3 java.lang.Object), (r10v8 java.lang.Object) binds: [B:87:0x0194, B:42:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x0198: PHI (r14v29 java.io.File) = (r14v27 java.io.File), (r14v32 java.io.File) binds: [B:87:0x0194, B:42:0x00a3] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {Exception -> 0x01ce, blocks: (B:132:0x0273, B:134:0x0277, B:139:0x0291, B:140:0x0296, B:128:0x024c, B:129:0x0264, B:145:0x029d, B:146:0x02a0, B:118:0x0219, B:119:0x021b, B:121:0x021f, B:123:0x0224, B:124:0x023b, B:151:0x02a7, B:152:0x02aa, B:153:0x02ab, B:154:0x02b0, B:111:0x01fc, B:112:0x01fe, B:114:0x0202, B:115:0x020f, B:157:0x02b4, B:158:0x02b9, B:89:0x0198, B:91:0x01a2, B:93:0x01a6, B:94:0x01b7, B:95:0x01cd, B:101:0x01d9, B:102:0x01de, B:105:0x01e1, B:107:0x01e5, B:108:0x01f2, B:161:0x02bd, B:162:0x02c2, B:84:0x017f, B:86:0x0183, B:165:0x02c6, B:166:0x02cb), top: B:198:0x017f }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r13v52 */
    /* JADX WARN: Type inference failed for: r13v53, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r13v54 */
    /* JADX WARN: Type inference failed for: r13v55 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r3v14, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r3v16, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r3v22, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r3v24, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r3v26, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v3, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v4, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // androidx.work.CoroutineWorker
    public final Object c(yje yjeVar) throws Throwable {
        pnt0 pnt0Var;
        ?? r13;
        ?? r14;
        rei0 rei0Var;
        Unit unit;
        ?? r15;
        ?? r3;
        String strB;
        String strB2;
        rei0 rei0Var2;
        vpc vpcVar;
        k050 k050Var;
        String str;
        String str2;
        qv qvVar;
        qaf0 qaf0Var;
        File file;
        h03 h03Var;
        Object objC;
        a2c a2cVar;
        frc frcVar;
        is isVar;
        Object objN;
        String str3;
        f4v f4vVar;
        Object objP0;
        String str4;
        qv qvVar2;
        f4v f4vVar2;
        ?? r0;
        if (yjeVar instanceof pnt0) {
            pnt0Var = (pnt0) yjeVar;
            int i = pnt0Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                pnt0Var.p = i - Integer.MIN_VALUE;
            } else {
                pnt0Var = new pnt0(this, (zje) yjeVar);
            }
        } else {
            pnt0Var = new pnt0(this, (zje) yjeVar);
        }
        Object objK = pnt0Var.n;
        wne wneVar = wne.f39444a;
        ?? r4 = pnt0Var.p;
        frc frcVar2 = this.l;
        try {
            try {
                try {
                    switch (r4) {
                        case 0:
                            z1x.P(objK);
                            WorkerParameters workerParameters = this.b;
                            strB = workerParameters.b.b("BUNDLE_LOCAL_MESSAGE_ID");
                            if (strB == null) {
                                return ng00.a();
                            }
                            strB2 = workerParameters.b.b("BUNDLE_FILE_PATH");
                            if (strB2 == null) {
                                return ng00.a();
                            }
                            opt optVar = this.g;
                            if (optVar == null) {
                                Intrinsics.h("getSendingMessagesFromCacheUseCase");
                                throw null;
                            }
                            pnt0Var.i = strB;
                            pnt0Var.j = strB2;
                            pnt0Var.p = 1;
                            g45 g45Var = optVar.f25659a;
                            objK = ntb.K(new c00(((i7e) g45Var.c).g, g45Var, (byte) 25), pnt0Var);
                            if (objK != wneVar) {
                                rei0Var2 = (rei0) ((Map) objK).get(strB);
                                if (rei0Var2 == null) {
                                    return ng00.a();
                                }
                                vpcVar = this.m;
                                if (vpcVar != null) {
                                    Intrinsics.h("getUploadingMutexUseCase");
                                    throw null;
                                }
                                k050Var = ((vae) vpcVar.f37798a.b).c;
                                pnt0Var.i = strB;
                                pnt0Var.j = strB2;
                                pnt0Var.k = rei0Var2;
                                pnt0Var.l = k050Var;
                                pnt0Var.p = 2;
                                if (k050Var.d(pnt0Var) != wneVar) {
                                    str = strB2;
                                    r4 = k050Var;
                                    str2 = strB;
                                    rei0Var = rei0Var2;
                                    try {
                                        qvVar = this.n;
                                        if (qvVar == null) {
                                            Intrinsics.h("getWSConnectionStreamUseCase");
                                            throw null;
                                        }
                                        try {
                                            qaf0Var = new qaf0(((vae) qvVar.f29365a.b).r, (byte) 17);
                                            pnt0Var.i = str2;
                                            pnt0Var.j = str;
                                            pnt0Var.k = rei0Var;
                                            pnt0Var.l = r4;
                                            pnt0Var.p = 3;
                                            r4 = r4;
                                            if (ntb.K(qaf0Var, pnt0Var) != wneVar) {
                                                r3 = r4;
                                                if (rei0Var instanceof pei0) {
                                                    file = new File(str);
                                                    try {
                                                        try {
                                                            h03Var = this.o;
                                                            if (h03Var != null) {
                                                                Intrinsics.h("checkAttachFileSettingsScenario");
                                                                throw null;
                                                            }
                                                            pnt0Var.i = str2;
                                                            pnt0Var.j = str;
                                                            pnt0Var.k = rei0Var;
                                                            pnt0Var.l = r4;
                                                            pnt0Var.m = file;
                                                            pnt0Var.p = 4;
                                                            objC = h03Var.C(file, pnt0Var);
                                                            r4 = r4;
                                                            if (objC == wneVar) {
                                                                a2cVar = (a2c) objC;
                                                                if (Intrinsics.d(a2cVar, x1c.f40116a)) {
                                                                    try {
                                                                        isVar = this.h;
                                                                        if (isVar == null) {
                                                                            Intrinsics.h("getUploadMediaLinkUseCase");
                                                                            throw null;
                                                                        }
                                                                        pnt0Var.i = str2;
                                                                        pnt0Var.j = str;
                                                                        pnt0Var.k = rei0Var;
                                                                        pnt0Var.l = r4;
                                                                        pnt0Var.m = file;
                                                                        pnt0Var.p = 5;
                                                                        objN = isVar.f15281a.N(file, pnt0Var);
                                                                        r4 = r4;
                                                                        if (objN != wneVar) {
                                                                            str3 = (String) objN;
                                                                            try {
                                                                                f4vVar = this.i;
                                                                                if (f4vVar != null) {
                                                                                    Intrinsics.h("uploadFileUseCase");
                                                                                    throw null;
                                                                                }
                                                                                pnt0Var.i = str2;
                                                                                pnt0Var.j = str;
                                                                                pnt0Var.k = rei0Var;
                                                                                pnt0Var.l = r4;
                                                                                pnt0Var.m = file;
                                                                                pnt0Var.p = 6;
                                                                                objP0 = f4vVar.f8933a.p0(str3, file, pnt0Var);
                                                                                r4 = r4;
                                                                                if (objP0 != wneVar) {
                                                                                    str4 = (String) objP0;
                                                                                    try {
                                                                                        qvVar2 = this.k;
                                                                                        if (qvVar2 == null) {
                                                                                            Intrinsics.h("addUploadedFileMediaInfoUseCase");
                                                                                            throw null;
                                                                                        }
                                                                                        qvVar2.b(file, str4, str2);
                                                                                        if (frcVar2 == null) {
                                                                                            Intrinsics.h("updateDownloadFileStateUseCase");
                                                                                            throw null;
                                                                                        }
                                                                                        wos0 wos0Var = new wos0(new oos0(str4), file);
                                                                                        pnt0Var.i = str2;
                                                                                        pnt0Var.j = str;
                                                                                        pnt0Var.k = rei0Var;
                                                                                        pnt0Var.l = r4;
                                                                                        pnt0Var.m = file;
                                                                                        pnt0Var.p = 7;
                                                                                        try {
                                                                                            ((gcl) frcVar2.f10012a.d).e(wos0Var);
                                                                                            r4 = r4;
                                                                                            if (Unit.f46060a != wneVar) {
                                                                                                if (frcVar2 != null) {
                                                                                                    Intrinsics.h("updateDownloadFileStateUseCase");
                                                                                                    throw null;
                                                                                                }
                                                                                                wos0 wos0Var2 = new wos0(new pos0(str2, str), file);
                                                                                                pnt0Var.i = null;
                                                                                                pnt0Var.j = null;
                                                                                                pnt0Var.k = rei0Var;
                                                                                                pnt0Var.l = r4;
                                                                                                pnt0Var.m = file;
                                                                                                pnt0Var.p = 8;
                                                                                                try {
                                                                                                    ((gcl) frcVar2.f10012a.d).e(wos0Var2);
                                                                                                    r4 = r4;
                                                                                                    if (Unit.f46060a != wneVar) {
                                                                                                        try {
                                                                                                            f4vVar2 = this.j;
                                                                                                            if (f4vVar2 == null) {
                                                                                                                Intrinsics.h("sendMessageUseCase");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            pnt0Var.i = null;
                                                                                                            pnt0Var.j = null;
                                                                                                            pnt0Var.k = rei0Var;
                                                                                                            pnt0Var.l = r4;
                                                                                                            pnt0Var.m = file;
                                                                                                            pnt0Var.p = 9;
                                                                                                            if (f4vVar2.c(rei0Var, pnt0Var) != wneVar) {
                                                                                                                r0 = r4;
                                                                                                                r3 = r0;
                                                                                                            }
                                                                                                        } catch (Throwable th) {
                                                                                                            th = th;
                                                                                                        }
                                                                                                    }
                                                                                                } catch (Throwable th2) {
                                                                                                    th = th2;
                                                                                                }
                                                                                            }
                                                                                        } catch (Throwable th3) {
                                                                                            th = th3;
                                                                                        }
                                                                                    } catch (Throwable th4) {
                                                                                        th = th4;
                                                                                    }
                                                                                }
                                                                            } catch (Throwable th5) {
                                                                                th = th5;
                                                                            }
                                                                        }
                                                                    } catch (Throwable th6) {
                                                                        th = th6;
                                                                    }
                                                                } else {
                                                                    try {
                                                                        frcVar = this.p;
                                                                        if (frcVar == null) {
                                                                            Intrinsics.h("sendCheckFileResultUseCase");
                                                                            throw null;
                                                                        }
                                                                        try {
                                                                            a2cVar.getClass();
                                                                            i7e i7eVar = (i7e) frcVar.f10012a.c;
                                                                            i7eVar.getClass();
                                                                            i7eVar.l.g(a2cVar);
                                                                            throw new IllegalArgumentException("File " + file + " is unsupported");
                                                                        } catch (Throwable th7) {
                                                                            th = th7;
                                                                        }
                                                                    } catch (Throwable th8) {
                                                                        th = th8;
                                                                    }
                                                                }
                                                            }
                                                        } catch (Exception e) {
                                                            e = e;
                                                            r13 = file;
                                                            r4 = r4;
                                                            e.printStackTrace();
                                                            if (frcVar2 == null) {
                                                                Intrinsics.h("updateDownloadFileStateUseCase");
                                                                throw null;
                                                            }
                                                            String str5 = ((pei0) rei0Var).d;
                                                            String absolutePath = r13.getAbsolutePath();
                                                            absolutePath.getClass();
                                                            tos0 tos0Var = new tos0(new pos0(str5, absolutePath), r13, e);
                                                            pnt0Var.i = null;
                                                            pnt0Var.j = null;
                                                            pnt0Var.k = null;
                                                            pnt0Var.l = r4;
                                                            pnt0Var.m = null;
                                                            pnt0Var.p = 10;
                                                            try {
                                                                ((gcl) frcVar2.f10012a.d).e(tos0Var);
                                                                unit = Unit.f46060a;
                                                                wne wneVar2 = wne.f39444a;
                                                                if (unit != wneVar) {
                                                                    r15 = r4;
                                                                    r3 = r15;
                                                                    r3.c(null);
                                                                    return ng00.a();
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                            }
                                                        }
                                                    } catch (Throwable th10) {
                                                        th = th10;
                                                    }
                                                }
                                                r3.c(null);
                                                return ng00.a();
                                            }
                                        } catch (Throwable th11) {
                                            th = th11;
                                        }
                                    } catch (Throwable th12) {
                                        th = th12;
                                    }
                                    th = th;
                                    r14 = r4;
                                    r14.c(null);
                                    throw th;
                                }
                            }
                            return wneVar;
                        case 1:
                            strB2 = pnt0Var.j;
                            strB = pnt0Var.i;
                            z1x.P(objK);
                            rei0Var2 = (rei0) ((Map) objK).get(strB);
                            if (rei0Var2 == null) {
                                return ng00.a();
                            }
                            vpcVar = this.m;
                            if (vpcVar != null) {
                                Intrinsics.h("getUploadingMutexUseCase");
                                throw null;
                            }
                            k050Var = ((vae) vpcVar.f37798a.b).c;
                            pnt0Var.i = strB;
                            pnt0Var.j = strB2;
                            pnt0Var.k = rei0Var2;
                            pnt0Var.l = k050Var;
                            pnt0Var.p = 2;
                            if (k050Var.d(pnt0Var) != wneVar) {
                                str = strB2;
                                r4 = k050Var;
                                str2 = strB;
                                rei0Var = rei0Var2;
                                qvVar = this.n;
                                if (qvVar == null) {
                                    Intrinsics.h("getWSConnectionStreamUseCase");
                                    throw null;
                                }
                                qaf0Var = new qaf0(((vae) qvVar.f29365a.b).r, (byte) 17);
                                pnt0Var.i = str2;
                                pnt0Var.j = str;
                                pnt0Var.k = rei0Var;
                                pnt0Var.l = r4;
                                pnt0Var.p = 3;
                                r4 = r4;
                                if (ntb.K(qaf0Var, pnt0Var) != wneVar) {
                                    r3 = r4;
                                    if (rei0Var instanceof pei0) {
                                        file = new File(str);
                                        h03Var = this.o;
                                        if (h03Var != null) {
                                            Intrinsics.h("checkAttachFileSettingsScenario");
                                            throw null;
                                        }
                                        pnt0Var.i = str2;
                                        pnt0Var.j = str;
                                        pnt0Var.k = rei0Var;
                                        pnt0Var.l = r4;
                                        pnt0Var.m = file;
                                        pnt0Var.p = 4;
                                        objC = h03Var.C(file, pnt0Var);
                                        r4 = r4;
                                        if (objC == wneVar) {
                                            a2cVar = (a2c) objC;
                                            if (Intrinsics.d(a2cVar, x1c.f40116a)) {
                                                frcVar = this.p;
                                                if (frcVar == null) {
                                                    Intrinsics.h("sendCheckFileResultUseCase");
                                                    throw null;
                                                }
                                                a2cVar.getClass();
                                                i7e i7eVar2 = (i7e) frcVar.f10012a.c;
                                                i7eVar2.getClass();
                                                i7eVar2.l.g(a2cVar);
                                                throw new IllegalArgumentException("File " + file + " is unsupported");
                                            }
                                            isVar = this.h;
                                            if (isVar == null) {
                                                Intrinsics.h("getUploadMediaLinkUseCase");
                                                throw null;
                                            }
                                            pnt0Var.i = str2;
                                            pnt0Var.j = str;
                                            pnt0Var.k = rei0Var;
                                            pnt0Var.l = r4;
                                            pnt0Var.m = file;
                                            pnt0Var.p = 5;
                                            objN = isVar.f15281a.N(file, pnt0Var);
                                            r4 = r4;
                                            if (objN != wneVar) {
                                                str3 = (String) objN;
                                                f4vVar = this.i;
                                                if (f4vVar != null) {
                                                    Intrinsics.h("uploadFileUseCase");
                                                    throw null;
                                                }
                                                pnt0Var.i = str2;
                                                pnt0Var.j = str;
                                                pnt0Var.k = rei0Var;
                                                pnt0Var.l = r4;
                                                pnt0Var.m = file;
                                                pnt0Var.p = 6;
                                                objP0 = f4vVar.f8933a.p0(str3, file, pnt0Var);
                                                r4 = r4;
                                                if (objP0 != wneVar) {
                                                    str4 = (String) objP0;
                                                    qvVar2 = this.k;
                                                    if (qvVar2 == null) {
                                                        Intrinsics.h("addUploadedFileMediaInfoUseCase");
                                                        throw null;
                                                    }
                                                    qvVar2.b(file, str4, str2);
                                                    if (frcVar2 == null) {
                                                        Intrinsics.h("updateDownloadFileStateUseCase");
                                                        throw null;
                                                    }
                                                    wos0 wos0Var3 = new wos0(new oos0(str4), file);
                                                    pnt0Var.i = str2;
                                                    pnt0Var.j = str;
                                                    pnt0Var.k = rei0Var;
                                                    pnt0Var.l = r4;
                                                    pnt0Var.m = file;
                                                    pnt0Var.p = 7;
                                                    ((gcl) frcVar2.f10012a.d).e(wos0Var3);
                                                    r4 = r4;
                                                    if (Unit.f46060a != wneVar) {
                                                        if (frcVar2 != null) {
                                                            Intrinsics.h("updateDownloadFileStateUseCase");
                                                            throw null;
                                                        }
                                                        wos0 wos0Var4 = new wos0(new pos0(str2, str), file);
                                                        pnt0Var.i = null;
                                                        pnt0Var.j = null;
                                                        pnt0Var.k = rei0Var;
                                                        pnt0Var.l = r4;
                                                        pnt0Var.m = file;
                                                        pnt0Var.p = 8;
                                                        ((gcl) frcVar2.f10012a.d).e(wos0Var4);
                                                        r4 = r4;
                                                        if (Unit.f46060a != wneVar) {
                                                            f4vVar2 = this.j;
                                                            if (f4vVar2 == null) {
                                                                Intrinsics.h("sendMessageUseCase");
                                                                throw null;
                                                            }
                                                            pnt0Var.i = null;
                                                            pnt0Var.j = null;
                                                            pnt0Var.k = rei0Var;
                                                            pnt0Var.l = r4;
                                                            pnt0Var.m = file;
                                                            pnt0Var.p = 9;
                                                            if (f4vVar2.c(rei0Var, pnt0Var) != wneVar) {
                                                                r0 = r4;
                                                                r3 = r0;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    r3.c(null);
                                    return ng00.a();
                                }
                                th = th;
                                r14 = r4;
                                r14.c(null);
                                throw th;
                            }
                            return wneVar;
                        case 2:
                            i050 i050Var = pnt0Var.l;
                            rei0Var = pnt0Var.k;
                            str = pnt0Var.j;
                            str2 = pnt0Var.i;
                            z1x.P(objK);
                            r4 = i050Var;
                            qvVar = this.n;
                            if (qvVar == null) {
                                Intrinsics.h("getWSConnectionStreamUseCase");
                                throw null;
                            }
                            qaf0Var = new qaf0(((vae) qvVar.f29365a.b).r, (byte) 17);
                            pnt0Var.i = str2;
                            pnt0Var.j = str;
                            pnt0Var.k = rei0Var;
                            pnt0Var.l = r4;
                            pnt0Var.p = 3;
                            r4 = r4;
                            if (ntb.K(qaf0Var, pnt0Var) != wneVar) {
                                r3 = r4;
                                if (rei0Var instanceof pei0) {
                                    file = new File(str);
                                    h03Var = this.o;
                                    if (h03Var != null) {
                                        Intrinsics.h("checkAttachFileSettingsScenario");
                                        throw null;
                                    }
                                    pnt0Var.i = str2;
                                    pnt0Var.j = str;
                                    pnt0Var.k = rei0Var;
                                    pnt0Var.l = r4;
                                    pnt0Var.m = file;
                                    pnt0Var.p = 4;
                                    objC = h03Var.C(file, pnt0Var);
                                    r4 = r4;
                                    if (objC == wneVar) {
                                        a2cVar = (a2c) objC;
                                        if (Intrinsics.d(a2cVar, x1c.f40116a)) {
                                            frcVar = this.p;
                                            if (frcVar == null) {
                                                Intrinsics.h("sendCheckFileResultUseCase");
                                                throw null;
                                            }
                                            a2cVar.getClass();
                                            i7e i7eVar3 = (i7e) frcVar.f10012a.c;
                                            i7eVar3.getClass();
                                            i7eVar3.l.g(a2cVar);
                                            throw new IllegalArgumentException("File " + file + " is unsupported");
                                        }
                                        isVar = this.h;
                                        if (isVar == null) {
                                            Intrinsics.h("getUploadMediaLinkUseCase");
                                            throw null;
                                        }
                                        pnt0Var.i = str2;
                                        pnt0Var.j = str;
                                        pnt0Var.k = rei0Var;
                                        pnt0Var.l = r4;
                                        pnt0Var.m = file;
                                        pnt0Var.p = 5;
                                        objN = isVar.f15281a.N(file, pnt0Var);
                                        r4 = r4;
                                        if (objN != wneVar) {
                                            str3 = (String) objN;
                                            f4vVar = this.i;
                                            if (f4vVar != null) {
                                                Intrinsics.h("uploadFileUseCase");
                                                throw null;
                                            }
                                            pnt0Var.i = str2;
                                            pnt0Var.j = str;
                                            pnt0Var.k = rei0Var;
                                            pnt0Var.l = r4;
                                            pnt0Var.m = file;
                                            pnt0Var.p = 6;
                                            objP0 = f4vVar.f8933a.p0(str3, file, pnt0Var);
                                            r4 = r4;
                                            if (objP0 != wneVar) {
                                                str4 = (String) objP0;
                                                qvVar2 = this.k;
                                                if (qvVar2 == null) {
                                                    Intrinsics.h("addUploadedFileMediaInfoUseCase");
                                                    throw null;
                                                }
                                                qvVar2.b(file, str4, str2);
                                                if (frcVar2 == null) {
                                                    Intrinsics.h("updateDownloadFileStateUseCase");
                                                    throw null;
                                                }
                                                wos0 wos0Var5 = new wos0(new oos0(str4), file);
                                                pnt0Var.i = str2;
                                                pnt0Var.j = str;
                                                pnt0Var.k = rei0Var;
                                                pnt0Var.l = r4;
                                                pnt0Var.m = file;
                                                pnt0Var.p = 7;
                                                ((gcl) frcVar2.f10012a.d).e(wos0Var5);
                                                r4 = r4;
                                                if (Unit.f46060a != wneVar) {
                                                    if (frcVar2 != null) {
                                                        Intrinsics.h("updateDownloadFileStateUseCase");
                                                        throw null;
                                                    }
                                                    wos0 wos0Var6 = new wos0(new pos0(str2, str), file);
                                                    pnt0Var.i = null;
                                                    pnt0Var.j = null;
                                                    pnt0Var.k = rei0Var;
                                                    pnt0Var.l = r4;
                                                    pnt0Var.m = file;
                                                    pnt0Var.p = 8;
                                                    ((gcl) frcVar2.f10012a.d).e(wos0Var6);
                                                    r4 = r4;
                                                    if (Unit.f46060a != wneVar) {
                                                        f4vVar2 = this.j;
                                                        if (f4vVar2 == null) {
                                                            Intrinsics.h("sendMessageUseCase");
                                                            throw null;
                                                        }
                                                        pnt0Var.i = null;
                                                        pnt0Var.j = null;
                                                        pnt0Var.k = rei0Var;
                                                        pnt0Var.l = r4;
                                                        pnt0Var.m = file;
                                                        pnt0Var.p = 9;
                                                        if (f4vVar2.c(rei0Var, pnt0Var) != wneVar) {
                                                            r0 = r4;
                                                            r3 = r0;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                r3.c(null);
                                return ng00.a();
                            }
                            return wneVar;
                            th = th;
                            r14 = r4;
                            r14.c(null);
                            throw th;
                        case 3:
                            i050 i050Var2 = pnt0Var.l;
                            rei0Var = pnt0Var.k;
                            str = pnt0Var.j;
                            str2 = pnt0Var.i;
                            z1x.P(objK);
                            r4 = i050Var2;
                            r3 = r4;
                            if (rei0Var instanceof pei0) {
                                file = new File(str);
                                h03Var = this.o;
                                if (h03Var != null) {
                                    Intrinsics.h("checkAttachFileSettingsScenario");
                                    throw null;
                                }
                                pnt0Var.i = str2;
                                pnt0Var.j = str;
                                pnt0Var.k = rei0Var;
                                pnt0Var.l = r4;
                                pnt0Var.m = file;
                                pnt0Var.p = 4;
                                objC = h03Var.C(file, pnt0Var);
                                r4 = r4;
                                if (objC == wneVar) {
                                    a2cVar = (a2c) objC;
                                    if (Intrinsics.d(a2cVar, x1c.f40116a)) {
                                        frcVar = this.p;
                                        if (frcVar == null) {
                                            Intrinsics.h("sendCheckFileResultUseCase");
                                            throw null;
                                        }
                                        a2cVar.getClass();
                                        i7e i7eVar4 = (i7e) frcVar.f10012a.c;
                                        i7eVar4.getClass();
                                        i7eVar4.l.g(a2cVar);
                                        throw new IllegalArgumentException("File " + file + " is unsupported");
                                    }
                                    isVar = this.h;
                                    if (isVar == null) {
                                        Intrinsics.h("getUploadMediaLinkUseCase");
                                        throw null;
                                    }
                                    pnt0Var.i = str2;
                                    pnt0Var.j = str;
                                    pnt0Var.k = rei0Var;
                                    pnt0Var.l = r4;
                                    pnt0Var.m = file;
                                    pnt0Var.p = 5;
                                    objN = isVar.f15281a.N(file, pnt0Var);
                                    r4 = r4;
                                    if (objN != wneVar) {
                                        str3 = (String) objN;
                                        f4vVar = this.i;
                                        if (f4vVar != null) {
                                            Intrinsics.h("uploadFileUseCase");
                                            throw null;
                                        }
                                        pnt0Var.i = str2;
                                        pnt0Var.j = str;
                                        pnt0Var.k = rei0Var;
                                        pnt0Var.l = r4;
                                        pnt0Var.m = file;
                                        pnt0Var.p = 6;
                                        objP0 = f4vVar.f8933a.p0(str3, file, pnt0Var);
                                        r4 = r4;
                                        if (objP0 != wneVar) {
                                            str4 = (String) objP0;
                                            qvVar2 = this.k;
                                            if (qvVar2 == null) {
                                                Intrinsics.h("addUploadedFileMediaInfoUseCase");
                                                throw null;
                                            }
                                            qvVar2.b(file, str4, str2);
                                            if (frcVar2 == null) {
                                                Intrinsics.h("updateDownloadFileStateUseCase");
                                                throw null;
                                            }
                                            wos0 wos0Var7 = new wos0(new oos0(str4), file);
                                            pnt0Var.i = str2;
                                            pnt0Var.j = str;
                                            pnt0Var.k = rei0Var;
                                            pnt0Var.l = r4;
                                            pnt0Var.m = file;
                                            pnt0Var.p = 7;
                                            ((gcl) frcVar2.f10012a.d).e(wos0Var7);
                                            r4 = r4;
                                            if (Unit.f46060a != wneVar) {
                                                if (frcVar2 != null) {
                                                    Intrinsics.h("updateDownloadFileStateUseCase");
                                                    throw null;
                                                }
                                                wos0 wos0Var8 = new wos0(new pos0(str2, str), file);
                                                pnt0Var.i = null;
                                                pnt0Var.j = null;
                                                pnt0Var.k = rei0Var;
                                                pnt0Var.l = r4;
                                                pnt0Var.m = file;
                                                pnt0Var.p = 8;
                                                ((gcl) frcVar2.f10012a.d).e(wos0Var8);
                                                r4 = r4;
                                                if (Unit.f46060a != wneVar) {
                                                    f4vVar2 = this.j;
                                                    if (f4vVar2 == null) {
                                                        Intrinsics.h("sendMessageUseCase");
                                                        throw null;
                                                    }
                                                    pnt0Var.i = null;
                                                    pnt0Var.j = null;
                                                    pnt0Var.k = rei0Var;
                                                    pnt0Var.l = r4;
                                                    pnt0Var.m = file;
                                                    pnt0Var.p = 9;
                                                    if (f4vVar2.c(rei0Var, pnt0Var) != wneVar) {
                                                        r0 = r4;
                                                        r3 = r0;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return wneVar;
                                th = th;
                                r14 = r4;
                                r14.c(null);
                                throw th;
                            }
                            r3.c(null);
                            return ng00.a();
                        case 4:
                            File file2 = pnt0Var.m;
                            i050 i050Var3 = pnt0Var.l;
                            rei0 rei0Var3 = pnt0Var.k;
                            String str6 = pnt0Var.j;
                            String str7 = pnt0Var.i;
                            try {
                                z1x.P(objK);
                                objC = objK;
                                file = file2;
                                r4 = i050Var3;
                                rei0Var = rei0Var3;
                                str = str6;
                                str2 = str7;
                                a2cVar = (a2c) objC;
                                if (Intrinsics.d(a2cVar, x1c.f40116a)) {
                                    frcVar = this.p;
                                    if (frcVar == null) {
                                        Intrinsics.h("sendCheckFileResultUseCase");
                                        throw null;
                                    }
                                    a2cVar.getClass();
                                    i7e i7eVar5 = (i7e) frcVar.f10012a.c;
                                    i7eVar5.getClass();
                                    i7eVar5.l.g(a2cVar);
                                    throw new IllegalArgumentException("File " + file + " is unsupported");
                                }
                                isVar = this.h;
                                if (isVar == null) {
                                    Intrinsics.h("getUploadMediaLinkUseCase");
                                    throw null;
                                }
                                pnt0Var.i = str2;
                                pnt0Var.j = str;
                                pnt0Var.k = rei0Var;
                                pnt0Var.l = r4;
                                pnt0Var.m = file;
                                pnt0Var.p = 5;
                                objN = isVar.f15281a.N(file, pnt0Var);
                                r4 = r4;
                                if (objN != wneVar) {
                                    str3 = (String) objN;
                                    f4vVar = this.i;
                                    if (f4vVar != null) {
                                        Intrinsics.h("uploadFileUseCase");
                                        throw null;
                                    }
                                    pnt0Var.i = str2;
                                    pnt0Var.j = str;
                                    pnt0Var.k = rei0Var;
                                    pnt0Var.l = r4;
                                    pnt0Var.m = file;
                                    pnt0Var.p = 6;
                                    objP0 = f4vVar.f8933a.p0(str3, file, pnt0Var);
                                    r4 = r4;
                                    if (objP0 != wneVar) {
                                        str4 = (String) objP0;
                                        qvVar2 = this.k;
                                        if (qvVar2 == null) {
                                            Intrinsics.h("addUploadedFileMediaInfoUseCase");
                                            throw null;
                                        }
                                        qvVar2.b(file, str4, str2);
                                        if (frcVar2 == null) {
                                            Intrinsics.h("updateDownloadFileStateUseCase");
                                            throw null;
                                        }
                                        wos0 wos0Var9 = new wos0(new oos0(str4), file);
                                        pnt0Var.i = str2;
                                        pnt0Var.j = str;
                                        pnt0Var.k = rei0Var;
                                        pnt0Var.l = r4;
                                        pnt0Var.m = file;
                                        pnt0Var.p = 7;
                                        ((gcl) frcVar2.f10012a.d).e(wos0Var9);
                                        r4 = r4;
                                        if (Unit.f46060a != wneVar) {
                                            if (frcVar2 != null) {
                                                Intrinsics.h("updateDownloadFileStateUseCase");
                                                throw null;
                                            }
                                            wos0 wos0Var10 = new wos0(new pos0(str2, str), file);
                                            pnt0Var.i = null;
                                            pnt0Var.j = null;
                                            pnt0Var.k = rei0Var;
                                            pnt0Var.l = r4;
                                            pnt0Var.m = file;
                                            pnt0Var.p = 8;
                                            ((gcl) frcVar2.f10012a.d).e(wos0Var10);
                                            r4 = r4;
                                            if (Unit.f46060a != wneVar) {
                                                f4vVar2 = this.j;
                                                if (f4vVar2 == null) {
                                                    Intrinsics.h("sendMessageUseCase");
                                                    throw null;
                                                }
                                                pnt0Var.i = null;
                                                pnt0Var.j = null;
                                                pnt0Var.k = rei0Var;
                                                pnt0Var.l = r4;
                                                pnt0Var.m = file;
                                                pnt0Var.p = 9;
                                                if (f4vVar2.c(rei0Var, pnt0Var) != wneVar) {
                                                    r0 = r4;
                                                    r3 = r0;
                                                    r3.c(null);
                                                    return ng00.a();
                                                }
                                            }
                                        }
                                    }
                                }
                                return wneVar;
                            } catch (Exception e2) {
                                e = e2;
                                r13 = file2;
                                r4 = i050Var3;
                                rei0Var = rei0Var3;
                                e.printStackTrace();
                                if (frcVar2 == null) {
                                    Intrinsics.h("updateDownloadFileStateUseCase");
                                    throw null;
                                }
                                String str8 = ((pei0) rei0Var).d;
                                String absolutePath2 = r13.getAbsolutePath();
                                absolutePath2.getClass();
                                tos0 tos0Var2 = new tos0(new pos0(str8, absolutePath2), r13, e);
                                pnt0Var.i = null;
                                pnt0Var.j = null;
                                pnt0Var.k = null;
                                pnt0Var.l = r4;
                                pnt0Var.m = null;
                                pnt0Var.p = 10;
                                ((gcl) frcVar2.f10012a.d).e(tos0Var2);
                                unit = Unit.f46060a;
                                wne wneVar3 = wne.f39444a;
                                if (unit != wneVar) {
                                    r15 = r4;
                                    r3 = r15;
                                    r3.c(null);
                                    return ng00.a();
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                r14 = i050Var3;
                            }
                            th = th;
                            r14 = r4;
                            r14.c(null);
                            throw th;
                        case 5:
                            File file3 = pnt0Var.m;
                            i050 i050Var4 = pnt0Var.l;
                            rei0Var = pnt0Var.k;
                            str = pnt0Var.j;
                            str2 = pnt0Var.i;
                            z1x.P(objK);
                            objN = objK;
                            file = file3;
                            r4 = i050Var4;
                            str3 = (String) objN;
                            f4vVar = this.i;
                            if (f4vVar != null) {
                                Intrinsics.h("uploadFileUseCase");
                                throw null;
                            }
                            pnt0Var.i = str2;
                            pnt0Var.j = str;
                            pnt0Var.k = rei0Var;
                            pnt0Var.l = r4;
                            pnt0Var.m = file;
                            pnt0Var.p = 6;
                            objP0 = f4vVar.f8933a.p0(str3, file, pnt0Var);
                            r4 = r4;
                            if (objP0 != wneVar) {
                                str4 = (String) objP0;
                                qvVar2 = this.k;
                                if (qvVar2 == null) {
                                    Intrinsics.h("addUploadedFileMediaInfoUseCase");
                                    throw null;
                                }
                                qvVar2.b(file, str4, str2);
                                if (frcVar2 == null) {
                                    Intrinsics.h("updateDownloadFileStateUseCase");
                                    throw null;
                                }
                                wos0 wos0Var11 = new wos0(new oos0(str4), file);
                                pnt0Var.i = str2;
                                pnt0Var.j = str;
                                pnt0Var.k = rei0Var;
                                pnt0Var.l = r4;
                                pnt0Var.m = file;
                                pnt0Var.p = 7;
                                ((gcl) frcVar2.f10012a.d).e(wos0Var11);
                                r4 = r4;
                                if (Unit.f46060a != wneVar) {
                                    if (frcVar2 != null) {
                                        Intrinsics.h("updateDownloadFileStateUseCase");
                                        throw null;
                                    }
                                    wos0 wos0Var12 = new wos0(new pos0(str2, str), file);
                                    pnt0Var.i = null;
                                    pnt0Var.j = null;
                                    pnt0Var.k = rei0Var;
                                    pnt0Var.l = r4;
                                    pnt0Var.m = file;
                                    pnt0Var.p = 8;
                                    ((gcl) frcVar2.f10012a.d).e(wos0Var12);
                                    r4 = r4;
                                    if (Unit.f46060a != wneVar) {
                                        f4vVar2 = this.j;
                                        if (f4vVar2 == null) {
                                            Intrinsics.h("sendMessageUseCase");
                                            throw null;
                                        }
                                        pnt0Var.i = null;
                                        pnt0Var.j = null;
                                        pnt0Var.k = rei0Var;
                                        pnt0Var.l = r4;
                                        pnt0Var.m = file;
                                        pnt0Var.p = 9;
                                        if (f4vVar2.c(rei0Var, pnt0Var) != wneVar) {
                                            r0 = r4;
                                            r3 = r0;
                                            r3.c(null);
                                            return ng00.a();
                                        }
                                    }
                                }
                            }
                            return wneVar;
                            th = th;
                            r14 = r4;
                            r14.c(null);
                            throw th;
                        case 6:
                            File file4 = pnt0Var.m;
                            i050 i050Var5 = pnt0Var.l;
                            rei0Var = pnt0Var.k;
                            str = pnt0Var.j;
                            str2 = pnt0Var.i;
                            z1x.P(objK);
                            objP0 = objK;
                            file = file4;
                            r4 = i050Var5;
                            str4 = (String) objP0;
                            qvVar2 = this.k;
                            if (qvVar2 == null) {
                                Intrinsics.h("addUploadedFileMediaInfoUseCase");
                                throw null;
                            }
                            qvVar2.b(file, str4, str2);
                            if (frcVar2 == null) {
                                Intrinsics.h("updateDownloadFileStateUseCase");
                                throw null;
                            }
                            wos0 wos0Var13 = new wos0(new oos0(str4), file);
                            pnt0Var.i = str2;
                            pnt0Var.j = str;
                            pnt0Var.k = rei0Var;
                            pnt0Var.l = r4;
                            pnt0Var.m = file;
                            pnt0Var.p = 7;
                            ((gcl) frcVar2.f10012a.d).e(wos0Var13);
                            r4 = r4;
                            if (Unit.f46060a != wneVar) {
                                if (frcVar2 != null) {
                                    Intrinsics.h("updateDownloadFileStateUseCase");
                                    throw null;
                                }
                                wos0 wos0Var14 = new wos0(new pos0(str2, str), file);
                                pnt0Var.i = null;
                                pnt0Var.j = null;
                                pnt0Var.k = rei0Var;
                                pnt0Var.l = r4;
                                pnt0Var.m = file;
                                pnt0Var.p = 8;
                                ((gcl) frcVar2.f10012a.d).e(wos0Var14);
                                r4 = r4;
                                if (Unit.f46060a != wneVar) {
                                    f4vVar2 = this.j;
                                    if (f4vVar2 == null) {
                                        Intrinsics.h("sendMessageUseCase");
                                        throw null;
                                    }
                                    pnt0Var.i = null;
                                    pnt0Var.j = null;
                                    pnt0Var.k = rei0Var;
                                    pnt0Var.l = r4;
                                    pnt0Var.m = file;
                                    pnt0Var.p = 9;
                                    if (f4vVar2.c(rei0Var, pnt0Var) != wneVar) {
                                        r0 = r4;
                                        r3 = r0;
                                        r3.c(null);
                                        return ng00.a();
                                    }
                                }
                            }
                            return wneVar;
                            th = th;
                            r14 = r4;
                            r14.c(null);
                            throw th;
                        case 7:
                            File file5 = pnt0Var.m;
                            i050 i050Var6 = pnt0Var.l;
                            rei0Var = pnt0Var.k;
                            str = pnt0Var.j;
                            str2 = pnt0Var.i;
                            z1x.P(objK);
                            file = file5;
                            r4 = i050Var6;
                            if (frcVar2 != null) {
                                Intrinsics.h("updateDownloadFileStateUseCase");
                                throw null;
                            }
                            wos0 wos0Var15 = new wos0(new pos0(str2, str), file);
                            pnt0Var.i = null;
                            pnt0Var.j = null;
                            pnt0Var.k = rei0Var;
                            pnt0Var.l = r4;
                            pnt0Var.m = file;
                            pnt0Var.p = 8;
                            ((gcl) frcVar2.f10012a.d).e(wos0Var15);
                            r4 = r4;
                            if (Unit.f46060a != wneVar) {
                                f4vVar2 = this.j;
                                if (f4vVar2 == null) {
                                    Intrinsics.h("sendMessageUseCase");
                                    throw null;
                                }
                                pnt0Var.i = null;
                                pnt0Var.j = null;
                                pnt0Var.k = rei0Var;
                                pnt0Var.l = r4;
                                pnt0Var.m = file;
                                pnt0Var.p = 9;
                                if (f4vVar2.c(rei0Var, pnt0Var) != wneVar) {
                                    r0 = r4;
                                    r3 = r0;
                                    r3.c(null);
                                    return ng00.a();
                                }
                            }
                            return wneVar;
                        case 8:
                            File file6 = pnt0Var.m;
                            i050 i050Var7 = pnt0Var.l;
                            rei0Var = pnt0Var.k;
                            z1x.P(objK);
                            file = file6;
                            r4 = i050Var7;
                            f4vVar2 = this.j;
                            if (f4vVar2 == null) {
                                Intrinsics.h("sendMessageUseCase");
                                throw null;
                            }
                            pnt0Var.i = null;
                            pnt0Var.j = null;
                            pnt0Var.k = rei0Var;
                            pnt0Var.l = r4;
                            pnt0Var.m = file;
                            pnt0Var.p = 9;
                            if (f4vVar2.c(rei0Var, pnt0Var) != wneVar) {
                                r0 = r4;
                                r3 = r0;
                                r3.c(null);
                                return ng00.a();
                            }
                            return wneVar;
                        case 9:
                            File file7 = pnt0Var.m;
                            i050 i050Var8 = pnt0Var.l;
                            rei0 rei0Var4 = pnt0Var.k;
                            try {
                                z1x.P(objK);
                                r0 = i050Var8;
                                r3 = r0;
                            } catch (Exception e3) {
                                e = e3;
                                rei0Var = rei0Var4;
                                r4 = i050Var8;
                                r13 = file7;
                                e.printStackTrace();
                                if (frcVar2 == null) {
                                    Intrinsics.h("updateDownloadFileStateUseCase");
                                    throw null;
                                }
                                String str9 = ((pei0) rei0Var).d;
                                String absolutePath3 = r13.getAbsolutePath();
                                absolutePath3.getClass();
                                tos0 tos0Var3 = new tos0(new pos0(str9, absolutePath3), r13, e);
                                pnt0Var.i = null;
                                pnt0Var.j = null;
                                pnt0Var.k = null;
                                pnt0Var.l = r4;
                                pnt0Var.m = null;
                                pnt0Var.p = 10;
                                ((gcl) frcVar2.f10012a.d).e(tos0Var3);
                                unit = Unit.f46060a;
                                wne wneVar4 = wne.f39444a;
                                if (unit != wneVar) {
                                    r15 = r4;
                                    r3 = r15;
                                }
                                return wneVar;
                            } catch (Throwable th14) {
                                th = th14;
                                r14 = i050Var8;
                                break;
                            }
                            r3.c(null);
                            return ng00.a();
                        case 10:
                            r14 = pnt0Var.l;
                            try {
                                z1x.P(objK);
                                r15 = r14;
                                r3 = r15;
                                r3.c(null);
                                return ng00.a();
                            } catch (Throwable th15) {
                                th = th15;
                            }
                            break;
                        default:
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                } catch (Throwable th16) {
                    th = th16;
                }
            } catch (Exception e4) {
                e = e4;
                r13 = "File ";
                r4 = r4;
            }
        } catch (Throwable th17) {
            th = th17;
            r14 = r4;
        }
    }
}
