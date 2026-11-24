.class public final synthetic La/liw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/oiw;


# direct methods
.method public synthetic constructor <init>(La/oiw;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/liw;->a:B

    iput-object p1, p0, La/liw;->b:La/oiw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/liw;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/liw;->b:La/oiw;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, La/oiw;->K1:La/fiu0;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    const-string v0, "viewModelFactory"

    .line 17
    .line 18
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v2

    .line 22
    :pswitch_0
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    instance-of v3, v1, La/af3;

    .line 34
    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    check-cast v1, La/af3;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move-object v1, v2

    .line 41
    :goto_0
    const-class v3, La/qiw;

    .line 42
    .line 43
    if-eqz v1, :cond_4

    .line 44
    .line 45
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1, v3}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, La/o5d0;

    .line 54
    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, La/ze3;

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    move-object v1, v2

    .line 65
    :goto_1
    instance-of v4, v1, La/qiw;

    .line 66
    .line 67
    if-nez v4, :cond_3

    .line 68
    .line 69
    move-object v1, v2

    .line 70
    :cond_3
    check-cast v1, La/qiw;

    .line 71
    .line 72
    if-eqz v1, :cond_4

    .line 73
    .line 74
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 75
    .line 76
    .line 77
    move-result-object v11

    .line 78
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    iget-object v5, v1, La/qiw;->a:La/cad;

    .line 82
    .line 83
    iget-object v6, v1, La/qiw;->b:La/iip;

    .line 84
    .line 85
    iget-object v7, v1, La/qiw;->c:La/lsn;

    .line 86
    .line 87
    iget-object v8, v1, La/qiw;->d:La/itr;

    .line 88
    .line 89
    iget-object v9, v1, La/qiw;->e:La/ugf0;

    .line 90
    .line 91
    iget-object v10, v1, La/qiw;->f:La/xri;

    .line 92
    .line 93
    iget-object v12, v1, La/qiw;->h:La/gii0;

    .line 94
    .line 95
    iget-object v0, v1, La/qiw;->g:La/oeg0;

    .line 96
    .line 97
    iget-object v13, v1, La/qiw;->i:La/g2v;

    .line 98
    .line 99
    iget-object v14, v1, La/qiw;->j:La/m1e;

    .line 100
    .line 101
    iget-object v15, v1, La/qiw;->k:La/ctf0;

    .line 102
    .line 103
    iget-object v2, v1, La/qiw;->l:La/pru;

    .line 104
    .line 105
    iget-object v3, v1, La/qiw;->m:La/b3c0;

    .line 106
    .line 107
    iget-object v4, v1, La/qiw;->n:La/knf0;

    .line 108
    .line 109
    move-object/from16 v16, v0

    .line 110
    .line 111
    iget-object v0, v1, La/qiw;->o:La/uzc;

    .line 112
    .line 113
    move-object/from16 v19, v0

    .line 114
    .line 115
    iget-object v0, v1, La/qiw;->p:La/gst0;

    .line 116
    .line 117
    move-object/from16 v20, v0

    .line 118
    .line 119
    iget-object v0, v1, La/qiw;->q:La/y78;

    .line 120
    .line 121
    move-object/from16 v21, v0

    .line 122
    .line 123
    iget-object v0, v1, La/qiw;->r:La/r9u;

    .line 124
    .line 125
    move-object/from16 v22, v0

    .line 126
    .line 127
    iget-object v0, v1, La/qiw;->s:La/lbu;

    .line 128
    .line 129
    move-object/from16 v23, v0

    .line 130
    .line 131
    iget-object v0, v1, La/qiw;->t:La/wiu;

    .line 132
    .line 133
    move-object/from16 v24, v0

    .line 134
    .line 135
    iget-object v0, v1, La/qiw;->u:La/uxs0;

    .line 136
    .line 137
    move-object/from16 v25, v0

    .line 138
    .line 139
    iget-object v0, v1, La/qiw;->v:La/kys0;

    .line 140
    .line 141
    move-object/from16 v26, v0

    .line 142
    .line 143
    iget-object v0, v1, La/qiw;->w:La/y9g;

    .line 144
    .line 145
    iget-object v1, v1, La/qiw;->x:La/gle0;

    .line 146
    .line 147
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    move-object/from16 v18, v4

    .line 187
    .line 188
    new-instance v4, La/xii;

    .line 189
    .line 190
    move-object/from16 v27, v0

    .line 191
    .line 192
    move-object/from16 v28, v1

    .line 193
    .line 194
    move-object/from16 v16, v2

    .line 195
    .line 196
    move-object/from16 v17, v3

    .line 197
    .line 198
    invoke-direct/range {v4 .. v28}, La/xii;-><init>(La/cad;La/iip;La/lsn;La/itr;La/ugf0;La/xri;La/i1w0;La/gii0;La/g2v;La/m1e;La/ctf0;La/pru;La/b3c0;La/knf0;La/uzc;La/gst0;La/y78;La/r9u;La/lbu;La/wiu;La/uxs0;La/kys0;La/y9g;La/gle0;)V

    .line 199
    .line 200
    .line 201
    move-object v2, v4

    .line 202
    goto :goto_2

    .line 203
    :cond_4
    const-string v0, "Cannot create dependency "

    .line 204
    .line 205
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    :goto_2
    return-object v2

    .line 213
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
