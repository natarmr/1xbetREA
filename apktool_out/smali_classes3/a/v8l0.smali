.class public final La/v8l0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/q7d0;

.field public final b:La/vby;

.field public final c:Ljava/lang/String;

.field public final d:I

.field public final e:La/p7m0;

.field public final f:La/p7m0;


# direct methods
.method public constructor <init>(La/q7d0;La/vby;Ljava/lang/String;I)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/v8l0;->a:La/q7d0;

    .line 11
    .line 12
    iput-object p2, p0, La/v8l0;->b:La/vby;

    .line 13
    .line 14
    iput-object p3, p0, La/v8l0;->c:Ljava/lang/String;

    .line 15
    .line 16
    iput p4, p0, La/v8l0;->d:I

    .line 17
    .line 18
    sget-object v0, La/xun;->a:La/xun;

    .line 19
    .line 20
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, La/v8l0;->e:La/p7m0;

    .line 25
    .line 26
    :try_start_0
    const-string v0, ""

    .line 27
    .line 28
    invoke-virtual {p1}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1, p3, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    if-nez p3, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    new-instance p3, La/inv;

    .line 46
    .line 47
    sget-object v0, La/okx;->a:La/okx;

    .line 48
    .line 49
    new-instance v1, La/inv;

    .line 50
    .line 51
    sget-object v2, La/s710;->a:La/s710;

    .line 52
    .line 53
    sget-object v3, La/sm8;->a:La/sm8;

    .line 54
    .line 55
    const/4 v4, 0x1

    .line 56
    invoke-direct {v1, v2, v3, v4}, La/inv;-><init>(La/jiy;La/jiy;B)V

    .line 57
    .line 58
    .line 59
    invoke-direct {p3, v0, v1, v4}, La/inv;-><init>(La/jiy;La/jiy;B)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2, p3, p1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, Ljava/util/Map;

    .line 67
    .line 68
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    check-cast p1, Ljava/util/Map;

    .line 77
    .line 78
    if-nez p1, :cond_2

    .line 79
    .line 80
    sget-object p1, La/lun;->a:La/lun;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_1
    :goto_0
    sget-object p1, La/lun;->a:La/lun;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :catch_0
    sget-object p1, La/lun;->a:La/lun;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    :cond_2
    :goto_1
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    iput-object p1, p0, La/v8l0;->f:La/p7m0;

    .line 102
    .line 103
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/LinkedHashMap;)V
    .locals 10

    .line 1
    iget-object v0, p0, La/v8l0;->b:La/vby;

    .line 2
    .line 3
    iget-object v1, p0, La/v8l0;->c:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, La/v8l0;->a:La/q7d0;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    :try_start_0
    invoke-static {v2, v1}, La/q7d0;->c(La/q7d0;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v4

    .line 12
    if-eqz v4, :cond_1

    .line 13
    .line 14
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    if-nez v5, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    new-instance v5, La/inv;

    .line 25
    .line 26
    sget-object v6, La/okx;->a:La/okx;

    .line 27
    .line 28
    new-instance v7, La/inv;

    .line 29
    .line 30
    sget-object v8, La/s710;->a:La/s710;

    .line 31
    .line 32
    sget-object v9, La/sm8;->a:La/sm8;

    .line 33
    .line 34
    invoke-direct {v7, v8, v9, v3}, La/inv;-><init>(La/jiy;La/jiy;B)V

    .line 35
    .line 36
    .line 37
    invoke-direct {v5, v6, v7, v3}, La/inv;-><init>(La/jiy;La/jiy;B)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v5, v4}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    check-cast v4, Ljava/util/Map;

    .line 45
    .line 46
    invoke-static {v4}, La/xp20;->p(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    :goto_0
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 52
    .line 53
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :catch_0
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 58
    .line 59
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 60
    .line 61
    .line 62
    :goto_1
    iget p0, p0, La/v8l0;->d:I

    .line 63
    .line 64
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-interface {v4, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    new-instance p0, La/inv;

    .line 75
    .line 76
    sget-object p1, La/okx;->a:La/okx;

    .line 77
    .line 78
    new-instance v5, La/inv;

    .line 79
    .line 80
    sget-object v6, La/s710;->a:La/s710;

    .line 81
    .line 82
    sget-object v7, La/sm8;->a:La/sm8;

    .line 83
    .line 84
    invoke-direct {v5, v6, v7, v3}, La/inv;-><init>(La/jiy;La/jiy;B)V

    .line 85
    .line 86
    .line 87
    invoke-direct {p0, p1, v5, v3}, La/inv;-><init>(La/jiy;La/jiy;B)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, p0, v4}, La/vby;->d(La/jiy;Ljava/lang/Object;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-virtual {v2, v1, p0}, La/q7d0;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    return-void
.end method
