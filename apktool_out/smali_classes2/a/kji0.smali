.class public final La/kji0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/mhi0;


# instance fields
.field public final a:La/vji0;


# direct methods
.method public constructor <init>(La/vji0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/kji0;->a:La/vji0;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final G()Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, La/gji0;

    .line 2
    .line 3
    iget-object p0, p0, La/kji0;->a:La/vji0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p0, v1}, La/vji0;->a(La/pji0;)La/pji0;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-direct {v0, p0, v1, v1}, La/gji0;-><init>(La/pji0;La/pgq0;Ljava/util/Map;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final b0(Ljava/lang/Object;La/k7t0;)Lkotlin/Unit;
    .locals 1

    .line 1
    check-cast p1, La/gji0;

    .line 2
    .line 3
    sget-object p0, La/vby;->d:La/uby;

    .line 4
    .line 5
    sget-object v0, La/gji0;->Companion:La/fji0;

    .line 6
    .line 7
    invoke-virtual {v0}, La/fji0;->serializer()La/jiy;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, La/jiy;

    .line 12
    .line 13
    invoke-virtual {p0, v0, p1}, La/vby;->d(La/jiy;Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object p1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object p1, p2, La/k7t0;->a:Ljava/io/FileOutputStream;

    .line 27
    .line 28
    invoke-virtual {p1, p0}, Ljava/io/FileOutputStream;->write([B)V

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0
.end method

.method public final f0(Ljava/io/FileInputStream;)Ljava/lang/Object;
    .locals 1

    .line 1
    :try_start_0
    sget-object p0, La/vby;->d:La/uby;

    .line 2
    .line 3
    invoke-static {p1}, La/wha0;->S(Ljava/io/InputStream;)[B

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Lkotlin/text/c;->m([B)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget-object v0, La/gji0;->Companion:La/fji0;

    .line 15
    .line 16
    invoke-virtual {v0}, La/fji0;->serializer()La/jiy;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, La/jiy;

    .line 21
    .line 22
    invoke-virtual {p0, v0, p1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, La/gji0;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    return-object p0

    .line 29
    :catch_0
    move-exception p0

    .line 30
    new-instance p1, La/soe;

    .line 31
    .line 32
    const-string v0, "Cannot parse session data"

    .line 33
    .line 34
    invoke-direct {p1, v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    throw p1
.end method
