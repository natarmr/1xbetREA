.class public final La/sq1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jiy;


# static fields
.field public static final a:La/sq1;

.field public static final b:La/wgi0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/sq1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/sq1;->a:La/sq1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    new-array v0, v0, [La/ugi0;

    .line 10
    .line 11
    const-string v1, "AggregatorSpecialBannerNavigationData"

    .line 12
    .line 13
    invoke-static {v1, v0}, La/x2x;->F(Ljava/lang/String;[La/ugi0;)La/wgi0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, La/sq1;->b:La/wgi0;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, La/icy;

    .line 2
    .line 3
    invoke-interface {p1}, La/icy;->g()La/mcy;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    instance-of v0, p0, La/bdy;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_6

    .line 13
    .line 14
    :cond_0
    instance-of v0, p0, La/edy;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    move-object v0, p0

    .line 19
    check-cast v0, La/edy;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    move-object v0, v1

    .line 23
    :goto_0
    if-eqz v0, :cond_4

    .line 24
    .line 25
    const-string v2, "type"

    .line 26
    .line 27
    invoke-virtual {v0, v2}, La/edy;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, La/mcy;

    .line 32
    .line 33
    if-eqz v0, :cond_4

    .line 34
    .line 35
    instance-of v2, v0, La/jdy;

    .line 36
    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    check-cast v0, La/jdy;

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move-object v0, v1

    .line 43
    :goto_1
    if-eqz v0, :cond_4

    .line 44
    .line 45
    sget-object v2, La/ncy;->a:La/scx;

    .line 46
    .line 47
    instance-of v2, v0, La/bdy;

    .line 48
    .line 49
    if-eqz v2, :cond_3

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_3
    invoke-virtual {v0}, La/jdy;->b()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    goto :goto_3

    .line 57
    :cond_4
    :goto_2
    move-object v0, v1

    .line 58
    :goto_3
    if-eqz v0, :cond_8

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    sparse-switch v2, :sswitch_data_0

    .line 65
    .line 66
    .line 67
    goto :goto_4

    .line 68
    :sswitch_0
    const-string v2, "Category"

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_5

    .line 75
    .line 76
    goto :goto_4

    .line 77
    :cond_5
    sget-object v0, La/jq1;->Companion:La/iq1;

    .line 78
    .line 79
    invoke-virtual {v0}, La/iq1;->serializer()La/jiy;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    goto :goto_5

    .line 84
    :sswitch_1
    const-string v2, "Brand"

    .line 85
    .line 86
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_6

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_6
    sget-object v0, La/gq1;->Companion:La/fq1;

    .line 94
    .line 95
    invoke-virtual {v0}, La/fq1;->serializer()La/jiy;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    goto :goto_5

    .line 100
    :sswitch_2
    const-string v2, "Href"

    .line 101
    .line 102
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_8

    .line 107
    .line 108
    sget-object v0, La/qq1;->Companion:La/pq1;

    .line 109
    .line 110
    invoke-virtual {v0}, La/pq1;->serializer()La/jiy;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    goto :goto_5

    .line 115
    :sswitch_3
    const-string v2, "Game"

    .line 116
    .line 117
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-nez v0, :cond_7

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_7
    sget-object v0, La/nq1;->Companion:La/mq1;

    .line 125
    .line 126
    invoke-virtual {v0}, La/mq1;->serializer()La/jiy;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    goto :goto_5

    .line 131
    :cond_8
    :goto_4
    move-object v0, v1

    .line 132
    :goto_5
    if-eqz v0, :cond_9

    .line 133
    .line 134
    invoke-interface {p1}, La/icy;->d()La/vby;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    check-cast v0, La/jiy;

    .line 139
    .line 140
    invoke-virtual {p1, v0, p0}, La/vby;->a(La/jiy;La/mcy;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    check-cast p0, La/rq1;

    .line 145
    .line 146
    return-object p0

    .line 147
    :cond_9
    :goto_6
    return-object v1

    .line 148
    nop

    .line 149
    :sswitch_data_0
    .sparse-switch
        0x21c012 -> :sswitch_3
        0x22734b -> :sswitch_2
        0x3d75b67 -> :sswitch_1
        0x6dd211e -> :sswitch_0
    .end sparse-switch
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/sq1;->b:La/wgi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, La/rq1;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    invoke-interface {p1}, La/bwn;->q()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    instance-of p0, p2, La/qq1;

    .line 10
    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    sget-object p0, La/qq1;->Companion:La/pq1;

    .line 14
    .line 15
    invoke-virtual {p0}, La/pq1;->serializer()La/jiy;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, La/jiy;

    .line 20
    .line 21
    invoke-interface {p1, p0, p2}, La/bwn;->C(La/jiy;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    instance-of p0, p2, La/gq1;

    .line 26
    .line 27
    if-eqz p0, :cond_2

    .line 28
    .line 29
    sget-object p0, La/gq1;->Companion:La/fq1;

    .line 30
    .line 31
    invoke-virtual {p0}, La/fq1;->serializer()La/jiy;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, La/jiy;

    .line 36
    .line 37
    invoke-interface {p1, p0, p2}, La/bwn;->C(La/jiy;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    instance-of p0, p2, La/jq1;

    .line 42
    .line 43
    if-eqz p0, :cond_3

    .line 44
    .line 45
    sget-object p0, La/jq1;->Companion:La/iq1;

    .line 46
    .line 47
    invoke-virtual {p0}, La/iq1;->serializer()La/jiy;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/jiy;

    .line 52
    .line 53
    invoke-interface {p1, p0, p2}, La/bwn;->C(La/jiy;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_3
    instance-of p0, p2, La/nq1;

    .line 58
    .line 59
    if-eqz p0, :cond_4

    .line 60
    .line 61
    sget-object p0, La/nq1;->Companion:La/mq1;

    .line 62
    .line 63
    invoke-virtual {p0}, La/mq1;->serializer()La/jiy;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    check-cast p0, La/jiy;

    .line 68
    .line 69
    invoke-interface {p1, p0, p2}, La/bwn;->C(La/jiy;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 74
    .line 75
    .line 76
    return-void
.end method
