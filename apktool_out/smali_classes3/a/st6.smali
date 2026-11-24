.class public final La/st6;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/st6;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/yk5",
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
.field public static final R1:La/yk5;

.field public static final synthetic S1:[La/iiy;


# instance fields
.field public K1:La/yki;

.field public L1:La/ii;

.field public M1:La/ynb;

.field public N1:La/wdk0;

.field public O1:La/lgn0;

.field public final P1:La/kiu0;

.field public final Q1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/st6;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/bet_constructor/impl/databinding/SimpleMakeBetFragmentBinding;"

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
    sput-object v1, La/st6;->S1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/yk5;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/st6;->R1:La/yk5;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d0583

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/lt6;

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    invoke-direct {v0, p0, v1}, La/lt6;-><init>(La/st6;B)V

    .line 11
    .line 12
    .line 13
    new-instance v1, La/p46;

    .line 14
    .line 15
    const/16 v2, 0xb

    .line 16
    .line 17
    invoke-direct {v1, v0, v2}, La/p46;-><init>(Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    new-instance v0, La/p46;

    .line 21
    .line 22
    const/16 v2, 0xc

    .line 23
    .line 24
    invoke-direct {v0, p0, v2}, La/p46;-><init>(Ljava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    sget-object v2, La/wez;->b:La/wez;

    .line 28
    .line 29
    new-instance v3, La/p46;

    .line 30
    .line 31
    const/16 v4, 0xd

    .line 32
    .line 33
    invoke-direct {v3, v0, v4}, La/p46;-><init>(Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-class v2, La/rg20;

    .line 41
    .line 42
    sget-object v3, La/sre0;->a:La/tre0;

    .line 43
    .line 44
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    new-instance v3, La/rt6;

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    invoke-direct {v3, v0, v4}, La/rt6;-><init>(La/a8z;B)V

    .line 52
    .line 53
    .line 54
    new-instance v4, La/rt6;

    .line 55
    .line 56
    const/4 v5, 0x1

    .line 57
    invoke-direct {v4, v0, v5}, La/rt6;-><init>(La/a8z;B)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0, v2, v3, v4, v1}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, La/st6;->P1:La/kiu0;

    .line 65
    .line 66
    sget-object v0, La/nt6;->a:La/nt6;

    .line 67
    .line 68
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iput-object v0, p0, La/st6;->Q1:La/s0r;

    .line 73
    .line 74
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 12

    .line 1
    invoke-virtual {p0}, La/st6;->G0()La/xyj0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/xyj0;->b:Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;

    .line 6
    .line 7
    new-instance v0, La/mt6;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, La/mt6;-><init>(La/st6;B)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;->setChangeBalanceClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/st6;->G0()La/xyj0;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object p1, p1, La/xyj0;->b:Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;

    .line 21
    .line 22
    new-instance v0, La/lt6;

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    invoke-direct {v0, p0, v2}, La/lt6;-><init>(La/st6;B)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;->setAddDepositClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, La/st6;->G0()La/xyj0;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget-object p1, p1, La/xyj0;->c:Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const v2, 0x7f13023e

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v0}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->setPlaceholder(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    new-instance v0, La/lt6;

    .line 55
    .line 56
    const/4 v2, 0x4

    .line 57
    invoke-direct {v0, p0, v2}, La/lt6;-><init>(La/st6;B)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v0}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->setPlusButtonClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 61
    .line 62
    .line 63
    new-instance v0, La/lt6;

    .line 64
    .line 65
    const/4 v2, 0x5

    .line 66
    invoke-direct {v0, p0, v2}, La/lt6;-><init>(La/st6;B)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v0}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->setMinusButtonClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 70
    .line 71
    .line 72
    new-instance v0, La/sd7;

    .line 73
    .line 74
    const/16 v2, 0xd

    .line 75
    .line 76
    const/4 v3, 0x2

    .line 77
    invoke-direct {v0, v2, v3}, La/sd7;-><init>(II)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v0}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->setFormatParams(La/sd7;)V

    .line 81
    .line 82
    .line 83
    new-instance v4, La/ur6;

    .line 84
    .line 85
    invoke-virtual {p0}, La/st6;->H0()La/rg20;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    const/4 v10, 0x0

    .line 90
    const/16 v11, 0xa

    .line 91
    .line 92
    const/4 v5, 0x1

    .line 93
    const-class v7, La/rg20;

    .line 94
    .line 95
    const-string v8, "onStepInputChange"

    .line 96
    .line 97
    const-string v9, "onStepInputChange(Ljava/lang/String;)V"

    .line 98
    .line 99
    invoke-direct/range {v4 .. v11}, La/ur6;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, v4}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->setAfterTextChangedListener(Lkotlin/jvm/functions/Function1;)V

    .line 103
    .line 104
    .line 105
    new-instance v0, La/lt6;

    .line 106
    .line 107
    const/4 v2, 0x6

    .line 108
    invoke-direct {v0, p0, v2}, La/lt6;-><init>(La/st6;B)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, v0}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->setOnMakeBetButtonClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, v1}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->setVisibilityStepButtons(Z)V

    .line 115
    .line 116
    .line 117
    new-instance p1, La/lt6;

    .line 118
    .line 119
    const/4 v0, 0x3

    .line 120
    invoke-direct {p1, p0, v0}, La/lt6;-><init>(La/st6;B)V

    .line 121
    .line 122
    .line 123
    const-string v0, "request_insufficient_founds_dialog_key"

    .line 124
    .line 125
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 126
    .line 127
    .line 128
    new-instance p1, La/lt6;

    .line 129
    .line 130
    invoke-direct {p1, p0, v1}, La/lt6;-><init>(La/st6;B)V

    .line 131
    .line 132
    .line 133
    const-string v0, "request_bet_exists_dialog_key"

    .line 134
    .line 135
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 136
    .line 137
    .line 138
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
    iget-object v1, v0, La/zki;->M:La/n5d0;

    .line 64
    .line 65
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, La/yki;

    .line 70
    .line 71
    iput-object v1, p0, La/st6;->K1:La/yki;

    .line 72
    .line 73
    iget-object v1, v0, La/zki;->H:La/ii;

    .line 74
    .line 75
    iput-object v1, p0, La/st6;->L1:La/ii;

    .line 76
    .line 77
    iget-object v1, v0, La/zki;->I:La/peg0;

    .line 78
    .line 79
    iget-object v1, v1, La/peg0;->b:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v1, La/yzn0;

    .line 82
    .line 83
    invoke-virtual {v1}, La/yzn0;->i()La/ynb;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iput-object v1, p0, La/st6;->M1:La/ynb;

    .line 91
    .line 92
    iget-object v1, v0, La/zki;->s:La/wdk0;

    .line 93
    .line 94
    iput-object v1, p0, La/st6;->N1:La/wdk0;

    .line 95
    .line 96
    iget-object v0, v0, La/zki;->J:La/lgn0;

    .line 97
    .line 98
    iput-object v0, p0, La/st6;->O1:La/lgn0;

    .line 99
    .line 100
    return-void

    .line 101
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 102
    .line 103
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method public final D0()V
    .locals 11

    .line 1
    invoke-virtual {p0}, La/st6;->H0()La/rg20;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/rg20;->G:La/p7m0;

    .line 6
    .line 7
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    new-instance v4, La/ot6;

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    const/4 v9, 0x0

    .line 15
    invoke-direct {v4, p0, v9, v0}, La/ot6;-><init>(La/st6;La/yje;B)V

    .line 16
    .line 17
    .line 18
    sget-object v0, La/lkz;->a:La/lkz;

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
    move-result-object v0

    .line 28
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, La/td6;

    .line 33
    .line 34
    const/4 v6, 0x0

    .line 35
    move-object v5, v9

    .line 36
    invoke-direct/range {v1 .. v6}, La/td6;-><init>(La/xae0;La/clz;La/ot6;La/yje;B)V

    .line 37
    .line 38
    .line 39
    const/4 v2, 0x3

    .line 40
    invoke-static {v0, v9, v9, v1, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, La/st6;->H0()La/rg20;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget-object v0, v0, La/rg20;->S:La/qoj0;

    .line 48
    .line 49
    invoke-static {v0}, La/vtb;->M(La/mz40;)La/vae0;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    new-instance v1, La/wa;

    .line 54
    .line 55
    const/16 v3, 0x19

    .line 56
    .line 57
    invoke-direct {v1, p0, v9, v3}, La/wa;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    new-instance v5, La/td6;

    .line 73
    .line 74
    invoke-direct {v5, v0, v3, v1, v9}, La/td6;-><init>(La/vae0;La/clz;La/wa;La/yje;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v4, v9, v9, v5, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, La/st6;->H0()La/rg20;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iget-object v0, v0, La/rg20;->H:La/p7m0;

    .line 85
    .line 86
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    new-instance v1, La/ot6;

    .line 91
    .line 92
    const/4 v3, 0x0

    .line 93
    invoke-direct {v1, p0, v9, v3}, La/ot6;-><init>(La/st6;La/yje;B)V

    .line 94
    .line 95
    .line 96
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-interface {v3}, La/clz;->x()La/glz;

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
    invoke-direct {v5, v0, v3, v1, v9}, La/td6;-><init>(La/xae0;La/clz;La/ot6;La/yje;)V

    .line 111
    .line 112
    .line 113
    invoke-static {v4, v9, v9, v5, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, La/st6;->H0()La/rg20;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    iget-object v1, v0, La/rg20;->O:La/p7m0;

    .line 121
    .line 122
    new-instance v3, La/ewt;

    .line 123
    .line 124
    const/16 v4, 0x1b

    .line 125
    .line 126
    invoke-direct {v3, v1, v0, v4}, La/ewt;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 127
    .line 128
    .line 129
    new-instance v0, La/ot6;

    .line 130
    .line 131
    const/4 v1, 0x4

    .line 132
    invoke-direct {v0, p0, v9, v1}, La/ot6;-><init>(La/st6;La/yje;B)V

    .line 133
    .line 134
    .line 135
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    new-instance v5, La/td6;

    .line 148
    .line 149
    invoke-direct {v5, v3, v1, v0, v9}, La/td6;-><init>(La/ewt;La/clz;La/ot6;La/yje;)V

    .line 150
    .line 151
    .line 152
    invoke-static {v4, v9, v9, v5, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0}, La/st6;->H0()La/rg20;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    iget-object v0, v0, La/rg20;->I:La/p7m0;

    .line 160
    .line 161
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    new-instance v8, La/ot6;

    .line 166
    .line 167
    const/4 v0, 0x5

    .line 168
    invoke-direct {v8, p0, v9, v0}, La/ot6;-><init>(La/st6;La/yje;B)V

    .line 169
    .line 170
    .line 171
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    invoke-interface {v7}, La/clz;->x()La/glz;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    new-instance v5, La/td6;

    .line 184
    .line 185
    const/4 v10, 0x0

    .line 186
    invoke-direct/range {v5 .. v10}, La/td6;-><init>(La/xae0;La/clz;La/ot6;La/yje;I)V

    .line 187
    .line 188
    .line 189
    invoke-static {v0, v9, v9, v5, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0}, La/st6;->H0()La/rg20;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    iget-object v0, v0, La/rg20;->L:La/ol60;

    .line 197
    .line 198
    const-wide/16 v3, 0x64

    .line 199
    .line 200
    invoke-static {v0, v3, v4}, La/sj3;->S(La/gmq;J)La/gmq;

    .line 201
    .line 202
    .line 203
    move-result-object v6

    .line 204
    new-instance v8, La/ot6;

    .line 205
    .line 206
    const/4 v0, 0x6

    .line 207
    invoke-direct {v8, p0, v9, v0}, La/ot6;-><init>(La/st6;La/yje;B)V

    .line 208
    .line 209
    .line 210
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 211
    .line 212
    .line 213
    move-result-object v7

    .line 214
    invoke-interface {v7}, La/clz;->x()La/glz;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    new-instance v5, La/td6;

    .line 223
    .line 224
    invoke-direct/range {v5 .. v10}, La/td6;-><init>(La/gmq;La/clz;La/ot6;La/yje;B)V

    .line 225
    .line 226
    .line 227
    invoke-static {v0, v9, v9, v5, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 228
    .line 229
    .line 230
    invoke-virtual {p0}, La/st6;->H0()La/rg20;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    iget-object v0, v0, La/rg20;->N:La/p7m0;

    .line 235
    .line 236
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    new-instance v1, La/pt6;

    .line 241
    .line 242
    invoke-direct {v1, p0, v9}, La/pt6;-><init>(La/st6;La/yje;)V

    .line 243
    .line 244
    .line 245
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    new-instance v5, La/td6;

    .line 258
    .line 259
    invoke-direct {v5, v0, v3, v1, v9}, La/td6;-><init>(La/xae0;La/clz;La/pt6;La/yje;)V

    .line 260
    .line 261
    .line 262
    invoke-static {v4, v9, v9, v5, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 263
    .line 264
    .line 265
    invoke-virtual {p0}, La/st6;->H0()La/rg20;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    iget-object v0, v0, La/rg20;->J:La/p7m0;

    .line 270
    .line 271
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 272
    .line 273
    .line 274
    move-result-object v6

    .line 275
    sget-object v0, La/lkz;->a:La/lkz;

    .line 276
    .line 277
    new-instance v8, La/ot6;

    .line 278
    .line 279
    invoke-direct {v8, p0, v9, v2}, La/ot6;-><init>(La/st6;La/yje;B)V

    .line 280
    .line 281
    .line 282
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 283
    .line 284
    .line 285
    move-result-object v7

    .line 286
    invoke-interface {v7}, La/clz;->x()La/glz;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    new-instance v5, La/td6;

    .line 295
    .line 296
    invoke-direct/range {v5 .. v10}, La/td6;-><init>(La/xae0;La/clz;La/ot6;La/yje;C)V

    .line 297
    .line 298
    .line 299
    invoke-static {v0, v9, v9, v5, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 300
    .line 301
    .line 302
    invoke-virtual {p0}, La/st6;->H0()La/rg20;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    iget-object v0, v0, La/rg20;->M:La/ol60;

    .line 307
    .line 308
    new-instance v1, La/ot6;

    .line 309
    .line 310
    const/4 v3, 0x2

    .line 311
    invoke-direct {v1, p0, v9, v3}, La/ot6;-><init>(La/st6;La/yje;B)V

    .line 312
    .line 313
    .line 314
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 315
    .line 316
    .line 317
    move-result-object p0

    .line 318
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 319
    .line 320
    .line 321
    move-result-object v3

    .line 322
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    new-instance v4, La/td6;

    .line 327
    .line 328
    invoke-direct {v4, v0, p0, v1, v9}, La/td6;-><init>(La/gmq;La/clz;La/ot6;La/yje;)V

    .line 329
    .line 330
    .line 331
    invoke-static {v3, v9, v9, v4, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 332
    .line 333
    .line 334
    return-void
.end method

.method public final G0()La/xyj0;
    .locals 2

    .line 1
    sget-object v0, La/st6;->S1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/st6;->Q1:La/s0r;

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
    check-cast p0, La/xyj0;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/rg20;
    .locals 0

    .line 1
    iget-object p0, p0, La/st6;->P1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/rg20;

    .line 8
    .line 9
    return-object p0
.end method

.method public final Z()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/st6;->G0()La/xyj0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/xyj0;->b:Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;

    .line 6
    .line 7
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;->w()V

    .line 8
    .line 9
    .line 10
    invoke-super {p0}, La/yx5;->Z()V

    .line 11
    .line 12
    .line 13
    return-void
.end method
