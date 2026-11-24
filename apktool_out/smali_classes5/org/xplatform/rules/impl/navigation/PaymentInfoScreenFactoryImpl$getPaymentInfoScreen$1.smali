.class public final Lorg/xplatform/rules/impl/navigation/PaymentInfoScreenFactoryImpl$getPaymentInfoScreen$1;
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
        "org/xplatform/rules/impl/navigation/PaymentInfoScreenFactoryImpl$getPaymentInfoScreen$1",
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
.field public final synthetic a:La/yox;

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:I

.field public final synthetic e:Z


# direct methods
.method public constructor <init>(La/yox;ILjava/lang/String;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/rules/impl/navigation/PaymentInfoScreenFactoryImpl$getPaymentInfoScreen$1;->a:La/yox;

    .line 5
    .line 6
    iput p2, p0, Lorg/xplatform/rules/impl/navigation/PaymentInfoScreenFactoryImpl$getPaymentInfoScreen$1;->b:I

    .line 7
    .line 8
    iput-object p3, p0, Lorg/xplatform/rules/impl/navigation/PaymentInfoScreenFactoryImpl$getPaymentInfoScreen$1;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput p4, p0, Lorg/xplatform/rules/impl/navigation/PaymentInfoScreenFactoryImpl$getPaymentInfoScreen$1;->d:I

    .line 11
    .line 12
    iput-boolean p5, p0, Lorg/xplatform/rules/impl/navigation/PaymentInfoScreenFactoryImpl$getPaymentInfoScreen$1;->e:Z

    .line 13
    .line 14
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
    iget-object p1, p0, Lorg/xplatform/rules/impl/navigation/PaymentInfoScreenFactoryImpl$getPaymentInfoScreen$1;->a:La/yox;

    .line 5
    .line 6
    iget-object p1, p1, La/yox;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, La/r9u;

    .line 9
    .line 10
    sget-object v0, La/ygp;->C1:La/ygp;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p1, p1, La/r9u;->a:La/j1q0;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object p1, p1, La/j1q0;->a:La/m1q0;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, La/m1q0;->d(La/ygp;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    const/4 v0, 0x4

    .line 27
    const/4 v1, 0x3

    .line 28
    const/4 v2, 0x2

    .line 29
    const/4 v3, 0x1

    .line 30
    iget-boolean v4, p0, Lorg/xplatform/rules/impl/navigation/PaymentInfoScreenFactoryImpl$getPaymentInfoScreen$1;->e:Z

    .line 31
    .line 32
    iget v5, p0, Lorg/xplatform/rules/impl/navigation/PaymentInfoScreenFactoryImpl$getPaymentInfoScreen$1;->d:I

    .line 33
    .line 34
    iget-object v6, p0, Lorg/xplatform/rules/impl/navigation/PaymentInfoScreenFactoryImpl$getPaymentInfoScreen$1;->c:Ljava/lang/String;

    .line 35
    .line 36
    iget p0, p0, Lorg/xplatform/rules/impl/navigation/PaymentInfoScreenFactoryImpl$getPaymentInfoScreen$1;->b:I

    .line 37
    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    sget-object p1, La/x790;->V1:La/fl70;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    new-instance p1, La/x790;

    .line 46
    .line 47
    invoke-direct {p1}, La/x790;-><init>()V

    .line 48
    .line 49
    .line 50
    sget-object v7, La/x790;->W1:[La/iiy;

    .line 51
    .line 52
    aget-object v3, v7, v3

    .line 53
    .line 54
    iget-object v8, p1, La/x790;->P1:La/zz2;

    .line 55
    .line 56
    invoke-virtual {v8, p1, v3, p0}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 57
    .line 58
    .line 59
    iget-object p0, p1, La/x790;->Q1:La/phf0;

    .line 60
    .line 61
    aget-object v2, v7, v2

    .line 62
    .line 63
    invoke-virtual {p0, p1, v2, v6}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget-object p0, p1, La/x790;->R1:La/zz2;

    .line 67
    .line 68
    aget-object v1, v7, v1

    .line 69
    .line 70
    invoke-virtual {p0, p1, v1, v5}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 71
    .line 72
    .line 73
    iget-object p0, p1, La/x790;->S1:La/cgx0;

    .line 74
    .line 75
    aget-object v0, v7, v0

    .line 76
    .line 77
    invoke-virtual {p0, p1, v0, v4}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 78
    .line 79
    .line 80
    return-object p1

    .line 81
    :cond_0
    sget-object p1, La/lmg0;->Y1:La/eke0;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    new-instance p1, La/lmg0;

    .line 87
    .line 88
    invoke-direct {p1}, La/lmg0;-><init>()V

    .line 89
    .line 90
    .line 91
    sget-object v7, La/lmg0;->Z1:[La/iiy;

    .line 92
    .line 93
    aget-object v3, v7, v3

    .line 94
    .line 95
    iget-object v8, p1, La/lmg0;->Q1:La/zz2;

    .line 96
    .line 97
    invoke-virtual {v8, p1, v3, p0}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 98
    .line 99
    .line 100
    iget-object p0, p1, La/lmg0;->R1:La/phf0;

    .line 101
    .line 102
    aget-object v2, v7, v2

    .line 103
    .line 104
    invoke-virtual {p0, p1, v2, v6}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    iget-object p0, p1, La/lmg0;->S1:La/zz2;

    .line 108
    .line 109
    aget-object v1, v7, v1

    .line 110
    .line 111
    invoke-virtual {p0, p1, v1, v5}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 112
    .line 113
    .line 114
    iget-object p0, p1, La/lmg0;->U1:La/cgx0;

    .line 115
    .line 116
    aget-object v0, v7, v0

    .line 117
    .line 118
    invoke-virtual {p0, p1, v0, v4}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 119
    .line 120
    .line 121
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
