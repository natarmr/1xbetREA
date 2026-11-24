package a;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ghl extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final agc f11306a;

    public ghl(agc agcVar) {
        this.f11306a = agcVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            l0q l0qVar = l0q.f19214a;
            agc agcVar = this.f11306a;
            if (Intrinsics.d(agcVar, l0qVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(agcVar instanceof vtm0)) {
                t9f.b();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            vtm0 vtm0Var = (vtm0) agcVar;
            textPaint.setStrokeWidth(vtm0Var.f38015a);
            textPaint.setStrokeMiter(vtm0Var.b);
            int i = vtm0Var.d;
            if (i == 0) {
                join = Paint.Join.MITER;
            } else if (i == 1) {
                join = Paint.Join.ROUND;
            } else {
                join = i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER;
            }
            textPaint.setStrokeJoin(join);
            int i2 = vtm0Var.c;
            if (i2 == 0) {
                cap = Paint.Cap.BUTT;
            } else if (i2 == 1) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
            }
            textPaint.setStrokeCap(cap);
            x03 x03Var = vtm0Var.e;
            textPaint.setPathEffect(x03Var != null ? x03Var.f40050a : null);
        }
    }
}
