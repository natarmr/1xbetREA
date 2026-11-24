.class public abstract La/c9x0;
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
    new-instance v0, La/c8x0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, La/c8x0;-><init>(B)V

    .line 5
    .line 6
    .line 7
    new-instance v1, La/y6x0;

    .line 8
    .line 9
    const-class v2, La/g8x0;

    .line 10
    .line 11
    invoke-direct {v1, v2, v0}, La/y6x0;-><init>(Ljava/lang/Class;La/a7x0;)V

    .line 12
    .line 13
    .line 14
    sput-object v1, La/c9x0;->a:La/y6x0;

    .line 15
    .line 16
    new-instance v0, La/k8x0;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v1, La/u6x0;

    .line 22
    .line 23
    const-string v2, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    .line 24
    .line 25
    invoke-direct {v1, v2, v0}, La/u6x0;-><init>(Ljava/lang/String;La/w6x0;)V

    .line 26
    .line 27
    .line 28
    sput-object v1, La/c9x0;->b:La/u6x0;

    .line 29
    .line 30
    new-instance v0, La/d8x0;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    new-instance v1, La/j5x0;

    .line 36
    .line 37
    const-class v3, La/v7x0;

    .line 38
    .line 39
    invoke-direct {v1, v3, v0}, La/j5x0;-><init>(Ljava/lang/Class;La/g5x0;)V

    .line 40
    .line 41
    .line 42
    sput-object v1, La/c9x0;->c:La/j5x0;

    .line 43
    .line 44
    new-instance v0, La/m8x0;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    new-instance v1, La/e5x0;

    .line 50
    .line 51
    invoke-direct {v1, v2, v0}, La/e5x0;-><init>(Ljava/lang/String;La/d5x0;)V

    .line 52
    .line 53
    .line 54
    sput-object v1, La/c9x0;->d:La/e5x0;

    .line 55
    .line 56
    return-void
.end method

.method public static a(La/lpw0;)La/hbb;
    .locals 2

    .line 1
    sget-object v0, La/lpw0;->c:La/lpw0;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    sget-object p0, La/hbb;->p:La/hbb;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    sget-object v0, La/lpw0;->f:La/lpw0;

    .line 9
    .line 10
    if-ne p0, v0, :cond_1

    .line 11
    .line 12
    sget-object p0, La/hbb;->q:La/hbb;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    sget-object v0, La/lpw0;->d:La/lpw0;

    .line 16
    .line 17
    if-ne p0, v0, :cond_2

    .line 18
    .line 19
    sget-object p0, La/hbb;->r:La/hbb;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_2
    sget-object v0, La/lpw0;->e:La/lpw0;

    .line 23
    .line 24
    if-ne p0, v0, :cond_3

    .line 25
    .line 26
    sget-object p0, La/hbb;->s:La/hbb;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_3
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 30
    .line 31
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const-string v1, "Unable to parse OutputPrefixType: "

    .line 36
    .line 37
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v0
.end method

.method public static b(La/hbb;)La/lpw0;
    .locals 2

    .line 1
    sget-object v0, La/hbb;->p:La/hbb;

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
    sget-object v0, La/hbb;->q:La/hbb;

    .line 13
    .line 14
    if-eq p0, v0, :cond_3

    .line 15
    .line 16
    sget-object v0, La/hbb;->s:La/hbb;

    .line 17
    .line 18
    if-eq p0, v0, :cond_2

    .line 19
    .line 20
    sget-object v0, La/hbb;->r:La/hbb;

    .line 21
    .line 22
    if-ne p0, v0, :cond_1

    .line 23
    .line 24
    sget-object p0, La/lpw0;->d:La/lpw0;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 28
    .line 29
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const-string v1, "Unable to serialize variant: "

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

    .line 43
    :cond_2
    sget-object p0, La/lpw0;->e:La/lpw0;

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_3
    sget-object p0, La/lpw0;->f:La/lpw0;

    .line 47
    .line 48
    return-object p0
.end method
