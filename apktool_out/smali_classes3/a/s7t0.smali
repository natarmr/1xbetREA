.class public final La/s7t0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pbt;

.field public final b:La/d3c;

.field public final c:La/fq;

.field public final d:La/qpt;

.field public final e:La/gmt;

.field public final f:La/rgs;


# direct methods
.method public constructor <init>(La/pbt;La/d3c;La/fq;La/qpt;La/gmt;La/rgs;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, La/s7t0;->a:La/pbt;

    .line 20
    .line 21
    iput-object p2, p0, La/s7t0;->b:La/d3c;

    .line 22
    .line 23
    iput-object p3, p0, La/s7t0;->c:La/fq;

    .line 24
    .line 25
    iput-object p4, p0, La/s7t0;->d:La/qpt;

    .line 26
    .line 27
    iput-object p5, p0, La/s7t0;->e:La/gmt;

    .line 28
    .line 29
    iput-object p6, p0, La/s7t0;->f:La/rgs;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final a(ZLa/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, La/r7t0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/r7t0;

    .line 7
    .line 8
    iget v1, v0, La/r7t0;->l:I

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
    iput v1, v0, La/r7t0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/r7t0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/r7t0;-><init>(La/s7t0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/r7t0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/r7t0;->l:I

    .line 30
    .line 31
    iget-object v3, p0, La/s7t0;->c:La/fq;

    .line 32
    .line 33
    const/4 v4, 0x3

    .line 34
    const/4 v5, 0x2

    .line 35
    const/4 v6, 0x1

    .line 36
    if-eqz v2, :cond_4

    .line 37
    .line 38
    if-eq v2, v6, :cond_3

    .line 39
    .line 40
    if-eq v2, v5, :cond_2

    .line 41
    .line 42
    if-ne v2, v4, :cond_1

    .line 43
    .line 44
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto/16 :goto_5

    .line 48
    .line 49
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    return-object p0

    .line 56
    :cond_2
    iget-boolean p1, v0, La/r7t0;->i:Z

    .line 57
    .line 58
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_3
    iget-boolean p1, v0, La/r7t0;->i:Z

    .line 63
    .line 64
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_4
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object p2, p0, La/s7t0;->a:La/pbt;

    .line 72
    .line 73
    iget-object p2, p2, La/pbt;->a:La/j5t;

    .line 74
    .line 75
    iput-boolean p1, p2, La/j5t;->x:Z

    .line 76
    .line 77
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    const-string v7, "activeGameLoaded"

    .line 82
    .line 83
    invoke-static {v2, v7}, La/j5t;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    if-eqz p1, :cond_8

    .line 87
    .line 88
    iget-object v2, p0, La/s7t0;->b:La/d3c;

    .line 89
    .line 90
    invoke-virtual {v2}, La/d3c;->a()Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-nez v2, :cond_8

    .line 95
    .line 96
    iget-object v2, p0, La/s7t0;->e:La/gmt;

    .line 97
    .line 98
    invoke-virtual {v2}, La/gmt;->a()La/ql5;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    if-nez v2, :cond_5

    .line 103
    .line 104
    iget-object v2, p0, La/s7t0;->d:La/qpt;

    .line 105
    .line 106
    invoke-virtual {v2}, La/qpt;->a()La/ql5;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    :cond_5
    const/4 v8, 0x0

    .line 111
    if-eqz v2, :cond_7

    .line 112
    .line 113
    new-instance p2, La/hle;

    .line 114
    .line 115
    invoke-direct {p2, v2, v8}, La/hle;-><init>(La/ql5;Z)V

    .line 116
    .line 117
    .line 118
    iput-boolean p1, v0, La/r7t0;->i:Z

    .line 119
    .line 120
    iput v6, v0, La/r7t0;->l:I

    .line 121
    .line 122
    invoke-virtual {v3, p2, v0}, La/fq;->f(La/zy5;La/yje;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    if-ne p2, v1, :cond_6

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_6
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    .line 130
    .line 131
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_7
    if-eqz p1, :cond_8

    .line 136
    .line 137
    iput-boolean v8, p2, La/j5t;->x:Z

    .line 138
    .line 139
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 140
    .line 141
    invoke-static {p2, v7}, La/j5t;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    :cond_8
    :goto_2
    if-eqz p1, :cond_9

    .line 145
    .line 146
    iput-boolean p1, v0, La/r7t0;->i:Z

    .line 147
    .line 148
    iput v5, v0, La/r7t0;->l:I

    .line 149
    .line 150
    sget-object p2, La/qle;->a:La/qle;

    .line 151
    .line 152
    invoke-virtual {v3, p2, v0}, La/fq;->f(La/zy5;La/yje;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    if-ne p2, v1, :cond_9

    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_9
    :goto_3
    iput-boolean p1, v0, La/r7t0;->i:Z

    .line 160
    .line 161
    iput v4, v0, La/r7t0;->l:I

    .line 162
    .line 163
    iget-object p0, p0, La/s7t0;->f:La/rgs;

    .line 164
    .line 165
    invoke-virtual {p0, v0}, La/rgs;->a(La/zje;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    if-ne p0, v1, :cond_a

    .line 170
    .line 171
    :goto_4
    return-object v1

    .line 172
    :cond_a
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 173
    .line 174
    return-object p0
.end method
