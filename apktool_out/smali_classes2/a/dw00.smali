.class public final La/dw00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Interceptor;


# static fields
.field public static final synthetic k:[La/iiy;

.field public static final l:Ljava/util/Map;


# instance fields
.field public final a:Z

.field public final b:Ljava/util/List;

.field public final c:La/gsj;

.field public final d:La/yvj;

.field public final e:La/n0o0;

.field public final f:La/n0o0;

.field public final g:La/n0o0;

.field public final h:La/n0o0;

.field public final i:Ljava/lang/ThreadLocal;

.field public final j:La/fuj0;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    const-class v3, La/dw00;

    .line 9
    .line 10
    const-string v4, "delegate"

    .line 11
    .line 12
    const-string v5, "getDelegate()Lokhttp3/logging/HttpLoggingInterceptor;"

    .line 13
    .line 14
    invoke-direct {v0, v3, v4, v5, v1}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 15
    .line 16
    .line 17
    sget-object v3, La/sre0;->a:La/tre0;

    .line 18
    .line 19
    invoke-virtual {v3, v0}, La/tre0;->g(La/i0d0;)La/giy;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v3, 0x1

    .line 24
    new-array v4, v3, [La/iiy;

    .line 25
    .line 26
    aput-object v0, v4, v1

    .line 27
    .line 28
    sput-object v4, La/dw00;->k:[La/iiy;

    .line 29
    .line 30
    sget-object v0, Lokhttp3/logging/HttpLoggingInterceptor$Level;->a:Lokhttp3/logging/HttpLoggingInterceptor$Level;

    .line 31
    .line 32
    new-instance v4, Lkotlin/Pair;

    .line 33
    .line 34
    invoke-direct {v4, v2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    new-instance v5, Lkotlin/Pair;

    .line 42
    .line 43
    invoke-direct {v5, v1, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    const/4 v1, 0x2

    .line 47
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    sget-object v3, Lokhttp3/logging/HttpLoggingInterceptor$Level;->b:Lokhttp3/logging/HttpLoggingInterceptor$Level;

    .line 52
    .line 53
    new-instance v6, Lkotlin/Pair;

    .line 54
    .line 55
    invoke-direct {v6, v1, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    const/4 v1, 0x3

    .line 59
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    sget-object v3, Lokhttp3/logging/HttpLoggingInterceptor$Level;->c:Lokhttp3/logging/HttpLoggingInterceptor$Level;

    .line 64
    .line 65
    new-instance v7, Lkotlin/Pair;

    .line 66
    .line 67
    invoke-direct {v7, v1, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    const/4 v1, 0x4

    .line 71
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    sget-object v3, Lokhttp3/logging/HttpLoggingInterceptor$Level;->d:Lokhttp3/logging/HttpLoggingInterceptor$Level;

    .line 76
    .line 77
    new-instance v8, Lkotlin/Pair;

    .line 78
    .line 79
    invoke-direct {v8, v1, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    new-instance v9, Lkotlin/Pair;

    .line 83
    .line 84
    invoke-direct {v9, v2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    filled-new-array/range {v4 .. v9}, [Lkotlin/Pair;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-static {v0}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    sput-object v0, La/dw00;->l:Ljava/util/Map;

    .line 96
    .line 97
    return-void
.end method

.method public constructor <init>(ZLa/gsj;La/yvj;)V
    .locals 8

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const-string v6, "exchange_tokens"

    .line 8
    .line 9
    const-string v7, "common_token"

    .line 10
    .line 11
    const-string v0, "access_token"

    .line 12
    .line 13
    const-string v1, "key"

    .line 14
    .line 15
    const-string v2, "client_secret"

    .line 16
    .line 17
    const-string v3, "webview_access_token"

    .line 18
    .line 19
    const-string v4, "webview_refresh_token"

    .line 20
    .line 21
    const-string v5, "exchange_token"

    .line 22
    .line 23
    filled-new-array/range {v0 .. v7}, [Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-boolean p1, p0, La/dw00;->a:Z

    .line 38
    .line 39
    iput-object v0, p0, La/dw00;->b:Ljava/util/List;

    .line 40
    .line 41
    iput-object p2, p0, La/dw00;->c:La/gsj;

    .line 42
    .line 43
    iput-object p3, p0, La/dw00;->d:La/yvj;

    .line 44
    .line 45
    new-instance p1, La/sz2;

    .line 46
    .line 47
    const/16 p2, 0x10

    .line 48
    .line 49
    invoke-direct {p1, p0, p2}, La/sz2;-><init>(Ljava/lang/Object;B)V

    .line 50
    .line 51
    .line 52
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iput-object p1, p0, La/dw00;->e:La/n0o0;

    .line 57
    .line 58
    sget-object p1, La/w7f;->l:La/w7f;

    .line 59
    .line 60
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iput-object p1, p0, La/dw00;->f:La/n0o0;

    .line 65
    .line 66
    sget-object p1, La/w7f;->m:La/w7f;

    .line 67
    .line 68
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iput-object p1, p0, La/dw00;->g:La/n0o0;

    .line 73
    .line 74
    sget-object p1, La/w7f;->n:La/w7f;

    .line 75
    .line 76
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iput-object p1, p0, La/dw00;->h:La/n0o0;

    .line 81
    .line 82
    new-instance p1, Ljava/lang/ThreadLocal;

    .line 83
    .line 84
    invoke-direct {p1}, Ljava/lang/ThreadLocal;-><init>()V

    .line 85
    .line 86
    .line 87
    iput-object p1, p0, La/dw00;->i:Ljava/lang/ThreadLocal;

    .line 88
    .line 89
    new-instance p1, La/cw00;

    .line 90
    .line 91
    invoke-direct {p1, p0}, La/cw00;-><init>(La/dw00;)V

    .line 92
    .line 93
    .line 94
    new-instance p2, La/fuj0;

    .line 95
    .line 96
    invoke-direct {p2, p1}, La/fuj0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 97
    .line 98
    .line 99
    iput-object p2, p0, La/dw00;->j:La/fuj0;

    .line 100
    .line 101
    return-void
.end method


# virtual methods
.method public final a(Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/Response;
    .locals 11

    .line 1
    sget-object v0, La/dw00;->l:Ljava/util/Map;

    .line 2
    .line 3
    iget-object v1, p1, Lokhttp3/internal/http/RealInterceptorChain;->e:Lokhttp3/Request;

    .line 4
    .line 5
    iget-object v2, v1, Lokhttp3/Request;->d:Lokhttp3/RequestBody;

    .line 6
    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v2}, Lokhttp3/RequestBody;->a()J

    .line 12
    .line 13
    .line 14
    move-result-wide v5

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-wide v5, v3

    .line 17
    :goto_0
    const-class v2, La/lv00;

    .line 18
    .line 19
    sget-object v7, La/sre0;->a:La/tre0;

    .line 20
    .line 21
    invoke-virtual {v7, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v1, v2}, Lokhttp3/Request;->b(La/sgy;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-nez v1, :cond_3

    .line 30
    .line 31
    iget-object v1, p0, La/dw00;->c:La/gsj;

    .line 32
    .line 33
    iget-object v1, v1, La/gsj;->a:La/n0o0;

    .line 34
    .line 35
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, La/vv00;

    .line 40
    .line 41
    iget-object v2, p0, La/dw00;->j:La/fuj0;

    .line 42
    .line 43
    sget-object v7, La/dw00;->k:[La/iiy;

    .line 44
    .line 45
    const/4 v8, 0x0

    .line 46
    aget-object v9, v7, v8

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    iget-object v2, v2, La/fuj0;->b:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v2, La/kvb0;

    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    check-cast v2, Lokhttp3/logging/HttpLoggingInterceptor;

    .line 66
    .line 67
    const-wide/16 v9, 0x1000

    .line 68
    .line 69
    cmp-long v9, v5, v9

    .line 70
    .line 71
    if-gtz v9, :cond_2

    .line 72
    .line 73
    cmp-long v3, v5, v3

    .line 74
    .line 75
    if-gtz v3, :cond_1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    iget-byte v1, v1, La/vv00;->a:B

    .line 79
    .line 80
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, Lokhttp3/logging/HttpLoggingInterceptor$Level;

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_2
    :goto_1
    const/4 v3, 0x2

    .line 92
    iget-byte v1, v1, La/vv00;->a:B

    .line 93
    .line 94
    invoke-static {v3, v1}, Ljava/lang/Math;->min(II)I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, Lokhttp3/logging/HttpLoggingInterceptor$Level;

    .line 107
    .line 108
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    iput-object v0, v2, Lokhttp3/logging/HttpLoggingInterceptor;->d:Lokhttp3/logging/HttpLoggingInterceptor$Level;

    .line 112
    .line 113
    iget-object v0, p0, La/dw00;->i:Ljava/lang/ThreadLocal;

    .line 114
    .line 115
    iget-object v1, p0, La/dw00;->d:La/yvj;

    .line 116
    .line 117
    iget-object v1, v1, La/yvj;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    iget-object p0, p0, La/dw00;->j:La/fuj0;

    .line 131
    .line 132
    aget-object v0, v7, v8

    .line 133
    .line 134
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    iget-object p0, p0, La/fuj0;->b:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast p0, La/kvb0;

    .line 143
    .line 144
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    check-cast p0, Lokhttp3/logging/HttpLoggingInterceptor;

    .line 152
    .line 153
    invoke-virtual {p0, p1}, Lokhttp3/logging/HttpLoggingInterceptor;->a(Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/Response;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    return-object p0

    .line 158
    :cond_3
    invoke-static {}, La/hny;->b()V

    .line 159
    .line 160
    .line 161
    const/4 p0, 0x0

    .line 162
    return-object p0
.end method
