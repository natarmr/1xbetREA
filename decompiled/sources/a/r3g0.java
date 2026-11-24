package a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.chips.DsChip;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r3g0 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29787a;
    public final /* synthetic */ a4x b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ r3g0(a4x a4xVar, Function1 function1, byte b) {
        this.f29787a = b;
        this.b = a4xVar;
        this.c = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f29787a;
        Object obj4 = ukd.f35823a;
        final Function1 function1 = this.c;
        a4x<aw40> a4xVar = this.b;
        Object[] objArr = 0;
        final byte b2 = 1;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((bpq) obj).getClass();
        int i = iIntValue & 17;
        switch (b) {
            case 0:
                if (fetVar.U(iIntValue & 1, i != 16)) {
                    for (final aw40 aw40Var : a4xVar) {
                        boolean zI = fetVar.i(aw40Var) | fetVar.g(function1);
                        Object objP = fetVar.P();
                        if (zI || objP == obj4) {
                            final Object[] objArr2 = objArr == true ? 1 : 0;
                            objP = new Function1() { // from class: a.s3g0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    byte b3 = objArr2;
                                    final Function1 function2 = function1;
                                    final aw40 aw40Var2 = aw40Var;
                                    DsChip dsChip = (DsChip) obj5;
                                    switch (b3) {
                                        case 0:
                                            dsChip.getClass();
                                            dsChip.setText("");
                                            dsChip.setText(aw40Var2.b);
                                            String str = aw40Var2.c;
                                            Drawable drawable = dsChip.getContext().getDrawable(R.drawable.ic_glyph_placeholder_player);
                                            Context context = dsChip.getContext();
                                            context.getClass();
                                            wxl wxlVar = wxl.PRIMARY;
                                            Integer numValueOf = Integer.valueOf(m5d.b(R.attr.uikitSecondary, context));
                                            Context context2 = dsChip.getContext();
                                            context2.getClass();
                                            dsChip.f(str, drawable, m5d.d(numValueOf, Integer.valueOf(m5d.b(R.attr.uikitPrimaryForeground, context2))));
                                            final byte b4 = 0;
                                            dsChip.setOnClickListener(new View.OnClickListener() { // from class: a.t3g0
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    byte b5 = b4;
                                                    aw40 aw40Var3 = aw40Var2;
                                                    Function1 function3 = function2;
                                                    switch (b5) {
                                                        case 0:
                                                            aw40Var3.getClass();
                                                            function3.invoke(new k3g0(aw40Var3));
                                                            break;
                                                        default:
                                                            aw40Var3.getClass();
                                                            function3.invoke(new sol0(aw40Var3));
                                                            break;
                                                    }
                                                }
                                            });
                                            break;
                                        default:
                                            dsChip.getClass();
                                            dsChip.setText("");
                                            dsChip.setText(aw40Var2.b);
                                            String str2 = aw40Var2.c;
                                            Drawable drawable2 = dsChip.getContext().getDrawable(R.drawable.ic_glyph_placeholder_player);
                                            Context context3 = dsChip.getContext();
                                            context3.getClass();
                                            wxl wxlVar2 = wxl.PRIMARY;
                                            Integer numValueOf2 = Integer.valueOf(m5d.b(R.attr.uikitSecondary, context3));
                                            Context context4 = dsChip.getContext();
                                            context4.getClass();
                                            dsChip.f(str2, drawable2, m5d.d(numValueOf2, Integer.valueOf(m5d.b(R.attr.uikitPrimaryForeground, context4))));
                                            final byte b5 = 1;
                                            dsChip.setOnClickListener(new View.OnClickListener() { // from class: a.t3g0
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    byte b6 = b5;
                                                    aw40 aw40Var3 = aw40Var2;
                                                    Function1 function3 = function2;
                                                    switch (b6) {
                                                        case 0:
                                                            aw40Var3.getClass();
                                                            function3.invoke(new k3g0(aw40Var3));
                                                            break;
                                                        default:
                                                            aw40Var3.getClass();
                                                            function3.invoke(new sol0(aw40Var3));
                                                            break;
                                                    }
                                                }
                                            });
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            };
                            fetVar.o0(objP);
                        }
                        v3c.n(null, null, (Function1) objP, fetVar, 0, 3);
                    }
                } else {
                    fetVar.X();
                }
                break;
            default:
                if (fetVar.U(iIntValue & 1, i != 16)) {
                    for (final aw40 aw40Var2 : a4xVar) {
                        boolean zI2 = fetVar.i(aw40Var2) | fetVar.g(function1);
                        Object objP2 = fetVar.P();
                        if (zI2 || objP2 == obj4) {
                            objP2 = new Function1() { // from class: a.s3g0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    byte b3 = b2;
                                    final Function1 function2 = function1;
                                    final aw40 aw40Var3 = aw40Var2;
                                    DsChip dsChip = (DsChip) obj5;
                                    switch (b3) {
                                        case 0:
                                            dsChip.getClass();
                                            dsChip.setText("");
                                            dsChip.setText(aw40Var3.b);
                                            String str = aw40Var3.c;
                                            Drawable drawable = dsChip.getContext().getDrawable(R.drawable.ic_glyph_placeholder_player);
                                            Context context = dsChip.getContext();
                                            context.getClass();
                                            wxl wxlVar = wxl.PRIMARY;
                                            Integer numValueOf = Integer.valueOf(m5d.b(R.attr.uikitSecondary, context));
                                            Context context2 = dsChip.getContext();
                                            context2.getClass();
                                            dsChip.f(str, drawable, m5d.d(numValueOf, Integer.valueOf(m5d.b(R.attr.uikitPrimaryForeground, context2))));
                                            final byte b4 = 0;
                                            dsChip.setOnClickListener(new View.OnClickListener() { // from class: a.t3g0
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    byte b6 = b4;
                                                    aw40 aw40Var4 = aw40Var3;
                                                    Function1 function3 = function2;
                                                    switch (b6) {
                                                        case 0:
                                                            aw40Var4.getClass();
                                                            function3.invoke(new k3g0(aw40Var4));
                                                            break;
                                                        default:
                                                            aw40Var4.getClass();
                                                            function3.invoke(new sol0(aw40Var4));
                                                            break;
                                                    }
                                                }
                                            });
                                            break;
                                        default:
                                            dsChip.getClass();
                                            dsChip.setText("");
                                            dsChip.setText(aw40Var3.b);
                                            String str2 = aw40Var3.c;
                                            Drawable drawable2 = dsChip.getContext().getDrawable(R.drawable.ic_glyph_placeholder_player);
                                            Context context3 = dsChip.getContext();
                                            context3.getClass();
                                            wxl wxlVar2 = wxl.PRIMARY;
                                            Integer numValueOf2 = Integer.valueOf(m5d.b(R.attr.uikitSecondary, context3));
                                            Context context4 = dsChip.getContext();
                                            context4.getClass();
                                            dsChip.f(str2, drawable2, m5d.d(numValueOf2, Integer.valueOf(m5d.b(R.attr.uikitPrimaryForeground, context4))));
                                            final byte b5 = 1;
                                            dsChip.setOnClickListener(new View.OnClickListener() { // from class: a.t3g0
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    byte b6 = b5;
                                                    aw40 aw40Var4 = aw40Var3;
                                                    Function1 function3 = function2;
                                                    switch (b6) {
                                                        case 0:
                                                            aw40Var4.getClass();
                                                            function3.invoke(new k3g0(aw40Var4));
                                                            break;
                                                        default:
                                                            aw40Var4.getClass();
                                                            function3.invoke(new sol0(aw40Var4));
                                                            break;
                                                    }
                                                }
                                            });
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            };
                            fetVar.o0(objP2);
                        }
                        v3c.n(null, null, (Function1) objP2, fetVar, 0, 3);
                    }
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
