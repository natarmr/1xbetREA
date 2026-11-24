.class public final Lorg/xplatform/camera/impl/navigation/CameraScreens$CameraFragmentScreen;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/github/terrakok/cicerone/androidx/FragmentScreen;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "org/xplatform/camera/impl/navigation/CameraScreens$CameraFragmentScreen",
        "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, La/kkd0;->b:La/kkd0;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/m1r;)Landroidx/fragment/app/Fragment;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, La/qz9;->t2:La/kl5;

    .line 5
    .line 6
    sget-object p1, La/kkd0;->b:La/kkd0;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance p0, La/qz9;

    .line 12
    .line 13
    invoke-direct {p0}, La/qz9;-><init>()V

    .line 14
    .line 15
    .line 16
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 17
    .line 18
    new-instance v0, Ljava/lang/Exception;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance v1, La/g0g0;

    .line 24
    .line 25
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    sget-object v0, La/qz9;->u2:[La/iiy;

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    aget-object v2, v0, v2

    .line 32
    .line 33
    new-instance v3, La/j0g0;

    .line 34
    .line 35
    invoke-direct {v3, v1}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/qz9;->e2:La/yzn0;

    .line 39
    .line 40
    invoke-virtual {v1, p0, v2, v3}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 41
    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    aget-object v0, v0, v1

    .line 45
    .line 46
    iget-object v1, p0, La/qz9;->d2:La/yzn0;

    .line 47
    .line 48
    invoke-virtual {v1, p0, v0, p1}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 49
    .line 50
    .line 51
    return-object p0
.end method

.method public final b()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, La/ufx;->C(La/m7h0;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final bridge g()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    return p0
.end method
