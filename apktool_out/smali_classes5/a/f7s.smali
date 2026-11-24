.class public final synthetic La/f7s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/i7s;


# direct methods
.method public synthetic constructor <init>(La/i7s;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/f7s;->a:B

    iput-object p1, p0, La/f7s;->b:La/i7s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/f7s;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/16 v3, 0x12

    .line 6
    .line 7
    const/4 v4, 0x2

    .line 8
    const/4 v5, 0x4

    .line 9
    const/4 v6, 0x1

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object v10, p1

    .line 14
    check-cast v10, Lorg/xplatform/sportgame/categories_subgames/api/MarketsCategoriesParams;

    .line 15
    .line 16
    move-object/from16 v12, p2

    .line 17
    .line 18
    check-cast v12, La/fet;

    .line 19
    .line 20
    move-object/from16 v0, p3

    .line 21
    .line 22
    check-cast v0, Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    sget-object v7, La/i7s;->a2:La/nek;

    .line 29
    .line 30
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    and-int/lit8 v7, v0, 0x6

    .line 34
    .line 35
    if-nez v7, :cond_2

    .line 36
    .line 37
    and-int/lit8 v7, v0, 0x8

    .line 38
    .line 39
    if-nez v7, :cond_0

    .line 40
    .line 41
    invoke-virtual {v12, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-virtual {v12, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    :goto_0
    if-eqz v7, :cond_1

    .line 51
    .line 52
    move v4, v5

    .line 53
    :cond_1
    or-int/2addr v0, v4

    .line 54
    :cond_2
    and-int/lit8 v4, v0, 0x13

    .line 55
    .line 56
    if-eq v4, v3, :cond_3

    .line 57
    .line 58
    move v2, v6

    .line 59
    :cond_3
    and-int/lit8 v3, v0, 0x1

    .line 60
    .line 61
    invoke-virtual {v12, v3, v2}, La/fet;->U(IZ)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_6

    .line 66
    .line 67
    iget-object v9, p0, La/f7s;->b:La/i7s;

    .line 68
    .line 69
    iget-object p0, v9, La/i7s;->Q1:La/uuz;

    .line 70
    .line 71
    if-eqz p0, :cond_5

    .line 72
    .line 73
    sget-object v7, La/o7k0;->c:La/n0q;

    .line 74
    .line 75
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    sget-object v1, La/ukd;->a:La/cl5;

    .line 80
    .line 81
    if-ne p0, v1, :cond_4

    .line 82
    .line 83
    new-instance p0, La/dcr;

    .line 84
    .line 85
    const/16 v1, 0x11

    .line 86
    .line 87
    invoke-direct {p0, v1}, La/dcr;-><init>(B)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v12, p0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :cond_4
    move-object v11, p0

    .line 94
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 95
    .line 96
    shl-int/lit8 p0, v0, 0x9

    .line 97
    .line 98
    and-int/lit16 p0, p0, 0x1c00

    .line 99
    .line 100
    const/16 v0, 0x6036

    .line 101
    .line 102
    or-int v13, v0, p0

    .line 103
    .line 104
    sget-object v8, La/jm40;->b:La/jm40;

    .line 105
    .line 106
    invoke-static/range {v7 .. v13}, La/uuz;->c(La/mm40;La/mm40;Landroidx/fragment/app/Fragment;Lorg/xplatform/sportgame/categories_subgames/api/MarketsCategoriesParams;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_5
    const-string p0, "marketsCategoriesFactory"

    .line 111
    .line 112
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw v1

    .line 116
    :cond_6
    invoke-virtual {v12}, La/fet;->X()V

    .line 117
    .line 118
    .line 119
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    return-object p0

    .line 122
    :pswitch_0
    move-object v0, p1

    .line 123
    check-cast v0, Lorg/xplatform/related/api/presentation/RelatedParams;

    .line 124
    .line 125
    move-object/from16 v7, p2

    .line 126
    .line 127
    check-cast v7, La/fet;

    .line 128
    .line 129
    move-object/from16 v8, p3

    .line 130
    .line 131
    check-cast v8, Ljava/lang/Integer;

    .line 132
    .line 133
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 134
    .line 135
    .line 136
    move-result v8

    .line 137
    sget-object v9, La/i7s;->a2:La/nek;

    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    and-int/lit8 v9, v8, 0x6

    .line 143
    .line 144
    if-nez v9, :cond_8

    .line 145
    .line 146
    invoke-virtual {v7, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v9

    .line 150
    if-eqz v9, :cond_7

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_7
    move v5, v4

    .line 154
    :goto_2
    or-int/2addr v8, v5

    .line 155
    :cond_8
    and-int/lit8 v5, v8, 0x13

    .line 156
    .line 157
    if-eq v5, v3, :cond_9

    .line 158
    .line 159
    move v2, v6

    .line 160
    :cond_9
    and-int/lit8 v3, v8, 0x1

    .line 161
    .line 162
    invoke-virtual {v7, v3, v2}, La/fet;->U(IZ)Z

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    if-eqz v2, :cond_b

    .line 167
    .line 168
    sget-object v2, La/qmk;->a:La/zcl;

    .line 169
    .line 170
    invoke-static {v7}, La/qmk;->a(La/fet;)La/wfn;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    iget v2, v2, La/wfn;->c:F

    .line 175
    .line 176
    iget-object v3, p0, La/f7s;->b:La/i7s;

    .line 177
    .line 178
    move-object p0, v0

    .line 179
    iget-object v0, v3, La/i7s;->P1:La/ndf0;

    .line 180
    .line 181
    if-eqz v0, :cond_a

    .line 182
    .line 183
    sget-object v1, La/o7k0;->c:La/n0q;

    .line 184
    .line 185
    const/4 v5, 0x0

    .line 186
    invoke-static {v1, v2, v5, v4}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    move-object v4, v2

    .line 191
    move-object v2, v1

    .line 192
    move-object v1, v4

    .line 193
    move-object v4, p0

    .line 194
    move-object v5, v7

    .line 195
    invoke-virtual/range {v0 .. v5}, La/ndf0;->a(La/mm40;La/mm40;Landroidx/fragment/app/Fragment;Lorg/xplatform/related/api/presentation/RelatedParams;La/fet;)V

    .line 196
    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_a
    const-string p0, "relatedGamesFactory"

    .line 200
    .line 201
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    throw v1

    .line 205
    :cond_b
    move-object v5, v7

    .line 206
    invoke-virtual {v5}, La/fet;->X()V

    .line 207
    .line 208
    .line 209
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 210
    .line 211
    return-object p0

    .line 212
    nop

    .line 213
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
