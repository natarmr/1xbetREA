.class public final Lorg/xplatform/onboarding/impl/navigation/OnBoardingScreens$TipsDialogScreen;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/github/terrakok/cicerone/androidx/FragmentScreen;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "org/xplatform/onboarding/impl/navigation/OnBoardingScreens$TipsDialogScreen",
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
.field public final a:I

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lorg/xplatform/onboarding/impl/navigation/OnBoardingScreens$TipsDialogScreen;->a:I

    .line 8
    .line 9
    iput-object p2, p0, Lorg/xplatform/onboarding/impl/navigation/OnBoardingScreens$TipsDialogScreen;->b:Ljava/lang/String;

    .line 10
    .line 11
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
    sget-object p1, La/ki60;->q2:La/htz;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lorg/xplatform/onboarding/impl/navigation/OnBoardingScreens$TipsDialogScreen;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v0, La/ki60;

    .line 15
    .line 16
    invoke-direct {v0}, La/ki60;-><init>()V

    .line 17
    .line 18
    .line 19
    sget-object v1, La/ki60;->r2:[La/iiy;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    aget-object v2, v1, v2

    .line 23
    .line 24
    iget-object v3, v0, La/ki60;->n2:La/zz2;

    .line 25
    .line 26
    iget p0, p0, Lorg/xplatform/onboarding/impl/navigation/OnBoardingScreens$TipsDialogScreen;->a:I

    .line 27
    .line 28
    invoke-virtual {v3, v0, v2, p0}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x2

    .line 32
    aget-object p0, v1, p0

    .line 33
    .line 34
    iget-object v1, v0, La/ki60;->o2:La/phf0;

    .line 35
    .line 36
    invoke-virtual {v1, v0, p0, p1}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
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
