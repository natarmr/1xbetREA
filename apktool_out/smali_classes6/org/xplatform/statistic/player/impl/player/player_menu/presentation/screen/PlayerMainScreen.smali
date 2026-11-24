.class public final Lorg/xplatform/statistic/player/impl/player/player_menu/presentation/screen/PlayerMainScreen;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/github/terrakok/cicerone/androidx/FragmentScreen;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lorg/xplatform/statistic/player/impl/player/player_menu/presentation/screen/PlayerMainScreen;",
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
.field public final a:Ljava/lang/String;

.field public final b:J

.field public final c:Ljava/lang/String;

.field public final d:La/oaa0;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLjava/lang/String;La/oaa0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lorg/xplatform/statistic/player/impl/player/player_menu/presentation/screen/PlayerMainScreen;->a:Ljava/lang/String;

    .line 11
    .line 12
    iput-wide p2, p0, Lorg/xplatform/statistic/player/impl/player/player_menu/presentation/screen/PlayerMainScreen;->b:J

    .line 13
    .line 14
    iput-object p4, p0, Lorg/xplatform/statistic/player/impl/player/player_menu/presentation/screen/PlayerMainScreen;->c:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p5, p0, Lorg/xplatform/statistic/player/impl/player/player_menu/presentation/screen/PlayerMainScreen;->d:La/oaa0;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(La/m1r;)Landroidx/fragment/app/Fragment;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p1, La/r5a0;->S1:La/mi70;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lorg/xplatform/statistic/player/impl/player/player_menu/presentation/screen/PlayerMainScreen;->a:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lorg/xplatform/statistic/player/impl/player/player_menu/presentation/screen/PlayerMainScreen;->c:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance v1, La/r5a0;

    .line 20
    .line 21
    invoke-direct {v1}, La/r5a0;-><init>()V

    .line 22
    .line 23
    .line 24
    sget-object v2, La/r5a0;->U1:[La/iiy;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    aget-object v3, v2, v3

    .line 28
    .line 29
    iget-object v4, v1, La/r5a0;->K1:La/phf0;

    .line 30
    .line 31
    invoke-virtual {v4, v1, v3, p1}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 p1, 0x1

    .line 35
    aget-object p1, v2, p1

    .line 36
    .line 37
    iget-object v3, v1, La/r5a0;->L1:La/phf0;

    .line 38
    .line 39
    invoke-virtual {v3, v1, p1, v0}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 p1, 0x2

    .line 43
    aget-object p1, v2, p1

    .line 44
    .line 45
    iget-object v0, v1, La/r5a0;->M1:La/r34;

    .line 46
    .line 47
    iget-wide v3, p0, Lorg/xplatform/statistic/player/impl/player/player_menu/presentation/screen/PlayerMainScreen;->b:J

    .line 48
    .line 49
    invoke-virtual {v0, v1, p1, v3, v4}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 50
    .line 51
    .line 52
    const/4 p1, 0x3

    .line 53
    aget-object p1, v2, p1

    .line 54
    .line 55
    iget-object v0, v1, La/r5a0;->N1:La/yzn0;

    .line 56
    .line 57
    iget-object p0, p0, Lorg/xplatform/statistic/player/impl/player/player_menu/presentation/screen/PlayerMainScreen;->d:La/oaa0;

    .line 58
    .line 59
    invoke-virtual {v0, v1, p1, p0}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 60
    .line 61
    .line 62
    return-object v1
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
