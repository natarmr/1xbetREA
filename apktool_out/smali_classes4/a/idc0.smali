.class public final La/idc0;
.super La/zz5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/idc0;",
        "La/zz5;",
        "<init>",
        "()V",
        "a/jh70",
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
.field public static final S1:La/jh70;

.field public static final synthetic U1:[La/iiy;


# instance fields
.field public M1:La/fiu0;

.field public N1:La/ii;

.field public final O1:La/s0r;

.field public final P1:La/kiu0;

.field public final Q1:La/khf0;

.field public final R1:La/jt6;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/idc0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/feature/fin_bet/impl/databinding/FinBetFragmentPromoBetBinding;"

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
    const-string v3, "finBetInfoModel"

    .line 16
    .line 17
    const-string v5, "getFinBetInfoModel()Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;"

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
    sput-object v1, La/idc0;->U1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/jh70;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/idc0;->S1:La/jh70;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const v0, 0x7f0d01d0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/hdc0;->a:La/hdc0;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/idc0;->O1:La/s0r;

    .line 14
    .line 15
    new-instance v0, La/gdc0;

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    invoke-direct {v0, p0, v1}, La/gdc0;-><init>(La/idc0;B)V

    .line 19
    .line 20
    .line 21
    new-instance v1, La/g8b0;

    .line 22
    .line 23
    const/16 v2, 0xd

    .line 24
    .line 25
    invoke-direct {v1, p0, v2}, La/g8b0;-><init>(Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    sget-object v2, La/wez;->b:La/wez;

    .line 29
    .line 30
    new-instance v3, La/g8b0;

    .line 31
    .line 32
    const/16 v4, 0xe

    .line 33
    .line 34
    invoke-direct {v3, v1, v4}, La/g8b0;-><init>(Ljava/lang/Object;B)V

    .line 35
    .line 36
    .line 37
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const-class v2, La/kvc0;

    .line 42
    .line 43
    sget-object v3, La/sre0;->a:La/tre0;

    .line 44
    .line 45
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    new-instance v3, La/x6b0;

    .line 50
    .line 51
    const/16 v5, 0x10

    .line 52
    .line 53
    invoke-direct {v3, v1, v5}, La/x6b0;-><init>(La/a8z;B)V

    .line 54
    .line 55
    .line 56
    new-instance v5, La/x6b0;

    .line 57
    .line 58
    const/16 v6, 0x11

    .line 59
    .line 60
    invoke-direct {v5, v1, v6}, La/x6b0;-><init>(La/a8z;B)V

    .line 61
    .line 62
    .line 63
    invoke-static {p0, v2, v3, v5, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object v0, p0, La/idc0;->P1:La/kiu0;

    .line 68
    .line 69
    new-instance v0, La/khf0;

    .line 70
    .line 71
    const-string v1, "EXTRA_BET_INFO"

    .line 72
    .line 73
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    iput-object v0, p0, La/idc0;->Q1:La/khf0;

    .line 77
    .line 78
    new-instance v0, La/jt6;

    .line 79
    .line 80
    invoke-direct {v0, p0, v4}, La/jt6;-><init>(Ljava/lang/Object;B)V

    .line 81
    .line 82
    .line 83
    iput-object v0, p0, La/idc0;->R1:La/jt6;

    .line 84
    .line 85
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/idc0;->L0()La/l6q;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/l6q;->b:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 6
    .line 7
    new-instance v0, La/ppb0;

    .line 8
    .line 9
    const/16 v1, 0xe

    .line 10
    .line 11
    invoke-direct {v0, p0, v1}, La/ppb0;-><init>(Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1, v0}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, La/idc0;->L0()La/l6q;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object p1, p1, La/l6q;->c:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 22
    .line 23
    iget-object v0, p0, La/idc0;->R1:La/jt6;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->a(Landroid/text/TextWatcher;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, La/idc0;->L0()La/l6q;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object p1, p1, La/l6q;->c:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setEndViewVisible(Z)V

    .line 36
    .line 37
    .line 38
    new-instance p1, La/gdc0;

    .line 39
    .line 40
    invoke-direct {p1, p0, v0}, La/gdc0;-><init>(La/idc0;B)V

    .line 41
    .line 42
    .line 43
    const-string v0, "BET_ALREADY_DONE_REQUEST_KEY_PROMO"

    .line 44
    .line 45
    invoke-static {p0, v0, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 46
    .line 47
    .line 48
    new-instance p1, La/gdc0;

    .line 49
    .line 50
    const/4 v1, 0x1

    .line 51
    invoke-direct {p1, p0, v1}, La/gdc0;-><init>(La/idc0;B)V

    .line 52
    .line 53
    .line 54
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final C0()V
    .locals 5

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
    const-class v1, La/r6q;

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
    instance-of v3, v0, La/r6q;

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
    check-cast v2, La/r6q;

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
    sget-object v1, La/idc0;->U1:[La/iiy;

    .line 60
    .line 61
    const/4 v3, 0x1

    .line 62
    aget-object v1, v1, v3

    .line 63
    .line 64
    iget-object v3, p0, La/idc0;->Q1:La/khf0;

    .line 65
    .line 66
    invoke-virtual {v3, p0, v1}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;

    .line 71
    .line 72
    const-class v3, La/idc0;

    .line 73
    .line 74
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    sget-object v4, La/ua20;->b:La/ua20;

    .line 79
    .line 80
    invoke-virtual {v2, v0, v1, v3, v4}, La/r6q;->a(La/i1w0;Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;Ljava/lang/String;La/ua20;)La/hhi;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v0}, La/hhi;->c()La/fiu0;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    iput-object v1, p0, La/idc0;->M1:La/fiu0;

    .line 89
    .line 90
    iget-object v0, v0, La/hhi;->G:La/ii;

    .line 91
    .line 92
    iput-object v0, p0, La/idc0;->N1:La/ii;

    .line 93
    .line 94
    return-void

    .line 95
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 96
    .line 97
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method public final D0()V
    .locals 11

    .line 1
    invoke-virtual {p0}, La/idc0;->M0()La/kvc0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/kvc0;->D:La/p7m0;

    .line 6
    .line 7
    new-instance v1, La/s9c0;

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v8, 0x0

    .line 11
    invoke-direct {v1, p0, v8, v3}, La/s9c0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 12
    .line 13
    .line 14
    sget-object v3, La/lkz;->a:La/lkz;

    .line 15
    .line 16
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    new-instance v5, La/p8c0;

    .line 29
    .line 30
    invoke-direct {v5, v0, v3, v1, v8}, La/p8c0;-><init>(La/gmq;La/clz;La/s9c0;La/yje;)V

    .line 31
    .line 32
    .line 33
    const/4 v10, 0x3

    .line 34
    invoke-static {v4, v8, v8, v5, v10}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La/idc0;->M0()La/kvc0;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v0, v0, La/d06;->o:La/ol60;

    .line 42
    .line 43
    const-wide/16 v3, 0x64

    .line 44
    .line 45
    invoke-static {v0, v3, v4}, La/sj3;->S(La/gmq;J)La/gmq;

    .line 46
    .line 47
    .line 48
    move-result-object v9

    .line 49
    new-instance v0, La/p6b0;

    .line 50
    .line 51
    const/4 v6, 0x4

    .line 52
    const/16 v7, 0x1c

    .line 53
    .line 54
    const/4 v1, 0x2

    .line 55
    const-class v3, La/idc0;

    .line 56
    .line 57
    const-string v4, "handleEvents"

    .line 58
    .line 59
    const-string v5, "handleEvents(Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_action/MakeBetAction;)V"

    .line 60
    .line 61
    move-object v2, p0

    .line 62
    invoke-direct/range {v0 .. v7}, La/p6b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 63
    .line 64
    .line 65
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    new-instance v5, La/p8c0;

    .line 78
    .line 79
    invoke-direct {v5, v9, v1, v0, v8}, La/p8c0;-><init>(La/gmq;La/clz;La/p6b0;La/yje;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v4, v8, v8, v5, v10}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, La/idc0;->M0()La/kvc0;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iget-object v0, v0, La/kvc0;->E:La/p7m0;

    .line 90
    .line 91
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    new-instance v1, La/c670;

    .line 96
    .line 97
    const/16 v4, 0x1b

    .line 98
    .line 99
    invoke-direct {v1, p0, v8, v4}, La/c670;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 100
    .line 101
    .line 102
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    invoke-static {v5}, La/x0x;->Q(La/glz;)La/tkz;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    new-instance v6, La/p8c0;

    .line 115
    .line 116
    invoke-direct {v6, v0, v4, v1, v8}, La/p8c0;-><init>(La/xae0;La/clz;La/c670;La/yje;)V

    .line 117
    .line 118
    .line 119
    invoke-static {v5, v8, v8, v6, v10}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0}, La/idc0;->M0()La/kvc0;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iget-object v9, v0, La/d06;->p:La/ol60;

    .line 127
    .line 128
    new-instance v0, La/p6b0;

    .line 129
    .line 130
    const/4 v6, 0x4

    .line 131
    const/16 v7, 0x1d

    .line 132
    .line 133
    const/4 v1, 0x2

    .line 134
    const-string v4, "handleErrors"

    .line 135
    .line 136
    const-string v5, "handleErrors(Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_action/ErrorAction;)V"

    .line 137
    .line 138
    invoke-direct/range {v0 .. v7}, La/p6b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 139
    .line 140
    .line 141
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    invoke-interface {v6}, La/clz;->x()La/glz;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    new-instance v4, La/p8c0;

    .line 154
    .line 155
    move-object v5, v9

    .line 156
    const/4 v9, 0x0

    .line 157
    move-object v7, v0

    .line 158
    invoke-direct/range {v4 .. v9}, La/p8c0;-><init>(La/gmq;La/clz;La/p6b0;La/yje;B)V

    .line 159
    .line 160
    .line 161
    invoke-static {v1, v8, v8, v4, v10}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 162
    .line 163
    .line 164
    return-void
.end method

.method public final I0()Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/idc0;->L0()La/l6q;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/l6q;->c:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 6
    .line 7
    return-object p0
.end method

.method public final J0(La/r0o;)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, La/o0o;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    check-cast p1, La/o0o;

    .line 9
    .line 10
    iget-object v2, p1, La/o0o;->a:Ljava/lang/String;

    .line 11
    .line 12
    iget-object p1, p0, La/idc0;->N1:La/ii;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    new-instance v0, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 17
    .line 18
    const v1, 0x7f1307bb

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const v3, 0x7f130e5d

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    const v4, 0x7f13032f

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    sget-object v9, La/n12;->b:La/n12;

    .line 43
    .line 44
    const/4 v10, 0x0

    .line 45
    const/16 v11, 0x5d0

    .line 46
    .line 47
    const/4 v5, 0x0

    .line 48
    const-string v6, "BET_ALREADY_DONE_REQUEST_KEY_PROMO"

    .line 49
    .line 50
    const/4 v7, 0x0

    .line 51
    const/4 v8, 0x0

    .line 52
    invoke-direct/range {v0 .. v11}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v0, p0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_0
    const-string p0, "actionDialogManager"

    .line 67
    .line 68
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const/4 p0, 0x0

    .line 72
    throw p0

    .line 73
    :cond_1
    invoke-super {p0, p1}, La/zz5;->J0(La/r0o;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public final L0()La/l6q;
    .locals 2

    .line 1
    sget-object v0, La/idc0;->U1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/idc0;->O1:La/s0r;

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
    check-cast p0, La/l6q;

    .line 16
    .line 17
    return-object p0
.end method

.method public final M0()La/kvc0;
    .locals 0

    .line 1
    iget-object p0, p0, La/idc0;->P1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/kvc0;

    .line 8
    .line 9
    return-object p0
.end method
