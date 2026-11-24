.class public final Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getNewsMainScreen$1;
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
        "org/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getNewsMainScreen$1",
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
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:Z

.field public final synthetic e:Z


# direct methods
.method public constructor <init>(IIIZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getNewsMainScreen$1;->a:I

    .line 5
    .line 6
    iput p2, p0, Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getNewsMainScreen$1;->b:I

    .line 7
    .line 8
    iput p3, p0, Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getNewsMainScreen$1;->c:I

    .line 9
    .line 10
    iput-boolean p4, p0, Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getNewsMainScreen$1;->d:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getNewsMainScreen$1;->e:Z

    .line 13
    .line 14
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
    sget-object p1, La/lu50;->V1:La/uuz;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance p1, La/lu50;

    .line 10
    .line 11
    invoke-direct {p1}, La/lu50;-><init>()V

    .line 12
    .line 13
    .line 14
    sget-object v0, La/lu50;->W1:[La/iiy;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    aget-object v1, v0, v1

    .line 18
    .line 19
    iget-object v2, p1, La/lu50;->N1:La/zz2;

    .line 20
    .line 21
    iget v3, p0, Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getNewsMainScreen$1;->a:I

    .line 22
    .line 23
    invoke-virtual {v2, p1, v1, v3}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x3

    .line 27
    aget-object v1, v0, v1

    .line 28
    .line 29
    iget-object v2, p1, La/lu50;->P1:La/zz2;

    .line 30
    .line 31
    iget v3, p0, Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getNewsMainScreen$1;->b:I

    .line 32
    .line 33
    invoke-virtual {v2, p1, v1, v3}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 34
    .line 35
    .line 36
    const/4 v1, 0x4

    .line 37
    aget-object v1, v0, v1

    .line 38
    .line 39
    iget-object v2, p1, La/lu50;->Q1:La/cgx0;

    .line 40
    .line 41
    iget-boolean v3, p0, Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getNewsMainScreen$1;->d:Z

    .line 42
    .line 43
    invoke-virtual {v2, p1, v1, v3}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 44
    .line 45
    .line 46
    const/4 v1, 0x2

    .line 47
    aget-object v1, v0, v1

    .line 48
    .line 49
    iget-object v2, p1, La/lu50;->O1:La/zz2;

    .line 50
    .line 51
    iget v3, p0, Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getNewsMainScreen$1;->c:I

    .line 52
    .line 53
    invoke-virtual {v2, p1, v1, v3}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 54
    .line 55
    .line 56
    const/4 v1, 0x5

    .line 57
    aget-object v0, v0, v1

    .line 58
    .line 59
    iget-object v1, p1, La/lu50;->R1:La/cgx0;

    .line 60
    .line 61
    iget-boolean p0, p0, Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getNewsMainScreen$1;->e:Z

    .line 62
    .line 63
    invoke-virtual {v1, p1, v0, p0}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 64
    .line 65
    .line 66
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
