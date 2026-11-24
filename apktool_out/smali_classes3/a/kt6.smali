.class public final La/kt6;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/kt6;",
        "La/yx5;",
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
.field public static final Q1:La/bj5;

.field public static final synthetic R1:[La/iiy;


# instance fields
.field public K1:La/fiu0;

.field public L1:La/ii;

.field public M1:La/wdk0;

.field public N1:La/lgn0;

.field public final O1:La/kiu0;

.field public final P1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/kt6;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/bet_constructor/impl/databinding/PromoTabFragmentBinding;"

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
    sput-object v1, La/kt6;->R1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/bj5;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/kt6;->Q1:La/bj5;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d053f

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/gt6;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, La/gt6;-><init>(La/kt6;B)V

    .line 11
    .line 12
    .line 13
    new-instance v1, La/p46;

    .line 14
    .line 15
    const/16 v2, 0x9

    .line 16
    .line 17
    invoke-direct {v1, p0, v2}, La/p46;-><init>(Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    sget-object v2, La/wez;->b:La/wez;

    .line 21
    .line 22
    new-instance v3, La/p46;

    .line 23
    .line 24
    const/16 v4, 0xa

    .line 25
    .line 26
    invoke-direct {v3, v1, v4}, La/p46;-><init>(Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const-class v2, La/y920;

    .line 34
    .line 35
    sget-object v3, La/sre0;->a:La/tre0;

    .line 36
    .line 37
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    new-instance v3, La/qw4;

    .line 42
    .line 43
    const/16 v4, 0x1c

    .line 44
    .line 45
    invoke-direct {v3, v1, v4}, La/qw4;-><init>(La/a8z;B)V

    .line 46
    .line 47
    .line 48
    new-instance v4, La/qw4;

    .line 49
    .line 50
    const/16 v5, 0x1d

    .line 51
    .line 52
    invoke-direct {v4, v1, v5}, La/qw4;-><init>(La/a8z;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, La/kt6;->O1:La/kiu0;

    .line 60
    .line 61
    sget-object v0, La/ht6;->a:La/ht6;

    .line 62
    .line 63
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object v0, p0, La/kt6;->P1:La/s0r;

    .line 68
    .line 69
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/kt6;->G0()La/ouc0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/ouc0;->b:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/buttons/DsButton;->setEnabled(Z)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, La/kt6;->G0()La/ouc0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object p1, p1, La/ouc0;->b:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 16
    .line 17
    new-instance v1, La/os5;

    .line 18
    .line 19
    const/16 v2, 0xe

    .line 20
    .line 21
    invoke-direct {v1, p0, v2}, La/os5;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    invoke-static {p1, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, La/kt6;->G0()La/ouc0;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object p1, p1, La/ouc0;->c:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 32
    .line 33
    new-instance v1, La/jt6;

    .line 34
    .line 35
    invoke-direct {v1, p0, v0}, La/jt6;-><init>(Ljava/lang/Object;B)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->a(Landroid/text/TextWatcher;)V

    .line 39
    .line 40
    .line 41
    new-instance p1, La/gt6;

    .line 42
    .line 43
    const/4 v0, 0x1

    .line 44
    invoke-direct {p1, p0, v0}, La/gt6;-><init>(La/kt6;B)V

    .line 45
    .line 46
    .line 47
    const-string v0, "REQUEST_BET_EXISTS_DIALOG_KEY"

    .line 48
    .line 49
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 50
    .line 51
    .line 52
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
    const-class v1, La/v720;

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
    instance-of v3, v0, La/v720;

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
    check-cast v2, La/v720;

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
    invoke-virtual {v2, v0}, La/v720;->a(La/i1w0;)La/zki;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, La/zki;->d()La/fiu0;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iput-object v1, p0, La/kt6;->K1:La/fiu0;

    .line 68
    .line 69
    iget-object v1, v0, La/zki;->H:La/ii;

    .line 70
    .line 71
    iput-object v1, p0, La/kt6;->L1:La/ii;

    .line 72
    .line 73
    iget-object v1, v0, La/zki;->s:La/wdk0;

    .line 74
    .line 75
    iput-object v1, p0, La/kt6;->M1:La/wdk0;

    .line 76
    .line 77
    iget-object v0, v0, La/zki;->J:La/lgn0;

    .line 78
    .line 79
    iput-object v0, p0, La/kt6;->N1:La/lgn0;

    .line 80
    .line 81
    return-void

    .line 82
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 83
    .line 84
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public final D0()V
    .locals 7

    .line 1
    invoke-virtual {p0}, La/kt6;->H0()La/y920;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/y920;->l:La/p7m0;

    .line 6
    .line 7
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, La/it6;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-direct {v1, p0, v3, v2}, La/it6;-><init>(La/kt6;La/yje;B)V

    .line 16
    .line 17
    .line 18
    sget-object v2, La/lkz;->a:La/lkz;

    .line 19
    .line 20
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    new-instance v5, La/td6;

    .line 33
    .line 34
    invoke-direct {v5, v0, v2, v1, v3}, La/td6;-><init>(La/xae0;La/clz;La/it6;La/yje;)V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x3

    .line 38
    invoke-static {v4, v3, v3, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, La/kt6;->H0()La/y920;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget-object v1, v1, La/y920;->n:La/p7m0;

    .line 46
    .line 47
    invoke-static {v1}, La/vtb;->N(La/qz40;)La/xae0;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    new-instance v2, La/qv3;

    .line 52
    .line 53
    const/16 v4, 0xb

    .line 54
    .line 55
    invoke-direct {v2, p0, v3, v4}, La/qv3;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 56
    .line 57
    .line 58
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-static {v5}, La/x0x;->Q(La/glz;)La/tkz;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    new-instance v6, La/td6;

    .line 71
    .line 72
    invoke-direct {v6, v1, v4, v2, v3}, La/td6;-><init>(La/xae0;La/clz;La/qv3;La/yje;)V

    .line 73
    .line 74
    .line 75
    invoke-static {v5, v3, v3, v6, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, La/kt6;->H0()La/y920;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    iget-object v1, v1, La/y920;->m:La/ol60;

    .line 83
    .line 84
    const-wide/16 v4, 0x64

    .line 85
    .line 86
    invoke-static {v1, v4, v5}, La/sj3;->S(La/gmq;J)La/gmq;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    new-instance v2, La/it6;

    .line 91
    .line 92
    const/4 v4, 0x1

    .line 93
    invoke-direct {v2, p0, v3, v4}, La/it6;-><init>(La/kt6;La/yje;B)V

    .line 94
    .line 95
    .line 96
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    new-instance v5, La/td6;

    .line 109
    .line 110
    invoke-direct {v5, v1, p0, v2, v3}, La/td6;-><init>(La/gmq;La/clz;La/it6;La/yje;)V

    .line 111
    .line 112
    .line 113
    invoke-static {v4, v3, v3, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 114
    .line 115
    .line 116
    return-void
.end method

.method public final G0()La/ouc0;
    .locals 2

    .line 1
    sget-object v0, La/kt6;->R1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/kt6;->P1:La/s0r;

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
    check-cast p0, La/ouc0;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/y920;
    .locals 0

    .line 1
    iget-object p0, p0, La/kt6;->O1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/y920;

    .line 8
    .line 9
    return-object p0
.end method
