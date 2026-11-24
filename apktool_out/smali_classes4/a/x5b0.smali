.class public final synthetic La/x5b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/z5b0;


# direct methods
.method public synthetic constructor <init>(La/z5b0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/x5b0;->a:B

    iput-object p1, p0, La/x5b0;->b:La/z5b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/x5b0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v0, v0, La/x5b0;->b:La/z5b0;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v1, La/z5b0;->R1:La/mi70;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    instance-of v4, v1, La/af3;

    .line 26
    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    check-cast v1, La/af3;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move-object v1, v3

    .line 33
    :goto_0
    const-class v4, La/a6b0;

    .line 34
    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1, v4}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, La/o5d0;

    .line 46
    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, La/ze3;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    move-object v1, v3

    .line 57
    :goto_1
    instance-of v5, v1, La/a6b0;

    .line 58
    .line 59
    if-nez v5, :cond_2

    .line 60
    .line 61
    move-object v1, v3

    .line 62
    :cond_2
    check-cast v1, La/a6b0;

    .line 63
    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    iget-object v3, v0, La/z5b0;->P1:La/yzn0;

    .line 67
    .line 68
    sget-object v4, La/z5b0;->S1:[La/iiy;

    .line 69
    .line 70
    aget-object v2, v4, v2

    .line 71
    .line 72
    invoke-virtual {v3, v0, v2}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    move-object v12, v0

    .line 77
    check-cast v12, La/b7b0;

    .line 78
    .line 79
    iget-object v4, v1, La/a6b0;->a:La/epi0;

    .line 80
    .line 81
    iget-object v9, v1, La/a6b0;->b:La/xri;

    .line 82
    .line 83
    iget-object v6, v1, La/a6b0;->e:La/ugf0;

    .line 84
    .line 85
    iget-object v5, v1, La/a6b0;->f:La/jw20;

    .line 86
    .line 87
    iget-object v8, v1, La/a6b0;->d:La/mne;

    .line 88
    .line 89
    iget-object v3, v1, La/a6b0;->g:La/itr;

    .line 90
    .line 91
    iget-object v14, v1, La/a6b0;->h:La/ctf0;

    .line 92
    .line 93
    iget-object v11, v1, La/a6b0;->m:La/bzt;

    .line 94
    .line 95
    iget-object v15, v1, La/a6b0;->i:La/y78;

    .line 96
    .line 97
    iget-object v0, v1, La/a6b0;->k:La/lbu;

    .line 98
    .line 99
    iget-object v2, v1, La/a6b0;->l:La/pru;

    .line 100
    .line 101
    iget-object v7, v1, La/a6b0;->n:La/iip;

    .line 102
    .line 103
    iget-object v13, v1, La/a6b0;->j:La/m1e;

    .line 104
    .line 105
    iget-object v10, v1, La/a6b0;->c:La/nr00;

    .line 106
    .line 107
    iget-object v1, v1, La/a6b0;->o:La/viu;

    .line 108
    .line 109
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-object/from16 v17, v2

    .line 125
    .line 126
    new-instance v2, La/xoi;

    .line 127
    .line 128
    move-object/from16 v16, v0

    .line 129
    .line 130
    move-object/from16 v18, v1

    .line 131
    .line 132
    invoke-direct/range {v2 .. v18}, La/xoi;-><init>(La/itr;La/epi0;La/jw20;La/ugf0;La/iip;La/mne;La/xri;La/nr00;La/bzt;La/b7b0;La/m1e;La/ctf0;La/y78;La/lbu;La/pru;La/viu;)V

    .line 133
    .line 134
    .line 135
    move-object v3, v2

    .line 136
    goto :goto_2

    .line 137
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 138
    .line 139
    invoke-static {v4, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    :goto_2
    return-object v3

    .line 147
    :pswitch_0
    new-instance v1, La/q0h0;

    .line 148
    .line 149
    iget-object v0, v0, La/z5b0;->K1:La/woi;

    .line 150
    .line 151
    if-eqz v0, :cond_4

    .line 152
    .line 153
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 154
    .line 155
    .line 156
    return-object v1

    .line 157
    :cond_4
    const-string v0, "viewModelFactory"

    .line 158
    .line 159
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    throw v3

    .line 163
    :pswitch_1
    sget-object v1, La/z5b0;->R1:La/mi70;

    .line 164
    .line 165
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    iget-object v0, v0, Landroidx/fragment/app/e;->c:La/pmi;

    .line 170
    .line 171
    invoke-virtual {v0}, La/pmi;->p()Ljava/util/List;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-static {v0}, La/twn;->u(Ljava/util/List;)Ljava/util/ArrayList;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    :cond_5
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    if-eqz v3, :cond_6

    .line 188
    .line 189
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    instance-of v4, v3, La/yx5;

    .line 194
    .line 195
    if-eqz v4, :cond_5

    .line 196
    .line 197
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    goto :goto_3

    .line 201
    :cond_6
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    check-cast v0, La/yx5;

    .line 206
    .line 207
    if-eqz v0, :cond_7

    .line 208
    .line 209
    invoke-virtual {v0}, La/yx5;->x0()Z

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    :cond_7
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    return-object v0

    .line 218
    nop

    .line 219
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
