package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: loaded from: classes.dex */
public final class ut40 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt40 f36241a;
    public final int b;
    public final int c;

    public ut40(Context context, vt40 vt40Var, XmlResourceParser xmlResourceParser) {
        this.b = -1;
        this.c = 17;
        this.f36241a = vt40Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), fqd0.o);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.b = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
            } else if (index == 0) {
                this.c = typedArrayObtainStyledAttributes.getInt(index, this.c);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(MotionLayout motionLayout, int i, vt40 vt40Var) {
        int i2 = this.b;
        View viewFindViewById = motionLayout;
        if (i2 != -1) {
            viewFindViewById = motionLayout.findViewById(i2);
        }
        if (viewFindViewById == null) {
            Log.e("MotionScene", "OnClick could not find id " + i2);
            return;
        }
        int i3 = vt40Var.d;
        int i4 = vt40Var.c;
        if (i3 == -1) {
            viewFindViewById.setOnClickListener(this);
            return;
        }
        int i5 = this.c;
        int i6 = i5 & 1;
        boolean z = false;
        boolean z2 = (i6 != 0 && i == i3) | (i6 != 0 && i == i3) | ((i5 & 256) != 0 && i == i3) | ((i5 & 16) != 0 && i == i4);
        if ((i5 & 4096) != 0 && i == i4) {
            z = true;
        }
        if (z2 || z) {
            viewFindViewById.setOnClickListener(this);
        }
    }

    public final void b(MotionLayout motionLayout) {
        int i = this.b;
        if (i == -1) {
            return;
        }
        View viewFindViewById = motionLayout.findViewById(i);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(null);
            return;
        }
        Log.e("MotionScene", " (*)  could not find id " + i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        vt40 vt40Var = this.f36241a;
        wt40 wt40Var = vt40Var.j;
        MotionLayout motionLayout = wt40Var.f39722a;
        if (motionLayout.z) {
            if (vt40Var.d == -1) {
                int currentState = motionLayout.getCurrentState();
                if (currentState == -1) {
                    motionLayout.G(vt40Var.c);
                    return;
                }
                vt40 vt40Var2 = new vt40(wt40Var, vt40Var);
                vt40Var2.d = currentState;
                vt40Var2.c = vt40Var.c;
                motionLayout.setTransition(vt40Var2);
                motionLayout.u(1.0f);
                motionLayout.O1 = null;
                return;
            }
            vt40 vt40Var3 = wt40Var.c;
            int i = this.c;
            int i2 = i & 1;
            boolean z = false;
            boolean z2 = true;
            boolean z3 = (i2 == 0 && (i & 256) == 0) ? false : true;
            int i3 = i & 16;
            if (i3 == 0 && (i & 4096) == 0) {
                z2 = false;
            }
            if (z3 && z2) {
                if (vt40Var3 != vt40Var) {
                    motionLayout.setTransition(vt40Var);
                }
                if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                    z2 = false;
                    z = z3;
                }
            } else {
                z = z3;
            }
            if (vt40Var != vt40Var3) {
                int i4 = vt40Var.c;
                int i5 = vt40Var.d;
                int i6 = motionLayout.v;
                if (i5 == -1) {
                    if (i6 == i4) {
                        return;
                    }
                } else if (i6 != i5 && i6 != i4) {
                    return;
                }
            }
            if (z && i2 != 0) {
                motionLayout.setTransition(vt40Var);
                motionLayout.u(1.0f);
                motionLayout.O1 = null;
                return;
            }
            if (z2 && i3 != 0) {
                motionLayout.setTransition(vt40Var);
                motionLayout.u(0.0f);
            } else if (z && (i & 256) != 0) {
                motionLayout.setTransition(vt40Var);
                motionLayout.setProgress(1.0f);
            } else {
                if (!z2 || (i & 4096) == 0) {
                    return;
                }
                motionLayout.setTransition(vt40Var);
                motionLayout.setProgress(0.0f);
            }
        }
    }
}
