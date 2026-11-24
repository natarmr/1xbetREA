.class public final synthetic La/bxp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zdr;


# instance fields
.field public final synthetic a:La/l7m0;

.field public final synthetic b:La/qdz;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:La/l7m0;


# direct methods
.method public synthetic constructor <init>(La/l7m0;La/qdz;Lkotlin/jvm/functions/Function1;La/l7m0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/bxp;->a:La/l7m0;

    iput-object p2, p0, La/bxp;->b:La/qdz;

    iput-object p3, p0, La/bxp;->c:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, La/bxp;->d:La/l7m0;

    return-void
.end method


# virtual methods
.method public final O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, La/hh80;

    .line 2
    .line 3
    check-cast p2, La/l7m0;

    .line 4
    .line 5
    check-cast p3, La/l7m0;

    .line 6
    .line 7
    move-object v4, p4

    .line 8
    check-cast v4, La/fet;

    .line 9
    .line 10
    check-cast p5, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result p4

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    and-int/lit16 p1, p4, 0x401

    .line 26
    .line 27
    const/16 p2, 0x400

    .line 28
    .line 29
    const/4 p3, 0x1

    .line 30
    const/4 p5, 0x0

    .line 31
    if-eq p1, p2, :cond_0

    .line 32
    .line 33
    move p1, p3

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move p1, p5

    .line 36
    :goto_0
    and-int/lit8 p2, p4, 0x1

    .line 37
    .line 38
    invoke-virtual {v4, p2, p1}, La/fet;->U(IZ)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_4

    .line 43
    .line 44
    iget-object p1, p0, La/bxp;->d:La/l7m0;

    .line 45
    .line 46
    invoke-interface {p1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, La/fxp;

    .line 51
    .line 52
    instance-of p1, p1, La/cxp;

    .line 53
    .line 54
    if-eqz p1, :cond_3

    .line 55
    .line 56
    const p1, 0x3f6052c7

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4, p1}, La/fet;->e0(I)V

    .line 60
    .line 61
    .line 62
    new-array p1, p5, [Ljava/lang/Object;

    .line 63
    .line 64
    iget-object p2, p0, La/bxp;->a:La/l7m0;

    .line 65
    .line 66
    invoke-virtual {v4, p2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p4

    .line 70
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    if-nez p4, :cond_1

    .line 75
    .line 76
    sget-object p4, La/ukd;->a:La/cl5;

    .line 77
    .line 78
    if-ne v0, p4, :cond_2

    .line 79
    .line 80
    :cond_1
    new-instance v0, La/zwp;

    .line 81
    .line 82
    invoke-direct {v0, p2, p3}, La/zwp;-><init>(La/l7m0;B)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    :cond_2
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 89
    .line 90
    invoke-static {p1, v0, v4}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    const/4 v5, 0x0

    .line 95
    const/4 v0, 0x0

    .line 96
    iget-object v2, p0, La/bxp;->b:La/qdz;

    .line 97
    .line 98
    iget-object v3, p0, La/bxp;->c:Lkotlin/jvm/functions/Function1;

    .line 99
    .line 100
    invoke-static/range {v0 .. v5}, La/saj;->w(La/mm40;La/l7m0;La/qdz;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4, p5}, La/fet;->r(Z)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_3
    const p0, 0x3397eac1

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4, p0}, La/fet;->e0(I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4, p5}, La/fet;->r(Z)V

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_4
    invoke-virtual {v4}, La/fet;->X()V

    .line 118
    .line 119
    .line 120
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    return-object p0
.end method
