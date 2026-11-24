.class public abstract La/ruw0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/y6x0;

.field public static final b:La/u6x0;

.field public static final c:La/j5x0;

.field public static final d:La/e5x0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/vow0;

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/vow0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/y6x0;

    .line 9
    .line 10
    const-class v2, La/brw0;

    .line 11
    .line 12
    invoke-direct {v1, v2, v0}, La/y6x0;-><init>(Ljava/lang/Class;La/a7x0;)V

    .line 13
    .line 14
    .line 15
    sput-object v1, La/ruw0;->a:La/y6x0;

    .line 16
    .line 17
    new-instance v0, La/cpw0;

    .line 18
    .line 19
    const/16 v1, 0x12

    .line 20
    .line 21
    invoke-direct {v0, v1}, La/cpw0;-><init>(B)V

    .line 22
    .line 23
    .line 24
    new-instance v1, La/u6x0;

    .line 25
    .line 26
    const-string v2, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    .line 27
    .line 28
    invoke-direct {v1, v2, v0}, La/u6x0;-><init>(Ljava/lang/String;La/w6x0;)V

    .line 29
    .line 30
    .line 31
    sput-object v1, La/ruw0;->b:La/u6x0;

    .line 32
    .line 33
    new-instance v0, La/zow0;

    .line 34
    .line 35
    const/16 v1, 0x12

    .line 36
    .line 37
    invoke-direct {v0, v1}, La/zow0;-><init>(B)V

    .line 38
    .line 39
    .line 40
    new-instance v1, La/j5x0;

    .line 41
    .line 42
    const-class v3, La/uqw0;

    .line 43
    .line 44
    invoke-direct {v1, v3, v0}, La/j5x0;-><init>(Ljava/lang/Class;La/g5x0;)V

    .line 45
    .line 46
    .line 47
    sput-object v1, La/ruw0;->c:La/j5x0;

    .line 48
    .line 49
    new-instance v0, La/epw0;

    .line 50
    .line 51
    const/16 v1, 0x12

    .line 52
    .line 53
    invoke-direct {v0, v1}, La/epw0;-><init>(B)V

    .line 54
    .line 55
    .line 56
    new-instance v1, La/e5x0;

    .line 57
    .line 58
    invoke-direct {v1, v2, v0}, La/e5x0;-><init>(Ljava/lang/String;La/d5x0;)V

    .line 59
    .line 60
    .line 61
    sput-object v1, La/ruw0;->d:La/e5x0;

    .line 62
    .line 63
    return-void
.end method

.method public static a(La/mdx0;)La/fhn;
    .locals 2

    .line 1
    sget-object v0, La/yuw0;->a:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_4

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq v0, v1, :cond_3

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    if-eq v0, v1, :cond_2

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    if-eq v0, v1, :cond_1

    .line 20
    .line 21
    const/4 v1, 0x5

    .line 22
    if-ne v0, v1, :cond_0

    .line 23
    .line 24
    sget-object p0, La/fhn;->i:La/fhn;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 28
    .line 29
    invoke-virtual {p0}, La/mdx0;->zza()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    const-string v1, "Unable to parse HashType: "

    .line 34
    .line 35
    invoke-static {p0, v1}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v0

    .line 43
    :cond_1
    sget-object p0, La/fhn;->h:La/fhn;

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_2
    sget-object p0, La/fhn;->g:La/fhn;

    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_3
    sget-object p0, La/fhn;->f:La/fhn;

    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_4
    sget-object p0, La/fhn;->e:La/fhn;

    .line 53
    .line 54
    return-object p0
.end method

.method public static b(La/arw0;)La/lpw0;
    .locals 2

    .line 1
    sget-object v0, La/arw0;->c:La/arw0;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p0, La/lpw0;->c:La/lpw0;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object v0, La/arw0;->d:La/arw0;

    .line 13
    .line 14
    if-eq p0, v0, :cond_2

    .line 15
    .line 16
    sget-object v0, La/arw0;->e:La/arw0;

    .line 17
    .line 18
    if-ne p0, v0, :cond_1

    .line 19
    .line 20
    sget-object p0, La/lpw0;->e:La/lpw0;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 24
    .line 25
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-string v1, "Unable to serialize variant: "

    .line 30
    .line 31
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v0

    .line 39
    :cond_2
    sget-object p0, La/lpw0;->f:La/lpw0;

    .line 40
    .line 41
    return-object p0
.end method

.method public static c(La/lpw0;)La/arw0;
    .locals 2

    .line 1
    sget-object v0, La/arw0;->d:La/arw0;

    .line 2
    .line 3
    sget-object v1, La/lpw0;->c:La/lpw0;

    .line 4
    .line 5
    if-ne p0, v1, :cond_0

    .line 6
    .line 7
    sget-object p0, La/arw0;->c:La/arw0;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    sget-object v1, La/lpw0;->f:La/lpw0;

    .line 11
    .line 12
    if-ne p0, v1, :cond_1

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_1
    sget-object v1, La/lpw0;->d:La/lpw0;

    .line 16
    .line 17
    if-ne p0, v1, :cond_2

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_2
    sget-object v0, La/lpw0;->e:La/lpw0;

    .line 21
    .line 22
    if-ne p0, v0, :cond_3

    .line 23
    .line 24
    sget-object p0, La/arw0;->e:La/arw0;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_3
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 28
    .line 29
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const-string v1, "Unable to parse OutputPrefixType: "

    .line 34
    .line 35
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v0
.end method

.method public static d(La/brw0;)La/wdx0;
    .locals 3

    .line 1
    invoke-static {}, La/wdx0;->x()La/udx0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, La/brw0;->d:I

    .line 6
    .line 7
    invoke-virtual {v0}, La/hkw0;->d()V

    .line 8
    .line 9
    .line 10
    iget-object v2, v0, La/hkw0;->b:La/jkw0;

    .line 11
    .line 12
    check-cast v2, La/wdx0;

    .line 13
    .line 14
    invoke-static {v2, v1}, La/wdx0;->u(La/wdx0;I)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, La/brw0;->f:La/fhn;

    .line 18
    .line 19
    sget-object v1, La/fhn;->e:La/fhn;

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    sget-object p0, La/mdx0;->c:La/mdx0;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    sget-object v1, La/fhn;->f:La/fhn;

    .line 31
    .line 32
    if-eq p0, v1, :cond_4

    .line 33
    .line 34
    sget-object v1, La/fhn;->g:La/fhn;

    .line 35
    .line 36
    if-eq p0, v1, :cond_3

    .line 37
    .line 38
    sget-object v1, La/fhn;->h:La/fhn;

    .line 39
    .line 40
    if-eq p0, v1, :cond_2

    .line 41
    .line 42
    sget-object v1, La/fhn;->i:La/fhn;

    .line 43
    .line 44
    if-ne p0, v1, :cond_1

    .line 45
    .line 46
    sget-object p0, La/mdx0;->f:La/mdx0;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 50
    .line 51
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    const-string v1, "Unable to serialize HashType "

    .line 56
    .line 57
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v0

    .line 65
    :cond_2
    sget-object p0, La/mdx0;->d:La/mdx0;

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    sget-object p0, La/mdx0;->e:La/mdx0;

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_4
    sget-object p0, La/mdx0;->g:La/mdx0;

    .line 72
    .line 73
    :goto_0
    invoke-virtual {v0}, La/hkw0;->d()V

    .line 74
    .line 75
    .line 76
    iget-object v1, v0, La/hkw0;->b:La/jkw0;

    .line 77
    .line 78
    check-cast v1, La/wdx0;

    .line 79
    .line 80
    invoke-static {v1, p0}, La/wdx0;->v(La/wdx0;La/mdx0;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, La/hkw0;->c()La/jkw0;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    check-cast p0, La/wdx0;

    .line 88
    .line 89
    return-object p0
.end method
