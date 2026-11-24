.class public final La/oj60;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/oj60;",
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
.field public final K1:La/f9o0;

.field public final L1:La/s0r;

.field public final M1:La/a8z;

.field public final N1:La/kiu0;

.field public final O1:La/cgx0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/oj60;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

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
    const-string v3, "hideScreenBundle"

    .line 16
    .line 17
    const-string v5, "getHideScreenBundle()Z"

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
    sput-object v1, La/oj60;->P1:[La/iiy;

    .line 31
    .line 32
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/f9o0;

    .line 8
    .line 9
    const v1, 0x7f040ae3

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, La/f9o0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, La/oj60;->K1:La/f9o0;

    .line 16
    .line 17
    sget-object v0, La/nj60;->a:La/nj60;

    .line 18
    .line 19
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, La/oj60;->L1:La/s0r;

    .line 24
    .line 25
    new-instance v0, La/mj60;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-direct {v0, p0, v1}, La/mj60;-><init>(La/oj60;B)V

    .line 29
    .line 30
    .line 31
    sget-object v1, La/wez;->b:La/wez;

    .line 32
    .line 33
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, p0, La/oj60;->M1:La/a8z;

    .line 38
    .line 39
    new-instance v0, La/mj60;

    .line 40
    .line 41
    const/4 v2, 0x1

    .line 42
    invoke-direct {v0, p0, v2}, La/mj60;-><init>(La/oj60;B)V

    .line 43
    .line 44
    .line 45
    new-instance v2, La/ej50;

    .line 46
    .line 47
    const/4 v3, 0x4

    .line 48
    invoke-direct {v2, v0, v3}, La/ej50;-><init>(Ljava/lang/Object;B)V

    .line 49
    .line 50
    .line 51
    new-instance v0, La/ej50;

    .line 52
    .line 53
    const/4 v3, 0x5

    .line 54
    invoke-direct {v0, p0, v3}, La/ej50;-><init>(Ljava/lang/Object;B)V

    .line 55
    .line 56
    .line 57
    new-instance v3, La/ej50;

    .line 58
    .line 59
    const/4 v4, 0x6

    .line 60
    invoke-direct {v3, v0, v4}, La/ej50;-><init>(Ljava/lang/Object;B)V

    .line 61
    .line 62
    .line 63
    invoke-static {v1, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const-class v1, La/hl60;

    .line 68
    .line 69
    sget-object v3, La/sre0;->a:La/tre0;

    .line 70
    .line 71
    invoke-virtual {v3, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    new-instance v3, La/y620;

    .line 76
    .line 77
    const/16 v4, 0x18

    .line 78
    .line 79
    invoke-direct {v3, v0, v4}, La/y620;-><init>(La/a8z;B)V

    .line 80
    .line 81
    .line 82
    new-instance v4, La/y620;

    .line 83
    .line 84
    const/16 v5, 0x19

    .line 85
    .line 86
    invoke-direct {v4, v0, v5}, La/y620;-><init>(La/a8z;B)V

    .line 87
    .line 88
    .line 89
    invoke-static {p0, v1, v3, v4, v2}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iput-object v0, p0, La/oj60;->N1:La/kiu0;

    .line 94
    .line 95
    new-instance v0, La/cgx0;

    .line 96
    .line 97
    const-string v1, "HIDE_SCREEN_EXTRA"

    .line 98
    .line 99
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    iput-object v0, p0, La/oj60;->O1:La/cgx0;

    .line 103
    .line 104
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    new-instance p1, La/mj60;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    invoke-direct {p1, p0, v0}, La/mj60;-><init>(La/oj60;B)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 8
    .line 9
    .line 10
    sget-object p1, La/oj60;->P1:[La/iiy;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    aget-object p1, p1, v0

    .line 14
    .line 15
    iget-object v0, p0, La/oj60;->L1:La/s0r;

    .line 16
    .line 17
    invoke-virtual {v0, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    check-cast p1, La/aid;

    .line 25
    .line 26
    iget-object p1, p1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 27
    .line 28
    new-instance v0, La/pi40;

    .line 29
    .line 30
    const/16 v1, 0x1a

    .line 31
    .line 32
    invoke-direct {v0, p0, v1}, La/pi40;-><init>(Ljava/lang/Object;B)V

    .line 33
    .line 34
    .line 35
    new-instance v1, La/ugd;

    .line 36
    .line 37
    const v2, -0x38512499

    .line 38
    .line 39
    .line 40
    const/4 v3, 0x1

    .line 41
    invoke-direct {v1, v2, v3, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    new-instance v0, La/shd;

    .line 45
    .line 46
    const/16 v2, 0xf

    .line 47
    .line 48
    invoke-direct {v0, v2}, La/shd;-><init>(B)V

    .line 49
    .line 50
    .line 51
    invoke-static {p1, v0, v1}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 52
    .line 53
    .line 54
    new-instance p1, La/mj60;

    .line 55
    .line 56
    const/4 v0, 0x3

    .line 57
    invoke-direct {p1, p0, v0}, La/mj60;-><init>(La/oj60;B)V

    .line 58
    .line 59
    .line 60
    const-string v0, "REQUEST_SHOW_PHONE_BINDING_DIALOG_KEY"

    .line 61
    .line 62
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 63
    .line 64
    .line 65
    new-instance p1, La/mj60;

    .line 66
    .line 67
    const/4 v1, 0x4

    .line 68
    invoke-direct {p1, p0, v1}, La/mj60;-><init>(La/oj60;B)V

    .line 69
    .line 70
    .line 71
    invoke-static {p0, v0, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, La/oj60;->M1:La/a8z;

    .line 75
    .line 76
    invoke-interface {p1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    check-cast p1, La/imi;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    new-instance p1, La/mj60;

    .line 86
    .line 87
    const/4 v0, 0x5

    .line 88
    invoke-direct {p1, p0, v0}, La/mj60;-><init>(La/oj60;B)V

    .line 89
    .line 90
    .line 91
    new-instance v0, La/cd60;

    .line 92
    .line 93
    invoke-direct {v0, p0, v1}, La/cd60;-><init>(Ljava/lang/Object;B)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    new-instance v2, La/hi;

    .line 101
    .line 102
    const-string v3, "REQUEST_CAPTCHA_CODE_DIALOG_KEY"

    .line 103
    .line 104
    invoke-direct {v2, v3, p1, v0}, La/hi;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, v3, p0, v2}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method public final D0()V
    .locals 5

    .line 1
    invoke-virtual {p0}, La/oj60;->G0()La/hl60;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/hl60;->v:La/ol60;

    .line 6
    .line 7
    new-instance v1, La/nf60;

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-direct {v1, p0, v3, v2}, La/nf60;-><init>(Ljava/lang/Object;La/yje;B)V

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
    move-result-object p0

    .line 20
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    new-instance v4, La/yd60;

    .line 29
    .line 30
    invoke-direct {v4, v0, p0, v1, v3}, La/yd60;-><init>(La/gmq;La/clz;La/nf60;La/yje;)V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x3

    .line 34
    invoke-static {v2, v3, v3, v4, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final G0()La/hl60;
    .locals 0

    .line 1
    iget-object p0, p0, La/oj60;->N1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/hl60;

    .line 8
    .line 9
    return-object p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/oj60;->K1:La/f9o0;

    .line 2
    .line 3
    return-object p0
.end method
