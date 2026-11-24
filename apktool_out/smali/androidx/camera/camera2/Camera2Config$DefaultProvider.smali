.class public final Landroidx/camera/camera2/Camera2Config$DefaultProvider;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/k4a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "androidx/camera/camera2/Camera2Config$DefaultProvider",
        "La/k4a;",
        "<init>",
        "()V",
        "La/l4a;",
        "getCameraXConfig",
        "()La/l4a;",
        "camera-camera2"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getCameraXConfig()La/l4a;
    .locals 2

    .line 1
    new-instance p0, La/fz9;

    .line 2
    .line 3
    invoke-direct {p0}, La/fz9;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, La/fvt0;

    .line 7
    .line 8
    invoke-direct {v0}, La/fvt0;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, La/fvt0;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, La/wy40;

    .line 14
    .line 15
    sget-object v1, La/l4a;->b:La/u15;

    .line 16
    .line 17
    invoke-virtual {v0, v1, p0}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    new-instance p0, La/ww9;

    .line 21
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sget-object v1, La/l4a;->c:La/u15;

    .line 26
    .line 27
    invoke-virtual {v0, v1, p0}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    new-instance p0, La/xw9;

    .line 31
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    sget-object v1, La/l4a;->d:La/u15;

    .line 36
    .line 37
    invoke-virtual {v0, v1, p0}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    sget-object p0, La/l4a;->l:La/u15;

    .line 41
    .line 42
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 43
    .line 44
    invoke-virtual {v0, p0, v1}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    new-instance p0, La/l4a;

    .line 48
    .line 49
    invoke-static {v0}, La/b780;->j(La/drd;)La/b780;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-direct {p0, v0}, La/l4a;-><init>(La/b780;)V

    .line 54
    .line 55
    .line 56
    return-object p0
.end method
