package a;

import java.util.List;
import kotlin.Unit;
import org.xplatform.cyber.game.dota.api.presentation.CyberGameDotaScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class cbl extends bnn0 implements xdr {
    public szj0 i;
    public int j;
    public byte k;
    public /* synthetic */ ats l;
    public /* synthetic */ x9l m;
    public final /* synthetic */ ebl n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbl(ebl eblVar, yje yjeVar) {
        super(3, yjeVar);
        this.n = eblVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        cbl cblVar = new cbl(this.n, (yje) obj3);
        cblVar.l = (ats) obj;
        cblVar.m = (x9l) obj2;
        return cblVar.invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0172  */
    /* JADX WARN: Code duplicated, block: B:52:0x0198  */
    /* JADX WARN: Code duplicated, block: B:54:0x019c  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v7, types: [a.szj0, a.x9l] */
    /* JADX WARN: Type inference failed for: r6v8, types: [a.szj0, a.x9l] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        szj0 szj0Var;
        Object objN;
        wne wneVar;
        boolean z;
        ebl eblVar;
        cbl cblVar;
        int i;
        ebl eblVar2;
        wne wneVar2;
        boolean z2;
        int i2;
        List list;
        ?? r6;
        sbu sbuVar;
        jlr jlrVar;
        boolean z3;
        v5s m5sVar;
        ?? r7;
        jlr jlrVar2;
        ebl eblVar3 = this.n;
        ocj ocjVar = eblVar3.i;
        ats atsVar = this.l;
        x9l x9lVar = this.m;
        wne wneVar3 = wne.f39444a;
        byte b = this.k;
        char c = 4;
        char c2 = 3;
        char c3 = 2;
        boolean z4 = false;
        boolean z5 = true;
        Object obj2 = null;
        if (b != 0) {
            if (b == 1) {
                szj0Var = this.i;
                z1x.P(obj);
                objN = obj;
            } else if (b == 2) {
                i2 = this.j;
                z1x.P(obj);
                cblVar = this;
                eblVar2 = eblVar3;
                wneVar2 = wneVar3;
                z = true;
                r6 = 0;
                sbuVar = eblVar2.y;
                jlrVar = atsVar.f1447a;
                if (x9lVar != null && !x9lVar.e) {
                    z4 = z;
                }
                z3 = !z4;
                m5sVar = k5s.f17735a;
                if (jlrVar instanceof xkr) {
                    xkr xkrVar = (xkr) jlrVar;
                    m9s m9sVar = xkrVar.d;
                    m5sVar = new t5s(m9sVar.b(), z3, xkrVar.b, m9sVar.x, m9sVar.A, m9sVar.f, m9sVar.F, m9sVar);
                } else if (jlrVar instanceof dlr) {
                    m5sVar = new o5s(((dlr) jlrVar).b);
                } else if (!(jlrVar instanceof alr) && (jlrVar instanceof clr)) {
                    m5sVar = new m5s(((clr) jlrVar).b, 1L);
                }
                cblVar.l = atsVar;
                cblVar.m = r6;
                cblVar.i = r6;
                cblVar.j = i2;
                cblVar.k = (byte) 3;
                r7 = r6;
                if (sbuVar.a(m5sVar) == wneVar2) {
                    return wneVar2;
                }
                cblVar.l = atsVar;
                cblVar.m = r7;
                cblVar.i = r7;
                cblVar.j = i2;
                cblVar.k = (byte) 4;
                int i3 = ebl.g0;
                if (eblVar2.O(cblVar) == wneVar2) {
                    return wneVar2;
                }
            } else if (b == 3) {
                i2 = this.j;
                z1x.P(obj);
                cblVar = this;
                eblVar2 = eblVar3;
                wneVar2 = wneVar3;
                r7 = 0;
                cblVar.l = atsVar;
                cblVar.m = r7;
                cblVar.i = r7;
                cblVar.j = i2;
                cblVar.k = (byte) 4;
                int i4 = ebl.g0;
                if (eblVar2.O(cblVar) == wneVar2) {
                    return wneVar2;
                }
            } else {
                if (b != 4) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                eblVar2 = eblVar3;
            }
            jlrVar2 = atsVar.f1447a;
            int i5 = ebl.g0;
            if (jlrVar2 instanceof clr) {
                hzg hzgVar = eblVar2.O;
                long j = ((clr) jlrVar2).b;
                CyberGameDotaScreenParams cyberGameDotaScreenParams = eblVar2.r;
                ((uzg) hzgVar).q(cyberGameDotaScreenParams.i, j, cyberGameDotaScreenParams.d);
            }
            return Unit.f46060a;
        }
        z1x.P(obj);
        eblVar3.o.e("game_request_state_key", atsVar.b);
        m9s m9sVarC = d5c.C(atsVar.f1447a);
        szj0Var = m9sVarC != null ? m9sVarC.M : null;
        this.l = atsVar;
        this.m = x9lVar;
        this.i = szj0Var;
        this.k = (byte) 1;
        objN = eblVar3.N(atsVar, this);
        if (objN == wneVar3) {
            return wneVar3;
        }
        szj0 szj0Var2 = szj0Var;
        yws ywsVar = (yws) objN;
        eblVar3.z.g(ywsVar);
        p7m0 p7m0Var = ocjVar.f25029a;
        while (true) {
            Object value = p7m0Var.getValue();
            value.getClass();
            wneVar = wneVar3;
            p7m0 p7m0Var2 = p7m0Var;
            yws ywsVar2 = ywsVar;
            z = z5;
            eblVar = eblVar3;
            if (p7m0Var2.m(value, f9l.a((f9l) value, atsVar.b, atsVar.f1447a, x9lVar, null, null, null, false, null, null, false, null, false, false, ywsVar2, 0, 0, szj0Var2, 48234481))) {
                break;
            }
            p7m0Var = p7m0Var2;
            ywsVar = ywsVar2;
            eblVar3 = eblVar;
            z5 = z;
            wneVar3 = wneVar;
            c = 4;
            c2 = 3;
            c3 = 2;
            obj2 = null;
        }
        int size = (x9lVar == null || (list = x9lVar.f40514a.e) == null) ? 0 : list.size();
        if (((f9l) eblVar.D()).w < size) {
            p7m0 p7m0Var3 = ocjVar.f25029a;
            while (true) {
                Object value2 = p7m0Var3.getValue();
                value2.getClass();
                int i6 = size;
                i = i6;
                if (p7m0Var3.m(value2, f9l.a((f9l) value2, null, null, null, null, null, null, false, null, null, false, null, false, false, null, i6, 0, null, 62914559))) {
                    break;
                }
                size = i;
            }
            m9s m9sVarC2 = d5c.C(((f9l) eblVar.D()).c);
            if (m9sVarC2 == null) {
                m9sVarC2 = uzb.X();
            }
            cblVar = this;
            cblVar.l = atsVar;
            cblVar.m = x9lVar;
            z2 = false;
            cblVar.i = null;
            cblVar.j = i;
            cblVar.k = (byte) 2;
            eblVar2 = eblVar;
            wneVar2 = wneVar;
            if (eblVar2.M(m9sVarC2, cblVar) == wneVar2) {
                return wneVar2;
            }
        } else {
            cblVar = this;
            i = size;
            eblVar2 = eblVar;
            wneVar2 = wneVar;
            z2 = false;
        }
        i2 = i;
        r6 = z2;
        sbuVar = eblVar2.y;
        jlrVar = atsVar.f1447a;
        if (x9lVar != null) {
            z4 = z;
        }
        z3 = !z4;
        m5sVar = k5s.f17735a;
        if (jlrVar instanceof xkr) {
            xkr xkrVar2 = (xkr) jlrVar;
            m9s m9sVar2 = xkrVar2.d;
            m5sVar = new t5s(m9sVar2.b(), z3, xkrVar2.b, m9sVar2.x, m9sVar2.A, m9sVar2.f, m9sVar2.F, m9sVar2);
        } else if (jlrVar instanceof dlr) {
            m5sVar = new o5s(((dlr) jlrVar).b);
        } else if (!(jlrVar instanceof alr)) {
            m5sVar = new m5s(((clr) jlrVar).b, 1L);
        }
        cblVar.l = atsVar;
        cblVar.m = r6;
        cblVar.i = r6;
        cblVar.j = i2;
        cblVar.k = (byte) 3;
        r7 = r6;
        if (sbuVar.a(m5sVar) == wneVar2) {
            return wneVar2;
        }
        cblVar.l = atsVar;
        cblVar.m = r7;
        cblVar.i = r7;
        cblVar.j = i2;
        cblVar.k = (byte) 4;
        int i7 = ebl.g0;
        if (eblVar2.O(cblVar) == wneVar2) {
            return wneVar2;
        }
        jlrVar2 = atsVar.f1447a;
        int i8 = ebl.g0;
        if (jlrVar2 instanceof clr) {
            hzg hzgVar2 = eblVar2.O;
            long j2 = ((clr) jlrVar2).b;
            CyberGameDotaScreenParams cyberGameDotaScreenParams2 = eblVar2.r;
            ((uzg) hzgVar2).q(cyberGameDotaScreenParams2.i, j2, cyberGameDotaScreenParams2.d);
        }
        return Unit.f46060a;
    }
}
