.class public final La/g8v;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/g8v;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/rqt",
        "impl"
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
.field public static final P1:La/rqt;

.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public final K1:La/s0r;

.field public final L1:La/a8z;

.field public final M1:La/khf0;

.field public final N1:La/phf0;

.field public O1:La/daf;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/g8v;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/search/impl/databinding/FragmentGlobalSearchContainerBinding;"

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
    const-string v3, "settings"

    .line 16
    .line 17
    const-string v5, "getSettings()Lorg/xplatform/search/api/models/GlobalSearchContainerSettings;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "componentKey"

    .line 25
    .line 26
    const-string v6, "getComponentKey()Ljava/lang/String;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    new-array v1, v1, [La/iiy;

    .line 33
    .line 34
    aput-object v0, v1, v4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    aput-object v2, v1, v0

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    aput-object v3, v1, v0

    .line 41
    .line 42
    sput-object v1, La/g8v;->Q1:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/rqt;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/g8v;->P1:La/rqt;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const v0, 0x7f0d0249

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/f8v;->a:La/f8v;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/g8v;->K1:La/s0r;

    .line 14
    .line 15
    const-class v0, La/u8v;

    .line 16
    .line 17
    sget-object v1, La/sre0;->a:La/tre0;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v1, La/jcs;

    .line 24
    .line 25
    const/16 v2, 0x1b

    .line 26
    .line 27
    invoke-direct {v1, p0, v2}, La/jcs;-><init>(Ljava/lang/Object;B)V

    .line 28
    .line 29
    .line 30
    const/16 v2, 0xe

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, p0, La/g8v;->L1:La/a8z;

    .line 38
    .line 39
    new-instance v0, La/khf0;

    .line 40
    .line 41
    const-string v1, "SETTINGS_BUNDLE_KEY"

    .line 42
    .line 43
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, La/g8v;->M1:La/khf0;

    .line 47
    .line 48
    new-instance v0, La/phf0;

    .line 49
    .line 50
    const-string v1, "SETTINGS_BUNDLE_COMPONENT_KEY"

    .line 51
    .line 52
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, La/g8v;->N1:La/phf0;

    .line 56
    .line 57
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, La/viq;

    .line 10
    .line 11
    const/4 v2, 0x4

    .line 12
    invoke-direct {v1, p0, v2}, La/viq;-><init>(Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    const-string v2, "X_GAMES_UM_BUTTON_CLICK_RESULT_KEY"

    .line 16
    .line 17
    invoke-virtual {p1, v2, v0, v1}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, La/g8v;->G0()La/n0r;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object p1, p1, La/n0r;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 25
    .line 26
    new-instance v0, La/jar;

    .line 27
    .line 28
    const/16 v1, 0x16

    .line 29
    .line 30
    invoke-direct {v0, p0, v1}, La/jar;-><init>(Ljava/lang/Object;B)V

    .line 31
    .line 32
    .line 33
    new-instance p0, La/ugd;

    .line 34
    .line 35
    const v1, -0x124ffb60

    .line 36
    .line 37
    .line 38
    const/4 v2, 0x1

    .line 39
    invoke-direct {p0, v1, v2, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    invoke-static {p1, v0, p0}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final C0()V
    .locals 17

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
    const-string v2, "Cannot create dependency "

    .line 24
    .line 25
    const-class v4, La/h8v;

    .line 26
    .line 27
    if-eqz v1, :cond_8

    .line 28
    .line 29
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1, v4}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, La/o5d0;

    .line 38
    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, La/ze3;

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    move-object v1, v3

    .line 49
    :goto_1
    instance-of v5, v1, La/h8v;

    .line 50
    .line 51
    if-nez v5, :cond_2

    .line 52
    .line 53
    move-object v1, v3

    .line 54
    :cond_2
    check-cast v1, La/h8v;

    .line 55
    .line 56
    if-eqz v1, :cond_8

    .line 57
    .line 58
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {v4}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    sget-object v5, La/g8v;->Q1:[La/iiy;

    .line 74
    .line 75
    const/4 v6, 0x1

    .line 76
    aget-object v5, v5, v6

    .line 77
    .line 78
    iget-object v6, v0, La/g8v;->M1:La/khf0;

    .line 79
    .line 80
    invoke-virtual {v6, v0, v5}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    move-object v8, v5

    .line 85
    check-cast v8, Lorg/xplatform/search/api/models/GlobalSearchContainerSettings;

    .line 86
    .line 87
    invoke-virtual {v0}, La/g8v;->H0()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    sget-object v5, La/m8v;->a:Ljava/util/LinkedHashMap;

    .line 98
    .line 99
    invoke-virtual {v5, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    if-nez v6, :cond_7

    .line 104
    .line 105
    instance-of v6, v4, La/af3;

    .line 106
    .line 107
    if-eqz v6, :cond_3

    .line 108
    .line 109
    check-cast v4, La/af3;

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_3
    move-object v4, v3

    .line 113
    :goto_2
    const-class v6, La/l8v;

    .line 114
    .line 115
    if-eqz v4, :cond_6

    .line 116
    .line 117
    invoke-interface {v4}, La/af3;->d()La/wcf0;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    invoke-virtual {v4, v6}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    check-cast v4, La/o5d0;

    .line 126
    .line 127
    if-eqz v4, :cond_4

    .line 128
    .line 129
    invoke-interface {v4}, La/o5d0;->get()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    check-cast v4, La/ze3;

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_4
    move-object v4, v3

    .line 137
    :goto_3
    instance-of v10, v4, La/l8v;

    .line 138
    .line 139
    if-nez v10, :cond_5

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_5
    move-object v3, v4

    .line 143
    :goto_4
    check-cast v3, La/l8v;

    .line 144
    .line 145
    if-eqz v3, :cond_6

    .line 146
    .line 147
    new-instance v6, La/iii;

    .line 148
    .line 149
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 150
    .line 151
    .line 152
    new-instance v2, La/p8i;

    .line 153
    .line 154
    const/4 v3, 0x5

    .line 155
    invoke-direct {v2, v3}, La/p8i;-><init>(B)V

    .line 156
    .line 157
    .line 158
    invoke-static {v2}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    iput-object v2, v6, La/iii;->a:La/n5d0;

    .line 163
    .line 164
    invoke-interface {v5, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_6
    invoke-static {v6, v2}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    return-void

    .line 176
    :cond_7
    :goto_5
    check-cast v6, La/iii;

    .line 177
    .line 178
    new-instance v15, La/g2v;

    .line 179
    .line 180
    iget-object v2, v6, La/iii;->a:La/n5d0;

    .line 181
    .line 182
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    check-cast v2, La/n8v;

    .line 187
    .line 188
    invoke-direct {v15, v2}, La/g2v;-><init>(La/n8v;)V

    .line 189
    .line 190
    .line 191
    iget-object v6, v1, La/h8v;->a:La/iw20;

    .line 192
    .line 193
    iget-object v10, v1, La/h8v;->b:La/ctf0;

    .line 194
    .line 195
    iget-object v11, v1, La/h8v;->c:La/s31;

    .line 196
    .line 197
    iget-object v12, v1, La/h8v;->d:La/cyu;

    .line 198
    .line 199
    iget-object v13, v1, La/h8v;->e:La/mne;

    .line 200
    .line 201
    iget-object v14, v1, La/h8v;->f:La/wdk0;

    .line 202
    .line 203
    iget-object v1, v1, La/h8v;->g:La/ouu;

    .line 204
    .line 205
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    new-instance v5, La/daf;

    .line 212
    .line 213
    move-object/from16 v16, v1

    .line 214
    .line 215
    invoke-direct/range {v5 .. v16}, La/daf;-><init>(La/iw20;Ljava/lang/String;Lorg/xplatform/search/api/models/GlobalSearchContainerSettings;La/i1w0;La/ctf0;La/s31;La/cyu;La/mne;La/wdk0;La/g2v;La/ouu;)V

    .line 216
    .line 217
    .line 218
    iput-object v5, v0, La/g8v;->O1:La/daf;

    .line 219
    .line 220
    return-void

    .line 221
    :cond_8
    invoke-static {v4, v2}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    return-void
.end method

.method public final D0()V
    .locals 5

    .line 1
    invoke-virtual {p0}, La/g8v;->I0()La/k3t0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, La/i3t0;

    .line 6
    .line 7
    invoke-virtual {v0}, La/i3t0;->C()La/gmq;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, La/j0s;

    .line 12
    .line 13
    const/16 v2, 0x11

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v1, p0, v3, v2}, La/j0s;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 17
    .line 18
    .line 19
    sget-object v2, La/lkz;->a:La/lkz;

    .line 20
    .line 21
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    new-instance v4, La/fns;

    .line 34
    .line 35
    check-cast v0, La/i89;

    .line 36
    .line 37
    invoke-direct {v4, v0, p0, v1, v3}, La/fns;-><init>(La/i89;La/clz;La/j0s;La/yje;)V

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x3

    .line 41
    invoke-static {v2, v3, v3, v4, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final G0()La/n0r;
    .locals 2

    .line 1
    sget-object v0, La/g8v;->Q1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/g8v;->K1:La/s0r;

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
    check-cast p0, La/n0r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, La/g8v;->Q1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/g8v;->N1:La/phf0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public final I0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/g8v;->L1:La/a8z;

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

.method public final J0(La/bfo0;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x1

    .line 6
    const v1, 0x7f010054

    .line 7
    .line 8
    .line 9
    const v2, 0x7f010053

    .line 10
    .line 11
    .line 12
    const v3, 0x7f010052

    .line 13
    .line 14
    .line 15
    const v4, 0x7f010051

    .line 16
    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    const/16 v6, 0xa

    .line 20
    .line 21
    const v7, 0x7f0a0388

    .line 22
    .line 23
    .line 24
    const/4 v8, 0x0

    .line 25
    if-eqz p1, :cond_17

    .line 26
    .line 27
    if-eq p1, v0, :cond_11

    .line 28
    .line 29
    const/4 v9, 0x2

    .line 30
    if-eq p1, v9, :cond_b

    .line 31
    .line 32
    const/4 v0, 0x4

    .line 33
    if-eq p1, v0, :cond_5

    .line 34
    .line 35
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    const-class p1, Landroidx/fragment/app/Fragment;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p0}, Landroidx/fragment/app/e;->P()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-static {v8, v0}, La/l1e0;->o(II)Lkotlin/ranges/IntRange;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    new-instance v8, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-static {v0, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    invoke-direct {v8, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    :goto_0
    move-object v6, v0

    .line 70
    check-cast v6, La/kkx;

    .line 71
    .line 72
    iget-boolean v6, v6, La/kkx;->c:Z

    .line 73
    .line 74
    if-eqz v6, :cond_0

    .line 75
    .line 76
    move-object v6, v0

    .line 77
    check-cast v6, La/bkx;

    .line 78
    .line 79
    invoke-virtual {v6}, La/bkx;->nextInt()I

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    invoke-virtual {p0, v6}, Landroidx/fragment/app/e;->O(I)La/zb5;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    iget-object v6, v6, La/zb5;->i:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_0
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    if-eqz v6, :cond_2

    .line 102
    .line 103
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    move-object v8, v6

    .line 108
    check-cast v8, Ljava/lang/String;

    .line 109
    .line 110
    invoke-static {v8, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    if-eqz v8, :cond_1

    .line 115
    .line 116
    move-object v5, v6

    .line 117
    :cond_2
    check-cast v5, Ljava/lang/String;

    .line 118
    .line 119
    new-instance v0, La/zb5;

    .line 120
    .line 121
    invoke-direct {v0, p0}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v4, v3, v2, v1}, La/zb5;->p(IIII)V

    .line 125
    .line 126
    .line 127
    if-nez v5, :cond_3

    .line 128
    .line 129
    new-instance p0, Landroidx/fragment/app/Fragment;

    .line 130
    .line 131
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v7, p0, p1}, La/zb5;->o(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, p1}, La/zb5;->c(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_3
    invoke-virtual {p0, p1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    if-eqz p0, :cond_4

    .line 146
    .line 147
    invoke-virtual {v0, v7, p0, p1}, La/zb5;->o(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    :cond_4
    :goto_1
    invoke-virtual {v0}, La/zb5;->f()V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :cond_5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    const-class v0, La/jd0;

    .line 162
    .line 163
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-virtual {p1}, Landroidx/fragment/app/e;->P()I

    .line 168
    .line 169
    .line 170
    move-result v9

    .line 171
    invoke-static {v8, v9}, La/l1e0;->o(II)Lkotlin/ranges/IntRange;

    .line 172
    .line 173
    .line 174
    move-result-object v9

    .line 175
    new-instance v10, Ljava/util/ArrayList;

    .line 176
    .line 177
    invoke-static {v9, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 178
    .line 179
    .line 180
    move-result v6

    .line 181
    invoke-direct {v10, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v9}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 185
    .line 186
    .line 187
    move-result-object v6

    .line 188
    :goto_2
    move-object v9, v6

    .line 189
    check-cast v9, La/kkx;

    .line 190
    .line 191
    iget-boolean v9, v9, La/kkx;->c:Z

    .line 192
    .line 193
    if-eqz v9, :cond_6

    .line 194
    .line 195
    move-object v9, v6

    .line 196
    check-cast v9, La/bkx;

    .line 197
    .line 198
    invoke-virtual {v9}, La/bkx;->nextInt()I

    .line 199
    .line 200
    .line 201
    move-result v9

    .line 202
    invoke-virtual {p1, v9}, Landroidx/fragment/app/e;->O(I)La/zb5;

    .line 203
    .line 204
    .line 205
    move-result-object v9

    .line 206
    iget-object v9, v9, La/zb5;->i:Ljava/lang/String;

    .line 207
    .line 208
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_6
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 213
    .line 214
    .line 215
    move-result-object v6

    .line 216
    :cond_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 217
    .line 218
    .line 219
    move-result v9

    .line 220
    if-eqz v9, :cond_8

    .line 221
    .line 222
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v9

    .line 226
    move-object v10, v9

    .line 227
    check-cast v10, Ljava/lang/String;

    .line 228
    .line 229
    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v10

    .line 233
    if-eqz v10, :cond_7

    .line 234
    .line 235
    move-object v5, v9

    .line 236
    :cond_8
    check-cast v5, Ljava/lang/String;

    .line 237
    .line 238
    new-instance v6, La/zb5;

    .line 239
    .line 240
    invoke-direct {v6, p1}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v6, v4, v3, v2, v1}, La/zb5;->p(IIII)V

    .line 244
    .line 245
    .line 246
    if-nez v5, :cond_9

    .line 247
    .line 248
    sget-object p1, La/jd0;->P1:La/gfk0;

    .line 249
    .line 250
    new-instance v1, Lorg/xplatform/search/impl/presentation/aggregator_brands/models/AggregatorBrandsFragmentSettings;

    .line 251
    .line 252
    invoke-virtual {p0}, La/g8v;->H0()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    invoke-direct {v1, p0}, Lorg/xplatform/search/impl/presentation/aggregator_brands/models/AggregatorBrandsFragmentSettings;-><init>(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    new-instance p0, La/jd0;

    .line 263
    .line 264
    invoke-direct {p0}, La/jd0;-><init>()V

    .line 265
    .line 266
    .line 267
    sget-object p1, La/jd0;->Q1:[La/iiy;

    .line 268
    .line 269
    aget-object p1, p1, v8

    .line 270
    .line 271
    iget-object v2, p0, La/jd0;->K1:La/khf0;

    .line 272
    .line 273
    invoke-virtual {v2, p0, p1, v1}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v6, v7, p0, v0}, La/zb5;->o(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v6, v0}, La/zb5;->c(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    goto :goto_3

    .line 283
    :cond_9
    invoke-virtual {p1, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 284
    .line 285
    .line 286
    move-result-object p0

    .line 287
    if-eqz p0, :cond_a

    .line 288
    .line 289
    invoke-virtual {v6, v7, p0, v0}, La/zb5;->o(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    :cond_a
    :goto_3
    invoke-virtual {v6}, La/zb5;->f()V

    .line 293
    .line 294
    .line 295
    return-void

    .line 296
    :cond_b
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 297
    .line 298
    .line 299
    move-result-object p1

    .line 300
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    const-class v9, La/qy0;

    .line 304
    .line 305
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v9

    .line 309
    invoke-virtual {p1}, Landroidx/fragment/app/e;->P()I

    .line 310
    .line 311
    .line 312
    move-result v10

    .line 313
    invoke-static {v8, v10}, La/l1e0;->o(II)Lkotlin/ranges/IntRange;

    .line 314
    .line 315
    .line 316
    move-result-object v8

    .line 317
    new-instance v10, Ljava/util/ArrayList;

    .line 318
    .line 319
    invoke-static {v8, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 320
    .line 321
    .line 322
    move-result v6

    .line 323
    invoke-direct {v10, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v8}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 327
    .line 328
    .line 329
    move-result-object v6

    .line 330
    :goto_4
    move-object v8, v6

    .line 331
    check-cast v8, La/kkx;

    .line 332
    .line 333
    iget-boolean v8, v8, La/kkx;->c:Z

    .line 334
    .line 335
    if-eqz v8, :cond_c

    .line 336
    .line 337
    move-object v8, v6

    .line 338
    check-cast v8, La/bkx;

    .line 339
    .line 340
    invoke-virtual {v8}, La/bkx;->nextInt()I

    .line 341
    .line 342
    .line 343
    move-result v8

    .line 344
    invoke-virtual {p1, v8}, Landroidx/fragment/app/e;->O(I)La/zb5;

    .line 345
    .line 346
    .line 347
    move-result-object v8

    .line 348
    iget-object v8, v8, La/zb5;->i:Ljava/lang/String;

    .line 349
    .line 350
    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    goto :goto_4

    .line 354
    :cond_c
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 355
    .line 356
    .line 357
    move-result-object v6

    .line 358
    :cond_d
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 359
    .line 360
    .line 361
    move-result v8

    .line 362
    if-eqz v8, :cond_e

    .line 363
    .line 364
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v8

    .line 368
    move-object v10, v8

    .line 369
    check-cast v10, Ljava/lang/String;

    .line 370
    .line 371
    invoke-static {v10, v9}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    move-result v10

    .line 375
    if-eqz v10, :cond_d

    .line 376
    .line 377
    move-object v5, v8

    .line 378
    :cond_e
    check-cast v5, Ljava/lang/String;

    .line 379
    .line 380
    new-instance v6, La/zb5;

    .line 381
    .line 382
    invoke-direct {v6, p1}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v6, v4, v3, v2, v1}, La/zb5;->p(IIII)V

    .line 386
    .line 387
    .line 388
    if-nez v5, :cond_f

    .line 389
    .line 390
    sget-object p1, La/qy0;->S1:La/pek0;

    .line 391
    .line 392
    new-instance v1, Lorg/xplatform/search/impl/presentation/aggregator_games/models/AggregatorGamesFragmentSettings;

    .line 393
    .line 394
    invoke-virtual {p0}, La/g8v;->H0()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object p0

    .line 398
    invoke-direct {v1, p0}, Lorg/xplatform/search/impl/presentation/aggregator_games/models/AggregatorGamesFragmentSettings;-><init>(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 402
    .line 403
    .line 404
    new-instance p0, La/qy0;

    .line 405
    .line 406
    invoke-direct {p0}, La/qy0;-><init>()V

    .line 407
    .line 408
    .line 409
    sget-object p1, La/qy0;->U1:[La/iiy;

    .line 410
    .line 411
    aget-object p1, p1, v0

    .line 412
    .line 413
    iget-object v0, p0, La/qy0;->R1:La/khf0;

    .line 414
    .line 415
    invoke-virtual {v0, p0, p1, v1}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v6, v7, p0, v9}, La/zb5;->o(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v6, v9}, La/zb5;->c(Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    goto :goto_5

    .line 425
    :cond_f
    invoke-virtual {p1, v9}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 426
    .line 427
    .line 428
    move-result-object p0

    .line 429
    if-eqz p0, :cond_10

    .line 430
    .line 431
    invoke-virtual {v6, v7, p0, v9}, La/zb5;->o(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    :cond_10
    :goto_5
    invoke-virtual {v6}, La/zb5;->f()V

    .line 435
    .line 436
    .line 437
    return-void

    .line 438
    :cond_11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 439
    .line 440
    .line 441
    move-result-object p1

    .line 442
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 443
    .line 444
    .line 445
    const-class v9, La/tyv0;

    .line 446
    .line 447
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v9

    .line 451
    invoke-virtual {p1}, Landroidx/fragment/app/e;->P()I

    .line 452
    .line 453
    .line 454
    move-result v10

    .line 455
    invoke-static {v8, v10}, La/l1e0;->o(II)Lkotlin/ranges/IntRange;

    .line 456
    .line 457
    .line 458
    move-result-object v8

    .line 459
    new-instance v10, Ljava/util/ArrayList;

    .line 460
    .line 461
    invoke-static {v8, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 462
    .line 463
    .line 464
    move-result v6

    .line 465
    invoke-direct {v10, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v8}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 469
    .line 470
    .line 471
    move-result-object v6

    .line 472
    :goto_6
    move-object v8, v6

    .line 473
    check-cast v8, La/kkx;

    .line 474
    .line 475
    iget-boolean v8, v8, La/kkx;->c:Z

    .line 476
    .line 477
    if-eqz v8, :cond_12

    .line 478
    .line 479
    move-object v8, v6

    .line 480
    check-cast v8, La/bkx;

    .line 481
    .line 482
    invoke-virtual {v8}, La/bkx;->nextInt()I

    .line 483
    .line 484
    .line 485
    move-result v8

    .line 486
    invoke-virtual {p1, v8}, Landroidx/fragment/app/e;->O(I)La/zb5;

    .line 487
    .line 488
    .line 489
    move-result-object v8

    .line 490
    iget-object v8, v8, La/zb5;->i:Ljava/lang/String;

    .line 491
    .line 492
    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 493
    .line 494
    .line 495
    goto :goto_6

    .line 496
    :cond_12
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 497
    .line 498
    .line 499
    move-result-object v6

    .line 500
    :cond_13
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 501
    .line 502
    .line 503
    move-result v8

    .line 504
    if-eqz v8, :cond_14

    .line 505
    .line 506
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v8

    .line 510
    move-object v10, v8

    .line 511
    check-cast v10, Ljava/lang/String;

    .line 512
    .line 513
    invoke-static {v10, v9}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 514
    .line 515
    .line 516
    move-result v10

    .line 517
    if-eqz v10, :cond_13

    .line 518
    .line 519
    move-object v5, v8

    .line 520
    :cond_14
    check-cast v5, Ljava/lang/String;

    .line 521
    .line 522
    new-instance v6, La/zb5;

    .line 523
    .line 524
    invoke-direct {v6, p1}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v6, v4, v3, v2, v1}, La/zb5;->p(IIII)V

    .line 528
    .line 529
    .line 530
    if-nez v5, :cond_15

    .line 531
    .line 532
    sget-object p1, La/tyv0;->O1:La/uxs0;

    .line 533
    .line 534
    new-instance v1, Lorg/xplatform/search/impl/presentation/xgames/models/XGamesSearchFragmentSettings;

    .line 535
    .line 536
    invoke-virtual {p0}, La/g8v;->H0()Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object p0

    .line 540
    const-string v2, "X_GAMES_UM_BUTTON_CLICK_RESULT_KEY"

    .line 541
    .line 542
    invoke-direct {v1, p0, v2}, Lorg/xplatform/search/impl/presentation/xgames/models/XGamesSearchFragmentSettings;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 546
    .line 547
    .line 548
    new-instance p0, La/tyv0;

    .line 549
    .line 550
    invoke-direct {p0}, La/tyv0;-><init>()V

    .line 551
    .line 552
    .line 553
    sget-object p1, La/tyv0;->P1:[La/iiy;

    .line 554
    .line 555
    aget-object p1, p1, v0

    .line 556
    .line 557
    iget-object v0, p0, La/tyv0;->N1:La/khf0;

    .line 558
    .line 559
    invoke-virtual {v0, p0, p1, v1}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 560
    .line 561
    .line 562
    invoke-virtual {v6, v7, p0, v9}, La/zb5;->o(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 563
    .line 564
    .line 565
    invoke-virtual {v6, v9}, La/zb5;->c(Ljava/lang/String;)V

    .line 566
    .line 567
    .line 568
    goto :goto_7

    .line 569
    :cond_15
    invoke-virtual {p1, v9}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 570
    .line 571
    .line 572
    move-result-object p0

    .line 573
    if-eqz p0, :cond_16

    .line 574
    .line 575
    invoke-virtual {v6, v7, p0, v9}, La/zb5;->o(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 576
    .line 577
    .line 578
    :cond_16
    :goto_7
    invoke-virtual {v6}, La/zb5;->f()V

    .line 579
    .line 580
    .line 581
    return-void

    .line 582
    :cond_17
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 583
    .line 584
    .line 585
    move-result-object p1

    .line 586
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 587
    .line 588
    .line 589
    const-class v9, La/apl0;

    .line 590
    .line 591
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object v9

    .line 595
    invoke-virtual {p1}, Landroidx/fragment/app/e;->P()I

    .line 596
    .line 597
    .line 598
    move-result v10

    .line 599
    invoke-static {v8, v10}, La/l1e0;->o(II)Lkotlin/ranges/IntRange;

    .line 600
    .line 601
    .line 602
    move-result-object v8

    .line 603
    new-instance v10, Ljava/util/ArrayList;

    .line 604
    .line 605
    invoke-static {v8, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 606
    .line 607
    .line 608
    move-result v6

    .line 609
    invoke-direct {v10, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 610
    .line 611
    .line 612
    invoke-virtual {v8}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 613
    .line 614
    .line 615
    move-result-object v6

    .line 616
    :goto_8
    move-object v8, v6

    .line 617
    check-cast v8, La/kkx;

    .line 618
    .line 619
    iget-boolean v8, v8, La/kkx;->c:Z

    .line 620
    .line 621
    if-eqz v8, :cond_18

    .line 622
    .line 623
    move-object v8, v6

    .line 624
    check-cast v8, La/bkx;

    .line 625
    .line 626
    invoke-virtual {v8}, La/bkx;->nextInt()I

    .line 627
    .line 628
    .line 629
    move-result v8

    .line 630
    invoke-virtual {p1, v8}, Landroidx/fragment/app/e;->O(I)La/zb5;

    .line 631
    .line 632
    .line 633
    move-result-object v8

    .line 634
    iget-object v8, v8, La/zb5;->i:Ljava/lang/String;

    .line 635
    .line 636
    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 637
    .line 638
    .line 639
    goto :goto_8

    .line 640
    :cond_18
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 641
    .line 642
    .line 643
    move-result-object v6

    .line 644
    :cond_19
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 645
    .line 646
    .line 647
    move-result v8

    .line 648
    if-eqz v8, :cond_1a

    .line 649
    .line 650
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    move-result-object v8

    .line 654
    move-object v10, v8

    .line 655
    check-cast v10, Ljava/lang/String;

    .line 656
    .line 657
    invoke-static {v10, v9}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 658
    .line 659
    .line 660
    move-result v10

    .line 661
    if-eqz v10, :cond_19

    .line 662
    .line 663
    move-object v5, v8

    .line 664
    :cond_1a
    check-cast v5, Ljava/lang/String;

    .line 665
    .line 666
    new-instance v6, La/zb5;

    .line 667
    .line 668
    invoke-direct {v6, p1}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 669
    .line 670
    .line 671
    invoke-virtual {v6, v4, v3, v2, v1}, La/zb5;->p(IIII)V

    .line 672
    .line 673
    .line 674
    if-nez v5, :cond_1b

    .line 675
    .line 676
    sget-object p1, La/apl0;->P1:La/gle0;

    .line 677
    .line 678
    new-instance v1, Lorg/xplatform/search/impl/presentation/sport/models/SportSearchFragmentSettings;

    .line 679
    .line 680
    invoke-virtual {p0}, La/g8v;->H0()Ljava/lang/String;

    .line 681
    .line 682
    .line 683
    move-result-object v2

    .line 684
    sget-object v3, La/g8v;->Q1:[La/iiy;

    .line 685
    .line 686
    aget-object v3, v3, v0

    .line 687
    .line 688
    iget-object v4, p0, La/g8v;->M1:La/khf0;

    .line 689
    .line 690
    invoke-virtual {v4, p0, v3}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 691
    .line 692
    .line 693
    move-result-object p0

    .line 694
    check-cast p0, Lorg/xplatform/search/api/models/GlobalSearchContainerSettings;

    .line 695
    .line 696
    invoke-direct {v1, v2, p0}, Lorg/xplatform/search/impl/presentation/sport/models/SportSearchFragmentSettings;-><init>(Ljava/lang/String;Lorg/xplatform/search/api/models/GlobalSearchContainerSettings;)V

    .line 697
    .line 698
    .line 699
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 700
    .line 701
    .line 702
    new-instance p0, La/apl0;

    .line 703
    .line 704
    invoke-direct {p0}, La/apl0;-><init>()V

    .line 705
    .line 706
    .line 707
    sget-object p1, La/apl0;->Q1:[La/iiy;

    .line 708
    .line 709
    aget-object p1, p1, v0

    .line 710
    .line 711
    iget-object v0, p0, La/apl0;->N1:La/khf0;

    .line 712
    .line 713
    invoke-virtual {v0, p0, p1, v1}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 714
    .line 715
    .line 716
    invoke-virtual {v6, v7, p0, v9}, La/zb5;->o(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 717
    .line 718
    .line 719
    invoke-virtual {v6, v9}, La/zb5;->c(Ljava/lang/String;)V

    .line 720
    .line 721
    .line 722
    goto :goto_9

    .line 723
    :cond_1b
    invoke-virtual {p1, v9}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 724
    .line 725
    .line 726
    move-result-object p0

    .line 727
    if-eqz p0, :cond_1c

    .line 728
    .line 729
    invoke-virtual {v6, v7, p0, v9}, La/zb5;->o(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 730
    .line 731
    .line 732
    :cond_1c
    :goto_9
    invoke-virtual {v6}, La/zb5;->f()V

    .line 733
    .line 734
    .line 735
    return-void
.end method

.method public final Z()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "X_GAMES_UM_BUTTON_CLICK_RESULT_KEY"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, La/g8v;->I0()La/k3t0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, La/y7v;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-super {p0}, La/yx5;->Z()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final e0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/g8v;->G0()La/n0r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/n0r;->a:Landroid/widget/LinearLayout;

    .line 6
    .line 7
    invoke-static {v0}, La/hxm0;->n(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    invoke-super {p0}, La/yx5;->e0()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final g0()V
    .locals 2

    .line 1
    invoke-super {p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/g8v;->O1:La/daf;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, La/daf;->l:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, La/wdk0;

    .line 11
    .line 12
    invoke-virtual {p0}, La/g8v;->x0()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-static {v0, p0, v1}, La/wdk0;->l(La/wdk0;Landroidx/fragment/app/Fragment;Z)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const-string p0, "component"

    .line 21
    .line 22
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    throw p0
.end method

.method public final h0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/g8v;->G0()La/n0r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/n0r;->a:Landroid/widget/LinearLayout;

    .line 6
    .line 7
    invoke-static {v0}, La/hxm0;->m(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, La/g8v;->O1:La/daf;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, v0, La/daf;->l:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, La/wdk0;

    .line 17
    .line 18
    invoke-static {v0, p0}, La/wdk0;->a(La/wdk0;Landroidx/fragment/app/Fragment;)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const-string p0, "component"

    .line 26
    .line 27
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    throw p0
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/yx5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    new-instance p1, La/hie0;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    new-instance v0, La/u8u;

    .line 17
    .line 18
    const/16 v1, 0x13

    .line 19
    .line 20
    invoke-direct {v0, p1, p0, v1}, La/u8u;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 21
    .line 22
    .line 23
    sget-object p0, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 24
    .line 25
    invoke-static {p2, v0}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final x0()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Landroidx/fragment/app/e;->c:La/pmi;

    .line 6
    .line 7
    invoke-virtual {p0}, La/pmi;->p()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, La/twn;->u(Ljava/util/List;)Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    instance-of v2, v1, La/yx5;

    .line 30
    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, La/yx5;

    .line 42
    .line 43
    if-eqz p0, :cond_2

    .line 44
    .line 45
    invoke-virtual {p0}, La/yx5;->x0()Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    return p0

    .line 50
    :cond_2
    const/4 p0, 0x1

    .line 51
    return p0
.end method
