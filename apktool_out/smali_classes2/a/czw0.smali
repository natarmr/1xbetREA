.class public abstract La/czw0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, La/qgx0;->a:I

    .line 2
    .line 3
    :try_start_0
    invoke-static {}, La/czw0;->a()V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception v0

    .line 8
    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    throw v1
.end method

.method public static a()V
    .locals 5

    .line 1
    sget-object v0, La/n6x0;->b:La/n6x0;

    .line 2
    .line 3
    sget-object v1, La/rqw0;->d:La/rqw0;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, La/n6x0;->b(La/rqw0;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, La/rqw0;->e:La/h7x0;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, La/n6x0;->c(La/h7x0;)V

    .line 11
    .line 12
    .line 13
    invoke-static {}, La/pyw0;->a()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    sget-object v1, La/yyw0;->a:La/h7x0;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-static {v1}, La/esw0;->d(I)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    sget-object v2, La/hzw0;->a:La/y6x0;

    .line 30
    .line 31
    sget-object v2, La/k6x0;->b:La/k6x0;

    .line 32
    .line 33
    sget-object v3, La/hzw0;->a:La/y6x0;

    .line 34
    .line 35
    invoke-virtual {v2, v3}, La/k6x0;->f(La/y6x0;)V

    .line 36
    .line 37
    .line 38
    sget-object v3, La/hzw0;->b:La/u6x0;

    .line 39
    .line 40
    invoke-virtual {v2, v3}, La/k6x0;->e(La/u6x0;)V

    .line 41
    .line 42
    .line 43
    sget-object v3, La/hzw0;->c:La/j5x0;

    .line 44
    .line 45
    invoke-virtual {v2, v3}, La/k6x0;->d(La/j5x0;)V

    .line 46
    .line 47
    .line 48
    sget-object v3, La/hzw0;->d:La/e5x0;

    .line 49
    .line 50
    invoke-virtual {v2, v3}, La/k6x0;->c(La/e5x0;)V

    .line 51
    .line 52
    .line 53
    sget-object v2, La/yyw0;->a:La/h7x0;

    .line 54
    .line 55
    invoke-virtual {v0, v2}, La/n6x0;->c(La/h7x0;)V

    .line 56
    .line 57
    .line 58
    sget-object v0, La/i6x0;->b:La/i6x0;

    .line 59
    .line 60
    new-instance v2, Ljava/util/HashMap;

    .line 61
    .line 62
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string v3, "AES256_SIV"

    .line 66
    .line 67
    sget-object v4, La/fzw0;->a:La/zyw0;

    .line 68
    .line 69
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    invoke-static {}, La/zyw0;->b()La/hcp0;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    const/16 v4, 0x40

    .line 77
    .line 78
    invoke-virtual {v3, v4}, La/hcp0;->y(I)V

    .line 79
    .line 80
    .line 81
    sget-object v4, La/drq;->j:La/drq;

    .line 82
    .line 83
    iput-object v4, v3, La/hcp0;->c:Ljava/lang/Object;

    .line 84
    .line 85
    invoke-virtual {v3}, La/hcp0;->x()La/zyw0;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    const-string v4, "AES256_SIV_RAW"

    .line 90
    .line 91
    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v0, v2}, La/i6x0;->b(Ljava/util/Map;)V

    .line 99
    .line 100
    .line 101
    sget-object v0, La/e6x0;->b:La/e6x0;

    .line 102
    .line 103
    sget-object v2, La/yyw0;->c:La/zqw0;

    .line 104
    .line 105
    const-class v3, La/zyw0;

    .line 106
    .line 107
    invoke-virtual {v0, v2, v3}, La/e6x0;->a(La/zqw0;Ljava/lang/Class;)V

    .line 108
    .line 109
    .line 110
    sget-object v0, La/b6x0;->b:La/b6x0;

    .line 111
    .line 112
    sget-object v2, La/yyw0;->d:La/yqw0;

    .line 113
    .line 114
    invoke-virtual {v0, v2, v3}, La/b6x0;->a(La/yqw0;Ljava/lang/Class;)V

    .line 115
    .line 116
    .line 117
    sget-object v0, La/a5x0;->d:La/a5x0;

    .line 118
    .line 119
    sget-object v2, La/yyw0;->b:La/l5x0;

    .line 120
    .line 121
    invoke-virtual {v0, v2, v1}, La/a5x0;->c(La/l5x0;Z)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :cond_1
    const-string v0, "Registering AES SIV is not supported in FIPS mode"

    .line 126
    .line 127
    invoke-static {v0}, La/hny;->o(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    return-void
.end method
