package a;

import android.content.Context;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.cyberstatistic.impl.presentation.dota.futuregame.item.DotaStatisticFutureGameView;
import org.xplatform.cyber.section.api.discipline.presentation.model.DisciplineDetailsParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.right.DsCellRightBanner;
import org.xplatform.uikit.components.counter.DsCounter;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lrk implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20536a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lrk(Object obj, Object obj2, byte b) {
        this.f20536a = b;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:127:0x0321  */
    /* JADX WARN: Code duplicated, block: B:136:0x0343  */
    /* JADX WARN: Code duplicated, block: B:151:0x0371  */
    /* JADX WARN: Code duplicated, block: B:177:0x0444  */
    /* JADX WARN: Code duplicated, block: B:186:0x0471  */
    /* JADX WARN: Code duplicated, block: B:201:0x049d  */
    /* JADX WARN: Code duplicated, block: B:215:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [a.fee] */
    /* JADX WARN: Type inference failed for: r6v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        drk drkVar;
        irk irkVar;
        Object obj;
        List list;
        j0g0 j0g0Var;
        btk btkVar;
        btk btkVar2;
        zrk zrkVar;
        List list2;
        List list3;
        j0g0 j0g0Var2;
        j0g0 j0g0Var3;
        j0g0 j0g0Var4;
        byte b = this.f20536a;
        byte b2 = 4;
        boolean z = true;
        z = true;
        z = true;
        boolean z2 = true;
        z = true;
        byte b3 = 0;
        ?? r6 = 0;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                mrk mrkVar = (mrk) obj3;
                n0o0 n0o0Var = mrkVar.k;
                n0o0 n0o0Var2 = mrkVar.l;
                n0o0 n0o0Var3 = mrkVar.j;
                ksk kskVar = (ksk) obj2;
                n0o0 n0o0Var4 = mrkVar.h;
                ((fee) n0o0Var4.getValue()).d(kskVar.c);
                n0o0 n0o0Var5 = mrkVar.i;
                fee feeVar = (fee) n0o0Var5.getValue();
                j0g0 j0g0Var5 = kskVar.d;
                if (j0g0Var5 != null) {
                    Object obj4 = j0g0Var5.f15681a;
                    if (obj4 instanceof g0g0) {
                        obj4 = null;
                    }
                    kuk kukVar = (kuk) obj4;
                    if (kukVar != null) {
                        drkVar = e3c.N(kukVar);
                    } else {
                        iun iunVar = iun.f15405a;
                        drkVar = new drk(new btk(iunVar, ""), new btk(iunVar, ""));
                    }
                } else {
                    iun iunVar2 = iun.f15405a;
                    drkVar = new drk(new btk(iunVar2, ""), new btk(iunVar2, ""));
                }
                feeVar.d(drkVar);
                fee feeVar2 = (fee) n0o0Var3.getValue();
                if (j0g0Var5 != null) {
                    Object obj5 = j0g0Var5.f15681a;
                    if (obj5 instanceof g0g0) {
                        obj5 = null;
                    }
                    kuk kukVar2 = (kuk) obj5;
                    if (kukVar2 != null) {
                        irkVar = d5c.d0(kukVar2);
                    } else {
                        iun iunVar3 = iun.f15405a;
                        irkVar = new irk(iunVar3, iunVar3);
                    }
                } else {
                    iun iunVar4 = iun.f15405a;
                    irkVar = new irk(iunVar4, iunVar4);
                }
                feeVar2.d(irkVar);
                fee feeVar3 = (fee) n0o0Var2.getValue();
                if (j0g0Var5 != null) {
                    Object obj6 = j0g0Var5.f15681a;
                    if (obj6 instanceof g0g0) {
                        obj6 = null;
                    }
                    kuk kukVar3 = (kuk) obj6;
                    if (kukVar3 == null || (j0g0Var = kukVar3.g) == null) {
                        obj = iun.f15405a;
                    } else {
                        Object obj7 = j0g0Var.f15681a;
                        if (obj7 instanceof g0g0) {
                            obj7 = null;
                        }
                        obj = (List) obj7;
                        if (obj == null) {
                            obj = iun.f15405a;
                        }
                    }
                } else {
                    obj = iun.f15405a;
                }
                feeVar3.d(obj);
                fee feeVar4 = (fee) n0o0Var.getValue();
                if (j0g0Var5 != null) {
                    Object obj8 = j0g0Var5.f15681a;
                    if (obj8 instanceof g0g0) {
                        obj8 = null;
                    }
                    kuk kukVar4 = (kuk) obj8;
                    if (kukVar4 != null) {
                        Object obj9 = kukVar4.j;
                        list = (List) (obj9 instanceof g0g0 ? 0 : obj9);
                        if (list == null) {
                            list = iun.f15405a;
                        }
                    } else {
                        list = iun.f15405a;
                    }
                } else {
                    list = iun.f15405a;
                }
                feeVar4.d(v3c.i0(list));
                lc00 lc00VarB = kotlin.collections.a.b();
                lc00VarB.add(((fee) n0o0Var4.getValue()).b());
                lc00VarB.addAll((Collection) ((fee) n0o0Var5.getValue()).b());
                lc00VarB.addAll((Collection) ((fee) n0o0Var3.getValue()).b());
                lc00VarB.addAll((Collection) ((fee) n0o0Var.getValue()).b());
                return twn.k(lc00VarB, (Collection) ((fee) n0o0Var2.getValue()).b(), lc00VarB);
            case 1:
                csk cskVar = (csk) obj3;
                n0o0 n0o0Var6 = cskVar.k;
                n0o0 n0o0Var7 = cskVar.l;
                n0o0 n0o0Var8 = cskVar.j;
                n0o0 n0o0Var9 = cskVar.i;
                ksk kskVar2 = (ksk) obj2;
                n0o0 n0o0Var10 = cskVar.g;
                ((fee) n0o0Var10.getValue()).d(kskVar2.c);
                n0o0 n0o0Var11 = cskVar.h;
                fee feeVar5 = (fee) n0o0Var11.getValue();
                j0g0 j0g0Var6 = kskVar2.d;
                if (j0g0Var6 != null) {
                    Object obj10 = j0g0Var6.f15681a;
                    if (obj10 instanceof g0g0) {
                        obj10 = null;
                    }
                    kuk kukVar5 = (kuk) obj10;
                    if (kukVar5 == null || (j0g0Var4 = kukVar5.c) == null) {
                        btkVar = new btk(iun.f15405a, "");
                    } else {
                        Object obj11 = j0g0Var4.f15681a;
                        if (obj11 instanceof g0g0) {
                            obj11 = null;
                        }
                        btkVar = (btk) obj11;
                        if (btkVar == null) {
                            btkVar = new btk(iun.f15405a, "");
                        }
                    }
                } else {
                    btkVar = new btk(iun.f15405a, "");
                }
                feeVar5.d(btkVar);
                fee feeVar6 = (fee) n0o0Var9.getValue();
                if (j0g0Var6 != null) {
                    Object obj12 = j0g0Var6.f15681a;
                    if (obj12 instanceof g0g0) {
                        obj12 = null;
                    }
                    kuk kukVar6 = (kuk) obj12;
                    if (kukVar6 == null || (j0g0Var3 = kukVar6.d) == null) {
                        btkVar2 = new btk(iun.f15405a, "");
                    } else {
                        Object obj13 = j0g0Var3.f15681a;
                        if (obj13 instanceof g0g0) {
                            obj13 = null;
                        }
                        btkVar2 = (btk) obj13;
                        if (btkVar2 == null) {
                            btkVar2 = new btk(iun.f15405a, "");
                        }
                    }
                } else {
                    btkVar2 = new btk(iun.f15405a, "");
                }
                feeVar6.d(btkVar2);
                fee feeVar7 = (fee) n0o0Var8.getValue();
                if (j0g0Var6 != null) {
                    Object obj14 = j0g0Var6.f15681a;
                    if (obj14 instanceof g0g0) {
                        obj14 = null;
                    }
                    kuk kukVar7 = (kuk) obj14;
                    if (kukVar7 != null) {
                        zrkVar = obc.T(kukVar7);
                    } else {
                        iun iunVar5 = iun.f15405a;
                        zrkVar = new zrk(iunVar5, iunVar5);
                    }
                } else {
                    iun iunVar6 = iun.f15405a;
                    zrkVar = new zrk(iunVar6, iunVar6);
                }
                feeVar7.d(zrkVar);
                ?? r2 = (fee) n0o0Var7.getValue();
                if (j0g0Var6 != null) {
                    Object obj15 = j0g0Var6.f15681a;
                    if (obj15 instanceof g0g0) {
                        obj15 = null;
                    }
                    kuk kukVar8 = (kuk) obj15;
                    if (kukVar8 == null || (j0g0Var2 = kukVar8.g) == null) {
                        list2 = iun.f15405a;
                        list3 = list2;
                    } else {
                        Object obj16 = j0g0Var2.f15681a;
                        list2 = iun.f15405a;
                        if (obj16 instanceof g0g0) {
                            obj16 = list2;
                        }
                        list3 = (List) obj16;
                        if (list3 == null) {
                            list2 = iun.f15405a;
                            list3 = list2;
                        }
                    }
                } else {
                    list2 = iun.f15405a;
                    list3 = list2;
                }
                r2.d(list3);
                fee feeVar8 = (fee) n0o0Var6.getValue();
                feeVar8.getClass();
                pz40 pz40VarA = feeVar8.a();
                ((zrk) feeVar8.a().getValue()).getClass();
                if (j0g0Var6 != null) {
                    Object obj17 = j0g0Var6.f15681a;
                    if (obj17 instanceof g0g0) {
                        obj17 = null;
                    }
                    kuk kukVar9 = (kuk) obj17;
                    if (kukVar9 != null) {
                        Object obj18 = kukVar9.j;
                        List list4 = (List) (obj18 instanceof g0g0 ? null : obj18);
                        if (list4 != null) {
                            list2 = list4;
                        }
                    }
                }
                pz40VarA.setValue(kbc.i0(list2));
                lc00 lc00VarB2 = kotlin.collections.a.b();
                lc00VarB2.add(((fee) n0o0Var10.getValue()).b());
                lc00VarB2.addAll((Collection) ((fee) n0o0Var11.getValue()).b());
                lc00VarB2.addAll((Collection) ((fee) n0o0Var9.getValue()).b());
                lc00VarB2.addAll((Collection) ((fee) n0o0Var8.getValue()).b());
                lc00VarB2.addAll((Collection) ((fee) n0o0Var6.getValue()).b());
                return twn.k(lc00VarB2, (Collection) ((fee) n0o0Var7.getValue()).b(), lc00VarB2);
            case 2:
                v5u v5uVar = (v5u) obj3;
                atk atkVar = (atk) obj2;
                DisciplineDetailsParams disciplineDetailsParams = atkVar.o;
                CyberGamesPage cyberGamesPage = disciplineDetailsParams.b;
                long j = disciplineDetailsParams.f46554a;
                n2o n2oVar = ((ksk) atkVar.D()).b.c.q;
                cyberGamesPage.getClass();
                return piz.O(new fnq(new dnq(aoq.c(v5uVar.d.b(), new t5u(null, v5uVar, org.xplatform.cyber.section.api.domain.entity.d.c(j, cyberGamesPage), cyberGamesPage, j, n2oVar)), new rl2(3, r6, (byte) 16), z ? (byte) 1 : (byte) 0), new wsk(atkVar, r6, z ? (byte) 1 : (byte) 0), b2), d5c.S(jiu0.a(atkVar), atkVar.q.f22085a));
            case 3:
                q5u q5uVar = (q5u) obj3;
                atk atkVar2 = (atk) obj2;
                DisciplineDetailsParams disciplineDetailsParams2 = atkVar2.o;
                long j2 = disciplineDetailsParams2.f46554a;
                CyberGamesPage cyberGamesPage2 = disciplineDetailsParams2.b;
                cyberGamesPage2.getClass();
                return piz.O(new fnq(aoq.c(q5uVar.l.b(), new uot(null, q5uVar, j2, cyberGamesPage2)), new wsk(atkVar2, r6, b3), b2), d5c.S(jiu0.a(atkVar2), atkVar2.q.f22085a));
            case 4:
                iiy[] iiyVarArr = szk.Q1;
                ((Button) ((szq) obj3).b.f).setEnabled(false);
                l0l l0lVarJ0 = ((szk) obj2).J0();
                bby bbyVar = l0lVarJ0.r;
                if (bbyVar == null || !bbyVar.isActive()) {
                    l0lVarJ0.r = sac.V(jiu0.a(l0lVarJ0), new y6h(1, l0lVarJ0, l0l.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 29), null, l0lVarJ0.c.b, new g0l(l0lVarJ0, r6, b3), 10);
                }
                return Unit.f46060a;
            case 5:
                ((Function0) obj3).invoke();
                ((l0l) obj2).A(tzk.b);
                return Unit.f46060a;
            case 6:
                int i = DotaStatisticFutureGameView.A;
                ImageView imageView = new ImageView((Context) obj3);
                ((DotaStatisticFutureGameView) obj2).addView(imageView);
                return imageView;
            case 7:
                ((Function1) obj3).invoke((cll) obj2);
                return Unit.f46060a;
            case 8:
                eml emlVar = (eml) obj2;
                ((Function2) obj3).invoke(Long.valueOf(emlVar.f8051a), Boolean.valueOf(emlVar.i));
                return Unit.f46060a;
            case 9:
                ((Function1) obj3).invoke(Long.valueOf(((hml) ((jml) obj2)).f13313a.f8051a));
                return Unit.f46060a;
            case 10:
                gol golVar = (gol) obj3;
                Function1 function1 = (Function1) obj2;
                if ((golVar instanceof eol) && function1 != null) {
                    function1.invoke(golVar);
                }
                return Unit.f46060a;
            case 11:
                int i2 = DsButton.n;
                AppCompatTextView appCompatTextView = new AppCompatTextView((Context) obj3);
                ((DsButton) obj2).addView(appCompatTextView);
                appCompatTextView.setTag("DsButtonTextView");
                return appCompatTextView;
            case 12:
                Function0 function0 = (Function0) obj2;
                if (!((wul) obj3).e) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 13:
                return DsCounter.a((Context) obj3, (DsCounter) obj2);
            case 14:
                return String.format(Locale.ENGLISH, (String) obj3, Arrays.copyOf(new Object[]{((l7m0) obj2).getValue()}, 1));
            case 15:
                r7n r7nVar = (r7n) obj3;
                egk0 egk0Var = (egk0) obj2;
                if (r7nVar != r7n.b && (r7nVar != r7n.f29985a || egk0Var.l() <= 5999000)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 16:
                ((Function1) obj3).invoke(((t2m) obj2).getId());
                return Unit.f46060a;
            case 17:
                i3m i3mVar = (i3m) obj2;
                int iOrdinal = ((x3m) obj3).c().ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            t9f.b();
                            return null;
                        }
                        float fL = i3mVar.b.l();
                        if ((Float.isNaN(fL) ? null : Float.valueOf(fL)) == null) {
                            z2 = false;
                        }
                    } else if (CollectionsKt.h0(i3mVar.f14104a.d) == null) {
                        z2 = false;
                    }
                }
                return Boolean.valueOf(z2);
            case 18:
                cp cpVar = (cp) obj2;
                ((mhc) obj3).invoke(Long.valueOf(((zog) cpVar.u()).c), ((zog) cpVar.u()).d);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                h5m h5mVar = (h5m) obj3;
                vne vneVar = (vne) obj2;
                h5mVar.getClass();
                vneVar.getClass();
                h5mVar.c = vneVar;
                return Unit.f46060a;
            case 20:
                ((Function1) obj3).invoke((e8m) obj2);
                return Unit.f46060a;
            case 21:
                ((Function1) obj3).invoke((m8m) obj2);
                return Unit.f46060a;
            case 22:
                ((Function1) obj3).invoke(((ibm) obj2).f14494a);
                return Unit.f46060a;
            case 23:
                ((Function1) obj3).invoke(Long.valueOf(((ybm) obj2).getId()));
                return Unit.f46060a;
            case 24:
                ((Function1) obj3).invoke(((bdm) obj2).f2405a.f21559a.b);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Function1) obj3).invoke(Long.valueOf(((fdm) obj2).f9363a));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Function1) obj3).invoke(new wdm(false, ((uba) obj2).a()));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Function1) obj3).invoke((e0x) obj2);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                int i3 = DsMenuCell.g1;
                ((DsMenuCell) obj3).x(((DsCellRightBanner) obj2).getDrawable());
                return Unit.f46060a;
            default:
                Function0 function2 = (Function0) obj2;
                if (((hnm) obj3).f13358a.b()) {
                    function2.invoke();
                }
                return Unit.f46060a;
        }
    }
}
