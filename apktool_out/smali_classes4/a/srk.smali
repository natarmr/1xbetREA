.class public final synthetic La/srk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zdr;


# instance fields
.field public final synthetic a:La/qsk;

.field public final synthetic b:La/pz40;

.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:F

.field public final synthetic f:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/qsk;La/pz40;FFFLkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/srk;->a:La/qsk;

    iput-object p2, p0, La/srk;->b:La/pz40;

    iput p3, p0, La/srk;->c:F

    iput p4, p0, La/srk;->d:F

    iput p5, p0, La/srk;->e:F

    iput-object p6, p0, La/srk;->f:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object v1, p1

    .line 2
    check-cast v1, La/l7m0;

    .line 3
    .line 4
    check-cast p2, La/l7m0;

    .line 5
    .line 6
    check-cast p3, La/ycl;

    .line 7
    .line 8
    move-object v8, p4

    .line 9
    check-cast v8, La/fet;

    .line 10
    .line 11
    check-cast p5, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    and-int/lit8 p2, p1, 0x6

    .line 24
    .line 25
    if-nez p2, :cond_1

    .line 26
    .line 27
    invoke-virtual {v8, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_0

    .line 32
    .line 33
    const/4 p2, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 p2, 0x2

    .line 36
    :goto_0
    or-int/2addr p2, p1

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move p2, p1

    .line 39
    :goto_1
    and-int/lit16 p1, p1, 0x180

    .line 40
    .line 41
    if-nez p1, :cond_3

    .line 42
    .line 43
    iget p1, p3, La/ycl;->a:F

    .line 44
    .line 45
    invoke-virtual {v8, p1}, La/fet;->d(F)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    const/16 p1, 0x100

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    const/16 p1, 0x80

    .line 55
    .line 56
    :goto_2
    or-int/2addr p2, p1

    .line 57
    :cond_3
    and-int/lit16 p1, p2, 0x483

    .line 58
    .line 59
    const/16 p4, 0x482

    .line 60
    .line 61
    if-eq p1, p4, :cond_4

    .line 62
    .line 63
    const/4 p1, 0x1

    .line 64
    goto :goto_3

    .line 65
    :cond_4
    const/4 p1, 0x0

    .line 66
    :goto_3
    and-int/lit8 p4, p2, 0x1

    .line 67
    .line 68
    invoke-virtual {v8, p4, p1}, La/fet;->U(IZ)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_5

    .line 73
    .line 74
    iget v6, p3, La/ycl;->a:F

    .line 75
    .line 76
    shl-int/lit8 p1, p2, 0x3

    .line 77
    .line 78
    and-int/lit8 p1, p1, 0x70

    .line 79
    .line 80
    or-int/lit16 p1, p1, 0x180

    .line 81
    .line 82
    shl-int/lit8 p2, p2, 0xc

    .line 83
    .line 84
    const/high16 p3, 0x380000

    .line 85
    .line 86
    and-int/2addr p2, p3

    .line 87
    or-int v9, p1, p2

    .line 88
    .line 89
    iget-object v0, p0, La/srk;->a:La/qsk;

    .line 90
    .line 91
    iget-object v2, p0, La/srk;->b:La/pz40;

    .line 92
    .line 93
    iget v3, p0, La/srk;->c:F

    .line 94
    .line 95
    iget v4, p0, La/srk;->d:F

    .line 96
    .line 97
    iget v5, p0, La/srk;->e:F

    .line 98
    .line 99
    iget-object v7, p0, La/srk;->f:Lkotlin/jvm/functions/Function1;

    .line 100
    .line 101
    invoke-static/range {v0 .. v9}, La/qcc;->e(La/qsk;La/l7m0;La/l7m0;FFFFLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 102
    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_5
    invoke-virtual {v8}, La/fet;->X()V

    .line 106
    .line 107
    .line 108
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 109
    .line 110
    return-object p0
.end method
