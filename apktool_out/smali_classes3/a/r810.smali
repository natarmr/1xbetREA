.class public final La/r810;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/r810;",
        "La/yx5;",
        "<init>",
        "()V",
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
.field public static final synthetic P1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public L1:La/eki;

.field public M1:La/ii;

.field public final N1:La/kiu0;

.field public final O1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/r810;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/bonus_games/impl/databinding/FragmentLotteryBinding;"

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
    sput-object v1, La/r810;->P1:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d025d

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
    iput-object v0, p0, La/r810;->K1:La/i9o0;

    .line 10
    .line 11
    new-instance v0, La/rx00;

    .line 12
    .line 13
    const/4 v1, 0x3

    .line 14
    invoke-direct {v0, p0, v1}, La/rx00;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    new-instance v2, La/be00;

    .line 18
    .line 19
    const/16 v3, 0xa

    .line 20
    .line 21
    invoke-direct {v2, p0, v3}, La/be00;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    sget-object v3, La/wez;->b:La/wez;

    .line 25
    .line 26
    new-instance v4, La/be00;

    .line 27
    .line 28
    const/16 v5, 0xb

    .line 29
    .line 30
    invoke-direct {v4, v2, v5}, La/be00;-><init>(Ljava/lang/Object;B)V

    .line 31
    .line 32
    .line 33
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const-class v3, La/e910;

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
    new-instance v4, La/j210;

    .line 46
    .line 47
    const/4 v5, 0x2

    .line 48
    invoke-direct {v4, v2, v5}, La/j210;-><init>(La/a8z;B)V

    .line 49
    .line 50
    .line 51
    new-instance v5, La/j210;

    .line 52
    .line 53
    invoke-direct {v5, v2, v1}, La/j210;-><init>(La/a8z;B)V

    .line 54
    .line 55
    .line 56
    invoke-static {p0, v3, v4, v5, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iput-object v0, p0, La/r810;->N1:La/kiu0;

    .line 61
    .line 62
    sget-object v0, La/p810;->a:La/p810;

    .line 63
    .line 64
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, La/r810;->O1:La/s0r;

    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 8

    .line 1
    new-instance v0, La/o0t;

    .line 2
    .line 3
    invoke-virtual {p0}, La/r810;->I0()La/e910;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    const/4 v6, 0x0

    .line 8
    const/16 v7, 0x10

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    const-class v3, La/e910;

    .line 12
    .line 13
    const-string v4, "onBackPressed"

    .line 14
    .line 15
    const-string v5, "onBackPressed()V"

    .line 16
    .line 17
    invoke-direct/range {v0 .. v7}, La/o0t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0, p0, v0}, La/qcc;->W(Landroidx/fragment/app/Fragment;La/clz;Lkotlin/jvm/functions/Function0;)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    invoke-virtual {p0, p1}, La/r810;->G0(Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, La/r810;->H0()La/e1r;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object p1, p1, La/e1r;->b:Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;

    .line 32
    .line 33
    new-instance v0, La/nr00;

    .line 34
    .line 35
    invoke-direct {v0, p0}, La/nr00;-><init>(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v0}, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->setListener(La/h910;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final C0()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    instance-of v1, v0, La/g910;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, La/g910;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, v0, La/g910;->S1:La/n0o0;

    .line 14
    .line 15
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, La/fki;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-object v1, v0, La/fki;->i:La/n5d0;

    .line 24
    .line 25
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, La/eki;

    .line 30
    .line 31
    iput-object v1, p0, La/r810;->L1:La/eki;

    .line 32
    .line 33
    iget-object v0, v0, La/fki;->a:La/g8i;

    .line 34
    .line 35
    invoke-virtual {v0}, La/g8i;->j()La/ii;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, La/r810;->M1:La/ii;

    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public final D0()V
    .locals 9

    .line 1
    invoke-virtual {p0}, La/r810;->I0()La/e910;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/e910;->l:La/qoj0;

    .line 6
    .line 7
    new-instance v1, La/q810;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v7, 0x0

    .line 11
    invoke-direct {v1, p0, v7, v2}, La/q810;-><init>(La/r810;La/yje;B)V

    .line 12
    .line 13
    .line 14
    sget-object v2, La/lkz;->a:La/lkz;

    .line 15
    .line 16
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    new-instance v4, La/zd00;

    .line 29
    .line 30
    invoke-direct {v4, v0, v2, v1, v7}, La/zd00;-><init>(La/gmq;La/clz;La/q810;La/yje;)V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    invoke-static {v3, v7, v7, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La/r810;->I0()La/e910;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v4, v1, La/e910;->k:La/p7m0;

    .line 42
    .line 43
    new-instance v6, La/q810;

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    invoke-direct {v6, p0, v7, v1}, La/q810;-><init>(La/r810;La/yje;B)V

    .line 47
    .line 48
    .line 49
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    new-instance v3, La/zd00;

    .line 62
    .line 63
    const/4 v8, 0x0

    .line 64
    invoke-direct/range {v3 .. v8}, La/zd00;-><init>(La/gmq;La/clz;La/q810;La/yje;B)V

    .line 65
    .line 66
    .line 67
    invoke-static {p0, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final G0(Z)V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/r810;->H0()La/e1r;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/e1r;->b:Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;

    .line 6
    .line 7
    invoke-static {p0}, La/phu0;->M(Landroid/view/View;)La/sx3;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v0, v0, La/sx3;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 14
    .line 15
    invoke-static {v0}, La/igi0;->a(Lkotlin/jvm/functions/Function2;)La/egi0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :goto_0
    invoke-virtual {v0}, La/egi0;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0}, La/egi0;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Landroid/view/View;

    .line 30
    .line 31
    invoke-virtual {v1, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iget-object p0, p0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->a:[La/sdq0;

    .line 36
    .line 37
    array-length v0, p0

    .line 38
    const/4 v1, 0x0

    .line 39
    :goto_1
    if-ge v1, v0, :cond_2

    .line 40
    .line 41
    aget-object v2, p0, v1

    .line 42
    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    invoke-interface {v2, p1}, La/sdq0;->f(Z)V

    .line 46
    .line 47
    .line 48
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    return-void
.end method

.method public final H0()La/e1r;
    .locals 2

    .line 1
    sget-object v0, La/r810;->P1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/r810;->O1:La/s0r;

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
    check-cast p0, La/e1r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final I0()La/e910;
    .locals 0

    .line 1
    iget-object p0, p0, La/r810;->N1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/e910;

    .line 8
    .line 9
    return-object p0
.end method

.method public final f0(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 2
    .line 3
    const-string v0, "_lottery"

    .line 4
    .line 5
    invoke-virtual {p0}, La/r810;->H0()La/e1r;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget-object p0, p0, La/e1r;->b:Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;

    .line 10
    .line 11
    invoke-virtual {p0}, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->c()Landroid/os/Bundle;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p1, v0, p0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catchall_0
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 20
    .line 21
    return-void
.end method

.method public final j0(Landroid/os/Bundle;)V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    if-eqz p1, :cond_4

    .line 5
    .line 6
    const-string v1, "_lottery"

    .line 7
    .line 8
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_4

    .line 13
    .line 14
    invoke-virtual {p0}, La/r810;->H0()La/e1r;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    iget-object p0, p0, La/e1r;->b:Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;

    .line 19
    .line 20
    iget-object v1, p0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->a:[La/sdq0;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    move v3, v2

    .line 24
    :goto_0
    const/16 v4, 0x8

    .line 25
    .line 26
    if-ge v3, v4, :cond_3

    .line 27
    .line 28
    new-instance v5, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v6, "_ticket_"

    .line 31
    .line 32
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-virtual {p1, v5}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    if-eqz v5, :cond_0

    .line 47
    .line 48
    aget-object v6, v1, v3

    .line 49
    .line 50
    if-eqz v6, :cond_0

    .line 51
    .line 52
    invoke-interface {v6, v5}, La/sdq0;->i(Landroid/os/Bundle;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    new-instance v5, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v6, "_ticket_visibility"

    .line 58
    .line 59
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-virtual {p1, v5}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    aget-object v6, v1, v3

    .line 74
    .line 75
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    check-cast v6, Landroid/view/View;

    .line 79
    .line 80
    if-nez v5, :cond_1

    .line 81
    .line 82
    move v4, v2

    .line 83
    :cond_1
    invoke-virtual {v6, v4}, Landroid/view/View;->setVisibility(I)V

    .line 84
    .line 85
    .line 86
    if-eqz v5, :cond_2

    .line 87
    .line 88
    iget v4, p0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->c:I

    .line 89
    .line 90
    add-int/2addr v4, v0

    .line 91
    iput v4, p0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->c:I

    .line 92
    .line 93
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_3
    const-string v0, "_selected"

    .line 97
    .line 98
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    const/4 v0, -0x1

    .line 103
    if-eq p1, v0, :cond_4

    .line 104
    .line 105
    sget-object v0, La/n910;->c:La/n910;

    .line 106
    .line 107
    iput-object v0, p0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->f:La/n910;

    .line 108
    .line 109
    aget-object p1, v1, p1

    .line 110
    .line 111
    iput-object p1, p0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->b:La/sdq0;

    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    check-cast p1, Landroid/view/View;

    .line 117
    .line 118
    const/4 v0, 0x0

    .line 119
    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V

    .line 120
    .line 121
    .line 122
    iget-object p1, p0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->b:La/sdq0;

    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    check-cast p1, Landroid/view/View;

    .line 128
    .line 129
    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 130
    .line 131
    .line 132
    iget-object p1, p0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->b:La/sdq0;

    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    check-cast p1, Landroid/view/View;

    .line 138
    .line 139
    const/high16 v1, 0x3f800000    # 1.0f

    .line 140
    .line 141
    invoke-virtual {p1, v1}, Landroid/view/View;->setScaleY(F)V

    .line 142
    .line 143
    .line 144
    iget-object p1, p0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->b:La/sdq0;

    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    check-cast p1, Landroid/view/View;

    .line 150
    .line 151
    invoke-virtual {p1, v1}, Landroid/view/View;->setScaleY(F)V

    .line 152
    .line 153
    .line 154
    iget-object p1, p0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->b:La/sdq0;

    .line 155
    .line 156
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    check-cast p1, Landroid/view/View;

    .line 160
    .line 161
    invoke-virtual {p1, v0}, Landroid/view/View;->setRotation(F)V

    .line 162
    .line 163
    .line 164
    iget-object p1, p0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->b:La/sdq0;

    .line 165
    .line 166
    check-cast p1, Landroid/view/View;

    .line 167
    .line 168
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 169
    .line 170
    .line 171
    iget-object p1, p0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->b:La/sdq0;

    .line 172
    .line 173
    check-cast p1, Landroid/view/View;

    .line 174
    .line 175
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 176
    .line 177
    .line 178
    :cond_4
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/r810;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
