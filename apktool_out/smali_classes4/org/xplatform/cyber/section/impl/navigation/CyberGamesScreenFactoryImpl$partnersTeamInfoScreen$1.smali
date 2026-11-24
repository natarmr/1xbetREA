.class public final Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$partnersTeamInfoScreen$1;
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
        "org/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$partnersTeamInfoScreen$1",
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

.field public final synthetic c:Z


# direct methods
.method public constructor <init>(La/vqc;Ljava/lang/String;JZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$partnersTeamInfoScreen$1;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-wide p3, p0, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$partnersTeamInfoScreen$1;->b:J

    .line 7
    .line 8
    iput-boolean p5, p0, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$partnersTeamInfoScreen$1;->c:Z

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
    iget-object p1, p0, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$partnersTeamInfoScreen$1;->a:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    sget-object v0, La/uy80;->W1:La/jh70;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v0, La/uy80;

    .line 15
    .line 16
    invoke-direct {v0}, La/uy80;-><init>()V

    .line 17
    .line 18
    .line 19
    sget-object v1, La/uy80;->X1:[La/iiy;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    aget-object v2, v1, v2

    .line 23
    .line 24
    iget-object v3, v0, La/uy80;->Q1:La/phf0;

    .line 25
    .line 26
    invoke-virtual {v3, v0, v2, p1}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x1

    .line 30
    aget-object p1, v1, p1

    .line 31
    .line 32
    iget-object v2, v0, La/uy80;->R1:La/r34;

    .line 33
    .line 34
    iget-wide v3, p0, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$partnersTeamInfoScreen$1;->b:J

    .line 35
    .line 36
    invoke-virtual {v2, v0, p1, v3, v4}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x2

    .line 40
    aget-object p1, v1, p1

    .line 41
    .line 42
    iget-object v1, v0, La/uy80;->S1:La/cgx0;

    .line 43
    .line 44
    iget-boolean p0, p0, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$partnersTeamInfoScreen$1;->c:Z

    .line 45
    .line 46
    invoke-virtual {v1, v0, p1, p0}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 47
    .line 48
    .line 49
    return-object v0
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
