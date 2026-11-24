.class public final synthetic La/dim;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/whm;

.field public final synthetic c:La/sd;

.field public final synthetic d:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(La/whm;La/sd;Lkotlin/jvm/functions/Function0;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/dim;->a:B

    iput-object p1, p0, La/dim;->b:La/whm;

    iput-object p2, p0, La/dim;->c:La/sd;

    iput-object p3, p0, La/dim;->d:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/dim;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object v6, v0, La/dim;->d:Lkotlin/jvm/functions/Function0;

    .line 11
    .line 12
    iget-object v7, v0, La/dim;->b:La/whm;

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object/from16 v14, p1

    .line 18
    .line 19
    check-cast v14, La/fet;

    .line 20
    .line 21
    move-object/from16 v1, p2

    .line 22
    .line 23
    check-cast v1, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    and-int/lit8 v8, v1, 0x3

    .line 30
    .line 31
    if-eq v8, v3, :cond_0

    .line 32
    .line 33
    move v3, v5

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v3, v4

    .line 36
    :goto_0
    and-int/2addr v1, v5

    .line 37
    invoke-virtual {v14, v1, v3}, La/fet;->U(IZ)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_3

    .line 42
    .line 43
    sget-object v1, La/qmk;->a:La/zcl;

    .line 44
    .line 45
    const/4 v12, 0x0

    .line 46
    const/16 v13, 0xe

    .line 47
    .line 48
    sget-object v8, La/jm40;->b:La/jm40;

    .line 49
    .line 50
    const/high16 v9, 0x41800000    # 16.0f

    .line 51
    .line 52
    const/4 v10, 0x0

    .line 53
    const/4 v11, 0x0

    .line 54
    invoke-static/range {v8 .. v13}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    iget-object v9, v7, La/whm;->k:La/ee;

    .line 59
    .line 60
    if-nez v6, :cond_2

    .line 61
    .line 62
    const v1, 0x62cde2c9

    .line 63
    .line 64
    .line 65
    invoke-virtual {v14, v1}, La/fet;->e0(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    if-ne v1, v2, :cond_1

    .line 73
    .line 74
    new-instance v1, La/ndm;

    .line 75
    .line 76
    const/4 v2, 0x5

    .line 77
    invoke-direct {v1, v2}, La/ndm;-><init>(B)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v14, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    :cond_1
    move-object v6, v1

    .line 84
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 85
    .line 86
    :goto_1
    invoke-virtual {v14, v4}, La/fet;->r(Z)V

    .line 87
    .line 88
    .line 89
    move-object v13, v6

    .line 90
    goto :goto_2

    .line 91
    :cond_2
    const v1, -0x5fe8d9d5

    .line 92
    .line 93
    .line 94
    invoke-virtual {v14, v1}, La/fet;->e0(I)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :goto_2
    const/16 v15, 0xc00

    .line 99
    .line 100
    const/16 v16, 0x10

    .line 101
    .line 102
    iget-object v10, v0, La/dim;->c:La/sd;

    .line 103
    .line 104
    const/4 v11, 0x0

    .line 105
    const/4 v12, 0x0

    .line 106
    invoke-static/range {v8 .. v16}, La/jcb;->f(La/mm40;La/ee;La/sd;ZLa/rd;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 107
    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_3
    invoke-virtual {v14}, La/fet;->X()V

    .line 111
    .line 112
    .line 113
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    return-object v0

    .line 116
    :pswitch_0
    move-object/from16 v1, p1

    .line 117
    .line 118
    check-cast v1, La/fet;

    .line 119
    .line 120
    move-object/from16 v8, p2

    .line 121
    .line 122
    check-cast v8, Ljava/lang/Integer;

    .line 123
    .line 124
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 125
    .line 126
    .line 127
    move-result v8

    .line 128
    and-int/lit8 v9, v8, 0x3

    .line 129
    .line 130
    if-eq v9, v3, :cond_4

    .line 131
    .line 132
    move v3, v5

    .line 133
    goto :goto_4

    .line 134
    :cond_4
    move v3, v4

    .line 135
    :goto_4
    and-int/2addr v5, v8

    .line 136
    invoke-virtual {v1, v5, v3}, La/fet;->U(IZ)Z

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    if-eqz v3, :cond_7

    .line 141
    .line 142
    sget-object v3, La/qmk;->a:La/zcl;

    .line 143
    .line 144
    const/4 v12, 0x0

    .line 145
    const/16 v13, 0xe

    .line 146
    .line 147
    sget-object v8, La/jm40;->b:La/jm40;

    .line 148
    .line 149
    const/high16 v9, 0x41800000    # 16.0f

    .line 150
    .line 151
    const/4 v10, 0x0

    .line 152
    const/4 v11, 0x0

    .line 153
    invoke-static/range {v8 .. v13}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    iget-object v5, v7, La/whm;->k:La/ee;

    .line 158
    .line 159
    if-nez v6, :cond_6

    .line 160
    .line 161
    const v6, 0xf749c41

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1, v6}, La/fet;->e0(I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    if-ne v6, v2, :cond_5

    .line 172
    .line 173
    new-instance v6, La/ndm;

    .line 174
    .line 175
    const/4 v2, 0x4

    .line 176
    invoke-direct {v6, v2}, La/ndm;-><init>(B)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    :cond_5
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 183
    .line 184
    :goto_5
    invoke-virtual {v1, v4}, La/fet;->r(Z)V

    .line 185
    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_6
    const v2, -0x2088a24d

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 192
    .line 193
    .line 194
    goto :goto_5

    .line 195
    :goto_6
    const/16 v8, 0xc00

    .line 196
    .line 197
    const/16 v9, 0x10

    .line 198
    .line 199
    iget-object v0, v0, La/dim;->c:La/sd;

    .line 200
    .line 201
    const/4 v4, 0x0

    .line 202
    move-object v2, v5

    .line 203
    const/4 v5, 0x0

    .line 204
    move-object v7, v1

    .line 205
    move-object v1, v3

    .line 206
    move-object v3, v0

    .line 207
    invoke-static/range {v1 .. v9}, La/jcb;->f(La/mm40;La/ee;La/sd;ZLa/rd;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 208
    .line 209
    .line 210
    goto :goto_7

    .line 211
    :cond_7
    move-object v7, v1

    .line 212
    invoke-virtual {v7}, La/fet;->X()V

    .line 213
    .line 214
    .line 215
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 216
    .line 217
    return-object v0

    .line 218
    nop

    .line 219
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
