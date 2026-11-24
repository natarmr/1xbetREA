package a;

import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.InputFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputEditText;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.picker.api.presentation.AnalyticsEntryPoint;
import org.xplatform.picker.api.presentation.PickerParams;
import org.xplatform.uikit.components.search_field.DsSearchField;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/zo90;", "La/stl;", "La/djk;", "<init>", "()V", "a/fl70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class zo90 extends stl<djk> {
    public pni g2;
    public qni h2;
    public final nae0 i2 = ltt0.p(this, yo90.f42974a);
    public final kiu0 j2;
    public final n0o0 k2;
    public final a8z l2;
    public final khf0 m2;
    public final phf0 n2;
    public final khf0 o2;
    public static final /* synthetic */ iiy[] q2 = {new j0d0(zo90.class, "binding", "getBinding()Lorg/xplatform/picker/impl/databinding/DialogPickerBinding;", 0), new ez40(zo90.class, "pickerParams", "getPickerParams()Lorg/xplatform/picker/api/presentation/PickerParams;", 0), new ez40(zo90.class, "customRequestKey", "getCustomRequestKey()Ljava/lang/String;", 0), new ez40(zo90.class, "analyticsEntryPoint", "getAnalyticsEntryPoint()Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;", 0)};
    public static final fl70 p2 = new fl70();

    public zo90() {
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.xo90
            public final /* synthetic */ zo90 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                final byte b3 = 3;
                zo90 zo90Var = this.b;
                switch (b2) {
                    case 0:
                        pni pniVar = zo90Var.g2;
                        if (pniVar == null) {
                            Intrinsics.h("viewModelFactory");
                            throw null;
                        }
                        qni qniVar = zo90Var.h2;
                        if (qniVar != null) {
                            return new t0h0(pniVar, qniVar);
                        }
                        Intrinsics.h("pickerStateHolderFactory");
                        throw null;
                    case 1:
                        fl70 fl70Var = zo90.p2;
                        final yi90 yi90Var = new yi90(1, zo90Var.W0(), es90.class, "onPickerItemClick", "onPickerItemClick(I)V", 0, (byte) 5);
                        vn90 vn90Var = new vn90();
                        final byte b4 = 2;
                        gbn gbnVar = new gbn(new so90((byte) 7), new iv60(3, (byte) 13), new Function1() { // from class: a.to90
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b5 = b4;
                                final byte b6 = 3;
                                final yi90 yi90Var2 = yi90Var;
                                final cp cpVar = (cp) obj;
                                switch (b5) {
                                    case 0:
                                        cpVar.getClass();
                                        final byte b7 = 0;
                                        dyb.O(((pwx) cpVar.u).d, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b8 = b7;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b8) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 3));
                                        break;
                                    case 1:
                                        cpVar.getClass();
                                        FrameLayout frameLayout = ((rwx) cpVar.u).f31236a;
                                        frameLayout.getClass();
                                        final byte b8 = 1;
                                        dyb.O(frameLayout, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b9 = b8;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b9) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 4));
                                        break;
                                    case 2:
                                        cpVar.getClass();
                                        final byte b9 = 2;
                                        dyb.O(((qwx) cpVar.u).d, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b10 = b9;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b10) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 6));
                                        break;
                                    default:
                                        cpVar.getClass();
                                        dyb.O(((twx) cpVar.u).c, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b10 = b6;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b10) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 7));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, xk60.p);
                        dp dpVar = vn90Var.d;
                        dpVar.b(gbnVar);
                        dpVar.b(new gbn(new so90((byte) 8), new iv60(3, (byte) 14), new Function1() { // from class: a.to90
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b5 = b3;
                                final byte b6 = 3;
                                final yi90 yi90Var2 = yi90Var;
                                final cp cpVar = (cp) obj;
                                switch (b5) {
                                    case 0:
                                        cpVar.getClass();
                                        final byte b7 = 0;
                                        dyb.O(((pwx) cpVar.u).d, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b10 = b7;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b10) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 3));
                                        break;
                                    case 1:
                                        cpVar.getClass();
                                        FrameLayout frameLayout = ((rwx) cpVar.u).f31236a;
                                        frameLayout.getClass();
                                        final byte b8 = 1;
                                        dyb.O(frameLayout, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b10 = b8;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b10) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 4));
                                        break;
                                    case 2:
                                        cpVar.getClass();
                                        final byte b9 = 2;
                                        dyb.O(((qwx) cpVar.u).d, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b10 = b9;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b10) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 6));
                                        break;
                                    default:
                                        cpVar.getClass();
                                        dyb.O(((twx) cpVar.u).c, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b10 = b6;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b10) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 7));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, xk60.q));
                        final byte b5 = 0;
                        dpVar.b(new gbn(new so90((byte) 0), new iv60(3, (byte) 10), new Function1() { // from class: a.to90
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b6 = b5;
                                final byte b7 = 3;
                                final yi90 yi90Var2 = yi90Var;
                                final cp cpVar = (cp) obj;
                                switch (b6) {
                                    case 0:
                                        cpVar.getClass();
                                        final byte b8 = 0;
                                        dyb.O(((pwx) cpVar.u).d, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b10 = b8;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b10) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 3));
                                        break;
                                    case 1:
                                        cpVar.getClass();
                                        FrameLayout frameLayout = ((rwx) cpVar.u).f31236a;
                                        frameLayout.getClass();
                                        final byte b9 = 1;
                                        dyb.O(frameLayout, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b10 = b9;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b10) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 4));
                                        break;
                                    case 2:
                                        cpVar.getClass();
                                        final byte b10 = 2;
                                        dyb.O(((qwx) cpVar.u).d, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b11 = b10;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b11) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 6));
                                        break;
                                    default:
                                        cpVar.getClass();
                                        dyb.O(((twx) cpVar.u).c, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b11 = b7;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b11) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 7));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, xk60.m));
                        dpVar.b(new gbn(new so90((byte) 3), new iv60(3, (byte) 12), new ev80((byte) 29), xk60.o));
                        final byte b6 = 1;
                        dpVar.b(new gbn(new so90((byte) 2), new iv60(3, (byte) 11), new Function1() { // from class: a.to90
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b7 = b6;
                                final byte b8 = 3;
                                final yi90 yi90Var2 = yi90Var;
                                final cp cpVar = (cp) obj;
                                switch (b7) {
                                    case 0:
                                        cpVar.getClass();
                                        final byte b9 = 0;
                                        dyb.O(((pwx) cpVar.u).d, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b11 = b9;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b11) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 3));
                                        break;
                                    case 1:
                                        cpVar.getClass();
                                        FrameLayout frameLayout = ((rwx) cpVar.u).f31236a;
                                        frameLayout.getClass();
                                        final byte b10 = 1;
                                        dyb.O(frameLayout, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b11 = b10;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b11) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 4));
                                        break;
                                    case 2:
                                        cpVar.getClass();
                                        final byte b11 = 2;
                                        dyb.O(((qwx) cpVar.u).d, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b12 = b11;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b12) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 6));
                                        break;
                                    default:
                                        cpVar.getClass();
                                        dyb.O(((twx) cpVar.u).c, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b12 = b8;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b12) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 7));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, xk60.n));
                        return vn90Var;
                    case 2:
                        fl70 fl70Var2 = zo90.p2;
                        return new gw5(zo90Var, b3);
                    default:
                        fl70 fl70Var3 = zo90.p2;
                        return Integer.valueOf(zo90Var.G().getDimensionPixelSize(R.dimen.space_24));
                }
            }
        };
        byte b2 = 10;
        wz80 wz80Var = new wz80(this, b2);
        wez wezVar = wez.b;
        byte b3 = 11;
        a8z a8zVarA = maz.a(wezVar, new wz80(wz80Var, b3));
        this.j2 = agc.G(this, sre0.f32672a.b(es90.class), new a190(a8zVarA, b2), new a190(a8zVarA, b3), function0);
        final byte b4 = 1;
        this.k2 = maz.b(new Function0(this) { // from class: a.xo90
            public final /* synthetic */ zo90 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b5 = b4;
                final byte b6 = 3;
                zo90 zo90Var = this.b;
                switch (b5) {
                    case 0:
                        pni pniVar = zo90Var.g2;
                        if (pniVar == null) {
                            Intrinsics.h("viewModelFactory");
                            throw null;
                        }
                        qni qniVar = zo90Var.h2;
                        if (qniVar != null) {
                            return new t0h0(pniVar, qniVar);
                        }
                        Intrinsics.h("pickerStateHolderFactory");
                        throw null;
                    case 1:
                        fl70 fl70Var = zo90.p2;
                        final yi90 yi90Var = new yi90(1, zo90Var.W0(), es90.class, "onPickerItemClick", "onPickerItemClick(I)V", 0, (byte) 5);
                        vn90 vn90Var = new vn90();
                        final byte b7 = 2;
                        gbn gbnVar = new gbn(new so90((byte) 7), new iv60(3, (byte) 13), new Function1() { // from class: a.to90
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b8 = b7;
                                final byte b9 = 3;
                                final yi90 yi90Var2 = yi90Var;
                                final cp cpVar = (cp) obj;
                                switch (b8) {
                                    case 0:
                                        cpVar.getClass();
                                        final byte b10 = 0;
                                        dyb.O(((pwx) cpVar.u).d, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b12 = b10;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b12) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 3));
                                        break;
                                    case 1:
                                        cpVar.getClass();
                                        FrameLayout frameLayout = ((rwx) cpVar.u).f31236a;
                                        frameLayout.getClass();
                                        final byte b11 = 1;
                                        dyb.O(frameLayout, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b12 = b11;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b12) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 4));
                                        break;
                                    case 2:
                                        cpVar.getClass();
                                        final byte b12 = 2;
                                        dyb.O(((qwx) cpVar.u).d, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b13 = b12;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b13) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 6));
                                        break;
                                    default:
                                        cpVar.getClass();
                                        dyb.O(((twx) cpVar.u).c, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b13 = b9;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b13) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 7));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, xk60.p);
                        dp dpVar = vn90Var.d;
                        dpVar.b(gbnVar);
                        dpVar.b(new gbn(new so90((byte) 8), new iv60(3, (byte) 14), new Function1() { // from class: a.to90
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b8 = b6;
                                final byte b9 = 3;
                                final yi90 yi90Var2 = yi90Var;
                                final cp cpVar = (cp) obj;
                                switch (b8) {
                                    case 0:
                                        cpVar.getClass();
                                        final byte b10 = 0;
                                        dyb.O(((pwx) cpVar.u).d, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b13 = b10;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b13) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 3));
                                        break;
                                    case 1:
                                        cpVar.getClass();
                                        FrameLayout frameLayout = ((rwx) cpVar.u).f31236a;
                                        frameLayout.getClass();
                                        final byte b11 = 1;
                                        dyb.O(frameLayout, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b13 = b11;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b13) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 4));
                                        break;
                                    case 2:
                                        cpVar.getClass();
                                        final byte b12 = 2;
                                        dyb.O(((qwx) cpVar.u).d, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b13 = b12;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b13) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 6));
                                        break;
                                    default:
                                        cpVar.getClass();
                                        dyb.O(((twx) cpVar.u).c, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b13 = b9;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b13) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 7));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, xk60.q));
                        final byte b8 = 0;
                        dpVar.b(new gbn(new so90((byte) 0), new iv60(3, (byte) 10), new Function1() { // from class: a.to90
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b9 = b8;
                                final byte b10 = 3;
                                final yi90 yi90Var2 = yi90Var;
                                final cp cpVar = (cp) obj;
                                switch (b9) {
                                    case 0:
                                        cpVar.getClass();
                                        final byte b11 = 0;
                                        dyb.O(((pwx) cpVar.u).d, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b13 = b11;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b13) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 3));
                                        break;
                                    case 1:
                                        cpVar.getClass();
                                        FrameLayout frameLayout = ((rwx) cpVar.u).f31236a;
                                        frameLayout.getClass();
                                        final byte b12 = 1;
                                        dyb.O(frameLayout, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b13 = b12;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b13) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 4));
                                        break;
                                    case 2:
                                        cpVar.getClass();
                                        final byte b13 = 2;
                                        dyb.O(((qwx) cpVar.u).d, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b14 = b13;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b14) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 6));
                                        break;
                                    default:
                                        cpVar.getClass();
                                        dyb.O(((twx) cpVar.u).c, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b14 = b10;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b14) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 7));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, xk60.m));
                        dpVar.b(new gbn(new so90((byte) 3), new iv60(3, (byte) 12), new ev80((byte) 29), xk60.o));
                        final byte b9 = 1;
                        dpVar.b(new gbn(new so90((byte) 2), new iv60(3, (byte) 11), new Function1() { // from class: a.to90
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b10 = b9;
                                final byte b11 = 3;
                                final yi90 yi90Var2 = yi90Var;
                                final cp cpVar = (cp) obj;
                                switch (b10) {
                                    case 0:
                                        cpVar.getClass();
                                        final byte b12 = 0;
                                        dyb.O(((pwx) cpVar.u).d, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b14 = b12;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b14) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 3));
                                        break;
                                    case 1:
                                        cpVar.getClass();
                                        FrameLayout frameLayout = ((rwx) cpVar.u).f31236a;
                                        frameLayout.getClass();
                                        final byte b13 = 1;
                                        dyb.O(frameLayout, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b14 = b13;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b14) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 4));
                                        break;
                                    case 2:
                                        cpVar.getClass();
                                        final byte b14 = 2;
                                        dyb.O(((qwx) cpVar.u).d, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b15 = b14;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b15) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 6));
                                        break;
                                    default:
                                        cpVar.getClass();
                                        dyb.O(((twx) cpVar.u).c, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b15 = b11;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b15) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 7));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, xk60.n));
                        return vn90Var;
                    case 2:
                        fl70 fl70Var2 = zo90.p2;
                        return new gw5(zo90Var, b6);
                    default:
                        fl70 fl70Var3 = zo90.p2;
                        return Integer.valueOf(zo90Var.G().getDimensionPixelSize(R.dimen.space_24));
                }
            }
        });
        final byte b5 = 2;
        this.l2 = maz.a(wezVar, new Function0(this) { // from class: a.xo90
            public final /* synthetic */ zo90 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b6 = b5;
                final byte b7 = 3;
                zo90 zo90Var = this.b;
                switch (b6) {
                    case 0:
                        pni pniVar = zo90Var.g2;
                        if (pniVar == null) {
                            Intrinsics.h("viewModelFactory");
                            throw null;
                        }
                        qni qniVar = zo90Var.h2;
                        if (qniVar != null) {
                            return new t0h0(pniVar, qniVar);
                        }
                        Intrinsics.h("pickerStateHolderFactory");
                        throw null;
                    case 1:
                        fl70 fl70Var = zo90.p2;
                        final yi90 yi90Var = new yi90(1, zo90Var.W0(), es90.class, "onPickerItemClick", "onPickerItemClick(I)V", 0, (byte) 5);
                        vn90 vn90Var = new vn90();
                        final byte b8 = 2;
                        gbn gbnVar = new gbn(new so90((byte) 7), new iv60(3, (byte) 13), new Function1() { // from class: a.to90
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b10 = b8;
                                final byte b11 = 3;
                                final yi90 yi90Var2 = yi90Var;
                                final cp cpVar = (cp) obj;
                                switch (b10) {
                                    case 0:
                                        cpVar.getClass();
                                        final byte b12 = 0;
                                        dyb.O(((pwx) cpVar.u).d, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b15 = b12;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b15) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 3));
                                        break;
                                    case 1:
                                        cpVar.getClass();
                                        FrameLayout frameLayout = ((rwx) cpVar.u).f31236a;
                                        frameLayout.getClass();
                                        final byte b13 = 1;
                                        dyb.O(frameLayout, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b15 = b13;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b15) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 4));
                                        break;
                                    case 2:
                                        cpVar.getClass();
                                        final byte b14 = 2;
                                        dyb.O(((qwx) cpVar.u).d, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b15 = b14;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b15) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 6));
                                        break;
                                    default:
                                        cpVar.getClass();
                                        dyb.O(((twx) cpVar.u).c, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b15 = b11;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b15) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 7));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, xk60.p);
                        dp dpVar = vn90Var.d;
                        dpVar.b(gbnVar);
                        dpVar.b(new gbn(new so90((byte) 8), new iv60(3, (byte) 14), new Function1() { // from class: a.to90
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b10 = b7;
                                final byte b11 = 3;
                                final yi90 yi90Var2 = yi90Var;
                                final cp cpVar = (cp) obj;
                                switch (b10) {
                                    case 0:
                                        cpVar.getClass();
                                        final byte b12 = 0;
                                        dyb.O(((pwx) cpVar.u).d, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b15 = b12;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b15) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 3));
                                        break;
                                    case 1:
                                        cpVar.getClass();
                                        FrameLayout frameLayout = ((rwx) cpVar.u).f31236a;
                                        frameLayout.getClass();
                                        final byte b13 = 1;
                                        dyb.O(frameLayout, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b15 = b13;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b15) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 4));
                                        break;
                                    case 2:
                                        cpVar.getClass();
                                        final byte b14 = 2;
                                        dyb.O(((qwx) cpVar.u).d, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b15 = b14;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b15) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 6));
                                        break;
                                    default:
                                        cpVar.getClass();
                                        dyb.O(((twx) cpVar.u).c, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b15 = b11;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b15) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 7));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, xk60.q));
                        final byte b9 = 0;
                        dpVar.b(new gbn(new so90((byte) 0), new iv60(3, (byte) 10), new Function1() { // from class: a.to90
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b10 = b9;
                                final byte b11 = 3;
                                final yi90 yi90Var2 = yi90Var;
                                final cp cpVar = (cp) obj;
                                switch (b10) {
                                    case 0:
                                        cpVar.getClass();
                                        final byte b12 = 0;
                                        dyb.O(((pwx) cpVar.u).d, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b15 = b12;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b15) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 3));
                                        break;
                                    case 1:
                                        cpVar.getClass();
                                        FrameLayout frameLayout = ((rwx) cpVar.u).f31236a;
                                        frameLayout.getClass();
                                        final byte b13 = 1;
                                        dyb.O(frameLayout, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b15 = b13;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b15) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 4));
                                        break;
                                    case 2:
                                        cpVar.getClass();
                                        final byte b14 = 2;
                                        dyb.O(((qwx) cpVar.u).d, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b15 = b14;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b15) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 6));
                                        break;
                                    default:
                                        cpVar.getClass();
                                        dyb.O(((twx) cpVar.u).c, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b15 = b11;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b15) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 7));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, xk60.m));
                        dpVar.b(new gbn(new so90((byte) 3), new iv60(3, (byte) 12), new ev80((byte) 29), xk60.o));
                        final byte b10 = 1;
                        dpVar.b(new gbn(new so90((byte) 2), new iv60(3, (byte) 11), new Function1() { // from class: a.to90
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b11 = b10;
                                final byte b12 = 3;
                                final yi90 yi90Var2 = yi90Var;
                                final cp cpVar = (cp) obj;
                                switch (b11) {
                                    case 0:
                                        cpVar.getClass();
                                        final byte b13 = 0;
                                        dyb.O(((pwx) cpVar.u).d, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b15 = b13;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b15) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 3));
                                        break;
                                    case 1:
                                        cpVar.getClass();
                                        FrameLayout frameLayout = ((rwx) cpVar.u).f31236a;
                                        frameLayout.getClass();
                                        final byte b14 = 1;
                                        dyb.O(frameLayout, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b15 = b14;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b15) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 4));
                                        break;
                                    case 2:
                                        cpVar.getClass();
                                        final byte b15 = 2;
                                        dyb.O(((qwx) cpVar.u).d, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b16 = b15;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b16) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 6));
                                        break;
                                    default:
                                        cpVar.getClass();
                                        dyb.O(((twx) cpVar.u).c, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b16 = b12;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b16) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 7));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, xk60.n));
                        return vn90Var;
                    case 2:
                        fl70 fl70Var2 = zo90.p2;
                        return new gw5(zo90Var, b7);
                    default:
                        fl70 fl70Var3 = zo90.p2;
                        return Integer.valueOf(zo90Var.G().getDimensionPixelSize(R.dimen.space_24));
                }
            }
        });
        final byte b6 = 3;
        maz.a(wezVar, new Function0(this) { // from class: a.xo90
            public final /* synthetic */ zo90 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b7 = b6;
                final byte b8 = 3;
                zo90 zo90Var = this.b;
                switch (b7) {
                    case 0:
                        pni pniVar = zo90Var.g2;
                        if (pniVar == null) {
                            Intrinsics.h("viewModelFactory");
                            throw null;
                        }
                        qni qniVar = zo90Var.h2;
                        if (qniVar != null) {
                            return new t0h0(pniVar, qniVar);
                        }
                        Intrinsics.h("pickerStateHolderFactory");
                        throw null;
                    case 1:
                        fl70 fl70Var = zo90.p2;
                        final yi90 yi90Var = new yi90(1, zo90Var.W0(), es90.class, "onPickerItemClick", "onPickerItemClick(I)V", 0, (byte) 5);
                        vn90 vn90Var = new vn90();
                        final byte b9 = 2;
                        gbn gbnVar = new gbn(new so90((byte) 7), new iv60(3, (byte) 13), new Function1() { // from class: a.to90
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b11 = b9;
                                final byte b12 = 3;
                                final yi90 yi90Var2 = yi90Var;
                                final cp cpVar = (cp) obj;
                                switch (b11) {
                                    case 0:
                                        cpVar.getClass();
                                        final byte b13 = 0;
                                        dyb.O(((pwx) cpVar.u).d, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b16 = b13;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b16) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 3));
                                        break;
                                    case 1:
                                        cpVar.getClass();
                                        FrameLayout frameLayout = ((rwx) cpVar.u).f31236a;
                                        frameLayout.getClass();
                                        final byte b14 = 1;
                                        dyb.O(frameLayout, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b16 = b14;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b16) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 4));
                                        break;
                                    case 2:
                                        cpVar.getClass();
                                        final byte b15 = 2;
                                        dyb.O(((qwx) cpVar.u).d, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b16 = b15;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b16) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 6));
                                        break;
                                    default:
                                        cpVar.getClass();
                                        dyb.O(((twx) cpVar.u).c, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b16 = b12;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b16) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 7));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, xk60.p);
                        dp dpVar = vn90Var.d;
                        dpVar.b(gbnVar);
                        dpVar.b(new gbn(new so90((byte) 8), new iv60(3, (byte) 14), new Function1() { // from class: a.to90
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b11 = b8;
                                final byte b12 = 3;
                                final yi90 yi90Var2 = yi90Var;
                                final cp cpVar = (cp) obj;
                                switch (b11) {
                                    case 0:
                                        cpVar.getClass();
                                        final byte b13 = 0;
                                        dyb.O(((pwx) cpVar.u).d, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b16 = b13;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b16) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 3));
                                        break;
                                    case 1:
                                        cpVar.getClass();
                                        FrameLayout frameLayout = ((rwx) cpVar.u).f31236a;
                                        frameLayout.getClass();
                                        final byte b14 = 1;
                                        dyb.O(frameLayout, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b16 = b14;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b16) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 4));
                                        break;
                                    case 2:
                                        cpVar.getClass();
                                        final byte b15 = 2;
                                        dyb.O(((qwx) cpVar.u).d, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b16 = b15;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b16) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 6));
                                        break;
                                    default:
                                        cpVar.getClass();
                                        dyb.O(((twx) cpVar.u).c, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b16 = b12;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b16) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 7));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, xk60.q));
                        final byte b10 = 0;
                        dpVar.b(new gbn(new so90((byte) 0), new iv60(3, (byte) 10), new Function1() { // from class: a.to90
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b11 = b10;
                                final byte b12 = 3;
                                final yi90 yi90Var2 = yi90Var;
                                final cp cpVar = (cp) obj;
                                switch (b11) {
                                    case 0:
                                        cpVar.getClass();
                                        final byte b13 = 0;
                                        dyb.O(((pwx) cpVar.u).d, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b16 = b13;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b16) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 3));
                                        break;
                                    case 1:
                                        cpVar.getClass();
                                        FrameLayout frameLayout = ((rwx) cpVar.u).f31236a;
                                        frameLayout.getClass();
                                        final byte b14 = 1;
                                        dyb.O(frameLayout, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b16 = b14;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b16) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 4));
                                        break;
                                    case 2:
                                        cpVar.getClass();
                                        final byte b15 = 2;
                                        dyb.O(((qwx) cpVar.u).d, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b16 = b15;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b16) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 6));
                                        break;
                                    default:
                                        cpVar.getClass();
                                        dyb.O(((twx) cpVar.u).c, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b16 = b12;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b16) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 7));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, xk60.m));
                        dpVar.b(new gbn(new so90((byte) 3), new iv60(3, (byte) 12), new ev80((byte) 29), xk60.o));
                        final byte b11 = 1;
                        dpVar.b(new gbn(new so90((byte) 2), new iv60(3, (byte) 11), new Function1() { // from class: a.to90
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b12 = b11;
                                final byte b13 = 3;
                                final yi90 yi90Var2 = yi90Var;
                                final cp cpVar = (cp) obj;
                                switch (b12) {
                                    case 0:
                                        cpVar.getClass();
                                        final byte b14 = 0;
                                        dyb.O(((pwx) cpVar.u).d, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b16 = b14;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b16) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 3));
                                        break;
                                    case 1:
                                        cpVar.getClass();
                                        FrameLayout frameLayout = ((rwx) cpVar.u).f31236a;
                                        frameLayout.getClass();
                                        final byte b15 = 1;
                                        dyb.O(frameLayout, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b16 = b15;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b16) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 4));
                                        break;
                                    case 2:
                                        cpVar.getClass();
                                        final byte b16 = 2;
                                        dyb.O(((qwx) cpVar.u).d, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b17 = b16;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b17) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 6));
                                        break;
                                    default:
                                        cpVar.getClass();
                                        dyb.O(((twx) cpVar.u).c, new Function1() { // from class: a.ro90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b17 = b13;
                                                cp cpVar2 = cpVar;
                                                yi90 yi90Var3 = yi90Var2;
                                                View view = (View) obj2;
                                                switch (b17) {
                                                    case 0:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((oq90) cpVar2.u()).d));
                                                        break;
                                                    case 1:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((pq90) cpVar2.u()).d));
                                                        break;
                                                    case 2:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((qq90) cpVar2.u()).e));
                                                        break;
                                                    default:
                                                        view.getClass();
                                                        yi90Var3.invoke(Integer.valueOf(((rq90) cpVar2.u()).d));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.t(new ui80(cpVar, (byte) 7));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, xk60.n));
                        return vn90Var;
                    case 2:
                        fl70 fl70Var2 = zo90.p2;
                        return new gw5(zo90Var, b8);
                    default:
                        fl70 fl70Var3 = zo90.p2;
                        return Integer.valueOf(zo90Var.G().getDimensionPixelSize(R.dimen.space_24));
                }
            }
        });
        this.m2 = new khf0("KEY_PARAMS");
        this.n2 = new phf0("CUSTOM_REQUEST_KEY", "");
        this.o2 = new khf0(AnalyticsEntryPoint.b, "ANALYTICS_ENTRY_POINT_KEY");
    }

    @Override // a.sik
    public final int B0() {
        return R.style.ThemeOverlay_AppTheme_BottomSheetDialog;
    }

    @Override // a.stl, a.yo8, a.sd3, a.sik
    public final Dialog C0(Bundle bundle) {
        return super.C0(bundle);
    }

    @Override // a.stl
    public final void S0() {
        LinearLayout linearLayout = Q0().f6190a;
        linearLayout.getClass();
        WeakHashMap weakHashMap = rgu0.f30456a;
        byte b = 12;
        if (!linearLayout.isLaidOut() || linearLayout.isLayoutRequested()) {
            linearLayout.addOnLayoutChangeListener(new w23(this, b));
        } else {
            vcc.f0(i120.V(new Pair("PICKER_DIALOG_TAG", Boolean.TRUE)), this, "PICKER_DIALOG_TAG");
        }
        final byte b2 = 0;
        dyb.O(Q0().h, new Function1(this) { // from class: a.wo90
            public final /* synthetic */ zo90 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object value;
                byte b3 = b2;
                zo90 zo90Var = this.b;
                View view = (View) obj;
                switch (b3) {
                    case 0:
                        fl70 fl70Var = zo90.p2;
                        view.getClass();
                        zo90Var.Q0().g.requestFocus();
                        DsTextField dsTextField = zo90Var.Q0().g;
                        CharSequence text = dsTextField.getText();
                        dsTextField.setSelection(text != null ? text.length() : 0);
                        new Handler(Looper.getMainLooper()).postDelayed(new fy2(zo90Var.o0(), zo90Var.Q0().h, (byte) 2), 500L);
                        es90 es90VarW0 = zo90Var.W0();
                        g090 g090Var = es90VarW0.i;
                        p7m0 p7m0Var = (p7m0) g090Var.b;
                        do {
                            value = p7m0Var.getValue();
                        } while (!p7m0Var.m(value, cr90.a((cr90) value, null, null, null, false, null, null, 509)));
                        ((vzg0) g090Var.f10448a).e("KEY_ENTER_PHONE_CODE_BY_MANUALLY", Boolean.TRUE);
                        es90VarW0.j.A();
                        break;
                    default:
                        fl70 fl70Var2 = zo90.p2;
                        view.getClass();
                        es90 es90VarW1 = zo90Var.W0();
                        sac.V(jiu0.a(es90VarW1), new yr80(es90VarW1, (byte) 4), null, es90VarW1.c.c, new ds90(es90VarW1, null), 10);
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b3 = 1;
        dyb.O(Q0().b, new Function1(this) { // from class: a.wo90
            public final /* synthetic */ zo90 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object value;
                byte b4 = b3;
                zo90 zo90Var = this.b;
                View view = (View) obj;
                switch (b4) {
                    case 0:
                        fl70 fl70Var = zo90.p2;
                        view.getClass();
                        zo90Var.Q0().g.requestFocus();
                        DsTextField dsTextField = zo90Var.Q0().g;
                        CharSequence text = dsTextField.getText();
                        dsTextField.setSelection(text != null ? text.length() : 0);
                        new Handler(Looper.getMainLooper()).postDelayed(new fy2(zo90Var.o0(), zo90Var.Q0().h, (byte) 2), 500L);
                        es90 es90VarW0 = zo90Var.W0();
                        g090 g090Var = es90VarW0.i;
                        p7m0 p7m0Var = (p7m0) g090Var.b;
                        do {
                            value = p7m0Var.getValue();
                        } while (!p7m0Var.m(value, cr90.a((cr90) value, null, null, null, false, null, null, 509)));
                        ((vzg0) g090Var.f10448a).e("KEY_ENTER_PHONE_CODE_BY_MANUALLY", Boolean.TRUE);
                        es90VarW0.j.A();
                        break;
                    default:
                        fl70 fl70Var2 = zo90.p2;
                        view.getClass();
                        es90 es90VarW1 = zo90Var.W0();
                        sac.V(jiu0.a(es90VarW1), new yr80(es90VarW1, (byte) 4), null, es90VarW1.c.c, new ds90(es90VarW1, null), 10);
                        break;
                }
                return Unit.f46060a;
            }
        });
        Q0().e.setAdapter((vn90) this.k2.getValue());
        Q0().f.clearFocus();
        Q0().f6190a.setFocusableInTouchMode(true);
        Q0().f6190a.requestFocus();
        DsSearchField dsSearchField = Q0().f;
        TextInputEditText editText = dsSearchField.getEditText();
        InputFilter[] filters = editText.getFilters();
        filters.getClass();
        editText.setFilters((InputFilter[]) qx3.q(new tpb(b3), filters));
        dsSearchField.getEditText().addTextChangedListener(new jt6(this, b));
        dsSearchField.getEditText().setOnTouchListener(new jw5(this, b));
        DsTextField dsTextField = Q0().g;
        dsTextField.setOnTextPaste(new pl70(dsTextField, (byte) 21));
        dsTextField.setTextDirection(3);
        dsTextField.setImeOptions(6);
        dsTextField.setFilters((InputFilter[]) qx3.q(new tpb((byte) 2), dsTextField.getFilters()));
        dsTextField.a(new jt6(new csw((Object) this, (byte) 6), (byte) 11));
    }

    @Override // a.stl
    public final void T0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ap90.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ap90 ap90Var = (ap90) (ze3Var instanceof ap90 ? ze3Var : null);
            if (ap90Var != null) {
                iiy[] iiyVarArr = q2;
                sni sniVarA = ap90Var.a((PickerParams) this.m2.n(this, iiyVarArr[1]), (AnalyticsEntryPoint) this.o2.n(this, iiyVarArr[3]));
                this.g2 = (pni) sniVarA.l.get();
                this.h2 = (qni) sniVarA.m.get();
                return;
            }
        }
        jf4.n(b1j.i(ap90.class, "Cannot create dependency "));
    }

    @Override // a.stl
    public final void U0() throws Exception {
        es90 es90VarW0 = W0();
        m430 m430Var = new m430(vtb.N((p7m0) es90VarW0.i.b), es90VarW0, (byte) 22);
        Class<zo90> cls = zo90.class;
        hi70 hi70Var = new hi70(2, this, cls, "handleUiState", "handleUiState(Lorg/xplatform/picker/impl/presentation/PickerUiState;)V", 4, (byte) 19);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new w090(m430Var, clzVarW, hi70Var, (yje) null), 3);
        wk30 wk30Var = new wk30(W0().k, (byte) 14);
        hi70 hi70Var2 = new hi70(2, this, cls, "handleAuthPickerEvent", "handleAuthPickerEvent(Lorg/xplatform/picker/impl/presentation/PickerEvent;)V", 4, (byte) 20);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new w090(wk30Var, clzVarW2, hi70Var2, (yje) null), 3);
    }

    @Override // a.stl
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public final djk Q0() {
        Object objN = this.i2.n(q2[0], this);
        objN.getClass();
        return (djk) objN;
    }

    public final es90 W0() {
        return (es90) this.j2.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        BottomSheetBehavior bottomSheetBehavior = this.c2;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.a0.remove((po8) this.l2.getValue());
        }
    }

    @Override // a.stl, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        BottomSheetBehavior bottomSheetBehavior = this.c2;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.y((po8) this.l2.getValue());
        }
    }

    @Override // a.sik, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        vcc.f0(i120.V(new Pair("PICKER_DIALOG_TAG", Boolean.FALSE)), this, "PICKER_DIALOG_TAG");
    }
}
