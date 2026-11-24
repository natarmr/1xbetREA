.class public final La/o160;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:La/mm40;

.field public final synthetic c:Z

.field public final synthetic d:Z

.field public final synthetic e:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Ljava/util/List;La/mm40;ZZLkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/o160;->a:Ljava/util/List;

    .line 5
    .line 6
    iput-object p2, p0, La/o160;->b:La/mm40;

    .line 7
    .line 8
    iput-boolean p3, p0, La/o160;->c:Z

    .line 9
    .line 10
    iput-boolean p4, p0, La/o160;->d:Z

    .line 11
    .line 12
    iput-object p5, p0, La/o160;->e:Lkotlin/jvm/functions/Function1;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, La/g9z;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    move-object v4, p3

    .line 10
    check-cast v4, La/fet;

    .line 11
    .line 12
    check-cast p4, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    and-int/lit8 p4, p3, 0x6

    .line 19
    .line 20
    if-nez p4, :cond_1

    .line 21
    .line 22
    invoke-virtual {v4, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    const/4 p1, 0x4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p1, 0x2

    .line 31
    :goto_0
    or-int/2addr p1, p3

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move p1, p3

    .line 34
    :goto_1
    and-int/lit8 p3, p3, 0x30

    .line 35
    .line 36
    if-nez p3, :cond_3

    .line 37
    .line 38
    invoke-virtual {v4, p2}, La/fet;->e(I)Z

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    if-eqz p3, :cond_2

    .line 43
    .line 44
    const/16 p3, 0x20

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 p3, 0x10

    .line 48
    .line 49
    :goto_2
    or-int/2addr p1, p3

    .line 50
    :cond_3
    and-int/lit16 p3, p1, 0x93

    .line 51
    .line 52
    const/16 p4, 0x92

    .line 53
    .line 54
    const/4 v6, 0x0

    .line 55
    const/4 v0, 0x1

    .line 56
    if-eq p3, p4, :cond_4

    .line 57
    .line 58
    move p3, v0

    .line 59
    goto :goto_3

    .line 60
    :cond_4
    move p3, v6

    .line 61
    :goto_3
    and-int/2addr p1, v0

    .line 62
    invoke-virtual {v4, p1, p3}, La/fet;->U(IZ)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_7

    .line 67
    .line 68
    iget-object p1, p0, La/o160;->a:Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    move-object v1, p1

    .line 75
    check-cast v1, La/a2n;

    .line 76
    .line 77
    const p1, -0x6b72a783

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4, p1}, La/fet;->e0(I)V

    .line 81
    .line 82
    .line 83
    iget-boolean p1, p0, La/o160;->d:Z

    .line 84
    .line 85
    invoke-virtual {v4, p1}, La/fet;->h(Z)Z

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    iget-object p3, p0, La/o160;->e:Lkotlin/jvm/functions/Function1;

    .line 90
    .line 91
    invoke-virtual {v4, p3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result p4

    .line 95
    or-int/2addr p2, p4

    .line 96
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p4

    .line 100
    if-nez p2, :cond_5

    .line 101
    .line 102
    sget-object p2, La/ukd;->a:La/cl5;

    .line 103
    .line 104
    if-ne p4, p2, :cond_6

    .line 105
    .line 106
    :cond_5
    new-instance p4, La/n160;

    .line 107
    .line 108
    invoke-direct {p4, p3, p1}, La/n160;-><init>(Lkotlin/jvm/functions/Function1;Z)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v4, p4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    :cond_6
    move-object v3, p4

    .line 115
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 116
    .line 117
    const/4 v5, 0x6

    .line 118
    iget-object v0, p0, La/o160;->b:La/mm40;

    .line 119
    .line 120
    iget-boolean v2, p0, La/o160;->c:Z

    .line 121
    .line 122
    invoke-static/range {v0 .. v5}, La/nia0;->x(La/mm40;La/a2n;ZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v4, v6}, La/fet;->r(Z)V

    .line 126
    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_7
    invoke-virtual {v4}, La/fet;->X()V

    .line 130
    .line 131
    .line 132
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 133
    .line 134
    return-object p0
.end method
