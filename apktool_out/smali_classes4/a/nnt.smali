.class public final La/nnt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ewt;


# direct methods
.method public synthetic constructor <init>(La/ewt;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/nnt;->a:B

    iput-object p1, p0, La/nnt;->b:La/ewt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/nnt;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/nnt;->b:La/ewt;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/high16 v4, -0x80000000

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    instance-of v0, p2, La/d5v;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    move-object v0, p2

    .line 19
    check-cast v0, La/d5v;

    .line 20
    .line 21
    iget v6, v0, La/d5v;->j:I

    .line 22
    .line 23
    and-int v7, v6, v4

    .line 24
    .line 25
    if-eqz v7, :cond_0

    .line 26
    .line 27
    sub-int/2addr v6, v4

    .line 28
    iput v6, v0, La/d5v;->j:I

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance v0, La/d5v;

    .line 32
    .line 33
    invoke-direct {v0, p0, p2}, La/d5v;-><init>(La/nnt;La/yje;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object p0, v0, La/d5v;->i:Ljava/lang/Object;

    .line 37
    .line 38
    sget-object p2, La/wne;->a:La/wne;

    .line 39
    .line 40
    iget v4, v0, La/d5v;->j:I

    .line 41
    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    if-ne v4, v5, :cond_1

    .line 45
    .line 46
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    new-instance p0, La/b4v;

    .line 58
    .line 59
    const/4 v2, 0x2

    .line 60
    invoke-direct {p0, p1, v2}, La/b4v;-><init>(La/kmq;B)V

    .line 61
    .line 62
    .line 63
    iput v5, v0, La/d5v;->j:I

    .line 64
    .line 65
    invoke-virtual {v1, p0, v0}, La/ewt;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    if-ne p0, p2, :cond_3

    .line 70
    .line 71
    move-object v2, p2

    .line 72
    goto :goto_2

    .line 73
    :cond_3
    :goto_1
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    :goto_2
    return-object v2

    .line 76
    :pswitch_0
    instance-of v0, p2, La/lnt;

    .line 77
    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    move-object v0, p2

    .line 81
    check-cast v0, La/lnt;

    .line 82
    .line 83
    iget v6, v0, La/lnt;->j:I

    .line 84
    .line 85
    and-int v7, v6, v4

    .line 86
    .line 87
    if-eqz v7, :cond_4

    .line 88
    .line 89
    sub-int/2addr v6, v4

    .line 90
    iput v6, v0, La/lnt;->j:I

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_4
    new-instance v0, La/lnt;

    .line 94
    .line 95
    invoke-direct {v0, p0, p2}, La/lnt;-><init>(La/nnt;La/yje;)V

    .line 96
    .line 97
    .line 98
    :goto_3
    iget-object p0, v0, La/lnt;->i:Ljava/lang/Object;

    .line 99
    .line 100
    sget-object p2, La/wne;->a:La/wne;

    .line 101
    .line 102
    iget v4, v0, La/lnt;->j:I

    .line 103
    .line 104
    if-eqz v4, :cond_6

    .line 105
    .line 106
    if-ne v4, v5, :cond_5

    .line 107
    .line 108
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_5
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    goto :goto_5

    .line 116
    :cond_6
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    new-instance p0, La/uap;

    .line 120
    .line 121
    const/16 v2, 0x1d

    .line 122
    .line 123
    invoke-direct {p0, p1, v2}, La/uap;-><init>(La/kmq;B)V

    .line 124
    .line 125
    .line 126
    iput v5, v0, La/lnt;->j:I

    .line 127
    .line 128
    invoke-virtual {v1, p0, v0}, La/ewt;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    if-ne p0, p2, :cond_7

    .line 133
    .line 134
    move-object v2, p2

    .line 135
    goto :goto_5

    .line 136
    :cond_7
    :goto_4
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 137
    .line 138
    :goto_5
    return-object v2

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
