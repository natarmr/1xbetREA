.class public final La/xhx0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ymw0;


# static fields
.field public static final d:[B

.field public static final e:[B

.field public static final f:La/y50;


# instance fields
.field public final a:La/r9x0;

.field public final b:[B

.field public final c:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    sput-object v1, La/xhx0;->d:[B

    .line 6
    .line 7
    new-array v0, v0, [B

    .line 8
    .line 9
    fill-array-data v0, :array_0

    .line 10
    .line 11
    .line 12
    sput-object v0, La/xhx0;->e:[B

    .line 13
    .line 14
    new-instance v0, La/y50;

    .line 15
    .line 16
    const/16 v1, 0x1b

    .line 17
    .line 18
    invoke-direct {v0, v1}, La/y50;-><init>(B)V

    .line 19
    .line 20
    .line 21
    sput-object v0, La/xhx0;->f:La/y50;

    .line 22
    .line 23
    return-void

    .line 24
    nop

    .line 25
    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x1t
    .end array-data
.end method

.method public constructor <init>([BLa/icw0;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-static {v0}, La/esw0;->d(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    array-length v0, p1

    .line 12
    const/16 v1, 0x20

    .line 13
    .line 14
    if-eq v0, v1, :cond_1

    .line 15
    .line 16
    array-length v0, p1

    .line 17
    const/16 v1, 0x40

    .line 18
    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance p0, Ljava/security/InvalidKeyException;

    .line 23
    .line 24
    array-length p1, p1

    .line 25
    const-string p2, "invalid key size: "

    .line 26
    .line 27
    const-string v0, " bytes; key must have 32 or 64 bytes"

    .line 28
    .line 29
    invoke-static {p1, p2, v0}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-direct {p0, p1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p0

    .line 37
    :cond_1
    :goto_0
    array-length v0, p1

    .line 38
    div-int/lit8 v0, v0, 0x2

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-static {p1, v1, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    array-length v1, p1

    .line 46
    div-int/lit8 v1, v1, 0x2

    .line 47
    .line 48
    array-length v2, p1

    .line 49
    invoke-static {p1, v1, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iput-object p1, p0, La/xhx0;->b:[B

    .line 54
    .line 55
    array-length p1, v0

    .line 56
    invoke-static {p1}, La/o9x0;->b(I)La/o9x0;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    new-instance v1, La/rkt0;

    .line 61
    .line 62
    invoke-static {v0}, La/icw0;->a([B)La/icw0;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const/16 v2, 0xb

    .line 67
    .line 68
    invoke-direct {v1, v0, v2}, La/rkt0;-><init>(Ljava/lang/Object;B)V

    .line 69
    .line 70
    .line 71
    invoke-static {p1, v1}, La/q9x0;->u(La/o9x0;La/rkt0;)La/q9x0;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-static {p1}, La/idm0;->A(La/q9x0;)La/r9x0;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iput-object p1, p0, La/xhx0;->a:La/r9x0;

    .line 80
    .line 81
    invoke-virtual {p2}, La/icw0;->b()[B

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iput-object p1, p0, La/xhx0;->c:[B

    .line 86
    .line 87
    return-void

    .line 88
    :cond_2
    const-string p0, "Can not use AES-SIV in FIPS-mode."

    .line 89
    .line 90
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const/4 p0, 0x0

    .line 94
    throw p0
.end method
