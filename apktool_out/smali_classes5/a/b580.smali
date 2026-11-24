.class public final La/b580;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:J

.field public final synthetic c:J

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Ljava/util/List;JJLkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/b580;->a:Ljava/util/List;

    .line 5
    .line 6
    iput-wide p2, p0, La/b580;->b:J

    .line 7
    .line 8
    iput-wide p4, p0, La/b580;->c:J

    .line 9
    .line 10
    iput-object p6, p0, La/b580;->d:Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

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
    check-cast p3, La/fet;

    .line 10
    .line 11
    check-cast p4, Ljava/lang/Number;

    .line 12
    .line 13
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p4

    .line 17
    and-int/lit8 v0, p4, 0x6

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {p3, p1}, La/fet;->g(Ljava/lang/Object;)Z

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
    move p1, v1

    .line 31
    :goto_0
    or-int/2addr p1, p4

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move p1, p4

    .line 34
    :goto_1
    and-int/lit8 p4, p4, 0x30

    .line 35
    .line 36
    if-nez p4, :cond_3

    .line 37
    .line 38
    invoke-virtual {p3, p2}, La/fet;->e(I)Z

    .line 39
    .line 40
    .line 41
    move-result p4

    .line 42
    if-eqz p4, :cond_2

    .line 43
    .line 44
    const/16 p4, 0x20

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 p4, 0x10

    .line 48
    .line 49
    :goto_2
    or-int/2addr p1, p4

    .line 50
    :cond_3
    and-int/lit16 p4, p1, 0x93

    .line 51
    .line 52
    const/16 v0, 0x92

    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    const/4 v3, 0x1

    .line 56
    if-eq p4, v0, :cond_4

    .line 57
    .line 58
    move p4, v3

    .line 59
    goto :goto_3

    .line 60
    :cond_4
    move p4, v2

    .line 61
    :goto_3
    and-int/2addr p1, v3

    .line 62
    invoke-virtual {p3, p1, p4}, La/fet;->U(IZ)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_7

    .line 67
    .line 68
    iget-object p1, p0, La/b580;->a:Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, La/q380;

    .line 75
    .line 76
    const p2, 0x73c58643    # 3.1299E31f

    .line 77
    .line 78
    .line 79
    invoke-virtual {p3, p2}, La/fet;->e0(I)V

    .line 80
    .line 81
    .line 82
    invoke-static {p1, p3}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    sget-object p1, La/qmk;->a:La/zcl;

    .line 87
    .line 88
    invoke-static {p3}, La/qmk;->a(La/fet;)La/wfn;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iget p1, p1, La/wfn;->c:F

    .line 93
    .line 94
    sget-object p2, La/jm40;->b:La/jm40;

    .line 95
    .line 96
    const/4 p4, 0x0

    .line 97
    invoke-static {p2, p1, p4, v1}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    const/high16 p2, 0x3f800000    # 1.0f

    .line 102
    .line 103
    invoke-static {p1, p2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    const/high16 p2, 0x42700000    # 60.0f

    .line 108
    .line 109
    invoke-static {p1, p2}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {p3, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result p2

    .line 117
    iget-wide v0, p0, La/b580;->b:J

    .line 118
    .line 119
    invoke-virtual {p3, v0, v1}, La/fet;->f(J)Z

    .line 120
    .line 121
    .line 122
    move-result p4

    .line 123
    or-int/2addr p2, p4

    .line 124
    iget-wide v0, p0, La/b580;->c:J

    .line 125
    .line 126
    invoke-virtual {p3, v0, v1}, La/fet;->f(J)Z

    .line 127
    .line 128
    .line 129
    move-result p4

    .line 130
    or-int/2addr p2, p4

    .line 131
    invoke-virtual {p3}, La/fet;->P()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p4

    .line 135
    if-nez p2, :cond_5

    .line 136
    .line 137
    sget-object p2, La/ukd;->a:La/cl5;

    .line 138
    .line 139
    if-ne p4, p2, :cond_6

    .line 140
    .line 141
    :cond_5
    new-instance v3, La/z480;

    .line 142
    .line 143
    iget-wide v5, p0, La/b580;->b:J

    .line 144
    .line 145
    iget-wide v7, p0, La/b580;->c:J

    .line 146
    .line 147
    invoke-direct/range {v3 .. v8}, La/z480;-><init>(La/pz40;JJ)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p3, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    move-object p4, v3

    .line 154
    :cond_6
    check-cast p4, Lkotlin/jvm/functions/Function1;

    .line 155
    .line 156
    invoke-static {p1, p4}, La/rq8;->L(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    iget-object p0, p0, La/b580;->d:Lkotlin/jvm/functions/Function1;

    .line 161
    .line 162
    invoke-static {p1, v4, p0, p3, v2}, La/w9x;->h(La/mm40;La/pz40;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p3, v2}, La/fet;->r(Z)V

    .line 166
    .line 167
    .line 168
    goto :goto_4

    .line 169
    :cond_7
    invoke-virtual {p3}, La/fet;->X()V

    .line 170
    .line 171
    .line 172
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 173
    .line 174
    return-object p0
.end method
