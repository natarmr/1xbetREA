.class public final synthetic La/rx9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/o3a;

.field public final synthetic c:Landroid/hardware/camera2/CameraCaptureSession;

.field public final synthetic d:Landroid/hardware/camera2/CaptureRequest;

.field public final synthetic e:Landroid/hardware/camera2/CaptureResult;


# direct methods
.method public synthetic constructor <init>(La/o3a;Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CaptureResult;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/rx9;->a:B

    iput-object p1, p0, La/rx9;->b:La/o3a;

    iput-object p2, p0, La/rx9;->c:Landroid/hardware/camera2/CameraCaptureSession;

    iput-object p3, p0, La/rx9;->d:Landroid/hardware/camera2/CaptureRequest;

    iput-object p4, p0, La/rx9;->e:Landroid/hardware/camera2/CaptureResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-byte v0, p0, La/rx9;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/rx9;->e:Landroid/hardware/camera2/CaptureResult;

    .line 4
    .line 5
    iget-object v2, p0, La/rx9;->d:Landroid/hardware/camera2/CaptureRequest;

    .line 6
    .line 7
    iget-object v3, p0, La/rx9;->c:Landroid/hardware/camera2/CameraCaptureSession;

    .line 8
    .line 9
    iget-object p0, p0, La/rx9;->b:La/o3a;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/o3a;->a:Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    .line 15
    .line 16
    invoke-virtual {p0, v3, v2, v1}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;->onCaptureProgressed(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CaptureResult;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    iget-object p0, p0, La/o3a;->a:Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    .line 21
    .line 22
    invoke-virtual {p0, v3, v2, v1}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;->onCaptureProgressed(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CaptureResult;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
