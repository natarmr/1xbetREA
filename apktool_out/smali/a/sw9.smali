.class public abstract La/sw9;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/u15;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/u15;

    .line 2
    .line 3
    const-string v1, "camerax.core.appConfig.captureRequestConfigurator"

    .line 4
    .line 5
    const-class v2, La/rw9;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v1, v2, v3}, La/u15;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, La/sw9;->a:La/u15;

    .line 12
    .line 13
    return-void
.end method
