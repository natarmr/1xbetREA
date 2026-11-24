.class public final La/v8x;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/v8x;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/gst",
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
.field public static final U1:La/gst;

.field public static final synthetic V1:[La/iiy;


# instance fields
.field public final K1:La/hnm0;

.field public L1:La/wdk0;

.field public final M1:Z

.field public N1:Ljava/lang/String;

.field public final O1:La/s0r;

.field public final P1:La/a8z;

.field public final Q1:La/kiu0;

.field public final R1:La/a8z;

.field public S1:La/ndk0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/v8x;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/info/impl/databinding/FragmentInfoNewBinding;"

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
    sput-object v1, La/v8x;->V1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/gst;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/v8x;->U1:La/gst;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const v0, 0x7f0d024f

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 8
    .line 9
    iput-object v0, p0, La/v8x;->K1:La/hnm0;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, La/v8x;->M1:Z

    .line 13
    .line 14
    const-string v1, ""

    .line 15
    .line 16
    iput-object v1, p0, La/v8x;->N1:Ljava/lang/String;

    .line 17
    .line 18
    sget-object v1, La/t8x;->a:La/t8x;

    .line 19
    .line 20
    invoke-static {p0, v1}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iput-object v1, p0, La/v8x;->O1:La/s0r;

    .line 25
    .line 26
    new-instance v1, La/s8x;

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-direct {v1, p0, v2}, La/s8x;-><init>(La/v8x;B)V

    .line 30
    .line 31
    .line 32
    sget-object v2, La/wez;->b:La/wez;

    .line 33
    .line 34
    invoke-static {v2, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iput-object v1, p0, La/v8x;->P1:La/a8z;

    .line 39
    .line 40
    new-instance v1, La/s8x;

    .line 41
    .line 42
    invoke-direct {v1, p0, v0}, La/s8x;-><init>(La/v8x;B)V

    .line 43
    .line 44
    .line 45
    new-instance v3, La/aaw;

    .line 46
    .line 47
    invoke-direct {v3, v1, v0}, La/aaw;-><init>(Ljava/lang/Object;B)V

    .line 48
    .line 49
    .line 50
    new-instance v0, La/aaw;

    .line 51
    .line 52
    const/4 v1, 0x2

    .line 53
    invoke-direct {v0, p0, v1}, La/aaw;-><init>(Ljava/lang/Object;B)V

    .line 54
    .line 55
    .line 56
    new-instance v4, La/aaw;

    .line 57
    .line 58
    const/4 v5, 0x3

    .line 59
    invoke-direct {v4, v0, v5}, La/aaw;-><init>(Ljava/lang/Object;B)V

    .line 60
    .line 61
    .line 62
    invoke-static {v2, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const-class v4, La/tax;

    .line 67
    .line 68
    sget-object v5, La/sre0;->a:La/tre0;

    .line 69
    .line 70
    invoke-virtual {v5, v4}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    new-instance v5, La/qwv;

    .line 75
    .line 76
    const/16 v6, 0xe

    .line 77
    .line 78
    invoke-direct {v5, v0, v6}, La/qwv;-><init>(La/a8z;B)V

    .line 79
    .line 80
    .line 81
    new-instance v6, La/qwv;

    .line 82
    .line 83
    const/16 v7, 0xf

    .line 84
    .line 85
    invoke-direct {v6, v0, v7}, La/qwv;-><init>(La/a8z;B)V

    .line 86
    .line 87
    .line 88
    invoke-static {p0, v4, v5, v6, v3}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iput-object v0, p0, La/v8x;->Q1:La/kiu0;

    .line 93
    .line 94
    new-instance v0, La/s8x;

    .line 95
    .line 96
    invoke-direct {v0, p0, v1}, La/s8x;-><init>(La/v8x;B)V

    .line 97
    .line 98
    .line 99
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    iput-object v0, p0, La/v8x;->R1:La/a8z;

    .line 104
    .line 105
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/v8x;->G0()La/t0r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/t0r;->b:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 6
    .line 7
    new-instance v0, La/s8x;

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    invoke-direct {v0, p0, v1}, La/s8x;-><init>(La/v8x;B)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0}, La/mc50;->a(La/mc50;Lkotlin/jvm/functions/Function0;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/v8x;->G0()La/t0r;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object p1, p1, La/t0r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 21
    .line 22
    iget-object v0, p0, La/v8x;->R1:La/a8z;

    .line 23
    .line 24
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, La/h9x;

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, La/v8x;->G0()La/t0r;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    iget-object p0, p0, La/t0r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    invoke-static {p0, p1, p1}, La/vvw;->o(Landroidx/recyclerview/widget/RecyclerView;ZI)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final C0()V
    .locals 1

    .line 1
    iget-object v0, p0, La/v8x;->P1:La/a8z;

    .line 2
    .line 3
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/bji;

    .line 8
    .line 9
    iget-object v0, v0, La/bji;->a:La/wdk0;

    .line 10
    .line 11
    iput-object v0, p0, La/v8x;->L1:La/wdk0;

    .line 12
    .line 13
    return-void
.end method

.method public final D0()V
    .locals 10

    .line 1
    invoke-virtual {p0}, La/v8x;->H0()La/tax;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, La/tax;->v:La/p7m0;

    .line 6
    .line 7
    new-instance v2, La/cin;

    .line 8
    .line 9
    const/16 v3, 0x14

    .line 10
    .line 11
    const/4 v8, 0x0

    .line 12
    invoke-direct {v2, v0, v8, v3}, La/cin;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 13
    .line 14
    .line 15
    new-instance v3, La/s6n0;

    .line 16
    .line 17
    invoke-direct {v3, v1, v2}, La/s6n0;-><init>(La/noj0;Lkotlin/jvm/functions/Function2;)V

    .line 18
    .line 19
    .line 20
    new-instance v1, La/gbv;

    .line 21
    .line 22
    const/4 v2, 0x3

    .line 23
    invoke-direct {v1, v0, v8, v2}, La/gbv;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 24
    .line 25
    .line 26
    new-instance v0, La/dnq;

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    invoke-direct {v0, v3, v1, v4}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 30
    .line 31
    .line 32
    new-instance v1, La/u8x;

    .line 33
    .line 34
    invoke-direct {v1, p0, v8, v4}, La/u8x;-><init>(La/v8x;La/yje;B)V

    .line 35
    .line 36
    .line 37
    sget-object v3, La/lkz;->a:La/lkz;

    .line 38
    .line 39
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    new-instance v5, La/r1w;

    .line 52
    .line 53
    invoke-direct {v5, v0, v3, v1, v8}, La/r1w;-><init>(La/dnq;La/clz;La/u8x;La/yje;)V

    .line 54
    .line 55
    .line 56
    invoke-static {v4, v8, v8, v5, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, La/v8x;->H0()La/tax;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iget-object v0, v0, La/tax;->w:La/qoj0;

    .line 64
    .line 65
    new-instance v1, La/u8x;

    .line 66
    .line 67
    const/4 v3, 0x1

    .line 68
    invoke-direct {v1, p0, v8, v3}, La/u8x;-><init>(La/v8x;La/yje;B)V

    .line 69
    .line 70
    .line 71
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    new-instance v5, La/r1w;

    .line 84
    .line 85
    invoke-direct {v5, v0, v3, v1, v8}, La/r1w;-><init>(La/gmq;La/clz;La/u8x;La/yje;)V

    .line 86
    .line 87
    .line 88
    invoke-static {v4, v8, v8, v5, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, La/v8x;->H0()La/tax;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iget-object v5, v0, La/tax;->x:La/ol60;

    .line 96
    .line 97
    new-instance v7, La/u8x;

    .line 98
    .line 99
    const/4 v0, 0x2

    .line 100
    invoke-direct {v7, p0, v8, v0}, La/u8x;-><init>(La/v8x;La/yje;B)V

    .line 101
    .line 102
    .line 103
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    invoke-interface {v6}, La/clz;->x()La/glz;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    new-instance v4, La/r1w;

    .line 116
    .line 117
    const/4 v9, 0x0

    .line 118
    invoke-direct/range {v4 .. v9}, La/r1w;-><init>(La/gmq;La/clz;La/u8x;La/yje;B)V

    .line 119
    .line 120
    .line 121
    invoke-static {p0, v8, v8, v4, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 122
    .line 123
    .line 124
    return-void
.end method

.method public final G0()La/t0r;
    .locals 2

    .line 1
    sget-object v0, La/v8x;->V1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/v8x;->O1:La/s0r;

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
    check-cast p0, La/t0r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/tax;
    .locals 0

    .line 1
    iget-object p0, p0, La/v8x;->Q1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/tax;

    .line 8
    .line 9
    return-object p0
.end method

.method public final Y()V
    .locals 1

    .line 1
    iget-object v0, p0, La/v8x;->S1:La/ndk0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, La/ndk0;->dismiss()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 10
    .line 11
    return-void
.end method

.method public final e0()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/v8x;->H0()La/tax;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, La/tax;->C:Z

    .line 10
    .line 11
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/v8x;->M1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/v8x;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
