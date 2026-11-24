.class public final La/bib;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/cg60;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/bib;",
        "La/yx5;",
        "La/cg60;",
        "<init>",
        "()V",
        "a/bj5",
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
.field public static final X1:La/bj5;

.field public static final synthetic Y1:[La/iiy;

.field public static final Z1:Lkotlin/ranges/IntRange;

.field public static final a2:Lkotlin/ranges/IntRange;


# instance fields
.field public final K1:La/s0r;

.field public L1:La/fiu0;

.field public M1:La/vby;

.field public N1:La/grj;

.field public O1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

.field public P1:La/bc0;

.field public Q1:Ljava/lang/Integer;

.field public R1:Z

.field public S1:Z

.field public U1:Z

.field public V1:Z

.field public final W1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/bib;

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
    new-array v2, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v2, v4

    .line 17
    .line 18
    sput-object v2, La/bib;->Y1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/bj5;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/bib;->X1:La/bj5;

    .line 26
    .line 27
    new-instance v0, Lkotlin/ranges/IntRange;

    .line 28
    .line 29
    const/16 v2, 0x190

    .line 30
    .line 31
    const/16 v3, 0x1f3

    .line 32
    .line 33
    invoke-direct {v0, v2, v3, v1}, Lkotlin/ranges/a;-><init>(III)V

    .line 34
    .line 35
    .line 36
    sput-object v0, La/bib;->Z1:Lkotlin/ranges/IntRange;

    .line 37
    .line 38
    new-instance v0, Lkotlin/ranges/IntRange;

    .line 39
    .line 40
    const/16 v2, 0x1f4

    .line 41
    .line 42
    const/16 v3, 0x257

    .line 43
    .line 44
    invoke-direct {v0, v2, v3, v1}, Lkotlin/ranges/a;-><init>(III)V

    .line 45
    .line 46
    .line 47
    sput-object v0, La/bib;->a2:Lkotlin/ranges/IntRange;

    .line 48
    .line 49
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
    sget-object v0, La/aib;->a:La/aib;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/bib;->K1:La/s0r;

    .line 14
    .line 15
    const-class v0, La/ajb;

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
    new-instance v1, La/whb;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-direct {v1, p0, v2}, La/whb;-><init>(La/bib;B)V

    .line 27
    .line 28
    .line 29
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, La/bib;->W1:La/a8z;

    .line 34
    .line 35
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
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance v1, La/yhb;

    .line 27
    .line 28
    invoke-direct {v1, p0, p1}, La/yhb;-><init>(La/bib;Landroid/view/View;)V

    .line 29
    .line 30
    .line 31
    sget-object v2, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 32
    .line 33
    invoke-static {p1, v1}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, La/bib;->O1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 37
    .line 38
    if-nez p1, :cond_2

    .line 39
    .line 40
    new-instance p1, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-direct {p1, v1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;-><init>(Landroid/content/Context;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    invoke-virtual {p0, v1}, La/bib;->H0(La/siq;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    iput-object p1, p0, La/bib;->O1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 59
    .line 60
    :cond_2
    new-instance v1, La/whb;

    .line 61
    .line 62
    const/4 v2, 0x1

    .line 63
    invoke-direct {v1, p0, v2}, La/whb;-><init>(La/bib;B)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->setDetaching(Lkotlin/jvm/functions/Function0;)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, La/bib;->O1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 70
    .line 71
    if-nez p1, :cond_3

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    iget-object v1, p0, La/bib;->P1:La/bc0;

    .line 75
    .line 76
    if-eqz v1, :cond_4

    .line 77
    .line 78
    invoke-virtual {p1, v1}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 79
    .line 80
    .line 81
    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_5

    .line 86
    .line 87
    invoke-virtual {p0}, La/bib;->K0()V

    .line 88
    .line 89
    .line 90
    :cond_5
    new-instance v1, La/bc0;

    .line 91
    .line 92
    const/4 v3, 0x3

    .line 93
    invoke-direct {v1, p0, v3}, La/bc0;-><init>(Ljava/lang/Object;B)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 97
    .line 98
    .line 99
    iput-object v1, p0, La/bib;->P1:La/bc0;

    .line 100
    .line 101
    :goto_0
    invoke-virtual {p0}, La/bib;->I0()La/aid;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    iget-object p1, p1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 106
    .line 107
    sget-object v1, La/qek0;->h:La/qek0;

    .line 108
    .line 109
    new-instance v3, La/bna;

    .line 110
    .line 111
    const/16 v4, 0x12

    .line 112
    .line 113
    invoke-direct {v3, p0, v4}, La/bna;-><init>(Ljava/lang/Object;B)V

    .line 114
    .line 115
    .line 116
    new-instance p0, La/ugd;

    .line 117
    .line 118
    const v4, -0x660cbbd7

    .line 119
    .line 120
    .line 121
    invoke-direct {p0, v4, v2, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    invoke-static {p1, v1, v0, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public final C0()V
    .locals 22

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
    const-class v2, La/uhb;

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
    instance-of v4, v1, La/uhb;

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
    check-cast v3, La/uhb;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-object v7, v3, La/uhb;->a:La/ntu;

    .line 65
    .line 66
    iget-object v8, v3, La/uhb;->b:La/n4u;

    .line 67
    .line 68
    iget-object v9, v3, La/uhb;->c:La/wgu;

    .line 69
    .line 70
    iget-object v10, v3, La/uhb;->d:La/iqt;

    .line 71
    .line 72
    iget-object v11, v3, La/uhb;->e:La/jqt;

    .line 73
    .line 74
    iget-object v12, v3, La/uhb;->f:La/hru;

    .line 75
    .line 76
    iget-object v13, v3, La/uhb;->g:La/m1e;

    .line 77
    .line 78
    iget-object v14, v3, La/uhb;->h:La/mne;

    .line 79
    .line 80
    iget-object v15, v3, La/uhb;->i:La/duj;

    .line 81
    .line 82
    iget-object v1, v3, La/uhb;->j:La/ctf0;

    .line 83
    .line 84
    iget-object v2, v3, La/uhb;->k:La/g2v;

    .line 85
    .line 86
    iget-object v4, v3, La/uhb;->l:La/j1q0;

    .line 87
    .line 88
    iget-object v5, v3, La/uhb;->m:La/vby;

    .line 89
    .line 90
    move-object/from16 v16, v1

    .line 91
    .line 92
    iget-object v1, v3, La/uhb;->n:La/grj;

    .line 93
    .line 94
    move-object/from16 v19, v5

    .line 95
    .line 96
    iget-object v5, v3, La/uhb;->o:La/wsf0;

    .line 97
    .line 98
    iget-object v3, v3, La/uhb;->p:La/pru;

    .line 99
    .line 100
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    move-object/from16 v18, v4

    .line 116
    .line 117
    new-instance v4, La/h6i;

    .line 118
    .line 119
    move-object/from16 v20, v1

    .line 120
    .line 121
    move-object/from16 v17, v2

    .line 122
    .line 123
    move-object/from16 v21, v3

    .line 124
    .line 125
    invoke-direct/range {v4 .. v21}, La/h6i;-><init>(La/wsf0;La/i1w0;La/ntu;La/n4u;La/wgu;La/iqt;La/jqt;La/hru;La/m1e;La/mne;La/duj;La/ctf0;La/g2v;La/j1q0;La/vby;La/grj;La/pru;)V

    .line 126
    .line 127
    .line 128
    move-object/from16 v1, v19

    .line 129
    .line 130
    move-object/from16 v2, v20

    .line 131
    .line 132
    new-instance v3, La/fiu0;

    .line 133
    .line 134
    iget-object v4, v4, La/h6i;->c:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v4, La/pai;

    .line 137
    .line 138
    const-class v5, La/ajb;

    .line 139
    .line 140
    invoke-static {v5, v4}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    invoke-direct {v3, v4}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 145
    .line 146
    .line 147
    iput-object v3, v0, La/bib;->L1:La/fiu0;

    .line 148
    .line 149
    iput-object v1, v0, La/bib;->M1:La/vby;

    .line 150
    .line 151
    iput-object v2, v0, La/bib;->N1:La/grj;

    .line 152
    .line 153
    return-void

    .line 154
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 155
    .line 156
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
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
    const v2, 0x64b94fd2

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
    const/4 v3, 0x2

    .line 20
    const/4 v9, 0x4

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    move v2, v9

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v2, v3

    .line 26
    :goto_0
    or-int/2addr v2, v8

    .line 27
    invoke-virtual {v5, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    const/16 v4, 0x20

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const/16 v4, 0x10

    .line 37
    .line 38
    :goto_1
    or-int v10, v2, v4

    .line 39
    .line 40
    and-int/lit8 v2, v10, 0x13

    .line 41
    .line 42
    const/16 v4, 0x12

    .line 43
    .line 44
    const/4 v11, 0x1

    .line 45
    const/4 v12, 0x0

    .line 46
    if-eq v2, v4, :cond_2

    .line 47
    .line 48
    move v2, v11

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move v2, v12

    .line 51
    :goto_2
    and-int/lit8 v4, v10, 0x1

    .line 52
    .line 53
    invoke-virtual {v5, v4, v2}, La/fet;->U(IZ)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_a

    .line 58
    .line 59
    invoke-virtual {v5, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    sget-object v13, La/ukd;->a:La/cl5;

    .line 68
    .line 69
    if-nez v2, :cond_3

    .line 70
    .line 71
    if-ne v4, v13, :cond_4

    .line 72
    .line 73
    :cond_3
    new-instance v4, La/whb;

    .line 74
    .line 75
    invoke-direct {v4, v0, v3}, La/whb;-><init>(La/bib;B)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v5, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :cond_4
    move-object v3, v4

    .line 82
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 83
    .line 84
    const/4 v6, 0x0

    .line 85
    const/4 v7, 0x5

    .line 86
    const/4 v2, 0x0

    .line 87
    const/4 v4, 0x0

    .line 88
    invoke-static/range {v2 .. v7}, La/v3c;->A(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, La/bib;->J0()La/k3t0;

    .line 92
    .line 93
    .line 94
    move-result-object v15

    .line 95
    and-int/lit8 v2, v10, 0xe

    .line 96
    .line 97
    if-ne v2, v9, :cond_5

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_5
    move v11, v12

    .line 101
    :goto_3
    invoke-virtual {v5, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    or-int/2addr v2, v11

    .line 106
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    if-nez v2, :cond_6

    .line 111
    .line 112
    if-ne v3, v13, :cond_7

    .line 113
    .line 114
    :cond_6
    new-instance v3, La/op7;

    .line 115
    .line 116
    const/16 v2, 0x17

    .line 117
    .line 118
    invoke-direct {v3, v1, v0, v2}, La/op7;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v5, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    :cond_7
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 125
    .line 126
    sget-object v2, La/or00;->a:La/zfn;

    .line 127
    .line 128
    invoke-virtual {v5, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    check-cast v2, La/clz;

    .line 133
    .line 134
    sget-object v4, La/lkz;->a:La/lkz;

    .line 135
    .line 136
    invoke-static {v3, v5}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    invoke-virtual {v5, v15}, La/fet;->i(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    invoke-virtual {v5, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v6

    .line 148
    or-int/2addr v4, v6

    .line 149
    const/4 v6, 0x3

    .line 150
    invoke-virtual {v5, v6}, La/fet;->e(I)Z

    .line 151
    .line 152
    .line 153
    move-result v6

    .line 154
    or-int/2addr v4, v6

    .line 155
    invoke-virtual {v5, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    or-int/2addr v4, v6

    .line 160
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    if-nez v4, :cond_8

    .line 165
    .line 166
    if-ne v6, v13, :cond_9

    .line 167
    .line 168
    :cond_8
    new-instance v14, La/pc;

    .line 169
    .line 170
    const/16 v18, 0x0

    .line 171
    .line 172
    const/16 v19, 0x7

    .line 173
    .line 174
    move-object/from16 v16, v2

    .line 175
    .line 176
    move-object/from16 v17, v3

    .line 177
    .line 178
    invoke-direct/range {v14 .. v19}, La/pc;-><init>(La/k3t0;La/clz;La/pz40;La/yje;B)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v5, v14}, La/fet;->o0(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    move-object v6, v14

    .line 185
    :cond_9
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 186
    .line 187
    invoke-static {v5, v2, v6}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 188
    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_a
    invoke-virtual {v5}, La/fet;->X()V

    .line 192
    .line 193
    .line 194
    :goto_4
    invoke-virtual {v5}, La/fet;->u()La/yfe0;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    if-eqz v2, :cond_b

    .line 199
    .line 200
    new-instance v3, La/kea;

    .line 201
    .line 202
    const/16 v4, 0xf

    .line 203
    .line 204
    invoke-direct {v3, v0, v1, v8, v4}, La/kea;-><init>(Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 205
    .line 206
    .line 207
    iput-object v3, v2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 208
    .line 209
    :cond_b
    return-void
.end method

.method public final H0(La/siq;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, La/bib;->S1:Z

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
    new-instance v0, La/cib;

    .line 27
    .line 28
    iget-object v2, p0, La/bib;->M1:La/vby;

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    new-instance v3, La/lya;

    .line 33
    .line 34
    const/4 v4, 0x7

    .line 35
    invoke-direct {v3, p0, v4}, La/lya;-><init>(Ljava/lang/Object;B)V

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v2, v3}, La/cib;-><init>(La/vby;La/lya;)V

    .line 39
    .line 40
    .line 41
    const-string v2, "MobileAppApiV2"

    .line 42
    .line 43
    invoke-virtual {p1, v0, v2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    new-instance v0, La/xhb;

    .line 47
    .line 48
    invoke-direct {v0, p0}, La/xhb;-><init>(La/bib;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v0}, La/siq;->setFixedWebViewClient(La/tiq;)V

    .line 52
    .line 53
    .line 54
    iput-boolean v1, p0, La/bib;->S1:Z

    .line 55
    .line 56
    return-void

    .line 57
    :cond_1
    const-string p0, "json"

    .line 58
    .line 59
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const/4 p0, 0x0

    .line 63
    throw p0
.end method

.method public final I0()La/aid;
    .locals 2

    .line 1
    sget-object v0, La/bib;->Y1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/bib;->K1:La/s0r;

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
    iget-object p0, p0, La/bib;->W1:La/a8z;

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
    iget-object v0, p0, La/bib;->O1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

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
    iget-object v1, p0, La/bib;->Q1:Ljava/lang/Integer;

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
    iput-boolean v1, p0, La/bib;->R1:Z

    .line 27
    .line 28
    invoke-virtual {p0}, La/bib;->J0()La/k3t0;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    sget-object v2, La/mhb;->a:La/mhb;

    .line 33
    .line 34
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v0}, La/bib;->H0(La/siq;)V

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
    iget-boolean v0, p0, La/bib;->U1:Z

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
    iput-boolean v0, p0, La/bib;->U1:Z

    .line 8
    .line 9
    invoke-virtual {p0}, La/bib;->J0()La/k3t0;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget-object v0, La/khb;->a:La/khb;

    .line 14
    .line 15
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final Y()V
    .locals 2

    .line 1
    iget-object v0, p0, La/bib;->O1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v1, p0, La/bib;->P1:La/bc0;

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
    iput-object v1, p0, La/bib;->P1:La/bc0;

    .line 15
    .line 16
    iput-object v1, p0, La/bib;->O1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    iput-boolean v1, p0, La/bib;->S1:Z

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
    iget-object v0, p0, La/bib;->O1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

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
    iput-boolean v0, p0, La/bib;->S1:Z

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
    iget-object p0, p0, La/bib;->O1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

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
    invoke-virtual {p0}, La/bib;->I0()La/aid;

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
    iget-object p0, p0, La/bib;->O1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

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
    invoke-virtual {p0}, La/bib;->I0()La/aid;

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
    .locals 2

    .line 1
    iget-object v0, p0, La/bib;->O1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x1

    .line 16
    if-ne v0, v1, :cond_1

    .line 17
    .line 18
    iget-object p0, p0, La/bib;->O1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/webkit/WebView;->goBack()V

    .line 29
    .line 30
    .line 31
    :cond_0
    return v1

    .line 32
    :cond_1
    invoke-virtual {p0}, La/bib;->J0()La/k3t0;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    sget-object v0, La/ohb;->a:La/ohb;

    .line 37
    .line 38
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    return p0
.end method
