.class public final La/l590;
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
        "La/l590;",
        "La/yx5;",
        "La/cg60;",
        "<init>",
        "()V",
        "a/nh70",
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
.field public static final Y1:La/nh70;

.field public static final synthetic Z1:[La/iiy;


# instance fields
.field public final K1:La/s0r;

.field public L1:La/fiu0;

.field public M1:La/ii;

.field public N1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

.field public O1:Z

.field public P1:La/u690;

.field public Q1:Landroid/webkit/ValueCallback;

.field public R1:Ljava/io/File;

.field public final S1:La/ywq;

.field public final U1:La/bc0;

.field public final V1:La/ywq;

.field public final W1:La/n0o0;

.field public final X1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/l590;

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
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/l590;->Z1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/nh70;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/l590;->Y1:La/nh70;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/k590;->a:La/k590;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/l590;->K1:La/s0r;

    .line 14
    .line 15
    new-instance v0, La/xn;

    .line 16
    .line 17
    const/4 v1, 0x4

    .line 18
    invoke-direct {v0, v1}, La/xn;-><init>(B)V

    .line 19
    .line 20
    .line 21
    new-instance v2, La/f590;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-direct {v2, p0, v3}, La/f590;-><init>(La/l590;B)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v2, v0}, Landroidx/fragment/app/Fragment;->m0(La/wn;La/bsr0;)La/ywq;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, La/l590;->S1:La/ywq;

    .line 32
    .line 33
    new-instance v0, La/bc0;

    .line 34
    .line 35
    const/16 v2, 0xa

    .line 36
    .line 37
    invoke-direct {v0, p0, v2}, La/bc0;-><init>(Ljava/lang/Object;B)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, La/l590;->U1:La/bc0;

    .line 41
    .line 42
    new-instance v0, La/xn;

    .line 43
    .line 44
    invoke-direct {v0, v1}, La/xn;-><init>(B)V

    .line 45
    .line 46
    .line 47
    new-instance v1, La/f590;

    .line 48
    .line 49
    const/4 v2, 0x1

    .line 50
    invoke-direct {v1, p0, v2}, La/f590;-><init>(La/l590;B)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v1, v0}, Landroidx/fragment/app/Fragment;->m0(La/wn;La/bsr0;)La/ywq;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, La/l590;->V1:La/ywq;

    .line 58
    .line 59
    new-instance v0, La/g590;

    .line 60
    .line 61
    invoke-direct {v0, p0, v3}, La/g590;-><init>(La/l590;B)V

    .line 62
    .line 63
    .line 64
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, La/l590;->W1:La/n0o0;

    .line 69
    .line 70
    const-class v0, La/j790;

    .line 71
    .line 72
    sget-object v1, La/sre0;->a:La/tre0;

    .line 73
    .line 74
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    new-instance v1, La/g590;

    .line 79
    .line 80
    invoke-direct {v1, p0, v2}, La/g590;-><init>(La/l590;B)V

    .line 81
    .line 82
    .line 83
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    iput-object v0, p0, La/l590;->X1:La/a8z;

    .line 88
    .line 89
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
    iget-object p1, p0, La/l590;->N1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

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
    iget-object v1, p0, La/l590;->U1:La/bc0;

    .line 36
    .line 37
    invoke-virtual {p1, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    invoke-virtual {p0, v1}, La/l590;->J0(La/siq;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    iput-object p1, p0, La/l590;->N1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 50
    .line 51
    :cond_2
    invoke-virtual {p0}, La/l590;->K0()La/aid;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iget-object p1, p1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 56
    .line 57
    sget-object v1, La/qek0;->h:La/qek0;

    .line 58
    .line 59
    new-instance v2, La/ds60;

    .line 60
    .line 61
    const/16 v3, 0x17

    .line 62
    .line 63
    invoke-direct {v2, p0, v3}, La/ds60;-><init>(Ljava/lang/Object;B)V

    .line 64
    .line 65
    .line 66
    new-instance p0, La/ugd;

    .line 67
    .line 68
    const v3, 0x1f782e94

    .line 69
    .line 70
    .line 71
    const/4 v4, 0x1

    .line 72
    invoke-direct {p0, v3, v4, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-static {p1, v1, v0, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 76
    .line 77
    .line 78
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
    const-class v1, La/e590;

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
    instance-of v3, v0, La/e590;

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
    check-cast v2, La/e590;

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
    invoke-virtual {v2, v0}, La/e590;->a(La/i1w0;)La/v9i;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, La/v9i;->e()La/fiu0;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iput-object v1, p0, La/l590;->L1:La/fiu0;

    .line 68
    .line 69
    iget-object v0, v0, La/v9i;->v:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, La/ii;

    .line 72
    .line 73
    iput-object v0, p0, La/l590;->M1:La/ii;

    .line 74
    .line 75
    return-void

    .line 76
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 77
    .line 78
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public final G0(Lkotlin/jvm/functions/Function1;La/fet;I)V
    .locals 12

    .line 1
    const v0, 0x1821880a

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, p1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x4

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    move v0, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x2

    .line 17
    :goto_0
    or-int/2addr v0, p3

    .line 18
    invoke-virtual {p2, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    const/16 v2, 0x20

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/16 v2, 0x10

    .line 28
    .line 29
    :goto_1
    or-int/2addr v0, v2

    .line 30
    and-int/lit8 v2, v0, 0x13

    .line 31
    .line 32
    const/16 v3, 0x12

    .line 33
    .line 34
    const/4 v4, 0x1

    .line 35
    const/4 v5, 0x0

    .line 36
    if-eq v2, v3, :cond_2

    .line 37
    .line 38
    move v2, v4

    .line 39
    goto :goto_2

    .line 40
    :cond_2
    move v2, v5

    .line 41
    :goto_2
    and-int/lit8 v3, v0, 0x1

    .line 42
    .line 43
    invoke-virtual {p2, v3, v2}, La/fet;->U(IZ)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_8

    .line 48
    .line 49
    invoke-virtual {p0}, La/l590;->L0()La/k3t0;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    and-int/lit8 v0, v0, 0xe

    .line 54
    .line 55
    if-ne v0, v1, :cond_3

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_3
    move v4, v5

    .line 59
    :goto_3
    invoke-virtual {p2, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    or-int/2addr v0, v4

    .line 64
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    sget-object v2, La/ukd;->a:La/cl5;

    .line 69
    .line 70
    if-nez v0, :cond_4

    .line 71
    .line 72
    if-ne v1, v2, :cond_5

    .line 73
    .line 74
    :cond_4
    new-instance v1, La/ka70;

    .line 75
    .line 76
    const/16 v0, 0xc

    .line 77
    .line 78
    invoke-direct {v1, p1, p0, v0}, La/ka70;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :cond_5
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 85
    .line 86
    sget-object v0, La/or00;->a:La/zfn;

    .line 87
    .line 88
    invoke-virtual {p2, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    move-object v8, v0

    .line 93
    check-cast v8, La/clz;

    .line 94
    .line 95
    sget-object v0, La/lkz;->a:La/lkz;

    .line 96
    .line 97
    invoke-static {v1, p2}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 98
    .line 99
    .line 100
    move-result-object v9

    .line 101
    invoke-virtual {p2, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    invoke-virtual {p2, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    or-int/2addr v0, v1

    .line 110
    const/4 v1, 0x3

    .line 111
    invoke-virtual {p2, v1}, La/fet;->e(I)Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    or-int/2addr v0, v1

    .line 116
    invoke-virtual {p2, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    or-int/2addr v0, v1

    .line 121
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    if-nez v0, :cond_6

    .line 126
    .line 127
    if-ne v1, v2, :cond_7

    .line 128
    .line 129
    :cond_6
    new-instance v6, La/kc70;

    .line 130
    .line 131
    const/4 v10, 0x0

    .line 132
    const/4 v11, 0x2

    .line 133
    invoke-direct/range {v6 .. v11}, La/kc70;-><init>(La/k3t0;La/clz;La/pz40;La/yje;B)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p2, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    move-object v1, v6

    .line 140
    :cond_7
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 141
    .line 142
    invoke-static {p2, v8, v1}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 143
    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_8
    invoke-virtual {p2}, La/fet;->X()V

    .line 147
    .line 148
    .line 149
    :goto_4
    invoke-virtual {p2}, La/fet;->u()La/yfe0;

    .line 150
    .line 151
    .line 152
    move-result-object p2

    .line 153
    if-eqz p2, :cond_9

    .line 154
    .line 155
    new-instance v0, La/xd80;

    .line 156
    .line 157
    const/16 v1, 0x8

    .line 158
    .line 159
    invoke-direct {v0, p0, p1, p3, v1}, La/xd80;-><init>(Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 160
    .line 161
    .line 162
    iput-object v0, p2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 163
    .line 164
    :cond_9
    return-void
.end method

.method public final H0()V
    .locals 9

    .line 1
    iget-object v0, p0, La/l590;->P1:La/u690;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iget-object v1, p0, La/l590;->N1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 7
    .line 8
    if-eqz v1, :cond_5

    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    move-object v1, v3

    .line 19
    :goto_0
    if-nez v1, :cond_2

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_2
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-eqz v1, :cond_5

    .line 27
    .line 28
    invoke-virtual {p0, v1}, La/l590;->J0(La/siq;)V

    .line 29
    .line 30
    .line 31
    const/16 v1, 0x54d

    .line 32
    .line 33
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    new-instance v2, Lkotlin/Pair;

    .line 38
    .line 39
    const-string v4, "X-Mobile-Project-Id"

    .line 40
    .line 41
    invoke-direct {v2, v4, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object v1, v0, La/u690;->b:Ljava/lang/String;

    .line 45
    .line 46
    new-instance v4, Lkotlin/Pair;

    .line 47
    .line 48
    const-string v5, "x-mobile-app-authorization"

    .line 49
    .line 50
    invoke-direct {v4, v5, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    new-instance v5, Lkotlin/Pair;

    .line 54
    .line 55
    const-string v6, "X-Auth"

    .line 56
    .line 57
    invoke-direct {v5, v6, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    new-instance v1, Lkotlin/Pair;

    .line 61
    .line 62
    const-string v6, "mf-render-mode"

    .line 63
    .line 64
    const-string v7, "html"

    .line 65
    .line 66
    invoke-direct {v1, v6, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object v6, v0, La/u690;->c:Ljava/lang/String;

    .line 70
    .line 71
    new-instance v7, Lkotlin/Pair;

    .line 72
    .line 73
    const-string v8, "X-Country"

    .line 74
    .line 75
    invoke-direct {v7, v8, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    filled-new-array {v2, v4, v5, v1, v7}, [Lkotlin/Pair;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-static {v1}, La/xp20;->h([Lkotlin/Pair;)Ljava/util/LinkedHashMap;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    iget-object v2, v0, La/u690;->d:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-lez v4, :cond_3

    .line 93
    .line 94
    const-string v4, "X-Language"

    .line 95
    .line 96
    invoke-interface {v1, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    :cond_3
    iget-object v2, p0, La/l590;->N1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 100
    .line 101
    if-eqz v2, :cond_4

    .line 102
    .line 103
    iget-object v0, v0, La/u690;->a:Ljava/lang/String;

    .line 104
    .line 105
    invoke-virtual {v2, v0, v1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->d(Ljava/lang/String;Ljava/util/Map;)V

    .line 106
    .line 107
    .line 108
    :cond_4
    iput-object v3, p0, La/l590;->P1:La/u690;

    .line 109
    .line 110
    :cond_5
    :goto_1
    return-void
.end method

.method public final I0()V
    .locals 3

    .line 1
    iget-object v0, p0, La/l590;->W1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/qog0;

    .line 8
    .line 9
    new-instance v1, La/lz9;

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    invoke-direct {v1, v0, p0, v2}, La/lz9;-><init>(La/qog0;Landroidx/fragment/app/Fragment;B)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object p0, v0, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 19
    .line 20
    invoke-interface {p0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, La/qog0;->a()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final J0(La/siq;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, La/l590;->O1:Z

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
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

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
    new-instance v0, La/j590;

    .line 27
    .line 28
    invoke-direct {v0, p0}, La/j590;-><init>(La/l590;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0}, La/siq;->setFixedWebViewClient(La/tiq;)V

    .line 32
    .line 33
    .line 34
    new-instance v0, La/mzo;

    .line 35
    .line 36
    invoke-direct {v0, p0, v1}, La/mzo;-><init>(La/yx5;B)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 40
    .line 41
    .line 42
    iput-boolean v1, p0, La/l590;->O1:Z

    .line 43
    .line 44
    return-void
.end method

.method public final K0()La/aid;
    .locals 2

    .line 1
    sget-object v0, La/l590;->Z1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/l590;->K1:La/s0r;

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

.method public final L0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/l590;->X1:La/a8z;

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

.method public final M0(Z)V
    .locals 13

    .line 1
    iget-object v0, p0, La/l590;->M1:La/ii;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 6
    .line 7
    const v2, 0x7f1303fb

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const v3, 0x7f130f39

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const v4, 0x7f130f34

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const v5, 0x7f13032f

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    sget-object v10, La/n12;->a:La/n12;

    .line 39
    .line 40
    const/4 v11, 0x0

    .line 41
    const/16 v12, 0x5d0

    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    const-string v7, "CAMERA_PERMISSION_DIALOG"

    .line 45
    .line 46
    const/4 v8, 0x0

    .line 47
    const/4 v9, 0x0

    .line 48
    invoke-direct/range {v1 .. v12}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 59
    .line 60
    .line 61
    new-instance v0, La/h590;

    .line 62
    .line 63
    const/4 v1, 0x1

    .line 64
    invoke-direct {v0, p1, p0, v1}, La/h590;-><init>(ZLa/l590;B)V

    .line 65
    .line 66
    .line 67
    const-string p1, "CAMERA_PERMISSION_DIALOG"

    .line 68
    .line 69
    invoke-static {p0, p1, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_0
    const-string p0, "actionDialogManager"

    .line 74
    .line 75
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const/4 p0, 0x0

    .line 79
    throw p0
.end method

.method public final N0(Z)V
    .locals 13

    .line 1
    iget-object v0, p0, La/l590;->M1:La/ii;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 6
    .line 7
    const v2, 0x7f1303fb

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const v3, 0x7f130f3d

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const v4, 0x7f130f34

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const v5, 0x7f13032f

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    sget-object v10, La/n12;->a:La/n12;

    .line 39
    .line 40
    const/4 v11, 0x0

    .line 41
    const/16 v12, 0x5d0

    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    const-string v7, "PERMISSION_DIALOG"

    .line 45
    .line 46
    const/4 v8, 0x0

    .line 47
    const/4 v9, 0x0

    .line 48
    invoke-direct/range {v1 .. v12}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 59
    .line 60
    .line 61
    new-instance v0, La/h590;

    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    invoke-direct {v0, p1, p0, v1}, La/h590;-><init>(ZLa/l590;B)V

    .line 65
    .line 66
    .line 67
    const-string p1, "PERMISSION_DIALOG"

    .line 68
    .line 69
    invoke-static {p0, p1, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_0
    const-string p0, "actionDialogManager"

    .line 74
    .line 75
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const/4 p0, 0x0

    .line 79
    throw p0
.end method

.method public final Y()V
    .locals 2

    .line 1
    iget-object v0, p0, La/l590;->N1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, La/l590;->U1:La/bc0;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->a()V

    .line 11
    .line 12
    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, La/l590;->N1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput-boolean v0, p0, La/l590;->O1:Z

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 21
    .line 22
    return-void
.end method

.method public final Z()V
    .locals 3

    .line 1
    iget-object v0, p0, La/l590;->N1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

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
    iput-boolean v0, p0, La/l590;->O1:Z

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
    iget-object p0, p0, La/l590;->N1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

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
    invoke-virtual {p0}, La/l590;->K0()La/aid;

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
    iget-object p0, p0, La/l590;->N1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

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
    invoke-virtual {p0}, La/l590;->K0()La/aid;

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
    invoke-virtual {p0}, La/l590;->L0()La/k3t0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, La/v490;->a:La/v490;

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
