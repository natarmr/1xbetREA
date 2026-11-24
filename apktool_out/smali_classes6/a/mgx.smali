.class public final synthetic La/mgx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zdr;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:La/xdr;


# direct methods
.method public synthetic constructor <init>(JLa/xdr;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La/mgx;->a:J

    iput-object p3, p0, La/mgx;->b:La/xdr;

    return-void
.end method


# virtual methods
.method public final O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, La/ygx;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    check-cast p3, La/mm40;

    .line 9
    .line 10
    check-cast p4, La/fet;

    .line 11
    .line 12
    check-cast p5, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    and-int/lit8 p5, p2, 0x6

    .line 25
    .line 26
    const/4 v0, 0x2

    .line 27
    if-nez p5, :cond_2

    .line 28
    .line 29
    and-int/lit8 p5, p2, 0x8

    .line 30
    .line 31
    if-nez p5, :cond_0

    .line 32
    .line 33
    invoke-virtual {p4, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p5

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {p4, p1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p5

    .line 42
    :goto_0
    if-eqz p5, :cond_1

    .line 43
    .line 44
    const/4 p5, 0x4

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move p5, v0

    .line 47
    :goto_1
    or-int/2addr p5, p2

    .line 48
    goto :goto_2

    .line 49
    :cond_2
    move p5, p2

    .line 50
    :goto_2
    and-int/lit16 p2, p2, 0x180

    .line 51
    .line 52
    if-nez p2, :cond_4

    .line 53
    .line 54
    invoke-virtual {p4, p3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    if-eqz p2, :cond_3

    .line 59
    .line 60
    const/16 p2, 0x100

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_3
    const/16 p2, 0x80

    .line 64
    .line 65
    :goto_3
    or-int/2addr p5, p2

    .line 66
    :cond_4
    and-int/lit16 p2, p5, 0x483

    .line 67
    .line 68
    const/16 v1, 0x482

    .line 69
    .line 70
    if-eq p2, v1, :cond_5

    .line 71
    .line 72
    const/4 p2, 0x1

    .line 73
    goto :goto_4

    .line 74
    :cond_5
    const/4 p2, 0x0

    .line 75
    :goto_4
    and-int/lit8 v1, p5, 0x1

    .line 76
    .line 77
    invoke-virtual {p4, v1, p2}, La/fet;->U(IZ)Z

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    if-eqz p2, :cond_6

    .line 82
    .line 83
    sget-object p2, La/jd8;->n:La/ljc;

    .line 84
    .line 85
    iget-wide v1, p0, La/mgx;->a:J

    .line 86
    .line 87
    invoke-static {p3, v1, v2, p2}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    sget-object p3, La/qmk;->a:La/zcl;

    .line 92
    .line 93
    const/high16 p3, 0x41000000    # 8.0f

    .line 94
    .line 95
    const/4 v1, 0x0

    .line 96
    invoke-static {p2, p3, v1, v0}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    shl-int/lit8 p3, p5, 0x3

    .line 101
    .line 102
    and-int/lit8 p3, p3, 0x70

    .line 103
    .line 104
    iget-object p0, p0, La/mgx;->b:La/xdr;

    .line 105
    .line 106
    invoke-static {p2, p1, p0, p4, p3}, La/azw;->d(La/mm40;La/ygx;La/xdr;La/fet;I)V

    .line 107
    .line 108
    .line 109
    goto :goto_5

    .line 110
    :cond_6
    invoke-virtual {p4}, La/fet;->X()V

    .line 111
    .line 112
    .line 113
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    return-object p0
.end method
