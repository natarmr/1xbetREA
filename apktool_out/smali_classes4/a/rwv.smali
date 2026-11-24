.class public final La/rwv;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/cg60;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/rwv;",
        "La/yx5;",
        "La/cg60;",
        "<init>",
        "()V",
        "a/sqt",
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
.field public static final P1:La/sqt;

.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public final K1:La/s0r;

.field public L1:La/fiu0;

.field public M1:La/wdk0;

.field public final N1:La/kiu0;

.field public final O1:La/cgx0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/rwv;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/feature/hidden_betting/impl/databinding/HiddenBettingUpdateFragmentBinding;"

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
    const-string v3, "showCloseButton"

    .line 16
    .line 17
    const-string v5, "getShowCloseButton()Z"

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
    sput-object v1, La/rwv;->Q1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/sqt;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/rwv;->P1:La/sqt;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d0329

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/pwv;->a:La/pwv;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/rwv;->K1:La/s0r;

    .line 14
    .line 15
    new-instance v0, La/bdv;

    .line 16
    .line 17
    const/16 v1, 0xb

    .line 18
    .line 19
    invoke-direct {v0, p0, v1}, La/bdv;-><init>(Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    new-instance v1, La/t7t;

    .line 23
    .line 24
    const/16 v2, 0x10

    .line 25
    .line 26
    invoke-direct {v1, p0, v2}, La/t7t;-><init>(Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    sget-object v2, La/wez;->b:La/wez;

    .line 30
    .line 31
    new-instance v3, La/t7t;

    .line 32
    .line 33
    const/16 v4, 0x11

    .line 34
    .line 35
    invoke-direct {v3, v1, v4}, La/t7t;-><init>(Ljava/lang/Object;B)V

    .line 36
    .line 37
    .line 38
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const-class v2, La/uwv;

    .line 43
    .line 44
    sget-object v3, La/sre0;->a:La/tre0;

    .line 45
    .line 46
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    new-instance v3, La/qwv;

    .line 51
    .line 52
    const/4 v4, 0x0

    .line 53
    invoke-direct {v3, v1, v4}, La/qwv;-><init>(La/a8z;B)V

    .line 54
    .line 55
    .line 56
    new-instance v4, La/qwv;

    .line 57
    .line 58
    const/4 v5, 0x1

    .line 59
    invoke-direct {v4, v1, v5}, La/qwv;-><init>(La/a8z;B)V

    .line 60
    .line 61
    .line 62
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iput-object v0, p0, La/rwv;->N1:La/kiu0;

    .line 67
    .line 68
    new-instance v0, La/cgx0;

    .line 69
    .line 70
    const-string v1, "SHOW_CLOSE_BUTTON_ITEM"

    .line 71
    .line 72
    invoke-direct {v0, v1, v5}, La/cgx0;-><init>(Ljava/lang/String;Z)V

    .line 73
    .line 74
    .line 75
    iput-object v0, p0, La/rwv;->O1:La/cgx0;

    .line 76
    .line 77
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/rwv;->G0()La/swv;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/swv;->c:Landroid/widget/ImageView;

    .line 6
    .line 7
    sget-object v0, La/rwv;->Q1:[La/iiy;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    aget-object v0, v0, v1

    .line 11
    .line 12
    iget-object v2, p0, La/rwv;->O1:La/cgx0;

    .line 13
    .line 14
    invoke-virtual {v2, p0, v0}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v2, 0x0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    move v0, v2

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/16 v0, 0x8

    .line 28
    .line 29
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, La/rwv;->G0()La/swv;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget-object p1, p1, La/swv;->c:Landroid/widget/ImageView;

    .line 37
    .line 38
    new-instance v0, La/owv;

    .line 39
    .line 40
    invoke-direct {v0, p0, v2}, La/owv;-><init>(La/rwv;B)V

    .line 41
    .line 42
    .line 43
    invoke-static {p1, v0}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, La/rwv;->G0()La/swv;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget-object p1, p1, La/swv;->b:Landroid/widget/Button;

    .line 51
    .line 52
    new-instance v0, La/owv;

    .line 53
    .line 54
    invoke-direct {v0, p0, v1}, La/owv;-><init>(La/rwv;B)V

    .line 55
    .line 56
    .line 57
    invoke-static {p1, v0}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final C0()V
    .locals 6

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
    const-class v1, La/mwv;

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
    instance-of v3, v0, La/mwv;

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
    check-cast v2, La/mwv;

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
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v1, v2, La/mwv;->a:La/q7d0;

    .line 63
    .line 64
    iget-object v3, v2, La/mwv;->b:La/gii0;

    .line 65
    .line 66
    iget-object v4, v2, La/mwv;->c:La/knf0;

    .line 67
    .line 68
    iget-object v2, v2, La/mwv;->d:La/wdk0;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    new-instance v5, La/gr00;

    .line 83
    .line 84
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 85
    .line 86
    .line 87
    iput-object v4, v5, La/gr00;->a:Ljava/lang/Object;

    .line 88
    .line 89
    iput-object v3, v5, La/gr00;->b:Ljava/lang/Object;

    .line 90
    .line 91
    iput-object v1, v5, La/gr00;->c:Ljava/lang/Object;

    .line 92
    .line 93
    iput-object v0, v5, La/gr00;->d:Ljava/lang/Object;

    .line 94
    .line 95
    new-instance v0, La/ugi;

    .line 96
    .line 97
    const/16 v1, 0x1b

    .line 98
    .line 99
    invoke-direct {v0, v5, v1}, La/ugi;-><init>(Ljava/lang/Object;B)V

    .line 100
    .line 101
    .line 102
    iput-object v0, v5, La/gr00;->e:Ljava/lang/Object;

    .line 103
    .line 104
    new-instance v0, La/fiu0;

    .line 105
    .line 106
    iget-object v1, v5, La/gr00;->e:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v1, La/ugi;

    .line 109
    .line 110
    const-class v3, La/uwv;

    .line 111
    .line 112
    invoke-static {v3, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 117
    .line 118
    .line 119
    iput-object v0, p0, La/rwv;->L1:La/fiu0;

    .line 120
    .line 121
    iput-object v2, p0, La/rwv;->M1:La/wdk0;

    .line 122
    .line 123
    return-void

    .line 124
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 125
    .line 126
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    return-void
.end method

.method public final D0()V
    .locals 5

    .line 1
    iget-object v0, p0, La/rwv;->N1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/uwv;

    .line 8
    .line 9
    iget-object v0, v0, La/uwv;->e:La/qoj0;

    .line 10
    .line 11
    invoke-static {v0}, La/vtb;->M(La/mz40;)La/vae0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, La/j0s;

    .line 16
    .line 17
    const/16 v2, 0x18

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-direct {v1, p0, v3, v2}, La/j0s;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 21
    .line 22
    .line 23
    sget-object v2, La/lkz;->a:La/lkz;

    .line 24
    .line 25
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

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
    new-instance v4, La/hgv;

    .line 38
    .line 39
    invoke-direct {v4, v0, p0, v1, v3}, La/hgv;-><init>(La/vae0;La/clz;La/j0s;La/yje;)V

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x3

    .line 43
    invoke-static {v2, v3, v3, v4, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final G0()La/swv;
    .locals 2

    .line 1
    sget-object v0, La/rwv;->Q1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/rwv;->K1:La/s0r;

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
    check-cast p0, La/swv;

    .line 16
    .line 17
    return-object p0
.end method

.method public final e0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {v0, v1}, La/bcm0;->x(Landroid/view/Window;Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p0}, La/rwv;->G0()La/swv;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v1, v1, La/swv;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 26
    .line 27
    new-instance v2, La/ani0;

    .line 28
    .line 29
    invoke-direct {v2, v1}, La/ani0;-><init>(Landroid/view/View;)V

    .line 30
    .line 31
    .line 32
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 33
    .line 34
    const/16 v3, 0x23

    .line 35
    .line 36
    if-lt v1, v3, :cond_0

    .line 37
    .line 38
    new-instance v1, La/bjv0;

    .line 39
    .line 40
    invoke-direct {v1, v0, v2}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/16 v3, 0x1e

    .line 45
    .line 46
    if-lt v1, v3, :cond_1

    .line 47
    .line 48
    new-instance v1, La/ajv0;

    .line 49
    .line 50
    invoke-direct {v1, v0, v2}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    const/16 v3, 0x1a

    .line 55
    .line 56
    if-lt v1, v3, :cond_2

    .line 57
    .line 58
    new-instance v1, La/ziv0;

    .line 59
    .line 60
    invoke-direct {v1, v0, v2}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    new-instance v1, La/yiv0;

    .line 65
    .line 66
    invoke-direct {v1, v0, v2}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 67
    .line 68
    .line 69
    :goto_0
    const/4 v0, 0x2

    .line 70
    invoke-virtual {v1, v0}, La/ycm0;->s(I)V

    .line 71
    .line 72
    .line 73
    const/16 v2, 0x207

    .line 74
    .line 75
    invoke-virtual {v1, v2}, La/ycm0;->s(I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v0}, La/ycm0;->x(I)V

    .line 79
    .line 80
    .line 81
    invoke-super {p0}, La/yx5;->e0()V

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method public final h0()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-static {v0, v1}, La/bcm0;->x(Landroid/view/Window;Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p0}, La/rwv;->G0()La/swv;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget-object v2, v2, La/swv;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 26
    .line 27
    new-instance v3, La/ani0;

    .line 28
    .line 29
    invoke-direct {v3, v2}, La/ani0;-><init>(Landroid/view/View;)V

    .line 30
    .line 31
    .line 32
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 33
    .line 34
    const/16 v4, 0x23

    .line 35
    .line 36
    if-lt v2, v4, :cond_0

    .line 37
    .line 38
    new-instance v2, La/bjv0;

    .line 39
    .line 40
    invoke-direct {v2, v0, v3}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/16 v4, 0x1e

    .line 45
    .line 46
    if-lt v2, v4, :cond_1

    .line 47
    .line 48
    new-instance v2, La/ajv0;

    .line 49
    .line 50
    invoke-direct {v2, v0, v3}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    const/16 v4, 0x1a

    .line 55
    .line 56
    if-lt v2, v4, :cond_2

    .line 57
    .line 58
    new-instance v2, La/ziv0;

    .line 59
    .line 60
    invoke-direct {v2, v0, v3}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    new-instance v2, La/yiv0;

    .line 65
    .line 66
    invoke-direct {v2, v0, v3}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 67
    .line 68
    .line 69
    :goto_0
    const/4 v0, 0x2

    .line 70
    invoke-virtual {v2, v0}, La/ycm0;->y(I)V

    .line 71
    .line 72
    .line 73
    const/16 v0, 0x207

    .line 74
    .line 75
    invoke-virtual {v2, v0}, La/ycm0;->y(I)V

    .line 76
    .line 77
    .line 78
    iput-boolean v1, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 79
    .line 80
    return-void
.end method

.method public final j()Z
    .locals 3

    .line 1
    iget-object v0, p0, La/rwv;->N1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/uwv;

    .line 8
    .line 9
    sget-object v1, La/rwv;->Q1:[La/iiy;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aget-object v1, v1, v2

    .line 13
    .line 14
    iget-object v2, p0, La/rwv;->O1:La/cgx0;

    .line 15
    .line 16
    invoke-virtual {v2, p0, v1}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    invoke-virtual {v0, p0}, La/uwv;->w(Z)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return p0
.end method
