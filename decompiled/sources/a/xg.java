package a;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.RealWebSocket;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;
import org.xplatform.uikit_sport.sport_coupon_card.common.DsSportCouponCard;

/* JADX INFO: loaded from: classes.dex */
public class xg implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40817a;
    public final Object b;
    public final Object c;
    public final Object d;

    public xg(hie0 hie0Var, cp cpVar, cp cpVar2) {
        this.f40817a = (byte) 13;
        this.d = hie0Var;
        this.b = cpVar;
        this.c = cpVar2;
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "map";
        } else if (i == 2) {
            objArr[0] = "compute";
        } else if (i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 3) {
            objArr[1] = "recursionDetected";
        } else if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[1] = "raceCondition";
        }
        if (i != 3 && i != 4) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public AssertionError b(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Inconsistent key detected. " + du00.b + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + ((eu00) this.b));
        eu00.f(assertionError);
        return assertionError;
    }

    public AssertionError c(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + ((eu00) this.b));
        eu00.f(assertionError);
        return assertionError;
    }

    public AssertionError g(Object obj, Throwable th) {
        AssertionError assertionError = new AssertionError("Unable to remove " + obj + " under " + ((eu00) this.b), th);
        eu00.f(assertionError);
        return assertionError;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) throws Throwable {
        byte b = this.f40817a;
        byte b2 = 11;
        final byte b3 = 1;
        Object[] objArr = 0;
        Object obj2 = null;
        AssertionError assertionErrorC = null;
        Object obj3 = this.b;
        Object obj4 = this.c;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                List list = (List) obj;
                yfu0 yfu0Var = ((cp) obj4).u;
                cp cpVar = (cp) obj3;
                yfu0 yfu0Var2 = cpVar.u;
                list.getClass();
                if (!list.isEmpty()) {
                    ArrayList<tg> arrayList = new ArrayList();
                    for (Object obj6 : list) {
                        obj6.getClass();
                        w3d.u(arrayList, (Collection) obj6);
                    }
                    for (tg tgVar : arrayList) {
                        if (tgVar != null) {
                            if (tgVar instanceof rg) {
                                ((trx) yfu0Var).c.setIconTint(((rg) tgVar).f30409a);
                            } else if (tgVar instanceof sg) {
                                ((trx) yfu0Var).b.setTitleTextColor(((sg) tgVar).f32138a);
                            } else if (tgVar instanceof qg) {
                                ((trx) yfu0Var).d.setVisibility(((qg) tgVar).f28659a ? 0 : 8);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                ((trx) yfu0Var2).b.setTitle(String.format(String.valueOf(((ug) cpVar.u()).f35599a), Arrays.copyOf(new Object[]{(String) obj5}, 1)));
                ((trx) yfu0Var2).d.setVisibility(((ug) cpVar.u()).c ? 0 : 8);
                ((trx) yfu0Var2).c.setIconTint(((ug) cpVar.u()).e);
                ((trx) yfu0Var2).b.setTitleTextColor(((ug) cpVar.u()).d);
                ((trx) yfu0Var2).e.setVisibility(((ug) cpVar.u()).b ? 8 : 0);
                return Unit.f46060a;
            case 1:
                Throwable th = (Throwable) obj;
                ft4 ft4Var = (ft4) obj3;
                RealWebSocket realWebSocket = (RealWebSocket) obj4;
                ft4Var.getClass();
                n0o0 n0o0VarB = maz.b(new bt4(th, (byte) 0));
                if (((th != null ? th.getCause() : null) instanceof art0) || ((Boolean) n0o0VarB.getValue()).booleanValue()) {
                    ft4Var.a(realWebSocket);
                }
                ft4Var.g.remove(realWebSocket);
                realWebSocket.f(1000, "Disconnected");
                e0g0 e0g0Var = j0g0.b;
                Unit unit = Unit.f46060a;
                ((n5a) obj5).resumeWith(unit);
                return unit;
            case 2:
                List list2 = (List) obj;
                cp cpVar2 = (cp) obj4;
                yfu0 yfu0Var3 = cpVar2.u;
                list2.getClass();
                if (!list2.isEmpty()) {
                    ArrayList<ute> arrayList2 = new ArrayList();
                    for (Object obj7 : list2) {
                        obj7.getClass();
                        w3d.u(arrayList2, (Collection) obj7);
                    }
                    for (ute uteVar : arrayList2) {
                        if (uteVar != null) {
                            if (uteVar instanceof tte) {
                                ((scu0) yfu0Var3).b.setTitle(((vte) cpVar2.u()).k);
                            } else if (uteVar instanceof pte) {
                                ((scu0) yfu0Var3).b.setSubTitle(((vte) cpVar2.u()).i);
                            } else if (uteVar instanceof rte) {
                                ((scu0) yfu0Var3).b.setTagText(((vte) cpVar2.u()).o);
                            } else if (uteVar instanceof qte) {
                                ((scu0) yfu0Var3).b.setTagColor(((vte) cpVar2.u()).p);
                            } else if (uteVar instanceof hte) {
                                ((scu0) yfu0Var3).b.setError(((vte) cpVar2.u()).l);
                            } else if (uteVar instanceof kte) {
                                ((scu0) yfu0Var3).b.setMarketStyle(((vte) cpVar2.u()).q);
                            } else if (uteVar instanceof lte) {
                                ((scu0) yfu0Var3).b.setMarketDescription(((vte) cpVar2.u()).n);
                            } else if ((uteVar instanceof ete) || (uteVar instanceof fte)) {
                                DsSportCouponCard dsSportCouponCard = ((scu0) yfu0Var3).b;
                                j0d j0dVar = ((vte) cpVar2.u()).s;
                                String str = ((vte) cpVar2.u()).r;
                                pse pseVar = dsSportCouponCard.j;
                                if (pseVar != null) {
                                    pseVar.b(str, j0dVar);
                                }
                            } else if (uteVar instanceof mte) {
                                at7 at7Var = new at7((Function1) obj5, cpVar2, (byte) 29);
                                DsSportCouponCard dsSportCouponCard2 = ((scu0) yfu0Var3).b;
                                if (!((vte) cpVar2.u()).t) {
                                    at7Var = null;
                                }
                                dsSportCouponCard2.setMoveButtonClickListener(at7Var);
                            } else if (uteVar instanceof ite) {
                                DsSportCouponCard dsSportCouponCard3 = ((scu0) yfu0Var3).b;
                                boolean z = ((vte) cpVar2.u()).h;
                                pse pseVar2 = dsSportCouponCard3.j;
                                iue iueVar = pseVar2 instanceof iue ? (iue) pseVar2 : null;
                                if (iueVar != null) {
                                    iueVar.c(z);
                                }
                            } else if (uteVar instanceof jte) {
                                ((scu0) yfu0Var3).b.setMarketHeader(((vte) cpVar2.u()).m);
                            } else if (uteVar instanceof dte) {
                                ((scu0) yfu0Var3).b.setCaption(((vte) cpVar2.u()).j);
                            } else if (uteVar instanceof ote) {
                                ((scu0) yfu0Var3).b.setScoreUiModel(((vte) cpVar2.u()).w);
                            } else if (uteVar instanceof ste) {
                                ((scu0) yfu0Var3).b.setTeamsUiModel(((vte) cpVar2.u()).x);
                            } else if (uteVar instanceof cte) {
                                ((scu0) yfu0Var3).b.setAutoSub(((vte) cpVar2.u()).y);
                            } else if (uteVar instanceof nte) {
                                ((scu0) yfu0Var3).b.setOptionBet(((vte) cpVar2.u()).z);
                            } else if (uteVar instanceof gte) {
                                ((scu0) yfu0Var3).b.setEachWay(((vte) cpVar2.u()).A);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                cp cpVar3 = (cp) obj3;
                yfu0 yfu0Var4 = cpVar3.u;
                ((scu0) yfu0Var4).b.a(((vte) cpVar3.u()).v);
                scu0 scu0Var = (scu0) yfu0Var4;
                scu0Var.b.setRtlSupportEnabled(((vte) cpVar3.u()).Y);
                scu0Var.b.setModel(new fue(((vte) cpVar3.u()).j, ((vte) cpVar3.u()).o, ((vte) cpVar3.u()).p, ((vte) cpVar3.u()).k, ((vte) cpVar3.u()).i, ((vte) cpVar3.u()).l, ((vte) cpVar3.u()).h, ((vte) cpVar3.u()).m, ((vte) cpVar3.u()).n, ((vte) cpVar3.u()).r, ((vte) cpVar3.u()).w, ((vte) cpVar3.u()).x, ((vte) cpVar3.u()).q, ((vte) cpVar3.u()).s, ((vte) cpVar3.u()).u.f12928a, ((vte) cpVar3.u()).B, ((vte) cpVar3.u()).y, ((vte) cpVar3.u()).z, ((vte) cpVar3.u()).A));
                return Unit.f46060a;
            case 3:
                cp cpVar4 = (cp) obj3;
                ((List) obj).getClass();
                mie0 mie0Var = (mie0) obj4;
                Object obj8 = mie0Var.f21842a;
                if (obj8 == null) {
                    pz40 pz40VarE = androidx.compose.runtime.e.e(cpVar4.u());
                    mie0Var.f21842a = pz40VarE;
                    ((kgh) obj5).invoke(pz40VarE);
                } else {
                    ((pz40) obj8).setValue(cpVar4.u());
                }
                return Unit.f46060a;
            case 4:
                hps0 hps0Var = (hps0) obj;
                gdl gdlVar = (gdl) hps0Var;
                if (!((wy2) vcc.a0((gdl) obj4).getDragAndDropManager()).b.contains(gdlVar) || !vbc.U(gdlVar, xbc.U((a1d) obj5))) {
                    return gps0.f11699a;
                }
                ((mie0) obj3).f21842a = hps0Var;
                return gps0.c;
            case 5:
                wim wimVar = (wim) obj;
                wimVar.getClass();
                ((Function2) obj3).invoke(wimVar, ((ngk0) obj4).get(Integer.valueOf(((wim) obj5).f39221a)));
                return Unit.f46060a;
            case 6:
                cp cpVar5 = (cp) obj3;
                ((List) obj).getClass();
                mie0 mie0Var2 = (mie0) obj4;
                Object obj9 = mie0Var2.f21842a;
                if (obj9 == null) {
                    pz40 pz40VarE2 = androidx.compose.runtime.e.e(cpVar5.u());
                    mie0Var2.f21842a = pz40VarE2;
                    ((kgh) obj5).invoke(pz40VarE2);
                } else {
                    ((pz40) obj9).setValue(cpVar5.u());
                }
                return Unit.f46060a;
            case 7:
                List list3 = (List) obj;
                cp cpVar6 = (cp) obj3;
                list3.getClass();
                if (list3.isEmpty()) {
                    yfu0 yfu0Var5 = cpVar6.u;
                    rsx rsxVar = (rsx) yfu0Var5;
                    rsxVar.f.setText(((yrw) cpVar6.u()).f43142a);
                    rsxVar.e.setText(((yrw) cpVar6.u()).b);
                    ((gkz) obj5).A(((yrw) cpVar6.u()).c);
                    rsxVar.b.a(((yrw) cpVar6.u()).e);
                    rsx rsxVar2 = (rsx) yfu0Var5;
                    RecyclerView recyclerView = rsxVar2.d;
                    recyclerView.post(new jto(recyclerView, rsxVar2.b, ((yrw) cpVar6.u()).d, ((yrw) cpVar6.u()).c.size()));
                    int i = ((yrw) cpVar6.u()).f ? 2 : 0;
                    rsxVar.c.setLayoutDirection(i);
                    rsxVar.d.setLayoutDirection(i);
                } else {
                    ArrayList<List> arrayList3 = new ArrayList();
                    for (Object obj10 : list3) {
                        obj10.getClass();
                        w3d.u(arrayList3, (Collection) obj10);
                    }
                    for (List list4 : arrayList3) {
                        ArrayList<gpa> arrayList4 = new ArrayList();
                        for (Object obj11 : list4) {
                            if (obj11 instanceof gpa) {
                                arrayList4.add(obj11);
                            }
                        }
                        for (gpa gpaVar : arrayList4) {
                            if (!(gpaVar instanceof gpa)) {
                                t9f.b();
                                return null;
                            }
                            ((rsx) ((cp) obj4).u).b.a(gpaVar.f11673a);
                        }
                    }
                }
                return Unit.f46060a;
            case 8:
                eu00 eu00Var = (eu00) obj3;
                jtv jtvVar = eu00Var.b;
                jyj0 jyj0Var = eu00Var.f8395a;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj4;
                Object objInvoke = concurrentHashMap.get(obj);
                Object obj12 = brv0.f3098a;
                du00 du00Var = du00.b;
                if (objInvoke == null || objInvoke == du00Var) {
                    jyj0Var.lock();
                    try {
                        Object obj13 = concurrentHashMap.get(obj);
                        du00 du00Var2 = du00.c;
                        if (obj13 == du00Var) {
                            s88 s88VarE = eu00Var.e(obj, "");
                            if (s88VarE == null) {
                                a(3);
                                throw null;
                            }
                            if (s88VarE.b) {
                                obj13 = du00Var2;
                            } else {
                                obj2 = s88VarE.c;
                            }
                            jyj0Var.unlock();
                            return obj2;
                        }
                        if (obj13 == du00Var2) {
                            s88 s88VarE2 = eu00Var.e(obj, "");
                            if (s88VarE2 == null) {
                                a(3);
                                throw null;
                            }
                            if (!s88VarE2.b) {
                                obj2 = s88VarE2.c;
                            }
                            jyj0Var.unlock();
                            return obj2;
                        }
                        if (obj13 != null) {
                            brv0.a(obj13);
                            if (obj13 != obj12) {
                                obj2 = obj13;
                            }
                            jyj0Var.unlock();
                            return obj2;
                        }
                        try {
                            concurrentHashMap.put(obj, du00Var);
                            objInvoke = ((Function1) obj5).invoke(obj);
                            if (objInvoke != null) {
                                obj12 = objInvoke;
                            }
                            Object objPut = concurrentHashMap.put(obj, obj12);
                            if (objPut != du00Var) {
                                assertionErrorC = c(obj, objPut);
                                throw assertionErrorC;
                            }
                            jyj0Var.unlock();
                        } catch (Throwable th2) {
                            if (vic.B(th2)) {
                                try {
                                    Object objRemove = concurrentHashMap.remove(obj);
                                    if (objRemove != du00Var) {
                                        throw b(obj, objRemove);
                                    }
                                    throw th2;
                                } catch (Throwable th3) {
                                    throw g(obj, th3);
                                }
                            }
                            if (th2 != assertionErrorC) {
                                Object objPut2 = concurrentHashMap.put(obj, new arv0(th2));
                                if (objPut2 != du00Var) {
                                    throw c(obj, objPut2);
                                }
                                jtvVar.getClass();
                                throw th2;
                            }
                            try {
                                concurrentHashMap.remove(obj);
                                jtvVar.getClass();
                                throw th2;
                            } catch (Throwable th4) {
                                throw g(obj, th4);
                            }
                        }
                        jyj0Var.unlock();
                        throw th;
                    } catch (Throwable th5) {
                        jyj0Var.unlock();
                        throw th5;
                    }
                }
                brv0.a(objInvoke);
                if (objInvoke == obj12) {
                    return null;
                }
                return objInvoke;
            case 9:
                m2l0 m2l0Var = (m2l0) obj;
                ekf0 ekf0Var = (ekf0) obj4;
                m2l0Var.getClass();
                if (m2l0Var instanceof l2l0) {
                    qjj.W((vne) obj3, null, null, new hk40((Object) ekf0Var, obj5, (Object) m2l0Var, (yje) null, (byte) 26), 3);
                } else if (m2l0Var instanceof i2l0) {
                    ekf0Var.g(((i2l0) m2l0Var).f14054a);
                } else {
                    if (!(m2l0Var instanceof k2l0) && !(m2l0Var instanceof j2l0)) {
                        t9f.b();
                        return null;
                    }
                    ekf0Var.i();
                }
                return Unit.f46060a;
            case 10:
                List list5 = (List) obj;
                cp cpVar7 = (cp) obj4;
                cp cpVar8 = (cp) obj3;
                yfu0 yfu0Var6 = cpVar8.u;
                list5.getClass();
                if (!list5.isEmpty()) {
                    ArrayList<h1b> arrayList5 = new ArrayList();
                    for (Object obj14 : list5) {
                        obj14.getClass();
                        w3d.u(arrayList5, (Collection) obj14);
                    }
                    for (h1b h1bVar : arrayList5) {
                        if (h1bVar != null) {
                            if (h1bVar instanceof c1b) {
                                cpVar7.f40887a.setTag(((i1b) cpVar7.u()).f13989a);
                            } else if (h1bVar instanceof e1b) {
                                xww.r(cpVar7);
                            } else if (h1bVar instanceof f1b) {
                                xww.s(cpVar7);
                            } else if (h1bVar instanceof z0b) {
                                xww.u(cpVar7);
                            } else if (h1bVar instanceof d1b) {
                                xww.v(cpVar7);
                            } else if (h1bVar instanceof a1b) {
                                xww.w(cpVar7);
                            } else if (h1bVar instanceof g1b) {
                                xww.t(cpVar7);
                            } else if (h1bVar instanceof b1b) {
                                ((fz60) cpVar7.u).j.setText(((i1b) cpVar7.u()).d);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                ((fz60) yfu0Var6).c.setVisibility(0);
                fz60 fz60Var = (fz60) yfu0Var6;
                FrameLayout frameLayout = fz60Var.c;
                CheckBox checkBox = fz60Var.b;
                frameLayout.setOnTouchListener(new jw5(cpVar8, b2));
                checkBox.setOnClickListener(new bs50(obj5, (Object) cpVar8, (byte) 4));
                fz60Var.g.setVisibility(8);
                fz60Var.f10395a.setEnabled(true);
                checkBox.setEnabled(true);
                fz60Var.d.setVisibility(8);
                xww.s(cpVar8);
                xww.v(cpVar8);
                ((fz60) yfu0Var6).j.setText(((i1b) cpVar8.u()).d);
                xww.u(cpVar8);
                xww.w(cpVar8);
                xww.t(cpVar8);
                cpVar8.f40887a.setTag(((i1b) cpVar8.u()).f13989a);
                xww.r(cpVar8);
                return Unit.f46060a;
            case 11:
                List list6 = (List) obj;
                list6.getClass();
                if (list6.isEmpty()) {
                    cp cpVar9 = (cp) obj3;
                    final bbl0 bbl0Var = (bbl0) obj5;
                    final aos aosVar = (aos) cpVar9.u();
                    tsx tsxVar = (tsx) cpVar9.u;
                    TextView textView = tsxVar.i;
                    ImageView imageView = tsxVar.e;
                    ImageView imageView2 = tsxVar.d;
                    textView.setText(aosVar.b);
                    tsxVar.k.setText(aosVar.f1216a.b(cpVar9.w));
                    tsxVar.j.setText(aosVar.c);
                    List list7 = u0d.f34849a;
                    RoundCornerImageView roundCornerImageView = tsxVar.f;
                    ohm0 ohm0Var = aosVar.f;
                    u0d.n(roundCornerImageView, ohm0Var.q(), 0, 11);
                    u0d.n(tsxVar.g, ohm0Var.v(), 0, 11);
                    x0x.M(tsxVar.b, aosVar.d);
                    x0x.M(tsxVar.c, aosVar.e);
                    tsxVar.h.fullScroll(130);
                    imageView2.setImageResource(ohm0Var.o());
                    imageView.setImageResource(ohm0Var.t());
                    ymx ymxVar = ymx.INTERVAL_500;
                    final Object[] objArr2 = objArr == true ? 1 : 0;
                    dyb.b0(imageView2, ymxVar, new Function1() { // from class: a.dd90
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj15) {
                            byte b4 = objArr2;
                            aos aosVar2 = aosVar;
                            bbl0 bbl0Var2 = bbl0Var;
                            View view = (View) obj15;
                            switch (b4) {
                                case 0:
                                    view.getClass();
                                    ohm0 ohm0Var2 = aosVar2.f;
                                    bbl0Var2.invoke(Long.valueOf(ohm0Var2.p()), Boolean.valueOf(ohm0Var2.n()));
                                    break;
                                default:
                                    view.getClass();
                                    ohm0 ohm0Var3 = aosVar2.f;
                                    bbl0Var2.invoke(Long.valueOf(ohm0Var3.u()), Boolean.valueOf(ohm0Var3.s()));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    });
                    dyb.b0(imageView, ymxVar, new Function1() { // from class: a.dd90
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj15) {
                            byte b4 = b3;
                            aos aosVar2 = aosVar;
                            bbl0 bbl0Var2 = bbl0Var;
                            View view = (View) obj15;
                            switch (b4) {
                                case 0:
                                    view.getClass();
                                    ohm0 ohm0Var2 = aosVar2.f;
                                    bbl0Var2.invoke(Long.valueOf(ohm0Var2.p()), Boolean.valueOf(ohm0Var2.n()));
                                    break;
                                default:
                                    view.getClass();
                                    ohm0 ohm0Var3 = aosVar2.f;
                                    bbl0Var2.invoke(Long.valueOf(ohm0Var3.u()), Boolean.valueOf(ohm0Var3.s()));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    });
                    tsxVar.f34484a.setLayoutDirection(((aos) cpVar9.u()).g ? 2 : 0);
                } else {
                    ArrayList<List> arrayList6 = new ArrayList();
                    for (Object obj15 : list6) {
                        obj15.getClass();
                        w3d.u(arrayList6, (Collection) obj15);
                    }
                    for (List list8 : arrayList6) {
                        ArrayList<spa> arrayList7 = new ArrayList();
                        for (Object obj16 : list8) {
                            if (obj16 instanceof spa) {
                                arrayList7.add(obj16);
                            }
                        }
                        for (spa spaVar : arrayList7) {
                            cp cpVar10 = (cp) obj4;
                            yfu0 yfu0Var7 = cpVar10.u;
                            spaVar.getClass();
                            if (spaVar instanceof lpa) {
                                ((tsx) yfu0Var7).k.setText(((lpa) spaVar).f20430a.b(cpVar10.w));
                            } else if (spaVar instanceof opa) {
                                x0x.M(((tsx) yfu0Var7).b, ((opa) spaVar).f25631a);
                            } else if (spaVar instanceof rpa) {
                                x0x.M(((tsx) yfu0Var7).c, ((rpa) spaVar).f30876a);
                            } else if (spaVar instanceof mpa) {
                                ((tsx) yfu0Var7).d.setImageResource(((mpa) spaVar).f22168a);
                            } else if (spaVar instanceof ppa) {
                                ((tsx) yfu0Var7).e.setImageResource(((ppa) spaVar).f27367a);
                            } else if (spaVar instanceof npa) {
                                List list9 = u0d.f34849a;
                                u0d.n(((tsx) yfu0Var7).f, ((npa) spaVar).f23902a, 0, 11);
                            } else {
                                if (!(spaVar instanceof qpa)) {
                                    t9f.b();
                                    return null;
                                }
                                List list10 = u0d.f34849a;
                                u0d.n(((tsx) yfu0Var7).g, ((qpa) spaVar).f29106a, 0, 11);
                            }
                        }
                    }
                }
                return Unit.f46060a;
            case 12:
                m2l0 m2l0Var2 = (m2l0) obj;
                ekf0 ekf0Var2 = (ekf0) obj4;
                m2l0Var2.getClass();
                if (m2l0Var2 instanceof l2l0) {
                    qjj.W((vne) obj3, null, null, new zol0((Object) ekf0Var2, obj5, (Object) m2l0Var2, (yje) null, (byte) 3), 3);
                } else if (m2l0Var2 instanceof i2l0) {
                    ekf0Var2.g(((i2l0) m2l0Var2).f14054a);
                } else {
                    if (!(m2l0Var2 instanceof k2l0) && !(m2l0Var2 instanceof j2l0)) {
                        t9f.b();
                        return null;
                    }
                    ekf0Var2.i();
                }
                return Unit.f46060a;
            case 13:
                List list11 = (List) obj;
                cp cpVar11 = (cp) obj4;
                yfu0 yfu0Var8 = cpVar11.u;
                hie0 hie0Var = (hie0) obj5;
                cp cpVar12 = (cp) obj3;
                yfu0 yfu0Var9 = cpVar12.u;
                list11.getClass();
                if (list11.isEmpty()) {
                    boolean z2 = ((iam0) cpVar12.u()).c;
                    hie0Var.f13108a = z2;
                    int i2 = z2 ? R.drawable.ic_glyph_show : R.drawable.ic_glyph_hide;
                    ((v9m0) yfu0Var9).d.setAlpha(((iam0) cpVar12.u()).d ? 0.5f : 1.0f);
                    ((v9m0) yfu0Var9).b.setButtonIcon(i2);
                    ((v9m0) yfu0Var9).d.setTitle(((iam0) cpVar12.u()).b);
                    zdx.t(cpVar12, cpVar12.c());
                    int iC = cpVar12.c();
                    yge0 yge0Var = cpVar12.s;
                    zdx.u(cpVar12, iC, (yge0Var != null ? yge0Var.d() : 0) - 1);
                } else {
                    ArrayList<ham0> arrayList8 = new ArrayList();
                    for (Object obj17 : list11) {
                        obj17.getClass();
                        w3d.u(arrayList8, (Collection) obj17);
                    }
                    for (ham0 ham0Var : arrayList8) {
                        if (ham0Var != null) {
                            if (ham0Var instanceof eam0) {
                                ((v9m0) yfu0Var8).d.setAlpha(((iam0) cpVar11.u()).d ? 0.5f : 1.0f);
                            } else if (ham0Var instanceof gam0) {
                                ((v9m0) yfu0Var8).d.setTitle(((iam0) cpVar11.u()).b);
                            }
                        }
                    }
                }
                return Unit.f46060a;
            case 14:
                qbe0 qbe0Var = (qbe0) obj3;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) obj4;
                yku0 yku0Var = (yku0) obj5;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(yku0Var);
                } else {
                    qbe0Var.b.getViewTreeObserver().removeOnPreDrawListener(yku0Var);
                }
                return Unit.f46060a;
            default:
                kov0 kov0Var = (kov0) obj5;
                glz glzVar = (glz) obj4;
                vs10 vs10Var = (vs10) obj3;
                kotlin.coroutines.g gVar = kotlin.coroutines.g.f46065a;
                if (vs10Var.v(gVar)) {
                    vs10Var.q(gVar, new mfr((Object) glzVar, (Object) kov0Var, (byte) 16));
                } else {
                    glzVar.f(kov0Var);
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ xg(cp cpVar, Object obj, cp cpVar2, byte b) {
        this.f40817a = b;
        this.b = cpVar;
        this.d = obj;
        this.c = cpVar2;
    }

    public /* synthetic */ xg(mie0 mie0Var, cp cpVar, Function1 function1, byte b) {
        this.f40817a = b;
        this.c = mie0Var;
        this.b = cpVar;
        this.d = function1;
    }

    public /* synthetic */ xg(Object obj, Object obj2, Object obj3, byte b) {
        this.f40817a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
