.class public final synthetic La/wol0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/apl0;


# direct methods
.method public synthetic constructor <init>(La/apl0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wol0;->a:B

    iput-object p1, p0, La/wol0;->b:La/apl0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/wol0;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/wol0;->b:La/apl0;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v1, La/apl0;->P1:La/gle0;

    .line 11
    .line 12
    new-instance v1, La/q0h0;

    .line 13
    .line 14
    iget-object v0, v0, La/apl0;->K1:La/n0o0;

    .line 15
    .line 16
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, La/sui;

    .line 21
    .line 22
    iget-object v0, v0, La/sui;->p:La/n5d0;

    .line 23
    .line 24
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, La/rui;

    .line 29
    .line 30
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :pswitch_0
    sget-object v1, La/apl0;->P1:La/gle0;

    .line 35
    .line 36
    sget-object v1, La/m8v;->a:Ljava/util/LinkedHashMap;

    .line 37
    .line 38
    iget-object v1, v0, La/apl0;->N1:La/khf0;

    .line 39
    .line 40
    sget-object v2, La/apl0;->Q1:[La/iiy;

    .line 41
    .line 42
    const/4 v3, 0x1

    .line 43
    aget-object v4, v2, v3

    .line 44
    .line 45
    invoke-virtual {v1, v0, v4}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    check-cast v4, Lorg/xplatform/search/impl/presentation/sport/models/SportSearchFragmentSettings;

    .line 50
    .line 51
    iget-object v4, v4, Lorg/xplatform/search/impl/presentation/sport/models/SportSearchFragmentSettings;->a:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v4}, La/m8v;->a(Ljava/lang/String;)La/g2v;

    .line 54
    .line 55
    .line 56
    move-result-object v17

    .line 57
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-virtual {v4}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    instance-of v5, v4, La/af3;

    .line 69
    .line 70
    const/4 v6, 0x0

    .line 71
    if-eqz v5, :cond_0

    .line 72
    .line 73
    check-cast v4, La/af3;

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    move-object v4, v6

    .line 77
    :goto_0
    const-class v5, La/bpl0;

    .line 78
    .line 79
    if-eqz v4, :cond_3

    .line 80
    .line 81
    invoke-interface {v4}, La/af3;->d()La/wcf0;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-virtual {v4, v5}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    check-cast v4, La/o5d0;

    .line 90
    .line 91
    if-eqz v4, :cond_1

    .line 92
    .line 93
    invoke-interface {v4}, La/o5d0;->get()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    check-cast v4, La/ze3;

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    move-object v4, v6

    .line 101
    :goto_1
    instance-of v7, v4, La/bpl0;

    .line 102
    .line 103
    if-nez v7, :cond_2

    .line 104
    .line 105
    move-object v4, v6

    .line 106
    :cond_2
    check-cast v4, La/bpl0;

    .line 107
    .line 108
    if-eqz v4, :cond_3

    .line 109
    .line 110
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 111
    .line 112
    .line 113
    move-result-object v15

    .line 114
    aget-object v2, v2, v3

    .line 115
    .line 116
    invoke-virtual {v1, v0, v2}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    move-object/from16 v16, v0

    .line 121
    .line 122
    check-cast v16, Lorg/xplatform/search/impl/presentation/sport/models/SportSearchFragmentSettings;

    .line 123
    .line 124
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    iget-object v7, v4, La/bpl0;->a:La/ljf0;

    .line 128
    .line 129
    iget-object v8, v4, La/bpl0;->b:La/ugf0;

    .line 130
    .line 131
    iget-object v0, v4, La/bpl0;->c:La/cs00;

    .line 132
    .line 133
    iget-object v9, v4, La/bpl0;->d:La/itr;

    .line 134
    .line 135
    iget-object v10, v4, La/bpl0;->e:La/d1p;

    .line 136
    .line 137
    iget-object v11, v4, La/bpl0;->g:La/iip;

    .line 138
    .line 139
    iget-object v12, v4, La/bpl0;->f:La/iw20;

    .line 140
    .line 141
    iget-object v14, v4, La/bpl0;->h:La/nr00;

    .line 142
    .line 143
    iget-object v13, v4, La/bpl0;->i:La/xri;

    .line 144
    .line 145
    iget-object v6, v4, La/bpl0;->j:La/pzu;

    .line 146
    .line 147
    iget-object v1, v4, La/bpl0;->k:La/wdk0;

    .line 148
    .line 149
    iget-object v2, v4, La/bpl0;->l:La/pmi;

    .line 150
    .line 151
    iget-object v3, v4, La/bpl0;->m:La/gst0;

    .line 152
    .line 153
    iget-object v5, v4, La/bpl0;->n:La/bzt;

    .line 154
    .line 155
    iget-object v4, v4, La/bpl0;->o:La/r9u;

    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    move-object/from16 v19, v5

    .line 182
    .line 183
    new-instance v5, La/sui;

    .line 184
    .line 185
    move-object/from16 v18, v2

    .line 186
    .line 187
    move-object/from16 v20, v4

    .line 188
    .line 189
    invoke-direct/range {v5 .. v20}, La/sui;-><init>(La/pzu;La/ljf0;La/ugf0;La/itr;La/d1p;La/iip;La/iw20;La/xri;La/nr00;La/i1w0;Lorg/xplatform/search/impl/presentation/sport/models/SportSearchFragmentSettings;La/g2v;La/pmi;La/bzt;La/r9u;)V

    .line 190
    .line 191
    .line 192
    move-object v6, v5

    .line 193
    goto :goto_2

    .line 194
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 195
    .line 196
    invoke-static {v5, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    :goto_2
    return-object v6

    .line 204
    nop

    .line 205
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
