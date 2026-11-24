.class public final La/uku;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:La/kmq;

.field public final synthetic b:La/dgu;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/util/List;

.field public final synthetic e:Ljava/util/List;

.field public final synthetic f:Z

.field public final synthetic g:Z


# direct methods
.method public constructor <init>(La/kmq;La/dgu;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/uku;->a:La/kmq;

    .line 5
    .line 6
    iput-object p2, p0, La/uku;->b:La/dgu;

    .line 7
    .line 8
    iput-object p3, p0, La/uku;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, La/uku;->d:Ljava/util/List;

    .line 11
    .line 12
    iput-object p5, p0, La/uku;->e:Ljava/util/List;

    .line 13
    .line 14
    iput-boolean p6, p0, La/uku;->f:Z

    .line 15
    .line 16
    iput-boolean p7, p0, La/uku;->g:Z

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, La/uku;->b:La/dgu;

    .line 6
    .line 7
    iget-object v3, v2, La/dgu;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, La/j1q0;

    .line 10
    .line 11
    iget-object v2, v2, La/dgu;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, La/uga0;

    .line 14
    .line 15
    instance-of v4, v1, La/tku;

    .line 16
    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    move-object v4, v1

    .line 20
    check-cast v4, La/tku;

    .line 21
    .line 22
    iget v5, v4, La/tku;->j:I

    .line 23
    .line 24
    const/high16 v6, -0x80000000

    .line 25
    .line 26
    and-int v7, v5, v6

    .line 27
    .line 28
    if-eqz v7, :cond_0

    .line 29
    .line 30
    sub-int/2addr v5, v6

    .line 31
    iput v5, v4, La/tku;->j:I

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance v4, La/tku;

    .line 35
    .line 36
    invoke-direct {v4, v0, v1}, La/tku;-><init>(La/uku;La/yje;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    iget-object v1, v4, La/tku;->i:Ljava/lang/Object;

    .line 40
    .line 41
    sget-object v5, La/wne;->a:La/wne;

    .line 42
    .line 43
    iget v6, v4, La/tku;->j:I

    .line 44
    .line 45
    const/4 v7, 0x0

    .line 46
    const/4 v8, 0x1

    .line 47
    if-eqz v6, :cond_2

    .line 48
    .line 49
    if-ne v6, v8, :cond_1

    .line 50
    .line 51
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_6

    .line 55
    .line 56
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object v7

    .line 62
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    move-object/from16 v1, p1

    .line 66
    .line 67
    check-cast v1, Ljava/util/List;

    .line 68
    .line 69
    iget-object v6, v2, La/uga0;->a:La/tga0;

    .line 70
    .line 71
    iget-object v6, v6, La/tga0;->b:Ljava/util/LinkedHashMap;

    .line 72
    .line 73
    iget-object v9, v0, La/uku;->c:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v6, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v10

    .line 79
    check-cast v10, La/rga0;

    .line 80
    .line 81
    if-eqz v10, :cond_3

    .line 82
    .line 83
    iget-object v6, v10, La/rga0;->a:La/p7m0;

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    new-instance v10, La/rga0;

    .line 87
    .line 88
    invoke-direct {v10}, La/rga0;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-interface {v6, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    iget-object v6, v10, La/rga0;->a:La/p7m0;

    .line 95
    .line 96
    :goto_1
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    check-cast v6, Ljava/util/List;

    .line 101
    .line 102
    if-nez v6, :cond_4

    .line 103
    .line 104
    sget-object v6, La/iun;->a:La/iun;

    .line 105
    .line 106
    :cond_4
    move-object v11, v6

    .line 107
    iget-object v6, v3, La/j1q0;->a:La/m1q0;

    .line 108
    .line 109
    invoke-virtual {v6}, La/m1q0;->j()Z

    .line 110
    .line 111
    .line 112
    move-result v14

    .line 113
    new-instance v6, Ljava/util/ArrayList;

    .line 114
    .line 115
    const/16 v10, 0xa

    .line 116
    .line 117
    invoke-static {v1, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 118
    .line 119
    .line 120
    move-result v10

    .line 121
    invoke-direct {v6, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 122
    .line 123
    .line 124
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v10

    .line 132
    if-eqz v10, :cond_7

    .line 133
    .line 134
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v10

    .line 138
    check-cast v10, La/h07;

    .line 139
    .line 140
    iget-object v12, v3, La/j1q0;->a:La/m1q0;

    .line 141
    .line 142
    invoke-virtual {v12}, La/m1q0;->f()Z

    .line 143
    .line 144
    .line 145
    move-result v12

    .line 146
    if-nez v12, :cond_6

    .line 147
    .line 148
    iget-boolean v12, v0, La/uku;->g:Z

    .line 149
    .line 150
    if-eqz v12, :cond_5

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_5
    const/4 v12, 0x0

    .line 154
    move/from16 v16, v12

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_6
    :goto_3
    move/from16 v16, v8

    .line 158
    .line 159
    :goto_4
    iget-object v12, v0, La/uku;->d:Ljava/util/List;

    .line 160
    .line 161
    iget-object v13, v0, La/uku;->e:Ljava/util/List;

    .line 162
    .line 163
    iget-boolean v15, v0, La/uku;->f:Z

    .line 164
    .line 165
    invoke-static/range {v10 .. v16}, La/vdx;->c0(La/h07;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZ)La/sr20;

    .line 166
    .line 167
    .line 168
    move-result-object v10

    .line 169
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_7
    iget-object v1, v2, La/uga0;->a:La/tga0;

    .line 174
    .line 175
    iget-object v1, v1, La/tga0;->b:Ljava/util/LinkedHashMap;

    .line 176
    .line 177
    invoke-virtual {v1, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    check-cast v2, La/rga0;

    .line 182
    .line 183
    if-eqz v2, :cond_8

    .line 184
    .line 185
    iget-object v1, v2, La/rga0;->a:La/p7m0;

    .line 186
    .line 187
    goto :goto_5

    .line 188
    :cond_8
    new-instance v2, La/rga0;

    .line 189
    .line 190
    invoke-direct {v2}, La/rga0;-><init>()V

    .line 191
    .line 192
    .line 193
    invoke-interface {v1, v9, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    iget-object v1, v2, La/rga0;->a:La/p7m0;

    .line 197
    .line 198
    :goto_5
    invoke-virtual {v1, v7, v6}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    iput v8, v4, La/tku;->j:I

    .line 202
    .line 203
    iget-object v0, v0, La/uku;->a:La/kmq;

    .line 204
    .line 205
    invoke-interface {v0, v6, v4}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    if-ne v0, v5, :cond_9

    .line 210
    .line 211
    return-object v5

    .line 212
    :cond_9
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 213
    .line 214
    return-object v0
.end method
