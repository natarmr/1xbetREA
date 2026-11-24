.class public final La/raw0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final c:La/zz2;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:La/com0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/zz2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v1, v1, [Ljava/lang/String;

    .line 5
    .line 6
    const-string v2, "RevokeAccessOperation"

    .line 7
    .line 8
    invoke-direct {v0, v2, v1}, La/zz2;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, La/raw0;->c:La/zz2;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, La/s0x;->E(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/raw0;->a:Ljava/lang/String;

    .line 8
    .line 9
    new-instance p1, La/com0;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p1, v0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;-><init>(La/j9w0;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, La/raw0;->b:La/com0;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    const-string v0, "https://accounts.google.com/o/oauth2/revoke?token="

    .line 2
    .line 3
    sget-object v1, La/raw0;->c:La/zz2;

    .line 4
    .line 5
    const-string v2, "Response Code: "

    .line 6
    .line 7
    sget-object v3, Lcom/google/android/gms/common/api/Status;->g:Lcom/google/android/gms/common/api/Status;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    :try_start_0
    new-instance v5, Ljava/net/URL;

    .line 11
    .line 12
    iget-object v6, p0, La/raw0;->a:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v0, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-direct {v5, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v5}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/net/HttpURLConnection;

    .line 26
    .line 27
    const-string v5, "Content-Type"

    .line 28
    .line 29
    const-string v6, "application/x-www-form-urlencoded"

    .line 30
    .line 31
    invoke-virtual {v0, v5, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const/16 v5, 0xc8

    .line 39
    .line 40
    if-ne v0, v5, :cond_0

    .line 41
    .line 42
    sget-object v3, Lcom/google/android/gms/common/api/Status;->e:Lcom/google/android/gms/common/api/Status;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const-string v5, "Unable to revoke access!"

    .line 46
    .line 47
    new-array v6, v4, [Ljava/lang/Object;

    .line 48
    .line 49
    invoke-virtual {v1, v5, v6}, La/zz2;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :goto_0
    new-instance v5, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    new-array v2, v4, [Ljava/lang/Object;

    .line 65
    .line 66
    iget v5, v1, La/zz2;->a:I

    .line 67
    .line 68
    const/4 v6, 0x3

    .line 69
    if-gt v5, v6, :cond_1

    .line 70
    .line 71
    iget-object v5, v1, La/zz2;->b:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v5, Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v1, v0, v2}, La/zz2;->p(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v5, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    .line 81
    .line 82
    goto :goto_3

    .line 83
    :catch_0
    move-exception v0

    .line 84
    goto :goto_1

    .line 85
    :catch_1
    move-exception v0

    .line 86
    goto :goto_2

    .line 87
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    new-array v2, v4, [Ljava/lang/Object;

    .line 96
    .line 97
    const-string v4, "Exception when revoking access: "

    .line 98
    .line 99
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {v1, v0, v2}, La/zz2;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    goto :goto_3

    .line 107
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    new-array v2, v4, [Ljava/lang/Object;

    .line 116
    .line 117
    const-string v4, "IOException when revoking access: "

    .line 118
    .line 119
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-virtual {v1, v0, v2}, La/zz2;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :cond_1
    :goto_3
    iget-object p0, p0, La/raw0;->b:La/com0;

    .line 127
    .line 128
    invoke-virtual {p0, v3}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->e(La/m0g0;)V

    .line 129
    .line 130
    .line 131
    return-void
.end method
