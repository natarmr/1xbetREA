.class public final Lorg/xplatform/results/impl/di/navigation/ResultsScreenFactoryImpl$getChampsScreen$1;
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
        "org/xplatform/results/impl/di/navigation/ResultsScreenFactoryImpl$getChampsScreen$1",
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
.field public final synthetic a:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/results/impl/di/navigation/ResultsScreenFactoryImpl$getChampsScreen$1;->a:Ljava/util/List;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/m1r;)Landroidx/fragment/app/Fragment;
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p1, La/w62;->Q1:La/pek0;

    .line 5
    .line 6
    new-instance v0, Lorg/xplatform/results/impl/presentation/alt_champs/ChampsResultsParams;

    .line 7
    .line 8
    const-wide/16 v1, 0x0

    .line 9
    .line 10
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    const/4 v1, -0x1

    .line 19
    const-wide/16 v2, 0x0

    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    invoke-direct/range {v0 .. v5}, Lorg/xplatform/results/impl/presentation/alt_champs/ChampsResultsParams;-><init>(IJLjava/util/List;Z)V

    .line 23
    .line 24
    .line 25
    iget-object v9, p0, Lorg/xplatform/results/impl/di/navigation/ResultsScreenFactoryImpl$getChampsScreen$1;->a:Ljava/util/List;

    .line 26
    .line 27
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move v10, v5

    .line 31
    new-instance v5, Lorg/xplatform/results/impl/presentation/alt_champs/ChampsResultsParams;

    .line 32
    .line 33
    move v6, v1

    .line 34
    move-wide v7, v2

    .line 35
    invoke-direct/range {v5 .. v10}, Lorg/xplatform/results/impl/presentation/alt_champs/ChampsResultsParams;-><init>(IJLjava/util/List;Z)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance p0, La/w62;

    .line 42
    .line 43
    invoke-direct {p0}, La/w62;-><init>()V

    .line 44
    .line 45
    .line 46
    sget-object p1, La/w62;->R1:[La/iiy;

    .line 47
    .line 48
    const/4 v0, 0x0

    .line 49
    aget-object p1, p1, v0

    .line 50
    .line 51
    iget-object v0, p0, La/w62;->K1:La/khf0;

    .line 52
    .line 53
    invoke-virtual {v0, p0, p1, v5}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 54
    .line 55
    .line 56
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
