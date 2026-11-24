.class public final La/oyj0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/oyj0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/gle0",
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
.field public static final U1:La/gle0;

.field public static final synthetic V1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public final L1:La/s0r;

.field public M1:La/fiu0;

.field public N1:La/ii;

.field public O1:La/wdk0;

.field public P1:La/ynb;

.field public Q1:La/lgn0;

.field public R1:La/rd7;

.field public final S1:La/kiu0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/oyj0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/toto_bet/impl/databinding/FragmentSimpleDsBetTotoBetBinding;"

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
    sput-object v1, La/oyj0;->V1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/gle0;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/oyj0;->U1:La/gle0;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d02d5

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
    iput-object v0, p0, La/oyj0;->K1:La/i9o0;

    .line 10
    .line 11
    sget-object v0, La/lyj0;->a:La/lyj0;

    .line 12
    .line 13
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, La/oyj0;->L1:La/s0r;

    .line 18
    .line 19
    new-instance v0, La/kyj0;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-direct {v0, p0, v1}, La/kyj0;-><init>(La/oyj0;B)V

    .line 23
    .line 24
    .line 25
    new-instance v1, La/l9i0;

    .line 26
    .line 27
    const/16 v2, 0x17

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
    const/16 v4, 0x18

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
    const-class v2, La/wyj0;

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
    const/16 v4, 0x14

    .line 56
    .line 57
    invoke-direct {v3, v1, v4}, La/s9i0;-><init>(La/a8z;B)V

    .line 58
    .line 59
    .line 60
    new-instance v4, La/s9i0;

    .line 61
    .line 62
    const/16 v5, 0x15

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
    iput-object v0, p0, La/oyj0;->S1:La/kiu0;

    .line 72
    .line 73
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, La/kyj0;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-direct {v1, v0, v2}, La/kyj0;-><init>(La/oyj0;B)V

    .line 7
    .line 8
    .line 9
    const-string v3, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY"

    .line 10
    .line 11
    invoke-static {v0, v3, v1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, La/kyj0;

    .line 15
    .line 16
    const/4 v4, 0x3

    .line 17
    invoke-direct {v1, v0, v4}, La/kyj0;-><init>(La/oyj0;B)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v3, v1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, La/oyj0;->G0()La/u4r;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget-object v1, v1, La/u4r;->e:Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;

    .line 28
    .line 29
    new-instance v3, La/kyj0;

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    invoke-direct {v3, v0, v4}, La/kyj0;-><init>(La/oyj0;B)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v3}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->setOnMakeBetButtonClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, La/oyj0;->G0()La/u4r;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iget-object v1, v1, La/u4r;->b:Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;

    .line 43
    .line 44
    new-instance v3, La/lph0;

    .line 45
    .line 46
    invoke-virtual {v0}, La/oyj0;->H0()La/wyj0;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    const/4 v9, 0x0

    .line 51
    const/16 v10, 0x11

    .line 52
    .line 53
    const-class v14, La/wyj0;

    .line 54
    .line 55
    const-string v7, "onPaymentClicked"

    .line 56
    .line 57
    const-string v8, "onPaymentClicked()V"

    .line 58
    .line 59
    move-object v6, v14

    .line 60
    invoke-direct/range {v3 .. v10}, La/lph0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, v3}, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;->setAddDepositClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, La/oyj0;->G0()La/u4r;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iget-object v1, v1, La/u4r;->e:Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;

    .line 71
    .line 72
    new-instance v3, La/sd7;

    .line 73
    .line 74
    const/16 v4, 0xd

    .line 75
    .line 76
    invoke-direct {v3, v4, v2}, La/sd7;-><init>(II)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v3}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->setFormatParams(La/sd7;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, La/oyj0;->G0()La/u4r;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    iget-object v1, v1, La/u4r;->e:Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;

    .line 87
    .line 88
    new-instance v11, La/gvj0;

    .line 89
    .line 90
    invoke-virtual {v0}, La/oyj0;->H0()La/wyj0;

    .line 91
    .line 92
    .line 93
    move-result-object v13

    .line 94
    const/16 v17, 0x0

    .line 95
    .line 96
    const/16 v18, 0x8

    .line 97
    .line 98
    const/4 v12, 0x1

    .line 99
    const-string v15, "changeBetSum"

    .line 100
    .line 101
    const-string v16, "changeBetSum(Ljava/lang/String;)V"

    .line 102
    .line 103
    invoke-direct/range {v11 .. v18}, La/gvj0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, v11}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->setAfterTextChangedListener(Lkotlin/jvm/functions/Function1;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, La/oyj0;->G0()La/u4r;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    iget-object v1, v1, La/u4r;->b:Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;

    .line 114
    .line 115
    new-instance v2, La/jpe0;

    .line 116
    .line 117
    const/16 v3, 0x8

    .line 118
    .line 119
    invoke-direct {v2, v0, v3}, La/jpe0;-><init>(Ljava/lang/Object;B)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, v2}, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;->setChangeBalanceClickListener(Landroid/view/View$OnClickListener;)V

    .line 123
    .line 124
    .line 125
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
    iput-object v1, p0, La/oyj0;->M1:La/fiu0;

    .line 68
    .line 69
    iget-object v1, v0, La/o9i;->A:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, La/ii;

    .line 72
    .line 73
    iput-object v1, p0, La/oyj0;->N1:La/ii;

    .line 74
    .line 75
    iget-object v1, v0, La/o9i;->B:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v1, La/wdk0;

    .line 78
    .line 79
    iput-object v1, p0, La/oyj0;->O1:La/wdk0;

    .line 80
    .line 81
    iget-object v1, v0, La/o9i;->l:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v1, La/peg0;

    .line 84
    .line 85
    iget-object v1, v1, La/peg0;->b:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v1, La/yzn0;

    .line 88
    .line 89
    invoke-virtual {v1}, La/yzn0;->i()La/ynb;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    iput-object v1, p0, La/oyj0;->P1:La/ynb;

    .line 97
    .line 98
    iget-object v0, v0, La/o9i;->m:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v0, La/lgn0;

    .line 101
    .line 102
    iput-object v0, p0, La/oyj0;->Q1:La/lgn0;

    .line 103
    .line 104
    return-void

    .line 105
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 106
    .line 107
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return-void
.end method

.method public final D0()V
    .locals 10

    .line 1
    invoke-virtual {p0}, La/oyj0;->H0()La/wyj0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, La/wyj0;->E:La/p7m0;

    .line 6
    .line 7
    invoke-static {v1}, La/vtb;->N(La/qz40;)La/xae0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    new-instance v2, La/omi0;

    .line 12
    .line 13
    const/4 v3, 0x3

    .line 14
    invoke-direct {v2, v1, v0, v3}, La/omi0;-><init>(La/gmq;Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    new-instance v0, La/nyj0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    const/4 v8, 0x0

    .line 21
    invoke-direct {v0, p0, v8, v1}, La/nyj0;-><init>(La/oyj0;La/yje;B)V

    .line 22
    .line 23
    .line 24
    sget-object v1, La/lkz;->a:La/lkz;

    .line 25
    .line 26
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    new-instance v5, La/zmj0;

    .line 39
    .line 40
    invoke-direct {v5, v2, v1, v0, v8}, La/zmj0;-><init>(La/omi0;La/clz;La/nyj0;La/yje;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v4, v8, v8, v5, v3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, La/oyj0;->H0()La/wyj0;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget-object v0, v0, La/wyj0;->G:La/p7m0;

    .line 51
    .line 52
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    new-instance v1, La/i89;

    .line 57
    .line 58
    const/16 v2, 0x16

    .line 59
    .line 60
    invoke-direct {v1, v0, v2}, La/i89;-><init>(La/gmq;B)V

    .line 61
    .line 62
    .line 63
    new-instance v0, La/nyj0;

    .line 64
    .line 65
    const/4 v2, 0x1

    .line 66
    invoke-direct {v0, p0, v8, v2}, La/nyj0;-><init>(La/oyj0;La/yje;B)V

    .line 67
    .line 68
    .line 69
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    new-instance v5, La/zmj0;

    .line 82
    .line 83
    invoke-direct {v5, v1, v2, v0, v8}, La/zmj0;-><init>(La/i89;La/clz;La/nyj0;La/yje;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v4, v8, v8, v5, v3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, La/oyj0;->H0()La/wyj0;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iget-object v0, v0, La/wyj0;->F:La/p7m0;

    .line 94
    .line 95
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    new-instance v1, La/nyj0;

    .line 100
    .line 101
    const/4 v2, 0x2

    .line 102
    invoke-direct {v1, p0, v8, v2}, La/nyj0;-><init>(La/oyj0;La/yje;B)V

    .line 103
    .line 104
    .line 105
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    new-instance v5, La/myj0;

    .line 118
    .line 119
    invoke-direct {v5, v0, v2, v1, v8}, La/myj0;-><init>(La/xae0;La/clz;La/nyj0;La/yje;)V

    .line 120
    .line 121
    .line 122
    invoke-static {v4, v8, v8, v5, v3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0}, La/oyj0;->H0()La/wyj0;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    iget-object v0, v0, La/wyj0;->C:La/ol60;

    .line 130
    .line 131
    const-wide/16 v1, 0x64

    .line 132
    .line 133
    invoke-static {v0, v1, v2}, La/sj3;->S(La/gmq;J)La/gmq;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    new-instance v1, La/nyj0;

    .line 138
    .line 139
    invoke-direct {v1, p0, v8, v3}, La/nyj0;-><init>(La/oyj0;La/yje;B)V

    .line 140
    .line 141
    .line 142
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    new-instance v5, La/myj0;

    .line 155
    .line 156
    invoke-direct {v5, v0, v2, v1, v8}, La/myj0;-><init>(La/gmq;La/clz;La/nyj0;La/yje;)V

    .line 157
    .line 158
    .line 159
    invoke-static {v4, v8, v8, v5, v3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 160
    .line 161
    .line 162
    invoke-virtual {p0}, La/oyj0;->H0()La/wyj0;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    iget-object v0, v0, La/wyj0;->H:La/p7m0;

    .line 167
    .line 168
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    new-instance v7, La/nyj0;

    .line 173
    .line 174
    const/4 v0, 0x4

    .line 175
    invoke-direct {v7, p0, v8, v0}, La/nyj0;-><init>(La/oyj0;La/yje;B)V

    .line 176
    .line 177
    .line 178
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 179
    .line 180
    .line 181
    move-result-object v6

    .line 182
    invoke-interface {v6}, La/clz;->x()La/glz;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    new-instance v4, La/myj0;

    .line 191
    .line 192
    const/4 v9, 0x0

    .line 193
    invoke-direct/range {v4 .. v9}, La/myj0;-><init>(La/xae0;La/clz;La/nyj0;La/yje;B)V

    .line 194
    .line 195
    .line 196
    invoke-static {p0, v8, v8, v4, v3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 197
    .line 198
    .line 199
    return-void
.end method

.method public final G0()La/u4r;
    .locals 2

    .line 1
    sget-object v0, La/oyj0;->V1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/oyj0;->L1:La/s0r;

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
    check-cast p0, La/u4r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/wyj0;
    .locals 0

    .line 1
    iget-object p0, p0, La/oyj0;->S1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/wyj0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final Z()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/oyj0;->G0()La/u4r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/u4r;->b:Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;

    .line 6
    .line 7
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;->w()V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, La/oyj0;->R1:La/rd7;

    .line 12
    .line 13
    invoke-super {p0}, La/yx5;->Z()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/oyj0;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
