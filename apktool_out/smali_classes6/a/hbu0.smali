.class public final synthetic La/hbu0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/lbu0;


# direct methods
.method public synthetic constructor <init>(La/lbu0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/hbu0;->a:B

    iput-object p1, p0, La/hbu0;->b:La/lbu0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/hbu0;->a:B

    .line 2
    .line 3
    const/16 v1, 0x3b

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, La/hbu0;->b:La/lbu0;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Ljava/lang/Throwable;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, La/lbu0;->v()V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 23
    .line 24
    iget-object v0, p1, La/ocj;->a:La/p7m0;

    .line 25
    .line 26
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object v3, p0, La/i3t0;->f:La/oyg0;

    .line 34
    .line 35
    move-object v4, p1

    .line 36
    check-cast v4, La/ebu0;

    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    sget-object v3, La/x9u0;->c:La/x9u0;

    .line 42
    .line 43
    invoke-static {v4, v2, v3, v1}, La/ebu0;->a(La/ebu0;La/cau0;La/x9u0;I)La/ebu0;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v0, p1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_0

    .line 52
    .line 53
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_0
    check-cast p1, La/k0w0;

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, La/lbu0;->v:La/r990;

    .line 62
    .line 63
    iget-object p0, p0, La/lbu0;->x:La/v6k;

    .line 64
    .line 65
    iget-object p0, p0, La/v6k;->a:La/efi;

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    new-instance p0, Lorg/xplatform/feature/office/payment/impl/di/navigation/PaymentScreenFactoryImpl$getPaymentScreen$1;

    .line 71
    .line 72
    const/4 v1, 0x1

    .line 73
    const-wide/16 v2, 0x0

    .line 74
    .line 75
    invoke-direct {p0, v0, v1, v2, v3}, Lorg/xplatform/feature/office/payment/impl/di/navigation/PaymentScreenFactoryImpl$getPaymentScreen$1;-><init>(La/r990;ZJ)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, p0}, La/k0w0;->k(La/m7h0;)V

    .line 79
    .line 80
    .line 81
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, La/lbu0;->v()V

    .line 93
    .line 94
    .line 95
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 96
    .line 97
    iget-object p1, p1, La/ocj;->a:La/p7m0;

    .line 98
    .line 99
    :cond_1
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    iget-object v3, p0, La/i3t0;->f:La/oyg0;

    .line 107
    .line 108
    move-object v4, v0

    .line 109
    check-cast v4, La/ebu0;

    .line 110
    .line 111
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    sget-object v3, La/x9u0;->c:La/x9u0;

    .line 115
    .line 116
    invoke-static {v4, v2, v3, v1}, La/ebu0;->a(La/ebu0;La/cau0;La/x9u0;I)La/ebu0;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-virtual {p1, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_1

    .line 125
    .line 126
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    return-object p0

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
