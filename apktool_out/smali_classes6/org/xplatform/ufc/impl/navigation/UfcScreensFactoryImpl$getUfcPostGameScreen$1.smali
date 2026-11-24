.class public final Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getUfcPostGameScreen$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/github/terrakok/cicerone/androidx/FragmentScreen;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\n\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "org/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getUfcPostGameScreen$1",
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


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:J

.field public final synthetic c:J


# direct methods
.method public constructor <init>(JJLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p5, p0, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getUfcPostGameScreen$1;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-wide p1, p0, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getUfcPostGameScreen$1;->b:J

    .line 7
    .line 8
    iput-wide p3, p0, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getUfcPostGameScreen$1;->c:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(La/m1r;)Landroidx/fragment/app/Fragment;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p1, La/m5t0;->R1:La/wxs0;

    .line 5
    .line 6
    new-instance v0, Lorg/xplatform/ufc/api/game/UfcPostGameParams;

    .line 7
    .line 8
    iget-wide v1, p0, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getUfcPostGameScreen$1;->b:J

    .line 9
    .line 10
    iget-wide v3, p0, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getUfcPostGameScreen$1;->c:J

    .line 11
    .line 12
    iget-object v5, p0, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getUfcPostGameScreen$1;->a:Ljava/lang/String;

    .line 13
    .line 14
    invoke-direct/range {v0 .. v5}, Lorg/xplatform/ufc/api/game/UfcPostGameParams;-><init>(JJLjava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance p0, La/m5t0;

    .line 21
    .line 22
    invoke-direct {p0}, La/m5t0;-><init>()V

    .line 23
    .line 24
    .line 25
    sget-object p1, La/m5t0;->S1:[La/iiy;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    aget-object p1, p1, v1

    .line 29
    .line 30
    iget-object v1, p0, La/m5t0;->N1:La/khf0;

    .line 31
    .line 32
    invoke-virtual {v1, p0, p1, v0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 33
    .line 34
    .line 35
    return-object p0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getUfcPostGameScreen$1;->a:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "ufc_post_game_"

    .line 4
    .line 5
    invoke-static {v0, p0}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final bridge g()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    return p0
.end method
