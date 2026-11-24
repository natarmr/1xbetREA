.class public final La/iql;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:La/mm40;


# direct methods
.method public synthetic constructor <init>(BLa/mm40;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/iql;->a:B

    iput-object p3, p0, La/iql;->b:Ljava/util/List;

    iput-object p2, p0, La/iql;->c:La/mm40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/iql;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/iql;->b:Ljava/util/List;

    .line 6
    .line 7
    const/16 v3, 0x92

    .line 8
    .line 9
    const/16 v4, 0x10

    .line 10
    .line 11
    const/16 v5, 0x20

    .line 12
    .line 13
    const/4 v6, 0x2

    .line 14
    const/4 v7, 0x4

    .line 15
    const/4 v8, 0x1

    .line 16
    const/4 v9, 0x0

    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, La/g9z;

    .line 23
    .line 24
    move-object/from16 v10, p2

    .line 25
    .line 26
    check-cast v10, Ljava/lang/Number;

    .line 27
    .line 28
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result v10

    .line 32
    move-object/from16 v11, p3

    .line 33
    .line 34
    check-cast v11, La/fet;

    .line 35
    .line 36
    move-object/from16 v12, p4

    .line 37
    .line 38
    check-cast v12, Ljava/lang/Number;

    .line 39
    .line 40
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result v12

    .line 44
    and-int/lit8 v13, v12, 0x6

    .line 45
    .line 46
    if-nez v13, :cond_1

    .line 47
    .line 48
    invoke-virtual {v11, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_0

    .line 53
    .line 54
    move v6, v7

    .line 55
    :cond_0
    or-int v1, v12, v6

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    move v1, v12

    .line 59
    :goto_0
    and-int/lit8 v6, v12, 0x30

    .line 60
    .line 61
    if-nez v6, :cond_3

    .line 62
    .line 63
    invoke-virtual {v11, v10}, La/fet;->e(I)Z

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    if-eqz v6, :cond_2

    .line 68
    .line 69
    move v4, v5

    .line 70
    :cond_2
    or-int/2addr v1, v4

    .line 71
    :cond_3
    and-int/lit16 v4, v1, 0x93

    .line 72
    .line 73
    if-eq v4, v3, :cond_4

    .line 74
    .line 75
    move v3, v8

    .line 76
    goto :goto_1

    .line 77
    :cond_4
    move v3, v9

    .line 78
    :goto_1
    and-int/2addr v1, v8

    .line 79
    invoke-virtual {v11, v1, v3}, La/fet;->U(IZ)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_5

    .line 84
    .line 85
    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    check-cast v1, La/rbs0;

    .line 90
    .line 91
    const v2, -0x1587c77

    .line 92
    .line 93
    .line 94
    invoke-virtual {v11, v2}, La/fet;->e0(I)V

    .line 95
    .line 96
    .line 97
    iget-object v12, v1, La/rbs0;->b:La/s7p;

    .line 98
    .line 99
    const/16 v18, 0x6

    .line 100
    .line 101
    const/16 v19, 0x3c

    .line 102
    .line 103
    move-object/from16 v17, v11

    .line 104
    .line 105
    iget-object v11, v0, La/iql;->c:La/mm40;

    .line 106
    .line 107
    const/4 v13, 0x0

    .line 108
    const/4 v14, 0x0

    .line 109
    const/4 v15, 0x0

    .line 110
    const/16 v16, 0x0

    .line 111
    .line 112
    invoke-static/range {v11 .. v19}, La/vdb;->E(La/mm40;La/t7p;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 113
    .line 114
    .line 115
    move-object/from16 v0, v17

    .line 116
    .line 117
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_5
    move-object v0, v11

    .line 122
    invoke-virtual {v0}, La/fet;->X()V

    .line 123
    .line 124
    .line 125
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    return-object v0

    .line 128
    :pswitch_0
    move-object/from16 v1, p1

    .line 129
    .line 130
    check-cast v1, La/g9z;

    .line 131
    .line 132
    move-object/from16 v10, p2

    .line 133
    .line 134
    check-cast v10, Ljava/lang/Number;

    .line 135
    .line 136
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 137
    .line 138
    .line 139
    move-result v10

    .line 140
    move-object/from16 v11, p3

    .line 141
    .line 142
    check-cast v11, La/fet;

    .line 143
    .line 144
    move-object/from16 v12, p4

    .line 145
    .line 146
    check-cast v12, Ljava/lang/Number;

    .line 147
    .line 148
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 149
    .line 150
    .line 151
    move-result v12

    .line 152
    and-int/lit8 v13, v12, 0x6

    .line 153
    .line 154
    if-nez v13, :cond_7

    .line 155
    .line 156
    invoke-virtual {v11, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    if-eqz v1, :cond_6

    .line 161
    .line 162
    move v6, v7

    .line 163
    :cond_6
    or-int v1, v12, v6

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_7
    move v1, v12

    .line 167
    :goto_3
    and-int/lit8 v6, v12, 0x30

    .line 168
    .line 169
    if-nez v6, :cond_9

    .line 170
    .line 171
    invoke-virtual {v11, v10}, La/fet;->e(I)Z

    .line 172
    .line 173
    .line 174
    move-result v6

    .line 175
    if-eqz v6, :cond_8

    .line 176
    .line 177
    move v4, v5

    .line 178
    :cond_8
    or-int/2addr v1, v4

    .line 179
    :cond_9
    and-int/lit16 v4, v1, 0x93

    .line 180
    .line 181
    if-eq v4, v3, :cond_a

    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_a
    move v8, v9

    .line 185
    :goto_4
    and-int/lit8 v3, v1, 0x1

    .line 186
    .line 187
    invoke-virtual {v11, v3, v8}, La/fet;->U(IZ)Z

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    if-eqz v3, :cond_b

    .line 192
    .line 193
    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    check-cast v2, La/xv1;

    .line 198
    .line 199
    const v3, 0x78a8fcd1    # 2.74198E34f

    .line 200
    .line 201
    .line 202
    invoke-virtual {v11, v3}, La/fet;->e0(I)V

    .line 203
    .line 204
    .line 205
    and-int/lit8 v1, v1, 0x70

    .line 206
    .line 207
    iget-object v0, v0, La/iql;->c:La/mm40;

    .line 208
    .line 209
    invoke-static {v0, v10, v2, v11, v1}, La/mrv;->h(La/mm40;ILa/xv1;La/fet;I)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v11, v9}, La/fet;->r(Z)V

    .line 213
    .line 214
    .line 215
    goto :goto_5

    .line 216
    :cond_b
    invoke-virtual {v11}, La/fet;->X()V

    .line 217
    .line 218
    .line 219
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 220
    .line 221
    return-object v0

    .line 222
    nop

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
