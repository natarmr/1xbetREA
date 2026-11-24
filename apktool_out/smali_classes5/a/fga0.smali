.class public final La/fga0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/jw20;

.field public final b:La/knf0;

.field public final c:La/mne;

.field public final d:La/rfa0;


# direct methods
.method public constructor <init>(La/jw20;La/knf0;La/mne;La/rfa0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/fga0;->a:La/jw20;

    .line 11
    .line 12
    iput-object p2, p0, La/fga0;->b:La/knf0;

    .line 13
    .line 14
    iput-object p3, p0, La/fga0;->c:La/mne;

    .line 15
    .line 16
    iput-object p4, p0, La/fga0;->d:La/rfa0;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(JLa/zje;Z)Ljava/io/Serializable;
    .locals 10

    .line 1
    instance-of v0, p3, La/dga0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/dga0;

    .line 7
    .line 8
    iget v1, v0, La/dga0;->k:I

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
    iput v1, v0, La/dga0;->k:I

    .line 18
    .line 19
    :goto_0
    move-object v8, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/dga0;

    .line 22
    .line 23
    invoke-direct {v0, p0, p3}, La/dga0;-><init>(La/fga0;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p3, v8, La/dga0;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v8, La/dga0;->k:I

    .line 32
    .line 33
    const/4 v9, 0x0

    .line 34
    const/4 v2, 0x1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    if-ne v1, v2, :cond_1

    .line 38
    .line 39
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v9

    .line 49
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    if-eqz p4, :cond_3

    .line 53
    .line 54
    const-string p3, "FeedLive"

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_3
    const-string p3, "FeedLine"

    .line 58
    .line 59
    :goto_2
    iget-object p4, p0, La/fga0;->b:La/knf0;

    .line 60
    .line 61
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p4}, La/knf0;->c()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    iput v2, v8, La/dga0;->k:I

    .line 69
    .line 70
    iget-object p0, p0, La/fga0;->a:La/jw20;

    .line 71
    .line 72
    iget-object p0, p0, La/jw20;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p0, La/tpv;

    .line 75
    .line 76
    invoke-virtual {p0}, La/tpv;->invoke()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    move-object v1, p0

    .line 81
    check-cast v1, La/kfa0;

    .line 82
    .line 83
    const/4 v6, 0x1

    .line 84
    const/16 v7, 0x16

    .line 85
    .line 86
    move-wide v3, p1

    .line 87
    move-object v2, p3

    .line 88
    invoke-interface/range {v1 .. v8}, La/kfa0;->a(Ljava/lang/String;JLjava/lang/String;IILa/yje;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p3

    .line 92
    if-ne p3, v0, :cond_4

    .line 93
    .line 94
    return-object v0

    .line 95
    :cond_4
    :goto_3
    check-cast p3, La/dx5;

    .line 96
    .line 97
    invoke-virtual {p3}, La/dx5;->a()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    check-cast p0, Ljava/lang/Iterable;

    .line 102
    .line 103
    new-instance p1, Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    :cond_5
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    if-eqz p2, :cond_9

    .line 117
    .line 118
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    check-cast p2, La/bv10;

    .line 123
    .line 124
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    iget-object p3, p2, La/bv10;->a:Ljava/lang/Long;

    .line 128
    .line 129
    if-eqz p3, :cond_8

    .line 130
    .line 131
    iget-object p4, p2, La/bv10;->c:Ljava/lang/String;

    .line 132
    .line 133
    if-eqz p4, :cond_8

    .line 134
    .line 135
    invoke-static {p4}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 136
    .line 137
    .line 138
    move-result p4

    .line 139
    if-eqz p4, :cond_6

    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_6
    new-instance v0, La/tdn;

    .line 143
    .line 144
    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    .line 145
    .line 146
    .line 147
    move-result-wide v1

    .line 148
    iget-object p3, p2, La/bv10;->b:Ljava/lang/String;

    .line 149
    .line 150
    if-nez p3, :cond_7

    .line 151
    .line 152
    const-string p3, ""

    .line 153
    .line 154
    :cond_7
    move-object v4, p3

    .line 155
    iget-object v5, p2, La/bv10;->c:Ljava/lang/String;

    .line 156
    .line 157
    iget-object v3, p2, La/bv10;->d:Ljava/lang/Integer;

    .line 158
    .line 159
    invoke-direct/range {v0 .. v5}, La/tdn;-><init>(JLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    goto :goto_6

    .line 163
    :cond_8
    :goto_5
    move-object v0, v9

    .line 164
    :goto_6
    if-eqz v0, :cond_5

    .line 165
    .line 166
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_9
    return-object p1
.end method
