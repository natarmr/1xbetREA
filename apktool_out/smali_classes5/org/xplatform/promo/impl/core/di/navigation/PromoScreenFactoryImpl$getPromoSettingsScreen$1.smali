.class public final Lorg/xplatform/promo/impl/core/di/navigation/PromoScreenFactoryImpl$getPromoSettingsScreen$1;
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
        "org/xplatform/promo/impl/core/di/navigation/PromoScreenFactoryImpl$getPromoSettingsScreen$1",
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
.field public final synthetic a:La/zuc0;

.field public final synthetic b:J


# direct methods
.method public constructor <init>(La/zuc0;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/promo/impl/core/di/navigation/PromoScreenFactoryImpl$getPromoSettingsScreen$1;->a:La/zuc0;

    .line 5
    .line 6
    iput-wide p2, p0, Lorg/xplatform/promo/impl/core/di/navigation/PromoScreenFactoryImpl$getPromoSettingsScreen$1;->b:J

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
    iget-object p1, p0, Lorg/xplatform/promo/impl/core/di/navigation/PromoScreenFactoryImpl$getPromoSettingsScreen$1;->a:La/zuc0;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    const/4 v0, 0x0

    .line 11
    iget-wide v1, p0, Lorg/xplatform/promo/impl/core/di/navigation/PromoScreenFactoryImpl$getPromoSettingsScreen$1;->b:J

    .line 12
    .line 13
    if-eqz p1, :cond_4

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    if-eq p1, p0, :cond_3

    .line 17
    .line 18
    const/4 p0, 0x2

    .line 19
    if-eq p1, p0, :cond_2

    .line 20
    .line 21
    const/4 p0, 0x3

    .line 22
    if-eq p1, p0, :cond_1

    .line 23
    .line 24
    const/4 p0, 0x4

    .line 25
    if-ne p1, p0, :cond_0

    .line 26
    .line 27
    sget-object p0, La/znc0;->U1:La/rl70;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    new-instance p0, La/znc0;

    .line 33
    .line 34
    invoke-direct {p0}, La/znc0;-><init>()V

    .line 35
    .line 36
    .line 37
    sget-object p1, La/znc0;->V1:[La/iiy;

    .line 38
    .line 39
    aget-object p1, p1, v0

    .line 40
    .line 41
    iget-object v0, p0, La/znc0;->M1:La/r34;

    .line 42
    .line 43
    invoke-virtual {v0, p0, p1, v1, v2}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 44
    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    return-object p0

    .line 52
    :cond_1
    sget-object p0, La/lmc0;->Q1:La/mi70;

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    new-instance p0, La/lmc0;

    .line 58
    .line 59
    invoke-direct {p0}, La/lmc0;-><init>()V

    .line 60
    .line 61
    .line 62
    sget-object p1, La/lmc0;->R1:[La/iiy;

    .line 63
    .line 64
    aget-object p1, p1, v0

    .line 65
    .line 66
    iget-object v0, p0, La/lmc0;->L1:La/r34;

    .line 67
    .line 68
    invoke-virtual {v0, p0, p1, v1, v2}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 69
    .line 70
    .line 71
    return-object p0

    .line 72
    :cond_2
    sget-object p0, La/jmc0;->U1:La/nh70;

    .line 73
    .line 74
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    new-instance p0, La/jmc0;

    .line 78
    .line 79
    invoke-direct {p0}, La/jmc0;-><init>()V

    .line 80
    .line 81
    .line 82
    sget-object p1, La/jmc0;->V1:[La/iiy;

    .line 83
    .line 84
    aget-object p1, p1, v0

    .line 85
    .line 86
    iget-object v0, p0, La/jmc0;->M1:La/r34;

    .line 87
    .line 88
    invoke-virtual {v0, p0, p1, v1, v2}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 89
    .line 90
    .line 91
    return-object p0

    .line 92
    :cond_3
    sget-object p0, La/r8c0;->U1:La/xi70;

    .line 93
    .line 94
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    new-instance p0, La/r8c0;

    .line 98
    .line 99
    invoke-direct {p0}, La/r8c0;-><init>()V

    .line 100
    .line 101
    .line 102
    sget-object p1, La/r8c0;->V1:[La/iiy;

    .line 103
    .line 104
    aget-object p1, p1, v0

    .line 105
    .line 106
    iget-object v0, p0, La/r8c0;->M1:La/r34;

    .line 107
    .line 108
    invoke-virtual {v0, p0, p1, v1, v2}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 109
    .line 110
    .line 111
    return-object p0

    .line 112
    :cond_4
    sget-object p0, La/m8c0;->V1:La/mi70;

    .line 113
    .line 114
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    new-instance p0, La/m8c0;

    .line 118
    .line 119
    invoke-direct {p0}, La/m8c0;-><init>()V

    .line 120
    .line 121
    .line 122
    sget-object p1, La/m8c0;->W1:[La/iiy;

    .line 123
    .line 124
    aget-object p1, p1, v0

    .line 125
    .line 126
    iget-object v0, p0, La/m8c0;->M1:La/r34;

    .line 127
    .line 128
    invoke-virtual {v0, p0, p1, v1, v2}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 129
    .line 130
    .line 131
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
