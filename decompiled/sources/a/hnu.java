package a;

import android.content.ClipDescription;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.util.Size;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes.dex */
public final class hnu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13365a;

    public hnu(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f13365a = new nex(uri, clipDescription, uri2);
        } else {
            this.f13365a = new nvu(uri, clipDescription, uri2, (byte) 5);
        }
    }

    public static Object i(hnu hnuVar, int i, bnn0 bnn0Var, int i2) {
        if ((i2 & 1) != 0) {
            i = (int) (System.currentTimeMillis() / 1000);
        }
        return ((z220) hnuVar.f13365a).r(i, (int) (System.currentTimeMillis() / 1000), bnn0Var);
    }

    public static n45 l(z35 z35Var) throws ozw {
        n45 n45Var = z35Var.f43703a;
        b1x b1xVar = (b1x) n45Var.f22883a;
        Rect rect = n45Var.e;
        try {
            byte[] bArrS = m2x.S(b1xVar, rect, z35Var.b, n45Var.f);
            try {
                fko fkoVar = new fko(new sko(new ByteArrayInputStream(bArrS)));
                Size size = new Size(rect.width(), rect.height());
                Rect rect2 = new Rect(0, 0, rect.width(), rect.height());
                int i = n45Var.f;
                Matrix matrix = n45Var.g;
                RectF rectF = jls0.f16733a;
                Matrix matrix2 = new Matrix(matrix);
                matrix2.postTranslate(-rect.left, -rect.top);
                return new n45(bArrS, fkoVar, 256, size, rect2, i, matrix2, n45Var.h);
            } catch (IOException e) {
                throw new ozw(0, "Failed to extract Exif from YUV-generated JPEG", e);
            }
        } catch (l2x e2) {
            throw new ozw(1, "Failed to encode the image to JPEG.", e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r6 == r9) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r6 == r9) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(a.sip r7, a.jo20 r8, a.zje r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f13365a
            a.tpv r0 = (a.tpv) r0
            boolean r1 = r9 instanceof a.cew
            if (r1 == 0) goto L17
            r1 = r9
            a.cew r1 = (a.cew) r1
            int r2 = r1.k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.k = r2
            goto L1c
        L17:
            a.cew r1 = new a.cew
            r1.<init>(r6, r9)
        L1c:
            java.lang.Object r6 = r1.i
            a.wne r9 = a.wne.f39444a
            int r2 = r1.k
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            a.z1x.P(r6)
            goto L69
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L35:
            a.z1x.P(r6)
            goto L53
        L39:
            a.z1x.P(r6)
            int r6 = r7.ordinal()
            if (r6 == 0) goto L5a
            if (r6 != r5) goto L56
            java.lang.Object r6 = r0.invoke()
            a.aqr r6 = (a.aqr) r6
            r1.k = r5
            java.lang.Object r6 = r6.d(r8, r1)
            if (r6 != r9) goto L53
            goto L68
        L53:
            a.dx5 r6 = (a.dx5) r6
            goto L6b
        L56:
            a.t9f.b()
            return r3
        L5a:
            java.lang.Object r6 = r0.invoke()
            a.aqr r6 = (a.aqr) r6
            r1.k = r4
            java.lang.Object r6 = r6.e(r8, r1)
            if (r6 != r9) goto L69
        L68:
            return r9
        L69:
            a.dx5 r6 = (a.dx5) r6
        L6b:
            java.lang.Object r6 = r6.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hnu.a(a.sip, a.jo20, a.zje):java.lang.Object");
    }

    public int b() {
        return ((my60) ((uyn) this.f13365a).f36498a).c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable c(int i, zje zjeVar) {
        evu evuVar;
        if (zjeVar instanceof evu) {
            evuVar = (evu) zjeVar;
            int i2 = evuVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                evuVar.k = i2 - Integer.MIN_VALUE;
            } else {
                evuVar = new evu(this, zjeVar);
            }
        } else {
            evuVar = new evu(this, zjeVar);
        }
        Object objP = evuVar.i;
        wne wneVar = wne.f39444a;
        int i3 = evuVar.k;
        if (i3 == 0) {
            z1x.P(objP);
            cyu cyuVar = (cyu) this.f13365a;
            Integer num = new Integer(i);
            evuVar.k = 1;
            objP = cyuVar.p(num, evuVar);
            if (objP == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objP);
        }
        Iterable<xde0> iterable = (Iterable) objP;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (xde0 xde0Var : iterable) {
            arrayList.add(new yeh0(xde0Var.f40690a, xde0Var.c, xde0Var.d));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008c A[Catch: all -> 0x007a, TRY_ENTER, TryCatch #0 {all -> 0x007a, blocks: (B:24:0x008c, B:27:0x00a5, B:18:0x0076), top: B:62:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x0114 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0116  */
    /* JADX WARN: Code duplicated, block: B:61:0x011c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d5, code lost:
    
        if (a.qcc.P(r10, r2) == r3) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0105, code lost:
    
        if (a.qcc.P(r10, r2) == r3) goto L55;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00b0 -> B:23:0x008a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00df -> B:42:0x00d8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x010e -> B:42:0x00d8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(a.zje r19) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hnu.d(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(String str, zje zjeVar) {
        kyu kyuVar;
        if (zjeVar instanceof kyu) {
            kyuVar = (kyu) zjeVar;
            int i = kyuVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                kyuVar.k = i - Integer.MIN_VALUE;
            } else {
                kyuVar = new kyu(this, zjeVar);
            }
        } else {
            kyuVar = new kyu(this, zjeVar);
        }
        Object objD0 = kyuVar.i;
        wne wneVar = wne.f39444a;
        int i2 = kyuVar.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objD0);
            z220 z220Var = (z220) this.f13365a;
            kyuVar.k = 1;
            objD0 = qjj.d0(((mne) z220Var.c).b, new oed(z220Var, str, yjeVar, (byte) 25), kyuVar);
            if (objD0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD0);
        }
        ahp0 ahp0Var = (ahp0) objD0;
        List listA0 = CollectionsKt.A0(ahp0Var.c, new vvt((byte) 27));
        int i3 = ahp0Var.f885a;
        int i4 = ahp0Var.b;
        listA0.getClass();
        return new ahp0(i3, i4, listA0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(boolean z, zje zjeVar) {
        jzu jzuVar;
        if (zjeVar instanceof jzu) {
            jzuVar = (jzu) zjeVar;
            int i = jzuVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                jzuVar.k = i - Integer.MIN_VALUE;
            } else {
                jzuVar = new jzu(this, zjeVar);
            }
        } else {
            jzuVar = new jzu(this, zjeVar);
        }
        Object objK = jzuVar.i;
        wne wneVar = wne.f39444a;
        int i2 = jzuVar.k;
        if (i2 == 0) {
            z1x.P(objK);
            p6d p6dVarT = ((w5z) this.f13365a).t(z);
            jzuVar.k = 1;
            objK = ntb.K(p6dVarT, jzuVar);
            if (objK == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objK);
        }
        List list = (List) objK;
        return list == null ? iun.f15405a : list;
    }

    public List g(List list) {
        list.getClass();
        ((g8n0) ((nvu) this.f13365a).b).getClass();
        return CollectionsKt.A0(list, new mto(new mjf0((byte) 22), (byte) 10));
    }

    public List h(HistoryTypeModel historyTypeModel, f8w f8wVar, boolean z) {
        historyTypeModel.getClass();
        f8wVar.getClass();
        j77 j77Var = (j77) ((dpi0) this.f13365a).f6468a;
        int iOrdinal = f8wVar.ordinal();
        if (iOrdinal == 0) {
            j77Var.getClass();
            List list = (List) j77Var.f16027a.get(historyTypeModel);
            return list == null ? j77.a(historyTypeModel, z) : list;
        }
        if (iOrdinal != 1) {
            t9f.b();
            return null;
        }
        j77Var.getClass();
        List list2 = (List) j77Var.b.get(historyTypeModel);
        return list2 == null ? j77.a(historyTypeModel, z) : list2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object j(Long l, zje zjeVar) {
        rvu rvuVar;
        if (zjeVar instanceof rvu) {
            rvuVar = (rvu) zjeVar;
            int i = rvuVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                rvuVar.k = i - Integer.MIN_VALUE;
            } else {
                rvuVar = new rvu(this, zjeVar);
            }
        } else {
            rvuVar = new rvu(this, zjeVar);
        }
        rvu rvuVar2 = rvuVar;
        Object obj = rvuVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = rvuVar2.k;
        if (i2 != 0) {
            if (i2 == 1) {
                z1x.P(obj);
                return ((j0g0) obj).f15681a;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        if (l == null || l.longValue() <= 0) {
            e0g0 e0g0Var = j0g0.b;
            return new g0g0(new ff5(null));
        }
        ouu ouuVar = (ouu) this.f13365a;
        long jLongValue = l.longValue();
        rvuVar2.k = 1;
        Object objW = ouuVar.w(jLongValue, 189L, rvuVar2);
        return objW == wneVar ? wneVar : objW;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r1 != (-1)) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a.n45 k(a.z35 r11, int r12) {
        /*
            r10 = this;
            a.n45 r11 = r11.f43703a
            java.lang.Object r10 = r10.f13365a
            a.xsu r10 = (a.xsu) r10
            java.lang.Object r0 = r11.f22883a
            a.b1x r0 = (a.b1x) r0
            java.lang.Object r10 = r10.f41434a
            androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk r10 = (androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk) r10
            r1 = 0
            if (r10 != 0) goto L29
            a.wsf0[] r10 = r0.l0()
            r10 = r10[r1]
            java.nio.ByteBuffer r10 = r10.i()
            int r0 = r10.capacity()
            byte[] r0 = new byte[r0]
            r10.rewind()
            r10.get(r0)
        L27:
            r2 = r0
            goto L84
        L29:
            a.wsf0[] r10 = r0.l0()
            r10 = r10[r1]
            java.nio.ByteBuffer r10 = r10.i()
            int r0 = r10.capacity()
            byte[] r2 = new byte[r0]
            r10.rewind()
            r10.get(r2)
            r3 = 2
            r4 = r3
        L41:
            int r5 = r4 + 4
            r6 = -1
            if (r5 > r0) goto L68
            r5 = r2[r4]
            if (r5 == r6) goto L4b
            goto L68
        L4b:
            if (r5 != r6) goto L56
            int r5 = r4 + 1
            r5 = r2[r5]
            r6 = -38
            if (r5 != r6) goto L56
            goto L7b
        L56:
            int r5 = r4 + 2
            r5 = r2[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 8
            int r6 = r4 + 3
            r6 = r2[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r5 = r5 | r6
            int r5 = r5 + r3
            int r4 = r4 + r5
            goto L41
        L68:
            int r1 = r3 + 1
            if (r1 <= r0) goto L6e
            r1 = r6
            goto L79
        L6e:
            r4 = r2[r3]
            if (r4 != r6) goto L9a
            r4 = r2[r1]
            r5 = -40
            if (r4 != r5) goto L9a
            r1 = r3
        L79:
            if (r1 == r6) goto L84
        L7b:
            int r10 = r10.limit()
            byte[] r0 = java.util.Arrays.copyOfRange(r2, r1, r10)
            goto L27
        L84:
            a.fko r3 = r11.b
            java.util.Objects.requireNonNull(r3)
            android.util.Size r5 = r11.d
            android.graphics.Rect r6 = r11.e
            int r7 = r11.f
            android.graphics.Matrix r8 = r11.g
            a.cy9 r9 = r11.h
            a.n45 r1 = new a.n45
            r4 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        L9a:
            r4 = r12
            r3 = r1
            r12 = r4
            goto L68
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hnu.k(a.z35, int):a.n45");
    }

    public hnu(khb0 khb0Var) {
        khb0Var.getClass();
        this.f13365a = khb0Var;
    }

    public hnu(iqp0 iqp0Var) {
        iqp0Var.getClass();
        this.f13365a = iqp0Var;
    }

    public hnu(gii0 gii0Var) {
        gii0Var.getClass();
        this.f13365a = new tpv(gii0Var, (byte) 5);
    }

    public hnu(n9s n9sVar) {
        n9sVar.getClass();
        this.f13365a = n9sVar;
    }

    public hnu(kpd0 kpd0Var) {
        this.f13365a = new xsu(kpd0Var);
    }

    public /* synthetic */ hnu(Object obj) {
        this.f13365a = obj;
    }
}
