.class public final La/mh70;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/mh70;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/jh70",
        "core"
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
.field public static final Q1:La/jh70;

.field public static final synthetic R1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public L1:La/o6i;

.field public final M1:La/kiu0;

.field public final N1:La/s0r;

.field public O1:La/iha;

.field public P1:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/mh70;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/core/databinding/FragmentGamesBetBinding;"

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
    sput-object v1, La/mh70;->R1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/jh70;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/mh70;->Q1:La/jh70;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d0241

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/i9o0;->a:La/i9o0;

    .line 8
    .line 9
    iput-object v0, p0, La/mh70;->K1:La/i9o0;

    .line 10
    .line 11
    new-instance v0, La/hh70;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p0, v1}, La/hh70;-><init>(La/mh70;B)V

    .line 15
    .line 16
    .line 17
    new-instance v1, La/gg70;

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    invoke-direct {v1, p0, v2}, La/gg70;-><init>(Ljava/lang/Object;B)V

    .line 21
    .line 22
    .line 23
    sget-object v2, La/wez;->b:La/wez;

    .line 24
    .line 25
    new-instance v3, La/gg70;

    .line 26
    .line 27
    const/4 v4, 0x3

    .line 28
    invoke-direct {v3, v1, v4}, La/gg70;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const-class v2, La/ji70;

    .line 36
    .line 37
    sget-object v3, La/sre0;->a:La/tre0;

    .line 38
    .line 39
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    new-instance v3, La/co60;

    .line 44
    .line 45
    const/16 v4, 0x1c

    .line 46
    .line 47
    invoke-direct {v3, v1, v4}, La/co60;-><init>(La/a8z;B)V

    .line 48
    .line 49
    .line 50
    new-instance v4, La/co60;

    .line 51
    .line 52
    const/16 v5, 0x1d

    .line 53
    .line 54
    invoke-direct {v4, v1, v5}, La/co60;-><init>(La/a8z;B)V

    .line 55
    .line 56
    .line 57
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iput-object v0, p0, La/mh70;->M1:La/kiu0;

    .line 62
    .line 63
    sget-object v0, La/kh70;->a:La/kh70;

    .line 64
    .line 65
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iput-object v0, p0, La/mh70;->N1:La/s0r;

    .line 70
    .line 71
    const/4 v0, 0x1

    .line 72
    iput-boolean v0, p0, La/mh70;->P1:Z

    .line 73
    .line 74
    return-void
.end method

.method public static G0(La/mh70;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, La/mh70;->P1:Z

    .line 3
    .line 4
    invoke-static {p0}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/mh70;->H0()La/h0r;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v0, v0, La/h0r;->i:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/mh70;->H0()La/h0r;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    iget-object p0, p0, La/h0r;->f:Lorg/xplatform/core/presentation/views/OneXGamesInputEditText;

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->clearFocus()V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 1

    .line 1
    invoke-static {p0}, La/sac;->O(Landroidx/fragment/app/Fragment;)La/h5t;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p0}, La/h5t;->c(La/mh70;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final H0()La/h0r;
    .locals 2

    .line 1
    sget-object v0, La/mh70;->R1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/mh70;->N1:La/s0r;

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
    check-cast p0, La/h0r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final I0()La/ji70;
    .locals 0

    .line 1
    iget-object p0, p0, La/mh70;->M1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/ji70;

    .line 8
    .line 9
    return-object p0
.end method

.method public final Z()V
    .locals 3

    .line 1
    iget-object v0, p0, La/mh70;->O1:La/iha;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, v0, La/iha;->c:Landroid/view/KeyEvent$Callback;

    .line 6
    .line 7
    check-cast v1, La/kxq;

    .line 8
    .line 9
    const v2, 0x1020002

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-object v0, v0, La/iha;->f:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, La/qly;

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-super {p0}, La/yx5;->Z()V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final d0()V
    .locals 1

    .line 1
    invoke-static {p0}, La/mh70;->G0(La/mh70;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 6
    .line 7
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/yx5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/mh70;->H0()La/h0r;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p1, p1, La/h0r;->f:Lorg/xplatform/core/presentation/views/OneXGamesInputEditText;

    .line 12
    .line 13
    invoke-virtual {p0}, La/mh70;->H0()La/h0r;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    iget-object p2, p2, La/h0r;->i:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 18
    .line 19
    new-instance v0, La/ck60;

    .line 20
    .line 21
    const/4 v1, 0x6

    .line 22
    invoke-direct {v0, p0, p1, p2, v1}, La/ck60;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 26
    .line 27
    const/16 v1, 0x1e

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    if-lt p1, v1, :cond_0

    .line 31
    .line 32
    new-instance p1, La/yox;

    .line 33
    .line 34
    invoke-direct {p1, v0}, La/yox;-><init>(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    sget-object v0, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 38
    .line 39
    invoke-static {p2, p1}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    const p2, 0x1020002

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, p2}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    new-instance p2, La/oh60;

    .line 60
    .line 61
    invoke-direct {p2, p0, v0, v2}, La/oh60;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 65
    .line 66
    .line 67
    :cond_1
    :goto_0
    invoke-virtual {p0}, La/mh70;->H0()La/h0r;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iget-object p1, p1, La/h0r;->b:Landroid/widget/TextView;

    .line 72
    .line 73
    invoke-virtual {p0}, La/mh70;->H0()La/h0r;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    iget-object p2, p2, La/h0r;->f:Lorg/xplatform/core/presentation/views/OneXGamesInputEditText;

    .line 78
    .line 79
    new-instance v0, La/tjj;

    .line 80
    .line 81
    const/16 v1, 0xd

    .line 82
    .line 83
    invoke-direct {v0, v1, v2}, La/tjj;-><init>(II)V

    .line 84
    .line 85
    .line 86
    const/4 v1, 0x1

    .line 87
    new-array v3, v1, [Landroid/text/InputFilter;

    .line 88
    .line 89
    const/4 v4, 0x0

    .line 90
    aput-object v0, v3, v4

    .line 91
    .line 92
    invoke-virtual {p2, v3}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    .line 93
    .line 94
    .line 95
    new-instance v0, La/yf70;

    .line 96
    .line 97
    invoke-direct {v0, p0, p1, v1}, La/yf70;-><init>(La/yx5;Landroid/widget/TextView;B)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 101
    .line 102
    .line 103
    new-instance p1, La/hh70;

    .line 104
    .line 105
    invoke-direct {p1, p0, v1}, La/hh70;-><init>(La/mh70;B)V

    .line 106
    .line 107
    .line 108
    invoke-static {p2, p1}, La/hxm0;->y(Landroid/widget/EditText;Lkotlin/jvm/functions/Function0;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, La/mh70;->H0()La/h0r;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    iget-object p1, p1, La/h0r;->g:Lcom/google/android/material/textfield/TextInputLayout;

    .line 116
    .line 117
    new-instance p2, La/l910;

    .line 118
    .line 119
    const/16 v0, 0x9

    .line 120
    .line 121
    invoke-direct {p2, p0, v0}, La/l910;-><init>(Ljava/lang/Object;B)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, La/mh70;->H0()La/h0r;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    iget-object p1, p1, La/h0r;->p:Landroidx/appcompat/widget/AppCompatButton;

    .line 132
    .line 133
    sget-object p2, La/ymx;->b:La/ymx;

    .line 134
    .line 135
    new-instance v0, La/ih70;

    .line 136
    .line 137
    invoke-direct {v0, p0, v1}, La/ih70;-><init>(La/mh70;B)V

    .line 138
    .line 139
    .line 140
    invoke-static {p1, p2, v0}, La/dyb;->N(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0}, La/mh70;->H0()La/h0r;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    iget-object p1, p1, La/h0r;->n:Landroidx/appcompat/widget/AppCompatButton;

    .line 148
    .line 149
    new-instance v0, La/ih70;

    .line 150
    .line 151
    invoke-direct {v0, p0, v2}, La/ih70;-><init>(La/mh70;B)V

    .line 152
    .line 153
    .line 154
    invoke-static {p1, p2, v0}, La/dyb;->N(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0}, La/mh70;->H0()La/h0r;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    iget-object p1, p1, La/h0r;->s:Landroidx/appcompat/widget/AppCompatButton;

    .line 162
    .line 163
    new-instance v0, La/ih70;

    .line 164
    .line 165
    const/4 v1, 0x3

    .line 166
    invoke-direct {v0, p0, v1}, La/ih70;-><init>(La/mh70;B)V

    .line 167
    .line 168
    .line 169
    invoke-static {p1, p2, v0}, La/dyb;->N(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0}, La/mh70;->H0()La/h0r;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    iget-object p1, p1, La/h0r;->j:Landroidx/appcompat/widget/AppCompatButton;

    .line 177
    .line 178
    new-instance v0, La/ih70;

    .line 179
    .line 180
    const/4 v2, 0x4

    .line 181
    invoke-direct {v0, p0, v2}, La/ih70;-><init>(La/mh70;B)V

    .line 182
    .line 183
    .line 184
    invoke-static {p1, p2, v0}, La/dyb;->N(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 185
    .line 186
    .line 187
    new-instance p1, La/vf70;

    .line 188
    .line 189
    invoke-direct {p1}, La/vf70;-><init>()V

    .line 190
    .line 191
    .line 192
    const-class p2, La/vf70;

    .line 193
    .line 194
    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p2

    .line 198
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-virtual {v0, p2}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    if-eqz v0, :cond_2

    .line 207
    .line 208
    goto :goto_1

    .line 209
    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    new-instance v2, La/zb5;

    .line 217
    .line 218
    invoke-direct {v2, v0}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 219
    .line 220
    .line 221
    const v0, 0x7f0a05cd

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2, v0, p1, p2}, La/zb5;->o(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v2}, La/zb5;->f()V

    .line 228
    .line 229
    .line 230
    :goto_1
    invoke-virtual {p0}, La/mh70;->I0()La/ji70;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    iget-object v3, p1, La/ji70;->w:La/p7m0;

    .line 235
    .line 236
    new-instance v5, La/nf60;

    .line 237
    .line 238
    const/16 p1, 0x13

    .line 239
    .line 240
    const/4 v6, 0x0

    .line 241
    invoke-direct {v5, p0, v6, p1}, La/nf60;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 242
    .line 243
    .line 244
    sget-object p1, La/lkz;->a:La/lkz;

    .line 245
    .line 246
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 251
    .line 252
    .line 253
    move-result-object p0

    .line 254
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    new-instance v2, La/az60;

    .line 259
    .line 260
    const/4 v7, 0x0

    .line 261
    invoke-direct/range {v2 .. v7}, La/az60;-><init>(La/gmq;La/clz;La/nf60;La/yje;B)V

    .line 262
    .line 263
    .line 264
    invoke-static {p0, v6, v6, v2, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 265
    .line 266
    .line 267
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/mh70;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
