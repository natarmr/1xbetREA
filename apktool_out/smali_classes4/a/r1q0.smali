.class public final La/r1q0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/aer;


# instance fields
.field public synthetic i:La/ghp;

.field public synthetic j:La/cre;

.field public synthetic k:Z

.field public synthetic l:Z

.field public synthetic m:Ljava/lang/String;

.field public final synthetic n:La/n660;

.field public final synthetic o:Z


# direct methods
.method public constructor <init>(La/n660;ZLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/r1q0;->n:La/n660;

    .line 2
    .line 3
    iput-boolean p2, p0, La/r1q0;->o:Z

    .line 4
    .line 5
    const/4 p1, 0x6

    .line 6
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/r1q0;->i:La/ghp;

    .line 4
    .line 5
    iget-object v14, v0, La/r1q0;->j:La/cre;

    .line 6
    .line 7
    iget-boolean v2, v0, La/r1q0;->k:Z

    .line 8
    .line 9
    iget-boolean v3, v0, La/r1q0;->l:Z

    .line 10
    .line 11
    iget-object v4, v0, La/r1q0;->m:Ljava/lang/String;

    .line 12
    .line 13
    sget-object v5, La/wne;->a:La/wne;

    .line 14
    .line 15
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    move/from16 v27, v3

    .line 19
    .line 20
    iget-boolean v3, v1, La/ghp;->a:Z

    .line 21
    .line 22
    move-object v5, v4

    .line 23
    iget-boolean v4, v1, La/ghp;->b:Z

    .line 24
    .line 25
    move-object v6, v5

    .line 26
    iget-boolean v5, v1, La/ghp;->c:Z

    .line 27
    .line 28
    move-object v7, v6

    .line 29
    iget-boolean v6, v1, La/ghp;->d:Z

    .line 30
    .line 31
    move-object v8, v7

    .line 32
    iget-boolean v7, v1, La/ghp;->e:Z

    .line 33
    .line 34
    move-object v9, v8

    .line 35
    iget-boolean v8, v1, La/ghp;->f:Z

    .line 36
    .line 37
    move-object v10, v9

    .line 38
    iget-boolean v9, v1, La/ghp;->g:Z

    .line 39
    .line 40
    move-object v11, v10

    .line 41
    iget-boolean v10, v1, La/ghp;->h:Z

    .line 42
    .line 43
    iget-object v12, v0, La/r1q0;->n:La/n660;

    .line 44
    .line 45
    iget-object v13, v12, La/n660;->c:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v13, La/peg0;

    .line 48
    .line 49
    iget-object v15, v12, La/n660;->a:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v15, La/j1q0;

    .line 52
    .line 53
    move/from16 v22, v2

    .line 54
    .line 55
    iget-object v2, v15, La/j1q0;->a:La/m1q0;

    .line 56
    .line 57
    iget-object v2, v2, La/m1q0;->a:La/q7d0;

    .line 58
    .line 59
    move/from16 v16, v3

    .line 60
    .line 61
    const-string v3, "FAKE_WORDS_ENABLED"

    .line 62
    .line 63
    invoke-static {v2, v3}, La/q7d0;->c(La/q7d0;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    const-string v3, ""

    .line 68
    .line 69
    if-nez v2, :cond_0

    .line 70
    .line 71
    move-object v2, v3

    .line 72
    :cond_0
    if-eqz v27, :cond_1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 76
    .line 77
    .line 78
    move-result v17

    .line 79
    if-lez v17, :cond_2

    .line 80
    .line 81
    :goto_0
    move-object v12, v11

    .line 82
    goto :goto_1

    .line 83
    :cond_2
    iget-object v11, v12, La/n660;->d:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v11, La/yk50;

    .line 86
    .line 87
    iget-object v11, v11, La/yk50;->b:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v11, La/knf0;

    .line 90
    .line 91
    invoke-virtual {v11}, La/knf0;->a()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v11

    .line 95
    goto :goto_0

    .line 96
    :goto_1
    iget-object v11, v13, La/peg0;->b:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v11, La/us3;

    .line 99
    .line 100
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    iget-object v11, v13, La/peg0;->b:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v11, La/us3;

    .line 106
    .line 107
    invoke-virtual {v11}, La/us3;->c()La/go3;

    .line 108
    .line 109
    .line 110
    move-result-object v11

    .line 111
    invoke-virtual {v11}, La/go3;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v11

    .line 115
    iget-object v13, v15, La/j1q0;->a:La/m1q0;

    .line 116
    .line 117
    invoke-virtual {v13}, La/m1q0;->k()Z

    .line 118
    .line 119
    .line 120
    move-result v19

    .line 121
    iget-object v13, v15, La/j1q0;->a:La/m1q0;

    .line 122
    .line 123
    invoke-virtual {v13}, La/m1q0;->e()Z

    .line 124
    .line 125
    .line 126
    move-result v13

    .line 127
    move-object/from16 p1, v2

    .line 128
    .line 129
    iget-object v2, v15, La/j1q0;->a:La/m1q0;

    .line 130
    .line 131
    invoke-virtual {v2}, La/m1q0;->l()Z

    .line 132
    .line 133
    .line 134
    move-result v17

    .line 135
    iget-object v2, v15, La/j1q0;->a:La/m1q0;

    .line 136
    .line 137
    invoke-virtual {v2}, La/m1q0;->m()Z

    .line 138
    .line 139
    .line 140
    move-result v18

    .line 141
    iget-object v2, v15, La/j1q0;->a:La/m1q0;

    .line 142
    .line 143
    iget-object v2, v2, La/m1q0;->a:La/q7d0;

    .line 144
    .line 145
    move-object/from16 v20, v2

    .line 146
    .line 147
    const-string v2, "SPECIAL_EVENT_ENABLE"

    .line 148
    .line 149
    move/from16 v21, v4

    .line 150
    .line 151
    invoke-virtual/range {v20 .. v20}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    move/from16 v20, v5

    .line 156
    .line 157
    const/4 v5, 0x0

    .line 158
    invoke-interface {v4, v2, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    iget-boolean v0, v0, La/r1q0;->o:Z

    .line 163
    .line 164
    iget-object v4, v15, La/j1q0;->a:La/m1q0;

    .line 165
    .line 166
    invoke-virtual {v4, v0}, La/m1q0;->h(Z)Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    iget-boolean v4, v1, La/ghp;->q:Z

    .line 171
    .line 172
    iget-boolean v5, v1, La/ghp;->p:Z

    .line 173
    .line 174
    move/from16 p0, v0

    .line 175
    .line 176
    iget-object v0, v15, La/j1q0;->a:La/m1q0;

    .line 177
    .line 178
    iget-object v0, v0, La/m1q0;->a:La/q7d0;

    .line 179
    .line 180
    move/from16 v24, v2

    .line 181
    .line 182
    const-string v2, "MANUAL_TEST_DOMAIN"

    .line 183
    .line 184
    invoke-virtual {v0, v2, v3}, La/q7d0;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    if-nez v0, :cond_3

    .line 189
    .line 190
    move-object/from16 v25, v3

    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_3
    move-object/from16 v25, v0

    .line 194
    .line 195
    :goto_2
    iget-object v0, v15, La/j1q0;->a:La/m1q0;

    .line 196
    .line 197
    invoke-virtual {v0}, La/m1q0;->q()Z

    .line 198
    .line 199
    .line 200
    move-result v26

    .line 201
    iget-boolean v0, v1, La/ghp;->t:Z

    .line 202
    .line 203
    iget-object v2, v15, La/j1q0;->a:La/m1q0;

    .line 204
    .line 205
    iget-object v2, v2, La/m1q0;->a:La/q7d0;

    .line 206
    .line 207
    const-string v3, "TEST_MULTIPLY_STRINGS_ENABLE"

    .line 208
    .line 209
    invoke-virtual {v2}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    const/4 v15, 0x0

    .line 214
    invoke-interface {v2, v3, v15}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 215
    .line 216
    .line 217
    move-result v30

    .line 218
    iget-boolean v1, v1, La/ghp;->s:Z

    .line 219
    .line 220
    new-instance v2, La/l1q0;

    .line 221
    .line 222
    move/from16 v3, v16

    .line 223
    .line 224
    move/from16 v16, v13

    .line 225
    .line 226
    const/4 v13, 0x0

    .line 227
    move/from16 v28, v0

    .line 228
    .line 229
    move/from16 v29, v1

    .line 230
    .line 231
    move/from16 v23, v5

    .line 232
    .line 233
    move-object v15, v11

    .line 234
    move/from16 v5, v20

    .line 235
    .line 236
    move/from16 v20, v24

    .line 237
    .line 238
    move-object/from16 v11, p1

    .line 239
    .line 240
    move/from16 v24, v4

    .line 241
    .line 242
    move/from16 v4, v21

    .line 243
    .line 244
    move/from16 v21, p0

    .line 245
    .line 246
    invoke-direct/range {v2 .. v30}, La/l1q0;-><init>(ZZZZZZZZLjava/lang/String;Ljava/lang/String;ZLa/cre;Ljava/lang/String;ZZZZZZZZZLjava/lang/String;ZZZZZ)V

    .line 247
    .line 248
    .line 249
    return-object v2
.end method

.method public final n(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, La/ghp;

    .line 2
    .line 3
    check-cast p2, La/cre;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    check-cast p4, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result p4

    .line 17
    check-cast p5, Ljava/lang/String;

    .line 18
    .line 19
    check-cast p6, La/yje;

    .line 20
    .line 21
    new-instance v0, La/r1q0;

    .line 22
    .line 23
    iget-object v1, p0, La/r1q0;->n:La/n660;

    .line 24
    .line 25
    iget-boolean p0, p0, La/r1q0;->o:Z

    .line 26
    .line 27
    invoke-direct {v0, v1, p0, p6}, La/r1q0;-><init>(La/n660;ZLa/yje;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, v0, La/r1q0;->i:La/ghp;

    .line 31
    .line 32
    iput-object p2, v0, La/r1q0;->j:La/cre;

    .line 33
    .line 34
    iput-boolean p3, v0, La/r1q0;->k:Z

    .line 35
    .line 36
    iput-boolean p4, v0, La/r1q0;->l:Z

    .line 37
    .line 38
    iput-object p5, v0, La/r1q0;->m:Ljava/lang/String;

    .line 39
    .line 40
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {v0, p0}, La/r1q0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method
