.class public final La/dce;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/dce;",
        "La/yx5;",
        "<init>",
        "()V",
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
.field public static final Q1:La/kwd;

.field public static final synthetic R1:[La/iiy;


# instance fields
.field public final K1:La/hnm0;

.field public L1:La/fiu0;

.field public M1:La/wdk0;

.field public final N1:La/kiu0;

.field public final O1:La/s0r;

.field public final P1:La/cgx0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/dce;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/rules/impl/databinding/FragmentContactsBinding;"

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
    const-string v3, "showNavBarArg"

    .line 16
    .line 17
    const-string v5, "getShowNavBarArg()Z"

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
    sput-object v1, La/dce;->R1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/kwd;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/dce;->Q1:La/kwd;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d0222

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
    iput-object v0, p0, La/dce;->K1:La/hnm0;

    .line 10
    .line 11
    new-instance v0, La/zbe;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {v0, p0, v1}, La/zbe;-><init>(La/dce;B)V

    .line 15
    .line 16
    .line 17
    new-instance v2, La/svc;

    .line 18
    .line 19
    const/16 v3, 0x18

    .line 20
    .line 21
    invoke-direct {v2, p0, v3}, La/svc;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    sget-object v3, La/wez;->b:La/wez;

    .line 25
    .line 26
    new-instance v4, La/svc;

    .line 27
    .line 28
    const/16 v5, 0x19

    .line 29
    .line 30
    invoke-direct {v4, v2, v5}, La/svc;-><init>(Ljava/lang/Object;B)V

    .line 31
    .line 32
    .line 33
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const-class v3, La/pce;

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
    new-instance v4, La/cce;

    .line 46
    .line 47
    const/4 v5, 0x0

    .line 48
    invoke-direct {v4, v2, v5}, La/cce;-><init>(La/a8z;B)V

    .line 49
    .line 50
    .line 51
    new-instance v5, La/cce;

    .line 52
    .line 53
    invoke-direct {v5, v2, v1}, La/cce;-><init>(La/a8z;B)V

    .line 54
    .line 55
    .line 56
    invoke-static {p0, v3, v4, v5, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iput-object v0, p0, La/dce;->N1:La/kiu0;

    .line 61
    .line 62
    sget-object v0, La/ace;->a:La/ace;

    .line 63
    .line 64
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, La/dce;->O1:La/s0r;

    .line 69
    .line 70
    new-instance v0, La/cgx0;

    .line 71
    .line 72
    const-string v1, "SHOW_NAV_BAR"

    .line 73
    .line 74
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iput-object v0, p0, La/dce;->P1:La/cgx0;

    .line 78
    .line 79
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/dce;->G0()La/lzq;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/lzq;->d:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const v1, 0x7f130a4f

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->setTitle(Ljava/lang/CharSequence;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, La/zbe;

    .line 22
    .line 23
    const/4 v1, 0x2

    .line 24
    invoke-direct {v0, p0, v1}, La/zbe;-><init>(La/dce;B)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b(Lkotlin/jvm/functions/Function0;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, La/dce;->G0()La/lzq;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object p1, p1, La/lzq;->c:Lorg/xplatform/rules/impl/util/ContactsWebView;

    .line 35
    .line 36
    sget-object v0, La/dce;->R1:[La/iiy;

    .line 37
    .line 38
    const/4 v1, 0x1

    .line 39
    aget-object v0, v0, v1

    .line 40
    .line 41
    iget-object v1, p0, La/dce;->P1:La/cgx0;

    .line 42
    .line 43
    invoke-virtual {v1, p0, v0}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-static {p1, v0}, La/knm0;->h(Landroid/view/View;Z)V

    .line 52
    .line 53
    .line 54
    new-instance v0, La/ejd;

    .line 55
    .line 56
    const/16 v1, 0xc

    .line 57
    .line 58
    invoke-direct {v0, p0, v1}, La/ejd;-><init>(Ljava/lang/Object;B)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v0}, Lorg/xplatform/rules/impl/util/ContactsWebView;->setOnHyperlinkClick(Lkotlin/jvm/functions/Function1;)V

    .line 62
    .line 63
    .line 64
    new-instance v0, La/zbe;

    .line 65
    .line 66
    const/4 v1, 0x0

    .line 67
    invoke-direct {v0, p0, v1}, La/zbe;-><init>(La/dce;B)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v0}, Lorg/xplatform/rules/impl/util/ContactsWebView;->setOnHyperlinkOpenFailed(Lkotlin/jvm/functions/Function0;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public final C0()V
    .locals 18

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
    const-class v2, La/ece;

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
    instance-of v4, v1, La/ece;

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
    check-cast v3, La/ece;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-object v6, v3, La/ece;->a:La/duj;

    .line 65
    .line 66
    iget-object v7, v3, La/ece;->c:La/m1e;

    .line 67
    .line 68
    iget-object v8, v3, La/ece;->b:La/gg5;

    .line 69
    .line 70
    iget-object v5, v3, La/ece;->d:La/cad;

    .line 71
    .line 72
    iget-object v10, v3, La/ece;->e:La/sa10;

    .line 73
    .line 74
    iget-object v11, v3, La/ece;->f:La/gii0;

    .line 75
    .line 76
    iget-object v12, v3, La/ece;->g:La/ntu;

    .line 77
    .line 78
    iget-object v13, v3, La/ece;->h:La/knf0;

    .line 79
    .line 80
    iget-object v14, v3, La/ece;->i:La/x0u;

    .line 81
    .line 82
    iget-object v15, v3, La/ece;->k:La/b3c0;

    .line 83
    .line 84
    iget-object v1, v3, La/ece;->j:La/iqt;

    .line 85
    .line 86
    iget-object v2, v3, La/ece;->l:La/wdk0;

    .line 87
    .line 88
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    new-instance v4, La/qv2;

    .line 104
    .line 105
    move-object/from16 v16, v1

    .line 106
    .line 107
    move-object/from16 v17, v2

    .line 108
    .line 109
    invoke-direct/range {v4 .. v17}, La/qv2;-><init>(La/cad;La/duj;La/m1e;La/gg5;La/i1w0;La/sa10;La/gii0;La/ntu;La/knf0;La/x0u;La/b3c0;La/iqt;La/wdk0;)V

    .line 110
    .line 111
    .line 112
    move-object/from16 v1, v17

    .line 113
    .line 114
    new-instance v2, La/fiu0;

    .line 115
    .line 116
    iget-object v3, v4, La/qv2;->n:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v3, La/uci;

    .line 119
    .line 120
    const-class v4, La/pce;

    .line 121
    .line 122
    invoke-static {v4, v3}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-direct {v2, v3}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 127
    .line 128
    .line 129
    iput-object v2, v0, La/dce;->L1:La/fiu0;

    .line 130
    .line 131
    iput-object v1, v0, La/dce;->M1:La/wdk0;

    .line 132
    .line 133
    return-void

    .line 134
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 135
    .line 136
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    return-void
.end method

.method public final D0()V
    .locals 7

    .line 1
    iget-object v0, p0, La/dce;->N1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, La/pce;

    .line 8
    .line 9
    iget-object v1, v1, La/pce;->k:La/p7m0;

    .line 10
    .line 11
    new-instance v2, La/i89;

    .line 12
    .line 13
    const/16 v3, 0xa

    .line 14
    .line 15
    invoke-direct {v2, v1, v3}, La/i89;-><init>(La/gmq;B)V

    .line 16
    .line 17
    .line 18
    new-instance v1, La/bce;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-direct {v1, p0, v4, v3}, La/bce;-><init>(La/dce;La/yje;B)V

    .line 23
    .line 24
    .line 25
    sget-object v3, La/lkz;->a:La/lkz;

    .line 26
    .line 27
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-static {v5}, La/x0x;->Q(La/glz;)La/tkz;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    new-instance v6, La/cxd;

    .line 40
    .line 41
    invoke-direct {v6, v2, v3, v1, v4}, La/cxd;-><init>(La/i89;La/clz;La/bce;La/yje;)V

    .line 42
    .line 43
    .line 44
    const/4 v1, 0x3

    .line 45
    invoke-static {v5, v4, v4, v6, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, La/pce;

    .line 53
    .line 54
    iget-object v0, v0, La/pce;->l:La/q99;

    .line 55
    .line 56
    invoke-static {v0}, La/xkb;->V(La/htb;)La/itb;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    new-instance v2, La/bce;

    .line 61
    .line 62
    const/4 v3, 0x1

    .line 63
    invoke-direct {v2, p0, v4, v3}, La/bce;-><init>(La/dce;La/yje;B)V

    .line 64
    .line 65
    .line 66
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    new-instance v5, La/cxd;

    .line 79
    .line 80
    invoke-direct {v5, v0, p0, v2, v4}, La/cxd;-><init>(La/itb;La/clz;La/bce;La/yje;)V

    .line 81
    .line 82
    .line 83
    invoke-static {v3, v4, v4, v5, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public final G0()La/lzq;
    .locals 2

    .line 1
    sget-object v0, La/dce;->R1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/dce;->O1:La/s0r;

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
    check-cast p0, La/lzq;

    .line 16
    .line 17
    return-object p0
.end method

.method public final x0()Z
    .locals 2

    .line 1
    sget-object v0, La/dce;->R1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/dce;->P1:La/cgx0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/dce;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
