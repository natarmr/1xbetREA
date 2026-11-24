.class public final La/o7s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xae0;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(La/xae0;JB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/o7s0;->a:B

    iput-object p1, p0, La/o7s0;->b:La/xae0;

    iput-wide p2, p0, La/o7s0;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/o7s0;->a:B

    .line 2
    .line 3
    iget-wide v1, p0, La/o7s0;->c:J

    .line 4
    .line 5
    iget-object v3, p0, La/o7s0;->b:La/xae0;

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/high16 v6, -0x80000000

    .line 11
    .line 12
    const/4 v7, 0x1

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    instance-of v0, p2, La/p9s0;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    move-object v0, p2

    .line 21
    check-cast v0, La/p9s0;

    .line 22
    .line 23
    iget v8, v0, La/p9s0;->j:I

    .line 24
    .line 25
    and-int v9, v8, v6

    .line 26
    .line 27
    if-eqz v9, :cond_0

    .line 28
    .line 29
    sub-int/2addr v8, v6

    .line 30
    iput v8, v0, La/p9s0;->j:I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance v0, La/p9s0;

    .line 34
    .line 35
    invoke-direct {v0, p0, p2}, La/p9s0;-><init>(La/o7s0;La/yje;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-object p0, v0, La/p9s0;->i:Ljava/lang/Object;

    .line 39
    .line 40
    sget-object p2, La/wne;->a:La/wne;

    .line 41
    .line 42
    iget v6, v0, La/p9s0;->j:I

    .line 43
    .line 44
    if-eqz v6, :cond_2

    .line 45
    .line 46
    if-ne v6, v7, :cond_1

    .line 47
    .line 48
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    new-instance p0, La/s7h;

    .line 60
    .line 61
    const/16 v4, 0xc

    .line 62
    .line 63
    invoke-direct {p0, p1, v1, v2, v4}, La/s7h;-><init>(La/kmq;JB)V

    .line 64
    .line 65
    .line 66
    iput v7, v0, La/p9s0;->j:I

    .line 67
    .line 68
    iget-object p1, v3, La/xae0;->a:La/n7m0;

    .line 69
    .line 70
    invoke-interface {p1, p0, v0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    if-ne p0, p2, :cond_3

    .line 75
    .line 76
    move-object v4, p2

    .line 77
    goto :goto_2

    .line 78
    :cond_3
    :goto_1
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    :goto_2
    return-object v4

    .line 81
    :pswitch_0
    instance-of v0, p2, La/m7s0;

    .line 82
    .line 83
    if-eqz v0, :cond_4

    .line 84
    .line 85
    move-object v0, p2

    .line 86
    check-cast v0, La/m7s0;

    .line 87
    .line 88
    iget v8, v0, La/m7s0;->j:I

    .line 89
    .line 90
    and-int v9, v8, v6

    .line 91
    .line 92
    if-eqz v9, :cond_4

    .line 93
    .line 94
    sub-int/2addr v8, v6

    .line 95
    iput v8, v0, La/m7s0;->j:I

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_4
    new-instance v0, La/m7s0;

    .line 99
    .line 100
    invoke-direct {v0, p0, p2}, La/m7s0;-><init>(La/o7s0;La/yje;)V

    .line 101
    .line 102
    .line 103
    :goto_3
    iget-object p0, v0, La/m7s0;->i:Ljava/lang/Object;

    .line 104
    .line 105
    sget-object p2, La/wne;->a:La/wne;

    .line 106
    .line 107
    iget v6, v0, La/m7s0;->j:I

    .line 108
    .line 109
    if-eqz v6, :cond_6

    .line 110
    .line 111
    if-ne v6, v7, :cond_5

    .line 112
    .line 113
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_5
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    goto :goto_5

    .line 121
    :cond_6
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    new-instance p0, La/s7h;

    .line 125
    .line 126
    const/16 v4, 0xb

    .line 127
    .line 128
    invoke-direct {p0, p1, v1, v2, v4}, La/s7h;-><init>(La/kmq;JB)V

    .line 129
    .line 130
    .line 131
    iput v7, v0, La/m7s0;->j:I

    .line 132
    .line 133
    iget-object p1, v3, La/xae0;->a:La/n7m0;

    .line 134
    .line 135
    invoke-interface {p1, p0, v0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    if-ne p0, p2, :cond_7

    .line 140
    .line 141
    move-object v4, p2

    .line 142
    goto :goto_5

    .line 143
    :cond_7
    :goto_4
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    :goto_5
    return-object v4

    .line 146
    nop

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
