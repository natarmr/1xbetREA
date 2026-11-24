.class public final Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getGameFragmentScreen$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/github/terrakok/cicerone/androidx/FragmentScreen;
.implements Lorg/xplatform/ufc/api/navigation/UfcScreensFactory$UfcGameScreen;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\n\u0018\u00002\u00020\u00012\u00020\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "org/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getGameFragmentScreen$1",
        "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;",
        "Lorg/xplatform/ufc/api/navigation/UfcScreensFactory$UfcGameScreen;",
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
.field public final synthetic a:J

.field public final synthetic b:Z

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:J

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:I


# direct methods
.method public constructor <init>(IJJJJLjava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p2, p0, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getGameFragmentScreen$1;->a:J

    .line 5
    .line 6
    iput-boolean p11, p0, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getGameFragmentScreen$1;->b:Z

    .line 7
    .line 8
    iput-wide p4, p0, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getGameFragmentScreen$1;->c:J

    .line 9
    .line 10
    iput-wide p6, p0, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getGameFragmentScreen$1;->d:J

    .line 11
    .line 12
    iput-wide p8, p0, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getGameFragmentScreen$1;->e:J

    .line 13
    .line 14
    iput-object p10, p0, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getGameFragmentScreen$1;->f:Ljava/lang/String;

    .line 15
    .line 16
    iput p1, p0, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getGameFragmentScreen$1;->g:I

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(La/m1r;)Landroidx/fragment/app/Fragment;
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p1, La/mcs;->Z1:La/bek;

    .line 5
    .line 6
    new-instance v0, Lorg/xplatform/ufc/api/game/UfcGameParams;

    .line 7
    .line 8
    iget-object v10, p0, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getGameFragmentScreen$1;->f:Ljava/lang/String;

    .line 9
    .line 10
    iget v1, p0, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getGameFragmentScreen$1;->g:I

    .line 11
    .line 12
    iget-wide v2, p0, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getGameFragmentScreen$1;->a:J

    .line 13
    .line 14
    iget-wide v4, p0, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getGameFragmentScreen$1;->c:J

    .line 15
    .line 16
    iget-wide v6, p0, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getGameFragmentScreen$1;->d:J

    .line 17
    .line 18
    iget-wide v8, p0, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getGameFragmentScreen$1;->e:J

    .line 19
    .line 20
    iget-boolean v11, p0, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getGameFragmentScreen$1;->b:Z

    .line 21
    .line 22
    invoke-direct/range {v0 .. v11}, Lorg/xplatform/ufc/api/game/UfcGameParams;-><init>(IJJJJLjava/lang/String;Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    new-instance p0, La/mcs;

    .line 29
    .line 30
    invoke-direct {p0}, La/mcs;-><init>()V

    .line 31
    .line 32
    .line 33
    sget-object p1, La/mcs;->a2:[La/iiy;

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    aget-object p1, p1, v1

    .line 37
    .line 38
    iget-object v1, p0, La/mcs;->Y1:La/khf0;

    .line 39
    .line 40
    invoke-virtual {v1, p0, p1, v0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 41
    .line 42
    .line 43
    return-object p0
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getGameFragmentScreen$1;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final bridge g()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    return p0
.end method
