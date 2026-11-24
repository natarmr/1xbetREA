.class public abstract La/jjo0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/ArrayList;

.field public static final b:Ljava/util/ArrayList;

.field public static final c:Ljava/util/ArrayList;

.field public static final d:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 19

    .line 1
    sget-object v0, La/md80;->o:La/md80;

    .line 2
    .line 3
    sget-object v1, La/md80;->v:La/md80;

    .line 4
    .line 5
    sget-object v2, La/md80;->w:La/md80;

    .line 6
    .line 7
    sget-object v3, La/md80;->B:La/md80;

    .line 8
    .line 9
    sget-object v4, La/md80;->Y:La/md80;

    .line 10
    .line 11
    sget-object v5, La/md80;->Z:La/md80;

    .line 12
    .line 13
    sget-object v6, La/md80;->i1:La/md80;

    .line 14
    .line 15
    sget-object v7, La/md80;->j1:La/md80;

    .line 16
    .line 17
    sget-object v8, La/md80;->k1:La/md80;

    .line 18
    .line 19
    sget-object v9, La/md80;->l1:La/md80;

    .line 20
    .line 21
    sget-object v10, La/md80;->o1:La/md80;

    .line 22
    .line 23
    sget-object v11, La/md80;->p1:La/md80;

    .line 24
    .line 25
    sget-object v12, La/md80;->q1:La/md80;

    .line 26
    .line 27
    sget-object v13, La/md80;->r1:La/md80;

    .line 28
    .line 29
    sget-object v14, La/md80;->s1:La/md80;

    .line 30
    .line 31
    filled-new-array/range {v0 .. v14}, [La/md80;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v1, Ljava/util/ArrayList;

    .line 40
    .line 41
    const/16 v2, 0xa

    .line 42
    .line 43
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 48
    .line 49
    .line 50
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_0

    .line 59
    .line 60
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    check-cast v3, La/md80;

    .line 65
    .line 66
    iget-byte v3, v3, La/md80;->a:B

    .line 67
    .line 68
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    sput-object v1, La/jjo0;->a:Ljava/util/ArrayList;

    .line 77
    .line 78
    sget-object v4, La/md80;->j:La/md80;

    .line 79
    .line 80
    sget-object v5, La/md80;->k:La/md80;

    .line 81
    .line 82
    sget-object v6, La/md80;->q:La/md80;

    .line 83
    .line 84
    sget-object v7, La/md80;->l:La/md80;

    .line 85
    .line 86
    sget-object v8, La/md80;->r:La/md80;

    .line 87
    .line 88
    sget-object v9, La/md80;->y:La/md80;

    .line 89
    .line 90
    sget-object v10, La/md80;->m:La/md80;

    .line 91
    .line 92
    sget-object v11, La/md80;->s:La/md80;

    .line 93
    .line 94
    sget-object v12, La/md80;->z:La/md80;

    .line 95
    .line 96
    sget-object v13, La/md80;->g1:La/md80;

    .line 97
    .line 98
    sget-object v14, La/md80;->n:La/md80;

    .line 99
    .line 100
    sget-object v15, La/md80;->t:La/md80;

    .line 101
    .line 102
    sget-object v16, La/md80;->A:La/md80;

    .line 103
    .line 104
    sget-object v17, La/md80;->h1:La/md80;

    .line 105
    .line 106
    sget-object v18, La/md80;->n1:La/md80;

    .line 107
    .line 108
    filled-new-array/range {v4 .. v18}, [La/md80;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    new-instance v1, Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 123
    .line 124
    .line 125
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    if-eqz v3, :cond_1

    .line 134
    .line 135
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    check-cast v3, La/md80;

    .line 140
    .line 141
    iget-byte v3, v3, La/md80;->a:B

    .line 142
    .line 143
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_1
    sput-object v1, La/jjo0;->b:Ljava/util/ArrayList;

    .line 152
    .line 153
    sget-object v4, La/md80;->i:La/md80;

    .line 154
    .line 155
    sget-object v5, La/md80;->p:La/md80;

    .line 156
    .line 157
    sget-object v6, La/md80;->x:La/md80;

    .line 158
    .line 159
    sget-object v7, La/md80;->f1:La/md80;

    .line 160
    .line 161
    sget-object v8, La/md80;->m1:La/md80;

    .line 162
    .line 163
    sget-object v9, La/md80;->t1:La/md80;

    .line 164
    .line 165
    sget-object v10, La/md80;->u:La/md80;

    .line 166
    .line 167
    filled-new-array/range {v4 .. v10}, [La/md80;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    new-instance v1, Ljava/util/ArrayList;

    .line 176
    .line 177
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 182
    .line 183
    .line 184
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    if-eqz v2, :cond_2

    .line 193
    .line 194
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    check-cast v2, La/md80;

    .line 199
    .line 200
    iget-byte v2, v2, La/md80;->a:B

    .line 201
    .line 202
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    goto :goto_2

    .line 210
    :cond_2
    sput-object v1, La/jjo0;->c:Ljava/util/ArrayList;

    .line 211
    .line 212
    sget-object v0, La/ulr0;->f:La/ulr0;

    .line 213
    .line 214
    sget-object v1, La/ulr0;->j:La/ulr0;

    .line 215
    .line 216
    sget-object v2, La/ulr0;->i:La/ulr0;

    .line 217
    .line 218
    filled-new-array {v0, v1, v2}, [La/ulr0;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    sput-object v0, La/jjo0;->d:Ljava/util/List;

    .line 227
    .line 228
    return-void
.end method

.method public static final a(ILa/ctf0;)Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, La/md80;->v1:La/c0o;

    .line 2
    .line 3
    invoke-static {v0, v0}, La/ohs0;->h(La/c0o;La/c0o;)La/y2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-virtual {v0}, La/y2;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, La/y2;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    move-object v2, v1

    .line 18
    check-cast v2, La/md80;

    .line 19
    .line 20
    iget-byte v2, v2, La/md80;->a:B

    .line 21
    .line 22
    if-ne v2, p0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v1, 0x0

    .line 26
    :goto_0
    check-cast v1, La/md80;

    .line 27
    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    sget-object v1, La/md80;->u:La/md80;

    .line 31
    .line 32
    :cond_2
    invoke-static {v1}, La/qxw;->C(La/md80;)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    const/4 v0, 0x0

    .line 37
    new-array v1, v0, [Ljava/lang/Object;

    .line 38
    .line 39
    iget-object p1, p1, La/ctf0;->b:La/lsm0;

    .line 40
    .line 41
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {p1, p0, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method

.method public static final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    :goto_0
    if-nez p0, :cond_1

    .line 10
    .line 11
    const-string p0, "-"

    .line 12
    .line 13
    :cond_1
    return-object p0
.end method
