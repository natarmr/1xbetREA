.class public final La/qwc0;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/cg60;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/qwc0;",
        "La/yx5;",
        "La/cg60;",
        "<init>",
        "()V",
        "a/rl70",
        "promotions"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Z1:La/rl70;

.field public static final synthetic a2:[La/iiy;


# instance fields
.field public final K1:La/s0r;

.field public L1:La/fiu0;

.field public M1:La/wdk0;

.field public N1:La/vby;

.field public O1:La/grj;

.field public final P1:La/phf0;

.field public Q1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

.field public R1:La/bc0;

.field public S1:Ljava/lang/Integer;

.field public U1:Z

.field public V1:Z

.field public W1:Z

.field public X1:Z

.field public final Y1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/qwc0;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "linkUrl"

    .line 16
    .line 17
    const-string v5, "getLinkUrl()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    new-array v1, v1, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v1, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v1, v0

    .line 29
    .line 30
    sput-object v1, La/qwc0;->a2:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/rl70;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/qwc0;->Z1:La/rl70;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/pwc0;->a:La/pwc0;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/qwc0;->K1:La/s0r;

    .line 14
    .line 15
    new-instance v0, La/phf0;

    .line 16
    .line 17
    const-string v1, "URL"

    .line 18
    .line 19
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, La/qwc0;->P1:La/phf0;

    .line 23
    .line 24
    const-class v0, La/gxc0;

    .line 25
    .line 26
    sget-object v1, La/sre0;->a:La/tre0;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, La/nwc0;

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-direct {v1, p0, v2}, La/nwc0;-><init>(La/qwc0;B)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, La/qwc0;->Y1:La/a8z;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    const/16 v1, 0x9

    .line 15
    .line 16
    const v2, 0x7f040ae1

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v0, v2, v2, v1}, La/ofm0;->z(Landroid/view/Window;Landroid/content/Context;III)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object p1, p0, La/qwc0;->Q1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 23
    .line 24
    if-nez p1, :cond_2

    .line 25
    .line 26
    new-instance p1, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-direct {p1, v1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;-><init>(Landroid/content/Context;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0, v1}, La/qwc0;->H0(La/siq;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    iput-object p1, p0, La/qwc0;->Q1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 45
    .line 46
    :cond_2
    new-instance v1, La/nwc0;

    .line 47
    .line 48
    const/4 v2, 0x3

    .line 49
    invoke-direct {v1, p0, v2}, La/nwc0;-><init>(La/qwc0;B)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->setDetaching(Lkotlin/jvm/functions/Function0;)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, La/qwc0;->Q1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 56
    .line 57
    if-nez p1, :cond_3

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    iget-object v1, p0, La/qwc0;->R1:La/bc0;

    .line 61
    .line 62
    if-eqz v1, :cond_4

    .line 63
    .line 64
    invoke-virtual {p1, v1}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 65
    .line 66
    .line 67
    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_5

    .line 72
    .line 73
    invoke-virtual {p0}, La/qwc0;->K0()V

    .line 74
    .line 75
    .line 76
    :cond_5
    new-instance v1, La/bc0;

    .line 77
    .line 78
    const/16 v2, 0xb

    .line 79
    .line 80
    invoke-direct {v1, p0, v2}, La/bc0;-><init>(Ljava/lang/Object;B)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 84
    .line 85
    .line 86
    iput-object v1, p0, La/qwc0;->R1:La/bc0;

    .line 87
    .line 88
    :goto_0
    invoke-virtual {p0}, La/qwc0;->I0()La/aid;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iget-object p1, p1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 93
    .line 94
    sget-object v1, La/qek0;->h:La/qek0;

    .line 95
    .line 96
    new-instance v2, La/nrc0;

    .line 97
    .line 98
    const/4 v3, 0x1

    .line 99
    invoke-direct {v2, p0, v3}, La/nrc0;-><init>(Ljava/lang/Object;B)V

    .line 100
    .line 101
    .line 102
    new-instance p0, La/ugd;

    .line 103
    .line 104
    const v4, 0x1c5053cf

    .line 105
    .line 106
    .line 107
    invoke-direct {p0, v4, v3, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-static {p1, v1, v0, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 111
    .line 112
    .line 113
    return-void
.end method

.method public final C0()V
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    instance-of v2, v1, La/af3;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    check-cast v1, La/af3;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v1, v3

    .line 23
    :goto_0
    const-class v2, La/m3v0;

    .line 24
    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, La/o5d0;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, La/ze3;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move-object v1, v3

    .line 47
    :goto_1
    instance-of v4, v1, La/m3v0;

    .line 48
    .line 49
    if-nez v4, :cond_2

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    move-object v3, v1

    .line 53
    :goto_2
    check-cast v3, La/m3v0;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    sget-object v1, La/qwc0;->a2:[La/iiy;

    .line 58
    .line 59
    const/4 v2, 0x1

    .line 60
    aget-object v1, v1, v2

    .line 61
    .line 62
    iget-object v2, v0, La/qwc0;->P1:La/phf0;

    .line 63
    .line 64
    invoke-virtual {v2, v0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    iget-object v6, v3, La/m3v0;->a:La/vby;

    .line 79
    .line 80
    iget-object v7, v3, La/m3v0;->c:La/b8u;

    .line 81
    .line 82
    iget-object v9, v3, La/m3v0;->b:La/m1e;

    .line 83
    .line 84
    iget-object v10, v3, La/m3v0;->d:La/mne;

    .line 85
    .line 86
    iget-object v11, v3, La/m3v0;->e:La/j1q0;

    .line 87
    .line 88
    iget-object v12, v3, La/m3v0;->f:La/duj;

    .line 89
    .line 90
    iget-object v13, v3, La/m3v0;->g:La/ntu;

    .line 91
    .line 92
    iget-object v14, v3, La/m3v0;->h:La/wgu;

    .line 93
    .line 94
    iget-object v15, v3, La/m3v0;->i:La/n4u;

    .line 95
    .line 96
    iget-object v1, v3, La/m3v0;->j:La/ctf0;

    .line 97
    .line 98
    iget-object v2, v3, La/m3v0;->k:La/grj;

    .line 99
    .line 100
    iget-object v4, v3, La/m3v0;->l:La/hse0;

    .line 101
    .line 102
    move-object/from16 v16, v1

    .line 103
    .line 104
    iget-object v1, v3, La/m3v0;->m:La/vwb0;

    .line 105
    .line 106
    move-object/from16 v17, v1

    .line 107
    .line 108
    iget-object v1, v3, La/m3v0;->n:La/xwb0;

    .line 109
    .line 110
    move-object/from16 v18, v1

    .line 111
    .line 112
    iget-object v1, v3, La/m3v0;->o:La/wdk0;

    .line 113
    .line 114
    move-object/from16 v19, v1

    .line 115
    .line 116
    iget-object v1, v3, La/m3v0;->p:La/iqt;

    .line 117
    .line 118
    move-object/from16 v20, v1

    .line 119
    .line 120
    iget-object v1, v3, La/m3v0;->q:La/uzc0;

    .line 121
    .line 122
    move-object/from16 v21, v1

    .line 123
    .line 124
    iget-object v1, v3, La/m3v0;->r:La/wsf0;

    .line 125
    .line 126
    move-object/from16 v22, v1

    .line 127
    .line 128
    iget-object v1, v3, La/m3v0;->t:La/x0u;

    .line 129
    .line 130
    move-object/from16 v23, v1

    .line 131
    .line 132
    iget-object v1, v3, La/m3v0;->w:La/hru;

    .line 133
    .line 134
    move-object/from16 v26, v1

    .line 135
    .line 136
    iget-object v1, v3, La/m3v0;->v:La/ocl;

    .line 137
    .line 138
    move-object/from16 v27, v1

    .line 139
    .line 140
    iget-object v1, v3, La/m3v0;->u:La/yfu;

    .line 141
    .line 142
    move-object/from16 v24, v1

    .line 143
    .line 144
    iget-object v1, v3, La/m3v0;->s:La/g2v;

    .line 145
    .line 146
    move-object/from16 v25, v1

    .line 147
    .line 148
    iget-object v1, v3, La/m3v0;->y:La/yfu;

    .line 149
    .line 150
    move-object/from16 v28, v1

    .line 151
    .line 152
    iget-object v1, v3, La/m3v0;->x:La/jqt;

    .line 153
    .line 154
    iget-object v3, v3, La/m3v0;->z:La/ytt;

    .line 155
    .line 156
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    move-object/from16 v18, v4

    .line 184
    .line 185
    new-instance v4, La/v9i;

    .line 186
    .line 187
    move-object/from16 v29, v1

    .line 188
    .line 189
    move-object/from16 v17, v2

    .line 190
    .line 191
    move-object/from16 v30, v3

    .line 192
    .line 193
    invoke-direct/range {v4 .. v30}, La/v9i;-><init>(Ljava/lang/String;La/vby;La/b8u;La/i1w0;La/m1e;La/mne;La/j1q0;La/duj;La/ntu;La/wgu;La/n4u;La/ctf0;La/grj;La/hse0;La/wdk0;La/iqt;La/uzc0;La/wsf0;La/x0u;La/yfu;La/g2v;La/hru;La/ocl;La/yfu;La/jqt;La/ytt;)V

    .line 194
    .line 195
    .line 196
    move-object/from16 v1, v17

    .line 197
    .line 198
    move-object/from16 v2, v19

    .line 199
    .line 200
    new-instance v3, La/fiu0;

    .line 201
    .line 202
    iget-object v4, v4, La/v9i;->y:La/n5d0;

    .line 203
    .line 204
    check-cast v4, La/kzi;

    .line 205
    .line 206
    const-class v5, La/gxc0;

    .line 207
    .line 208
    invoke-static {v5, v4}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    invoke-direct {v3, v4}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 213
    .line 214
    .line 215
    iput-object v3, v0, La/qwc0;->L1:La/fiu0;

    .line 216
    .line 217
    iput-object v2, v0, La/qwc0;->M1:La/wdk0;

    .line 218
    .line 219
    iput-object v6, v0, La/qwc0;->N1:La/vby;

    .line 220
    .line 221
    iput-object v1, v0, La/qwc0;->O1:La/grj;

    .line 222
    .line 223
    return-void

    .line 224
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 225
    .line 226
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    return-void
.end method

.method public final G0(Lkotlin/jvm/functions/Function1;La/fet;I)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v5, p2

    .line 6
    .line 7
    move/from16 v8, p3

    .line 8
    .line 9
    const v2, 0x4e436b82    # 8.196507E8f

    .line 10
    .line 11
    .line 12
    invoke-virtual {v5, v2}, La/fet;->g0(I)La/fet;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v5, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v9, 0x4

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    move v2, v9

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v2, 0x2

    .line 25
    :goto_0
    or-int/2addr v2, v8

    .line 26
    invoke-virtual {v5, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    const/16 v3, 0x20

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const/16 v3, 0x10

    .line 36
    .line 37
    :goto_1
    or-int v10, v2, v3

    .line 38
    .line 39
    and-int/lit8 v2, v10, 0x13

    .line 40
    .line 41
    const/16 v3, 0x12

    .line 42
    .line 43
    const/4 v11, 0x1

    .line 44
    const/4 v12, 0x0

    .line 45
    if-eq v2, v3, :cond_2

    .line 46
    .line 47
    move v2, v11

    .line 48
    goto :goto_2

    .line 49
    :cond_2
    move v2, v12

    .line 50
    :goto_2
    and-int/lit8 v3, v10, 0x1

    .line 51
    .line 52
    invoke-virtual {v5, v3, v2}, La/fet;->U(IZ)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_a

    .line 57
    .line 58
    invoke-virtual {v5, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    sget-object v13, La/ukd;->a:La/cl5;

    .line 67
    .line 68
    if-nez v2, :cond_3

    .line 69
    .line 70
    if-ne v3, v13, :cond_4

    .line 71
    .line 72
    :cond_3
    new-instance v3, La/nwc0;

    .line 73
    .line 74
    invoke-direct {v3, v0, v9}, La/nwc0;-><init>(La/qwc0;B)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v5, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    :cond_4
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 81
    .line 82
    const/4 v6, 0x0

    .line 83
    const/4 v7, 0x5

    .line 84
    const/4 v2, 0x0

    .line 85
    const/4 v4, 0x0

    .line 86
    invoke-static/range {v2 .. v7}, La/v3c;->A(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, La/qwc0;->J0()La/k3t0;

    .line 90
    .line 91
    .line 92
    move-result-object v15

    .line 93
    and-int/lit8 v2, v10, 0xe

    .line 94
    .line 95
    if-ne v2, v9, :cond_5

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_5
    move v11, v12

    .line 99
    :goto_3
    invoke-virtual {v5, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    or-int/2addr v2, v11

    .line 104
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    if-nez v2, :cond_6

    .line 109
    .line 110
    if-ne v3, v13, :cond_7

    .line 111
    .line 112
    :cond_6
    new-instance v3, La/oac0;

    .line 113
    .line 114
    const/16 v2, 0xc

    .line 115
    .line 116
    invoke-direct {v3, v1, v0, v2}, La/oac0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v5, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    :cond_7
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 123
    .line 124
    sget-object v2, La/or00;->a:La/zfn;

    .line 125
    .line 126
    invoke-virtual {v5, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    check-cast v2, La/clz;

    .line 131
    .line 132
    sget-object v4, La/lkz;->a:La/lkz;

    .line 133
    .line 134
    invoke-static {v3, v5}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    invoke-virtual {v5, v15}, La/fet;->i(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    invoke-virtual {v5, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    or-int/2addr v4, v6

    .line 147
    const/4 v6, 0x3

    .line 148
    invoke-virtual {v5, v6}, La/fet;->e(I)Z

    .line 149
    .line 150
    .line 151
    move-result v6

    .line 152
    or-int/2addr v4, v6

    .line 153
    invoke-virtual {v5, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v6

    .line 157
    or-int/2addr v4, v6

    .line 158
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    if-nez v4, :cond_8

    .line 163
    .line 164
    if-ne v6, v13, :cond_9

    .line 165
    .line 166
    :cond_8
    new-instance v14, La/kc70;

    .line 167
    .line 168
    const/16 v18, 0x0

    .line 169
    .line 170
    const/16 v19, 0x7

    .line 171
    .line 172
    move-object/from16 v16, v2

    .line 173
    .line 174
    move-object/from16 v17, v3

    .line 175
    .line 176
    invoke-direct/range {v14 .. v19}, La/kc70;-><init>(La/k3t0;La/clz;La/pz40;La/yje;B)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v5, v14}, La/fet;->o0(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    move-object v6, v14

    .line 183
    :cond_9
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 184
    .line 185
    invoke-static {v5, v2, v6}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 186
    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_a
    invoke-virtual {v5}, La/fet;->X()V

    .line 190
    .line 191
    .line 192
    :goto_4
    invoke-virtual {v5}, La/fet;->u()La/yfe0;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    if-eqz v2, :cond_b

    .line 197
    .line 198
    new-instance v3, La/r7a0;

    .line 199
    .line 200
    const/16 v4, 0x1b

    .line 201
    .line 202
    invoke-direct {v3, v0, v1, v8, v4}, La/r7a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 203
    .line 204
    .line 205
    iput-object v3, v2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 206
    .line 207
    :cond_b
    return-void
.end method

.method public final H0(La/siq;)V
    .locals 7

    .line 1
    iget-boolean v0, p0, La/qwc0;->V1:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 24
    .line 25
    .line 26
    new-instance v0, La/owc0;

    .line 27
    .line 28
    invoke-direct {v0, p0}, La/owc0;-><init>(La/qwc0;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0}, La/siq;->setFixedWebViewClient(La/tiq;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, La/qwc0;->N1:La/vby;

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    new-instance v2, La/o3v0;

    .line 39
    .line 40
    new-instance v3, La/nwc0;

    .line 41
    .line 42
    invoke-direct {v3, p0, v1}, La/nwc0;-><init>(La/qwc0;B)V

    .line 43
    .line 44
    .line 45
    new-instance v4, La/nwc0;

    .line 46
    .line 47
    const/4 v5, 0x2

    .line 48
    invoke-direct {v4, p0, v5}, La/nwc0;-><init>(La/qwc0;B)V

    .line 49
    .line 50
    .line 51
    new-instance v5, La/ppb0;

    .line 52
    .line 53
    const/16 v6, 0x1a

    .line 54
    .line 55
    invoke-direct {v5, p0, v6}, La/ppb0;-><init>(Ljava/lang/Object;B)V

    .line 56
    .line 57
    .line 58
    invoke-direct {v2, v0, v3, v4, v5}, La/o3v0;-><init>(La/vby;La/nwc0;La/nwc0;La/ppb0;)V

    .line 59
    .line 60
    .line 61
    const-string v0, "MobileAppApiV2"

    .line 62
    .line 63
    invoke-virtual {p1, v2, v0}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iput-boolean v1, p0, La/qwc0;->V1:Z

    .line 67
    .line 68
    const-string p0, "innerWebView"

    .line 69
    .line 70
    invoke-virtual {p1, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_1
    const-string p0, "json"

    .line 75
    .line 76
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const/4 p0, 0x0

    .line 80
    throw p0
.end method

.method public final I0()La/aid;
    .locals 2

    .line 1
    sget-object v0, La/qwc0;->a2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/qwc0;->K1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v1, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/aid;

    .line 16
    .line 17
    return-object p0
.end method

.method public final J0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/qwc0;->Y1:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/k3t0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final K0()V
    .locals 3

    .line 1
    iget-object v0, p0, La/qwc0;->Q1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    iget-object v1, p0, La/qwc0;->S1:Ljava/lang/Integer;

    .line 20
    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_2
    const/4 v1, 0x0

    .line 26
    :goto_0
    iput-boolean v1, p0, La/qwc0;->U1:Z

    .line 27
    .line 28
    invoke-virtual {p0}, La/qwc0;->J0()La/k3t0;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    sget-object v2, La/fwc0;->a:La/fwc0;

    .line 33
    .line 34
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v0}, La/qwc0;->H0(La/siq;)V

    .line 38
    .line 39
    .line 40
    :cond_3
    :goto_1
    return-void
.end method

.method public final L0()V
    .locals 1

    .line 1
    iget-boolean v0, p0, La/qwc0;->W1:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, La/qwc0;->W1:Z

    .line 8
    .line 9
    invoke-virtual {p0}, La/qwc0;->J0()La/k3t0;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget-object v0, La/cwc0;->a:La/cwc0;

    .line 14
    .line 15
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final M0(La/sek0;Ljava/lang/String;)V
    .locals 9

    .line 1
    iget-object v0, p0, La/qwc0;->M1:La/wdk0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, La/xdk0;

    .line 6
    .line 7
    const/4 v7, 0x0

    .line 8
    const/16 v8, 0x7c

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    move-object v2, p1

    .line 14
    move-object v3, p2

    .line 15
    invoke-direct/range {v1 .. v8}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 16
    .line 17
    .line 18
    const/16 v7, 0x3fc

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v5, 0x0

    .line 22
    move-object v2, p0

    .line 23
    invoke-static/range {v0 .. v7}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    const-string p0, "snackbarManager"

    .line 28
    .line 29
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    throw p0
.end method

.method public final Y()V
    .locals 2

    .line 1
    iget-object v0, p0, La/qwc0;->Q1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v1, p0, La/qwc0;->R1:La/bc0;

    .line 7
    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 11
    .line 12
    .line 13
    :cond_1
    const/4 v1, 0x0

    .line 14
    iput-object v1, p0, La/qwc0;->R1:La/bc0;

    .line 15
    .line 16
    iput-object v1, p0, La/qwc0;->Q1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    iput-boolean v1, p0, La/qwc0;->V1:Z

    .line 20
    .line 21
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->a()V

    .line 22
    .line 23
    .line 24
    :goto_0
    const/4 v0, 0x1

    .line 25
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 26
    .line 27
    return-void
.end method

.method public final Z()V
    .locals 3

    .line 1
    iget-object v0, p0, La/qwc0;->Q1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    instance-of v2, v1, Landroid/view/ViewGroup;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    check-cast v1, Landroid/view/ViewGroup;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    :goto_0
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    const/4 v0, 0x0

    .line 23
    iput-boolean v0, p0, La/qwc0;->V1:Z

    .line 24
    .line 25
    invoke-super {p0}, La/yx5;->Z()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final d0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    iget-object p0, p0, La/qwc0;->Q1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->e()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final e0()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/qwc0;->I0()La/aid;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 9
    .line 10
    invoke-static {v0}, La/hxm0;->n(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, La/qwc0;->Q1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->f()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final h0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, La/qwc0;->I0()La/aid;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 9
    .line 10
    invoke-static {p0}, La/hxm0;->m(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final j()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, La/qwc0;->J0()La/k3t0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, La/hwc0;->a:La/hwc0;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return p0
.end method
