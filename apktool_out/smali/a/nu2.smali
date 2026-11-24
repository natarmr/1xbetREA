.class public abstract La/nu2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/uts0;

.field public static final b:La/xd2;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x7

    .line 3
    const/4 v2, 0x0

    .line 4
    invoke-static {v2, v2, v0, v1}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, La/nu2;->a:La/uts0;

    .line 9
    .line 10
    new-instance v0, La/xd2;

    .line 11
    .line 12
    const/16 v1, 0x15

    .line 13
    .line 14
    invoke-direct {v0, v1}, La/xd2;-><init>(B)V

    .line 15
    .line 16
    .line 17
    sput-object v0, La/nu2;->b:La/xd2;

    .line 18
    .line 19
    const/4 v0, 0x3

    .line 20
    invoke-static {v0}, La/uzb;->Y(I)La/sjj;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static a(La/rv2;Lkotlin/jvm/functions/Function1;La/uts0;La/fet;I)La/afk0;
    .locals 6

    .line 1
    sget-object v0, La/bmd;->h:La/zfn;

    .line 2
    .line 3
    invoke-virtual {p3, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/w6k;

    .line 8
    .line 9
    invoke-virtual {p3, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    and-int/lit8 v2, p4, 0xe

    .line 14
    .line 15
    xor-int/lit8 v2, v2, 0x6

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x1

    .line 19
    const/4 v5, 0x4

    .line 20
    if-le v2, v5, :cond_0

    .line 21
    .line 22
    invoke-virtual {p3, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    :cond_0
    and-int/lit8 v2, p4, 0x6

    .line 29
    .line 30
    if-ne v2, v5, :cond_2

    .line 31
    .line 32
    :cond_1
    move v2, v4

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    move v2, v3

    .line 35
    :goto_0
    or-int/2addr v1, v2

    .line 36
    and-int/lit8 v2, p4, 0x70

    .line 37
    .line 38
    xor-int/lit8 v2, v2, 0x30

    .line 39
    .line 40
    const/16 v5, 0x20

    .line 41
    .line 42
    if-le v2, v5, :cond_3

    .line 43
    .line 44
    invoke-virtual {p3, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_4

    .line 49
    .line 50
    :cond_3
    and-int/lit8 p4, p4, 0x30

    .line 51
    .line 52
    if-ne p4, v5, :cond_5

    .line 53
    .line 54
    :cond_4
    move v3, v4

    .line 55
    :cond_5
    or-int p4, v1, v3

    .line 56
    .line 57
    invoke-virtual {p3, p2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    or-int/2addr p4, v1

    .line 62
    invoke-virtual {p3}, La/fet;->P()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    if-nez p4, :cond_6

    .line 67
    .line 68
    sget-object p4, La/ukd;->a:La/cl5;

    .line 69
    .line 70
    if-ne v1, p4, :cond_7

    .line 71
    .line 72
    :cond_6
    new-instance p4, La/nc;

    .line 73
    .line 74
    const/16 v1, 0x1d

    .line 75
    .line 76
    invoke-direct {p4, v0, v1}, La/nc;-><init>(Ljava/lang/Object;B)V

    .line 77
    .line 78
    .line 79
    new-instance v0, La/pu2;

    .line 80
    .line 81
    invoke-direct {v0, p0, p1, p4}, La/pu2;-><init>(La/rv2;Lkotlin/jvm/functions/Function1;La/nc;)V

    .line 82
    .line 83
    .line 84
    new-instance v1, La/afk0;

    .line 85
    .line 86
    sget-object p0, La/dv2;->b:La/sjj;

    .line 87
    .line 88
    invoke-direct {v1, v0, p0, p2}, La/afk0;-><init>(La/ffk0;La/sjj;La/j73;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p3, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :cond_7
    check-cast v1, La/afk0;

    .line 95
    .line 96
    return-object v1
.end method
