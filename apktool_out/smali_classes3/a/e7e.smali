.class public final La/e7e;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0006"
    }
    d2 = {
        "La/e7e;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/y6e",
        "a/kwd",
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
.field public static final d2:La/kwd;

.field public static final synthetic e2:[La/iiy;


# instance fields
.field public final K1:La/hnm0;

.field public final L1:La/i9o0;

.field public M1:La/ii;

.field public N1:La/wdk0;

.field public final O1:La/s0r;

.field public P1:La/ddi;

.field public Q1:La/ndk0;

.field public final R1:La/a8z;

.field public final S1:Landroid/os/Handler;

.field public final U1:La/kiu0;

.field public final V1:La/a8z;

.field public final W1:La/a8z;

.field public final X1:La/a8z;

.field public final Y1:La/a8z;

.field public Z1:Ljava/lang/Runnable;

.field public a2:Z

.field public b2:Ljava/lang/Runnable;

.field public c2:La/b7e;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/e7e;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/consultantchat/impl/databinding/FragmentConsultantChatBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/e7e;->e2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/kwd;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/e7e;->d2:La/kwd;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const v0, 0x7f0d0221

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
    iput-object v0, p0, La/e7e;->K1:La/hnm0;

    .line 10
    .line 11
    sget-object v0, La/i9o0;->a:La/i9o0;

    .line 12
    .line 13
    iput-object v0, p0, La/e7e;->L1:La/i9o0;

    .line 14
    .line 15
    sget-object v0, La/a7e;->a:La/a7e;

    .line 16
    .line 17
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, La/e7e;->O1:La/s0r;

    .line 22
    .line 23
    new-instance v0, La/s6e;

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-direct {v0, p0, v1}, La/s6e;-><init>(La/e7e;B)V

    .line 27
    .line 28
    .line 29
    sget-object v1, La/wez;->b:La/wez;

    .line 30
    .line 31
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, La/e7e;->R1:La/a8z;

    .line 36
    .line 37
    new-instance v0, Landroid/os/Handler;

    .line 38
    .line 39
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, La/e7e;->S1:Landroid/os/Handler;

    .line 47
    .line 48
    new-instance v0, La/s6e;

    .line 49
    .line 50
    const/4 v2, 0x2

    .line 51
    invoke-direct {v0, p0, v2}, La/s6e;-><init>(La/e7e;B)V

    .line 52
    .line 53
    .line 54
    new-instance v3, La/svc;

    .line 55
    .line 56
    const/16 v4, 0x14

    .line 57
    .line 58
    invoke-direct {v3, p0, v4}, La/svc;-><init>(Ljava/lang/Object;B)V

    .line 59
    .line 60
    .line 61
    new-instance v4, La/svc;

    .line 62
    .line 63
    const/16 v5, 0x15

    .line 64
    .line 65
    invoke-direct {v4, v3, v5}, La/svc;-><init>(Ljava/lang/Object;B)V

    .line 66
    .line 67
    .line 68
    invoke-static {v1, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    const-class v4, La/fae;

    .line 73
    .line 74
    sget-object v5, La/sre0;->a:La/tre0;

    .line 75
    .line 76
    invoke-virtual {v5, v4}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    new-instance v5, La/wpb;

    .line 81
    .line 82
    const/16 v6, 0x1a

    .line 83
    .line 84
    invoke-direct {v5, v3, v6}, La/wpb;-><init>(La/a8z;B)V

    .line 85
    .line 86
    .line 87
    new-instance v6, La/wpb;

    .line 88
    .line 89
    const/16 v7, 0x1b

    .line 90
    .line 91
    invoke-direct {v6, v3, v7}, La/wpb;-><init>(La/a8z;B)V

    .line 92
    .line 93
    .line 94
    invoke-static {p0, v4, v5, v6, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    iput-object v0, p0, La/e7e;->U1:La/kiu0;

    .line 99
    .line 100
    new-instance v0, La/s6e;

    .line 101
    .line 102
    const/4 v3, 0x3

    .line 103
    invoke-direct {v0, p0, v3}, La/s6e;-><init>(La/e7e;B)V

    .line 104
    .line 105
    .line 106
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    iput-object v0, p0, La/e7e;->V1:La/a8z;

    .line 111
    .line 112
    new-instance v0, La/s6e;

    .line 113
    .line 114
    const/4 v3, 0x4

    .line 115
    invoke-direct {v0, p0, v3}, La/s6e;-><init>(La/e7e;B)V

    .line 116
    .line 117
    .line 118
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    iput-object v0, p0, La/e7e;->W1:La/a8z;

    .line 123
    .line 124
    new-instance v0, La/s6e;

    .line 125
    .line 126
    const/4 v3, 0x5

    .line 127
    invoke-direct {v0, p0, v3}, La/s6e;-><init>(La/e7e;B)V

    .line 128
    .line 129
    .line 130
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    iput-object v0, p0, La/e7e;->X1:La/a8z;

    .line 135
    .line 136
    new-instance v0, La/s6e;

    .line 137
    .line 138
    const/4 v3, 0x0

    .line 139
    invoke-direct {v0, p0, v3}, La/s6e;-><init>(La/e7e;B)V

    .line 140
    .line 141
    .line 142
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    iput-object v0, p0, La/e7e;->Y1:La/a8z;

    .line 147
    .line 148
    new-instance v0, La/d12;

    .line 149
    .line 150
    invoke-direct {v0, v2}, La/d12;-><init>(B)V

    .line 151
    .line 152
    .line 153
    iput-object v0, p0, La/e7e;->Z1:Ljava/lang/Runnable;

    .line 154
    .line 155
    new-instance v0, La/d12;

    .line 156
    .line 157
    invoke-direct {v0, v2}, La/d12;-><init>(B)V

    .line 158
    .line 159
    .line 160
    iput-object v0, p0, La/e7e;->b2:Ljava/lang/Runnable;

    .line 161
    .line 162
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, La/e7e;->H0()La/kzq;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, v1, La/kzq;->c:Landroid/widget/ImageView;

    .line 8
    .line 9
    iget-object v3, v1, La/kzq;->f:Lcom/google/android/material/textfield/TextInputEditText;

    .line 10
    .line 11
    iget-object v4, v1, La/kzq;->d:Lcom/google/android/material/button/MaterialButton;

    .line 12
    .line 13
    iget-object v5, v1, La/kzq;->z:Landroid/widget/TextView;

    .line 14
    .line 15
    iget-object v6, v1, La/kzq;->o:Landroidx/recyclerview/widget/RecyclerView;

    .line 16
    .line 17
    new-instance v7, La/y6e;

    .line 18
    .line 19
    invoke-direct {v7, v0}, La/y6e;-><init>(La/e7e;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v6, v7}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 23
    .line 24
    .line 25
    const/4 v7, 0x1

    .line 26
    invoke-virtual {v6, v7}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 27
    .line 28
    .line 29
    const/4 v8, 0x0

    .line 30
    invoke-virtual {v6, v8}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(La/ehe0;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, La/e7e;->G0()La/d6e;

    .line 34
    .line 35
    .line 36
    move-result-object v9

    .line 37
    invoke-virtual {v6, v9}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 38
    .line 39
    .line 40
    iget-object v9, v1, La/kzq;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 41
    .line 42
    new-instance v10, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 43
    .line 44
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object v11

    .line 48
    const/4 v12, 0x0

    .line 49
    invoke-direct {v10, v11, v12, v12}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v9, v10}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 53
    .line 54
    .line 55
    iget-object v10, v0, La/e7e;->W1:La/a8z;

    .line 56
    .line 57
    invoke-interface {v10}, La/a8z;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v10

    .line 61
    check-cast v10, La/n14;

    .line 62
    .line 63
    invoke-virtual {v9, v10}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 64
    .line 65
    .line 66
    iget-object v10, v1, La/kzq;->m:Landroid/widget/LinearLayout;

    .line 67
    .line 68
    iget-object v11, v0, La/e7e;->Y1:La/a8z;

    .line 69
    .line 70
    invoke-interface {v11}, La/a8z;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v11

    .line 74
    check-cast v11, Ljava/lang/Number;

    .line 75
    .line 76
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    invoke-static {v10, v11}, La/hxm0;->x(Landroid/view/View;I)V

    .line 81
    .line 82
    .line 83
    new-instance v13, La/qmk0;

    .line 84
    .line 85
    iget-object v10, v0, La/e7e;->X1:La/a8z;

    .line 86
    .line 87
    invoke-interface {v10}, La/a8z;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v10

    .line 91
    check-cast v10, Ljava/lang/Number;

    .line 92
    .line 93
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 94
    .line 95
    .line 96
    move-result v14

    .line 97
    const/16 v21, 0x0

    .line 98
    .line 99
    const/16 v22, 0x1de

    .line 100
    .line 101
    const/4 v15, 0x0

    .line 102
    const/16 v16, 0x0

    .line 103
    .line 104
    const/16 v17, 0x0

    .line 105
    .line 106
    const/16 v18, 0x0

    .line 107
    .line 108
    const/16 v19, 0x0

    .line 109
    .line 110
    const/16 v20, 0x0

    .line 111
    .line 112
    invoke-direct/range {v13 .. v22}, La/qmk0;-><init>(IIIIIILkotlin/jvm/functions/Function1;La/rmk0;I)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v9, v13}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, La/e7e;->G0()La/d6e;

    .line 119
    .line 120
    .line 121
    move-result-object v9

    .line 122
    if-eqz v9, :cond_0

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_0
    move-object v9, v8

    .line 126
    :goto_0
    if-eqz v9, :cond_1

    .line 127
    .line 128
    new-instance v10, La/upm0;

    .line 129
    .line 130
    invoke-direct {v10, v9}, La/upm0;-><init>(La/d6e;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v6, v10}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 134
    .line 135
    .line 136
    :cond_1
    iget-object v9, v1, La/kzq;->x:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 137
    .line 138
    new-instance v10, La/t6e;

    .line 139
    .line 140
    invoke-direct {v10, v0, v12}, La/t6e;-><init>(La/e7e;B)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v9, v10}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 144
    .line 145
    .line 146
    new-instance v9, La/ejd;

    .line 147
    .line 148
    const/16 v10, 0x9

    .line 149
    .line 150
    invoke-direct {v9, v0, v10}, La/ejd;-><init>(Ljava/lang/Object;B)V

    .line 151
    .line 152
    .line 153
    invoke-static {v4, v9}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 154
    .line 155
    .line 156
    new-instance v9, La/jt6;

    .line 157
    .line 158
    invoke-direct {v9, v0, v7}, La/jt6;-><init>(Ljava/lang/Object;B)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v3, v9}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 162
    .line 163
    .line 164
    const-string v9, ""

    .line 165
    .line 166
    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 167
    .line 168
    .line 169
    new-instance v3, La/b7e;

    .line 170
    .line 171
    invoke-direct {v3, v0, v2, v5, v6}, La/b7e;-><init>(La/e7e;Landroid/widget/ImageView;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v6, v3}, Landroidx/recyclerview/widget/RecyclerView;->o(La/lhe0;)V

    .line 175
    .line 176
    .line 177
    iput-object v3, v0, La/e7e;->c2:La/b7e;

    .line 178
    .line 179
    iget-object v3, v1, La/kzq;->j:Landroid/widget/ImageView;

    .line 180
    .line 181
    new-instance v5, La/wg;

    .line 182
    .line 183
    invoke-direct {v5, v0, v1, v10}, La/wg;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v3, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 187
    .line 188
    .line 189
    new-instance v3, La/t6e;

    .line 190
    .line 191
    invoke-direct {v3, v0, v7}, La/t6e;-><init>(La/e7e;B)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 195
    .line 196
    .line 197
    iget-object v2, v1, La/kzq;->l:La/jk3;

    .line 198
    .line 199
    iget-object v2, v2, La/jk3;->c:Landroid/view/View;

    .line 200
    .line 201
    check-cast v2, Landroid/widget/ImageView;

    .line 202
    .line 203
    new-instance v3, La/t6e;

    .line 204
    .line 205
    const/4 v5, 0x2

    .line 206
    invoke-direct {v3, v0, v5}, La/t6e;-><init>(La/e7e;B)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 210
    .line 211
    .line 212
    iget-object v2, v1, La/kzq;->i:Landroid/widget/ImageView;

    .line 213
    .line 214
    new-instance v3, La/t6e;

    .line 215
    .line 216
    const/4 v6, 0x3

    .line 217
    invoke-direct {v3, v0, v6}, La/t6e;-><init>(La/e7e;B)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 221
    .line 222
    .line 223
    iget-object v2, v1, La/kzq;->y:Landroid/widget/TextView;

    .line 224
    .line 225
    new-instance v3, La/t6e;

    .line 226
    .line 227
    const/4 v6, 0x4

    .line 228
    invoke-direct {v3, v0, v6}, La/t6e;-><init>(La/e7e;B)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 232
    .line 233
    .line 234
    invoke-static {v4, v12}, La/knm0;->h(Landroid/view/View;Z)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0}, La/e7e;->H0()La/kzq;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    iget-object v2, v2, La/kzq;->x:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 242
    .line 243
    invoke-virtual {v2}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    const v3, 0x7f0a0a7b

    .line 248
    .line 249
    .line 250
    invoke-interface {v2, v3}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    sget-object v3, La/j5d;->a:Landroid/util/TypedValue;

    .line 255
    .line 256
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    const v4, 0x7f040b0b

    .line 261
    .line 262
    .line 263
    invoke-static {v3, v4, v4}, La/j5d;->d(Landroid/content/Context;II)Landroid/content/res/ColorStateList;

    .line 264
    .line 265
    .line 266
    move-result-object v3

    .line 267
    instance-of v4, v2, La/ojn0;

    .line 268
    .line 269
    if-eqz v4, :cond_2

    .line 270
    .line 271
    check-cast v2, La/ojn0;

    .line 272
    .line 273
    invoke-interface {v2, v3}, La/ojn0;->setIconTintList(Landroid/content/res/ColorStateList;)Landroid/view/MenuItem;

    .line 274
    .line 275
    .line 276
    goto :goto_1

    .line 277
    :cond_2
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 278
    .line 279
    const/16 v6, 0x1a

    .line 280
    .line 281
    if-lt v4, v6, :cond_3

    .line 282
    .line 283
    invoke-static {v2, v3}, La/ga3;->z(Landroid/view/MenuItem;Landroid/content/res/ColorStateList;)V

    .line 284
    .line 285
    .line 286
    :cond_3
    :goto_1
    iget-object v1, v1, La/kzq;->t:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 287
    .line 288
    invoke-static {v1, v0, v8}, La/uvw;->R(Landroid/view/View;Landroidx/fragment/app/Fragment;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    new-instance v3, La/w6e;

    .line 300
    .line 301
    invoke-direct {v3, v0, v12}, La/w6e;-><init>(La/e7e;B)V

    .line 302
    .line 303
    .line 304
    const-string v4, "SEND_RATING_REQUEST_KEY"

    .line 305
    .line 306
    invoke-virtual {v1, v4, v2, v3}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    new-instance v3, La/w6e;

    .line 318
    .line 319
    invoke-direct {v3, v0, v7}, La/w6e;-><init>(La/e7e;B)V

    .line 320
    .line 321
    .line 322
    const-string v4, "FILE_DIALOG_RESULT_REQUEST_KEY"

    .line 323
    .line 324
    invoke-virtual {v1, v4, v2, v3}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    new-instance v3, La/w6e;

    .line 336
    .line 337
    invoke-direct {v3, v0, v5}, La/w6e;-><init>(La/e7e;B)V

    .line 338
    .line 339
    .line 340
    const-string v0, "ERROR_DIALOG_RESULT_KEY"

    .line 341
    .line 342
    invoke-virtual {v1, v0, v2, v3}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 343
    .line 344
    .line 345
    return-void
.end method

.method public final C0()V
    .locals 4

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
    const-class v1, La/f7e;

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
    instance-of v3, v0, La/f7e;

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
    check-cast v2, La/f7e;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v2, v0}, La/f7e;->a(La/i1w0;)La/f6i;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iget-object v1, v0, La/f6i;->e:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, La/ii;

    .line 66
    .line 67
    iput-object v1, p0, La/e7e;->M1:La/ii;

    .line 68
    .line 69
    iget-object v1, v0, La/f6i;->f:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, La/wdk0;

    .line 72
    .line 73
    iput-object v1, p0, La/e7e;->N1:La/wdk0;

    .line 74
    .line 75
    iget-object v0, v0, La/f6i;->d:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v0, La/n5d0;

    .line 78
    .line 79
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    check-cast v0, La/ddi;

    .line 84
    .line 85
    iput-object v0, p0, La/e7e;->P1:La/ddi;

    .line 86
    .line 87
    return-void

    .line 88
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 89
    .line 90
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public final D0()V
    .locals 19

    .line 1
    invoke-virtual/range {p0 .. p0}, La/e7e;->J0()La/fae;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v2, v0, La/fae;->J:La/p7m0;

    .line 6
    .line 7
    new-instance v3, La/d7e;

    .line 8
    .line 9
    const/4 v9, 0x4

    .line 10
    const/4 v10, 0x1

    .line 11
    const/4 v4, 0x2

    .line 12
    const-class v14, La/e7e;

    .line 13
    .line 14
    const-string v7, "onConsultantMessagesUiState"

    .line 15
    .line 16
    const-string v8, "onConsultantMessagesUiState(Lorg/xplatform/consultantchat/presentation/consultantchat/ConsultantChatViewModel$ConsultantMessagesUiState;)V"

    .line 17
    .line 18
    move-object/from16 v5, p0

    .line 19
    .line 20
    move-object v6, v14

    .line 21
    invoke-direct/range {v3 .. v10}, La/d7e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 22
    .line 23
    .line 24
    sget-object v0, La/lkz;->a:La/lkz;

    .line 25
    .line 26
    move-object v4, v3

    .line 27
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v1, La/cxd;

    .line 40
    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v11, 0x0

    .line 43
    move-object v5, v11

    .line 44
    invoke-direct/range {v1 .. v6}, La/cxd;-><init>(La/gmq;La/clz;La/d7e;La/yje;B)V

    .line 45
    .line 46
    .line 47
    const/4 v2, 0x3

    .line 48
    invoke-static {v0, v5, v5, v1, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 49
    .line 50
    .line 51
    invoke-virtual/range {p0 .. p0}, La/e7e;->J0()La/fae;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget-object v1, v0, La/fae;->K:La/ol60;

    .line 56
    .line 57
    new-instance v3, La/wib;

    .line 58
    .line 59
    const/16 v4, 0xa

    .line 60
    .line 61
    invoke-direct {v3, v0, v5, v4}, La/wib;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 62
    .line 63
    .line 64
    new-instance v4, La/fnq;

    .line 65
    .line 66
    invoke-direct {v4, v1, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V

    .line 67
    .line 68
    .line 69
    new-instance v1, La/x9e;

    .line 70
    .line 71
    const/4 v3, 0x0

    .line 72
    invoke-direct {v1, v0, v5, v3}, La/x9e;-><init>(La/fae;La/yje;B)V

    .line 73
    .line 74
    .line 75
    new-instance v0, La/dnq;

    .line 76
    .line 77
    invoke-direct {v0, v4, v1, v3}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 78
    .line 79
    .line 80
    new-instance v11, La/d7e;

    .line 81
    .line 82
    const/16 v17, 0x4

    .line 83
    .line 84
    const/16 v18, 0x2

    .line 85
    .line 86
    const/4 v12, 0x2

    .line 87
    const-string v15, "onConsultantChatScrollAction"

    .line 88
    .line 89
    const-string v16, "onConsultantChatScrollAction(Lorg/xplatform/consultantchat/presentation/consultantchat/ConsultantChatViewModel$ConsultantChatScrollAction;)V"

    .line 90
    .line 91
    move-object/from16 v13, p0

    .line 92
    .line 93
    invoke-direct/range {v11 .. v18}, La/d7e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 94
    .line 95
    .line 96
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    new-instance v4, La/cxd;

    .line 109
    .line 110
    invoke-direct {v4, v0, v1, v11, v5}, La/cxd;-><init>(La/dnq;La/clz;La/d7e;La/yje;)V

    .line 111
    .line 112
    .line 113
    invoke-static {v3, v5, v5, v4, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {p0 .. p0}, La/e7e;->J0()La/fae;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    iget-object v8, v0, La/fae;->F:La/p7m0;

    .line 121
    .line 122
    new-instance v10, La/d7e;

    .line 123
    .line 124
    const/16 v18, 0x3

    .line 125
    .line 126
    const-string v15, "onParticipantAction"

    .line 127
    .line 128
    const-string v16, "onParticipantAction(Lorg/xplatform/consultantchat/presentation/consultantchat/ConsultantChatViewModel$ParticipantActionsState;)V"

    .line 129
    .line 130
    move-object v11, v10

    .line 131
    invoke-direct/range {v11 .. v18}, La/d7e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 132
    .line 133
    .line 134
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 135
    .line 136
    .line 137
    move-result-object v9

    .line 138
    invoke-interface {v9}, La/clz;->x()La/glz;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    new-instance v7, La/cxd;

    .line 147
    .line 148
    const/4 v12, 0x0

    .line 149
    move-object v11, v5

    .line 150
    invoke-direct/range {v7 .. v12}, La/cxd;-><init>(La/gmq;La/clz;La/d7e;La/yje;C)V

    .line 151
    .line 152
    .line 153
    invoke-static {v0, v5, v5, v7, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {p0 .. p0}, La/e7e;->J0()La/fae;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    iget-object v8, v0, La/fae;->H:La/p7m0;

    .line 161
    .line 162
    new-instance v10, La/d7e;

    .line 163
    .line 164
    const/16 v18, 0x4

    .line 165
    .line 166
    const/4 v12, 0x2

    .line 167
    const-string v15, "onChangeAllowInvokeOperatorState"

    .line 168
    .line 169
    const-string v16, "onChangeAllowInvokeOperatorState(Z)V"

    .line 170
    .line 171
    move-object v11, v10

    .line 172
    invoke-direct/range {v11 .. v18}, La/d7e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 173
    .line 174
    .line 175
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 176
    .line 177
    .line 178
    move-result-object v9

    .line 179
    invoke-interface {v9}, La/clz;->x()La/glz;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    new-instance v7, La/cxd;

    .line 188
    .line 189
    const/4 v12, 0x0

    .line 190
    move-object v11, v5

    .line 191
    invoke-direct/range {v7 .. v12}, La/cxd;-><init>(La/gmq;La/clz;La/d7e;La/yje;I)V

    .line 192
    .line 193
    .line 194
    invoke-static {v0, v5, v5, v7, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {p0 .. p0}, La/e7e;->J0()La/fae;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    iget-object v8, v0, La/fae;->G:La/p7m0;

    .line 202
    .line 203
    new-instance v10, La/d7e;

    .line 204
    .line 205
    const/16 v18, 0x5

    .line 206
    .line 207
    const/4 v12, 0x2

    .line 208
    const-string v15, "onChangeUnreadMessagesCount"

    .line 209
    .line 210
    const-string v16, "onChangeUnreadMessagesCount(I)V"

    .line 211
    .line 212
    move-object v11, v10

    .line 213
    invoke-direct/range {v11 .. v18}, La/d7e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 214
    .line 215
    .line 216
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 217
    .line 218
    .line 219
    move-result-object v9

    .line 220
    invoke-interface {v9}, La/clz;->x()La/glz;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    new-instance v7, La/cxd;

    .line 229
    .line 230
    const/4 v12, 0x0

    .line 231
    move-object v11, v5

    .line 232
    invoke-direct/range {v7 .. v12}, La/cxd;-><init>(La/gmq;La/clz;La/d7e;La/yje;S)V

    .line 233
    .line 234
    .line 235
    invoke-static {v0, v5, v5, v7, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {p0 .. p0}, La/e7e;->J0()La/fae;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    iget-object v8, v0, La/fae;->B:La/ol60;

    .line 243
    .line 244
    new-instance v10, La/d7e;

    .line 245
    .line 246
    const/16 v18, 0x6

    .line 247
    .line 248
    const/4 v12, 0x2

    .line 249
    const-string v15, "handleEvent"

    .line 250
    .line 251
    const-string v16, "handleEvent(Lorg/xplatform/consultantchat/presentation/consultantchat/model/ConsultantChatEvent;)V"

    .line 252
    .line 253
    move-object v11, v10

    .line 254
    invoke-direct/range {v11 .. v18}, La/d7e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 255
    .line 256
    .line 257
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 258
    .line 259
    .line 260
    move-result-object v9

    .line 261
    invoke-interface {v9}, La/clz;->x()La/glz;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    new-instance v7, La/cxd;

    .line 270
    .line 271
    const/4 v12, 0x0

    .line 272
    const/4 v13, 0x0

    .line 273
    move-object v11, v5

    .line 274
    invoke-direct/range {v7 .. v13}, La/cxd;-><init>(La/gmq;La/clz;La/d7e;La/yje;BZ)V

    .line 275
    .line 276
    .line 277
    invoke-static {v0, v5, v5, v7, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {p0 .. p0}, La/e7e;->J0()La/fae;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    iget-object v8, v0, La/fae;->I:La/p7m0;

    .line 285
    .line 286
    new-instance v10, La/d7e;

    .line 287
    .line 288
    const/16 v18, 0x7

    .line 289
    .line 290
    const/4 v12, 0x2

    .line 291
    const-string v15, "handleAttachedFileState"

    .line 292
    .line 293
    const-string v16, "handleAttachedFileState(Lorg/xplatform/consultantchat/presentation/consultantchat/ConsultantChatViewModel$AttachedDocumentsUIState;)V"

    .line 294
    .line 295
    move-object/from16 v13, p0

    .line 296
    .line 297
    move-object v11, v10

    .line 298
    invoke-direct/range {v11 .. v18}, La/d7e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 299
    .line 300
    .line 301
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 302
    .line 303
    .line 304
    move-result-object v9

    .line 305
    invoke-interface {v9}, La/clz;->x()La/glz;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    new-instance v7, La/cxd;

    .line 314
    .line 315
    const/4 v12, 0x0

    .line 316
    move v13, v12

    .line 317
    move-object v11, v5

    .line 318
    invoke-direct/range {v7 .. v13}, La/cxd;-><init>(La/gmq;La/clz;La/d7e;La/yje;BB)V

    .line 319
    .line 320
    .line 321
    invoke-static {v0, v5, v5, v7, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {p0 .. p0}, La/e7e;->J0()La/fae;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    iget-object v8, v0, La/fae;->D:La/p7m0;

    .line 329
    .line 330
    new-instance v10, La/d7e;

    .line 331
    .line 332
    const/16 v18, 0x8

    .line 333
    .line 334
    const/4 v12, 0x2

    .line 335
    const-string v15, "handleEnableSendButtonState"

    .line 336
    .line 337
    const-string v16, "handleEnableSendButtonState(Lorg/xplatform/consultantchat/presentation/consultantchat/model/ChatBlockUiModel;)V"

    .line 338
    .line 339
    move-object/from16 v13, p0

    .line 340
    .line 341
    move-object v11, v10

    .line 342
    invoke-direct/range {v11 .. v18}, La/d7e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 343
    .line 344
    .line 345
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 346
    .line 347
    .line 348
    move-result-object v9

    .line 349
    invoke-interface {v9}, La/clz;->x()La/glz;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    new-instance v7, La/cxd;

    .line 358
    .line 359
    const/4 v12, 0x0

    .line 360
    const/4 v13, 0x0

    .line 361
    move-object v11, v5

    .line 362
    invoke-direct/range {v7 .. v13}, La/cxd;-><init>(La/gmq;La/clz;La/d7e;La/yje;BC)V

    .line 363
    .line 364
    .line 365
    invoke-static {v0, v5, v5, v7, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {p0 .. p0}, La/e7e;->J0()La/fae;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    iget-object v0, v0, La/fae;->r:La/qv;

    .line 373
    .line 374
    iget-object v0, v0, La/qv;->a:La/g45;

    .line 375
    .line 376
    iget-object v0, v0, La/g45;->c:Ljava/lang/Object;

    .line 377
    .line 378
    check-cast v0, La/i7e;

    .line 379
    .line 380
    iget-object v8, v0, La/i7e;->h:La/p7m0;

    .line 381
    .line 382
    new-instance v10, La/d7e;

    .line 383
    .line 384
    const/16 v18, 0x9

    .line 385
    .line 386
    const/4 v12, 0x2

    .line 387
    const-string v15, "handleMuteState"

    .line 388
    .line 389
    const-string v16, "handleMuteState(Z)V"

    .line 390
    .line 391
    move-object/from16 v13, p0

    .line 392
    .line 393
    move-object v11, v10

    .line 394
    invoke-direct/range {v11 .. v18}, La/d7e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 395
    .line 396
    .line 397
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 398
    .line 399
    .line 400
    move-result-object v9

    .line 401
    invoke-interface {v9}, La/clz;->x()La/glz;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    new-instance v7, La/cxd;

    .line 410
    .line 411
    const/4 v12, 0x0

    .line 412
    const/4 v13, 0x0

    .line 413
    move-object v11, v5

    .line 414
    invoke-direct/range {v7 .. v13}, La/cxd;-><init>(La/gmq;La/clz;La/d7e;La/yje;BI)V

    .line 415
    .line 416
    .line 417
    invoke-static {v0, v5, v5, v7, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {p0 .. p0}, La/e7e;->J0()La/fae;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    iget-object v0, v0, La/fae;->M:La/p7m0;

    .line 425
    .line 426
    new-instance v11, La/c48;

    .line 427
    .line 428
    const/16 v18, 0x1d

    .line 429
    .line 430
    const/4 v12, 0x2

    .line 431
    const-string v15, "handleCountDown"

    .line 432
    .line 433
    const-string v16, "handleCountDown(Lorg/xplatform/consultantchat/presentation/consultantchat/ConsultantChatViewModel$CountDownState;)V"

    .line 434
    .line 435
    move-object/from16 v13, p0

    .line 436
    .line 437
    invoke-direct/range {v11 .. v18}, La/c48;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 438
    .line 439
    .line 440
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 445
    .line 446
    .line 447
    move-result-object v3

    .line 448
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 449
    .line 450
    .line 451
    move-result-object v3

    .line 452
    new-instance v4, La/cxd;

    .line 453
    .line 454
    invoke-direct {v4, v0, v1, v11, v5}, La/cxd;-><init>(La/gmq;La/clz;La/c48;La/yje;)V

    .line 455
    .line 456
    .line 457
    invoke-static {v3, v5, v5, v4, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 458
    .line 459
    .line 460
    invoke-virtual/range {p0 .. p0}, La/e7e;->J0()La/fae;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    iget-object v0, v0, La/fae;->t:La/opt;

    .line 465
    .line 466
    iget-object v0, v0, La/opt;->a:La/g45;

    .line 467
    .line 468
    iget-object v0, v0, La/g45;->c:Ljava/lang/Object;

    .line 469
    .line 470
    check-cast v0, La/i7e;

    .line 471
    .line 472
    iget-object v0, v0, La/i7e;->l:La/qoj0;

    .line 473
    .line 474
    sget-object v1, La/lkz;->a:La/lkz;

    .line 475
    .line 476
    new-instance v11, La/d7e;

    .line 477
    .line 478
    const/16 v18, 0x0

    .line 479
    .line 480
    const-string v15, "handleCheckFileResult"

    .line 481
    .line 482
    const-string v16, "handleCheckFileResult(Lorg/xplatform/consultantchat/domain/models/CheckFileResultModel;)V"

    .line 483
    .line 484
    invoke-direct/range {v11 .. v18}, La/d7e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 485
    .line 486
    .line 487
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 488
    .line 489
    .line 490
    move-result-object v1

    .line 491
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 492
    .line 493
    .line 494
    move-result-object v3

    .line 495
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 496
    .line 497
    .line 498
    move-result-object v3

    .line 499
    new-instance v4, La/cxd;

    .line 500
    .line 501
    invoke-direct {v4, v0, v1, v11, v5}, La/cxd;-><init>(La/gmq;La/clz;La/d7e;La/yje;)V

    .line 502
    .line 503
    .line 504
    invoke-static {v3, v5, v5, v4, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 505
    .line 506
    .line 507
    return-void
.end method

.method public final G0()La/d6e;
    .locals 0

    .line 1
    iget-object p0, p0, La/e7e;->V1:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/d6e;

    .line 8
    .line 9
    return-object p0
.end method

.method public final H0()La/kzq;
    .locals 2

    .line 1
    sget-object v0, La/e7e;->e2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/e7e;->O1:La/s0r;

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
    check-cast p0, La/kzq;

    .line 16
    .line 17
    return-object p0
.end method

.method public final I0()I
    .locals 2

    .line 1
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/e7e;->H0()La/kzq;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, La/kzq;->o:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/b;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    check-cast p0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->h1()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 29
    .line 30
    new-instance v0, La/g0g0;

    .line 31
    .line 32
    invoke-direct {v0, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    move-object p0, v0

    .line 36
    :goto_0
    const/4 v0, 0x0

    .line 37
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    instance-of v1, p0, La/g0g0;

    .line 42
    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    move-object p0, v0

    .line 46
    :cond_0
    check-cast p0, Ljava/lang/Number;

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    return p0
.end method

.method public final J0()La/fae;
    .locals 0

    .line 1
    iget-object p0, p0, La/e7e;->U1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/fae;

    .line 8
    .line 9
    return-object p0
.end method

.method public final Z()V
    .locals 2

    .line 1
    iget-object v0, p0, La/e7e;->Q1:La/ndk0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, La/ndk0;->dismiss()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, La/e7e;->c2:La/b7e;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, La/e7e;->H0()La/kzq;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object v1, v1, La/kzq;->o:Landroidx/recyclerview/widget/RecyclerView;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->u0(La/lhe0;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    iget-object v0, p0, La/e7e;->b2:Ljava/lang/Runnable;

    .line 22
    .line 23
    iget-object v1, p0, La/e7e;->S1:Landroid/os/Handler;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, La/e7e;->Z1:Ljava/lang/Runnable;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 31
    .line 32
    .line 33
    invoke-super {p0}, La/yx5;->Z()V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final d0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const/4 v2, 0x0

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    const-string v3, "input_method"

    .line 25
    .line 26
    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v1, v2

    .line 32
    :goto_0
    instance-of v3, v1, Landroid/view/inputmethod/InputMethodManager;

    .line 33
    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    move-object v2, v1

    .line 37
    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    .line 38
    .line 39
    :cond_1
    if-eqz v2, :cond_2

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    invoke-virtual {v2, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 43
    .line 44
    .line 45
    :cond_2
    invoke-virtual {p0}, La/e7e;->H0()La/kzq;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-object v0, v0, La/kzq;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 50
    .line 51
    invoke-static {v0}, La/hxm0;->m(Landroid/view/View;)V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 56
    .line 57
    return-void
.end method

.method public final e0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/e7e;->H0()La/kzq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/kzq;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

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
    .locals 6

    .line 1
    invoke-super {p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/e7e;->J0()La/fae;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object v0, p0, La/fae;->T:La/c4m0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, La/pby;->isActive()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, p0, La/fae;->e:La/gz70;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    sget-object v2, La/gz70;->F:La/hy70;

    .line 26
    .line 27
    instance-of v3, v2, La/fy70;

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    sget-object v2, La/oom0;->b:La/oom0;

    .line 33
    .line 34
    invoke-static {v2}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    new-instance v3, La/gy70;

    .line 39
    .line 40
    invoke-direct {v3, v2}, La/gy70;-><init>(La/p7m0;)V

    .line 41
    .line 42
    .line 43
    sput-object v3, La/gz70;->F:La/hy70;

    .line 44
    .line 45
    new-instance v3, La/z210;

    .line 46
    .line 47
    const/16 v5, 0x15

    .line 48
    .line 49
    invoke-direct {v3, v0, v4, v5}, La/z210;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 50
    .line 51
    .line 52
    new-instance v5, La/fnq;

    .line 53
    .line 54
    invoke-direct {v5, v2, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V

    .line 55
    .line 56
    .line 57
    new-instance v2, La/gbv;

    .line 58
    .line 59
    const/16 v3, 0xd

    .line 60
    .line 61
    invoke-direct {v2, v0, v4, v3}, La/gbv;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 62
    .line 63
    .line 64
    new-instance v0, La/dnq;

    .line 65
    .line 66
    const/4 v3, 0x0

    .line 67
    invoke-direct {v0, v5, v2, v3}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    instance-of v0, v2, La/gy70;

    .line 72
    .line 73
    if-eqz v0, :cond_2

    .line 74
    .line 75
    check-cast v2, La/gy70;

    .line 76
    .line 77
    iget-object v0, v2, La/gy70;->a:La/p7m0;

    .line 78
    .line 79
    :goto_0
    new-instance v2, La/aae;

    .line 80
    .line 81
    const/16 v3, 0x9

    .line 82
    .line 83
    invoke-direct {v2, p0, v4, v3}, La/aae;-><init>(La/fae;La/yje;B)V

    .line 84
    .line 85
    .line 86
    new-instance v3, La/fnq;

    .line 87
    .line 88
    const/4 v5, 0x4

    .line 89
    invoke-direct {v3, v0, v2, v5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 90
    .line 91
    .line 92
    new-instance v0, La/bae;

    .line 93
    .line 94
    const/4 v2, 0x3

    .line 95
    invoke-direct {v0, p0, v4, v2}, La/bae;-><init>(La/fae;La/yje;B)V

    .line 96
    .line 97
    .line 98
    new-instance v2, La/dnq;

    .line 99
    .line 100
    invoke-direct {v2, v3, v0, v1}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 101
    .line 102
    .line 103
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iget-object v1, p0, La/fae;->k:La/mne;

    .line 108
    .line 109
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 110
    .line 111
    invoke-static {v0, v1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-static {v2, v0}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    iput-object v0, p0, La/fae;->T:La/c4m0;

    .line 120
    .line 121
    return-void

    .line 122
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 123
    .line 124
    .line 125
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
    invoke-virtual {p0}, La/e7e;->J0()La/fae;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/fae;->T:La/c4m0;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0, v0}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/e7e;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/e7e;->L1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
