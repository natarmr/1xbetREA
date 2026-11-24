package org.xplatform.cyber.game.universal.impl.presentation.dartslive.view;

import a.a8z;
import a.i1o0;
import a.i9j;
import a.lhf;
import a.maz;
import a.mnh0;
import a.nnh0;
import a.onh0;
import a.q3d;
import a.s8j;
import a.t9f;
import a.tcq0;
import a.tkz;
import a.tl60;
import a.u0d;
import a.wez;
import a.ycq0;
import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.game.universal.impl.presentation.timerView.SyntheticTimerView;

/* JADX INFO: loaded from: classes4.dex */
public final class DartsLiveView extends ConstraintLayout {
    public static final /* synthetic */ int t = 0;
    public final a8z q;
    public final LinkedHashMap r;
    public final LinkedHashMap s;

    /* JADX WARN: Illegal instructions before constructor call */
    public DartsLiveView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.q = maz.a(wez.b, new lhf(this, this, (byte) 11));
        this.r = new LinkedHashMap();
        this.s = new LinkedHashMap();
    }

    private final i1o0 getBinding() {
        return (i1o0) this.q.getValue();
    }

    public final void A(long j, tkz tkzVar, Long l) {
        SyntheticTimerView.b(getBinding().r, j, tkzVar, l, 4);
    }

    public final void setFieldImage(String str) {
        str.getClass();
        List list = u0d.f34849a;
        u0d.j(getBinding().i, str, 0, 0, null, null, null, 510);
    }

    public final void setFirstPlayerNumberOfThrow(String str) {
        str.getClass();
        getBinding().f.setText(str);
    }

    public final void setFirstPlayerSumOfThrows(String str) {
        str.getClass();
        getBinding().g.setText(str);
    }

    public final void setFirstPlayerThrows(List<s8j> list) {
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        s8j s8jVar = (s8j) CollectionsKt.W(0, list);
        Integer numValueOf = s8jVar != null ? Integer.valueOf(s8jVar.d) : null;
        s8j s8jVar2 = (s8j) CollectionsKt.W(1, list);
        Integer numValueOf2 = s8jVar2 != null ? Integer.valueOf(s8jVar2.d) : null;
        s8j s8jVar3 = (s8j) CollectionsKt.W(2, list);
        Integer numValueOf3 = s8jVar3 != null ? Integer.valueOf(s8jVar3.d) : null;
        if (numValueOf != null) {
            getBinding().c.setText(String.valueOf(numValueOf.intValue()));
        }
        if (numValueOf2 != null) {
            getBinding().d.setText(String.valueOf(numValueOf2.intValue()));
        }
        if (numValueOf3 != null) {
            getBinding().e.setText(String.valueOf(numValueOf3.intValue()));
        }
        z(list, this.r, R.drawable.ic_dart_blue);
    }

    public final void setFirstPlayerTotal(String str) {
        str.getClass();
        getBinding().h.setText(str);
    }

    public final void setSecondPlayerNumberOfThrow(String str) {
        str.getClass();
        getBinding().n.setText(str);
    }

    public final void setSecondPlayerSumOfThrows(String str) {
        str.getClass();
        getBinding().o.setText(str);
    }

    public final void setSecondPlayerThrows(List<s8j> list) {
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        s8j s8jVar = (s8j) CollectionsKt.W(0, list);
        Integer numValueOf = s8jVar != null ? Integer.valueOf(s8jVar.d) : null;
        s8j s8jVar2 = (s8j) CollectionsKt.W(1, list);
        Integer numValueOf2 = s8jVar2 != null ? Integer.valueOf(s8jVar2.d) : null;
        s8j s8jVar3 = (s8j) CollectionsKt.W(2, list);
        Integer numValueOf3 = s8jVar3 != null ? Integer.valueOf(s8jVar3.d) : null;
        if (numValueOf != null) {
            getBinding().k.setText(String.valueOf(numValueOf.intValue()));
        }
        if (numValueOf2 != null) {
            getBinding().l.setText(String.valueOf(numValueOf2.intValue()));
        }
        if (numValueOf3 != null) {
            getBinding().m.setText(String.valueOf(numValueOf3.intValue()));
        }
        z(list, this.s, R.drawable.ic_dart_green);
    }

    public final void setSecondPlayerTotal(String str) {
        str.getClass();
        getBinding().p.setText(str);
    }

    public final void setWinner(String str) {
        str.getClass();
        getBinding().r.setVisibility(str.length() > 0 ? 4 : 0);
        getBinding().s.setVisibility(str.length() != 0 ? 0 : 4);
        getBinding().s.setText(str);
    }

    public final void u() {
        LinkedHashMap linkedHashMap = this.r;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            removeView((ImageView) it.next());
        }
        linkedHashMap.clear();
    }

    public final void v() {
        getBinding().c.setText("");
        getBinding().d.setText("");
        getBinding().e.setText("");
    }

    public final void w() {
        LinkedHashMap linkedHashMap = this.s;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            removeView((ImageView) it.next());
        }
        linkedHashMap.clear();
    }

    public final void x() {
        getBinding().k.setText("");
        getBinding().l.setText("");
        getBinding().m.setText("");
    }

    public final void y() {
        LinkedHashMap linkedHashMap = getBinding().q.f46528a;
        if (linkedHashMap.isEmpty()) {
            return;
        }
        linkedHashMap.clear();
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0114  */
    /* JADX WARN: Code duplicated, block: B:64:0x011a  */
    /* JADX WARN: Code duplicated, block: B:66:0x011d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0123 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0125  */
    /* JADX WARN: Code duplicated, block: B:77:0x0136  */
    /* JADX WARN: Code duplicated, block: B:78:0x013a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0148  */
    /* JADX WARN: Code duplicated, block: B:83:0x014d  */
    public final void z(List list, LinkedHashMap linkedHashMap, int i) {
        float f;
        float f2;
        int iOrdinal;
        float f3;
        float f4;
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            Object obj2 = null;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            s8j s8jVar = (s8j) obj;
            ycq0 ycq0Var = new ycq0(s8jVar.f31803a, s8jVar.b);
            if (linkedHashMap.get(ycq0Var) == null) {
                ImageView imageView = new ImageView(getContext());
                imageView.setImageResource(i);
                addView(imageView);
                linkedHashMap.put(ycq0Var, imageView);
                ImageView imageView2 = getBinding().i;
                tl60.a(imageView2, new i9j(imageView2, imageView2, this, s8jVar, s8jVar.f31803a, s8jVar.b, linkedHashMap, imageView));
            }
            if (i2 == list.size() - 1) {
                SectorView sectorView = getBinding().q;
                int i4 = s8jVar.c;
                for (Object obj3 : mnh0.d) {
                    if (((mnh0) obj3).f22088a == i4) {
                        obj2 = obj3;
                        break;
                    }
                }
                mnh0 mnh0Var = (mnh0) obj2;
                float f5 = 0.0f;
                float f6 = mnh0Var != null ? mnh0Var.b : 0.0f;
                tcq0 tcq0Var = s8jVar.e;
                mnh0[] mnh0VarArr = mnh0.c;
                Paint.Style style = f6 == 50.0f ? Paint.Style.FILL : Paint.Style.STROKE;
                float f7 = (f6 == 50.0f || f6 == 25.0f) ? 360.0f : onh0.f25547a[tcq0Var.ordinal()] == 2 ? 16.45f : 17.0f;
                Paint paint = new Paint();
                paint.setStyle(style);
                Context context = sectorView.getContext();
                context.getClass();
                paint.setColor(context.getColor(R.color.cyber_synthetic_darts_live_throws));
                paint.setAntiAlias(true);
                boolean z = f6 == 50.0f;
                if (f6 == 25.0f) {
                    f = 0.072f;
                } else if (f6 == 50.0f) {
                    f = 0.033f;
                } else {
                    int iOrdinal2 = tcq0Var.ordinal();
                    if (iOrdinal2 == 0) {
                        f = 0.723f;
                    } else if (iOrdinal2 == 1) {
                        f = 0.431f;
                    } else if (iOrdinal2 != 2) {
                        if (iOrdinal2 == 3) {
                            f = 0.479f;
                        } else {
                            if (iOrdinal2 != 4) {
                                t9f.b();
                                return;
                            }
                            f2 = 0.0f;
                        }
                        if (f6 == 25.0f) {
                            f5 = 0.022f;
                        } else {
                            if (f6 != 50.0f) {
                                iOrdinal = tcq0Var.ordinal();
                                if (iOrdinal != 0) {
                                    f5 = 0.118f;
                                } else if (iOrdinal == 1) {
                                    f5 = 0.177f;
                                } else if (iOrdinal != 2 || iOrdinal == 3) {
                                    f3 = 0.0199f;
                                } else if (iOrdinal != 4) {
                                    t9f.b();
                                    return;
                                }
                            }
                            if (onh0.f25547a[tcq0Var.ordinal()] == 2) {
                                f4 = 0.75f;
                            } else {
                                f4 = 0.5f;
                            }
                            sectorView.b = new nnh0(f6, paint, z, f2, f3, f7, f4);
                            sectorView.invalidate();
                        }
                        f3 = f5;
                        if (onh0.f25547a[tcq0Var.ordinal()] == 2) {
                            f4 = 0.75f;
                        } else {
                            f4 = 0.5f;
                        }
                        sectorView.b = new nnh0(f6, paint, z, f2, f3, f7, f4);
                        sectorView.invalidate();
                    } else {
                        f = 0.772f;
                    }
                }
                f2 = f;
                if (f6 == 25.0f) {
                    f5 = 0.022f;
                } else {
                    if (f6 != 50.0f) {
                        iOrdinal = tcq0Var.ordinal();
                        if (iOrdinal != 0) {
                            f5 = 0.118f;
                        } else if (iOrdinal == 1) {
                            if (iOrdinal != 2) {
                            }
                            f3 = 0.0199f;
                        } else {
                            f5 = 0.177f;
                        }
                    }
                    if (onh0.f25547a[tcq0Var.ordinal()] == 2) {
                        f4 = 0.75f;
                    } else {
                        f4 = 0.5f;
                    }
                    sectorView.b = new nnh0(f6, paint, z, f2, f3, f7, f4);
                    sectorView.invalidate();
                }
                f3 = f5;
                if (onh0.f25547a[tcq0Var.ordinal()] == 2) {
                    f4 = 0.75f;
                } else {
                    f4 = 0.5f;
                }
                sectorView.b = new nnh0(f6, paint, z, f2, f3, f7, f4);
                sectorView.invalidate();
            }
            i2 = i3;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DartsLiveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DartsLiveView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
