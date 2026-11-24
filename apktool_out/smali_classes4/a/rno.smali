.class public final La/rno;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/p7m0;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(La/p7m0;JB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/rno;->a:B

    iput-object p1, p0, La/rno;->b:La/p7m0;

    iput-wide p2, p0, La/rno;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/rno;->a:B

    .line 2
    .line 3
    iget-wide v1, p0, La/rno;->c:J

    .line 4
    .line 5
    iget-object v3, p0, La/rno;->b:La/p7m0;

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
    instance-of v0, p2, La/sno;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    move-object v0, p2

    .line 21
    check-cast v0, La/sno;

    .line 22
    .line 23
    iget v8, v0, La/sno;->j:I

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
    iput v8, v0, La/sno;->j:I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance v0, La/sno;

    .line 34
    .line 35
    invoke-direct {v0, p0, p2}, La/sno;-><init>(La/rno;La/yje;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-object p0, v0, La/sno;->i:Ljava/lang/Object;

    .line 39
    .line 40
    sget-object p2, La/wne;->a:La/wne;

    .line 41
    .line 42
    iget v6, v0, La/sno;->j:I

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
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    new-instance p0, La/s7h;

    .line 62
    .line 63
    const/4 v4, 0x4

    .line 64
    invoke-direct {p0, p1, v1, v2, v4}, La/s7h;-><init>(La/kmq;JB)V

    .line 65
    .line 66
    .line 67
    iput v7, v0, La/sno;->j:I

    .line 68
    .line 69
    invoke-virtual {v3, p0, v0}, La/p7m0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-object v4, p2

    .line 73
    :goto_1
    return-object v4

    .line 74
    :pswitch_0
    instance-of v0, p2, La/pno;

    .line 75
    .line 76
    if-eqz v0, :cond_3

    .line 77
    .line 78
    move-object v0, p2

    .line 79
    check-cast v0, La/pno;

    .line 80
    .line 81
    iget v8, v0, La/pno;->j:I

    .line 82
    .line 83
    and-int v9, v8, v6

    .line 84
    .line 85
    if-eqz v9, :cond_3

    .line 86
    .line 87
    sub-int/2addr v8, v6

    .line 88
    iput v8, v0, La/pno;->j:I

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_3
    new-instance v0, La/pno;

    .line 92
    .line 93
    invoke-direct {v0, p0, p2}, La/pno;-><init>(La/rno;La/yje;)V

    .line 94
    .line 95
    .line 96
    :goto_2
    iget-object p0, v0, La/pno;->i:Ljava/lang/Object;

    .line 97
    .line 98
    sget-object p2, La/wne;->a:La/wne;

    .line 99
    .line 100
    iget v6, v0, La/pno;->j:I

    .line 101
    .line 102
    if-eqz v6, :cond_5

    .line 103
    .line 104
    if-ne v6, v7, :cond_4

    .line 105
    .line 106
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_4
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_5
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    new-instance p0, La/s7h;

    .line 120
    .line 121
    const/4 v4, 0x3

    .line 122
    invoke-direct {p0, p1, v1, v2, v4}, La/s7h;-><init>(La/kmq;JB)V

    .line 123
    .line 124
    .line 125
    iput v7, v0, La/pno;->j:I

    .line 126
    .line 127
    invoke-virtual {v3, p0, v0}, La/p7m0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-object v4, p2

    .line 131
    :goto_3
    return-object v4

    .line 132
    nop

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
