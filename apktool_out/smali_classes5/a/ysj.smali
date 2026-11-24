.class public final La/ysj;
.super La/stl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/stl<",
        "La/mhn0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/ysj;",
        "La/stl;",
        "La/mhn0;",
        "<init>",
        "()V",
        "a/qud",
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
.field public static final m2:La/qud;

.field public static final synthetic n2:[La/iiy;


# instance fields
.field public final g2:La/yzn0;

.field public final h2:La/n0o0;

.field public final i2:La/n0o0;

.field public j2:La/fiu0;

.field public k2:La/wdk0;

.field public final l2:La/kiu0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/ysj;

    .line 4
    .line 5
    const-string v2, "balanceScreenTypeBundle"

    .line 6
    .line 7
    const-string v3, "getBalanceScreenTypeBundle()Lorg/xplatform/balance/model/BalanceScreenType;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/ysj;->n2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/qud;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/ysj;->m2:La/qud;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, La/stl;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/yzn0;

    .line 5
    .line 6
    const-string v1, "BALANCE_TYPE_BUNDLE_KEY"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/ysj;->g2:La/yzn0;

    .line 12
    .line 13
    new-instance v0, La/vsj;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, p0, v1}, La/vsj;-><init>(La/ysj;B)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, La/ysj;->h2:La/n0o0;

    .line 24
    .line 25
    new-instance v0, La/vsj;

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-direct {v0, p0, v1}, La/vsj;-><init>(La/ysj;B)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, La/ysj;->i2:La/n0o0;

    .line 36
    .line 37
    new-instance v0, La/vsj;

    .line 38
    .line 39
    const/4 v1, 0x2

    .line 40
    invoke-direct {v0, p0, v1}, La/vsj;-><init>(La/ysj;B)V

    .line 41
    .line 42
    .line 43
    new-instance v1, La/q7g;

    .line 44
    .line 45
    const/16 v2, 0x17

    .line 46
    .line 47
    invoke-direct {v1, p0, v2}, La/q7g;-><init>(Ljava/lang/Object;B)V

    .line 48
    .line 49
    .line 50
    sget-object v2, La/wez;->b:La/wez;

    .line 51
    .line 52
    new-instance v3, La/q7g;

    .line 53
    .line 54
    const/16 v4, 0x18

    .line 55
    .line 56
    invoke-direct {v3, v1, v4}, La/q7g;-><init>(Ljava/lang/Object;B)V

    .line 57
    .line 58
    .line 59
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const-class v2, La/btj;

    .line 64
    .line 65
    sget-object v3, La/sre0;->a:La/tre0;

    .line 66
    .line 67
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    new-instance v3, La/r7g;

    .line 72
    .line 73
    const/16 v4, 0x1a

    .line 74
    .line 75
    invoke-direct {v3, v1, v4}, La/r7g;-><init>(La/a8z;B)V

    .line 76
    .line 77
    .line 78
    new-instance v4, La/r7g;

    .line 79
    .line 80
    const/16 v5, 0x1b

    .line 81
    .line 82
    invoke-direct {v4, v1, v5}, La/r7g;-><init>(La/a8z;B)V

    .line 83
    .line 84
    .line 85
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iput-object v0, p0, La/ysj;->l2:La/kiu0;

    .line 90
    .line 91
    return-void
.end method


# virtual methods
.method public final bridge synthetic Q0()La/yfu0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/ysj;->V0()La/mhn0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final S0()V
    .locals 4

    .line 1
    new-instance v0, La/kp8;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const v2, 0x7f13026b

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const v2, 0x7f1404af

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v1, v2}, La/kp8;-><init>(Ljava/lang/String;I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, La/stl;->I0(La/kp8;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, La/ysj;->V0()La/mhn0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v0, v0, La/mhn0;->c:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 31
    .line 32
    new-instance v1, La/tjj;

    .line 33
    .line 34
    const/16 v2, 0xd

    .line 35
    .line 36
    const/4 v3, 0x2

    .line 37
    invoke-direct {v1, v2, v3}, La/tjj;-><init>(II)V

    .line 38
    .line 39
    .line 40
    const/4 v2, 0x1

    .line 41
    new-array v2, v2, [Landroid/text/InputFilter;

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    aput-object v1, v2, v3

    .line 45
    .line 46
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->setFilters([Landroid/text/InputFilter;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, La/ysj;->V0()La/mhn0;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget-object v0, v0, La/mhn0;->c:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 54
    .line 55
    iget-object v1, p0, La/ysj;->i2:La/n0o0;

    .line 56
    .line 57
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, La/da0;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    iget-object v0, v0, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->a(Landroid/text/TextWatcher;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, La/ysj;->V0()La/mhn0;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget-object v0, v0, La/mhn0;->d:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetButton;

    .line 76
    .line 77
    new-instance v1, La/q10;

    .line 78
    .line 79
    const/16 v2, 0xe

    .line 80
    .line 81
    invoke-direct {v1, p0, v2}, La/q10;-><init>(Ljava/lang/Object;B)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, La/ysj;->V0()La/mhn0;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iget-object v0, v0, La/mhn0;->e:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetSpacing;

    .line 92
    .line 93
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    const v2, 0x7f0706f8

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetSpacing;->setSpace(I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, La/ysj;->V0()La/mhn0;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    iget-object v0, v0, La/mhn0;->b:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetSpacing;

    .line 112
    .line 113
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetSpacing;->setSpace(I)V

    .line 122
    .line 123
    .line 124
    return-void
.end method

.method public final U0()V
    .locals 16

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    iget-object v8, v2, La/ysj;->l2:La/kiu0;

    .line 4
    .line 5
    invoke-virtual {v8}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, La/btj;

    .line 10
    .line 11
    iget-object v9, v0, La/btj;->k:La/p7m0;

    .line 12
    .line 13
    new-instance v0, La/d7e;

    .line 14
    .line 15
    const/4 v6, 0x4

    .line 16
    const/16 v7, 0x1a

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    const-class v3, La/ysj;

    .line 20
    .line 21
    const-string v4, "updateUiState"

    .line 22
    .line 23
    const-string v5, "updateUiState(Lorg/xplatform/make_bet_settings/impl/presentation/model/EditSumBottomSheetScreenState;)V"

    .line 24
    .line 25
    invoke-direct/range {v0 .. v7}, La/d7e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 26
    .line 27
    .line 28
    sget-object v1, La/lkz;->a:La/lkz;

    .line 29
    .line 30
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    new-instance v4, La/xsj;

    .line 43
    .line 44
    const/4 v14, 0x0

    .line 45
    invoke-direct {v4, v9, v1, v0, v14}, La/xsj;-><init>(La/gmq;La/clz;La/d7e;La/yje;)V

    .line 46
    .line 47
    .line 48
    const/4 v9, 0x3

    .line 49
    invoke-static {v2, v14, v14, v4, v9}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v8}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, La/btj;

    .line 57
    .line 58
    iget-object v11, v0, La/btj;->l:La/ol60;

    .line 59
    .line 60
    new-instance v0, La/d7e;

    .line 61
    .line 62
    const/16 v7, 0x1b

    .line 63
    .line 64
    const/4 v1, 0x2

    .line 65
    const-string v4, "handleActions"

    .line 66
    .line 67
    const-string v5, "handleActions(Lorg/xplatform/make_bet_settings/impl/presentation/model/EditSumBottomSheetAction;)V"

    .line 68
    .line 69
    move-object/from16 v2, p0

    .line 70
    .line 71
    invoke-direct/range {v0 .. v7}, La/d7e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 72
    .line 73
    .line 74
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 75
    .line 76
    .line 77
    move-result-object v12

    .line 78
    invoke-interface {v12}, La/clz;->x()La/glz;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    new-instance v10, La/xsj;

    .line 87
    .line 88
    const/4 v15, 0x0

    .line 89
    move-object v13, v0

    .line 90
    invoke-direct/range {v10 .. v15}, La/xsj;-><init>(La/gmq;La/clz;La/d7e;La/yje;B)V

    .line 91
    .line 92
    .line 93
    invoke-static {v1, v14, v14, v10, v9}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public final V(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, La/sik;->V(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    instance-of v0, p1, La/af3;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    check-cast p1, La/af3;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object p1, v1

    .line 24
    :goto_0
    const-class v0, La/p2j0;

    .line 25
    .line 26
    if-eqz p1, :cond_3

    .line 27
    .line 28
    invoke-interface {p1}, La/af3;->d()La/wcf0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1, v0}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, La/o5d0;

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, La/ze3;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move-object p1, v1

    .line 48
    :goto_1
    instance-of v2, p1, La/p2j0;

    .line 49
    .line 50
    if-nez v2, :cond_2

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    move-object v1, p1

    .line 54
    :goto_2
    check-cast v1, La/p2j0;

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    sget-object v0, La/ysj;->n2:[La/iiy;

    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    aget-object v0, v0, v2

    .line 66
    .line 67
    iget-object v2, p0, La/ysj;->g2:La/yzn0;

    .line 68
    .line 69
    invoke-virtual {v2, p0, v0}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, La/bm5;

    .line 74
    .line 75
    invoke-virtual {v1, p1, v0}, La/p2j0;->a(La/i1w0;La/bm5;)La/i7i;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p1}, La/i7i;->x()La/fiu0;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iput-object v0, p0, La/ysj;->j2:La/fiu0;

    .line 84
    .line 85
    iget-object p1, p1, La/i7i;->z:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p1, La/wdk0;

    .line 88
    .line 89
    iput-object p1, p0, La/ysj;->k2:La/wdk0;

    .line 90
    .line 91
    return-void

    .line 92
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 93
    .line 94
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public final V0()La/mhn0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ysj;->h2:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, La/mhn0;

    .line 11
    .line 12
    return-object p0
.end method

.method public final Z()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/ysj;->V0()La/mhn0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/mhn0;->c:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 6
    .line 7
    iget-object v1, p0, La/ysj;->i2:La/n0o0;

    .line 8
    .line 9
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, La/da0;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v0, v0, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->c(Landroid/text/TextWatcher;)V

    .line 21
    .line 22
    .line 23
    invoke-super {p0}, La/stl;->Z()V

    .line 24
    .line 25
    .line 26
    return-void
.end method
