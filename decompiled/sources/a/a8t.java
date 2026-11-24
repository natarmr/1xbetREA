package a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.games_mania.presentation.views.GamesManiaDice;
import org.xplatform.games_mania.presentation.views.GamesManiaMapView;

/* JADX INFO: loaded from: classes4.dex */
public final class a8t extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ b8t k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a8t(b8t b8tVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = b8tVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        b8t b8tVar = this.k;
        switch (b) {
            case 0:
                a8t a8tVar = new a8t(b8tVar, yjeVar, (byte) 0);
                a8tVar.j = obj;
                return a8tVar;
            case 1:
                a8t a8tVar2 = new a8t(b8tVar, yjeVar, (byte) 1);
                a8tVar2.j = obj;
                return a8tVar2;
            case 2:
                a8t a8tVar3 = new a8t(b8tVar, yjeVar, (byte) 2);
                a8tVar3.j = obj;
                return a8tVar3;
            case 3:
                a8t a8tVar4 = new a8t(b8tVar, yjeVar, (byte) 3);
                a8tVar4.j = obj;
                return a8tVar4;
            default:
                a8t a8tVar5 = new a8t(b8tVar, yjeVar, (byte) 4);
                a8tVar5.j = obj;
                return a8tVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((a8t) create((g8t) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((a8t) create((l8t) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((a8t) create((r8t) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((a8t) create((m8t) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((a8t) create((v8t) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        byte b = this.i;
        final byte b2 = 1;
        final b8t b8tVar = this.k;
        int i = 0;
        Object[] objArr = 0;
        yje yjeVar = null;
        switch (b) {
            case 0:
                g8t g8tVar = (g8t) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean z = g8tVar instanceof e8t;
                f8t f8tVar = f8t.f9123a;
                if (z) {
                    e8t e8tVar = (e8t) g8tVar;
                    ArrayList arrayList = e8tVar.f7389a;
                    ArrayList arrayList2 = e8tVar.b;
                    String str = e8tVar.c;
                    iiy[] iiyVarArr = b8t.Q1;
                    kie0 kie0Var = new kie0();
                    b8t b8tVar2 = this.k;
                    b8tVar2.I0().y();
                    GamesManiaMapView gamesManiaMapView = b8tVar2.H0().g;
                    gamesManiaMapView.setBonusDiceListener$games_mania(new co0((Object) b8tVar2, (Object) kie0Var, (Object) arrayList, (Object) arrayList2, (Object) gamesManiaMapView, (Object) str, (byte) 6));
                    p7m0 p7m0Var = b8tVar2.I0().s;
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, f8tVar));
                } else if (!Intrinsics.d(g8tVar, f8tVar)) {
                    t9f.b();
                    return null;
                }
                return Unit.f46060a;
            case 1:
                l8t l8tVar = (l8t) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (l8tVar instanceof i8t) {
                    iiy[] iiyVarArr2 = b8t.Q1;
                    GamesManiaDice gamesManiaDice = b8tVar.H0().f;
                    List list = ((i8t) l8tVar).f14356a;
                    list.getClass();
                    gamesManiaDice.a(0L, list);
                } else if (l8tVar instanceof j8t) {
                    ArrayList arrayList3 = ((j8t) l8tVar).f16102a;
                    iiy[] iiyVarArr3 = b8t.Q1;
                    b8tVar.H0().f.b(600L, arrayList3);
                } else if (l8tVar instanceof k8t) {
                    iiy[] iiyVarArr4 = b8t.Q1;
                    GamesManiaDice gamesManiaDice2 = b8tVar.H0().f;
                    gamesManiaDice2.a(0L, q3d.j(new j7t(new Point((int) (((double) gamesManiaDice2.getWidth()) * 0.19d), (int) (((double) gamesManiaDice2.getHeight()) * 0.16d)), 6, 0.0f), new j7t(new Point((int) (((double) gamesManiaDice2.getWidth()) * 0.41d), (int) (((double) gamesManiaDice2.getHeight()) * 0.65d)), 6, 0.0f)));
                } else if (!Intrinsics.d(l8tVar, h8t.f12644a)) {
                    t9f.b();
                    return null;
                }
                return Unit.f46060a;
            case 2:
                r8t r8tVar = (r8t) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (r8tVar instanceof p8t) {
                    p8t p8tVar = (p8t) r8tVar;
                    String str2 = p8tVar.f26575a;
                    String str3 = p8tVar.b;
                    Bitmap bitmap = p8tVar.c;
                    int i2 = p8tVar.d;
                    int i3 = p8tVar.e;
                    int i4 = p8tVar.f;
                    int i5 = p8tVar.g;
                    iiy[] iiyVarArr5 = b8t.Q1;
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
                    layoutParams.leftMargin = i3;
                    layoutParams.topMargin = i2;
                    b8tVar.H0().c.setLayoutParams(layoutParams);
                    b8tVar.H0().m.setText(str2);
                    b8tVar.H0().h.setImageBitmap(bitmap);
                    b8tVar.H0().b.setText(str3);
                    LinearLayout linearLayout = b8tVar.H0().c;
                    final Object[] objArr2 = objArr == true ? 1 : 0;
                    linearLayout.setOnClickListener(new View.OnClickListener() { // from class: a.w7t
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b3 = objArr2;
                            b8t b8tVar3 = b8tVar;
                            switch (b3) {
                                case 0:
                                    iiy[] iiyVarArr6 = b8t.Q1;
                                    b8tVar3.H0().c.setVisibility(8);
                                    b8tVar3.H0();
                                    break;
                                default:
                                    iiy[] iiyVarArr7 = b8t.Q1;
                                    b8tVar3.H0().e.setVisibility(8);
                                    b8tVar3.H0();
                                    break;
                            }
                        }
                    });
                    b8tVar.H0().c.setVisibility(0);
                } else if (r8tVar instanceof q8t) {
                    q8t q8tVar = (q8t) r8tVar;
                    String str4 = q8tVar.f28314a;
                    int i6 = q8tVar.b;
                    int i7 = q8tVar.c;
                    int i8 = q8tVar.d;
                    int i9 = q8tVar.e;
                    iiy[] iiyVarArr6 = b8t.Q1;
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i8, i9);
                    layoutParams2.leftMargin = i7;
                    layoutParams2.topMargin = i6;
                    b8tVar.H0().e.setLayoutParams(layoutParams2);
                    b8tVar.H0().l.setText(str4);
                    b8tVar.H0().e.setOnClickListener(new View.OnClickListener() { // from class: a.w7t
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b3 = b2;
                            b8t b8tVar3 = b8tVar;
                            switch (b3) {
                                case 0:
                                    iiy[] iiyVarArr7 = b8t.Q1;
                                    b8tVar3.H0().c.setVisibility(8);
                                    b8tVar3.H0();
                                    break;
                                default:
                                    iiy[] iiyVarArr8 = b8t.Q1;
                                    b8tVar3.H0().e.setVisibility(8);
                                    b8tVar3.H0();
                                    break;
                            }
                        }
                    });
                    b8tVar.H0().e.setVisibility(0);
                } else if (r8tVar instanceof o8t) {
                    iiy[] iiyVarArr7 = b8t.Q1;
                    b8tVar.H0().c.setVisibility(8);
                    b8tVar.H0().e.setVisibility(8);
                    b8tVar.H0();
                } else if (!Intrinsics.d(r8tVar, n8t.f23105a)) {
                    t9f.b();
                    return null;
                }
                return Unit.f46060a;
            case 3:
                m8t m8tVar = (m8t) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                boolean z2 = m8tVar.f21385a;
                List<Integer> list2 = m8tVar.b;
                boolean z3 = m8tVar.c;
                iiy[] iiyVarArr8 = b8t.Q1;
                Fragment fragmentI = b8tVar.F().I(R.id.onex_holder_menu_container);
                if (fragmentI != null && (fragmentI instanceof hg70)) {
                    ((hg70) fragmentI).H0().f7750a.setVisibility(z2 ? 8 : 0);
                }
                if (z2) {
                    if (z3) {
                        a9t a9tVarI0 = b8tVar.I0();
                        String strH = b8tVar.H(R.string.games_mania_puzzle_exists_text);
                        strH.getClass();
                        if (a9tVarI0.z) {
                            sac.V(jiu0.a(a9tVarI0), w8t.f38740a, null, a9tVarI0.k.f22085a, new cbq(a9tVarI0, new wy5(strH), yjeVar, (byte) 23), 10);
                            a9tVarI0.z = false;
                        }
                    }
                    Context contextO0 = b8tVar.o0();
                    View currentFocus = b8tVar.n0().getCurrentFocus();
                    t32 t32Var = new t32((byte) 28);
                    if (currentFocus != null) {
                        new Handler(Looper.getMainLooper()).postDelayed(new b1(contextO0, currentFocus.getWindowToken(), t32Var, (byte) 2), 0L);
                    }
                    b8tVar.H0().k.b.setVisibility(0);
                    List<Integer> puzzleList$games_mania = b8tVar.H0().g.getPuzzleList$games_mania();
                    if (!puzzleList$games_mania.isEmpty()) {
                        list2 = puzzleList$games_mania;
                    }
                    for (Object obj2 : list2) {
                        int i10 = i + 1;
                        if (i < 0) {
                            q3d.p();
                            throw null;
                        }
                        ((Number) obj2).intValue();
                        ((ImageView) b8tVar.O1.get(i)).setAlpha(1.0f);
                        i = i10;
                    }
                } else {
                    b8tVar.H0().k.b.setVisibility(4);
                }
                return Unit.f46060a;
            default:
                v8t v8tVar = (v8t) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                boolean z4 = v8tVar instanceof u8t;
                t8t t8tVar = t8t.f33528a;
                if (z4) {
                    u8t u8tVar = (u8t) v8tVar;
                    k7t k7tVar = u8tVar.f35248a;
                    List list3 = u8tVar.b;
                    boolean z5 = u8tVar.c;
                    iiy[] iiyVarArr9 = b8t.Q1;
                    b8tVar.G0(k7tVar, list3, z5);
                    a9t a9tVarI1 = b8tVar.I0();
                    a9tVarI1.B = true;
                    p7m0 p7m0Var2 = a9tVarI1.r;
                    do {
                        value3 = p7m0Var2.getValue();
                    } while (!p7m0Var2.m(value3, t8tVar));
                } else if (v8tVar instanceof s8t) {
                    s8t s8tVar = (s8t) v8tVar;
                    k7t k7tVar2 = s8tVar.f31819a;
                    if (!k7tVar2.equals(k7t.g)) {
                        ArrayList arrayList4 = new ArrayList();
                        iiy[] iiyVarArr10 = b8t.Q1;
                        b8tVar.G0(k7tVar2, arrayList4, false);
                    }
                    k7t k7tVar3 = s8tVar.b;
                    k7t k7tVar4 = s8tVar.c;
                    String str5 = s8tVar.d;
                    iiy[] iiyVarArr11 = b8t.Q1;
                    b8tVar.I0().y();
                    b8tVar.H0().g.b(k7tVar3, k7tVar4, str5, false);
                    b8tVar.H0().g.invalidate();
                    a9t a9tVarI2 = b8tVar.I0();
                    a9tVarI2.B = true;
                    p7m0 p7m0Var3 = a9tVarI2.r;
                    do {
                        value2 = p7m0Var3.getValue();
                    } while (!p7m0Var3.m(value2, t8tVar));
                } else if (!Intrinsics.d(v8tVar, t8tVar)) {
                    t9f.b();
                    return null;
                }
                return Unit.f46060a;
        }
    }
}
