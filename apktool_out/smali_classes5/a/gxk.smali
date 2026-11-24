.class public final La/gxk;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/gxk;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/xak",
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
.field public static final n2:La/xak;

.field public static final synthetic o2:[La/iiy;

.field public static final p2:Ljava/lang/String;


# instance fields
.field public final k2:La/n0o0;

.field public final l2:La/kiu0;

.field public final m2:La/yzn0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/gxk;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/personal/api/presentation/model/document_params/DocumentChoiceScreenParams;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    new-array v2, v2, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v2, v4

    .line 17
    .line 18
    sput-object v2, La/gxk;->o2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/xak;

    .line 21
    .line 22
    const/4 v2, 0x3

    .line 23
    invoke-direct {v0, v2}, La/xak;-><init>(B)V

    .line 24
    .line 25
    .line 26
    sput-object v0, La/gxk;->n2:La/xak;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sput-object v0, La/gxk;->p2:Ljava/lang/String;

    .line 33
    .line 34
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/fxk;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, La/fxk;-><init>(La/gxk;B)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, La/gxk;->k2:La/n0o0;

    .line 15
    .line 16
    new-instance v0, La/fxk;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-direct {v0, p0, v1}, La/fxk;-><init>(La/gxk;B)V

    .line 20
    .line 21
    .line 22
    new-instance v1, La/v9k;

    .line 23
    .line 24
    const/16 v2, 0x15

    .line 25
    .line 26
    invoke-direct {v1, v0, v2}, La/v9k;-><init>(Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    new-instance v0, La/v9k;

    .line 30
    .line 31
    const/16 v2, 0x16

    .line 32
    .line 33
    invoke-direct {v0, p0, v2}, La/v9k;-><init>(Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    sget-object v2, La/wez;->b:La/wez;

    .line 37
    .line 38
    new-instance v3, La/v9k;

    .line 39
    .line 40
    const/16 v4, 0x17

    .line 41
    .line 42
    invoke-direct {v3, v0, v4}, La/v9k;-><init>(Ljava/lang/Object;B)V

    .line 43
    .line 44
    .line 45
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const-class v2, La/txk;

    .line 50
    .line 51
    sget-object v3, La/sre0;->a:La/tre0;

    .line 52
    .line 53
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    new-instance v3, La/b9k;

    .line 58
    .line 59
    const/16 v4, 0xc

    .line 60
    .line 61
    invoke-direct {v3, v0, v4}, La/b9k;-><init>(La/a8z;B)V

    .line 62
    .line 63
    .line 64
    new-instance v4, La/b9k;

    .line 65
    .line 66
    const/16 v5, 0xd

    .line 67
    .line 68
    invoke-direct {v4, v0, v5}, La/b9k;-><init>(La/a8z;B)V

    .line 69
    .line 70
    .line 71
    invoke-static {p0, v2, v3, v4, v1}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, La/gxk;->l2:La/kiu0;

    .line 76
    .line 77
    new-instance v0, La/yzn0;

    .line 78
    .line 79
    const-string v1, "DOCUMENT_CHOICE_SCREEN_PARAMS"

    .line 80
    .line 81
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    iput-object v0, p0, La/gxk;->m2:La/yzn0;

    .line 85
    .line 86
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 14

    .line 1
    const v0, -0x2a5b71b7

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/gxk;->l2:La/kiu0;

    .line 8
    .line 9
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, La/txk;

    .line 14
    .line 15
    iget-object v1, v0, La/txk;->e:La/p7m0;

    .line 16
    .line 17
    new-instance v2, La/pxk;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    invoke-direct {v2, v0, v4, v6}, La/pxk;-><init>(La/txk;La/yje;B)V

    .line 22
    .line 23
    .line 24
    new-instance v0, La/s6n0;

    .line 25
    .line 26
    invoke-direct {v0, v1, v2}, La/s6n0;-><init>(La/noj0;Lkotlin/jvm/functions/Function2;)V

    .line 27
    .line 28
    .line 29
    new-instance v1, La/oxk;

    .line 30
    .line 31
    sget-object v2, La/lak0;->c:La/lak0;

    .line 32
    .line 33
    const-string v4, ""

    .line 34
    .line 35
    const/4 v7, 0x1

    .line 36
    invoke-direct {v1, v2, v4, v7}, La/oxk;-><init>(La/a4x;Ljava/lang/String;Z)V

    .line 37
    .line 38
    .line 39
    const/16 v4, 0x30

    .line 40
    .line 41
    const/4 v5, 0x2

    .line 42
    const/4 v2, 0x0

    .line 43
    move-object v3, p1

    .line 44
    invoke-static/range {v0 .. v5}, La/ydx;->E(La/gmq;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;La/fet;II)La/pz40;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    new-instance v8, La/bw5;

    .line 49
    .line 50
    invoke-static {v7, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 51
    .line 52
    .line 53
    move-result-object v9

    .line 54
    new-instance v1, La/v7i0;

    .line 55
    .line 56
    const/16 v2, 0x18

    .line 57
    .line 58
    invoke-direct {v1, v0, v2}, La/v7i0;-><init>(La/l7m0;B)V

    .line 59
    .line 60
    .line 61
    const v2, -0x3f0eca46

    .line 62
    .line 63
    .line 64
    invoke-static {v2, v1, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 65
    .line 66
    .line 67
    move-result-object v10

    .line 68
    new-instance v1, La/rgh;

    .line 69
    .line 70
    const/4 v2, 0x7

    .line 71
    invoke-direct {v1, v0, p0, v2}, La/rgh;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 72
    .line 73
    .line 74
    const p0, -0x71fe0708

    .line 75
    .line 76
    .line 77
    invoke-static {p0, v1, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 78
    .line 79
    .line 80
    move-result-object v12

    .line 81
    const/16 v13, 0xa

    .line 82
    .line 83
    const/4 v11, 0x0

    .line 84
    invoke-direct/range {v8 .. v13}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v6}, La/fet;->r(Z)V

    .line 88
    .line 89
    .line 90
    return-object v8
.end method

.method public final N0()V
    .locals 7

    .line 1
    iget-object v0, p0, La/gxk;->l2:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/txk;

    .line 8
    .line 9
    iget-object v2, v0, La/txk;->f:La/ol60;

    .line 10
    .line 11
    new-instance v4, La/e9g;

    .line 12
    .line 13
    const/16 v0, 0x1d

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    invoke-direct {v4, p0, v5, v0}, La/e9g;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 17
    .line 18
    .line 19
    sget-object v0, La/lkz;->a:La/lkz;

    .line 20
    .line 21
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    new-instance v1, La/xsj;

    .line 34
    .line 35
    const/4 v6, 0x0

    .line 36
    invoke-direct/range {v1 .. v6}, La/xsj;-><init>(La/gmq;La/clz;La/e9g;La/yje;C)V

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x3

    .line 40
    invoke-static {p0, v5, v5, v1, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 41
    .line 42
    .line 43
    return-void
.end method
