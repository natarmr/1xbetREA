.class public final La/e68;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/e68;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/cl5",
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
.field public static final N1:La/cl5;

.field public static final synthetic O1:[La/iiy;


# instance fields
.field public K1:La/fiu0;

.field public final L1:La/s0r;

.field public final M1:La/kiu0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/e68;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/biometry/impl/databinding/FragmentBiometryBinding;"

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
    sput-object v1, La/e68;->O1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/cl5;

    .line 21
    .line 22
    const/16 v1, 0x8

    .line 23
    .line 24
    invoke-direct {v0, v1}, La/cl5;-><init>(B)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/e68;->N1:La/cl5;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d0205

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/c68;->a:La/c68;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/e68;->L1:La/s0r;

    .line 14
    .line 15
    new-instance v0, La/zo4;

    .line 16
    .line 17
    const/16 v1, 0x1c

    .line 18
    .line 19
    invoke-direct {v0, p0, v1}, La/zo4;-><init>(Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    new-instance v1, La/p46;

    .line 23
    .line 24
    const/16 v2, 0x18

    .line 25
    .line 26
    invoke-direct {v1, p0, v2}, La/p46;-><init>(Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    sget-object v2, La/wez;->b:La/wez;

    .line 30
    .line 31
    new-instance v3, La/p46;

    .line 32
    .line 33
    const/16 v4, 0x19

    .line 34
    .line 35
    invoke-direct {v3, v1, v4}, La/p46;-><init>(Ljava/lang/Object;B)V

    .line 36
    .line 37
    .line 38
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const-class v2, La/j68;

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
    new-instance v3, La/rt6;

    .line 51
    .line 52
    const/16 v4, 0xa

    .line 53
    .line 54
    invoke-direct {v3, v1, v4}, La/rt6;-><init>(La/a8z;B)V

    .line 55
    .line 56
    .line 57
    new-instance v4, La/rt6;

    .line 58
    .line 59
    const/16 v5, 0xb

    .line 60
    .line 61
    invoke-direct {v4, v1, v5}, La/rt6;-><init>(La/a8z;B)V

    .line 62
    .line 63
    .line 64
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, La/e68;->M1:La/kiu0;

    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, La/e68;->H0()La/j68;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, La/rv00;->d:La/rv00;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, La/j68;->w(La/w58;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, La/e68;->G0()La/qyq;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v0, p1, La/qyq;->b:Lorg/xplatform/ui_core/viewcomponents/views/NumberKeyboardView;

    .line 15
    .line 16
    new-instance v1, La/b68;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-direct {v1, p1, v2}, La/b68;-><init>(La/qyq;B)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lorg/xplatform/ui_core/viewcomponents/views/NumberKeyboardView;->setNumberClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 23
    .line 24
    .line 25
    new-instance v1, La/b68;

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    invoke-direct {v1, p1, v3}, La/b68;-><init>(La/qyq;B)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lorg/xplatform/ui_core/viewcomponents/views/NumberKeyboardView;->setEraseClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, La/e68;->G0()La/qyq;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iget-object p1, p1, La/qyq;->d:Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;

    .line 39
    .line 40
    new-instance v0, La/a68;

    .line 41
    .line 42
    invoke-direct {v0, p0, v2}, La/a68;-><init>(La/e68;B)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v0}, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->setPasswordFinishedInterface(Lkotlin/jvm/functions/Function1;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    new-instance v0, La/gne;

    .line 53
    .line 54
    const/16 v1, 0x11

    .line 55
    .line 56
    invoke-direct {v0, p0, v1}, La/gne;-><init>(Ljava/lang/Object;B)V

    .line 57
    .line 58
    .line 59
    const-string v1, "FINGERPRINT_REQUEST_KEY"

    .line 60
    .line 61
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 62
    .line 63
    .line 64
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
    const-class v1, La/f68;

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
    instance-of v3, v0, La/f68;

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
    check-cast v2, La/f68;

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
    iget-object v1, v2, La/f68;->a:La/y58;

    .line 63
    .line 64
    iget-object v2, v2, La/f68;->b:La/eg3;

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    new-instance v3, La/nhf0;

    .line 73
    .line 74
    invoke-direct {v3, v1, v2, v0}, La/nhf0;-><init>(La/y58;La/eg3;La/i1w0;)V

    .line 75
    .line 76
    .line 77
    new-instance v0, La/fiu0;

    .line 78
    .line 79
    iget-object v1, v3, La/nhf0;->d:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v1, La/n8i;

    .line 82
    .line 83
    const-class v2, La/j68;

    .line 84
    .line 85
    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 90
    .line 91
    .line 92
    iput-object v0, p0, La/e68;->K1:La/fiu0;

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
    .locals 19

    .line 1
    invoke-virtual/range {p0 .. p0}, La/e68;->H0()La/j68;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v2, v0, La/j68;->j:La/p7m0;

    .line 6
    .line 7
    new-instance v3, La/c48;

    .line 8
    .line 9
    const/4 v9, 0x4

    .line 10
    const/4 v10, 0x1

    .line 11
    const/4 v4, 0x2

    .line 12
    const-class v6, La/e68;

    .line 13
    .line 14
    const-string v7, "handleBiometryUIState"

    .line 15
    .line 16
    const-string v8, "handleBiometryUIState(Lorg/xplatform/biometry/impl/presentation/models/BiometryAvailabilityUiState;)V"

    .line 17
    .line 18
    move-object/from16 v5, p0

    .line 19
    .line 20
    invoke-direct/range {v3 .. v10}, La/c48;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 21
    .line 22
    .line 23
    move-object v14, v6

    .line 24
    sget-object v0, La/lkz;->a:La/lkz;

    .line 25
    .line 26
    move-object v4, v3

    .line 27
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v1, La/u47;

    .line 40
    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v5, 0x0

    .line 43
    invoke-direct/range {v1 .. v6}, La/u47;-><init>(La/gmq;La/clz;La/c48;La/yje;B)V

    .line 44
    .line 45
    .line 46
    const/4 v2, 0x3

    .line 47
    invoke-static {v0, v5, v5, v1, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 48
    .line 49
    .line 50
    invoke-virtual/range {p0 .. p0}, La/e68;->H0()La/j68;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-object v0, v0, La/j68;->k:La/ol60;

    .line 55
    .line 56
    sget-object v1, La/lkz;->a:La/lkz;

    .line 57
    .line 58
    new-instance v11, La/c48;

    .line 59
    .line 60
    const/16 v17, 0x4

    .line 61
    .line 62
    const/16 v18, 0x2

    .line 63
    .line 64
    const/4 v12, 0x2

    .line 65
    const-string v15, "onAction"

    .line 66
    .line 67
    const-string v16, "onAction(Lorg/xplatform/biometry/impl/presentation/BiometryViewModel$ActionUi;)V"

    .line 68
    .line 69
    move-object/from16 v13, p0

    .line 70
    .line 71
    invoke-direct/range {v11 .. v18}, La/c48;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 72
    .line 73
    .line 74
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    new-instance v4, La/u47;

    .line 87
    .line 88
    invoke-direct {v4, v0, v1, v11, v5}, La/u47;-><init>(La/gmq;La/clz;La/c48;La/yje;)V

    .line 89
    .line 90
    .line 91
    invoke-static {v3, v5, v5, v4, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public final G0()La/qyq;
    .locals 2

    .line 1
    sget-object v0, La/e68;->O1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/e68;->L1:La/s0r;

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
    check-cast p0, La/qyq;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/j68;
    .locals 0

    .line 1
    iget-object p0, p0, La/e68;->M1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/j68;

    .line 8
    .line 9
    return-object p0
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/e68;->H0()La/j68;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object p1, La/gqw0;->q:La/gqw0;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, La/j68;->w(La/w58;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final e0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/e68;->G0()La/qyq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/qyq;->b:Lorg/xplatform/ui_core/viewcomponents/views/NumberKeyboardView;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, La/e68;->G0()La/qyq;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v0, v0, La/qyq;->b:Lorg/xplatform/ui_core/viewcomponents/views/NumberKeyboardView;

    .line 18
    .line 19
    new-instance v1, La/a68;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-direct {v1, p0, v2}, La/a68;-><init>(La/e68;B)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lorg/xplatform/ui_core/viewcomponents/views/NumberKeyboardView;->setFingerprintClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-super {p0}, La/yx5;->e0()V

    .line 29
    .line 30
    .line 31
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
    const-string v0, "FINGERPRINT_REQUEST_KEY"

    .line 5
    .line 6
    invoke-static {p0, v0}, La/vcc;->C(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
