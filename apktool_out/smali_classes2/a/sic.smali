.class public final synthetic La/sic;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/w03;La/w03;La/w03;La/w03;La/w03;La/w03;ZLa/i9q;La/g9q0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/sic;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/sic;->c:Ljava/lang/Object;

    iput-object p2, p0, La/sic;->d:Ljava/lang/Object;

    iput-object p3, p0, La/sic;->e:Ljava/lang/Object;

    iput-object p4, p0, La/sic;->f:Ljava/lang/Object;

    iput-object p5, p0, La/sic;->g:Ljava/lang/Object;

    iput-object p6, p0, La/sic;->h:Ljava/lang/Object;

    iput-boolean p7, p0, La/sic;->b:Z

    iput-object p8, p0, La/sic;->i:Ljava/lang/Object;

    iput-object p9, p0, La/sic;->j:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZLa/de10;La/ce10;Lkotlin/jvm/functions/Function0;La/pz40;La/vby;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/sic;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/sic;->b:Z

    iput-object p2, p0, La/sic;->c:Ljava/lang/Object;

    iput-object p3, p0, La/sic;->d:Ljava/lang/Object;

    iput-object p4, p0, La/sic;->e:Ljava/lang/Object;

    iput-object p5, p0, La/sic;->f:Ljava/lang/Object;

    iput-object p6, p0, La/sic;->g:Ljava/lang/Object;

    iput-object p7, p0, La/sic;->h:Ljava/lang/Object;

    iput-object p8, p0, La/sic;->i:Ljava/lang/Object;

    iput-object p9, p0, La/sic;->j:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/sic;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/sic;->j:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, v0, La/sic;->i:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, La/sic;->h:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, La/sic;->g:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v6, v0, La/sic;->f:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v7, v0, La/sic;->e:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v8, v0, La/sic;->d:Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v9, v0, La/sic;->c:Ljava/lang/Object;

    .line 20
    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    iget-boolean v0, v0, La/sic;->b:Z

    .line 25
    .line 26
    check-cast v9, La/de10;

    .line 27
    .line 28
    check-cast v8, La/ce10;

    .line 29
    .line 30
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 31
    .line 32
    check-cast v6, La/pz40;

    .line 33
    .line 34
    check-cast v5, La/vby;

    .line 35
    .line 36
    check-cast v4, Ljava/lang/String;

    .line 37
    .line 38
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 39
    .line 40
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 41
    .line 42
    move-object/from16 v1, p1

    .line 43
    .line 44
    check-cast v1, Landroid/content/Context;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    :try_start_0
    new-instance v10, Landroid/webkit/WebView;

    .line 50
    .line 51
    invoke-direct {v10, v1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v10, v0}, La/hmw0;->c0(Landroid/webkit/WebView;Z)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v10, v9}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v10, v8}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catchall_0
    move-exception v0

    .line 65
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 66
    .line 67
    .line 68
    invoke-interface {v7}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    const/4 v10, 0x0

    .line 72
    :goto_0
    if-eqz v10, :cond_0

    .line 73
    .line 74
    invoke-interface {v6, v10}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    .line 78
    .line 79
    const/4 v1, -0x1

    .line 80
    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v10, v0}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 84
    .line 85
    .line 86
    new-instance v0, La/dd10;

    .line 87
    .line 88
    new-instance v1, La/r3w;

    .line 89
    .line 90
    const/4 v6, 0x3

    .line 91
    invoke-direct {v1, v3, v6}, La/r3w;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 92
    .line 93
    .line 94
    new-instance v3, La/a2z;

    .line 95
    .line 96
    const/4 v6, 0x4

    .line 97
    invoke-direct {v3, v2, v6}, La/a2z;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 98
    .line 99
    .line 100
    invoke-direct {v0, v1, v3, v5}, La/dd10;-><init>(La/r3w;La/a2z;La/vby;)V

    .line 101
    .line 102
    .line 103
    const-string v1, "MobileAppApi"

    .line 104
    .line 105
    invoke-virtual {v10, v0, v1}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v10, v4}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_0
    new-instance v10, Landroid/view/View;

    .line 113
    .line 114
    invoke-direct {v10, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 115
    .line 116
    .line 117
    :goto_1
    return-object v10

    .line 118
    :pswitch_0
    check-cast v9, La/w03;

    .line 119
    .line 120
    check-cast v8, La/w03;

    .line 121
    .line 122
    check-cast v7, La/w03;

    .line 123
    .line 124
    check-cast v6, La/w03;

    .line 125
    .line 126
    check-cast v5, La/w03;

    .line 127
    .line 128
    check-cast v4, La/w03;

    .line 129
    .line 130
    move-object v1, v3

    .line 131
    check-cast v1, La/i9q;

    .line 132
    .line 133
    check-cast v2, La/g9q0;

    .line 134
    .line 135
    move-object/from16 v3, p1

    .line 136
    .line 137
    check-cast v3, La/fhl;

    .line 138
    .line 139
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v9}, La/w03;->i()V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v8}, La/w03;->i()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v7}, La/w03;->i()V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v6}, La/w03;->i()V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v5}, La/w03;->i()V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v4}, La/w03;->i()V

    .line 158
    .line 159
    .line 160
    invoke-interface {v3}, La/fhl;->A0()La/nr;

    .line 161
    .line 162
    .line 163
    move-result-object v10

    .line 164
    invoke-virtual {v10}, La/nr;->p()J

    .line 165
    .line 166
    .line 167
    move-result-wide v11

    .line 168
    invoke-virtual {v10}, La/nr;->i()La/x5a;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    invoke-interface {v7}, La/x5a;->l()V

    .line 173
    .line 174
    .line 175
    :try_start_1
    iget-object v7, v10, La/nr;->b:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v7, La/fvt0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 178
    .line 179
    iget-boolean v0, v0, La/sic;->b:Z

    .line 180
    .line 181
    const/high16 v13, -0x40800000    # -1.0f

    .line 182
    .line 183
    if-eqz v0, :cond_1

    .line 184
    .line 185
    move v14, v13

    .line 186
    goto :goto_2

    .line 187
    :cond_1
    const/high16 v14, 0x3f800000    # 1.0f

    .line 188
    .line 189
    :goto_2
    :try_start_2
    iget-object v15, v7, La/fvt0;->a:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v15, La/nr;

    .line 192
    .line 193
    invoke-virtual {v15}, La/nr;->p()J

    .line 194
    .line 195
    .line 196
    move-result-wide v15

    .line 197
    move/from16 p0, v0

    .line 198
    .line 199
    move-object/from16 v17, v1

    .line 200
    .line 201
    invoke-static/range {v15 .. v16}, La/p7x;->u(J)J

    .line 202
    .line 203
    .line 204
    move-result-wide v0

    .line 205
    invoke-virtual {v7, v14, v13, v0, v1}, La/fvt0;->z(FFJ)V

    .line 206
    .line 207
    .line 208
    move-object v0, v6

    .line 209
    move-object v6, v4

    .line 210
    move-object v4, v0

    .line 211
    move-object v7, v2

    .line 212
    move-object v0, v3

    .line 213
    move-object v3, v8

    .line 214
    move-object v2, v9

    .line 215
    move-object/from16 v1, v17

    .line 216
    .line 217
    move/from16 v8, p0

    .line 218
    .line 219
    invoke-static/range {v0 .. v8}, La/j120;->N(La/fhl;La/i9q;La/w03;La/w03;La/w03;La/w03;La/w03;La/g9q0;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 220
    .line 221
    .line 222
    invoke-static {v10, v11, v12}, Lc;->g(La/nr;J)V

    .line 223
    .line 224
    .line 225
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 226
    .line 227
    return-object v0

    .line 228
    :catchall_1
    move-exception v0

    .line 229
    invoke-static {v10, v11, v12}, Lc;->g(La/nr;J)V

    .line 230
    .line 231
    .line 232
    throw v0

    .line 233
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
