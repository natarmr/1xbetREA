.class public final synthetic La/y1t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/y1t;->a:B

    iput-object p1, p0, La/y1t;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;

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
    iget-byte v1, v0, La/y1t;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/y1t;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget v1, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->g:I

    .line 12
    .line 13
    new-instance v2, Landroid/view/WindowManager$LayoutParams;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const v3, 0x7f07016c

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimension(I)F

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    float-to-int v3, v1

    .line 27
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const v1, 0x7f07016b

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    float-to-int v4, v0

    .line 39
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 40
    .line 41
    const/16 v1, 0x1a

    .line 42
    .line 43
    if-lt v0, v1, :cond_0

    .line 44
    .line 45
    const/16 v0, 0x7f6

    .line 46
    .line 47
    :goto_0
    move v5, v0

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    const/16 v0, 0x7d3

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :goto_1
    const v6, 0x40008

    .line 53
    .line 54
    .line 55
    const/4 v7, -0x3

    .line 56
    invoke-direct/range {v2 .. v7}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    .line 57
    .line 58
    .line 59
    return-object v2

    .line 60
    :pswitch_0
    sget v1, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->g:I

    .line 61
    .line 62
    const-string v1, "window"

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    check-cast v0, Landroid/view/WindowManager;

    .line 72
    .line 73
    return-object v0

    .line 74
    :pswitch_1
    sget v1, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->g:I

    .line 75
    .line 76
    new-instance v1, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 77
    .line 78
    invoke-direct {v1, v0, v2}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 79
    .line 80
    .line 81
    invoke-static {}, La/cy7;->c()Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutDirection(I)V

    .line 86
    .line 87
    .line 88
    return-object v1

    .line 89
    :pswitch_2
    sget v1, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->g:I

    .line 90
    .line 91
    invoke-virtual {v0}, Landroid/app/Service;->getApplication()Landroid/app/Application;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    instance-of v1, v0, La/af3;

    .line 99
    .line 100
    if-eqz v1, :cond_1

    .line 101
    .line 102
    check-cast v0, La/af3;

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_1
    move-object v0, v2

    .line 106
    :goto_2
    const-class v1, La/q89;

    .line 107
    .line 108
    if-eqz v0, :cond_4

    .line 109
    .line 110
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    check-cast v0, La/o5d0;

    .line 119
    .line 120
    if-eqz v0, :cond_2

    .line 121
    .line 122
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    check-cast v0, La/ze3;

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_2
    move-object v0, v2

    .line 130
    :goto_3
    instance-of v3, v0, La/q89;

    .line 131
    .line 132
    if-nez v3, :cond_3

    .line 133
    .line 134
    move-object v0, v2

    .line 135
    :cond_3
    check-cast v0, La/q89;

    .line 136
    .line 137
    if-eqz v0, :cond_4

    .line 138
    .line 139
    iget-object v4, v0, La/q89;->a:La/us00;

    .line 140
    .line 141
    iget-object v5, v0, La/q89;->b:La/oeg0;

    .line 142
    .line 143
    iget-object v6, v0, La/q89;->c:La/nhv0;

    .line 144
    .line 145
    iget-object v7, v0, La/q89;->d:La/ysr;

    .line 146
    .line 147
    iget-object v10, v0, La/q89;->g:La/m49;

    .line 148
    .line 149
    iget-object v11, v0, La/q89;->h:La/n49;

    .line 150
    .line 151
    iget-object v12, v0, La/q89;->j:La/m1e;

    .line 152
    .line 153
    iget-object v13, v0, La/q89;->k:La/mne;

    .line 154
    .line 155
    iget-object v1, v0, La/q89;->l:La/gst0;

    .line 156
    .line 157
    iget-object v2, v0, La/q89;->m:La/btt0;

    .line 158
    .line 159
    iget-object v14, v0, La/q89;->n:La/yox;

    .line 160
    .line 161
    iget-object v8, v0, La/q89;->e:La/atr;

    .line 162
    .line 163
    iget-object v9, v0, La/q89;->f:La/rsr;

    .line 164
    .line 165
    iget-object v3, v0, La/q89;->i:La/meu0;

    .line 166
    .line 167
    iget-object v15, v0, La/q89;->o:La/mi70;

    .line 168
    .line 169
    move-object/from16 v16, v1

    .line 170
    .line 171
    iget-object v1, v0, La/q89;->p:La/r9u;

    .line 172
    .line 173
    move-object/from16 v17, v1

    .line 174
    .line 175
    iget-object v1, v0, La/q89;->q:La/c49;

    .line 176
    .line 177
    move-object/from16 v18, v1

    .line 178
    .line 179
    iget-object v1, v0, La/q89;->r:La/vd1;

    .line 180
    .line 181
    move-object/from16 v19, v1

    .line 182
    .line 183
    iget-object v1, v0, La/q89;->s:La/ik4;

    .line 184
    .line 185
    iget-object v0, v0, La/q89;->t:La/viu;

    .line 186
    .line 187
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    new-instance v3, La/vai;

    .line 227
    .line 228
    move-object/from16 v20, v0

    .line 229
    .line 230
    move-object/from16 v16, v17

    .line 231
    .line 232
    move-object/from16 v17, v18

    .line 233
    .line 234
    move-object/from16 v18, v19

    .line 235
    .line 236
    move-object/from16 v19, v1

    .line 237
    .line 238
    invoke-direct/range {v3 .. v20}, La/vai;-><init>(La/us00;La/oeg0;La/nhv0;La/ysr;La/atr;La/rsr;La/m49;La/n49;La/m1e;La/mne;La/yox;La/mi70;La/r9u;La/c49;La/vd1;La/ik4;La/viu;)V

    .line 239
    .line 240
    .line 241
    move-object v2, v3

    .line 242
    goto :goto_4

    .line 243
    :cond_4
    const-string v0, "Cannot create dependency "

    .line 244
    .line 245
    invoke-static {v1, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    :goto_4
    return-object v2

    .line 253
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
