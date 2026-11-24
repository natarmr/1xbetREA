package a;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.uikit.components.segmented_control.DsSegmentedGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class rz9 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f31347a;
    public final AppCompatImageButton b;
    public final AppCompatImageButton c;
    public final ConstraintLayout d;
    public final PreviewView e;
    public final AppCompatImageButton f;
    public final ConstraintLayout g;
    public final AppCompatImageView h;
    public final AppCompatImageButton i;
    public final AppCompatImageView j;
    public final AppCompatImageButton k;
    public final AppCompatImageButton l;
    public final AppCompatImageView m;
    public final DsSegmentedGroup n;

    public rz9(ConstraintLayout constraintLayout, AppCompatImageButton appCompatImageButton, AppCompatImageButton appCompatImageButton2, ConstraintLayout constraintLayout2, PreviewView previewView, AppCompatImageButton appCompatImageButton3, ConstraintLayout constraintLayout3, AppCompatImageView appCompatImageView, AppCompatImageButton appCompatImageButton4, AppCompatImageView appCompatImageView2, AppCompatImageButton appCompatImageButton5, AppCompatImageButton appCompatImageButton6, AppCompatImageView appCompatImageView3, DsSegmentedGroup dsSegmentedGroup) {
        this.f31347a = constraintLayout;
        this.b = appCompatImageButton;
        this.c = appCompatImageButton2;
        this.d = constraintLayout2;
        this.e = previewView;
        this.f = appCompatImageButton3;
        this.g = constraintLayout3;
        this.h = appCompatImageView;
        this.i = appCompatImageButton4;
        this.j = appCompatImageView2;
        this.k = appCompatImageButton5;
        this.l = appCompatImageButton6;
        this.m = appCompatImageView3;
        this.n = dsSegmentedGroup;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f31347a;
    }
}
