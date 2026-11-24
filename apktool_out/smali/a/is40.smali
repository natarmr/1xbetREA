.class public final La/is40;
.super La/guy;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:La/ot40;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:La/agk0;


# direct methods
.method public constructor <init>(La/ot40;La/mms0;La/agk0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/is40;->a:La/ot40;

    .line 2
    .line 3
    iput-object p2, p0, La/is40;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, La/is40;->c:La/agk0;

    .line 6
    .line 7
    const/4 p1, 0x3

    .line 8
    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, La/mm40;

    .line 2
    .line 3
    check-cast p2, La/fet;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    const p3, 0x8b6d03a

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2, p3}, La/fet;->e0(I)V

    .line 14
    .line 15
    .line 16
    iget-object p3, p0, La/is40;->a:La/ot40;

    .line 17
    .line 18
    iget-object v0, p3, La/ot40;->i:La/fms0;

    .line 19
    .line 20
    iget-object v0, v0, La/fms0;->f:La/yls0;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    if-eqz v0, :cond_8

    .line 24
    .line 25
    iget-object v0, p0, La/is40;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-virtual {p2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    sget-object v4, La/ukd;->a:La/cl5;

    .line 36
    .line 37
    if-nez v2, :cond_0

    .line 38
    .line 39
    if-ne v3, v4, :cond_1

    .line 40
    .line 41
    :cond_0
    new-instance v3, La/lms0;

    .line 42
    .line 43
    iget-object p0, p0, La/is40;->c:La/agk0;

    .line 44
    .line 45
    invoke-direct {v3, p3, p0}, La/lms0;-><init>(La/ot40;La/agk0;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    check-cast v3, La/lms0;

    .line 52
    .line 53
    invoke-virtual {p2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    const/4 v2, 0x6

    .line 62
    const/4 v5, 0x0

    .line 63
    if-nez p0, :cond_2

    .line 64
    .line 65
    if-ne p3, v4, :cond_3

    .line 66
    .line 67
    :cond_2
    const/4 p0, -0x1

    .line 68
    invoke-static {p0, v5, v5, v2}, La/vtb;->d(ILa/i99;Lkotlin/jvm/functions/Function1;I)La/q99;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    invoke-virtual {p2, p3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :cond_3
    check-cast p3, La/htb;

    .line 76
    .line 77
    invoke-virtual {p2, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    invoke-virtual {p2, p3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    or-int/2addr p0, v6

    .line 86
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    const/4 v7, 0x2

    .line 91
    if-nez p0, :cond_4

    .line 92
    .line 93
    if-ne v6, v4, :cond_5

    .line 94
    .line 95
    :cond_4
    new-instance v6, La/iq3;

    .line 96
    .line 97
    invoke-direct {v6, v3, p3, v5, v7}, La/iq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p2, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    :cond_5
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 104
    .line 105
    invoke-static {p2, v0, v6}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p2, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    invoke-virtual {p2, p3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    or-int/2addr p0, v6

    .line 117
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    if-nez p0, :cond_6

    .line 122
    .line 123
    if-ne v6, v4, :cond_7

    .line 124
    .line 125
    :cond_6
    new-instance v6, La/hk40;

    .line 126
    .line 127
    invoke-direct {v6, v3, p3, v5, v7}, La/hk40;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p2, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    :cond_7
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 134
    .line 135
    sget-object p0, La/fnn0;->a:La/woa0;

    .line 136
    .line 137
    new-instance p0, La/cnn0;

    .line 138
    .line 139
    new-instance p3, La/enn0;

    .line 140
    .line 141
    invoke-direct {p3, v6}, La/enn0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 142
    .line 143
    .line 144
    invoke-direct {p0, v0, v5, p3, v2}, La/cnn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;I)V

    .line 145
    .line 146
    .line 147
    invoke-interface {p1, p0}, La/mm40;->e(La/mm40;)La/mm40;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-virtual {p2, v1}, La/fet;->r(Z)V

    .line 152
    .line 153
    .line 154
    return-object p0

    .line 155
    :cond_8
    invoke-virtual {p2, v1}, La/fet;->r(Z)V

    .line 156
    .line 157
    .line 158
    return-object p1
.end method
