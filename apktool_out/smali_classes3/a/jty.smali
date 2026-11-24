.class public final La/jty;
.super La/qw5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/qw5<",
        "La/kty;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/jty;",
        "La/qw5;",
        "La/kty;",
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
.field public static final f2:La/gst;

.field public static final synthetic g2:[La/iiy;


# instance fields
.field public final b2:La/nae0;

.field public c2:La/r12;

.field public d2:La/fiu0;

.field public final e2:La/kiu0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/jty;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/alerts_pipe_impl/databinding/KzFirstDepositBottomSheetBinding;"

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
    sput-object v1, La/jty;->g2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/gst;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/jty;->f2:La/gst;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, La/qw5;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/ity;->a:La/ity;

    .line 5
    .line 6
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, La/jty;->b2:La/nae0;

    .line 11
    .line 12
    new-instance v0, La/hty;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v0, p0, v1}, La/hty;-><init>(La/jty;B)V

    .line 16
    .line 17
    .line 18
    new-instance v1, La/aaw;

    .line 19
    .line 20
    const/16 v2, 0x18

    .line 21
    .line 22
    invoke-direct {v1, p0, v2}, La/aaw;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    sget-object v2, La/wez;->b:La/wez;

    .line 26
    .line 27
    new-instance v3, La/aaw;

    .line 28
    .line 29
    const/16 v4, 0x19

    .line 30
    .line 31
    invoke-direct {v3, v1, v4}, La/aaw;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-class v2, La/oty;

    .line 39
    .line 40
    sget-object v3, La/sre0;->a:La/tre0;

    .line 41
    .line 42
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    new-instance v3, La/qwv;

    .line 47
    .line 48
    const/16 v4, 0x14

    .line 49
    .line 50
    invoke-direct {v3, v1, v4}, La/qwv;-><init>(La/a8z;B)V

    .line 51
    .line 52
    .line 53
    new-instance v4, La/qwv;

    .line 54
    .line 55
    const/16 v5, 0x15

    .line 56
    .line 57
    invoke-direct {v4, v1, v5}, La/qwv;-><init>(La/a8z;B)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, La/jty;->e2:La/kiu0;

    .line 65
    .line 66
    return-void
.end method


# virtual methods
.method public final I0()I
    .locals 0

    .line 1
    const p0, 0x7f040b5d

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final bridge synthetic J0()La/yfu0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/jty;->Q0()La/kty;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final O0()I
    .locals 0

    .line 1
    const p0, 0x7f0a0c40

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final Q0()La/kty;
    .locals 2

    .line 1
    sget-object v0, La/jty;->g2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/jty;->b2:La/nae0;

    .line 7
    .line 8
    invoke-interface {v1, v0, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/kty;

    .line 16
    .line 17
    return-object p0
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
    const-class v0, La/lty;

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
    instance-of v2, p1, La/lty;

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
    check-cast v1, La/lty;

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    iget-object p1, v1, La/lty;->a:La/uyu;

    .line 59
    .line 60
    iget-object v0, v1, La/lty;->b:La/p12;

    .line 61
    .line 62
    new-instance v1, La/c5k;

    .line 63
    .line 64
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object p1, v1, La/c5k;->a:Ljava/lang/Object;

    .line 68
    .line 69
    new-instance p1, La/tii;

    .line 70
    .line 71
    const/16 v2, 0xf

    .line 72
    .line 73
    invoke-direct {p1, v1, v2}, La/tii;-><init>(Ljava/lang/Object;B)V

    .line 74
    .line 75
    .line 76
    iput-object p1, v1, La/c5k;->b:Ljava/lang/Object;

    .line 77
    .line 78
    iget-object p1, v0, La/p12;->b:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p1, La/p12;

    .line 81
    .line 82
    iget-object p1, p1, La/p12;->b:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast p1, La/r12;

    .line 85
    .line 86
    invoke-static {p1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    iput-object p1, p0, La/jty;->c2:La/r12;

    .line 90
    .line 91
    new-instance p1, La/fiu0;

    .line 92
    .line 93
    iget-object v0, v1, La/c5k;->b:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, La/tii;

    .line 96
    .line 97
    const-class v1, La/oty;

    .line 98
    .line 99
    invoke-static {v1, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-direct {p1, v0}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 104
    .line 105
    .line 106
    iput-object p1, p0, La/jty;->d2:La/fiu0;

    .line 107
    .line 108
    return-void

    .line 109
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 110
    .line 111
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method public final Z()V
    .locals 1

    .line 1
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p0}, La/jty;->Q0()La/kty;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, La/kty;->c:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 8
    .line 9
    invoke-static {v0}, La/u0d;->a(Landroid/widget/ImageView;)V

    .line 10
    .line 11
    .line 12
    invoke-super {p0}, La/qw5;->Z()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/qw5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/jty;->Q0()La/kty;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p1, p1, La/kty;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 12
    .line 13
    new-instance p2, La/hty;

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    invoke-direct {p2, p0, v0}, La/hty;-><init>(La/jty;B)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1, p2}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->u(Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;Lkotlin/jvm/functions/Function0;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, La/jty;->Q0()La/kty;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-object p1, p1, La/kty;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 27
    .line 28
    new-instance p2, La/hty;

    .line 29
    .line 30
    const/4 v0, 0x2

    .line 31
    invoke-direct {p2, p0, v0}, La/hty;-><init>(La/jty;B)V

    .line 32
    .line 33
    .line 34
    invoke-static {p1, p2}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->v(Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;Lkotlin/jvm/functions/Function0;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, La/jty;->e2:La/kiu0;

    .line 38
    .line 39
    invoke-virtual {p1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, La/oty;

    .line 44
    .line 45
    iget-object p1, p1, La/oty;->b:La/uyu;

    .line 46
    .line 47
    iget-object p1, p1, La/uyu;->a:La/v6j0;

    .line 48
    .line 49
    invoke-virtual {p1}, La/v6j0;->h()La/qz40;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    new-instance p2, La/a1t;

    .line 54
    .line 55
    const/16 v0, 0x17

    .line 56
    .line 57
    invoke-direct {p2, p1, v0}, La/a1t;-><init>(La/gmq;B)V

    .line 58
    .line 59
    .line 60
    new-instance p1, La/kaw;

    .line 61
    .line 62
    const/16 v0, 0xf

    .line 63
    .line 64
    const/4 v1, 0x0

    .line 65
    invoke-direct {p1, p0, v1, v0}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 66
    .line 67
    .line 68
    sget-object v0, La/lkz;->a:La/lkz;

    .line 69
    .line 70
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-interface {v0}, La/clz;->x()La/glz;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    new-instance v3, La/c6y;

    .line 83
    .line 84
    invoke-direct {v3, p2, v0, p1, v1}, La/c6y;-><init>(La/a1t;La/clz;La/kaw;La/yje;)V

    .line 85
    .line 86
    .line 87
    const/4 p1, 0x3

    .line 88
    invoke-static {v2, v1, v1, v3, p1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 89
    .line 90
    .line 91
    iget-object p1, p0, La/jty;->c2:La/r12;

    .line 92
    .line 93
    if-eqz p1, :cond_0

    .line 94
    .line 95
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p1, La/s12;

    .line 100
    .line 101
    iput-object p0, p1, La/s12;->g:Landroidx/fragment/app/e;

    .line 102
    .line 103
    sget-object p0, Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType$KzFirstDepositBottom;->a:Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType$KzFirstDepositBottom;

    .line 104
    .line 105
    iput-object p0, p1, La/s12;->f:Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType;

    .line 106
    .line 107
    return-void

    .line 108
    :cond_0
    const-string p0, "alertsPipeReceiver"

    .line 109
    .line 110
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw v1
.end method

.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/jty;->c2:La/r12;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast v0, La/s12;

    .line 9
    .line 10
    invoke-virtual {v0}, La/s12;->b()V

    .line 11
    .line 12
    .line 13
    invoke-super {p0, p1}, La/sik;->onDismiss(Landroid/content/DialogInterface;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const-string p0, "alertsPipeReceiver"

    .line 18
    .line 19
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    throw p0
.end method
