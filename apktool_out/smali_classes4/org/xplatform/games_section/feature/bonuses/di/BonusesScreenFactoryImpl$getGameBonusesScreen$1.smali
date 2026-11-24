.class public final Lorg/xplatform/games_section/feature/bonuses/di/BonusesScreenFactoryImpl$getGameBonusesScreen$1;
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
        "org/xplatform/games_section/feature/bonuses/di/BonusesScreenFactoryImpl$getGameBonusesScreen$1",
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
.field public final synthetic a:J

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:La/csr;


# direct methods
.method public constructor <init>(JLa/csr;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lorg/xplatform/games_section/feature/bonuses/di/BonusesScreenFactoryImpl$getGameBonusesScreen$1;->a:J

    .line 5
    .line 6
    iput-object p4, p0, Lorg/xplatform/games_section/feature/bonuses/di/BonusesScreenFactoryImpl$getGameBonusesScreen$1;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lorg/xplatform/games_section/feature/bonuses/di/BonusesScreenFactoryImpl$getGameBonusesScreen$1;->c:La/csr;

    .line 9
    .line 10
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
    sget-object p1, La/ni8;->U1:La/yk5;

    .line 5
    .line 6
    new-instance v0, La/v3t;

    .line 7
    .line 8
    iget-object v1, p0, Lorg/xplatform/games_section/feature/bonuses/di/BonusesScreenFactoryImpl$getGameBonusesScreen$1;->b:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v2, p0, Lorg/xplatform/games_section/feature/bonuses/di/BonusesScreenFactoryImpl$getGameBonusesScreen$1;->c:La/csr;

    .line 11
    .line 12
    iget-wide v3, p0, Lorg/xplatform/games_section/feature/bonuses/di/BonusesScreenFactoryImpl$getGameBonusesScreen$1;->a:J

    .line 13
    .line 14
    invoke-direct {v0, v3, v4, v2, v1}, La/v3t;-><init>(JLa/csr;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const-string p0, ""

    .line 21
    .line 22
    invoke-static {v0, p0}, La/yk5;->l(La/w3t;Ljava/lang/String;)La/ni8;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
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
