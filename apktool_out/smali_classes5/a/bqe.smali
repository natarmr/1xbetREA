.class public final La/bqe;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/bqe;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/kwd",
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
.field public static final o2:La/kwd;

.field public static final synthetic p2:[La/iiy;

.field public static final q2:Ljava/lang/String;


# instance fields
.field public final k2:La/n0o0;

.field public final l2:La/kiu0;

.field public final m2:La/kiu0;

.field public final n2:La/yzn0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/bqe;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/personal/api/presentation/model/country_params/CountryChoiceScreenParams;"

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
    sput-object v2, La/bqe;->p2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/kwd;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/bqe;->o2:La/kwd;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, La/bqe;->q2:Ljava/lang/String;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/ype;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, La/ype;-><init>(La/bqe;B)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, La/bqe;->k2:La/n0o0;

    .line 15
    .line 16
    new-instance v0, La/ype;

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-direct {v0, p0, v2}, La/ype;-><init>(La/bqe;B)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/svc;

    .line 23
    .line 24
    const/16 v4, 0x1d

    .line 25
    .line 26
    invoke-direct {v3, v0, v4}, La/svc;-><init>(Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    new-instance v0, La/aqe;

    .line 30
    .line 31
    invoke-direct {v0, p0, v1}, La/aqe;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    sget-object v1, La/wez;->b:La/wez;

    .line 35
    .line 36
    new-instance v4, La/aqe;

    .line 37
    .line 38
    invoke-direct {v4, v0, v2}, La/aqe;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    invoke-static {v1, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sget-object v2, La/sre0;->a:La/tre0;

    .line 46
    .line 47
    const-class v4, La/kqe;

    .line 48
    .line 49
    invoke-virtual {v2, v4}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    new-instance v5, La/cce;

    .line 54
    .line 55
    const/4 v6, 0x2

    .line 56
    invoke-direct {v5, v0, v6}, La/cce;-><init>(La/a8z;B)V

    .line 57
    .line 58
    .line 59
    new-instance v7, La/cce;

    .line 60
    .line 61
    const/4 v8, 0x3

    .line 62
    invoke-direct {v7, v0, v8}, La/cce;-><init>(La/a8z;B)V

    .line 63
    .line 64
    .line 65
    invoke-static {p0, v4, v5, v7, v3}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iput-object v0, p0, La/bqe;->l2:La/kiu0;

    .line 70
    .line 71
    new-instance v0, La/ype;

    .line 72
    .line 73
    invoke-direct {v0, p0, v6}, La/ype;-><init>(La/bqe;B)V

    .line 74
    .line 75
    .line 76
    new-instance v3, La/aqe;

    .line 77
    .line 78
    invoke-direct {v3, v0, v6}, La/aqe;-><init>(Ljava/lang/Object;B)V

    .line 79
    .line 80
    .line 81
    invoke-static {v1, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    const-class v1, La/g0c0;

    .line 86
    .line 87
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    new-instance v2, La/cce;

    .line 92
    .line 93
    const/4 v3, 0x4

    .line 94
    invoke-direct {v2, v0, v3}, La/cce;-><init>(La/a8z;B)V

    .line 95
    .line 96
    .line 97
    new-instance v3, La/cce;

    .line 98
    .line 99
    const/4 v4, 0x5

    .line 100
    invoke-direct {v3, v0, v4}, La/cce;-><init>(La/a8z;B)V

    .line 101
    .line 102
    .line 103
    new-instance v4, La/h5;

    .line 104
    .line 105
    const/16 v5, 0x1b

    .line 106
    .line 107
    invoke-direct {v4, p0, v0, v5}, La/h5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 108
    .line 109
    .line 110
    invoke-static {p0, v1, v2, v3, v4}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    iput-object v0, p0, La/bqe;->m2:La/kiu0;

    .line 115
    .line 116
    new-instance v0, La/yzn0;

    .line 117
    .line 118
    const-string v1, "COUNTRY_CHOICE_SCREEN_PARAMS"

    .line 119
    .line 120
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    iput-object v0, p0, La/bqe;->n2:La/yzn0;

    .line 124
    .line 125
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 8

    .line 1
    const v0, -0x6be426e5

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, La/bw5;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-static {v0, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    new-instance v3, La/xpe;

    .line 15
    .line 16
    const/4 v7, 0x0

    .line 17
    invoke-direct {v3, p0, v7}, La/xpe;-><init>(La/bqe;B)V

    .line 18
    .line 19
    .line 20
    const v4, 0x3cd13eca

    .line 21
    .line 22
    .line 23
    invoke-static {v4, v3, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    new-instance v4, La/xpe;

    .line 28
    .line 29
    invoke-direct {v4, p0, v0}, La/xpe;-><init>(La/bqe;B)V

    .line 30
    .line 31
    .line 32
    const p0, 0x4dbe854c    # 3.9955085E8f

    .line 33
    .line 34
    .line 35
    invoke-static {p0, v4, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    const/16 v6, 0xa

    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    invoke-direct/range {v1 .. v6}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v7}, La/fet;->r(Z)V

    .line 46
    .line 47
    .line 48
    return-object v1
.end method

.method public final N0()V
    .locals 5

    .line 1
    iget-object v0, p0, La/bqe;->l2:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/kqe;

    .line 8
    .line 9
    iget-object v0, v0, La/kqe;->g:La/ol60;

    .line 10
    .line 11
    new-instance v1, La/fob;

    .line 12
    .line 13
    const/16 v2, 0x11

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v1, p0, v3, v2}, La/fob;-><init>(Ljava/lang/Object;La/yje;B)V

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
    new-instance v4, La/zpe;

    .line 34
    .line 35
    invoke-direct {v4, v0, p0, v1, v3}, La/zpe;-><init>(La/gmq;La/clz;La/fob;La/yje;)V

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
