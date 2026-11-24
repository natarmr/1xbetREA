.class public final Lorg/xplatform/limits/ie/impl/navigation/LimitsIeScreens$TimeLimitsIeFragmentScreen;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/github/terrakok/cicerone/androidx/FragmentScreen;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "org/xplatform/limits/ie/impl/navigation/LimitsIeScreens$TimeLimitsIeFragmentScreen",
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
.field public final a:La/xrz;


# direct methods
.method public constructor <init>(La/xrz;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/limits/ie/impl/navigation/LimitsIeScreens$TimeLimitsIeFragmentScreen;->a:La/xrz;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/m1r;)Landroidx/fragment/app/Fragment;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p1, La/akq0;->P1:La/s9m0;

    .line 5
    .line 6
    iget-object p0, p0, Lorg/xplatform/limits/ie/impl/navigation/LimitsIeScreens$TimeLimitsIeFragmentScreen;->a:La/xrz;

    .line 7
    .line 8
    invoke-interface {p0}, La/xrz;->getId()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance p1, La/akq0;

    .line 16
    .line 17
    invoke-direct {p1}, La/akq0;-><init>()V

    .line 18
    .line 19
    .line 20
    sget-object v0, La/akq0;->Q1:[La/iiy;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    aget-object v0, v0, v1

    .line 24
    .line 25
    iget-object v1, p1, La/akq0;->M1:La/zz2;

    .line 26
    .line 27
    invoke-virtual {v1, p1, v0, p0}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 28
    .line 29
    .line 30
    return-object p1
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
