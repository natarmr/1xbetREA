.class public final La/xv9;
.super Landroid/hardware/camera2/CameraManager$AvailabilityCallback;
.source "SourceFile"


# instance fields
.field public final synthetic a:La/hzb0;


# direct methods
.method public constructor <init>(La/hzb0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/xv9;->a:La/hzb0;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/hardware/camera2/CameraManager$AvailabilityCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onCameraAvailable(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, La/g0a;->a(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/g0a;

    .line 8
    .line 9
    invoke-direct {v0, p1}, La/g0a;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, La/xv9;->a:La/hzb0;

    .line 13
    .line 14
    invoke-static {p0, v0}, La/dub;->w0(La/jbi0;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-void
.end method
