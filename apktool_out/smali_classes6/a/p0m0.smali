.class public final synthetic La/p0m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/t0m0;


# direct methods
.method public synthetic constructor <init>(La/t0m0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/p0m0;->a:B

    iput-object p1, p0, La/p0m0;->b:La/t0m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/p0m0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/p0m0;->b:La/t0m0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/fet;

    .line 9
    .line 10
    check-cast p2, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    sget-object v0, La/t0m0;->Z1:La/gne0;

    .line 17
    .line 18
    and-int/lit8 v0, p2, 0x3

    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    const/4 v2, 0x1

    .line 22
    const/4 v3, 0x0

    .line 23
    if-eq v0, v1, :cond_0

    .line 24
    .line 25
    move v0, v2

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v0, v3

    .line 28
    :goto_0
    and-int/2addr p2, v2

    .line 29
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eqz p2, :cond_3

    .line 34
    .line 35
    invoke-virtual {p0}, La/t0m0;->G0()La/k3t0;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    check-cast p2, La/i3t0;

    .line 40
    .line 41
    invoke-virtual {p2, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-virtual {p0}, La/t0m0;->G0()La/k3t0;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    invoke-virtual {p1, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-nez p0, :cond_1

    .line 58
    .line 59
    sget-object p0, La/ukd;->a:La/cl5;

    .line 60
    .line 61
    if-ne v0, p0, :cond_2

    .line 62
    .line 63
    :cond_1
    new-instance v4, La/kcl0;

    .line 64
    .line 65
    const/4 v10, 0x0

    .line 66
    const/16 v11, 0xd

    .line 67
    .line 68
    const/4 v5, 0x1

    .line 69
    const-class v7, La/k3t0;

    .line 70
    .line 71
    const-string v8, "onAction"

    .line 72
    .line 73
    const-string v9, "onAction(Ljava/lang/Object;)V"

    .line 74
    .line 75
    invoke-direct/range {v4 .. v11}, La/kcl0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    move-object v0, v4

    .line 82
    :cond_2
    check-cast v0, La/jhy;

    .line 83
    .line 84
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 85
    .line 86
    invoke-static {p2, v0, p1, v3}, La/h8x;->o(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    invoke-virtual {p1}, La/fet;->X()V

    .line 91
    .line 92
    .line 93
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    return-object p0

    .line 96
    :pswitch_0
    check-cast p1, La/clz;

    .line 97
    .line 98
    check-cast p2, La/blz;

    .line 99
    .line 100
    sget-object v0, La/t0m0;->Z1:La/gne0;

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    iget-object p0, p0, La/t0m0;->X1:La/v62;

    .line 109
    .line 110
    invoke-virtual {p0}, La/eg60;->e()V

    .line 111
    .line 112
    .line 113
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    return-object p0

    .line 116
    :pswitch_1
    check-cast p1, La/clz;

    .line 117
    .line 118
    check-cast p2, La/blz;

    .line 119
    .line 120
    sget-object v0, La/t0m0;->Z1:La/gne0;

    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    invoke-virtual {p2}, La/agd;->k()La/jg60;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    iget-object p0, p0, La/t0m0;->X1:La/v62;

    .line 137
    .line 138
    invoke-virtual {p2, p1, p0}, La/jg60;->a(La/clz;La/eg60;)V

    .line 139
    .line 140
    .line 141
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    return-object p0

    .line 144
    nop

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
