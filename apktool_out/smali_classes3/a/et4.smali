.class public final La/et4;
.super Lokhttp3/WebSocketListener;
.source "SourceFile"


# instance fields
.field public final synthetic a:La/ft4;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:La/ckk0;

.field public final synthetic d:La/hzb0;


# direct methods
.method public constructor <init>(La/ft4;Ljava/lang/String;La/ckk0;La/hzb0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/et4;->a:La/ft4;

    .line 5
    .line 6
    iput-object p2, p0, La/et4;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, La/et4;->c:La/ckk0;

    .line 9
    .line 10
    iput-object p4, p0, La/et4;->d:La/hzb0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b(Lokhttp3/internal/ws/RealWebSocket;ILjava/lang/String;)V
    .locals 2

    .line 1
    sget-object p3, La/lu4;->d:La/c0o;

    .line 2
    .line 3
    invoke-static {p3, p3}, La/ohs0;->h(La/c0o;La/c0o;)La/y2;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    :cond_0
    invoke-virtual {p3}, La/y2;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p3}, La/y2;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    move-object v1, v0

    .line 18
    check-cast v1, La/lu4;

    .line 19
    .line 20
    iget-short v1, v1, La/lu4;->a:S

    .line 21
    .line 22
    if-ne v1, p2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    :goto_0
    check-cast v0, La/lu4;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    new-instance p2, La/mu4;

    .line 31
    .line 32
    invoke-direct {p2, v0}, La/mu4;-><init>(La/lu4;)V

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, La/et4;->d:La/hzb0;

    .line 36
    .line 37
    invoke-static {p0, p2}, La/dub;->w0(La/jbi0;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    :cond_2
    const/16 p0, 0x3e8

    .line 41
    .line 42
    const-string p2, "Disconnected"

    .line 43
    .line 44
    invoke-virtual {p1, p0, p2}, Lokhttp3/internal/ws/RealWebSocket;->f(ILjava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final c(Lokhttp3/WebSocket;Ljava/lang/Throwable;Lokhttp3/Response;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/et4;->d:La/hzb0;

    .line 2
    .line 3
    invoke-virtual {p0, p2}, La/hzb0;->e0(Ljava/lang/Throwable;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d(Lokhttp3/internal/ws/RealWebSocket;Ljava/lang/String;)V
    .locals 6

    .line 1
    iget-object p1, p0, La/et4;->a:La/ft4;

    .line 2
    .line 3
    iget-object v0, p1, La/ft4;->a:La/vby;

    .line 4
    .line 5
    iget-object v1, p1, La/ft4;->c:La/at4;

    .line 6
    .line 7
    sget-object v2, La/ikk0;->Companion:La/ekk0;

    .line 8
    .line 9
    invoke-virtual {v2}, La/ekk0;->serializer()La/jiy;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, La/jiy;

    .line 14
    .line 15
    invoke-virtual {v0, v2, p2}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    check-cast p2, La/ikk0;

    .line 20
    .line 21
    iget-object v0, p2, La/ikk0;->d:La/hkk0;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v2, v0, La/hkk0;->a:Ljava/lang/String;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-lez v3, :cond_0

    .line 34
    .line 35
    iput-object v2, v1, La/at4;->e:Ljava/lang/String;

    .line 36
    .line 37
    :cond_0
    if-eqz v0, :cond_1

    .line 38
    .line 39
    iget-object v2, v0, La/hkk0;->g:Ljava/lang/String;

    .line 40
    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    iput-object v2, v1, La/at4;->b:Ljava/lang/String;

    .line 44
    .line 45
    :cond_1
    if-eqz v0, :cond_3

    .line 46
    .line 47
    iget-object v2, v0, La/hkk0;->h:Ljava/lang/Long;

    .line 48
    .line 49
    if-eqz v2, :cond_3

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 52
    .line 53
    .line 54
    move-result-wide v2

    .line 55
    iget-object p1, p1, La/ft4;->f:La/rp4;

    .line 56
    .line 57
    const-wide/16 v4, 0x3e8

    .line 58
    .line 59
    mul-long/2addr v2, v4

    .line 60
    iget-object p1, p1, La/rp4;->a:La/p7m0;

    .line 61
    .line 62
    :cond_2
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    move-object v5, v4

    .line 67
    check-cast v5, Ljava/lang/Number;

    .line 68
    .line 69
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 70
    .line 71
    .line 72
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-virtual {p1, v4, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-eqz v4, :cond_2

    .line 81
    .line 82
    :cond_3
    if-eqz v0, :cond_4

    .line 83
    .line 84
    iget-object p1, v0, La/hkk0;->a:Ljava/lang/String;

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_4
    const/4 p1, 0x0

    .line 88
    :goto_0
    const-string v0, ""

    .line 89
    .line 90
    if-nez p1, :cond_5

    .line 91
    .line 92
    move-object p1, v0

    .line 93
    :cond_5
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-lez p1, :cond_7

    .line 98
    .line 99
    iget-object p1, p2, La/ikk0;->a:Ljava/lang/String;

    .line 100
    .line 101
    if-nez p1, :cond_6

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_6
    move-object v0, p1

    .line 105
    :goto_1
    iput-object v0, v1, La/at4;->d:Ljava/lang/String;

    .line 106
    .line 107
    :cond_7
    iget-object p0, p0, La/et4;->d:La/hzb0;

    .line 108
    .line 109
    invoke-static {p0, p2}, La/dub;->w0(La/jbi0;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method public final e(Lokhttp3/WebSocket;Lokhttp3/Response;)V
    .locals 11

    .line 1
    iget-object p2, p0, La/et4;->a:La/ft4;

    .line 2
    .line 3
    iget-object v0, p2, La/ft4;->c:La/at4;

    .line 4
    .line 5
    iget-object v1, p2, La/ft4;->c:La/at4;

    .line 6
    .line 7
    iget-object v2, v0, La/at4;->b:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const/4 v4, 0x0

    .line 14
    if-nez v3, :cond_0

    .line 15
    .line 16
    move-object v9, v4

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v9, v2

    .line 19
    :goto_0
    iget-object v2, p2, La/ft4;->a:La/vby;

    .line 20
    .line 21
    iget-object v3, p2, La/ft4;->d:La/knf0;

    .line 22
    .line 23
    if-eqz v9, :cond_1

    .line 24
    .line 25
    iget-object v4, v0, La/at4;->d:Ljava/lang/String;

    .line 26
    .line 27
    :cond_1
    move-object v10, v4

    .line 28
    iget-object v4, p0, La/et4;->b:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-nez v5, :cond_2

    .line 35
    .line 36
    new-instance v4, La/tjk0;

    .line 37
    .line 38
    invoke-virtual {v3}, La/knf0;->a()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-static {}, La/tgk;->i()V

    .line 43
    .line 44
    .line 45
    sget-object v6, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v3}, La/knf0;->c()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-direct {v4, v5, v3, v9, v10}, La/tjk0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    new-instance v3, La/ujk0;

    .line 55
    .line 56
    iget-object v0, v0, La/at4;->a:La/swp0;

    .line 57
    .line 58
    iget-object v0, v0, La/swp0;->a:Ljava/lang/String;

    .line 59
    .line 60
    sget-object v5, La/bkk0;->a:[La/bkk0;

    .line 61
    .line 62
    invoke-direct {v3, v0, v4}, La/ujk0;-><init>(Ljava/lang/String;La/tjk0;)V

    .line 63
    .line 64
    .line 65
    sget-object v0, La/ujk0;->Companion:La/qjk0;

    .line 66
    .line 67
    invoke-virtual {v0}, La/qjk0;->serializer()La/jiy;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, La/jiy;

    .line 72
    .line 73
    invoke-virtual {v2, v0, v3}, La/vby;->d(La/jiy;Ljava/lang/Object;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    goto :goto_1

    .line 78
    :cond_2
    new-instance v5, La/zjk0;

    .line 79
    .line 80
    invoke-virtual {v3}, La/knf0;->a()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    invoke-static {}, La/tgk;->i()V

    .line 85
    .line 86
    .line 87
    sget-object v7, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {v3}, La/knf0;->c()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    const/4 v3, 0x7

    .line 94
    invoke-virtual {v4, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    invoke-direct/range {v5 .. v10}, La/zjk0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    new-instance v3, La/akk0;

    .line 102
    .line 103
    iget-object v0, v0, La/at4;->a:La/swp0;

    .line 104
    .line 105
    iget-object v0, v0, La/swp0;->a:Ljava/lang/String;

    .line 106
    .line 107
    sget-object v4, La/bkk0;->a:[La/bkk0;

    .line 108
    .line 109
    invoke-direct {v3, v0, v5}, La/akk0;-><init>(Ljava/lang/String;La/zjk0;)V

    .line 110
    .line 111
    .line 112
    sget-object v0, La/akk0;->Companion:La/wjk0;

    .line 113
    .line 114
    invoke-virtual {v0}, La/wjk0;->serializer()La/jiy;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    check-cast v0, La/jiy;

    .line 119
    .line 120
    invoke-virtual {v2, v0, v3}, La/vby;->d(La/jiy;Ljava/lang/Object;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    :goto_1
    invoke-interface {p1, v0}, Lokhttp3/WebSocket;->a(Ljava/lang/String;)Z

    .line 125
    .line 126
    .line 127
    iget-object v0, v1, La/at4;->b:Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-nez v0, :cond_3

    .line 134
    .line 135
    iget-object p0, p0, La/et4;->c:La/ckk0;

    .line 136
    .line 137
    invoke-virtual {p2, p1, p0}, La/ft4;->b(Lokhttp3/WebSocket;La/ckk0;)V

    .line 138
    .line 139
    .line 140
    const/4 p0, 0x1

    .line 141
    iput-boolean p0, v1, La/at4;->c:Z

    .line 142
    .line 143
    :cond_3
    return-void
.end method
