package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.segmented_control.DsSegmentedGroup;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kz9 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kz9 f19143a = new kz9(1, rz9.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/camera/impl/databinding/CameraFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.camera_fragment, (ViewGroup) null, false);
        int i = R.id.applyButton;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) yum0.f(viewInflate, R.id.applyButton);
        if (appCompatImageButton != null) {
            i = R.id.backButton;
            AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) yum0.f(viewInflate, R.id.backButton);
            if (appCompatImageButton2 != null) {
                i = R.id.buttons;
                if (((LinearLayout) yum0.f(viewInflate, R.id.buttons)) != null) {
                    i = R.id.cameraControlsBottomBar;
                    ConstraintLayout constraintLayout = (ConstraintLayout) yum0.f(viewInflate, R.id.cameraControlsBottomBar);
                    if (constraintLayout != null) {
                        i = R.id.cameraPreview;
                        PreviewView previewView = (PreviewView) yum0.f(viewInflate, R.id.cameraPreview);
                        if (previewView != null) {
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                            i = R.id.cancelButton;
                            AppCompatImageButton appCompatImageButton3 = (AppCompatImageButton) yum0.f(viewInflate, R.id.cancelButton);
                            if (appCompatImageButton3 != null) {
                                i = R.id.capturePreviewContainer;
                                ConstraintLayout constraintLayout3 = (ConstraintLayout) yum0.f(viewInflate, R.id.capturePreviewContainer);
                                if (constraintLayout3 != null) {
                                    i = R.id.capturePreviewImage;
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) yum0.f(viewInflate, R.id.capturePreviewImage);
                                    if (appCompatImageView != null) {
                                        i = R.id.flashlightButton;
                                        AppCompatImageButton appCompatImageButton4 = (AppCompatImageButton) yum0.f(viewInflate, R.id.flashlightButton);
                                        if (appCompatImageButton4 != null) {
                                            i = R.id.prepareCameraImage;
                                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) yum0.f(viewInflate, R.id.prepareCameraImage);
                                            if (appCompatImageView2 != null) {
                                                i = R.id.previewControlsBottomBar;
                                                if (((LinearLayout) yum0.f(viewInflate, R.id.previewControlsBottomBar)) != null) {
                                                    i = R.id.switchCameraButton;
                                                    AppCompatImageButton appCompatImageButton5 = (AppCompatImageButton) yum0.f(viewInflate, R.id.switchCameraButton);
                                                    if (appCompatImageButton5 != null) {
                                                        i = R.id.takePhotoButton;
                                                        AppCompatImageButton appCompatImageButton6 = (AppCompatImageButton) yum0.f(viewInflate, R.id.takePhotoButton);
                                                        if (appCompatImageButton6 != null) {
                                                            i = R.id.temporaryPreviewImage;
                                                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) yum0.f(viewInflate, R.id.temporaryPreviewImage);
                                                            if (appCompatImageView3 != null) {
                                                                i = R.id.zoomGroup;
                                                                DsSegmentedGroup dsSegmentedGroup = (DsSegmentedGroup) yum0.f(viewInflate, R.id.zoomGroup);
                                                                if (dsSegmentedGroup != null) {
                                                                    return new rz9(constraintLayout2, appCompatImageButton, appCompatImageButton2, constraintLayout, previewView, appCompatImageButton3, constraintLayout3, appCompatImageView, appCompatImageButton4, appCompatImageView2, appCompatImageButton5, appCompatImageButton6, appCompatImageView3, dsSegmentedGroup);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
