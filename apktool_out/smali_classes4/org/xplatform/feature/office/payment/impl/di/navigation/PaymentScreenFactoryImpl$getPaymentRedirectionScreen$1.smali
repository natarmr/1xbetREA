.class public final Lorg/xplatform/feature/office/payment/impl/di/navigation/PaymentScreenFactoryImpl$getPaymentRedirectionScreen$1;
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
        "org/xplatform/feature/office/payment/impl/di/navigation/PaymentScreenFactoryImpl$getPaymentRedirectionScreen$1",
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

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public constructor <init>(La/r990;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/feature/office/payment/impl/di/navigation/PaymentScreenFactoryImpl$getPaymentRedirectionScreen$1;->a:La/r990;

    .line 5
    .line 6
    iput-object p2, p0, Lorg/xplatform/feature/office/payment/impl/di/navigation/PaymentScreenFactoryImpl$getPaymentRedirectionScreen$1;->b:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(La/m1r;)Landroidx/fragment/app/Fragment;
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lorg/xplatform/feature/office/payment/impl/di/navigation/PaymentScreenFactoryImpl$getPaymentRedirectionScreen$1;->a:La/r990;

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
    const/4 v1, 0x2

    .line 26
    const/4 v2, 0x4

    .line 27
    const/4 v3, 0x3

    .line 28
    const-wide/16 v4, 0x0

    .line 29
    .line 30
    const/4 v6, 0x0

    .line 31
    iget-object p0, p0, Lorg/xplatform/feature/office/payment/impl/di/navigation/PaymentScreenFactoryImpl$getPaymentRedirectionScreen$1;->b:Ljava/lang/String;

    .line 32
    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    sget-object p1, La/r790;->Z1:La/xi70;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    new-instance p1, La/r790;

    .line 41
    .line 42
    invoke-direct {p1}, La/r790;-><init>()V

    .line 43
    .line 44
    .line 45
    sget-object v7, La/r790;->a2:[La/iiy;

    .line 46
    .line 47
    aget-object v3, v7, v3

    .line 48
    .line 49
    iget-object v8, p1, La/r790;->X1:La/cgx0;

    .line 50
    .line 51
    invoke-virtual {v8, p1, v3, v6}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 52
    .line 53
    .line 54
    iget-object v3, p1, La/r790;->Y1:La/zz2;

    .line 55
    .line 56
    aget-object v2, v7, v2

    .line 57
    .line 58
    invoke-virtual {v3, p1, v2, v6}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 59
    .line 60
    .line 61
    iget-object v2, p1, La/r790;->W1:La/phf0;

    .line 62
    .line 63
    aget-object v1, v7, v1

    .line 64
    .line 65
    invoke-virtual {v2, p1, v1, p0}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    iget-object p0, p1, La/r790;->V1:La/r34;

    .line 69
    .line 70
    aget-object v0, v7, v0

    .line 71
    .line 72
    invoke-virtual {p0, p1, v0, v4, v5}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 73
    .line 74
    .line 75
    return-object p1

    .line 76
    :cond_0
    sget-object p1, La/o890;->f2:La/jh70;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    new-instance p1, La/o890;

    .line 82
    .line 83
    invoke-direct {p1}, La/o890;-><init>()V

    .line 84
    .line 85
    .line 86
    sget-object v7, La/o890;->g2:[La/iiy;

    .line 87
    .line 88
    aget-object v3, v7, v3

    .line 89
    .line 90
    iget-object v8, p1, La/o890;->d2:La/cgx0;

    .line 91
    .line 92
    invoke-virtual {v8, p1, v3, v6}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 93
    .line 94
    .line 95
    iget-object v3, p1, La/o890;->e2:La/zz2;

    .line 96
    .line 97
    aget-object v2, v7, v2

    .line 98
    .line 99
    invoke-virtual {v3, p1, v2, v6}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 100
    .line 101
    .line 102
    iget-object v2, p1, La/o890;->c2:La/phf0;

    .line 103
    .line 104
    aget-object v1, v7, v1

    .line 105
    .line 106
    invoke-virtual {v2, p1, v1, p0}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    iget-object p0, p1, La/o890;->b2:La/r34;

    .line 110
    .line 111
    aget-object v0, v7, v0

    .line 112
    .line 113
    invoke-virtual {p0, p1, v0, v4, v5}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 114
    .line 115
    .line 116
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
