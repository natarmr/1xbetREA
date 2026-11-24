.class public final Lorg/xplatform/feature/balance_management/impl/balance_management/BalanceManagementScreenFactoryImpl$getScreen$1;
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
        "org/xplatform/feature/balance_management/impl/balance_management/BalanceManagementScreenFactoryImpl$getScreen$1",
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
.field public final synthetic a:La/lk5;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public constructor <init>(La/lk5;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/feature/balance_management/impl/balance_management/BalanceManagementScreenFactoryImpl$getScreen$1;->a:La/lk5;

    .line 5
    .line 6
    iput-object p2, p0, Lorg/xplatform/feature/balance_management/impl/balance_management/BalanceManagementScreenFactoryImpl$getScreen$1;->b:Ljava/lang/String;

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
    iget-object p1, p0, Lorg/xplatform/feature/balance_management/impl/balance_management/BalanceManagementScreenFactoryImpl$getScreen$1;->a:La/lk5;

    .line 5
    .line 6
    iget-object v0, p1, La/lk5;->a:La/pru;

    .line 7
    .line 8
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v0, v0, La/sff0;->g:La/mum0;

    .line 13
    .line 14
    iget-object v0, v0, La/mum0;->q:La/ye;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x1

    .line 21
    iget-object p0, p0, Lorg/xplatform/feature/balance_management/impl/balance_management/BalanceManagementScreenFactoryImpl$getScreen$1;->b:Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    if-eq v0, v1, :cond_2

    .line 26
    .line 27
    const/4 p1, 0x2

    .line 28
    if-eq v0, p1, :cond_1

    .line 29
    .line 30
    const/4 p1, 0x3

    .line 31
    if-ne v0, p1, :cond_0

    .line 32
    .line 33
    sget-object p1, La/bl5;->R1:La/yk5;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance p1, La/bl5;

    .line 42
    .line 43
    invoke-direct {p1}, La/bl5;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object p0, p1, La/bl5;->O1:Ljava/lang/String;

    .line 47
    .line 48
    return-object p1

    .line 49
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    return-object p0

    .line 54
    :cond_1
    sget-object p1, La/fl5;->P1:La/cl5;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    new-instance p1, La/fl5;

    .line 63
    .line 64
    invoke-direct {p1}, La/fl5;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object p0, p1, La/fl5;->M1:Ljava/lang/String;

    .line 68
    .line 69
    return-object p1

    .line 70
    :cond_2
    sget-object p1, La/ol5;->R1:La/kl5;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    new-instance p1, La/ol5;

    .line 79
    .line 80
    invoke-direct {p1}, La/ol5;-><init>()V

    .line 81
    .line 82
    .line 83
    iput-object p0, p1, La/ol5;->O1:Ljava/lang/String;

    .line 84
    .line 85
    return-object p1

    .line 86
    :cond_3
    iget-object p1, p1, La/lk5;->b:La/r9u;

    .line 87
    .line 88
    sget-object v0, La/ygp;->t1:La/ygp;

    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    iget-object p1, p1, La/r9u;->a:La/j1q0;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    iget-object p1, p1, La/j1q0;->a:La/m1q0;

    .line 99
    .line 100
    invoke-virtual {p1, v0}, La/m1q0;->d(La/ygp;)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_4

    .line 105
    .line 106
    sget-object p1, La/si5;->Q1:La/hfk0;

    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    new-instance p1, La/si5;

    .line 115
    .line 116
    invoke-direct {p1}, La/si5;-><init>()V

    .line 117
    .line 118
    .line 119
    sget-object v0, La/si5;->R1:[La/iiy;

    .line 120
    .line 121
    aget-object v0, v0, v1

    .line 122
    .line 123
    iget-object v1, p1, La/si5;->O1:La/phf0;

    .line 124
    .line 125
    invoke-virtual {v1, p1, v0, p0}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    return-object p1

    .line 129
    :cond_4
    sget-object p1, La/ej5;->V1:La/bj5;

    .line 130
    .line 131
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    new-instance p1, La/ej5;

    .line 138
    .line 139
    invoke-direct {p1}, La/ej5;-><init>()V

    .line 140
    .line 141
    .line 142
    iput-object p0, p1, La/ej5;->P1:Ljava/lang/String;

    .line 143
    .line 144
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
