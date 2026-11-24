.class public final synthetic La/fqr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/jqr;


# direct methods
.method public synthetic constructor <init>(La/jqr;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/fqr;->a:B

    iput-object p1, p0, La/fqr;->b:La/jqr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/fqr;->a:B

    .line 4
    .line 5
    const/16 v2, 0xe

    .line 6
    .line 7
    const/16 v3, 0xc

    .line 8
    .line 9
    const v4, 0x7f7fffff    # Float.MAX_VALUE

    .line 10
    .line 11
    .line 12
    const-string v5, "invalid weight; must be greater than zero"

    .line 13
    .line 14
    const-wide/16 v6, 0x0

    .line 15
    .line 16
    const/high16 v8, 0x3f800000    # 1.0f

    .line 17
    .line 18
    const/4 v9, 0x2

    .line 19
    const/high16 v10, 0x40000000    # 2.0f

    .line 20
    .line 21
    iget-object v0, v0, La/fqr;->b:La/jqr;

    .line 22
    .line 23
    const/4 v11, 0x0

    .line 24
    const/4 v12, 0x1

    .line 25
    packed-switch v1, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    move-object/from16 v1, p1

    .line 29
    .line 30
    check-cast v1, La/fet;

    .line 31
    .line 32
    move-object/from16 v13, p2

    .line 33
    .line 34
    check-cast v13, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v13

    .line 40
    and-int/lit8 v14, v13, 0x3

    .line 41
    .line 42
    if-eq v14, v9, :cond_0

    .line 43
    .line 44
    move v9, v12

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move v9, v11

    .line 47
    :goto_0
    and-int/2addr v13, v12

    .line 48
    invoke-virtual {v1, v13, v9}, La/fet;->U(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result v9

    .line 52
    if-eqz v9, :cond_3

    .line 53
    .line 54
    float-to-double v13, v8

    .line 55
    cmpl-double v6, v13, v6

    .line 56
    .line 57
    if-lez v6, :cond_1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-static {v5}, La/vcx;->a(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :goto_1
    new-instance v13, La/x7z;

    .line 64
    .line 65
    cmpl-float v5, v8, v4

    .line 66
    .line 67
    if-lez v5, :cond_2

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_2
    move v4, v8

    .line 71
    :goto_2
    invoke-direct {v13, v4, v12}, La/x7z;-><init>(FZ)V

    .line 72
    .line 73
    .line 74
    sget-object v4, La/qmk;->a:La/zcl;

    .line 75
    .line 76
    sget-object v4, La/gqw0;->n:La/xx7;

    .line 77
    .line 78
    new-instance v14, La/qw3;

    .line 79
    .line 80
    new-instance v5, La/gne;

    .line 81
    .line 82
    invoke-direct {v5, v4, v3}, La/gne;-><init>(Ljava/lang/Object;B)V

    .line 83
    .line 84
    .line 85
    invoke-direct {v14, v10, v12, v5}, La/qw3;-><init>(FZLa/rw3;)V

    .line 86
    .line 87
    .line 88
    new-instance v15, La/qw3;

    .line 89
    .line 90
    new-instance v3, La/jf4;

    .line 91
    .line 92
    invoke-direct {v3, v2}, La/jf4;-><init>(B)V

    .line 93
    .line 94
    .line 95
    invoke-direct {v15, v10, v12, v3}, La/qw3;-><init>(FZLa/rw3;)V

    .line 96
    .line 97
    .line 98
    new-instance v2, La/hqr;

    .line 99
    .line 100
    invoke-direct {v2, v0, v11}, La/hqr;-><init>(La/jqr;B)V

    .line 101
    .line 102
    .line 103
    const v0, 0x4f67410a

    .line 104
    .line 105
    .line 106
    invoke-static {v0, v2, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 107
    .line 108
    .line 109
    move-result-object v19

    .line 110
    const/high16 v21, 0x180000

    .line 111
    .line 112
    const/16 v22, 0x38

    .line 113
    .line 114
    const/16 v16, 0x0

    .line 115
    .line 116
    const/16 v17, 0x0

    .line 117
    .line 118
    const/16 v18, 0x0

    .line 119
    .line 120
    move-object/from16 v20, v1

    .line 121
    .line 122
    invoke-static/range {v13 .. v22}, La/jwb;->p(La/mm40;La/ow3;La/sw3;La/yx7;IILa/ugd;La/fet;II)V

    .line 123
    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_3
    move-object/from16 v20, v1

    .line 127
    .line 128
    invoke-virtual/range {v20 .. v20}, La/fet;->X()V

    .line 129
    .line 130
    .line 131
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    return-object v0

    .line 134
    :pswitch_0
    move-object/from16 v1, p1

    .line 135
    .line 136
    check-cast v1, La/fet;

    .line 137
    .line 138
    move-object/from16 v13, p2

    .line 139
    .line 140
    check-cast v13, Ljava/lang/Integer;

    .line 141
    .line 142
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 143
    .line 144
    .line 145
    move-result v13

    .line 146
    and-int/lit8 v14, v13, 0x3

    .line 147
    .line 148
    if-eq v14, v9, :cond_4

    .line 149
    .line 150
    move v11, v12

    .line 151
    :cond_4
    and-int/lit8 v9, v13, 0x1

    .line 152
    .line 153
    invoke-virtual {v1, v9, v11}, La/fet;->U(IZ)Z

    .line 154
    .line 155
    .line 156
    move-result v9

    .line 157
    if-eqz v9, :cond_7

    .line 158
    .line 159
    float-to-double v13, v8

    .line 160
    cmpl-double v6, v13, v6

    .line 161
    .line 162
    if-lez v6, :cond_5

    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_5
    invoke-static {v5}, La/vcx;->a(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    :goto_4
    new-instance v5, La/x7z;

    .line 169
    .line 170
    cmpl-float v6, v8, v4

    .line 171
    .line 172
    if-lez v6, :cond_6

    .line 173
    .line 174
    goto :goto_5

    .line 175
    :cond_6
    move v4, v8

    .line 176
    :goto_5
    invoke-direct {v5, v4, v12}, La/x7z;-><init>(FZ)V

    .line 177
    .line 178
    .line 179
    sget-object v4, La/qmk;->a:La/zcl;

    .line 180
    .line 181
    sget-object v4, La/gqw0;->n:La/xx7;

    .line 182
    .line 183
    new-instance v6, La/qw3;

    .line 184
    .line 185
    new-instance v7, La/gne;

    .line 186
    .line 187
    invoke-direct {v7, v4, v3}, La/gne;-><init>(Ljava/lang/Object;B)V

    .line 188
    .line 189
    .line 190
    invoke-direct {v6, v10, v12, v7}, La/qw3;-><init>(FZLa/rw3;)V

    .line 191
    .line 192
    .line 193
    new-instance v3, La/qw3;

    .line 194
    .line 195
    new-instance v4, La/jf4;

    .line 196
    .line 197
    invoke-direct {v4, v2}, La/jf4;-><init>(B)V

    .line 198
    .line 199
    .line 200
    invoke-direct {v3, v10, v12, v4}, La/qw3;-><init>(FZLa/rw3;)V

    .line 201
    .line 202
    .line 203
    new-instance v2, La/hqr;

    .line 204
    .line 205
    invoke-direct {v2, v0, v12}, La/hqr;-><init>(La/jqr;B)V

    .line 206
    .line 207
    .line 208
    const v0, -0x5de943df

    .line 209
    .line 210
    .line 211
    invoke-static {v0, v2, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 212
    .line 213
    .line 214
    move-result-object v7

    .line 215
    const/high16 v9, 0x180000

    .line 216
    .line 217
    const/16 v10, 0x38

    .line 218
    .line 219
    const/4 v4, 0x0

    .line 220
    move-object v8, v1

    .line 221
    move-object v1, v5

    .line 222
    const/4 v5, 0x0

    .line 223
    move-object v2, v6

    .line 224
    const/4 v6, 0x0

    .line 225
    invoke-static/range {v1 .. v10}, La/jwb;->p(La/mm40;La/ow3;La/sw3;La/yx7;IILa/ugd;La/fet;II)V

    .line 226
    .line 227
    .line 228
    goto :goto_6

    .line 229
    :cond_7
    move-object v8, v1

    .line 230
    invoke-virtual {v8}, La/fet;->X()V

    .line 231
    .line 232
    .line 233
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 234
    .line 235
    return-object v0

    .line 236
    nop

    .line 237
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
