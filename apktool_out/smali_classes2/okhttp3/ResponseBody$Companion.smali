.class public final Lokhttp3/ResponseBody$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/ResponseBody;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lokhttp3/ResponseBody$Companion;",
        "",
        "Lokhttp3/ResponseBody;",
        "EMPTY",
        "Lokhttp3/ResponseBody;",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static a(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/ResponseBody$Companion$asResponseBody$1;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lokhttp3/internal/Internal;->a(Lokhttp3/MediaType;)Lkotlin/Pair;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object v0, p1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/nio/charset/Charset;

    .line 11
    .line 12
    iget-object p1, p1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, Lokhttp3/MediaType;

    .line 15
    .line 16
    new-instance v1, La/f99;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    if-ltz v2, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-gt v2, v4, :cond_1

    .line 39
    .line 40
    sget-object v4, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 41
    .line 42
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_0

    .line 47
    .line 48
    invoke-virtual {v1, v3, v2, p0}, La/f99;->b0(IILjava/lang/String;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {p0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    array-length v0, p0

    .line 64
    invoke-virtual {v1, p0, v0}, La/f99;->U([BI)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    const-string v0, "endIndex > string.length: "

    .line 69
    .line 70
    const-string v3, " > "

    .line 71
    .line 72
    invoke-static {v2, v0, v3}, La/b1j;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    invoke-static {p0, v0}, La/jf4;->h(ILjava/lang/StringBuilder;)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    const-string p0, "endIndex < beginIndex: "

    .line 85
    .line 86
    const-string v0, " < "

    .line 87
    .line 88
    invoke-static {v2, p0, v3, v0}, La/f140;->j(ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-static {p0}, La/c99;->s(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :goto_0
    iget-wide v2, v1, La/f99;->b:J

    .line 96
    .line 97
    new-instance p0, Lokhttp3/ResponseBody$Companion$asResponseBody$1;

    .line 98
    .line 99
    invoke-direct {p0, p1, v2, v3, v1}, Lokhttp3/ResponseBody$Companion$asResponseBody$1;-><init>(Lokhttp3/MediaType;JLa/u99;)V

    .line 100
    .line 101
    .line 102
    return-object p0
.end method
