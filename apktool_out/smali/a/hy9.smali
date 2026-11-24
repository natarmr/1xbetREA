.class public interface abstract La/hy9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/qae0;


# static fields
.field public static final H:La/u15;

.field public static final J:La/u15;

.field public static final N:La/u15;

.field public static final P:La/u15;

.field public static final W:La/u15;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/u15;

    .line 2
    .line 3
    const-string v1, "camerax.core.camera.useCaseConfigFactory"

    .line 4
    .line 5
    const-class v2, La/ipt0;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v1, v2, v3}, La/u15;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, La/hy9;->H:La/u15;

    .line 12
    .line 13
    new-instance v0, La/u15;

    .line 14
    .line 15
    const-string v1, "camerax.core.camera.useCaseCombinationRequiredRule"

    .line 16
    .line 17
    const-class v2, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-direct {v0, v1, v2, v3}, La/u15;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 20
    .line 21
    .line 22
    sput-object v0, La/hy9;->J:La/u15;

    .line 23
    .line 24
    new-instance v0, La/u15;

    .line 25
    .line 26
    const-string v1, "camerax.core.camera.SessionProcessor"

    .line 27
    .line 28
    const-class v2, La/dki0;

    .line 29
    .line 30
    invoke-direct {v0, v1, v2, v3}, La/u15;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 31
    .line 32
    .line 33
    sput-object v0, La/hy9;->N:La/u15;

    .line 34
    .line 35
    new-instance v0, La/u15;

    .line 36
    .line 37
    const-string v1, "camerax.core.camera.isPostviewSupported"

    .line 38
    .line 39
    const-class v2, Ljava/lang/Boolean;

    .line 40
    .line 41
    invoke-direct {v0, v1, v2, v3}, La/u15;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 42
    .line 43
    .line 44
    sput-object v0, La/hy9;->P:La/u15;

    .line 45
    .line 46
    new-instance v0, La/u15;

    .line 47
    .line 48
    const-string v1, "camerax.core.camera.isCaptureProcessProgressSupported"

    .line 49
    .line 50
    invoke-direct {v0, v1, v2, v3}, La/u15;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 51
    .line 52
    .line 53
    sput-object v0, La/hy9;->W:La/u15;

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public o()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    sget-object v1, La/hy9;->N:La/u15;

    .line 3
    .line 4
    invoke-interface {p0, v1, v0}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-static {}, La/hny;->b()V

    .line 12
    .line 13
    .line 14
    return-void
.end method
