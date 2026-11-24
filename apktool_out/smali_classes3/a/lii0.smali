.class public final La/lii0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kii0;


# instance fields
.field public final a:La/gii0;

.field public final b:La/azj0;


# direct methods
.method public constructor <init>(La/gii0;La/azj0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/lii0;->a:La/gii0;

    .line 5
    .line 6
    iput-object p2, p0, La/lii0;->b:La/azj0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(La/sgy;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/lii0;->b:La/azj0;

    .line 5
    .line 6
    monitor-enter p0

    .line 7
    :try_start_0
    new-instance v0, Lokhttp3/OkHttpClient$Builder;

    .line 8
    .line 9
    invoke-direct {v0}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lokhttp3/OkHttpClient;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Lokhttp3/OkHttpClient;-><init>(Lokhttp3/OkHttpClient$Builder;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Lokhttp3/OkHttpClient;->b()Lokhttp3/OkHttpClient$Builder;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v1, p0, La/azj0;->a:La/eii0;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, La/eii0;->a(Lokhttp3/OkHttpClient$Builder;)V

    .line 24
    .line 25
    .line 26
    const-wide/16 v2, 0x1e

    .line 27
    .line 28
    invoke-virtual {v0, v2, v3}, Lokhttp3/OkHttpClient$Builder;->a(J)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2, v3}, Lokhttp3/OkHttpClient$Builder;->c(J)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v2, v3}, Lokhttp3/OkHttpClient$Builder;->b(J)V

    .line 35
    .line 36
    .line 37
    iget-object v1, v1, La/eii0;->a:La/zn00;

    .line 38
    .line 39
    invoke-virtual {v1}, La/zn00;->H0()La/e6d0;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-static {v0, v1}, La/eii0;->b(Lokhttp3/OkHttpClient$Builder;La/e6d0;)V

    .line 44
    .line 45
    .line 46
    new-instance v1, Lokhttp3/OkHttpClient;

    .line 47
    .line 48
    invoke-direct {v1, v0}, Lokhttp3/OkHttpClient;-><init>(Lokhttp3/OkHttpClient$Builder;)V

    .line 49
    .line 50
    .line 51
    const-string v0, "https://1xbet.com/"

    .line 52
    .line 53
    invoke-virtual {p0, p1, v1, v0}, La/azj0;->c(La/sgy;Lokhttp3/OkHttpClient;Ljava/lang/String;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    monitor-exit p0

    .line 58
    return-object p1

    .line 59
    :catchall_0
    move-exception p1

    .line 60
    monitor-exit p0

    .line 61
    throw p1
.end method
