.class public abstract La/g9x0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/okt0;

.field public static final b:La/y6x0;

.field public static final c:La/u6x0;

.field public static final d:La/j5x0;

.field public static final e:La/e5x0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    invoke-static {}, La/okt0;->l()La/fck0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, La/mdx0;->c:La/mdx0;

    .line 6
    .line 7
    sget-object v2, La/o8x0;->b:La/o8x0;

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, La/fck0;->A(Ljava/lang/Enum;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    sget-object v1, La/mdx0;->g:La/mdx0;

    .line 13
    .line 14
    sget-object v2, La/o8x0;->c:La/o8x0;

    .line 15
    .line 16
    invoke-virtual {v0, v1, v2}, La/fck0;->A(Ljava/lang/Enum;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sget-object v1, La/mdx0;->e:La/mdx0;

    .line 20
    .line 21
    sget-object v2, La/o8x0;->d:La/o8x0;

    .line 22
    .line 23
    invoke-virtual {v0, v1, v2}, La/fck0;->A(Ljava/lang/Enum;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    sget-object v1, La/mdx0;->d:La/mdx0;

    .line 27
    .line 28
    sget-object v2, La/o8x0;->e:La/o8x0;

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, La/fck0;->A(Ljava/lang/Enum;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    sget-object v1, La/mdx0;->f:La/mdx0;

    .line 34
    .line 35
    sget-object v2, La/o8x0;->f:La/o8x0;

    .line 36
    .line 37
    invoke-virtual {v0, v1, v2}, La/fck0;->A(Ljava/lang/Enum;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, La/fck0;->p()La/okt0;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    sput-object v0, La/g9x0;->a:La/okt0;

    .line 45
    .line 46
    new-instance v0, La/c8x0;

    .line 47
    .line 48
    const/4 v1, 0x2

    .line 49
    invoke-direct {v0, v1}, La/c8x0;-><init>(B)V

    .line 50
    .line 51
    .line 52
    new-instance v1, La/y6x0;

    .line 53
    .line 54
    const-class v2, La/p8x0;

    .line 55
    .line 56
    invoke-direct {v1, v2, v0}, La/y6x0;-><init>(Ljava/lang/Class;La/a7x0;)V

    .line 57
    .line 58
    .line 59
    sput-object v1, La/g9x0;->b:La/y6x0;

    .line 60
    .line 61
    new-instance v0, La/s6x0;

    .line 62
    .line 63
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 64
    .line 65
    .line 66
    new-instance v1, La/u6x0;

    .line 67
    .line 68
    const-string v2, "type.googleapis.com/google.crypto.tink.HmacKey"

    .line 69
    .line 70
    invoke-direct {v1, v2, v0}, La/u6x0;-><init>(Ljava/lang/String;La/w6x0;)V

    .line 71
    .line 72
    .line 73
    sput-object v1, La/g9x0;->c:La/u6x0;

    .line 74
    .line 75
    new-instance v0, La/k8x0;

    .line 76
    .line 77
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 78
    .line 79
    .line 80
    new-instance v1, La/j5x0;

    .line 81
    .line 82
    const-class v3, La/h8x0;

    .line 83
    .line 84
    invoke-direct {v1, v3, v0}, La/j5x0;-><init>(Ljava/lang/Class;La/g5x0;)V

    .line 85
    .line 86
    .line 87
    sput-object v1, La/g9x0;->d:La/j5x0;

    .line 88
    .line 89
    new-instance v0, La/d8x0;

    .line 90
    .line 91
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 92
    .line 93
    .line 94
    new-instance v1, La/e5x0;

    .line 95
    .line 96
    invoke-direct {v1, v2, v0}, La/e5x0;-><init>(Ljava/lang/String;La/d5x0;)V

    .line 97
    .line 98
    .line 99
    sput-object v1, La/g9x0;->e:La/e5x0;

    .line 100
    .line 101
    return-void
.end method

.method public static a(La/arw0;)La/lpw0;
    .locals 2

    .line 1
    sget-object v0, La/arw0;->k:La/arw0;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    sget-object p0, La/lpw0;->e:La/lpw0;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    sget-object v0, La/arw0;->h:La/arw0;

    .line 9
    .line 10
    if-ne p0, v0, :cond_1

    .line 11
    .line 12
    sget-object p0, La/lpw0;->c:La/lpw0;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    sget-object v0, La/arw0;->j:La/arw0;

    .line 16
    .line 17
    if-ne p0, v0, :cond_2

    .line 18
    .line 19
    sget-object p0, La/lpw0;->d:La/lpw0;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_2
    sget-object v0, La/arw0;->i:La/arw0;

    .line 23
    .line 24
    if-ne p0, v0, :cond_3

    .line 25
    .line 26
    sget-object p0, La/lpw0;->f:La/lpw0;

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
    const-string v1, "unknown variant: "

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

.method public static b(La/lpw0;)La/arw0;
    .locals 2

    .line 1
    sget-object v0, La/lpw0;->e:La/lpw0;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    sget-object p0, La/arw0;->k:La/arw0;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    sget-object v0, La/lpw0;->c:La/lpw0;

    .line 9
    .line 10
    if-ne p0, v0, :cond_1

    .line 11
    .line 12
    sget-object p0, La/arw0;->h:La/arw0;

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
    sget-object p0, La/arw0;->j:La/arw0;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_2
    sget-object v0, La/lpw0;->f:La/lpw0;

    .line 23
    .line 24
    if-ne p0, v0, :cond_3

    .line 25
    .line 26
    sget-object p0, La/arw0;->i:La/arw0;

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
    const-string v1, "unknown OutputPrefixType: "

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
