.class public final synthetic La/ax;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/dx;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/dx;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ax;->a:B

    iput-object p1, p0, La/ax;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/ax;->c:La/dx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ax;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/high16 v3, 0x3f800000    # 1.0f

    .line 8
    .line 9
    sget-object v4, La/jm40;->b:La/jm40;

    .line 10
    .line 11
    const/16 v5, 0x12

    .line 12
    .line 13
    const/4 v6, 0x2

    .line 14
    const/4 v7, 0x4

    .line 15
    const/4 v8, 0x1

    .line 16
    iget-object v9, v0, La/ax;->c:La/dx;

    .line 17
    .line 18
    iget-object v0, v0, La/ax;->b:Lkotlin/jvm/functions/Function1;

    .line 19
    .line 20
    const/4 v10, 0x0

    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    move-object/from16 v1, p1

    .line 25
    .line 26
    check-cast v1, La/yhg0;

    .line 27
    .line 28
    move-object/from16 v11, p2

    .line 29
    .line 30
    check-cast v11, La/fet;

    .line 31
    .line 32
    move-object/from16 v12, p3

    .line 33
    .line 34
    check-cast v12, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v12

    .line 40
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    and-int/lit8 v13, v12, 0x6

    .line 44
    .line 45
    if-nez v13, :cond_1

    .line 46
    .line 47
    invoke-virtual {v11, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v13

    .line 51
    if-eqz v13, :cond_0

    .line 52
    .line 53
    move v6, v7

    .line 54
    :cond_0
    or-int/2addr v12, v6

    .line 55
    :cond_1
    and-int/lit8 v6, v12, 0x13

    .line 56
    .line 57
    if-eq v6, v5, :cond_2

    .line 58
    .line 59
    move v5, v8

    .line 60
    goto :goto_0

    .line 61
    :cond_2
    move v5, v10

    .line 62
    :goto_0
    and-int/lit8 v6, v12, 0x1

    .line 63
    .line 64
    invoke-virtual {v11, v6, v5}, La/fet;->U(IZ)Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-eqz v5, :cond_5

    .line 69
    .line 70
    invoke-interface {v1, v3, v4, v8}, La/yhg0;->a(FLa/mm40;Z)La/mm40;

    .line 71
    .line 72
    .line 73
    move-result-object v12

    .line 74
    invoke-virtual {v11, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    if-nez v1, :cond_3

    .line 83
    .line 84
    if-ne v3, v2, :cond_4

    .line 85
    .line 86
    :cond_3
    new-instance v3, La/dn;

    .line 87
    .line 88
    const/4 v1, 0x7

    .line 89
    invoke-direct {v3, v0, v1}, La/dn;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v11, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :cond_4
    move-object/from16 v17, v3

    .line 96
    .line 97
    check-cast v17, Lkotlin/jvm/functions/Function0;

    .line 98
    .line 99
    const/16 v18, 0x1c

    .line 100
    .line 101
    const/4 v13, 0x0

    .line 102
    const/4 v14, 0x0

    .line 103
    const/4 v15, 0x0

    .line 104
    const/16 v16, 0x0

    .line 105
    .line 106
    invoke-static/range {v12 .. v18}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    const v1, 0x7f0809fa

    .line 111
    .line 112
    .line 113
    iget-object v2, v9, La/dx;->b:Ljava/lang/String;

    .line 114
    .line 115
    invoke-static {v1, v10, v11, v0, v2}, La/hmw0;->e(IILa/fet;La/mm40;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_5
    invoke-virtual {v11}, La/fet;->X()V

    .line 120
    .line 121
    .line 122
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 123
    .line 124
    return-object v0

    .line 125
    :pswitch_0
    move-object/from16 v1, p1

    .line 126
    .line 127
    check-cast v1, La/yhg0;

    .line 128
    .line 129
    move-object/from16 v11, p2

    .line 130
    .line 131
    check-cast v11, La/fet;

    .line 132
    .line 133
    move-object/from16 v12, p3

    .line 134
    .line 135
    check-cast v12, Ljava/lang/Integer;

    .line 136
    .line 137
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 138
    .line 139
    .line 140
    move-result v12

    .line 141
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    and-int/lit8 v13, v12, 0x6

    .line 145
    .line 146
    if-nez v13, :cond_7

    .line 147
    .line 148
    invoke-virtual {v11, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v13

    .line 152
    if-eqz v13, :cond_6

    .line 153
    .line 154
    move v6, v7

    .line 155
    :cond_6
    or-int/2addr v12, v6

    .line 156
    :cond_7
    and-int/lit8 v6, v12, 0x13

    .line 157
    .line 158
    if-eq v6, v5, :cond_8

    .line 159
    .line 160
    move v5, v8

    .line 161
    goto :goto_2

    .line 162
    :cond_8
    move v5, v10

    .line 163
    :goto_2
    and-int/lit8 v6, v12, 0x1

    .line 164
    .line 165
    invoke-virtual {v11, v6, v5}, La/fet;->U(IZ)Z

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    if-eqz v5, :cond_b

    .line 170
    .line 171
    invoke-interface {v1, v3, v4, v8}, La/yhg0;->a(FLa/mm40;Z)La/mm40;

    .line 172
    .line 173
    .line 174
    move-result-object v12

    .line 175
    invoke-virtual {v11, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    if-nez v1, :cond_9

    .line 184
    .line 185
    if-ne v3, v2, :cond_a

    .line 186
    .line 187
    :cond_9
    new-instance v3, La/dn;

    .line 188
    .line 189
    const/16 v1, 0x8

    .line 190
    .line 191
    invoke-direct {v3, v0, v1}, La/dn;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v11, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    :cond_a
    move-object/from16 v17, v3

    .line 198
    .line 199
    check-cast v17, Lkotlin/jvm/functions/Function0;

    .line 200
    .line 201
    const/16 v18, 0x1c

    .line 202
    .line 203
    const/4 v13, 0x0

    .line 204
    const/4 v14, 0x0

    .line 205
    const/4 v15, 0x0

    .line 206
    const/16 v16, 0x0

    .line 207
    .line 208
    invoke-static/range {v12 .. v18}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    const v1, 0x7f0807f8

    .line 213
    .line 214
    .line 215
    iget-object v2, v9, La/dx;->a:Ljava/lang/String;

    .line 216
    .line 217
    invoke-static {v1, v10, v11, v0, v2}, La/hmw0;->e(IILa/fet;La/mm40;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    goto :goto_3

    .line 221
    :cond_b
    invoke-virtual {v11}, La/fet;->X()V

    .line 222
    .line 223
    .line 224
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 225
    .line 226
    return-object v0

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
