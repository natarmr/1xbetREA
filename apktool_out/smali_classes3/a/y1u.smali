.class public final La/y1u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ul9;


# direct methods
.method public constructor <init>(La/ul9;B)V
    .locals 0

    .line 1
    packed-switch p2, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/y1u;->a:La/ul9;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/y1u;->a:La/ul9;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(La/j4g;La/zje;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p2, La/qoi0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/qoi0;

    .line 7
    .line 8
    iget v1, v0, La/qoi0;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/qoi0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/qoi0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/qoi0;-><init>(La/y1u;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/qoi0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/qoi0;->l:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    iget-object p0, p0, La/y1u;->a:La/ul9;

    .line 33
    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v5, :cond_2

    .line 39
    .line 40
    if-ne v2, v4, :cond_1

    .line 41
    .line 42
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_4

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v3

    .line 52
    :cond_2
    iget-object p1, v0, La/qoi0;->i:La/j4g;

    .line 53
    .line 54
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iput-object p1, v0, La/qoi0;->i:La/j4g;

    .line 62
    .line 63
    iput v5, v0, La/qoi0;->l:I

    .line 64
    .line 65
    iget-byte p2, p0, La/ul9;->a:B

    .line 66
    .line 67
    packed-switch p2, :pswitch_data_0

    .line 68
    .line 69
    .line 70
    iget-object p2, p0, La/ul9;->d:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p2, La/s3t0;

    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    iget-object p2, p2, La/s3t0;->f:La/ol60;

    .line 78
    .line 79
    invoke-virtual {p2, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :pswitch_0
    iget-object p2, p0, La/ul9;->d:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p2, La/hl9;

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    iget-object p2, p2, La/hl9;->f:La/ol60;

    .line 93
    .line 94
    invoke-virtual {p2, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    :goto_1
    if-ne p2, v1, :cond_4

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_4
    :goto_2
    iget-wide p1, p1, La/j4g;->a:J

    .line 103
    .line 104
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-static {v2}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {v2, p1, p2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 113
    .line 114
    .line 115
    new-instance v6, La/c5g;

    .line 116
    .line 117
    invoke-virtual {v2, v5}, Ljava/util/Calendar;->get(I)I

    .line 118
    .line 119
    .line 120
    move-result v7

    .line 121
    invoke-virtual {v2, v4}, Ljava/util/Calendar;->get(I)I

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    const/4 p1, 0x5

    .line 126
    invoke-virtual {v2, p1}, Ljava/util/Calendar;->get(I)I

    .line 127
    .line 128
    .line 129
    move-result v9

    .line 130
    invoke-virtual {v2, p1}, Ljava/util/Calendar;->get(I)I

    .line 131
    .line 132
    .line 133
    move-result v10

    .line 134
    sget-object v11, La/yag;->d:La/yag;

    .line 135
    .line 136
    const/4 v12, 0x0

    .line 137
    invoke-direct/range {v6 .. v12}, La/c5g;-><init>(IIIILa/yag;Z)V

    .line 138
    .line 139
    .line 140
    iput-object v3, v0, La/qoi0;->i:La/j4g;

    .line 141
    .line 142
    iput v4, v0, La/qoi0;->l:I

    .line 143
    .line 144
    invoke-virtual {p0, v6}, La/ul9;->h(La/c5g;)Lkotlin/Unit;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    if-ne p0, v1, :cond_5

    .line 149
    .line 150
    :goto_3
    return-object v1

    .line 151
    :cond_5
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 152
    .line 153
    return-object p0

    .line 154
    nop

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
