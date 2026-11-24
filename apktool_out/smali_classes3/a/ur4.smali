.class public final La/ur4;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/ur4;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/qek0",
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
.field public static final P1:La/qek0;

.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public final K1:La/cgx0;

.field public final L1:La/n0o0;

.field public final M1:La/kiu0;

.field public final N1:La/s0r;

.field public final O1:La/phf0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/ur4;

    .line 4
    .line 5
    const-string v2, "updateProfile"

    .line 6
    .line 7
    const-string v3, "getUpdateProfile()Z"

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
    const-string v5, "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "errorMessage"

    .line 25
    .line 26
    const-string v6, "getErrorMessage()Ljava/lang/String;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    new-array v1, v1, [La/iiy;

    .line 33
    .line 34
    aput-object v0, v1, v4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    aput-object v2, v1, v0

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    aput-object v3, v1, v0

    .line 41
    .line 42
    sput-object v1, La/ur4;->Q1:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/qek0;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/ur4;->P1:La/qek0;

    .line 50
    .line 51
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
    new-instance v0, La/cgx0;

    .line 8
    .line 9
    const-string v1, "PROFILE_EXTRA"

    .line 10
    .line 11
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, La/ur4;->K1:La/cgx0;

    .line 15
    .line 16
    new-instance v0, La/sr4;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {v0, p0, v1}, La/sr4;-><init>(La/ur4;B)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, La/ur4;->L1:La/n0o0;

    .line 27
    .line 28
    new-instance v0, La/sr4;

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    invoke-direct {v0, p0, v1}, La/sr4;-><init>(La/ur4;B)V

    .line 32
    .line 33
    .line 34
    new-instance v1, La/pp4;

    .line 35
    .line 36
    const/16 v2, 0x8

    .line 37
    .line 38
    invoke-direct {v1, v0, v2}, La/pp4;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    new-instance v0, La/pp4;

    .line 42
    .line 43
    const/16 v2, 0x9

    .line 44
    .line 45
    invoke-direct {v0, p0, v2}, La/pp4;-><init>(Ljava/lang/Object;B)V

    .line 46
    .line 47
    .line 48
    sget-object v2, La/wez;->b:La/wez;

    .line 49
    .line 50
    new-instance v3, La/pp4;

    .line 51
    .line 52
    const/16 v4, 0xa

    .line 53
    .line 54
    invoke-direct {v3, v0, v4}, La/pp4;-><init>(Ljava/lang/Object;B)V

    .line 55
    .line 56
    .line 57
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const-class v2, La/zr4;

    .line 62
    .line 63
    sget-object v3, La/sre0;->a:La/tre0;

    .line 64
    .line 65
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    new-instance v3, La/t51;

    .line 70
    .line 71
    const/16 v4, 0x1c

    .line 72
    .line 73
    invoke-direct {v3, v0, v4}, La/t51;-><init>(La/a8z;B)V

    .line 74
    .line 75
    .line 76
    new-instance v4, La/t51;

    .line 77
    .line 78
    const/16 v5, 0x1d

    .line 79
    .line 80
    invoke-direct {v4, v0, v5}, La/t51;-><init>(La/a8z;B)V

    .line 81
    .line 82
    .line 83
    invoke-static {p0, v2, v3, v4, v1}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    iput-object v0, p0, La/ur4;->M1:La/kiu0;

    .line 88
    .line 89
    sget-object v0, La/tr4;->a:La/tr4;

    .line 90
    .line 91
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iput-object v0, p0, La/ur4;->N1:La/s0r;

    .line 96
    .line 97
    new-instance v0, La/phf0;

    .line 98
    .line 99
    const-string v1, "ERROR_MESSAGE_EXTRA"

    .line 100
    .line 101
    const-string v2, ""

    .line 102
    .line 103
    invoke-direct {v0, v1, v2}, La/phf0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    iput-object v0, p0, La/ur4;->O1:La/phf0;

    .line 107
    .line 108
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    sget-object p1, La/ur4;->Q1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    aget-object p1, p1, v0

    .line 5
    .line 6
    iget-object v1, p0, La/ur4;->N1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v1, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p1, La/aid;

    .line 16
    .line 17
    iget-object p1, p1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    new-instance v1, La/fa2;

    .line 20
    .line 21
    const/16 v2, 0xe

    .line 22
    .line 23
    invoke-direct {v1, p0, v2}, La/fa2;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    new-instance p0, La/ugd;

    .line 27
    .line 28
    const v2, -0xbe6afda

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, v2, v0, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p1, p0}, La/b1j;->t(Landroidx/compose/ui/platform/ComposeView;La/ugd;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method
