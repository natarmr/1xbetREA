.class public final La/hnc0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/hnc0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/xi70",
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
.field public static final R1:La/xi70;

.field public static final synthetic S1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public L1:La/fiu0;

.field public M1:La/wdk0;

.field public N1:La/lgn0;

.field public final O1:La/s0r;

.field public final P1:La/n0o0;

.field public final Q1:La/kiu0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/hnc0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/toto_bet/impl/databinding/FragmentPromoBetDsTotoBetBinding;"

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
    sput-object v1, La/hnc0;->S1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/xi70;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/hnc0;->R1:La/xi70;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d029c

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
    iput-object v0, p0, La/hnc0;->K1:La/i9o0;

    .line 10
    .line 11
    sget-object v0, La/fnc0;->a:La/fnc0;

    .line 12
    .line 13
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, La/hnc0;->O1:La/s0r;

    .line 18
    .line 19
    new-instance v0, La/enc0;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, p0, v1}, La/enc0;-><init>(La/hnc0;B)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, La/hnc0;->P1:La/n0o0;

    .line 30
    .line 31
    new-instance v0, La/enc0;

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    invoke-direct {v0, p0, v1}, La/enc0;-><init>(La/hnc0;B)V

    .line 35
    .line 36
    .line 37
    new-instance v1, La/g8b0;

    .line 38
    .line 39
    const/16 v2, 0x19

    .line 40
    .line 41
    invoke-direct {v1, p0, v2}, La/g8b0;-><init>(Ljava/lang/Object;B)V

    .line 42
    .line 43
    .line 44
    sget-object v2, La/wez;->b:La/wez;

    .line 45
    .line 46
    new-instance v3, La/g8b0;

    .line 47
    .line 48
    const/16 v4, 0x1a

    .line 49
    .line 50
    invoke-direct {v3, v1, v4}, La/g8b0;-><init>(Ljava/lang/Object;B)V

    .line 51
    .line 52
    .line 53
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    const-class v2, La/qnc0;

    .line 58
    .line 59
    sget-object v3, La/sre0;->a:La/tre0;

    .line 60
    .line 61
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    new-instance v3, La/x6b0;

    .line 66
    .line 67
    const/16 v4, 0x1c

    .line 68
    .line 69
    invoke-direct {v3, v1, v4}, La/x6b0;-><init>(La/a8z;B)V

    .line 70
    .line 71
    .line 72
    new-instance v4, La/x6b0;

    .line 73
    .line 74
    const/16 v5, 0x1d

    .line 75
    .line 76
    invoke-direct {v4, v1, v5}, La/x6b0;-><init>(La/a8z;B)V

    .line 77
    .line 78
    .line 79
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iput-object v0, p0, La/hnc0;->Q1:La/kiu0;

    .line 84
    .line 85
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/hnc0;->G0()La/c3r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/c3r;->e:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 6
    .line 7
    iget-object v0, p0, La/hnc0;->P1:La/n0o0;

    .line 8
    .line 9
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/text/TextWatcher;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->a(Landroid/text/TextWatcher;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, La/hnc0;->G0()La/c3r;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object p1, p1, La/c3r;->c:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 23
    .line 24
    new-instance v0, La/ppb0;

    .line 25
    .line 26
    const/16 v1, 0x16

    .line 27
    .line 28
    invoke-direct {v0, p0, v1}, La/ppb0;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    invoke-static {p1, v0}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 32
    .line 33
    .line 34
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
    const-class v1, La/kkr0;

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
    instance-of v3, v0, La/kkr0;

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
    check-cast v2, La/kkr0;

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
    invoke-virtual {v2, v0}, La/kkr0;->a(La/i1w0;)La/o9i;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, La/o9i;->e()La/fiu0;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iput-object v1, p0, La/hnc0;->L1:La/fiu0;

    .line 68
    .line 69
    iget-object v1, v0, La/o9i;->B:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, La/wdk0;

    .line 72
    .line 73
    iput-object v1, p0, La/hnc0;->M1:La/wdk0;

    .line 74
    .line 75
    iget-object v0, v0, La/o9i;->m:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v0, La/lgn0;

    .line 78
    .line 79
    iput-object v0, p0, La/hnc0;->N1:La/lgn0;

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
    .locals 10

    .line 1
    iget-object v0, p0, La/hnc0;->Q1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, La/qnc0;

    .line 8
    .line 9
    iget-object v1, v1, La/qnc0;->j:La/p7m0;

    .line 10
    .line 11
    new-instance v2, La/gnc0;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v8, 0x0

    .line 15
    invoke-direct {v2, p0, v8, v3}, La/gnc0;-><init>(La/hnc0;La/yje;B)V

    .line 16
    .line 17
    .line 18
    sget-object v3, La/lkz;->a:La/lkz;

    .line 19
    .line 20
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-interface {v3}, La/clz;->x()La/glz;

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
    new-instance v5, La/p8c0;

    .line 33
    .line 34
    invoke-direct {v5, v1, v3, v2, v8}, La/p8c0;-><init>(La/gmq;La/clz;La/gnc0;La/yje;)V

    .line 35
    .line 36
    .line 37
    const/4 v1, 0x3

    .line 38
    invoke-static {v4, v8, v8, v5, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, La/qnc0;

    .line 46
    .line 47
    iget-object v2, v2, La/qnc0;->i:La/ol60;

    .line 48
    .line 49
    const-wide/16 v3, 0x64

    .line 50
    .line 51
    invoke-static {v2, v3, v4}, La/sj3;->S(La/gmq;J)La/gmq;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    new-instance v7, La/gnc0;

    .line 56
    .line 57
    const/4 v2, 0x1

    .line 58
    invoke-direct {v7, p0, v8, v2}, La/gnc0;-><init>(La/hnc0;La/yje;B)V

    .line 59
    .line 60
    .line 61
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    invoke-interface {v6}, La/clz;->x()La/glz;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    new-instance v4, La/p8c0;

    .line 74
    .line 75
    const/4 v9, 0x0

    .line 76
    invoke-direct/range {v4 .. v9}, La/p8c0;-><init>(La/gmq;La/clz;La/gnc0;La/yje;B)V

    .line 77
    .line 78
    .line 79
    invoke-static {v2, v8, v8, v4, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, La/qnc0;

    .line 87
    .line 88
    iget-object v5, v0, La/qnc0;->k:La/p7m0;

    .line 89
    .line 90
    new-instance v7, La/gnc0;

    .line 91
    .line 92
    const/4 v0, 0x2

    .line 93
    invoke-direct {v7, p0, v8, v0}, La/gnc0;-><init>(La/hnc0;La/yje;B)V

    .line 94
    .line 95
    .line 96
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    invoke-interface {v6}, La/clz;->x()La/glz;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    new-instance v4, La/p8c0;

    .line 109
    .line 110
    invoke-direct/range {v4 .. v9}, La/p8c0;-><init>(La/gmq;La/clz;La/gnc0;La/yje;C)V

    .line 111
    .line 112
    .line 113
    invoke-static {p0, v8, v8, v4, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 114
    .line 115
    .line 116
    return-void
.end method

.method public final G0()La/c3r;
    .locals 2

    .line 1
    sget-object v0, La/hnc0;->S1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/hnc0;->O1:La/s0r;

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
    check-cast p0, La/c3r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final Z()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/hnc0;->G0()La/c3r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/c3r;->e:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 6
    .line 7
    iget-object v1, p0, La/hnc0;->P1:La/n0o0;

    .line 8
    .line 9
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Landroid/text/TextWatcher;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->c(Landroid/text/TextWatcher;)V

    .line 16
    .line 17
    .line 18
    invoke-super {p0}, La/yx5;->Z()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/hnc0;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
