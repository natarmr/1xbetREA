package a;

import android.content.Context;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j0a0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15674a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ j0a0(vs4 vs4Var, jkm jkmVar, Function0 function0, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function0 function5, mm40 mm40Var, int i) {
        this.f15674a = (byte) 1;
        this.c = vs4Var;
        this.d = jkmVar;
        this.e = function0;
        this.f = function1;
        this.g = function2;
        this.h = function3;
        this.i = function4;
        this.j = function5;
        this.b = mm40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        final pz40 pz40Var;
        byte b = this.f15674a;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.f;
        Object obj8 = this.e;
        Object obj9 = this.d;
        Object obj10 = this.c;
        Object obj11 = this.b;
        switch (b) {
            case 0:
                mm40 mm40Var = (mm40) obj11;
                final glo0 glo0Var = (glo0) obj10;
                iva ivaVar = (iva) obj9;
                final pz40 pz40Var2 = (pz40) obj8;
                final pz40 pz40Var3 = (pz40) obj7;
                final pz40 pz40Var4 = (pz40) obj6;
                pz40 pz40Var5 = (pz40) obj5;
                pz40 pz40Var6 = (pz40) obj4;
                pz40 pz40Var7 = (pz40) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    n0q n0qVar = o7k0.c;
                    mm40 mm40VarR = knm0.r(mm40Var.e(n0qVar));
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarR);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    boolean zI = fetVar.i(glo0Var);
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zI || objP == cl5Var) {
                        final byte b2 = 1;
                        Function1 function1 = new Function1() { // from class: a.g0a0
                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj12) {
                                byte b3 = b2;
                                final byte b4 = 1;
                                final pz40 pz40Var8 = pz40Var4;
                                final glo0 glo0Var2 = glo0Var;
                                pz40 pz40Var9 = pz40Var3;
                                pz40 pz40Var10 = pz40Var2;
                                final byte b5 = 0;
                                Context context = (Context) obj12;
                                switch (b3) {
                                    case 0:
                                        context.getClass();
                                        TableViewImpl tableViewImpl = new TableViewImpl(context, null, 0);
                                        tableViewImpl.setVisibility(4);
                                        pz40Var10.setValue(tableViewImpl);
                                        iu90 iu90Var = new iu90(tableViewImpl, false, R.dimen.text_12);
                                        iu90Var.l = tableViewImpl;
                                        tableViewImpl.setAdapter(iu90Var);
                                        pz40Var9.setValue(iu90Var);
                                        vlw horizontalRecyclerViewListener = tableViewImpl.getHorizontalRecyclerViewListener();
                                        xdr xdrVar = new xdr() { // from class: a.h0a0
                                            @Override // a.xdr
                                            public final Object F(Object obj13, Object obj14, Object obj15) {
                                                byte b6 = b4;
                                                pz40 pz40Var11 = pz40Var8;
                                                glo0 glo0Var3 = glo0Var2;
                                                int iIntValue2 = ((Integer) obj13).intValue();
                                                ((Boolean) obj14).getClass();
                                                ((Boolean) obj15).getClass();
                                                switch (b6) {
                                                    case 0:
                                                        TableViewImpl tableViewImpl2 = (TableViewImpl) pz40Var11.getValue();
                                                        if (tableViewImpl2 == null) {
                                                            glo0Var3.getClass();
                                                        } else if (!glo0Var3.f11503a) {
                                                            glo0Var3.f11503a = true;
                                                            y9b columnHeaderRecyclerView = tableViewImpl2.getColumnHeaderRecyclerView();
                                                            columnHeaderRecyclerView.scrollBy(iIntValue2, 0);
                                                            tableViewImpl2.getHorizontalRecyclerViewListener().d(columnHeaderRecyclerView, iIntValue2, 0);
                                                            glo0Var3.f11503a = false;
                                                        }
                                                        break;
                                                    default:
                                                        TableViewImpl tableViewImpl3 = (TableViewImpl) pz40Var11.getValue();
                                                        if (tableViewImpl3 == null) {
                                                            glo0Var3.getClass();
                                                        } else if (!glo0Var3.f11503a) {
                                                            glo0Var3.f11503a = true;
                                                            y9b columnHeaderRecyclerView2 = tableViewImpl3.getColumnHeaderRecyclerView();
                                                            columnHeaderRecyclerView2.scrollBy(iIntValue2, 0);
                                                            tableViewImpl3.getHorizontalRecyclerViewListener().d(columnHeaderRecyclerView2, iIntValue2, 0);
                                                            glo0Var3.f11503a = false;
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        };
                                        horizontalRecyclerViewListener.getClass();
                                        horizontalRecyclerViewListener.h = xdrVar;
                                        return tableViewImpl;
                                    default:
                                        context.getClass();
                                        TableViewImpl tableViewImpl2 = new TableViewImpl(context, null, 0);
                                        pz40Var10.setValue(tableViewImpl2);
                                        gva gvaVar = new gva(tableViewImpl2, true, R.dimen.text_12);
                                        gvaVar.l = tableViewImpl2;
                                        tableViewImpl2.setAdapter(gvaVar);
                                        pz40Var9.setValue(gvaVar);
                                        vlw horizontalRecyclerViewListener2 = tableViewImpl2.getHorizontalRecyclerViewListener();
                                        xdr xdrVar2 = new xdr() { // from class: a.h0a0
                                            @Override // a.xdr
                                            public final Object F(Object obj13, Object obj14, Object obj15) {
                                                byte b6 = b5;
                                                pz40 pz40Var11 = pz40Var8;
                                                glo0 glo0Var3 = glo0Var2;
                                                int iIntValue2 = ((Integer) obj13).intValue();
                                                ((Boolean) obj14).getClass();
                                                ((Boolean) obj15).getClass();
                                                switch (b6) {
                                                    case 0:
                                                        TableViewImpl tableViewImpl3 = (TableViewImpl) pz40Var11.getValue();
                                                        if (tableViewImpl3 == null) {
                                                            glo0Var3.getClass();
                                                        } else if (!glo0Var3.f11503a) {
                                                            glo0Var3.f11503a = true;
                                                            y9b columnHeaderRecyclerView = tableViewImpl3.getColumnHeaderRecyclerView();
                                                            columnHeaderRecyclerView.scrollBy(iIntValue2, 0);
                                                            tableViewImpl3.getHorizontalRecyclerViewListener().d(columnHeaderRecyclerView, iIntValue2, 0);
                                                            glo0Var3.f11503a = false;
                                                        }
                                                        break;
                                                    default:
                                                        TableViewImpl tableViewImpl4 = (TableViewImpl) pz40Var11.getValue();
                                                        if (tableViewImpl4 == null) {
                                                            glo0Var3.getClass();
                                                        } else if (!glo0Var3.f11503a) {
                                                            glo0Var3.f11503a = true;
                                                            y9b columnHeaderRecyclerView2 = tableViewImpl4.getColumnHeaderRecyclerView();
                                                            columnHeaderRecyclerView2.scrollBy(iIntValue2, 0);
                                                            tableViewImpl4.getHorizontalRecyclerViewListener().d(columnHeaderRecyclerView2, iIntValue2, 0);
                                                            glo0Var3.f11503a = false;
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        };
                                        horizontalRecyclerViewListener2.getClass();
                                        horizontalRecyclerViewListener2.h = xdrVar2;
                                        return tableViewImpl2;
                                }
                            }
                        };
                        fetVar.o0(function1);
                        objP = function1;
                    }
                    Function1 function2 = (Function1) objP;
                    boolean zI2 = fetVar.i(ivaVar) | fetVar.i(glo0Var);
                    Object objP2 = fetVar.P();
                    if (zI2 || objP2 == cl5Var) {
                        bg0 bg0Var = new bg0(ivaVar, pz40Var5, pz40Var3, pz40Var4, glo0Var, pz40Var6, (byte) 12);
                        glo0Var = glo0Var;
                        fetVar.o0(bg0Var);
                        objP2 = bg0Var;
                    }
                    dwi0.b(function2, n0qVar, (Function1) objP2, fetVar, 48, 0);
                    if (ivaVar.d.isEmpty()) {
                        fetVar.e0(-1807929172);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-1809431649);
                        zx7 zx7Var = gqw0.h;
                        jr8 jr8Var = jr8.f16991a;
                        mm40 mm40VarQ = jm40.b;
                        mm40 mm40VarD = o7k0.d(jr8Var.b(mm40VarQ, zx7Var), 1.0f);
                        if (((Boolean) pz40Var6.getValue()).booleanValue()) {
                            fetVar.e0(-1809249772);
                            mm40VarQ = i120.Q(mm40VarQ, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
                            fetVar.r(false);
                        } else {
                            fetVar.e0(-1809126268);
                            fetVar.r(false);
                        }
                        mm40 mm40VarE = mm40VarD.e(mm40VarQ);
                        boolean zI3 = fetVar.i(glo0Var);
                        Object objP3 = fetVar.P();
                        if (zI3 || objP3 == cl5Var) {
                            final byte b3 = 0;
                            pz40Var = pz40Var7;
                            Function1 function3 = new Function1() { // from class: a.g0a0
                                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                 */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj12) {
                                    byte b4 = b3;
                                    final byte b5 = 1;
                                    final pz40 pz40Var8 = pz40Var2;
                                    final glo0 glo0Var2 = glo0Var;
                                    pz40 pz40Var9 = pz40Var;
                                    pz40 pz40Var10 = pz40Var4;
                                    final byte b6 = 0;
                                    Context context = (Context) obj12;
                                    switch (b4) {
                                        case 0:
                                            context.getClass();
                                            TableViewImpl tableViewImpl = new TableViewImpl(context, null, 0);
                                            tableViewImpl.setVisibility(4);
                                            pz40Var10.setValue(tableViewImpl);
                                            iu90 iu90Var = new iu90(tableViewImpl, false, R.dimen.text_12);
                                            iu90Var.l = tableViewImpl;
                                            tableViewImpl.setAdapter(iu90Var);
                                            pz40Var9.setValue(iu90Var);
                                            vlw horizontalRecyclerViewListener = tableViewImpl.getHorizontalRecyclerViewListener();
                                            xdr xdrVar = new xdr() { // from class: a.h0a0
                                                @Override // a.xdr
                                                public final Object F(Object obj13, Object obj14, Object obj15) {
                                                    byte b7 = b5;
                                                    pz40 pz40Var11 = pz40Var8;
                                                    glo0 glo0Var3 = glo0Var2;
                                                    int iIntValue2 = ((Integer) obj13).intValue();
                                                    ((Boolean) obj14).getClass();
                                                    ((Boolean) obj15).getClass();
                                                    switch (b7) {
                                                        case 0:
                                                            TableViewImpl tableViewImpl3 = (TableViewImpl) pz40Var11.getValue();
                                                            if (tableViewImpl3 == null) {
                                                                glo0Var3.getClass();
                                                            } else if (!glo0Var3.f11503a) {
                                                                glo0Var3.f11503a = true;
                                                                y9b columnHeaderRecyclerView = tableViewImpl3.getColumnHeaderRecyclerView();
                                                                columnHeaderRecyclerView.scrollBy(iIntValue2, 0);
                                                                tableViewImpl3.getHorizontalRecyclerViewListener().d(columnHeaderRecyclerView, iIntValue2, 0);
                                                                glo0Var3.f11503a = false;
                                                            }
                                                            break;
                                                        default:
                                                            TableViewImpl tableViewImpl4 = (TableViewImpl) pz40Var11.getValue();
                                                            if (tableViewImpl4 == null) {
                                                                glo0Var3.getClass();
                                                            } else if (!glo0Var3.f11503a) {
                                                                glo0Var3.f11503a = true;
                                                                y9b columnHeaderRecyclerView2 = tableViewImpl4.getColumnHeaderRecyclerView();
                                                                columnHeaderRecyclerView2.scrollBy(iIntValue2, 0);
                                                                tableViewImpl4.getHorizontalRecyclerViewListener().d(columnHeaderRecyclerView2, iIntValue2, 0);
                                                                glo0Var3.f11503a = false;
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            };
                                            horizontalRecyclerViewListener.getClass();
                                            horizontalRecyclerViewListener.h = xdrVar;
                                            return tableViewImpl;
                                        default:
                                            context.getClass();
                                            TableViewImpl tableViewImpl2 = new TableViewImpl(context, null, 0);
                                            pz40Var10.setValue(tableViewImpl2);
                                            gva gvaVar = new gva(tableViewImpl2, true, R.dimen.text_12);
                                            gvaVar.l = tableViewImpl2;
                                            tableViewImpl2.setAdapter(gvaVar);
                                            pz40Var9.setValue(gvaVar);
                                            vlw horizontalRecyclerViewListener2 = tableViewImpl2.getHorizontalRecyclerViewListener();
                                            xdr xdrVar2 = new xdr() { // from class: a.h0a0
                                                @Override // a.xdr
                                                public final Object F(Object obj13, Object obj14, Object obj15) {
                                                    byte b7 = b6;
                                                    pz40 pz40Var11 = pz40Var8;
                                                    glo0 glo0Var3 = glo0Var2;
                                                    int iIntValue2 = ((Integer) obj13).intValue();
                                                    ((Boolean) obj14).getClass();
                                                    ((Boolean) obj15).getClass();
                                                    switch (b7) {
                                                        case 0:
                                                            TableViewImpl tableViewImpl3 = (TableViewImpl) pz40Var11.getValue();
                                                            if (tableViewImpl3 == null) {
                                                                glo0Var3.getClass();
                                                            } else if (!glo0Var3.f11503a) {
                                                                glo0Var3.f11503a = true;
                                                                y9b columnHeaderRecyclerView = tableViewImpl3.getColumnHeaderRecyclerView();
                                                                columnHeaderRecyclerView.scrollBy(iIntValue2, 0);
                                                                tableViewImpl3.getHorizontalRecyclerViewListener().d(columnHeaderRecyclerView, iIntValue2, 0);
                                                                glo0Var3.f11503a = false;
                                                            }
                                                            break;
                                                        default:
                                                            TableViewImpl tableViewImpl4 = (TableViewImpl) pz40Var11.getValue();
                                                            if (tableViewImpl4 == null) {
                                                                glo0Var3.getClass();
                                                            } else if (!glo0Var3.f11503a) {
                                                                glo0Var3.f11503a = true;
                                                                y9b columnHeaderRecyclerView2 = tableViewImpl4.getColumnHeaderRecyclerView();
                                                                columnHeaderRecyclerView2.scrollBy(iIntValue2, 0);
                                                                tableViewImpl4.getHorizontalRecyclerViewListener().d(columnHeaderRecyclerView2, iIntValue2, 0);
                                                                glo0Var3.f11503a = false;
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            };
                                            horizontalRecyclerViewListener2.getClass();
                                            horizontalRecyclerViewListener2.h = xdrVar2;
                                            return tableViewImpl2;
                                    }
                                }
                            };
                            fetVar.o0(function3);
                            objP3 = function3;
                        } else {
                            pz40Var = pz40Var7;
                        }
                        Function1 function4 = (Function1) objP3;
                        boolean zI4 = fetVar.i(ivaVar);
                        Object objP4 = fetVar.P();
                        if (zI4 || objP4 == cl5Var) {
                            objP4 = new jl40((Object) ivaVar, (Object) pz40Var, (Object) pz40Var6, (byte) 23);
                            fetVar.o0(objP4);
                        }
                        dwi0.b(function4, mm40VarE, (Function1) objP4, fetVar, 0, 0);
                        fetVar.r(false);
                    }
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                knx.o((vs4) obj10, (jkm) obj9, (Function0) obj8, (Function1) obj7, (Function1) obj6, (Function1) obj5, (Function1) obj4, (Function0) obj3, (mm40) obj11, (fet) obj, x8x.L(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                n4c.o((mm40) obj11, (f3v0) obj10, (bbn) obj9, (ezj) obj8, (gy40) obj7, (Function2) obj6, (Function0) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                sj3.t((mm40) obj11, (l7m0) obj10, (Function0) obj9, (ugd) obj8, (ugd) obj7, (ugd) obj6, (ugd) obj5, (ugd) obj4, (ugd) obj3, (fet) obj, x8x.L(920349703));
                break;
            case 4:
                ((Integer) obj2).getClass();
                lv00.J((w2d) obj11, (cp50) obj10, (xdr) obj9, (xdr) obj8, (Function2) obj7, (Function0) obj6, (Function1) obj5, (Function1) obj4, (Function0) obj3, (fet) obj, x8x.L(9));
                break;
            case 5:
                ((Integer) obj2).getClass();
                y860.D((ArrayList) obj11, (ArrayList) obj10, (fqm) obj9, (xdr) obj8, (Function1) obj7, (Function2) obj6, (Function0) obj5, (Function1) obj4, (Function1) obj3, (fet) obj, x8x.L(4103));
                break;
            default:
                ((Integer) obj2).getClass();
                hp4.p((mm40) obj11, (ta90) obj10, (ctf0) obj9, (Function1) obj8, (Function1) obj7, (Function1) obj6, (Function1) obj5, (Function1) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ j0a0(mm40 mm40Var, glo0 glo0Var, iva ivaVar, pz40 pz40Var, pz40 pz40Var2, pz40 pz40Var3, pz40 pz40Var4, pz40 pz40Var5, pz40 pz40Var6) {
        this.f15674a = (byte) 0;
        this.b = mm40Var;
        this.c = glo0Var;
        this.d = ivaVar;
        this.e = pz40Var;
        this.f = pz40Var2;
        this.g = pz40Var3;
        this.h = pz40Var4;
        this.i = pz40Var5;
        this.j = pz40Var6;
    }

    public /* synthetic */ j0a0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, wdr wdrVar, wdr wdrVar2, wdr wdrVar3, wdr wdrVar4, int i, byte b) {
        this.f15674a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = wdrVar;
        this.h = wdrVar2;
        this.i = wdrVar3;
        this.j = wdrVar4;
    }
}
