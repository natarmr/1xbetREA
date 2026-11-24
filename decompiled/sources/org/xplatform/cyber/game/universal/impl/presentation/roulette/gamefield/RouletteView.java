package org.xplatform.cyber.game.universal.impl.presentation.roulette.gamefield;

import a.a8z;
import a.c0o;
import a.f0p;
import a.kfg0;
import a.maz;
import a.ohs0;
import a.q7o0;
import a.sue0;
import a.t9f;
import a.tfg0;
import a.ufg0;
import a.weg0;
import a.wez;
import a.y2;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class RouletteView extends ConstraintLayout {
    public final a8z q;
    public kfg0 r;

    /* JADX WARN: Illegal instructions before constructor call */
    public RouletteView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.q = maz.a(wez.b, new sue0(this, this, (byte) 9));
        this.r = kfg0.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q7o0 getBinding() {
        return (q7o0) this.q.getValue();
    }

    private final float getHalfOfSectorByType() {
        int iOrdinal = this.r.ordinal();
        if (iOrdinal == 0) {
            return 4.87f;
        }
        if (iOrdinal == 1) {
            return 4.74f;
        }
        if (iOrdinal == 2) {
            return 0.0f;
        }
        t9f.b();
        return 0.0f;
    }

    public final void setCurrentValue(int i) {
        getBinding().b.setRotation((360.0f - v(i)) + getHalfOfSectorByType());
    }

    public final void setNewValue(int i) {
        if (i != -2) {
            float fV = v(i);
            int iOrdinal = this.r.ordinal();
            Object obj = null;
            int i2 = 0;
            if (iOrdinal == 0) {
                for (Object obj2 : weg0.e) {
                    if (((weg0) obj2).f39018a == i) {
                        obj = obj2;
                        break;
                    }
                }
                weg0 weg0Var = (weg0) obj;
                if (weg0Var != null) {
                    i2 = weg0Var.c;
                }
            } else if (iOrdinal == 1) {
                for (Object obj3 : tfg0.e) {
                    if (((tfg0) obj3).f33864a == i) {
                        obj = obj3;
                        break;
                    }
                }
                tfg0 tfg0Var = (tfg0) obj;
                if (tfg0Var != null) {
                    i2 = tfg0Var.c;
                }
            } else if (iOrdinal != 2) {
                t9f.b();
                return;
            }
            getBinding().b.animate().rotation((360.0f - fV) + getHalfOfSectorByType() + 1800.0f).setInterpolator(new f0p((byte) 2)).setDuration(5000L).setListener(new ufg0(this, i2, i)).start();
        }
    }

    public final void setRouletteImage(int i) {
        getBinding().b.setImageResource(i);
    }

    public final void setType(kfg0 kfg0Var) {
        kfg0Var.getClass();
        this.r = kfg0Var;
    }

    public final float v(int i) {
        int iOrdinal = this.r.ordinal();
        Object obj = null;
        if (iOrdinal == 0) {
            c0o c0oVar = weg0.e;
            y2 y2VarH = ohs0.h(c0oVar, c0oVar);
            while (y2VarH.hasNext()) {
                Object next = y2VarH.next();
                if (((weg0) next).f39018a == i) {
                    obj = next;
                    break;
                }
            }
            weg0 weg0Var = (weg0) obj;
            if (weg0Var != null) {
                return weg0Var.b;
            }
        } else if (iOrdinal == 1) {
            c0o c0oVar2 = tfg0.e;
            y2 y2VarH2 = ohs0.h(c0oVar2, c0oVar2);
            while (y2VarH2.hasNext()) {
                Object next2 = y2VarH2.next();
                if (((tfg0) next2).f33864a == i) {
                    obj = next2;
                    break;
                }
            }
            tfg0 tfg0Var = (tfg0) obj;
            if (tfg0Var != null) {
                return tfg0Var.b;
            }
        } else if (iOrdinal != 2) {
            t9f.b();
            return 0.0f;
        }
        return 0.0f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RouletteView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RouletteView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
