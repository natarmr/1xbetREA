package a;

import androidx.fragment.app.Fragment;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.rules.api.presentation.models.RuleData;
import org.xplatform.rules.impl.navigation.RulesScreenFactoryImpl$getRulesFragmentScreen$1;

/* JADX INFO: loaded from: classes2.dex */
public final class uyn implements eer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f36498a;

    public uyn(gii0 gii0Var, byte b) {
        gii0Var.getClass();
        switch (b) {
            case 3:
                this.f36498a = new wgn(gii0Var, (byte) 11);
                break;
            case 7:
                this.f36498a = new wgn(gii0Var, (byte) 17);
                break;
            case 8:
                this.f36498a = new wgn(gii0Var, (byte) 19);
                break;
            default:
                this.f36498a = new wgn(gii0Var, (byte) 6);
                break;
        }
    }

    public RulesScreenFactoryImpl$getRulesFragmentScreen$1 a(Map map) {
        map.getClass();
        return new RulesScreenFactoryImpl$getRulesFragmentScreen$1(new RuleData("rule_game_cash_back", 8, map, "/static/img/android/games/promos/cashback/cashback.png"), R.string.rules, false, false, false);
    }

    @Override // a.eer
    /* JADX INFO: renamed from: apply */
    public Object mo11apply(Object obj) {
        Fragment fragment = (Fragment) this.f36498a;
        jxq jxqVar = fragment.w;
        return jxqVar != null ? jxqVar.e.i : fragment.n0().i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(jo20 jo20Var, zje zjeVar) {
        w5t w5tVar;
        if (zjeVar instanceof w5t) {
            w5tVar = (w5t) zjeVar;
            int i = w5tVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                w5tVar.k = i - Integer.MIN_VALUE;
            } else {
                w5tVar = new w5t(this, zjeVar);
            }
        } else {
            w5tVar = new w5t(this, zjeVar);
        }
        Object objB = w5tVar.i;
        wne wneVar = wne.f39444a;
        int i2 = w5tVar.k;
        if (i2 == 0) {
            z1x.P(objB);
            u5t u5tVar = (u5t) ((wgn) this.f36498a).invoke();
            w5tVar.k = 1;
            objB = u5tVar.b(jo20Var, w5tVar);
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
        return ((dx5) objB).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(jo20 jo20Var, zje zjeVar) {
        x5t x5tVar;
        if (zjeVar instanceof x5t) {
            x5tVar = (x5t) zjeVar;
            int i = x5tVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                x5tVar.k = i - Integer.MIN_VALUE;
            } else {
                x5tVar = new x5t(this, zjeVar);
            }
        } else {
            x5tVar = new x5t(this, zjeVar);
        }
        Object objA = x5tVar.i;
        wne wneVar = wne.f39444a;
        int i2 = x5tVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            u5t u5tVar = (u5t) ((wgn) this.f36498a).invoke();
            x5tVar.k = 1;
            objA = u5tVar.a(jo20Var, new fk9(false), x5tVar);
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
        return ((dx5) objA).a();
    }

    public RulesScreenFactoryImpl$getRulesFragmentScreen$1 d() {
        return new RulesScreenFactoryImpl$getRulesFragmentScreen$1(new RuleData("game_jackpot", 14, (Map) null, (String) null), R.string.rules, false, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object e(long j, String str, int i, int i2, zje zjeVar) {
        hqs hqsVar;
        if (zjeVar instanceof hqs) {
            hqsVar = (hqs) zjeVar;
            int i3 = hqsVar.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hqsVar.k = i3 - Integer.MIN_VALUE;
            } else {
                hqsVar = new hqs(this, zjeVar);
            }
        } else {
            hqsVar = new hqs(this, zjeVar);
        }
        hqs hqsVar2 = hqsVar;
        Object objB = hqsVar2.i;
        wne wneVar = wne.f39444a;
        int i4 = hqsVar2.k;
        if (i4 == 0) {
            z1x.P(objB);
            gqs gqsVar = (gqs) ((wgn) this.f36498a).invoke();
            hqsVar2.k = 1;
            objB = gqsVar.b(j, str, i, i2, hqsVar2);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        return ((dx5) objB).a();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object f(long j, String str, int i, int i2, int i3, int i4, int i5, zje zjeVar) {
        iqs iqsVar;
        if (zjeVar instanceof iqs) {
            iqsVar = (iqs) zjeVar;
            int i6 = iqsVar.k;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                iqsVar.k = i6 - Integer.MIN_VALUE;
            } else {
                iqsVar = new iqs(this, zjeVar);
            }
        } else {
            iqsVar = new iqs(this, zjeVar);
        }
        iqs iqsVar2 = iqsVar;
        Object objA = iqsVar2.i;
        wne wneVar = wne.f39444a;
        int i7 = iqsVar2.k;
        if (i7 == 0) {
            z1x.P(objA);
            gqs gqsVar = (gqs) ((wgn) this.f36498a).invoke();
            iqsVar2.k = 1;
            objA = gqsVar.a(i2, i4, j, i3, str, i, i5, iqsVar2);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i7 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return ((dx5) objA).a();
    }

    public lu0 g(String str) {
        str.getClass();
        ku0 ku0Var = (ku0) ((r7v) this.f36498a).f29996a;
        ku0Var.getClass();
        return (lu0) ku0Var.f18890a.remove(str);
    }

    public l0f h() {
        return new l0f(vtb.N(((h0f) ((lrc) this.f36498a).b).f12232a), (byte) 0);
    }

    public vgl i() {
        return ((igl) this.f36498a).b.f6048a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:68|24|(1:27)|58) */
    /* JADX WARN: Code duplicated, block: B:27:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:34:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0102  */
    /* JADX WARN: Code duplicated, block: B:36:0x010f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0116  */
    /* JADX WARN: Code duplicated, block: B:39:0x0118  */
    /* JADX WARN: Code duplicated, block: B:42:0x011d  */
    /* JADX WARN: Code duplicated, block: B:46:0x013d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0145  */
    /* JADX WARN: Code duplicated, block: B:48:0x014d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0154  */
    /* JADX WARN: Code duplicated, block: B:52:0x015b  */
    /* JADX WARN: Code duplicated, block: B:53:0x015d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0162  */
    /* JADX WARN: Code duplicated, block: B:59:0x017e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0186  */
    /* JADX WARN: Code duplicated, block: B:63:0x0195  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f4, code lost:
    
        r16 = r12;
        r12 = r5;
        r5 = r14;
        r13 = r16;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0102 -> B:23:0x00bf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x017e -> B:62:0x0192). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0186 -> B:62:0x0192). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0195 -> B:45:0x013b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(int r20, a.zje r21, java.lang.String r22, boolean r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.uyn.j(int, a.zje, java.lang.String, boolean):java.lang.Object");
    }

    public List k(HistoryTypeModel historyTypeModel) {
        historyTypeModel.getClass();
        if (historyTypeModel != HistoryTypeModel.EVENTS) {
            return iun.f15405a;
        }
        List list = ((t37) ((ok50) this.f36498a).f25390a).f33251a;
        return list.isEmpty() ? t37.a() : list;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object l(String str, String str2, String str3, String str4, int i, v1p v1pVar, zje zjeVar) {
        w1p w1pVar;
        if (zjeVar instanceof w1p) {
            w1pVar = (w1p) zjeVar;
            int i2 = w1pVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w1pVar.k = i2 - Integer.MIN_VALUE;
            } else {
                w1pVar = new w1p(this, zjeVar);
            }
        } else {
            w1pVar = new w1p(this, zjeVar);
        }
        w1p w1pVar2 = w1pVar;
        Object obj = w1pVar2.i;
        wne wneVar = wne.f39444a;
        int i3 = w1pVar2.k;
        if (i3 == 0) {
            z1x.P(obj);
            z1p z1pVar = (z1p) ((wgn) this.f36498a).invoke();
            w1pVar2.k = 1;
            if (z1pVar.a(str, str2, str3, str4, i, v1pVar, w1pVar2) == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    public uyn(rwc rwcVar) {
        rwcVar.getClass();
        this.f36498a = rwcVar;
    }

    public uyn(ul9 ul9Var) {
        ul9Var.getClass();
        this.f36498a = ul9Var;
    }

    public uyn(igl iglVar) {
        iglVar.getClass();
        this.f36498a = iglVar;
    }

    public uyn(ino inoVar) {
        inoVar.getClass();
        this.f36498a = inoVar;
    }

    public uyn(my60 my60Var) {
        my60Var.getClass();
        this.f36498a = my60Var;
    }

    public /* synthetic */ uyn(Object obj) {
        this.f36498a = obj;
    }

    public uyn(btr btrVar) {
        btrVar.getClass();
        this.f36498a = btrVar;
    }

    public uyn() {
        this.f36498a = new icr(5, 1.0f, false, (byte) 0);
    }
}
