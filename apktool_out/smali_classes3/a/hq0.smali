.class public final synthetic La/hq0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/jq0;


# direct methods
.method public synthetic constructor <init>(La/jq0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/hq0;->a:B

    iput-object p1, p0, La/hq0;->b:La/jq0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/hq0;->a:B

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Ljava/lang/String;

    .line 11
    .line 12
    move-object/from16 v2, p2

    .line 13
    .line 14
    check-cast v2, Landroid/os/Bundle;

    .line 15
    .line 16
    sget-object v3, La/jq0;->P1:La/qek0;

    .line 17
    .line 18
    const-string v3, "SELECT_SORT_OPTION_REQUEST_KEY"

    .line 19
    .line 20
    invoke-static {v2, v1, v3}, La/h97;->B(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    iget-object v0, v0, La/hq0;->b:La/jq0;

    .line 39
    .line 40
    invoke-virtual {v0}, La/jq0;->G0()La/gs0;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    new-instance v2, La/aq0;

    .line 45
    .line 46
    invoke-direct {v2, v1}, La/aq0;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v2}, La/gs0;->Q(La/bq0;)V

    .line 50
    .line 51
    .line 52
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    :goto_0
    return-object v0

    .line 55
    :pswitch_0
    move-object/from16 v1, p1

    .line 56
    .line 57
    check-cast v1, La/fet;

    .line 58
    .line 59
    move-object/from16 v2, p2

    .line 60
    .line 61
    check-cast v2, Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    sget-object v3, La/jq0;->P1:La/qek0;

    .line 68
    .line 69
    and-int/lit8 v3, v2, 0x3

    .line 70
    .line 71
    const/4 v4, 0x2

    .line 72
    const/4 v5, 0x1

    .line 73
    if-eq v3, v4, :cond_2

    .line 74
    .line 75
    move v3, v5

    .line 76
    goto :goto_1

    .line 77
    :cond_2
    const/4 v3, 0x0

    .line 78
    :goto_1
    and-int/2addr v2, v5

    .line 79
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eqz v2, :cond_9

    .line 84
    .line 85
    iget-object v5, v0, La/hq0;->b:La/jq0;

    .line 86
    .line 87
    invoke-virtual {v5}, La/jq0;->G0()La/gs0;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    sget v2, La/gs0;->G:I

    .line 92
    .line 93
    invoke-virtual {v0, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v5}, La/jq0;->G0()La/gs0;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {v1, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    sget-object v11, La/ukd;->a:La/cl5;

    .line 110
    .line 111
    if-nez v3, :cond_3

    .line 112
    .line 113
    if-ne v4, v11, :cond_4

    .line 114
    .line 115
    :cond_3
    new-instance v3, La/t90;

    .line 116
    .line 117
    const/4 v9, 0x0

    .line 118
    const/16 v10, 0xd

    .line 119
    .line 120
    const/4 v4, 0x1

    .line 121
    const-class v6, La/jq0;

    .line 122
    .line 123
    const-string v7, "handleSideEffect"

    .line 124
    .line 125
    const-string v8, "handleSideEffect(Lorg/xplatform/aggregator/impl/category/presentation/filters/models/AggregatorFiltersSideEffect;)V"

    .line 126
    .line 127
    invoke-direct/range {v3 .. v10}, La/t90;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    move-object v4, v3

    .line 134
    :cond_4
    check-cast v4, La/jhy;

    .line 135
    .line 136
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 137
    .line 138
    sget-object v3, La/lkz;->a:La/lkz;

    .line 139
    .line 140
    invoke-static {v4, v1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    invoke-virtual {v1, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    invoke-virtual {v1, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    or-int/2addr v3, v4

    .line 153
    const/4 v4, 0x3

    .line 154
    invoke-virtual {v1, v4}, La/fet;->e(I)Z

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    or-int/2addr v3, v4

    .line 159
    invoke-virtual {v1, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v4

    .line 163
    or-int/2addr v3, v4

    .line 164
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    if-nez v3, :cond_5

    .line 169
    .line 170
    if-ne v4, v11, :cond_6

    .line 171
    .line 172
    :cond_5
    new-instance v3, La/l10;

    .line 173
    .line 174
    const/4 v7, 0x0

    .line 175
    const/4 v8, 0x4

    .line 176
    move-object v4, v2

    .line 177
    invoke-direct/range {v3 .. v8}, La/l10;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    move-object v4, v3

    .line 184
    :cond_6
    check-cast v4, Lkotlin/jvm/functions/Function2;

    .line 185
    .line 186
    invoke-static {v1, v5, v4}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 187
    .line 188
    .line 189
    sget-object v2, La/jm40;->b:La/jm40;

    .line 190
    .line 191
    const-string v3, "AGGREGATOR_FILTER_SCREEN"

    .line 192
    .line 193
    invoke-static {v2, v3}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    invoke-virtual {v5}, La/jq0;->G0()La/gs0;

    .line 198
    .line 199
    .line 200
    move-result-object v14

    .line 201
    invoke-virtual {v1, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    if-nez v3, :cond_7

    .line 210
    .line 211
    if-ne v4, v11, :cond_8

    .line 212
    .line 213
    :cond_7
    new-instance v12, La/t90;

    .line 214
    .line 215
    const/16 v18, 0x0

    .line 216
    .line 217
    const/16 v19, 0xe

    .line 218
    .line 219
    const/4 v13, 0x1

    .line 220
    const-class v15, La/gs0;

    .line 221
    .line 222
    const-string v16, "onAction"

    .line 223
    .line 224
    const-string v17, "onAction(Lorg/xplatform/aggregator/impl/category/presentation/filters/models/AggregatorFiltersAction;)V"

    .line 225
    .line 226
    invoke-direct/range {v12 .. v19}, La/t90;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v1, v12}, La/fet;->o0(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    move-object v4, v12

    .line 233
    :cond_8
    check-cast v4, La/jhy;

    .line 234
    .line 235
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 236
    .line 237
    const/4 v3, 0x6

    .line 238
    invoke-static {v3, v1, v2, v0, v4}, La/j2e;->d(ILa/fet;La/mm40;La/l7m0;Lkotlin/jvm/functions/Function1;)V

    .line 239
    .line 240
    .line 241
    goto :goto_2

    .line 242
    :cond_9
    invoke-virtual {v1}, La/fet;->X()V

    .line 243
    .line 244
    .line 245
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 246
    .line 247
    return-object v0

    .line 248
    nop

    .line 249
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
