.class public final Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getChampionshipFragmentScreen$1;
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
        "org/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getChampionshipFragmentScreen$1",
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


# direct methods
.method public constructor <init>(JLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getChampionshipFragmentScreen$1;->a:J

    .line 5
    .line 6
    iput-object p3, p0, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getChampionshipFragmentScreen$1;->b:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(La/m1r;)Landroidx/fragment/app/Fragment;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p1, La/xjb;->U1:La/kj5;

    .line 5
    .line 6
    new-instance v0, Lorg/xplatform/ufc/api/championship/UfcChampionshipParams;

    .line 7
    .line 8
    iget-wide v1, p0, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getChampionshipFragmentScreen$1;->a:J

    .line 9
    .line 10
    iget-object p0, p0, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getChampionshipFragmentScreen$1;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-direct {v0, v1, v2, p0}, Lorg/xplatform/ufc/api/championship/UfcChampionshipParams;-><init>(JLjava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance p0, La/xjb;

    .line 19
    .line 20
    invoke-direct {p0}, La/xjb;-><init>()V

    .line 21
    .line 22
    .line 23
    sget-object p1, La/xjb;->V1:[La/iiy;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    aget-object p1, p1, v1

    .line 27
    .line 28
    iget-object v1, p0, La/xjb;->N1:La/khf0;

    .line 29
    .line 30
    invoke-virtual {v1, p0, p1, v0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 31
    .line 32
    .line 33
    return-object p0
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getChampionshipFragmentScreen$1;->a:J

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
