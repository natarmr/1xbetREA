.class public final La/bwt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/edu;

.field public final b:La/rpt;

.field public final c:La/iqi;

.field public final d:La/xfu;


# direct methods
.method public constructor <init>(La/edu;La/rpt;La/iqi;La/xfu;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/bwt;->a:La/edu;

    .line 5
    .line 6
    iput-object p2, p0, La/bwt;->b:La/rpt;

    .line 7
    .line 8
    iput-object p3, p0, La/bwt;->c:La/iqi;

    .line 9
    .line 10
    iput-object p4, p0, La/bwt;->d:La/xfu;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, La/awt;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/awt;

    .line 7
    .line 8
    iget v1, v0, La/awt;->l:I

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
    iput v1, v0, La/awt;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/awt;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/awt;-><init>(La/bwt;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/awt;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/awt;->l:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    iget-object v0, v0, La/awt;->i:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v3

    .line 49
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, La/bwt;->b:La/rpt;

    .line 53
    .line 54
    iget-object p1, p1, La/rpt;->a:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, La/xr;

    .line 57
    .line 58
    invoke-virtual {p1}, La/xr;->i()La/rl40;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_5

    .line 67
    .line 68
    if-eq p1, v4, :cond_4

    .line 69
    .line 70
    const/4 p0, 0x2

    .line 71
    if-ne p1, p0, :cond_3

    .line 72
    .line 73
    return-object v3

    .line 74
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 75
    .line 76
    .line 77
    return-object v3

    .line 78
    :cond_4
    const-string p1, "10f491f14fd4a6d13ac039bb907f0a44"

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_5
    const-string p1, "fc04feb281830e4d648e07a68178fa28"

    .line 82
    .line 83
    :goto_1
    iput-object p1, v0, La/awt;->i:Ljava/lang/String;

    .line 84
    .line 85
    iput v4, v0, La/awt;->l:I

    .line 86
    .line 87
    iget-object v2, p0, La/bwt;->a:La/edu;

    .line 88
    .line 89
    const-string v3, ""

    .line 90
    .line 91
    invoke-virtual {v2, v3, v0}, La/edu;->i(Ljava/lang/String;La/zje;)Ljava/io/Serializable;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    if-ne v0, v1, :cond_6

    .line 96
    .line 97
    return-object v1

    .line 98
    :cond_6
    move-object v5, v0

    .line 99
    move-object v0, p1

    .line 100
    move-object p1, v5

    .line 101
    :goto_2
    check-cast p1, Ljava/lang/CharSequence;

    .line 102
    .line 103
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-nez v1, :cond_7

    .line 108
    .line 109
    iget-object p1, p0, La/bwt;->d:La/xfu;

    .line 110
    .line 111
    iget-object p1, p1, La/xfu;->a:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast p1, La/nvu;

    .line 114
    .line 115
    iget-object p1, p1, La/nvu;->d:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast p1, La/iw20;

    .line 118
    .line 119
    iget-object p1, p1, La/iw20;->a:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast p1, La/vwb0;

    .line 122
    .line 123
    const-string v1, "push_token"

    .line 124
    .line 125
    invoke-static {p1, v1}, La/vwb0;->d(La/vwb0;Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    :cond_7
    check-cast p1, Ljava/lang/String;

    .line 130
    .line 131
    new-instance v1, La/q6a;

    .line 132
    .line 133
    iget-object p0, p0, La/bwt;->c:La/iqi;

    .line 134
    .line 135
    invoke-virtual {p0}, La/iqi;->j()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-direct {v1, p1, v0, p0}, La/q6a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    return-object v1
.end method
