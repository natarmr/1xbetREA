.class public final synthetic La/ra7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wa7;


# direct methods
.method public synthetic constructor <init>(La/wa7;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ra7;->a:B

    iput-object p1, p0, La/ra7;->b:La/wa7;

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
    iget-byte v1, v0, La/ra7;->a:B

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, La/fet;

    .line 11
    .line 12
    move-object/from16 v2, p2

    .line 13
    .line 14
    check-cast v2, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    sget-object v3, La/wa7;->U1:La/kj5;

    .line 21
    .line 22
    and-int/lit8 v3, v2, 0x3

    .line 23
    .line 24
    const/4 v4, 0x2

    .line 25
    const/4 v5, 0x1

    .line 26
    const/4 v6, 0x0

    .line 27
    if-eq v3, v4, :cond_0

    .line 28
    .line 29
    move v3, v5

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v3, v6

    .line 32
    :goto_0
    and-int/2addr v2, v5

    .line 33
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_7

    .line 38
    .line 39
    iget-object v9, v0, La/ra7;->b:La/wa7;

    .line 40
    .line 41
    invoke-virtual {v9}, La/wa7;->I0()La/k3t0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v1, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    sget-object v4, La/ukd;->a:La/cl5;

    .line 54
    .line 55
    if-nez v2, :cond_1

    .line 56
    .line 57
    if-ne v3, v4, :cond_2

    .line 58
    .line 59
    :cond_1
    new-instance v7, La/ur6;

    .line 60
    .line 61
    const/4 v13, 0x0

    .line 62
    const/16 v14, 0x17

    .line 63
    .line 64
    const/4 v8, 0x1

    .line 65
    const-class v10, La/wa7;

    .line 66
    .line 67
    const-string v11, "collectSideEffect"

    .line 68
    .line 69
    const-string v12, "collectSideEffect(Lorg/xplatform/bet_history/bet_info/presentation/model/viewmodel/BetInfoSideEffect;)V"

    .line 70
    .line 71
    invoke-direct/range {v7 .. v14}, La/ur6;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    move-object v3, v7

    .line 78
    :cond_2
    check-cast v3, La/jhy;

    .line 79
    .line 80
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 81
    .line 82
    sget-object v2, La/lkz;->a:La/lkz;

    .line 83
    .line 84
    invoke-static {v3, v1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    invoke-virtual {v1, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    invoke-virtual {v1, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    or-int/2addr v2, v3

    .line 97
    const/4 v3, 0x3

    .line 98
    invoke-virtual {v1, v3}, La/fet;->e(I)Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    or-int/2addr v2, v3

    .line 103
    invoke-virtual {v1, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    or-int/2addr v2, v3

    .line 108
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    const/4 v11, 0x0

    .line 113
    if-nez v2, :cond_3

    .line 114
    .line 115
    if-ne v3, v4, :cond_4

    .line 116
    .line 117
    :cond_3
    new-instance v7, La/ua7;

    .line 118
    .line 119
    const/4 v12, 0x0

    .line 120
    move-object v8, v0

    .line 121
    invoke-direct/range {v7 .. v12}, La/ua7;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    move-object v3, v7

    .line 128
    :cond_4
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 129
    .line 130
    invoke-static {v1, v9, v3}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v9}, La/wa7;->I0()La/k3t0;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    check-cast v0, La/i3t0;

    .line 138
    .line 139
    invoke-virtual {v0, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {v9}, La/wa7;->I0()La/k3t0;

    .line 144
    .line 145
    .line 146
    move-result-object v14

    .line 147
    invoke-virtual {v1, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    if-nez v2, :cond_5

    .line 156
    .line 157
    if-ne v3, v4, :cond_6

    .line 158
    .line 159
    :cond_5
    new-instance v12, La/ur6;

    .line 160
    .line 161
    const/16 v18, 0x0

    .line 162
    .line 163
    const/16 v19, 0x18

    .line 164
    .line 165
    const/4 v13, 0x1

    .line 166
    const-class v15, La/k3t0;

    .line 167
    .line 168
    const-string v16, "onAction"

    .line 169
    .line 170
    const-string v17, "onAction(Ljava/lang/Object;)V"

    .line 171
    .line 172
    invoke-direct/range {v12 .. v19}, La/ur6;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v1, v12}, La/fet;->o0(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    move-object v3, v12

    .line 179
    :cond_6
    check-cast v3, La/jhy;

    .line 180
    .line 181
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 182
    .line 183
    invoke-static {v6, v1, v11, v0, v3}, La/rq8;->n(ILa/fet;La/mm40;La/l7m0;Lkotlin/jvm/functions/Function1;)V

    .line 184
    .line 185
    .line 186
    goto :goto_1

    .line 187
    :cond_7
    invoke-virtual {v1}, La/fet;->X()V

    .line 188
    .line 189
    .line 190
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 191
    .line 192
    return-object v0

    .line 193
    :pswitch_0
    move-object/from16 v1, p1

    .line 194
    .line 195
    check-cast v1, Ljava/lang/String;

    .line 196
    .line 197
    move-object/from16 v2, p2

    .line 198
    .line 199
    check-cast v2, Landroid/os/Bundle;

    .line 200
    .line 201
    sget-object v3, La/wa7;->U1:La/kj5;

    .line 202
    .line 203
    const-string v3, "REQUEST_KEY_SUCCESS_SALE"

    .line 204
    .line 205
    invoke-static {v2, v1, v3}, La/h97;->B(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Z

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    if-nez v1, :cond_8

    .line 210
    .line 211
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_8
    iget-object v0, v0, La/ra7;->b:La/wa7;

    .line 215
    .line 216
    invoke-virtual {v0}, La/wa7;->I0()La/k3t0;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    sget-object v1, La/ia7;->a:La/ia7;

    .line 221
    .line 222
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 226
    .line 227
    :goto_2
    return-object v0

    .line 228
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
