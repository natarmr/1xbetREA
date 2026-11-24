.class public final La/cff;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/aif;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/cff;",
        "La/yx5;",
        "La/aif;",
        "<init>",
        "()V",
        "a/qud",
        "crystal"
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
.field public static final P1:La/qud;

.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public final L1:La/s0r;

.field public final M1:La/n0o0;

.field public N1:La/pdi;

.field public final O1:La/kiu0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/cff;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/crystal/databinding/CrystalFragmentBinding;"

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
    sput-object v1, La/cff;->Q1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/qud;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/cff;->P1:La/qud;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d009f

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
    iput-object v0, p0, La/cff;->K1:La/i9o0;

    .line 10
    .line 11
    sget-object v0, La/bff;->a:La/bff;

    .line 12
    .line 13
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, La/cff;->L1:La/s0r;

    .line 18
    .line 19
    new-instance v0, La/aff;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, p0, v1}, La/aff;-><init>(La/cff;B)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, La/cff;->M1:La/n0o0;

    .line 30
    .line 31
    new-instance v0, La/aff;

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    invoke-direct {v0, p0, v1}, La/aff;-><init>(La/cff;B)V

    .line 35
    .line 36
    .line 37
    new-instance v1, La/aqe;

    .line 38
    .line 39
    const/16 v2, 0x12

    .line 40
    .line 41
    invoke-direct {v1, p0, v2}, La/aqe;-><init>(Ljava/lang/Object;B)V

    .line 42
    .line 43
    .line 44
    sget-object v3, La/wez;->b:La/wez;

    .line 45
    .line 46
    new-instance v4, La/aqe;

    .line 47
    .line 48
    const/16 v5, 0x13

    .line 49
    .line 50
    invoke-direct {v4, v1, v5}, La/aqe;-><init>(Ljava/lang/Object;B)V

    .line 51
    .line 52
    .line 53
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    const-class v3, La/wff;

    .line 58
    .line 59
    sget-object v4, La/sre0;->a:La/tre0;

    .line 60
    .line 61
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    new-instance v4, La/cce;

    .line 66
    .line 67
    invoke-direct {v4, v1, v2}, La/cce;-><init>(La/a8z;B)V

    .line 68
    .line 69
    .line 70
    new-instance v2, La/cce;

    .line 71
    .line 72
    invoke-direct {v2, v1, v5}, La/cce;-><init>(La/a8z;B)V

    .line 73
    .line 74
    .line 75
    invoke-static {p0, v3, v4, v2, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iput-object v0, p0, La/cff;->O1:La/kiu0;

    .line 80
    .line 81
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/cff;->G0()La/zef;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/zef;->b:Lorg/xplatform/crystal/presentation/views/CrystalFieldView;

    .line 6
    .line 7
    invoke-virtual {p1, p0}, Lorg/xplatform/crystal/presentation/views/CrystalFieldView;->setUpdateInterface(La/aif;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/cff;->O1:La/kiu0;

    .line 11
    .line 12
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, La/wff;

    .line 17
    .line 18
    iget-object p1, p0, La/wff;->c:La/zwf0;

    .line 19
    .line 20
    iget-object p1, p1, La/zwf0;->a:La/vgf;

    .line 21
    .line 22
    iget-object p1, p1, La/vgf;->c:La/fgf;

    .line 23
    .line 24
    iget-object p1, p1, La/fgf;->a:La/lgf;

    .line 25
    .line 26
    sget-object v0, La/lgf;->h:La/lgf;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, La/lgf;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    new-instance v0, La/rff;

    .line 35
    .line 36
    iget-object v1, p0, La/wff;->h:La/vcu;

    .line 37
    .line 38
    invoke-virtual {v1}, La/vcu;->a()La/vrs;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, La/vrs;->a()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    invoke-direct {v0, p1, v1}, La/rff;-><init>(La/lgf;Z)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v0}, La/wff;->x(La/uff;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    return-void
.end method

.method public final C0()V
    .locals 1

    .line 1
    iget-object v0, p0, La/cff;->M1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/qdi;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, La/qdi;->k0:La/n5d0;

    .line 12
    .line 13
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, La/pdi;

    .line 18
    .line 19
    iput-object v0, p0, La/cff;->N1:La/pdi;

    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final G0()La/zef;
    .locals 2

    .line 1
    sget-object v0, La/cff;->Q1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/cff;->L1:La/s0r;

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
    check-cast p0, La/zef;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()V
    .locals 9

    .line 1
    iget-object p0, p0, La/cff;->O1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    move-object v2, p0

    .line 8
    check-cast v2, La/wff;

    .line 9
    .line 10
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    new-instance v0, La/x6f;

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x5

    .line 18
    const/4 v1, 0x1

    .line 19
    const-class v3, La/wff;

    .line 20
    .line 21
    const-string v4, "handleGameError"

    .line 22
    .line 23
    const-string v5, "handleGameError(Ljava/lang/Throwable;)V"

    .line 24
    .line 25
    invoke-direct/range {v0 .. v7}, La/x6f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 26
    .line 27
    .line 28
    iget-object v1, v2, La/wff;->i:La/mne;

    .line 29
    .line 30
    iget-object v6, v1, La/mne;->a:La/rwj;

    .line 31
    .line 32
    new-instance v7, La/fze;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-direct {v7, v2, v1}, La/fze;-><init>(La/wff;La/yje;)V

    .line 36
    .line 37
    .line 38
    const/16 v8, 0xa

    .line 39
    .line 40
    const/4 v5, 0x0

    .line 41
    move-object v3, p0

    .line 42
    move-object v4, v0

    .line 43
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final Z()V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/cff;->G0()La/zef;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/zef;->b:Lorg/xplatform/crystal/presentation/views/CrystalFieldView;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput-object v1, v0, Lorg/xplatform/crystal/presentation/views/CrystalFieldView;->a:La/aif;

    .line 9
    .line 10
    invoke-virtual {p0}, La/cff;->G0()La/zef;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v0, v0, La/zef;->b:Lorg/xplatform/crystal/presentation/views/CrystalFieldView;

    .line 15
    .line 16
    iget-object v1, v0, Lorg/xplatform/crystal/presentation/views/CrystalFieldView;->h:Landroid/animation/AnimatorSet;

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->isStarted()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-ne v1, v2, :cond_1

    .line 26
    .line 27
    iget-object v1, v0, Lorg/xplatform/crystal/presentation/views/CrystalFieldView;->h:Landroid/animation/AnimatorSet;

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/animation/Animator;->removeAllListeners()V

    .line 32
    .line 33
    .line 34
    :cond_0
    iget-object v1, v0, Lorg/xplatform/crystal/presentation/views/CrystalFieldView;->h:Landroid/animation/AnimatorSet;

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->cancel()V

    .line 39
    .line 40
    .line 41
    :cond_1
    iget-object v1, v0, Lorg/xplatform/crystal/presentation/views/CrystalFieldView;->i:Landroid/animation/ValueAnimator;

    .line 42
    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isStarted()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-ne v1, v2, :cond_3

    .line 50
    .line 51
    iget-object v1, v0, Lorg/xplatform/crystal/presentation/views/CrystalFieldView;->i:Landroid/animation/ValueAnimator;

    .line 52
    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    invoke-virtual {v1}, Landroid/animation/Animator;->removeAllListeners()V

    .line 56
    .line 57
    .line 58
    :cond_2
    iget-object v0, v0, Lorg/xplatform/crystal/presentation/views/CrystalFieldView;->i:Landroid/animation/ValueAnimator;

    .line 59
    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 63
    .line 64
    .line 65
    :cond_3
    invoke-super {p0}, La/yx5;->Z()V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/yx5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, La/cff;->O1:La/kiu0;

    .line 8
    .line 9
    invoke-virtual {p1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, La/wff;

    .line 14
    .line 15
    iget-object p1, p1, La/wff;->n:La/q99;

    .line 16
    .line 17
    invoke-static {p1}, La/xkb;->V(La/htb;)La/itb;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    new-instance p2, La/fob;

    .line 22
    .line 23
    const/16 v0, 0x16

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-direct {p2, p0, v1, v0}, La/fob;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 27
    .line 28
    .line 29
    sget-object v0, La/lkz;->a:La/lkz;

    .line 30
    .line 31
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v2, La/fze;

    .line 44
    .line 45
    invoke-direct {v2, p1, p0, p2, v1}, La/fze;-><init>(La/itb;La/clz;La/fob;La/yje;)V

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x3

    .line 49
    invoke-static {v0, v1, v1, v2, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/cff;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
