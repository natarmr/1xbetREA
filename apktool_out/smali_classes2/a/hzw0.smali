.class public abstract La/hzw0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/y6x0;

.field public static final b:La/u6x0;

.field public static final c:La/j5x0;

.field public static final d:La/e5x0;

.field public static final e:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/vow0;

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/vow0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v2, La/y6x0;

    .line 9
    .line 10
    const-class v3, La/zyw0;

    .line 11
    .line 12
    invoke-direct {v2, v3, v0}, La/y6x0;-><init>(Ljava/lang/Class;La/a7x0;)V

    .line 13
    .line 14
    .line 15
    sput-object v2, La/hzw0;->a:La/y6x0;

    .line 16
    .line 17
    new-instance v0, La/qow0;

    .line 18
    .line 19
    invoke-direct {v0, v1}, La/qow0;-><init>(B)V

    .line 20
    .line 21
    .line 22
    new-instance v2, La/u6x0;

    .line 23
    .line 24
    const-string v3, "type.googleapis.com/google.crypto.tink.AesSivKey"

    .line 25
    .line 26
    invoke-direct {v2, v3, v0}, La/u6x0;-><init>(Ljava/lang/String;La/w6x0;)V

    .line 27
    .line 28
    .line 29
    sput-object v2, La/hzw0;->b:La/u6x0;

    .line 30
    .line 31
    new-instance v0, La/cpw0;

    .line 32
    .line 33
    invoke-direct {v0, v1}, La/cpw0;-><init>(B)V

    .line 34
    .line 35
    .line 36
    new-instance v2, La/j5x0;

    .line 37
    .line 38
    const-class v4, La/uyw0;

    .line 39
    .line 40
    invoke-direct {v2, v4, v0}, La/j5x0;-><init>(Ljava/lang/Class;La/g5x0;)V

    .line 41
    .line 42
    .line 43
    sput-object v2, La/hzw0;->c:La/j5x0;

    .line 44
    .line 45
    new-instance v0, La/zow0;

    .line 46
    .line 47
    invoke-direct {v0, v1}, La/zow0;-><init>(B)V

    .line 48
    .line 49
    .line 50
    new-instance v1, La/e5x0;

    .line 51
    .line 52
    invoke-direct {v1, v3, v0}, La/e5x0;-><init>(Ljava/lang/String;La/d5x0;)V

    .line 53
    .line 54
    .line 55
    sput-object v1, La/hzw0;->d:La/e5x0;

    .line 56
    .line 57
    new-instance v0, Ljava/util/HashMap;

    .line 58
    .line 59
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 60
    .line 61
    .line 62
    sget-object v1, La/drq;->j:La/drq;

    .line 63
    .line 64
    sget-object v2, La/lpw0;->e:La/lpw0;

    .line 65
    .line 66
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    sget-object v1, La/drq;->h:La/drq;

    .line 70
    .line 71
    sget-object v2, La/lpw0;->c:La/lpw0;

    .line 72
    .line 73
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    sget-object v1, La/drq;->i:La/drq;

    .line 77
    .line 78
    sget-object v2, La/lpw0;->f:La/lpw0;

    .line 79
    .line 80
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sput-object v0, La/hzw0;->e:Ljava/util/Map;

    .line 88
    .line 89
    return-void
.end method

.method public static a(La/lpw0;)La/drq;
    .locals 2

    .line 1
    sget-object v0, La/drq;->i:La/drq;

    .line 2
    .line 3
    sget-object v1, La/lpw0;->e:La/lpw0;

    .line 4
    .line 5
    if-ne p0, v1, :cond_0

    .line 6
    .line 7
    sget-object p0, La/drq;->j:La/drq;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    sget-object v1, La/lpw0;->c:La/lpw0;

    .line 11
    .line 12
    if-ne p0, v1, :cond_1

    .line 13
    .line 14
    sget-object p0, La/drq;->h:La/drq;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_1
    sget-object v1, La/lpw0;->f:La/lpw0;

    .line 18
    .line 19
    if-ne p0, v1, :cond_2

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_2
    sget-object v1, La/lpw0;->d:La/lpw0;

    .line 23
    .line 24
    if-ne p0, v1, :cond_3

    .line 25
    .line 26
    return-object v0

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
