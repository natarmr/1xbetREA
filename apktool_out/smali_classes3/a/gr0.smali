.class public final La/gr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vsg0;

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/vsg0;JLa/jr0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/gr0;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/gr0;->b:La/vsg0;

    .line 8
    .line 9
    iput-wide p2, p0, La/gr0;->c:J

    .line 10
    .line 11
    iput-object p4, p0, La/gr0;->d:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(La/vsg0;La/hie0;J)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/gr0;->a:B

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, La/gr0;->b:La/vsg0;

    iput-object p2, p0, La/gr0;->d:Ljava/lang/Object;

    iput-wide p3, p0, La/gr0;->c:J

    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/gr0;->a:B

    .line 2
    .line 3
    iget-wide v1, p0, La/gr0;->c:J

    .line 4
    .line 5
    iget-object v3, p0, La/gr0;->d:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v4, p0, La/gr0;->b:La/vsg0;

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    const/high16 v7, -0x80000000

    .line 13
    .line 14
    const/4 v8, 0x1

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    instance-of v0, p2, La/jos;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    move-object v0, p2

    .line 23
    check-cast v0, La/jos;

    .line 24
    .line 25
    iget v9, v0, La/jos;->j:I

    .line 26
    .line 27
    and-int v10, v9, v7

    .line 28
    .line 29
    if-eqz v10, :cond_0

    .line 30
    .line 31
    sub-int/2addr v9, v7

    .line 32
    iput v9, v0, La/jos;->j:I

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    new-instance v0, La/jos;

    .line 36
    .line 37
    invoke-direct {v0, p0, p2}, La/jos;-><init>(La/gr0;La/yje;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    iget-object p0, v0, La/jos;->i:Ljava/lang/Object;

    .line 41
    .line 42
    sget-object p2, La/wne;->a:La/wne;

    .line 43
    .line 44
    iget v7, v0, La/jos;->j:I

    .line 45
    .line 46
    if-eqz v7, :cond_2

    .line 47
    .line 48
    if-ne v7, v8, :cond_1

    .line 49
    .line 50
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    new-instance p0, La/fr0;

    .line 62
    .line 63
    check-cast v3, La/hie0;

    .line 64
    .line 65
    invoke-direct {p0, p1, v3, v1, v2}, La/fr0;-><init>(La/kmq;La/hie0;J)V

    .line 66
    .line 67
    .line 68
    iput v8, v0, La/jos;->j:I

    .line 69
    .line 70
    invoke-virtual {v4, p0, v0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    if-ne p0, p2, :cond_3

    .line 75
    .line 76
    move-object v5, p2

    .line 77
    goto :goto_2

    .line 78
    :cond_3
    :goto_1
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    :goto_2
    return-object v5

    .line 81
    :pswitch_0
    instance-of v0, p2, La/dr0;

    .line 82
    .line 83
    if-eqz v0, :cond_4

    .line 84
    .line 85
    move-object v0, p2

    .line 86
    check-cast v0, La/dr0;

    .line 87
    .line 88
    iget v9, v0, La/dr0;->j:I

    .line 89
    .line 90
    and-int v10, v9, v7

    .line 91
    .line 92
    if-eqz v10, :cond_4

    .line 93
    .line 94
    sub-int/2addr v9, v7

    .line 95
    iput v9, v0, La/dr0;->j:I

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_4
    new-instance v0, La/dr0;

    .line 99
    .line 100
    invoke-direct {v0, p0, p2}, La/dr0;-><init>(La/gr0;La/yje;)V

    .line 101
    .line 102
    .line 103
    :goto_3
    iget-object p0, v0, La/dr0;->i:Ljava/lang/Object;

    .line 104
    .line 105
    sget-object p2, La/wne;->a:La/wne;

    .line 106
    .line 107
    iget v7, v0, La/dr0;->j:I

    .line 108
    .line 109
    if-eqz v7, :cond_6

    .line 110
    .line 111
    if-ne v7, v8, :cond_5

    .line 112
    .line 113
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_5
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

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
    new-instance p0, La/fr0;

    .line 125
    .line 126
    check-cast v3, La/jr0;

    .line 127
    .line 128
    invoke-direct {p0, p1, v1, v2, v3}, La/fr0;-><init>(La/kmq;JLa/jr0;)V

    .line 129
    .line 130
    .line 131
    iput v8, v0, La/dr0;->j:I

    .line 132
    .line 133
    invoke-virtual {v4, p0, v0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    if-ne p0, p2, :cond_7

    .line 138
    .line 139
    move-object v5, p2

    .line 140
    goto :goto_5

    .line 141
    :cond_7
    :goto_4
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    :goto_5
    return-object v5

    .line 144
    nop

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
