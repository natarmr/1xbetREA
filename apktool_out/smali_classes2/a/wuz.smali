.class public final synthetic La/wuz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/zuz;


# direct methods
.method public synthetic constructor <init>(La/zuz;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wuz;->a:B

    iput-object p1, p0, La/wuz;->b:La/zuz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/wuz;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/wuz;->b:La/zuz;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/String;

    .line 9
    .line 10
    check-cast p2, Landroid/os/Bundle;

    .line 11
    .line 12
    sget-object v0, La/zuz;->N1:La/xuz;

    .line 13
    .line 14
    const-string v0, "SEND_RESULT_REQUEST_KEY"

    .line 15
    .line 16
    invoke-static {p2, p1, v0}, La/h97;->B(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    iget-object p0, p0, La/zuz;->L1:La/a8z;

    .line 23
    .line 24
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, La/k3t0;

    .line 29
    .line 30
    sget-object p1, La/puz;->a:La/puz;

    .line 31
    .line 32
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_0
    iget-object p0, p0, La/zuz;->L1:La/a8z;

    .line 39
    .line 40
    check-cast p1, La/fet;

    .line 41
    .line 42
    check-cast p2, Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    sget-object v0, La/zuz;->N1:La/xuz;

    .line 49
    .line 50
    and-int/lit8 v0, p2, 0x3

    .line 51
    .line 52
    const/4 v1, 0x2

    .line 53
    const/4 v2, 0x0

    .line 54
    const/4 v3, 0x1

    .line 55
    if-eq v0, v1, :cond_1

    .line 56
    .line 57
    move v0, v3

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    move v0, v2

    .line 60
    :goto_0
    and-int/2addr p2, v3

    .line 61
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    if-eqz p2, :cond_4

    .line 66
    .line 67
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    check-cast p2, La/k3t0;

    .line 72
    .line 73
    check-cast p2, La/i3t0;

    .line 74
    .line 75
    invoke-virtual {p2, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    move-object v5, p0

    .line 84
    check-cast v5, La/k3t0;

    .line 85
    .line 86
    invoke-virtual {p1, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    if-nez p0, :cond_2

    .line 95
    .line 96
    sget-object p0, La/ukd;->a:La/cl5;

    .line 97
    .line 98
    if-ne v0, p0, :cond_3

    .line 99
    .line 100
    :cond_2
    new-instance v3, La/g1y;

    .line 101
    .line 102
    const/4 v9, 0x0

    .line 103
    const/16 v10, 0x1d

    .line 104
    .line 105
    const/4 v4, 0x1

    .line 106
    const-class v6, La/k3t0;

    .line 107
    .line 108
    const-string v7, "onAction"

    .line 109
    .line 110
    const-string v8, "onAction(Ljava/lang/Object;)V"

    .line 111
    .line 112
    invoke-direct/range {v3 .. v10}, La/g1y;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    move-object v0, v3

    .line 119
    :cond_3
    check-cast v0, La/jhy;

    .line 120
    .line 121
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 122
    .line 123
    invoke-static {p2, v0, p1, v2}, La/ffb0;->v(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_4
    invoke-virtual {p1}, La/fet;->X()V

    .line 128
    .line 129
    .line 130
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    return-object p0

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
