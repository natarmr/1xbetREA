.class public final Lokhttp3/tls/internal/der/Adapters$BIT_STRING$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/tls/internal/der/BasicDerAdapter$Codec;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/tls/internal/der/Adapters;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lokhttp3/tls/internal/der/BasicDerAdapter$Codec<",
        "Lokhttp3/tls/internal/der/BitString;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "okhttp3/tls/internal/der/Adapters$BIT_STRING$1",
        "Lokhttp3/tls/internal/der/BasicDerAdapter$Codec;",
        "Lokhttp3/tls/internal/der/BitString;",
        "okhttp-tls"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public final a(Lokhttp3/tls/internal/der/DerReader;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p1, Lokhttp3/tls/internal/der/DerReader;->b:La/zae0;

    .line 5
    .line 6
    invoke-virtual {p1}, Lokhttp3/tls/internal/der/DerReader;->b()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    const-wide/16 v2, -0x1

    .line 11
    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-boolean v0, p1, Lokhttp3/tls/internal/der/DerReader;->f:Z

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1}, Lokhttp3/tls/internal/der/DerReader;->b()J

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    const-wide/16 v4, 0x1

    .line 26
    .line 27
    cmp-long v0, v2, v4

    .line 28
    .line 29
    if-ltz v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0}, La/zae0;->readByte()B

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    and-int/lit16 v0, v0, 0xff

    .line 36
    .line 37
    invoke-virtual {p1}, Lokhttp3/tls/internal/der/DerReader;->b()J

    .line 38
    .line 39
    .line 40
    move-result-wide v1

    .line 41
    invoke-virtual {p0, v1, v2}, La/zae0;->q0(J)La/qg9;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    new-instance p1, Lokhttp3/tls/internal/der/BitString;

    .line 46
    .line 47
    invoke-direct {p1, v0, p0}, Lokhttp3/tls/internal/der/BitString;-><init>(ILa/qg9;)V

    .line 48
    .line 49
    .line 50
    return-object p1

    .line 51
    :cond_0
    const-string p0, "malformed bit string"

    .line 52
    .line 53
    invoke-static {p0}, La/e9d0;->j(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v1

    .line 57
    :cond_1
    const-string p0, "constructed bit strings not supported for DER"

    .line 58
    .line 59
    invoke-static {p0}, La/e9d0;->j(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object v1
.end method

.method public final b(Lokhttp3/tls/internal/der/DerWriter;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lokhttp3/tls/internal/der/BitString;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lokhttp3/tls/internal/der/DerWriter;->a()La/t99;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    iget p1, p2, Lokhttp3/tls/internal/der/BitString;->b:I

    .line 14
    .line 15
    invoke-interface {p0, p1}, La/t99;->writeByte(I)La/t99;

    .line 16
    .line 17
    .line 18
    iget-object p1, p2, Lokhttp3/tls/internal/der/BitString;->a:La/qg9;

    .line 19
    .line 20
    invoke-interface {p0, p1}, La/t99;->N0(La/qg9;)La/t99;

    .line 21
    .line 22
    .line 23
    return-void
.end method
