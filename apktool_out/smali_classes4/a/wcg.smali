.class public final La/wcg;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/ycg;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/wcg;",
        "La/yx5;",
        "La/ycg;",
        "<init>",
        "()V",
        "a/usd",
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
.field public static final U1:La/usd;

.field public static final synthetic V1:[La/iiy;


# instance fields
.field public final K1:Z

.field public final L1:La/e9o0;

.field public M1:La/do20;

.field public N1:La/eei;

.field public O1:La/wdk0;

.field public final P1:La/kiu0;

.field public final Q1:La/s0r;

.field public final R1:La/a8z;

.field public final S1:La/khf0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/wcg;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/cyber/section/impl/databinding/MainChampFragmentMainBinding;"

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
    const-string v5, "getParams()Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;"

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
    sput-object v1, La/wcg;->V1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/usd;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/wcg;->U1:La/usd;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const v0, 0x7f0d04a2

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, La/wcg;->K1:Z

    .line 9
    .line 10
    new-instance v1, La/e9o0;

    .line 11
    .line 12
    sget-object v2, La/bp3;->a:La/bp3;

    .line 13
    .line 14
    const/16 v2, 0x8

    .line 15
    .line 16
    const v3, 0x7f040b5d

    .line 17
    .line 18
    .line 19
    const v4, 0x7f040ae3

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, v3, v4, v2}, La/e9o0;-><init>(III)V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, La/wcg;->L1:La/e9o0;

    .line 26
    .line 27
    new-instance v1, La/ucg;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-direct {v1, p0, v2}, La/ucg;-><init>(La/wcg;B)V

    .line 31
    .line 32
    .line 33
    new-instance v2, La/q7g;

    .line 34
    .line 35
    const/16 v3, 0xa

    .line 36
    .line 37
    invoke-direct {v2, p0, v3}, La/q7g;-><init>(Ljava/lang/Object;B)V

    .line 38
    .line 39
    .line 40
    sget-object v4, La/wez;->b:La/wez;

    .line 41
    .line 42
    new-instance v5, La/q7g;

    .line 43
    .line 44
    const/16 v6, 0xb

    .line 45
    .line 46
    invoke-direct {v5, v2, v6}, La/q7g;-><init>(Ljava/lang/Object;B)V

    .line 47
    .line 48
    .line 49
    invoke-static {v4, v5}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    const-class v5, La/gdg;

    .line 54
    .line 55
    sget-object v7, La/sre0;->a:La/tre0;

    .line 56
    .line 57
    invoke-virtual {v7, v5}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    new-instance v7, La/r7g;

    .line 62
    .line 63
    invoke-direct {v7, v2, v3}, La/r7g;-><init>(La/a8z;B)V

    .line 64
    .line 65
    .line 66
    new-instance v3, La/r7g;

    .line 67
    .line 68
    invoke-direct {v3, v2, v6}, La/r7g;-><init>(La/a8z;B)V

    .line 69
    .line 70
    .line 71
    invoke-static {p0, v5, v7, v3, v1}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    iput-object v1, p0, La/wcg;->P1:La/kiu0;

    .line 76
    .line 77
    sget-object v1, La/vcg;->a:La/vcg;

    .line 78
    .line 79
    invoke-static {p0, v1}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    iput-object v1, p0, La/wcg;->Q1:La/s0r;

    .line 84
    .line 85
    new-instance v1, La/ucg;

    .line 86
    .line 87
    invoke-direct {v1, p0, v0}, La/ucg;-><init>(La/wcg;B)V

    .line 88
    .line 89
    .line 90
    invoke-static {v4, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iput-object v0, p0, La/wcg;->R1:La/a8z;

    .line 95
    .line 96
    new-instance v0, La/khf0;

    .line 97
    .line 98
    const-string v1, "params"

    .line 99
    .line 100
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    iput-object v0, p0, La/wcg;->S1:La/khf0;

    .line 104
    .line 105
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, La/wcg;->G0()La/fs10;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/fs10;->a:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 6
    .line 7
    new-instance v0, La/prc;

    .line 8
    .line 9
    const/16 v1, 0xb

    .line 10
    .line 11
    invoke-direct {v0, p0, v1}, La/prc;-><init>(Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    sget-object v1, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 15
    .line 16
    invoke-static {p1, v0}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 17
    .line 18
    .line 19
    iget-object v3, p0, La/wcg;->M1:La/do20;

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    if-eqz v3, :cond_3

    .line 23
    .line 24
    invoke-virtual {p0}, La/wcg;->G0()La/fs10;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v0, v0, La/fs10;->c:La/dc3;

    .line 29
    .line 30
    invoke-virtual {p0}, La/wcg;->G0()La/fs10;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget-object v1, v1, La/fs10;->b:La/nq8;

    .line 35
    .line 36
    iget-object v1, v1, La/nq8;->b:Landroid/view/View;

    .line 37
    .line 38
    move-object v6, v1

    .line 39
    check-cast v6, Landroid/widget/LinearLayout;

    .line 40
    .line 41
    invoke-virtual {p0}, La/wcg;->I0()La/gdg;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget-object v2, v0, La/dc3;->b:Landroid/view/ViewGroup;

    .line 46
    .line 47
    move-object v8, v2

    .line 48
    check-cast v8, Lorg/xplatform/ui_core/viewcomponents/motion/AppBarMotionLayout;

    .line 49
    .line 50
    invoke-virtual {v8}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    const v4, 0x7f0706f8

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    new-instance v4, La/kie0;

    .line 62
    .line 63
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 64
    .line 65
    .line 66
    neg-int v2, v5

    .line 67
    iput v2, v4, La/kie0;->a:I

    .line 68
    .line 69
    invoke-virtual {v8}, Landroid/view/View;->isLaidOut()Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-eqz v7, :cond_0

    .line 74
    .line 75
    invoke-virtual {v8}, Landroid/view/View;->isLayoutRequested()Z

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    if-nez v7, :cond_0

    .line 80
    .line 81
    invoke-virtual {v8}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getCurrentState()I

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    const v9, 0x7f0a0e75

    .line 86
    .line 87
    .line 88
    if-ne v7, v9, :cond_1

    .line 89
    .line 90
    invoke-static {v6, v2}, La/do20;->q(Landroid/view/ViewGroup;I)V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_0
    new-instance v7, La/hc3;

    .line 95
    .line 96
    invoke-direct {v7, v0, v3, v6, v2}, La/hc3;-><init>(La/dc3;La/do20;Landroid/view/ViewGroup;I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v8, v7}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 100
    .line 101
    .line 102
    :cond_1
    :goto_0
    new-instance v2, La/ec3;

    .line 103
    .line 104
    const/4 v7, 0x0

    .line 105
    invoke-direct/range {v2 .. v7}, La/ec3;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;B)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v8, v2}, La/pv5;->setOnProgressChangeCallback(Lkotlin/jvm/functions/Function1;)V

    .line 109
    .line 110
    .line 111
    const/4 v2, 0x1

    .line 112
    invoke-virtual {v6, v2}, Landroid/view/View;->setClipToOutline(Z)V

    .line 113
    .line 114
    .line 115
    new-instance v5, La/ic3;

    .line 116
    .line 117
    invoke-direct {v5, v4, v7}, La/ic3;-><init>(Ljava/lang/Object;B)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v6, v5}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 121
    .line 122
    .line 123
    iget-object v4, v1, La/gdg;->i:La/qc3;

    .line 124
    .line 125
    iget-object v4, v4, La/qc3;->g:La/p7m0;

    .line 126
    .line 127
    new-instance v5, La/ee0;

    .line 128
    .line 129
    const/4 v6, 0x7

    .line 130
    invoke-direct {v5, v3, v0, p1, v6}, La/ee0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 131
    .line 132
    .line 133
    sget-object v6, La/lkz;->a:La/lkz;

    .line 134
    .line 135
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    invoke-interface {v6}, La/clz;->x()La/glz;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    invoke-static {v7}, La/x0x;->Q(La/glz;)La/tkz;

    .line 144
    .line 145
    .line 146
    move-result-object v7

    .line 147
    new-instance v8, La/y51;

    .line 148
    .line 149
    invoke-direct {v8, v4, v6, v5, p1}, La/y51;-><init>(La/gmq;La/clz;La/ee0;La/yje;)V

    .line 150
    .line 151
    .line 152
    const/4 v4, 0x3

    .line 153
    invoke-static {v7, p1, p1, v8, v4}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 154
    .line 155
    .line 156
    iget-object v0, v0, La/dc3;->c:Landroid/view/View;

    .line 157
    .line 158
    check-cast v0, Landroidx/compose/ui/platform/ComposeView;

    .line 159
    .line 160
    new-instance v4, La/owp0;

    .line 161
    .line 162
    invoke-direct {v4, p0}, La/owp0;-><init>(La/clz;)V

    .line 163
    .line 164
    .line 165
    new-instance v5, La/ry2;

    .line 166
    .line 167
    const/4 v6, 0x5

    .line 168
    invoke-direct {v5, v1, p0, v3, v6}, La/ry2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 169
    .line 170
    .line 171
    new-instance v1, La/ugd;

    .line 172
    .line 173
    const v3, -0x3d15dd06

    .line 174
    .line 175
    .line 176
    invoke-direct {v1, v3, v2, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    invoke-static {v0, v4, v1}, La/h97;->t(Landroidx/compose/ui/platform/ComposeView;La/owp0;La/ugd;)V

    .line 180
    .line 181
    .line 182
    iget-object v0, p0, La/wcg;->O1:La/wdk0;

    .line 183
    .line 184
    if-eqz v0, :cond_2

    .line 185
    .line 186
    iget-boolean p1, p0, La/wcg;->K1:Z

    .line 187
    .line 188
    invoke-static {v0, p0, p1}, La/wdk0;->l(La/wdk0;Landroidx/fragment/app/Fragment;Z)V

    .line 189
    .line 190
    .line 191
    return-void

    .line 192
    :cond_2
    const-string p0, "snackbarManager"

    .line 193
    .line 194
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    throw p1

    .line 198
    :cond_3
    const-string p0, "appBarToolbarDelegate"

    .line 199
    .line 200
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    throw p1
.end method

.method public final C0()V
    .locals 2

    .line 1
    iget-object v0, p0, La/wcg;->R1:La/a8z;

    .line 2
    .line 3
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/fei;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v1, La/do20;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, La/wcg;->M1:La/do20;

    .line 18
    .line 19
    iget-object v1, v0, La/fei;->z:La/n5d0;

    .line 20
    .line 21
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, La/eei;

    .line 26
    .line 27
    iput-object v1, p0, La/wcg;->N1:La/eei;

    .line 28
    .line 29
    iget-object v0, v0, La/fei;->s:La/wdk0;

    .line 30
    .line 31
    iput-object v0, p0, La/wcg;->O1:La/wdk0;

    .line 32
    .line 33
    return-void
.end method

.method public final D0()V
    .locals 9

    .line 1
    invoke-virtual {p0}, La/wcg;->I0()La/gdg;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/gdg;->t:La/xae0;

    .line 6
    .line 7
    new-instance v1, La/d7e;

    .line 8
    .line 9
    const/4 v7, 0x4

    .line 10
    const/16 v8, 0x13

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    const-class v4, La/wcg;

    .line 14
    .line 15
    const-string v5, "showFragment"

    .line 16
    .line 17
    const-string v6, "showFragment(Lorg/xplatform/cyber/section/impl/championships/regular/presentation/main/model/CyberChampScreenTypeState;)V"

    .line 18
    .line 19
    move-object v3, p0

    .line 20
    invoke-direct/range {v1 .. v8}, La/d7e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 21
    .line 22
    .line 23
    sget-object p0, La/lkz;->a:La/lkz;

    .line 24
    .line 25
    invoke-static {v3}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    new-instance v4, La/g8g;

    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    invoke-direct {v4, v0, p0, v1, v5}, La/g8g;-><init>(La/gmq;La/clz;La/d7e;La/yje;)V

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x3

    .line 44
    invoke-static {v2, v5, v5, v4, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3}, La/wcg;->I0()La/gdg;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object v0, v0, La/gdg;->u:La/p7m0;

    .line 52
    .line 53
    new-instance v1, La/e9g;

    .line 54
    .line 55
    const/4 v2, 0x2

    .line 56
    invoke-direct {v1, v3, v5, v2}, La/e9g;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 57
    .line 58
    .line 59
    invoke-static {v3}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    new-instance v4, La/g8g;

    .line 72
    .line 73
    invoke-direct {v4, v0, v2, v1, v5}, La/g8g;-><init>(La/gmq;La/clz;La/e9g;La/yje;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v3, v5, v5, v4, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public final G0()La/fs10;
    .locals 2

    .line 1
    sget-object v0, La/wcg;->V1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/wcg;->Q1:La/s0r;

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
    check-cast p0, La/fs10;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;
    .locals 2

    .line 1
    sget-object v0, La/wcg;->V1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/wcg;->S1:La/khf0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;

    .line 13
    .line 14
    return-object p0
.end method

.method public final I0()La/gdg;
    .locals 0

    .line 1
    iget-object p0, p0, La/wcg;->P1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/gdg;

    .line 8
    .line 9
    return-object p0
.end method

.method public final d0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, La/wcg;->I0()La/gdg;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object v0, p0, La/gdg;->v:La/c4m0;

    .line 9
    .line 10
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, La/gdg;->w:La/bby;

    .line 14
    .line 15
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, La/gdg;->x:La/c4m0;

    .line 19
    .line 20
    invoke-static {p0}, La/e3c;->n(La/bby;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final e0()V
    .locals 7

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/wcg;->I0()La/gdg;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, v0, La/gdg;->v:La/c4m0;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1}, La/pby;->isActive()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-ne v1, v2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v1, v0, La/gdg;->j:La/m1e;

    .line 22
    .line 23
    invoke-interface {v1}, La/m1e;->b()La/gmq;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    new-instance v4, La/lo3;

    .line 28
    .line 29
    const/4 v5, 0x3

    .line 30
    const/16 v6, 0x9

    .line 31
    .line 32
    invoke-direct {v4, v5, v3, v6}, La/lo3;-><init>(ILa/yje;B)V

    .line 33
    .line 34
    .line 35
    new-instance v5, La/dnq;

    .line 36
    .line 37
    invoke-direct {v5, v1, v4, v2}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 38
    .line 39
    .line 40
    new-instance v1, La/fdg;

    .line 41
    .line 42
    invoke-direct {v1, v0, v3}, La/fdg;-><init>(La/gdg;La/yje;)V

    .line 43
    .line 44
    .line 45
    new-instance v4, La/fnq;

    .line 46
    .line 47
    const/4 v6, 0x4

    .line 48
    invoke-direct {v4, v5, v1, v6}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 49
    .line 50
    .line 51
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    iget-object v5, v0, La/gdg;->k:La/mne;

    .line 56
    .line 57
    iget-object v5, v5, La/mne;->a:La/rwj;

    .line 58
    .line 59
    invoke-static {v1, v5}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-static {v4, v1}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iput-object v1, v0, La/gdg;->v:La/c4m0;

    .line 68
    .line 69
    :goto_0
    iget-object v0, p0, La/wcg;->M1:La/do20;

    .line 70
    .line 71
    if-eqz v0, :cond_5

    .line 72
    .line 73
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, La/wcg;->G0()La/fs10;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    iget-object p0, p0, La/fs10;->c:La/dc3;

    .line 89
    .line 90
    iget-object p0, p0, La/dc3;->b:Landroid/view/ViewGroup;

    .line 91
    .line 92
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/motion/AppBarMotionLayout;

    .line 93
    .line 94
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getCurrentState()I

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    const v1, 0x7f0a0e75

    .line 99
    .line 100
    .line 101
    if-ne p0, v1, :cond_1

    .line 102
    .line 103
    move p0, v2

    .line 104
    goto :goto_1

    .line 105
    :cond_1
    invoke-virtual {v0}, Landroid/view/Window;->getContext()Landroid/content/Context;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-static {p0}, La/qem0;->r(Landroid/content/Context;)Z

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    :goto_1
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    new-instance v3, La/ani0;

    .line 118
    .line 119
    invoke-direct {v3, v1}, La/ani0;-><init>(Landroid/view/View;)V

    .line 120
    .line 121
    .line 122
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 123
    .line 124
    const/16 v4, 0x23

    .line 125
    .line 126
    if-lt v1, v4, :cond_2

    .line 127
    .line 128
    new-instance v1, La/bjv0;

    .line 129
    .line 130
    invoke-direct {v1, v0, v3}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_2
    const/16 v4, 0x1e

    .line 135
    .line 136
    if-lt v1, v4, :cond_3

    .line 137
    .line 138
    new-instance v1, La/ajv0;

    .line 139
    .line 140
    invoke-direct {v1, v0, v3}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 141
    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_3
    const/16 v4, 0x1a

    .line 145
    .line 146
    if-lt v1, v4, :cond_4

    .line 147
    .line 148
    new-instance v1, La/ziv0;

    .line 149
    .line 150
    invoke-direct {v1, v0, v3}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 151
    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_4
    new-instance v1, La/yiv0;

    .line 155
    .line 156
    invoke-direct {v1, v0, v3}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 157
    .line 158
    .line 159
    :goto_2
    xor-int/2addr p0, v2

    .line 160
    invoke-virtual {v1, p0}, La/ycm0;->w(Z)V

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :cond_5
    const-string p0, "appBarToolbarDelegate"

    .line 165
    .line 166
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw v3
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/wcg;->K1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/wcg;->L1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
