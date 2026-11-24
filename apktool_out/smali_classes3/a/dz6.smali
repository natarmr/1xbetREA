.class public final synthetic La/dz6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/hz6;


# direct methods
.method public synthetic constructor <init>(La/hz6;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/dz6;->a:B

    iput-object p1, p0, La/dz6;->b:La/hz6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/dz6;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object p0, p0, La/dz6;->b:La/hz6;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/hz6;->p2:La/cl5;

    .line 11
    .line 12
    invoke-virtual {p0}, La/hz6;->U0()La/b07;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    iget-object v0, p0, La/b07;->v:Ljava/util/List;

    .line 17
    .line 18
    iget v1, p0, La/b07;->u:I

    .line 19
    .line 20
    invoke-static {v1, v0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, La/rg5;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    iget-object v1, p0, La/b07;->d:La/v88;

    .line 29
    .line 30
    iget-object p0, p0, La/b07;->b:La/i1w0;

    .line 31
    .line 32
    iget-wide v3, v0, La/rg5;->a:J

    .line 33
    .line 34
    invoke-virtual {v1, p0, v2, v3, v4}, La/v88;->a(La/i1w0;ZJ)V

    .line 35
    .line 36
    .line 37
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_0
    sget-object v0, La/hz6;->p2:La/cl5;

    .line 41
    .line 42
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 43
    .line 44
    if-eqz p0, :cond_1

    .line 45
    .line 46
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move-object p0, v1

    .line 50
    :goto_0
    instance-of v0, p0, La/kjc0;

    .line 51
    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    check-cast p0, La/kjc0;

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    move-object p0, v1

    .line 58
    :goto_1
    if-eqz p0, :cond_3

    .line 59
    .line 60
    invoke-virtual {p0}, La/kjc0;->K0()La/gkc0;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    goto :goto_2

    .line 65
    :cond_3
    move-object p0, v1

    .line 66
    :goto_2
    if-eqz p0, :cond_4

    .line 67
    .line 68
    iget-object v0, p0, La/gkc0;->p:La/p7m0;

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    sget-object v2, La/pjc0;->a:La/pjc0;

    .line 74
    .line 75
    invoke-virtual {v0, v1, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, La/gkc0;->w()V

    .line 79
    .line 80
    .line 81
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_1
    sget-object v0, La/hz6;->p2:La/cl5;

    .line 85
    .line 86
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->m:Z

    .line 87
    .line 88
    if-nez v0, :cond_5

    .line 89
    .line 90
    invoke-virtual {p0}, La/yo8;->x0()V

    .line 91
    .line 92
    .line 93
    :cond_5
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 94
    .line 95
    if-eqz v0, :cond_6

    .line 96
    .line 97
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_6
    move-object v0, v1

    .line 101
    :goto_3
    instance-of v3, v0, La/kjc0;

    .line 102
    .line 103
    if-eqz v3, :cond_7

    .line 104
    .line 105
    check-cast v0, La/kjc0;

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_7
    move-object v0, v1

    .line 109
    :goto_4
    if-eqz v0, :cond_8

    .line 110
    .line 111
    invoke-virtual {v0}, La/kjc0;->K0()La/gkc0;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    goto :goto_5

    .line 116
    :cond_8
    move-object v0, v1

    .line 117
    :goto_5
    if-eqz v0, :cond_9

    .line 118
    .line 119
    invoke-virtual {v0}, La/gkc0;->y()V

    .line 120
    .line 121
    .line 122
    :cond_9
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 123
    .line 124
    if-eqz p0, :cond_a

    .line 125
    .line 126
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 127
    .line 128
    goto :goto_6

    .line 129
    :cond_a
    move-object p0, v1

    .line 130
    :goto_6
    instance-of v0, p0, La/kjc0;

    .line 131
    .line 132
    if-eqz v0, :cond_b

    .line 133
    .line 134
    move-object v1, p0

    .line 135
    check-cast v1, La/kjc0;

    .line 136
    .line 137
    :cond_b
    if-eqz v1, :cond_d

    .line 138
    .line 139
    invoke-virtual {v1}, La/kjc0;->K0()La/gkc0;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    iget-object p0, p0, La/gkc0;->p:La/p7m0;

    .line 144
    .line 145
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    instance-of p0, p0, La/tjc0;

    .line 150
    .line 151
    if-nez p0, :cond_c

    .line 152
    .line 153
    goto :goto_7

    .line 154
    :cond_c
    invoke-virtual {v1, v2}, La/kjc0;->L0(Z)V

    .line 155
    .line 156
    .line 157
    :cond_d
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 158
    .line 159
    return-object p0

    .line 160
    :pswitch_2
    sget-object v0, La/hz6;->p2:La/cl5;

    .line 161
    .line 162
    new-instance v0, La/c6s;

    .line 163
    .line 164
    new-instance v3, La/ur6;

    .line 165
    .line 166
    invoke-virtual {p0}, La/hz6;->U0()La/b07;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    const/4 v9, 0x0

    .line 171
    const/16 v10, 0xb

    .line 172
    .line 173
    const/4 v4, 0x1

    .line 174
    const-class v6, La/b07;

    .line 175
    .line 176
    const-string v7, "onGameCountClick"

    .line 177
    .line 178
    const-string v8, "onGameCountClick$impl(Lorg/xplatform/bonus_games/impl/core/presentation/game_count/GameCountItemUiModel;)V"

    .line 179
    .line 180
    invoke-direct/range {v3 .. v10}, La/ur6;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 181
    .line 182
    .line 183
    sget-object p0, La/c6s;->f:La/ek5;

    .line 184
    .line 185
    invoke-direct {v0, p0}, La/qv5;-><init>(La/dtb;)V

    .line 186
    .line 187
    .line 188
    new-instance p0, La/s3t;

    .line 189
    .line 190
    const/4 v1, 0x4

    .line 191
    invoke-direct {p0, v1}, La/s3t;-><init>(B)V

    .line 192
    .line 193
    .line 194
    new-instance v1, La/t3t;

    .line 195
    .line 196
    invoke-direct {v1, v3, v2}, La/t3t;-><init>(Ljava/lang/Object;B)V

    .line 197
    .line 198
    .line 199
    new-instance v2, La/atq;

    .line 200
    .line 201
    const/4 v3, 0x3

    .line 202
    const/16 v4, 0x1c

    .line 203
    .line 204
    invoke-direct {v2, v3, v4}, La/atq;-><init>(IB)V

    .line 205
    .line 206
    .line 207
    sget-object v3, La/fvr;->v:La/fvr;

    .line 208
    .line 209
    new-instance v4, La/gbn;

    .line 210
    .line 211
    invoke-direct {v4, p0, v2, v1, v3}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 212
    .line 213
    .line 214
    iget-object p0, v0, La/zz3;->d:La/dp;

    .line 215
    .line 216
    invoke-virtual {p0, v4}, La/dp;->b(La/gbn;)V

    .line 217
    .line 218
    .line 219
    return-object v0

    .line 220
    :pswitch_3
    sget-object v0, La/hz6;->p2:La/cl5;

    .line 221
    .line 222
    new-instance v0, La/ry3;

    .line 223
    .line 224
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    iget-object p0, p0, La/hz6;->l2:La/jki;

    .line 229
    .line 230
    if-eqz p0, :cond_e

    .line 231
    .line 232
    invoke-direct {v0, v2, p0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 233
    .line 234
    .line 235
    return-object v0

    .line 236
    :cond_e
    const-string p0, "betGameShopPromoViewModelFactory"

    .line 237
    .line 238
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    throw v1

    .line 242
    nop

    .line 243
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
