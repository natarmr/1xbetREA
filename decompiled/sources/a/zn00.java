package a;

import android.util.ArrayMap;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import com.github.terrakok.cicerone.androidx.FragmentScreen$Companion$invoke$1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.security.api.presentation.models.ConfirmRestoreByAuthenticatorType;
import org.xplatform.security.api.presentation.models.TokenRestoreData;

/* JADX INFO: loaded from: classes2.dex */
public class zn00 implements e1x, eoc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f44650a;
    public Object b;

    public zn00(gii0 gii0Var, byte b) {
        switch (b) {
            case 3:
                gii0Var.getClass();
                this.f44650a = gii0Var;
                this.b = new rx00(this, (byte) 22);
                break;
            case 4:
                this.f44650a = gii0Var;
                this.b = new np30(this, (byte) 4);
                break;
            case 14:
                gii0Var.getClass();
                this.f44650a = gii0Var;
                this.b = new l3a0(this, (byte) 7);
                break;
            case 20:
                gii0Var.getClass();
                this.f44650a = gii0Var;
                this.b = new p7d0(this, (byte) 21);
                break;
            case 24:
                gii0Var.getClass();
                this.f44650a = gii0Var;
                this.b = new tie0(this, (byte) 23);
                break;
            default:
                gii0Var.getClass();
                this.f44650a = gii0Var;
                this.b = new rcz(this, (byte) 28);
                break;
        }
    }

    @Override // a.yzs0
    public faa A(dcg0 dcg0Var) {
        return rcb.W(this, R0(dcg0Var));
    }

    @Override // a.yzs0
    public /* bridge */ xnm0 A0(dcg0 dcg0Var) {
        return rcb.k1(this, dcg0Var);
    }

    @Override // a.yzs0
    public /* bridge */ boolean B(jys0 jys0Var) {
        return rcb.O0(jys0Var);
    }

    @Override // a.yzs0
    public /* bridge */ f0t0 B0(jzs0 jzs0Var) {
        return rcb.B0(jzs0Var);
    }

    @Override // a.yzs0
    public /* bridge */ jzs0 C(jys0 jys0Var) {
        return rcb.y0(jys0Var);
    }

    @Override // a.yzs0
    public /* bridge */ aty C0(zxs0 zxs0Var) {
        return rcb.x0(this, zxs0Var);
    }

    @Override // a.yzs0
    public /* bridge */ boolean D(jys0 jys0Var) {
        return rcb.H0(jys0Var);
    }

    @Override // a.eoc
    public /* bridge */ tft0 D0(mzj0 mzj0Var, mzj0 mzj0Var2) {
        return rcb.j0(this, mzj0Var, mzj0Var2);
    }

    @Override // a.yzs0
    public /* bridge */ zxs0 E(aty atyVar, int i) {
        return rcb.n0(atyVar, i);
    }

    public FragmentScreen$Companion$invoke$1 E0(TokenRestoreData tokenRestoreData, long[] jArr, we50 we50Var) {
        we50Var.getClass();
        return new FragmentScreen$Companion$invoke$1(null, new hi(tokenRestoreData, jArr, we50Var, (byte) 10), true);
    }

    @Override // a.yzs0
    public /* bridge */ aty F(aty atyVar) {
        return rcb.q1(this, atyVar);
    }

    @Override // a.yzs0
    public boolean F0(aty atyVar) {
        atyVar.getClass();
        return !Intrinsics.d(rcb.o1(m0(atyVar)), rcb.o1(W(atyVar)));
    }

    @Override // a.e1x
    public int G() {
        return ((cgx0) this.f44650a).G();
    }

    public FragmentScreen$Companion$invoke$1 G0(we50 we50Var) {
        we50Var.getClass();
        return new FragmentScreen$Companion$invoke$1(null, new ex60(we50Var, (byte) 8), true);
    }

    @Override // a.yzs0
    public /* bridge */ boolean H(aty atyVar) {
        return rcb.J0(atyVar);
    }

    public e6d0 H0() {
        String strC = ((vwb0) this.b).c("PREF_PROXY_SETTINGS", "");
        if (strC.length() == 0) {
            e6d0.Companion.getClass();
            return new e6d0(false, t6d0.b, "", 0, "", "");
        }
        try {
            return (e6d0) ((vby) this.f44650a).b(e6d0.Companion.serializer(), strC);
        } catch (Exception unused) {
            e6d0.Companion.getClass();
            return new e6d0(false, t6d0.b, "", 0, "", "");
        }
    }

    @Override // a.yzs0
    public /* bridge */ boolean I(jys0 jys0Var) {
        return rcb.G0(jys0Var);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:171|24|175|25|26|27|169|28|(1:31)|160) */
    /* JADX WARN: Code duplicated, block: B:103:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:110:0x0205  */
    /* JADX WARN: Code duplicated, block: B:114:0x020f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0227  */
    /* JADX WARN: Code duplicated, block: B:118:0x022b  */
    /* JADX WARN: Code duplicated, block: B:134:0x025c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:135:0x025e  */
    /* JADX WARN: Code duplicated, block: B:137:0x026a  */
    /* JADX WARN: Code duplicated, block: B:139:0x026f  */
    /* JADX WARN: Code duplicated, block: B:140:0x0271  */
    /* JADX WARN: Code duplicated, block: B:143:0x0276  */
    /* JADX WARN: Code duplicated, block: B:146:0x028e  */
    /* JADX WARN: Code duplicated, block: B:147:0x0290  */
    /* JADX WARN: Code duplicated, block: B:150:0x0299  */
    /* JADX WARN: Code duplicated, block: B:152:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:154:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:155:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:158:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:161:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:163:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:164:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:165:0x02da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:166:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:168:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:171:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x0232 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x022d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x00de  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:38:0x0105  */
    /* JADX WARN: Code duplicated, block: B:40:0x010f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0113  */
    /* JADX WARN: Code duplicated, block: B:45:0x0128  */
    /* JADX WARN: Code duplicated, block: B:47:0x0134  */
    /* JADX WARN: Code duplicated, block: B:50:0x013e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0153  */
    /* JADX WARN: Code duplicated, block: B:57:0x0157  */
    /* JADX WARN: Code duplicated, block: B:58:0x015a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0160  */
    /* JADX WARN: Code duplicated, block: B:62:0x0163  */
    /* JADX WARN: Code duplicated, block: B:64:0x0167  */
    /* JADX WARN: Code duplicated, block: B:67:0x016e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0174  */
    /* JADX WARN: Code duplicated, block: B:73:0x017b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0185  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:82:0x019b  */
    /* JADX WARN: Code duplicated, block: B:83:0x019e  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:93:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d1  */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0240, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0242, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0243, code lost:
    
        r20 = r3;
        r23 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0247, code lost:
    
        r3 = r20;
        r5 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x024c, code lost:
    
        r13 = r8;
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x024f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [a.haa0] */
    /* JADX WARN: Type inference failed for: r1v11, types: [a.jo20] */
    /* JADX WARN: Type inference failed for: r5v10, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:135:0x025e -> B:136:0x0266). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:149:0x0297 -> B:136:0x0266). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:161:0x02c4 -> B:162:0x02c6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object I0(java.lang.String r30, a.zje r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zn00.I0(java.lang.String, a.zje):java.lang.Object");
    }

    @Override // a.yzs0
    public /* bridge */ boolean J(dcg0 dcg0Var, dcg0 dcg0Var2) {
        return rcb.E0(dcg0Var, dcg0Var2);
    }

    public FragmentScreen$Companion$invoke$1 J0(TokenRestoreData tokenRestoreData, long j, we50 we50Var) {
        we50Var.getClass();
        return new FragmentScreen$Companion$invoke$1(null, new ord(tokenRestoreData, we50Var, j), true);
    }

    @Override // a.yzs0
    public /* bridge */ Collection K(dcg0 dcg0Var) {
        return rcb.e1(this, dcg0Var);
    }

    public Object K0(gb10 gb10Var) {
        return (ayj0) this.b;
    }

    @Override // a.yzs0
    public /* bridge */ int L(aty atyVar) {
        return rcb.U(atyVar);
    }

    public Object L0(float f, float f2, Object obj, Object obj2, float f3, float f4, float f5) {
        gb10 gb10Var = (gb10) this.f44650a;
        gb10Var.f10994a = f;
        gb10Var.b = f2;
        gb10Var.f = obj;
        gb10Var.g = obj2;
        gb10Var.c = f3;
        gb10Var.d = f4;
        gb10Var.e = f5;
        return K0(gb10Var);
    }

    @Override // a.yzs0
    public /* bridge */ boolean M(aty atyVar) {
        return rcb.P0(atyVar);
    }

    public p6d M0(boolean z) {
        byte b = 7;
        int i = 3;
        yje yjeVar = null;
        byte b2 = 8;
        byte b3 = 1;
        return new p6d(new dnq(new lsa(((rrd) this.b).v(true, false, false, z, null), b), new x5v(i, yjeVar, b2), b3), new dnq(new lsa(((wdu) this.f44650a).s(true, false, z, null), b2), new x5v(i, yjeVar, b), b3), new xc60(i, yjeVar, (byte) 0), b3);
    }

    @Override // a.yzs0
    public /* bridge */ jys0 N(dcg0 dcg0Var) {
        return rcb.o1(dcg0Var);
    }

    public Object N0(int i, long j, bnn0 bnn0Var, String str) {
        Object objD0;
        cyu cyuVar = (cyu) this.f44650a;
        lu0 lu0VarG = ((uyn) this.b).g(str);
        if (!((m1e) cyuVar.f5196a).c() || (objD0 = qjj.d0(((mne) cyuVar.c).b, new h1v(cyuVar, j, i, lu0VarG, (yje) null), bnn0Var)) != wne.f39444a) {
            objD0 = Unit.f46060a;
        }
        return objD0 == wne.f39444a ? objD0 : Unit.f46060a;
    }

    @Override // a.yzs0
    public /* bridge */ dcg0 O(dcg0 dcg0Var) {
        u9a u9aVar = u9a.f35274a;
        return rcb.g0(dcg0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object O0(int i, zje zjeVar, String str, String str2) {
        syg0 syg0Var;
        Object objU;
        y3v y3vVar = (y3v) this.f44650a;
        zto0 zto0Var = (zto0) y3vVar.b;
        if (zjeVar instanceof syg0) {
            syg0Var = (syg0) zjeVar;
            int i2 = syg0Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                syg0Var.n = i2 - Integer.MIN_VALUE;
            } else {
                syg0Var = new syg0(this, zjeVar);
            }
        } else {
            syg0Var = new syg0(this, zjeVar);
        }
        Object obj = syg0Var.l;
        wne wneVar = wne.f39444a;
        int i3 = syg0Var.n;
        if (i3 == 0) {
            z1x.P(obj);
            if (!((gst0) this.b).a()) {
                return Unit.f46060a;
            }
            hae0 hae0Var = hae0.ACTION_OPEN_APP;
            syg0Var.i = str;
            syg0Var.j = str2;
            syg0Var.k = i;
            syg0Var.n = 1;
            if (str2.length() > 0) {
                objU = y3vVar.t(str2, i, hae0Var, syg0Var);
                if (objU != wneVar) {
                    objU = Unit.f46060a;
                }
            } else {
                objU = y3vVar.u(str, hae0Var, syg0Var);
                if (objU != wneVar) {
                    objU = Unit.f46060a;
                }
            }
            if (objU == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = syg0Var.k;
            str2 = syg0Var.j;
            str = syg0Var.i;
            z1x.P(obj);
        }
        zto0Var.f44971a = "";
        zto0Var.e = "";
        zto0Var.b = false;
        zto0Var.c = false;
        zto0Var.d = false;
        str.getClass();
        str2.getClass();
        zto0Var.getClass();
        zto0Var.f44971a = str;
        zto0Var.e = str2;
        zto0Var.f = i;
        zto0Var.b = true;
        return Unit.f46060a;
    }

    @Override // a.yzs0
    public boolean P(aty atyVar) {
        atyVar.getClass();
        kzj0 kzj0VarZ = rcb.Z(atyVar);
        return (kzj0VarZ != null ? rcb.X(kzj0VarZ) : null) != null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object P0(zje zjeVar, ynb0 ynb0Var, String str) {
        gte0 gte0Var;
        ts4 ts4Var;
        if (zjeVar instanceof gte0) {
            gte0Var = (gte0) zjeVar;
            int i = gte0Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                gte0Var.n = i - Integer.MIN_VALUE;
            } else {
                gte0Var = new gte0(this, zjeVar);
            }
        } else {
            gte0Var = new gte0(this, zjeVar);
        }
        Object obj = gte0Var.l;
        wne wneVar = wne.f39444a;
        int i2 = gte0Var.n;
        if (i2 == 0) {
            z1x.P(obj);
            ts4 ts4Var2 = (ts4) this.f44650a;
            b3c0 b3c0Var = (b3c0) this.b;
            gte0Var.i = ts4Var2;
            gte0Var.j = ynb0Var;
            gte0Var.k = str;
            gte0Var.n = 1;
            Object objA = b3c0Var.a(false, gte0Var);
            if (objA != wneVar) {
                obj = objA;
                ts4Var = ts4Var2;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = gte0Var.k;
        ynb0Var = gte0Var.j;
        ts4Var = gte0Var.i;
        z1x.P(obj);
        String strValueOf = String.valueOf(((m2c0) obj).S);
        gte0Var.i = null;
        gte0Var.j = null;
        gte0Var.k = null;
        gte0Var.n = 2;
        Object objJ = ts4Var.j(ynb0Var, str, strValueOf, gte0Var);
        return objJ == wneVar ? wneVar : objJ;
    }

    @Override // a.yzs0
    public boolean Q(jys0 jys0Var, jys0 jys0Var2) {
        jys0Var.getClass();
        jys0Var2.getClass();
        if (!(jys0Var instanceof iys0)) {
            jf4.o("Failed requirement.");
            return false;
        }
        if (!(jys0Var2 instanceof iys0)) {
            jf4.o("Failed requirement.");
            return false;
        }
        if (rcb.T(jys0Var, jys0Var2)) {
            return true;
        }
        iys0 iys0Var = (iys0) jys0Var;
        iys0 iys0Var2 = (iys0) jys0Var2;
        Map map = (Map) this.f44650a;
        if (((xsy) this.b).a(iys0Var, iys0Var2)) {
            return true;
        }
        if (map != null) {
            iys0 iys0Var3 = (iys0) map.get(iys0Var);
            iys0 iys0Var4 = (iys0) map.get(iys0Var2);
            if (iys0Var3 != null && iys0Var3.equals(iys0Var2)) {
                return true;
            }
            if (iys0Var4 != null && iys0Var4.equals(iys0Var)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object Q0(String str, zje zjeVar) {
        qif0 qif0Var;
        if (zjeVar instanceof qif0) {
            qif0Var = (qif0) zjeVar;
            int i = qif0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                qif0Var.k = i - Integer.MIN_VALUE;
            } else {
                qif0Var = new qif0(this, zjeVar);
            }
        } else {
            qif0Var = new qif0(this, zjeVar);
        }
        Object obj = qif0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = qif0Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            nvu nvuVar = (nvu) this.f44650a;
            qif0Var.k = 1;
            if (nvuVar.O(str, qif0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        x2c0 x2c0Var = ((b3c0) this.b).b;
        m2c0 m2c0VarA = x2c0Var.a();
        if (m2c0VarA != null) {
            x2c0Var.f40159a.o(null, m2c0.a(m2c0VarA, null, 0, false, -1048577, 255));
        }
        return Unit.f46060a;
    }

    @Override // a.yzs0
    public boolean R(dcg0 dcg0Var) {
        return rcb.L0(rcb.o1(dcg0Var));
    }

    public mzj0 R0(dcg0 dcg0Var) {
        kzj0 kzj0Var;
        szj szjVarX = rcb.X(dcg0Var);
        return (szjVarX == null || (kzj0Var = szjVarX.b) == null) ? (mzj0) dcg0Var : kzj0Var;
    }

    @Override // a.yzs0
    public /* bridge */ nkq S(aty atyVar) {
        return rcb.Y(atyVar);
    }

    @Override // a.yzs0
    public zxs0 T(yxs0 yxs0Var, int i) {
        yxs0Var.getClass();
        if (yxs0Var instanceof mzj0) {
            return rcb.n0((aty) yxs0Var, i);
        }
        if (yxs0Var instanceof kw3) {
            E e = ((kw3) yxs0Var).get(i);
            e.getClass();
            return (zxs0) e;
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(yxs0Var);
        e9d0.n(sb, sre0.f32672a.b(yxs0Var.getClass()));
        return null;
    }

    @Override // a.yzs0
    public boolean U(aty atyVar) {
        atyVar.getClass();
        return rcb.N0(m0(atyVar)) != rcb.N0(W(atyVar));
    }

    @Override // a.yzs0
    public /* bridge */ zxs0 V(eaa eaaVar) {
        return rcb.f1(eaaVar);
    }

    @Override // a.yzs0
    public dcg0 W(aty atyVar) {
        kzj0 kzj0VarP1;
        atyVar.getClass();
        kkq kkqVarY = rcb.Y(atyVar);
        if (kkqVarY != null && (kzj0VarP1 = rcb.p1(kkqVarY)) != null) {
            return kzj0VarP1;
        }
        kzj0 kzj0VarZ = rcb.Z(atyVar);
        kzj0VarZ.getClass();
        return kzj0VarZ;
    }

    @Override // a.yzs0
    public /* bridge */ faa X(mzj0 mzj0Var) {
        return rcb.W(this, mzj0Var);
    }

    @Override // a.yzs0
    public /* bridge */ boolean Y(jys0 jys0Var) {
        return rcb.M0(jys0Var);
    }

    @Override // a.yzs0
    public void Z(aty atyVar) {
        atyVar.getClass();
        rcb.Y(atyVar);
    }

    @Override // a.yzs0
    public /* bridge */ dcg0 a(aty atyVar) {
        return rcb.Z(atyVar);
    }

    @Override // a.yzs0
    public zxs0 a0(dcg0 dcg0Var, int i) {
        if (i < 0 || i >= rcb.U(dcg0Var)) {
            return null;
        }
        return rcb.n0(dcg0Var, i);
    }

    @Override // a.e1x
    public b1x b() {
        return f0(((cgx0) this.f44650a).b());
    }

    @Override // a.e1x
    public b1x b0() {
        return f0(((cgx0) this.f44650a).b0());
    }

    @Override // a.eoc
    public ary c() {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override // a.eoc
    public /* bridge */ kzj0 c0(dcg0 dcg0Var) {
        return rcb.r1(dcg0Var, true);
    }

    @Override // a.e1x
    public void close() {
        ((cgx0) this.f44650a).close();
    }

    @Override // a.yzs0
    public /* bridge */ dcg0 d(nkq nkqVar) {
        return rcb.W0(nkqVar);
    }

    @Override // a.yzs0
    public /* bridge */ aty d0(faa faaVar) {
        return rcb.X0(faaVar);
    }

    @Override // a.yzs0
    public /* bridge */ dcg0 e(nkq nkqVar) {
        return rcb.p1(nkqVar);
    }

    @Override // a.yzs0
    public /* bridge */ dcg0 e0(dcg0 dcg0Var, boolean z) {
        return rcb.r1(dcg0Var, false);
    }

    @Override // a.e1x
    public int f() {
        return ((cgx0) this.f44650a).f();
    }

    public gui0 f0(b1x b1xVar) {
        eoo0 eoo0Var;
        if (b1xVar == null) {
            return null;
        }
        if (((dzb0) this.b) == null) {
            eoo0Var = eoo0.b;
        } else {
            dzb0 dzb0Var = (dzb0) this.b;
            Pair pair = new Pair(dzb0Var.h, dzb0Var.i.get(0));
            eoo0 eoo0Var2 = eoo0.b;
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put((String) pair.first, pair.second);
            eoo0Var = new eoo0(arrayMap);
        }
        this.b = null;
        return new gui0(b1xVar, new Size(b1xVar.j(), b1xVar.f()), new dy9(new r34(null, eoo0Var, b1xVar.K0().h())));
    }

    @Override // a.yzs0
    public int g(yxs0 yxs0Var) {
        yxs0Var.getClass();
        if (yxs0Var instanceof dcg0) {
            return rcb.U((aty) yxs0Var);
        }
        if (yxs0Var instanceof kw3) {
            return ((kw3) yxs0Var).size();
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(yxs0Var);
        e9d0.n(sb, sre0.f32672a.b(yxs0Var.getClass()));
        return 0;
    }

    @Override // a.yzs0
    public /* bridge */ List g0(jzs0 jzs0Var) {
        return rcb.z0(jzs0Var);
    }

    @Override // a.e1x
    public Surface getSurface() {
        return ((cgx0) this.f44650a).getSurface();
    }

    @Override // a.e1x
    public int h() {
        return ((cgx0) this.f44650a).h();
    }

    public diu0 h0(Class cls) {
        miu0 dzjVar = (miu0) this.f44650a;
        if (dzjVar == null) {
            dzjVar = new dzj((byte) 4);
        }
        piu0 piu0Var = (piu0) this.b;
        vbf vbfVar = vbf.b;
        piu0Var.getClass();
        vbfVar.getClass();
        h0q0 h0q0Var = new h0q0(piu0Var, dzjVar, vbfVar);
        sgy sgyVarB = sre0.f32672a.b(cls);
        String strT = ny9.T(sgyVarB);
        if (strT != null) {
            return h0q0Var.t(sgyVarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strT));
        }
        jf4.o("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // a.yzs0
    public boolean i(dcg0 dcg0Var) {
        kzj0 kzj0VarZ = rcb.Z(dcg0Var);
        return (kzj0VarZ != null ? rcb.W(this, R0(kzj0VarZ)) : null) != null;
    }

    @Override // a.yzs0
    public Function2 i0() {
        return null;
    }

    @Override // a.e1x
    public int j() {
        return ((cgx0) this.f44650a).j();
    }

    @Override // a.yzs0
    public /* bridge */ u9a j0(faa faaVar) {
        return rcb.h0(faaVar);
    }

    @Override // a.e1x
    public void k() {
        ((cgx0) this.f44650a).k();
    }

    @Override // a.yzs0
    public /* bridge */ f0t0 k0(zxs0 zxs0Var) {
        return rcb.A0(zxs0Var);
    }

    @Override // a.yzs0
    public boolean l(dcg0 dcg0Var) {
        dcg0Var.getClass();
        return rcb.O0(n0(dcg0Var)) && !rcb.P0(dcg0Var);
    }

    @Override // a.yzs0
    public /* bridge */ boolean l0(aty atyVar) {
        return rcb.N0(atyVar);
    }

    @Override // a.yzs0
    public /* bridge */ boolean m(aty atyVar) {
        return rcb.S0(atyVar);
    }

    @Override // a.yzs0
    public dcg0 m0(aty atyVar) {
        kzj0 kzj0VarW0;
        atyVar.getClass();
        kkq kkqVarY = rcb.Y(atyVar);
        if (kkqVarY != null && (kzj0VarW0 = rcb.W0(kkqVarY)) != null) {
            return kzj0VarW0;
        }
        kzj0 kzj0VarZ = rcb.Z(atyVar);
        kzj0VarZ.getClass();
        return kzj0VarZ;
    }

    @Override // a.yzs0
    public /* bridge */ zxs0 n(aty atyVar) {
        return rcb.a0(atyVar);
    }

    @Override // a.yzs0
    public jys0 n0(aty atyVar) {
        atyVar.getClass();
        dcg0 dcg0VarZ = rcb.Z(atyVar);
        if (dcg0VarZ == null) {
            dcg0VarZ = m0(atyVar);
        }
        return rcb.o1(dcg0VarZ);
    }

    @Override // a.e1x
    public void o(d1x d1xVar, Executor executor) {
        ((cgx0) this.f44650a).o(new uq((Object) this, (Object) d1xVar, (byte) 21), executor);
    }

    @Override // a.yzs0
    public /* bridge */ boolean o0(jys0 jys0Var) {
        return rcb.I0(jys0Var);
    }

    @Override // a.yzs0
    public aty p(aty atyVar) {
        return rcb.Y0(atyVar);
    }

    @Override // a.yzs0
    public /* bridge */ boolean p0(jys0 jys0Var) {
        return rcb.L0(jys0Var);
    }

    @Override // a.yzs0
    public /* bridge */ yxs0 q(dcg0 dcg0Var) {
        return rcb.V(dcg0Var);
    }

    @Override // a.yzs0
    public /* bridge */ boolean q0(zxs0 zxs0Var) {
        return rcb.T0(zxs0Var);
    }

    @Override // a.eoc
    public /* bridge */ kzj0 r(wsy wsyVar) {
        return rcb.Z(wsyVar);
    }

    @Override // a.yzs0
    public /* bridge */ jzs0 r0(jys0 jys0Var, int i) {
        return rcb.t0(jys0Var, i);
    }

    @Override // a.yzs0
    public /* bridge */ Collection s(jys0 jys0Var) {
        return rcb.l1(jys0Var);
    }

    @Override // a.yzs0
    public boolean s0(dcg0 dcg0Var) {
        dcg0Var.getClass();
        return rcb.G0(rcb.o1(dcg0Var));
    }

    @Override // a.yzs0
    public boolean t(aty atyVar) {
        atyVar.getClass();
        return atyVar instanceof t660;
    }

    @Override // a.yzs0
    public /* bridge */ void t0(dcg0 dcg0Var) {
        rcb.V0(dcg0Var);
    }

    @Override // a.yzs0
    public /* bridge */ eaa u(faa faaVar) {
        return rcb.n1(faaVar);
    }

    @Override // a.yzs0
    public /* bridge */ boolean u0(faa faaVar) {
        return rcb.R0(faaVar);
    }

    @Override // a.yzs0
    public boolean v(dcg0 dcg0Var) {
        dcg0Var.getClass();
        return rcb.X(dcg0Var) != null;
    }

    @Override // a.yzs0
    public /* bridge */ void v0(dcg0 dcg0Var) {
        rcb.U0(dcg0Var);
    }

    @Override // a.yzs0
    public /* bridge */ boolean w(jzs0 jzs0Var, jys0 jys0Var) {
        return rcb.D0(jzs0Var, jys0Var);
    }

    @Override // a.yzs0
    public void w0(dcg0 dcg0Var, jys0 jys0Var) {
        dcg0Var.getClass();
    }

    @Override // a.yzs0
    public /* bridge */ int x(jys0 jys0Var) {
        return rcb.c1(jys0Var);
    }

    public FragmentScreen$Companion$invoke$1 x0(TokenRestoreData tokenRestoreData, we50 we50Var) {
        we50Var.getClass();
        return new FragmentScreen$Companion$invoke$1(null, new uq((Object) tokenRestoreData, (Object) we50Var, (byte) 23), true);
    }

    @Override // a.yzs0
    public boolean y(faa faaVar) {
        return faaVar instanceof z9a;
    }

    @Override // a.yzs0
    public /* bridge */ boolean y0(jys0 jys0Var) {
        return rcb.F0(jys0Var);
    }

    @Override // a.yzs0
    public aty z(ArrayList arrayList) {
        kzj0 kzj0Var;
        int size = arrayList.size();
        if (size == 0) {
            jf4.n("Expected some types");
            return null;
        }
        if (size == 1) {
            return (tft0) CollectionsKt.u0(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            tft0 tft0Var = (tft0) it.next();
            z = z || bdx.k0(tft0Var);
            if (tft0Var instanceof kzj0) {
                kzj0Var = (kzj0) tft0Var;
            } else {
                if (!(tft0Var instanceof kkq)) {
                    t9f.b();
                    return null;
                }
                kzj0Var = ((kkq) tft0Var).b;
                z2 = true;
            }
            arrayList2.add(kzj0Var);
        }
        if (z) {
            return f2o.c(c2o.x, arrayList.toString());
        }
        yys0 yys0Var = yys0.f43482a;
        if (!z2) {
            return yys0Var.b(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(thb.Z((tft0) it2.next()));
        }
        return ucx.W(yys0Var.b(arrayList2), yys0Var.b(arrayList3));
    }

    public FragmentScreen$Companion$invoke$1 z0(ConfirmRestoreByAuthenticatorType confirmRestoreByAuthenticatorType) {
        return new FragmentScreen$Companion$invoke$1(null, new ex60(confirmRestoreByAuthenticatorType, (byte) 9), true);
    }

    @Override // a.eoc, a.yzs0
    public /* bridge */ kzj0 d(nkq nkqVar) {
        return rcb.W0(nkqVar);
    }

    @Override // a.eoc, a.yzs0
    public /* bridge */ kzj0 e(nkq nkqVar) {
        return rcb.p1(nkqVar);
    }

    public /* synthetic */ zn00(Object obj, Object obj2) {
        this.f44650a = obj;
        this.b = obj2;
    }

    public zn00(mlz mlzVar, miu0 miu0Var) {
        this.f44650a = miu0Var;
        this.b = new piu0();
        ((glz) mlzVar.f22014a.f5196a).a(new ige0(this, (byte) 6));
    }

    public zn00(HashMap map, xsy xsyVar) {
        xsyVar.getClass();
        this.f44650a = map;
        this.b = xsyVar;
    }

    public zn00(byte b) {
        switch (b) {
            case 9:
                this.f44650a = new AtomicInteger();
                this.b = new AtomicInteger();
                break;
            default:
                this.f44650a = new gb10();
                this.b = null;
                break;
        }
    }
}
