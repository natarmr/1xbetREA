.class public final La/jjn0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/jjn0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/g9m0",
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
.field public static final S1:La/g9m0;

.field public static final synthetic U1:[La/iiy;


# instance fields
.field public K1:La/wdk0;

.field public final L1:La/khf0;

.field public final M1:La/hnm0;

.field public final N1:Ljava/lang/String;

.field public final O1:La/s0r;

.field public final P1:La/a8z;

.field public final Q1:La/kiu0;

.field public final R1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/jjn0;

    .line 4
    .line 5
    const-string v2, "supportMenuScreenParams"

    .line 6
    .line 7
    const-string v3, "getSupportMenuScreenParams()Lorg/xplatform/support/api/navigation/SupportMenuScreenParams;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/j0d0;

    .line 14
    .line 15
    const-string v3, "binding"

    .line 16
    .line 17
    const-string v5, "getBinding()Lorg/xplatform/support/impl/databinding/FragmentSupportMenuBinding;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/jjn0;->U1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/g9m0;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/jjn0;->S1:La/g9m0;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const v0, 0x7f0d02e5

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/khf0;

    .line 8
    .line 9
    const-string v1, "SUPPORT_MENU_SCREEN_PARAMS_KEY"

    .line 10
    .line 11
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, La/jjn0;->L1:La/khf0;

    .line 15
    .line 16
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 17
    .line 18
    iput-object v0, p0, La/jjn0;->M1:La/hnm0;

    .line 19
    .line 20
    const-class v0, La/jjn0;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, La/jjn0;->N1:Ljava/lang/String;

    .line 27
    .line 28
    sget-object v0, La/hjn0;->a:La/hjn0;

    .line 29
    .line 30
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, La/jjn0;->O1:La/s0r;

    .line 35
    .line 36
    new-instance v0, La/fjn0;

    .line 37
    .line 38
    const/4 v1, 0x1

    .line 39
    invoke-direct {v0, p0, v1}, La/fjn0;-><init>(La/jjn0;B)V

    .line 40
    .line 41
    .line 42
    sget-object v1, La/wez;->b:La/wez;

    .line 43
    .line 44
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, La/jjn0;->P1:La/a8z;

    .line 49
    .line 50
    new-instance v0, La/fjn0;

    .line 51
    .line 52
    const/4 v2, 0x2

    .line 53
    invoke-direct {v0, p0, v2}, La/fjn0;-><init>(La/jjn0;B)V

    .line 54
    .line 55
    .line 56
    new-instance v2, La/fyk0;

    .line 57
    .line 58
    const/16 v3, 0x14

    .line 59
    .line 60
    invoke-direct {v2, v0, v3}, La/fyk0;-><init>(Ljava/lang/Object;B)V

    .line 61
    .line 62
    .line 63
    new-instance v0, La/fyk0;

    .line 64
    .line 65
    const/16 v3, 0x15

    .line 66
    .line 67
    invoke-direct {v0, p0, v3}, La/fyk0;-><init>(Ljava/lang/Object;B)V

    .line 68
    .line 69
    .line 70
    new-instance v3, La/fyk0;

    .line 71
    .line 72
    const/16 v4, 0x16

    .line 73
    .line 74
    invoke-direct {v3, v0, v4}, La/fyk0;-><init>(Ljava/lang/Object;B)V

    .line 75
    .line 76
    .line 77
    invoke-static {v1, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const-class v3, La/mkn0;

    .line 82
    .line 83
    sget-object v4, La/sre0;->a:La/tre0;

    .line 84
    .line 85
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    new-instance v4, La/cdl0;

    .line 90
    .line 91
    const/16 v5, 0x10

    .line 92
    .line 93
    invoke-direct {v4, v0, v5}, La/cdl0;-><init>(La/a8z;B)V

    .line 94
    .line 95
    .line 96
    new-instance v5, La/cdl0;

    .line 97
    .line 98
    const/16 v6, 0x11

    .line 99
    .line 100
    invoke-direct {v5, v0, v6}, La/cdl0;-><init>(La/a8z;B)V

    .line 101
    .line 102
    .line 103
    invoke-static {p0, v3, v4, v5, v2}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iput-object v0, p0, La/jjn0;->Q1:La/kiu0;

    .line 108
    .line 109
    new-instance v0, La/fjn0;

    .line 110
    .line 111
    const/4 v2, 0x3

    .line 112
    invoke-direct {v0, p0, v2}, La/fjn0;-><init>(La/jjn0;B)V

    .line 113
    .line 114
    .line 115
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    iput-object v0, p0, La/jjn0;->R1:La/a8z;

    .line 120
    .line 121
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/jjn0;->G0()La/m5r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/m5r;->c:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 6
    .line 7
    new-instance v0, La/fjn0;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, La/fjn0;-><init>(La/jjn0;B)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0}, La/mc50;->a(La/mc50;Lkotlin/jvm/functions/Function0;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/jjn0;->G0()La/m5r;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object p1, p1, La/m5r;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 21
    .line 22
    iget-object p0, p0, La/jjn0;->R1:La/a8z;

    .line 23
    .line 24
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, La/ejn0;

    .line 29
    .line 30
    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final C0()V
    .locals 1

    .line 1
    iget-object v0, p0, La/jjn0;->P1:La/a8z;

    .line 2
    .line 3
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/mvi;

    .line 8
    .line 9
    iget-object v0, v0, La/mvi;->a:La/wdk0;

    .line 10
    .line 11
    iput-object v0, p0, La/jjn0;->K1:La/wdk0;

    .line 12
    .line 13
    return-void
.end method

.method public final D0()V
    .locals 10

    .line 1
    invoke-virtual {p0}, La/jjn0;->H0()La/mkn0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, La/mkn0;->w:La/p7m0;

    .line 6
    .line 7
    new-instance v2, La/qaf0;

    .line 8
    .line 9
    const/16 v3, 0xf

    .line 10
    .line 11
    invoke-direct {v2, v1, v3}, La/qaf0;-><init>(La/gmq;B)V

    .line 12
    .line 13
    .line 14
    new-instance v1, La/tmg0;

    .line 15
    .line 16
    const/16 v3, 0x19

    .line 17
    .line 18
    const/4 v8, 0x0

    .line 19
    invoke-direct {v1, v0, v8, v3}, La/tmg0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/fnq;

    .line 23
    .line 24
    invoke-direct {v3, v2, v1}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V

    .line 25
    .line 26
    .line 27
    new-instance v1, La/sye0;

    .line 28
    .line 29
    const/16 v2, 0xb

    .line 30
    .line 31
    invoke-direct {v1, v0, v8, v2}, La/sye0;-><init>(La/diu0;La/yje;B)V

    .line 32
    .line 33
    .line 34
    new-instance v0, La/dnq;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    invoke-direct {v0, v3, v1, v2}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 38
    .line 39
    .line 40
    new-instance v1, La/ijn0;

    .line 41
    .line 42
    invoke-direct {v1, p0, v8, v2}, La/ijn0;-><init>(La/jjn0;La/yje;B)V

    .line 43
    .line 44
    .line 45
    sget-object v2, La/lkz;->a:La/lkz;

    .line 46
    .line 47
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    new-instance v4, La/agn0;

    .line 60
    .line 61
    invoke-direct {v4, v0, v2, v1, v8}, La/agn0;-><init>(La/dnq;La/clz;La/ijn0;La/yje;)V

    .line 62
    .line 63
    .line 64
    const/4 v0, 0x3

    .line 65
    invoke-static {v3, v8, v8, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, La/jjn0;->H0()La/mkn0;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    iget-object v1, v1, La/mkn0;->x:La/qoj0;

    .line 73
    .line 74
    new-instance v2, La/ijn0;

    .line 75
    .line 76
    const/4 v3, 0x1

    .line 77
    invoke-direct {v2, p0, v8, v3}, La/ijn0;-><init>(La/jjn0;La/yje;B)V

    .line 78
    .line 79
    .line 80
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    new-instance v5, La/agn0;

    .line 93
    .line 94
    invoke-direct {v5, v1, v3, v2, v8}, La/agn0;-><init>(La/gmq;La/clz;La/ijn0;La/yje;)V

    .line 95
    .line 96
    .line 97
    invoke-static {v4, v8, v8, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, La/jjn0;->H0()La/mkn0;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    iget-object v5, v1, La/mkn0;->z:La/ol60;

    .line 105
    .line 106
    new-instance v7, La/ijn0;

    .line 107
    .line 108
    const/4 v1, 0x2

    .line 109
    invoke-direct {v7, p0, v8, v1}, La/ijn0;-><init>(La/jjn0;La/yje;B)V

    .line 110
    .line 111
    .line 112
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    invoke-interface {v6}, La/clz;->x()La/glz;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    new-instance v4, La/agn0;

    .line 125
    .line 126
    const/4 v9, 0x0

    .line 127
    invoke-direct/range {v4 .. v9}, La/agn0;-><init>(La/gmq;La/clz;La/ijn0;La/yje;B)V

    .line 128
    .line 129
    .line 130
    invoke-static {p0, v8, v8, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 131
    .line 132
    .line 133
    return-void
.end method

.method public final G0()La/m5r;
    .locals 2

    .line 1
    sget-object v0, La/jjn0;->U1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/jjn0;->O1:La/s0r;

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
    check-cast p0, La/m5r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/mkn0;
    .locals 0

    .line 1
    iget-object p0, p0, La/jjn0;->Q1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/mkn0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, La/gjn0;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p1, p0, v0}, La/gjn0;-><init>(La/jjn0;B)V

    .line 8
    .line 9
    .line 10
    const-string v0, "REQUEST_CODE_OPEN_SUPPORT_APP"

    .line 11
    .line 12
    invoke-static {p0, v0, p1}, La/sj3;->s0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 13
    .line 14
    .line 15
    new-instance p1, La/gjn0;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, v0}, La/gjn0;-><init>(La/jjn0;B)V

    .line 19
    .line 20
    .line 21
    const-string v0, "REQUEST_CODE_DOWNLOAD_SUPPORT_APP"

    .line 22
    .line 23
    invoke-static {p0, v0, p1}, La/sj3;->s0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final Y()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    return-void
.end method

.method public final x0()Z
    .locals 2

    .line 1
    sget-object v0, La/jjn0;->U1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/jjn0;->L1:La/khf0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lorg/xplatform/support/api/navigation/SupportMenuScreenParams;

    .line 13
    .line 14
    iget-boolean p0, p0, Lorg/xplatform/support/api/navigation/SupportMenuScreenParams;->a:Z

    .line 15
    .line 16
    return p0
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/jjn0;->M1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
