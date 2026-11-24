.class public final synthetic La/kvr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mvr0;


# direct methods
.method public synthetic constructor <init>(La/mvr0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/kvr0;->a:B

    iput-object p1, p0, La/kvr0;->b:La/mvr0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/kvr0;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/String;

    .line 7
    .line 8
    check-cast p2, Landroid/os/Bundle;

    .line 9
    .line 10
    sget-object v0, La/mvr0;->W1:La/g9m0;

    .line 11
    .line 12
    const-string v0, "TotoBetTypeBottomSheetKey"

    .line 13
    .line 14
    invoke-static {p2, p1, v0}, La/h97;->B(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object p0, p0, La/kvr0;->b:La/mvr0;

    .line 24
    .line 25
    invoke-virtual {p0}, La/mvr0;->G0()La/k3t0;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-instance v0, La/hvr0;

    .line 30
    .line 31
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    invoke-direct {v0, p1}, La/hvr0;-><init>(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    :goto_0
    return-object p0

    .line 44
    :pswitch_0
    check-cast p1, La/fet;

    .line 45
    .line 46
    check-cast p2, Ljava/lang/Integer;

    .line 47
    .line 48
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    sget-object v0, La/mvr0;->W1:La/g9m0;

    .line 53
    .line 54
    and-int/lit8 v0, p2, 0x3

    .line 55
    .line 56
    const/4 v1, 0x2

    .line 57
    const/4 v2, 0x1

    .line 58
    const/4 v3, 0x0

    .line 59
    if-eq v0, v1, :cond_1

    .line 60
    .line 61
    move v0, v2

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    move v0, v3

    .line 64
    :goto_1
    and-int/2addr p2, v2

    .line 65
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    if-eqz p2, :cond_6

    .line 70
    .line 71
    iget-object v6, p0, La/kvr0;->b:La/mvr0;

    .line 72
    .line 73
    invoke-virtual {v6}, La/mvr0;->G0()La/k3t0;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    const/4 p2, 0x0

    .line 78
    invoke-static {p2, p0, p1, v3}, La/x4d0;->Z(La/mm40;La/k3t0;La/fet;I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v6}, La/mvr0;->G0()La/k3t0;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {p1, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    sget-object v2, La/ukd;->a:La/cl5;

    .line 94
    .line 95
    if-nez v0, :cond_2

    .line 96
    .line 97
    if-ne v1, v2, :cond_3

    .line 98
    .line 99
    :cond_2
    new-instance v4, La/mjr0;

    .line 100
    .line 101
    const/4 v10, 0x0

    .line 102
    const/16 v11, 0x11

    .line 103
    .line 104
    const/4 v5, 0x1

    .line 105
    const-class v7, La/mvr0;

    .line 106
    .line 107
    const-string v8, "handleSideEffect"

    .line 108
    .line 109
    const-string v9, "handleSideEffect(Lorg/xplatform/toto_bet/tirage/presentation/model/TotoTirageSideEffect;)V"

    .line 110
    .line 111
    invoke-direct/range {v4 .. v11}, La/mjr0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    move-object v1, v4

    .line 118
    :cond_3
    check-cast v1, La/jhy;

    .line 119
    .line 120
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 121
    .line 122
    sget-object v0, La/or00;->a:La/zfn;

    .line 123
    .line 124
    invoke-virtual {p1, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    move-object v9, v0

    .line 129
    check-cast v9, La/clz;

    .line 130
    .line 131
    sget-object v0, La/lkz;->a:La/lkz;

    .line 132
    .line 133
    invoke-static {v1, p1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 134
    .line 135
    .line 136
    move-result-object v10

    .line 137
    invoke-virtual {p1, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    invoke-virtual {p1, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    or-int/2addr v0, v1

    .line 146
    const/4 v1, 0x3

    .line 147
    invoke-virtual {p1, v1}, La/fet;->e(I)Z

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    or-int/2addr v0, v1

    .line 152
    invoke-virtual {p1, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    or-int/2addr v0, v1

    .line 157
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    if-nez v0, :cond_4

    .line 162
    .line 163
    if-ne v1, v2, :cond_5

    .line 164
    .line 165
    :cond_4
    new-instance v7, La/kc70;

    .line 166
    .line 167
    const/16 v12, 0x1c

    .line 168
    .line 169
    move-object v8, p0

    .line 170
    move-object v11, p2

    .line 171
    invoke-direct/range {v7 .. v12}, La/kc70;-><init>(La/k3t0;La/clz;La/pz40;La/yje;B)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    move-object v1, v7

    .line 178
    :cond_5
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 179
    .line 180
    invoke-static {p1, v9, v1}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 181
    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_6
    invoke-virtual {p1}, La/fet;->X()V

    .line 185
    .line 186
    .line 187
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 188
    .line 189
    return-object p0

    .line 190
    nop

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
