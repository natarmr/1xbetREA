.class public final La/sst;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kmq;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(La/kmq;ZB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/sst;->a:B

    iput-object p1, p0, La/sst;->b:La/kmq;

    iput-boolean p2, p0, La/sst;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/sst;->a:B

    .line 2
    .line 3
    iget-boolean v1, p0, La/sst;->c:Z

    .line 4
    .line 5
    iget-object v2, p0, La/sst;->b:La/kmq;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/high16 v5, -0x80000000

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    instance-of p1, p2, La/qy70;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    move-object p1, p2

    .line 21
    check-cast p1, La/qy70;

    .line 22
    .line 23
    iget v0, p1, La/qy70;->j:I

    .line 24
    .line 25
    and-int v7, v0, v5

    .line 26
    .line 27
    if-eqz v7, :cond_0

    .line 28
    .line 29
    sub-int/2addr v0, v5

    .line 30
    iput v0, p1, La/qy70;->j:I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance p1, La/qy70;

    .line 34
    .line 35
    invoke-direct {p1, p0, p2}, La/qy70;-><init>(La/sst;La/yje;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-object p0, p1, La/qy70;->i:Ljava/lang/Object;

    .line 39
    .line 40
    sget-object p2, La/wne;->a:La/wne;

    .line 41
    .line 42
    iget v0, p1, La/qy70;->j:I

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    if-ne v0, v6, :cond_1

    .line 47
    .line 48
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

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
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    iput v6, p1, La/qy70;->j:I

    .line 64
    .line 65
    invoke-interface {v2, p0, p1}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    if-ne p0, p2, :cond_3

    .line 70
    .line 71
    move-object v3, p2

    .line 72
    goto :goto_2

    .line 73
    :cond_3
    :goto_1
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    :goto_2
    return-object v3

    .line 76
    :pswitch_0
    instance-of v0, p2, La/rst;

    .line 77
    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    move-object v0, p2

    .line 81
    check-cast v0, La/rst;

    .line 82
    .line 83
    iget v7, v0, La/rst;->j:I

    .line 84
    .line 85
    and-int v8, v7, v5

    .line 86
    .line 87
    if-eqz v8, :cond_4

    .line 88
    .line 89
    sub-int/2addr v7, v5

    .line 90
    iput v7, v0, La/rst;->j:I

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_4
    new-instance v0, La/rst;

    .line 94
    .line 95
    invoke-direct {v0, p0, p2}, La/rst;-><init>(La/sst;La/yje;)V

    .line 96
    .line 97
    .line 98
    :goto_3
    iget-object p0, v0, La/rst;->i:Ljava/lang/Object;

    .line 99
    .line 100
    sget-object p2, La/wne;->a:La/wne;

    .line 101
    .line 102
    iget v5, v0, La/rst;->j:I

    .line 103
    .line 104
    if-eqz v5, :cond_6

    .line 105
    .line 106
    if-ne v5, v6, :cond_5

    .line 107
    .line 108
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    goto :goto_5

    .line 112
    :cond_5
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    goto :goto_6

    .line 116
    :cond_6
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    check-cast p1, Ljava/lang/Boolean;

    .line 120
    .line 121
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    if-eqz v1, :cond_7

    .line 126
    .line 127
    if-eqz p0, :cond_7

    .line 128
    .line 129
    move p0, v6

    .line 130
    goto :goto_4

    .line 131
    :cond_7
    const/4 p0, 0x0

    .line 132
    :goto_4
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    iput v6, v0, La/rst;->j:I

    .line 137
    .line 138
    invoke-interface {v2, p0, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    if-ne p0, p2, :cond_8

    .line 143
    .line 144
    move-object v3, p2

    .line 145
    goto :goto_6

    .line 146
    :cond_8
    :goto_5
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    :goto_6
    return-object v3

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
