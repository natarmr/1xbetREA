.class public final La/tik0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/tik0;",
        "La/yx5;",
        "<init>",
        "()V",
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
.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public final K1:La/hnm0;

.field public L1:La/fiu0;

.field public M1:La/wdk0;

.field public N1:La/kd30;

.field public final O1:La/s0r;

.field public final P1:La/kiu0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/tik0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/feature/office/social/impl/databinding/FragmentSocialNetworksBinding;"

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
    sput-object v1, La/tik0;->Q1:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d02d6

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
    iput-object v0, p0, La/tik0;->K1:La/hnm0;

    .line 10
    .line 11
    sget-object v0, La/sik0;->a:La/sik0;

    .line 12
    .line 13
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, La/tik0;->O1:La/s0r;

    .line 18
    .line 19
    new-instance v0, La/rik0;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, p0, v1}, La/rik0;-><init>(La/tik0;B)V

    .line 23
    .line 24
    .line 25
    new-instance v1, La/l9i0;

    .line 26
    .line 27
    const/16 v2, 0x19

    .line 28
    .line 29
    invoke-direct {v1, p0, v2}, La/l9i0;-><init>(Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    sget-object v2, La/wez;->b:La/wez;

    .line 33
    .line 34
    new-instance v3, La/l9i0;

    .line 35
    .line 36
    const/16 v4, 0x1a

    .line 37
    .line 38
    invoke-direct {v3, v1, v4}, La/l9i0;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-class v2, La/cjk0;

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
    new-instance v3, La/s9i0;

    .line 54
    .line 55
    const/16 v4, 0x16

    .line 56
    .line 57
    invoke-direct {v3, v1, v4}, La/s9i0;-><init>(La/a8z;B)V

    .line 58
    .line 59
    .line 60
    new-instance v4, La/s9i0;

    .line 61
    .line 62
    const/16 v5, 0x17

    .line 63
    .line 64
    invoke-direct {v4, v1, v5}, La/s9i0;-><init>(La/a8z;B)V

    .line 65
    .line 66
    .line 67
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, p0, La/tik0;->P1:La/kiu0;

    .line 72
    .line 73
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/tik0;->H0()La/v4r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/v4r;->E:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 6
    .line 7
    new-instance v0, La/rik0;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-direct {v0, p0, v1}, La/rik0;-><init>(La/tik0;B)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0}, La/mc50;->a(La/mc50;Lkotlin/jvm/functions/Function0;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final C0()V
    .locals 19

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
    const-class v2, La/uik0;

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
    instance-of v4, v1, La/uik0;

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
    check-cast v3, La/uik0;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-object v5, v3, La/uik0;->a:La/cad;

    .line 65
    .line 66
    iget-object v9, v3, La/uik0;->b:La/duj;

    .line 67
    .line 68
    iget-object v10, v3, La/uik0;->c:La/m1e;

    .line 69
    .line 70
    iget-object v11, v3, La/uik0;->d:La/kt2;

    .line 71
    .line 72
    iget-object v12, v3, La/uik0;->e:La/sa10;

    .line 73
    .line 74
    iget-object v13, v3, La/uik0;->f:La/pru;

    .line 75
    .line 76
    iget-object v14, v3, La/uik0;->g:La/bzt;

    .line 77
    .line 78
    iget-object v15, v3, La/uik0;->h:La/btt0;

    .line 79
    .line 80
    iget-object v1, v3, La/uik0;->i:La/gii0;

    .line 81
    .line 82
    iget-object v2, v3, La/uik0;->j:La/wdk0;

    .line 83
    .line 84
    iget-object v6, v3, La/uik0;->k:La/d1p;

    .line 85
    .line 86
    iget-object v4, v3, La/uik0;->l:La/kd30;

    .line 87
    .line 88
    iget-object v7, v3, La/uik0;->m:La/yox;

    .line 89
    .line 90
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    move-object/from16 v18, v4

    .line 109
    .line 110
    new-instance v4, La/qv2;

    .line 111
    .line 112
    move-object/from16 v16, v1

    .line 113
    .line 114
    move-object/from16 v17, v2

    .line 115
    .line 116
    invoke-direct/range {v4 .. v18}, La/qv2;-><init>(La/cad;La/d1p;La/yox;La/i1w0;La/duj;La/m1e;La/kt2;La/sa10;La/pru;La/bzt;La/btt0;La/gii0;La/wdk0;La/kd30;)V

    .line 117
    .line 118
    .line 119
    move-object/from16 v1, v17

    .line 120
    .line 121
    move-object/from16 v2, v18

    .line 122
    .line 123
    new-instance v3, La/fiu0;

    .line 124
    .line 125
    iget-object v4, v4, La/qv2;->n:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v4, La/rti;

    .line 128
    .line 129
    const-class v5, La/cjk0;

    .line 130
    .line 131
    invoke-static {v5, v4}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    invoke-direct {v3, v4}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 136
    .line 137
    .line 138
    iput-object v3, v0, La/tik0;->L1:La/fiu0;

    .line 139
    .line 140
    iput-object v1, v0, La/tik0;->M1:La/wdk0;

    .line 141
    .line 142
    iput-object v2, v0, La/tik0;->N1:La/kd30;

    .line 143
    .line 144
    return-void

    .line 145
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 146
    .line 147
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    return-void
.end method

.method public final D0()V
    .locals 17

    .line 1
    invoke-virtual/range {p0 .. p0}, La/tik0;->I0()La/cjk0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/cjk0;->m:La/p7m0;

    .line 6
    .line 7
    new-instance v1, La/jbh0;

    .line 8
    .line 9
    const/4 v7, 0x4

    .line 10
    const/16 v8, 0x11

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    const-class v4, La/tik0;

    .line 14
    .line 15
    const-string v5, "handleSocialNetworkState"

    .line 16
    .line 17
    const-string v6, "handleSocialNetworkState(Lorg/xplatform/feature/office/social/impl/presentation/models/SocialNetworkStateModel;)V"

    .line 18
    .line 19
    move-object/from16 v3, p0

    .line 20
    .line 21
    invoke-direct/range {v1 .. v8}, La/jbh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 22
    .line 23
    .line 24
    sget-object v2, La/lkz;->a:La/lkz;

    .line 25
    .line 26
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    new-instance v5, La/myj0;

    .line 39
    .line 40
    const/4 v6, 0x0

    .line 41
    invoke-direct {v5, v0, v2, v1, v6}, La/myj0;-><init>(La/gmq;La/clz;La/jbh0;La/yje;)V

    .line 42
    .line 43
    .line 44
    const/4 v0, 0x3

    .line 45
    invoke-static {v3, v6, v6, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 46
    .line 47
    .line 48
    invoke-virtual/range {p0 .. p0}, La/tik0;->I0()La/cjk0;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    iget-object v1, v1, La/cjk0;->n:La/p7m0;

    .line 53
    .line 54
    new-instance v2, La/qaf0;

    .line 55
    .line 56
    const/4 v3, 0x5

    .line 57
    invoke-direct {v2, v1, v3}, La/qaf0;-><init>(La/gmq;B)V

    .line 58
    .line 59
    .line 60
    new-instance v9, La/jbh0;

    .line 61
    .line 62
    const/4 v15, 0x4

    .line 63
    const/16 v16, 0x12

    .line 64
    .line 65
    const/4 v10, 0x2

    .line 66
    const-string v13, "handleAction"

    .line 67
    .line 68
    const-string v14, "handleAction(Lorg/xplatform/feature/office/social/impl/presentation/SocialNetworksViewModel$Action;)V"

    .line 69
    .line 70
    move-object/from16 v11, p0

    .line 71
    .line 72
    move-object v12, v4

    .line 73
    invoke-direct/range {v9 .. v16}, La/jbh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 74
    .line 75
    .line 76
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    new-instance v4, La/myj0;

    .line 89
    .line 90
    invoke-direct {v4, v2, v1, v9, v6}, La/myj0;-><init>(La/qaf0;La/clz;La/jbh0;La/yje;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v3, v6, v6, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public final G0(ZLandroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/FrameLayout;Lorg/xplatform/uikit/components/cells/right/DsCellRightButton;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 3
    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    new-instance p1, La/thj0;

    .line 8
    .line 9
    const/16 p5, 0x1d

    .line 10
    .line 11
    invoke-direct {p1, p5}, La/thj0;-><init>(B)V

    .line 12
    .line 13
    .line 14
    invoke-static {p2, p1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    const p1, 0x7f131306

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p4, p1}, Lorg/xplatform/uikit/components/buttons/DsButton;->l(Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p4, v0}, Lorg/xplatform/uikit/components/buttons/DsButton;->setEnabled(Z)V

    .line 34
    .line 35
    .line 36
    sget-object p1, La/j5d;->a:Landroid/util/TypedValue;

    .line 37
    .line 38
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    const p1, 0x7f040b0b

    .line 43
    .line 44
    .line 45
    invoke-static {p0, p1, v0}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    invoke-virtual {p4, p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->m(I)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_0
    const/4 p1, 0x1

    .line 54
    invoke-virtual {p4, p1}, Lorg/xplatform/uikit/components/buttons/DsButton;->setEnabled(Z)V

    .line 55
    .line 56
    .line 57
    new-instance p1, La/z08;

    .line 58
    .line 59
    const/16 p2, 0x13

    .line 60
    .line 61
    invoke-direct {p1, p0, p5, p2}, La/z08;-><init>(Ljava/lang/Object;IB)V

    .line 62
    .line 63
    .line 64
    invoke-static {p4, p1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 65
    .line 66
    .line 67
    const/16 p1, 0x8

    .line 68
    .line 69
    invoke-virtual {p3, p1}, Landroid/view/View;->setVisibility(I)V

    .line 70
    .line 71
    .line 72
    const p1, 0x7f1304e1

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p4, p1}, Lorg/xplatform/uikit/components/buttons/DsButton;->l(Ljava/lang/CharSequence;)V

    .line 83
    .line 84
    .line 85
    sget-object p1, La/j5d;->a:Landroid/util/TypedValue;

    .line 86
    .line 87
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    const p1, 0x7f040afc

    .line 92
    .line 93
    .line 94
    invoke-static {p0, p1, v0}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    invoke-virtual {p4, p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->m(I)V

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public final H0()La/v4r;
    .locals 2

    .line 1
    sget-object v0, La/tik0;->Q1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/tik0;->O1:La/s0r;

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
    check-cast p0, La/v4r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final I0()La/cjk0;
    .locals 0

    .line 1
    iget-object p0, p0, La/tik0;->P1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/cjk0;

    .line 8
    .line 9
    return-object p0
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
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const p2, 0x7f05000f

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const p2, 0x7f070714

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-virtual {p0}, La/tik0;->H0()La/v4r;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    iget-object v0, p0, La/v4r;->D:Landroid/widget/ScrollView;

    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    const/16 v5, 0xa

    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    move v3, v1

    .line 46
    invoke-static/range {v0 .. v5}, La/sj3;->L0(Landroid/view/View;IIIII)V

    .line 47
    .line 48
    .line 49
    :cond_0
    return-void
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/tik0;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
