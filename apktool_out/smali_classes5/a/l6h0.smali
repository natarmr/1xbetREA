.class public final La/l6h0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/l6h0;",
        "La/yx5;",
        "<init>",
        "()V",
        "scratch_card"
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
.field public static final synthetic O1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public L1:La/fiu0;

.field public final M1:La/kiu0;

.field public final N1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/l6h0;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/scratch_card/databinding/FragmentScratchCardBinding;"

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
    sput-object v1, La/l6h0;->O1:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d02c4

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
    iput-object v0, p0, La/l6h0;->K1:La/i9o0;

    .line 10
    .line 11
    new-instance v0, La/j6h0;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p0, v1}, La/j6h0;-><init>(La/l6h0;B)V

    .line 15
    .line 16
    .line 17
    new-instance v1, La/yxf0;

    .line 18
    .line 19
    const/16 v2, 0xe

    .line 20
    .line 21
    invoke-direct {v1, p0, v2}, La/yxf0;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    sget-object v2, La/wez;->b:La/wez;

    .line 25
    .line 26
    new-instance v3, La/yxf0;

    .line 27
    .line 28
    const/16 v4, 0xf

    .line 29
    .line 30
    invoke-direct {v3, v1, v4}, La/yxf0;-><init>(Ljava/lang/Object;B)V

    .line 31
    .line 32
    .line 33
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const-class v2, La/w6h0;

    .line 38
    .line 39
    sget-object v3, La/sre0;->a:La/tre0;

    .line 40
    .line 41
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    new-instance v3, La/fxf0;

    .line 46
    .line 47
    const/16 v4, 0x10

    .line 48
    .line 49
    invoke-direct {v3, v1, v4}, La/fxf0;-><init>(La/a8z;B)V

    .line 50
    .line 51
    .line 52
    new-instance v4, La/fxf0;

    .line 53
    .line 54
    const/16 v5, 0x11

    .line 55
    .line 56
    invoke-direct {v4, v1, v5}, La/fxf0;-><init>(La/a8z;B)V

    .line 57
    .line 58
    .line 59
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, La/l6h0;->M1:La/kiu0;

    .line 64
    .line 65
    sget-object v0, La/k6h0;->a:La/k6h0;

    .line 66
    .line 67
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, p0, La/l6h0;->N1:La/s0r;

    .line 72
    .line 73
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    instance-of v1, v0, La/l7h0;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, La/l7h0;

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
    iget-object v0, v0, La/l7h0;->W1:La/n0o0;

    .line 14
    .line 15
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, La/qsi;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    new-instance v1, La/fiu0;

    .line 24
    .line 25
    const-class v2, La/w6h0;

    .line 26
    .line 27
    iget-object v0, v0, La/qsi;->n0:La/psi;

    .line 28
    .line 29
    invoke-static {v2, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-direct {v1, v0}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, La/l6h0;->L1:La/fiu0;

    .line 37
    .line 38
    :cond_1
    return-void
.end method

.method public final D0()V
    .locals 5

    .line 1
    iget-object v0, p0, La/l6h0;->M1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/w6h0;

    .line 8
    .line 9
    iget-object v0, v0, La/w6h0;->n:La/p7m0;

    .line 10
    .line 11
    new-instance v1, La/tye0;

    .line 12
    .line 13
    const/16 v2, 0x15

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v1, p0, v3, v2}, La/tye0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 17
    .line 18
    .line 19
    sget-object v2, La/lkz;->a:La/lkz;

    .line 20
    .line 21
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    new-instance v4, La/kmg0;

    .line 34
    .line 35
    invoke-direct {v4, v0, p0, v1, v3}, La/kmg0;-><init>(La/gmq;La/clz;La/tye0;La/yje;)V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x3

    .line 39
    invoke-static {v2, v3, v3, v4, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final G0()La/m4r;
    .locals 2

    .line 1
    sget-object v0, La/l6h0;->O1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/l6h0;->N1:La/s0r;

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
    check-cast p0, La/m4r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0(Z)V
    .locals 4

    .line 1
    invoke-virtual {p0}, La/l6h0;->G0()La/m4r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/m4r;->f:Lorg/xplatform/scratch_card/presentation/views/ScratchCardView;

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    move v3, v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v3, v1

    .line 15
    :goto_0
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, La/l6h0;->G0()La/m4r;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v0, v0, La/m4r;->c:Landroid/widget/TextView;

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    move v3, v2

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v3, v1

    .line 29
    :goto_1
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, La/l6h0;->G0()La/m4r;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object v0, v0, La/m4r;->b:Landroid/view/View;

    .line 37
    .line 38
    if-nez p1, :cond_2

    .line 39
    .line 40
    move v3, v2

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    move v3, v1

    .line 43
    :goto_2
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, La/l6h0;->G0()La/m4r;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    iget-object p0, p0, La/m4r;->d:Landroid/widget/TextView;

    .line 51
    .line 52
    if-nez p1, :cond_3

    .line 53
    .line 54
    move v1, v2

    .line 55
    :cond_3
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final Z()V
    .locals 10

    .line 1
    iget-object v0, p0, La/l6h0;->M1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v3, v0

    .line 8
    check-cast v3, La/w6h0;

    .line 9
    .line 10
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, La/aif0;

    .line 15
    .line 16
    const/4 v7, 0x0

    .line 17
    const/16 v8, 0x17

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    const-class v4, La/w6h0;

    .line 21
    .line 22
    const-string v5, "handleGameError"

    .line 23
    .line 24
    const-string v6, "handleGameError(Ljava/lang/Throwable;)V"

    .line 25
    .line 26
    invoke-direct/range {v1 .. v8}, La/aif0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 27
    .line 28
    .line 29
    new-instance v8, La/tmg0;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    invoke-direct {v8, v3, v2, v4}, La/tmg0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 34
    .line 35
    .line 36
    const/16 v9, 0xe

    .line 37
    .line 38
    const/4 v6, 0x0

    .line 39
    const/4 v7, 0x0

    .line 40
    move-object v4, v0

    .line 41
    move-object v5, v1

    .line 42
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 43
    .line 44
    .line 45
    invoke-super {p0}, La/yx5;->Z()V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/l6h0;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
