.class public final La/a9u0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/a9u0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/uxs0",
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
.field public static final R1:La/uxs0;

.field public static final synthetic S1:[La/iiy;


# instance fields
.field public final K1:La/s0r;

.field public final L1:La/zz2;

.field public final M1:La/a8z;

.field public N1:La/wdk0;

.field public O1:La/xyi;

.field public final P1:La/kiu0;

.field public final Q1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/a9u0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/verification/options/impl/databinding/FragmentVerificationOptionsBinding;"

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
    const-string v3, "verificationType"

    .line 16
    .line 17
    const-string v5, "getVerificationType()I"

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
    sput-object v1, La/a9u0;->S1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/uxs0;

    .line 33
    .line 34
    const/4 v1, 0x7

    .line 35
    invoke-direct {v0, v1}, La/uxs0;-><init>(B)V

    .line 36
    .line 37
    .line 38
    sput-object v0, La/a9u0;->R1:La/uxs0;

    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const v0, 0x7f0d0302

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/y8u0;->a:La/y8u0;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/a9u0;->K1:La/s0r;

    .line 14
    .line 15
    new-instance v0, La/zz2;

    .line 16
    .line 17
    const-string v1, "VERIFICATION_TYPE_BUNDLE"

    .line 18
    .line 19
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, La/a9u0;->L1:La/zz2;

    .line 23
    .line 24
    new-instance v0, La/x8u0;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-direct {v0, p0, v1}, La/x8u0;-><init>(La/a9u0;B)V

    .line 28
    .line 29
    .line 30
    sget-object v1, La/wez;->b:La/wez;

    .line 31
    .line 32
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, La/a9u0;->M1:La/a8z;

    .line 37
    .line 38
    new-instance v0, La/x8u0;

    .line 39
    .line 40
    const/4 v2, 0x1

    .line 41
    invoke-direct {v0, p0, v2}, La/x8u0;-><init>(La/a9u0;B)V

    .line 42
    .line 43
    .line 44
    new-instance v2, La/cvs0;

    .line 45
    .line 46
    const/16 v3, 0xd

    .line 47
    .line 48
    invoke-direct {v2, p0, v3}, La/cvs0;-><init>(Ljava/lang/Object;B)V

    .line 49
    .line 50
    .line 51
    new-instance v3, La/cvs0;

    .line 52
    .line 53
    const/16 v4, 0xe

    .line 54
    .line 55
    invoke-direct {v3, v2, v4}, La/cvs0;-><init>(Ljava/lang/Object;B)V

    .line 56
    .line 57
    .line 58
    invoke-static {v1, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    const-class v3, La/i9u0;

    .line 63
    .line 64
    sget-object v4, La/sre0;->a:La/tre0;

    .line 65
    .line 66
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    new-instance v4, La/w6u0;

    .line 71
    .line 72
    const/4 v5, 0x4

    .line 73
    invoke-direct {v4, v2, v5}, La/w6u0;-><init>(La/a8z;B)V

    .line 74
    .line 75
    .line 76
    new-instance v5, La/w6u0;

    .line 77
    .line 78
    const/4 v6, 0x5

    .line 79
    invoke-direct {v5, v2, v6}, La/w6u0;-><init>(La/a8z;B)V

    .line 80
    .line 81
    .line 82
    invoke-static {p0, v3, v4, v5, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iput-object v0, p0, La/a9u0;->P1:La/kiu0;

    .line 87
    .line 88
    new-instance v0, La/x8u0;

    .line 89
    .line 90
    const/4 v2, 0x2

    .line 91
    invoke-direct {v0, p0, v2}, La/x8u0;-><init>(La/a9u0;B)V

    .line 92
    .line 93
    .line 94
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    iput-object v0, p0, La/a9u0;->Q1:La/a8z;

    .line 99
    .line 100
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/a9u0;->G0()La/l6r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/l6r;->e:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 6
    .line 7
    const v0, 0x7f131767

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, La/a9u0;->G0()La/l6r;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object p1, p1, La/l6r;->e:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 22
    .line 23
    new-instance v0, La/jpe0;

    .line 24
    .line 25
    const/16 v1, 0x10

    .line 26
    .line 27
    invoke-direct {v0, p0, v1}, La/jpe0;-><init>(Ljava/lang/Object;B)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, La/a9u0;->G0()La/l6r;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object p1, p1, La/l6r;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 38
    .line 39
    iget-object p0, p0, La/a9u0;->Q1:La/a8z;

    .line 40
    .line 41
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    check-cast p0, La/m8u0;

    .line 46
    .line 47
    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final C0()V
    .locals 2

    .line 1
    iget-object v0, p0, La/a9u0;->M1:La/a8z;

    .line 2
    .line 3
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/yyi;

    .line 8
    .line 9
    iget-object v1, v0, La/yyi;->a:La/wdk0;

    .line 10
    .line 11
    iput-object v1, p0, La/a9u0;->N1:La/wdk0;

    .line 12
    .line 13
    iget-object v0, v0, La/yyi;->l:La/n5d0;

    .line 14
    .line 15
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, La/xyi;

    .line 20
    .line 21
    iput-object v0, p0, La/a9u0;->O1:La/xyi;

    .line 22
    .line 23
    return-void
.end method

.method public final D0()V
    .locals 10

    .line 1
    iget-object v0, p0, La/a9u0;->P1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, La/i9u0;

    .line 8
    .line 9
    iget-object v1, v1, La/i9u0;->g:La/p7m0;

    .line 10
    .line 11
    new-instance v2, La/z8u0;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v8, 0x0

    .line 15
    invoke-direct {v2, p0, v8, v3}, La/z8u0;-><init>(La/a9u0;La/yje;B)V

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
    new-instance v5, La/tsr0;

    .line 33
    .line 34
    invoke-direct {v5, v1, v3, v2, v8}, La/tsr0;-><init>(La/gmq;La/clz;La/z8u0;La/yje;)V

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
    move-result-object v0

    .line 45
    check-cast v0, La/i9u0;

    .line 46
    .line 47
    iget-object v5, v0, La/i9u0;->h:La/qoj0;

    .line 48
    .line 49
    new-instance v7, La/z8u0;

    .line 50
    .line 51
    const/4 v0, 0x1

    .line 52
    invoke-direct {v7, p0, v8, v0}, La/z8u0;-><init>(La/a9u0;La/yje;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-interface {v6}, La/clz;->x()La/glz;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    new-instance v4, La/tsr0;

    .line 68
    .line 69
    const/4 v9, 0x0

    .line 70
    invoke-direct/range {v4 .. v9}, La/tsr0;-><init>(La/gmq;La/clz;La/z8u0;La/yje;B)V

    .line 71
    .line 72
    .line 73
    invoke-static {p0, v8, v8, v4, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public final G0()La/l6r;
    .locals 2

    .line 1
    sget-object v0, La/a9u0;->S1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/a9u0;->K1:La/s0r;

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
    check-cast p0, La/l6r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final Z()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/a9u0;->G0()La/l6r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/l6r;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 9
    .line 10
    .line 11
    invoke-super {p0}, La/yx5;->Z()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/yx5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, La/a9u0;->P1:La/kiu0;

    .line 8
    .line 9
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, La/i9u0;

    .line 14
    .line 15
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object p1, p0, La/i9u0;->f:La/mne;

    .line 20
    .line 21
    iget-object v3, p1, La/mne;->a:La/rwj;

    .line 22
    .line 23
    new-instance v1, La/npt0;

    .line 24
    .line 25
    const/4 p1, 0x6

    .line 26
    invoke-direct {v1, p0, p1}, La/npt0;-><init>(Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    new-instance v4, La/k6s0;

    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    const/16 p2, 0x10

    .line 33
    .line 34
    invoke-direct {v4, p0, p1, p2}, La/k6s0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 35
    .line 36
    .line 37
    const/16 v5, 0xa

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 41
    .line 42
    .line 43
    return-void
.end method
