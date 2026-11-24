.class public final Lorg/xplatform/results/impl/di/navigation/ResultsScreenFactoryImpl$getChampsCyberScreen$1;
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
        "org/xplatform/results/impl/di/navigation/ResultsScreenFactoryImpl$getChampsCyberScreen$1",
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

.field public final synthetic b:J

.field public final synthetic c:B


# direct methods
.method public constructor <init>(IJLjava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lorg/xplatform/results/impl/di/navigation/ResultsScreenFactoryImpl$getChampsCyberScreen$1;->a:Ljava/util/List;

    .line 5
    .line 6
    iput-wide p2, p0, Lorg/xplatform/results/impl/di/navigation/ResultsScreenFactoryImpl$getChampsCyberScreen$1;->b:J

    .line 7
    .line 8
    iput-byte p1, p0, Lorg/xplatform/results/impl/di/navigation/ResultsScreenFactoryImpl$getChampsCyberScreen$1;->c:B

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
    new-instance v0, Lorg/xplatform/results/impl/presentation/alt_champs/ChampsResultsParams;

    .line 5
    .line 6
    iget-byte v1, p0, Lorg/xplatform/results/impl/di/navigation/ResultsScreenFactoryImpl$getChampsCyberScreen$1;->c:B

    .line 7
    .line 8
    const/4 v5, 0x1

    .line 9
    iget-wide v2, p0, Lorg/xplatform/results/impl/di/navigation/ResultsScreenFactoryImpl$getChampsCyberScreen$1;->b:J

    .line 10
    .line 11
    iget-object v4, p0, Lorg/xplatform/results/impl/di/navigation/ResultsScreenFactoryImpl$getChampsCyberScreen$1;->a:Ljava/util/List;

    .line 12
    .line 13
    invoke-direct/range {v0 .. v5}, Lorg/xplatform/results/impl/presentation/alt_champs/ChampsResultsParams;-><init>(IJLjava/util/List;Z)V

    .line 14
    .line 15
    .line 16
    sget-object p0, La/w62;->Q1:La/pek0;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance p0, La/w62;

    .line 22
    .line 23
    invoke-direct {p0}, La/w62;-><init>()V

    .line 24
    .line 25
    .line 26
    sget-object p1, La/w62;->R1:[La/iiy;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    aget-object p1, p1, v1

    .line 30
    .line 31
    iget-object v1, p0, La/w62;->K1:La/khf0;

    .line 32
    .line 33
    invoke-virtual {v1, p0, p1, v0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 34
    .line 35
    .line 36
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
