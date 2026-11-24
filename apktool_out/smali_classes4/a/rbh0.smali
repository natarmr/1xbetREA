.class public final synthetic La/rbh0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:Z

.field public final synthetic e:La/ugd;

.field public final synthetic f:I

.field public final synthetic g:La/wdr;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IIZLkotlin/jvm/functions/Function0;La/mm40;La/ugd;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/rbh0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/rbh0;->b:I

    iput p2, p0, La/rbh0;->c:I

    iput-boolean p3, p0, La/rbh0;->d:Z

    iput-object p4, p0, La/rbh0;->g:La/wdr;

    iput-object p5, p0, La/rbh0;->h:Ljava/lang/Object;

    iput-object p6, p0, La/rbh0;->e:La/ugd;

    iput p7, p0, La/rbh0;->f:I

    return-void
.end method

.method public synthetic constructor <init>(La/ugd;IIZLa/pz40;La/ugd;I)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/rbh0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/rbh0;->e:La/ugd;

    iput p2, p0, La/rbh0;->b:I

    iput p3, p0, La/rbh0;->c:I

    iput-boolean p4, p0, La/rbh0;->d:Z

    iput-object p5, p0, La/rbh0;->h:Ljava/lang/Object;

    iput-object p6, p0, La/rbh0;->g:La/wdr;

    iput p7, p0, La/rbh0;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/rbh0;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/rbh0;->h:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, v0, La/rbh0;->g:La/wdr;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object v7, v3

    .line 13
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 14
    .line 15
    move-object v8, v2

    .line 16
    check-cast v8, La/mm40;

    .line 17
    .line 18
    move-object/from16 v10, p1

    .line 19
    .line 20
    check-cast v10, La/fet;

    .line 21
    .line 22
    move-object/from16 v1, p2

    .line 23
    .line 24
    check-cast v1, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget v1, v0, La/rbh0;->f:I

    .line 30
    .line 31
    or-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    invoke-static {v1}, La/x8x;->L(I)I

    .line 34
    .line 35
    .line 36
    move-result v11

    .line 37
    iget v4, v0, La/rbh0;->b:I

    .line 38
    .line 39
    iget v5, v0, La/rbh0;->c:I

    .line 40
    .line 41
    iget-boolean v6, v0, La/rbh0;->d:Z

    .line 42
    .line 43
    iget-object v9, v0, La/rbh0;->e:La/ugd;

    .line 44
    .line 45
    invoke-static/range {v4 .. v11}, La/tfx;->p(IIZLkotlin/jvm/functions/Function0;La/mm40;La/ugd;La/fet;I)V

    .line 46
    .line 47
    .line 48
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_0
    move-object v6, v2

    .line 52
    check-cast v6, La/pz40;

    .line 53
    .line 54
    move-object v8, v3

    .line 55
    check-cast v8, La/ugd;

    .line 56
    .line 57
    move-object/from16 v5, p1

    .line 58
    .line 59
    check-cast v5, La/c5n0;

    .line 60
    .line 61
    move-object/from16 v1, p2

    .line 62
    .line 63
    check-cast v1, La/p4e;

    .line 64
    .line 65
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    sget-object v2, La/wbh0;->a:La/wbh0;

    .line 69
    .line 70
    iget-object v3, v0, La/rbh0;->e:La/ugd;

    .line 71
    .line 72
    invoke-interface {v5, v2, v3}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-eqz v4, :cond_4

    .line 85
    .line 86
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    check-cast v4, La/pj30;

    .line 91
    .line 92
    const v7, 0x7fffffff

    .line 93
    .line 94
    .line 95
    invoke-interface {v4, v7}, La/pj30;->b(I)I

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    :goto_0
    move v13, v4

    .line 100
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-eqz v4, :cond_1

    .line 105
    .line 106
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    check-cast v4, La/pj30;

    .line 111
    .line 112
    invoke-interface {v4, v7}, La/pj30;->b(I)I

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-ge v13, v4, :cond_0

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_1
    iget-wide v9, v1, La/p4e;->a:J

    .line 120
    .line 121
    const/4 v12, 0x0

    .line 122
    const/4 v15, 0x2

    .line 123
    const/4 v11, 0x0

    .line 124
    move v14, v13

    .line 125
    invoke-static/range {v9 .. v15}, La/p4e;->b(JIIIII)J

    .line 126
    .line 127
    .line 128
    move-result-wide v17

    .line 129
    new-instance v4, Ljava/util/ArrayList;

    .line 130
    .line 131
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 136
    .line 137
    .line 138
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    const/4 v3, 0x0

    .line 143
    move v7, v3

    .line 144
    :goto_1
    const/16 v21, 0x1

    .line 145
    .line 146
    if-ge v7, v1, :cond_2

    .line 147
    .line 148
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v9

    .line 152
    move-object/from16 v16, v9

    .line 153
    .line 154
    check-cast v16, La/pj30;

    .line 155
    .line 156
    move-object/from16 v19, v4

    .line 157
    .line 158
    move/from16 v20, v7

    .line 159
    .line 160
    invoke-static/range {v16 .. v21}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 161
    .line 162
    .line 163
    move-result v7

    .line 164
    goto :goto_1

    .line 165
    :cond_2
    move-object/from16 v19, v4

    .line 166
    .line 167
    invoke-virtual/range {v19 .. v19}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    if-eqz v2, :cond_3

    .line 176
    .line 177
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    check-cast v2, La/pu90;

    .line 182
    .line 183
    iget v2, v2, La/pu90;->a:I

    .line 184
    .line 185
    add-int/2addr v3, v2

    .line 186
    goto :goto_2

    .line 187
    :cond_3
    invoke-virtual/range {v19 .. v19}, Ljava/util/ArrayList;->size()I

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    add-int/lit8 v1, v1, -0x1

    .line 192
    .line 193
    iget v7, v0, La/rbh0;->b:I

    .line 194
    .line 195
    mul-int/2addr v1, v7

    .line 196
    add-int/2addr v1, v3

    .line 197
    iget v2, v0, La/rbh0;->c:I

    .line 198
    .line 199
    add-int v3, v1, v2

    .line 200
    .line 201
    new-instance v1, La/tbh0;

    .line 202
    .line 203
    iget-boolean v2, v0, La/rbh0;->d:Z

    .line 204
    .line 205
    iget v9, v0, La/rbh0;->f:I

    .line 206
    .line 207
    move v10, v13

    .line 208
    move-object/from16 v4, v19

    .line 209
    .line 210
    invoke-direct/range {v1 .. v10}, La/tbh0;-><init>(ZILjava/util/ArrayList;La/c5n0;La/pz40;ILa/ugd;II)V

    .line 211
    .line 212
    .line 213
    invoke-static {v5, v3, v13, v1}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    goto :goto_3

    .line 218
    :cond_4
    invoke-static {}, La/itt0;->a()V

    .line 219
    .line 220
    .line 221
    const/4 v0, 0x0

    .line 222
    :goto_3
    return-object v0

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
