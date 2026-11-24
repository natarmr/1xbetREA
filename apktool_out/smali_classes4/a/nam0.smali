.class public final La/nam0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/nam0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/s2m0",
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
.field public static final U1:La/s2m0;

.field public static final synthetic V1:[La/iiy;

.field public static final W1:B


# instance fields
.field public final K1:La/hnm0;

.field public L1:La/wui;

.field public M1:La/wdk0;

.field public N1:La/ii;

.field public final O1:La/kiu0;

.field public final P1:La/s0r;

.field public final Q1:La/khf0;

.field public final R1:La/r9m0;

.field public final S1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/nam0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/cyber/statistics_blocks/impl/databinding/StatisticBlocksFragmentBinding;"

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
    const-string v3, "params"

    .line 16
    .line 17
    const-string v5, "getParams()Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;"

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
    sput-object v1, La/nam0;->V1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/s2m0;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/nam0;->U1:La/s2m0;

    .line 38
    .line 39
    const/16 v0, 0x8

    .line 40
    .line 41
    sput-byte v0, La/nam0;->W1:B

    .line 42
    .line 43
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const v0, 0x7f0d0598

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 8
    .line 9
    iput-object v0, p0, La/nam0;->K1:La/hnm0;

    .line 10
    .line 11
    new-instance v0, La/lam0;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p0, v1}, La/lam0;-><init>(La/nam0;B)V

    .line 15
    .line 16
    .line 17
    new-instance v1, La/fyk0;

    .line 18
    .line 19
    const/16 v2, 0x8

    .line 20
    .line 21
    invoke-direct {v1, p0, v2}, La/fyk0;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    sget-object v2, La/wez;->b:La/wez;

    .line 25
    .line 26
    new-instance v3, La/fyk0;

    .line 27
    .line 28
    const/16 v4, 0x9

    .line 29
    .line 30
    invoke-direct {v3, v1, v4}, La/fyk0;-><init>(Ljava/lang/Object;B)V

    .line 31
    .line 32
    .line 33
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const-class v3, La/tam0;

    .line 38
    .line 39
    sget-object v4, La/sre0;->a:La/tre0;

    .line 40
    .line 41
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    new-instance v4, La/cdl0;

    .line 46
    .line 47
    const/4 v5, 0x6

    .line 48
    invoke-direct {v4, v1, v5}, La/cdl0;-><init>(La/a8z;B)V

    .line 49
    .line 50
    .line 51
    new-instance v5, La/cdl0;

    .line 52
    .line 53
    const/4 v6, 0x7

    .line 54
    invoke-direct {v5, v1, v6}, La/cdl0;-><init>(La/a8z;B)V

    .line 55
    .line 56
    .line 57
    invoke-static {p0, v3, v4, v5, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iput-object v0, p0, La/nam0;->O1:La/kiu0;

    .line 62
    .line 63
    sget-object v0, La/mam0;->a:La/mam0;

    .line 64
    .line 65
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iput-object v0, p0, La/nam0;->P1:La/s0r;

    .line 70
    .line 71
    new-instance v0, La/khf0;

    .line 72
    .line 73
    const-string v1, "params_key"

    .line 74
    .line 75
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iput-object v0, p0, La/nam0;->Q1:La/khf0;

    .line 79
    .line 80
    new-instance v0, La/r9m0;

    .line 81
    .line 82
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 83
    .line 84
    .line 85
    iput-object v0, p0, La/nam0;->R1:La/r9m0;

    .line 86
    .line 87
    new-instance v0, La/lam0;

    .line 88
    .line 89
    const/4 v1, 0x1

    .line 90
    invoke-direct {v0, p0, v1}, La/lam0;-><init>(La/nam0;B)V

    .line 91
    .line 92
    .line 93
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iput-object v0, p0, La/nam0;->S1:La/a8z;

    .line 98
    .line 99
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 14

    .line 1
    iget-object p1, p0, La/nam0;->S1:La/a8z;

    .line 2
    .line 3
    invoke-interface {p1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    move-object v1, p1

    .line 8
    check-cast v1, La/o9m0;

    .line 9
    .line 10
    sget-object p1, La/nam0;->V1:[La/iiy;

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    aget-object p1, p1, v6

    .line 14
    .line 15
    iget-object v0, p0, La/nam0;->P1:La/s0r;

    .line 16
    .line 17
    invoke-virtual {v0, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-object v2, p1

    .line 25
    check-cast v2, La/oam0;

    .line 26
    .line 27
    iget-object p1, p0, La/nam0;->O1:La/kiu0;

    .line 28
    .line 29
    invoke-virtual {p1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, La/tam0;

    .line 34
    .line 35
    iget-object v8, p0, La/nam0;->M1:La/wdk0;

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    if-eqz v8, :cond_2

    .line 39
    .line 40
    iget-object v10, p0, La/nam0;->N1:La/ii;

    .line 41
    .line 42
    if-eqz v10, :cond_1

    .line 43
    .line 44
    iget-object v0, p0, La/nam0;->R1:La/r9m0;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object v3, v2, La/oam0;->c:Landroidx/compose/ui/platform/ComposeView;

    .line 53
    .line 54
    iget-object v13, v2, La/oam0;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 55
    .line 56
    new-instance v5, La/owp0;

    .line 57
    .line 58
    invoke-direct {v5, p0}, La/owp0;-><init>(La/clz;)V

    .line 59
    .line 60
    .line 61
    new-instance v7, La/o3m0;

    .line 62
    .line 63
    const/4 v9, 0x4

    .line 64
    invoke-direct {v7, p1, p0, v9}, La/o3m0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 65
    .line 66
    .line 67
    new-instance v9, La/ugd;

    .line 68
    .line 69
    const v11, 0x4aa3ae94    # 5363530.0f

    .line 70
    .line 71
    .line 72
    const/4 v12, 0x1

    .line 73
    invoke-direct {v9, v11, v12, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v3, v5, v4, v9}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 77
    .line 78
    .line 79
    iget-object v3, v2, La/oam0;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 80
    .line 81
    invoke-virtual {v3, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 82
    .line 83
    .line 84
    new-instance v5, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 85
    .line 86
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    invoke-direct {v5, v7}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3, v5}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 94
    .line 95
    .line 96
    invoke-static {v3, v12, v12}, La/vvw;->o(Landroidx/recyclerview/widget/RecyclerView;ZI)V

    .line 97
    .line 98
    .line 99
    iget-object v5, v0, La/r9m0;->a:La/vyx;

    .line 100
    .line 101
    if-nez v5, :cond_0

    .line 102
    .line 103
    new-instance v5, La/vyx;

    .line 104
    .line 105
    new-instance v7, La/w9m0;

    .line 106
    .line 107
    invoke-direct {v7, v1}, La/w9m0;-><init>(La/o9m0;)V

    .line 108
    .line 109
    .line 110
    invoke-direct {v5, v7}, La/vyx;-><init>(La/syx;)V

    .line 111
    .line 112
    .line 113
    iput-object v5, v0, La/r9m0;->a:La/vyx;

    .line 114
    .line 115
    invoke-virtual {v5, v3}, La/vyx;->i(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 116
    .line 117
    .line 118
    :cond_0
    iget-object v0, p1, La/tam0;->j:La/p7m0;

    .line 119
    .line 120
    new-instance v3, La/sye0;

    .line 121
    .line 122
    const/16 v5, 0xa

    .line 123
    .line 124
    invoke-direct {v3, p1, v4, v5}, La/sye0;-><init>(La/diu0;La/yje;B)V

    .line 125
    .line 126
    .line 127
    new-instance v7, La/dnq;

    .line 128
    .line 129
    invoke-direct {v7, v0, v3, v6}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 130
    .line 131
    .line 132
    new-instance v0, La/ah0;

    .line 133
    .line 134
    const/16 v5, 0x16

    .line 135
    .line 136
    move-object v3, p0

    .line 137
    invoke-direct/range {v0 .. v5}, La/ah0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 138
    .line 139
    .line 140
    sget-object p0, La/lkz;->a:La/lkz;

    .line 141
    .line 142
    invoke-static {v3}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    new-instance v2, La/zol0;

    .line 155
    .line 156
    invoke-direct {v2, v7, p0, v0, v4}, La/zol0;-><init>(La/dnq;La/clz;La/ah0;La/yje;)V

    .line 157
    .line 158
    .line 159
    const/4 p0, 0x3

    .line 160
    invoke-static {v1, v4, v4, v2, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 161
    .line 162
    .line 163
    new-instance v0, La/p9m0;

    .line 164
    .line 165
    invoke-direct {v0, p1, v12}, La/p9m0;-><init>(La/tam0;B)V

    .line 166
    .line 167
    .line 168
    const-string v1, "ABORT_CHANGES_REQUEST_PARAMS"

    .line 169
    .line 170
    invoke-static {v3, v1, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 171
    .line 172
    .line 173
    new-instance v0, La/p9m0;

    .line 174
    .line 175
    const/4 v1, 0x2

    .line 176
    invoke-direct {v0, p1, v1}, La/p9m0;-><init>(La/tam0;B)V

    .line 177
    .line 178
    .line 179
    const-string v2, "REJECT_CHANGES_REQUEST_PARAMS"

    .line 180
    .line 181
    invoke-static {v3, v2, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 182
    .line 183
    .line 184
    iget-object v0, p1, La/tam0;->l:La/ol60;

    .line 185
    .line 186
    new-instance v7, La/ah0;

    .line 187
    .line 188
    const/16 v12, 0x15

    .line 189
    .line 190
    move-object v9, v3

    .line 191
    move-object v11, v4

    .line 192
    invoke-direct/range {v7 .. v12}, La/ah0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 193
    .line 194
    .line 195
    invoke-static {v3}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 200
    .line 201
    .line 202
    move-result-object v5

    .line 203
    invoke-static {v5}, La/x0x;->Q(La/glz;)La/tkz;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    new-instance v8, La/zol0;

    .line 208
    .line 209
    invoke-direct {v8, v0, v2, v7, v4}, La/zol0;-><init>(La/gmq;La/clz;La/ah0;La/yje;)V

    .line 210
    .line 211
    .line 212
    invoke-static {v5, v4, v4, v8, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 213
    .line 214
    .line 215
    new-instance p0, La/p9m0;

    .line 216
    .line 217
    invoke-direct {p0, p1, v6}, La/p9m0;-><init>(La/tam0;B)V

    .line 218
    .line 219
    .line 220
    invoke-static {v13, p0}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->u(Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;Lkotlin/jvm/functions/Function0;)V

    .line 221
    .line 222
    .line 223
    invoke-static {v13, v6}, La/knm0;->i(Landroid/view/View;Z)V

    .line 224
    .line 225
    .line 226
    new-instance p0, La/lam0;

    .line 227
    .line 228
    invoke-direct {p0, v3, v1}, La/lam0;-><init>(La/nam0;B)V

    .line 229
    .line 230
    .line 231
    invoke-static {v3, p0}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 232
    .line 233
    .line 234
    return-void

    .line 235
    :cond_1
    const-string p0, "actionDialogManager"

    .line 236
    .line 237
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    throw v4

    .line 241
    :cond_2
    const-string p0, "snackbarManager"

    .line 242
    .line 243
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    throw v4
.end method

.method public final C0()V
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    instance-of v1, v0, La/af3;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast v0, La/af3;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v0, v2

    .line 21
    :goto_0
    const-class v1, La/pam0;

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, La/o5d0;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/ze3;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object v0, v2

    .line 45
    :goto_1
    instance-of v3, v0, La/pam0;

    .line 46
    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move-object v2, v0

    .line 51
    :goto_2
    check-cast v2, La/pam0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    sget-object v0, La/nam0;->V1:[La/iiy;

    .line 56
    .line 57
    const/4 v1, 0x1

    .line 58
    aget-object v0, v0, v1

    .line 59
    .line 60
    iget-object v1, p0, La/nam0;->Q1:La/khf0;

    .line 61
    .line 62
    invoke-virtual {v1, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;

    .line 67
    .line 68
    iget-object v1, v2, La/pam0;->a:La/cad;

    .line 69
    .line 70
    iget-object v3, v2, La/pam0;->b:La/ogh;

    .line 71
    .line 72
    iget-object v4, v2, La/pam0;->c:La/ctf0;

    .line 73
    .line 74
    iget-object v5, v2, La/pam0;->d:La/q7d0;

    .line 75
    .line 76
    iget-object v6, v2, La/pam0;->e:La/vby;

    .line 77
    .line 78
    iget-object v7, v2, La/pam0;->f:La/wdk0;

    .line 79
    .line 80
    iget-object v8, v2, La/pam0;->g:La/ii;

    .line 81
    .line 82
    iget-object v9, v2, La/pam0;->h:La/oeg0;

    .line 83
    .line 84
    iget-object v2, v2, La/pam0;->i:La/g2v;

    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    new-instance v5, La/ywq0;

    .line 108
    .line 109
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 110
    .line 111
    .line 112
    iput-object v0, v5, La/ywq0;->a:Ljava/lang/Object;

    .line 113
    .line 114
    iput-object v1, v5, La/ywq0;->b:Ljava/lang/Object;

    .line 115
    .line 116
    iput-object v3, v5, La/ywq0;->c:Ljava/lang/Object;

    .line 117
    .line 118
    iput-object v4, v5, La/ywq0;->d:Ljava/lang/Object;

    .line 119
    .line 120
    iput-object v9, v5, La/ywq0;->e:Ljava/lang/Object;

    .line 121
    .line 122
    iput-object v2, v5, La/ywq0;->f:Ljava/lang/Object;

    .line 123
    .line 124
    new-instance v0, La/rti;

    .line 125
    .line 126
    const/16 v1, 0xc

    .line 127
    .line 128
    invoke-direct {v0, v5, v1}, La/rti;-><init>(Ljava/lang/Object;B)V

    .line 129
    .line 130
    .line 131
    invoke-static {v0}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    iput-object v0, v5, La/ywq0;->g:Ljava/lang/Object;

    .line 136
    .line 137
    iget-object v0, v5, La/ywq0;->g:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v0, La/n5d0;

    .line 140
    .line 141
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    check-cast v0, La/wui;

    .line 146
    .line 147
    iput-object v0, p0, La/nam0;->L1:La/wui;

    .line 148
    .line 149
    iput-object v7, p0, La/nam0;->M1:La/wdk0;

    .line 150
    .line 151
    iput-object v8, p0, La/nam0;->N1:La/ii;

    .line 152
    .line 153
    return-void

    .line 154
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 155
    .line 156
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    return-void
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/nam0;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
