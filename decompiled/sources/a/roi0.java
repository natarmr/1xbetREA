package a;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class roi0 implements spg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f30839a;

    public roi0(g4d0 g4d0Var) {
        g4d0Var.getClass();
        List list = g4d0Var.c;
        if ((g4d0Var.b & 1) == 1) {
            int i = g4d0Var.d;
            list.getClass();
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    q3d.p();
                    throw null;
                }
                a4d0 a4d0VarG = (a4d0) obj;
                if (i2 >= i) {
                    a4d0VarG.getClass();
                    z3d0 z3d0VarT = a4d0.t(a4d0VarG);
                    z3d0VarT.d |= 2;
                    z3d0VarT.f = true;
                    a4d0VarG = z3d0VarT.g();
                    if (!a4d0VarG.b()) {
                        throw new ss3((byte) 28);
                    }
                }
                arrayList.add(a4d0VarG);
                i2 = i3;
            }
            list = arrayList;
        }
        list.getClass();
        this.f30839a = list;
    }

    @Override // a.spg0
    public qpg0 a(String str) {
        str.getClass();
        return new okn0(((rkn0) this.f30839a).G0());
    }

    public a4d0 c(int i) {
        return (a4d0) ((List) this.f30839a).get(i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(List list, zje zjeVar) {
        hzq0 hzq0Var;
        if (zjeVar instanceof hzq0) {
            hzq0Var = (hzq0) zjeVar;
            int i = hzq0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                hzq0Var.k = i - Integer.MIN_VALUE;
            } else {
                hzq0Var = new hzq0(this, zjeVar);
            }
        } else {
            hzq0Var = new hzq0(this, zjeVar);
        }
        Object objE = hzq0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = hzq0Var.k;
        if (i2 == 0) {
            z1x.P(objE);
            bog bogVar = (bog) ((enj0) this.f30839a).invoke();
            hzq0Var.k = 1;
            objE = bogVar.e(list, hzq0Var);
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
        return ((dx5) objE).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(jo20 jo20Var, zje zjeVar) {
        izq0 izq0Var;
        if (zjeVar instanceof izq0) {
            izq0Var = (izq0) zjeVar;
            int i = izq0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                izq0Var.k = i - Integer.MIN_VALUE;
            } else {
                izq0Var = new izq0(this, zjeVar);
            }
        } else {
            izq0Var = new izq0(this, zjeVar);
        }
        Object objD = izq0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = izq0Var.k;
        if (i2 == 0) {
            z1x.P(objD);
            bog bogVar = (bog) ((enj0) this.f30839a).invoke();
            izq0Var.k = 1;
            objD = bogVar.d(jo20Var, izq0Var);
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
        return ((dx5) objD).a();
    }

    public Size[] f(int i) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f30839a;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i);
        }
        return null;
    }

    public Integer[] g() {
        int[] outputFormats;
        Integer[] numArr = null;
        try {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f30839a;
            outputFormats = streamConfigurationMap != null ? streamConfigurationMap.getOutputFormats() : null;
        } catch (IllegalArgumentException e) {
            l8x.F0("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e);
        } catch (NullPointerException e2) {
            l8x.F0("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e2);
        }
        if (outputFormats != null) {
            numArr = new Integer[outputFormats.length];
            int length = outputFormats.length;
            for (int i = 0; i < length; i++) {
                numArr[i] = Integer.valueOf(outputFormats[i]);
            }
        }
        return numArr;
    }

    public long h(int i, Size size) {
        size.getClass();
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f30839a;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getOutputMinFrameDuration(i, size);
        }
        return 0L;
    }

    public Size[] i(int i) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f30839a;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getOutputSizes(i);
        }
        return null;
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
    public java.lang.Object j(a.sip r7, java.util.TreeMap r8, a.zje r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f30839a
            a.enj0 r0 = (a.enj0) r0
            boolean r1 = r9 instanceof a.kzo0
            if (r1 == 0) goto L17
            r1 = r9
            a.kzo0 r1 = (a.kzo0) r1
            int r2 = r1.k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.k = r2
            goto L1c
        L17:
            a.kzo0 r1 = new a.kzo0
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
            goto L53
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L35:
            a.z1x.P(r6)
            goto L69
        L39:
            a.z1x.P(r6)
            int r6 = r7.ordinal()
            if (r6 == 0) goto L5a
            if (r6 != r5) goto L56
            java.lang.Object r6 = r0.invoke()
            a.dzo0 r6 = (a.dzo0) r6
            r1.k = r4
            java.lang.Object r6 = r6.a(r8, r1)
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
            a.dzo0 r6 = (a.dzo0) r6
            r1.k = r5
            java.lang.Object r6 = r6.b(r8, r1)
            if (r6 != r9) goto L69
        L68:
            return r9
        L69:
            a.dx5 r6 = (a.dx5) r6
        L6b:
            java.lang.Object r6 = r6.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.roi0.j(a.sip, java.util.TreeMap, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r6 == r10) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (r6 == r10) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(a.sip r7, org.xplatform.cyber.section.api.domain.entity.CyberGamesPage r8, a.jo20 r9, a.zje r10) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f30839a
            a.enj0 r0 = (a.enj0) r0
            boolean r1 = r10 instanceof a.jzq0
            if (r1 == 0) goto L17
            r1 = r10
            a.jzq0 r1 = (a.jzq0) r1
            int r2 = r1.k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.k = r2
            goto L1c
        L17:
            a.jzq0 r1 = new a.jzq0
            r1.<init>(r6, r10)
        L1c:
            java.lang.Object r6 = r1.i
            a.wne r10 = a.wne.f39444a
            int r2 = r1.k
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            a.z1x.P(r6)
            goto L57
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L35:
            a.z1x.P(r6)
            goto L71
        L39:
            a.z1x.P(r6)
            int r6 = r7.ordinal()
            if (r6 == 0) goto L5e
            if (r6 != r5) goto L5a
            java.lang.Object r6 = r0.invoke()
            a.bog r6 = (a.bog) r6
            java.lang.String r7 = org.xplatform.cyber.section.api.domain.entity.d.b(r8)
            r1.k = r4
            java.lang.Object r6 = r6.f(r7, r9, r1)
            if (r6 != r10) goto L57
            goto L70
        L57:
            a.dx5 r6 = (a.dx5) r6
            goto L73
        L5a:
            a.t9f.b()
            return r3
        L5e:
            java.lang.Object r6 = r0.invoke()
            a.bog r6 = (a.bog) r6
            java.lang.String r7 = org.xplatform.cyber.section.api.domain.entity.d.b(r8)
            r1.k = r5
            java.lang.Object r6 = r6.k(r7, r9, r1)
            if (r6 != r10) goto L71
        L70:
            return r10
        L71:
            a.dx5 r6 = (a.dx5) r6
        L73:
            java.lang.Object r6 = r6.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.roi0.k(a.sip, org.xplatform.cyber.section.api.domain.entity.CyberGamesPage, a.jo20, a.zje):java.lang.Object");
    }

    public void l(y930 y930Var) {
        gbl0 gbl0Var = (gbl0) this.f30839a;
        lme0 lme0Var = gbl0.c2;
        p7m0 p7m0Var = gbl0Var.J0().O;
        while (true) {
            Object value = p7m0Var.getValue();
            y930 y930Var2 = y930Var;
            if (p7m0Var.m(value, yqs.a((yqs) value, null, null, null, null, y930Var2, null, 47))) {
                return;
            } else {
                y930Var = y930Var2;
            }
        }
    }

    public roi0(q7d0 q7d0Var) {
        q7d0Var.getClass();
        this.f30839a = q7d0Var;
    }

    public roi0(rbq0 rbq0Var) {
        rbq0Var.getClass();
        this.f30839a = rbq0Var;
    }

    public roi0(gii0 gii0Var, byte b) {
        gii0Var.getClass();
        switch (b) {
            case 17:
                this.f30839a = new enj0(gii0Var, (byte) 13);
                break;
            case 18:
            default:
                this.f30839a = new enj0(gii0Var, (byte) 4);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                this.f30839a = new enj0(gii0Var, (byte) 25);
                break;
            case 20:
                this.f30839a = new lkr0(gii0Var, (byte) 0);
                break;
        }
    }

    public /* synthetic */ roi0(Object obj) {
        this.f30839a = obj;
    }
}
