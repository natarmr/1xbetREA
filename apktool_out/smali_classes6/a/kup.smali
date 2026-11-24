.class public final synthetic La/kup;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wyu;

.field public final synthetic c:La/weu;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:La/qzt;

.field public final synthetic f:La/ctf0;

.field public final synthetic g:La/fhj;

.field public final synthetic h:J

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/weu;Ljava/lang/String;La/qzt;La/ctf0;La/fhj;JLa/wyu;La/r9u;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/kup;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/kup;->c:La/weu;

    iput-object p2, p0, La/kup;->d:Ljava/lang/String;

    iput-object p3, p0, La/kup;->e:La/qzt;

    iput-object p4, p0, La/kup;->f:La/ctf0;

    iput-object p5, p0, La/kup;->g:La/fhj;

    iput-wide p6, p0, La/kup;->h:J

    iput-object p8, p0, La/kup;->b:La/wyu;

    iput-object p9, p0, La/kup;->i:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/wyu;La/weu;Ljava/lang/String;La/qzt;La/ctf0;La/fhj;JLa/pru;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/kup;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/kup;->b:La/wyu;

    iput-object p2, p0, La/kup;->c:La/weu;

    iput-object p3, p0, La/kup;->d:Ljava/lang/String;

    iput-object p4, p0, La/kup;->e:La/qzt;

    iput-object p5, p0, La/kup;->f:La/ctf0;

    iput-object p6, p0, La/kup;->g:La/fhj;

    iput-wide p7, p0, La/kup;->h:J

    iput-object p9, p0, La/kup;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/kup;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/kup;->i:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, v0, La/kup;->f:La/ctf0;

    .line 8
    .line 9
    iget-object v4, v0, La/kup;->e:La/qzt;

    .line 10
    .line 11
    iget-object v5, v0, La/kup;->c:La/weu;

    .line 12
    .line 13
    iget-object v6, v0, La/kup;->b:La/wyu;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v2, La/pru;

    .line 19
    .line 20
    invoke-virtual {v6}, La/wyu;->a()La/uaq0;

    .line 21
    .line 22
    .line 23
    move-result-object v11

    .line 24
    sget-object v16, La/xqj0;->v:La/xqj0;

    .line 25
    .line 26
    sget-object v1, La/uaq0;->a:La/s9m0;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {v11}, La/s9m0;->j(La/uaq0;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    const/4 v6, 0x1

    .line 36
    xor-int/2addr v1, v6

    .line 37
    sget-object v14, La/iun;->a:La/iun;

    .line 38
    .line 39
    iget-object v8, v0, La/kup;->d:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v5, v8}, La/weu;->a(Ljava/lang/String;)La/hdm0;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-virtual {v4}, La/qzt;->a()La/eme;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-static {v5, v4, v3}, La/aem0;->x(La/hdm0;La/eme;La/ctf0;)La/zdm0;

    .line 50
    .line 51
    .line 52
    move-result-object v18

    .line 53
    const-wide/16 v12, 0x0

    .line 54
    .line 55
    iget-object v7, v0, La/kup;->g:La/fhj;

    .line 56
    .line 57
    iget-wide v9, v0, La/kup;->h:J

    .line 58
    .line 59
    invoke-virtual/range {v7 .. v13}, La/fhj;->s(Ljava/lang/String;JLa/uaq0;J)La/nc5;

    .line 60
    .line 61
    .line 62
    move-result-object v19

    .line 63
    new-instance v20, Ljava/util/LinkedHashSet;

    .line 64
    .line 65
    invoke-direct/range {v20 .. v20}, Ljava/util/LinkedHashSet;-><init>()V

    .line 66
    .line 67
    .line 68
    new-instance v0, La/ehm0;

    .line 69
    .line 70
    const/4 v3, 0x0

    .line 71
    invoke-direct {v0, v3}, La/ehm0;-><init>(Z)V

    .line 72
    .line 73
    .line 74
    new-instance v4, La/ehm0;

    .line 75
    .line 76
    invoke-direct {v4, v3}, La/ehm0;-><init>(Z)V

    .line 77
    .line 78
    .line 79
    new-instance v5, La/ehm0;

    .line 80
    .line 81
    invoke-direct {v5, v6}, La/ehm0;-><init>(Z)V

    .line 82
    .line 83
    .line 84
    new-instance v7, La/l800;

    .line 85
    .line 86
    invoke-direct {v7, v3, v14, v14, v14}, La/l800;-><init>(ILjava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 87
    .line 88
    .line 89
    new-instance v21, La/na00;

    .line 90
    .line 91
    const/16 v31, 0x0

    .line 92
    .line 93
    const-wide/16 v32, 0x0

    .line 94
    .line 95
    const/16 v23, 0x0

    .line 96
    .line 97
    const-wide/16 v24, 0x0

    .line 98
    .line 99
    const-wide/16 v26, 0x0

    .line 100
    .line 101
    const/16 v28, 0x0

    .line 102
    .line 103
    const/16 v29, 0x1

    .line 104
    .line 105
    const/16 v30, 0x0

    .line 106
    .line 107
    move-object/from16 v22, v7

    .line 108
    .line 109
    invoke-direct/range {v21 .. v33}, La/na00;-><init>(La/l800;IJJZZZZJ)V

    .line 110
    .line 111
    .line 112
    new-instance v7, La/ehm0;

    .line 113
    .line 114
    invoke-direct {v7, v3}, La/ehm0;-><init>(Z)V

    .line 115
    .line 116
    .line 117
    new-instance v12, La/ehm0;

    .line 118
    .line 119
    invoke-direct {v12, v3}, La/ehm0;-><init>(Z)V

    .line 120
    .line 121
    .line 122
    new-instance v13, La/ehm0;

    .line 123
    .line 124
    invoke-direct {v13, v3}, La/ehm0;-><init>(Z)V

    .line 125
    .line 126
    .line 127
    new-instance v3, La/ehm0;

    .line 128
    .line 129
    invoke-direct {v3, v6}, La/ehm0;-><init>(Z)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2}, La/pru;->a()La/sff0;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    iget-object v2, v2, La/sff0;->g:La/mum0;

    .line 137
    .line 138
    iget-object v2, v2, La/mum0;->t:La/llm0;

    .line 139
    .line 140
    move-object/from16 v26, v7

    .line 141
    .line 142
    new-instance v7, La/v020;

    .line 143
    .line 144
    const/4 v15, 0x0

    .line 145
    const/16 v17, 0x0

    .line 146
    .line 147
    move-object/from16 v25, v14

    .line 148
    .line 149
    move-object v14, v8

    .line 150
    const/4 v8, 0x1

    .line 151
    move-object/from16 v30, v11

    .line 152
    .line 153
    move-wide v10, v9

    .line 154
    const/4 v9, 0x0

    .line 155
    move-object/from16 v28, v13

    .line 156
    .line 157
    const-string v13, ""

    .line 158
    .line 159
    move-object/from16 v31, v2

    .line 160
    .line 161
    move-object/from16 v29, v3

    .line 162
    .line 163
    move-object/from16 v22, v4

    .line 164
    .line 165
    move-object/from16 v24, v5

    .line 166
    .line 167
    move-object/from16 v27, v12

    .line 168
    .line 169
    move-object/from16 v23, v21

    .line 170
    .line 171
    move-object/from16 v21, v0

    .line 172
    .line 173
    move v12, v1

    .line 174
    invoke-direct/range {v7 .. v31}, La/v020;-><init>(ZZJZLjava/lang/String;Ljava/lang/String;ILa/xqj0;La/ixs0;La/zdm0;La/nc5;Ljava/util/Set;La/ehm0;La/ehm0;La/na00;La/ehm0;Ljava/util/List;La/ehm0;La/ehm0;La/ehm0;La/ehm0;La/uaq0;La/llm0;)V

    .line 175
    .line 176
    .line 177
    return-object v7

    .line 178
    :pswitch_0
    check-cast v2, La/r9u;

    .line 179
    .line 180
    new-instance v1, La/hup;

    .line 181
    .line 182
    iget-object v8, v0, La/kup;->d:Ljava/lang/String;

    .line 183
    .line 184
    invoke-virtual {v5, v8}, La/weu;->a(Ljava/lang/String;)La/hdm0;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    invoke-virtual {v4}, La/qzt;->a()La/eme;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    invoke-static {v5, v4, v3}, La/aem0;->x(La/hdm0;La/eme;La/ctf0;)La/zdm0;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-virtual {v6}, La/wyu;->a()La/uaq0;

    .line 197
    .line 198
    .line 199
    move-result-object v11

    .line 200
    const-wide/16 v12, 0x0

    .line 201
    .line 202
    iget-object v7, v0, La/kup;->g:La/fhj;

    .line 203
    .line 204
    iget-wide v9, v0, La/kup;->h:J

    .line 205
    .line 206
    invoke-virtual/range {v7 .. v13}, La/fhj;->s(Ljava/lang/String;JLa/uaq0;J)La/nc5;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-static {v0}, La/ydx;->c0(La/nc5;)La/j9m0;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    sget-object v4, La/ygp;->t:La/ygp;

    .line 215
    .line 216
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    iget-object v2, v2, La/r9u;->a:La/j1q0;

    .line 220
    .line 221
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    iget-object v2, v2, La/j1q0;->a:La/m1q0;

    .line 225
    .line 226
    invoke-virtual {v2, v4}, La/m1q0;->d(La/ygp;)Z

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    sget-object v4, La/rtp;->a:La/rtp;

    .line 231
    .line 232
    invoke-direct {v1, v3, v0, v4, v2}, La/hup;-><init>(La/zdm0;La/j9m0;La/utp;Z)V

    .line 233
    .line 234
    .line 235
    return-object v1

    .line 236
    nop

    .line 237
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
