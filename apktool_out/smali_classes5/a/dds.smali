.class public final La/dds;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()La/hds;
    .locals 3

    .line 1
    new-instance v0, La/hds;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    sget-object v2, La/jz60;->a:La/jz60;

    .line 6
    .line 7
    invoke-direct {v0, v1, v1, v1, v2}, La/hds;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/lz60;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static b(Ljava/lang/String;La/wz60;)La/hds;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/lz60;->Companion:La/iz60;

    .line 5
    .line 6
    iget-object v1, p1, La/wz60;->g:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, La/iz60;->a(Ljava/lang/String;)La/lz60;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object p1, p1, La/wz60;->a:Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v1, "/GamesMedia/"

    .line 22
    .line 23
    const-string v2, "/app/"

    .line 24
    .line 25
    invoke-static {p0, v1, p1, v2}, La/ua80;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {v0}, La/lz60;->a()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string v1, ".webp"

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    new-instance v1, La/hds;

    .line 40
    .line 41
    const-string v2, "920x610"

    .line 42
    .line 43
    invoke-static {p0, v2, p1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    const-string v3, "538x538"

    .line 48
    .line 49
    invoke-static {p0, v3, p1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    const-string v4, "538x538-circle"

    .line 54
    .line 55
    invoke-static {p0, v4, p1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-direct {v1, v2, v3, p0, v0}, La/hds;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/lz60;)V

    .line 60
    .line 61
    .line 62
    return-object v1
.end method

.method public static c(Ljava/lang/String;La/i070;)La/hds;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/lz60;->Companion:La/iz60;

    .line 5
    .line 6
    iget-object v1, p1, La/i070;->d:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, La/iz60;->a(Ljava/lang/String;)La/lz60;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object p1, p1, La/i070;->f:Ljava/lang/Long;

    .line 16
    .line 17
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v1, "/GamesMedia/"

    .line 22
    .line 23
    const-string v2, "/app/"

    .line 24
    .line 25
    invoke-static {p0, v1, p1, v2}, La/ua80;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {v0}, La/lz60;->a()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string v1, ".webp"

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    new-instance v1, La/hds;

    .line 40
    .line 41
    const-string v2, "920x610"

    .line 42
    .line 43
    invoke-static {p0, v2, p1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    const-string v3, "538x538"

    .line 48
    .line 49
    invoke-static {p0, v3, p1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    const-string v4, "538x538-circle"

    .line 54
    .line 55
    invoke-static {p0, v4, p1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-direct {v1, v2, v3, p0, v0}, La/hds;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/lz60;)V

    .line 60
    .line 61
    .line 62
    return-object v1
.end method


# virtual methods
.method public final serializer()La/jiy;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La/jiy;"
        }
    .end annotation

    .line 1
    sget-object p0, La/cds;->a:La/cds;

    .line 2
    .line 3
    return-object p0
.end method
