.class public final La/dbe;
.super La/nw5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/nw5<",
        "La/iik;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/dbe;",
        "La/nw5;",
        "La/iik;",
        "<init>",
        "()V",
        "a/kud",
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
.field public static final k2:La/kud;

.field public static final synthetic l2:[La/iiy;


# instance fields
.field public final e2:La/nae0;

.field public final f2:La/kiu0;

.field public final g2:La/bbe;

.field public final h2:Landroid/os/Handler;

.field public final i2:La/khf0;

.field public j2:La/ii;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/dbe;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/consultantchat/impl/databinding/DialogConsultantChatRateBinding;"

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
    const-string v3, "ratingModel"

    .line 16
    .line 17
    const-string v5, "getRatingModel()Lorg/xplatform/consultantchat/presentation/dialogs/rate/model/RatingModel;"

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
    sput-object v1, La/dbe;->l2:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/kud;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/dbe;->k2:La/kud;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, La/nw5;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/abe;->a:La/abe;

    .line 5
    .line 6
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, La/dbe;->e2:La/nae0;

    .line 11
    .line 12
    new-instance v0, La/svc;

    .line 13
    .line 14
    const/16 v1, 0x16

    .line 15
    .line 16
    invoke-direct {v0, p0, v1}, La/svc;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    sget-object v1, La/wez;->b:La/wez;

    .line 20
    .line 21
    new-instance v2, La/svc;

    .line 22
    .line 23
    const/16 v3, 0x17

    .line 24
    .line 25
    invoke-direct {v2, v0, v3}, La/svc;-><init>(Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {v1, v2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-class v1, La/ibe;

    .line 33
    .line 34
    sget-object v2, La/sre0;->a:La/tre0;

    .line 35
    .line 36
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    new-instance v2, La/wpb;

    .line 41
    .line 42
    const/16 v3, 0x1c

    .line 43
    .line 44
    invoke-direct {v2, v0, v3}, La/wpb;-><init>(La/a8z;B)V

    .line 45
    .line 46
    .line 47
    new-instance v3, La/wpb;

    .line 48
    .line 49
    const/16 v4, 0x1d

    .line 50
    .line 51
    invoke-direct {v3, v0, v4}, La/wpb;-><init>(La/a8z;B)V

    .line 52
    .line 53
    .line 54
    new-instance v4, La/h5;

    .line 55
    .line 56
    const/16 v5, 0x15

    .line 57
    .line 58
    invoke-direct {v4, p0, v0, v5}, La/h5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 59
    .line 60
    .line 61
    invoke-static {p0, v1, v2, v3, v4}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, p0, La/dbe;->f2:La/kiu0;

    .line 66
    .line 67
    new-instance v0, La/bbe;

    .line 68
    .line 69
    const/4 v1, 0x1

    .line 70
    invoke-direct {v0, v1}, La/eg60;-><init>(Z)V

    .line 71
    .line 72
    .line 73
    iput-object v0, p0, La/dbe;->g2:La/bbe;

    .line 74
    .line 75
    new-instance v0, Landroid/os/Handler;

    .line 76
    .line 77
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 82
    .line 83
    .line 84
    iput-object v0, p0, La/dbe;->h2:Landroid/os/Handler;

    .line 85
    .line 86
    new-instance v0, La/khf0;

    .line 87
    .line 88
    const-string v1, "RATING_MODEL_KEY"

    .line 89
    .line 90
    sget-object v2, Lorg/xplatform/consultantchat/presentation/dialogs/rate/model/RatingModel$NoValue;->a:Lorg/xplatform/consultantchat/presentation/dialogs/rate/model/RatingModel$NoValue;

    .line 91
    .line 92
    invoke-direct {v0, v2, v1}, La/khf0;-><init>(Landroid/os/Parcelable;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    iput-object v0, p0, La/dbe;->i2:La/khf0;

    .line 96
    .line 97
    return-void
.end method


# virtual methods
.method public final C0(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 1

    .line 1
    new-instance p1, La/wo8;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget p0, p0, La/sik;->M1:I

    .line 8
    .line 9
    invoke-direct {p1, v0, p0}, La/wo8;-><init>(Landroid/content/Context;I)V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    invoke-virtual {p1, p0}, La/wo8;->setCancelable(Z)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p0}, La/wo8;->setCanceledOnTouchOutside(Z)V

    .line 17
    .line 18
    .line 19
    new-instance v0, La/yae;

    .line 20
    .line 21
    invoke-direct {v0, p1, p0}, La/yae;-><init>(Landroid/app/Dialog;B)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 25
    .line 26
    .line 27
    return-object p1
.end method

.method public final I0()I
    .locals 0

    .line 1
    const p0, 0x7f040ae3

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final bridge synthetic L0()La/yfu0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/dbe;->T0()La/iik;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final O0()V
    .locals 7

    .line 1
    new-instance v0, La/jwd;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, p0, v1}, La/jwd;-><init>(Ljava/lang/Object;B)V

    .line 5
    .line 6
    .line 7
    const-string v1, "DIALOG_EXIT_REQUEST"

    .line 8
    .line 9
    invoke-static {p0, v1, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, La/nw5;->M0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L(Z)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, La/sik;->S1:Landroid/app/Dialog;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    check-cast v0, La/wo8;

    .line 28
    .line 29
    invoke-virtual {v0}, La/hgd;->k()La/jg60;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget-object v3, p0, La/dbe;->g2:La/bbe;

    .line 38
    .line 39
    invoke-virtual {v0, v2, v3}, La/jg60;->a(La/clz;La/eg60;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, La/dbe;->T0()La/iik;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v2, v0, La/iik;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 47
    .line 48
    new-instance v3, La/zae;

    .line 49
    .line 50
    invoke-direct {v3, p0, v1}, La/zae;-><init>(La/dbe;B)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 54
    .line 55
    .line 56
    iget-object v2, v0, La/iik;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 57
    .line 58
    new-instance v3, La/zae;

    .line 59
    .line 60
    const/4 v4, 0x1

    .line 61
    invoke-direct {v3, p0, v4}, La/zae;-><init>(La/dbe;B)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 65
    .line 66
    .line 67
    iget-object v2, v0, La/iik;->g:Landroid/widget/LinearLayout;

    .line 68
    .line 69
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    :goto_0
    if-ge v1, v3, :cond_2

    .line 74
    .line 75
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    if-eqz v5, :cond_1

    .line 80
    .line 81
    new-instance v6, La/nva;

    .line 82
    .line 83
    invoke-direct {v6, p0, v1, v4}, La/nva;-><init>(Ljava/lang/Object;IB)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 87
    .line 88
    .line 89
    add-int/lit8 v1, v1, 0x1

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    const-string v0, "Index: "

    .line 97
    .line 98
    const-string v2, ", Size: "

    .line 99
    .line 100
    invoke-static {v1, v0, p0, v2}, La/f140;->j(ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-static {p0}, La/v4i0;->m(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_2
    iget-object v0, v0, La/iik;->f:Landroid/widget/Button;

    .line 109
    .line 110
    new-instance v1, La/zae;

    .line 111
    .line 112
    const/4 v2, 0x2

    .line 113
    invoke-direct {v1, p0, v2}, La/zae;-><init>(La/dbe;B)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, La/dbe;->T0()La/iik;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-virtual {p0}, La/dbe;->U0()La/ibe;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    iget-object v1, v1, La/ibe;->b:La/p7m0;

    .line 128
    .line 129
    new-instance v2, La/ee0;

    .line 130
    .line 131
    const/16 v3, 0x1b

    .line 132
    .line 133
    const/4 v4, 0x0

    .line 134
    invoke-direct {v2, v0, p0, v4, v3}, La/ee0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 135
    .line 136
    .line 137
    sget-object v0, La/lkz;->a:La/lkz;

    .line 138
    .line 139
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-interface {v0}, La/clz;->x()La/glz;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    new-instance v5, La/cxd;

    .line 152
    .line 153
    invoke-direct {v5, v1, v0, v2, v4}, La/cxd;-><init>(La/gmq;La/clz;La/ee0;La/yje;)V

    .line 154
    .line 155
    .line 156
    const/4 v0, 0x3

    .line 157
    invoke-static {v3, v4, v4, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 158
    .line 159
    .line 160
    invoke-virtual {p0}, La/dbe;->U0()La/ibe;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    iget-object v1, v1, La/ibe;->c:La/qoj0;

    .line 165
    .line 166
    new-instance v2, La/cbe;

    .line 167
    .line 168
    invoke-direct {v2, p0, v4}, La/cbe;-><init>(La/dbe;La/yje;)V

    .line 169
    .line 170
    .line 171
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    new-instance v5, La/cxd;

    .line 184
    .line 185
    invoke-direct {v5, v1, p0, v2, v4}, La/cxd;-><init>(La/gmq;La/clz;La/cbe;La/yje;)V

    .line 186
    .line 187
    .line 188
    invoke-static {v3, v4, v4, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 189
    .line 190
    .line 191
    return-void
.end method

.method public final P0()V
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
    iget-object v0, v0, La/f6i;->e:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, La/ii;

    .line 66
    .line 67
    iput-object v0, p0, La/dbe;->j2:La/ii;

    .line 68
    .line 69
    return-void

    .line 70
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 71
    .line 72
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public final Q0()I
    .locals 0

    .line 1
    const p0, 0x7f0a0c40

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final S0()Ljava/lang/String;
    .locals 1

    .line 1
    const v0, 0x7f1310b2

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final T0()La/iik;
    .locals 2

    .line 1
    sget-object v0, La/dbe;->l2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/dbe;->e2:La/nae0;

    .line 7
    .line 8
    invoke-interface {v1, v0, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/iik;

    .line 16
    .line 17
    return-object p0
.end method

.method public final U0()La/ibe;
    .locals 0

    .line 1
    iget-object p0, p0, La/dbe;->f2:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/ibe;

    .line 8
    .line 9
    return-object p0
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, La/nw5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/dbe;->U0()La/ibe;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    sget-object v0, La/dbe;->l2:[La/iiy;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    aget-object v0, v0, v1

    .line 12
    .line 13
    iget-object v1, p0, La/dbe;->i2:La/khf0;

    .line 14
    .line 15
    invoke-virtual {v1, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Lorg/xplatform/consultantchat/presentation/dialogs/rate/model/RatingModel;

    .line 20
    .line 21
    invoke-virtual {p1, p0}, La/ibe;->w(Lorg/xplatform/consultantchat/presentation/dialogs/rate/model/RatingModel;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final Y()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    iget-object p0, p0, La/dbe;->h2:Landroid/os/Handler;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
