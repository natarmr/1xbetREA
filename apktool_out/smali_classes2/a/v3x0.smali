.class public final La/v3x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/dnw0;


# static fields
.field public static final e:[B

.field public static final f:[B

.field public static final g:[B


# instance fields
.field public final a:Ljava/security/PrivateKey;

.field public final b:Ljava/lang/String;

.field public final c:I

.field public final d:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    sput-object v0, La/v3x0;->e:[B

    .line 5
    .line 6
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 7
    .line 8
    const-string v1, "Workload"

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sput-object v1, La/v3x0;->f:[B

    .line 15
    .line 16
    const-string v1, "ContextInfo"

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, La/v3x0;->g:[B

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(Ljava/security/PrivateKey;Ljava/lang/String;I[B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/v3x0;->a:Ljava/security/PrivateKey;

    .line 5
    .line 6
    iput-object p2, p0, La/v3x0;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput p3, p0, La/v3x0;->c:I

    .line 9
    .line 10
    iput-object p4, p0, La/v3x0;->d:[B

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b([B[B)[B
    .locals 4

    .line 1
    iget-object v0, p0, La/v3x0;->d:[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    iget v2, p0, La/v3x0;->c:I

    .line 5
    .line 6
    add-int/2addr v1, v2

    .line 7
    array-length v2, p1

    .line 8
    const/4 v3, 0x0

    .line 9
    if-lt v2, v1, :cond_1

    .line 10
    .line 11
    invoke-static {v0, p1}, La/x7x0;->b([B[B)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    array-length v0, v0

    .line 18
    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    array-length v2, p1

    .line 23
    invoke-static {p1, v1, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object v1, p0, La/v3x0;->b:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v1}, Landroid/crypto/hpke/Hpke;->getInstance(Ljava/lang/String;)Landroid/crypto/hpke/Hpke;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    new-instance v2, Landroid/crypto/hpke/Message;

    .line 34
    .line 35
    invoke-direct {v2, v0, p1}, Landroid/crypto/hpke/Message;-><init>([B[B)V

    .line 36
    .line 37
    .line 38
    sget-object p1, La/v3x0;->e:[B

    .line 39
    .line 40
    iget-object p0, p0, La/v3x0;->a:Ljava/security/PrivateKey;

    .line 41
    .line 42
    invoke-virtual {v1, p0, p2, v2, p1}, Landroid/crypto/hpke/Hpke;->open(Ljava/security/PrivateKey;[BLandroid/crypto/hpke/Message;[B)[B

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :cond_0
    const-string p0, "Invalid ciphertext (output prefix mismatch)"

    .line 48
    .line 49
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v3

    .line 53
    :cond_1
    const-string p0, "Ciphertext is too short"

    .line 54
    .line 55
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v3
.end method
