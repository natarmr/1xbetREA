.class public abstract La/fww0;
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
    new-instance v0, La/zow0;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/zow0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/y6x0;

    .line 9
    .line 10
    const-class v2, La/srw0;

    .line 11
    .line 12
    invoke-direct {v1, v2, v0}, La/y6x0;-><init>(Ljava/lang/Class;La/a7x0;)V

    .line 13
    .line 14
    .line 15
    sput-object v1, La/fww0;->a:La/y6x0;

    .line 16
    .line 17
    new-instance v0, La/qow0;

    .line 18
    .line 19
    const/16 v1, 0x15

    .line 20
    .line 21
    invoke-direct {v0, v1}, La/qow0;-><init>(B)V

    .line 22
    .line 23
    .line 24
    new-instance v1, La/u6x0;

    .line 25
    .line 26
    const-string v2, "type.googleapis.com/google.crypto.tink.AesGcmSivKey"

    .line 27
    .line 28
    invoke-direct {v1, v2, v0}, La/u6x0;-><init>(Ljava/lang/String;La/w6x0;)V

    .line 29
    .line 30
    .line 31
    sput-object v1, La/fww0;->b:La/u6x0;

    .line 32
    .line 33
    new-instance v0, La/epw0;

    .line 34
    .line 35
    const/16 v1, 0x14

    .line 36
    .line 37
    invoke-direct {v0, v1}, La/epw0;-><init>(B)V

    .line 38
    .line 39
    .line 40
    new-instance v1, La/j5x0;

    .line 41
    .line 42
    const-class v3, La/nrw0;

    .line 43
    .line 44
    invoke-direct {v1, v3, v0}, La/j5x0;-><init>(Ljava/lang/Class;La/g5x0;)V

    .line 45
    .line 46
    .line 47
    sput-object v1, La/fww0;->c:La/j5x0;

    .line 48
    .line 49
    new-instance v0, La/tow0;

    .line 50
    .line 51
    const/16 v1, 0x15

    .line 52
    .line 53
    invoke-direct {v0, v1}, La/tow0;-><init>(B)V

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
    sput-object v1, La/fww0;->d:La/e5x0;

    .line 62
    .line 63
    return-void
.end method

.method public static a(La/lpw0;)La/m60;
    .locals 2

    .line 1
    sget-object v0, La/m60;->i:La/m60;

    .line 2
    .line 3
    sget-object v1, La/lpw0;->c:La/lpw0;

    .line 4
    .line 5
    if-ne p0, v1, :cond_0

    .line 6
    .line 7
    sget-object p0, La/m60;->h:La/m60;

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
    sget-object p0, La/m60;->j:La/m60;

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

.method public static b(La/m60;)La/lpw0;
    .locals 2

    .line 1
    sget-object v0, La/m60;->h:La/m60;

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
    sget-object v0, La/m60;->i:La/m60;

    .line 13
    .line 14
    if-eq p0, v0, :cond_2

    .line 15
    .line 16
    sget-object v0, La/m60;->j:La/m60;

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
