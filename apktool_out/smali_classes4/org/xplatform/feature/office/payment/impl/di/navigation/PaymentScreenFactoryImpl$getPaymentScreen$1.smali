.class public final Lorg/xplatform/feature/office/payment/impl/di/navigation/PaymentScreenFactoryImpl$getPaymentScreen$1;
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
        "org/xplatform/feature/office/payment/impl/di/navigation/PaymentScreenFactoryImpl$getPaymentScreen$1",
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
.field public final synthetic a:La/r990;

.field public final synthetic b:Z

.field public final synthetic c:J


# direct methods
.method public constructor <init>(La/r990;ZJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/feature/office/payment/impl/di/navigation/PaymentScreenFactoryImpl$getPaymentScreen$1;->a:La/r990;

    .line 5
    .line 6
    iput-boolean p2, p0, Lorg/xplatform/feature/office/payment/impl/di/navigation/PaymentScreenFactoryImpl$getPaymentScreen$1;->b:Z

    .line 7
    .line 8
    iput-wide p3, p0, Lorg/xplatform/feature/office/payment/impl/di/navigation/PaymentScreenFactoryImpl$getPaymentScreen$1;->c:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(La/m1r;)Landroidx/fragment/app/Fragment;
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lorg/xplatform/feature/office/payment/impl/di/navigation/PaymentScreenFactoryImpl$getPaymentScreen$1;->a:La/r990;

    .line 5
    .line 6
    iget-object p1, p1, La/r990;->a:La/r9u;

    .line 7
    .line 8
    sget-object v0, La/ygp;->e:La/ygp;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p1, p1, La/r9u;->a:La/j1q0;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object p1, p1, La/j1q0;->a:La/m1q0;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, La/m1q0;->d(La/ygp;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    const/4 v0, 0x1

    .line 25
    const/4 v1, 0x4

    .line 26
    const/4 v2, 0x3

    .line 27
    const-wide/16 v3, 0x0

    .line 28
    .line 29
    iget-wide v5, p0, Lorg/xplatform/feature/office/payment/impl/di/navigation/PaymentScreenFactoryImpl$getPaymentScreen$1;->c:J

    .line 30
    .line 31
    const/4 v7, -0x1

    .line 32
    iget-boolean p0, p0, Lorg/xplatform/feature/office/payment/impl/di/navigation/PaymentScreenFactoryImpl$getPaymentScreen$1;->b:Z

    .line 33
    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    sget-object p1, La/r790;->Z1:La/xi70;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance p1, La/r790;

    .line 42
    .line 43
    invoke-direct {p1}, La/r790;-><init>()V

    .line 44
    .line 45
    .line 46
    sget-object v8, La/r790;->a2:[La/iiy;

    .line 47
    .line 48
    aget-object v2, v8, v2

    .line 49
    .line 50
    iget-object v9, p1, La/r790;->X1:La/cgx0;

    .line 51
    .line 52
    invoke-virtual {v9, p1, v2, p0}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 53
    .line 54
    .line 55
    iget-object p0, p1, La/r790;->Y1:La/zz2;

    .line 56
    .line 57
    aget-object v1, v8, v1

    .line 58
    .line 59
    invoke-virtual {p0, p1, v1, v7}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 60
    .line 61
    .line 62
    cmp-long p0, v5, v3

    .line 63
    .line 64
    if-eqz p0, :cond_0

    .line 65
    .line 66
    iget-object p0, p1, La/r790;->V1:La/r34;

    .line 67
    .line 68
    aget-object v0, v8, v0

    .line 69
    .line 70
    invoke-virtual {p0, p1, v0, v5, v6}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 71
    .line 72
    .line 73
    :cond_0
    return-object p1

    .line 74
    :cond_1
    sget-object p1, La/o890;->f2:La/jh70;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    new-instance p1, La/o890;

    .line 80
    .line 81
    invoke-direct {p1}, La/o890;-><init>()V

    .line 82
    .line 83
    .line 84
    sget-object v8, La/o890;->g2:[La/iiy;

    .line 85
    .line 86
    aget-object v2, v8, v2

    .line 87
    .line 88
    iget-object v9, p1, La/o890;->d2:La/cgx0;

    .line 89
    .line 90
    invoke-virtual {v9, p1, v2, p0}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 91
    .line 92
    .line 93
    iget-object p0, p1, La/o890;->e2:La/zz2;

    .line 94
    .line 95
    aget-object v1, v8, v1

    .line 96
    .line 97
    invoke-virtual {p0, p1, v1, v7}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 98
    .line 99
    .line 100
    const/4 p0, 0x2

    .line 101
    aget-object p0, v8, p0

    .line 102
    .line 103
    iget-object v1, p1, La/o890;->c2:La/phf0;

    .line 104
    .line 105
    const-string v2, ""

    .line 106
    .line 107
    invoke-virtual {v1, p1, p0, v2}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    cmp-long p0, v5, v3

    .line 111
    .line 112
    if-eqz p0, :cond_2

    .line 113
    .line 114
    iget-object p0, p1, La/o890;->b2:La/r34;

    .line 115
    .line 116
    aget-object v0, v8, v0

    .line 117
    .line 118
    invoke-virtual {p0, p1, v0, v5, v6}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 119
    .line 120
    .line 121
    :cond_2
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
