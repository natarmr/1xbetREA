.class public La/dg70;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/dg70;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/xuz",
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
.field public static final Q1:La/xuz;

.field public static final synthetic R1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public L1:La/w6i;

.field public final M1:La/s0r;

.field public final N1:La/kiu0;

.field public O1:La/iha;

.field public P1:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/dg70;

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
    sput-object v1, La/dg70;->R1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/xuz;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/dg70;->Q1:La/xuz;

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
    iput-object v0, p0, La/dg70;->K1:La/i9o0;

    .line 10
    .line 11
    sget-object v0, La/bg70;->a:La/bg70;

    .line 12
    .line 13
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, La/dg70;->M1:La/s0r;

    .line 18
    .line 19
    new-instance v0, La/zf70;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-direct {v0, p0, v1}, La/zf70;-><init>(La/dg70;B)V

    .line 23
    .line 24
    .line 25
    new-instance v1, La/ej50;

    .line 26
    .line 27
    const/16 v2, 0x1c

    .line 28
    .line 29
    invoke-direct {v1, p0, v2}, La/ej50;-><init>(Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    sget-object v2, La/wez;->b:La/wez;

    .line 33
    .line 34
    new-instance v3, La/ej50;

    .line 35
    .line 36
    const/16 v4, 0x1d

    .line 37
    .line 38
    invoke-direct {v3, v1, v4}, La/ej50;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-class v2, La/eh70;

    .line 46
    .line 47
    sget-object v3, La/sre0;->a:La/tre0;

    .line 48
    .line 49
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    new-instance v3, La/co60;

    .line 54
    .line 55
    const/16 v4, 0x18

    .line 56
    .line 57
    invoke-direct {v3, v1, v4}, La/co60;-><init>(La/a8z;B)V

    .line 58
    .line 59
    .line 60
    new-instance v4, La/co60;

    .line 61
    .line 62
    const/16 v5, 0x19

    .line 63
    .line 64
    invoke-direct {v4, v1, v5}, La/co60;-><init>(La/a8z;B)V

    .line 65
    .line 66
    .line 67
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, p0, La/dg70;->N1:La/kiu0;

    .line 72
    .line 73
    return-void
.end method

.method public static H0(La/dg70;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, La/dg70;->P1:Z

    .line 3
    .line 4
    invoke-static {p0}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/dg70;->I0()La/h0r;

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
    invoke-virtual {p0}, La/dg70;->I0()La/h0r;

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
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v0, v1

    .line 10
    :goto_0
    instance-of v2, v0, La/bn70;

    .line 11
    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    move-object v1, v0

    .line 15
    check-cast v1, La/bn70;

    .line 16
    .line 17
    :cond_1
    if-eqz v1, :cond_2

    .line 18
    .line 19
    iget-object v0, v1, La/bn70;->L1:La/h5t;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-interface {v0, p0}, La/h5t;->k(La/dg70;)V

    .line 24
    .line 25
    .line 26
    :cond_2
    return-void
.end method

.method public final G0(La/sf70;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance v1, La/zb5;

    .line 28
    .line 29
    invoke-direct {v1, p0}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 30
    .line 31
    .line 32
    const p0, 0x7f0a05cd

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p0, p1, v0}, La/zb5;->o(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, La/zb5;->f()V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final I0()La/h0r;
    .locals 2

    .line 1
    sget-object v0, La/dg70;->R1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/dg70;->M1:La/s0r;

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

.method public final J0()La/eh70;
    .locals 0

    .line 1
    iget-object p0, p0, La/dg70;->N1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/eh70;

    .line 8
    .line 9
    return-object p0
.end method

.method public final Z()V
    .locals 3

    .line 1
    iget-object v0, p0, La/dg70;->O1:La/iha;

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
    invoke-static {p0}, La/dg70;->H0(La/dg70;)V

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
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/yx5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/dg70;->I0()La/h0r;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p1, p1, La/h0r;->f:Lorg/xplatform/core/presentation/views/OneXGamesInputEditText;

    .line 12
    .line 13
    invoke-virtual {p0}, La/dg70;->I0()La/h0r;

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
    const/4 v1, 0x5

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
    const/4 v2, 0x1

    .line 30
    if-lt p1, v1, :cond_0

    .line 31
    .line 32
    new-instance p1, La/zx10;

    .line 33
    .line 34
    invoke-direct {p1, v0}, La/zx10;-><init>(Ljava/lang/Object;)V

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
    invoke-virtual {p0}, La/dg70;->I0()La/h0r;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iget-object p1, p1, La/h0r;->b:Landroid/widget/TextView;

    .line 72
    .line 73
    invoke-virtual {p0}, La/dg70;->I0()La/h0r;

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
    const/4 v3, 0x2

    .line 84
    invoke-direct {v0, v1, v3}, La/tjj;-><init>(II)V

    .line 85
    .line 86
    .line 87
    new-array v1, v2, [Landroid/text/InputFilter;

    .line 88
    .line 89
    const/4 v4, 0x0

    .line 90
    aput-object v0, v1, v4

    .line 91
    .line 92
    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    .line 93
    .line 94
    .line 95
    new-instance v0, La/yf70;

    .line 96
    .line 97
    invoke-direct {v0, p0, p1, v4}, La/yf70;-><init>(La/yx5;Landroid/widget/TextView;B)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 101
    .line 102
    .line 103
    new-instance p1, La/zf70;

    .line 104
    .line 105
    invoke-direct {p1, p0, v4}, La/zf70;-><init>(La/dg70;B)V

    .line 106
    .line 107
    .line 108
    invoke-static {p2, p1}, La/hxm0;->y(Landroid/widget/EditText;Lkotlin/jvm/functions/Function0;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, La/dg70;->I0()La/h0r;

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
    const/16 v0, 0x8

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
    invoke-virtual {p0}, La/dg70;->I0()La/h0r;

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
    new-instance v0, La/ag70;

    .line 136
    .line 137
    invoke-direct {v0, p0, v4}, La/ag70;-><init>(La/dg70;B)V

    .line 138
    .line 139
    .line 140
    invoke-static {p1, p2, v0}, La/dyb;->N(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0}, La/dg70;->I0()La/h0r;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    iget-object p1, p1, La/h0r;->n:Landroidx/appcompat/widget/AppCompatButton;

    .line 148
    .line 149
    new-instance v0, La/ag70;

    .line 150
    .line 151
    invoke-direct {v0, p0, v2}, La/ag70;-><init>(La/dg70;B)V

    .line 152
    .line 153
    .line 154
    invoke-static {p1, p2, v0}, La/dyb;->N(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0}, La/dg70;->I0()La/h0r;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    iget-object p1, p1, La/h0r;->s:Landroidx/appcompat/widget/AppCompatButton;

    .line 162
    .line 163
    new-instance v0, La/ag70;

    .line 164
    .line 165
    invoke-direct {v0, p0, v3}, La/ag70;-><init>(La/dg70;B)V

    .line 166
    .line 167
    .line 168
    invoke-static {p1, p2, v0}, La/dyb;->N(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0}, La/dg70;->I0()La/h0r;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    iget-object p1, p1, La/h0r;->j:Landroidx/appcompat/widget/AppCompatButton;

    .line 176
    .line 177
    new-instance v0, La/ag70;

    .line 178
    .line 179
    const/4 v1, 0x3

    .line 180
    invoke-direct {v0, p0, v1}, La/ag70;-><init>(La/dg70;B)V

    .line 181
    .line 182
    .line 183
    invoke-static {p1, p2, v0}, La/dyb;->N(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 184
    .line 185
    .line 186
    invoke-virtual {p0}, La/dg70;->I0()La/h0r;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    iget-object p1, p1, La/h0r;->f:Lorg/xplatform/core/presentation/views/OneXGamesInputEditText;

    .line 191
    .line 192
    new-instance p2, La/ag70;

    .line 193
    .line 194
    const/4 v0, 0x4

    .line 195
    invoke-direct {p2, p0, v0}, La/ag70;-><init>(La/dg70;B)V

    .line 196
    .line 197
    .line 198
    new-instance v0, La/da0;

    .line 199
    .line 200
    new-instance v5, La/fsp0;

    .line 201
    .line 202
    invoke-direct {v5, v3, p2}, La/fsp0;-><init>(ILkotlin/jvm/functions/Function1;)V

    .line 203
    .line 204
    .line 205
    invoke-direct {v0, v5}, La/da0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p0}, La/dg70;->J0()La/eh70;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    iget-object p1, p1, La/eh70;->z:La/p7m0;

    .line 216
    .line 217
    new-instance p2, La/cg70;

    .line 218
    .line 219
    const/4 v0, 0x0

    .line 220
    invoke-direct {p2, p0, v0, v4}, La/cg70;-><init>(La/dg70;La/yje;B)V

    .line 221
    .line 222
    .line 223
    sget-object v3, La/lkz;->a:La/lkz;

    .line 224
    .line 225
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    new-instance v5, La/az60;

    .line 238
    .line 239
    invoke-direct {v5, p1, v3, p2, v0}, La/az60;-><init>(La/gmq;La/clz;La/cg70;La/yje;)V

    .line 240
    .line 241
    .line 242
    invoke-static {v4, v0, v0, v5, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 243
    .line 244
    .line 245
    invoke-virtual {p0}, La/dg70;->J0()La/eh70;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    iget-object p1, p1, La/eh70;->A:La/q99;

    .line 250
    .line 251
    invoke-static {p1}, La/xkb;->V(La/htb;)La/itb;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    new-instance p2, La/cg70;

    .line 256
    .line 257
    invoke-direct {p2, p0, v0, v2}, La/cg70;-><init>(La/dg70;La/yje;B)V

    .line 258
    .line 259
    .line 260
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    new-instance v3, La/az60;

    .line 273
    .line 274
    invoke-direct {v3, p1, p0, p2, v0}, La/az60;-><init>(La/itb;La/clz;La/cg70;La/yje;)V

    .line 275
    .line 276
    .line 277
    invoke-static {v2, v0, v0, v3, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 278
    .line 279
    .line 280
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/dg70;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
