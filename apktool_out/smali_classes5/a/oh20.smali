.class public final synthetic La/oh20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/io/Serializable;

.field public final synthetic c:Z

.field public final synthetic d:Z

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(Ljava/io/Serializable;ZZZB)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/oh20;->a:B

    iput-object p1, p0, La/oh20;->b:Ljava/io/Serializable;

    iput-boolean p2, p0, La/oh20;->c:Z

    iput-boolean p3, p0, La/oh20;->d:Z

    iput-boolean p4, p0, La/oh20;->e:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/oh20;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-boolean v4, v0, La/oh20;->e:Z

    .line 8
    .line 9
    iget-boolean v5, v0, La/oh20;->d:Z

    .line 10
    .line 11
    iget-object v6, v0, La/oh20;->b:Ljava/io/Serializable;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v6, La/lok0;

    .line 17
    .line 18
    move-object/from16 v1, p1

    .line 19
    .line 20
    check-cast v1, La/oyg0;

    .line 21
    .line 22
    move-object/from16 v7, p2

    .line 23
    .line 24
    check-cast v7, La/d92;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object v8, v7, La/d92;->c:La/lwk0;

    .line 33
    .line 34
    iget-object v1, v8, La/lwk0;->b:Ljava/util/List;

    .line 35
    .line 36
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iget-boolean v0, v0, La/oh20;->c:Z

    .line 41
    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    sget-object v0, Lorg/xplatform/special_event/impl/main/presentation/model/SpecialEventTabs;->c:Lorg/xplatform/special_event/impl/main/presentation/model/SpecialEventTabs;

    .line 45
    .line 46
    invoke-virtual {v2, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    :cond_0
    if-eqz v5, :cond_1

    .line 50
    .line 51
    sget-object v0, Lorg/xplatform/special_event/impl/main/presentation/model/SpecialEventTabs;->d:Lorg/xplatform/special_event/impl/main/presentation/model/SpecialEventTabs;

    .line 52
    .line 53
    invoke-virtual {v2, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    :cond_1
    if-eqz v4, :cond_2

    .line 57
    .line 58
    sget-object v0, Lorg/xplatform/special_event/impl/main/presentation/model/SpecialEventTabs;->e:Lorg/xplatform/special_event/impl/main/presentation/model/SpecialEventTabs;

    .line 59
    .line 60
    invoke-virtual {v2, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    :cond_2
    invoke-static {v2}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {v1, v0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 68
    .line 69
    .line 70
    move-result-object v10

    .line 71
    iget-object v11, v6, La/lok0;->j:Ljava/util/List;

    .line 72
    .line 73
    iget-object v12, v6, La/lok0;->k:Ljava/util/List;

    .line 74
    .line 75
    iget-object v13, v6, La/lok0;->l:Ljava/util/List;

    .line 76
    .line 77
    iget-object v14, v6, La/lok0;->m:Ljava/util/List;

    .line 78
    .line 79
    const/4 v15, 0x5

    .line 80
    const/4 v9, 0x0

    .line 81
    invoke-static/range {v8 .. v15}, La/lwk0;->a(La/lwk0;Lorg/xplatform/special_event/impl/main/presentation/model/SpecialEventTabs;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;I)La/lwk0;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    const/4 v15, 0x0

    .line 86
    const/16 v16, 0x7fb

    .line 87
    .line 88
    const/4 v8, 0x0

    .line 89
    const/4 v10, 0x0

    .line 90
    const/4 v11, 0x0

    .line 91
    const/4 v12, 0x0

    .line 92
    const-wide/16 v13, 0x0

    .line 93
    .line 94
    invoke-static/range {v7 .. v16}, La/d92;->a(La/d92;La/b92;La/lwk0;Ljava/util/List;La/yi50;La/dj50;JLa/bj50;I)La/d92;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    return-object v0

    .line 99
    :pswitch_0
    check-cast v6, Ljava/math/BigDecimal;

    .line 100
    .line 101
    move-object/from16 v1, p1

    .line 102
    .line 103
    check-cast v1, La/oyg0;

    .line 104
    .line 105
    move-object/from16 v7, p2

    .line 106
    .line 107
    check-cast v7, La/b820;

    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    iget-object v8, v7, La/b820;->f:La/gx4;

    .line 116
    .line 117
    if-eqz v8, :cond_4

    .line 118
    .line 119
    iget-object v1, v8, La/gx4;->b:La/xyc;

    .line 120
    .line 121
    if-eqz v5, :cond_3

    .line 122
    .line 123
    if-eqz v4, :cond_3

    .line 124
    .line 125
    move v5, v3

    .line 126
    :goto_0
    move-object v2, v6

    .line 127
    goto :goto_1

    .line 128
    :cond_3
    move v5, v2

    .line 129
    goto :goto_0

    .line 130
    :goto_1
    const/16 v6, 0x1e

    .line 131
    .line 132
    const/4 v3, 0x0

    .line 133
    iget-boolean v4, v0, La/oh20;->c:Z

    .line 134
    .line 135
    invoke-static/range {v1 .. v6}, La/xyc;->a(La/xyc;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZZI)La/xyc;

    .line 136
    .line 137
    .line 138
    move-result-object v10

    .line 139
    const/4 v13, 0x0

    .line 140
    const/16 v14, 0x1d

    .line 141
    .line 142
    const/4 v9, 0x0

    .line 143
    const/4 v11, 0x0

    .line 144
    const/4 v12, 0x0

    .line 145
    invoke-static/range {v8 .. v14}, La/gx4;->a(La/gx4;La/a8q0;La/xyc;La/dx6;La/kwo0;La/mnb0;I)La/gx4;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    :goto_2
    move-object v13, v0

    .line 150
    goto :goto_3

    .line 151
    :cond_4
    const/4 v0, 0x0

    .line 152
    goto :goto_2

    .line 153
    :goto_3
    const/16 v19, 0x0

    .line 154
    .line 155
    const/16 v20, 0x1fdf

    .line 156
    .line 157
    const/4 v8, 0x0

    .line 158
    const/4 v9, 0x0

    .line 159
    const/4 v10, 0x0

    .line 160
    const/4 v11, 0x0

    .line 161
    const/4 v12, 0x0

    .line 162
    const/4 v14, 0x0

    .line 163
    const/4 v15, 0x0

    .line 164
    const/16 v16, 0x0

    .line 165
    .line 166
    const/16 v17, 0x0

    .line 167
    .line 168
    const/16 v18, 0x0

    .line 169
    .line 170
    invoke-static/range {v7 .. v20}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    return-object v0

    .line 175
    :pswitch_1
    check-cast v6, Ljava/math/BigDecimal;

    .line 176
    .line 177
    move-object/from16 v1, p1

    .line 178
    .line 179
    check-cast v1, La/oyg0;

    .line 180
    .line 181
    move-object/from16 v7, p2

    .line 182
    .line 183
    check-cast v7, La/a820;

    .line 184
    .line 185
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    iget-object v8, v7, La/a820;->g:La/hx4;

    .line 192
    .line 193
    iget-object v1, v8, La/hx4;->b:La/yyc;

    .line 194
    .line 195
    if-eqz v5, :cond_5

    .line 196
    .line 197
    if-eqz v4, :cond_5

    .line 198
    .line 199
    move v5, v3

    .line 200
    :goto_4
    move-object v2, v6

    .line 201
    goto :goto_5

    .line 202
    :cond_5
    move v5, v2

    .line 203
    goto :goto_4

    .line 204
    :goto_5
    const/16 v6, 0x1e

    .line 205
    .line 206
    const/4 v3, 0x0

    .line 207
    iget-boolean v4, v0, La/oh20;->c:Z

    .line 208
    .line 209
    invoke-static/range {v1 .. v6}, La/yyc;->a(La/yyc;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZZI)La/yyc;

    .line 210
    .line 211
    .line 212
    move-result-object v10

    .line 213
    const/4 v14, 0x0

    .line 214
    const/16 v15, 0x3d

    .line 215
    .line 216
    const/4 v9, 0x0

    .line 217
    const/4 v11, 0x0

    .line 218
    const/4 v12, 0x0

    .line 219
    const/4 v13, 0x0

    .line 220
    invoke-static/range {v8 .. v15}, La/hx4;->a(La/hx4;La/a8q0;La/yyc;La/bx6;La/iwo0;La/knb0;ZI)La/hx4;

    .line 221
    .line 222
    .line 223
    move-result-object v13

    .line 224
    const/16 v23, 0x0

    .line 225
    .line 226
    const v24, 0x3ffbf

    .line 227
    .line 228
    .line 229
    const/4 v8, 0x0

    .line 230
    const/4 v10, 0x0

    .line 231
    const/4 v14, 0x0

    .line 232
    const/4 v15, 0x0

    .line 233
    const/16 v16, 0x0

    .line 234
    .line 235
    const/16 v17, 0x0

    .line 236
    .line 237
    const/16 v18, 0x0

    .line 238
    .line 239
    const/16 v19, 0x0

    .line 240
    .line 241
    const/16 v20, 0x0

    .line 242
    .line 243
    const/16 v21, 0x0

    .line 244
    .line 245
    const/16 v22, 0x0

    .line 246
    .line 247
    invoke-static/range {v7 .. v24}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    return-object v0

    .line 252
    nop

    .line 253
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
