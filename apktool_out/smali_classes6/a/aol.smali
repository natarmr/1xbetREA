.class public final La/aol;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final synthetic a:La/ow3;

.field public final synthetic b:La/sw3;

.field public final synthetic c:I

.field public final synthetic d:La/hh80;

.field public final synthetic e:La/k6z;


# direct methods
.method public constructor <init>(La/ow3;La/sw3;ILa/hh80;La/k6z;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/aol;->a:La/ow3;

    .line 5
    .line 6
    iput-object p2, p0, La/aol;->b:La/sw3;

    .line 7
    .line 8
    iput p3, p0, La/aol;->c:I

    .line 9
    .line 10
    iput-object p4, p0, La/aol;->d:La/hh80;

    .line 11
    .line 12
    iput-object p5, p0, La/aol;->e:La/k6z;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v7, v0, La/aol;->a:La/ow3;

    .line 9
    .line 10
    invoke-interface {v7}, La/ow3;->a()F

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-interface {v1, v2}, La/w6k;->T(F)I

    .line 15
    .line 16
    .line 17
    move-result v9

    .line 18
    iget-object v2, v0, La/aol;->b:La/sw3;

    .line 19
    .line 20
    invoke-interface {v2}, La/sw3;->a()F

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-interface {v1, v2}, La/w6k;->T(F)I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    iget v2, v0, La/aol;->c:I

    .line 29
    .line 30
    add-int/lit8 v3, v2, -0x1

    .line 31
    .line 32
    mul-int/2addr v3, v9

    .line 33
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    move v5, v4

    .line 38
    iget-object v4, v0, La/aol;->d:La/hh80;

    .line 39
    .line 40
    iget-object v8, v0, La/aol;->e:La/k6z;

    .line 41
    .line 42
    invoke-interface {v4, v8}, La/hh80;->b(La/k6z;)F

    .line 43
    .line 44
    .line 45
    move-result v10

    .line 46
    invoke-interface {v1, v10}, La/w6k;->T(F)I

    .line 47
    .line 48
    .line 49
    move-result v10

    .line 50
    sub-int/2addr v5, v10

    .line 51
    invoke-interface {v4, v8}, La/hh80;->c(La/k6z;)F

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    invoke-interface {v1, v8}, La/w6k;->T(F)I

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    sub-int/2addr v5, v8

    .line 60
    sub-int/2addr v5, v3

    .line 61
    div-int v12, v5, v2

    .line 62
    .line 63
    const/4 v15, 0x0

    .line 64
    const/16 v16, 0xc

    .line 65
    .line 66
    const/4 v14, 0x0

    .line 67
    move v13, v12

    .line 68
    move-wide/from16 v10, p3

    .line 69
    .line 70
    invoke-static/range {v10 .. v16}, La/p4e;->b(JIIIII)J

    .line 71
    .line 72
    .line 73
    move-result-wide v13

    .line 74
    new-instance v5, Ljava/util/ArrayList;

    .line 75
    .line 76
    const/16 v3, 0xa

    .line 77
    .line 78
    move-object/from16 v8, p2

    .line 79
    .line 80
    invoke-static {v8, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    invoke-direct {v5, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 85
    .line 86
    .line 87
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    if-eqz v8, :cond_0

    .line 96
    .line 97
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    check-cast v8, La/pj30;

    .line 102
    .line 103
    invoke-interface {v8, v13, v14}, La/pj30;->S(J)La/pu90;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_0
    new-array v3, v2, [I

    .line 112
    .line 113
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    const/4 v10, 0x0

    .line 118
    move v11, v10

    .line 119
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v13

    .line 123
    if-eqz v13, :cond_3

    .line 124
    .line 125
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v13

    .line 129
    add-int/lit8 v14, v11, 0x1

    .line 130
    .line 131
    if-ltz v11, :cond_2

    .line 132
    .line 133
    check-cast v13, La/pu90;

    .line 134
    .line 135
    rem-int v15, v11, v2

    .line 136
    .line 137
    if-lt v11, v2, :cond_1

    .line 138
    .line 139
    aget v11, v3, v15

    .line 140
    .line 141
    add-int/2addr v11, v6

    .line 142
    aput v11, v3, v15

    .line 143
    .line 144
    :cond_1
    aget v11, v3, v15

    .line 145
    .line 146
    iget v13, v13, La/pu90;->b:I

    .line 147
    .line 148
    add-int/2addr v11, v13

    .line 149
    aput v11, v3, v15

    .line 150
    .line 151
    move v11, v14

    .line 152
    goto :goto_1

    .line 153
    :cond_2
    invoke-static {}, La/q3d;->p()V

    .line 154
    .line 155
    .line 156
    const/4 v0, 0x0

    .line 157
    throw v0

    .line 158
    :cond_3
    invoke-static {v3}, La/tx3;->R([I)Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    if-eqz v2, :cond_4

    .line 163
    .line 164
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 165
    .line 166
    .line 167
    move-result v10

    .line 168
    :cond_4
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 169
    .line 170
    .line 171
    move-result v13

    .line 172
    invoke-interface {v4}, La/hh80;->d()F

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    invoke-interface {v1, v2}, La/w6k;->T(F)I

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    add-int/2addr v2, v10

    .line 181
    invoke-interface {v4}, La/hh80;->a()F

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    invoke-interface {v1, v3}, La/w6k;->T(F)I

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    add-int v14, v3, v2

    .line 190
    .line 191
    new-instance v2, La/znl;

    .line 192
    .line 193
    iget v3, v0, La/aol;->c:I

    .line 194
    .line 195
    iget-object v0, v0, La/aol;->e:La/k6z;

    .line 196
    .line 197
    move-wide/from16 v10, p3

    .line 198
    .line 199
    move v8, v12

    .line 200
    move-object v12, v0

    .line 201
    invoke-direct/range {v2 .. v12}, La/znl;-><init>(ILa/hh80;Ljava/util/ArrayList;ILa/ow3;IIJLa/k6z;)V

    .line 202
    .line 203
    .line 204
    invoke-static {v1, v13, v14, v2}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    return-object v0
.end method
