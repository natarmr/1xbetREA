.class public final La/acw0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xow0;


# static fields
.field public static final e:[B


# instance fields
.field public final a:La/r9x0;

.field public final b:I

.field public final c:[B

.field public final d:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    aput-byte v1, v0, v1

    .line 6
    .line 7
    sput-object v0, La/acw0;->e:[B

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(La/h8x0;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/lvb0;

    .line 5
    .line 6
    iget-object v1, p1, La/h8x0;->a:La/p8x0;

    .line 7
    .line 8
    iget-object v2, v1, La/p8x0;->d:La/o8x0;

    .line 9
    .line 10
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const-string v3, "HMAC"

    .line 15
    .line 16
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    new-instance v4, Ljavax/crypto/spec/SecretKeySpec;

    .line 21
    .line 22
    iget-object v5, p1, La/h8x0;->b:La/rkt0;

    .line 23
    .line 24
    iget-object v5, v5, La/rkt0;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v5, La/icw0;

    .line 27
    .line 28
    invoke-virtual {v5}, La/icw0;->b()[B

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-direct {v4, v5, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    invoke-direct {v0, v2, v4, v3}, La/lvb0;-><init>(Ljava/lang/String;Ljavax/crypto/spec/SecretKeySpec;B)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, La/acw0;->a:La/r9x0;

    .line 40
    .line 41
    iget v0, v1, La/p8x0;->b:I

    .line 42
    .line 43
    iput v0, p0, La/acw0;->b:I

    .line 44
    .line 45
    iget-object p1, p1, La/h8x0;->c:La/icw0;

    .line 46
    .line 47
    invoke-virtual {p1}, La/icw0;->b()[B

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, La/acw0;->c:[B

    .line 52
    .line 53
    iget-object p1, v1, La/p8x0;->c:La/arw0;

    .line 54
    .line 55
    sget-object v0, La/arw0;->j:La/arw0;

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_0

    .line 62
    .line 63
    sget-object p1, La/acw0;->e:[B

    .line 64
    .line 65
    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iput-object p1, p0, La/acw0;->d:[B

    .line 70
    .line 71
    return-void

    .line 72
    :cond_0
    const/4 p1, 0x0

    .line 73
    new-array p1, p1, [B

    .line 74
    .line 75
    iput-object p1, p0, La/acw0;->d:[B

    .line 76
    .line 77
    return-void
.end method

.method public constructor <init>(La/lvb0;I)V
    .locals 2

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    iput-object p1, p0, La/acw0;->a:La/r9x0;

    .line 96
    iput p2, p0, La/acw0;->b:I

    const/4 v0, 0x0

    .line 97
    new-array v1, v0, [B

    iput-object v1, p0, La/acw0;->c:[B

    .line 98
    new-array v1, v0, [B

    iput-object v1, p0, La/acw0;->d:[B

    const/16 p0, 0xa

    if-lt p2, p0, :cond_0

    .line 99
    new-array p0, v0, [B

    invoke-virtual {p1, p0, p2}, La/lvb0;->e([BI)[B

    return-void

    .line 100
    :cond_0
    new-instance p0, Ljava/security/InvalidAlgorithmParameterException;

    const-string p1, "tag size too small, need at least 10 bytes"

    invoke-direct {p0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public constructor <init>(La/v7x0;)V
    .locals 3

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    iget-object v0, p1, La/v7x0;->a:La/g8x0;

    .line 80
    iget v1, v0, La/g8x0;->a:I

    .line 81
    invoke-static {v1}, La/o9x0;->b(I)La/o9x0;

    move-result-object v1

    .line 82
    iget-object v2, p1, La/v7x0;->b:La/rkt0;

    .line 83
    invoke-static {v1, v2}, La/q9x0;->u(La/o9x0;La/rkt0;)La/q9x0;

    move-result-object v1

    .line 84
    invoke-static {v1}, La/idm0;->A(La/q9x0;)La/r9x0;

    move-result-object v1

    .line 85
    iput-object v1, p0, La/acw0;->a:La/r9x0;

    .line 86
    iget v1, v0, La/g8x0;->b:I

    .line 87
    iput v1, p0, La/acw0;->b:I

    .line 88
    iget-object p1, p1, La/v7x0;->c:La/icw0;

    .line 89
    invoke-virtual {p1}, La/icw0;->b()[B

    move-result-object p1

    iput-object p1, p0, La/acw0;->c:[B

    .line 90
    iget-object p1, v0, La/g8x0;->c:La/hbb;

    .line 91
    sget-object v0, La/hbb;->r:La/hbb;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 92
    sget-object p1, La/acw0;->e:[B

    const/4 v0, 0x1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, La/acw0;->d:[B

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 93
    new-array p1, p1, [B

    iput-object p1, p0, La/acw0;->d:[B

    return-void
.end method


# virtual methods
.method public final a([B)[B
    .locals 4

    .line 1
    iget-object v0, p0, La/acw0;->d:[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    iget v2, p0, La/acw0;->b:I

    .line 5
    .line 6
    iget-object v3, p0, La/acw0;->a:La/r9x0;

    .line 7
    .line 8
    iget-object p0, p0, La/acw0;->c:[B

    .line 9
    .line 10
    if-lez v1, :cond_0

    .line 11
    .line 12
    filled-new-array {p1, v0}, [[B

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p1}, La/egm0;->B([[B)[B

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-interface {v3, p1, v2}, La/r9x0;->e([BI)[B

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    filled-new-array {p0, p1}, [[B

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, La/egm0;->B([[B)[B

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_0
    invoke-interface {v3, p1, v2}, La/r9x0;->e([BI)[B

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    filled-new-array {p0, p1}, [[B

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {p0}, La/egm0;->B([[B)[B

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method
