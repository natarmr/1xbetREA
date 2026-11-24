.class public final Lorg/xplatform/aggregator/loyalty_program/impl/navigation/LoyaltyProgramScreenFactoryImpl$getLoyaltyProgramScreen$1;
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
        "org/xplatform/aggregator/loyalty_program/impl/navigation/LoyaltyProgramScreenFactoryImpl$getLoyaltyProgramScreen$1",
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
.field public final synthetic a:La/xzt;

.field public final synthetic b:Lorg/xplatform/aggregator/loyalty_program/api/navigation/models/LoyaltyProgramScreenParams;


# direct methods
.method public constructor <init>(La/xzt;Lorg/xplatform/aggregator/loyalty_program/api/navigation/models/LoyaltyProgramScreenParams;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/aggregator/loyalty_program/impl/navigation/LoyaltyProgramScreenFactoryImpl$getLoyaltyProgramScreen$1;->a:La/xzt;

    .line 5
    .line 6
    iput-object p2, p0, Lorg/xplatform/aggregator/loyalty_program/impl/navigation/LoyaltyProgramScreenFactoryImpl$getLoyaltyProgramScreen$1;->b:Lorg/xplatform/aggregator/loyalty_program/api/navigation/models/LoyaltyProgramScreenParams;

    .line 7
    .line 8
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
    iget-object p1, p0, Lorg/xplatform/aggregator/loyalty_program/impl/navigation/LoyaltyProgramScreenFactoryImpl$getLoyaltyProgramScreen$1;->a:La/xzt;

    .line 5
    .line 6
    iget-object p1, p1, La/xzt;->a:La/pru;

    .line 7
    .line 8
    invoke-virtual {p1}, La/pru;->a()La/sff0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object p1, p1, La/sff0;->b:La/hl1;

    .line 13
    .line 14
    iget-boolean p1, p1, La/hl1;->L:Z

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    iget-object p0, p0, Lorg/xplatform/aggregator/loyalty_program/impl/navigation/LoyaltyProgramScreenFactoryImpl$getLoyaltyProgramScreen$1;->b:Lorg/xplatform/aggregator/loyalty_program/api/navigation/models/LoyaltyProgramScreenParams;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    sget-object p1, La/mg10;->Q1:La/uuz;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    new-instance p1, La/mg10;

    .line 27
    .line 28
    invoke-direct {p1}, La/mg10;-><init>()V

    .line 29
    .line 30
    .line 31
    sget-object v1, La/mg10;->R1:[La/iiy;

    .line 32
    .line 33
    aget-object v0, v1, v0

    .line 34
    .line 35
    iget-object v1, p1, La/mg10;->O1:La/khf0;

    .line 36
    .line 37
    invoke-virtual {v1, p1, v0, p0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 38
    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_0
    sget-object p1, La/ze10;->Q1:La/htz;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    new-instance p1, La/ze10;

    .line 47
    .line 48
    invoke-direct {p1}, La/ze10;-><init>()V

    .line 49
    .line 50
    .line 51
    sget-object v1, La/ze10;->R1:[La/iiy;

    .line 52
    .line 53
    aget-object v0, v1, v0

    .line 54
    .line 55
    iget-object v1, p1, La/ze10;->O1:La/khf0;

    .line 56
    .line 57
    invoke-virtual {v1, p1, v0, p0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 58
    .line 59
    .line 60
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
